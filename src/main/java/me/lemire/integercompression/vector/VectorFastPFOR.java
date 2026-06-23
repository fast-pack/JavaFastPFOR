/**
 * This code is released under the
 * Apache License Version 2.0 http://www.apache.org/licenses/.
 *
 * (c) Daniel Lemire, http://lemire.me/en/
 * (c) Intel Corp. (for Vector implementation)
 */
package me.lemire.integercompression.vector;

import java.nio.ByteBuffer;
import java.util.Arrays;
import me.lemire.integercompression.IntegerCODEC;
import me.lemire.integercompression.SkippableIntegerCODEC;
import me.lemire.integercompression.IntWrapper;
import me.lemire.integercompression.vector.VectorBitPackerKernels.LaneWidth;

/**
 * This is a patching scheme designed for speed.
 *  It encodes integers in blocks of integers within pages of
 *  up to 65536 integers. Note that it is important, to get good
 *  compression and good performance, to use sizeable arrays (greater than 1024
 * integers). For arrays containing a number of integers that is not divisible
 * by BLOCK_SIZE, you should use it in conjunction with another CODEC:
 *
 *  IntegerCODEC ic = new Composition(new VectorFastPFOR(), new VariableByte()).
 * <p>
 * For details, please see:
 * </p><p>
 * Daniel Lemire and Leonid Boytsov, Decoding billions of integers per second
 * through vectorization Software: Practice &amp; Experience
 * <a
 * href="http://onlinelibrary.wiley.com/doi/10.1002/spe.2203/abstract">http://onlinelibrary.wiley.com/doi/10.1002/spe.2203/abstract</a>
 * <a href="http://arxiv.org/abs/1209.2137">http://arxiv.org/abs/1209.2137</a>
 * </p>
 * <p>For sufficiently compressible and long arrays, it is faster and better
 * than other PFOR schemes.</p>
 *
 * Note that this does not use differential coding: if you are working on sorted
 * lists, you should first compute deltas, @see
 * me.lemire.integercompression.differential.Delta#delta.
 *
 * For multi-threaded applications, each thread should use its own FastPFOR
 * object.
 *
 * Blocks are packed in a vectorized layout that differs by hardware vector
 * lane width, so each stream is tagged with the width it was packed for and is
 * decoded by the matching kernel. Decoding requires a machine whose preferred
 * vector width is at least the stream's; a narrower machine fails fast rather
 * than emulating. The default constructor packs at this machine's preferred
 * width; the {@code (int, LaneWidth)} constructor pins a width so a
 * heterogeneous cluster can decode on its narrowest node.
 *
 * @author Daniel Lemire
 */
public class VectorFastPFOR implements IntegerCODEC, SkippableIntegerCODEC {
  private final static int OVERHEAD_OF_EACH_EXCEPT = 8;
  private static final int OVERHEAD_OF_EACH_PAGE_IN_INTS = 36;
  private static final int OVERHEAD_OF_EACH_BLOCK_IN_INTS = 1;
  public final static int DEFAULT_PAGE_SIZE = 64 << 10;

  public final static int BLOCK_SIZE = 256;
  private final static int INTS_PER_BLOCK = BLOCK_SIZE >>> 5;

  // The page header word holds the metadata offset in its low 30 bits and the
  // packing lane-width tag in its top 2 bits.
  private final static int WIDTH_SHIFT = 30;
  private final static int WHEREMETA_MASK = (1 << WIDTH_SHIFT) - 1;

  private final int pageSize;
  private final LaneWidth encodeWidth;
  private final VectorBitPackerKernels encoder;
  private final int[][] dataTobePacked = new int[33][];
  private int[] exceptData = null;

  // Working area for compress and uncompress.
  private final int[] dataPointers = new int[33];
  private final int[] freqs = new int[33];
  private final byte[] bem;
  /**
   * Construct the FastPFOR CODEC.
   *
   * @param pagesize
   *                the desired page size (recommended value is
   * FastPFOR.DEFAULT_PAGE_SIZE)
   * @param encodeWidth
   *                the vector lane width to pack with. Use
   * {@link LaneWidth#PREFERRED} for this machine's fastest layout, or pin a
   * cluster to its narrowest node's width so every node can decode the stream.
   */
  public VectorFastPFOR(int pagesize, LaneWidth encodeWidth) {
    if (pagesize >= (1 << WIDTH_SHIFT))
      throw new IllegalArgumentException("page size must be smaller than "
                                         + (1 << WIDTH_SHIFT));
    pageSize = pagesize;
    this.encodeWidth = encodeWidth;
    this.encoder = encodeWidth.kernel;
    // Initiate arrrays.
    bem = new byte[3 * pageSize / BLOCK_SIZE + pagesize];
    for (int k = 1; k < dataTobePacked.length; ++k)
      dataTobePacked[k] = new int[pageSize / 32 * 4]; // heuristic
    exceptData = new int[pageSize * 4];
  }

  /**
   * Construct the fastPFOR CODEC with default parameters, packing with this
   * machine's preferred vector lane width.
   */
  public VectorFastPFOR() { this(DEFAULT_PAGE_SIZE, LaneWidth.PREFERRED); }

  /**
   * Compress data in blocks of BLOCK_SIZE integers (if fewer than BLOCK_SIZE
   * integers are provided, nothing is done).
   *
   * @see IntegerCODEC#compress(int[], IntWrapper, int, int[], IntWrapper)
   */
  @Override
  public void headlessCompress(int[] in, IntWrapper inpos, int inlength,
                               int[] out, IntWrapper outpos) {
    inlength = inlength - inlength % BLOCK_SIZE;
    // Allocate memory for working area.

    final int finalinpos = inpos.get() + inlength;
    while (inpos.get() != finalinpos) {
      int thissize = Math.min(pageSize, finalinpos - inpos.get());
      encodePage(in, inpos, thissize, out, outpos);
    }
  }

  private void getBestBitSize(int[] in, int pos, int index) {
    Arrays.fill(freqs, 0);
    for (int i = pos, limit = pos + BLOCK_SIZE; i < limit; i++) {
      freqs[32 - Integer.numberOfLeadingZeros(in[i])]++;
    }
    bem[index] = 32;
    while (freqs[bem[index]] == 0)
      bem[index]--;
    bem[index + 2] = bem[index];
    int maxb = bem[index + 2];
    int bestcost = bem[index] * BLOCK_SIZE;
    int cexcept = 0;
    bem[index + 1] = 0;
    for (int b = bem[index] - 1; b >= 0; --b) {
      cexcept += freqs[b + 1];
      if (cexcept == BLOCK_SIZE)
        break;
      // the extra 8 is the cost of storing maxbits
      int thiscost = cexcept * OVERHEAD_OF_EACH_EXCEPT + cexcept * (maxb - b) +
                     b * BLOCK_SIZE + 8;
      if (maxb - b == 1)
        thiscost -= cexcept;
      if (thiscost < bestcost) {
        bestcost = thiscost;
        bem[index] = (byte)b;
        bem[index + 1] = (byte)cexcept;
      }
    }
  }

  private void encodePage(int[] in, IntWrapper inpos, int thissize, int[] out,
                          IntWrapper outpos) {
    final int headerpos = outpos.get();
    outpos.increment();
    int tmpoutpos = outpos.get();

    // Clear working area.
    Arrays.fill(dataPointers, 0);
    Arrays.fill(bem, (byte)0);

    int tmpinpos = inpos.get();
    final int finalinpos = tmpinpos + thissize - BLOCK_SIZE;
    int bindex = 0;
    for (; tmpinpos <= finalinpos; tmpinpos += BLOCK_SIZE) {
      getBestBitSize(in, tmpinpos, bindex);
      final int tmpexcept = bem[bindex + 1] & 0xFF;
      final int tmpbestb = bem[bindex];
      if (tmpexcept > 0) {
        final int index = bem[bindex + 2] - tmpbestb;
        if (dataPointers[index] + tmpexcept >= dataTobePacked[index].length) {
          int newsize = 2 * (dataPointers[index] + tmpexcept);
          int val = newsize + BLOCK_SIZE - 1;
          newsize = val - val % BLOCK_SIZE;
          dataTobePacked[index] = Arrays.copyOf(dataTobePacked[index], newsize);
        }
        bindex += 3;
        for (int k = 0; k < BLOCK_SIZE; ++k) {
          if ((in[k + tmpinpos] >>> tmpbestb) != 0) {
            // we have an exception
            bem[bindex++] = (byte)k;
            dataTobePacked[index][dataPointers[index]++] =
                in[k + tmpinpos] >>> tmpbestb;
          }
        }
      } else {
        bindex += 2;
      }
      encoder.fastpack(in, tmpinpos, out, tmpoutpos, tmpbestb);
      tmpoutpos += INTS_PER_BLOCK * tmpbestb;
    }
    inpos.set(tmpinpos);
    out[headerpos] = (tmpoutpos - headerpos) | (encodeWidth.code << WIDTH_SHIFT);

    int bytesize = bindex;
    out[tmpoutpos++] = bytesize;

    bytesize = bytesize % 4 == 0 ? bytesize : (bytesize / 4) * 4 + 4;
    for (int i = 0; i <= bytesize - 4; i += 4) {
      out[tmpoutpos] = bem[i] & 0xFF;
      out[tmpoutpos] |= (bem[i + 1] & 0xFF) << 8;
      out[tmpoutpos] |= (bem[i + 2] & 0xFF) << 16;
      out[tmpoutpos] |= (bem[i + 3] & 0xFF) << 24;
      tmpoutpos++;
    }

    int bitmap = 0;
    for (int k = 2; k <= 32; ++k) {
      if (dataPointers[k] != 0)
        bitmap |= (1 << (k - 1));
    }
    out[tmpoutpos++] = bitmap;

    for (int k = 2; k <= 32; ++k) {
      if (dataPointers[k] != 0) {
        out[tmpoutpos++] = dataPointers[k]; // size
        int j = 0;
        int n = (dataPointers[k] / BLOCK_SIZE) * BLOCK_SIZE;
        for (; j < n; j += BLOCK_SIZE) {
          encoder.fastpackNoMask(dataTobePacked[k], j, out, tmpoutpos,
                                         k);
          tmpoutpos += INTS_PER_BLOCK * k;
        }
        int r = dataPointers[k] % BLOCK_SIZE;
        if (r != 0) {
          tmpoutpos = slowpack(dataTobePacked[k], j, r, out,
                                               tmpoutpos, k);
          tmpoutpos++;
        }
      }
    }
    outpos.set(tmpoutpos);
  }

  /**
   * Uncompress data in blocks of integers. In this particular case,
   * the inlength parameter is ignored: it is deduced from the compressed
   * data.
   *
   * @see IntegerCODEC#compress(int[], IntWrapper, int, int[], IntWrapper)
   */
  @Override
  public void headlessUncompress(int[] in, IntWrapper inpos, int inlength,
                                 int[] out, IntWrapper outpos, int mynvalue) {
    mynvalue = mynvalue - mynvalue % BLOCK_SIZE;
    int finalout = outpos.get() + mynvalue;
    while (outpos.get() != finalout) {
      int thissize = Math.min(pageSize, finalout - outpos.get());
      decodePage(in, inpos, out, outpos, thissize);
    }
  }

  @Override
  public int maxHeadlessCompressedLength(IntWrapper compressedPositions, int inlength) {
    inlength = inlength - inlength % BLOCK_SIZE;
    int pageCount = (inlength + pageSize - 1) / pageSize;
    int blockCount = inlength / BLOCK_SIZE;
    int blockSizeInInts = OVERHEAD_OF_EACH_BLOCK_IN_INTS + BLOCK_SIZE;
    return OVERHEAD_OF_EACH_PAGE_IN_INTS * pageCount + blockSizeInInts * blockCount + 24;
  }

  private void loadMetaData(int[] in, int inexcept, int bytesize) {
    // Arrays.fill(bem, (byte)0);
    int len = (bytesize + 3) / 4;
    int lc = 0;
    for (int i = 0; i < len; i++) {
      bem[lc++] = (byte)(in[inexcept + i]);
      bem[lc++] = (byte)(in[inexcept + i] >>> 8);
      bem[lc++] = (byte)(in[inexcept + i] >>> 16);
      bem[lc++] = (byte)(in[inexcept + i] >>> 24);
    }
  }

  /**
   * Rejects a stream packed for wider lanes than this machine runs natively.
   * Decoding it would silently fall back to scalar emulation; failing loud lets
   * the caller re-encode the cluster at a lower width instead.
   */
  static void checkDecodable(LaneWidth streamWidth, LaneWidth hostWidth) {
    if (streamWidth.bits > hostWidth.bits) {
      throw new IllegalStateException(
          "VectorFastPFOR stream was packed for " + streamWidth.bits
          + "-bit vector lanes, but this machine runs at most " + hostWidth.bits
          + "-bit lanes natively. Re-encode with lanes <= " + hostWidth.bits
          + " bits.");
    }
  }

  private void decodePage(int[] in, IntWrapper inpos, int[] out,
                          IntWrapper outpos, int thissize) {
    final int initpos = inpos.get();
    final int header = in[inpos.get()];
    final int wheremeta = header & WHEREMETA_MASK;
    final LaneWidth streamWidth = LaneWidth.fromCode(header >>> WIDTH_SHIFT);
    checkDecodable(streamWidth, LaneWidth.PREFERRED);
    final VectorBitPackerKernels decoder = streamWidth.kernel;
    inpos.increment();
    int inexcept = initpos + wheremeta;

    final int bytesize = in[inexcept++];
    loadMetaData(in, inexcept, bytesize);
    inexcept += (bytesize + 3) / 4;
    final int bitmap = in[inexcept++];
    for (int k = 2; k <= 32; ++k) {
      if ((bitmap & (1 << (k - 1))) != 0) {
        int size = in[inexcept++];
        int val = size + BLOCK_SIZE - 1;
        int roundedup = val - val % BLOCK_SIZE;
        if (dataTobePacked[k].length < roundedup)
          dataTobePacked[k] = new int[roundedup];
        if (inexcept + roundedup / 32 * k <= in.length) {
          int j = 0;
          int len = (size / BLOCK_SIZE) * BLOCK_SIZE;
          for (; j < len; j += BLOCK_SIZE) {
            decoder.fastunpack(in, inexcept, dataTobePacked[k], j, k);
            inexcept += INTS_PER_BLOCK * k;
          }
          int r = size % BLOCK_SIZE;
          inexcept = slowunpack(in, inexcept, dataTobePacked[k],
                                                j, r, k);
        } else {
          int j = 0;
          val = roundedup / 32 * k + BLOCK_SIZE - 1;
          int[] buf = new int[val - val % BLOCK_SIZE];
          int initinexcept = inexcept;
          System.arraycopy(in, inexcept, buf, 0, in.length - inexcept);
          int l = (size / BLOCK_SIZE) * BLOCK_SIZE;
          for (; j < l; j += BLOCK_SIZE) {
            decoder.fastunpack(buf, inexcept - initinexcept,
                                       dataTobePacked[k], j, k);
            inexcept += INTS_PER_BLOCK * k;
          }
          int r = size % BLOCK_SIZE;
          inexcept = slowunpack(in, inexcept, dataTobePacked[k],
                                                j, r, k);
        }
      }
    }
    Arrays.fill(dataPointers, 0);
    int tmpoutpos = outpos.get();
    int tmpinpos = inpos.get();
    int idx = 0;
    for (int run = 0, run_end = thissize / BLOCK_SIZE; run < run_end;
         ++run, tmpoutpos += BLOCK_SIZE) {
      final int b = bem[idx];                  // byteContainer.get();
      final int cexcept = bem[idx + 1] & 0xFF; // byteContainer.get() & 0xFF;
      decoder.fastunpack(in, tmpinpos, out, tmpoutpos, b);
      tmpinpos += INTS_PER_BLOCK * b;
      if (cexcept > 0) {
        final int maxbits = bem[idx + 2]; // byteContainer.get();
        idx += 3;
        final int index = maxbits - b;
        if (index == 1) {
          for (int k = 0; k < cexcept; ++k) {
            final int pos = bem[idx++] & 0xFF; // byteContainer.get() & 0xFF;
            out[pos + tmpoutpos] |= 1 << b;
          }
        } else {
          for (int k = 0; k < cexcept; ++k) {
            final int pos = bem[idx++] & 0xFF; // byteContainer.get() & 0xFF;
            final int exceptvalue =
                dataTobePacked[index][dataPointers[index]++];
            out[pos + tmpoutpos] |= exceptvalue << b;
          }
        }
      } else {
        idx += 2;
      }
    }
    outpos.set(tmpoutpos);
    inpos.set(inexcept);
  }

  @Override
  public void compress(int[] in, IntWrapper inpos, int inlength, int[] out,
                       IntWrapper outpos) {
    inlength = inlength - inlength % BLOCK_SIZE;
    if (inlength == 0)
      return;
    out[outpos.get()] = inlength;
    outpos.increment();
    headlessCompress(in, inpos, inlength, out, outpos);
  }

  @Override
  public void uncompress(int[] in, IntWrapper inpos, int inlength, int[] out,
                         IntWrapper outpos) {
    if (inlength == 0)
      return;
    final int outlength = in[inpos.get()];
    inpos.increment();
    headlessUncompress(in, inpos, inlength, out, outpos, outlength);
  }
  @Override
  public String toString() {
    return this.getClass().getSimpleName();
  }

  /**
   * Creates a new buffer of the requested size.
   *
   * In case you need a different way to allocate buffers, you can override this
   * method with a custom behavior. The default implementation allocates a new
   * Java direct
   * {@link ByteBuffer} on each invocation.
   */
  protected ByteBuffer makeBuffer(int sizeInBytes) {
    return ByteBuffer.allocateDirect(sizeInBytes);
  }

  /**
   * Packs the sub-block exception remainder, which is not a multiple of the
   * vector block size, into the sequential scalar layout read back by
   * {@link #slowunpack}. Zeroes its target words first, then OR-accumulates the
   * packed bits, so a reused output buffer carries no stale bits.
   */
  private static int slowpack(final int[] in, int inpos, int inlen,
                              final int[] out, int outpos, int b) {
    if (inlen == 0)
      return outpos;
    if (b == 32) {
      System.arraycopy(in, inpos, out, outpos, inlen);
      return outpos + inlen;
    }
    int mask = (1 << b) - 1;
    Arrays.fill(out, outpos, outpos + (inlen * b + 31) / 32, 0);
    int c = 0;
    int l = 0;
    int r = 0;
    int val = 0;
    for (int i = 0; i < inlen; i++) {
      val = in[inpos + i] & mask;
      out[outpos] |= val << (c + r);
      c += b;
      l = (32 - r) % b;
      if (c + r >= 32) {
        if (i < inlen - 1 || l != 0)
          outpos++;
        r = l == 0 ? 0 : b - l;
        if (l != 0)
          out[outpos] = val >> (b - r);
        c = 0;
      }
    }
    return outpos;
  }

  /** Reverses {@link #slowpack}. */
  private static int slowunpack(final int[] in, int inpos, final int[] out,
                                int outpos, int outlen, int b) {
    if (outlen == 0) {
      return inpos;
    }
    if (b == 32) {
      System.arraycopy(in, inpos, out, outpos, outlen);
      return inpos + outlen;
    }
    int mask = (1 << b) - 1;
    int limit = outpos + outlen;
    int r = 0;
    int val = 0;
    int i = 0;
    for (; outpos < limit; i++) {
      if (r > 0)
        out[outpos++] =
            (val >>> (32 - (b - r))) | ((in[inpos + i] << (b - r)) & mask);
      val = in[inpos + i];
      int j = 0;
      int l = 32 - r;
      int ll = l % b == 0 ? l : l - b;
      while (j < ll && outpos < limit) {
        out[outpos++] = (val >> (j + r)) & mask;
        j += b;
      }
      r = l % b == 0 ? 0 : b - (l % b);
    }
    return inpos + i;
  }
}

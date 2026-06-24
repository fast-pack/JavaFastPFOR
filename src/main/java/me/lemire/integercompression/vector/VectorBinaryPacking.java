/**
 * This code is released under the
 * Apache License Version 2.0 http://www.apache.org/licenses/.
 *
 * (c) Daniel Lemire, http://lemire.me/en/
 * (c) Intel Corp. (for Vector implementation)
 */
package me.lemire.integercompression.vector;

import jdk.incubator.vector.IntVector;
import jdk.incubator.vector.VectorOperators;
import jdk.incubator.vector.VectorSpecies;
import me.lemire.integercompression.IntWrapper;
import me.lemire.integercompression.IntegerCODEC;
import me.lemire.integercompression.SkippableIntegerCODEC;
import me.lemire.integercompression.Util;
import me.lemire.integercompression.vector.VectorBitPackerKernels.LaneWidth;

/**
 * BinaryPacking using the Vector API pack/unpack kernels: each block is packed at
 * its own maximum bit width with no exceptions, so encoding is a single maxbits
 * pass plus a vectorized pack. It encodes integers in blocks of BLOCK_SIZE
 * integers. For arrays containing an arbitrary number of integers, you should use
 * it in conjunction with another CODEC:
 *
 *  <pre>IntegerCODEC ic =
 *  new Composition(new VectorBinaryPacking(), new VariableByte()).</pre>
 *
 * Note that this does not use differential coding: if you are working on sorted
 * lists, use IntegratedBinaryPacking instead.
 *
 * Blocks are packed in a vectorized layout that differs by hardware vector lane
 * width. The lane width is fixed at construction and not stored on the wire, so a
 * stream must be decoded at the same lane width it was encoded at. The default
 * constructor packs at this machine's preferred width; the {@code (LaneWidth)}
 * constructor pins a width so a heterogeneous cluster can decode on its narrowest
 * node.
 *
 * @author Daniel Lemire
 */
public final class VectorBinaryPacking implements IntegerCODEC, SkippableIntegerCODEC {
  public final static int BLOCK_SIZE = 256;
  private static final int MAX_BIT_WIDTH = Integer.SIZE;
  // Output words a packed block occupies per bit of width (BLOCK_SIZE / Integer.SIZE).
  private static final int WORDS_PER_BLOCK_BIT = BLOCK_SIZE / Integer.SIZE;
  // Blocks sharing one packed header word (four max-bit values, one byte each).
  private static final int GROUP_SIZE_IN_BLOCKS = 4;
  // The OR-reduction result is independent of vector width, so it uses the widest
  // available species regardless of the wire lane width.
  private static final VectorSpecies<Integer> MAXBITS_SPECIES = IntVector.SPECIES_PREFERRED;

  private final VectorBitPackerKernels kernel;

  /** Packs at this machine's preferred vector lane width. */
  public VectorBinaryPacking() {
    this(LaneWidth.PREFERRED);
  }

  /** Pins the lane width so a heterogeneous cluster can decode on its narrowest node. */
  public VectorBinaryPacking(LaneWidth laneWidth) {
    this.kernel = laneWidth.kernel;
  }

  @Override
  public void compress(int[] in, IntWrapper inpos, int inlength, int[] out, IntWrapper outpos) {
    inlength = Util.greatestMultiple(inlength, BLOCK_SIZE);
    if (inlength == 0)
      return;
    out[outpos.get()] = inlength;
    outpos.increment();
    headlessCompress(in, inpos, inlength, out, outpos);
  }

  @Override
  public void headlessCompress(int[] in, IntWrapper inpos, int inlength, int[] out, IntWrapper outpos) {
    inlength = Util.greatestMultiple(inlength, BLOCK_SIZE);
    int tmpoutpos = outpos.get();
    int s = inpos.get();
    for (; s + BLOCK_SIZE * 4 - 1 < inpos.get() + inlength; s += BLOCK_SIZE * 4) {
      final int mbits1 = maxbits(in, s);
      final int mbits2 = maxbits(in, s + BLOCK_SIZE);
      final int mbits3 = maxbits(in, s + 2 * BLOCK_SIZE);
      final int mbits4 = maxbits(in, s + 3 * BLOCK_SIZE);
      out[tmpoutpos++] = (mbits1 << 24) | (mbits2 << 16) | (mbits3 << 8) | (mbits4);
      kernel.fastpackNoMask(in, s, out, tmpoutpos, mbits1);
      tmpoutpos += WORDS_PER_BLOCK_BIT * mbits1;
      kernel.fastpackNoMask(in, s + BLOCK_SIZE, out, tmpoutpos, mbits2);
      tmpoutpos += WORDS_PER_BLOCK_BIT * mbits2;
      kernel.fastpackNoMask(in, s + 2 * BLOCK_SIZE, out, tmpoutpos, mbits3);
      tmpoutpos += WORDS_PER_BLOCK_BIT * mbits3;
      kernel.fastpackNoMask(in, s + 3 * BLOCK_SIZE, out, tmpoutpos, mbits4);
      tmpoutpos += WORDS_PER_BLOCK_BIT * mbits4;
    }
    for (; s < inpos.get() + inlength; s += BLOCK_SIZE) {
      final int mbits = maxbits(in, s);
      out[tmpoutpos++] = mbits;
      kernel.fastpackNoMask(in, s, out, tmpoutpos, mbits);
      tmpoutpos += WORDS_PER_BLOCK_BIT * mbits;
    }
    inpos.add(inlength);
    outpos.set(tmpoutpos);
  }

  @Override
  public void uncompress(int[] in, IntWrapper inpos, int inlength, int[] out, IntWrapper outpos) {
    if (inlength == 0)
      return;
    final int outlength = in[inpos.get()];
    inpos.increment();
    headlessUncompress(in, inpos, inlength, out, outpos, outlength);
  }

  @Override
  public void headlessUncompress(int[] in, IntWrapper inpos, int inlength, int[] out, IntWrapper outpos, int num) {
    final int outlength = Util.greatestMultiple(num, BLOCK_SIZE);
    int tmpinpos = inpos.get();
    int s = outpos.get();
    for (; s + BLOCK_SIZE * 4 - 1 < outpos.get() + outlength; s += BLOCK_SIZE * 4) {
      final int mbits1 = (in[tmpinpos] >>> 24);
      final int mbits2 = (in[tmpinpos] >>> 16) & 0xFF;
      final int mbits3 = (in[tmpinpos] >>> 8) & 0xFF;
      final int mbits4 = (in[tmpinpos]) & 0xFF;
      ++tmpinpos;
      kernel.fastunpack(in, tmpinpos, out, s, mbits1);
      tmpinpos += WORDS_PER_BLOCK_BIT * mbits1;
      kernel.fastunpack(in, tmpinpos, out, s + BLOCK_SIZE, mbits2);
      tmpinpos += WORDS_PER_BLOCK_BIT * mbits2;
      kernel.fastunpack(in, tmpinpos, out, s + 2 * BLOCK_SIZE, mbits3);
      tmpinpos += WORDS_PER_BLOCK_BIT * mbits3;
      kernel.fastunpack(in, tmpinpos, out, s + 3 * BLOCK_SIZE, mbits4);
      tmpinpos += WORDS_PER_BLOCK_BIT * mbits4;
    }
    for (; s < outpos.get() + outlength; s += BLOCK_SIZE) {
      final int mbits = in[tmpinpos];
      ++tmpinpos;
      kernel.fastunpack(in, tmpinpos, out, s, mbits);
      tmpinpos += WORDS_PER_BLOCK_BIT * mbits;
    }
    outpos.add(outlength);
    inpos.set(tmpinpos);
  }

  @Override
  public int maxHeadlessCompressedLength(IntWrapper compressedPositions, int inlength) {
    int blockCount = inlength / BLOCK_SIZE;
    int headersSizeInInts = blockCount / GROUP_SIZE_IN_BLOCKS + (blockCount % GROUP_SIZE_IN_BLOCKS);
    int blocksSizeInInts = blockCount * MAX_BIT_WIDTH * WORDS_PER_BLOCK_BIT;
    compressedPositions.add(blockCount * BLOCK_SIZE);
    return headersSizeInInts + blocksSizeInInts;
  }

  // Maximum bit width needed for a BLOCK_SIZE-value block: OR-reduce the values, then count significant bits.
  private static int maxbits(int[] in, int pos) {
    IntVector accumulator = IntVector.zero(MAXBITS_SPECIES);
    for (int offset = 0; offset < BLOCK_SIZE; offset += MAXBITS_SPECIES.length()) {
      accumulator = accumulator.or(IntVector.fromArray(MAXBITS_SPECIES, in, pos + offset));
    }
    int mask = accumulator.reduceLanes(VectorOperators.OR);
    return Integer.SIZE - Integer.numberOfLeadingZeros(mask);
  }

  @Override
  public String toString() {
    return this.getClass().getSimpleName() + "(" + kernel.getClass().getSimpleName() + ")";
  }
}

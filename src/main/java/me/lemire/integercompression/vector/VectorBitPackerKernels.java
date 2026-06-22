/**
 * This code is released under the
 * Apache License Version 2.0 http://www.apache.org/licenses/.
 *
 * (c) Daniel Lemire, http://lemire.me/en/
 */
package me.lemire.integercompression.vector;

import jdk.incubator.vector.IntVector;

/**
 * Width-specific vectorized bit-packing kernels for a 256-integer block.
 * Implemented by VectorBitPacker (512-bit lanes) and VectorBitPacker128
 * (128-bit lanes). The packed layout differs per width, so a stream is decoded
 * by the same kernel that packed it.
 */
public interface VectorBitPackerKernels {

  void fastpack(int[] in, int inpos, int[] out, int outpos, int b);

  void fastpackNoMask(int[] in, int inpos, int[] out, int outpos, int b);

  void fastunpack(int[] in, int inpos, int[] out, int outpos, int b);

  /**
   * Hardware vector lane width a stream was packed for. The packed byte layout
   * differs per width and is not interchangeable across widths, so the stream
   * carries its width (as {@link #code}) and is decoded by {@link #kernel}.
   */
  enum LaneWidth {
    BITS_128(0, 128, new VectorBitPacker128()),
    BITS_512(2, 512, new VectorBitPacker());

    /** Compact wire tag stored in the stream (fits in 2 bits). */
    public final int code;
    /** Native vector lane width in bits. */
    public final int bits;
    /** Kernel that packs and unpacks at this width. */
    public final VectorBitPackerKernels kernel;

    LaneWidth(int code, int bits, VectorBitPackerKernels kernel) {
      this.code = code;
      this.bits = bits;
      this.kernel = kernel;
    }

    /** Width whose kernel runs natively on this machine (encode default). */
    public static final LaneWidth PREFERRED =
        forHost(IntVector.SPECIES_PREFERRED.vectorBitSize());

    /** Largest kernel width that runs natively on a machine of {@code hostBits}. */
    public static LaneWidth forHost(int hostBits) {
      LaneWidth best = null;
      for (LaneWidth width : values()) {
        if (width.bits <= hostBits && (best == null || width.bits > best.bits)) {
          best = width;
        }
      }
      if (best == null) {
        throw new IllegalStateException(
            "no vector bit-packing kernel fits this machine's preferred vector width of "
            + hostBits + " bits");
      }
      return best;
    }

    /** Maps a stream wire tag back to its width. */
    public static LaneWidth fromCode(int code) {
      for (LaneWidth width : values()) {
        if (width.code == code) {
          return width;
        }
      }
      throw new IllegalArgumentException("unknown vector lane-width tag " + code);
    }
  }
}

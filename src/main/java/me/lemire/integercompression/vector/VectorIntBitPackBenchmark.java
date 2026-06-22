/**
 * This code is released under the
 * Apache License Version 2.0 http://www.apache.org/licenses/.
 *
 * (c) Daniel Lemire, http://lemire.me/en/
 */
package me.lemire.integercompression.vector;

import java.text.DecimalFormat;
import java.util.Random;

import me.lemire.integercompression.BitPacking;

/**
 * Benchmarks the vectorized int bit-packing kernels against the scalar
 * unrolled {@link BitPacking}, packing 256-integer blocks of each width.
 * Speeds are millions of integers per second. (For expert use; requires
 * --add-modules jdk.incubator.vector.)
 */
public class VectorIntBitPackBenchmark {

  private static final int BLOCK = 256;
  private static final int SUBBLOCKS = BLOCK / 32;

  private static void scalarPack(int[] in, int[] out, int bit) {
    for (int blk = 0; blk < SUBBLOCKS; blk++) {
      BitPacking.fastpackwithoutmask(in, blk * 32, out, blk * bit, bit);
    }
  }

  private static void scalarUnpack(int[] in, int[] out, int bit) {
    for (int blk = 0; blk < SUBBLOCKS; blk++) {
      BitPacking.fastunpack(in, blk * bit, out, blk * 32, bit);
    }
  }

  private static void test(boolean verbose) {
    DecimalFormat df = new DecimalFormat("0");
    final int times = 100000;
    Random r = new Random(0);
    int[] data = new int[BLOCK];
    int[] compressed = new int[8 * 32];
    int[] uncompressed = new int[BLOCK];
    VectorBitPacker256 vec256 = new VectorBitPacker256();
    VectorBitPacker vec = new VectorBitPacker();

    for (int bit = 1; bit <= 32; ++bit) {
      int mask = bit == 32 ? -1 : (1 << bit) - 1;
      long scalarComp = 0;
      long scalarDecomp = 0;
      long vec256Comp = 0;
      long vec256Decomp = 0;
      long vecComp = 0;
      long vecDecomp = 0;
      for (int t = 0; t < times; ++t) {
        for (int k = 0; k < BLOCK; ++k) {
          data[k] = r.nextInt() & mask;
        }
        long time1 = System.nanoTime();
        scalarPack(data, compressed, bit);
        long time2 = System.nanoTime();
        scalarUnpack(compressed, uncompressed, bit);
        long time3 = System.nanoTime();
        vec256.fastpackNoMask(data, 0, compressed, 0, bit);
        long time4 = System.nanoTime();
        vec256.fastunpack(compressed, 0, uncompressed, 0, bit);
        long time5 = System.nanoTime();
        vec.fastpackNoMask(data, 0, compressed, 0, bit);
        long time6 = System.nanoTime();
        vec.fastunpack(compressed, 0, uncompressed, 0, bit);
        long time7 = System.nanoTime();
        scalarComp += time2 - time1;
        scalarDecomp += time3 - time2;
        vec256Comp += time4 - time3;
        vec256Decomp += time5 - time4;
        vecComp += time6 - time5;
        vecDecomp += time7 - time6;
      }
      if (verbose) {
        double sc = BLOCK * times * 1000.0;
        System.out.println("bit = " + bit
            + " | scalar comp = " + df.format(sc / scalarComp)
            + " vec256 comp = " + df.format(sc / vec256Comp)
            + " vec comp = " + df.format(sc / vecComp)
            + " | scalar decomp = " + df.format(sc / scalarDecomp)
            + " vec256 decomp = " + df.format(sc / vec256Decomp)
            + " vec decomp = " + df.format(sc / vecDecomp));
      }
    }
  }

  /**
   * Main method.
   *
   * @param args command-line arguments
   */
  public static void main(String[] args) {
    System.out.println("Testing int packing (scalar vs VectorBitPacker256 vs "
        + "VectorBitPacker), 256-int blocks, speeds in millions of ints/s");
    test(false);
    test(true);
  }
}

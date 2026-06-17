/**
 * This code is released under the
 * Apache License Version 2.0 http://www.apache.org/licenses/.
 *
 * (c) Daniel Lemire, http://lemire.me/en/
 */
package me.lemire.longcompression;

import java.text.DecimalFormat;
import java.util.Random;

/**
 * Class used to benchmark the speed of long bit packing, comparing the
 * generic and unrolled {@link LongBitPacking} kernels. (For expert use.)
 *
 * @author Daniel Lemire
 *
 */
public class BenchmarkLongBitPacking {

        private static void test(boolean verbose) {
                DecimalFormat dfspeed = new DecimalFormat("0");
                final int N = 64;
                final int times = 100000;
                Random r = new Random(0);
                long[] data = new long[N];
                long[] compressed = new long[N];
                long[] uncompressed = new long[N];
                for (int bit = 1; bit < 64; ++bit) {
                        long mask = (1L << bit) - 1;
                        long slowcomp = 0;
                        long slowdecomp = 0;
                        long fastcomp = 0;
                        long fastdecomp = 0;
                        for (int t = 0; t < times; ++t) {
                                for (int k = 0; k < N; ++k) {
                                        data[k] = r.nextLong() & mask;
                                }
                                long time1 = System.nanoTime();
                                LongBitPacking.slowpackwithoutmask(data, 0,
                                        compressed, 0, bit);
                                long time2 = System.nanoTime();
                                LongBitPacking.slowunpack(compressed, 0,
                                        uncompressed, 0, bit);
                                long time3 = System.nanoTime();
                                LongBitPacking.fastpackwithoutmask(data, 0,
                                        compressed, 0, bit);
                                long time4 = System.nanoTime();
                                LongBitPacking.fastunpack(compressed, 0,
                                        uncompressed, 0, bit);
                                long time5 = System.nanoTime();
                                slowcomp += time2 - time1;
                                slowdecomp += time3 - time2;
                                fastcomp += time4 - time3;
                                fastdecomp += time5 - time4;
                        }
                        if (verbose)
                                System.out.println("bit = "
                                        + bit
                                        + " slow comp. speed = "
                                        + dfspeed.format(N * times * 1000.0
                                                / (slowcomp))
                                        + " slow decomp. speed = "
                                        + dfspeed.format(N * times * 1000.0
                                                / (slowdecomp))
                                        + " unrolled comp. speed = "
                                        + dfspeed.format(N * times * 1000.0
                                                / (fastcomp))
                                        + " unrolled decomp. speed = "
                                        + dfspeed.format(N * times * 1000.0
                                                / (fastdecomp)));
                }
        }

        /**
         * Main method
         *
         * @param args
         *                command-line arguments
         */
        public static void main(String[] args) {
                System.out.println("Testing long packing (slow vs unrolled) ");
                test(false);
                test(true);
        }

}

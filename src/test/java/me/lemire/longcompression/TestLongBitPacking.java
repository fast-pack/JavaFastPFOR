/**
 * This code is released under the
 * Apache License Version 2.0 http://www.apache.org/licenses/.
 *
 * (c) Daniel Lemire, http://lemire.me/en/
 */

package me.lemire.longcompression;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.Random;

import org.junit.Test;

/**
 * Validates the unrolled {@link LongBitPacking} kernels.
 */
public class TestLongBitPacking {

        private static final int BLOCK = 64;
        private static final int TRIALS = 64;

        private static long[] randomBlock(Random random, int bit) {
                long mask;
                if (bit == 64) {
                        mask = -1L;
                } else {
                        mask = (1L << bit) - 1;
                }
                long[] data = new long[BLOCK];
                for (int i = 0; i < BLOCK; i++) {
                        data[i] = random.nextLong() & mask;
                }
                return data;
        }

        @Test
        public void roundTrip() {
                Random random = new Random(0);
                for (int bit = 0; bit <= 64; bit++) {
                        for (int trial = 0; trial < TRIALS; trial++) {
                                long[] data = randomBlock(random, bit);
                                long[] packed = new long[bit];
                                LongBitPacking.fastpackwithoutmask(data, 0, packed, 0, bit);
                                long[] unpacked = new long[BLOCK];
                                LongBitPacking.fastunpack(packed, 0, unpacked, 0, bit);
                                assertArrayEquals("bit width " + bit, data, unpacked);
                        }
                }
        }

        @Test
        public void layoutMatchesSlowPack() {
                Random random = new Random(1);
                for (int bit = 1; bit < 64; bit++) {
                        for (int trial = 0; trial < TRIALS; trial++) {
                                long[] data = randomBlock(random, bit);
                                long[] fast = new long[bit];
                                long[] slow = new long[bit];
                                LongBitPacking.fastpackwithoutmask(data, 0, fast, 0, bit);
                                LongBitPacking.slowpackwithoutmask(data, 0, slow, 0, bit);
                                assertArrayEquals("bit width " + bit, slow, fast);
                        }
                }
        }

        @Test
        public void layoutMatchesSlowUnpack() {
                Random random = new Random(2);
                for (int bit = 1; bit < 64; bit++) {
                        for (int trial = 0; trial < TRIALS; trial++) {
                                long[] data = randomBlock(random, bit);
                                long[] packed = new long[bit];
                                LongBitPacking.slowpackwithoutmask(data, 0, packed, 0, bit);
                                long[] fast = new long[BLOCK];
                                long[] slow = new long[BLOCK];
                                LongBitPacking.fastunpack(packed, 0, fast, 0, bit);
                                LongBitPacking.slowunpack(packed, 0, slow, 0, bit);
                                assertArrayEquals("bit width " + bit, slow, fast);
                        }
                }
        }

        @Test
        public void extremeValues() {
                for (int bit = 0; bit <= 64; bit++) {
                        long mask;
                        if (bit == 64) {
                                mask = -1L;
                        } else {
                                mask = (1L << bit) - 1;
                        }
                        long[] data = new long[BLOCK];
                        Arrays.fill(data, mask);
                        long[] packed = new long[bit];
                        LongBitPacking.fastpackwithoutmask(data, 0, packed, 0, bit);
                        long[] unpacked = new long[BLOCK];
                        LongBitPacking.fastunpack(packed, 0, unpacked, 0, bit);
                        assertArrayEquals("bit width " + bit, data, unpacked);
                        if (bit > 0 && bit < 64) {
                                long[] slow = new long[bit];
                                LongBitPacking.slowpackwithoutmask(data, 0, slow, 0, bit);
                                assertArrayEquals("bit width " + bit, slow, packed);
                        }
                }
        }

        @Test
        public void roundTripWithOffsets() {
                Random random = new Random(3);
                int inOffset = 7;
                int outOffset = 5;
                long sentinel = 0x5555555555555555L;
                for (int bit = 0; bit <= 64; bit++) {
                        long[] data = randomBlock(random, bit);
                        long[] in = new long[BLOCK + inOffset];
                        System.arraycopy(data, 0, in, inOffset, BLOCK);
                        long[] packed = new long[bit + outOffset];
                        Arrays.fill(packed, 0, outOffset, sentinel);
                        LongBitPacking.fastpackwithoutmask(in, inOffset, packed, outOffset, bit);
                        long[] unpacked = new long[BLOCK + inOffset];
                        Arrays.fill(unpacked, 0, inOffset, sentinel);
                        LongBitPacking.fastunpack(packed, outOffset, unpacked, inOffset, bit);
                        long[] result = new long[BLOCK];
                        System.arraycopy(unpacked, inOffset, result, 0, BLOCK);
                        assertArrayEquals("bit width " + bit, data, result);
                        for (int i = 0; i < outOffset; i++) {
                                assertEquals("pack wrote before outpos at bit " + bit,
                                        sentinel, packed[i]);
                        }
                        for (int i = 0; i < inOffset; i++) {
                                assertEquals("unpack wrote before outpos at bit " + bit,
                                        sentinel, unpacked[i]);
                        }
                }
        }
}

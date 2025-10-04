/**
 * This code is released under the
 * Apache License Version 2.0 http://www.apache.org/licenses/.
 *
 * (c) Daniel Lemire, http://lemire.me/en/
 */

package me.lemire.integercompression;

import java.util.Arrays;

import me.lemire.integercompression.differential.IntegratedBinaryPacking;
import me.lemire.integercompression.differential.IntegratedVariableByte;
import me.lemire.integercompression.differential.SkippableIntegratedComposition;
import me.lemire.integercompression.differential.SkippableIntegratedIntegerCODEC;
import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertTrue;

/**
 * Just some basic sanity tests.
 * 
 * @author Daniel Lemire
 */
@SuppressWarnings({ "static-method" })
public class SkippableBasicTest {
    final SkippableIntegerCODEC[] codecs = {
            new JustCopy(),
            new VariableByte(),
            new SkippableComposition(new BinaryPacking(), new VariableByte()),
            new SkippableComposition(new NewPFD(), new VariableByte()),
            new SkippableComposition(new NewPFDS9(), new VariableByte()),
            new SkippableComposition(new NewPFDS16(), new VariableByte()),
            new SkippableComposition(new OptPFD(), new VariableByte()),
            new SkippableComposition(new OptPFDS9(), new VariableByte()),
            new SkippableComposition(new OptPFDS16(), new VariableByte()),
            new SkippableComposition(new FastPFOR128(), new VariableByte()),
            new SkippableComposition(new FastPFOR(), new VariableByte()),
            new Simple9(),
            new Simple16() };

    
    /**
     * 
     */
    @Test
    public void consistentTest() {
        int N = 4096;
        int[] data = new int[N];
        int[] rev = new int[N];
        for (int k = 0; k < N; ++k)
            data[k] = k % 128;
        for (SkippableIntegerCODEC c : codecs) {
            System.out.println("[SkippeableBasicTest.consistentTest] codec = "
                    + c);
            for (int n = 0; n <= N; ++n) {
                IntWrapper inPos = new IntWrapper();
                IntWrapper outPos = new IntWrapper();
                int[] outBuf = new int[c.maxHeadlessCompressedLength(new IntWrapper(0), n)];

                c.headlessCompress(data, inPos, n, outBuf, outPos);

                IntWrapper inPoso = new IntWrapper();
                IntWrapper outPoso = new IntWrapper();
                c.headlessUncompress(outBuf, inPoso, outPos.get(), rev,
                        outPoso, n);
                if (outPoso.get() != n) {
                    throw new RuntimeException("bug "+n);
                }
                if (inPoso.get() != outPos.get()) {
                    throw new RuntimeException("bug "+n+" "+inPoso.get()+" "+outPos.get());
                }
                for (int j = 0; j < n; ++j)
                    if (data[j] != rev[j]) {
                        throw new RuntimeException("bug");
                    }
            }
        }
    }

    
    /**
     * 
     */
    @Test
    public void varyingLengthTest() {
        int N = 4096;
        int[] data = new int[N];
        for (int k = 0; k < N; ++k)
            data[k] = k;
        for (SkippableIntegerCODEC c : codecs) {
            System.out.println("[SkippeableBasicTest.varyingLengthTest] codec = "+c);
            for (int L = 1; L <= 128; L++) {
                int[] comp = TestUtils.compressHeadless(c, Arrays.copyOf(data, L));
                int[] answer = TestUtils.uncompressHeadless(c, comp, L);
                for (int k = 0; k < L; ++k)
                    if (answer[k] != data[k])
                        throw new RuntimeException("bug "+c.toString()+" "+k+" "+answer[k]+" "+data[k]);
            }
            for (int L = 128; L <= N; L *= 2) {
                int[] comp = TestUtils.compressHeadless(c, Arrays.copyOf(data, L));
                int[] answer = TestUtils.uncompressHeadless(c, comp, L);
                for (int k = 0; k < L; ++k)
                    if (answer[k] != data[k])
                        throw new RuntimeException("bug");
            }

        }
    }

    /**
     * 
     */
    @Test
    public void varyingLengthTest2() {
        int N = 128;
        int[] data = new int[N];
        data[127] = -1;
        for (SkippableIntegerCODEC c : codecs) {
            System.out.println("[SkippeableBasicTest.varyingLengthTest2] codec = "+c);

            try {
                // CODEC Simple9 is limited to "small" integers.
                if (c.getClass().equals(
                        Class.forName("me.lemire.integercompression.Simple9")))
                    continue;
            } catch (ClassNotFoundException e) {
                e.printStackTrace();
            }
            try {
                // CODEC Simple16 is limited to "small" integers.
                if (c.getClass().equals(
                        Class.forName("me.lemire.integercompression.Simple16")))
                    continue;
            } catch (ClassNotFoundException e) {
                e.printStackTrace();
            }
            for (int L = 1; L <= 128; L++) {
                int[] comp = TestUtils.compressHeadless(c, Arrays.copyOf(data, L));
                int[] answer = TestUtils.uncompressHeadless(c, comp, L);
                for (int k = 0; k < L; ++k)
                    if (answer[k] != data[k])
                        throw new RuntimeException("bug at k = "+k+" "+answer[k]+" "+data[k]+" for "+c.toString());
            }
            for (int L = 128; L <= N; L *= 2) {
                int[] comp = TestUtils.compressHeadless(c, Arrays.copyOf(data, L));
                int[] answer = TestUtils.uncompressHeadless(c, comp, L);
                for (int k = 0; k < L; ++k)
                    if (answer[k] != data[k])
                        throw new RuntimeException("bug");
            }

        }
    }

    @Test
    public void testMaxHeadlessCompressedLength() {
        testMaxHeadlessCompressedLength(new IntegratedBinaryPacking(), 16 * IntegratedBinaryPacking.BLOCK_SIZE);
        testMaxHeadlessCompressedLength(new IntegratedVariableByte(), 128);
        testMaxHeadlessCompressedLength(new SkippableIntegratedComposition(new IntegratedBinaryPacking(), new IntegratedVariableByte()), 16 * IntegratedBinaryPacking.BLOCK_SIZE + 10);

        testMaxHeadlessCompressedLength(new BinaryPacking(), 16 * BinaryPacking.BLOCK_SIZE, 32);
        testMaxHeadlessCompressedLength(new VariableByte(), 128, 32);
        testMaxHeadlessCompressedLength(new SkippableComposition(new BinaryPacking(), new VariableByte()), 16 * BinaryPacking.BLOCK_SIZE + 10, 32);
        testMaxHeadlessCompressedLength(new JustCopy(), 128, 32);
        testMaxHeadlessCompressedLength(new Simple9(), 128, 28);
        testMaxHeadlessCompressedLength(new Simple16(), 128, 28);
        testMaxHeadlessCompressedLength(new GroupSimple9(), 128, 28);
        testMaxHeadlessCompressedLength(new OptPFD(), 4 * OptPFD.BLOCK_SIZE, 32);
        testMaxHeadlessCompressedLength(new SkippableComposition(new OptPFD(), new VariableByte()), 4 * OptPFD.BLOCK_SIZE + 10, 32);
        testMaxHeadlessCompressedLength(new OptPFDS9(), 4 * OptPFDS9.BLOCK_SIZE, 32);
        testMaxHeadlessCompressedLength(new SkippableComposition(new OptPFDS9(), new VariableByte()), 4 * OptPFDS9.BLOCK_SIZE + 10, 32);
        testMaxHeadlessCompressedLength(new OptPFDS16(), 4 * OptPFDS16.BLOCK_SIZE, 32);
        testMaxHeadlessCompressedLength(new SkippableComposition(new OptPFDS9(), new VariableByte()), 4 * OptPFDS16.BLOCK_SIZE + 10, 32);
        testMaxHeadlessCompressedLength(new NewPFD(), 4 * NewPFD.BLOCK_SIZE, 32);
        testMaxHeadlessCompressedLength(new SkippableComposition(new NewPFD(), new VariableByte()), 4 * NewPFD.BLOCK_SIZE + 10, 32);
        testMaxHeadlessCompressedLength(new NewPFDS9(), 4 * NewPFDS9.BLOCK_SIZE, 32);
        testMaxHeadlessCompressedLength(new SkippableComposition(new NewPFDS9(), new VariableByte()), 4 * NewPFDS9.BLOCK_SIZE + 10, 32);
        testMaxHeadlessCompressedLength(new NewPFDS16(), 4 * NewPFDS16.BLOCK_SIZE, 32);
        testMaxHeadlessCompressedLength(new SkippableComposition(new NewPFDS16(), new VariableByte()), 4 * NewPFDS16.BLOCK_SIZE + 10, 32);

        int fastPfor128PageSize = FastPFOR128.BLOCK_SIZE * 4; // smaller page size than the default to speed up the test
        testMaxHeadlessCompressedLength(new FastPFOR128(fastPfor128PageSize), 2 * fastPfor128PageSize, 32);
        testMaxHeadlessCompressedLength(new SkippableComposition(new FastPFOR128(fastPfor128PageSize), new VariableByte()), 2 * fastPfor128PageSize + 10, 32);
        int fastPforPageSize = FastPFOR.BLOCK_SIZE * 4; // smaller page size than the default to speed up the test
        testMaxHeadlessCompressedLength(new FastPFOR(fastPforPageSize), 2 * fastPforPageSize, 32);
        testMaxHeadlessCompressedLength(new SkippableComposition(new FastPFOR(fastPforPageSize), new VariableByte()), 2 * fastPforPageSize + 10, 32);
    }

    private static void testMaxHeadlessCompressedLength(SkippableIntegratedIntegerCODEC codec, int inlengthTo) {
        // We test the worst-case scenario by making all deltas and the initial value negative.
        int delta = -1;
        int value = delta;

        for (int inlength = 0; inlength < inlengthTo; ++inlength) {
            int[] input = new int[inlength];
            for (int i = 0; i < inlength; i++) {
                input[i] = value;
                value += delta;
            }

            int maxOutputLength = codec.maxHeadlessCompressedLength(new IntWrapper(), inlength);
            int[] output = new int[maxOutputLength];
            IntWrapper outPos = new IntWrapper();

            codec.headlessCompress(input, new IntWrapper(), inlength, output, outPos, new IntWrapper());
            // If we reach this point, no exception was thrown, which means the calculated output length was sufficient.

            assertTrue(maxOutputLength <= outPos.get() + 1); // +1 because SkippableIntegratedComposition always adds one extra integer for the potential header
        }
    }

    private static void testMaxHeadlessCompressedLength(SkippableIntegerCODEC codec, int inlengthTo, int maxBitWidth) {
        // Some schemes ignore bit widths between 21 and 31. Therefore, in addition to maxBitWidth - 1, we also test 20.
        assertTrue(maxBitWidth >= 20);
        int[] regularValueBitWidths = { 20, maxBitWidth - 1 };

        for (int inlength = 0; inlength < inlengthTo; ++inlength) {
            int[] input = new int[inlength];

            int maxOutputLength = codec.maxHeadlessCompressedLength(new IntWrapper(), inlength);
            int[] output = new int[maxOutputLength];

            for (int exceptionCount = 0; exceptionCount < inlength; exceptionCount++) {
                int exception = maxBitWidth == 32 ? -1 : (1 << maxBitWidth) - 1;

                for (int regularValueBitWidth : regularValueBitWidths) {
                    int regularValue = regularValueBitWidth == 32 ? -1 : (1 << regularValueBitWidth) - 1;

                    Arrays.fill(input, 0, exceptionCount, exception);
                    Arrays.fill(input, exceptionCount, input.length, regularValue);

                    codec.headlessCompress(input, new IntWrapper(), inlength, output, new IntWrapper());
                    // If we reach this point, no exception was thrown, which means the calculated output length was sufficient.
                }
            }
        }
    }

    @Test
    public void testUncompressOutputOffset_SkippableComposition() {
        for (int offset : new int[] {0, 1, 6}) {
            SkippableComposition codec = new SkippableComposition(new BinaryPacking(), new VariableByte());

            int[] input = { 2, 3, 4, 5 };
            int[] compressed = new int[codec.maxHeadlessCompressedLength(new IntWrapper(0), input.length)];
            int[] uncompressed = new int[offset + input.length];

            IntWrapper inputOffset = new IntWrapper(0);
            IntWrapper compressedOffset = new IntWrapper(0);

            codec.headlessCompress(input, inputOffset, input.length, compressed, compressedOffset);

            int compressedLength = compressedOffset.get();
            IntWrapper uncompressedOffset = new IntWrapper(offset);
            compressedOffset = new IntWrapper(0);
            codec.headlessUncompress(compressed, compressedOffset, compressedLength, uncompressed, uncompressedOffset, input.length);

            assertArrayEquals(input, Arrays.copyOfRange(uncompressed, offset, offset + input.length));
        }
    }

    @Test
    public void testUncompressOutputOffset_SkippableIntegratedComposition() {
        for (int offset : new int[] {0, 1, 6}) {
            SkippableIntegratedComposition codec = new SkippableIntegratedComposition(new IntegratedBinaryPacking(), new IntegratedVariableByte());

            int[] input = { 2, 3, 4, 5 };
            int[] compressed = new int[codec.maxHeadlessCompressedLength(new IntWrapper(0), input.length)];
            int[] uncompressed = new int[offset + input.length];

            IntWrapper inputOffset = new IntWrapper(0);
            IntWrapper compressedOffset = new IntWrapper(0);
            IntWrapper initValue = new IntWrapper(0);

            codec.headlessCompress(input, inputOffset, input.length, compressed, compressedOffset, initValue);

            int compressedLength = compressedOffset.get();
            IntWrapper uncompressedOffset = new IntWrapper(offset);
            compressedOffset = new IntWrapper(0);
            initValue = new IntWrapper(0);
            codec.headlessUncompress(compressed, compressedOffset, compressedLength, uncompressed, uncompressedOffset, input.length, initValue);

            assertArrayEquals(input, Arrays.copyOfRange(uncompressed, offset, offset + input.length));
        }
    }
}

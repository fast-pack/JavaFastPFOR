package me.lemire.longcompression;

import me.lemire.longcompression.differential.LongDelta;
import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertNotNull;

public class LongDeltaTest {
    @Test
    public void testEmptyArrayFastInverseDelta() {
        LongCompressor compressor = new LongCompressor();
        long[] input = new long[0];

        LongDelta.delta(input);
        long[] compressed = compressor.compress(input);
        long[] result = compressor.uncompress(compressed);
        LongDelta.fastinverseDelta(result);

        assertNotNull(result);
        assertArrayEquals(input, result);
    }
}

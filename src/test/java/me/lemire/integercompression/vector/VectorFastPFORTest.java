/**
 * This code is released under the
 * Apache License Version 2.0 http://www.apache.org/licenses/.
 *
 * (c) Daniel Lemire, http://lemire.me/en/
 */
package me.lemire.integercompression.vector;

import static org.junit.Assert.assertArrayEquals;

import java.util.Arrays;

import org.junit.Test;

import me.lemire.integercompression.IntWrapper;

/**
 * Tests for the vectorized FastPFOR codec.
 */
public class VectorFastPFORTest {

  /**
   * A few exceptions in a single block leave a sub-block remainder that is
   * packed with slowpack, which OR-accumulates into the output. Compressing
   * into a non-zero buffer must still produce a clean roundtrip.
   */
  @Test
  public void dirtyOutputBufferRoundTrip() {
    int[] data = new int[VectorFastPFOR.BLOCK_SIZE];
    for (int i = 0; i < data.length; i++) {
      data[i] = i % 8; // base values fit in 3 bits
    }
    data[5] = 1 << 20; // exceptions sharing one width, count not a multiple
    data[200] = 1 << 20; // of BLOCK_SIZE, so the remainder goes through slowpack

    VectorFastPFOR codec = new VectorFastPFOR();
    int[] compressed = new int[2 * data.length];
    Arrays.fill(compressed, -1); // stale bits the slowpack remainder must overwrite
    IntWrapper inpos = new IntWrapper(0);
    IntWrapper outpos = new IntWrapper(0);
    codec.headlessCompress(data, inpos, data.length, compressed, outpos);

    int[] recovered = new int[data.length];
    codec.headlessUncompress(compressed, new IntWrapper(0), outpos.get(),
        recovered, new IntWrapper(0), data.length);

    assertArrayEquals(data, recovered);
  }
}

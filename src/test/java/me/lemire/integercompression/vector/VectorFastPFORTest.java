/**
 * This code is released under the
 * Apache License Version 2.0 http://www.apache.org/licenses/.
 *
 * (c) Daniel Lemire, http://lemire.me/en/
 */
package me.lemire.integercompression.vector;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertThrows;

import java.util.Arrays;

import org.junit.Test;

import me.lemire.integercompression.IntWrapper;
import me.lemire.integercompression.vector.VectorBitPackerKernels.LaneWidth;

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

  /** A stream packed for wider lanes than the host runs natively is refused. */
  @Test
  public void checkDecodableRejectsWiderStream() {
    assertThrows(IllegalStateException.class,
        () -> VectorFastPFOR.checkDecodable(LaneWidth.BITS_512, LaneWidth.BITS_128));
    // equal or narrower stream decodes natively
    VectorFastPFOR.checkDecodable(LaneWidth.BITS_128, LaneWidth.BITS_128);
    VectorFastPFOR.checkDecodable(LaneWidth.BITS_128, LaneWidth.BITS_512);
  }

  /** 128-bit lanes are the universal floor, so such a stream decodes on any host. */
  @Test
  public void lowestCommonWidthRoundTripsOnAnyHost() {
    int[] data = new int[3 * VectorFastPFOR.BLOCK_SIZE];
    for (int i = 0; i < data.length; i++) {
      data[i] = i % 8;
    }
    data[5] = 1 << 20;
    data[600] = 1 << 25;

    VectorFastPFOR codec =
        new VectorFastPFOR(VectorFastPFOR.DEFAULT_PAGE_SIZE, LaneWidth.BITS_128);
    int[] compressed = new int[2 * data.length];
    IntWrapper inpos = new IntWrapper(0);
    IntWrapper outpos = new IntWrapper(0);
    codec.headlessCompress(data, inpos, data.length, compressed, outpos);

    int[] recovered = new int[data.length];
    codec.headlessUncompress(compressed, new IntWrapper(0), outpos.get(),
        recovered, new IntWrapper(0), data.length);

    assertArrayEquals(data, recovered);
  }
}

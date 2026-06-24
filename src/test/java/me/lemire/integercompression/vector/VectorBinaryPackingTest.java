/**
 * This code is released under the
 * Apache License Version 2.0 http://www.apache.org/licenses/.
 *
 * (c) Daniel Lemire, http://lemire.me/en/
 */
package me.lemire.integercompression.vector;

import static org.junit.Assert.assertArrayEquals;

import org.junit.Test;

import me.lemire.integercompression.IntWrapper;
import me.lemire.integercompression.vector.VectorBitPackerKernels.LaneWidth;

/**
 * Tests for the vectorized BinaryPacking codec.
 */
public class VectorBinaryPackingTest {

  /** Every lane width packs and unpacks back to the original values. */
  @Test
  public void roundTripAcrossLaneWidths() {
    for (LaneWidth laneWidth : LaneWidth.values()) {
      roundTrip(new VectorBinaryPacking(laneWidth));
    }
  }

  private static void roundTrip(VectorBinaryPacking codec) {
    int[] data = new int[3 * VectorBinaryPacking.BLOCK_SIZE];
    for (int i = 0; i < data.length; i++) {
      data[i] = i % 8; // mix of bit widths across blocks
    }
    data[5] = 1 << 20;
    data[600] = 1 << 30;

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

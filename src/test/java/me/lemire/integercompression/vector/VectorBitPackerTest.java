/**
 * This code is released under the
 * Apache License Version 2.0 http://www.apache.org/licenses/.
 *
 * (c) Daniel Lemire, http://lemire.me/en/
 */
package me.lemire.integercompression.vector;

import static org.junit.Assert.assertArrayEquals;

import java.util.Random;

import org.junit.Test;

/**
 * Tests for the width-specific bit-packing kernels.
 *
 * VectorBitPacker (256/512-bit lanes) and VectorBitPacker128 (128-bit lanes)
 * use different lane strides, so their packed layouts differ and are not
 * wire-compatible. Both must satisfy the same roundtrip contract: packing a
 * 256-integer block whose values fit in b bits and unpacking it recovers the
 * input for every width b.
 */
public class VectorBitPackerTest {

  private static final int BLOCK_SIZE = 256;

  private static int[] randomBlock(Random random, int b) {
    int mask = b == 32 ? -1 : (1 << b) - 1;
    int[] in = new int[BLOCK_SIZE];
    for (int i = 0; i < BLOCK_SIZE; i++) {
      in[i] = random.nextInt() & mask;
    }
    return in;
  }

  private static void roundTrip(VectorBitPackerKernels packer) {
    Random random = new Random(42);
    for (int b = 1; b <= 32; b++) {
      int[] in = randomBlock(random, b);

      int[] packed = new int[8 * b];
      packer.fastpack(in, 0, packed, 0, b);
      int[] recovered = new int[BLOCK_SIZE];
      packer.fastunpack(packed, 0, recovered, 0, b);
      assertArrayEquals("fastpack b=" + b, in, recovered);

      int[] packedNoMask = new int[8 * b];
      packer.fastpackNoMask(in, 0, packedNoMask, 0, b);
      int[] recoveredNoMask = new int[BLOCK_SIZE];
      packer.fastunpack(packedNoMask, 0, recoveredNoMask, 0, b);
      assertArrayEquals("fastpackNoMask b=" + b, in, recoveredNoMask);

      assertArrayEquals("fastpack vs fastpackNoMask b=" + b, packed,
          packedNoMask);
    }
  }

  @Test
  public void vectorBitPacker128RoundTrip() {
    roundTrip(new VectorBitPacker128());
  }

  @Test
  public void vectorBitPackerRoundTrip() {
    roundTrip(new VectorBitPacker());
  }
}

/**
 * This code is released under the
 * Apache License Version 2.0 http://www.apache.org/licenses/.
 *
 * (c) Daniel Lemire, http://lemire.me/en/
 */

package me.lemire.longcompression;

import me.lemire.integercompression.IntWrapper;

import org.junit.Assert;
import org.junit.Test;

/**
 * Edge-cases having caused issue specifically with LongVariableByte.
 * 
 * @author Benoit Lacelle
 */
public class TestLongVariableByte extends ATestLongCODEC {
	final LongVariableByte codec = new LongVariableByte();

	@Override
	public LongCODEC getCodec() {
		return codec;
	}

	@Test
	public void testCodec_allBitWidths() {
		for (int bitWidth = 0; bitWidth <= 64; bitWidth++) {
			long value = bitWidth == 0 ? 0 : 1L << (bitWidth - 1);

			int expectedSizeInBytes = Math.max(1, (bitWidth + 6) / 7);
			int expectedSizeInLongs = (expectedSizeInBytes > 8) ? 2 : 1;

			Assert.assertEquals(expectedSizeInLongs, LongTestUtils.compress((LongCODEC) codec, new long[] { value }).length);
			Assert.assertEquals(expectedSizeInBytes, LongTestUtils.compress((ByteLongCODEC) codec, new long[] { value }).length);
			Assert.assertEquals(expectedSizeInLongs,
					LongTestUtils.compressHeadless((SkippableLongCODEC) codec, new long[] { value }).length);
		}
	}

	/**
	 * A nonzero byte offset must be applied once. The decoder cursor is absolute.
	 */
	@Test
	public void byteOffsetRoundTripAdvancesCursorsOnce() {
		long[] values = { 2, 3, 4, 5 };
		for (int x = 0; x < 50; ++x) {
			byte[] compressed = new byte[90 * 4];
			IntWrapper inpos = new IntWrapper(0);
			IntWrapper outpos = new IntWrapper(x);
			codec.compress(values, inpos, values.length, compressed, outpos);
			int len = outpos.get() - x;
			Assert.assertEquals(values.length, inpos.get());

			outpos.set(x);
			long[] recovered = new long[values.length];
			IntWrapper recoveredPos = new IntWrapper(0);
			codec.uncompress(compressed, outpos, len, recovered, recoveredPos);

			Assert.assertArrayEquals(values, recovered);
			Assert.assertEquals(x + len, outpos.get());
			Assert.assertEquals(values.length, recoveredPos.get());
		}
	}

	/**
	 * A zero-length decode must leave a nonzero cursor where it started.
	 */
	@Test
	public void emptyByteInputPreservesOffsets() {
		IntWrapper inpos = new IntWrapper(5);
		IntWrapper outpos = new IntWrapper(2);
		long[] output = { 10, 20, 30 };

		codec.uncompress(new byte[5], inpos, 0, output, outpos);

		Assert.assertEquals(5, inpos.get());
		Assert.assertEquals(2, outpos.get());
		Assert.assertArrayEquals(new long[] { 10, 20, 30 }, output);
	}
}

/**
 * This code is released under the
 * Apache License Version 2.0 http://www.apache.org/licenses/.
 *
 * (c) Daniel Lemire, http://lemire.me/en/
 */

package me.lemire.longcompression;

import java.util.Arrays;

/**
 * Bitpacking routines
 * 
 * <p>For details, please see</p>
 * <p>
 * Daniel Lemire and Leonid Boytsov, Decoding billions of integers per second
 * through vectorization Software: Practice &amp; Experience
 * <a href="http://onlinelibrary.wiley.com/doi/10.1002/spe.2203/abstract">http://onlinelibrary.wiley.com/doi/10.1002/spe.2203/abstract</a>
 * <a href="http://arxiv.org/abs/1209.2137">http://arxiv.org/abs/1209.2137</a>
 * </p>
 * 
 * @author Benoit Lacelle
 * 
 */
public final class LongBitPacking {

        /**
         * Pack 64 longs
         * 
         * @param in
         *                source array
         * @param inpos
         *                position in source array
         * @param out
         *                output array
         * @param outpos
         *                position in output array
         * @param bit
         *                number of bits to use per long
         */
        public static void fastpackwithoutmask(final long[] in, final int inpos,
                final long[] out, final int outpos, final int bit) {
                switch (bit) {
                case 0:
                        fastpackwithoutmask0(in, inpos, out, outpos);
                        break;
                case 1:
                        fastpackwithoutmask1(in, inpos, out, outpos);
                        break;
                case 2:
                        fastpackwithoutmask2(in, inpos, out, outpos);
                        break;
                case 3:
                        fastpackwithoutmask3(in, inpos, out, outpos);
                        break;
                case 4:
                        fastpackwithoutmask4(in, inpos, out, outpos);
                        break;
                case 5:
                        fastpackwithoutmask5(in, inpos, out, outpos);
                        break;
                case 6:
                        fastpackwithoutmask6(in, inpos, out, outpos);
                        break;
                case 7:
                        fastpackwithoutmask7(in, inpos, out, outpos);
                        break;
                case 8:
                        fastpackwithoutmask8(in, inpos, out, outpos);
                        break;
                case 9:
                        fastpackwithoutmask9(in, inpos, out, outpos);
                        break;
                case 10:
                        fastpackwithoutmask10(in, inpos, out, outpos);
                        break;
                case 11:
                        fastpackwithoutmask11(in, inpos, out, outpos);
                        break;
                case 12:
                        fastpackwithoutmask12(in, inpos, out, outpos);
                        break;
                case 13:
                        fastpackwithoutmask13(in, inpos, out, outpos);
                        break;
                case 14:
                        fastpackwithoutmask14(in, inpos, out, outpos);
                        break;
                case 15:
                        fastpackwithoutmask15(in, inpos, out, outpos);
                        break;
                case 16:
                        fastpackwithoutmask16(in, inpos, out, outpos);
                        break;
                case 17:
                        fastpackwithoutmask17(in, inpos, out, outpos);
                        break;
                case 18:
                        fastpackwithoutmask18(in, inpos, out, outpos);
                        break;
                case 19:
                        fastpackwithoutmask19(in, inpos, out, outpos);
                        break;
                case 20:
                        fastpackwithoutmask20(in, inpos, out, outpos);
                        break;
                case 21:
                        fastpackwithoutmask21(in, inpos, out, outpos);
                        break;
                case 22:
                        fastpackwithoutmask22(in, inpos, out, outpos);
                        break;
                case 23:
                        fastpackwithoutmask23(in, inpos, out, outpos);
                        break;
                case 24:
                        fastpackwithoutmask24(in, inpos, out, outpos);
                        break;
                case 25:
                        fastpackwithoutmask25(in, inpos, out, outpos);
                        break;
                case 26:
                        fastpackwithoutmask26(in, inpos, out, outpos);
                        break;
                case 27:
                        fastpackwithoutmask27(in, inpos, out, outpos);
                        break;
                case 28:
                        fastpackwithoutmask28(in, inpos, out, outpos);
                        break;
                case 29:
                        fastpackwithoutmask29(in, inpos, out, outpos);
                        break;
                case 30:
                        fastpackwithoutmask30(in, inpos, out, outpos);
                        break;
                case 31:
                        fastpackwithoutmask31(in, inpos, out, outpos);
                        break;
                case 32:
                        fastpackwithoutmask32(in, inpos, out, outpos);
                        break;
                case 33:
                        fastpackwithoutmask33(in, inpos, out, outpos);
                        break;
                case 34:
                        fastpackwithoutmask34(in, inpos, out, outpos);
                        break;
                case 35:
                        fastpackwithoutmask35(in, inpos, out, outpos);
                        break;
                case 36:
                        fastpackwithoutmask36(in, inpos, out, outpos);
                        break;
                case 37:
                        fastpackwithoutmask37(in, inpos, out, outpos);
                        break;
                case 38:
                        fastpackwithoutmask38(in, inpos, out, outpos);
                        break;
                case 39:
                        fastpackwithoutmask39(in, inpos, out, outpos);
                        break;
                case 40:
                        fastpackwithoutmask40(in, inpos, out, outpos);
                        break;
                case 41:
                        fastpackwithoutmask41(in, inpos, out, outpos);
                        break;
                case 42:
                        fastpackwithoutmask42(in, inpos, out, outpos);
                        break;
                case 43:
                        fastpackwithoutmask43(in, inpos, out, outpos);
                        break;
                case 44:
                        fastpackwithoutmask44(in, inpos, out, outpos);
                        break;
                case 45:
                        fastpackwithoutmask45(in, inpos, out, outpos);
                        break;
                case 46:
                        fastpackwithoutmask46(in, inpos, out, outpos);
                        break;
                case 47:
                        fastpackwithoutmask47(in, inpos, out, outpos);
                        break;
                case 48:
                        fastpackwithoutmask48(in, inpos, out, outpos);
                        break;
                case 49:
                        fastpackwithoutmask49(in, inpos, out, outpos);
                        break;
                case 50:
                        fastpackwithoutmask50(in, inpos, out, outpos);
                        break;
                case 51:
                        fastpackwithoutmask51(in, inpos, out, outpos);
                        break;
                case 52:
                        fastpackwithoutmask52(in, inpos, out, outpos);
                        break;
                case 53:
                        fastpackwithoutmask53(in, inpos, out, outpos);
                        break;
                case 54:
                        fastpackwithoutmask54(in, inpos, out, outpos);
                        break;
                case 55:
                        fastpackwithoutmask55(in, inpos, out, outpos);
                        break;
                case 56:
                        fastpackwithoutmask56(in, inpos, out, outpos);
                        break;
                case 57:
                        fastpackwithoutmask57(in, inpos, out, outpos);
                        break;
                case 58:
                        fastpackwithoutmask58(in, inpos, out, outpos);
                        break;
                case 59:
                        fastpackwithoutmask59(in, inpos, out, outpos);
                        break;
                case 60:
                        fastpackwithoutmask60(in, inpos, out, outpos);
                        break;
                case 61:
                        fastpackwithoutmask61(in, inpos, out, outpos);
                        break;
                case 62:
                        fastpackwithoutmask62(in, inpos, out, outpos);
                        break;
                case 63:
                        fastpackwithoutmask63(in, inpos, out, outpos);
                        break;
                case 64:
                        fastpackwithoutmask64(in, inpos, out, outpos);
                        break;
                default:
                        throw new IllegalArgumentException("Unsupported bit width: " + bit);
                }
        }

        protected static void fastpackwithoutmask0(final long[] in, int inpos,
                final long[] out, int outpos) {
                // nothing
        }

        protected static void fastpackwithoutmask1(final long[] in, int inpos,
                final long[] out, int outpos) {
                out[outpos] = in[inpos] | ((in[1 + inpos]) << 1)
                        | ((in[2 + inpos]) << 2)
                        | ((in[3 + inpos]) << 3)
                        | ((in[4 + inpos]) << 4)
                        | ((in[5 + inpos]) << 5)
                        | ((in[6 + inpos]) << 6)
                        | ((in[7 + inpos]) << 7)
                        | ((in[8 + inpos]) << 8)
                        | ((in[9 + inpos]) << 9)
                        | ((in[10 + inpos]) << 10)
                        | ((in[11 + inpos]) << 11)
                        | ((in[12 + inpos]) << 12)
                        | ((in[13 + inpos]) << 13)
                        | ((in[14 + inpos]) << 14)
                        | ((in[15 + inpos]) << 15)
                        | ((in[16 + inpos]) << 16)
                        | ((in[17 + inpos]) << 17)
                        | ((in[18 + inpos]) << 18)
                        | ((in[19 + inpos]) << 19)
                        | ((in[20 + inpos]) << 20)
                        | ((in[21 + inpos]) << 21)
                        | ((in[22 + inpos]) << 22)
                        | ((in[23 + inpos]) << 23)
                        | ((in[24 + inpos]) << 24)
                        | ((in[25 + inpos]) << 25)
                        | ((in[26 + inpos]) << 26)
                        | ((in[27 + inpos]) << 27)
                        | ((in[28 + inpos]) << 28)
                        | ((in[29 + inpos]) << 29)
                        | ((in[30 + inpos]) << 30)
                        | ((in[31 + inpos]) << 31)
                        | ((in[32 + inpos]) << 32)
                        | ((in[33 + inpos]) << 33)
                        | ((in[34 + inpos]) << 34)
                        | ((in[35 + inpos]) << 35)
                        | ((in[36 + inpos]) << 36)
                        | ((in[37 + inpos]) << 37)
                        | ((in[38 + inpos]) << 38)
                        | ((in[39 + inpos]) << 39)
                        | ((in[40 + inpos]) << 40)
                        | ((in[41 + inpos]) << 41)
                        | ((in[42 + inpos]) << 42)
                        | ((in[43 + inpos]) << 43)
                        | ((in[44 + inpos]) << 44)
                        | ((in[45 + inpos]) << 45)
                        | ((in[46 + inpos]) << 46)
                        | ((in[47 + inpos]) << 47)
                        | ((in[48 + inpos]) << 48)
                        | ((in[49 + inpos]) << 49)
                        | ((in[50 + inpos]) << 50)
                        | ((in[51 + inpos]) << 51)
                        | ((in[52 + inpos]) << 52)
                        | ((in[53 + inpos]) << 53)
                        | ((in[54 + inpos]) << 54)
                        | ((in[55 + inpos]) << 55)
                        | ((in[56 + inpos]) << 56)
                        | ((in[57 + inpos]) << 57)
                        | ((in[58 + inpos]) << 58)
                        | ((in[59 + inpos]) << 59)
                        | ((in[60 + inpos]) << 60)
                        | ((in[61 + inpos]) << 61)
                        | ((in[62 + inpos]) << 62)
                        | ((in[63 + inpos]) << 63);
        }

        protected static void fastpackwithoutmask2(final long[] in, int inpos,
                final long[] out, int outpos) {
                out[outpos] = in[inpos] | ((in[1 + inpos]) << 2)
                        | ((in[2 + inpos]) << 4)
                        | ((in[3 + inpos]) << 6)
                        | ((in[4 + inpos]) << 8)
                        | ((in[5 + inpos]) << 10)
                        | ((in[6 + inpos]) << 12)
                        | ((in[7 + inpos]) << 14)
                        | ((in[8 + inpos]) << 16)
                        | ((in[9 + inpos]) << 18)
                        | ((in[10 + inpos]) << 20)
                        | ((in[11 + inpos]) << 22)
                        | ((in[12 + inpos]) << 24)
                        | ((in[13 + inpos]) << 26)
                        | ((in[14 + inpos]) << 28)
                        | ((in[15 + inpos]) << 30)
                        | ((in[16 + inpos]) << 32)
                        | ((in[17 + inpos]) << 34)
                        | ((in[18 + inpos]) << 36)
                        | ((in[19 + inpos]) << 38)
                        | ((in[20 + inpos]) << 40)
                        | ((in[21 + inpos]) << 42)
                        | ((in[22 + inpos]) << 44)
                        | ((in[23 + inpos]) << 46)
                        | ((in[24 + inpos]) << 48)
                        | ((in[25 + inpos]) << 50)
                        | ((in[26 + inpos]) << 52)
                        | ((in[27 + inpos]) << 54)
                        | ((in[28 + inpos]) << 56)
                        | ((in[29 + inpos]) << 58)
                        | ((in[30 + inpos]) << 60)
                        | ((in[31 + inpos]) << 62);
                out[1 + outpos] = in[32 + inpos]
                        | ((in[33 + inpos]) << 2)
                        | ((in[34 + inpos]) << 4)
                        | ((in[35 + inpos]) << 6)
                        | ((in[36 + inpos]) << 8)
                        | ((in[37 + inpos]) << 10)
                        | ((in[38 + inpos]) << 12)
                        | ((in[39 + inpos]) << 14)
                        | ((in[40 + inpos]) << 16)
                        | ((in[41 + inpos]) << 18)
                        | ((in[42 + inpos]) << 20)
                        | ((in[43 + inpos]) << 22)
                        | ((in[44 + inpos]) << 24)
                        | ((in[45 + inpos]) << 26)
                        | ((in[46 + inpos]) << 28)
                        | ((in[47 + inpos]) << 30)
                        | ((in[48 + inpos]) << 32)
                        | ((in[49 + inpos]) << 34)
                        | ((in[50 + inpos]) << 36)
                        | ((in[51 + inpos]) << 38)
                        | ((in[52 + inpos]) << 40)
                        | ((in[53 + inpos]) << 42)
                        | ((in[54 + inpos]) << 44)
                        | ((in[55 + inpos]) << 46)
                        | ((in[56 + inpos]) << 48)
                        | ((in[57 + inpos]) << 50)
                        | ((in[58 + inpos]) << 52)
                        | ((in[59 + inpos]) << 54)
                        | ((in[60 + inpos]) << 56)
                        | ((in[61 + inpos]) << 58)
                        | ((in[62 + inpos]) << 60)
                        | ((in[63 + inpos]) << 62);
        }

        protected static void fastpackwithoutmask3(final long[] in, int inpos,
                final long[] out, int outpos) {
                out[outpos] = in[inpos] | ((in[1 + inpos]) << 3)
                        | ((in[2 + inpos]) << 6)
                        | ((in[3 + inpos]) << 9)
                        | ((in[4 + inpos]) << 12)
                        | ((in[5 + inpos]) << 15)
                        | ((in[6 + inpos]) << 18)
                        | ((in[7 + inpos]) << 21)
                        | ((in[8 + inpos]) << 24)
                        | ((in[9 + inpos]) << 27)
                        | ((in[10 + inpos]) << 30)
                        | ((in[11 + inpos]) << 33)
                        | ((in[12 + inpos]) << 36)
                        | ((in[13 + inpos]) << 39)
                        | ((in[14 + inpos]) << 42)
                        | ((in[15 + inpos]) << 45)
                        | ((in[16 + inpos]) << 48)
                        | ((in[17 + inpos]) << 51)
                        | ((in[18 + inpos]) << 54)
                        | ((in[19 + inpos]) << 57)
                        | ((in[20 + inpos]) << 60)
                        | ((in[21 + inpos]) << 63);
                out[1 + outpos] = ((in[21 + inpos]) >>> (3 - 2))
                        | ((in[22 + inpos]) << 2)
                        | ((in[23 + inpos]) << 5)
                        | ((in[24 + inpos]) << 8)
                        | ((in[25 + inpos]) << 11)
                        | ((in[26 + inpos]) << 14)
                        | ((in[27 + inpos]) << 17)
                        | ((in[28 + inpos]) << 20)
                        | ((in[29 + inpos]) << 23)
                        | ((in[30 + inpos]) << 26)
                        | ((in[31 + inpos]) << 29)
                        | ((in[32 + inpos]) << 32)
                        | ((in[33 + inpos]) << 35)
                        | ((in[34 + inpos]) << 38)
                        | ((in[35 + inpos]) << 41)
                        | ((in[36 + inpos]) << 44)
                        | ((in[37 + inpos]) << 47)
                        | ((in[38 + inpos]) << 50)
                        | ((in[39 + inpos]) << 53)
                        | ((in[40 + inpos]) << 56)
                        | ((in[41 + inpos]) << 59)
                        | ((in[42 + inpos]) << 62);
                out[2 + outpos] = ((in[42 + inpos]) >>> (3 - 1))
                        | ((in[43 + inpos]) << 1)
                        | ((in[44 + inpos]) << 4)
                        | ((in[45 + inpos]) << 7)
                        | ((in[46 + inpos]) << 10)
                        | ((in[47 + inpos]) << 13)
                        | ((in[48 + inpos]) << 16)
                        | ((in[49 + inpos]) << 19)
                        | ((in[50 + inpos]) << 22)
                        | ((in[51 + inpos]) << 25)
                        | ((in[52 + inpos]) << 28)
                        | ((in[53 + inpos]) << 31)
                        | ((in[54 + inpos]) << 34)
                        | ((in[55 + inpos]) << 37)
                        | ((in[56 + inpos]) << 40)
                        | ((in[57 + inpos]) << 43)
                        | ((in[58 + inpos]) << 46)
                        | ((in[59 + inpos]) << 49)
                        | ((in[60 + inpos]) << 52)
                        | ((in[61 + inpos]) << 55)
                        | ((in[62 + inpos]) << 58)
                        | ((in[63 + inpos]) << 61);
        }

        protected static void fastpackwithoutmask4(final long[] in, int inpos,
                final long[] out, int outpos) {
                out[outpos] = in[inpos] | ((in[1 + inpos]) << 4)
                        | ((in[2 + inpos]) << 8)
                        | ((in[3 + inpos]) << 12)
                        | ((in[4 + inpos]) << 16)
                        | ((in[5 + inpos]) << 20)
                        | ((in[6 + inpos]) << 24)
                        | ((in[7 + inpos]) << 28)
                        | ((in[8 + inpos]) << 32)
                        | ((in[9 + inpos]) << 36)
                        | ((in[10 + inpos]) << 40)
                        | ((in[11 + inpos]) << 44)
                        | ((in[12 + inpos]) << 48)
                        | ((in[13 + inpos]) << 52)
                        | ((in[14 + inpos]) << 56)
                        | ((in[15 + inpos]) << 60);
                out[1 + outpos] = in[16 + inpos]
                        | ((in[17 + inpos]) << 4)
                        | ((in[18 + inpos]) << 8)
                        | ((in[19 + inpos]) << 12)
                        | ((in[20 + inpos]) << 16)
                        | ((in[21 + inpos]) << 20)
                        | ((in[22 + inpos]) << 24)
                        | ((in[23 + inpos]) << 28)
                        | ((in[24 + inpos]) << 32)
                        | ((in[25 + inpos]) << 36)
                        | ((in[26 + inpos]) << 40)
                        | ((in[27 + inpos]) << 44)
                        | ((in[28 + inpos]) << 48)
                        | ((in[29 + inpos]) << 52)
                        | ((in[30 + inpos]) << 56)
                        | ((in[31 + inpos]) << 60);
                out[2 + outpos] = in[32 + inpos]
                        | ((in[33 + inpos]) << 4)
                        | ((in[34 + inpos]) << 8)
                        | ((in[35 + inpos]) << 12)
                        | ((in[36 + inpos]) << 16)
                        | ((in[37 + inpos]) << 20)
                        | ((in[38 + inpos]) << 24)
                        | ((in[39 + inpos]) << 28)
                        | ((in[40 + inpos]) << 32)
                        | ((in[41 + inpos]) << 36)
                        | ((in[42 + inpos]) << 40)
                        | ((in[43 + inpos]) << 44)
                        | ((in[44 + inpos]) << 48)
                        | ((in[45 + inpos]) << 52)
                        | ((in[46 + inpos]) << 56)
                        | ((in[47 + inpos]) << 60);
                out[3 + outpos] = in[48 + inpos]
                        | ((in[49 + inpos]) << 4)
                        | ((in[50 + inpos]) << 8)
                        | ((in[51 + inpos]) << 12)
                        | ((in[52 + inpos]) << 16)
                        | ((in[53 + inpos]) << 20)
                        | ((in[54 + inpos]) << 24)
                        | ((in[55 + inpos]) << 28)
                        | ((in[56 + inpos]) << 32)
                        | ((in[57 + inpos]) << 36)
                        | ((in[58 + inpos]) << 40)
                        | ((in[59 + inpos]) << 44)
                        | ((in[60 + inpos]) << 48)
                        | ((in[61 + inpos]) << 52)
                        | ((in[62 + inpos]) << 56)
                        | ((in[63 + inpos]) << 60);
        }

        protected static void fastpackwithoutmask5(final long[] in, int inpos,
                final long[] out, int outpos) {
                out[outpos] = in[inpos] | ((in[1 + inpos]) << 5)
                        | ((in[2 + inpos]) << 10)
                        | ((in[3 + inpos]) << 15)
                        | ((in[4 + inpos]) << 20)
                        | ((in[5 + inpos]) << 25)
                        | ((in[6 + inpos]) << 30)
                        | ((in[7 + inpos]) << 35)
                        | ((in[8 + inpos]) << 40)
                        | ((in[9 + inpos]) << 45)
                        | ((in[10 + inpos]) << 50)
                        | ((in[11 + inpos]) << 55)
                        | ((in[12 + inpos]) << 60);
                out[1 + outpos] = ((in[12 + inpos]) >>> (5 - 1))
                        | ((in[13 + inpos]) << 1)
                        | ((in[14 + inpos]) << 6)
                        | ((in[15 + inpos]) << 11)
                        | ((in[16 + inpos]) << 16)
                        | ((in[17 + inpos]) << 21)
                        | ((in[18 + inpos]) << 26)
                        | ((in[19 + inpos]) << 31)
                        | ((in[20 + inpos]) << 36)
                        | ((in[21 + inpos]) << 41)
                        | ((in[22 + inpos]) << 46)
                        | ((in[23 + inpos]) << 51)
                        | ((in[24 + inpos]) << 56)
                        | ((in[25 + inpos]) << 61);
                out[2 + outpos] = ((in[25 + inpos]) >>> (5 - 2))
                        | ((in[26 + inpos]) << 2)
                        | ((in[27 + inpos]) << 7)
                        | ((in[28 + inpos]) << 12)
                        | ((in[29 + inpos]) << 17)
                        | ((in[30 + inpos]) << 22)
                        | ((in[31 + inpos]) << 27)
                        | ((in[32 + inpos]) << 32)
                        | ((in[33 + inpos]) << 37)
                        | ((in[34 + inpos]) << 42)
                        | ((in[35 + inpos]) << 47)
                        | ((in[36 + inpos]) << 52)
                        | ((in[37 + inpos]) << 57)
                        | ((in[38 + inpos]) << 62);
                out[3 + outpos] = ((in[38 + inpos]) >>> (5 - 3))
                        | ((in[39 + inpos]) << 3)
                        | ((in[40 + inpos]) << 8)
                        | ((in[41 + inpos]) << 13)
                        | ((in[42 + inpos]) << 18)
                        | ((in[43 + inpos]) << 23)
                        | ((in[44 + inpos]) << 28)
                        | ((in[45 + inpos]) << 33)
                        | ((in[46 + inpos]) << 38)
                        | ((in[47 + inpos]) << 43)
                        | ((in[48 + inpos]) << 48)
                        | ((in[49 + inpos]) << 53)
                        | ((in[50 + inpos]) << 58)
                        | ((in[51 + inpos]) << 63);
                out[4 + outpos] = ((in[51 + inpos]) >>> (5 - 4))
                        | ((in[52 + inpos]) << 4)
                        | ((in[53 + inpos]) << 9)
                        | ((in[54 + inpos]) << 14)
                        | ((in[55 + inpos]) << 19)
                        | ((in[56 + inpos]) << 24)
                        | ((in[57 + inpos]) << 29)
                        | ((in[58 + inpos]) << 34)
                        | ((in[59 + inpos]) << 39)
                        | ((in[60 + inpos]) << 44)
                        | ((in[61 + inpos]) << 49)
                        | ((in[62 + inpos]) << 54)
                        | ((in[63 + inpos]) << 59);
        }

        protected static void fastpackwithoutmask6(final long[] in, int inpos,
                final long[] out, int outpos) {
                out[outpos] = in[inpos] | ((in[1 + inpos]) << 6)
                        | ((in[2 + inpos]) << 12)
                        | ((in[3 + inpos]) << 18)
                        | ((in[4 + inpos]) << 24)
                        | ((in[5 + inpos]) << 30)
                        | ((in[6 + inpos]) << 36)
                        | ((in[7 + inpos]) << 42)
                        | ((in[8 + inpos]) << 48)
                        | ((in[9 + inpos]) << 54)
                        | ((in[10 + inpos]) << 60);
                out[1 + outpos] = ((in[10 + inpos]) >>> (6 - 2))
                        | ((in[11 + inpos]) << 2)
                        | ((in[12 + inpos]) << 8)
                        | ((in[13 + inpos]) << 14)
                        | ((in[14 + inpos]) << 20)
                        | ((in[15 + inpos]) << 26)
                        | ((in[16 + inpos]) << 32)
                        | ((in[17 + inpos]) << 38)
                        | ((in[18 + inpos]) << 44)
                        | ((in[19 + inpos]) << 50)
                        | ((in[20 + inpos]) << 56)
                        | ((in[21 + inpos]) << 62);
                out[2 + outpos] = ((in[21 + inpos]) >>> (6 - 4))
                        | ((in[22 + inpos]) << 4)
                        | ((in[23 + inpos]) << 10)
                        | ((in[24 + inpos]) << 16)
                        | ((in[25 + inpos]) << 22)
                        | ((in[26 + inpos]) << 28)
                        | ((in[27 + inpos]) << 34)
                        | ((in[28 + inpos]) << 40)
                        | ((in[29 + inpos]) << 46)
                        | ((in[30 + inpos]) << 52)
                        | ((in[31 + inpos]) << 58);
                out[3 + outpos] = in[32 + inpos]
                        | ((in[33 + inpos]) << 6)
                        | ((in[34 + inpos]) << 12)
                        | ((in[35 + inpos]) << 18)
                        | ((in[36 + inpos]) << 24)
                        | ((in[37 + inpos]) << 30)
                        | ((in[38 + inpos]) << 36)
                        | ((in[39 + inpos]) << 42)
                        | ((in[40 + inpos]) << 48)
                        | ((in[41 + inpos]) << 54)
                        | ((in[42 + inpos]) << 60);
                out[4 + outpos] = ((in[42 + inpos]) >>> (6 - 2))
                        | ((in[43 + inpos]) << 2)
                        | ((in[44 + inpos]) << 8)
                        | ((in[45 + inpos]) << 14)
                        | ((in[46 + inpos]) << 20)
                        | ((in[47 + inpos]) << 26)
                        | ((in[48 + inpos]) << 32)
                        | ((in[49 + inpos]) << 38)
                        | ((in[50 + inpos]) << 44)
                        | ((in[51 + inpos]) << 50)
                        | ((in[52 + inpos]) << 56)
                        | ((in[53 + inpos]) << 62);
                out[5 + outpos] = ((in[53 + inpos]) >>> (6 - 4))
                        | ((in[54 + inpos]) << 4)
                        | ((in[55 + inpos]) << 10)
                        | ((in[56 + inpos]) << 16)
                        | ((in[57 + inpos]) << 22)
                        | ((in[58 + inpos]) << 28)
                        | ((in[59 + inpos]) << 34)
                        | ((in[60 + inpos]) << 40)
                        | ((in[61 + inpos]) << 46)
                        | ((in[62 + inpos]) << 52)
                        | ((in[63 + inpos]) << 58);
        }

        protected static void fastpackwithoutmask7(final long[] in, int inpos,
                final long[] out, int outpos) {
                out[outpos] = in[inpos] | ((in[1 + inpos]) << 7)
                        | ((in[2 + inpos]) << 14)
                        | ((in[3 + inpos]) << 21)
                        | ((in[4 + inpos]) << 28)
                        | ((in[5 + inpos]) << 35)
                        | ((in[6 + inpos]) << 42)
                        | ((in[7 + inpos]) << 49)
                        | ((in[8 + inpos]) << 56)
                        | ((in[9 + inpos]) << 63);
                out[1 + outpos] = ((in[9 + inpos]) >>> (7 - 6))
                        | ((in[10 + inpos]) << 6)
                        | ((in[11 + inpos]) << 13)
                        | ((in[12 + inpos]) << 20)
                        | ((in[13 + inpos]) << 27)
                        | ((in[14 + inpos]) << 34)
                        | ((in[15 + inpos]) << 41)
                        | ((in[16 + inpos]) << 48)
                        | ((in[17 + inpos]) << 55)
                        | ((in[18 + inpos]) << 62);
                out[2 + outpos] = ((in[18 + inpos]) >>> (7 - 5))
                        | ((in[19 + inpos]) << 5)
                        | ((in[20 + inpos]) << 12)
                        | ((in[21 + inpos]) << 19)
                        | ((in[22 + inpos]) << 26)
                        | ((in[23 + inpos]) << 33)
                        | ((in[24 + inpos]) << 40)
                        | ((in[25 + inpos]) << 47)
                        | ((in[26 + inpos]) << 54)
                        | ((in[27 + inpos]) << 61);
                out[3 + outpos] = ((in[27 + inpos]) >>> (7 - 4))
                        | ((in[28 + inpos]) << 4)
                        | ((in[29 + inpos]) << 11)
                        | ((in[30 + inpos]) << 18)
                        | ((in[31 + inpos]) << 25)
                        | ((in[32 + inpos]) << 32)
                        | ((in[33 + inpos]) << 39)
                        | ((in[34 + inpos]) << 46)
                        | ((in[35 + inpos]) << 53)
                        | ((in[36 + inpos]) << 60);
                out[4 + outpos] = ((in[36 + inpos]) >>> (7 - 3))
                        | ((in[37 + inpos]) << 3)
                        | ((in[38 + inpos]) << 10)
                        | ((in[39 + inpos]) << 17)
                        | ((in[40 + inpos]) << 24)
                        | ((in[41 + inpos]) << 31)
                        | ((in[42 + inpos]) << 38)
                        | ((in[43 + inpos]) << 45)
                        | ((in[44 + inpos]) << 52)
                        | ((in[45 + inpos]) << 59);
                out[5 + outpos] = ((in[45 + inpos]) >>> (7 - 2))
                        | ((in[46 + inpos]) << 2)
                        | ((in[47 + inpos]) << 9)
                        | ((in[48 + inpos]) << 16)
                        | ((in[49 + inpos]) << 23)
                        | ((in[50 + inpos]) << 30)
                        | ((in[51 + inpos]) << 37)
                        | ((in[52 + inpos]) << 44)
                        | ((in[53 + inpos]) << 51)
                        | ((in[54 + inpos]) << 58);
                out[6 + outpos] = ((in[54 + inpos]) >>> (7 - 1))
                        | ((in[55 + inpos]) << 1)
                        | ((in[56 + inpos]) << 8)
                        | ((in[57 + inpos]) << 15)
                        | ((in[58 + inpos]) << 22)
                        | ((in[59 + inpos]) << 29)
                        | ((in[60 + inpos]) << 36)
                        | ((in[61 + inpos]) << 43)
                        | ((in[62 + inpos]) << 50)
                        | ((in[63 + inpos]) << 57);
        }

        protected static void fastpackwithoutmask8(final long[] in, int inpos,
                final long[] out, int outpos) {
                out[outpos] = in[inpos] | ((in[1 + inpos]) << 8)
                        | ((in[2 + inpos]) << 16)
                        | ((in[3 + inpos]) << 24)
                        | ((in[4 + inpos]) << 32)
                        | ((in[5 + inpos]) << 40)
                        | ((in[6 + inpos]) << 48)
                        | ((in[7 + inpos]) << 56);
                out[1 + outpos] = in[8 + inpos] | ((in[9 + inpos]) << 8)
                        | ((in[10 + inpos]) << 16)
                        | ((in[11 + inpos]) << 24)
                        | ((in[12 + inpos]) << 32)
                        | ((in[13 + inpos]) << 40)
                        | ((in[14 + inpos]) << 48)
                        | ((in[15 + inpos]) << 56);
                out[2 + outpos] = in[16 + inpos]
                        | ((in[17 + inpos]) << 8)
                        | ((in[18 + inpos]) << 16)
                        | ((in[19 + inpos]) << 24)
                        | ((in[20 + inpos]) << 32)
                        | ((in[21 + inpos]) << 40)
                        | ((in[22 + inpos]) << 48)
                        | ((in[23 + inpos]) << 56);
                out[3 + outpos] = in[24 + inpos]
                        | ((in[25 + inpos]) << 8)
                        | ((in[26 + inpos]) << 16)
                        | ((in[27 + inpos]) << 24)
                        | ((in[28 + inpos]) << 32)
                        | ((in[29 + inpos]) << 40)
                        | ((in[30 + inpos]) << 48)
                        | ((in[31 + inpos]) << 56);
                out[4 + outpos] = in[32 + inpos]
                        | ((in[33 + inpos]) << 8)
                        | ((in[34 + inpos]) << 16)
                        | ((in[35 + inpos]) << 24)
                        | ((in[36 + inpos]) << 32)
                        | ((in[37 + inpos]) << 40)
                        | ((in[38 + inpos]) << 48)
                        | ((in[39 + inpos]) << 56);
                out[5 + outpos] = in[40 + inpos]
                        | ((in[41 + inpos]) << 8)
                        | ((in[42 + inpos]) << 16)
                        | ((in[43 + inpos]) << 24)
                        | ((in[44 + inpos]) << 32)
                        | ((in[45 + inpos]) << 40)
                        | ((in[46 + inpos]) << 48)
                        | ((in[47 + inpos]) << 56);
                out[6 + outpos] = in[48 + inpos]
                        | ((in[49 + inpos]) << 8)
                        | ((in[50 + inpos]) << 16)
                        | ((in[51 + inpos]) << 24)
                        | ((in[52 + inpos]) << 32)
                        | ((in[53 + inpos]) << 40)
                        | ((in[54 + inpos]) << 48)
                        | ((in[55 + inpos]) << 56);
                out[7 + outpos] = in[56 + inpos]
                        | ((in[57 + inpos]) << 8)
                        | ((in[58 + inpos]) << 16)
                        | ((in[59 + inpos]) << 24)
                        | ((in[60 + inpos]) << 32)
                        | ((in[61 + inpos]) << 40)
                        | ((in[62 + inpos]) << 48)
                        | ((in[63 + inpos]) << 56);
        }

        protected static void fastpackwithoutmask9(final long[] in, int inpos,
                final long[] out, int outpos) {
                out[outpos] = in[inpos] | ((in[1 + inpos]) << 9)
                        | ((in[2 + inpos]) << 18)
                        | ((in[3 + inpos]) << 27)
                        | ((in[4 + inpos]) << 36)
                        | ((in[5 + inpos]) << 45)
                        | ((in[6 + inpos]) << 54)
                        | ((in[7 + inpos]) << 63);
                out[1 + outpos] = ((in[7 + inpos]) >>> (9 - 8))
                        | ((in[8 + inpos]) << 8)
                        | ((in[9 + inpos]) << 17)
                        | ((in[10 + inpos]) << 26)
                        | ((in[11 + inpos]) << 35)
                        | ((in[12 + inpos]) << 44)
                        | ((in[13 + inpos]) << 53)
                        | ((in[14 + inpos]) << 62);
                out[2 + outpos] = ((in[14 + inpos]) >>> (9 - 7))
                        | ((in[15 + inpos]) << 7)
                        | ((in[16 + inpos]) << 16)
                        | ((in[17 + inpos]) << 25)
                        | ((in[18 + inpos]) << 34)
                        | ((in[19 + inpos]) << 43)
                        | ((in[20 + inpos]) << 52)
                        | ((in[21 + inpos]) << 61);
                out[3 + outpos] = ((in[21 + inpos]) >>> (9 - 6))
                        | ((in[22 + inpos]) << 6)
                        | ((in[23 + inpos]) << 15)
                        | ((in[24 + inpos]) << 24)
                        | ((in[25 + inpos]) << 33)
                        | ((in[26 + inpos]) << 42)
                        | ((in[27 + inpos]) << 51)
                        | ((in[28 + inpos]) << 60);
                out[4 + outpos] = ((in[28 + inpos]) >>> (9 - 5))
                        | ((in[29 + inpos]) << 5)
                        | ((in[30 + inpos]) << 14)
                        | ((in[31 + inpos]) << 23)
                        | ((in[32 + inpos]) << 32)
                        | ((in[33 + inpos]) << 41)
                        | ((in[34 + inpos]) << 50)
                        | ((in[35 + inpos]) << 59);
                out[5 + outpos] = ((in[35 + inpos]) >>> (9 - 4))
                        | ((in[36 + inpos]) << 4)
                        | ((in[37 + inpos]) << 13)
                        | ((in[38 + inpos]) << 22)
                        | ((in[39 + inpos]) << 31)
                        | ((in[40 + inpos]) << 40)
                        | ((in[41 + inpos]) << 49)
                        | ((in[42 + inpos]) << 58);
                out[6 + outpos] = ((in[42 + inpos]) >>> (9 - 3))
                        | ((in[43 + inpos]) << 3)
                        | ((in[44 + inpos]) << 12)
                        | ((in[45 + inpos]) << 21)
                        | ((in[46 + inpos]) << 30)
                        | ((in[47 + inpos]) << 39)
                        | ((in[48 + inpos]) << 48)
                        | ((in[49 + inpos]) << 57);
                out[7 + outpos] = ((in[49 + inpos]) >>> (9 - 2))
                        | ((in[50 + inpos]) << 2)
                        | ((in[51 + inpos]) << 11)
                        | ((in[52 + inpos]) << 20)
                        | ((in[53 + inpos]) << 29)
                        | ((in[54 + inpos]) << 38)
                        | ((in[55 + inpos]) << 47)
                        | ((in[56 + inpos]) << 56);
                out[8 + outpos] = ((in[56 + inpos]) >>> (9 - 1))
                        | ((in[57 + inpos]) << 1)
                        | ((in[58 + inpos]) << 10)
                        | ((in[59 + inpos]) << 19)
                        | ((in[60 + inpos]) << 28)
                        | ((in[61 + inpos]) << 37)
                        | ((in[62 + inpos]) << 46)
                        | ((in[63 + inpos]) << 55);
        }

        protected static void fastpackwithoutmask10(final long[] in, int inpos,
                final long[] out, int outpos) {
                out[outpos] = in[inpos] | ((in[1 + inpos]) << 10)
                        | ((in[2 + inpos]) << 20)
                        | ((in[3 + inpos]) << 30)
                        | ((in[4 + inpos]) << 40)
                        | ((in[5 + inpos]) << 50)
                        | ((in[6 + inpos]) << 60);
                out[1 + outpos] = ((in[6 + inpos]) >>> (10 - 6))
                        | ((in[7 + inpos]) << 6)
                        | ((in[8 + inpos]) << 16)
                        | ((in[9 + inpos]) << 26)
                        | ((in[10 + inpos]) << 36)
                        | ((in[11 + inpos]) << 46)
                        | ((in[12 + inpos]) << 56);
                out[2 + outpos] = ((in[12 + inpos]) >>> (10 - 2))
                        | ((in[13 + inpos]) << 2)
                        | ((in[14 + inpos]) << 12)
                        | ((in[15 + inpos]) << 22)
                        | ((in[16 + inpos]) << 32)
                        | ((in[17 + inpos]) << 42)
                        | ((in[18 + inpos]) << 52)
                        | ((in[19 + inpos]) << 62);
                out[3 + outpos] = ((in[19 + inpos]) >>> (10 - 8))
                        | ((in[20 + inpos]) << 8)
                        | ((in[21 + inpos]) << 18)
                        | ((in[22 + inpos]) << 28)
                        | ((in[23 + inpos]) << 38)
                        | ((in[24 + inpos]) << 48)
                        | ((in[25 + inpos]) << 58);
                out[4 + outpos] = ((in[25 + inpos]) >>> (10 - 4))
                        | ((in[26 + inpos]) << 4)
                        | ((in[27 + inpos]) << 14)
                        | ((in[28 + inpos]) << 24)
                        | ((in[29 + inpos]) << 34)
                        | ((in[30 + inpos]) << 44)
                        | ((in[31 + inpos]) << 54);
                out[5 + outpos] = in[32 + inpos]
                        | ((in[33 + inpos]) << 10)
                        | ((in[34 + inpos]) << 20)
                        | ((in[35 + inpos]) << 30)
                        | ((in[36 + inpos]) << 40)
                        | ((in[37 + inpos]) << 50)
                        | ((in[38 + inpos]) << 60);
                out[6 + outpos] = ((in[38 + inpos]) >>> (10 - 6))
                        | ((in[39 + inpos]) << 6)
                        | ((in[40 + inpos]) << 16)
                        | ((in[41 + inpos]) << 26)
                        | ((in[42 + inpos]) << 36)
                        | ((in[43 + inpos]) << 46)
                        | ((in[44 + inpos]) << 56);
                out[7 + outpos] = ((in[44 + inpos]) >>> (10 - 2))
                        | ((in[45 + inpos]) << 2)
                        | ((in[46 + inpos]) << 12)
                        | ((in[47 + inpos]) << 22)
                        | ((in[48 + inpos]) << 32)
                        | ((in[49 + inpos]) << 42)
                        | ((in[50 + inpos]) << 52)
                        | ((in[51 + inpos]) << 62);
                out[8 + outpos] = ((in[51 + inpos]) >>> (10 - 8))
                        | ((in[52 + inpos]) << 8)
                        | ((in[53 + inpos]) << 18)
                        | ((in[54 + inpos]) << 28)
                        | ((in[55 + inpos]) << 38)
                        | ((in[56 + inpos]) << 48)
                        | ((in[57 + inpos]) << 58);
                out[9 + outpos] = ((in[57 + inpos]) >>> (10 - 4))
                        | ((in[58 + inpos]) << 4)
                        | ((in[59 + inpos]) << 14)
                        | ((in[60 + inpos]) << 24)
                        | ((in[61 + inpos]) << 34)
                        | ((in[62 + inpos]) << 44)
                        | ((in[63 + inpos]) << 54);
        }

        protected static void fastpackwithoutmask11(final long[] in, int inpos,
                final long[] out, int outpos) {
                out[outpos] = in[inpos] | ((in[1 + inpos]) << 11)
                        | ((in[2 + inpos]) << 22)
                        | ((in[3 + inpos]) << 33)
                        | ((in[4 + inpos]) << 44)
                        | ((in[5 + inpos]) << 55);
                out[1 + outpos] = ((in[5 + inpos]) >>> (11 - 2))
                        | ((in[6 + inpos]) << 2)
                        | ((in[7 + inpos]) << 13)
                        | ((in[8 + inpos]) << 24)
                        | ((in[9 + inpos]) << 35)
                        | ((in[10 + inpos]) << 46)
                        | ((in[11 + inpos]) << 57);
                out[2 + outpos] = ((in[11 + inpos]) >>> (11 - 4))
                        | ((in[12 + inpos]) << 4)
                        | ((in[13 + inpos]) << 15)
                        | ((in[14 + inpos]) << 26)
                        | ((in[15 + inpos]) << 37)
                        | ((in[16 + inpos]) << 48)
                        | ((in[17 + inpos]) << 59);
                out[3 + outpos] = ((in[17 + inpos]) >>> (11 - 6))
                        | ((in[18 + inpos]) << 6)
                        | ((in[19 + inpos]) << 17)
                        | ((in[20 + inpos]) << 28)
                        | ((in[21 + inpos]) << 39)
                        | ((in[22 + inpos]) << 50)
                        | ((in[23 + inpos]) << 61);
                out[4 + outpos] = ((in[23 + inpos]) >>> (11 - 8))
                        | ((in[24 + inpos]) << 8)
                        | ((in[25 + inpos]) << 19)
                        | ((in[26 + inpos]) << 30)
                        | ((in[27 + inpos]) << 41)
                        | ((in[28 + inpos]) << 52)
                        | ((in[29 + inpos]) << 63);
                out[5 + outpos] = ((in[29 + inpos]) >>> (11 - 10))
                        | ((in[30 + inpos]) << 10)
                        | ((in[31 + inpos]) << 21)
                        | ((in[32 + inpos]) << 32)
                        | ((in[33 + inpos]) << 43)
                        | ((in[34 + inpos]) << 54);
                out[6 + outpos] = ((in[34 + inpos]) >>> (11 - 1))
                        | ((in[35 + inpos]) << 1)
                        | ((in[36 + inpos]) << 12)
                        | ((in[37 + inpos]) << 23)
                        | ((in[38 + inpos]) << 34)
                        | ((in[39 + inpos]) << 45)
                        | ((in[40 + inpos]) << 56);
                out[7 + outpos] = ((in[40 + inpos]) >>> (11 - 3))
                        | ((in[41 + inpos]) << 3)
                        | ((in[42 + inpos]) << 14)
                        | ((in[43 + inpos]) << 25)
                        | ((in[44 + inpos]) << 36)
                        | ((in[45 + inpos]) << 47)
                        | ((in[46 + inpos]) << 58);
                out[8 + outpos] = ((in[46 + inpos]) >>> (11 - 5))
                        | ((in[47 + inpos]) << 5)
                        | ((in[48 + inpos]) << 16)
                        | ((in[49 + inpos]) << 27)
                        | ((in[50 + inpos]) << 38)
                        | ((in[51 + inpos]) << 49)
                        | ((in[52 + inpos]) << 60);
                out[9 + outpos] = ((in[52 + inpos]) >>> (11 - 7))
                        | ((in[53 + inpos]) << 7)
                        | ((in[54 + inpos]) << 18)
                        | ((in[55 + inpos]) << 29)
                        | ((in[56 + inpos]) << 40)
                        | ((in[57 + inpos]) << 51)
                        | ((in[58 + inpos]) << 62);
                out[10 + outpos] = ((in[58 + inpos]) >>> (11 - 9))
                        | ((in[59 + inpos]) << 9)
                        | ((in[60 + inpos]) << 20)
                        | ((in[61 + inpos]) << 31)
                        | ((in[62 + inpos]) << 42)
                        | ((in[63 + inpos]) << 53);
        }

        protected static void fastpackwithoutmask12(final long[] in, int inpos,
                final long[] out, int outpos) {
                out[outpos] = in[inpos] | ((in[1 + inpos]) << 12)
                        | ((in[2 + inpos]) << 24)
                        | ((in[3 + inpos]) << 36)
                        | ((in[4 + inpos]) << 48)
                        | ((in[5 + inpos]) << 60);
                out[1 + outpos] = ((in[5 + inpos]) >>> (12 - 8))
                        | ((in[6 + inpos]) << 8)
                        | ((in[7 + inpos]) << 20)
                        | ((in[8 + inpos]) << 32)
                        | ((in[9 + inpos]) << 44)
                        | ((in[10 + inpos]) << 56);
                out[2 + outpos] = ((in[10 + inpos]) >>> (12 - 4))
                        | ((in[11 + inpos]) << 4)
                        | ((in[12 + inpos]) << 16)
                        | ((in[13 + inpos]) << 28)
                        | ((in[14 + inpos]) << 40)
                        | ((in[15 + inpos]) << 52);
                out[3 + outpos] = in[16 + inpos]
                        | ((in[17 + inpos]) << 12)
                        | ((in[18 + inpos]) << 24)
                        | ((in[19 + inpos]) << 36)
                        | ((in[20 + inpos]) << 48)
                        | ((in[21 + inpos]) << 60);
                out[4 + outpos] = ((in[21 + inpos]) >>> (12 - 8))
                        | ((in[22 + inpos]) << 8)
                        | ((in[23 + inpos]) << 20)
                        | ((in[24 + inpos]) << 32)
                        | ((in[25 + inpos]) << 44)
                        | ((in[26 + inpos]) << 56);
                out[5 + outpos] = ((in[26 + inpos]) >>> (12 - 4))
                        | ((in[27 + inpos]) << 4)
                        | ((in[28 + inpos]) << 16)
                        | ((in[29 + inpos]) << 28)
                        | ((in[30 + inpos]) << 40)
                        | ((in[31 + inpos]) << 52);
                out[6 + outpos] = in[32 + inpos]
                        | ((in[33 + inpos]) << 12)
                        | ((in[34 + inpos]) << 24)
                        | ((in[35 + inpos]) << 36)
                        | ((in[36 + inpos]) << 48)
                        | ((in[37 + inpos]) << 60);
                out[7 + outpos] = ((in[37 + inpos]) >>> (12 - 8))
                        | ((in[38 + inpos]) << 8)
                        | ((in[39 + inpos]) << 20)
                        | ((in[40 + inpos]) << 32)
                        | ((in[41 + inpos]) << 44)
                        | ((in[42 + inpos]) << 56);
                out[8 + outpos] = ((in[42 + inpos]) >>> (12 - 4))
                        | ((in[43 + inpos]) << 4)
                        | ((in[44 + inpos]) << 16)
                        | ((in[45 + inpos]) << 28)
                        | ((in[46 + inpos]) << 40)
                        | ((in[47 + inpos]) << 52);
                out[9 + outpos] = in[48 + inpos]
                        | ((in[49 + inpos]) << 12)
                        | ((in[50 + inpos]) << 24)
                        | ((in[51 + inpos]) << 36)
                        | ((in[52 + inpos]) << 48)
                        | ((in[53 + inpos]) << 60);
                out[10 + outpos] = ((in[53 + inpos]) >>> (12 - 8))
                        | ((in[54 + inpos]) << 8)
                        | ((in[55 + inpos]) << 20)
                        | ((in[56 + inpos]) << 32)
                        | ((in[57 + inpos]) << 44)
                        | ((in[58 + inpos]) << 56);
                out[11 + outpos] = ((in[58 + inpos]) >>> (12 - 4))
                        | ((in[59 + inpos]) << 4)
                        | ((in[60 + inpos]) << 16)
                        | ((in[61 + inpos]) << 28)
                        | ((in[62 + inpos]) << 40)
                        | ((in[63 + inpos]) << 52);
        }

        protected static void fastpackwithoutmask13(final long[] in, int inpos,
                final long[] out, int outpos) {
                out[outpos] = in[inpos] | ((in[1 + inpos]) << 13)
                        | ((in[2 + inpos]) << 26)
                        | ((in[3 + inpos]) << 39)
                        | ((in[4 + inpos]) << 52);
                out[1 + outpos] = ((in[4 + inpos]) >>> (13 - 1))
                        | ((in[5 + inpos]) << 1)
                        | ((in[6 + inpos]) << 14)
                        | ((in[7 + inpos]) << 27)
                        | ((in[8 + inpos]) << 40)
                        | ((in[9 + inpos]) << 53);
                out[2 + outpos] = ((in[9 + inpos]) >>> (13 - 2))
                        | ((in[10 + inpos]) << 2)
                        | ((in[11 + inpos]) << 15)
                        | ((in[12 + inpos]) << 28)
                        | ((in[13 + inpos]) << 41)
                        | ((in[14 + inpos]) << 54);
                out[3 + outpos] = ((in[14 + inpos]) >>> (13 - 3))
                        | ((in[15 + inpos]) << 3)
                        | ((in[16 + inpos]) << 16)
                        | ((in[17 + inpos]) << 29)
                        | ((in[18 + inpos]) << 42)
                        | ((in[19 + inpos]) << 55);
                out[4 + outpos] = ((in[19 + inpos]) >>> (13 - 4))
                        | ((in[20 + inpos]) << 4)
                        | ((in[21 + inpos]) << 17)
                        | ((in[22 + inpos]) << 30)
                        | ((in[23 + inpos]) << 43)
                        | ((in[24 + inpos]) << 56);
                out[5 + outpos] = ((in[24 + inpos]) >>> (13 - 5))
                        | ((in[25 + inpos]) << 5)
                        | ((in[26 + inpos]) << 18)
                        | ((in[27 + inpos]) << 31)
                        | ((in[28 + inpos]) << 44)
                        | ((in[29 + inpos]) << 57);
                out[6 + outpos] = ((in[29 + inpos]) >>> (13 - 6))
                        | ((in[30 + inpos]) << 6)
                        | ((in[31 + inpos]) << 19)
                        | ((in[32 + inpos]) << 32)
                        | ((in[33 + inpos]) << 45)
                        | ((in[34 + inpos]) << 58);
                out[7 + outpos] = ((in[34 + inpos]) >>> (13 - 7))
                        | ((in[35 + inpos]) << 7)
                        | ((in[36 + inpos]) << 20)
                        | ((in[37 + inpos]) << 33)
                        | ((in[38 + inpos]) << 46)
                        | ((in[39 + inpos]) << 59);
                out[8 + outpos] = ((in[39 + inpos]) >>> (13 - 8))
                        | ((in[40 + inpos]) << 8)
                        | ((in[41 + inpos]) << 21)
                        | ((in[42 + inpos]) << 34)
                        | ((in[43 + inpos]) << 47)
                        | ((in[44 + inpos]) << 60);
                out[9 + outpos] = ((in[44 + inpos]) >>> (13 - 9))
                        | ((in[45 + inpos]) << 9)
                        | ((in[46 + inpos]) << 22)
                        | ((in[47 + inpos]) << 35)
                        | ((in[48 + inpos]) << 48)
                        | ((in[49 + inpos]) << 61);
                out[10 + outpos] = ((in[49 + inpos]) >>> (13 - 10))
                        | ((in[50 + inpos]) << 10)
                        | ((in[51 + inpos]) << 23)
                        | ((in[52 + inpos]) << 36)
                        | ((in[53 + inpos]) << 49)
                        | ((in[54 + inpos]) << 62);
                out[11 + outpos] = ((in[54 + inpos]) >>> (13 - 11))
                        | ((in[55 + inpos]) << 11)
                        | ((in[56 + inpos]) << 24)
                        | ((in[57 + inpos]) << 37)
                        | ((in[58 + inpos]) << 50)
                        | ((in[59 + inpos]) << 63);
                out[12 + outpos] = ((in[59 + inpos]) >>> (13 - 12))
                        | ((in[60 + inpos]) << 12)
                        | ((in[61 + inpos]) << 25)
                        | ((in[62 + inpos]) << 38)
                        | ((in[63 + inpos]) << 51);
        }

        protected static void fastpackwithoutmask14(final long[] in, int inpos,
                final long[] out, int outpos) {
                out[outpos] = in[inpos] | ((in[1 + inpos]) << 14)
                        | ((in[2 + inpos]) << 28)
                        | ((in[3 + inpos]) << 42)
                        | ((in[4 + inpos]) << 56);
                out[1 + outpos] = ((in[4 + inpos]) >>> (14 - 6))
                        | ((in[5 + inpos]) << 6)
                        | ((in[6 + inpos]) << 20)
                        | ((in[7 + inpos]) << 34)
                        | ((in[8 + inpos]) << 48)
                        | ((in[9 + inpos]) << 62);
                out[2 + outpos] = ((in[9 + inpos]) >>> (14 - 12))
                        | ((in[10 + inpos]) << 12)
                        | ((in[11 + inpos]) << 26)
                        | ((in[12 + inpos]) << 40)
                        | ((in[13 + inpos]) << 54);
                out[3 + outpos] = ((in[13 + inpos]) >>> (14 - 4))
                        | ((in[14 + inpos]) << 4)
                        | ((in[15 + inpos]) << 18)
                        | ((in[16 + inpos]) << 32)
                        | ((in[17 + inpos]) << 46)
                        | ((in[18 + inpos]) << 60);
                out[4 + outpos] = ((in[18 + inpos]) >>> (14 - 10))
                        | ((in[19 + inpos]) << 10)
                        | ((in[20 + inpos]) << 24)
                        | ((in[21 + inpos]) << 38)
                        | ((in[22 + inpos]) << 52);
                out[5 + outpos] = ((in[22 + inpos]) >>> (14 - 2))
                        | ((in[23 + inpos]) << 2)
                        | ((in[24 + inpos]) << 16)
                        | ((in[25 + inpos]) << 30)
                        | ((in[26 + inpos]) << 44)
                        | ((in[27 + inpos]) << 58);
                out[6 + outpos] = ((in[27 + inpos]) >>> (14 - 8))
                        | ((in[28 + inpos]) << 8)
                        | ((in[29 + inpos]) << 22)
                        | ((in[30 + inpos]) << 36)
                        | ((in[31 + inpos]) << 50);
                out[7 + outpos] = in[32 + inpos]
                        | ((in[33 + inpos]) << 14)
                        | ((in[34 + inpos]) << 28)
                        | ((in[35 + inpos]) << 42)
                        | ((in[36 + inpos]) << 56);
                out[8 + outpos] = ((in[36 + inpos]) >>> (14 - 6))
                        | ((in[37 + inpos]) << 6)
                        | ((in[38 + inpos]) << 20)
                        | ((in[39 + inpos]) << 34)
                        | ((in[40 + inpos]) << 48)
                        | ((in[41 + inpos]) << 62);
                out[9 + outpos] = ((in[41 + inpos]) >>> (14 - 12))
                        | ((in[42 + inpos]) << 12)
                        | ((in[43 + inpos]) << 26)
                        | ((in[44 + inpos]) << 40)
                        | ((in[45 + inpos]) << 54);
                out[10 + outpos] = ((in[45 + inpos]) >>> (14 - 4))
                        | ((in[46 + inpos]) << 4)
                        | ((in[47 + inpos]) << 18)
                        | ((in[48 + inpos]) << 32)
                        | ((in[49 + inpos]) << 46)
                        | ((in[50 + inpos]) << 60);
                out[11 + outpos] = ((in[50 + inpos]) >>> (14 - 10))
                        | ((in[51 + inpos]) << 10)
                        | ((in[52 + inpos]) << 24)
                        | ((in[53 + inpos]) << 38)
                        | ((in[54 + inpos]) << 52);
                out[12 + outpos] = ((in[54 + inpos]) >>> (14 - 2))
                        | ((in[55 + inpos]) << 2)
                        | ((in[56 + inpos]) << 16)
                        | ((in[57 + inpos]) << 30)
                        | ((in[58 + inpos]) << 44)
                        | ((in[59 + inpos]) << 58);
                out[13 + outpos] = ((in[59 + inpos]) >>> (14 - 8))
                        | ((in[60 + inpos]) << 8)
                        | ((in[61 + inpos]) << 22)
                        | ((in[62 + inpos]) << 36)
                        | ((in[63 + inpos]) << 50);
        }

        protected static void fastpackwithoutmask15(final long[] in, int inpos,
                final long[] out, int outpos) {
                out[outpos] = in[inpos] | ((in[1 + inpos]) << 15)
                        | ((in[2 + inpos]) << 30)
                        | ((in[3 + inpos]) << 45)
                        | ((in[4 + inpos]) << 60);
                out[1 + outpos] = ((in[4 + inpos]) >>> (15 - 11))
                        | ((in[5 + inpos]) << 11)
                        | ((in[6 + inpos]) << 26)
                        | ((in[7 + inpos]) << 41)
                        | ((in[8 + inpos]) << 56);
                out[2 + outpos] = ((in[8 + inpos]) >>> (15 - 7))
                        | ((in[9 + inpos]) << 7)
                        | ((in[10 + inpos]) << 22)
                        | ((in[11 + inpos]) << 37)
                        | ((in[12 + inpos]) << 52);
                out[3 + outpos] = ((in[12 + inpos]) >>> (15 - 3))
                        | ((in[13 + inpos]) << 3)
                        | ((in[14 + inpos]) << 18)
                        | ((in[15 + inpos]) << 33)
                        | ((in[16 + inpos]) << 48)
                        | ((in[17 + inpos]) << 63);
                out[4 + outpos] = ((in[17 + inpos]) >>> (15 - 14))
                        | ((in[18 + inpos]) << 14)
                        | ((in[19 + inpos]) << 29)
                        | ((in[20 + inpos]) << 44)
                        | ((in[21 + inpos]) << 59);
                out[5 + outpos] = ((in[21 + inpos]) >>> (15 - 10))
                        | ((in[22 + inpos]) << 10)
                        | ((in[23 + inpos]) << 25)
                        | ((in[24 + inpos]) << 40)
                        | ((in[25 + inpos]) << 55);
                out[6 + outpos] = ((in[25 + inpos]) >>> (15 - 6))
                        | ((in[26 + inpos]) << 6)
                        | ((in[27 + inpos]) << 21)
                        | ((in[28 + inpos]) << 36)
                        | ((in[29 + inpos]) << 51);
                out[7 + outpos] = ((in[29 + inpos]) >>> (15 - 2))
                        | ((in[30 + inpos]) << 2)
                        | ((in[31 + inpos]) << 17)
                        | ((in[32 + inpos]) << 32)
                        | ((in[33 + inpos]) << 47)
                        | ((in[34 + inpos]) << 62);
                out[8 + outpos] = ((in[34 + inpos]) >>> (15 - 13))
                        | ((in[35 + inpos]) << 13)
                        | ((in[36 + inpos]) << 28)
                        | ((in[37 + inpos]) << 43)
                        | ((in[38 + inpos]) << 58);
                out[9 + outpos] = ((in[38 + inpos]) >>> (15 - 9))
                        | ((in[39 + inpos]) << 9)
                        | ((in[40 + inpos]) << 24)
                        | ((in[41 + inpos]) << 39)
                        | ((in[42 + inpos]) << 54);
                out[10 + outpos] = ((in[42 + inpos]) >>> (15 - 5))
                        | ((in[43 + inpos]) << 5)
                        | ((in[44 + inpos]) << 20)
                        | ((in[45 + inpos]) << 35)
                        | ((in[46 + inpos]) << 50);
                out[11 + outpos] = ((in[46 + inpos]) >>> (15 - 1))
                        | ((in[47 + inpos]) << 1)
                        | ((in[48 + inpos]) << 16)
                        | ((in[49 + inpos]) << 31)
                        | ((in[50 + inpos]) << 46)
                        | ((in[51 + inpos]) << 61);
                out[12 + outpos] = ((in[51 + inpos]) >>> (15 - 12))
                        | ((in[52 + inpos]) << 12)
                        | ((in[53 + inpos]) << 27)
                        | ((in[54 + inpos]) << 42)
                        | ((in[55 + inpos]) << 57);
                out[13 + outpos] = ((in[55 + inpos]) >>> (15 - 8))
                        | ((in[56 + inpos]) << 8)
                        | ((in[57 + inpos]) << 23)
                        | ((in[58 + inpos]) << 38)
                        | ((in[59 + inpos]) << 53);
                out[14 + outpos] = ((in[59 + inpos]) >>> (15 - 4))
                        | ((in[60 + inpos]) << 4)
                        | ((in[61 + inpos]) << 19)
                        | ((in[62 + inpos]) << 34)
                        | ((in[63 + inpos]) << 49);
        }

        protected static void fastpackwithoutmask16(final long[] in, int inpos,
                final long[] out, int outpos) {
                out[outpos] = in[inpos] | ((in[1 + inpos]) << 16)
                        | ((in[2 + inpos]) << 32)
                        | ((in[3 + inpos]) << 48);
                out[1 + outpos] = in[4 + inpos]
                        | ((in[5 + inpos]) << 16)
                        | ((in[6 + inpos]) << 32)
                        | ((in[7 + inpos]) << 48);
                out[2 + outpos] = in[8 + inpos]
                        | ((in[9 + inpos]) << 16)
                        | ((in[10 + inpos]) << 32)
                        | ((in[11 + inpos]) << 48);
                out[3 + outpos] = in[12 + inpos]
                        | ((in[13 + inpos]) << 16)
                        | ((in[14 + inpos]) << 32)
                        | ((in[15 + inpos]) << 48);
                out[4 + outpos] = in[16 + inpos]
                        | ((in[17 + inpos]) << 16)
                        | ((in[18 + inpos]) << 32)
                        | ((in[19 + inpos]) << 48);
                out[5 + outpos] = in[20 + inpos]
                        | ((in[21 + inpos]) << 16)
                        | ((in[22 + inpos]) << 32)
                        | ((in[23 + inpos]) << 48);
                out[6 + outpos] = in[24 + inpos]
                        | ((in[25 + inpos]) << 16)
                        | ((in[26 + inpos]) << 32)
                        | ((in[27 + inpos]) << 48);
                out[7 + outpos] = in[28 + inpos]
                        | ((in[29 + inpos]) << 16)
                        | ((in[30 + inpos]) << 32)
                        | ((in[31 + inpos]) << 48);
                out[8 + outpos] = in[32 + inpos]
                        | ((in[33 + inpos]) << 16)
                        | ((in[34 + inpos]) << 32)
                        | ((in[35 + inpos]) << 48);
                out[9 + outpos] = in[36 + inpos]
                        | ((in[37 + inpos]) << 16)
                        | ((in[38 + inpos]) << 32)
                        | ((in[39 + inpos]) << 48);
                out[10 + outpos] = in[40 + inpos]
                        | ((in[41 + inpos]) << 16)
                        | ((in[42 + inpos]) << 32)
                        | ((in[43 + inpos]) << 48);
                out[11 + outpos] = in[44 + inpos]
                        | ((in[45 + inpos]) << 16)
                        | ((in[46 + inpos]) << 32)
                        | ((in[47 + inpos]) << 48);
                out[12 + outpos] = in[48 + inpos]
                        | ((in[49 + inpos]) << 16)
                        | ((in[50 + inpos]) << 32)
                        | ((in[51 + inpos]) << 48);
                out[13 + outpos] = in[52 + inpos]
                        | ((in[53 + inpos]) << 16)
                        | ((in[54 + inpos]) << 32)
                        | ((in[55 + inpos]) << 48);
                out[14 + outpos] = in[56 + inpos]
                        | ((in[57 + inpos]) << 16)
                        | ((in[58 + inpos]) << 32)
                        | ((in[59 + inpos]) << 48);
                out[15 + outpos] = in[60 + inpos]
                        | ((in[61 + inpos]) << 16)
                        | ((in[62 + inpos]) << 32)
                        | ((in[63 + inpos]) << 48);
        }

        protected static void fastpackwithoutmask17(final long[] in, int inpos,
                final long[] out, int outpos) {
                out[outpos] = in[inpos] | ((in[1 + inpos]) << 17)
                        | ((in[2 + inpos]) << 34)
                        | ((in[3 + inpos]) << 51);
                out[1 + outpos] = ((in[3 + inpos]) >>> (17 - 4))
                        | ((in[4 + inpos]) << 4)
                        | ((in[5 + inpos]) << 21)
                        | ((in[6 + inpos]) << 38)
                        | ((in[7 + inpos]) << 55);
                out[2 + outpos] = ((in[7 + inpos]) >>> (17 - 8))
                        | ((in[8 + inpos]) << 8)
                        | ((in[9 + inpos]) << 25)
                        | ((in[10 + inpos]) << 42)
                        | ((in[11 + inpos]) << 59);
                out[3 + outpos] = ((in[11 + inpos]) >>> (17 - 12))
                        | ((in[12 + inpos]) << 12)
                        | ((in[13 + inpos]) << 29)
                        | ((in[14 + inpos]) << 46)
                        | ((in[15 + inpos]) << 63);
                out[4 + outpos] = ((in[15 + inpos]) >>> (17 - 16))
                        | ((in[16 + inpos]) << 16)
                        | ((in[17 + inpos]) << 33)
                        | ((in[18 + inpos]) << 50);
                out[5 + outpos] = ((in[18 + inpos]) >>> (17 - 3))
                        | ((in[19 + inpos]) << 3)
                        | ((in[20 + inpos]) << 20)
                        | ((in[21 + inpos]) << 37)
                        | ((in[22 + inpos]) << 54);
                out[6 + outpos] = ((in[22 + inpos]) >>> (17 - 7))
                        | ((in[23 + inpos]) << 7)
                        | ((in[24 + inpos]) << 24)
                        | ((in[25 + inpos]) << 41)
                        | ((in[26 + inpos]) << 58);
                out[7 + outpos] = ((in[26 + inpos]) >>> (17 - 11))
                        | ((in[27 + inpos]) << 11)
                        | ((in[28 + inpos]) << 28)
                        | ((in[29 + inpos]) << 45)
                        | ((in[30 + inpos]) << 62);
                out[8 + outpos] = ((in[30 + inpos]) >>> (17 - 15))
                        | ((in[31 + inpos]) << 15)
                        | ((in[32 + inpos]) << 32)
                        | ((in[33 + inpos]) << 49);
                out[9 + outpos] = ((in[33 + inpos]) >>> (17 - 2))
                        | ((in[34 + inpos]) << 2)
                        | ((in[35 + inpos]) << 19)
                        | ((in[36 + inpos]) << 36)
                        | ((in[37 + inpos]) << 53);
                out[10 + outpos] = ((in[37 + inpos]) >>> (17 - 6))
                        | ((in[38 + inpos]) << 6)
                        | ((in[39 + inpos]) << 23)
                        | ((in[40 + inpos]) << 40)
                        | ((in[41 + inpos]) << 57);
                out[11 + outpos] = ((in[41 + inpos]) >>> (17 - 10))
                        | ((in[42 + inpos]) << 10)
                        | ((in[43 + inpos]) << 27)
                        | ((in[44 + inpos]) << 44)
                        | ((in[45 + inpos]) << 61);
                out[12 + outpos] = ((in[45 + inpos]) >>> (17 - 14))
                        | ((in[46 + inpos]) << 14)
                        | ((in[47 + inpos]) << 31)
                        | ((in[48 + inpos]) << 48);
                out[13 + outpos] = ((in[48 + inpos]) >>> (17 - 1))
                        | ((in[49 + inpos]) << 1)
                        | ((in[50 + inpos]) << 18)
                        | ((in[51 + inpos]) << 35)
                        | ((in[52 + inpos]) << 52);
                out[14 + outpos] = ((in[52 + inpos]) >>> (17 - 5))
                        | ((in[53 + inpos]) << 5)
                        | ((in[54 + inpos]) << 22)
                        | ((in[55 + inpos]) << 39)
                        | ((in[56 + inpos]) << 56);
                out[15 + outpos] = ((in[56 + inpos]) >>> (17 - 9))
                        | ((in[57 + inpos]) << 9)
                        | ((in[58 + inpos]) << 26)
                        | ((in[59 + inpos]) << 43)
                        | ((in[60 + inpos]) << 60);
                out[16 + outpos] = ((in[60 + inpos]) >>> (17 - 13))
                        | ((in[61 + inpos]) << 13)
                        | ((in[62 + inpos]) << 30)
                        | ((in[63 + inpos]) << 47);
        }

        protected static void fastpackwithoutmask18(final long[] in, int inpos,
                final long[] out, int outpos) {
                out[outpos] = in[inpos] | ((in[1 + inpos]) << 18)
                        | ((in[2 + inpos]) << 36)
                        | ((in[3 + inpos]) << 54);
                out[1 + outpos] = ((in[3 + inpos]) >>> (18 - 8))
                        | ((in[4 + inpos]) << 8)
                        | ((in[5 + inpos]) << 26)
                        | ((in[6 + inpos]) << 44)
                        | ((in[7 + inpos]) << 62);
                out[2 + outpos] = ((in[7 + inpos]) >>> (18 - 16))
                        | ((in[8 + inpos]) << 16)
                        | ((in[9 + inpos]) << 34)
                        | ((in[10 + inpos]) << 52);
                out[3 + outpos] = ((in[10 + inpos]) >>> (18 - 6))
                        | ((in[11 + inpos]) << 6)
                        | ((in[12 + inpos]) << 24)
                        | ((in[13 + inpos]) << 42)
                        | ((in[14 + inpos]) << 60);
                out[4 + outpos] = ((in[14 + inpos]) >>> (18 - 14))
                        | ((in[15 + inpos]) << 14)
                        | ((in[16 + inpos]) << 32)
                        | ((in[17 + inpos]) << 50);
                out[5 + outpos] = ((in[17 + inpos]) >>> (18 - 4))
                        | ((in[18 + inpos]) << 4)
                        | ((in[19 + inpos]) << 22)
                        | ((in[20 + inpos]) << 40)
                        | ((in[21 + inpos]) << 58);
                out[6 + outpos] = ((in[21 + inpos]) >>> (18 - 12))
                        | ((in[22 + inpos]) << 12)
                        | ((in[23 + inpos]) << 30)
                        | ((in[24 + inpos]) << 48);
                out[7 + outpos] = ((in[24 + inpos]) >>> (18 - 2))
                        | ((in[25 + inpos]) << 2)
                        | ((in[26 + inpos]) << 20)
                        | ((in[27 + inpos]) << 38)
                        | ((in[28 + inpos]) << 56);
                out[8 + outpos] = ((in[28 + inpos]) >>> (18 - 10))
                        | ((in[29 + inpos]) << 10)
                        | ((in[30 + inpos]) << 28)
                        | ((in[31 + inpos]) << 46);
                out[9 + outpos] = in[32 + inpos]
                        | ((in[33 + inpos]) << 18)
                        | ((in[34 + inpos]) << 36)
                        | ((in[35 + inpos]) << 54);
                out[10 + outpos] = ((in[35 + inpos]) >>> (18 - 8))
                        | ((in[36 + inpos]) << 8)
                        | ((in[37 + inpos]) << 26)
                        | ((in[38 + inpos]) << 44)
                        | ((in[39 + inpos]) << 62);
                out[11 + outpos] = ((in[39 + inpos]) >>> (18 - 16))
                        | ((in[40 + inpos]) << 16)
                        | ((in[41 + inpos]) << 34)
                        | ((in[42 + inpos]) << 52);
                out[12 + outpos] = ((in[42 + inpos]) >>> (18 - 6))
                        | ((in[43 + inpos]) << 6)
                        | ((in[44 + inpos]) << 24)
                        | ((in[45 + inpos]) << 42)
                        | ((in[46 + inpos]) << 60);
                out[13 + outpos] = ((in[46 + inpos]) >>> (18 - 14))
                        | ((in[47 + inpos]) << 14)
                        | ((in[48 + inpos]) << 32)
                        | ((in[49 + inpos]) << 50);
                out[14 + outpos] = ((in[49 + inpos]) >>> (18 - 4))
                        | ((in[50 + inpos]) << 4)
                        | ((in[51 + inpos]) << 22)
                        | ((in[52 + inpos]) << 40)
                        | ((in[53 + inpos]) << 58);
                out[15 + outpos] = ((in[53 + inpos]) >>> (18 - 12))
                        | ((in[54 + inpos]) << 12)
                        | ((in[55 + inpos]) << 30)
                        | ((in[56 + inpos]) << 48);
                out[16 + outpos] = ((in[56 + inpos]) >>> (18 - 2))
                        | ((in[57 + inpos]) << 2)
                        | ((in[58 + inpos]) << 20)
                        | ((in[59 + inpos]) << 38)
                        | ((in[60 + inpos]) << 56);
                out[17 + outpos] = ((in[60 + inpos]) >>> (18 - 10))
                        | ((in[61 + inpos]) << 10)
                        | ((in[62 + inpos]) << 28)
                        | ((in[63 + inpos]) << 46);
        }

        protected static void fastpackwithoutmask19(final long[] in, int inpos,
                final long[] out, int outpos) {
                out[outpos] = in[inpos] | ((in[1 + inpos]) << 19)
                        | ((in[2 + inpos]) << 38)
                        | ((in[3 + inpos]) << 57);
                out[1 + outpos] = ((in[3 + inpos]) >>> (19 - 12))
                        | ((in[4 + inpos]) << 12)
                        | ((in[5 + inpos]) << 31)
                        | ((in[6 + inpos]) << 50);
                out[2 + outpos] = ((in[6 + inpos]) >>> (19 - 5))
                        | ((in[7 + inpos]) << 5)
                        | ((in[8 + inpos]) << 24)
                        | ((in[9 + inpos]) << 43)
                        | ((in[10 + inpos]) << 62);
                out[3 + outpos] = ((in[10 + inpos]) >>> (19 - 17))
                        | ((in[11 + inpos]) << 17)
                        | ((in[12 + inpos]) << 36)
                        | ((in[13 + inpos]) << 55);
                out[4 + outpos] = ((in[13 + inpos]) >>> (19 - 10))
                        | ((in[14 + inpos]) << 10)
                        | ((in[15 + inpos]) << 29)
                        | ((in[16 + inpos]) << 48);
                out[5 + outpos] = ((in[16 + inpos]) >>> (19 - 3))
                        | ((in[17 + inpos]) << 3)
                        | ((in[18 + inpos]) << 22)
                        | ((in[19 + inpos]) << 41)
                        | ((in[20 + inpos]) << 60);
                out[6 + outpos] = ((in[20 + inpos]) >>> (19 - 15))
                        | ((in[21 + inpos]) << 15)
                        | ((in[22 + inpos]) << 34)
                        | ((in[23 + inpos]) << 53);
                out[7 + outpos] = ((in[23 + inpos]) >>> (19 - 8))
                        | ((in[24 + inpos]) << 8)
                        | ((in[25 + inpos]) << 27)
                        | ((in[26 + inpos]) << 46);
                out[8 + outpos] = ((in[26 + inpos]) >>> (19 - 1))
                        | ((in[27 + inpos]) << 1)
                        | ((in[28 + inpos]) << 20)
                        | ((in[29 + inpos]) << 39)
                        | ((in[30 + inpos]) << 58);
                out[9 + outpos] = ((in[30 + inpos]) >>> (19 - 13))
                        | ((in[31 + inpos]) << 13)
                        | ((in[32 + inpos]) << 32)
                        | ((in[33 + inpos]) << 51);
                out[10 + outpos] = ((in[33 + inpos]) >>> (19 - 6))
                        | ((in[34 + inpos]) << 6)
                        | ((in[35 + inpos]) << 25)
                        | ((in[36 + inpos]) << 44)
                        | ((in[37 + inpos]) << 63);
                out[11 + outpos] = ((in[37 + inpos]) >>> (19 - 18))
                        | ((in[38 + inpos]) << 18)
                        | ((in[39 + inpos]) << 37)
                        | ((in[40 + inpos]) << 56);
                out[12 + outpos] = ((in[40 + inpos]) >>> (19 - 11))
                        | ((in[41 + inpos]) << 11)
                        | ((in[42 + inpos]) << 30)
                        | ((in[43 + inpos]) << 49);
                out[13 + outpos] = ((in[43 + inpos]) >>> (19 - 4))
                        | ((in[44 + inpos]) << 4)
                        | ((in[45 + inpos]) << 23)
                        | ((in[46 + inpos]) << 42)
                        | ((in[47 + inpos]) << 61);
                out[14 + outpos] = ((in[47 + inpos]) >>> (19 - 16))
                        | ((in[48 + inpos]) << 16)
                        | ((in[49 + inpos]) << 35)
                        | ((in[50 + inpos]) << 54);
                out[15 + outpos] = ((in[50 + inpos]) >>> (19 - 9))
                        | ((in[51 + inpos]) << 9)
                        | ((in[52 + inpos]) << 28)
                        | ((in[53 + inpos]) << 47);
                out[16 + outpos] = ((in[53 + inpos]) >>> (19 - 2))
                        | ((in[54 + inpos]) << 2)
                        | ((in[55 + inpos]) << 21)
                        | ((in[56 + inpos]) << 40)
                        | ((in[57 + inpos]) << 59);
                out[17 + outpos] = ((in[57 + inpos]) >>> (19 - 14))
                        | ((in[58 + inpos]) << 14)
                        | ((in[59 + inpos]) << 33)
                        | ((in[60 + inpos]) << 52);
                out[18 + outpos] = ((in[60 + inpos]) >>> (19 - 7))
                        | ((in[61 + inpos]) << 7)
                        | ((in[62 + inpos]) << 26)
                        | ((in[63 + inpos]) << 45);
        }

        protected static void fastpackwithoutmask20(final long[] in, int inpos,
                final long[] out, int outpos) {
                out[outpos] = in[inpos] | ((in[1 + inpos]) << 20)
                        | ((in[2 + inpos]) << 40)
                        | ((in[3 + inpos]) << 60);
                out[1 + outpos] = ((in[3 + inpos]) >>> (20 - 16))
                        | ((in[4 + inpos]) << 16)
                        | ((in[5 + inpos]) << 36)
                        | ((in[6 + inpos]) << 56);
                out[2 + outpos] = ((in[6 + inpos]) >>> (20 - 12))
                        | ((in[7 + inpos]) << 12)
                        | ((in[8 + inpos]) << 32)
                        | ((in[9 + inpos]) << 52);
                out[3 + outpos] = ((in[9 + inpos]) >>> (20 - 8))
                        | ((in[10 + inpos]) << 8)
                        | ((in[11 + inpos]) << 28)
                        | ((in[12 + inpos]) << 48);
                out[4 + outpos] = ((in[12 + inpos]) >>> (20 - 4))
                        | ((in[13 + inpos]) << 4)
                        | ((in[14 + inpos]) << 24)
                        | ((in[15 + inpos]) << 44);
                out[5 + outpos] = in[16 + inpos]
                        | ((in[17 + inpos]) << 20)
                        | ((in[18 + inpos]) << 40)
                        | ((in[19 + inpos]) << 60);
                out[6 + outpos] = ((in[19 + inpos]) >>> (20 - 16))
                        | ((in[20 + inpos]) << 16)
                        | ((in[21 + inpos]) << 36)
                        | ((in[22 + inpos]) << 56);
                out[7 + outpos] = ((in[22 + inpos]) >>> (20 - 12))
                        | ((in[23 + inpos]) << 12)
                        | ((in[24 + inpos]) << 32)
                        | ((in[25 + inpos]) << 52);
                out[8 + outpos] = ((in[25 + inpos]) >>> (20 - 8))
                        | ((in[26 + inpos]) << 8)
                        | ((in[27 + inpos]) << 28)
                        | ((in[28 + inpos]) << 48);
                out[9 + outpos] = ((in[28 + inpos]) >>> (20 - 4))
                        | ((in[29 + inpos]) << 4)
                        | ((in[30 + inpos]) << 24)
                        | ((in[31 + inpos]) << 44);
                out[10 + outpos] = in[32 + inpos]
                        | ((in[33 + inpos]) << 20)
                        | ((in[34 + inpos]) << 40)
                        | ((in[35 + inpos]) << 60);
                out[11 + outpos] = ((in[35 + inpos]) >>> (20 - 16))
                        | ((in[36 + inpos]) << 16)
                        | ((in[37 + inpos]) << 36)
                        | ((in[38 + inpos]) << 56);
                out[12 + outpos] = ((in[38 + inpos]) >>> (20 - 12))
                        | ((in[39 + inpos]) << 12)
                        | ((in[40 + inpos]) << 32)
                        | ((in[41 + inpos]) << 52);
                out[13 + outpos] = ((in[41 + inpos]) >>> (20 - 8))
                        | ((in[42 + inpos]) << 8)
                        | ((in[43 + inpos]) << 28)
                        | ((in[44 + inpos]) << 48);
                out[14 + outpos] = ((in[44 + inpos]) >>> (20 - 4))
                        | ((in[45 + inpos]) << 4)
                        | ((in[46 + inpos]) << 24)
                        | ((in[47 + inpos]) << 44);
                out[15 + outpos] = in[48 + inpos]
                        | ((in[49 + inpos]) << 20)
                        | ((in[50 + inpos]) << 40)
                        | ((in[51 + inpos]) << 60);
                out[16 + outpos] = ((in[51 + inpos]) >>> (20 - 16))
                        | ((in[52 + inpos]) << 16)
                        | ((in[53 + inpos]) << 36)
                        | ((in[54 + inpos]) << 56);
                out[17 + outpos] = ((in[54 + inpos]) >>> (20 - 12))
                        | ((in[55 + inpos]) << 12)
                        | ((in[56 + inpos]) << 32)
                        | ((in[57 + inpos]) << 52);
                out[18 + outpos] = ((in[57 + inpos]) >>> (20 - 8))
                        | ((in[58 + inpos]) << 8)
                        | ((in[59 + inpos]) << 28)
                        | ((in[60 + inpos]) << 48);
                out[19 + outpos] = ((in[60 + inpos]) >>> (20 - 4))
                        | ((in[61 + inpos]) << 4)
                        | ((in[62 + inpos]) << 24)
                        | ((in[63 + inpos]) << 44);
        }

        protected static void fastpackwithoutmask21(final long[] in, int inpos,
                final long[] out, int outpos) {
                out[outpos] = in[inpos] | ((in[1 + inpos]) << 21)
                        | ((in[2 + inpos]) << 42)
                        | ((in[3 + inpos]) << 63);
                out[1 + outpos] = ((in[3 + inpos]) >>> (21 - 20))
                        | ((in[4 + inpos]) << 20)
                        | ((in[5 + inpos]) << 41)
                        | ((in[6 + inpos]) << 62);
                out[2 + outpos] = ((in[6 + inpos]) >>> (21 - 19))
                        | ((in[7 + inpos]) << 19)
                        | ((in[8 + inpos]) << 40)
                        | ((in[9 + inpos]) << 61);
                out[3 + outpos] = ((in[9 + inpos]) >>> (21 - 18))
                        | ((in[10 + inpos]) << 18)
                        | ((in[11 + inpos]) << 39)
                        | ((in[12 + inpos]) << 60);
                out[4 + outpos] = ((in[12 + inpos]) >>> (21 - 17))
                        | ((in[13 + inpos]) << 17)
                        | ((in[14 + inpos]) << 38)
                        | ((in[15 + inpos]) << 59);
                out[5 + outpos] = ((in[15 + inpos]) >>> (21 - 16))
                        | ((in[16 + inpos]) << 16)
                        | ((in[17 + inpos]) << 37)
                        | ((in[18 + inpos]) << 58);
                out[6 + outpos] = ((in[18 + inpos]) >>> (21 - 15))
                        | ((in[19 + inpos]) << 15)
                        | ((in[20 + inpos]) << 36)
                        | ((in[21 + inpos]) << 57);
                out[7 + outpos] = ((in[21 + inpos]) >>> (21 - 14))
                        | ((in[22 + inpos]) << 14)
                        | ((in[23 + inpos]) << 35)
                        | ((in[24 + inpos]) << 56);
                out[8 + outpos] = ((in[24 + inpos]) >>> (21 - 13))
                        | ((in[25 + inpos]) << 13)
                        | ((in[26 + inpos]) << 34)
                        | ((in[27 + inpos]) << 55);
                out[9 + outpos] = ((in[27 + inpos]) >>> (21 - 12))
                        | ((in[28 + inpos]) << 12)
                        | ((in[29 + inpos]) << 33)
                        | ((in[30 + inpos]) << 54);
                out[10 + outpos] = ((in[30 + inpos]) >>> (21 - 11))
                        | ((in[31 + inpos]) << 11)
                        | ((in[32 + inpos]) << 32)
                        | ((in[33 + inpos]) << 53);
                out[11 + outpos] = ((in[33 + inpos]) >>> (21 - 10))
                        | ((in[34 + inpos]) << 10)
                        | ((in[35 + inpos]) << 31)
                        | ((in[36 + inpos]) << 52);
                out[12 + outpos] = ((in[36 + inpos]) >>> (21 - 9))
                        | ((in[37 + inpos]) << 9)
                        | ((in[38 + inpos]) << 30)
                        | ((in[39 + inpos]) << 51);
                out[13 + outpos] = ((in[39 + inpos]) >>> (21 - 8))
                        | ((in[40 + inpos]) << 8)
                        | ((in[41 + inpos]) << 29)
                        | ((in[42 + inpos]) << 50);
                out[14 + outpos] = ((in[42 + inpos]) >>> (21 - 7))
                        | ((in[43 + inpos]) << 7)
                        | ((in[44 + inpos]) << 28)
                        | ((in[45 + inpos]) << 49);
                out[15 + outpos] = ((in[45 + inpos]) >>> (21 - 6))
                        | ((in[46 + inpos]) << 6)
                        | ((in[47 + inpos]) << 27)
                        | ((in[48 + inpos]) << 48);
                out[16 + outpos] = ((in[48 + inpos]) >>> (21 - 5))
                        | ((in[49 + inpos]) << 5)
                        | ((in[50 + inpos]) << 26)
                        | ((in[51 + inpos]) << 47);
                out[17 + outpos] = ((in[51 + inpos]) >>> (21 - 4))
                        | ((in[52 + inpos]) << 4)
                        | ((in[53 + inpos]) << 25)
                        | ((in[54 + inpos]) << 46);
                out[18 + outpos] = ((in[54 + inpos]) >>> (21 - 3))
                        | ((in[55 + inpos]) << 3)
                        | ((in[56 + inpos]) << 24)
                        | ((in[57 + inpos]) << 45);
                out[19 + outpos] = ((in[57 + inpos]) >>> (21 - 2))
                        | ((in[58 + inpos]) << 2)
                        | ((in[59 + inpos]) << 23)
                        | ((in[60 + inpos]) << 44);
                out[20 + outpos] = ((in[60 + inpos]) >>> (21 - 1))
                        | ((in[61 + inpos]) << 1)
                        | ((in[62 + inpos]) << 22)
                        | ((in[63 + inpos]) << 43);
        }

        protected static void fastpackwithoutmask22(final long[] in, int inpos,
                final long[] out, int outpos) {
                out[outpos] = in[inpos] | ((in[1 + inpos]) << 22)
                        | ((in[2 + inpos]) << 44);
                out[1 + outpos] = ((in[2 + inpos]) >>> (22 - 2))
                        | ((in[3 + inpos]) << 2)
                        | ((in[4 + inpos]) << 24)
                        | ((in[5 + inpos]) << 46);
                out[2 + outpos] = ((in[5 + inpos]) >>> (22 - 4))
                        | ((in[6 + inpos]) << 4)
                        | ((in[7 + inpos]) << 26)
                        | ((in[8 + inpos]) << 48);
                out[3 + outpos] = ((in[8 + inpos]) >>> (22 - 6))
                        | ((in[9 + inpos]) << 6)
                        | ((in[10 + inpos]) << 28)
                        | ((in[11 + inpos]) << 50);
                out[4 + outpos] = ((in[11 + inpos]) >>> (22 - 8))
                        | ((in[12 + inpos]) << 8)
                        | ((in[13 + inpos]) << 30)
                        | ((in[14 + inpos]) << 52);
                out[5 + outpos] = ((in[14 + inpos]) >>> (22 - 10))
                        | ((in[15 + inpos]) << 10)
                        | ((in[16 + inpos]) << 32)
                        | ((in[17 + inpos]) << 54);
                out[6 + outpos] = ((in[17 + inpos]) >>> (22 - 12))
                        | ((in[18 + inpos]) << 12)
                        | ((in[19 + inpos]) << 34)
                        | ((in[20 + inpos]) << 56);
                out[7 + outpos] = ((in[20 + inpos]) >>> (22 - 14))
                        | ((in[21 + inpos]) << 14)
                        | ((in[22 + inpos]) << 36)
                        | ((in[23 + inpos]) << 58);
                out[8 + outpos] = ((in[23 + inpos]) >>> (22 - 16))
                        | ((in[24 + inpos]) << 16)
                        | ((in[25 + inpos]) << 38)
                        | ((in[26 + inpos]) << 60);
                out[9 + outpos] = ((in[26 + inpos]) >>> (22 - 18))
                        | ((in[27 + inpos]) << 18)
                        | ((in[28 + inpos]) << 40)
                        | ((in[29 + inpos]) << 62);
                out[10 + outpos] = ((in[29 + inpos]) >>> (22 - 20))
                        | ((in[30 + inpos]) << 20)
                        | ((in[31 + inpos]) << 42);
                out[11 + outpos] = in[32 + inpos]
                        | ((in[33 + inpos]) << 22)
                        | ((in[34 + inpos]) << 44);
                out[12 + outpos] = ((in[34 + inpos]) >>> (22 - 2))
                        | ((in[35 + inpos]) << 2)
                        | ((in[36 + inpos]) << 24)
                        | ((in[37 + inpos]) << 46);
                out[13 + outpos] = ((in[37 + inpos]) >>> (22 - 4))
                        | ((in[38 + inpos]) << 4)
                        | ((in[39 + inpos]) << 26)
                        | ((in[40 + inpos]) << 48);
                out[14 + outpos] = ((in[40 + inpos]) >>> (22 - 6))
                        | ((in[41 + inpos]) << 6)
                        | ((in[42 + inpos]) << 28)
                        | ((in[43 + inpos]) << 50);
                out[15 + outpos] = ((in[43 + inpos]) >>> (22 - 8))
                        | ((in[44 + inpos]) << 8)
                        | ((in[45 + inpos]) << 30)
                        | ((in[46 + inpos]) << 52);
                out[16 + outpos] = ((in[46 + inpos]) >>> (22 - 10))
                        | ((in[47 + inpos]) << 10)
                        | ((in[48 + inpos]) << 32)
                        | ((in[49 + inpos]) << 54);
                out[17 + outpos] = ((in[49 + inpos]) >>> (22 - 12))
                        | ((in[50 + inpos]) << 12)
                        | ((in[51 + inpos]) << 34)
                        | ((in[52 + inpos]) << 56);
                out[18 + outpos] = ((in[52 + inpos]) >>> (22 - 14))
                        | ((in[53 + inpos]) << 14)
                        | ((in[54 + inpos]) << 36)
                        | ((in[55 + inpos]) << 58);
                out[19 + outpos] = ((in[55 + inpos]) >>> (22 - 16))
                        | ((in[56 + inpos]) << 16)
                        | ((in[57 + inpos]) << 38)
                        | ((in[58 + inpos]) << 60);
                out[20 + outpos] = ((in[58 + inpos]) >>> (22 - 18))
                        | ((in[59 + inpos]) << 18)
                        | ((in[60 + inpos]) << 40)
                        | ((in[61 + inpos]) << 62);
                out[21 + outpos] = ((in[61 + inpos]) >>> (22 - 20))
                        | ((in[62 + inpos]) << 20)
                        | ((in[63 + inpos]) << 42);
        }

        protected static void fastpackwithoutmask23(final long[] in, int inpos,
                final long[] out, int outpos) {
                out[outpos] = in[inpos] | ((in[1 + inpos]) << 23)
                        | ((in[2 + inpos]) << 46);
                out[1 + outpos] = ((in[2 + inpos]) >>> (23 - 5))
                        | ((in[3 + inpos]) << 5)
                        | ((in[4 + inpos]) << 28)
                        | ((in[5 + inpos]) << 51);
                out[2 + outpos] = ((in[5 + inpos]) >>> (23 - 10))
                        | ((in[6 + inpos]) << 10)
                        | ((in[7 + inpos]) << 33)
                        | ((in[8 + inpos]) << 56);
                out[3 + outpos] = ((in[8 + inpos]) >>> (23 - 15))
                        | ((in[9 + inpos]) << 15)
                        | ((in[10 + inpos]) << 38)
                        | ((in[11 + inpos]) << 61);
                out[4 + outpos] = ((in[11 + inpos]) >>> (23 - 20))
                        | ((in[12 + inpos]) << 20)
                        | ((in[13 + inpos]) << 43);
                out[5 + outpos] = ((in[13 + inpos]) >>> (23 - 2))
                        | ((in[14 + inpos]) << 2)
                        | ((in[15 + inpos]) << 25)
                        | ((in[16 + inpos]) << 48);
                out[6 + outpos] = ((in[16 + inpos]) >>> (23 - 7))
                        | ((in[17 + inpos]) << 7)
                        | ((in[18 + inpos]) << 30)
                        | ((in[19 + inpos]) << 53);
                out[7 + outpos] = ((in[19 + inpos]) >>> (23 - 12))
                        | ((in[20 + inpos]) << 12)
                        | ((in[21 + inpos]) << 35)
                        | ((in[22 + inpos]) << 58);
                out[8 + outpos] = ((in[22 + inpos]) >>> (23 - 17))
                        | ((in[23 + inpos]) << 17)
                        | ((in[24 + inpos]) << 40)
                        | ((in[25 + inpos]) << 63);
                out[9 + outpos] = ((in[25 + inpos]) >>> (23 - 22))
                        | ((in[26 + inpos]) << 22)
                        | ((in[27 + inpos]) << 45);
                out[10 + outpos] = ((in[27 + inpos]) >>> (23 - 4))
                        | ((in[28 + inpos]) << 4)
                        | ((in[29 + inpos]) << 27)
                        | ((in[30 + inpos]) << 50);
                out[11 + outpos] = ((in[30 + inpos]) >>> (23 - 9))
                        | ((in[31 + inpos]) << 9)
                        | ((in[32 + inpos]) << 32)
                        | ((in[33 + inpos]) << 55);
                out[12 + outpos] = ((in[33 + inpos]) >>> (23 - 14))
                        | ((in[34 + inpos]) << 14)
                        | ((in[35 + inpos]) << 37)
                        | ((in[36 + inpos]) << 60);
                out[13 + outpos] = ((in[36 + inpos]) >>> (23 - 19))
                        | ((in[37 + inpos]) << 19)
                        | ((in[38 + inpos]) << 42);
                out[14 + outpos] = ((in[38 + inpos]) >>> (23 - 1))
                        | ((in[39 + inpos]) << 1)
                        | ((in[40 + inpos]) << 24)
                        | ((in[41 + inpos]) << 47);
                out[15 + outpos] = ((in[41 + inpos]) >>> (23 - 6))
                        | ((in[42 + inpos]) << 6)
                        | ((in[43 + inpos]) << 29)
                        | ((in[44 + inpos]) << 52);
                out[16 + outpos] = ((in[44 + inpos]) >>> (23 - 11))
                        | ((in[45 + inpos]) << 11)
                        | ((in[46 + inpos]) << 34)
                        | ((in[47 + inpos]) << 57);
                out[17 + outpos] = ((in[47 + inpos]) >>> (23 - 16))
                        | ((in[48 + inpos]) << 16)
                        | ((in[49 + inpos]) << 39)
                        | ((in[50 + inpos]) << 62);
                out[18 + outpos] = ((in[50 + inpos]) >>> (23 - 21))
                        | ((in[51 + inpos]) << 21)
                        | ((in[52 + inpos]) << 44);
                out[19 + outpos] = ((in[52 + inpos]) >>> (23 - 3))
                        | ((in[53 + inpos]) << 3)
                        | ((in[54 + inpos]) << 26)
                        | ((in[55 + inpos]) << 49);
                out[20 + outpos] = ((in[55 + inpos]) >>> (23 - 8))
                        | ((in[56 + inpos]) << 8)
                        | ((in[57 + inpos]) << 31)
                        | ((in[58 + inpos]) << 54);
                out[21 + outpos] = ((in[58 + inpos]) >>> (23 - 13))
                        | ((in[59 + inpos]) << 13)
                        | ((in[60 + inpos]) << 36)
                        | ((in[61 + inpos]) << 59);
                out[22 + outpos] = ((in[61 + inpos]) >>> (23 - 18))
                        | ((in[62 + inpos]) << 18)
                        | ((in[63 + inpos]) << 41);
        }

        protected static void fastpackwithoutmask24(final long[] in, int inpos,
                final long[] out, int outpos) {
                out[outpos] = in[inpos] | ((in[1 + inpos]) << 24)
                        | ((in[2 + inpos]) << 48);
                out[1 + outpos] = ((in[2 + inpos]) >>> (24 - 8))
                        | ((in[3 + inpos]) << 8)
                        | ((in[4 + inpos]) << 32)
                        | ((in[5 + inpos]) << 56);
                out[2 + outpos] = ((in[5 + inpos]) >>> (24 - 16))
                        | ((in[6 + inpos]) << 16)
                        | ((in[7 + inpos]) << 40);
                out[3 + outpos] = in[8 + inpos]
                        | ((in[9 + inpos]) << 24)
                        | ((in[10 + inpos]) << 48);
                out[4 + outpos] = ((in[10 + inpos]) >>> (24 - 8))
                        | ((in[11 + inpos]) << 8)
                        | ((in[12 + inpos]) << 32)
                        | ((in[13 + inpos]) << 56);
                out[5 + outpos] = ((in[13 + inpos]) >>> (24 - 16))
                        | ((in[14 + inpos]) << 16)
                        | ((in[15 + inpos]) << 40);
                out[6 + outpos] = in[16 + inpos]
                        | ((in[17 + inpos]) << 24)
                        | ((in[18 + inpos]) << 48);
                out[7 + outpos] = ((in[18 + inpos]) >>> (24 - 8))
                        | ((in[19 + inpos]) << 8)
                        | ((in[20 + inpos]) << 32)
                        | ((in[21 + inpos]) << 56);
                out[8 + outpos] = ((in[21 + inpos]) >>> (24 - 16))
                        | ((in[22 + inpos]) << 16)
                        | ((in[23 + inpos]) << 40);
                out[9 + outpos] = in[24 + inpos]
                        | ((in[25 + inpos]) << 24)
                        | ((in[26 + inpos]) << 48);
                out[10 + outpos] = ((in[26 + inpos]) >>> (24 - 8))
                        | ((in[27 + inpos]) << 8)
                        | ((in[28 + inpos]) << 32)
                        | ((in[29 + inpos]) << 56);
                out[11 + outpos] = ((in[29 + inpos]) >>> (24 - 16))
                        | ((in[30 + inpos]) << 16)
                        | ((in[31 + inpos]) << 40);
                out[12 + outpos] = in[32 + inpos]
                        | ((in[33 + inpos]) << 24)
                        | ((in[34 + inpos]) << 48);
                out[13 + outpos] = ((in[34 + inpos]) >>> (24 - 8))
                        | ((in[35 + inpos]) << 8)
                        | ((in[36 + inpos]) << 32)
                        | ((in[37 + inpos]) << 56);
                out[14 + outpos] = ((in[37 + inpos]) >>> (24 - 16))
                        | ((in[38 + inpos]) << 16)
                        | ((in[39 + inpos]) << 40);
                out[15 + outpos] = in[40 + inpos]
                        | ((in[41 + inpos]) << 24)
                        | ((in[42 + inpos]) << 48);
                out[16 + outpos] = ((in[42 + inpos]) >>> (24 - 8))
                        | ((in[43 + inpos]) << 8)
                        | ((in[44 + inpos]) << 32)
                        | ((in[45 + inpos]) << 56);
                out[17 + outpos] = ((in[45 + inpos]) >>> (24 - 16))
                        | ((in[46 + inpos]) << 16)
                        | ((in[47 + inpos]) << 40);
                out[18 + outpos] = in[48 + inpos]
                        | ((in[49 + inpos]) << 24)
                        | ((in[50 + inpos]) << 48);
                out[19 + outpos] = ((in[50 + inpos]) >>> (24 - 8))
                        | ((in[51 + inpos]) << 8)
                        | ((in[52 + inpos]) << 32)
                        | ((in[53 + inpos]) << 56);
                out[20 + outpos] = ((in[53 + inpos]) >>> (24 - 16))
                        | ((in[54 + inpos]) << 16)
                        | ((in[55 + inpos]) << 40);
                out[21 + outpos] = in[56 + inpos]
                        | ((in[57 + inpos]) << 24)
                        | ((in[58 + inpos]) << 48);
                out[22 + outpos] = ((in[58 + inpos]) >>> (24 - 8))
                        | ((in[59 + inpos]) << 8)
                        | ((in[60 + inpos]) << 32)
                        | ((in[61 + inpos]) << 56);
                out[23 + outpos] = ((in[61 + inpos]) >>> (24 - 16))
                        | ((in[62 + inpos]) << 16)
                        | ((in[63 + inpos]) << 40);
        }

        protected static void fastpackwithoutmask25(final long[] in, int inpos,
                final long[] out, int outpos) {
                out[outpos] = in[inpos] | ((in[1 + inpos]) << 25)
                        | ((in[2 + inpos]) << 50);
                out[1 + outpos] = ((in[2 + inpos]) >>> (25 - 11))
                        | ((in[3 + inpos]) << 11)
                        | ((in[4 + inpos]) << 36)
                        | ((in[5 + inpos]) << 61);
                out[2 + outpos] = ((in[5 + inpos]) >>> (25 - 22))
                        | ((in[6 + inpos]) << 22)
                        | ((in[7 + inpos]) << 47);
                out[3 + outpos] = ((in[7 + inpos]) >>> (25 - 8))
                        | ((in[8 + inpos]) << 8)
                        | ((in[9 + inpos]) << 33)
                        | ((in[10 + inpos]) << 58);
                out[4 + outpos] = ((in[10 + inpos]) >>> (25 - 19))
                        | ((in[11 + inpos]) << 19)
                        | ((in[12 + inpos]) << 44);
                out[5 + outpos] = ((in[12 + inpos]) >>> (25 - 5))
                        | ((in[13 + inpos]) << 5)
                        | ((in[14 + inpos]) << 30)
                        | ((in[15 + inpos]) << 55);
                out[6 + outpos] = ((in[15 + inpos]) >>> (25 - 16))
                        | ((in[16 + inpos]) << 16)
                        | ((in[17 + inpos]) << 41);
                out[7 + outpos] = ((in[17 + inpos]) >>> (25 - 2))
                        | ((in[18 + inpos]) << 2)
                        | ((in[19 + inpos]) << 27)
                        | ((in[20 + inpos]) << 52);
                out[8 + outpos] = ((in[20 + inpos]) >>> (25 - 13))
                        | ((in[21 + inpos]) << 13)
                        | ((in[22 + inpos]) << 38)
                        | ((in[23 + inpos]) << 63);
                out[9 + outpos] = ((in[23 + inpos]) >>> (25 - 24))
                        | ((in[24 + inpos]) << 24)
                        | ((in[25 + inpos]) << 49);
                out[10 + outpos] = ((in[25 + inpos]) >>> (25 - 10))
                        | ((in[26 + inpos]) << 10)
                        | ((in[27 + inpos]) << 35)
                        | ((in[28 + inpos]) << 60);
                out[11 + outpos] = ((in[28 + inpos]) >>> (25 - 21))
                        | ((in[29 + inpos]) << 21)
                        | ((in[30 + inpos]) << 46);
                out[12 + outpos] = ((in[30 + inpos]) >>> (25 - 7))
                        | ((in[31 + inpos]) << 7)
                        | ((in[32 + inpos]) << 32)
                        | ((in[33 + inpos]) << 57);
                out[13 + outpos] = ((in[33 + inpos]) >>> (25 - 18))
                        | ((in[34 + inpos]) << 18)
                        | ((in[35 + inpos]) << 43);
                out[14 + outpos] = ((in[35 + inpos]) >>> (25 - 4))
                        | ((in[36 + inpos]) << 4)
                        | ((in[37 + inpos]) << 29)
                        | ((in[38 + inpos]) << 54);
                out[15 + outpos] = ((in[38 + inpos]) >>> (25 - 15))
                        | ((in[39 + inpos]) << 15)
                        | ((in[40 + inpos]) << 40);
                out[16 + outpos] = ((in[40 + inpos]) >>> (25 - 1))
                        | ((in[41 + inpos]) << 1)
                        | ((in[42 + inpos]) << 26)
                        | ((in[43 + inpos]) << 51);
                out[17 + outpos] = ((in[43 + inpos]) >>> (25 - 12))
                        | ((in[44 + inpos]) << 12)
                        | ((in[45 + inpos]) << 37)
                        | ((in[46 + inpos]) << 62);
                out[18 + outpos] = ((in[46 + inpos]) >>> (25 - 23))
                        | ((in[47 + inpos]) << 23)
                        | ((in[48 + inpos]) << 48);
                out[19 + outpos] = ((in[48 + inpos]) >>> (25 - 9))
                        | ((in[49 + inpos]) << 9)
                        | ((in[50 + inpos]) << 34)
                        | ((in[51 + inpos]) << 59);
                out[20 + outpos] = ((in[51 + inpos]) >>> (25 - 20))
                        | ((in[52 + inpos]) << 20)
                        | ((in[53 + inpos]) << 45);
                out[21 + outpos] = ((in[53 + inpos]) >>> (25 - 6))
                        | ((in[54 + inpos]) << 6)
                        | ((in[55 + inpos]) << 31)
                        | ((in[56 + inpos]) << 56);
                out[22 + outpos] = ((in[56 + inpos]) >>> (25 - 17))
                        | ((in[57 + inpos]) << 17)
                        | ((in[58 + inpos]) << 42);
                out[23 + outpos] = ((in[58 + inpos]) >>> (25 - 3))
                        | ((in[59 + inpos]) << 3)
                        | ((in[60 + inpos]) << 28)
                        | ((in[61 + inpos]) << 53);
                out[24 + outpos] = ((in[61 + inpos]) >>> (25 - 14))
                        | ((in[62 + inpos]) << 14)
                        | ((in[63 + inpos]) << 39);
        }

        protected static void fastpackwithoutmask26(final long[] in, int inpos,
                final long[] out, int outpos) {
                out[outpos] = in[inpos] | ((in[1 + inpos]) << 26)
                        | ((in[2 + inpos]) << 52);
                out[1 + outpos] = ((in[2 + inpos]) >>> (26 - 14))
                        | ((in[3 + inpos]) << 14)
                        | ((in[4 + inpos]) << 40);
                out[2 + outpos] = ((in[4 + inpos]) >>> (26 - 2))
                        | ((in[5 + inpos]) << 2)
                        | ((in[6 + inpos]) << 28)
                        | ((in[7 + inpos]) << 54);
                out[3 + outpos] = ((in[7 + inpos]) >>> (26 - 16))
                        | ((in[8 + inpos]) << 16)
                        | ((in[9 + inpos]) << 42);
                out[4 + outpos] = ((in[9 + inpos]) >>> (26 - 4))
                        | ((in[10 + inpos]) << 4)
                        | ((in[11 + inpos]) << 30)
                        | ((in[12 + inpos]) << 56);
                out[5 + outpos] = ((in[12 + inpos]) >>> (26 - 18))
                        | ((in[13 + inpos]) << 18)
                        | ((in[14 + inpos]) << 44);
                out[6 + outpos] = ((in[14 + inpos]) >>> (26 - 6))
                        | ((in[15 + inpos]) << 6)
                        | ((in[16 + inpos]) << 32)
                        | ((in[17 + inpos]) << 58);
                out[7 + outpos] = ((in[17 + inpos]) >>> (26 - 20))
                        | ((in[18 + inpos]) << 20)
                        | ((in[19 + inpos]) << 46);
                out[8 + outpos] = ((in[19 + inpos]) >>> (26 - 8))
                        | ((in[20 + inpos]) << 8)
                        | ((in[21 + inpos]) << 34)
                        | ((in[22 + inpos]) << 60);
                out[9 + outpos] = ((in[22 + inpos]) >>> (26 - 22))
                        | ((in[23 + inpos]) << 22)
                        | ((in[24 + inpos]) << 48);
                out[10 + outpos] = ((in[24 + inpos]) >>> (26 - 10))
                        | ((in[25 + inpos]) << 10)
                        | ((in[26 + inpos]) << 36)
                        | ((in[27 + inpos]) << 62);
                out[11 + outpos] = ((in[27 + inpos]) >>> (26 - 24))
                        | ((in[28 + inpos]) << 24)
                        | ((in[29 + inpos]) << 50);
                out[12 + outpos] = ((in[29 + inpos]) >>> (26 - 12))
                        | ((in[30 + inpos]) << 12)
                        | ((in[31 + inpos]) << 38);
                out[13 + outpos] = in[32 + inpos]
                        | ((in[33 + inpos]) << 26)
                        | ((in[34 + inpos]) << 52);
                out[14 + outpos] = ((in[34 + inpos]) >>> (26 - 14))
                        | ((in[35 + inpos]) << 14)
                        | ((in[36 + inpos]) << 40);
                out[15 + outpos] = ((in[36 + inpos]) >>> (26 - 2))
                        | ((in[37 + inpos]) << 2)
                        | ((in[38 + inpos]) << 28)
                        | ((in[39 + inpos]) << 54);
                out[16 + outpos] = ((in[39 + inpos]) >>> (26 - 16))
                        | ((in[40 + inpos]) << 16)
                        | ((in[41 + inpos]) << 42);
                out[17 + outpos] = ((in[41 + inpos]) >>> (26 - 4))
                        | ((in[42 + inpos]) << 4)
                        | ((in[43 + inpos]) << 30)
                        | ((in[44 + inpos]) << 56);
                out[18 + outpos] = ((in[44 + inpos]) >>> (26 - 18))
                        | ((in[45 + inpos]) << 18)
                        | ((in[46 + inpos]) << 44);
                out[19 + outpos] = ((in[46 + inpos]) >>> (26 - 6))
                        | ((in[47 + inpos]) << 6)
                        | ((in[48 + inpos]) << 32)
                        | ((in[49 + inpos]) << 58);
                out[20 + outpos] = ((in[49 + inpos]) >>> (26 - 20))
                        | ((in[50 + inpos]) << 20)
                        | ((in[51 + inpos]) << 46);
                out[21 + outpos] = ((in[51 + inpos]) >>> (26 - 8))
                        | ((in[52 + inpos]) << 8)
                        | ((in[53 + inpos]) << 34)
                        | ((in[54 + inpos]) << 60);
                out[22 + outpos] = ((in[54 + inpos]) >>> (26 - 22))
                        | ((in[55 + inpos]) << 22)
                        | ((in[56 + inpos]) << 48);
                out[23 + outpos] = ((in[56 + inpos]) >>> (26 - 10))
                        | ((in[57 + inpos]) << 10)
                        | ((in[58 + inpos]) << 36)
                        | ((in[59 + inpos]) << 62);
                out[24 + outpos] = ((in[59 + inpos]) >>> (26 - 24))
                        | ((in[60 + inpos]) << 24)
                        | ((in[61 + inpos]) << 50);
                out[25 + outpos] = ((in[61 + inpos]) >>> (26 - 12))
                        | ((in[62 + inpos]) << 12)
                        | ((in[63 + inpos]) << 38);
        }

        protected static void fastpackwithoutmask27(final long[] in, int inpos,
                final long[] out, int outpos) {
                out[outpos] = in[inpos] | ((in[1 + inpos]) << 27)
                        | ((in[2 + inpos]) << 54);
                out[1 + outpos] = ((in[2 + inpos]) >>> (27 - 17))
                        | ((in[3 + inpos]) << 17)
                        | ((in[4 + inpos]) << 44);
                out[2 + outpos] = ((in[4 + inpos]) >>> (27 - 7))
                        | ((in[5 + inpos]) << 7)
                        | ((in[6 + inpos]) << 34)
                        | ((in[7 + inpos]) << 61);
                out[3 + outpos] = ((in[7 + inpos]) >>> (27 - 24))
                        | ((in[8 + inpos]) << 24)
                        | ((in[9 + inpos]) << 51);
                out[4 + outpos] = ((in[9 + inpos]) >>> (27 - 14))
                        | ((in[10 + inpos]) << 14)
                        | ((in[11 + inpos]) << 41);
                out[5 + outpos] = ((in[11 + inpos]) >>> (27 - 4))
                        | ((in[12 + inpos]) << 4)
                        | ((in[13 + inpos]) << 31)
                        | ((in[14 + inpos]) << 58);
                out[6 + outpos] = ((in[14 + inpos]) >>> (27 - 21))
                        | ((in[15 + inpos]) << 21)
                        | ((in[16 + inpos]) << 48);
                out[7 + outpos] = ((in[16 + inpos]) >>> (27 - 11))
                        | ((in[17 + inpos]) << 11)
                        | ((in[18 + inpos]) << 38);
                out[8 + outpos] = ((in[18 + inpos]) >>> (27 - 1))
                        | ((in[19 + inpos]) << 1)
                        | ((in[20 + inpos]) << 28)
                        | ((in[21 + inpos]) << 55);
                out[9 + outpos] = ((in[21 + inpos]) >>> (27 - 18))
                        | ((in[22 + inpos]) << 18)
                        | ((in[23 + inpos]) << 45);
                out[10 + outpos] = ((in[23 + inpos]) >>> (27 - 8))
                        | ((in[24 + inpos]) << 8)
                        | ((in[25 + inpos]) << 35)
                        | ((in[26 + inpos]) << 62);
                out[11 + outpos] = ((in[26 + inpos]) >>> (27 - 25))
                        | ((in[27 + inpos]) << 25)
                        | ((in[28 + inpos]) << 52);
                out[12 + outpos] = ((in[28 + inpos]) >>> (27 - 15))
                        | ((in[29 + inpos]) << 15)
                        | ((in[30 + inpos]) << 42);
                out[13 + outpos] = ((in[30 + inpos]) >>> (27 - 5))
                        | ((in[31 + inpos]) << 5)
                        | ((in[32 + inpos]) << 32)
                        | ((in[33 + inpos]) << 59);
                out[14 + outpos] = ((in[33 + inpos]) >>> (27 - 22))
                        | ((in[34 + inpos]) << 22)
                        | ((in[35 + inpos]) << 49);
                out[15 + outpos] = ((in[35 + inpos]) >>> (27 - 12))
                        | ((in[36 + inpos]) << 12)
                        | ((in[37 + inpos]) << 39);
                out[16 + outpos] = ((in[37 + inpos]) >>> (27 - 2))
                        | ((in[38 + inpos]) << 2)
                        | ((in[39 + inpos]) << 29)
                        | ((in[40 + inpos]) << 56);
                out[17 + outpos] = ((in[40 + inpos]) >>> (27 - 19))
                        | ((in[41 + inpos]) << 19)
                        | ((in[42 + inpos]) << 46);
                out[18 + outpos] = ((in[42 + inpos]) >>> (27 - 9))
                        | ((in[43 + inpos]) << 9)
                        | ((in[44 + inpos]) << 36)
                        | ((in[45 + inpos]) << 63);
                out[19 + outpos] = ((in[45 + inpos]) >>> (27 - 26))
                        | ((in[46 + inpos]) << 26)
                        | ((in[47 + inpos]) << 53);
                out[20 + outpos] = ((in[47 + inpos]) >>> (27 - 16))
                        | ((in[48 + inpos]) << 16)
                        | ((in[49 + inpos]) << 43);
                out[21 + outpos] = ((in[49 + inpos]) >>> (27 - 6))
                        | ((in[50 + inpos]) << 6)
                        | ((in[51 + inpos]) << 33)
                        | ((in[52 + inpos]) << 60);
                out[22 + outpos] = ((in[52 + inpos]) >>> (27 - 23))
                        | ((in[53 + inpos]) << 23)
                        | ((in[54 + inpos]) << 50);
                out[23 + outpos] = ((in[54 + inpos]) >>> (27 - 13))
                        | ((in[55 + inpos]) << 13)
                        | ((in[56 + inpos]) << 40);
                out[24 + outpos] = ((in[56 + inpos]) >>> (27 - 3))
                        | ((in[57 + inpos]) << 3)
                        | ((in[58 + inpos]) << 30)
                        | ((in[59 + inpos]) << 57);
                out[25 + outpos] = ((in[59 + inpos]) >>> (27 - 20))
                        | ((in[60 + inpos]) << 20)
                        | ((in[61 + inpos]) << 47);
                out[26 + outpos] = ((in[61 + inpos]) >>> (27 - 10))
                        | ((in[62 + inpos]) << 10)
                        | ((in[63 + inpos]) << 37);
        }

        protected static void fastpackwithoutmask28(final long[] in, int inpos,
                final long[] out, int outpos) {
                out[outpos] = in[inpos] | ((in[1 + inpos]) << 28)
                        | ((in[2 + inpos]) << 56);
                out[1 + outpos] = ((in[2 + inpos]) >>> (28 - 20))
                        | ((in[3 + inpos]) << 20)
                        | ((in[4 + inpos]) << 48);
                out[2 + outpos] = ((in[4 + inpos]) >>> (28 - 12))
                        | ((in[5 + inpos]) << 12)
                        | ((in[6 + inpos]) << 40);
                out[3 + outpos] = ((in[6 + inpos]) >>> (28 - 4))
                        | ((in[7 + inpos]) << 4)
                        | ((in[8 + inpos]) << 32)
                        | ((in[9 + inpos]) << 60);
                out[4 + outpos] = ((in[9 + inpos]) >>> (28 - 24))
                        | ((in[10 + inpos]) << 24)
                        | ((in[11 + inpos]) << 52);
                out[5 + outpos] = ((in[11 + inpos]) >>> (28 - 16))
                        | ((in[12 + inpos]) << 16)
                        | ((in[13 + inpos]) << 44);
                out[6 + outpos] = ((in[13 + inpos]) >>> (28 - 8))
                        | ((in[14 + inpos]) << 8)
                        | ((in[15 + inpos]) << 36);
                out[7 + outpos] = in[16 + inpos]
                        | ((in[17 + inpos]) << 28)
                        | ((in[18 + inpos]) << 56);
                out[8 + outpos] = ((in[18 + inpos]) >>> (28 - 20))
                        | ((in[19 + inpos]) << 20)
                        | ((in[20 + inpos]) << 48);
                out[9 + outpos] = ((in[20 + inpos]) >>> (28 - 12))
                        | ((in[21 + inpos]) << 12)
                        | ((in[22 + inpos]) << 40);
                out[10 + outpos] = ((in[22 + inpos]) >>> (28 - 4))
                        | ((in[23 + inpos]) << 4)
                        | ((in[24 + inpos]) << 32)
                        | ((in[25 + inpos]) << 60);
                out[11 + outpos] = ((in[25 + inpos]) >>> (28 - 24))
                        | ((in[26 + inpos]) << 24)
                        | ((in[27 + inpos]) << 52);
                out[12 + outpos] = ((in[27 + inpos]) >>> (28 - 16))
                        | ((in[28 + inpos]) << 16)
                        | ((in[29 + inpos]) << 44);
                out[13 + outpos] = ((in[29 + inpos]) >>> (28 - 8))
                        | ((in[30 + inpos]) << 8)
                        | ((in[31 + inpos]) << 36);
                out[14 + outpos] = in[32 + inpos]
                        | ((in[33 + inpos]) << 28)
                        | ((in[34 + inpos]) << 56);
                out[15 + outpos] = ((in[34 + inpos]) >>> (28 - 20))
                        | ((in[35 + inpos]) << 20)
                        | ((in[36 + inpos]) << 48);
                out[16 + outpos] = ((in[36 + inpos]) >>> (28 - 12))
                        | ((in[37 + inpos]) << 12)
                        | ((in[38 + inpos]) << 40);
                out[17 + outpos] = ((in[38 + inpos]) >>> (28 - 4))
                        | ((in[39 + inpos]) << 4)
                        | ((in[40 + inpos]) << 32)
                        | ((in[41 + inpos]) << 60);
                out[18 + outpos] = ((in[41 + inpos]) >>> (28 - 24))
                        | ((in[42 + inpos]) << 24)
                        | ((in[43 + inpos]) << 52);
                out[19 + outpos] = ((in[43 + inpos]) >>> (28 - 16))
                        | ((in[44 + inpos]) << 16)
                        | ((in[45 + inpos]) << 44);
                out[20 + outpos] = ((in[45 + inpos]) >>> (28 - 8))
                        | ((in[46 + inpos]) << 8)
                        | ((in[47 + inpos]) << 36);
                out[21 + outpos] = in[48 + inpos]
                        | ((in[49 + inpos]) << 28)
                        | ((in[50 + inpos]) << 56);
                out[22 + outpos] = ((in[50 + inpos]) >>> (28 - 20))
                        | ((in[51 + inpos]) << 20)
                        | ((in[52 + inpos]) << 48);
                out[23 + outpos] = ((in[52 + inpos]) >>> (28 - 12))
                        | ((in[53 + inpos]) << 12)
                        | ((in[54 + inpos]) << 40);
                out[24 + outpos] = ((in[54 + inpos]) >>> (28 - 4))
                        | ((in[55 + inpos]) << 4)
                        | ((in[56 + inpos]) << 32)
                        | ((in[57 + inpos]) << 60);
                out[25 + outpos] = ((in[57 + inpos]) >>> (28 - 24))
                        | ((in[58 + inpos]) << 24)
                        | ((in[59 + inpos]) << 52);
                out[26 + outpos] = ((in[59 + inpos]) >>> (28 - 16))
                        | ((in[60 + inpos]) << 16)
                        | ((in[61 + inpos]) << 44);
                out[27 + outpos] = ((in[61 + inpos]) >>> (28 - 8))
                        | ((in[62 + inpos]) << 8)
                        | ((in[63 + inpos]) << 36);
        }

        protected static void fastpackwithoutmask29(final long[] in, int inpos,
                final long[] out, int outpos) {
                out[outpos] = in[inpos] | ((in[1 + inpos]) << 29)
                        | ((in[2 + inpos]) << 58);
                out[1 + outpos] = ((in[2 + inpos]) >>> (29 - 23))
                        | ((in[3 + inpos]) << 23)
                        | ((in[4 + inpos]) << 52);
                out[2 + outpos] = ((in[4 + inpos]) >>> (29 - 17))
                        | ((in[5 + inpos]) << 17)
                        | ((in[6 + inpos]) << 46);
                out[3 + outpos] = ((in[6 + inpos]) >>> (29 - 11))
                        | ((in[7 + inpos]) << 11)
                        | ((in[8 + inpos]) << 40);
                out[4 + outpos] = ((in[8 + inpos]) >>> (29 - 5))
                        | ((in[9 + inpos]) << 5)
                        | ((in[10 + inpos]) << 34)
                        | ((in[11 + inpos]) << 63);
                out[5 + outpos] = ((in[11 + inpos]) >>> (29 - 28))
                        | ((in[12 + inpos]) << 28)
                        | ((in[13 + inpos]) << 57);
                out[6 + outpos] = ((in[13 + inpos]) >>> (29 - 22))
                        | ((in[14 + inpos]) << 22)
                        | ((in[15 + inpos]) << 51);
                out[7 + outpos] = ((in[15 + inpos]) >>> (29 - 16))
                        | ((in[16 + inpos]) << 16)
                        | ((in[17 + inpos]) << 45);
                out[8 + outpos] = ((in[17 + inpos]) >>> (29 - 10))
                        | ((in[18 + inpos]) << 10)
                        | ((in[19 + inpos]) << 39);
                out[9 + outpos] = ((in[19 + inpos]) >>> (29 - 4))
                        | ((in[20 + inpos]) << 4)
                        | ((in[21 + inpos]) << 33)
                        | ((in[22 + inpos]) << 62);
                out[10 + outpos] = ((in[22 + inpos]) >>> (29 - 27))
                        | ((in[23 + inpos]) << 27)
                        | ((in[24 + inpos]) << 56);
                out[11 + outpos] = ((in[24 + inpos]) >>> (29 - 21))
                        | ((in[25 + inpos]) << 21)
                        | ((in[26 + inpos]) << 50);
                out[12 + outpos] = ((in[26 + inpos]) >>> (29 - 15))
                        | ((in[27 + inpos]) << 15)
                        | ((in[28 + inpos]) << 44);
                out[13 + outpos] = ((in[28 + inpos]) >>> (29 - 9))
                        | ((in[29 + inpos]) << 9)
                        | ((in[30 + inpos]) << 38);
                out[14 + outpos] = ((in[30 + inpos]) >>> (29 - 3))
                        | ((in[31 + inpos]) << 3)
                        | ((in[32 + inpos]) << 32)
                        | ((in[33 + inpos]) << 61);
                out[15 + outpos] = ((in[33 + inpos]) >>> (29 - 26))
                        | ((in[34 + inpos]) << 26)
                        | ((in[35 + inpos]) << 55);
                out[16 + outpos] = ((in[35 + inpos]) >>> (29 - 20))
                        | ((in[36 + inpos]) << 20)
                        | ((in[37 + inpos]) << 49);
                out[17 + outpos] = ((in[37 + inpos]) >>> (29 - 14))
                        | ((in[38 + inpos]) << 14)
                        | ((in[39 + inpos]) << 43);
                out[18 + outpos] = ((in[39 + inpos]) >>> (29 - 8))
                        | ((in[40 + inpos]) << 8)
                        | ((in[41 + inpos]) << 37);
                out[19 + outpos] = ((in[41 + inpos]) >>> (29 - 2))
                        | ((in[42 + inpos]) << 2)
                        | ((in[43 + inpos]) << 31)
                        | ((in[44 + inpos]) << 60);
                out[20 + outpos] = ((in[44 + inpos]) >>> (29 - 25))
                        | ((in[45 + inpos]) << 25)
                        | ((in[46 + inpos]) << 54);
                out[21 + outpos] = ((in[46 + inpos]) >>> (29 - 19))
                        | ((in[47 + inpos]) << 19)
                        | ((in[48 + inpos]) << 48);
                out[22 + outpos] = ((in[48 + inpos]) >>> (29 - 13))
                        | ((in[49 + inpos]) << 13)
                        | ((in[50 + inpos]) << 42);
                out[23 + outpos] = ((in[50 + inpos]) >>> (29 - 7))
                        | ((in[51 + inpos]) << 7)
                        | ((in[52 + inpos]) << 36);
                out[24 + outpos] = ((in[52 + inpos]) >>> (29 - 1))
                        | ((in[53 + inpos]) << 1)
                        | ((in[54 + inpos]) << 30)
                        | ((in[55 + inpos]) << 59);
                out[25 + outpos] = ((in[55 + inpos]) >>> (29 - 24))
                        | ((in[56 + inpos]) << 24)
                        | ((in[57 + inpos]) << 53);
                out[26 + outpos] = ((in[57 + inpos]) >>> (29 - 18))
                        | ((in[58 + inpos]) << 18)
                        | ((in[59 + inpos]) << 47);
                out[27 + outpos] = ((in[59 + inpos]) >>> (29 - 12))
                        | ((in[60 + inpos]) << 12)
                        | ((in[61 + inpos]) << 41);
                out[28 + outpos] = ((in[61 + inpos]) >>> (29 - 6))
                        | ((in[62 + inpos]) << 6)
                        | ((in[63 + inpos]) << 35);
        }

        protected static void fastpackwithoutmask30(final long[] in, int inpos,
                final long[] out, int outpos) {
                out[outpos] = in[inpos] | ((in[1 + inpos]) << 30)
                        | ((in[2 + inpos]) << 60);
                out[1 + outpos] = ((in[2 + inpos]) >>> (30 - 26))
                        | ((in[3 + inpos]) << 26)
                        | ((in[4 + inpos]) << 56);
                out[2 + outpos] = ((in[4 + inpos]) >>> (30 - 22))
                        | ((in[5 + inpos]) << 22)
                        | ((in[6 + inpos]) << 52);
                out[3 + outpos] = ((in[6 + inpos]) >>> (30 - 18))
                        | ((in[7 + inpos]) << 18)
                        | ((in[8 + inpos]) << 48);
                out[4 + outpos] = ((in[8 + inpos]) >>> (30 - 14))
                        | ((in[9 + inpos]) << 14)
                        | ((in[10 + inpos]) << 44);
                out[5 + outpos] = ((in[10 + inpos]) >>> (30 - 10))
                        | ((in[11 + inpos]) << 10)
                        | ((in[12 + inpos]) << 40);
                out[6 + outpos] = ((in[12 + inpos]) >>> (30 - 6))
                        | ((in[13 + inpos]) << 6)
                        | ((in[14 + inpos]) << 36);
                out[7 + outpos] = ((in[14 + inpos]) >>> (30 - 2))
                        | ((in[15 + inpos]) << 2)
                        | ((in[16 + inpos]) << 32)
                        | ((in[17 + inpos]) << 62);
                out[8 + outpos] = ((in[17 + inpos]) >>> (30 - 28))
                        | ((in[18 + inpos]) << 28)
                        | ((in[19 + inpos]) << 58);
                out[9 + outpos] = ((in[19 + inpos]) >>> (30 - 24))
                        | ((in[20 + inpos]) << 24)
                        | ((in[21 + inpos]) << 54);
                out[10 + outpos] = ((in[21 + inpos]) >>> (30 - 20))
                        | ((in[22 + inpos]) << 20)
                        | ((in[23 + inpos]) << 50);
                out[11 + outpos] = ((in[23 + inpos]) >>> (30 - 16))
                        | ((in[24 + inpos]) << 16)
                        | ((in[25 + inpos]) << 46);
                out[12 + outpos] = ((in[25 + inpos]) >>> (30 - 12))
                        | ((in[26 + inpos]) << 12)
                        | ((in[27 + inpos]) << 42);
                out[13 + outpos] = ((in[27 + inpos]) >>> (30 - 8))
                        | ((in[28 + inpos]) << 8)
                        | ((in[29 + inpos]) << 38);
                out[14 + outpos] = ((in[29 + inpos]) >>> (30 - 4))
                        | ((in[30 + inpos]) << 4)
                        | ((in[31 + inpos]) << 34);
                out[15 + outpos] = in[32 + inpos]
                        | ((in[33 + inpos]) << 30)
                        | ((in[34 + inpos]) << 60);
                out[16 + outpos] = ((in[34 + inpos]) >>> (30 - 26))
                        | ((in[35 + inpos]) << 26)
                        | ((in[36 + inpos]) << 56);
                out[17 + outpos] = ((in[36 + inpos]) >>> (30 - 22))
                        | ((in[37 + inpos]) << 22)
                        | ((in[38 + inpos]) << 52);
                out[18 + outpos] = ((in[38 + inpos]) >>> (30 - 18))
                        | ((in[39 + inpos]) << 18)
                        | ((in[40 + inpos]) << 48);
                out[19 + outpos] = ((in[40 + inpos]) >>> (30 - 14))
                        | ((in[41 + inpos]) << 14)
                        | ((in[42 + inpos]) << 44);
                out[20 + outpos] = ((in[42 + inpos]) >>> (30 - 10))
                        | ((in[43 + inpos]) << 10)
                        | ((in[44 + inpos]) << 40);
                out[21 + outpos] = ((in[44 + inpos]) >>> (30 - 6))
                        | ((in[45 + inpos]) << 6)
                        | ((in[46 + inpos]) << 36);
                out[22 + outpos] = ((in[46 + inpos]) >>> (30 - 2))
                        | ((in[47 + inpos]) << 2)
                        | ((in[48 + inpos]) << 32)
                        | ((in[49 + inpos]) << 62);
                out[23 + outpos] = ((in[49 + inpos]) >>> (30 - 28))
                        | ((in[50 + inpos]) << 28)
                        | ((in[51 + inpos]) << 58);
                out[24 + outpos] = ((in[51 + inpos]) >>> (30 - 24))
                        | ((in[52 + inpos]) << 24)
                        | ((in[53 + inpos]) << 54);
                out[25 + outpos] = ((in[53 + inpos]) >>> (30 - 20))
                        | ((in[54 + inpos]) << 20)
                        | ((in[55 + inpos]) << 50);
                out[26 + outpos] = ((in[55 + inpos]) >>> (30 - 16))
                        | ((in[56 + inpos]) << 16)
                        | ((in[57 + inpos]) << 46);
                out[27 + outpos] = ((in[57 + inpos]) >>> (30 - 12))
                        | ((in[58 + inpos]) << 12)
                        | ((in[59 + inpos]) << 42);
                out[28 + outpos] = ((in[59 + inpos]) >>> (30 - 8))
                        | ((in[60 + inpos]) << 8)
                        | ((in[61 + inpos]) << 38);
                out[29 + outpos] = ((in[61 + inpos]) >>> (30 - 4))
                        | ((in[62 + inpos]) << 4)
                        | ((in[63 + inpos]) << 34);
        }

        protected static void fastpackwithoutmask31(final long[] in, int inpos,
                final long[] out, int outpos) {
                out[outpos] = in[inpos] | ((in[1 + inpos]) << 31)
                        | ((in[2 + inpos]) << 62);
                out[1 + outpos] = ((in[2 + inpos]) >>> (31 - 29))
                        | ((in[3 + inpos]) << 29)
                        | ((in[4 + inpos]) << 60);
                out[2 + outpos] = ((in[4 + inpos]) >>> (31 - 27))
                        | ((in[5 + inpos]) << 27)
                        | ((in[6 + inpos]) << 58);
                out[3 + outpos] = ((in[6 + inpos]) >>> (31 - 25))
                        | ((in[7 + inpos]) << 25)
                        | ((in[8 + inpos]) << 56);
                out[4 + outpos] = ((in[8 + inpos]) >>> (31 - 23))
                        | ((in[9 + inpos]) << 23)
                        | ((in[10 + inpos]) << 54);
                out[5 + outpos] = ((in[10 + inpos]) >>> (31 - 21))
                        | ((in[11 + inpos]) << 21)
                        | ((in[12 + inpos]) << 52);
                out[6 + outpos] = ((in[12 + inpos]) >>> (31 - 19))
                        | ((in[13 + inpos]) << 19)
                        | ((in[14 + inpos]) << 50);
                out[7 + outpos] = ((in[14 + inpos]) >>> (31 - 17))
                        | ((in[15 + inpos]) << 17)
                        | ((in[16 + inpos]) << 48);
                out[8 + outpos] = ((in[16 + inpos]) >>> (31 - 15))
                        | ((in[17 + inpos]) << 15)
                        | ((in[18 + inpos]) << 46);
                out[9 + outpos] = ((in[18 + inpos]) >>> (31 - 13))
                        | ((in[19 + inpos]) << 13)
                        | ((in[20 + inpos]) << 44);
                out[10 + outpos] = ((in[20 + inpos]) >>> (31 - 11))
                        | ((in[21 + inpos]) << 11)
                        | ((in[22 + inpos]) << 42);
                out[11 + outpos] = ((in[22 + inpos]) >>> (31 - 9))
                        | ((in[23 + inpos]) << 9)
                        | ((in[24 + inpos]) << 40);
                out[12 + outpos] = ((in[24 + inpos]) >>> (31 - 7))
                        | ((in[25 + inpos]) << 7)
                        | ((in[26 + inpos]) << 38);
                out[13 + outpos] = ((in[26 + inpos]) >>> (31 - 5))
                        | ((in[27 + inpos]) << 5)
                        | ((in[28 + inpos]) << 36);
                out[14 + outpos] = ((in[28 + inpos]) >>> (31 - 3))
                        | ((in[29 + inpos]) << 3)
                        | ((in[30 + inpos]) << 34);
                out[15 + outpos] = ((in[30 + inpos]) >>> (31 - 1))
                        | ((in[31 + inpos]) << 1)
                        | ((in[32 + inpos]) << 32)
                        | ((in[33 + inpos]) << 63);
                out[16 + outpos] = ((in[33 + inpos]) >>> (31 - 30))
                        | ((in[34 + inpos]) << 30)
                        | ((in[35 + inpos]) << 61);
                out[17 + outpos] = ((in[35 + inpos]) >>> (31 - 28))
                        | ((in[36 + inpos]) << 28)
                        | ((in[37 + inpos]) << 59);
                out[18 + outpos] = ((in[37 + inpos]) >>> (31 - 26))
                        | ((in[38 + inpos]) << 26)
                        | ((in[39 + inpos]) << 57);
                out[19 + outpos] = ((in[39 + inpos]) >>> (31 - 24))
                        | ((in[40 + inpos]) << 24)
                        | ((in[41 + inpos]) << 55);
                out[20 + outpos] = ((in[41 + inpos]) >>> (31 - 22))
                        | ((in[42 + inpos]) << 22)
                        | ((in[43 + inpos]) << 53);
                out[21 + outpos] = ((in[43 + inpos]) >>> (31 - 20))
                        | ((in[44 + inpos]) << 20)
                        | ((in[45 + inpos]) << 51);
                out[22 + outpos] = ((in[45 + inpos]) >>> (31 - 18))
                        | ((in[46 + inpos]) << 18)
                        | ((in[47 + inpos]) << 49);
                out[23 + outpos] = ((in[47 + inpos]) >>> (31 - 16))
                        | ((in[48 + inpos]) << 16)
                        | ((in[49 + inpos]) << 47);
                out[24 + outpos] = ((in[49 + inpos]) >>> (31 - 14))
                        | ((in[50 + inpos]) << 14)
                        | ((in[51 + inpos]) << 45);
                out[25 + outpos] = ((in[51 + inpos]) >>> (31 - 12))
                        | ((in[52 + inpos]) << 12)
                        | ((in[53 + inpos]) << 43);
                out[26 + outpos] = ((in[53 + inpos]) >>> (31 - 10))
                        | ((in[54 + inpos]) << 10)
                        | ((in[55 + inpos]) << 41);
                out[27 + outpos] = ((in[55 + inpos]) >>> (31 - 8))
                        | ((in[56 + inpos]) << 8)
                        | ((in[57 + inpos]) << 39);
                out[28 + outpos] = ((in[57 + inpos]) >>> (31 - 6))
                        | ((in[58 + inpos]) << 6)
                        | ((in[59 + inpos]) << 37);
                out[29 + outpos] = ((in[59 + inpos]) >>> (31 - 4))
                        | ((in[60 + inpos]) << 4)
                        | ((in[61 + inpos]) << 35);
                out[30 + outpos] = ((in[61 + inpos]) >>> (31 - 2))
                        | ((in[62 + inpos]) << 2)
                        | ((in[63 + inpos]) << 33);
        }

        protected static void fastpackwithoutmask32(final long[] in, int inpos,
                final long[] out, int outpos) {
                out[outpos] = in[inpos] | ((in[1 + inpos]) << 32);
                out[1 + outpos] = in[2 + inpos]
                        | ((in[3 + inpos]) << 32);
                out[2 + outpos] = in[4 + inpos]
                        | ((in[5 + inpos]) << 32);
                out[3 + outpos] = in[6 + inpos]
                        | ((in[7 + inpos]) << 32);
                out[4 + outpos] = in[8 + inpos]
                        | ((in[9 + inpos]) << 32);
                out[5 + outpos] = in[10 + inpos]
                        | ((in[11 + inpos]) << 32);
                out[6 + outpos] = in[12 + inpos]
                        | ((in[13 + inpos]) << 32);
                out[7 + outpos] = in[14 + inpos]
                        | ((in[15 + inpos]) << 32);
                out[8 + outpos] = in[16 + inpos]
                        | ((in[17 + inpos]) << 32);
                out[9 + outpos] = in[18 + inpos]
                        | ((in[19 + inpos]) << 32);
                out[10 + outpos] = in[20 + inpos]
                        | ((in[21 + inpos]) << 32);
                out[11 + outpos] = in[22 + inpos]
                        | ((in[23 + inpos]) << 32);
                out[12 + outpos] = in[24 + inpos]
                        | ((in[25 + inpos]) << 32);
                out[13 + outpos] = in[26 + inpos]
                        | ((in[27 + inpos]) << 32);
                out[14 + outpos] = in[28 + inpos]
                        | ((in[29 + inpos]) << 32);
                out[15 + outpos] = in[30 + inpos]
                        | ((in[31 + inpos]) << 32);
                out[16 + outpos] = in[32 + inpos]
                        | ((in[33 + inpos]) << 32);
                out[17 + outpos] = in[34 + inpos]
                        | ((in[35 + inpos]) << 32);
                out[18 + outpos] = in[36 + inpos]
                        | ((in[37 + inpos]) << 32);
                out[19 + outpos] = in[38 + inpos]
                        | ((in[39 + inpos]) << 32);
                out[20 + outpos] = in[40 + inpos]
                        | ((in[41 + inpos]) << 32);
                out[21 + outpos] = in[42 + inpos]
                        | ((in[43 + inpos]) << 32);
                out[22 + outpos] = in[44 + inpos]
                        | ((in[45 + inpos]) << 32);
                out[23 + outpos] = in[46 + inpos]
                        | ((in[47 + inpos]) << 32);
                out[24 + outpos] = in[48 + inpos]
                        | ((in[49 + inpos]) << 32);
                out[25 + outpos] = in[50 + inpos]
                        | ((in[51 + inpos]) << 32);
                out[26 + outpos] = in[52 + inpos]
                        | ((in[53 + inpos]) << 32);
                out[27 + outpos] = in[54 + inpos]
                        | ((in[55 + inpos]) << 32);
                out[28 + outpos] = in[56 + inpos]
                        | ((in[57 + inpos]) << 32);
                out[29 + outpos] = in[58 + inpos]
                        | ((in[59 + inpos]) << 32);
                out[30 + outpos] = in[60 + inpos]
                        | ((in[61 + inpos]) << 32);
                out[31 + outpos] = in[62 + inpos]
                        | ((in[63 + inpos]) << 32);
        }

        protected static void fastpackwithoutmask33(final long[] in, int inpos,
                final long[] out, int outpos) {
                out[outpos] = in[inpos] | ((in[1 + inpos]) << 33);
                out[1 + outpos] = ((in[1 + inpos]) >>> (33 - 2))
                        | ((in[2 + inpos]) << 2)
                        | ((in[3 + inpos]) << 35);
                out[2 + outpos] = ((in[3 + inpos]) >>> (33 - 4))
                        | ((in[4 + inpos]) << 4)
                        | ((in[5 + inpos]) << 37);
                out[3 + outpos] = ((in[5 + inpos]) >>> (33 - 6))
                        | ((in[6 + inpos]) << 6)
                        | ((in[7 + inpos]) << 39);
                out[4 + outpos] = ((in[7 + inpos]) >>> (33 - 8))
                        | ((in[8 + inpos]) << 8)
                        | ((in[9 + inpos]) << 41);
                out[5 + outpos] = ((in[9 + inpos]) >>> (33 - 10))
                        | ((in[10 + inpos]) << 10)
                        | ((in[11 + inpos]) << 43);
                out[6 + outpos] = ((in[11 + inpos]) >>> (33 - 12))
                        | ((in[12 + inpos]) << 12)
                        | ((in[13 + inpos]) << 45);
                out[7 + outpos] = ((in[13 + inpos]) >>> (33 - 14))
                        | ((in[14 + inpos]) << 14)
                        | ((in[15 + inpos]) << 47);
                out[8 + outpos] = ((in[15 + inpos]) >>> (33 - 16))
                        | ((in[16 + inpos]) << 16)
                        | ((in[17 + inpos]) << 49);
                out[9 + outpos] = ((in[17 + inpos]) >>> (33 - 18))
                        | ((in[18 + inpos]) << 18)
                        | ((in[19 + inpos]) << 51);
                out[10 + outpos] = ((in[19 + inpos]) >>> (33 - 20))
                        | ((in[20 + inpos]) << 20)
                        | ((in[21 + inpos]) << 53);
                out[11 + outpos] = ((in[21 + inpos]) >>> (33 - 22))
                        | ((in[22 + inpos]) << 22)
                        | ((in[23 + inpos]) << 55);
                out[12 + outpos] = ((in[23 + inpos]) >>> (33 - 24))
                        | ((in[24 + inpos]) << 24)
                        | ((in[25 + inpos]) << 57);
                out[13 + outpos] = ((in[25 + inpos]) >>> (33 - 26))
                        | ((in[26 + inpos]) << 26)
                        | ((in[27 + inpos]) << 59);
                out[14 + outpos] = ((in[27 + inpos]) >>> (33 - 28))
                        | ((in[28 + inpos]) << 28)
                        | ((in[29 + inpos]) << 61);
                out[15 + outpos] = ((in[29 + inpos]) >>> (33 - 30))
                        | ((in[30 + inpos]) << 30)
                        | ((in[31 + inpos]) << 63);
                out[16 + outpos] = ((in[31 + inpos]) >>> (33 - 32))
                        | ((in[32 + inpos]) << 32);
                out[17 + outpos] = ((in[32 + inpos]) >>> (33 - 1))
                        | ((in[33 + inpos]) << 1)
                        | ((in[34 + inpos]) << 34);
                out[18 + outpos] = ((in[34 + inpos]) >>> (33 - 3))
                        | ((in[35 + inpos]) << 3)
                        | ((in[36 + inpos]) << 36);
                out[19 + outpos] = ((in[36 + inpos]) >>> (33 - 5))
                        | ((in[37 + inpos]) << 5)
                        | ((in[38 + inpos]) << 38);
                out[20 + outpos] = ((in[38 + inpos]) >>> (33 - 7))
                        | ((in[39 + inpos]) << 7)
                        | ((in[40 + inpos]) << 40);
                out[21 + outpos] = ((in[40 + inpos]) >>> (33 - 9))
                        | ((in[41 + inpos]) << 9)
                        | ((in[42 + inpos]) << 42);
                out[22 + outpos] = ((in[42 + inpos]) >>> (33 - 11))
                        | ((in[43 + inpos]) << 11)
                        | ((in[44 + inpos]) << 44);
                out[23 + outpos] = ((in[44 + inpos]) >>> (33 - 13))
                        | ((in[45 + inpos]) << 13)
                        | ((in[46 + inpos]) << 46);
                out[24 + outpos] = ((in[46 + inpos]) >>> (33 - 15))
                        | ((in[47 + inpos]) << 15)
                        | ((in[48 + inpos]) << 48);
                out[25 + outpos] = ((in[48 + inpos]) >>> (33 - 17))
                        | ((in[49 + inpos]) << 17)
                        | ((in[50 + inpos]) << 50);
                out[26 + outpos] = ((in[50 + inpos]) >>> (33 - 19))
                        | ((in[51 + inpos]) << 19)
                        | ((in[52 + inpos]) << 52);
                out[27 + outpos] = ((in[52 + inpos]) >>> (33 - 21))
                        | ((in[53 + inpos]) << 21)
                        | ((in[54 + inpos]) << 54);
                out[28 + outpos] = ((in[54 + inpos]) >>> (33 - 23))
                        | ((in[55 + inpos]) << 23)
                        | ((in[56 + inpos]) << 56);
                out[29 + outpos] = ((in[56 + inpos]) >>> (33 - 25))
                        | ((in[57 + inpos]) << 25)
                        | ((in[58 + inpos]) << 58);
                out[30 + outpos] = ((in[58 + inpos]) >>> (33 - 27))
                        | ((in[59 + inpos]) << 27)
                        | ((in[60 + inpos]) << 60);
                out[31 + outpos] = ((in[60 + inpos]) >>> (33 - 29))
                        | ((in[61 + inpos]) << 29)
                        | ((in[62 + inpos]) << 62);
                out[32 + outpos] = ((in[62 + inpos]) >>> (33 - 31))
                        | ((in[63 + inpos]) << 31);
        }

        protected static void fastpackwithoutmask34(final long[] in, int inpos,
                final long[] out, int outpos) {
                out[outpos] = in[inpos] | ((in[1 + inpos]) << 34);
                out[1 + outpos] = ((in[1 + inpos]) >>> (34 - 4))
                        | ((in[2 + inpos]) << 4)
                        | ((in[3 + inpos]) << 38);
                out[2 + outpos] = ((in[3 + inpos]) >>> (34 - 8))
                        | ((in[4 + inpos]) << 8)
                        | ((in[5 + inpos]) << 42);
                out[3 + outpos] = ((in[5 + inpos]) >>> (34 - 12))
                        | ((in[6 + inpos]) << 12)
                        | ((in[7 + inpos]) << 46);
                out[4 + outpos] = ((in[7 + inpos]) >>> (34 - 16))
                        | ((in[8 + inpos]) << 16)
                        | ((in[9 + inpos]) << 50);
                out[5 + outpos] = ((in[9 + inpos]) >>> (34 - 20))
                        | ((in[10 + inpos]) << 20)
                        | ((in[11 + inpos]) << 54);
                out[6 + outpos] = ((in[11 + inpos]) >>> (34 - 24))
                        | ((in[12 + inpos]) << 24)
                        | ((in[13 + inpos]) << 58);
                out[7 + outpos] = ((in[13 + inpos]) >>> (34 - 28))
                        | ((in[14 + inpos]) << 28)
                        | ((in[15 + inpos]) << 62);
                out[8 + outpos] = ((in[15 + inpos]) >>> (34 - 32))
                        | ((in[16 + inpos]) << 32);
                out[9 + outpos] = ((in[16 + inpos]) >>> (34 - 2))
                        | ((in[17 + inpos]) << 2)
                        | ((in[18 + inpos]) << 36);
                out[10 + outpos] = ((in[18 + inpos]) >>> (34 - 6))
                        | ((in[19 + inpos]) << 6)
                        | ((in[20 + inpos]) << 40);
                out[11 + outpos] = ((in[20 + inpos]) >>> (34 - 10))
                        | ((in[21 + inpos]) << 10)
                        | ((in[22 + inpos]) << 44);
                out[12 + outpos] = ((in[22 + inpos]) >>> (34 - 14))
                        | ((in[23 + inpos]) << 14)
                        | ((in[24 + inpos]) << 48);
                out[13 + outpos] = ((in[24 + inpos]) >>> (34 - 18))
                        | ((in[25 + inpos]) << 18)
                        | ((in[26 + inpos]) << 52);
                out[14 + outpos] = ((in[26 + inpos]) >>> (34 - 22))
                        | ((in[27 + inpos]) << 22)
                        | ((in[28 + inpos]) << 56);
                out[15 + outpos] = ((in[28 + inpos]) >>> (34 - 26))
                        | ((in[29 + inpos]) << 26)
                        | ((in[30 + inpos]) << 60);
                out[16 + outpos] = ((in[30 + inpos]) >>> (34 - 30))
                        | ((in[31 + inpos]) << 30);
                out[17 + outpos] = in[32 + inpos]
                        | ((in[33 + inpos]) << 34);
                out[18 + outpos] = ((in[33 + inpos]) >>> (34 - 4))
                        | ((in[34 + inpos]) << 4)
                        | ((in[35 + inpos]) << 38);
                out[19 + outpos] = ((in[35 + inpos]) >>> (34 - 8))
                        | ((in[36 + inpos]) << 8)
                        | ((in[37 + inpos]) << 42);
                out[20 + outpos] = ((in[37 + inpos]) >>> (34 - 12))
                        | ((in[38 + inpos]) << 12)
                        | ((in[39 + inpos]) << 46);
                out[21 + outpos] = ((in[39 + inpos]) >>> (34 - 16))
                        | ((in[40 + inpos]) << 16)
                        | ((in[41 + inpos]) << 50);
                out[22 + outpos] = ((in[41 + inpos]) >>> (34 - 20))
                        | ((in[42 + inpos]) << 20)
                        | ((in[43 + inpos]) << 54);
                out[23 + outpos] = ((in[43 + inpos]) >>> (34 - 24))
                        | ((in[44 + inpos]) << 24)
                        | ((in[45 + inpos]) << 58);
                out[24 + outpos] = ((in[45 + inpos]) >>> (34 - 28))
                        | ((in[46 + inpos]) << 28)
                        | ((in[47 + inpos]) << 62);
                out[25 + outpos] = ((in[47 + inpos]) >>> (34 - 32))
                        | ((in[48 + inpos]) << 32);
                out[26 + outpos] = ((in[48 + inpos]) >>> (34 - 2))
                        | ((in[49 + inpos]) << 2)
                        | ((in[50 + inpos]) << 36);
                out[27 + outpos] = ((in[50 + inpos]) >>> (34 - 6))
                        | ((in[51 + inpos]) << 6)
                        | ((in[52 + inpos]) << 40);
                out[28 + outpos] = ((in[52 + inpos]) >>> (34 - 10))
                        | ((in[53 + inpos]) << 10)
                        | ((in[54 + inpos]) << 44);
                out[29 + outpos] = ((in[54 + inpos]) >>> (34 - 14))
                        | ((in[55 + inpos]) << 14)
                        | ((in[56 + inpos]) << 48);
                out[30 + outpos] = ((in[56 + inpos]) >>> (34 - 18))
                        | ((in[57 + inpos]) << 18)
                        | ((in[58 + inpos]) << 52);
                out[31 + outpos] = ((in[58 + inpos]) >>> (34 - 22))
                        | ((in[59 + inpos]) << 22)
                        | ((in[60 + inpos]) << 56);
                out[32 + outpos] = ((in[60 + inpos]) >>> (34 - 26))
                        | ((in[61 + inpos]) << 26)
                        | ((in[62 + inpos]) << 60);
                out[33 + outpos] = ((in[62 + inpos]) >>> (34 - 30))
                        | ((in[63 + inpos]) << 30);
        }

        protected static void fastpackwithoutmask35(final long[] in, int inpos,
                final long[] out, int outpos) {
                out[outpos] = in[inpos] | ((in[1 + inpos]) << 35);
                out[1 + outpos] = ((in[1 + inpos]) >>> (35 - 6))
                        | ((in[2 + inpos]) << 6)
                        | ((in[3 + inpos]) << 41);
                out[2 + outpos] = ((in[3 + inpos]) >>> (35 - 12))
                        | ((in[4 + inpos]) << 12)
                        | ((in[5 + inpos]) << 47);
                out[3 + outpos] = ((in[5 + inpos]) >>> (35 - 18))
                        | ((in[6 + inpos]) << 18)
                        | ((in[7 + inpos]) << 53);
                out[4 + outpos] = ((in[7 + inpos]) >>> (35 - 24))
                        | ((in[8 + inpos]) << 24)
                        | ((in[9 + inpos]) << 59);
                out[5 + outpos] = ((in[9 + inpos]) >>> (35 - 30))
                        | ((in[10 + inpos]) << 30);
                out[6 + outpos] = ((in[10 + inpos]) >>> (35 - 1))
                        | ((in[11 + inpos]) << 1)
                        | ((in[12 + inpos]) << 36);
                out[7 + outpos] = ((in[12 + inpos]) >>> (35 - 7))
                        | ((in[13 + inpos]) << 7)
                        | ((in[14 + inpos]) << 42);
                out[8 + outpos] = ((in[14 + inpos]) >>> (35 - 13))
                        | ((in[15 + inpos]) << 13)
                        | ((in[16 + inpos]) << 48);
                out[9 + outpos] = ((in[16 + inpos]) >>> (35 - 19))
                        | ((in[17 + inpos]) << 19)
                        | ((in[18 + inpos]) << 54);
                out[10 + outpos] = ((in[18 + inpos]) >>> (35 - 25))
                        | ((in[19 + inpos]) << 25)
                        | ((in[20 + inpos]) << 60);
                out[11 + outpos] = ((in[20 + inpos]) >>> (35 - 31))
                        | ((in[21 + inpos]) << 31);
                out[12 + outpos] = ((in[21 + inpos]) >>> (35 - 2))
                        | ((in[22 + inpos]) << 2)
                        | ((in[23 + inpos]) << 37);
                out[13 + outpos] = ((in[23 + inpos]) >>> (35 - 8))
                        | ((in[24 + inpos]) << 8)
                        | ((in[25 + inpos]) << 43);
                out[14 + outpos] = ((in[25 + inpos]) >>> (35 - 14))
                        | ((in[26 + inpos]) << 14)
                        | ((in[27 + inpos]) << 49);
                out[15 + outpos] = ((in[27 + inpos]) >>> (35 - 20))
                        | ((in[28 + inpos]) << 20)
                        | ((in[29 + inpos]) << 55);
                out[16 + outpos] = ((in[29 + inpos]) >>> (35 - 26))
                        | ((in[30 + inpos]) << 26)
                        | ((in[31 + inpos]) << 61);
                out[17 + outpos] = ((in[31 + inpos]) >>> (35 - 32))
                        | ((in[32 + inpos]) << 32);
                out[18 + outpos] = ((in[32 + inpos]) >>> (35 - 3))
                        | ((in[33 + inpos]) << 3)
                        | ((in[34 + inpos]) << 38);
                out[19 + outpos] = ((in[34 + inpos]) >>> (35 - 9))
                        | ((in[35 + inpos]) << 9)
                        | ((in[36 + inpos]) << 44);
                out[20 + outpos] = ((in[36 + inpos]) >>> (35 - 15))
                        | ((in[37 + inpos]) << 15)
                        | ((in[38 + inpos]) << 50);
                out[21 + outpos] = ((in[38 + inpos]) >>> (35 - 21))
                        | ((in[39 + inpos]) << 21)
                        | ((in[40 + inpos]) << 56);
                out[22 + outpos] = ((in[40 + inpos]) >>> (35 - 27))
                        | ((in[41 + inpos]) << 27)
                        | ((in[42 + inpos]) << 62);
                out[23 + outpos] = ((in[42 + inpos]) >>> (35 - 33))
                        | ((in[43 + inpos]) << 33);
                out[24 + outpos] = ((in[43 + inpos]) >>> (35 - 4))
                        | ((in[44 + inpos]) << 4)
                        | ((in[45 + inpos]) << 39);
                out[25 + outpos] = ((in[45 + inpos]) >>> (35 - 10))
                        | ((in[46 + inpos]) << 10)
                        | ((in[47 + inpos]) << 45);
                out[26 + outpos] = ((in[47 + inpos]) >>> (35 - 16))
                        | ((in[48 + inpos]) << 16)
                        | ((in[49 + inpos]) << 51);
                out[27 + outpos] = ((in[49 + inpos]) >>> (35 - 22))
                        | ((in[50 + inpos]) << 22)
                        | ((in[51 + inpos]) << 57);
                out[28 + outpos] = ((in[51 + inpos]) >>> (35 - 28))
                        | ((in[52 + inpos]) << 28)
                        | ((in[53 + inpos]) << 63);
                out[29 + outpos] = ((in[53 + inpos]) >>> (35 - 34))
                        | ((in[54 + inpos]) << 34);
                out[30 + outpos] = ((in[54 + inpos]) >>> (35 - 5))
                        | ((in[55 + inpos]) << 5)
                        | ((in[56 + inpos]) << 40);
                out[31 + outpos] = ((in[56 + inpos]) >>> (35 - 11))
                        | ((in[57 + inpos]) << 11)
                        | ((in[58 + inpos]) << 46);
                out[32 + outpos] = ((in[58 + inpos]) >>> (35 - 17))
                        | ((in[59 + inpos]) << 17)
                        | ((in[60 + inpos]) << 52);
                out[33 + outpos] = ((in[60 + inpos]) >>> (35 - 23))
                        | ((in[61 + inpos]) << 23)
                        | ((in[62 + inpos]) << 58);
                out[34 + outpos] = ((in[62 + inpos]) >>> (35 - 29))
                        | ((in[63 + inpos]) << 29);
        }

        protected static void fastpackwithoutmask36(final long[] in, int inpos,
                final long[] out, int outpos) {
                out[outpos] = in[inpos] | ((in[1 + inpos]) << 36);
                out[1 + outpos] = ((in[1 + inpos]) >>> (36 - 8))
                        | ((in[2 + inpos]) << 8)
                        | ((in[3 + inpos]) << 44);
                out[2 + outpos] = ((in[3 + inpos]) >>> (36 - 16))
                        | ((in[4 + inpos]) << 16)
                        | ((in[5 + inpos]) << 52);
                out[3 + outpos] = ((in[5 + inpos]) >>> (36 - 24))
                        | ((in[6 + inpos]) << 24)
                        | ((in[7 + inpos]) << 60);
                out[4 + outpos] = ((in[7 + inpos]) >>> (36 - 32))
                        | ((in[8 + inpos]) << 32);
                out[5 + outpos] = ((in[8 + inpos]) >>> (36 - 4))
                        | ((in[9 + inpos]) << 4)
                        | ((in[10 + inpos]) << 40);
                out[6 + outpos] = ((in[10 + inpos]) >>> (36 - 12))
                        | ((in[11 + inpos]) << 12)
                        | ((in[12 + inpos]) << 48);
                out[7 + outpos] = ((in[12 + inpos]) >>> (36 - 20))
                        | ((in[13 + inpos]) << 20)
                        | ((in[14 + inpos]) << 56);
                out[8 + outpos] = ((in[14 + inpos]) >>> (36 - 28))
                        | ((in[15 + inpos]) << 28);
                out[9 + outpos] = in[16 + inpos]
                        | ((in[17 + inpos]) << 36);
                out[10 + outpos] = ((in[17 + inpos]) >>> (36 - 8))
                        | ((in[18 + inpos]) << 8)
                        | ((in[19 + inpos]) << 44);
                out[11 + outpos] = ((in[19 + inpos]) >>> (36 - 16))
                        | ((in[20 + inpos]) << 16)
                        | ((in[21 + inpos]) << 52);
                out[12 + outpos] = ((in[21 + inpos]) >>> (36 - 24))
                        | ((in[22 + inpos]) << 24)
                        | ((in[23 + inpos]) << 60);
                out[13 + outpos] = ((in[23 + inpos]) >>> (36 - 32))
                        | ((in[24 + inpos]) << 32);
                out[14 + outpos] = ((in[24 + inpos]) >>> (36 - 4))
                        | ((in[25 + inpos]) << 4)
                        | ((in[26 + inpos]) << 40);
                out[15 + outpos] = ((in[26 + inpos]) >>> (36 - 12))
                        | ((in[27 + inpos]) << 12)
                        | ((in[28 + inpos]) << 48);
                out[16 + outpos] = ((in[28 + inpos]) >>> (36 - 20))
                        | ((in[29 + inpos]) << 20)
                        | ((in[30 + inpos]) << 56);
                out[17 + outpos] = ((in[30 + inpos]) >>> (36 - 28))
                        | ((in[31 + inpos]) << 28);
                out[18 + outpos] = in[32 + inpos]
                        | ((in[33 + inpos]) << 36);
                out[19 + outpos] = ((in[33 + inpos]) >>> (36 - 8))
                        | ((in[34 + inpos]) << 8)
                        | ((in[35 + inpos]) << 44);
                out[20 + outpos] = ((in[35 + inpos]) >>> (36 - 16))
                        | ((in[36 + inpos]) << 16)
                        | ((in[37 + inpos]) << 52);
                out[21 + outpos] = ((in[37 + inpos]) >>> (36 - 24))
                        | ((in[38 + inpos]) << 24)
                        | ((in[39 + inpos]) << 60);
                out[22 + outpos] = ((in[39 + inpos]) >>> (36 - 32))
                        | ((in[40 + inpos]) << 32);
                out[23 + outpos] = ((in[40 + inpos]) >>> (36 - 4))
                        | ((in[41 + inpos]) << 4)
                        | ((in[42 + inpos]) << 40);
                out[24 + outpos] = ((in[42 + inpos]) >>> (36 - 12))
                        | ((in[43 + inpos]) << 12)
                        | ((in[44 + inpos]) << 48);
                out[25 + outpos] = ((in[44 + inpos]) >>> (36 - 20))
                        | ((in[45 + inpos]) << 20)
                        | ((in[46 + inpos]) << 56);
                out[26 + outpos] = ((in[46 + inpos]) >>> (36 - 28))
                        | ((in[47 + inpos]) << 28);
                out[27 + outpos] = in[48 + inpos]
                        | ((in[49 + inpos]) << 36);
                out[28 + outpos] = ((in[49 + inpos]) >>> (36 - 8))
                        | ((in[50 + inpos]) << 8)
                        | ((in[51 + inpos]) << 44);
                out[29 + outpos] = ((in[51 + inpos]) >>> (36 - 16))
                        | ((in[52 + inpos]) << 16)
                        | ((in[53 + inpos]) << 52);
                out[30 + outpos] = ((in[53 + inpos]) >>> (36 - 24))
                        | ((in[54 + inpos]) << 24)
                        | ((in[55 + inpos]) << 60);
                out[31 + outpos] = ((in[55 + inpos]) >>> (36 - 32))
                        | ((in[56 + inpos]) << 32);
                out[32 + outpos] = ((in[56 + inpos]) >>> (36 - 4))
                        | ((in[57 + inpos]) << 4)
                        | ((in[58 + inpos]) << 40);
                out[33 + outpos] = ((in[58 + inpos]) >>> (36 - 12))
                        | ((in[59 + inpos]) << 12)
                        | ((in[60 + inpos]) << 48);
                out[34 + outpos] = ((in[60 + inpos]) >>> (36 - 20))
                        | ((in[61 + inpos]) << 20)
                        | ((in[62 + inpos]) << 56);
                out[35 + outpos] = ((in[62 + inpos]) >>> (36 - 28))
                        | ((in[63 + inpos]) << 28);
        }

        protected static void fastpackwithoutmask37(final long[] in, int inpos,
                final long[] out, int outpos) {
                out[outpos] = in[inpos] | ((in[1 + inpos]) << 37);
                out[1 + outpos] = ((in[1 + inpos]) >>> (37 - 10))
                        | ((in[2 + inpos]) << 10)
                        | ((in[3 + inpos]) << 47);
                out[2 + outpos] = ((in[3 + inpos]) >>> (37 - 20))
                        | ((in[4 + inpos]) << 20)
                        | ((in[5 + inpos]) << 57);
                out[3 + outpos] = ((in[5 + inpos]) >>> (37 - 30))
                        | ((in[6 + inpos]) << 30);
                out[4 + outpos] = ((in[6 + inpos]) >>> (37 - 3))
                        | ((in[7 + inpos]) << 3)
                        | ((in[8 + inpos]) << 40);
                out[5 + outpos] = ((in[8 + inpos]) >>> (37 - 13))
                        | ((in[9 + inpos]) << 13)
                        | ((in[10 + inpos]) << 50);
                out[6 + outpos] = ((in[10 + inpos]) >>> (37 - 23))
                        | ((in[11 + inpos]) << 23)
                        | ((in[12 + inpos]) << 60);
                out[7 + outpos] = ((in[12 + inpos]) >>> (37 - 33))
                        | ((in[13 + inpos]) << 33);
                out[8 + outpos] = ((in[13 + inpos]) >>> (37 - 6))
                        | ((in[14 + inpos]) << 6)
                        | ((in[15 + inpos]) << 43);
                out[9 + outpos] = ((in[15 + inpos]) >>> (37 - 16))
                        | ((in[16 + inpos]) << 16)
                        | ((in[17 + inpos]) << 53);
                out[10 + outpos] = ((in[17 + inpos]) >>> (37 - 26))
                        | ((in[18 + inpos]) << 26)
                        | ((in[19 + inpos]) << 63);
                out[11 + outpos] = ((in[19 + inpos]) >>> (37 - 36))
                        | ((in[20 + inpos]) << 36);
                out[12 + outpos] = ((in[20 + inpos]) >>> (37 - 9))
                        | ((in[21 + inpos]) << 9)
                        | ((in[22 + inpos]) << 46);
                out[13 + outpos] = ((in[22 + inpos]) >>> (37 - 19))
                        | ((in[23 + inpos]) << 19)
                        | ((in[24 + inpos]) << 56);
                out[14 + outpos] = ((in[24 + inpos]) >>> (37 - 29))
                        | ((in[25 + inpos]) << 29);
                out[15 + outpos] = ((in[25 + inpos]) >>> (37 - 2))
                        | ((in[26 + inpos]) << 2)
                        | ((in[27 + inpos]) << 39);
                out[16 + outpos] = ((in[27 + inpos]) >>> (37 - 12))
                        | ((in[28 + inpos]) << 12)
                        | ((in[29 + inpos]) << 49);
                out[17 + outpos] = ((in[29 + inpos]) >>> (37 - 22))
                        | ((in[30 + inpos]) << 22)
                        | ((in[31 + inpos]) << 59);
                out[18 + outpos] = ((in[31 + inpos]) >>> (37 - 32))
                        | ((in[32 + inpos]) << 32);
                out[19 + outpos] = ((in[32 + inpos]) >>> (37 - 5))
                        | ((in[33 + inpos]) << 5)
                        | ((in[34 + inpos]) << 42);
                out[20 + outpos] = ((in[34 + inpos]) >>> (37 - 15))
                        | ((in[35 + inpos]) << 15)
                        | ((in[36 + inpos]) << 52);
                out[21 + outpos] = ((in[36 + inpos]) >>> (37 - 25))
                        | ((in[37 + inpos]) << 25)
                        | ((in[38 + inpos]) << 62);
                out[22 + outpos] = ((in[38 + inpos]) >>> (37 - 35))
                        | ((in[39 + inpos]) << 35);
                out[23 + outpos] = ((in[39 + inpos]) >>> (37 - 8))
                        | ((in[40 + inpos]) << 8)
                        | ((in[41 + inpos]) << 45);
                out[24 + outpos] = ((in[41 + inpos]) >>> (37 - 18))
                        | ((in[42 + inpos]) << 18)
                        | ((in[43 + inpos]) << 55);
                out[25 + outpos] = ((in[43 + inpos]) >>> (37 - 28))
                        | ((in[44 + inpos]) << 28);
                out[26 + outpos] = ((in[44 + inpos]) >>> (37 - 1))
                        | ((in[45 + inpos]) << 1)
                        | ((in[46 + inpos]) << 38);
                out[27 + outpos] = ((in[46 + inpos]) >>> (37 - 11))
                        | ((in[47 + inpos]) << 11)
                        | ((in[48 + inpos]) << 48);
                out[28 + outpos] = ((in[48 + inpos]) >>> (37 - 21))
                        | ((in[49 + inpos]) << 21)
                        | ((in[50 + inpos]) << 58);
                out[29 + outpos] = ((in[50 + inpos]) >>> (37 - 31))
                        | ((in[51 + inpos]) << 31);
                out[30 + outpos] = ((in[51 + inpos]) >>> (37 - 4))
                        | ((in[52 + inpos]) << 4)
                        | ((in[53 + inpos]) << 41);
                out[31 + outpos] = ((in[53 + inpos]) >>> (37 - 14))
                        | ((in[54 + inpos]) << 14)
                        | ((in[55 + inpos]) << 51);
                out[32 + outpos] = ((in[55 + inpos]) >>> (37 - 24))
                        | ((in[56 + inpos]) << 24)
                        | ((in[57 + inpos]) << 61);
                out[33 + outpos] = ((in[57 + inpos]) >>> (37 - 34))
                        | ((in[58 + inpos]) << 34);
                out[34 + outpos] = ((in[58 + inpos]) >>> (37 - 7))
                        | ((in[59 + inpos]) << 7)
                        | ((in[60 + inpos]) << 44);
                out[35 + outpos] = ((in[60 + inpos]) >>> (37 - 17))
                        | ((in[61 + inpos]) << 17)
                        | ((in[62 + inpos]) << 54);
                out[36 + outpos] = ((in[62 + inpos]) >>> (37 - 27))
                        | ((in[63 + inpos]) << 27);
        }

        protected static void fastpackwithoutmask38(final long[] in, int inpos,
                final long[] out, int outpos) {
                out[outpos] = in[inpos] | ((in[1 + inpos]) << 38);
                out[1 + outpos] = ((in[1 + inpos]) >>> (38 - 12))
                        | ((in[2 + inpos]) << 12)
                        | ((in[3 + inpos]) << 50);
                out[2 + outpos] = ((in[3 + inpos]) >>> (38 - 24))
                        | ((in[4 + inpos]) << 24)
                        | ((in[5 + inpos]) << 62);
                out[3 + outpos] = ((in[5 + inpos]) >>> (38 - 36))
                        | ((in[6 + inpos]) << 36);
                out[4 + outpos] = ((in[6 + inpos]) >>> (38 - 10))
                        | ((in[7 + inpos]) << 10)
                        | ((in[8 + inpos]) << 48);
                out[5 + outpos] = ((in[8 + inpos]) >>> (38 - 22))
                        | ((in[9 + inpos]) << 22)
                        | ((in[10 + inpos]) << 60);
                out[6 + outpos] = ((in[10 + inpos]) >>> (38 - 34))
                        | ((in[11 + inpos]) << 34);
                out[7 + outpos] = ((in[11 + inpos]) >>> (38 - 8))
                        | ((in[12 + inpos]) << 8)
                        | ((in[13 + inpos]) << 46);
                out[8 + outpos] = ((in[13 + inpos]) >>> (38 - 20))
                        | ((in[14 + inpos]) << 20)
                        | ((in[15 + inpos]) << 58);
                out[9 + outpos] = ((in[15 + inpos]) >>> (38 - 32))
                        | ((in[16 + inpos]) << 32);
                out[10 + outpos] = ((in[16 + inpos]) >>> (38 - 6))
                        | ((in[17 + inpos]) << 6)
                        | ((in[18 + inpos]) << 44);
                out[11 + outpos] = ((in[18 + inpos]) >>> (38 - 18))
                        | ((in[19 + inpos]) << 18)
                        | ((in[20 + inpos]) << 56);
                out[12 + outpos] = ((in[20 + inpos]) >>> (38 - 30))
                        | ((in[21 + inpos]) << 30);
                out[13 + outpos] = ((in[21 + inpos]) >>> (38 - 4))
                        | ((in[22 + inpos]) << 4)
                        | ((in[23 + inpos]) << 42);
                out[14 + outpos] = ((in[23 + inpos]) >>> (38 - 16))
                        | ((in[24 + inpos]) << 16)
                        | ((in[25 + inpos]) << 54);
                out[15 + outpos] = ((in[25 + inpos]) >>> (38 - 28))
                        | ((in[26 + inpos]) << 28);
                out[16 + outpos] = ((in[26 + inpos]) >>> (38 - 2))
                        | ((in[27 + inpos]) << 2)
                        | ((in[28 + inpos]) << 40);
                out[17 + outpos] = ((in[28 + inpos]) >>> (38 - 14))
                        | ((in[29 + inpos]) << 14)
                        | ((in[30 + inpos]) << 52);
                out[18 + outpos] = ((in[30 + inpos]) >>> (38 - 26))
                        | ((in[31 + inpos]) << 26);
                out[19 + outpos] = in[32 + inpos]
                        | ((in[33 + inpos]) << 38);
                out[20 + outpos] = ((in[33 + inpos]) >>> (38 - 12))
                        | ((in[34 + inpos]) << 12)
                        | ((in[35 + inpos]) << 50);
                out[21 + outpos] = ((in[35 + inpos]) >>> (38 - 24))
                        | ((in[36 + inpos]) << 24)
                        | ((in[37 + inpos]) << 62);
                out[22 + outpos] = ((in[37 + inpos]) >>> (38 - 36))
                        | ((in[38 + inpos]) << 36);
                out[23 + outpos] = ((in[38 + inpos]) >>> (38 - 10))
                        | ((in[39 + inpos]) << 10)
                        | ((in[40 + inpos]) << 48);
                out[24 + outpos] = ((in[40 + inpos]) >>> (38 - 22))
                        | ((in[41 + inpos]) << 22)
                        | ((in[42 + inpos]) << 60);
                out[25 + outpos] = ((in[42 + inpos]) >>> (38 - 34))
                        | ((in[43 + inpos]) << 34);
                out[26 + outpos] = ((in[43 + inpos]) >>> (38 - 8))
                        | ((in[44 + inpos]) << 8)
                        | ((in[45 + inpos]) << 46);
                out[27 + outpos] = ((in[45 + inpos]) >>> (38 - 20))
                        | ((in[46 + inpos]) << 20)
                        | ((in[47 + inpos]) << 58);
                out[28 + outpos] = ((in[47 + inpos]) >>> (38 - 32))
                        | ((in[48 + inpos]) << 32);
                out[29 + outpos] = ((in[48 + inpos]) >>> (38 - 6))
                        | ((in[49 + inpos]) << 6)
                        | ((in[50 + inpos]) << 44);
                out[30 + outpos] = ((in[50 + inpos]) >>> (38 - 18))
                        | ((in[51 + inpos]) << 18)
                        | ((in[52 + inpos]) << 56);
                out[31 + outpos] = ((in[52 + inpos]) >>> (38 - 30))
                        | ((in[53 + inpos]) << 30);
                out[32 + outpos] = ((in[53 + inpos]) >>> (38 - 4))
                        | ((in[54 + inpos]) << 4)
                        | ((in[55 + inpos]) << 42);
                out[33 + outpos] = ((in[55 + inpos]) >>> (38 - 16))
                        | ((in[56 + inpos]) << 16)
                        | ((in[57 + inpos]) << 54);
                out[34 + outpos] = ((in[57 + inpos]) >>> (38 - 28))
                        | ((in[58 + inpos]) << 28);
                out[35 + outpos] = ((in[58 + inpos]) >>> (38 - 2))
                        | ((in[59 + inpos]) << 2)
                        | ((in[60 + inpos]) << 40);
                out[36 + outpos] = ((in[60 + inpos]) >>> (38 - 14))
                        | ((in[61 + inpos]) << 14)
                        | ((in[62 + inpos]) << 52);
                out[37 + outpos] = ((in[62 + inpos]) >>> (38 - 26))
                        | ((in[63 + inpos]) << 26);
        }

        protected static void fastpackwithoutmask39(final long[] in, int inpos,
                final long[] out, int outpos) {
                out[outpos] = in[inpos] | ((in[1 + inpos]) << 39);
                out[1 + outpos] = ((in[1 + inpos]) >>> (39 - 14))
                        | ((in[2 + inpos]) << 14)
                        | ((in[3 + inpos]) << 53);
                out[2 + outpos] = ((in[3 + inpos]) >>> (39 - 28))
                        | ((in[4 + inpos]) << 28);
                out[3 + outpos] = ((in[4 + inpos]) >>> (39 - 3))
                        | ((in[5 + inpos]) << 3)
                        | ((in[6 + inpos]) << 42);
                out[4 + outpos] = ((in[6 + inpos]) >>> (39 - 17))
                        | ((in[7 + inpos]) << 17)
                        | ((in[8 + inpos]) << 56);
                out[5 + outpos] = ((in[8 + inpos]) >>> (39 - 31))
                        | ((in[9 + inpos]) << 31);
                out[6 + outpos] = ((in[9 + inpos]) >>> (39 - 6))
                        | ((in[10 + inpos]) << 6)
                        | ((in[11 + inpos]) << 45);
                out[7 + outpos] = ((in[11 + inpos]) >>> (39 - 20))
                        | ((in[12 + inpos]) << 20)
                        | ((in[13 + inpos]) << 59);
                out[8 + outpos] = ((in[13 + inpos]) >>> (39 - 34))
                        | ((in[14 + inpos]) << 34);
                out[9 + outpos] = ((in[14 + inpos]) >>> (39 - 9))
                        | ((in[15 + inpos]) << 9)
                        | ((in[16 + inpos]) << 48);
                out[10 + outpos] = ((in[16 + inpos]) >>> (39 - 23))
                        | ((in[17 + inpos]) << 23)
                        | ((in[18 + inpos]) << 62);
                out[11 + outpos] = ((in[18 + inpos]) >>> (39 - 37))
                        | ((in[19 + inpos]) << 37);
                out[12 + outpos] = ((in[19 + inpos]) >>> (39 - 12))
                        | ((in[20 + inpos]) << 12)
                        | ((in[21 + inpos]) << 51);
                out[13 + outpos] = ((in[21 + inpos]) >>> (39 - 26))
                        | ((in[22 + inpos]) << 26);
                out[14 + outpos] = ((in[22 + inpos]) >>> (39 - 1))
                        | ((in[23 + inpos]) << 1)
                        | ((in[24 + inpos]) << 40);
                out[15 + outpos] = ((in[24 + inpos]) >>> (39 - 15))
                        | ((in[25 + inpos]) << 15)
                        | ((in[26 + inpos]) << 54);
                out[16 + outpos] = ((in[26 + inpos]) >>> (39 - 29))
                        | ((in[27 + inpos]) << 29);
                out[17 + outpos] = ((in[27 + inpos]) >>> (39 - 4))
                        | ((in[28 + inpos]) << 4)
                        | ((in[29 + inpos]) << 43);
                out[18 + outpos] = ((in[29 + inpos]) >>> (39 - 18))
                        | ((in[30 + inpos]) << 18)
                        | ((in[31 + inpos]) << 57);
                out[19 + outpos] = ((in[31 + inpos]) >>> (39 - 32))
                        | ((in[32 + inpos]) << 32);
                out[20 + outpos] = ((in[32 + inpos]) >>> (39 - 7))
                        | ((in[33 + inpos]) << 7)
                        | ((in[34 + inpos]) << 46);
                out[21 + outpos] = ((in[34 + inpos]) >>> (39 - 21))
                        | ((in[35 + inpos]) << 21)
                        | ((in[36 + inpos]) << 60);
                out[22 + outpos] = ((in[36 + inpos]) >>> (39 - 35))
                        | ((in[37 + inpos]) << 35);
                out[23 + outpos] = ((in[37 + inpos]) >>> (39 - 10))
                        | ((in[38 + inpos]) << 10)
                        | ((in[39 + inpos]) << 49);
                out[24 + outpos] = ((in[39 + inpos]) >>> (39 - 24))
                        | ((in[40 + inpos]) << 24)
                        | ((in[41 + inpos]) << 63);
                out[25 + outpos] = ((in[41 + inpos]) >>> (39 - 38))
                        | ((in[42 + inpos]) << 38);
                out[26 + outpos] = ((in[42 + inpos]) >>> (39 - 13))
                        | ((in[43 + inpos]) << 13)
                        | ((in[44 + inpos]) << 52);
                out[27 + outpos] = ((in[44 + inpos]) >>> (39 - 27))
                        | ((in[45 + inpos]) << 27);
                out[28 + outpos] = ((in[45 + inpos]) >>> (39 - 2))
                        | ((in[46 + inpos]) << 2)
                        | ((in[47 + inpos]) << 41);
                out[29 + outpos] = ((in[47 + inpos]) >>> (39 - 16))
                        | ((in[48 + inpos]) << 16)
                        | ((in[49 + inpos]) << 55);
                out[30 + outpos] = ((in[49 + inpos]) >>> (39 - 30))
                        | ((in[50 + inpos]) << 30);
                out[31 + outpos] = ((in[50 + inpos]) >>> (39 - 5))
                        | ((in[51 + inpos]) << 5)
                        | ((in[52 + inpos]) << 44);
                out[32 + outpos] = ((in[52 + inpos]) >>> (39 - 19))
                        | ((in[53 + inpos]) << 19)
                        | ((in[54 + inpos]) << 58);
                out[33 + outpos] = ((in[54 + inpos]) >>> (39 - 33))
                        | ((in[55 + inpos]) << 33);
                out[34 + outpos] = ((in[55 + inpos]) >>> (39 - 8))
                        | ((in[56 + inpos]) << 8)
                        | ((in[57 + inpos]) << 47);
                out[35 + outpos] = ((in[57 + inpos]) >>> (39 - 22))
                        | ((in[58 + inpos]) << 22)
                        | ((in[59 + inpos]) << 61);
                out[36 + outpos] = ((in[59 + inpos]) >>> (39 - 36))
                        | ((in[60 + inpos]) << 36);
                out[37 + outpos] = ((in[60 + inpos]) >>> (39 - 11))
                        | ((in[61 + inpos]) << 11)
                        | ((in[62 + inpos]) << 50);
                out[38 + outpos] = ((in[62 + inpos]) >>> (39 - 25))
                        | ((in[63 + inpos]) << 25);
        }

        protected static void fastpackwithoutmask40(final long[] in, int inpos,
                final long[] out, int outpos) {
                out[outpos] = in[inpos] | ((in[1 + inpos]) << 40);
                out[1 + outpos] = ((in[1 + inpos]) >>> (40 - 16))
                        | ((in[2 + inpos]) << 16)
                        | ((in[3 + inpos]) << 56);
                out[2 + outpos] = ((in[3 + inpos]) >>> (40 - 32))
                        | ((in[4 + inpos]) << 32);
                out[3 + outpos] = ((in[4 + inpos]) >>> (40 - 8))
                        | ((in[5 + inpos]) << 8)
                        | ((in[6 + inpos]) << 48);
                out[4 + outpos] = ((in[6 + inpos]) >>> (40 - 24))
                        | ((in[7 + inpos]) << 24);
                out[5 + outpos] = in[8 + inpos]
                        | ((in[9 + inpos]) << 40);
                out[6 + outpos] = ((in[9 + inpos]) >>> (40 - 16))
                        | ((in[10 + inpos]) << 16)
                        | ((in[11 + inpos]) << 56);
                out[7 + outpos] = ((in[11 + inpos]) >>> (40 - 32))
                        | ((in[12 + inpos]) << 32);
                out[8 + outpos] = ((in[12 + inpos]) >>> (40 - 8))
                        | ((in[13 + inpos]) << 8)
                        | ((in[14 + inpos]) << 48);
                out[9 + outpos] = ((in[14 + inpos]) >>> (40 - 24))
                        | ((in[15 + inpos]) << 24);
                out[10 + outpos] = in[16 + inpos]
                        | ((in[17 + inpos]) << 40);
                out[11 + outpos] = ((in[17 + inpos]) >>> (40 - 16))
                        | ((in[18 + inpos]) << 16)
                        | ((in[19 + inpos]) << 56);
                out[12 + outpos] = ((in[19 + inpos]) >>> (40 - 32))
                        | ((in[20 + inpos]) << 32);
                out[13 + outpos] = ((in[20 + inpos]) >>> (40 - 8))
                        | ((in[21 + inpos]) << 8)
                        | ((in[22 + inpos]) << 48);
                out[14 + outpos] = ((in[22 + inpos]) >>> (40 - 24))
                        | ((in[23 + inpos]) << 24);
                out[15 + outpos] = in[24 + inpos]
                        | ((in[25 + inpos]) << 40);
                out[16 + outpos] = ((in[25 + inpos]) >>> (40 - 16))
                        | ((in[26 + inpos]) << 16)
                        | ((in[27 + inpos]) << 56);
                out[17 + outpos] = ((in[27 + inpos]) >>> (40 - 32))
                        | ((in[28 + inpos]) << 32);
                out[18 + outpos] = ((in[28 + inpos]) >>> (40 - 8))
                        | ((in[29 + inpos]) << 8)
                        | ((in[30 + inpos]) << 48);
                out[19 + outpos] = ((in[30 + inpos]) >>> (40 - 24))
                        | ((in[31 + inpos]) << 24);
                out[20 + outpos] = in[32 + inpos]
                        | ((in[33 + inpos]) << 40);
                out[21 + outpos] = ((in[33 + inpos]) >>> (40 - 16))
                        | ((in[34 + inpos]) << 16)
                        | ((in[35 + inpos]) << 56);
                out[22 + outpos] = ((in[35 + inpos]) >>> (40 - 32))
                        | ((in[36 + inpos]) << 32);
                out[23 + outpos] = ((in[36 + inpos]) >>> (40 - 8))
                        | ((in[37 + inpos]) << 8)
                        | ((in[38 + inpos]) << 48);
                out[24 + outpos] = ((in[38 + inpos]) >>> (40 - 24))
                        | ((in[39 + inpos]) << 24);
                out[25 + outpos] = in[40 + inpos]
                        | ((in[41 + inpos]) << 40);
                out[26 + outpos] = ((in[41 + inpos]) >>> (40 - 16))
                        | ((in[42 + inpos]) << 16)
                        | ((in[43 + inpos]) << 56);
                out[27 + outpos] = ((in[43 + inpos]) >>> (40 - 32))
                        | ((in[44 + inpos]) << 32);
                out[28 + outpos] = ((in[44 + inpos]) >>> (40 - 8))
                        | ((in[45 + inpos]) << 8)
                        | ((in[46 + inpos]) << 48);
                out[29 + outpos] = ((in[46 + inpos]) >>> (40 - 24))
                        | ((in[47 + inpos]) << 24);
                out[30 + outpos] = in[48 + inpos]
                        | ((in[49 + inpos]) << 40);
                out[31 + outpos] = ((in[49 + inpos]) >>> (40 - 16))
                        | ((in[50 + inpos]) << 16)
                        | ((in[51 + inpos]) << 56);
                out[32 + outpos] = ((in[51 + inpos]) >>> (40 - 32))
                        | ((in[52 + inpos]) << 32);
                out[33 + outpos] = ((in[52 + inpos]) >>> (40 - 8))
                        | ((in[53 + inpos]) << 8)
                        | ((in[54 + inpos]) << 48);
                out[34 + outpos] = ((in[54 + inpos]) >>> (40 - 24))
                        | ((in[55 + inpos]) << 24);
                out[35 + outpos] = in[56 + inpos]
                        | ((in[57 + inpos]) << 40);
                out[36 + outpos] = ((in[57 + inpos]) >>> (40 - 16))
                        | ((in[58 + inpos]) << 16)
                        | ((in[59 + inpos]) << 56);
                out[37 + outpos] = ((in[59 + inpos]) >>> (40 - 32))
                        | ((in[60 + inpos]) << 32);
                out[38 + outpos] = ((in[60 + inpos]) >>> (40 - 8))
                        | ((in[61 + inpos]) << 8)
                        | ((in[62 + inpos]) << 48);
                out[39 + outpos] = ((in[62 + inpos]) >>> (40 - 24))
                        | ((in[63 + inpos]) << 24);
        }

        protected static void fastpackwithoutmask41(final long[] in, int inpos,
                final long[] out, int outpos) {
                out[outpos] = in[inpos] | ((in[1 + inpos]) << 41);
                out[1 + outpos] = ((in[1 + inpos]) >>> (41 - 18))
                        | ((in[2 + inpos]) << 18)
                        | ((in[3 + inpos]) << 59);
                out[2 + outpos] = ((in[3 + inpos]) >>> (41 - 36))
                        | ((in[4 + inpos]) << 36);
                out[3 + outpos] = ((in[4 + inpos]) >>> (41 - 13))
                        | ((in[5 + inpos]) << 13)
                        | ((in[6 + inpos]) << 54);
                out[4 + outpos] = ((in[6 + inpos]) >>> (41 - 31))
                        | ((in[7 + inpos]) << 31);
                out[5 + outpos] = ((in[7 + inpos]) >>> (41 - 8))
                        | ((in[8 + inpos]) << 8)
                        | ((in[9 + inpos]) << 49);
                out[6 + outpos] = ((in[9 + inpos]) >>> (41 - 26))
                        | ((in[10 + inpos]) << 26);
                out[7 + outpos] = ((in[10 + inpos]) >>> (41 - 3))
                        | ((in[11 + inpos]) << 3)
                        | ((in[12 + inpos]) << 44);
                out[8 + outpos] = ((in[12 + inpos]) >>> (41 - 21))
                        | ((in[13 + inpos]) << 21)
                        | ((in[14 + inpos]) << 62);
                out[9 + outpos] = ((in[14 + inpos]) >>> (41 - 39))
                        | ((in[15 + inpos]) << 39);
                out[10 + outpos] = ((in[15 + inpos]) >>> (41 - 16))
                        | ((in[16 + inpos]) << 16)
                        | ((in[17 + inpos]) << 57);
                out[11 + outpos] = ((in[17 + inpos]) >>> (41 - 34))
                        | ((in[18 + inpos]) << 34);
                out[12 + outpos] = ((in[18 + inpos]) >>> (41 - 11))
                        | ((in[19 + inpos]) << 11)
                        | ((in[20 + inpos]) << 52);
                out[13 + outpos] = ((in[20 + inpos]) >>> (41 - 29))
                        | ((in[21 + inpos]) << 29);
                out[14 + outpos] = ((in[21 + inpos]) >>> (41 - 6))
                        | ((in[22 + inpos]) << 6)
                        | ((in[23 + inpos]) << 47);
                out[15 + outpos] = ((in[23 + inpos]) >>> (41 - 24))
                        | ((in[24 + inpos]) << 24);
                out[16 + outpos] = ((in[24 + inpos]) >>> (41 - 1))
                        | ((in[25 + inpos]) << 1)
                        | ((in[26 + inpos]) << 42);
                out[17 + outpos] = ((in[26 + inpos]) >>> (41 - 19))
                        | ((in[27 + inpos]) << 19)
                        | ((in[28 + inpos]) << 60);
                out[18 + outpos] = ((in[28 + inpos]) >>> (41 - 37))
                        | ((in[29 + inpos]) << 37);
                out[19 + outpos] = ((in[29 + inpos]) >>> (41 - 14))
                        | ((in[30 + inpos]) << 14)
                        | ((in[31 + inpos]) << 55);
                out[20 + outpos] = ((in[31 + inpos]) >>> (41 - 32))
                        | ((in[32 + inpos]) << 32);
                out[21 + outpos] = ((in[32 + inpos]) >>> (41 - 9))
                        | ((in[33 + inpos]) << 9)
                        | ((in[34 + inpos]) << 50);
                out[22 + outpos] = ((in[34 + inpos]) >>> (41 - 27))
                        | ((in[35 + inpos]) << 27);
                out[23 + outpos] = ((in[35 + inpos]) >>> (41 - 4))
                        | ((in[36 + inpos]) << 4)
                        | ((in[37 + inpos]) << 45);
                out[24 + outpos] = ((in[37 + inpos]) >>> (41 - 22))
                        | ((in[38 + inpos]) << 22)
                        | ((in[39 + inpos]) << 63);
                out[25 + outpos] = ((in[39 + inpos]) >>> (41 - 40))
                        | ((in[40 + inpos]) << 40);
                out[26 + outpos] = ((in[40 + inpos]) >>> (41 - 17))
                        | ((in[41 + inpos]) << 17)
                        | ((in[42 + inpos]) << 58);
                out[27 + outpos] = ((in[42 + inpos]) >>> (41 - 35))
                        | ((in[43 + inpos]) << 35);
                out[28 + outpos] = ((in[43 + inpos]) >>> (41 - 12))
                        | ((in[44 + inpos]) << 12)
                        | ((in[45 + inpos]) << 53);
                out[29 + outpos] = ((in[45 + inpos]) >>> (41 - 30))
                        | ((in[46 + inpos]) << 30);
                out[30 + outpos] = ((in[46 + inpos]) >>> (41 - 7))
                        | ((in[47 + inpos]) << 7)
                        | ((in[48 + inpos]) << 48);
                out[31 + outpos] = ((in[48 + inpos]) >>> (41 - 25))
                        | ((in[49 + inpos]) << 25);
                out[32 + outpos] = ((in[49 + inpos]) >>> (41 - 2))
                        | ((in[50 + inpos]) << 2)
                        | ((in[51 + inpos]) << 43);
                out[33 + outpos] = ((in[51 + inpos]) >>> (41 - 20))
                        | ((in[52 + inpos]) << 20)
                        | ((in[53 + inpos]) << 61);
                out[34 + outpos] = ((in[53 + inpos]) >>> (41 - 38))
                        | ((in[54 + inpos]) << 38);
                out[35 + outpos] = ((in[54 + inpos]) >>> (41 - 15))
                        | ((in[55 + inpos]) << 15)
                        | ((in[56 + inpos]) << 56);
                out[36 + outpos] = ((in[56 + inpos]) >>> (41 - 33))
                        | ((in[57 + inpos]) << 33);
                out[37 + outpos] = ((in[57 + inpos]) >>> (41 - 10))
                        | ((in[58 + inpos]) << 10)
                        | ((in[59 + inpos]) << 51);
                out[38 + outpos] = ((in[59 + inpos]) >>> (41 - 28))
                        | ((in[60 + inpos]) << 28);
                out[39 + outpos] = ((in[60 + inpos]) >>> (41 - 5))
                        | ((in[61 + inpos]) << 5)
                        | ((in[62 + inpos]) << 46);
                out[40 + outpos] = ((in[62 + inpos]) >>> (41 - 23))
                        | ((in[63 + inpos]) << 23);
        }

        protected static void fastpackwithoutmask42(final long[] in, int inpos,
                final long[] out, int outpos) {
                out[outpos] = in[inpos] | ((in[1 + inpos]) << 42);
                out[1 + outpos] = ((in[1 + inpos]) >>> (42 - 20))
                        | ((in[2 + inpos]) << 20)
                        | ((in[3 + inpos]) << 62);
                out[2 + outpos] = ((in[3 + inpos]) >>> (42 - 40))
                        | ((in[4 + inpos]) << 40);
                out[3 + outpos] = ((in[4 + inpos]) >>> (42 - 18))
                        | ((in[5 + inpos]) << 18)
                        | ((in[6 + inpos]) << 60);
                out[4 + outpos] = ((in[6 + inpos]) >>> (42 - 38))
                        | ((in[7 + inpos]) << 38);
                out[5 + outpos] = ((in[7 + inpos]) >>> (42 - 16))
                        | ((in[8 + inpos]) << 16)
                        | ((in[9 + inpos]) << 58);
                out[6 + outpos] = ((in[9 + inpos]) >>> (42 - 36))
                        | ((in[10 + inpos]) << 36);
                out[7 + outpos] = ((in[10 + inpos]) >>> (42 - 14))
                        | ((in[11 + inpos]) << 14)
                        | ((in[12 + inpos]) << 56);
                out[8 + outpos] = ((in[12 + inpos]) >>> (42 - 34))
                        | ((in[13 + inpos]) << 34);
                out[9 + outpos] = ((in[13 + inpos]) >>> (42 - 12))
                        | ((in[14 + inpos]) << 12)
                        | ((in[15 + inpos]) << 54);
                out[10 + outpos] = ((in[15 + inpos]) >>> (42 - 32))
                        | ((in[16 + inpos]) << 32);
                out[11 + outpos] = ((in[16 + inpos]) >>> (42 - 10))
                        | ((in[17 + inpos]) << 10)
                        | ((in[18 + inpos]) << 52);
                out[12 + outpos] = ((in[18 + inpos]) >>> (42 - 30))
                        | ((in[19 + inpos]) << 30);
                out[13 + outpos] = ((in[19 + inpos]) >>> (42 - 8))
                        | ((in[20 + inpos]) << 8)
                        | ((in[21 + inpos]) << 50);
                out[14 + outpos] = ((in[21 + inpos]) >>> (42 - 28))
                        | ((in[22 + inpos]) << 28);
                out[15 + outpos] = ((in[22 + inpos]) >>> (42 - 6))
                        | ((in[23 + inpos]) << 6)
                        | ((in[24 + inpos]) << 48);
                out[16 + outpos] = ((in[24 + inpos]) >>> (42 - 26))
                        | ((in[25 + inpos]) << 26);
                out[17 + outpos] = ((in[25 + inpos]) >>> (42 - 4))
                        | ((in[26 + inpos]) << 4)
                        | ((in[27 + inpos]) << 46);
                out[18 + outpos] = ((in[27 + inpos]) >>> (42 - 24))
                        | ((in[28 + inpos]) << 24);
                out[19 + outpos] = ((in[28 + inpos]) >>> (42 - 2))
                        | ((in[29 + inpos]) << 2)
                        | ((in[30 + inpos]) << 44);
                out[20 + outpos] = ((in[30 + inpos]) >>> (42 - 22))
                        | ((in[31 + inpos]) << 22);
                out[21 + outpos] = in[32 + inpos]
                        | ((in[33 + inpos]) << 42);
                out[22 + outpos] = ((in[33 + inpos]) >>> (42 - 20))
                        | ((in[34 + inpos]) << 20)
                        | ((in[35 + inpos]) << 62);
                out[23 + outpos] = ((in[35 + inpos]) >>> (42 - 40))
                        | ((in[36 + inpos]) << 40);
                out[24 + outpos] = ((in[36 + inpos]) >>> (42 - 18))
                        | ((in[37 + inpos]) << 18)
                        | ((in[38 + inpos]) << 60);
                out[25 + outpos] = ((in[38 + inpos]) >>> (42 - 38))
                        | ((in[39 + inpos]) << 38);
                out[26 + outpos] = ((in[39 + inpos]) >>> (42 - 16))
                        | ((in[40 + inpos]) << 16)
                        | ((in[41 + inpos]) << 58);
                out[27 + outpos] = ((in[41 + inpos]) >>> (42 - 36))
                        | ((in[42 + inpos]) << 36);
                out[28 + outpos] = ((in[42 + inpos]) >>> (42 - 14))
                        | ((in[43 + inpos]) << 14)
                        | ((in[44 + inpos]) << 56);
                out[29 + outpos] = ((in[44 + inpos]) >>> (42 - 34))
                        | ((in[45 + inpos]) << 34);
                out[30 + outpos] = ((in[45 + inpos]) >>> (42 - 12))
                        | ((in[46 + inpos]) << 12)
                        | ((in[47 + inpos]) << 54);
                out[31 + outpos] = ((in[47 + inpos]) >>> (42 - 32))
                        | ((in[48 + inpos]) << 32);
                out[32 + outpos] = ((in[48 + inpos]) >>> (42 - 10))
                        | ((in[49 + inpos]) << 10)
                        | ((in[50 + inpos]) << 52);
                out[33 + outpos] = ((in[50 + inpos]) >>> (42 - 30))
                        | ((in[51 + inpos]) << 30);
                out[34 + outpos] = ((in[51 + inpos]) >>> (42 - 8))
                        | ((in[52 + inpos]) << 8)
                        | ((in[53 + inpos]) << 50);
                out[35 + outpos] = ((in[53 + inpos]) >>> (42 - 28))
                        | ((in[54 + inpos]) << 28);
                out[36 + outpos] = ((in[54 + inpos]) >>> (42 - 6))
                        | ((in[55 + inpos]) << 6)
                        | ((in[56 + inpos]) << 48);
                out[37 + outpos] = ((in[56 + inpos]) >>> (42 - 26))
                        | ((in[57 + inpos]) << 26);
                out[38 + outpos] = ((in[57 + inpos]) >>> (42 - 4))
                        | ((in[58 + inpos]) << 4)
                        | ((in[59 + inpos]) << 46);
                out[39 + outpos] = ((in[59 + inpos]) >>> (42 - 24))
                        | ((in[60 + inpos]) << 24);
                out[40 + outpos] = ((in[60 + inpos]) >>> (42 - 2))
                        | ((in[61 + inpos]) << 2)
                        | ((in[62 + inpos]) << 44);
                out[41 + outpos] = ((in[62 + inpos]) >>> (42 - 22))
                        | ((in[63 + inpos]) << 22);
        }

        protected static void fastpackwithoutmask43(final long[] in, int inpos,
                final long[] out, int outpos) {
                out[outpos] = in[inpos] | ((in[1 + inpos]) << 43);
                out[1 + outpos] = ((in[1 + inpos]) >>> (43 - 22))
                        | ((in[2 + inpos]) << 22);
                out[2 + outpos] = ((in[2 + inpos]) >>> (43 - 1))
                        | ((in[3 + inpos]) << 1)
                        | ((in[4 + inpos]) << 44);
                out[3 + outpos] = ((in[4 + inpos]) >>> (43 - 23))
                        | ((in[5 + inpos]) << 23);
                out[4 + outpos] = ((in[5 + inpos]) >>> (43 - 2))
                        | ((in[6 + inpos]) << 2)
                        | ((in[7 + inpos]) << 45);
                out[5 + outpos] = ((in[7 + inpos]) >>> (43 - 24))
                        | ((in[8 + inpos]) << 24);
                out[6 + outpos] = ((in[8 + inpos]) >>> (43 - 3))
                        | ((in[9 + inpos]) << 3)
                        | ((in[10 + inpos]) << 46);
                out[7 + outpos] = ((in[10 + inpos]) >>> (43 - 25))
                        | ((in[11 + inpos]) << 25);
                out[8 + outpos] = ((in[11 + inpos]) >>> (43 - 4))
                        | ((in[12 + inpos]) << 4)
                        | ((in[13 + inpos]) << 47);
                out[9 + outpos] = ((in[13 + inpos]) >>> (43 - 26))
                        | ((in[14 + inpos]) << 26);
                out[10 + outpos] = ((in[14 + inpos]) >>> (43 - 5))
                        | ((in[15 + inpos]) << 5)
                        | ((in[16 + inpos]) << 48);
                out[11 + outpos] = ((in[16 + inpos]) >>> (43 - 27))
                        | ((in[17 + inpos]) << 27);
                out[12 + outpos] = ((in[17 + inpos]) >>> (43 - 6))
                        | ((in[18 + inpos]) << 6)
                        | ((in[19 + inpos]) << 49);
                out[13 + outpos] = ((in[19 + inpos]) >>> (43 - 28))
                        | ((in[20 + inpos]) << 28);
                out[14 + outpos] = ((in[20 + inpos]) >>> (43 - 7))
                        | ((in[21 + inpos]) << 7)
                        | ((in[22 + inpos]) << 50);
                out[15 + outpos] = ((in[22 + inpos]) >>> (43 - 29))
                        | ((in[23 + inpos]) << 29);
                out[16 + outpos] = ((in[23 + inpos]) >>> (43 - 8))
                        | ((in[24 + inpos]) << 8)
                        | ((in[25 + inpos]) << 51);
                out[17 + outpos] = ((in[25 + inpos]) >>> (43 - 30))
                        | ((in[26 + inpos]) << 30);
                out[18 + outpos] = ((in[26 + inpos]) >>> (43 - 9))
                        | ((in[27 + inpos]) << 9)
                        | ((in[28 + inpos]) << 52);
                out[19 + outpos] = ((in[28 + inpos]) >>> (43 - 31))
                        | ((in[29 + inpos]) << 31);
                out[20 + outpos] = ((in[29 + inpos]) >>> (43 - 10))
                        | ((in[30 + inpos]) << 10)
                        | ((in[31 + inpos]) << 53);
                out[21 + outpos] = ((in[31 + inpos]) >>> (43 - 32))
                        | ((in[32 + inpos]) << 32);
                out[22 + outpos] = ((in[32 + inpos]) >>> (43 - 11))
                        | ((in[33 + inpos]) << 11)
                        | ((in[34 + inpos]) << 54);
                out[23 + outpos] = ((in[34 + inpos]) >>> (43 - 33))
                        | ((in[35 + inpos]) << 33);
                out[24 + outpos] = ((in[35 + inpos]) >>> (43 - 12))
                        | ((in[36 + inpos]) << 12)
                        | ((in[37 + inpos]) << 55);
                out[25 + outpos] = ((in[37 + inpos]) >>> (43 - 34))
                        | ((in[38 + inpos]) << 34);
                out[26 + outpos] = ((in[38 + inpos]) >>> (43 - 13))
                        | ((in[39 + inpos]) << 13)
                        | ((in[40 + inpos]) << 56);
                out[27 + outpos] = ((in[40 + inpos]) >>> (43 - 35))
                        | ((in[41 + inpos]) << 35);
                out[28 + outpos] = ((in[41 + inpos]) >>> (43 - 14))
                        | ((in[42 + inpos]) << 14)
                        | ((in[43 + inpos]) << 57);
                out[29 + outpos] = ((in[43 + inpos]) >>> (43 - 36))
                        | ((in[44 + inpos]) << 36);
                out[30 + outpos] = ((in[44 + inpos]) >>> (43 - 15))
                        | ((in[45 + inpos]) << 15)
                        | ((in[46 + inpos]) << 58);
                out[31 + outpos] = ((in[46 + inpos]) >>> (43 - 37))
                        | ((in[47 + inpos]) << 37);
                out[32 + outpos] = ((in[47 + inpos]) >>> (43 - 16))
                        | ((in[48 + inpos]) << 16)
                        | ((in[49 + inpos]) << 59);
                out[33 + outpos] = ((in[49 + inpos]) >>> (43 - 38))
                        | ((in[50 + inpos]) << 38);
                out[34 + outpos] = ((in[50 + inpos]) >>> (43 - 17))
                        | ((in[51 + inpos]) << 17)
                        | ((in[52 + inpos]) << 60);
                out[35 + outpos] = ((in[52 + inpos]) >>> (43 - 39))
                        | ((in[53 + inpos]) << 39);
                out[36 + outpos] = ((in[53 + inpos]) >>> (43 - 18))
                        | ((in[54 + inpos]) << 18)
                        | ((in[55 + inpos]) << 61);
                out[37 + outpos] = ((in[55 + inpos]) >>> (43 - 40))
                        | ((in[56 + inpos]) << 40);
                out[38 + outpos] = ((in[56 + inpos]) >>> (43 - 19))
                        | ((in[57 + inpos]) << 19)
                        | ((in[58 + inpos]) << 62);
                out[39 + outpos] = ((in[58 + inpos]) >>> (43 - 41))
                        | ((in[59 + inpos]) << 41);
                out[40 + outpos] = ((in[59 + inpos]) >>> (43 - 20))
                        | ((in[60 + inpos]) << 20)
                        | ((in[61 + inpos]) << 63);
                out[41 + outpos] = ((in[61 + inpos]) >>> (43 - 42))
                        | ((in[62 + inpos]) << 42);
                out[42 + outpos] = ((in[62 + inpos]) >>> (43 - 21))
                        | ((in[63 + inpos]) << 21);
        }

        protected static void fastpackwithoutmask44(final long[] in, int inpos,
                final long[] out, int outpos) {
                out[outpos] = in[inpos] | ((in[1 + inpos]) << 44);
                out[1 + outpos] = ((in[1 + inpos]) >>> (44 - 24))
                        | ((in[2 + inpos]) << 24);
                out[2 + outpos] = ((in[2 + inpos]) >>> (44 - 4))
                        | ((in[3 + inpos]) << 4)
                        | ((in[4 + inpos]) << 48);
                out[3 + outpos] = ((in[4 + inpos]) >>> (44 - 28))
                        | ((in[5 + inpos]) << 28);
                out[4 + outpos] = ((in[5 + inpos]) >>> (44 - 8))
                        | ((in[6 + inpos]) << 8)
                        | ((in[7 + inpos]) << 52);
                out[5 + outpos] = ((in[7 + inpos]) >>> (44 - 32))
                        | ((in[8 + inpos]) << 32);
                out[6 + outpos] = ((in[8 + inpos]) >>> (44 - 12))
                        | ((in[9 + inpos]) << 12)
                        | ((in[10 + inpos]) << 56);
                out[7 + outpos] = ((in[10 + inpos]) >>> (44 - 36))
                        | ((in[11 + inpos]) << 36);
                out[8 + outpos] = ((in[11 + inpos]) >>> (44 - 16))
                        | ((in[12 + inpos]) << 16)
                        | ((in[13 + inpos]) << 60);
                out[9 + outpos] = ((in[13 + inpos]) >>> (44 - 40))
                        | ((in[14 + inpos]) << 40);
                out[10 + outpos] = ((in[14 + inpos]) >>> (44 - 20))
                        | ((in[15 + inpos]) << 20);
                out[11 + outpos] = in[16 + inpos]
                        | ((in[17 + inpos]) << 44);
                out[12 + outpos] = ((in[17 + inpos]) >>> (44 - 24))
                        | ((in[18 + inpos]) << 24);
                out[13 + outpos] = ((in[18 + inpos]) >>> (44 - 4))
                        | ((in[19 + inpos]) << 4)
                        | ((in[20 + inpos]) << 48);
                out[14 + outpos] = ((in[20 + inpos]) >>> (44 - 28))
                        | ((in[21 + inpos]) << 28);
                out[15 + outpos] = ((in[21 + inpos]) >>> (44 - 8))
                        | ((in[22 + inpos]) << 8)
                        | ((in[23 + inpos]) << 52);
                out[16 + outpos] = ((in[23 + inpos]) >>> (44 - 32))
                        | ((in[24 + inpos]) << 32);
                out[17 + outpos] = ((in[24 + inpos]) >>> (44 - 12))
                        | ((in[25 + inpos]) << 12)
                        | ((in[26 + inpos]) << 56);
                out[18 + outpos] = ((in[26 + inpos]) >>> (44 - 36))
                        | ((in[27 + inpos]) << 36);
                out[19 + outpos] = ((in[27 + inpos]) >>> (44 - 16))
                        | ((in[28 + inpos]) << 16)
                        | ((in[29 + inpos]) << 60);
                out[20 + outpos] = ((in[29 + inpos]) >>> (44 - 40))
                        | ((in[30 + inpos]) << 40);
                out[21 + outpos] = ((in[30 + inpos]) >>> (44 - 20))
                        | ((in[31 + inpos]) << 20);
                out[22 + outpos] = in[32 + inpos]
                        | ((in[33 + inpos]) << 44);
                out[23 + outpos] = ((in[33 + inpos]) >>> (44 - 24))
                        | ((in[34 + inpos]) << 24);
                out[24 + outpos] = ((in[34 + inpos]) >>> (44 - 4))
                        | ((in[35 + inpos]) << 4)
                        | ((in[36 + inpos]) << 48);
                out[25 + outpos] = ((in[36 + inpos]) >>> (44 - 28))
                        | ((in[37 + inpos]) << 28);
                out[26 + outpos] = ((in[37 + inpos]) >>> (44 - 8))
                        | ((in[38 + inpos]) << 8)
                        | ((in[39 + inpos]) << 52);
                out[27 + outpos] = ((in[39 + inpos]) >>> (44 - 32))
                        | ((in[40 + inpos]) << 32);
                out[28 + outpos] = ((in[40 + inpos]) >>> (44 - 12))
                        | ((in[41 + inpos]) << 12)
                        | ((in[42 + inpos]) << 56);
                out[29 + outpos] = ((in[42 + inpos]) >>> (44 - 36))
                        | ((in[43 + inpos]) << 36);
                out[30 + outpos] = ((in[43 + inpos]) >>> (44 - 16))
                        | ((in[44 + inpos]) << 16)
                        | ((in[45 + inpos]) << 60);
                out[31 + outpos] = ((in[45 + inpos]) >>> (44 - 40))
                        | ((in[46 + inpos]) << 40);
                out[32 + outpos] = ((in[46 + inpos]) >>> (44 - 20))
                        | ((in[47 + inpos]) << 20);
                out[33 + outpos] = in[48 + inpos]
                        | ((in[49 + inpos]) << 44);
                out[34 + outpos] = ((in[49 + inpos]) >>> (44 - 24))
                        | ((in[50 + inpos]) << 24);
                out[35 + outpos] = ((in[50 + inpos]) >>> (44 - 4))
                        | ((in[51 + inpos]) << 4)
                        | ((in[52 + inpos]) << 48);
                out[36 + outpos] = ((in[52 + inpos]) >>> (44 - 28))
                        | ((in[53 + inpos]) << 28);
                out[37 + outpos] = ((in[53 + inpos]) >>> (44 - 8))
                        | ((in[54 + inpos]) << 8)
                        | ((in[55 + inpos]) << 52);
                out[38 + outpos] = ((in[55 + inpos]) >>> (44 - 32))
                        | ((in[56 + inpos]) << 32);
                out[39 + outpos] = ((in[56 + inpos]) >>> (44 - 12))
                        | ((in[57 + inpos]) << 12)
                        | ((in[58 + inpos]) << 56);
                out[40 + outpos] = ((in[58 + inpos]) >>> (44 - 36))
                        | ((in[59 + inpos]) << 36);
                out[41 + outpos] = ((in[59 + inpos]) >>> (44 - 16))
                        | ((in[60 + inpos]) << 16)
                        | ((in[61 + inpos]) << 60);
                out[42 + outpos] = ((in[61 + inpos]) >>> (44 - 40))
                        | ((in[62 + inpos]) << 40);
                out[43 + outpos] = ((in[62 + inpos]) >>> (44 - 20))
                        | ((in[63 + inpos]) << 20);
        }

        protected static void fastpackwithoutmask45(final long[] in, int inpos,
                final long[] out, int outpos) {
                out[outpos] = in[inpos] | ((in[1 + inpos]) << 45);
                out[1 + outpos] = ((in[1 + inpos]) >>> (45 - 26))
                        | ((in[2 + inpos]) << 26);
                out[2 + outpos] = ((in[2 + inpos]) >>> (45 - 7))
                        | ((in[3 + inpos]) << 7)
                        | ((in[4 + inpos]) << 52);
                out[3 + outpos] = ((in[4 + inpos]) >>> (45 - 33))
                        | ((in[5 + inpos]) << 33);
                out[4 + outpos] = ((in[5 + inpos]) >>> (45 - 14))
                        | ((in[6 + inpos]) << 14)
                        | ((in[7 + inpos]) << 59);
                out[5 + outpos] = ((in[7 + inpos]) >>> (45 - 40))
                        | ((in[8 + inpos]) << 40);
                out[6 + outpos] = ((in[8 + inpos]) >>> (45 - 21))
                        | ((in[9 + inpos]) << 21);
                out[7 + outpos] = ((in[9 + inpos]) >>> (45 - 2))
                        | ((in[10 + inpos]) << 2)
                        | ((in[11 + inpos]) << 47);
                out[8 + outpos] = ((in[11 + inpos]) >>> (45 - 28))
                        | ((in[12 + inpos]) << 28);
                out[9 + outpos] = ((in[12 + inpos]) >>> (45 - 9))
                        | ((in[13 + inpos]) << 9)
                        | ((in[14 + inpos]) << 54);
                out[10 + outpos] = ((in[14 + inpos]) >>> (45 - 35))
                        | ((in[15 + inpos]) << 35);
                out[11 + outpos] = ((in[15 + inpos]) >>> (45 - 16))
                        | ((in[16 + inpos]) << 16)
                        | ((in[17 + inpos]) << 61);
                out[12 + outpos] = ((in[17 + inpos]) >>> (45 - 42))
                        | ((in[18 + inpos]) << 42);
                out[13 + outpos] = ((in[18 + inpos]) >>> (45 - 23))
                        | ((in[19 + inpos]) << 23);
                out[14 + outpos] = ((in[19 + inpos]) >>> (45 - 4))
                        | ((in[20 + inpos]) << 4)
                        | ((in[21 + inpos]) << 49);
                out[15 + outpos] = ((in[21 + inpos]) >>> (45 - 30))
                        | ((in[22 + inpos]) << 30);
                out[16 + outpos] = ((in[22 + inpos]) >>> (45 - 11))
                        | ((in[23 + inpos]) << 11)
                        | ((in[24 + inpos]) << 56);
                out[17 + outpos] = ((in[24 + inpos]) >>> (45 - 37))
                        | ((in[25 + inpos]) << 37);
                out[18 + outpos] = ((in[25 + inpos]) >>> (45 - 18))
                        | ((in[26 + inpos]) << 18)
                        | ((in[27 + inpos]) << 63);
                out[19 + outpos] = ((in[27 + inpos]) >>> (45 - 44))
                        | ((in[28 + inpos]) << 44);
                out[20 + outpos] = ((in[28 + inpos]) >>> (45 - 25))
                        | ((in[29 + inpos]) << 25);
                out[21 + outpos] = ((in[29 + inpos]) >>> (45 - 6))
                        | ((in[30 + inpos]) << 6)
                        | ((in[31 + inpos]) << 51);
                out[22 + outpos] = ((in[31 + inpos]) >>> (45 - 32))
                        | ((in[32 + inpos]) << 32);
                out[23 + outpos] = ((in[32 + inpos]) >>> (45 - 13))
                        | ((in[33 + inpos]) << 13)
                        | ((in[34 + inpos]) << 58);
                out[24 + outpos] = ((in[34 + inpos]) >>> (45 - 39))
                        | ((in[35 + inpos]) << 39);
                out[25 + outpos] = ((in[35 + inpos]) >>> (45 - 20))
                        | ((in[36 + inpos]) << 20);
                out[26 + outpos] = ((in[36 + inpos]) >>> (45 - 1))
                        | ((in[37 + inpos]) << 1)
                        | ((in[38 + inpos]) << 46);
                out[27 + outpos] = ((in[38 + inpos]) >>> (45 - 27))
                        | ((in[39 + inpos]) << 27);
                out[28 + outpos] = ((in[39 + inpos]) >>> (45 - 8))
                        | ((in[40 + inpos]) << 8)
                        | ((in[41 + inpos]) << 53);
                out[29 + outpos] = ((in[41 + inpos]) >>> (45 - 34))
                        | ((in[42 + inpos]) << 34);
                out[30 + outpos] = ((in[42 + inpos]) >>> (45 - 15))
                        | ((in[43 + inpos]) << 15)
                        | ((in[44 + inpos]) << 60);
                out[31 + outpos] = ((in[44 + inpos]) >>> (45 - 41))
                        | ((in[45 + inpos]) << 41);
                out[32 + outpos] = ((in[45 + inpos]) >>> (45 - 22))
                        | ((in[46 + inpos]) << 22);
                out[33 + outpos] = ((in[46 + inpos]) >>> (45 - 3))
                        | ((in[47 + inpos]) << 3)
                        | ((in[48 + inpos]) << 48);
                out[34 + outpos] = ((in[48 + inpos]) >>> (45 - 29))
                        | ((in[49 + inpos]) << 29);
                out[35 + outpos] = ((in[49 + inpos]) >>> (45 - 10))
                        | ((in[50 + inpos]) << 10)
                        | ((in[51 + inpos]) << 55);
                out[36 + outpos] = ((in[51 + inpos]) >>> (45 - 36))
                        | ((in[52 + inpos]) << 36);
                out[37 + outpos] = ((in[52 + inpos]) >>> (45 - 17))
                        | ((in[53 + inpos]) << 17)
                        | ((in[54 + inpos]) << 62);
                out[38 + outpos] = ((in[54 + inpos]) >>> (45 - 43))
                        | ((in[55 + inpos]) << 43);
                out[39 + outpos] = ((in[55 + inpos]) >>> (45 - 24))
                        | ((in[56 + inpos]) << 24);
                out[40 + outpos] = ((in[56 + inpos]) >>> (45 - 5))
                        | ((in[57 + inpos]) << 5)
                        | ((in[58 + inpos]) << 50);
                out[41 + outpos] = ((in[58 + inpos]) >>> (45 - 31))
                        | ((in[59 + inpos]) << 31);
                out[42 + outpos] = ((in[59 + inpos]) >>> (45 - 12))
                        | ((in[60 + inpos]) << 12)
                        | ((in[61 + inpos]) << 57);
                out[43 + outpos] = ((in[61 + inpos]) >>> (45 - 38))
                        | ((in[62 + inpos]) << 38);
                out[44 + outpos] = ((in[62 + inpos]) >>> (45 - 19))
                        | ((in[63 + inpos]) << 19);
        }

        protected static void fastpackwithoutmask46(final long[] in, int inpos,
                final long[] out, int outpos) {
                out[outpos] = in[inpos] | ((in[1 + inpos]) << 46);
                out[1 + outpos] = ((in[1 + inpos]) >>> (46 - 28))
                        | ((in[2 + inpos]) << 28);
                out[2 + outpos] = ((in[2 + inpos]) >>> (46 - 10))
                        | ((in[3 + inpos]) << 10)
                        | ((in[4 + inpos]) << 56);
                out[3 + outpos] = ((in[4 + inpos]) >>> (46 - 38))
                        | ((in[5 + inpos]) << 38);
                out[4 + outpos] = ((in[5 + inpos]) >>> (46 - 20))
                        | ((in[6 + inpos]) << 20);
                out[5 + outpos] = ((in[6 + inpos]) >>> (46 - 2))
                        | ((in[7 + inpos]) << 2)
                        | ((in[8 + inpos]) << 48);
                out[6 + outpos] = ((in[8 + inpos]) >>> (46 - 30))
                        | ((in[9 + inpos]) << 30);
                out[7 + outpos] = ((in[9 + inpos]) >>> (46 - 12))
                        | ((in[10 + inpos]) << 12)
                        | ((in[11 + inpos]) << 58);
                out[8 + outpos] = ((in[11 + inpos]) >>> (46 - 40))
                        | ((in[12 + inpos]) << 40);
                out[9 + outpos] = ((in[12 + inpos]) >>> (46 - 22))
                        | ((in[13 + inpos]) << 22);
                out[10 + outpos] = ((in[13 + inpos]) >>> (46 - 4))
                        | ((in[14 + inpos]) << 4)
                        | ((in[15 + inpos]) << 50);
                out[11 + outpos] = ((in[15 + inpos]) >>> (46 - 32))
                        | ((in[16 + inpos]) << 32);
                out[12 + outpos] = ((in[16 + inpos]) >>> (46 - 14))
                        | ((in[17 + inpos]) << 14)
                        | ((in[18 + inpos]) << 60);
                out[13 + outpos] = ((in[18 + inpos]) >>> (46 - 42))
                        | ((in[19 + inpos]) << 42);
                out[14 + outpos] = ((in[19 + inpos]) >>> (46 - 24))
                        | ((in[20 + inpos]) << 24);
                out[15 + outpos] = ((in[20 + inpos]) >>> (46 - 6))
                        | ((in[21 + inpos]) << 6)
                        | ((in[22 + inpos]) << 52);
                out[16 + outpos] = ((in[22 + inpos]) >>> (46 - 34))
                        | ((in[23 + inpos]) << 34);
                out[17 + outpos] = ((in[23 + inpos]) >>> (46 - 16))
                        | ((in[24 + inpos]) << 16)
                        | ((in[25 + inpos]) << 62);
                out[18 + outpos] = ((in[25 + inpos]) >>> (46 - 44))
                        | ((in[26 + inpos]) << 44);
                out[19 + outpos] = ((in[26 + inpos]) >>> (46 - 26))
                        | ((in[27 + inpos]) << 26);
                out[20 + outpos] = ((in[27 + inpos]) >>> (46 - 8))
                        | ((in[28 + inpos]) << 8)
                        | ((in[29 + inpos]) << 54);
                out[21 + outpos] = ((in[29 + inpos]) >>> (46 - 36))
                        | ((in[30 + inpos]) << 36);
                out[22 + outpos] = ((in[30 + inpos]) >>> (46 - 18))
                        | ((in[31 + inpos]) << 18);
                out[23 + outpos] = in[32 + inpos]
                        | ((in[33 + inpos]) << 46);
                out[24 + outpos] = ((in[33 + inpos]) >>> (46 - 28))
                        | ((in[34 + inpos]) << 28);
                out[25 + outpos] = ((in[34 + inpos]) >>> (46 - 10))
                        | ((in[35 + inpos]) << 10)
                        | ((in[36 + inpos]) << 56);
                out[26 + outpos] = ((in[36 + inpos]) >>> (46 - 38))
                        | ((in[37 + inpos]) << 38);
                out[27 + outpos] = ((in[37 + inpos]) >>> (46 - 20))
                        | ((in[38 + inpos]) << 20);
                out[28 + outpos] = ((in[38 + inpos]) >>> (46 - 2))
                        | ((in[39 + inpos]) << 2)
                        | ((in[40 + inpos]) << 48);
                out[29 + outpos] = ((in[40 + inpos]) >>> (46 - 30))
                        | ((in[41 + inpos]) << 30);
                out[30 + outpos] = ((in[41 + inpos]) >>> (46 - 12))
                        | ((in[42 + inpos]) << 12)
                        | ((in[43 + inpos]) << 58);
                out[31 + outpos] = ((in[43 + inpos]) >>> (46 - 40))
                        | ((in[44 + inpos]) << 40);
                out[32 + outpos] = ((in[44 + inpos]) >>> (46 - 22))
                        | ((in[45 + inpos]) << 22);
                out[33 + outpos] = ((in[45 + inpos]) >>> (46 - 4))
                        | ((in[46 + inpos]) << 4)
                        | ((in[47 + inpos]) << 50);
                out[34 + outpos] = ((in[47 + inpos]) >>> (46 - 32))
                        | ((in[48 + inpos]) << 32);
                out[35 + outpos] = ((in[48 + inpos]) >>> (46 - 14))
                        | ((in[49 + inpos]) << 14)
                        | ((in[50 + inpos]) << 60);
                out[36 + outpos] = ((in[50 + inpos]) >>> (46 - 42))
                        | ((in[51 + inpos]) << 42);
                out[37 + outpos] = ((in[51 + inpos]) >>> (46 - 24))
                        | ((in[52 + inpos]) << 24);
                out[38 + outpos] = ((in[52 + inpos]) >>> (46 - 6))
                        | ((in[53 + inpos]) << 6)
                        | ((in[54 + inpos]) << 52);
                out[39 + outpos] = ((in[54 + inpos]) >>> (46 - 34))
                        | ((in[55 + inpos]) << 34);
                out[40 + outpos] = ((in[55 + inpos]) >>> (46 - 16))
                        | ((in[56 + inpos]) << 16)
                        | ((in[57 + inpos]) << 62);
                out[41 + outpos] = ((in[57 + inpos]) >>> (46 - 44))
                        | ((in[58 + inpos]) << 44);
                out[42 + outpos] = ((in[58 + inpos]) >>> (46 - 26))
                        | ((in[59 + inpos]) << 26);
                out[43 + outpos] = ((in[59 + inpos]) >>> (46 - 8))
                        | ((in[60 + inpos]) << 8)
                        | ((in[61 + inpos]) << 54);
                out[44 + outpos] = ((in[61 + inpos]) >>> (46 - 36))
                        | ((in[62 + inpos]) << 36);
                out[45 + outpos] = ((in[62 + inpos]) >>> (46 - 18))
                        | ((in[63 + inpos]) << 18);
        }

        protected static void fastpackwithoutmask47(final long[] in, int inpos,
                final long[] out, int outpos) {
                out[outpos] = in[inpos] | ((in[1 + inpos]) << 47);
                out[1 + outpos] = ((in[1 + inpos]) >>> (47 - 30))
                        | ((in[2 + inpos]) << 30);
                out[2 + outpos] = ((in[2 + inpos]) >>> (47 - 13))
                        | ((in[3 + inpos]) << 13)
                        | ((in[4 + inpos]) << 60);
                out[3 + outpos] = ((in[4 + inpos]) >>> (47 - 43))
                        | ((in[5 + inpos]) << 43);
                out[4 + outpos] = ((in[5 + inpos]) >>> (47 - 26))
                        | ((in[6 + inpos]) << 26);
                out[5 + outpos] = ((in[6 + inpos]) >>> (47 - 9))
                        | ((in[7 + inpos]) << 9)
                        | ((in[8 + inpos]) << 56);
                out[6 + outpos] = ((in[8 + inpos]) >>> (47 - 39))
                        | ((in[9 + inpos]) << 39);
                out[7 + outpos] = ((in[9 + inpos]) >>> (47 - 22))
                        | ((in[10 + inpos]) << 22);
                out[8 + outpos] = ((in[10 + inpos]) >>> (47 - 5))
                        | ((in[11 + inpos]) << 5)
                        | ((in[12 + inpos]) << 52);
                out[9 + outpos] = ((in[12 + inpos]) >>> (47 - 35))
                        | ((in[13 + inpos]) << 35);
                out[10 + outpos] = ((in[13 + inpos]) >>> (47 - 18))
                        | ((in[14 + inpos]) << 18);
                out[11 + outpos] = ((in[14 + inpos]) >>> (47 - 1))
                        | ((in[15 + inpos]) << 1)
                        | ((in[16 + inpos]) << 48);
                out[12 + outpos] = ((in[16 + inpos]) >>> (47 - 31))
                        | ((in[17 + inpos]) << 31);
                out[13 + outpos] = ((in[17 + inpos]) >>> (47 - 14))
                        | ((in[18 + inpos]) << 14)
                        | ((in[19 + inpos]) << 61);
                out[14 + outpos] = ((in[19 + inpos]) >>> (47 - 44))
                        | ((in[20 + inpos]) << 44);
                out[15 + outpos] = ((in[20 + inpos]) >>> (47 - 27))
                        | ((in[21 + inpos]) << 27);
                out[16 + outpos] = ((in[21 + inpos]) >>> (47 - 10))
                        | ((in[22 + inpos]) << 10)
                        | ((in[23 + inpos]) << 57);
                out[17 + outpos] = ((in[23 + inpos]) >>> (47 - 40))
                        | ((in[24 + inpos]) << 40);
                out[18 + outpos] = ((in[24 + inpos]) >>> (47 - 23))
                        | ((in[25 + inpos]) << 23);
                out[19 + outpos] = ((in[25 + inpos]) >>> (47 - 6))
                        | ((in[26 + inpos]) << 6)
                        | ((in[27 + inpos]) << 53);
                out[20 + outpos] = ((in[27 + inpos]) >>> (47 - 36))
                        | ((in[28 + inpos]) << 36);
                out[21 + outpos] = ((in[28 + inpos]) >>> (47 - 19))
                        | ((in[29 + inpos]) << 19);
                out[22 + outpos] = ((in[29 + inpos]) >>> (47 - 2))
                        | ((in[30 + inpos]) << 2)
                        | ((in[31 + inpos]) << 49);
                out[23 + outpos] = ((in[31 + inpos]) >>> (47 - 32))
                        | ((in[32 + inpos]) << 32);
                out[24 + outpos] = ((in[32 + inpos]) >>> (47 - 15))
                        | ((in[33 + inpos]) << 15)
                        | ((in[34 + inpos]) << 62);
                out[25 + outpos] = ((in[34 + inpos]) >>> (47 - 45))
                        | ((in[35 + inpos]) << 45);
                out[26 + outpos] = ((in[35 + inpos]) >>> (47 - 28))
                        | ((in[36 + inpos]) << 28);
                out[27 + outpos] = ((in[36 + inpos]) >>> (47 - 11))
                        | ((in[37 + inpos]) << 11)
                        | ((in[38 + inpos]) << 58);
                out[28 + outpos] = ((in[38 + inpos]) >>> (47 - 41))
                        | ((in[39 + inpos]) << 41);
                out[29 + outpos] = ((in[39 + inpos]) >>> (47 - 24))
                        | ((in[40 + inpos]) << 24);
                out[30 + outpos] = ((in[40 + inpos]) >>> (47 - 7))
                        | ((in[41 + inpos]) << 7)
                        | ((in[42 + inpos]) << 54);
                out[31 + outpos] = ((in[42 + inpos]) >>> (47 - 37))
                        | ((in[43 + inpos]) << 37);
                out[32 + outpos] = ((in[43 + inpos]) >>> (47 - 20))
                        | ((in[44 + inpos]) << 20);
                out[33 + outpos] = ((in[44 + inpos]) >>> (47 - 3))
                        | ((in[45 + inpos]) << 3)
                        | ((in[46 + inpos]) << 50);
                out[34 + outpos] = ((in[46 + inpos]) >>> (47 - 33))
                        | ((in[47 + inpos]) << 33);
                out[35 + outpos] = ((in[47 + inpos]) >>> (47 - 16))
                        | ((in[48 + inpos]) << 16)
                        | ((in[49 + inpos]) << 63);
                out[36 + outpos] = ((in[49 + inpos]) >>> (47 - 46))
                        | ((in[50 + inpos]) << 46);
                out[37 + outpos] = ((in[50 + inpos]) >>> (47 - 29))
                        | ((in[51 + inpos]) << 29);
                out[38 + outpos] = ((in[51 + inpos]) >>> (47 - 12))
                        | ((in[52 + inpos]) << 12)
                        | ((in[53 + inpos]) << 59);
                out[39 + outpos] = ((in[53 + inpos]) >>> (47 - 42))
                        | ((in[54 + inpos]) << 42);
                out[40 + outpos] = ((in[54 + inpos]) >>> (47 - 25))
                        | ((in[55 + inpos]) << 25);
                out[41 + outpos] = ((in[55 + inpos]) >>> (47 - 8))
                        | ((in[56 + inpos]) << 8)
                        | ((in[57 + inpos]) << 55);
                out[42 + outpos] = ((in[57 + inpos]) >>> (47 - 38))
                        | ((in[58 + inpos]) << 38);
                out[43 + outpos] = ((in[58 + inpos]) >>> (47 - 21))
                        | ((in[59 + inpos]) << 21);
                out[44 + outpos] = ((in[59 + inpos]) >>> (47 - 4))
                        | ((in[60 + inpos]) << 4)
                        | ((in[61 + inpos]) << 51);
                out[45 + outpos] = ((in[61 + inpos]) >>> (47 - 34))
                        | ((in[62 + inpos]) << 34);
                out[46 + outpos] = ((in[62 + inpos]) >>> (47 - 17))
                        | ((in[63 + inpos]) << 17);
        }

        protected static void fastpackwithoutmask48(final long[] in, int inpos,
                final long[] out, int outpos) {
                out[outpos] = in[inpos] | ((in[1 + inpos]) << 48);
                out[1 + outpos] = ((in[1 + inpos]) >>> (48 - 32))
                        | ((in[2 + inpos]) << 32);
                out[2 + outpos] = ((in[2 + inpos]) >>> (48 - 16))
                        | ((in[3 + inpos]) << 16);
                out[3 + outpos] = in[4 + inpos]
                        | ((in[5 + inpos]) << 48);
                out[4 + outpos] = ((in[5 + inpos]) >>> (48 - 32))
                        | ((in[6 + inpos]) << 32);
                out[5 + outpos] = ((in[6 + inpos]) >>> (48 - 16))
                        | ((in[7 + inpos]) << 16);
                out[6 + outpos] = in[8 + inpos]
                        | ((in[9 + inpos]) << 48);
                out[7 + outpos] = ((in[9 + inpos]) >>> (48 - 32))
                        | ((in[10 + inpos]) << 32);
                out[8 + outpos] = ((in[10 + inpos]) >>> (48 - 16))
                        | ((in[11 + inpos]) << 16);
                out[9 + outpos] = in[12 + inpos]
                        | ((in[13 + inpos]) << 48);
                out[10 + outpos] = ((in[13 + inpos]) >>> (48 - 32))
                        | ((in[14 + inpos]) << 32);
                out[11 + outpos] = ((in[14 + inpos]) >>> (48 - 16))
                        | ((in[15 + inpos]) << 16);
                out[12 + outpos] = in[16 + inpos]
                        | ((in[17 + inpos]) << 48);
                out[13 + outpos] = ((in[17 + inpos]) >>> (48 - 32))
                        | ((in[18 + inpos]) << 32);
                out[14 + outpos] = ((in[18 + inpos]) >>> (48 - 16))
                        | ((in[19 + inpos]) << 16);
                out[15 + outpos] = in[20 + inpos]
                        | ((in[21 + inpos]) << 48);
                out[16 + outpos] = ((in[21 + inpos]) >>> (48 - 32))
                        | ((in[22 + inpos]) << 32);
                out[17 + outpos] = ((in[22 + inpos]) >>> (48 - 16))
                        | ((in[23 + inpos]) << 16);
                out[18 + outpos] = in[24 + inpos]
                        | ((in[25 + inpos]) << 48);
                out[19 + outpos] = ((in[25 + inpos]) >>> (48 - 32))
                        | ((in[26 + inpos]) << 32);
                out[20 + outpos] = ((in[26 + inpos]) >>> (48 - 16))
                        | ((in[27 + inpos]) << 16);
                out[21 + outpos] = in[28 + inpos]
                        | ((in[29 + inpos]) << 48);
                out[22 + outpos] = ((in[29 + inpos]) >>> (48 - 32))
                        | ((in[30 + inpos]) << 32);
                out[23 + outpos] = ((in[30 + inpos]) >>> (48 - 16))
                        | ((in[31 + inpos]) << 16);
                out[24 + outpos] = in[32 + inpos]
                        | ((in[33 + inpos]) << 48);
                out[25 + outpos] = ((in[33 + inpos]) >>> (48 - 32))
                        | ((in[34 + inpos]) << 32);
                out[26 + outpos] = ((in[34 + inpos]) >>> (48 - 16))
                        | ((in[35 + inpos]) << 16);
                out[27 + outpos] = in[36 + inpos]
                        | ((in[37 + inpos]) << 48);
                out[28 + outpos] = ((in[37 + inpos]) >>> (48 - 32))
                        | ((in[38 + inpos]) << 32);
                out[29 + outpos] = ((in[38 + inpos]) >>> (48 - 16))
                        | ((in[39 + inpos]) << 16);
                out[30 + outpos] = in[40 + inpos]
                        | ((in[41 + inpos]) << 48);
                out[31 + outpos] = ((in[41 + inpos]) >>> (48 - 32))
                        | ((in[42 + inpos]) << 32);
                out[32 + outpos] = ((in[42 + inpos]) >>> (48 - 16))
                        | ((in[43 + inpos]) << 16);
                out[33 + outpos] = in[44 + inpos]
                        | ((in[45 + inpos]) << 48);
                out[34 + outpos] = ((in[45 + inpos]) >>> (48 - 32))
                        | ((in[46 + inpos]) << 32);
                out[35 + outpos] = ((in[46 + inpos]) >>> (48 - 16))
                        | ((in[47 + inpos]) << 16);
                out[36 + outpos] = in[48 + inpos]
                        | ((in[49 + inpos]) << 48);
                out[37 + outpos] = ((in[49 + inpos]) >>> (48 - 32))
                        | ((in[50 + inpos]) << 32);
                out[38 + outpos] = ((in[50 + inpos]) >>> (48 - 16))
                        | ((in[51 + inpos]) << 16);
                out[39 + outpos] = in[52 + inpos]
                        | ((in[53 + inpos]) << 48);
                out[40 + outpos] = ((in[53 + inpos]) >>> (48 - 32))
                        | ((in[54 + inpos]) << 32);
                out[41 + outpos] = ((in[54 + inpos]) >>> (48 - 16))
                        | ((in[55 + inpos]) << 16);
                out[42 + outpos] = in[56 + inpos]
                        | ((in[57 + inpos]) << 48);
                out[43 + outpos] = ((in[57 + inpos]) >>> (48 - 32))
                        | ((in[58 + inpos]) << 32);
                out[44 + outpos] = ((in[58 + inpos]) >>> (48 - 16))
                        | ((in[59 + inpos]) << 16);
                out[45 + outpos] = in[60 + inpos]
                        | ((in[61 + inpos]) << 48);
                out[46 + outpos] = ((in[61 + inpos]) >>> (48 - 32))
                        | ((in[62 + inpos]) << 32);
                out[47 + outpos] = ((in[62 + inpos]) >>> (48 - 16))
                        | ((in[63 + inpos]) << 16);
        }

        protected static void fastpackwithoutmask49(final long[] in, int inpos,
                final long[] out, int outpos) {
                out[outpos] = in[inpos] | ((in[1 + inpos]) << 49);
                out[1 + outpos] = ((in[1 + inpos]) >>> (49 - 34))
                        | ((in[2 + inpos]) << 34);
                out[2 + outpos] = ((in[2 + inpos]) >>> (49 - 19))
                        | ((in[3 + inpos]) << 19);
                out[3 + outpos] = ((in[3 + inpos]) >>> (49 - 4))
                        | ((in[4 + inpos]) << 4)
                        | ((in[5 + inpos]) << 53);
                out[4 + outpos] = ((in[5 + inpos]) >>> (49 - 38))
                        | ((in[6 + inpos]) << 38);
                out[5 + outpos] = ((in[6 + inpos]) >>> (49 - 23))
                        | ((in[7 + inpos]) << 23);
                out[6 + outpos] = ((in[7 + inpos]) >>> (49 - 8))
                        | ((in[8 + inpos]) << 8)
                        | ((in[9 + inpos]) << 57);
                out[7 + outpos] = ((in[9 + inpos]) >>> (49 - 42))
                        | ((in[10 + inpos]) << 42);
                out[8 + outpos] = ((in[10 + inpos]) >>> (49 - 27))
                        | ((in[11 + inpos]) << 27);
                out[9 + outpos] = ((in[11 + inpos]) >>> (49 - 12))
                        | ((in[12 + inpos]) << 12)
                        | ((in[13 + inpos]) << 61);
                out[10 + outpos] = ((in[13 + inpos]) >>> (49 - 46))
                        | ((in[14 + inpos]) << 46);
                out[11 + outpos] = ((in[14 + inpos]) >>> (49 - 31))
                        | ((in[15 + inpos]) << 31);
                out[12 + outpos] = ((in[15 + inpos]) >>> (49 - 16))
                        | ((in[16 + inpos]) << 16);
                out[13 + outpos] = ((in[16 + inpos]) >>> (49 - 1))
                        | ((in[17 + inpos]) << 1)
                        | ((in[18 + inpos]) << 50);
                out[14 + outpos] = ((in[18 + inpos]) >>> (49 - 35))
                        | ((in[19 + inpos]) << 35);
                out[15 + outpos] = ((in[19 + inpos]) >>> (49 - 20))
                        | ((in[20 + inpos]) << 20);
                out[16 + outpos] = ((in[20 + inpos]) >>> (49 - 5))
                        | ((in[21 + inpos]) << 5)
                        | ((in[22 + inpos]) << 54);
                out[17 + outpos] = ((in[22 + inpos]) >>> (49 - 39))
                        | ((in[23 + inpos]) << 39);
                out[18 + outpos] = ((in[23 + inpos]) >>> (49 - 24))
                        | ((in[24 + inpos]) << 24);
                out[19 + outpos] = ((in[24 + inpos]) >>> (49 - 9))
                        | ((in[25 + inpos]) << 9)
                        | ((in[26 + inpos]) << 58);
                out[20 + outpos] = ((in[26 + inpos]) >>> (49 - 43))
                        | ((in[27 + inpos]) << 43);
                out[21 + outpos] = ((in[27 + inpos]) >>> (49 - 28))
                        | ((in[28 + inpos]) << 28);
                out[22 + outpos] = ((in[28 + inpos]) >>> (49 - 13))
                        | ((in[29 + inpos]) << 13)
                        | ((in[30 + inpos]) << 62);
                out[23 + outpos] = ((in[30 + inpos]) >>> (49 - 47))
                        | ((in[31 + inpos]) << 47);
                out[24 + outpos] = ((in[31 + inpos]) >>> (49 - 32))
                        | ((in[32 + inpos]) << 32);
                out[25 + outpos] = ((in[32 + inpos]) >>> (49 - 17))
                        | ((in[33 + inpos]) << 17);
                out[26 + outpos] = ((in[33 + inpos]) >>> (49 - 2))
                        | ((in[34 + inpos]) << 2)
                        | ((in[35 + inpos]) << 51);
                out[27 + outpos] = ((in[35 + inpos]) >>> (49 - 36))
                        | ((in[36 + inpos]) << 36);
                out[28 + outpos] = ((in[36 + inpos]) >>> (49 - 21))
                        | ((in[37 + inpos]) << 21);
                out[29 + outpos] = ((in[37 + inpos]) >>> (49 - 6))
                        | ((in[38 + inpos]) << 6)
                        | ((in[39 + inpos]) << 55);
                out[30 + outpos] = ((in[39 + inpos]) >>> (49 - 40))
                        | ((in[40 + inpos]) << 40);
                out[31 + outpos] = ((in[40 + inpos]) >>> (49 - 25))
                        | ((in[41 + inpos]) << 25);
                out[32 + outpos] = ((in[41 + inpos]) >>> (49 - 10))
                        | ((in[42 + inpos]) << 10)
                        | ((in[43 + inpos]) << 59);
                out[33 + outpos] = ((in[43 + inpos]) >>> (49 - 44))
                        | ((in[44 + inpos]) << 44);
                out[34 + outpos] = ((in[44 + inpos]) >>> (49 - 29))
                        | ((in[45 + inpos]) << 29);
                out[35 + outpos] = ((in[45 + inpos]) >>> (49 - 14))
                        | ((in[46 + inpos]) << 14)
                        | ((in[47 + inpos]) << 63);
                out[36 + outpos] = ((in[47 + inpos]) >>> (49 - 48))
                        | ((in[48 + inpos]) << 48);
                out[37 + outpos] = ((in[48 + inpos]) >>> (49 - 33))
                        | ((in[49 + inpos]) << 33);
                out[38 + outpos] = ((in[49 + inpos]) >>> (49 - 18))
                        | ((in[50 + inpos]) << 18);
                out[39 + outpos] = ((in[50 + inpos]) >>> (49 - 3))
                        | ((in[51 + inpos]) << 3)
                        | ((in[52 + inpos]) << 52);
                out[40 + outpos] = ((in[52 + inpos]) >>> (49 - 37))
                        | ((in[53 + inpos]) << 37);
                out[41 + outpos] = ((in[53 + inpos]) >>> (49 - 22))
                        | ((in[54 + inpos]) << 22);
                out[42 + outpos] = ((in[54 + inpos]) >>> (49 - 7))
                        | ((in[55 + inpos]) << 7)
                        | ((in[56 + inpos]) << 56);
                out[43 + outpos] = ((in[56 + inpos]) >>> (49 - 41))
                        | ((in[57 + inpos]) << 41);
                out[44 + outpos] = ((in[57 + inpos]) >>> (49 - 26))
                        | ((in[58 + inpos]) << 26);
                out[45 + outpos] = ((in[58 + inpos]) >>> (49 - 11))
                        | ((in[59 + inpos]) << 11)
                        | ((in[60 + inpos]) << 60);
                out[46 + outpos] = ((in[60 + inpos]) >>> (49 - 45))
                        | ((in[61 + inpos]) << 45);
                out[47 + outpos] = ((in[61 + inpos]) >>> (49 - 30))
                        | ((in[62 + inpos]) << 30);
                out[48 + outpos] = ((in[62 + inpos]) >>> (49 - 15))
                        | ((in[63 + inpos]) << 15);
        }

        protected static void fastpackwithoutmask50(final long[] in, int inpos,
                final long[] out, int outpos) {
                out[outpos] = in[inpos] | ((in[1 + inpos]) << 50);
                out[1 + outpos] = ((in[1 + inpos]) >>> (50 - 36))
                        | ((in[2 + inpos]) << 36);
                out[2 + outpos] = ((in[2 + inpos]) >>> (50 - 22))
                        | ((in[3 + inpos]) << 22);
                out[3 + outpos] = ((in[3 + inpos]) >>> (50 - 8))
                        | ((in[4 + inpos]) << 8)
                        | ((in[5 + inpos]) << 58);
                out[4 + outpos] = ((in[5 + inpos]) >>> (50 - 44))
                        | ((in[6 + inpos]) << 44);
                out[5 + outpos] = ((in[6 + inpos]) >>> (50 - 30))
                        | ((in[7 + inpos]) << 30);
                out[6 + outpos] = ((in[7 + inpos]) >>> (50 - 16))
                        | ((in[8 + inpos]) << 16);
                out[7 + outpos] = ((in[8 + inpos]) >>> (50 - 2))
                        | ((in[9 + inpos]) << 2)
                        | ((in[10 + inpos]) << 52);
                out[8 + outpos] = ((in[10 + inpos]) >>> (50 - 38))
                        | ((in[11 + inpos]) << 38);
                out[9 + outpos] = ((in[11 + inpos]) >>> (50 - 24))
                        | ((in[12 + inpos]) << 24);
                out[10 + outpos] = ((in[12 + inpos]) >>> (50 - 10))
                        | ((in[13 + inpos]) << 10)
                        | ((in[14 + inpos]) << 60);
                out[11 + outpos] = ((in[14 + inpos]) >>> (50 - 46))
                        | ((in[15 + inpos]) << 46);
                out[12 + outpos] = ((in[15 + inpos]) >>> (50 - 32))
                        | ((in[16 + inpos]) << 32);
                out[13 + outpos] = ((in[16 + inpos]) >>> (50 - 18))
                        | ((in[17 + inpos]) << 18);
                out[14 + outpos] = ((in[17 + inpos]) >>> (50 - 4))
                        | ((in[18 + inpos]) << 4)
                        | ((in[19 + inpos]) << 54);
                out[15 + outpos] = ((in[19 + inpos]) >>> (50 - 40))
                        | ((in[20 + inpos]) << 40);
                out[16 + outpos] = ((in[20 + inpos]) >>> (50 - 26))
                        | ((in[21 + inpos]) << 26);
                out[17 + outpos] = ((in[21 + inpos]) >>> (50 - 12))
                        | ((in[22 + inpos]) << 12)
                        | ((in[23 + inpos]) << 62);
                out[18 + outpos] = ((in[23 + inpos]) >>> (50 - 48))
                        | ((in[24 + inpos]) << 48);
                out[19 + outpos] = ((in[24 + inpos]) >>> (50 - 34))
                        | ((in[25 + inpos]) << 34);
                out[20 + outpos] = ((in[25 + inpos]) >>> (50 - 20))
                        | ((in[26 + inpos]) << 20);
                out[21 + outpos] = ((in[26 + inpos]) >>> (50 - 6))
                        | ((in[27 + inpos]) << 6)
                        | ((in[28 + inpos]) << 56);
                out[22 + outpos] = ((in[28 + inpos]) >>> (50 - 42))
                        | ((in[29 + inpos]) << 42);
                out[23 + outpos] = ((in[29 + inpos]) >>> (50 - 28))
                        | ((in[30 + inpos]) << 28);
                out[24 + outpos] = ((in[30 + inpos]) >>> (50 - 14))
                        | ((in[31 + inpos]) << 14);
                out[25 + outpos] = in[32 + inpos]
                        | ((in[33 + inpos]) << 50);
                out[26 + outpos] = ((in[33 + inpos]) >>> (50 - 36))
                        | ((in[34 + inpos]) << 36);
                out[27 + outpos] = ((in[34 + inpos]) >>> (50 - 22))
                        | ((in[35 + inpos]) << 22);
                out[28 + outpos] = ((in[35 + inpos]) >>> (50 - 8))
                        | ((in[36 + inpos]) << 8)
                        | ((in[37 + inpos]) << 58);
                out[29 + outpos] = ((in[37 + inpos]) >>> (50 - 44))
                        | ((in[38 + inpos]) << 44);
                out[30 + outpos] = ((in[38 + inpos]) >>> (50 - 30))
                        | ((in[39 + inpos]) << 30);
                out[31 + outpos] = ((in[39 + inpos]) >>> (50 - 16))
                        | ((in[40 + inpos]) << 16);
                out[32 + outpos] = ((in[40 + inpos]) >>> (50 - 2))
                        | ((in[41 + inpos]) << 2)
                        | ((in[42 + inpos]) << 52);
                out[33 + outpos] = ((in[42 + inpos]) >>> (50 - 38))
                        | ((in[43 + inpos]) << 38);
                out[34 + outpos] = ((in[43 + inpos]) >>> (50 - 24))
                        | ((in[44 + inpos]) << 24);
                out[35 + outpos] = ((in[44 + inpos]) >>> (50 - 10))
                        | ((in[45 + inpos]) << 10)
                        | ((in[46 + inpos]) << 60);
                out[36 + outpos] = ((in[46 + inpos]) >>> (50 - 46))
                        | ((in[47 + inpos]) << 46);
                out[37 + outpos] = ((in[47 + inpos]) >>> (50 - 32))
                        | ((in[48 + inpos]) << 32);
                out[38 + outpos] = ((in[48 + inpos]) >>> (50 - 18))
                        | ((in[49 + inpos]) << 18);
                out[39 + outpos] = ((in[49 + inpos]) >>> (50 - 4))
                        | ((in[50 + inpos]) << 4)
                        | ((in[51 + inpos]) << 54);
                out[40 + outpos] = ((in[51 + inpos]) >>> (50 - 40))
                        | ((in[52 + inpos]) << 40);
                out[41 + outpos] = ((in[52 + inpos]) >>> (50 - 26))
                        | ((in[53 + inpos]) << 26);
                out[42 + outpos] = ((in[53 + inpos]) >>> (50 - 12))
                        | ((in[54 + inpos]) << 12)
                        | ((in[55 + inpos]) << 62);
                out[43 + outpos] = ((in[55 + inpos]) >>> (50 - 48))
                        | ((in[56 + inpos]) << 48);
                out[44 + outpos] = ((in[56 + inpos]) >>> (50 - 34))
                        | ((in[57 + inpos]) << 34);
                out[45 + outpos] = ((in[57 + inpos]) >>> (50 - 20))
                        | ((in[58 + inpos]) << 20);
                out[46 + outpos] = ((in[58 + inpos]) >>> (50 - 6))
                        | ((in[59 + inpos]) << 6)
                        | ((in[60 + inpos]) << 56);
                out[47 + outpos] = ((in[60 + inpos]) >>> (50 - 42))
                        | ((in[61 + inpos]) << 42);
                out[48 + outpos] = ((in[61 + inpos]) >>> (50 - 28))
                        | ((in[62 + inpos]) << 28);
                out[49 + outpos] = ((in[62 + inpos]) >>> (50 - 14))
                        | ((in[63 + inpos]) << 14);
        }

        protected static void fastpackwithoutmask51(final long[] in, int inpos,
                final long[] out, int outpos) {
                out[outpos] = in[inpos] | ((in[1 + inpos]) << 51);
                out[1 + outpos] = ((in[1 + inpos]) >>> (51 - 38))
                        | ((in[2 + inpos]) << 38);
                out[2 + outpos] = ((in[2 + inpos]) >>> (51 - 25))
                        | ((in[3 + inpos]) << 25);
                out[3 + outpos] = ((in[3 + inpos]) >>> (51 - 12))
                        | ((in[4 + inpos]) << 12)
                        | ((in[5 + inpos]) << 63);
                out[4 + outpos] = ((in[5 + inpos]) >>> (51 - 50))
                        | ((in[6 + inpos]) << 50);
                out[5 + outpos] = ((in[6 + inpos]) >>> (51 - 37))
                        | ((in[7 + inpos]) << 37);
                out[6 + outpos] = ((in[7 + inpos]) >>> (51 - 24))
                        | ((in[8 + inpos]) << 24);
                out[7 + outpos] = ((in[8 + inpos]) >>> (51 - 11))
                        | ((in[9 + inpos]) << 11)
                        | ((in[10 + inpos]) << 62);
                out[8 + outpos] = ((in[10 + inpos]) >>> (51 - 49))
                        | ((in[11 + inpos]) << 49);
                out[9 + outpos] = ((in[11 + inpos]) >>> (51 - 36))
                        | ((in[12 + inpos]) << 36);
                out[10 + outpos] = ((in[12 + inpos]) >>> (51 - 23))
                        | ((in[13 + inpos]) << 23);
                out[11 + outpos] = ((in[13 + inpos]) >>> (51 - 10))
                        | ((in[14 + inpos]) << 10)
                        | ((in[15 + inpos]) << 61);
                out[12 + outpos] = ((in[15 + inpos]) >>> (51 - 48))
                        | ((in[16 + inpos]) << 48);
                out[13 + outpos] = ((in[16 + inpos]) >>> (51 - 35))
                        | ((in[17 + inpos]) << 35);
                out[14 + outpos] = ((in[17 + inpos]) >>> (51 - 22))
                        | ((in[18 + inpos]) << 22);
                out[15 + outpos] = ((in[18 + inpos]) >>> (51 - 9))
                        | ((in[19 + inpos]) << 9)
                        | ((in[20 + inpos]) << 60);
                out[16 + outpos] = ((in[20 + inpos]) >>> (51 - 47))
                        | ((in[21 + inpos]) << 47);
                out[17 + outpos] = ((in[21 + inpos]) >>> (51 - 34))
                        | ((in[22 + inpos]) << 34);
                out[18 + outpos] = ((in[22 + inpos]) >>> (51 - 21))
                        | ((in[23 + inpos]) << 21);
                out[19 + outpos] = ((in[23 + inpos]) >>> (51 - 8))
                        | ((in[24 + inpos]) << 8)
                        | ((in[25 + inpos]) << 59);
                out[20 + outpos] = ((in[25 + inpos]) >>> (51 - 46))
                        | ((in[26 + inpos]) << 46);
                out[21 + outpos] = ((in[26 + inpos]) >>> (51 - 33))
                        | ((in[27 + inpos]) << 33);
                out[22 + outpos] = ((in[27 + inpos]) >>> (51 - 20))
                        | ((in[28 + inpos]) << 20);
                out[23 + outpos] = ((in[28 + inpos]) >>> (51 - 7))
                        | ((in[29 + inpos]) << 7)
                        | ((in[30 + inpos]) << 58);
                out[24 + outpos] = ((in[30 + inpos]) >>> (51 - 45))
                        | ((in[31 + inpos]) << 45);
                out[25 + outpos] = ((in[31 + inpos]) >>> (51 - 32))
                        | ((in[32 + inpos]) << 32);
                out[26 + outpos] = ((in[32 + inpos]) >>> (51 - 19))
                        | ((in[33 + inpos]) << 19);
                out[27 + outpos] = ((in[33 + inpos]) >>> (51 - 6))
                        | ((in[34 + inpos]) << 6)
                        | ((in[35 + inpos]) << 57);
                out[28 + outpos] = ((in[35 + inpos]) >>> (51 - 44))
                        | ((in[36 + inpos]) << 44);
                out[29 + outpos] = ((in[36 + inpos]) >>> (51 - 31))
                        | ((in[37 + inpos]) << 31);
                out[30 + outpos] = ((in[37 + inpos]) >>> (51 - 18))
                        | ((in[38 + inpos]) << 18);
                out[31 + outpos] = ((in[38 + inpos]) >>> (51 - 5))
                        | ((in[39 + inpos]) << 5)
                        | ((in[40 + inpos]) << 56);
                out[32 + outpos] = ((in[40 + inpos]) >>> (51 - 43))
                        | ((in[41 + inpos]) << 43);
                out[33 + outpos] = ((in[41 + inpos]) >>> (51 - 30))
                        | ((in[42 + inpos]) << 30);
                out[34 + outpos] = ((in[42 + inpos]) >>> (51 - 17))
                        | ((in[43 + inpos]) << 17);
                out[35 + outpos] = ((in[43 + inpos]) >>> (51 - 4))
                        | ((in[44 + inpos]) << 4)
                        | ((in[45 + inpos]) << 55);
                out[36 + outpos] = ((in[45 + inpos]) >>> (51 - 42))
                        | ((in[46 + inpos]) << 42);
                out[37 + outpos] = ((in[46 + inpos]) >>> (51 - 29))
                        | ((in[47 + inpos]) << 29);
                out[38 + outpos] = ((in[47 + inpos]) >>> (51 - 16))
                        | ((in[48 + inpos]) << 16);
                out[39 + outpos] = ((in[48 + inpos]) >>> (51 - 3))
                        | ((in[49 + inpos]) << 3)
                        | ((in[50 + inpos]) << 54);
                out[40 + outpos] = ((in[50 + inpos]) >>> (51 - 41))
                        | ((in[51 + inpos]) << 41);
                out[41 + outpos] = ((in[51 + inpos]) >>> (51 - 28))
                        | ((in[52 + inpos]) << 28);
                out[42 + outpos] = ((in[52 + inpos]) >>> (51 - 15))
                        | ((in[53 + inpos]) << 15);
                out[43 + outpos] = ((in[53 + inpos]) >>> (51 - 2))
                        | ((in[54 + inpos]) << 2)
                        | ((in[55 + inpos]) << 53);
                out[44 + outpos] = ((in[55 + inpos]) >>> (51 - 40))
                        | ((in[56 + inpos]) << 40);
                out[45 + outpos] = ((in[56 + inpos]) >>> (51 - 27))
                        | ((in[57 + inpos]) << 27);
                out[46 + outpos] = ((in[57 + inpos]) >>> (51 - 14))
                        | ((in[58 + inpos]) << 14);
                out[47 + outpos] = ((in[58 + inpos]) >>> (51 - 1))
                        | ((in[59 + inpos]) << 1)
                        | ((in[60 + inpos]) << 52);
                out[48 + outpos] = ((in[60 + inpos]) >>> (51 - 39))
                        | ((in[61 + inpos]) << 39);
                out[49 + outpos] = ((in[61 + inpos]) >>> (51 - 26))
                        | ((in[62 + inpos]) << 26);
                out[50 + outpos] = ((in[62 + inpos]) >>> (51 - 13))
                        | ((in[63 + inpos]) << 13);
        }

        protected static void fastpackwithoutmask52(final long[] in, int inpos,
                final long[] out, int outpos) {
                out[outpos] = in[inpos] | ((in[1 + inpos]) << 52);
                out[1 + outpos] = ((in[1 + inpos]) >>> (52 - 40))
                        | ((in[2 + inpos]) << 40);
                out[2 + outpos] = ((in[2 + inpos]) >>> (52 - 28))
                        | ((in[3 + inpos]) << 28);
                out[3 + outpos] = ((in[3 + inpos]) >>> (52 - 16))
                        | ((in[4 + inpos]) << 16);
                out[4 + outpos] = ((in[4 + inpos]) >>> (52 - 4))
                        | ((in[5 + inpos]) << 4)
                        | ((in[6 + inpos]) << 56);
                out[5 + outpos] = ((in[6 + inpos]) >>> (52 - 44))
                        | ((in[7 + inpos]) << 44);
                out[6 + outpos] = ((in[7 + inpos]) >>> (52 - 32))
                        | ((in[8 + inpos]) << 32);
                out[7 + outpos] = ((in[8 + inpos]) >>> (52 - 20))
                        | ((in[9 + inpos]) << 20);
                out[8 + outpos] = ((in[9 + inpos]) >>> (52 - 8))
                        | ((in[10 + inpos]) << 8)
                        | ((in[11 + inpos]) << 60);
                out[9 + outpos] = ((in[11 + inpos]) >>> (52 - 48))
                        | ((in[12 + inpos]) << 48);
                out[10 + outpos] = ((in[12 + inpos]) >>> (52 - 36))
                        | ((in[13 + inpos]) << 36);
                out[11 + outpos] = ((in[13 + inpos]) >>> (52 - 24))
                        | ((in[14 + inpos]) << 24);
                out[12 + outpos] = ((in[14 + inpos]) >>> (52 - 12))
                        | ((in[15 + inpos]) << 12);
                out[13 + outpos] = in[16 + inpos]
                        | ((in[17 + inpos]) << 52);
                out[14 + outpos] = ((in[17 + inpos]) >>> (52 - 40))
                        | ((in[18 + inpos]) << 40);
                out[15 + outpos] = ((in[18 + inpos]) >>> (52 - 28))
                        | ((in[19 + inpos]) << 28);
                out[16 + outpos] = ((in[19 + inpos]) >>> (52 - 16))
                        | ((in[20 + inpos]) << 16);
                out[17 + outpos] = ((in[20 + inpos]) >>> (52 - 4))
                        | ((in[21 + inpos]) << 4)
                        | ((in[22 + inpos]) << 56);
                out[18 + outpos] = ((in[22 + inpos]) >>> (52 - 44))
                        | ((in[23 + inpos]) << 44);
                out[19 + outpos] = ((in[23 + inpos]) >>> (52 - 32))
                        | ((in[24 + inpos]) << 32);
                out[20 + outpos] = ((in[24 + inpos]) >>> (52 - 20))
                        | ((in[25 + inpos]) << 20);
                out[21 + outpos] = ((in[25 + inpos]) >>> (52 - 8))
                        | ((in[26 + inpos]) << 8)
                        | ((in[27 + inpos]) << 60);
                out[22 + outpos] = ((in[27 + inpos]) >>> (52 - 48))
                        | ((in[28 + inpos]) << 48);
                out[23 + outpos] = ((in[28 + inpos]) >>> (52 - 36))
                        | ((in[29 + inpos]) << 36);
                out[24 + outpos] = ((in[29 + inpos]) >>> (52 - 24))
                        | ((in[30 + inpos]) << 24);
                out[25 + outpos] = ((in[30 + inpos]) >>> (52 - 12))
                        | ((in[31 + inpos]) << 12);
                out[26 + outpos] = in[32 + inpos]
                        | ((in[33 + inpos]) << 52);
                out[27 + outpos] = ((in[33 + inpos]) >>> (52 - 40))
                        | ((in[34 + inpos]) << 40);
                out[28 + outpos] = ((in[34 + inpos]) >>> (52 - 28))
                        | ((in[35 + inpos]) << 28);
                out[29 + outpos] = ((in[35 + inpos]) >>> (52 - 16))
                        | ((in[36 + inpos]) << 16);
                out[30 + outpos] = ((in[36 + inpos]) >>> (52 - 4))
                        | ((in[37 + inpos]) << 4)
                        | ((in[38 + inpos]) << 56);
                out[31 + outpos] = ((in[38 + inpos]) >>> (52 - 44))
                        | ((in[39 + inpos]) << 44);
                out[32 + outpos] = ((in[39 + inpos]) >>> (52 - 32))
                        | ((in[40 + inpos]) << 32);
                out[33 + outpos] = ((in[40 + inpos]) >>> (52 - 20))
                        | ((in[41 + inpos]) << 20);
                out[34 + outpos] = ((in[41 + inpos]) >>> (52 - 8))
                        | ((in[42 + inpos]) << 8)
                        | ((in[43 + inpos]) << 60);
                out[35 + outpos] = ((in[43 + inpos]) >>> (52 - 48))
                        | ((in[44 + inpos]) << 48);
                out[36 + outpos] = ((in[44 + inpos]) >>> (52 - 36))
                        | ((in[45 + inpos]) << 36);
                out[37 + outpos] = ((in[45 + inpos]) >>> (52 - 24))
                        | ((in[46 + inpos]) << 24);
                out[38 + outpos] = ((in[46 + inpos]) >>> (52 - 12))
                        | ((in[47 + inpos]) << 12);
                out[39 + outpos] = in[48 + inpos]
                        | ((in[49 + inpos]) << 52);
                out[40 + outpos] = ((in[49 + inpos]) >>> (52 - 40))
                        | ((in[50 + inpos]) << 40);
                out[41 + outpos] = ((in[50 + inpos]) >>> (52 - 28))
                        | ((in[51 + inpos]) << 28);
                out[42 + outpos] = ((in[51 + inpos]) >>> (52 - 16))
                        | ((in[52 + inpos]) << 16);
                out[43 + outpos] = ((in[52 + inpos]) >>> (52 - 4))
                        | ((in[53 + inpos]) << 4)
                        | ((in[54 + inpos]) << 56);
                out[44 + outpos] = ((in[54 + inpos]) >>> (52 - 44))
                        | ((in[55 + inpos]) << 44);
                out[45 + outpos] = ((in[55 + inpos]) >>> (52 - 32))
                        | ((in[56 + inpos]) << 32);
                out[46 + outpos] = ((in[56 + inpos]) >>> (52 - 20))
                        | ((in[57 + inpos]) << 20);
                out[47 + outpos] = ((in[57 + inpos]) >>> (52 - 8))
                        | ((in[58 + inpos]) << 8)
                        | ((in[59 + inpos]) << 60);
                out[48 + outpos] = ((in[59 + inpos]) >>> (52 - 48))
                        | ((in[60 + inpos]) << 48);
                out[49 + outpos] = ((in[60 + inpos]) >>> (52 - 36))
                        | ((in[61 + inpos]) << 36);
                out[50 + outpos] = ((in[61 + inpos]) >>> (52 - 24))
                        | ((in[62 + inpos]) << 24);
                out[51 + outpos] = ((in[62 + inpos]) >>> (52 - 12))
                        | ((in[63 + inpos]) << 12);
        }

        protected static void fastpackwithoutmask53(final long[] in, int inpos,
                final long[] out, int outpos) {
                out[outpos] = in[inpos] | ((in[1 + inpos]) << 53);
                out[1 + outpos] = ((in[1 + inpos]) >>> (53 - 42))
                        | ((in[2 + inpos]) << 42);
                out[2 + outpos] = ((in[2 + inpos]) >>> (53 - 31))
                        | ((in[3 + inpos]) << 31);
                out[3 + outpos] = ((in[3 + inpos]) >>> (53 - 20))
                        | ((in[4 + inpos]) << 20);
                out[4 + outpos] = ((in[4 + inpos]) >>> (53 - 9))
                        | ((in[5 + inpos]) << 9)
                        | ((in[6 + inpos]) << 62);
                out[5 + outpos] = ((in[6 + inpos]) >>> (53 - 51))
                        | ((in[7 + inpos]) << 51);
                out[6 + outpos] = ((in[7 + inpos]) >>> (53 - 40))
                        | ((in[8 + inpos]) << 40);
                out[7 + outpos] = ((in[8 + inpos]) >>> (53 - 29))
                        | ((in[9 + inpos]) << 29);
                out[8 + outpos] = ((in[9 + inpos]) >>> (53 - 18))
                        | ((in[10 + inpos]) << 18);
                out[9 + outpos] = ((in[10 + inpos]) >>> (53 - 7))
                        | ((in[11 + inpos]) << 7)
                        | ((in[12 + inpos]) << 60);
                out[10 + outpos] = ((in[12 + inpos]) >>> (53 - 49))
                        | ((in[13 + inpos]) << 49);
                out[11 + outpos] = ((in[13 + inpos]) >>> (53 - 38))
                        | ((in[14 + inpos]) << 38);
                out[12 + outpos] = ((in[14 + inpos]) >>> (53 - 27))
                        | ((in[15 + inpos]) << 27);
                out[13 + outpos] = ((in[15 + inpos]) >>> (53 - 16))
                        | ((in[16 + inpos]) << 16);
                out[14 + outpos] = ((in[16 + inpos]) >>> (53 - 5))
                        | ((in[17 + inpos]) << 5)
                        | ((in[18 + inpos]) << 58);
                out[15 + outpos] = ((in[18 + inpos]) >>> (53 - 47))
                        | ((in[19 + inpos]) << 47);
                out[16 + outpos] = ((in[19 + inpos]) >>> (53 - 36))
                        | ((in[20 + inpos]) << 36);
                out[17 + outpos] = ((in[20 + inpos]) >>> (53 - 25))
                        | ((in[21 + inpos]) << 25);
                out[18 + outpos] = ((in[21 + inpos]) >>> (53 - 14))
                        | ((in[22 + inpos]) << 14);
                out[19 + outpos] = ((in[22 + inpos]) >>> (53 - 3))
                        | ((in[23 + inpos]) << 3)
                        | ((in[24 + inpos]) << 56);
                out[20 + outpos] = ((in[24 + inpos]) >>> (53 - 45))
                        | ((in[25 + inpos]) << 45);
                out[21 + outpos] = ((in[25 + inpos]) >>> (53 - 34))
                        | ((in[26 + inpos]) << 34);
                out[22 + outpos] = ((in[26 + inpos]) >>> (53 - 23))
                        | ((in[27 + inpos]) << 23);
                out[23 + outpos] = ((in[27 + inpos]) >>> (53 - 12))
                        | ((in[28 + inpos]) << 12);
                out[24 + outpos] = ((in[28 + inpos]) >>> (53 - 1))
                        | ((in[29 + inpos]) << 1)
                        | ((in[30 + inpos]) << 54);
                out[25 + outpos] = ((in[30 + inpos]) >>> (53 - 43))
                        | ((in[31 + inpos]) << 43);
                out[26 + outpos] = ((in[31 + inpos]) >>> (53 - 32))
                        | ((in[32 + inpos]) << 32);
                out[27 + outpos] = ((in[32 + inpos]) >>> (53 - 21))
                        | ((in[33 + inpos]) << 21);
                out[28 + outpos] = ((in[33 + inpos]) >>> (53 - 10))
                        | ((in[34 + inpos]) << 10)
                        | ((in[35 + inpos]) << 63);
                out[29 + outpos] = ((in[35 + inpos]) >>> (53 - 52))
                        | ((in[36 + inpos]) << 52);
                out[30 + outpos] = ((in[36 + inpos]) >>> (53 - 41))
                        | ((in[37 + inpos]) << 41);
                out[31 + outpos] = ((in[37 + inpos]) >>> (53 - 30))
                        | ((in[38 + inpos]) << 30);
                out[32 + outpos] = ((in[38 + inpos]) >>> (53 - 19))
                        | ((in[39 + inpos]) << 19);
                out[33 + outpos] = ((in[39 + inpos]) >>> (53 - 8))
                        | ((in[40 + inpos]) << 8)
                        | ((in[41 + inpos]) << 61);
                out[34 + outpos] = ((in[41 + inpos]) >>> (53 - 50))
                        | ((in[42 + inpos]) << 50);
                out[35 + outpos] = ((in[42 + inpos]) >>> (53 - 39))
                        | ((in[43 + inpos]) << 39);
                out[36 + outpos] = ((in[43 + inpos]) >>> (53 - 28))
                        | ((in[44 + inpos]) << 28);
                out[37 + outpos] = ((in[44 + inpos]) >>> (53 - 17))
                        | ((in[45 + inpos]) << 17);
                out[38 + outpos] = ((in[45 + inpos]) >>> (53 - 6))
                        | ((in[46 + inpos]) << 6)
                        | ((in[47 + inpos]) << 59);
                out[39 + outpos] = ((in[47 + inpos]) >>> (53 - 48))
                        | ((in[48 + inpos]) << 48);
                out[40 + outpos] = ((in[48 + inpos]) >>> (53 - 37))
                        | ((in[49 + inpos]) << 37);
                out[41 + outpos] = ((in[49 + inpos]) >>> (53 - 26))
                        | ((in[50 + inpos]) << 26);
                out[42 + outpos] = ((in[50 + inpos]) >>> (53 - 15))
                        | ((in[51 + inpos]) << 15);
                out[43 + outpos] = ((in[51 + inpos]) >>> (53 - 4))
                        | ((in[52 + inpos]) << 4)
                        | ((in[53 + inpos]) << 57);
                out[44 + outpos] = ((in[53 + inpos]) >>> (53 - 46))
                        | ((in[54 + inpos]) << 46);
                out[45 + outpos] = ((in[54 + inpos]) >>> (53 - 35))
                        | ((in[55 + inpos]) << 35);
                out[46 + outpos] = ((in[55 + inpos]) >>> (53 - 24))
                        | ((in[56 + inpos]) << 24);
                out[47 + outpos] = ((in[56 + inpos]) >>> (53 - 13))
                        | ((in[57 + inpos]) << 13);
                out[48 + outpos] = ((in[57 + inpos]) >>> (53 - 2))
                        | ((in[58 + inpos]) << 2)
                        | ((in[59 + inpos]) << 55);
                out[49 + outpos] = ((in[59 + inpos]) >>> (53 - 44))
                        | ((in[60 + inpos]) << 44);
                out[50 + outpos] = ((in[60 + inpos]) >>> (53 - 33))
                        | ((in[61 + inpos]) << 33);
                out[51 + outpos] = ((in[61 + inpos]) >>> (53 - 22))
                        | ((in[62 + inpos]) << 22);
                out[52 + outpos] = ((in[62 + inpos]) >>> (53 - 11))
                        | ((in[63 + inpos]) << 11);
        }

        protected static void fastpackwithoutmask54(final long[] in, int inpos,
                final long[] out, int outpos) {
                out[outpos] = in[inpos] | ((in[1 + inpos]) << 54);
                out[1 + outpos] = ((in[1 + inpos]) >>> (54 - 44))
                        | ((in[2 + inpos]) << 44);
                out[2 + outpos] = ((in[2 + inpos]) >>> (54 - 34))
                        | ((in[3 + inpos]) << 34);
                out[3 + outpos] = ((in[3 + inpos]) >>> (54 - 24))
                        | ((in[4 + inpos]) << 24);
                out[4 + outpos] = ((in[4 + inpos]) >>> (54 - 14))
                        | ((in[5 + inpos]) << 14);
                out[5 + outpos] = ((in[5 + inpos]) >>> (54 - 4))
                        | ((in[6 + inpos]) << 4)
                        | ((in[7 + inpos]) << 58);
                out[6 + outpos] = ((in[7 + inpos]) >>> (54 - 48))
                        | ((in[8 + inpos]) << 48);
                out[7 + outpos] = ((in[8 + inpos]) >>> (54 - 38))
                        | ((in[9 + inpos]) << 38);
                out[8 + outpos] = ((in[9 + inpos]) >>> (54 - 28))
                        | ((in[10 + inpos]) << 28);
                out[9 + outpos] = ((in[10 + inpos]) >>> (54 - 18))
                        | ((in[11 + inpos]) << 18);
                out[10 + outpos] = ((in[11 + inpos]) >>> (54 - 8))
                        | ((in[12 + inpos]) << 8)
                        | ((in[13 + inpos]) << 62);
                out[11 + outpos] = ((in[13 + inpos]) >>> (54 - 52))
                        | ((in[14 + inpos]) << 52);
                out[12 + outpos] = ((in[14 + inpos]) >>> (54 - 42))
                        | ((in[15 + inpos]) << 42);
                out[13 + outpos] = ((in[15 + inpos]) >>> (54 - 32))
                        | ((in[16 + inpos]) << 32);
                out[14 + outpos] = ((in[16 + inpos]) >>> (54 - 22))
                        | ((in[17 + inpos]) << 22);
                out[15 + outpos] = ((in[17 + inpos]) >>> (54 - 12))
                        | ((in[18 + inpos]) << 12);
                out[16 + outpos] = ((in[18 + inpos]) >>> (54 - 2))
                        | ((in[19 + inpos]) << 2)
                        | ((in[20 + inpos]) << 56);
                out[17 + outpos] = ((in[20 + inpos]) >>> (54 - 46))
                        | ((in[21 + inpos]) << 46);
                out[18 + outpos] = ((in[21 + inpos]) >>> (54 - 36))
                        | ((in[22 + inpos]) << 36);
                out[19 + outpos] = ((in[22 + inpos]) >>> (54 - 26))
                        | ((in[23 + inpos]) << 26);
                out[20 + outpos] = ((in[23 + inpos]) >>> (54 - 16))
                        | ((in[24 + inpos]) << 16);
                out[21 + outpos] = ((in[24 + inpos]) >>> (54 - 6))
                        | ((in[25 + inpos]) << 6)
                        | ((in[26 + inpos]) << 60);
                out[22 + outpos] = ((in[26 + inpos]) >>> (54 - 50))
                        | ((in[27 + inpos]) << 50);
                out[23 + outpos] = ((in[27 + inpos]) >>> (54 - 40))
                        | ((in[28 + inpos]) << 40);
                out[24 + outpos] = ((in[28 + inpos]) >>> (54 - 30))
                        | ((in[29 + inpos]) << 30);
                out[25 + outpos] = ((in[29 + inpos]) >>> (54 - 20))
                        | ((in[30 + inpos]) << 20);
                out[26 + outpos] = ((in[30 + inpos]) >>> (54 - 10))
                        | ((in[31 + inpos]) << 10);
                out[27 + outpos] = in[32 + inpos]
                        | ((in[33 + inpos]) << 54);
                out[28 + outpos] = ((in[33 + inpos]) >>> (54 - 44))
                        | ((in[34 + inpos]) << 44);
                out[29 + outpos] = ((in[34 + inpos]) >>> (54 - 34))
                        | ((in[35 + inpos]) << 34);
                out[30 + outpos] = ((in[35 + inpos]) >>> (54 - 24))
                        | ((in[36 + inpos]) << 24);
                out[31 + outpos] = ((in[36 + inpos]) >>> (54 - 14))
                        | ((in[37 + inpos]) << 14);
                out[32 + outpos] = ((in[37 + inpos]) >>> (54 - 4))
                        | ((in[38 + inpos]) << 4)
                        | ((in[39 + inpos]) << 58);
                out[33 + outpos] = ((in[39 + inpos]) >>> (54 - 48))
                        | ((in[40 + inpos]) << 48);
                out[34 + outpos] = ((in[40 + inpos]) >>> (54 - 38))
                        | ((in[41 + inpos]) << 38);
                out[35 + outpos] = ((in[41 + inpos]) >>> (54 - 28))
                        | ((in[42 + inpos]) << 28);
                out[36 + outpos] = ((in[42 + inpos]) >>> (54 - 18))
                        | ((in[43 + inpos]) << 18);
                out[37 + outpos] = ((in[43 + inpos]) >>> (54 - 8))
                        | ((in[44 + inpos]) << 8)
                        | ((in[45 + inpos]) << 62);
                out[38 + outpos] = ((in[45 + inpos]) >>> (54 - 52))
                        | ((in[46 + inpos]) << 52);
                out[39 + outpos] = ((in[46 + inpos]) >>> (54 - 42))
                        | ((in[47 + inpos]) << 42);
                out[40 + outpos] = ((in[47 + inpos]) >>> (54 - 32))
                        | ((in[48 + inpos]) << 32);
                out[41 + outpos] = ((in[48 + inpos]) >>> (54 - 22))
                        | ((in[49 + inpos]) << 22);
                out[42 + outpos] = ((in[49 + inpos]) >>> (54 - 12))
                        | ((in[50 + inpos]) << 12);
                out[43 + outpos] = ((in[50 + inpos]) >>> (54 - 2))
                        | ((in[51 + inpos]) << 2)
                        | ((in[52 + inpos]) << 56);
                out[44 + outpos] = ((in[52 + inpos]) >>> (54 - 46))
                        | ((in[53 + inpos]) << 46);
                out[45 + outpos] = ((in[53 + inpos]) >>> (54 - 36))
                        | ((in[54 + inpos]) << 36);
                out[46 + outpos] = ((in[54 + inpos]) >>> (54 - 26))
                        | ((in[55 + inpos]) << 26);
                out[47 + outpos] = ((in[55 + inpos]) >>> (54 - 16))
                        | ((in[56 + inpos]) << 16);
                out[48 + outpos] = ((in[56 + inpos]) >>> (54 - 6))
                        | ((in[57 + inpos]) << 6)
                        | ((in[58 + inpos]) << 60);
                out[49 + outpos] = ((in[58 + inpos]) >>> (54 - 50))
                        | ((in[59 + inpos]) << 50);
                out[50 + outpos] = ((in[59 + inpos]) >>> (54 - 40))
                        | ((in[60 + inpos]) << 40);
                out[51 + outpos] = ((in[60 + inpos]) >>> (54 - 30))
                        | ((in[61 + inpos]) << 30);
                out[52 + outpos] = ((in[61 + inpos]) >>> (54 - 20))
                        | ((in[62 + inpos]) << 20);
                out[53 + outpos] = ((in[62 + inpos]) >>> (54 - 10))
                        | ((in[63 + inpos]) << 10);
        }

        protected static void fastpackwithoutmask55(final long[] in, int inpos,
                final long[] out, int outpos) {
                out[outpos] = in[inpos] | ((in[1 + inpos]) << 55);
                out[1 + outpos] = ((in[1 + inpos]) >>> (55 - 46))
                        | ((in[2 + inpos]) << 46);
                out[2 + outpos] = ((in[2 + inpos]) >>> (55 - 37))
                        | ((in[3 + inpos]) << 37);
                out[3 + outpos] = ((in[3 + inpos]) >>> (55 - 28))
                        | ((in[4 + inpos]) << 28);
                out[4 + outpos] = ((in[4 + inpos]) >>> (55 - 19))
                        | ((in[5 + inpos]) << 19);
                out[5 + outpos] = ((in[5 + inpos]) >>> (55 - 10))
                        | ((in[6 + inpos]) << 10);
                out[6 + outpos] = ((in[6 + inpos]) >>> (55 - 1))
                        | ((in[7 + inpos]) << 1)
                        | ((in[8 + inpos]) << 56);
                out[7 + outpos] = ((in[8 + inpos]) >>> (55 - 47))
                        | ((in[9 + inpos]) << 47);
                out[8 + outpos] = ((in[9 + inpos]) >>> (55 - 38))
                        | ((in[10 + inpos]) << 38);
                out[9 + outpos] = ((in[10 + inpos]) >>> (55 - 29))
                        | ((in[11 + inpos]) << 29);
                out[10 + outpos] = ((in[11 + inpos]) >>> (55 - 20))
                        | ((in[12 + inpos]) << 20);
                out[11 + outpos] = ((in[12 + inpos]) >>> (55 - 11))
                        | ((in[13 + inpos]) << 11);
                out[12 + outpos] = ((in[13 + inpos]) >>> (55 - 2))
                        | ((in[14 + inpos]) << 2)
                        | ((in[15 + inpos]) << 57);
                out[13 + outpos] = ((in[15 + inpos]) >>> (55 - 48))
                        | ((in[16 + inpos]) << 48);
                out[14 + outpos] = ((in[16 + inpos]) >>> (55 - 39))
                        | ((in[17 + inpos]) << 39);
                out[15 + outpos] = ((in[17 + inpos]) >>> (55 - 30))
                        | ((in[18 + inpos]) << 30);
                out[16 + outpos] = ((in[18 + inpos]) >>> (55 - 21))
                        | ((in[19 + inpos]) << 21);
                out[17 + outpos] = ((in[19 + inpos]) >>> (55 - 12))
                        | ((in[20 + inpos]) << 12);
                out[18 + outpos] = ((in[20 + inpos]) >>> (55 - 3))
                        | ((in[21 + inpos]) << 3)
                        | ((in[22 + inpos]) << 58);
                out[19 + outpos] = ((in[22 + inpos]) >>> (55 - 49))
                        | ((in[23 + inpos]) << 49);
                out[20 + outpos] = ((in[23 + inpos]) >>> (55 - 40))
                        | ((in[24 + inpos]) << 40);
                out[21 + outpos] = ((in[24 + inpos]) >>> (55 - 31))
                        | ((in[25 + inpos]) << 31);
                out[22 + outpos] = ((in[25 + inpos]) >>> (55 - 22))
                        | ((in[26 + inpos]) << 22);
                out[23 + outpos] = ((in[26 + inpos]) >>> (55 - 13))
                        | ((in[27 + inpos]) << 13);
                out[24 + outpos] = ((in[27 + inpos]) >>> (55 - 4))
                        | ((in[28 + inpos]) << 4)
                        | ((in[29 + inpos]) << 59);
                out[25 + outpos] = ((in[29 + inpos]) >>> (55 - 50))
                        | ((in[30 + inpos]) << 50);
                out[26 + outpos] = ((in[30 + inpos]) >>> (55 - 41))
                        | ((in[31 + inpos]) << 41);
                out[27 + outpos] = ((in[31 + inpos]) >>> (55 - 32))
                        | ((in[32 + inpos]) << 32);
                out[28 + outpos] = ((in[32 + inpos]) >>> (55 - 23))
                        | ((in[33 + inpos]) << 23);
                out[29 + outpos] = ((in[33 + inpos]) >>> (55 - 14))
                        | ((in[34 + inpos]) << 14);
                out[30 + outpos] = ((in[34 + inpos]) >>> (55 - 5))
                        | ((in[35 + inpos]) << 5)
                        | ((in[36 + inpos]) << 60);
                out[31 + outpos] = ((in[36 + inpos]) >>> (55 - 51))
                        | ((in[37 + inpos]) << 51);
                out[32 + outpos] = ((in[37 + inpos]) >>> (55 - 42))
                        | ((in[38 + inpos]) << 42);
                out[33 + outpos] = ((in[38 + inpos]) >>> (55 - 33))
                        | ((in[39 + inpos]) << 33);
                out[34 + outpos] = ((in[39 + inpos]) >>> (55 - 24))
                        | ((in[40 + inpos]) << 24);
                out[35 + outpos] = ((in[40 + inpos]) >>> (55 - 15))
                        | ((in[41 + inpos]) << 15);
                out[36 + outpos] = ((in[41 + inpos]) >>> (55 - 6))
                        | ((in[42 + inpos]) << 6)
                        | ((in[43 + inpos]) << 61);
                out[37 + outpos] = ((in[43 + inpos]) >>> (55 - 52))
                        | ((in[44 + inpos]) << 52);
                out[38 + outpos] = ((in[44 + inpos]) >>> (55 - 43))
                        | ((in[45 + inpos]) << 43);
                out[39 + outpos] = ((in[45 + inpos]) >>> (55 - 34))
                        | ((in[46 + inpos]) << 34);
                out[40 + outpos] = ((in[46 + inpos]) >>> (55 - 25))
                        | ((in[47 + inpos]) << 25);
                out[41 + outpos] = ((in[47 + inpos]) >>> (55 - 16))
                        | ((in[48 + inpos]) << 16);
                out[42 + outpos] = ((in[48 + inpos]) >>> (55 - 7))
                        | ((in[49 + inpos]) << 7)
                        | ((in[50 + inpos]) << 62);
                out[43 + outpos] = ((in[50 + inpos]) >>> (55 - 53))
                        | ((in[51 + inpos]) << 53);
                out[44 + outpos] = ((in[51 + inpos]) >>> (55 - 44))
                        | ((in[52 + inpos]) << 44);
                out[45 + outpos] = ((in[52 + inpos]) >>> (55 - 35))
                        | ((in[53 + inpos]) << 35);
                out[46 + outpos] = ((in[53 + inpos]) >>> (55 - 26))
                        | ((in[54 + inpos]) << 26);
                out[47 + outpos] = ((in[54 + inpos]) >>> (55 - 17))
                        | ((in[55 + inpos]) << 17);
                out[48 + outpos] = ((in[55 + inpos]) >>> (55 - 8))
                        | ((in[56 + inpos]) << 8)
                        | ((in[57 + inpos]) << 63);
                out[49 + outpos] = ((in[57 + inpos]) >>> (55 - 54))
                        | ((in[58 + inpos]) << 54);
                out[50 + outpos] = ((in[58 + inpos]) >>> (55 - 45))
                        | ((in[59 + inpos]) << 45);
                out[51 + outpos] = ((in[59 + inpos]) >>> (55 - 36))
                        | ((in[60 + inpos]) << 36);
                out[52 + outpos] = ((in[60 + inpos]) >>> (55 - 27))
                        | ((in[61 + inpos]) << 27);
                out[53 + outpos] = ((in[61 + inpos]) >>> (55 - 18))
                        | ((in[62 + inpos]) << 18);
                out[54 + outpos] = ((in[62 + inpos]) >>> (55 - 9))
                        | ((in[63 + inpos]) << 9);
        }

        protected static void fastpackwithoutmask56(final long[] in, int inpos,
                final long[] out, int outpos) {
                out[outpos] = in[inpos] | ((in[1 + inpos]) << 56);
                out[1 + outpos] = ((in[1 + inpos]) >>> (56 - 48))
                        | ((in[2 + inpos]) << 48);
                out[2 + outpos] = ((in[2 + inpos]) >>> (56 - 40))
                        | ((in[3 + inpos]) << 40);
                out[3 + outpos] = ((in[3 + inpos]) >>> (56 - 32))
                        | ((in[4 + inpos]) << 32);
                out[4 + outpos] = ((in[4 + inpos]) >>> (56 - 24))
                        | ((in[5 + inpos]) << 24);
                out[5 + outpos] = ((in[5 + inpos]) >>> (56 - 16))
                        | ((in[6 + inpos]) << 16);
                out[6 + outpos] = ((in[6 + inpos]) >>> (56 - 8))
                        | ((in[7 + inpos]) << 8);
                out[7 + outpos] = in[8 + inpos]
                        | ((in[9 + inpos]) << 56);
                out[8 + outpos] = ((in[9 + inpos]) >>> (56 - 48))
                        | ((in[10 + inpos]) << 48);
                out[9 + outpos] = ((in[10 + inpos]) >>> (56 - 40))
                        | ((in[11 + inpos]) << 40);
                out[10 + outpos] = ((in[11 + inpos]) >>> (56 - 32))
                        | ((in[12 + inpos]) << 32);
                out[11 + outpos] = ((in[12 + inpos]) >>> (56 - 24))
                        | ((in[13 + inpos]) << 24);
                out[12 + outpos] = ((in[13 + inpos]) >>> (56 - 16))
                        | ((in[14 + inpos]) << 16);
                out[13 + outpos] = ((in[14 + inpos]) >>> (56 - 8))
                        | ((in[15 + inpos]) << 8);
                out[14 + outpos] = in[16 + inpos]
                        | ((in[17 + inpos]) << 56);
                out[15 + outpos] = ((in[17 + inpos]) >>> (56 - 48))
                        | ((in[18 + inpos]) << 48);
                out[16 + outpos] = ((in[18 + inpos]) >>> (56 - 40))
                        | ((in[19 + inpos]) << 40);
                out[17 + outpos] = ((in[19 + inpos]) >>> (56 - 32))
                        | ((in[20 + inpos]) << 32);
                out[18 + outpos] = ((in[20 + inpos]) >>> (56 - 24))
                        | ((in[21 + inpos]) << 24);
                out[19 + outpos] = ((in[21 + inpos]) >>> (56 - 16))
                        | ((in[22 + inpos]) << 16);
                out[20 + outpos] = ((in[22 + inpos]) >>> (56 - 8))
                        | ((in[23 + inpos]) << 8);
                out[21 + outpos] = in[24 + inpos]
                        | ((in[25 + inpos]) << 56);
                out[22 + outpos] = ((in[25 + inpos]) >>> (56 - 48))
                        | ((in[26 + inpos]) << 48);
                out[23 + outpos] = ((in[26 + inpos]) >>> (56 - 40))
                        | ((in[27 + inpos]) << 40);
                out[24 + outpos] = ((in[27 + inpos]) >>> (56 - 32))
                        | ((in[28 + inpos]) << 32);
                out[25 + outpos] = ((in[28 + inpos]) >>> (56 - 24))
                        | ((in[29 + inpos]) << 24);
                out[26 + outpos] = ((in[29 + inpos]) >>> (56 - 16))
                        | ((in[30 + inpos]) << 16);
                out[27 + outpos] = ((in[30 + inpos]) >>> (56 - 8))
                        | ((in[31 + inpos]) << 8);
                out[28 + outpos] = in[32 + inpos]
                        | ((in[33 + inpos]) << 56);
                out[29 + outpos] = ((in[33 + inpos]) >>> (56 - 48))
                        | ((in[34 + inpos]) << 48);
                out[30 + outpos] = ((in[34 + inpos]) >>> (56 - 40))
                        | ((in[35 + inpos]) << 40);
                out[31 + outpos] = ((in[35 + inpos]) >>> (56 - 32))
                        | ((in[36 + inpos]) << 32);
                out[32 + outpos] = ((in[36 + inpos]) >>> (56 - 24))
                        | ((in[37 + inpos]) << 24);
                out[33 + outpos] = ((in[37 + inpos]) >>> (56 - 16))
                        | ((in[38 + inpos]) << 16);
                out[34 + outpos] = ((in[38 + inpos]) >>> (56 - 8))
                        | ((in[39 + inpos]) << 8);
                out[35 + outpos] = in[40 + inpos]
                        | ((in[41 + inpos]) << 56);
                out[36 + outpos] = ((in[41 + inpos]) >>> (56 - 48))
                        | ((in[42 + inpos]) << 48);
                out[37 + outpos] = ((in[42 + inpos]) >>> (56 - 40))
                        | ((in[43 + inpos]) << 40);
                out[38 + outpos] = ((in[43 + inpos]) >>> (56 - 32))
                        | ((in[44 + inpos]) << 32);
                out[39 + outpos] = ((in[44 + inpos]) >>> (56 - 24))
                        | ((in[45 + inpos]) << 24);
                out[40 + outpos] = ((in[45 + inpos]) >>> (56 - 16))
                        | ((in[46 + inpos]) << 16);
                out[41 + outpos] = ((in[46 + inpos]) >>> (56 - 8))
                        | ((in[47 + inpos]) << 8);
                out[42 + outpos] = in[48 + inpos]
                        | ((in[49 + inpos]) << 56);
                out[43 + outpos] = ((in[49 + inpos]) >>> (56 - 48))
                        | ((in[50 + inpos]) << 48);
                out[44 + outpos] = ((in[50 + inpos]) >>> (56 - 40))
                        | ((in[51 + inpos]) << 40);
                out[45 + outpos] = ((in[51 + inpos]) >>> (56 - 32))
                        | ((in[52 + inpos]) << 32);
                out[46 + outpos] = ((in[52 + inpos]) >>> (56 - 24))
                        | ((in[53 + inpos]) << 24);
                out[47 + outpos] = ((in[53 + inpos]) >>> (56 - 16))
                        | ((in[54 + inpos]) << 16);
                out[48 + outpos] = ((in[54 + inpos]) >>> (56 - 8))
                        | ((in[55 + inpos]) << 8);
                out[49 + outpos] = in[56 + inpos]
                        | ((in[57 + inpos]) << 56);
                out[50 + outpos] = ((in[57 + inpos]) >>> (56 - 48))
                        | ((in[58 + inpos]) << 48);
                out[51 + outpos] = ((in[58 + inpos]) >>> (56 - 40))
                        | ((in[59 + inpos]) << 40);
                out[52 + outpos] = ((in[59 + inpos]) >>> (56 - 32))
                        | ((in[60 + inpos]) << 32);
                out[53 + outpos] = ((in[60 + inpos]) >>> (56 - 24))
                        | ((in[61 + inpos]) << 24);
                out[54 + outpos] = ((in[61 + inpos]) >>> (56 - 16))
                        | ((in[62 + inpos]) << 16);
                out[55 + outpos] = ((in[62 + inpos]) >>> (56 - 8))
                        | ((in[63 + inpos]) << 8);
        }

        protected static void fastpackwithoutmask57(final long[] in, int inpos,
                final long[] out, int outpos) {
                out[outpos] = in[inpos] | ((in[1 + inpos]) << 57);
                out[1 + outpos] = ((in[1 + inpos]) >>> (57 - 50))
                        | ((in[2 + inpos]) << 50);
                out[2 + outpos] = ((in[2 + inpos]) >>> (57 - 43))
                        | ((in[3 + inpos]) << 43);
                out[3 + outpos] = ((in[3 + inpos]) >>> (57 - 36))
                        | ((in[4 + inpos]) << 36);
                out[4 + outpos] = ((in[4 + inpos]) >>> (57 - 29))
                        | ((in[5 + inpos]) << 29);
                out[5 + outpos] = ((in[5 + inpos]) >>> (57 - 22))
                        | ((in[6 + inpos]) << 22);
                out[6 + outpos] = ((in[6 + inpos]) >>> (57 - 15))
                        | ((in[7 + inpos]) << 15);
                out[7 + outpos] = ((in[7 + inpos]) >>> (57 - 8))
                        | ((in[8 + inpos]) << 8);
                out[8 + outpos] = ((in[8 + inpos]) >>> (57 - 1))
                        | ((in[9 + inpos]) << 1)
                        | ((in[10 + inpos]) << 58);
                out[9 + outpos] = ((in[10 + inpos]) >>> (57 - 51))
                        | ((in[11 + inpos]) << 51);
                out[10 + outpos] = ((in[11 + inpos]) >>> (57 - 44))
                        | ((in[12 + inpos]) << 44);
                out[11 + outpos] = ((in[12 + inpos]) >>> (57 - 37))
                        | ((in[13 + inpos]) << 37);
                out[12 + outpos] = ((in[13 + inpos]) >>> (57 - 30))
                        | ((in[14 + inpos]) << 30);
                out[13 + outpos] = ((in[14 + inpos]) >>> (57 - 23))
                        | ((in[15 + inpos]) << 23);
                out[14 + outpos] = ((in[15 + inpos]) >>> (57 - 16))
                        | ((in[16 + inpos]) << 16);
                out[15 + outpos] = ((in[16 + inpos]) >>> (57 - 9))
                        | ((in[17 + inpos]) << 9);
                out[16 + outpos] = ((in[17 + inpos]) >>> (57 - 2))
                        | ((in[18 + inpos]) << 2)
                        | ((in[19 + inpos]) << 59);
                out[17 + outpos] = ((in[19 + inpos]) >>> (57 - 52))
                        | ((in[20 + inpos]) << 52);
                out[18 + outpos] = ((in[20 + inpos]) >>> (57 - 45))
                        | ((in[21 + inpos]) << 45);
                out[19 + outpos] = ((in[21 + inpos]) >>> (57 - 38))
                        | ((in[22 + inpos]) << 38);
                out[20 + outpos] = ((in[22 + inpos]) >>> (57 - 31))
                        | ((in[23 + inpos]) << 31);
                out[21 + outpos] = ((in[23 + inpos]) >>> (57 - 24))
                        | ((in[24 + inpos]) << 24);
                out[22 + outpos] = ((in[24 + inpos]) >>> (57 - 17))
                        | ((in[25 + inpos]) << 17);
                out[23 + outpos] = ((in[25 + inpos]) >>> (57 - 10))
                        | ((in[26 + inpos]) << 10);
                out[24 + outpos] = ((in[26 + inpos]) >>> (57 - 3))
                        | ((in[27 + inpos]) << 3)
                        | ((in[28 + inpos]) << 60);
                out[25 + outpos] = ((in[28 + inpos]) >>> (57 - 53))
                        | ((in[29 + inpos]) << 53);
                out[26 + outpos] = ((in[29 + inpos]) >>> (57 - 46))
                        | ((in[30 + inpos]) << 46);
                out[27 + outpos] = ((in[30 + inpos]) >>> (57 - 39))
                        | ((in[31 + inpos]) << 39);
                out[28 + outpos] = ((in[31 + inpos]) >>> (57 - 32))
                        | ((in[32 + inpos]) << 32);
                out[29 + outpos] = ((in[32 + inpos]) >>> (57 - 25))
                        | ((in[33 + inpos]) << 25);
                out[30 + outpos] = ((in[33 + inpos]) >>> (57 - 18))
                        | ((in[34 + inpos]) << 18);
                out[31 + outpos] = ((in[34 + inpos]) >>> (57 - 11))
                        | ((in[35 + inpos]) << 11);
                out[32 + outpos] = ((in[35 + inpos]) >>> (57 - 4))
                        | ((in[36 + inpos]) << 4)
                        | ((in[37 + inpos]) << 61);
                out[33 + outpos] = ((in[37 + inpos]) >>> (57 - 54))
                        | ((in[38 + inpos]) << 54);
                out[34 + outpos] = ((in[38 + inpos]) >>> (57 - 47))
                        | ((in[39 + inpos]) << 47);
                out[35 + outpos] = ((in[39 + inpos]) >>> (57 - 40))
                        | ((in[40 + inpos]) << 40);
                out[36 + outpos] = ((in[40 + inpos]) >>> (57 - 33))
                        | ((in[41 + inpos]) << 33);
                out[37 + outpos] = ((in[41 + inpos]) >>> (57 - 26))
                        | ((in[42 + inpos]) << 26);
                out[38 + outpos] = ((in[42 + inpos]) >>> (57 - 19))
                        | ((in[43 + inpos]) << 19);
                out[39 + outpos] = ((in[43 + inpos]) >>> (57 - 12))
                        | ((in[44 + inpos]) << 12);
                out[40 + outpos] = ((in[44 + inpos]) >>> (57 - 5))
                        | ((in[45 + inpos]) << 5)
                        | ((in[46 + inpos]) << 62);
                out[41 + outpos] = ((in[46 + inpos]) >>> (57 - 55))
                        | ((in[47 + inpos]) << 55);
                out[42 + outpos] = ((in[47 + inpos]) >>> (57 - 48))
                        | ((in[48 + inpos]) << 48);
                out[43 + outpos] = ((in[48 + inpos]) >>> (57 - 41))
                        | ((in[49 + inpos]) << 41);
                out[44 + outpos] = ((in[49 + inpos]) >>> (57 - 34))
                        | ((in[50 + inpos]) << 34);
                out[45 + outpos] = ((in[50 + inpos]) >>> (57 - 27))
                        | ((in[51 + inpos]) << 27);
                out[46 + outpos] = ((in[51 + inpos]) >>> (57 - 20))
                        | ((in[52 + inpos]) << 20);
                out[47 + outpos] = ((in[52 + inpos]) >>> (57 - 13))
                        | ((in[53 + inpos]) << 13);
                out[48 + outpos] = ((in[53 + inpos]) >>> (57 - 6))
                        | ((in[54 + inpos]) << 6)
                        | ((in[55 + inpos]) << 63);
                out[49 + outpos] = ((in[55 + inpos]) >>> (57 - 56))
                        | ((in[56 + inpos]) << 56);
                out[50 + outpos] = ((in[56 + inpos]) >>> (57 - 49))
                        | ((in[57 + inpos]) << 49);
                out[51 + outpos] = ((in[57 + inpos]) >>> (57 - 42))
                        | ((in[58 + inpos]) << 42);
                out[52 + outpos] = ((in[58 + inpos]) >>> (57 - 35))
                        | ((in[59 + inpos]) << 35);
                out[53 + outpos] = ((in[59 + inpos]) >>> (57 - 28))
                        | ((in[60 + inpos]) << 28);
                out[54 + outpos] = ((in[60 + inpos]) >>> (57 - 21))
                        | ((in[61 + inpos]) << 21);
                out[55 + outpos] = ((in[61 + inpos]) >>> (57 - 14))
                        | ((in[62 + inpos]) << 14);
                out[56 + outpos] = ((in[62 + inpos]) >>> (57 - 7))
                        | ((in[63 + inpos]) << 7);
        }

        protected static void fastpackwithoutmask58(final long[] in, int inpos,
                final long[] out, int outpos) {
                out[outpos] = in[inpos] | ((in[1 + inpos]) << 58);
                out[1 + outpos] = ((in[1 + inpos]) >>> (58 - 52))
                        | ((in[2 + inpos]) << 52);
                out[2 + outpos] = ((in[2 + inpos]) >>> (58 - 46))
                        | ((in[3 + inpos]) << 46);
                out[3 + outpos] = ((in[3 + inpos]) >>> (58 - 40))
                        | ((in[4 + inpos]) << 40);
                out[4 + outpos] = ((in[4 + inpos]) >>> (58 - 34))
                        | ((in[5 + inpos]) << 34);
                out[5 + outpos] = ((in[5 + inpos]) >>> (58 - 28))
                        | ((in[6 + inpos]) << 28);
                out[6 + outpos] = ((in[6 + inpos]) >>> (58 - 22))
                        | ((in[7 + inpos]) << 22);
                out[7 + outpos] = ((in[7 + inpos]) >>> (58 - 16))
                        | ((in[8 + inpos]) << 16);
                out[8 + outpos] = ((in[8 + inpos]) >>> (58 - 10))
                        | ((in[9 + inpos]) << 10);
                out[9 + outpos] = ((in[9 + inpos]) >>> (58 - 4))
                        | ((in[10 + inpos]) << 4)
                        | ((in[11 + inpos]) << 62);
                out[10 + outpos] = ((in[11 + inpos]) >>> (58 - 56))
                        | ((in[12 + inpos]) << 56);
                out[11 + outpos] = ((in[12 + inpos]) >>> (58 - 50))
                        | ((in[13 + inpos]) << 50);
                out[12 + outpos] = ((in[13 + inpos]) >>> (58 - 44))
                        | ((in[14 + inpos]) << 44);
                out[13 + outpos] = ((in[14 + inpos]) >>> (58 - 38))
                        | ((in[15 + inpos]) << 38);
                out[14 + outpos] = ((in[15 + inpos]) >>> (58 - 32))
                        | ((in[16 + inpos]) << 32);
                out[15 + outpos] = ((in[16 + inpos]) >>> (58 - 26))
                        | ((in[17 + inpos]) << 26);
                out[16 + outpos] = ((in[17 + inpos]) >>> (58 - 20))
                        | ((in[18 + inpos]) << 20);
                out[17 + outpos] = ((in[18 + inpos]) >>> (58 - 14))
                        | ((in[19 + inpos]) << 14);
                out[18 + outpos] = ((in[19 + inpos]) >>> (58 - 8))
                        | ((in[20 + inpos]) << 8);
                out[19 + outpos] = ((in[20 + inpos]) >>> (58 - 2))
                        | ((in[21 + inpos]) << 2)
                        | ((in[22 + inpos]) << 60);
                out[20 + outpos] = ((in[22 + inpos]) >>> (58 - 54))
                        | ((in[23 + inpos]) << 54);
                out[21 + outpos] = ((in[23 + inpos]) >>> (58 - 48))
                        | ((in[24 + inpos]) << 48);
                out[22 + outpos] = ((in[24 + inpos]) >>> (58 - 42))
                        | ((in[25 + inpos]) << 42);
                out[23 + outpos] = ((in[25 + inpos]) >>> (58 - 36))
                        | ((in[26 + inpos]) << 36);
                out[24 + outpos] = ((in[26 + inpos]) >>> (58 - 30))
                        | ((in[27 + inpos]) << 30);
                out[25 + outpos] = ((in[27 + inpos]) >>> (58 - 24))
                        | ((in[28 + inpos]) << 24);
                out[26 + outpos] = ((in[28 + inpos]) >>> (58 - 18))
                        | ((in[29 + inpos]) << 18);
                out[27 + outpos] = ((in[29 + inpos]) >>> (58 - 12))
                        | ((in[30 + inpos]) << 12);
                out[28 + outpos] = ((in[30 + inpos]) >>> (58 - 6))
                        | ((in[31 + inpos]) << 6);
                out[29 + outpos] = in[32 + inpos]
                        | ((in[33 + inpos]) << 58);
                out[30 + outpos] = ((in[33 + inpos]) >>> (58 - 52))
                        | ((in[34 + inpos]) << 52);
                out[31 + outpos] = ((in[34 + inpos]) >>> (58 - 46))
                        | ((in[35 + inpos]) << 46);
                out[32 + outpos] = ((in[35 + inpos]) >>> (58 - 40))
                        | ((in[36 + inpos]) << 40);
                out[33 + outpos] = ((in[36 + inpos]) >>> (58 - 34))
                        | ((in[37 + inpos]) << 34);
                out[34 + outpos] = ((in[37 + inpos]) >>> (58 - 28))
                        | ((in[38 + inpos]) << 28);
                out[35 + outpos] = ((in[38 + inpos]) >>> (58 - 22))
                        | ((in[39 + inpos]) << 22);
                out[36 + outpos] = ((in[39 + inpos]) >>> (58 - 16))
                        | ((in[40 + inpos]) << 16);
                out[37 + outpos] = ((in[40 + inpos]) >>> (58 - 10))
                        | ((in[41 + inpos]) << 10);
                out[38 + outpos] = ((in[41 + inpos]) >>> (58 - 4))
                        | ((in[42 + inpos]) << 4)
                        | ((in[43 + inpos]) << 62);
                out[39 + outpos] = ((in[43 + inpos]) >>> (58 - 56))
                        | ((in[44 + inpos]) << 56);
                out[40 + outpos] = ((in[44 + inpos]) >>> (58 - 50))
                        | ((in[45 + inpos]) << 50);
                out[41 + outpos] = ((in[45 + inpos]) >>> (58 - 44))
                        | ((in[46 + inpos]) << 44);
                out[42 + outpos] = ((in[46 + inpos]) >>> (58 - 38))
                        | ((in[47 + inpos]) << 38);
                out[43 + outpos] = ((in[47 + inpos]) >>> (58 - 32))
                        | ((in[48 + inpos]) << 32);
                out[44 + outpos] = ((in[48 + inpos]) >>> (58 - 26))
                        | ((in[49 + inpos]) << 26);
                out[45 + outpos] = ((in[49 + inpos]) >>> (58 - 20))
                        | ((in[50 + inpos]) << 20);
                out[46 + outpos] = ((in[50 + inpos]) >>> (58 - 14))
                        | ((in[51 + inpos]) << 14);
                out[47 + outpos] = ((in[51 + inpos]) >>> (58 - 8))
                        | ((in[52 + inpos]) << 8);
                out[48 + outpos] = ((in[52 + inpos]) >>> (58 - 2))
                        | ((in[53 + inpos]) << 2)
                        | ((in[54 + inpos]) << 60);
                out[49 + outpos] = ((in[54 + inpos]) >>> (58 - 54))
                        | ((in[55 + inpos]) << 54);
                out[50 + outpos] = ((in[55 + inpos]) >>> (58 - 48))
                        | ((in[56 + inpos]) << 48);
                out[51 + outpos] = ((in[56 + inpos]) >>> (58 - 42))
                        | ((in[57 + inpos]) << 42);
                out[52 + outpos] = ((in[57 + inpos]) >>> (58 - 36))
                        | ((in[58 + inpos]) << 36);
                out[53 + outpos] = ((in[58 + inpos]) >>> (58 - 30))
                        | ((in[59 + inpos]) << 30);
                out[54 + outpos] = ((in[59 + inpos]) >>> (58 - 24))
                        | ((in[60 + inpos]) << 24);
                out[55 + outpos] = ((in[60 + inpos]) >>> (58 - 18))
                        | ((in[61 + inpos]) << 18);
                out[56 + outpos] = ((in[61 + inpos]) >>> (58 - 12))
                        | ((in[62 + inpos]) << 12);
                out[57 + outpos] = ((in[62 + inpos]) >>> (58 - 6))
                        | ((in[63 + inpos]) << 6);
        }

        protected static void fastpackwithoutmask59(final long[] in, int inpos,
                final long[] out, int outpos) {
                out[outpos] = in[inpos] | ((in[1 + inpos]) << 59);
                out[1 + outpos] = ((in[1 + inpos]) >>> (59 - 54))
                        | ((in[2 + inpos]) << 54);
                out[2 + outpos] = ((in[2 + inpos]) >>> (59 - 49))
                        | ((in[3 + inpos]) << 49);
                out[3 + outpos] = ((in[3 + inpos]) >>> (59 - 44))
                        | ((in[4 + inpos]) << 44);
                out[4 + outpos] = ((in[4 + inpos]) >>> (59 - 39))
                        | ((in[5 + inpos]) << 39);
                out[5 + outpos] = ((in[5 + inpos]) >>> (59 - 34))
                        | ((in[6 + inpos]) << 34);
                out[6 + outpos] = ((in[6 + inpos]) >>> (59 - 29))
                        | ((in[7 + inpos]) << 29);
                out[7 + outpos] = ((in[7 + inpos]) >>> (59 - 24))
                        | ((in[8 + inpos]) << 24);
                out[8 + outpos] = ((in[8 + inpos]) >>> (59 - 19))
                        | ((in[9 + inpos]) << 19);
                out[9 + outpos] = ((in[9 + inpos]) >>> (59 - 14))
                        | ((in[10 + inpos]) << 14);
                out[10 + outpos] = ((in[10 + inpos]) >>> (59 - 9))
                        | ((in[11 + inpos]) << 9);
                out[11 + outpos] = ((in[11 + inpos]) >>> (59 - 4))
                        | ((in[12 + inpos]) << 4)
                        | ((in[13 + inpos]) << 63);
                out[12 + outpos] = ((in[13 + inpos]) >>> (59 - 58))
                        | ((in[14 + inpos]) << 58);
                out[13 + outpos] = ((in[14 + inpos]) >>> (59 - 53))
                        | ((in[15 + inpos]) << 53);
                out[14 + outpos] = ((in[15 + inpos]) >>> (59 - 48))
                        | ((in[16 + inpos]) << 48);
                out[15 + outpos] = ((in[16 + inpos]) >>> (59 - 43))
                        | ((in[17 + inpos]) << 43);
                out[16 + outpos] = ((in[17 + inpos]) >>> (59 - 38))
                        | ((in[18 + inpos]) << 38);
                out[17 + outpos] = ((in[18 + inpos]) >>> (59 - 33))
                        | ((in[19 + inpos]) << 33);
                out[18 + outpos] = ((in[19 + inpos]) >>> (59 - 28))
                        | ((in[20 + inpos]) << 28);
                out[19 + outpos] = ((in[20 + inpos]) >>> (59 - 23))
                        | ((in[21 + inpos]) << 23);
                out[20 + outpos] = ((in[21 + inpos]) >>> (59 - 18))
                        | ((in[22 + inpos]) << 18);
                out[21 + outpos] = ((in[22 + inpos]) >>> (59 - 13))
                        | ((in[23 + inpos]) << 13);
                out[22 + outpos] = ((in[23 + inpos]) >>> (59 - 8))
                        | ((in[24 + inpos]) << 8);
                out[23 + outpos] = ((in[24 + inpos]) >>> (59 - 3))
                        | ((in[25 + inpos]) << 3)
                        | ((in[26 + inpos]) << 62);
                out[24 + outpos] = ((in[26 + inpos]) >>> (59 - 57))
                        | ((in[27 + inpos]) << 57);
                out[25 + outpos] = ((in[27 + inpos]) >>> (59 - 52))
                        | ((in[28 + inpos]) << 52);
                out[26 + outpos] = ((in[28 + inpos]) >>> (59 - 47))
                        | ((in[29 + inpos]) << 47);
                out[27 + outpos] = ((in[29 + inpos]) >>> (59 - 42))
                        | ((in[30 + inpos]) << 42);
                out[28 + outpos] = ((in[30 + inpos]) >>> (59 - 37))
                        | ((in[31 + inpos]) << 37);
                out[29 + outpos] = ((in[31 + inpos]) >>> (59 - 32))
                        | ((in[32 + inpos]) << 32);
                out[30 + outpos] = ((in[32 + inpos]) >>> (59 - 27))
                        | ((in[33 + inpos]) << 27);
                out[31 + outpos] = ((in[33 + inpos]) >>> (59 - 22))
                        | ((in[34 + inpos]) << 22);
                out[32 + outpos] = ((in[34 + inpos]) >>> (59 - 17))
                        | ((in[35 + inpos]) << 17);
                out[33 + outpos] = ((in[35 + inpos]) >>> (59 - 12))
                        | ((in[36 + inpos]) << 12);
                out[34 + outpos] = ((in[36 + inpos]) >>> (59 - 7))
                        | ((in[37 + inpos]) << 7);
                out[35 + outpos] = ((in[37 + inpos]) >>> (59 - 2))
                        | ((in[38 + inpos]) << 2)
                        | ((in[39 + inpos]) << 61);
                out[36 + outpos] = ((in[39 + inpos]) >>> (59 - 56))
                        | ((in[40 + inpos]) << 56);
                out[37 + outpos] = ((in[40 + inpos]) >>> (59 - 51))
                        | ((in[41 + inpos]) << 51);
                out[38 + outpos] = ((in[41 + inpos]) >>> (59 - 46))
                        | ((in[42 + inpos]) << 46);
                out[39 + outpos] = ((in[42 + inpos]) >>> (59 - 41))
                        | ((in[43 + inpos]) << 41);
                out[40 + outpos] = ((in[43 + inpos]) >>> (59 - 36))
                        | ((in[44 + inpos]) << 36);
                out[41 + outpos] = ((in[44 + inpos]) >>> (59 - 31))
                        | ((in[45 + inpos]) << 31);
                out[42 + outpos] = ((in[45 + inpos]) >>> (59 - 26))
                        | ((in[46 + inpos]) << 26);
                out[43 + outpos] = ((in[46 + inpos]) >>> (59 - 21))
                        | ((in[47 + inpos]) << 21);
                out[44 + outpos] = ((in[47 + inpos]) >>> (59 - 16))
                        | ((in[48 + inpos]) << 16);
                out[45 + outpos] = ((in[48 + inpos]) >>> (59 - 11))
                        | ((in[49 + inpos]) << 11);
                out[46 + outpos] = ((in[49 + inpos]) >>> (59 - 6))
                        | ((in[50 + inpos]) << 6);
                out[47 + outpos] = ((in[50 + inpos]) >>> (59 - 1))
                        | ((in[51 + inpos]) << 1)
                        | ((in[52 + inpos]) << 60);
                out[48 + outpos] = ((in[52 + inpos]) >>> (59 - 55))
                        | ((in[53 + inpos]) << 55);
                out[49 + outpos] = ((in[53 + inpos]) >>> (59 - 50))
                        | ((in[54 + inpos]) << 50);
                out[50 + outpos] = ((in[54 + inpos]) >>> (59 - 45))
                        | ((in[55 + inpos]) << 45);
                out[51 + outpos] = ((in[55 + inpos]) >>> (59 - 40))
                        | ((in[56 + inpos]) << 40);
                out[52 + outpos] = ((in[56 + inpos]) >>> (59 - 35))
                        | ((in[57 + inpos]) << 35);
                out[53 + outpos] = ((in[57 + inpos]) >>> (59 - 30))
                        | ((in[58 + inpos]) << 30);
                out[54 + outpos] = ((in[58 + inpos]) >>> (59 - 25))
                        | ((in[59 + inpos]) << 25);
                out[55 + outpos] = ((in[59 + inpos]) >>> (59 - 20))
                        | ((in[60 + inpos]) << 20);
                out[56 + outpos] = ((in[60 + inpos]) >>> (59 - 15))
                        | ((in[61 + inpos]) << 15);
                out[57 + outpos] = ((in[61 + inpos]) >>> (59 - 10))
                        | ((in[62 + inpos]) << 10);
                out[58 + outpos] = ((in[62 + inpos]) >>> (59 - 5))
                        | ((in[63 + inpos]) << 5);
        }

        protected static void fastpackwithoutmask60(final long[] in, int inpos,
                final long[] out, int outpos) {
                out[outpos] = in[inpos] | ((in[1 + inpos]) << 60);
                out[1 + outpos] = ((in[1 + inpos]) >>> (60 - 56))
                        | ((in[2 + inpos]) << 56);
                out[2 + outpos] = ((in[2 + inpos]) >>> (60 - 52))
                        | ((in[3 + inpos]) << 52);
                out[3 + outpos] = ((in[3 + inpos]) >>> (60 - 48))
                        | ((in[4 + inpos]) << 48);
                out[4 + outpos] = ((in[4 + inpos]) >>> (60 - 44))
                        | ((in[5 + inpos]) << 44);
                out[5 + outpos] = ((in[5 + inpos]) >>> (60 - 40))
                        | ((in[6 + inpos]) << 40);
                out[6 + outpos] = ((in[6 + inpos]) >>> (60 - 36))
                        | ((in[7 + inpos]) << 36);
                out[7 + outpos] = ((in[7 + inpos]) >>> (60 - 32))
                        | ((in[8 + inpos]) << 32);
                out[8 + outpos] = ((in[8 + inpos]) >>> (60 - 28))
                        | ((in[9 + inpos]) << 28);
                out[9 + outpos] = ((in[9 + inpos]) >>> (60 - 24))
                        | ((in[10 + inpos]) << 24);
                out[10 + outpos] = ((in[10 + inpos]) >>> (60 - 20))
                        | ((in[11 + inpos]) << 20);
                out[11 + outpos] = ((in[11 + inpos]) >>> (60 - 16))
                        | ((in[12 + inpos]) << 16);
                out[12 + outpos] = ((in[12 + inpos]) >>> (60 - 12))
                        | ((in[13 + inpos]) << 12);
                out[13 + outpos] = ((in[13 + inpos]) >>> (60 - 8))
                        | ((in[14 + inpos]) << 8);
                out[14 + outpos] = ((in[14 + inpos]) >>> (60 - 4))
                        | ((in[15 + inpos]) << 4);
                out[15 + outpos] = in[16 + inpos]
                        | ((in[17 + inpos]) << 60);
                out[16 + outpos] = ((in[17 + inpos]) >>> (60 - 56))
                        | ((in[18 + inpos]) << 56);
                out[17 + outpos] = ((in[18 + inpos]) >>> (60 - 52))
                        | ((in[19 + inpos]) << 52);
                out[18 + outpos] = ((in[19 + inpos]) >>> (60 - 48))
                        | ((in[20 + inpos]) << 48);
                out[19 + outpos] = ((in[20 + inpos]) >>> (60 - 44))
                        | ((in[21 + inpos]) << 44);
                out[20 + outpos] = ((in[21 + inpos]) >>> (60 - 40))
                        | ((in[22 + inpos]) << 40);
                out[21 + outpos] = ((in[22 + inpos]) >>> (60 - 36))
                        | ((in[23 + inpos]) << 36);
                out[22 + outpos] = ((in[23 + inpos]) >>> (60 - 32))
                        | ((in[24 + inpos]) << 32);
                out[23 + outpos] = ((in[24 + inpos]) >>> (60 - 28))
                        | ((in[25 + inpos]) << 28);
                out[24 + outpos] = ((in[25 + inpos]) >>> (60 - 24))
                        | ((in[26 + inpos]) << 24);
                out[25 + outpos] = ((in[26 + inpos]) >>> (60 - 20))
                        | ((in[27 + inpos]) << 20);
                out[26 + outpos] = ((in[27 + inpos]) >>> (60 - 16))
                        | ((in[28 + inpos]) << 16);
                out[27 + outpos] = ((in[28 + inpos]) >>> (60 - 12))
                        | ((in[29 + inpos]) << 12);
                out[28 + outpos] = ((in[29 + inpos]) >>> (60 - 8))
                        | ((in[30 + inpos]) << 8);
                out[29 + outpos] = ((in[30 + inpos]) >>> (60 - 4))
                        | ((in[31 + inpos]) << 4);
                out[30 + outpos] = in[32 + inpos]
                        | ((in[33 + inpos]) << 60);
                out[31 + outpos] = ((in[33 + inpos]) >>> (60 - 56))
                        | ((in[34 + inpos]) << 56);
                out[32 + outpos] = ((in[34 + inpos]) >>> (60 - 52))
                        | ((in[35 + inpos]) << 52);
                out[33 + outpos] = ((in[35 + inpos]) >>> (60 - 48))
                        | ((in[36 + inpos]) << 48);
                out[34 + outpos] = ((in[36 + inpos]) >>> (60 - 44))
                        | ((in[37 + inpos]) << 44);
                out[35 + outpos] = ((in[37 + inpos]) >>> (60 - 40))
                        | ((in[38 + inpos]) << 40);
                out[36 + outpos] = ((in[38 + inpos]) >>> (60 - 36))
                        | ((in[39 + inpos]) << 36);
                out[37 + outpos] = ((in[39 + inpos]) >>> (60 - 32))
                        | ((in[40 + inpos]) << 32);
                out[38 + outpos] = ((in[40 + inpos]) >>> (60 - 28))
                        | ((in[41 + inpos]) << 28);
                out[39 + outpos] = ((in[41 + inpos]) >>> (60 - 24))
                        | ((in[42 + inpos]) << 24);
                out[40 + outpos] = ((in[42 + inpos]) >>> (60 - 20))
                        | ((in[43 + inpos]) << 20);
                out[41 + outpos] = ((in[43 + inpos]) >>> (60 - 16))
                        | ((in[44 + inpos]) << 16);
                out[42 + outpos] = ((in[44 + inpos]) >>> (60 - 12))
                        | ((in[45 + inpos]) << 12);
                out[43 + outpos] = ((in[45 + inpos]) >>> (60 - 8))
                        | ((in[46 + inpos]) << 8);
                out[44 + outpos] = ((in[46 + inpos]) >>> (60 - 4))
                        | ((in[47 + inpos]) << 4);
                out[45 + outpos] = in[48 + inpos]
                        | ((in[49 + inpos]) << 60);
                out[46 + outpos] = ((in[49 + inpos]) >>> (60 - 56))
                        | ((in[50 + inpos]) << 56);
                out[47 + outpos] = ((in[50 + inpos]) >>> (60 - 52))
                        | ((in[51 + inpos]) << 52);
                out[48 + outpos] = ((in[51 + inpos]) >>> (60 - 48))
                        | ((in[52 + inpos]) << 48);
                out[49 + outpos] = ((in[52 + inpos]) >>> (60 - 44))
                        | ((in[53 + inpos]) << 44);
                out[50 + outpos] = ((in[53 + inpos]) >>> (60 - 40))
                        | ((in[54 + inpos]) << 40);
                out[51 + outpos] = ((in[54 + inpos]) >>> (60 - 36))
                        | ((in[55 + inpos]) << 36);
                out[52 + outpos] = ((in[55 + inpos]) >>> (60 - 32))
                        | ((in[56 + inpos]) << 32);
                out[53 + outpos] = ((in[56 + inpos]) >>> (60 - 28))
                        | ((in[57 + inpos]) << 28);
                out[54 + outpos] = ((in[57 + inpos]) >>> (60 - 24))
                        | ((in[58 + inpos]) << 24);
                out[55 + outpos] = ((in[58 + inpos]) >>> (60 - 20))
                        | ((in[59 + inpos]) << 20);
                out[56 + outpos] = ((in[59 + inpos]) >>> (60 - 16))
                        | ((in[60 + inpos]) << 16);
                out[57 + outpos] = ((in[60 + inpos]) >>> (60 - 12))
                        | ((in[61 + inpos]) << 12);
                out[58 + outpos] = ((in[61 + inpos]) >>> (60 - 8))
                        | ((in[62 + inpos]) << 8);
                out[59 + outpos] = ((in[62 + inpos]) >>> (60 - 4))
                        | ((in[63 + inpos]) << 4);
        }

        protected static void fastpackwithoutmask61(final long[] in, int inpos,
                final long[] out, int outpos) {
                out[outpos] = in[inpos] | ((in[1 + inpos]) << 61);
                out[1 + outpos] = ((in[1 + inpos]) >>> (61 - 58))
                        | ((in[2 + inpos]) << 58);
                out[2 + outpos] = ((in[2 + inpos]) >>> (61 - 55))
                        | ((in[3 + inpos]) << 55);
                out[3 + outpos] = ((in[3 + inpos]) >>> (61 - 52))
                        | ((in[4 + inpos]) << 52);
                out[4 + outpos] = ((in[4 + inpos]) >>> (61 - 49))
                        | ((in[5 + inpos]) << 49);
                out[5 + outpos] = ((in[5 + inpos]) >>> (61 - 46))
                        | ((in[6 + inpos]) << 46);
                out[6 + outpos] = ((in[6 + inpos]) >>> (61 - 43))
                        | ((in[7 + inpos]) << 43);
                out[7 + outpos] = ((in[7 + inpos]) >>> (61 - 40))
                        | ((in[8 + inpos]) << 40);
                out[8 + outpos] = ((in[8 + inpos]) >>> (61 - 37))
                        | ((in[9 + inpos]) << 37);
                out[9 + outpos] = ((in[9 + inpos]) >>> (61 - 34))
                        | ((in[10 + inpos]) << 34);
                out[10 + outpos] = ((in[10 + inpos]) >>> (61 - 31))
                        | ((in[11 + inpos]) << 31);
                out[11 + outpos] = ((in[11 + inpos]) >>> (61 - 28))
                        | ((in[12 + inpos]) << 28);
                out[12 + outpos] = ((in[12 + inpos]) >>> (61 - 25))
                        | ((in[13 + inpos]) << 25);
                out[13 + outpos] = ((in[13 + inpos]) >>> (61 - 22))
                        | ((in[14 + inpos]) << 22);
                out[14 + outpos] = ((in[14 + inpos]) >>> (61 - 19))
                        | ((in[15 + inpos]) << 19);
                out[15 + outpos] = ((in[15 + inpos]) >>> (61 - 16))
                        | ((in[16 + inpos]) << 16);
                out[16 + outpos] = ((in[16 + inpos]) >>> (61 - 13))
                        | ((in[17 + inpos]) << 13);
                out[17 + outpos] = ((in[17 + inpos]) >>> (61 - 10))
                        | ((in[18 + inpos]) << 10);
                out[18 + outpos] = ((in[18 + inpos]) >>> (61 - 7))
                        | ((in[19 + inpos]) << 7);
                out[19 + outpos] = ((in[19 + inpos]) >>> (61 - 4))
                        | ((in[20 + inpos]) << 4);
                out[20 + outpos] = ((in[20 + inpos]) >>> (61 - 1))
                        | ((in[21 + inpos]) << 1)
                        | ((in[22 + inpos]) << 62);
                out[21 + outpos] = ((in[22 + inpos]) >>> (61 - 59))
                        | ((in[23 + inpos]) << 59);
                out[22 + outpos] = ((in[23 + inpos]) >>> (61 - 56))
                        | ((in[24 + inpos]) << 56);
                out[23 + outpos] = ((in[24 + inpos]) >>> (61 - 53))
                        | ((in[25 + inpos]) << 53);
                out[24 + outpos] = ((in[25 + inpos]) >>> (61 - 50))
                        | ((in[26 + inpos]) << 50);
                out[25 + outpos] = ((in[26 + inpos]) >>> (61 - 47))
                        | ((in[27 + inpos]) << 47);
                out[26 + outpos] = ((in[27 + inpos]) >>> (61 - 44))
                        | ((in[28 + inpos]) << 44);
                out[27 + outpos] = ((in[28 + inpos]) >>> (61 - 41))
                        | ((in[29 + inpos]) << 41);
                out[28 + outpos] = ((in[29 + inpos]) >>> (61 - 38))
                        | ((in[30 + inpos]) << 38);
                out[29 + outpos] = ((in[30 + inpos]) >>> (61 - 35))
                        | ((in[31 + inpos]) << 35);
                out[30 + outpos] = ((in[31 + inpos]) >>> (61 - 32))
                        | ((in[32 + inpos]) << 32);
                out[31 + outpos] = ((in[32 + inpos]) >>> (61 - 29))
                        | ((in[33 + inpos]) << 29);
                out[32 + outpos] = ((in[33 + inpos]) >>> (61 - 26))
                        | ((in[34 + inpos]) << 26);
                out[33 + outpos] = ((in[34 + inpos]) >>> (61 - 23))
                        | ((in[35 + inpos]) << 23);
                out[34 + outpos] = ((in[35 + inpos]) >>> (61 - 20))
                        | ((in[36 + inpos]) << 20);
                out[35 + outpos] = ((in[36 + inpos]) >>> (61 - 17))
                        | ((in[37 + inpos]) << 17);
                out[36 + outpos] = ((in[37 + inpos]) >>> (61 - 14))
                        | ((in[38 + inpos]) << 14);
                out[37 + outpos] = ((in[38 + inpos]) >>> (61 - 11))
                        | ((in[39 + inpos]) << 11);
                out[38 + outpos] = ((in[39 + inpos]) >>> (61 - 8))
                        | ((in[40 + inpos]) << 8);
                out[39 + outpos] = ((in[40 + inpos]) >>> (61 - 5))
                        | ((in[41 + inpos]) << 5);
                out[40 + outpos] = ((in[41 + inpos]) >>> (61 - 2))
                        | ((in[42 + inpos]) << 2)
                        | ((in[43 + inpos]) << 63);
                out[41 + outpos] = ((in[43 + inpos]) >>> (61 - 60))
                        | ((in[44 + inpos]) << 60);
                out[42 + outpos] = ((in[44 + inpos]) >>> (61 - 57))
                        | ((in[45 + inpos]) << 57);
                out[43 + outpos] = ((in[45 + inpos]) >>> (61 - 54))
                        | ((in[46 + inpos]) << 54);
                out[44 + outpos] = ((in[46 + inpos]) >>> (61 - 51))
                        | ((in[47 + inpos]) << 51);
                out[45 + outpos] = ((in[47 + inpos]) >>> (61 - 48))
                        | ((in[48 + inpos]) << 48);
                out[46 + outpos] = ((in[48 + inpos]) >>> (61 - 45))
                        | ((in[49 + inpos]) << 45);
                out[47 + outpos] = ((in[49 + inpos]) >>> (61 - 42))
                        | ((in[50 + inpos]) << 42);
                out[48 + outpos] = ((in[50 + inpos]) >>> (61 - 39))
                        | ((in[51 + inpos]) << 39);
                out[49 + outpos] = ((in[51 + inpos]) >>> (61 - 36))
                        | ((in[52 + inpos]) << 36);
                out[50 + outpos] = ((in[52 + inpos]) >>> (61 - 33))
                        | ((in[53 + inpos]) << 33);
                out[51 + outpos] = ((in[53 + inpos]) >>> (61 - 30))
                        | ((in[54 + inpos]) << 30);
                out[52 + outpos] = ((in[54 + inpos]) >>> (61 - 27))
                        | ((in[55 + inpos]) << 27);
                out[53 + outpos] = ((in[55 + inpos]) >>> (61 - 24))
                        | ((in[56 + inpos]) << 24);
                out[54 + outpos] = ((in[56 + inpos]) >>> (61 - 21))
                        | ((in[57 + inpos]) << 21);
                out[55 + outpos] = ((in[57 + inpos]) >>> (61 - 18))
                        | ((in[58 + inpos]) << 18);
                out[56 + outpos] = ((in[58 + inpos]) >>> (61 - 15))
                        | ((in[59 + inpos]) << 15);
                out[57 + outpos] = ((in[59 + inpos]) >>> (61 - 12))
                        | ((in[60 + inpos]) << 12);
                out[58 + outpos] = ((in[60 + inpos]) >>> (61 - 9))
                        | ((in[61 + inpos]) << 9);
                out[59 + outpos] = ((in[61 + inpos]) >>> (61 - 6))
                        | ((in[62 + inpos]) << 6);
                out[60 + outpos] = ((in[62 + inpos]) >>> (61 - 3))
                        | ((in[63 + inpos]) << 3);
        }

        protected static void fastpackwithoutmask62(final long[] in, int inpos,
                final long[] out, int outpos) {
                out[outpos] = in[inpos] | ((in[1 + inpos]) << 62);
                out[1 + outpos] = ((in[1 + inpos]) >>> (62 - 60))
                        | ((in[2 + inpos]) << 60);
                out[2 + outpos] = ((in[2 + inpos]) >>> (62 - 58))
                        | ((in[3 + inpos]) << 58);
                out[3 + outpos] = ((in[3 + inpos]) >>> (62 - 56))
                        | ((in[4 + inpos]) << 56);
                out[4 + outpos] = ((in[4 + inpos]) >>> (62 - 54))
                        | ((in[5 + inpos]) << 54);
                out[5 + outpos] = ((in[5 + inpos]) >>> (62 - 52))
                        | ((in[6 + inpos]) << 52);
                out[6 + outpos] = ((in[6 + inpos]) >>> (62 - 50))
                        | ((in[7 + inpos]) << 50);
                out[7 + outpos] = ((in[7 + inpos]) >>> (62 - 48))
                        | ((in[8 + inpos]) << 48);
                out[8 + outpos] = ((in[8 + inpos]) >>> (62 - 46))
                        | ((in[9 + inpos]) << 46);
                out[9 + outpos] = ((in[9 + inpos]) >>> (62 - 44))
                        | ((in[10 + inpos]) << 44);
                out[10 + outpos] = ((in[10 + inpos]) >>> (62 - 42))
                        | ((in[11 + inpos]) << 42);
                out[11 + outpos] = ((in[11 + inpos]) >>> (62 - 40))
                        | ((in[12 + inpos]) << 40);
                out[12 + outpos] = ((in[12 + inpos]) >>> (62 - 38))
                        | ((in[13 + inpos]) << 38);
                out[13 + outpos] = ((in[13 + inpos]) >>> (62 - 36))
                        | ((in[14 + inpos]) << 36);
                out[14 + outpos] = ((in[14 + inpos]) >>> (62 - 34))
                        | ((in[15 + inpos]) << 34);
                out[15 + outpos] = ((in[15 + inpos]) >>> (62 - 32))
                        | ((in[16 + inpos]) << 32);
                out[16 + outpos] = ((in[16 + inpos]) >>> (62 - 30))
                        | ((in[17 + inpos]) << 30);
                out[17 + outpos] = ((in[17 + inpos]) >>> (62 - 28))
                        | ((in[18 + inpos]) << 28);
                out[18 + outpos] = ((in[18 + inpos]) >>> (62 - 26))
                        | ((in[19 + inpos]) << 26);
                out[19 + outpos] = ((in[19 + inpos]) >>> (62 - 24))
                        | ((in[20 + inpos]) << 24);
                out[20 + outpos] = ((in[20 + inpos]) >>> (62 - 22))
                        | ((in[21 + inpos]) << 22);
                out[21 + outpos] = ((in[21 + inpos]) >>> (62 - 20))
                        | ((in[22 + inpos]) << 20);
                out[22 + outpos] = ((in[22 + inpos]) >>> (62 - 18))
                        | ((in[23 + inpos]) << 18);
                out[23 + outpos] = ((in[23 + inpos]) >>> (62 - 16))
                        | ((in[24 + inpos]) << 16);
                out[24 + outpos] = ((in[24 + inpos]) >>> (62 - 14))
                        | ((in[25 + inpos]) << 14);
                out[25 + outpos] = ((in[25 + inpos]) >>> (62 - 12))
                        | ((in[26 + inpos]) << 12);
                out[26 + outpos] = ((in[26 + inpos]) >>> (62 - 10))
                        | ((in[27 + inpos]) << 10);
                out[27 + outpos] = ((in[27 + inpos]) >>> (62 - 8))
                        | ((in[28 + inpos]) << 8);
                out[28 + outpos] = ((in[28 + inpos]) >>> (62 - 6))
                        | ((in[29 + inpos]) << 6);
                out[29 + outpos] = ((in[29 + inpos]) >>> (62 - 4))
                        | ((in[30 + inpos]) << 4);
                out[30 + outpos] = ((in[30 + inpos]) >>> (62 - 2))
                        | ((in[31 + inpos]) << 2);
                out[31 + outpos] = in[32 + inpos]
                        | ((in[33 + inpos]) << 62);
                out[32 + outpos] = ((in[33 + inpos]) >>> (62 - 60))
                        | ((in[34 + inpos]) << 60);
                out[33 + outpos] = ((in[34 + inpos]) >>> (62 - 58))
                        | ((in[35 + inpos]) << 58);
                out[34 + outpos] = ((in[35 + inpos]) >>> (62 - 56))
                        | ((in[36 + inpos]) << 56);
                out[35 + outpos] = ((in[36 + inpos]) >>> (62 - 54))
                        | ((in[37 + inpos]) << 54);
                out[36 + outpos] = ((in[37 + inpos]) >>> (62 - 52))
                        | ((in[38 + inpos]) << 52);
                out[37 + outpos] = ((in[38 + inpos]) >>> (62 - 50))
                        | ((in[39 + inpos]) << 50);
                out[38 + outpos] = ((in[39 + inpos]) >>> (62 - 48))
                        | ((in[40 + inpos]) << 48);
                out[39 + outpos] = ((in[40 + inpos]) >>> (62 - 46))
                        | ((in[41 + inpos]) << 46);
                out[40 + outpos] = ((in[41 + inpos]) >>> (62 - 44))
                        | ((in[42 + inpos]) << 44);
                out[41 + outpos] = ((in[42 + inpos]) >>> (62 - 42))
                        | ((in[43 + inpos]) << 42);
                out[42 + outpos] = ((in[43 + inpos]) >>> (62 - 40))
                        | ((in[44 + inpos]) << 40);
                out[43 + outpos] = ((in[44 + inpos]) >>> (62 - 38))
                        | ((in[45 + inpos]) << 38);
                out[44 + outpos] = ((in[45 + inpos]) >>> (62 - 36))
                        | ((in[46 + inpos]) << 36);
                out[45 + outpos] = ((in[46 + inpos]) >>> (62 - 34))
                        | ((in[47 + inpos]) << 34);
                out[46 + outpos] = ((in[47 + inpos]) >>> (62 - 32))
                        | ((in[48 + inpos]) << 32);
                out[47 + outpos] = ((in[48 + inpos]) >>> (62 - 30))
                        | ((in[49 + inpos]) << 30);
                out[48 + outpos] = ((in[49 + inpos]) >>> (62 - 28))
                        | ((in[50 + inpos]) << 28);
                out[49 + outpos] = ((in[50 + inpos]) >>> (62 - 26))
                        | ((in[51 + inpos]) << 26);
                out[50 + outpos] = ((in[51 + inpos]) >>> (62 - 24))
                        | ((in[52 + inpos]) << 24);
                out[51 + outpos] = ((in[52 + inpos]) >>> (62 - 22))
                        | ((in[53 + inpos]) << 22);
                out[52 + outpos] = ((in[53 + inpos]) >>> (62 - 20))
                        | ((in[54 + inpos]) << 20);
                out[53 + outpos] = ((in[54 + inpos]) >>> (62 - 18))
                        | ((in[55 + inpos]) << 18);
                out[54 + outpos] = ((in[55 + inpos]) >>> (62 - 16))
                        | ((in[56 + inpos]) << 16);
                out[55 + outpos] = ((in[56 + inpos]) >>> (62 - 14))
                        | ((in[57 + inpos]) << 14);
                out[56 + outpos] = ((in[57 + inpos]) >>> (62 - 12))
                        | ((in[58 + inpos]) << 12);
                out[57 + outpos] = ((in[58 + inpos]) >>> (62 - 10))
                        | ((in[59 + inpos]) << 10);
                out[58 + outpos] = ((in[59 + inpos]) >>> (62 - 8))
                        | ((in[60 + inpos]) << 8);
                out[59 + outpos] = ((in[60 + inpos]) >>> (62 - 6))
                        | ((in[61 + inpos]) << 6);
                out[60 + outpos] = ((in[61 + inpos]) >>> (62 - 4))
                        | ((in[62 + inpos]) << 4);
                out[61 + outpos] = ((in[62 + inpos]) >>> (62 - 2))
                        | ((in[63 + inpos]) << 2);
        }

        protected static void fastpackwithoutmask63(final long[] in, int inpos,
                final long[] out, int outpos) {
                out[outpos] = in[inpos] | ((in[1 + inpos]) << 63);
                out[1 + outpos] = ((in[1 + inpos]) >>> (63 - 62))
                        | ((in[2 + inpos]) << 62);
                out[2 + outpos] = ((in[2 + inpos]) >>> (63 - 61))
                        | ((in[3 + inpos]) << 61);
                out[3 + outpos] = ((in[3 + inpos]) >>> (63 - 60))
                        | ((in[4 + inpos]) << 60);
                out[4 + outpos] = ((in[4 + inpos]) >>> (63 - 59))
                        | ((in[5 + inpos]) << 59);
                out[5 + outpos] = ((in[5 + inpos]) >>> (63 - 58))
                        | ((in[6 + inpos]) << 58);
                out[6 + outpos] = ((in[6 + inpos]) >>> (63 - 57))
                        | ((in[7 + inpos]) << 57);
                out[7 + outpos] = ((in[7 + inpos]) >>> (63 - 56))
                        | ((in[8 + inpos]) << 56);
                out[8 + outpos] = ((in[8 + inpos]) >>> (63 - 55))
                        | ((in[9 + inpos]) << 55);
                out[9 + outpos] = ((in[9 + inpos]) >>> (63 - 54))
                        | ((in[10 + inpos]) << 54);
                out[10 + outpos] = ((in[10 + inpos]) >>> (63 - 53))
                        | ((in[11 + inpos]) << 53);
                out[11 + outpos] = ((in[11 + inpos]) >>> (63 - 52))
                        | ((in[12 + inpos]) << 52);
                out[12 + outpos] = ((in[12 + inpos]) >>> (63 - 51))
                        | ((in[13 + inpos]) << 51);
                out[13 + outpos] = ((in[13 + inpos]) >>> (63 - 50))
                        | ((in[14 + inpos]) << 50);
                out[14 + outpos] = ((in[14 + inpos]) >>> (63 - 49))
                        | ((in[15 + inpos]) << 49);
                out[15 + outpos] = ((in[15 + inpos]) >>> (63 - 48))
                        | ((in[16 + inpos]) << 48);
                out[16 + outpos] = ((in[16 + inpos]) >>> (63 - 47))
                        | ((in[17 + inpos]) << 47);
                out[17 + outpos] = ((in[17 + inpos]) >>> (63 - 46))
                        | ((in[18 + inpos]) << 46);
                out[18 + outpos] = ((in[18 + inpos]) >>> (63 - 45))
                        | ((in[19 + inpos]) << 45);
                out[19 + outpos] = ((in[19 + inpos]) >>> (63 - 44))
                        | ((in[20 + inpos]) << 44);
                out[20 + outpos] = ((in[20 + inpos]) >>> (63 - 43))
                        | ((in[21 + inpos]) << 43);
                out[21 + outpos] = ((in[21 + inpos]) >>> (63 - 42))
                        | ((in[22 + inpos]) << 42);
                out[22 + outpos] = ((in[22 + inpos]) >>> (63 - 41))
                        | ((in[23 + inpos]) << 41);
                out[23 + outpos] = ((in[23 + inpos]) >>> (63 - 40))
                        | ((in[24 + inpos]) << 40);
                out[24 + outpos] = ((in[24 + inpos]) >>> (63 - 39))
                        | ((in[25 + inpos]) << 39);
                out[25 + outpos] = ((in[25 + inpos]) >>> (63 - 38))
                        | ((in[26 + inpos]) << 38);
                out[26 + outpos] = ((in[26 + inpos]) >>> (63 - 37))
                        | ((in[27 + inpos]) << 37);
                out[27 + outpos] = ((in[27 + inpos]) >>> (63 - 36))
                        | ((in[28 + inpos]) << 36);
                out[28 + outpos] = ((in[28 + inpos]) >>> (63 - 35))
                        | ((in[29 + inpos]) << 35);
                out[29 + outpos] = ((in[29 + inpos]) >>> (63 - 34))
                        | ((in[30 + inpos]) << 34);
                out[30 + outpos] = ((in[30 + inpos]) >>> (63 - 33))
                        | ((in[31 + inpos]) << 33);
                out[31 + outpos] = ((in[31 + inpos]) >>> (63 - 32))
                        | ((in[32 + inpos]) << 32);
                out[32 + outpos] = ((in[32 + inpos]) >>> (63 - 31))
                        | ((in[33 + inpos]) << 31);
                out[33 + outpos] = ((in[33 + inpos]) >>> (63 - 30))
                        | ((in[34 + inpos]) << 30);
                out[34 + outpos] = ((in[34 + inpos]) >>> (63 - 29))
                        | ((in[35 + inpos]) << 29);
                out[35 + outpos] = ((in[35 + inpos]) >>> (63 - 28))
                        | ((in[36 + inpos]) << 28);
                out[36 + outpos] = ((in[36 + inpos]) >>> (63 - 27))
                        | ((in[37 + inpos]) << 27);
                out[37 + outpos] = ((in[37 + inpos]) >>> (63 - 26))
                        | ((in[38 + inpos]) << 26);
                out[38 + outpos] = ((in[38 + inpos]) >>> (63 - 25))
                        | ((in[39 + inpos]) << 25);
                out[39 + outpos] = ((in[39 + inpos]) >>> (63 - 24))
                        | ((in[40 + inpos]) << 24);
                out[40 + outpos] = ((in[40 + inpos]) >>> (63 - 23))
                        | ((in[41 + inpos]) << 23);
                out[41 + outpos] = ((in[41 + inpos]) >>> (63 - 22))
                        | ((in[42 + inpos]) << 22);
                out[42 + outpos] = ((in[42 + inpos]) >>> (63 - 21))
                        | ((in[43 + inpos]) << 21);
                out[43 + outpos] = ((in[43 + inpos]) >>> (63 - 20))
                        | ((in[44 + inpos]) << 20);
                out[44 + outpos] = ((in[44 + inpos]) >>> (63 - 19))
                        | ((in[45 + inpos]) << 19);
                out[45 + outpos] = ((in[45 + inpos]) >>> (63 - 18))
                        | ((in[46 + inpos]) << 18);
                out[46 + outpos] = ((in[46 + inpos]) >>> (63 - 17))
                        | ((in[47 + inpos]) << 17);
                out[47 + outpos] = ((in[47 + inpos]) >>> (63 - 16))
                        | ((in[48 + inpos]) << 16);
                out[48 + outpos] = ((in[48 + inpos]) >>> (63 - 15))
                        | ((in[49 + inpos]) << 15);
                out[49 + outpos] = ((in[49 + inpos]) >>> (63 - 14))
                        | ((in[50 + inpos]) << 14);
                out[50 + outpos] = ((in[50 + inpos]) >>> (63 - 13))
                        | ((in[51 + inpos]) << 13);
                out[51 + outpos] = ((in[51 + inpos]) >>> (63 - 12))
                        | ((in[52 + inpos]) << 12);
                out[52 + outpos] = ((in[52 + inpos]) >>> (63 - 11))
                        | ((in[53 + inpos]) << 11);
                out[53 + outpos] = ((in[53 + inpos]) >>> (63 - 10))
                        | ((in[54 + inpos]) << 10);
                out[54 + outpos] = ((in[54 + inpos]) >>> (63 - 9))
                        | ((in[55 + inpos]) << 9);
                out[55 + outpos] = ((in[55 + inpos]) >>> (63 - 8))
                        | ((in[56 + inpos]) << 8);
                out[56 + outpos] = ((in[56 + inpos]) >>> (63 - 7))
                        | ((in[57 + inpos]) << 7);
                out[57 + outpos] = ((in[57 + inpos]) >>> (63 - 6))
                        | ((in[58 + inpos]) << 6);
                out[58 + outpos] = ((in[58 + inpos]) >>> (63 - 5))
                        | ((in[59 + inpos]) << 5);
                out[59 + outpos] = ((in[59 + inpos]) >>> (63 - 4))
                        | ((in[60 + inpos]) << 4);
                out[60 + outpos] = ((in[60 + inpos]) >>> (63 - 3))
                        | ((in[61 + inpos]) << 3);
                out[61 + outpos] = ((in[61 + inpos]) >>> (63 - 2))
                        | ((in[62 + inpos]) << 2);
                out[62 + outpos] = ((in[62 + inpos]) >>> (63 - 1))
                        | ((in[63 + inpos]) << 1);
        }

        protected static void fastpackwithoutmask64(final long[] in, int inpos,
                final long[] out, int outpos) {
                System.arraycopy(in, inpos, out, outpos, 64);
        }

        protected static void slowpackwithoutmask(final long[] in, int inpos,
                final long[] out, int outpos, final int bit) {
                int bucket = 0;
                int shift = 0;
                
                out[outpos + bucket] = 0L;
                for (int i = 0 ; i < 64 ; i++) {
                    if (shift >= 64) {
                        bucket++;
                        out[bucket + outpos] = 0L;
                        shift -= 64;

                        if (shift > 0) {
                            // There is some leftovers from previous input in the next bucket
                            out[outpos + bucket] |= in[inpos + i - 1] >> (bit - shift);
                        }
                    }
                    out[outpos + bucket] |= in[inpos + i] << shift;
                    
                    shift += bit;
                }
        }


        /**
         * Unpack the 64 longs
         * 
         * @param in
         *                source array
         * @param inpos
         *                starting point in the source array
         * @param out
         *                output array
         * @param outpos
         *                starting point in the output array
         * @param bit
         *                how many bits to use per integer
         */
        public static void fastunpack(final long[] in, final int inpos,
                final long[] out, final int outpos, final int bit) {
                switch (bit) {
                case 0:
                        fastunpack0(in, inpos, out, outpos);
                        break;
                case 1:
                        fastunpack1(in, inpos, out, outpos);
                        break;
                case 2:
                        fastunpack2(in, inpos, out, outpos);
                        break;
                case 3:
                        fastunpack3(in, inpos, out, outpos);
                        break;
                case 4:
                        fastunpack4(in, inpos, out, outpos);
                        break;
                case 5:
                        fastunpack5(in, inpos, out, outpos);
                        break;
                case 6:
                        fastunpack6(in, inpos, out, outpos);
                        break;
                case 7:
                        fastunpack7(in, inpos, out, outpos);
                        break;
                case 8:
                        fastunpack8(in, inpos, out, outpos);
                        break;
                case 9:
                        fastunpack9(in, inpos, out, outpos);
                        break;
                case 10:
                        fastunpack10(in, inpos, out, outpos);
                        break;
                case 11:
                        fastunpack11(in, inpos, out, outpos);
                        break;
                case 12:
                        fastunpack12(in, inpos, out, outpos);
                        break;
                case 13:
                        fastunpack13(in, inpos, out, outpos);
                        break;
                case 14:
                        fastunpack14(in, inpos, out, outpos);
                        break;
                case 15:
                        fastunpack15(in, inpos, out, outpos);
                        break;
                case 16:
                        fastunpack16(in, inpos, out, outpos);
                        break;
                case 17:
                        fastunpack17(in, inpos, out, outpos);
                        break;
                case 18:
                        fastunpack18(in, inpos, out, outpos);
                        break;
                case 19:
                        fastunpack19(in, inpos, out, outpos);
                        break;
                case 20:
                        fastunpack20(in, inpos, out, outpos);
                        break;
                case 21:
                        fastunpack21(in, inpos, out, outpos);
                        break;
                case 22:
                        fastunpack22(in, inpos, out, outpos);
                        break;
                case 23:
                        fastunpack23(in, inpos, out, outpos);
                        break;
                case 24:
                        fastunpack24(in, inpos, out, outpos);
                        break;
                case 25:
                        fastunpack25(in, inpos, out, outpos);
                        break;
                case 26:
                        fastunpack26(in, inpos, out, outpos);
                        break;
                case 27:
                        fastunpack27(in, inpos, out, outpos);
                        break;
                case 28:
                        fastunpack28(in, inpos, out, outpos);
                        break;
                case 29:
                        fastunpack29(in, inpos, out, outpos);
                        break;
                case 30:
                        fastunpack30(in, inpos, out, outpos);
                        break;
                case 31:
                        fastunpack31(in, inpos, out, outpos);
                        break;
                case 32:
                        fastunpack32(in, inpos, out, outpos);
                        break;
                case 33:
                        fastunpack33(in, inpos, out, outpos);
                        break;
                case 34:
                        fastunpack34(in, inpos, out, outpos);
                        break;
                case 35:
                        fastunpack35(in, inpos, out, outpos);
                        break;
                case 36:
                        fastunpack36(in, inpos, out, outpos);
                        break;
                case 37:
                        fastunpack37(in, inpos, out, outpos);
                        break;
                case 38:
                        fastunpack38(in, inpos, out, outpos);
                        break;
                case 39:
                        fastunpack39(in, inpos, out, outpos);
                        break;
                case 40:
                        fastunpack40(in, inpos, out, outpos);
                        break;
                case 41:
                        fastunpack41(in, inpos, out, outpos);
                        break;
                case 42:
                        fastunpack42(in, inpos, out, outpos);
                        break;
                case 43:
                        fastunpack43(in, inpos, out, outpos);
                        break;
                case 44:
                        fastunpack44(in, inpos, out, outpos);
                        break;
                case 45:
                        fastunpack45(in, inpos, out, outpos);
                        break;
                case 46:
                        fastunpack46(in, inpos, out, outpos);
                        break;
                case 47:
                        fastunpack47(in, inpos, out, outpos);
                        break;
                case 48:
                        fastunpack48(in, inpos, out, outpos);
                        break;
                case 49:
                        fastunpack49(in, inpos, out, outpos);
                        break;
                case 50:
                        fastunpack50(in, inpos, out, outpos);
                        break;
                case 51:
                        fastunpack51(in, inpos, out, outpos);
                        break;
                case 52:
                        fastunpack52(in, inpos, out, outpos);
                        break;
                case 53:
                        fastunpack53(in, inpos, out, outpos);
                        break;
                case 54:
                        fastunpack54(in, inpos, out, outpos);
                        break;
                case 55:
                        fastunpack55(in, inpos, out, outpos);
                        break;
                case 56:
                        fastunpack56(in, inpos, out, outpos);
                        break;
                case 57:
                        fastunpack57(in, inpos, out, outpos);
                        break;
                case 58:
                        fastunpack58(in, inpos, out, outpos);
                        break;
                case 59:
                        fastunpack59(in, inpos, out, outpos);
                        break;
                case 60:
                        fastunpack60(in, inpos, out, outpos);
                        break;
                case 61:
                        fastunpack61(in, inpos, out, outpos);
                        break;
                case 62:
                        fastunpack62(in, inpos, out, outpos);
                        break;
                case 63:
                        fastunpack63(in, inpos, out, outpos);
                        break;
                case 64:
                        fastunpack64(in, inpos, out, outpos);
                        break;
                default:
                        throw new IllegalArgumentException("Unsupported bit width: " + bit);
                }
        }


        protected static void fastunpack0(final long[] in, int inpos,
                final long[] out, int outpos) {
                Arrays.fill(out, outpos, outpos + 64, 0);
        }

        protected static void fastunpack1(final long[] in, int inpos,
                final long[] out, int outpos) {
                out[outpos] = (in[inpos] & 1L);
                out[1 + outpos] = ((in[inpos] >>> 1) & 1L);
                out[2 + outpos] = ((in[inpos] >>> 2) & 1L);
                out[3 + outpos] = ((in[inpos] >>> 3) & 1L);
                out[4 + outpos] = ((in[inpos] >>> 4) & 1L);
                out[5 + outpos] = ((in[inpos] >>> 5) & 1L);
                out[6 + outpos] = ((in[inpos] >>> 6) & 1L);
                out[7 + outpos] = ((in[inpos] >>> 7) & 1L);
                out[8 + outpos] = ((in[inpos] >>> 8) & 1L);
                out[9 + outpos] = ((in[inpos] >>> 9) & 1L);
                out[10 + outpos] = ((in[inpos] >>> 10) & 1L);
                out[11 + outpos] = ((in[inpos] >>> 11) & 1L);
                out[12 + outpos] = ((in[inpos] >>> 12) & 1L);
                out[13 + outpos] = ((in[inpos] >>> 13) & 1L);
                out[14 + outpos] = ((in[inpos] >>> 14) & 1L);
                out[15 + outpos] = ((in[inpos] >>> 15) & 1L);
                out[16 + outpos] = ((in[inpos] >>> 16) & 1L);
                out[17 + outpos] = ((in[inpos] >>> 17) & 1L);
                out[18 + outpos] = ((in[inpos] >>> 18) & 1L);
                out[19 + outpos] = ((in[inpos] >>> 19) & 1L);
                out[20 + outpos] = ((in[inpos] >>> 20) & 1L);
                out[21 + outpos] = ((in[inpos] >>> 21) & 1L);
                out[22 + outpos] = ((in[inpos] >>> 22) & 1L);
                out[23 + outpos] = ((in[inpos] >>> 23) & 1L);
                out[24 + outpos] = ((in[inpos] >>> 24) & 1L);
                out[25 + outpos] = ((in[inpos] >>> 25) & 1L);
                out[26 + outpos] = ((in[inpos] >>> 26) & 1L);
                out[27 + outpos] = ((in[inpos] >>> 27) & 1L);
                out[28 + outpos] = ((in[inpos] >>> 28) & 1L);
                out[29 + outpos] = ((in[inpos] >>> 29) & 1L);
                out[30 + outpos] = ((in[inpos] >>> 30) & 1L);
                out[31 + outpos] = ((in[inpos] >>> 31) & 1L);
                out[32 + outpos] = ((in[inpos] >>> 32) & 1L);
                out[33 + outpos] = ((in[inpos] >>> 33) & 1L);
                out[34 + outpos] = ((in[inpos] >>> 34) & 1L);
                out[35 + outpos] = ((in[inpos] >>> 35) & 1L);
                out[36 + outpos] = ((in[inpos] >>> 36) & 1L);
                out[37 + outpos] = ((in[inpos] >>> 37) & 1L);
                out[38 + outpos] = ((in[inpos] >>> 38) & 1L);
                out[39 + outpos] = ((in[inpos] >>> 39) & 1L);
                out[40 + outpos] = ((in[inpos] >>> 40) & 1L);
                out[41 + outpos] = ((in[inpos] >>> 41) & 1L);
                out[42 + outpos] = ((in[inpos] >>> 42) & 1L);
                out[43 + outpos] = ((in[inpos] >>> 43) & 1L);
                out[44 + outpos] = ((in[inpos] >>> 44) & 1L);
                out[45 + outpos] = ((in[inpos] >>> 45) & 1L);
                out[46 + outpos] = ((in[inpos] >>> 46) & 1L);
                out[47 + outpos] = ((in[inpos] >>> 47) & 1L);
                out[48 + outpos] = ((in[inpos] >>> 48) & 1L);
                out[49 + outpos] = ((in[inpos] >>> 49) & 1L);
                out[50 + outpos] = ((in[inpos] >>> 50) & 1L);
                out[51 + outpos] = ((in[inpos] >>> 51) & 1L);
                out[52 + outpos] = ((in[inpos] >>> 52) & 1L);
                out[53 + outpos] = ((in[inpos] >>> 53) & 1L);
                out[54 + outpos] = ((in[inpos] >>> 54) & 1L);
                out[55 + outpos] = ((in[inpos] >>> 55) & 1L);
                out[56 + outpos] = ((in[inpos] >>> 56) & 1L);
                out[57 + outpos] = ((in[inpos] >>> 57) & 1L);
                out[58 + outpos] = ((in[inpos] >>> 58) & 1L);
                out[59 + outpos] = ((in[inpos] >>> 59) & 1L);
                out[60 + outpos] = ((in[inpos] >>> 60) & 1L);
                out[61 + outpos] = ((in[inpos] >>> 61) & 1L);
                out[62 + outpos] = ((in[inpos] >>> 62) & 1L);
                out[63 + outpos] = (in[inpos] >>> 63);
        }

        protected static void fastunpack2(final long[] in, int inpos,
                final long[] out, int outpos) {
                out[outpos] = (in[inpos] & 3L);
                out[1 + outpos] = ((in[inpos] >>> 2) & 3L);
                out[2 + outpos] = ((in[inpos] >>> 4) & 3L);
                out[3 + outpos] = ((in[inpos] >>> 6) & 3L);
                out[4 + outpos] = ((in[inpos] >>> 8) & 3L);
                out[5 + outpos] = ((in[inpos] >>> 10) & 3L);
                out[6 + outpos] = ((in[inpos] >>> 12) & 3L);
                out[7 + outpos] = ((in[inpos] >>> 14) & 3L);
                out[8 + outpos] = ((in[inpos] >>> 16) & 3L);
                out[9 + outpos] = ((in[inpos] >>> 18) & 3L);
                out[10 + outpos] = ((in[inpos] >>> 20) & 3L);
                out[11 + outpos] = ((in[inpos] >>> 22) & 3L);
                out[12 + outpos] = ((in[inpos] >>> 24) & 3L);
                out[13 + outpos] = ((in[inpos] >>> 26) & 3L);
                out[14 + outpos] = ((in[inpos] >>> 28) & 3L);
                out[15 + outpos] = ((in[inpos] >>> 30) & 3L);
                out[16 + outpos] = ((in[inpos] >>> 32) & 3L);
                out[17 + outpos] = ((in[inpos] >>> 34) & 3L);
                out[18 + outpos] = ((in[inpos] >>> 36) & 3L);
                out[19 + outpos] = ((in[inpos] >>> 38) & 3L);
                out[20 + outpos] = ((in[inpos] >>> 40) & 3L);
                out[21 + outpos] = ((in[inpos] >>> 42) & 3L);
                out[22 + outpos] = ((in[inpos] >>> 44) & 3L);
                out[23 + outpos] = ((in[inpos] >>> 46) & 3L);
                out[24 + outpos] = ((in[inpos] >>> 48) & 3L);
                out[25 + outpos] = ((in[inpos] >>> 50) & 3L);
                out[26 + outpos] = ((in[inpos] >>> 52) & 3L);
                out[27 + outpos] = ((in[inpos] >>> 54) & 3L);
                out[28 + outpos] = ((in[inpos] >>> 56) & 3L);
                out[29 + outpos] = ((in[inpos] >>> 58) & 3L);
                out[30 + outpos] = ((in[inpos] >>> 60) & 3L);
                out[31 + outpos] = (in[inpos] >>> 62);
                out[32 + outpos] = (in[1 + inpos] & 3L);
                out[33 + outpos] = ((in[1 + inpos] >>> 2) & 3L);
                out[34 + outpos] = ((in[1 + inpos] >>> 4) & 3L);
                out[35 + outpos] = ((in[1 + inpos] >>> 6) & 3L);
                out[36 + outpos] = ((in[1 + inpos] >>> 8) & 3L);
                out[37 + outpos] = ((in[1 + inpos] >>> 10) & 3L);
                out[38 + outpos] = ((in[1 + inpos] >>> 12) & 3L);
                out[39 + outpos] = ((in[1 + inpos] >>> 14) & 3L);
                out[40 + outpos] = ((in[1 + inpos] >>> 16) & 3L);
                out[41 + outpos] = ((in[1 + inpos] >>> 18) & 3L);
                out[42 + outpos] = ((in[1 + inpos] >>> 20) & 3L);
                out[43 + outpos] = ((in[1 + inpos] >>> 22) & 3L);
                out[44 + outpos] = ((in[1 + inpos] >>> 24) & 3L);
                out[45 + outpos] = ((in[1 + inpos] >>> 26) & 3L);
                out[46 + outpos] = ((in[1 + inpos] >>> 28) & 3L);
                out[47 + outpos] = ((in[1 + inpos] >>> 30) & 3L);
                out[48 + outpos] = ((in[1 + inpos] >>> 32) & 3L);
                out[49 + outpos] = ((in[1 + inpos] >>> 34) & 3L);
                out[50 + outpos] = ((in[1 + inpos] >>> 36) & 3L);
                out[51 + outpos] = ((in[1 + inpos] >>> 38) & 3L);
                out[52 + outpos] = ((in[1 + inpos] >>> 40) & 3L);
                out[53 + outpos] = ((in[1 + inpos] >>> 42) & 3L);
                out[54 + outpos] = ((in[1 + inpos] >>> 44) & 3L);
                out[55 + outpos] = ((in[1 + inpos] >>> 46) & 3L);
                out[56 + outpos] = ((in[1 + inpos] >>> 48) & 3L);
                out[57 + outpos] = ((in[1 + inpos] >>> 50) & 3L);
                out[58 + outpos] = ((in[1 + inpos] >>> 52) & 3L);
                out[59 + outpos] = ((in[1 + inpos] >>> 54) & 3L);
                out[60 + outpos] = ((in[1 + inpos] >>> 56) & 3L);
                out[61 + outpos] = ((in[1 + inpos] >>> 58) & 3L);
                out[62 + outpos] = ((in[1 + inpos] >>> 60) & 3L);
                out[63 + outpos] = (in[1 + inpos] >>> 62);
        }

        protected static void fastunpack3(final long[] in, int inpos,
                final long[] out, int outpos) {
                out[outpos] = (in[inpos] & 7L);
                out[1 + outpos] = ((in[inpos] >>> 3) & 7L);
                out[2 + outpos] = ((in[inpos] >>> 6) & 7L);
                out[3 + outpos] = ((in[inpos] >>> 9) & 7L);
                out[4 + outpos] = ((in[inpos] >>> 12) & 7L);
                out[5 + outpos] = ((in[inpos] >>> 15) & 7L);
                out[6 + outpos] = ((in[inpos] >>> 18) & 7L);
                out[7 + outpos] = ((in[inpos] >>> 21) & 7L);
                out[8 + outpos] = ((in[inpos] >>> 24) & 7L);
                out[9 + outpos] = ((in[inpos] >>> 27) & 7L);
                out[10 + outpos] = ((in[inpos] >>> 30) & 7L);
                out[11 + outpos] = ((in[inpos] >>> 33) & 7L);
                out[12 + outpos] = ((in[inpos] >>> 36) & 7L);
                out[13 + outpos] = ((in[inpos] >>> 39) & 7L);
                out[14 + outpos] = ((in[inpos] >>> 42) & 7L);
                out[15 + outpos] = ((in[inpos] >>> 45) & 7L);
                out[16 + outpos] = ((in[inpos] >>> 48) & 7L);
                out[17 + outpos] = ((in[inpos] >>> 51) & 7L);
                out[18 + outpos] = ((in[inpos] >>> 54) & 7L);
                out[19 + outpos] = ((in[inpos] >>> 57) & 7L);
                out[20 + outpos] = ((in[inpos] >>> 60) & 7L);
                out[21 + outpos] = (in[inpos] >>> 63)
                        | ((in[1 + inpos] & 3L) << (3 - 2));
                out[22 + outpos] = ((in[1 + inpos] >>> 2) & 7L);
                out[23 + outpos] = ((in[1 + inpos] >>> 5) & 7L);
                out[24 + outpos] = ((in[1 + inpos] >>> 8) & 7L);
                out[25 + outpos] = ((in[1 + inpos] >>> 11) & 7L);
                out[26 + outpos] = ((in[1 + inpos] >>> 14) & 7L);
                out[27 + outpos] = ((in[1 + inpos] >>> 17) & 7L);
                out[28 + outpos] = ((in[1 + inpos] >>> 20) & 7L);
                out[29 + outpos] = ((in[1 + inpos] >>> 23) & 7L);
                out[30 + outpos] = ((in[1 + inpos] >>> 26) & 7L);
                out[31 + outpos] = ((in[1 + inpos] >>> 29) & 7L);
                out[32 + outpos] = ((in[1 + inpos] >>> 32) & 7L);
                out[33 + outpos] = ((in[1 + inpos] >>> 35) & 7L);
                out[34 + outpos] = ((in[1 + inpos] >>> 38) & 7L);
                out[35 + outpos] = ((in[1 + inpos] >>> 41) & 7L);
                out[36 + outpos] = ((in[1 + inpos] >>> 44) & 7L);
                out[37 + outpos] = ((in[1 + inpos] >>> 47) & 7L);
                out[38 + outpos] = ((in[1 + inpos] >>> 50) & 7L);
                out[39 + outpos] = ((in[1 + inpos] >>> 53) & 7L);
                out[40 + outpos] = ((in[1 + inpos] >>> 56) & 7L);
                out[41 + outpos] = ((in[1 + inpos] >>> 59) & 7L);
                out[42 + outpos] = (in[1 + inpos] >>> 62)
                        | ((in[2 + inpos] & 1L) << (3 - 1));
                out[43 + outpos] = ((in[2 + inpos] >>> 1) & 7L);
                out[44 + outpos] = ((in[2 + inpos] >>> 4) & 7L);
                out[45 + outpos] = ((in[2 + inpos] >>> 7) & 7L);
                out[46 + outpos] = ((in[2 + inpos] >>> 10) & 7L);
                out[47 + outpos] = ((in[2 + inpos] >>> 13) & 7L);
                out[48 + outpos] = ((in[2 + inpos] >>> 16) & 7L);
                out[49 + outpos] = ((in[2 + inpos] >>> 19) & 7L);
                out[50 + outpos] = ((in[2 + inpos] >>> 22) & 7L);
                out[51 + outpos] = ((in[2 + inpos] >>> 25) & 7L);
                out[52 + outpos] = ((in[2 + inpos] >>> 28) & 7L);
                out[53 + outpos] = ((in[2 + inpos] >>> 31) & 7L);
                out[54 + outpos] = ((in[2 + inpos] >>> 34) & 7L);
                out[55 + outpos] = ((in[2 + inpos] >>> 37) & 7L);
                out[56 + outpos] = ((in[2 + inpos] >>> 40) & 7L);
                out[57 + outpos] = ((in[2 + inpos] >>> 43) & 7L);
                out[58 + outpos] = ((in[2 + inpos] >>> 46) & 7L);
                out[59 + outpos] = ((in[2 + inpos] >>> 49) & 7L);
                out[60 + outpos] = ((in[2 + inpos] >>> 52) & 7L);
                out[61 + outpos] = ((in[2 + inpos] >>> 55) & 7L);
                out[62 + outpos] = ((in[2 + inpos] >>> 58) & 7L);
                out[63 + outpos] = (in[2 + inpos] >>> 61);
        }

        protected static void fastunpack4(final long[] in, int inpos,
                final long[] out, int outpos) {
                out[outpos] = (in[inpos] & 15L);
                out[1 + outpos] = ((in[inpos] >>> 4) & 15L);
                out[2 + outpos] = ((in[inpos] >>> 8) & 15L);
                out[3 + outpos] = ((in[inpos] >>> 12) & 15L);
                out[4 + outpos] = ((in[inpos] >>> 16) & 15L);
                out[5 + outpos] = ((in[inpos] >>> 20) & 15L);
                out[6 + outpos] = ((in[inpos] >>> 24) & 15L);
                out[7 + outpos] = ((in[inpos] >>> 28) & 15L);
                out[8 + outpos] = ((in[inpos] >>> 32) & 15L);
                out[9 + outpos] = ((in[inpos] >>> 36) & 15L);
                out[10 + outpos] = ((in[inpos] >>> 40) & 15L);
                out[11 + outpos] = ((in[inpos] >>> 44) & 15L);
                out[12 + outpos] = ((in[inpos] >>> 48) & 15L);
                out[13 + outpos] = ((in[inpos] >>> 52) & 15L);
                out[14 + outpos] = ((in[inpos] >>> 56) & 15L);
                out[15 + outpos] = (in[inpos] >>> 60);
                out[16 + outpos] = (in[1 + inpos] & 15L);
                out[17 + outpos] = ((in[1 + inpos] >>> 4) & 15L);
                out[18 + outpos] = ((in[1 + inpos] >>> 8) & 15L);
                out[19 + outpos] = ((in[1 + inpos] >>> 12) & 15L);
                out[20 + outpos] = ((in[1 + inpos] >>> 16) & 15L);
                out[21 + outpos] = ((in[1 + inpos] >>> 20) & 15L);
                out[22 + outpos] = ((in[1 + inpos] >>> 24) & 15L);
                out[23 + outpos] = ((in[1 + inpos] >>> 28) & 15L);
                out[24 + outpos] = ((in[1 + inpos] >>> 32) & 15L);
                out[25 + outpos] = ((in[1 + inpos] >>> 36) & 15L);
                out[26 + outpos] = ((in[1 + inpos] >>> 40) & 15L);
                out[27 + outpos] = ((in[1 + inpos] >>> 44) & 15L);
                out[28 + outpos] = ((in[1 + inpos] >>> 48) & 15L);
                out[29 + outpos] = ((in[1 + inpos] >>> 52) & 15L);
                out[30 + outpos] = ((in[1 + inpos] >>> 56) & 15L);
                out[31 + outpos] = (in[1 + inpos] >>> 60);
                out[32 + outpos] = (in[2 + inpos] & 15L);
                out[33 + outpos] = ((in[2 + inpos] >>> 4) & 15L);
                out[34 + outpos] = ((in[2 + inpos] >>> 8) & 15L);
                out[35 + outpos] = ((in[2 + inpos] >>> 12) & 15L);
                out[36 + outpos] = ((in[2 + inpos] >>> 16) & 15L);
                out[37 + outpos] = ((in[2 + inpos] >>> 20) & 15L);
                out[38 + outpos] = ((in[2 + inpos] >>> 24) & 15L);
                out[39 + outpos] = ((in[2 + inpos] >>> 28) & 15L);
                out[40 + outpos] = ((in[2 + inpos] >>> 32) & 15L);
                out[41 + outpos] = ((in[2 + inpos] >>> 36) & 15L);
                out[42 + outpos] = ((in[2 + inpos] >>> 40) & 15L);
                out[43 + outpos] = ((in[2 + inpos] >>> 44) & 15L);
                out[44 + outpos] = ((in[2 + inpos] >>> 48) & 15L);
                out[45 + outpos] = ((in[2 + inpos] >>> 52) & 15L);
                out[46 + outpos] = ((in[2 + inpos] >>> 56) & 15L);
                out[47 + outpos] = (in[2 + inpos] >>> 60);
                out[48 + outpos] = (in[3 + inpos] & 15L);
                out[49 + outpos] = ((in[3 + inpos] >>> 4) & 15L);
                out[50 + outpos] = ((in[3 + inpos] >>> 8) & 15L);
                out[51 + outpos] = ((in[3 + inpos] >>> 12) & 15L);
                out[52 + outpos] = ((in[3 + inpos] >>> 16) & 15L);
                out[53 + outpos] = ((in[3 + inpos] >>> 20) & 15L);
                out[54 + outpos] = ((in[3 + inpos] >>> 24) & 15L);
                out[55 + outpos] = ((in[3 + inpos] >>> 28) & 15L);
                out[56 + outpos] = ((in[3 + inpos] >>> 32) & 15L);
                out[57 + outpos] = ((in[3 + inpos] >>> 36) & 15L);
                out[58 + outpos] = ((in[3 + inpos] >>> 40) & 15L);
                out[59 + outpos] = ((in[3 + inpos] >>> 44) & 15L);
                out[60 + outpos] = ((in[3 + inpos] >>> 48) & 15L);
                out[61 + outpos] = ((in[3 + inpos] >>> 52) & 15L);
                out[62 + outpos] = ((in[3 + inpos] >>> 56) & 15L);
                out[63 + outpos] = (in[3 + inpos] >>> 60);
        }

        protected static void fastunpack5(final long[] in, int inpos,
                final long[] out, int outpos) {
                out[outpos] = (in[inpos] & 31L);
                out[1 + outpos] = ((in[inpos] >>> 5) & 31L);
                out[2 + outpos] = ((in[inpos] >>> 10) & 31L);
                out[3 + outpos] = ((in[inpos] >>> 15) & 31L);
                out[4 + outpos] = ((in[inpos] >>> 20) & 31L);
                out[5 + outpos] = ((in[inpos] >>> 25) & 31L);
                out[6 + outpos] = ((in[inpos] >>> 30) & 31L);
                out[7 + outpos] = ((in[inpos] >>> 35) & 31L);
                out[8 + outpos] = ((in[inpos] >>> 40) & 31L);
                out[9 + outpos] = ((in[inpos] >>> 45) & 31L);
                out[10 + outpos] = ((in[inpos] >>> 50) & 31L);
                out[11 + outpos] = ((in[inpos] >>> 55) & 31L);
                out[12 + outpos] = (in[inpos] >>> 60)
                        | ((in[1 + inpos] & 1L) << (5 - 1));
                out[13 + outpos] = ((in[1 + inpos] >>> 1) & 31L);
                out[14 + outpos] = ((in[1 + inpos] >>> 6) & 31L);
                out[15 + outpos] = ((in[1 + inpos] >>> 11) & 31L);
                out[16 + outpos] = ((in[1 + inpos] >>> 16) & 31L);
                out[17 + outpos] = ((in[1 + inpos] >>> 21) & 31L);
                out[18 + outpos] = ((in[1 + inpos] >>> 26) & 31L);
                out[19 + outpos] = ((in[1 + inpos] >>> 31) & 31L);
                out[20 + outpos] = ((in[1 + inpos] >>> 36) & 31L);
                out[21 + outpos] = ((in[1 + inpos] >>> 41) & 31L);
                out[22 + outpos] = ((in[1 + inpos] >>> 46) & 31L);
                out[23 + outpos] = ((in[1 + inpos] >>> 51) & 31L);
                out[24 + outpos] = ((in[1 + inpos] >>> 56) & 31L);
                out[25 + outpos] = (in[1 + inpos] >>> 61)
                        | ((in[2 + inpos] & 3L) << (5 - 2));
                out[26 + outpos] = ((in[2 + inpos] >>> 2) & 31L);
                out[27 + outpos] = ((in[2 + inpos] >>> 7) & 31L);
                out[28 + outpos] = ((in[2 + inpos] >>> 12) & 31L);
                out[29 + outpos] = ((in[2 + inpos] >>> 17) & 31L);
                out[30 + outpos] = ((in[2 + inpos] >>> 22) & 31L);
                out[31 + outpos] = ((in[2 + inpos] >>> 27) & 31L);
                out[32 + outpos] = ((in[2 + inpos] >>> 32) & 31L);
                out[33 + outpos] = ((in[2 + inpos] >>> 37) & 31L);
                out[34 + outpos] = ((in[2 + inpos] >>> 42) & 31L);
                out[35 + outpos] = ((in[2 + inpos] >>> 47) & 31L);
                out[36 + outpos] = ((in[2 + inpos] >>> 52) & 31L);
                out[37 + outpos] = ((in[2 + inpos] >>> 57) & 31L);
                out[38 + outpos] = (in[2 + inpos] >>> 62)
                        | ((in[3 + inpos] & 7L) << (5 - 3));
                out[39 + outpos] = ((in[3 + inpos] >>> 3) & 31L);
                out[40 + outpos] = ((in[3 + inpos] >>> 8) & 31L);
                out[41 + outpos] = ((in[3 + inpos] >>> 13) & 31L);
                out[42 + outpos] = ((in[3 + inpos] >>> 18) & 31L);
                out[43 + outpos] = ((in[3 + inpos] >>> 23) & 31L);
                out[44 + outpos] = ((in[3 + inpos] >>> 28) & 31L);
                out[45 + outpos] = ((in[3 + inpos] >>> 33) & 31L);
                out[46 + outpos] = ((in[3 + inpos] >>> 38) & 31L);
                out[47 + outpos] = ((in[3 + inpos] >>> 43) & 31L);
                out[48 + outpos] = ((in[3 + inpos] >>> 48) & 31L);
                out[49 + outpos] = ((in[3 + inpos] >>> 53) & 31L);
                out[50 + outpos] = ((in[3 + inpos] >>> 58) & 31L);
                out[51 + outpos] = (in[3 + inpos] >>> 63)
                        | ((in[4 + inpos] & 15L) << (5 - 4));
                out[52 + outpos] = ((in[4 + inpos] >>> 4) & 31L);
                out[53 + outpos] = ((in[4 + inpos] >>> 9) & 31L);
                out[54 + outpos] = ((in[4 + inpos] >>> 14) & 31L);
                out[55 + outpos] = ((in[4 + inpos] >>> 19) & 31L);
                out[56 + outpos] = ((in[4 + inpos] >>> 24) & 31L);
                out[57 + outpos] = ((in[4 + inpos] >>> 29) & 31L);
                out[58 + outpos] = ((in[4 + inpos] >>> 34) & 31L);
                out[59 + outpos] = ((in[4 + inpos] >>> 39) & 31L);
                out[60 + outpos] = ((in[4 + inpos] >>> 44) & 31L);
                out[61 + outpos] = ((in[4 + inpos] >>> 49) & 31L);
                out[62 + outpos] = ((in[4 + inpos] >>> 54) & 31L);
                out[63 + outpos] = (in[4 + inpos] >>> 59);
        }

        protected static void fastunpack6(final long[] in, int inpos,
                final long[] out, int outpos) {
                out[outpos] = (in[inpos] & 63L);
                out[1 + outpos] = ((in[inpos] >>> 6) & 63L);
                out[2 + outpos] = ((in[inpos] >>> 12) & 63L);
                out[3 + outpos] = ((in[inpos] >>> 18) & 63L);
                out[4 + outpos] = ((in[inpos] >>> 24) & 63L);
                out[5 + outpos] = ((in[inpos] >>> 30) & 63L);
                out[6 + outpos] = ((in[inpos] >>> 36) & 63L);
                out[7 + outpos] = ((in[inpos] >>> 42) & 63L);
                out[8 + outpos] = ((in[inpos] >>> 48) & 63L);
                out[9 + outpos] = ((in[inpos] >>> 54) & 63L);
                out[10 + outpos] = (in[inpos] >>> 60)
                        | ((in[1 + inpos] & 3L) << (6 - 2));
                out[11 + outpos] = ((in[1 + inpos] >>> 2) & 63L);
                out[12 + outpos] = ((in[1 + inpos] >>> 8) & 63L);
                out[13 + outpos] = ((in[1 + inpos] >>> 14) & 63L);
                out[14 + outpos] = ((in[1 + inpos] >>> 20) & 63L);
                out[15 + outpos] = ((in[1 + inpos] >>> 26) & 63L);
                out[16 + outpos] = ((in[1 + inpos] >>> 32) & 63L);
                out[17 + outpos] = ((in[1 + inpos] >>> 38) & 63L);
                out[18 + outpos] = ((in[1 + inpos] >>> 44) & 63L);
                out[19 + outpos] = ((in[1 + inpos] >>> 50) & 63L);
                out[20 + outpos] = ((in[1 + inpos] >>> 56) & 63L);
                out[21 + outpos] = (in[1 + inpos] >>> 62)
                        | ((in[2 + inpos] & 15L) << (6 - 4));
                out[22 + outpos] = ((in[2 + inpos] >>> 4) & 63L);
                out[23 + outpos] = ((in[2 + inpos] >>> 10) & 63L);
                out[24 + outpos] = ((in[2 + inpos] >>> 16) & 63L);
                out[25 + outpos] = ((in[2 + inpos] >>> 22) & 63L);
                out[26 + outpos] = ((in[2 + inpos] >>> 28) & 63L);
                out[27 + outpos] = ((in[2 + inpos] >>> 34) & 63L);
                out[28 + outpos] = ((in[2 + inpos] >>> 40) & 63L);
                out[29 + outpos] = ((in[2 + inpos] >>> 46) & 63L);
                out[30 + outpos] = ((in[2 + inpos] >>> 52) & 63L);
                out[31 + outpos] = (in[2 + inpos] >>> 58);
                out[32 + outpos] = (in[3 + inpos] & 63L);
                out[33 + outpos] = ((in[3 + inpos] >>> 6) & 63L);
                out[34 + outpos] = ((in[3 + inpos] >>> 12) & 63L);
                out[35 + outpos] = ((in[3 + inpos] >>> 18) & 63L);
                out[36 + outpos] = ((in[3 + inpos] >>> 24) & 63L);
                out[37 + outpos] = ((in[3 + inpos] >>> 30) & 63L);
                out[38 + outpos] = ((in[3 + inpos] >>> 36) & 63L);
                out[39 + outpos] = ((in[3 + inpos] >>> 42) & 63L);
                out[40 + outpos] = ((in[3 + inpos] >>> 48) & 63L);
                out[41 + outpos] = ((in[3 + inpos] >>> 54) & 63L);
                out[42 + outpos] = (in[3 + inpos] >>> 60)
                        | ((in[4 + inpos] & 3L) << (6 - 2));
                out[43 + outpos] = ((in[4 + inpos] >>> 2) & 63L);
                out[44 + outpos] = ((in[4 + inpos] >>> 8) & 63L);
                out[45 + outpos] = ((in[4 + inpos] >>> 14) & 63L);
                out[46 + outpos] = ((in[4 + inpos] >>> 20) & 63L);
                out[47 + outpos] = ((in[4 + inpos] >>> 26) & 63L);
                out[48 + outpos] = ((in[4 + inpos] >>> 32) & 63L);
                out[49 + outpos] = ((in[4 + inpos] >>> 38) & 63L);
                out[50 + outpos] = ((in[4 + inpos] >>> 44) & 63L);
                out[51 + outpos] = ((in[4 + inpos] >>> 50) & 63L);
                out[52 + outpos] = ((in[4 + inpos] >>> 56) & 63L);
                out[53 + outpos] = (in[4 + inpos] >>> 62)
                        | ((in[5 + inpos] & 15L) << (6 - 4));
                out[54 + outpos] = ((in[5 + inpos] >>> 4) & 63L);
                out[55 + outpos] = ((in[5 + inpos] >>> 10) & 63L);
                out[56 + outpos] = ((in[5 + inpos] >>> 16) & 63L);
                out[57 + outpos] = ((in[5 + inpos] >>> 22) & 63L);
                out[58 + outpos] = ((in[5 + inpos] >>> 28) & 63L);
                out[59 + outpos] = ((in[5 + inpos] >>> 34) & 63L);
                out[60 + outpos] = ((in[5 + inpos] >>> 40) & 63L);
                out[61 + outpos] = ((in[5 + inpos] >>> 46) & 63L);
                out[62 + outpos] = ((in[5 + inpos] >>> 52) & 63L);
                out[63 + outpos] = (in[5 + inpos] >>> 58);
        }

        protected static void fastunpack7(final long[] in, int inpos,
                final long[] out, int outpos) {
                out[outpos] = (in[inpos] & 127L);
                out[1 + outpos] = ((in[inpos] >>> 7) & 127L);
                out[2 + outpos] = ((in[inpos] >>> 14) & 127L);
                out[3 + outpos] = ((in[inpos] >>> 21) & 127L);
                out[4 + outpos] = ((in[inpos] >>> 28) & 127L);
                out[5 + outpos] = ((in[inpos] >>> 35) & 127L);
                out[6 + outpos] = ((in[inpos] >>> 42) & 127L);
                out[7 + outpos] = ((in[inpos] >>> 49) & 127L);
                out[8 + outpos] = ((in[inpos] >>> 56) & 127L);
                out[9 + outpos] = (in[inpos] >>> 63)
                        | ((in[1 + inpos] & 63L) << (7 - 6));
                out[10 + outpos] = ((in[1 + inpos] >>> 6) & 127L);
                out[11 + outpos] = ((in[1 + inpos] >>> 13) & 127L);
                out[12 + outpos] = ((in[1 + inpos] >>> 20) & 127L);
                out[13 + outpos] = ((in[1 + inpos] >>> 27) & 127L);
                out[14 + outpos] = ((in[1 + inpos] >>> 34) & 127L);
                out[15 + outpos] = ((in[1 + inpos] >>> 41) & 127L);
                out[16 + outpos] = ((in[1 + inpos] >>> 48) & 127L);
                out[17 + outpos] = ((in[1 + inpos] >>> 55) & 127L);
                out[18 + outpos] = (in[1 + inpos] >>> 62)
                        | ((in[2 + inpos] & 31L) << (7 - 5));
                out[19 + outpos] = ((in[2 + inpos] >>> 5) & 127L);
                out[20 + outpos] = ((in[2 + inpos] >>> 12) & 127L);
                out[21 + outpos] = ((in[2 + inpos] >>> 19) & 127L);
                out[22 + outpos] = ((in[2 + inpos] >>> 26) & 127L);
                out[23 + outpos] = ((in[2 + inpos] >>> 33) & 127L);
                out[24 + outpos] = ((in[2 + inpos] >>> 40) & 127L);
                out[25 + outpos] = ((in[2 + inpos] >>> 47) & 127L);
                out[26 + outpos] = ((in[2 + inpos] >>> 54) & 127L);
                out[27 + outpos] = (in[2 + inpos] >>> 61)
                        | ((in[3 + inpos] & 15L) << (7 - 4));
                out[28 + outpos] = ((in[3 + inpos] >>> 4) & 127L);
                out[29 + outpos] = ((in[3 + inpos] >>> 11) & 127L);
                out[30 + outpos] = ((in[3 + inpos] >>> 18) & 127L);
                out[31 + outpos] = ((in[3 + inpos] >>> 25) & 127L);
                out[32 + outpos] = ((in[3 + inpos] >>> 32) & 127L);
                out[33 + outpos] = ((in[3 + inpos] >>> 39) & 127L);
                out[34 + outpos] = ((in[3 + inpos] >>> 46) & 127L);
                out[35 + outpos] = ((in[3 + inpos] >>> 53) & 127L);
                out[36 + outpos] = (in[3 + inpos] >>> 60)
                        | ((in[4 + inpos] & 7L) << (7 - 3));
                out[37 + outpos] = ((in[4 + inpos] >>> 3) & 127L);
                out[38 + outpos] = ((in[4 + inpos] >>> 10) & 127L);
                out[39 + outpos] = ((in[4 + inpos] >>> 17) & 127L);
                out[40 + outpos] = ((in[4 + inpos] >>> 24) & 127L);
                out[41 + outpos] = ((in[4 + inpos] >>> 31) & 127L);
                out[42 + outpos] = ((in[4 + inpos] >>> 38) & 127L);
                out[43 + outpos] = ((in[4 + inpos] >>> 45) & 127L);
                out[44 + outpos] = ((in[4 + inpos] >>> 52) & 127L);
                out[45 + outpos] = (in[4 + inpos] >>> 59)
                        | ((in[5 + inpos] & 3L) << (7 - 2));
                out[46 + outpos] = ((in[5 + inpos] >>> 2) & 127L);
                out[47 + outpos] = ((in[5 + inpos] >>> 9) & 127L);
                out[48 + outpos] = ((in[5 + inpos] >>> 16) & 127L);
                out[49 + outpos] = ((in[5 + inpos] >>> 23) & 127L);
                out[50 + outpos] = ((in[5 + inpos] >>> 30) & 127L);
                out[51 + outpos] = ((in[5 + inpos] >>> 37) & 127L);
                out[52 + outpos] = ((in[5 + inpos] >>> 44) & 127L);
                out[53 + outpos] = ((in[5 + inpos] >>> 51) & 127L);
                out[54 + outpos] = (in[5 + inpos] >>> 58)
                        | ((in[6 + inpos] & 1L) << (7 - 1));
                out[55 + outpos] = ((in[6 + inpos] >>> 1) & 127L);
                out[56 + outpos] = ((in[6 + inpos] >>> 8) & 127L);
                out[57 + outpos] = ((in[6 + inpos] >>> 15) & 127L);
                out[58 + outpos] = ((in[6 + inpos] >>> 22) & 127L);
                out[59 + outpos] = ((in[6 + inpos] >>> 29) & 127L);
                out[60 + outpos] = ((in[6 + inpos] >>> 36) & 127L);
                out[61 + outpos] = ((in[6 + inpos] >>> 43) & 127L);
                out[62 + outpos] = ((in[6 + inpos] >>> 50) & 127L);
                out[63 + outpos] = (in[6 + inpos] >>> 57);
        }

        protected static void fastunpack8(final long[] in, int inpos,
                final long[] out, int outpos) {
                out[outpos] = (in[inpos] & 255L);
                out[1 + outpos] = ((in[inpos] >>> 8) & 255L);
                out[2 + outpos] = ((in[inpos] >>> 16) & 255L);
                out[3 + outpos] = ((in[inpos] >>> 24) & 255L);
                out[4 + outpos] = ((in[inpos] >>> 32) & 255L);
                out[5 + outpos] = ((in[inpos] >>> 40) & 255L);
                out[6 + outpos] = ((in[inpos] >>> 48) & 255L);
                out[7 + outpos] = (in[inpos] >>> 56);
                out[8 + outpos] = (in[1 + inpos] & 255L);
                out[9 + outpos] = ((in[1 + inpos] >>> 8) & 255L);
                out[10 + outpos] = ((in[1 + inpos] >>> 16) & 255L);
                out[11 + outpos] = ((in[1 + inpos] >>> 24) & 255L);
                out[12 + outpos] = ((in[1 + inpos] >>> 32) & 255L);
                out[13 + outpos] = ((in[1 + inpos] >>> 40) & 255L);
                out[14 + outpos] = ((in[1 + inpos] >>> 48) & 255L);
                out[15 + outpos] = (in[1 + inpos] >>> 56);
                out[16 + outpos] = (in[2 + inpos] & 255L);
                out[17 + outpos] = ((in[2 + inpos] >>> 8) & 255L);
                out[18 + outpos] = ((in[2 + inpos] >>> 16) & 255L);
                out[19 + outpos] = ((in[2 + inpos] >>> 24) & 255L);
                out[20 + outpos] = ((in[2 + inpos] >>> 32) & 255L);
                out[21 + outpos] = ((in[2 + inpos] >>> 40) & 255L);
                out[22 + outpos] = ((in[2 + inpos] >>> 48) & 255L);
                out[23 + outpos] = (in[2 + inpos] >>> 56);
                out[24 + outpos] = (in[3 + inpos] & 255L);
                out[25 + outpos] = ((in[3 + inpos] >>> 8) & 255L);
                out[26 + outpos] = ((in[3 + inpos] >>> 16) & 255L);
                out[27 + outpos] = ((in[3 + inpos] >>> 24) & 255L);
                out[28 + outpos] = ((in[3 + inpos] >>> 32) & 255L);
                out[29 + outpos] = ((in[3 + inpos] >>> 40) & 255L);
                out[30 + outpos] = ((in[3 + inpos] >>> 48) & 255L);
                out[31 + outpos] = (in[3 + inpos] >>> 56);
                out[32 + outpos] = (in[4 + inpos] & 255L);
                out[33 + outpos] = ((in[4 + inpos] >>> 8) & 255L);
                out[34 + outpos] = ((in[4 + inpos] >>> 16) & 255L);
                out[35 + outpos] = ((in[4 + inpos] >>> 24) & 255L);
                out[36 + outpos] = ((in[4 + inpos] >>> 32) & 255L);
                out[37 + outpos] = ((in[4 + inpos] >>> 40) & 255L);
                out[38 + outpos] = ((in[4 + inpos] >>> 48) & 255L);
                out[39 + outpos] = (in[4 + inpos] >>> 56);
                out[40 + outpos] = (in[5 + inpos] & 255L);
                out[41 + outpos] = ((in[5 + inpos] >>> 8) & 255L);
                out[42 + outpos] = ((in[5 + inpos] >>> 16) & 255L);
                out[43 + outpos] = ((in[5 + inpos] >>> 24) & 255L);
                out[44 + outpos] = ((in[5 + inpos] >>> 32) & 255L);
                out[45 + outpos] = ((in[5 + inpos] >>> 40) & 255L);
                out[46 + outpos] = ((in[5 + inpos] >>> 48) & 255L);
                out[47 + outpos] = (in[5 + inpos] >>> 56);
                out[48 + outpos] = (in[6 + inpos] & 255L);
                out[49 + outpos] = ((in[6 + inpos] >>> 8) & 255L);
                out[50 + outpos] = ((in[6 + inpos] >>> 16) & 255L);
                out[51 + outpos] = ((in[6 + inpos] >>> 24) & 255L);
                out[52 + outpos] = ((in[6 + inpos] >>> 32) & 255L);
                out[53 + outpos] = ((in[6 + inpos] >>> 40) & 255L);
                out[54 + outpos] = ((in[6 + inpos] >>> 48) & 255L);
                out[55 + outpos] = (in[6 + inpos] >>> 56);
                out[56 + outpos] = (in[7 + inpos] & 255L);
                out[57 + outpos] = ((in[7 + inpos] >>> 8) & 255L);
                out[58 + outpos] = ((in[7 + inpos] >>> 16) & 255L);
                out[59 + outpos] = ((in[7 + inpos] >>> 24) & 255L);
                out[60 + outpos] = ((in[7 + inpos] >>> 32) & 255L);
                out[61 + outpos] = ((in[7 + inpos] >>> 40) & 255L);
                out[62 + outpos] = ((in[7 + inpos] >>> 48) & 255L);
                out[63 + outpos] = (in[7 + inpos] >>> 56);
        }

        protected static void fastunpack9(final long[] in, int inpos,
                final long[] out, int outpos) {
                out[outpos] = (in[inpos] & 511L);
                out[1 + outpos] = ((in[inpos] >>> 9) & 511L);
                out[2 + outpos] = ((in[inpos] >>> 18) & 511L);
                out[3 + outpos] = ((in[inpos] >>> 27) & 511L);
                out[4 + outpos] = ((in[inpos] >>> 36) & 511L);
                out[5 + outpos] = ((in[inpos] >>> 45) & 511L);
                out[6 + outpos] = ((in[inpos] >>> 54) & 511L);
                out[7 + outpos] = (in[inpos] >>> 63)
                        | ((in[1 + inpos] & 255L) << (9 - 8));
                out[8 + outpos] = ((in[1 + inpos] >>> 8) & 511L);
                out[9 + outpos] = ((in[1 + inpos] >>> 17) & 511L);
                out[10 + outpos] = ((in[1 + inpos] >>> 26) & 511L);
                out[11 + outpos] = ((in[1 + inpos] >>> 35) & 511L);
                out[12 + outpos] = ((in[1 + inpos] >>> 44) & 511L);
                out[13 + outpos] = ((in[1 + inpos] >>> 53) & 511L);
                out[14 + outpos] = (in[1 + inpos] >>> 62)
                        | ((in[2 + inpos] & 127L) << (9 - 7));
                out[15 + outpos] = ((in[2 + inpos] >>> 7) & 511L);
                out[16 + outpos] = ((in[2 + inpos] >>> 16) & 511L);
                out[17 + outpos] = ((in[2 + inpos] >>> 25) & 511L);
                out[18 + outpos] = ((in[2 + inpos] >>> 34) & 511L);
                out[19 + outpos] = ((in[2 + inpos] >>> 43) & 511L);
                out[20 + outpos] = ((in[2 + inpos] >>> 52) & 511L);
                out[21 + outpos] = (in[2 + inpos] >>> 61)
                        | ((in[3 + inpos] & 63L) << (9 - 6));
                out[22 + outpos] = ((in[3 + inpos] >>> 6) & 511L);
                out[23 + outpos] = ((in[3 + inpos] >>> 15) & 511L);
                out[24 + outpos] = ((in[3 + inpos] >>> 24) & 511L);
                out[25 + outpos] = ((in[3 + inpos] >>> 33) & 511L);
                out[26 + outpos] = ((in[3 + inpos] >>> 42) & 511L);
                out[27 + outpos] = ((in[3 + inpos] >>> 51) & 511L);
                out[28 + outpos] = (in[3 + inpos] >>> 60)
                        | ((in[4 + inpos] & 31L) << (9 - 5));
                out[29 + outpos] = ((in[4 + inpos] >>> 5) & 511L);
                out[30 + outpos] = ((in[4 + inpos] >>> 14) & 511L);
                out[31 + outpos] = ((in[4 + inpos] >>> 23) & 511L);
                out[32 + outpos] = ((in[4 + inpos] >>> 32) & 511L);
                out[33 + outpos] = ((in[4 + inpos] >>> 41) & 511L);
                out[34 + outpos] = ((in[4 + inpos] >>> 50) & 511L);
                out[35 + outpos] = (in[4 + inpos] >>> 59)
                        | ((in[5 + inpos] & 15L) << (9 - 4));
                out[36 + outpos] = ((in[5 + inpos] >>> 4) & 511L);
                out[37 + outpos] = ((in[5 + inpos] >>> 13) & 511L);
                out[38 + outpos] = ((in[5 + inpos] >>> 22) & 511L);
                out[39 + outpos] = ((in[5 + inpos] >>> 31) & 511L);
                out[40 + outpos] = ((in[5 + inpos] >>> 40) & 511L);
                out[41 + outpos] = ((in[5 + inpos] >>> 49) & 511L);
                out[42 + outpos] = (in[5 + inpos] >>> 58)
                        | ((in[6 + inpos] & 7L) << (9 - 3));
                out[43 + outpos] = ((in[6 + inpos] >>> 3) & 511L);
                out[44 + outpos] = ((in[6 + inpos] >>> 12) & 511L);
                out[45 + outpos] = ((in[6 + inpos] >>> 21) & 511L);
                out[46 + outpos] = ((in[6 + inpos] >>> 30) & 511L);
                out[47 + outpos] = ((in[6 + inpos] >>> 39) & 511L);
                out[48 + outpos] = ((in[6 + inpos] >>> 48) & 511L);
                out[49 + outpos] = (in[6 + inpos] >>> 57)
                        | ((in[7 + inpos] & 3L) << (9 - 2));
                out[50 + outpos] = ((in[7 + inpos] >>> 2) & 511L);
                out[51 + outpos] = ((in[7 + inpos] >>> 11) & 511L);
                out[52 + outpos] = ((in[7 + inpos] >>> 20) & 511L);
                out[53 + outpos] = ((in[7 + inpos] >>> 29) & 511L);
                out[54 + outpos] = ((in[7 + inpos] >>> 38) & 511L);
                out[55 + outpos] = ((in[7 + inpos] >>> 47) & 511L);
                out[56 + outpos] = (in[7 + inpos] >>> 56)
                        | ((in[8 + inpos] & 1L) << (9 - 1));
                out[57 + outpos] = ((in[8 + inpos] >>> 1) & 511L);
                out[58 + outpos] = ((in[8 + inpos] >>> 10) & 511L);
                out[59 + outpos] = ((in[8 + inpos] >>> 19) & 511L);
                out[60 + outpos] = ((in[8 + inpos] >>> 28) & 511L);
                out[61 + outpos] = ((in[8 + inpos] >>> 37) & 511L);
                out[62 + outpos] = ((in[8 + inpos] >>> 46) & 511L);
                out[63 + outpos] = (in[8 + inpos] >>> 55);
        }

        protected static void fastunpack10(final long[] in, int inpos,
                final long[] out, int outpos) {
                out[outpos] = (in[inpos] & 1023L);
                out[1 + outpos] = ((in[inpos] >>> 10) & 1023L);
                out[2 + outpos] = ((in[inpos] >>> 20) & 1023L);
                out[3 + outpos] = ((in[inpos] >>> 30) & 1023L);
                out[4 + outpos] = ((in[inpos] >>> 40) & 1023L);
                out[5 + outpos] = ((in[inpos] >>> 50) & 1023L);
                out[6 + outpos] = (in[inpos] >>> 60)
                        | ((in[1 + inpos] & 63L) << (10 - 6));
                out[7 + outpos] = ((in[1 + inpos] >>> 6) & 1023L);
                out[8 + outpos] = ((in[1 + inpos] >>> 16) & 1023L);
                out[9 + outpos] = ((in[1 + inpos] >>> 26) & 1023L);
                out[10 + outpos] = ((in[1 + inpos] >>> 36) & 1023L);
                out[11 + outpos] = ((in[1 + inpos] >>> 46) & 1023L);
                out[12 + outpos] = (in[1 + inpos] >>> 56)
                        | ((in[2 + inpos] & 3L) << (10 - 2));
                out[13 + outpos] = ((in[2 + inpos] >>> 2) & 1023L);
                out[14 + outpos] = ((in[2 + inpos] >>> 12) & 1023L);
                out[15 + outpos] = ((in[2 + inpos] >>> 22) & 1023L);
                out[16 + outpos] = ((in[2 + inpos] >>> 32) & 1023L);
                out[17 + outpos] = ((in[2 + inpos] >>> 42) & 1023L);
                out[18 + outpos] = ((in[2 + inpos] >>> 52) & 1023L);
                out[19 + outpos] = (in[2 + inpos] >>> 62)
                        | ((in[3 + inpos] & 255L) << (10 - 8));
                out[20 + outpos] = ((in[3 + inpos] >>> 8) & 1023L);
                out[21 + outpos] = ((in[3 + inpos] >>> 18) & 1023L);
                out[22 + outpos] = ((in[3 + inpos] >>> 28) & 1023L);
                out[23 + outpos] = ((in[3 + inpos] >>> 38) & 1023L);
                out[24 + outpos] = ((in[3 + inpos] >>> 48) & 1023L);
                out[25 + outpos] = (in[3 + inpos] >>> 58)
                        | ((in[4 + inpos] & 15L) << (10 - 4));
                out[26 + outpos] = ((in[4 + inpos] >>> 4) & 1023L);
                out[27 + outpos] = ((in[4 + inpos] >>> 14) & 1023L);
                out[28 + outpos] = ((in[4 + inpos] >>> 24) & 1023L);
                out[29 + outpos] = ((in[4 + inpos] >>> 34) & 1023L);
                out[30 + outpos] = ((in[4 + inpos] >>> 44) & 1023L);
                out[31 + outpos] = (in[4 + inpos] >>> 54);
                out[32 + outpos] = (in[5 + inpos] & 1023L);
                out[33 + outpos] = ((in[5 + inpos] >>> 10) & 1023L);
                out[34 + outpos] = ((in[5 + inpos] >>> 20) & 1023L);
                out[35 + outpos] = ((in[5 + inpos] >>> 30) & 1023L);
                out[36 + outpos] = ((in[5 + inpos] >>> 40) & 1023L);
                out[37 + outpos] = ((in[5 + inpos] >>> 50) & 1023L);
                out[38 + outpos] = (in[5 + inpos] >>> 60)
                        | ((in[6 + inpos] & 63L) << (10 - 6));
                out[39 + outpos] = ((in[6 + inpos] >>> 6) & 1023L);
                out[40 + outpos] = ((in[6 + inpos] >>> 16) & 1023L);
                out[41 + outpos] = ((in[6 + inpos] >>> 26) & 1023L);
                out[42 + outpos] = ((in[6 + inpos] >>> 36) & 1023L);
                out[43 + outpos] = ((in[6 + inpos] >>> 46) & 1023L);
                out[44 + outpos] = (in[6 + inpos] >>> 56)
                        | ((in[7 + inpos] & 3L) << (10 - 2));
                out[45 + outpos] = ((in[7 + inpos] >>> 2) & 1023L);
                out[46 + outpos] = ((in[7 + inpos] >>> 12) & 1023L);
                out[47 + outpos] = ((in[7 + inpos] >>> 22) & 1023L);
                out[48 + outpos] = ((in[7 + inpos] >>> 32) & 1023L);
                out[49 + outpos] = ((in[7 + inpos] >>> 42) & 1023L);
                out[50 + outpos] = ((in[7 + inpos] >>> 52) & 1023L);
                out[51 + outpos] = (in[7 + inpos] >>> 62)
                        | ((in[8 + inpos] & 255L) << (10 - 8));
                out[52 + outpos] = ((in[8 + inpos] >>> 8) & 1023L);
                out[53 + outpos] = ((in[8 + inpos] >>> 18) & 1023L);
                out[54 + outpos] = ((in[8 + inpos] >>> 28) & 1023L);
                out[55 + outpos] = ((in[8 + inpos] >>> 38) & 1023L);
                out[56 + outpos] = ((in[8 + inpos] >>> 48) & 1023L);
                out[57 + outpos] = (in[8 + inpos] >>> 58)
                        | ((in[9 + inpos] & 15L) << (10 - 4));
                out[58 + outpos] = ((in[9 + inpos] >>> 4) & 1023L);
                out[59 + outpos] = ((in[9 + inpos] >>> 14) & 1023L);
                out[60 + outpos] = ((in[9 + inpos] >>> 24) & 1023L);
                out[61 + outpos] = ((in[9 + inpos] >>> 34) & 1023L);
                out[62 + outpos] = ((in[9 + inpos] >>> 44) & 1023L);
                out[63 + outpos] = (in[9 + inpos] >>> 54);
        }

        protected static void fastunpack11(final long[] in, int inpos,
                final long[] out, int outpos) {
                out[outpos] = (in[inpos] & 2047L);
                out[1 + outpos] = ((in[inpos] >>> 11) & 2047L);
                out[2 + outpos] = ((in[inpos] >>> 22) & 2047L);
                out[3 + outpos] = ((in[inpos] >>> 33) & 2047L);
                out[4 + outpos] = ((in[inpos] >>> 44) & 2047L);
                out[5 + outpos] = (in[inpos] >>> 55)
                        | ((in[1 + inpos] & 3L) << (11 - 2));
                out[6 + outpos] = ((in[1 + inpos] >>> 2) & 2047L);
                out[7 + outpos] = ((in[1 + inpos] >>> 13) & 2047L);
                out[8 + outpos] = ((in[1 + inpos] >>> 24) & 2047L);
                out[9 + outpos] = ((in[1 + inpos] >>> 35) & 2047L);
                out[10 + outpos] = ((in[1 + inpos] >>> 46) & 2047L);
                out[11 + outpos] = (in[1 + inpos] >>> 57)
                        | ((in[2 + inpos] & 15L) << (11 - 4));
                out[12 + outpos] = ((in[2 + inpos] >>> 4) & 2047L);
                out[13 + outpos] = ((in[2 + inpos] >>> 15) & 2047L);
                out[14 + outpos] = ((in[2 + inpos] >>> 26) & 2047L);
                out[15 + outpos] = ((in[2 + inpos] >>> 37) & 2047L);
                out[16 + outpos] = ((in[2 + inpos] >>> 48) & 2047L);
                out[17 + outpos] = (in[2 + inpos] >>> 59)
                        | ((in[3 + inpos] & 63L) << (11 - 6));
                out[18 + outpos] = ((in[3 + inpos] >>> 6) & 2047L);
                out[19 + outpos] = ((in[3 + inpos] >>> 17) & 2047L);
                out[20 + outpos] = ((in[3 + inpos] >>> 28) & 2047L);
                out[21 + outpos] = ((in[3 + inpos] >>> 39) & 2047L);
                out[22 + outpos] = ((in[3 + inpos] >>> 50) & 2047L);
                out[23 + outpos] = (in[3 + inpos] >>> 61)
                        | ((in[4 + inpos] & 255L) << (11 - 8));
                out[24 + outpos] = ((in[4 + inpos] >>> 8) & 2047L);
                out[25 + outpos] = ((in[4 + inpos] >>> 19) & 2047L);
                out[26 + outpos] = ((in[4 + inpos] >>> 30) & 2047L);
                out[27 + outpos] = ((in[4 + inpos] >>> 41) & 2047L);
                out[28 + outpos] = ((in[4 + inpos] >>> 52) & 2047L);
                out[29 + outpos] = (in[4 + inpos] >>> 63)
                        | ((in[5 + inpos] & 1023L) << (11 - 10));
                out[30 + outpos] = ((in[5 + inpos] >>> 10) & 2047L);
                out[31 + outpos] = ((in[5 + inpos] >>> 21) & 2047L);
                out[32 + outpos] = ((in[5 + inpos] >>> 32) & 2047L);
                out[33 + outpos] = ((in[5 + inpos] >>> 43) & 2047L);
                out[34 + outpos] = (in[5 + inpos] >>> 54)
                        | ((in[6 + inpos] & 1L) << (11 - 1));
                out[35 + outpos] = ((in[6 + inpos] >>> 1) & 2047L);
                out[36 + outpos] = ((in[6 + inpos] >>> 12) & 2047L);
                out[37 + outpos] = ((in[6 + inpos] >>> 23) & 2047L);
                out[38 + outpos] = ((in[6 + inpos] >>> 34) & 2047L);
                out[39 + outpos] = ((in[6 + inpos] >>> 45) & 2047L);
                out[40 + outpos] = (in[6 + inpos] >>> 56)
                        | ((in[7 + inpos] & 7L) << (11 - 3));
                out[41 + outpos] = ((in[7 + inpos] >>> 3) & 2047L);
                out[42 + outpos] = ((in[7 + inpos] >>> 14) & 2047L);
                out[43 + outpos] = ((in[7 + inpos] >>> 25) & 2047L);
                out[44 + outpos] = ((in[7 + inpos] >>> 36) & 2047L);
                out[45 + outpos] = ((in[7 + inpos] >>> 47) & 2047L);
                out[46 + outpos] = (in[7 + inpos] >>> 58)
                        | ((in[8 + inpos] & 31L) << (11 - 5));
                out[47 + outpos] = ((in[8 + inpos] >>> 5) & 2047L);
                out[48 + outpos] = ((in[8 + inpos] >>> 16) & 2047L);
                out[49 + outpos] = ((in[8 + inpos] >>> 27) & 2047L);
                out[50 + outpos] = ((in[8 + inpos] >>> 38) & 2047L);
                out[51 + outpos] = ((in[8 + inpos] >>> 49) & 2047L);
                out[52 + outpos] = (in[8 + inpos] >>> 60)
                        | ((in[9 + inpos] & 127L) << (11 - 7));
                out[53 + outpos] = ((in[9 + inpos] >>> 7) & 2047L);
                out[54 + outpos] = ((in[9 + inpos] >>> 18) & 2047L);
                out[55 + outpos] = ((in[9 + inpos] >>> 29) & 2047L);
                out[56 + outpos] = ((in[9 + inpos] >>> 40) & 2047L);
                out[57 + outpos] = ((in[9 + inpos] >>> 51) & 2047L);
                out[58 + outpos] = (in[9 + inpos] >>> 62)
                        | ((in[10 + inpos] & 511L) << (11 - 9));
                out[59 + outpos] = ((in[10 + inpos] >>> 9) & 2047L);
                out[60 + outpos] = ((in[10 + inpos] >>> 20) & 2047L);
                out[61 + outpos] = ((in[10 + inpos] >>> 31) & 2047L);
                out[62 + outpos] = ((in[10 + inpos] >>> 42) & 2047L);
                out[63 + outpos] = (in[10 + inpos] >>> 53);
        }

        protected static void fastunpack12(final long[] in, int inpos,
                final long[] out, int outpos) {
                out[outpos] = (in[inpos] & 4095L);
                out[1 + outpos] = ((in[inpos] >>> 12) & 4095L);
                out[2 + outpos] = ((in[inpos] >>> 24) & 4095L);
                out[3 + outpos] = ((in[inpos] >>> 36) & 4095L);
                out[4 + outpos] = ((in[inpos] >>> 48) & 4095L);
                out[5 + outpos] = (in[inpos] >>> 60)
                        | ((in[1 + inpos] & 255L) << (12 - 8));
                out[6 + outpos] = ((in[1 + inpos] >>> 8) & 4095L);
                out[7 + outpos] = ((in[1 + inpos] >>> 20) & 4095L);
                out[8 + outpos] = ((in[1 + inpos] >>> 32) & 4095L);
                out[9 + outpos] = ((in[1 + inpos] >>> 44) & 4095L);
                out[10 + outpos] = (in[1 + inpos] >>> 56)
                        | ((in[2 + inpos] & 15L) << (12 - 4));
                out[11 + outpos] = ((in[2 + inpos] >>> 4) & 4095L);
                out[12 + outpos] = ((in[2 + inpos] >>> 16) & 4095L);
                out[13 + outpos] = ((in[2 + inpos] >>> 28) & 4095L);
                out[14 + outpos] = ((in[2 + inpos] >>> 40) & 4095L);
                out[15 + outpos] = (in[2 + inpos] >>> 52);
                out[16 + outpos] = (in[3 + inpos] & 4095L);
                out[17 + outpos] = ((in[3 + inpos] >>> 12) & 4095L);
                out[18 + outpos] = ((in[3 + inpos] >>> 24) & 4095L);
                out[19 + outpos] = ((in[3 + inpos] >>> 36) & 4095L);
                out[20 + outpos] = ((in[3 + inpos] >>> 48) & 4095L);
                out[21 + outpos] = (in[3 + inpos] >>> 60)
                        | ((in[4 + inpos] & 255L) << (12 - 8));
                out[22 + outpos] = ((in[4 + inpos] >>> 8) & 4095L);
                out[23 + outpos] = ((in[4 + inpos] >>> 20) & 4095L);
                out[24 + outpos] = ((in[4 + inpos] >>> 32) & 4095L);
                out[25 + outpos] = ((in[4 + inpos] >>> 44) & 4095L);
                out[26 + outpos] = (in[4 + inpos] >>> 56)
                        | ((in[5 + inpos] & 15L) << (12 - 4));
                out[27 + outpos] = ((in[5 + inpos] >>> 4) & 4095L);
                out[28 + outpos] = ((in[5 + inpos] >>> 16) & 4095L);
                out[29 + outpos] = ((in[5 + inpos] >>> 28) & 4095L);
                out[30 + outpos] = ((in[5 + inpos] >>> 40) & 4095L);
                out[31 + outpos] = (in[5 + inpos] >>> 52);
                out[32 + outpos] = (in[6 + inpos] & 4095L);
                out[33 + outpos] = ((in[6 + inpos] >>> 12) & 4095L);
                out[34 + outpos] = ((in[6 + inpos] >>> 24) & 4095L);
                out[35 + outpos] = ((in[6 + inpos] >>> 36) & 4095L);
                out[36 + outpos] = ((in[6 + inpos] >>> 48) & 4095L);
                out[37 + outpos] = (in[6 + inpos] >>> 60)
                        | ((in[7 + inpos] & 255L) << (12 - 8));
                out[38 + outpos] = ((in[7 + inpos] >>> 8) & 4095L);
                out[39 + outpos] = ((in[7 + inpos] >>> 20) & 4095L);
                out[40 + outpos] = ((in[7 + inpos] >>> 32) & 4095L);
                out[41 + outpos] = ((in[7 + inpos] >>> 44) & 4095L);
                out[42 + outpos] = (in[7 + inpos] >>> 56)
                        | ((in[8 + inpos] & 15L) << (12 - 4));
                out[43 + outpos] = ((in[8 + inpos] >>> 4) & 4095L);
                out[44 + outpos] = ((in[8 + inpos] >>> 16) & 4095L);
                out[45 + outpos] = ((in[8 + inpos] >>> 28) & 4095L);
                out[46 + outpos] = ((in[8 + inpos] >>> 40) & 4095L);
                out[47 + outpos] = (in[8 + inpos] >>> 52);
                out[48 + outpos] = (in[9 + inpos] & 4095L);
                out[49 + outpos] = ((in[9 + inpos] >>> 12) & 4095L);
                out[50 + outpos] = ((in[9 + inpos] >>> 24) & 4095L);
                out[51 + outpos] = ((in[9 + inpos] >>> 36) & 4095L);
                out[52 + outpos] = ((in[9 + inpos] >>> 48) & 4095L);
                out[53 + outpos] = (in[9 + inpos] >>> 60)
                        | ((in[10 + inpos] & 255L) << (12 - 8));
                out[54 + outpos] = ((in[10 + inpos] >>> 8) & 4095L);
                out[55 + outpos] = ((in[10 + inpos] >>> 20) & 4095L);
                out[56 + outpos] = ((in[10 + inpos] >>> 32) & 4095L);
                out[57 + outpos] = ((in[10 + inpos] >>> 44) & 4095L);
                out[58 + outpos] = (in[10 + inpos] >>> 56)
                        | ((in[11 + inpos] & 15L) << (12 - 4));
                out[59 + outpos] = ((in[11 + inpos] >>> 4) & 4095L);
                out[60 + outpos] = ((in[11 + inpos] >>> 16) & 4095L);
                out[61 + outpos] = ((in[11 + inpos] >>> 28) & 4095L);
                out[62 + outpos] = ((in[11 + inpos] >>> 40) & 4095L);
                out[63 + outpos] = (in[11 + inpos] >>> 52);
        }

        protected static void fastunpack13(final long[] in, int inpos,
                final long[] out, int outpos) {
                out[outpos] = (in[inpos] & 8191L);
                out[1 + outpos] = ((in[inpos] >>> 13) & 8191L);
                out[2 + outpos] = ((in[inpos] >>> 26) & 8191L);
                out[3 + outpos] = ((in[inpos] >>> 39) & 8191L);
                out[4 + outpos] = (in[inpos] >>> 52)
                        | ((in[1 + inpos] & 1L) << (13 - 1));
                out[5 + outpos] = ((in[1 + inpos] >>> 1) & 8191L);
                out[6 + outpos] = ((in[1 + inpos] >>> 14) & 8191L);
                out[7 + outpos] = ((in[1 + inpos] >>> 27) & 8191L);
                out[8 + outpos] = ((in[1 + inpos] >>> 40) & 8191L);
                out[9 + outpos] = (in[1 + inpos] >>> 53)
                        | ((in[2 + inpos] & 3L) << (13 - 2));
                out[10 + outpos] = ((in[2 + inpos] >>> 2) & 8191L);
                out[11 + outpos] = ((in[2 + inpos] >>> 15) & 8191L);
                out[12 + outpos] = ((in[2 + inpos] >>> 28) & 8191L);
                out[13 + outpos] = ((in[2 + inpos] >>> 41) & 8191L);
                out[14 + outpos] = (in[2 + inpos] >>> 54)
                        | ((in[3 + inpos] & 7L) << (13 - 3));
                out[15 + outpos] = ((in[3 + inpos] >>> 3) & 8191L);
                out[16 + outpos] = ((in[3 + inpos] >>> 16) & 8191L);
                out[17 + outpos] = ((in[3 + inpos] >>> 29) & 8191L);
                out[18 + outpos] = ((in[3 + inpos] >>> 42) & 8191L);
                out[19 + outpos] = (in[3 + inpos] >>> 55)
                        | ((in[4 + inpos] & 15L) << (13 - 4));
                out[20 + outpos] = ((in[4 + inpos] >>> 4) & 8191L);
                out[21 + outpos] = ((in[4 + inpos] >>> 17) & 8191L);
                out[22 + outpos] = ((in[4 + inpos] >>> 30) & 8191L);
                out[23 + outpos] = ((in[4 + inpos] >>> 43) & 8191L);
                out[24 + outpos] = (in[4 + inpos] >>> 56)
                        | ((in[5 + inpos] & 31L) << (13 - 5));
                out[25 + outpos] = ((in[5 + inpos] >>> 5) & 8191L);
                out[26 + outpos] = ((in[5 + inpos] >>> 18) & 8191L);
                out[27 + outpos] = ((in[5 + inpos] >>> 31) & 8191L);
                out[28 + outpos] = ((in[5 + inpos] >>> 44) & 8191L);
                out[29 + outpos] = (in[5 + inpos] >>> 57)
                        | ((in[6 + inpos] & 63L) << (13 - 6));
                out[30 + outpos] = ((in[6 + inpos] >>> 6) & 8191L);
                out[31 + outpos] = ((in[6 + inpos] >>> 19) & 8191L);
                out[32 + outpos] = ((in[6 + inpos] >>> 32) & 8191L);
                out[33 + outpos] = ((in[6 + inpos] >>> 45) & 8191L);
                out[34 + outpos] = (in[6 + inpos] >>> 58)
                        | ((in[7 + inpos] & 127L) << (13 - 7));
                out[35 + outpos] = ((in[7 + inpos] >>> 7) & 8191L);
                out[36 + outpos] = ((in[7 + inpos] >>> 20) & 8191L);
                out[37 + outpos] = ((in[7 + inpos] >>> 33) & 8191L);
                out[38 + outpos] = ((in[7 + inpos] >>> 46) & 8191L);
                out[39 + outpos] = (in[7 + inpos] >>> 59)
                        | ((in[8 + inpos] & 255L) << (13 - 8));
                out[40 + outpos] = ((in[8 + inpos] >>> 8) & 8191L);
                out[41 + outpos] = ((in[8 + inpos] >>> 21) & 8191L);
                out[42 + outpos] = ((in[8 + inpos] >>> 34) & 8191L);
                out[43 + outpos] = ((in[8 + inpos] >>> 47) & 8191L);
                out[44 + outpos] = (in[8 + inpos] >>> 60)
                        | ((in[9 + inpos] & 511L) << (13 - 9));
                out[45 + outpos] = ((in[9 + inpos] >>> 9) & 8191L);
                out[46 + outpos] = ((in[9 + inpos] >>> 22) & 8191L);
                out[47 + outpos] = ((in[9 + inpos] >>> 35) & 8191L);
                out[48 + outpos] = ((in[9 + inpos] >>> 48) & 8191L);
                out[49 + outpos] = (in[9 + inpos] >>> 61)
                        | ((in[10 + inpos] & 1023L) << (13 - 10));
                out[50 + outpos] = ((in[10 + inpos] >>> 10) & 8191L);
                out[51 + outpos] = ((in[10 + inpos] >>> 23) & 8191L);
                out[52 + outpos] = ((in[10 + inpos] >>> 36) & 8191L);
                out[53 + outpos] = ((in[10 + inpos] >>> 49) & 8191L);
                out[54 + outpos] = (in[10 + inpos] >>> 62)
                        | ((in[11 + inpos] & 2047L) << (13 - 11));
                out[55 + outpos] = ((in[11 + inpos] >>> 11) & 8191L);
                out[56 + outpos] = ((in[11 + inpos] >>> 24) & 8191L);
                out[57 + outpos] = ((in[11 + inpos] >>> 37) & 8191L);
                out[58 + outpos] = ((in[11 + inpos] >>> 50) & 8191L);
                out[59 + outpos] = (in[11 + inpos] >>> 63)
                        | ((in[12 + inpos] & 4095L) << (13 - 12));
                out[60 + outpos] = ((in[12 + inpos] >>> 12) & 8191L);
                out[61 + outpos] = ((in[12 + inpos] >>> 25) & 8191L);
                out[62 + outpos] = ((in[12 + inpos] >>> 38) & 8191L);
                out[63 + outpos] = (in[12 + inpos] >>> 51);
        }

        protected static void fastunpack14(final long[] in, int inpos,
                final long[] out, int outpos) {
                out[outpos] = (in[inpos] & 16383L);
                out[1 + outpos] = ((in[inpos] >>> 14) & 16383L);
                out[2 + outpos] = ((in[inpos] >>> 28) & 16383L);
                out[3 + outpos] = ((in[inpos] >>> 42) & 16383L);
                out[4 + outpos] = (in[inpos] >>> 56)
                        | ((in[1 + inpos] & 63L) << (14 - 6));
                out[5 + outpos] = ((in[1 + inpos] >>> 6) & 16383L);
                out[6 + outpos] = ((in[1 + inpos] >>> 20) & 16383L);
                out[7 + outpos] = ((in[1 + inpos] >>> 34) & 16383L);
                out[8 + outpos] = ((in[1 + inpos] >>> 48) & 16383L);
                out[9 + outpos] = (in[1 + inpos] >>> 62)
                        | ((in[2 + inpos] & 4095L) << (14 - 12));
                out[10 + outpos] = ((in[2 + inpos] >>> 12) & 16383L);
                out[11 + outpos] = ((in[2 + inpos] >>> 26) & 16383L);
                out[12 + outpos] = ((in[2 + inpos] >>> 40) & 16383L);
                out[13 + outpos] = (in[2 + inpos] >>> 54)
                        | ((in[3 + inpos] & 15L) << (14 - 4));
                out[14 + outpos] = ((in[3 + inpos] >>> 4) & 16383L);
                out[15 + outpos] = ((in[3 + inpos] >>> 18) & 16383L);
                out[16 + outpos] = ((in[3 + inpos] >>> 32) & 16383L);
                out[17 + outpos] = ((in[3 + inpos] >>> 46) & 16383L);
                out[18 + outpos] = (in[3 + inpos] >>> 60)
                        | ((in[4 + inpos] & 1023L) << (14 - 10));
                out[19 + outpos] = ((in[4 + inpos] >>> 10) & 16383L);
                out[20 + outpos] = ((in[4 + inpos] >>> 24) & 16383L);
                out[21 + outpos] = ((in[4 + inpos] >>> 38) & 16383L);
                out[22 + outpos] = (in[4 + inpos] >>> 52)
                        | ((in[5 + inpos] & 3L) << (14 - 2));
                out[23 + outpos] = ((in[5 + inpos] >>> 2) & 16383L);
                out[24 + outpos] = ((in[5 + inpos] >>> 16) & 16383L);
                out[25 + outpos] = ((in[5 + inpos] >>> 30) & 16383L);
                out[26 + outpos] = ((in[5 + inpos] >>> 44) & 16383L);
                out[27 + outpos] = (in[5 + inpos] >>> 58)
                        | ((in[6 + inpos] & 255L) << (14 - 8));
                out[28 + outpos] = ((in[6 + inpos] >>> 8) & 16383L);
                out[29 + outpos] = ((in[6 + inpos] >>> 22) & 16383L);
                out[30 + outpos] = ((in[6 + inpos] >>> 36) & 16383L);
                out[31 + outpos] = (in[6 + inpos] >>> 50);
                out[32 + outpos] = (in[7 + inpos] & 16383L);
                out[33 + outpos] = ((in[7 + inpos] >>> 14) & 16383L);
                out[34 + outpos] = ((in[7 + inpos] >>> 28) & 16383L);
                out[35 + outpos] = ((in[7 + inpos] >>> 42) & 16383L);
                out[36 + outpos] = (in[7 + inpos] >>> 56)
                        | ((in[8 + inpos] & 63L) << (14 - 6));
                out[37 + outpos] = ((in[8 + inpos] >>> 6) & 16383L);
                out[38 + outpos] = ((in[8 + inpos] >>> 20) & 16383L);
                out[39 + outpos] = ((in[8 + inpos] >>> 34) & 16383L);
                out[40 + outpos] = ((in[8 + inpos] >>> 48) & 16383L);
                out[41 + outpos] = (in[8 + inpos] >>> 62)
                        | ((in[9 + inpos] & 4095L) << (14 - 12));
                out[42 + outpos] = ((in[9 + inpos] >>> 12) & 16383L);
                out[43 + outpos] = ((in[9 + inpos] >>> 26) & 16383L);
                out[44 + outpos] = ((in[9 + inpos] >>> 40) & 16383L);
                out[45 + outpos] = (in[9 + inpos] >>> 54)
                        | ((in[10 + inpos] & 15L) << (14 - 4));
                out[46 + outpos] = ((in[10 + inpos] >>> 4) & 16383L);
                out[47 + outpos] = ((in[10 + inpos] >>> 18) & 16383L);
                out[48 + outpos] = ((in[10 + inpos] >>> 32) & 16383L);
                out[49 + outpos] = ((in[10 + inpos] >>> 46) & 16383L);
                out[50 + outpos] = (in[10 + inpos] >>> 60)
                        | ((in[11 + inpos] & 1023L) << (14 - 10));
                out[51 + outpos] = ((in[11 + inpos] >>> 10) & 16383L);
                out[52 + outpos] = ((in[11 + inpos] >>> 24) & 16383L);
                out[53 + outpos] = ((in[11 + inpos] >>> 38) & 16383L);
                out[54 + outpos] = (in[11 + inpos] >>> 52)
                        | ((in[12 + inpos] & 3L) << (14 - 2));
                out[55 + outpos] = ((in[12 + inpos] >>> 2) & 16383L);
                out[56 + outpos] = ((in[12 + inpos] >>> 16) & 16383L);
                out[57 + outpos] = ((in[12 + inpos] >>> 30) & 16383L);
                out[58 + outpos] = ((in[12 + inpos] >>> 44) & 16383L);
                out[59 + outpos] = (in[12 + inpos] >>> 58)
                        | ((in[13 + inpos] & 255L) << (14 - 8));
                out[60 + outpos] = ((in[13 + inpos] >>> 8) & 16383L);
                out[61 + outpos] = ((in[13 + inpos] >>> 22) & 16383L);
                out[62 + outpos] = ((in[13 + inpos] >>> 36) & 16383L);
                out[63 + outpos] = (in[13 + inpos] >>> 50);
        }

        protected static void fastunpack15(final long[] in, int inpos,
                final long[] out, int outpos) {
                out[outpos] = (in[inpos] & 32767L);
                out[1 + outpos] = ((in[inpos] >>> 15) & 32767L);
                out[2 + outpos] = ((in[inpos] >>> 30) & 32767L);
                out[3 + outpos] = ((in[inpos] >>> 45) & 32767L);
                out[4 + outpos] = (in[inpos] >>> 60)
                        | ((in[1 + inpos] & 2047L) << (15 - 11));
                out[5 + outpos] = ((in[1 + inpos] >>> 11) & 32767L);
                out[6 + outpos] = ((in[1 + inpos] >>> 26) & 32767L);
                out[7 + outpos] = ((in[1 + inpos] >>> 41) & 32767L);
                out[8 + outpos] = (in[1 + inpos] >>> 56)
                        | ((in[2 + inpos] & 127L) << (15 - 7));
                out[9 + outpos] = ((in[2 + inpos] >>> 7) & 32767L);
                out[10 + outpos] = ((in[2 + inpos] >>> 22) & 32767L);
                out[11 + outpos] = ((in[2 + inpos] >>> 37) & 32767L);
                out[12 + outpos] = (in[2 + inpos] >>> 52)
                        | ((in[3 + inpos] & 7L) << (15 - 3));
                out[13 + outpos] = ((in[3 + inpos] >>> 3) & 32767L);
                out[14 + outpos] = ((in[3 + inpos] >>> 18) & 32767L);
                out[15 + outpos] = ((in[3 + inpos] >>> 33) & 32767L);
                out[16 + outpos] = ((in[3 + inpos] >>> 48) & 32767L);
                out[17 + outpos] = (in[3 + inpos] >>> 63)
                        | ((in[4 + inpos] & 16383L) << (15 - 14));
                out[18 + outpos] = ((in[4 + inpos] >>> 14) & 32767L);
                out[19 + outpos] = ((in[4 + inpos] >>> 29) & 32767L);
                out[20 + outpos] = ((in[4 + inpos] >>> 44) & 32767L);
                out[21 + outpos] = (in[4 + inpos] >>> 59)
                        | ((in[5 + inpos] & 1023L) << (15 - 10));
                out[22 + outpos] = ((in[5 + inpos] >>> 10) & 32767L);
                out[23 + outpos] = ((in[5 + inpos] >>> 25) & 32767L);
                out[24 + outpos] = ((in[5 + inpos] >>> 40) & 32767L);
                out[25 + outpos] = (in[5 + inpos] >>> 55)
                        | ((in[6 + inpos] & 63L) << (15 - 6));
                out[26 + outpos] = ((in[6 + inpos] >>> 6) & 32767L);
                out[27 + outpos] = ((in[6 + inpos] >>> 21) & 32767L);
                out[28 + outpos] = ((in[6 + inpos] >>> 36) & 32767L);
                out[29 + outpos] = (in[6 + inpos] >>> 51)
                        | ((in[7 + inpos] & 3L) << (15 - 2));
                out[30 + outpos] = ((in[7 + inpos] >>> 2) & 32767L);
                out[31 + outpos] = ((in[7 + inpos] >>> 17) & 32767L);
                out[32 + outpos] = ((in[7 + inpos] >>> 32) & 32767L);
                out[33 + outpos] = ((in[7 + inpos] >>> 47) & 32767L);
                out[34 + outpos] = (in[7 + inpos] >>> 62)
                        | ((in[8 + inpos] & 8191L) << (15 - 13));
                out[35 + outpos] = ((in[8 + inpos] >>> 13) & 32767L);
                out[36 + outpos] = ((in[8 + inpos] >>> 28) & 32767L);
                out[37 + outpos] = ((in[8 + inpos] >>> 43) & 32767L);
                out[38 + outpos] = (in[8 + inpos] >>> 58)
                        | ((in[9 + inpos] & 511L) << (15 - 9));
                out[39 + outpos] = ((in[9 + inpos] >>> 9) & 32767L);
                out[40 + outpos] = ((in[9 + inpos] >>> 24) & 32767L);
                out[41 + outpos] = ((in[9 + inpos] >>> 39) & 32767L);
                out[42 + outpos] = (in[9 + inpos] >>> 54)
                        | ((in[10 + inpos] & 31L) << (15 - 5));
                out[43 + outpos] = ((in[10 + inpos] >>> 5) & 32767L);
                out[44 + outpos] = ((in[10 + inpos] >>> 20) & 32767L);
                out[45 + outpos] = ((in[10 + inpos] >>> 35) & 32767L);
                out[46 + outpos] = (in[10 + inpos] >>> 50)
                        | ((in[11 + inpos] & 1L) << (15 - 1));
                out[47 + outpos] = ((in[11 + inpos] >>> 1) & 32767L);
                out[48 + outpos] = ((in[11 + inpos] >>> 16) & 32767L);
                out[49 + outpos] = ((in[11 + inpos] >>> 31) & 32767L);
                out[50 + outpos] = ((in[11 + inpos] >>> 46) & 32767L);
                out[51 + outpos] = (in[11 + inpos] >>> 61)
                        | ((in[12 + inpos] & 4095L) << (15 - 12));
                out[52 + outpos] = ((in[12 + inpos] >>> 12) & 32767L);
                out[53 + outpos] = ((in[12 + inpos] >>> 27) & 32767L);
                out[54 + outpos] = ((in[12 + inpos] >>> 42) & 32767L);
                out[55 + outpos] = (in[12 + inpos] >>> 57)
                        | ((in[13 + inpos] & 255L) << (15 - 8));
                out[56 + outpos] = ((in[13 + inpos] >>> 8) & 32767L);
                out[57 + outpos] = ((in[13 + inpos] >>> 23) & 32767L);
                out[58 + outpos] = ((in[13 + inpos] >>> 38) & 32767L);
                out[59 + outpos] = (in[13 + inpos] >>> 53)
                        | ((in[14 + inpos] & 15L) << (15 - 4));
                out[60 + outpos] = ((in[14 + inpos] >>> 4) & 32767L);
                out[61 + outpos] = ((in[14 + inpos] >>> 19) & 32767L);
                out[62 + outpos] = ((in[14 + inpos] >>> 34) & 32767L);
                out[63 + outpos] = (in[14 + inpos] >>> 49);
        }

        protected static void fastunpack16(final long[] in, int inpos,
                final long[] out, int outpos) {
                out[outpos] = (in[inpos] & 65535L);
                out[1 + outpos] = ((in[inpos] >>> 16) & 65535L);
                out[2 + outpos] = ((in[inpos] >>> 32) & 65535L);
                out[3 + outpos] = (in[inpos] >>> 48);
                out[4 + outpos] = (in[1 + inpos] & 65535L);
                out[5 + outpos] = ((in[1 + inpos] >>> 16) & 65535L);
                out[6 + outpos] = ((in[1 + inpos] >>> 32) & 65535L);
                out[7 + outpos] = (in[1 + inpos] >>> 48);
                out[8 + outpos] = (in[2 + inpos] & 65535L);
                out[9 + outpos] = ((in[2 + inpos] >>> 16) & 65535L);
                out[10 + outpos] = ((in[2 + inpos] >>> 32) & 65535L);
                out[11 + outpos] = (in[2 + inpos] >>> 48);
                out[12 + outpos] = (in[3 + inpos] & 65535L);
                out[13 + outpos] = ((in[3 + inpos] >>> 16) & 65535L);
                out[14 + outpos] = ((in[3 + inpos] >>> 32) & 65535L);
                out[15 + outpos] = (in[3 + inpos] >>> 48);
                out[16 + outpos] = (in[4 + inpos] & 65535L);
                out[17 + outpos] = ((in[4 + inpos] >>> 16) & 65535L);
                out[18 + outpos] = ((in[4 + inpos] >>> 32) & 65535L);
                out[19 + outpos] = (in[4 + inpos] >>> 48);
                out[20 + outpos] = (in[5 + inpos] & 65535L);
                out[21 + outpos] = ((in[5 + inpos] >>> 16) & 65535L);
                out[22 + outpos] = ((in[5 + inpos] >>> 32) & 65535L);
                out[23 + outpos] = (in[5 + inpos] >>> 48);
                out[24 + outpos] = (in[6 + inpos] & 65535L);
                out[25 + outpos] = ((in[6 + inpos] >>> 16) & 65535L);
                out[26 + outpos] = ((in[6 + inpos] >>> 32) & 65535L);
                out[27 + outpos] = (in[6 + inpos] >>> 48);
                out[28 + outpos] = (in[7 + inpos] & 65535L);
                out[29 + outpos] = ((in[7 + inpos] >>> 16) & 65535L);
                out[30 + outpos] = ((in[7 + inpos] >>> 32) & 65535L);
                out[31 + outpos] = (in[7 + inpos] >>> 48);
                out[32 + outpos] = (in[8 + inpos] & 65535L);
                out[33 + outpos] = ((in[8 + inpos] >>> 16) & 65535L);
                out[34 + outpos] = ((in[8 + inpos] >>> 32) & 65535L);
                out[35 + outpos] = (in[8 + inpos] >>> 48);
                out[36 + outpos] = (in[9 + inpos] & 65535L);
                out[37 + outpos] = ((in[9 + inpos] >>> 16) & 65535L);
                out[38 + outpos] = ((in[9 + inpos] >>> 32) & 65535L);
                out[39 + outpos] = (in[9 + inpos] >>> 48);
                out[40 + outpos] = (in[10 + inpos] & 65535L);
                out[41 + outpos] = ((in[10 + inpos] >>> 16) & 65535L);
                out[42 + outpos] = ((in[10 + inpos] >>> 32) & 65535L);
                out[43 + outpos] = (in[10 + inpos] >>> 48);
                out[44 + outpos] = (in[11 + inpos] & 65535L);
                out[45 + outpos] = ((in[11 + inpos] >>> 16) & 65535L);
                out[46 + outpos] = ((in[11 + inpos] >>> 32) & 65535L);
                out[47 + outpos] = (in[11 + inpos] >>> 48);
                out[48 + outpos] = (in[12 + inpos] & 65535L);
                out[49 + outpos] = ((in[12 + inpos] >>> 16) & 65535L);
                out[50 + outpos] = ((in[12 + inpos] >>> 32) & 65535L);
                out[51 + outpos] = (in[12 + inpos] >>> 48);
                out[52 + outpos] = (in[13 + inpos] & 65535L);
                out[53 + outpos] = ((in[13 + inpos] >>> 16) & 65535L);
                out[54 + outpos] = ((in[13 + inpos] >>> 32) & 65535L);
                out[55 + outpos] = (in[13 + inpos] >>> 48);
                out[56 + outpos] = (in[14 + inpos] & 65535L);
                out[57 + outpos] = ((in[14 + inpos] >>> 16) & 65535L);
                out[58 + outpos] = ((in[14 + inpos] >>> 32) & 65535L);
                out[59 + outpos] = (in[14 + inpos] >>> 48);
                out[60 + outpos] = (in[15 + inpos] & 65535L);
                out[61 + outpos] = ((in[15 + inpos] >>> 16) & 65535L);
                out[62 + outpos] = ((in[15 + inpos] >>> 32) & 65535L);
                out[63 + outpos] = (in[15 + inpos] >>> 48);
        }

        protected static void fastunpack17(final long[] in, int inpos,
                final long[] out, int outpos) {
                out[outpos] = (in[inpos] & 131071L);
                out[1 + outpos] = ((in[inpos] >>> 17) & 131071L);
                out[2 + outpos] = ((in[inpos] >>> 34) & 131071L);
                out[3 + outpos] = (in[inpos] >>> 51)
                        | ((in[1 + inpos] & 15L) << (17 - 4));
                out[4 + outpos] = ((in[1 + inpos] >>> 4) & 131071L);
                out[5 + outpos] = ((in[1 + inpos] >>> 21) & 131071L);
                out[6 + outpos] = ((in[1 + inpos] >>> 38) & 131071L);
                out[7 + outpos] = (in[1 + inpos] >>> 55)
                        | ((in[2 + inpos] & 255L) << (17 - 8));
                out[8 + outpos] = ((in[2 + inpos] >>> 8) & 131071L);
                out[9 + outpos] = ((in[2 + inpos] >>> 25) & 131071L);
                out[10 + outpos] = ((in[2 + inpos] >>> 42) & 131071L);
                out[11 + outpos] = (in[2 + inpos] >>> 59)
                        | ((in[3 + inpos] & 4095L) << (17 - 12));
                out[12 + outpos] = ((in[3 + inpos] >>> 12) & 131071L);
                out[13 + outpos] = ((in[3 + inpos] >>> 29) & 131071L);
                out[14 + outpos] = ((in[3 + inpos] >>> 46) & 131071L);
                out[15 + outpos] = (in[3 + inpos] >>> 63)
                        | ((in[4 + inpos] & 65535L) << (17 - 16));
                out[16 + outpos] = ((in[4 + inpos] >>> 16) & 131071L);
                out[17 + outpos] = ((in[4 + inpos] >>> 33) & 131071L);
                out[18 + outpos] = (in[4 + inpos] >>> 50)
                        | ((in[5 + inpos] & 7L) << (17 - 3));
                out[19 + outpos] = ((in[5 + inpos] >>> 3) & 131071L);
                out[20 + outpos] = ((in[5 + inpos] >>> 20) & 131071L);
                out[21 + outpos] = ((in[5 + inpos] >>> 37) & 131071L);
                out[22 + outpos] = (in[5 + inpos] >>> 54)
                        | ((in[6 + inpos] & 127L) << (17 - 7));
                out[23 + outpos] = ((in[6 + inpos] >>> 7) & 131071L);
                out[24 + outpos] = ((in[6 + inpos] >>> 24) & 131071L);
                out[25 + outpos] = ((in[6 + inpos] >>> 41) & 131071L);
                out[26 + outpos] = (in[6 + inpos] >>> 58)
                        | ((in[7 + inpos] & 2047L) << (17 - 11));
                out[27 + outpos] = ((in[7 + inpos] >>> 11) & 131071L);
                out[28 + outpos] = ((in[7 + inpos] >>> 28) & 131071L);
                out[29 + outpos] = ((in[7 + inpos] >>> 45) & 131071L);
                out[30 + outpos] = (in[7 + inpos] >>> 62)
                        | ((in[8 + inpos] & 32767L) << (17 - 15));
                out[31 + outpos] = ((in[8 + inpos] >>> 15) & 131071L);
                out[32 + outpos] = ((in[8 + inpos] >>> 32) & 131071L);
                out[33 + outpos] = (in[8 + inpos] >>> 49)
                        | ((in[9 + inpos] & 3L) << (17 - 2));
                out[34 + outpos] = ((in[9 + inpos] >>> 2) & 131071L);
                out[35 + outpos] = ((in[9 + inpos] >>> 19) & 131071L);
                out[36 + outpos] = ((in[9 + inpos] >>> 36) & 131071L);
                out[37 + outpos] = (in[9 + inpos] >>> 53)
                        | ((in[10 + inpos] & 63L) << (17 - 6));
                out[38 + outpos] = ((in[10 + inpos] >>> 6) & 131071L);
                out[39 + outpos] = ((in[10 + inpos] >>> 23) & 131071L);
                out[40 + outpos] = ((in[10 + inpos] >>> 40) & 131071L);
                out[41 + outpos] = (in[10 + inpos] >>> 57)
                        | ((in[11 + inpos] & 1023L) << (17 - 10));
                out[42 + outpos] = ((in[11 + inpos] >>> 10) & 131071L);
                out[43 + outpos] = ((in[11 + inpos] >>> 27) & 131071L);
                out[44 + outpos] = ((in[11 + inpos] >>> 44) & 131071L);
                out[45 + outpos] = (in[11 + inpos] >>> 61)
                        | ((in[12 + inpos] & 16383L) << (17 - 14));
                out[46 + outpos] = ((in[12 + inpos] >>> 14) & 131071L);
                out[47 + outpos] = ((in[12 + inpos] >>> 31) & 131071L);
                out[48 + outpos] = (in[12 + inpos] >>> 48)
                        | ((in[13 + inpos] & 1L) << (17 - 1));
                out[49 + outpos] = ((in[13 + inpos] >>> 1) & 131071L);
                out[50 + outpos] = ((in[13 + inpos] >>> 18) & 131071L);
                out[51 + outpos] = ((in[13 + inpos] >>> 35) & 131071L);
                out[52 + outpos] = (in[13 + inpos] >>> 52)
                        | ((in[14 + inpos] & 31L) << (17 - 5));
                out[53 + outpos] = ((in[14 + inpos] >>> 5) & 131071L);
                out[54 + outpos] = ((in[14 + inpos] >>> 22) & 131071L);
                out[55 + outpos] = ((in[14 + inpos] >>> 39) & 131071L);
                out[56 + outpos] = (in[14 + inpos] >>> 56)
                        | ((in[15 + inpos] & 511L) << (17 - 9));
                out[57 + outpos] = ((in[15 + inpos] >>> 9) & 131071L);
                out[58 + outpos] = ((in[15 + inpos] >>> 26) & 131071L);
                out[59 + outpos] = ((in[15 + inpos] >>> 43) & 131071L);
                out[60 + outpos] = (in[15 + inpos] >>> 60)
                        | ((in[16 + inpos] & 8191L) << (17 - 13));
                out[61 + outpos] = ((in[16 + inpos] >>> 13) & 131071L);
                out[62 + outpos] = ((in[16 + inpos] >>> 30) & 131071L);
                out[63 + outpos] = (in[16 + inpos] >>> 47);
        }

        protected static void fastunpack18(final long[] in, int inpos,
                final long[] out, int outpos) {
                out[outpos] = (in[inpos] & 262143L);
                out[1 + outpos] = ((in[inpos] >>> 18) & 262143L);
                out[2 + outpos] = ((in[inpos] >>> 36) & 262143L);
                out[3 + outpos] = (in[inpos] >>> 54)
                        | ((in[1 + inpos] & 255L) << (18 - 8));
                out[4 + outpos] = ((in[1 + inpos] >>> 8) & 262143L);
                out[5 + outpos] = ((in[1 + inpos] >>> 26) & 262143L);
                out[6 + outpos] = ((in[1 + inpos] >>> 44) & 262143L);
                out[7 + outpos] = (in[1 + inpos] >>> 62)
                        | ((in[2 + inpos] & 65535L) << (18 - 16));
                out[8 + outpos] = ((in[2 + inpos] >>> 16) & 262143L);
                out[9 + outpos] = ((in[2 + inpos] >>> 34) & 262143L);
                out[10 + outpos] = (in[2 + inpos] >>> 52)
                        | ((in[3 + inpos] & 63L) << (18 - 6));
                out[11 + outpos] = ((in[3 + inpos] >>> 6) & 262143L);
                out[12 + outpos] = ((in[3 + inpos] >>> 24) & 262143L);
                out[13 + outpos] = ((in[3 + inpos] >>> 42) & 262143L);
                out[14 + outpos] = (in[3 + inpos] >>> 60)
                        | ((in[4 + inpos] & 16383L) << (18 - 14));
                out[15 + outpos] = ((in[4 + inpos] >>> 14) & 262143L);
                out[16 + outpos] = ((in[4 + inpos] >>> 32) & 262143L);
                out[17 + outpos] = (in[4 + inpos] >>> 50)
                        | ((in[5 + inpos] & 15L) << (18 - 4));
                out[18 + outpos] = ((in[5 + inpos] >>> 4) & 262143L);
                out[19 + outpos] = ((in[5 + inpos] >>> 22) & 262143L);
                out[20 + outpos] = ((in[5 + inpos] >>> 40) & 262143L);
                out[21 + outpos] = (in[5 + inpos] >>> 58)
                        | ((in[6 + inpos] & 4095L) << (18 - 12));
                out[22 + outpos] = ((in[6 + inpos] >>> 12) & 262143L);
                out[23 + outpos] = ((in[6 + inpos] >>> 30) & 262143L);
                out[24 + outpos] = (in[6 + inpos] >>> 48)
                        | ((in[7 + inpos] & 3L) << (18 - 2));
                out[25 + outpos] = ((in[7 + inpos] >>> 2) & 262143L);
                out[26 + outpos] = ((in[7 + inpos] >>> 20) & 262143L);
                out[27 + outpos] = ((in[7 + inpos] >>> 38) & 262143L);
                out[28 + outpos] = (in[7 + inpos] >>> 56)
                        | ((in[8 + inpos] & 1023L) << (18 - 10));
                out[29 + outpos] = ((in[8 + inpos] >>> 10) & 262143L);
                out[30 + outpos] = ((in[8 + inpos] >>> 28) & 262143L);
                out[31 + outpos] = (in[8 + inpos] >>> 46);
                out[32 + outpos] = (in[9 + inpos] & 262143L);
                out[33 + outpos] = ((in[9 + inpos] >>> 18) & 262143L);
                out[34 + outpos] = ((in[9 + inpos] >>> 36) & 262143L);
                out[35 + outpos] = (in[9 + inpos] >>> 54)
                        | ((in[10 + inpos] & 255L) << (18 - 8));
                out[36 + outpos] = ((in[10 + inpos] >>> 8) & 262143L);
                out[37 + outpos] = ((in[10 + inpos] >>> 26) & 262143L);
                out[38 + outpos] = ((in[10 + inpos] >>> 44) & 262143L);
                out[39 + outpos] = (in[10 + inpos] >>> 62)
                        | ((in[11 + inpos] & 65535L) << (18 - 16));
                out[40 + outpos] = ((in[11 + inpos] >>> 16) & 262143L);
                out[41 + outpos] = ((in[11 + inpos] >>> 34) & 262143L);
                out[42 + outpos] = (in[11 + inpos] >>> 52)
                        | ((in[12 + inpos] & 63L) << (18 - 6));
                out[43 + outpos] = ((in[12 + inpos] >>> 6) & 262143L);
                out[44 + outpos] = ((in[12 + inpos] >>> 24) & 262143L);
                out[45 + outpos] = ((in[12 + inpos] >>> 42) & 262143L);
                out[46 + outpos] = (in[12 + inpos] >>> 60)
                        | ((in[13 + inpos] & 16383L) << (18 - 14));
                out[47 + outpos] = ((in[13 + inpos] >>> 14) & 262143L);
                out[48 + outpos] = ((in[13 + inpos] >>> 32) & 262143L);
                out[49 + outpos] = (in[13 + inpos] >>> 50)
                        | ((in[14 + inpos] & 15L) << (18 - 4));
                out[50 + outpos] = ((in[14 + inpos] >>> 4) & 262143L);
                out[51 + outpos] = ((in[14 + inpos] >>> 22) & 262143L);
                out[52 + outpos] = ((in[14 + inpos] >>> 40) & 262143L);
                out[53 + outpos] = (in[14 + inpos] >>> 58)
                        | ((in[15 + inpos] & 4095L) << (18 - 12));
                out[54 + outpos] = ((in[15 + inpos] >>> 12) & 262143L);
                out[55 + outpos] = ((in[15 + inpos] >>> 30) & 262143L);
                out[56 + outpos] = (in[15 + inpos] >>> 48)
                        | ((in[16 + inpos] & 3L) << (18 - 2));
                out[57 + outpos] = ((in[16 + inpos] >>> 2) & 262143L);
                out[58 + outpos] = ((in[16 + inpos] >>> 20) & 262143L);
                out[59 + outpos] = ((in[16 + inpos] >>> 38) & 262143L);
                out[60 + outpos] = (in[16 + inpos] >>> 56)
                        | ((in[17 + inpos] & 1023L) << (18 - 10));
                out[61 + outpos] = ((in[17 + inpos] >>> 10) & 262143L);
                out[62 + outpos] = ((in[17 + inpos] >>> 28) & 262143L);
                out[63 + outpos] = (in[17 + inpos] >>> 46);
        }

        protected static void fastunpack19(final long[] in, int inpos,
                final long[] out, int outpos) {
                out[outpos] = (in[inpos] & 524287L);
                out[1 + outpos] = ((in[inpos] >>> 19) & 524287L);
                out[2 + outpos] = ((in[inpos] >>> 38) & 524287L);
                out[3 + outpos] = (in[inpos] >>> 57)
                        | ((in[1 + inpos] & 4095L) << (19 - 12));
                out[4 + outpos] = ((in[1 + inpos] >>> 12) & 524287L);
                out[5 + outpos] = ((in[1 + inpos] >>> 31) & 524287L);
                out[6 + outpos] = (in[1 + inpos] >>> 50)
                        | ((in[2 + inpos] & 31L) << (19 - 5));
                out[7 + outpos] = ((in[2 + inpos] >>> 5) & 524287L);
                out[8 + outpos] = ((in[2 + inpos] >>> 24) & 524287L);
                out[9 + outpos] = ((in[2 + inpos] >>> 43) & 524287L);
                out[10 + outpos] = (in[2 + inpos] >>> 62)
                        | ((in[3 + inpos] & 131071L) << (19 - 17));
                out[11 + outpos] = ((in[3 + inpos] >>> 17) & 524287L);
                out[12 + outpos] = ((in[3 + inpos] >>> 36) & 524287L);
                out[13 + outpos] = (in[3 + inpos] >>> 55)
                        | ((in[4 + inpos] & 1023L) << (19 - 10));
                out[14 + outpos] = ((in[4 + inpos] >>> 10) & 524287L);
                out[15 + outpos] = ((in[4 + inpos] >>> 29) & 524287L);
                out[16 + outpos] = (in[4 + inpos] >>> 48)
                        | ((in[5 + inpos] & 7L) << (19 - 3));
                out[17 + outpos] = ((in[5 + inpos] >>> 3) & 524287L);
                out[18 + outpos] = ((in[5 + inpos] >>> 22) & 524287L);
                out[19 + outpos] = ((in[5 + inpos] >>> 41) & 524287L);
                out[20 + outpos] = (in[5 + inpos] >>> 60)
                        | ((in[6 + inpos] & 32767L) << (19 - 15));
                out[21 + outpos] = ((in[6 + inpos] >>> 15) & 524287L);
                out[22 + outpos] = ((in[6 + inpos] >>> 34) & 524287L);
                out[23 + outpos] = (in[6 + inpos] >>> 53)
                        | ((in[7 + inpos] & 255L) << (19 - 8));
                out[24 + outpos] = ((in[7 + inpos] >>> 8) & 524287L);
                out[25 + outpos] = ((in[7 + inpos] >>> 27) & 524287L);
                out[26 + outpos] = (in[7 + inpos] >>> 46)
                        | ((in[8 + inpos] & 1L) << (19 - 1));
                out[27 + outpos] = ((in[8 + inpos] >>> 1) & 524287L);
                out[28 + outpos] = ((in[8 + inpos] >>> 20) & 524287L);
                out[29 + outpos] = ((in[8 + inpos] >>> 39) & 524287L);
                out[30 + outpos] = (in[8 + inpos] >>> 58)
                        | ((in[9 + inpos] & 8191L) << (19 - 13));
                out[31 + outpos] = ((in[9 + inpos] >>> 13) & 524287L);
                out[32 + outpos] = ((in[9 + inpos] >>> 32) & 524287L);
                out[33 + outpos] = (in[9 + inpos] >>> 51)
                        | ((in[10 + inpos] & 63L) << (19 - 6));
                out[34 + outpos] = ((in[10 + inpos] >>> 6) & 524287L);
                out[35 + outpos] = ((in[10 + inpos] >>> 25) & 524287L);
                out[36 + outpos] = ((in[10 + inpos] >>> 44) & 524287L);
                out[37 + outpos] = (in[10 + inpos] >>> 63)
                        | ((in[11 + inpos] & 262143L) << (19 - 18));
                out[38 + outpos] = ((in[11 + inpos] >>> 18) & 524287L);
                out[39 + outpos] = ((in[11 + inpos] >>> 37) & 524287L);
                out[40 + outpos] = (in[11 + inpos] >>> 56)
                        | ((in[12 + inpos] & 2047L) << (19 - 11));
                out[41 + outpos] = ((in[12 + inpos] >>> 11) & 524287L);
                out[42 + outpos] = ((in[12 + inpos] >>> 30) & 524287L);
                out[43 + outpos] = (in[12 + inpos] >>> 49)
                        | ((in[13 + inpos] & 15L) << (19 - 4));
                out[44 + outpos] = ((in[13 + inpos] >>> 4) & 524287L);
                out[45 + outpos] = ((in[13 + inpos] >>> 23) & 524287L);
                out[46 + outpos] = ((in[13 + inpos] >>> 42) & 524287L);
                out[47 + outpos] = (in[13 + inpos] >>> 61)
                        | ((in[14 + inpos] & 65535L) << (19 - 16));
                out[48 + outpos] = ((in[14 + inpos] >>> 16) & 524287L);
                out[49 + outpos] = ((in[14 + inpos] >>> 35) & 524287L);
                out[50 + outpos] = (in[14 + inpos] >>> 54)
                        | ((in[15 + inpos] & 511L) << (19 - 9));
                out[51 + outpos] = ((in[15 + inpos] >>> 9) & 524287L);
                out[52 + outpos] = ((in[15 + inpos] >>> 28) & 524287L);
                out[53 + outpos] = (in[15 + inpos] >>> 47)
                        | ((in[16 + inpos] & 3L) << (19 - 2));
                out[54 + outpos] = ((in[16 + inpos] >>> 2) & 524287L);
                out[55 + outpos] = ((in[16 + inpos] >>> 21) & 524287L);
                out[56 + outpos] = ((in[16 + inpos] >>> 40) & 524287L);
                out[57 + outpos] = (in[16 + inpos] >>> 59)
                        | ((in[17 + inpos] & 16383L) << (19 - 14));
                out[58 + outpos] = ((in[17 + inpos] >>> 14) & 524287L);
                out[59 + outpos] = ((in[17 + inpos] >>> 33) & 524287L);
                out[60 + outpos] = (in[17 + inpos] >>> 52)
                        | ((in[18 + inpos] & 127L) << (19 - 7));
                out[61 + outpos] = ((in[18 + inpos] >>> 7) & 524287L);
                out[62 + outpos] = ((in[18 + inpos] >>> 26) & 524287L);
                out[63 + outpos] = (in[18 + inpos] >>> 45);
        }

        protected static void fastunpack20(final long[] in, int inpos,
                final long[] out, int outpos) {
                out[outpos] = (in[inpos] & 1048575L);
                out[1 + outpos] = ((in[inpos] >>> 20) & 1048575L);
                out[2 + outpos] = ((in[inpos] >>> 40) & 1048575L);
                out[3 + outpos] = (in[inpos] >>> 60)
                        | ((in[1 + inpos] & 65535L) << (20 - 16));
                out[4 + outpos] = ((in[1 + inpos] >>> 16) & 1048575L);
                out[5 + outpos] = ((in[1 + inpos] >>> 36) & 1048575L);
                out[6 + outpos] = (in[1 + inpos] >>> 56)
                        | ((in[2 + inpos] & 4095L) << (20 - 12));
                out[7 + outpos] = ((in[2 + inpos] >>> 12) & 1048575L);
                out[8 + outpos] = ((in[2 + inpos] >>> 32) & 1048575L);
                out[9 + outpos] = (in[2 + inpos] >>> 52)
                        | ((in[3 + inpos] & 255L) << (20 - 8));
                out[10 + outpos] = ((in[3 + inpos] >>> 8) & 1048575L);
                out[11 + outpos] = ((in[3 + inpos] >>> 28) & 1048575L);
                out[12 + outpos] = (in[3 + inpos] >>> 48)
                        | ((in[4 + inpos] & 15L) << (20 - 4));
                out[13 + outpos] = ((in[4 + inpos] >>> 4) & 1048575L);
                out[14 + outpos] = ((in[4 + inpos] >>> 24) & 1048575L);
                out[15 + outpos] = (in[4 + inpos] >>> 44);
                out[16 + outpos] = (in[5 + inpos] & 1048575L);
                out[17 + outpos] = ((in[5 + inpos] >>> 20) & 1048575L);
                out[18 + outpos] = ((in[5 + inpos] >>> 40) & 1048575L);
                out[19 + outpos] = (in[5 + inpos] >>> 60)
                        | ((in[6 + inpos] & 65535L) << (20 - 16));
                out[20 + outpos] = ((in[6 + inpos] >>> 16) & 1048575L);
                out[21 + outpos] = ((in[6 + inpos] >>> 36) & 1048575L);
                out[22 + outpos] = (in[6 + inpos] >>> 56)
                        | ((in[7 + inpos] & 4095L) << (20 - 12));
                out[23 + outpos] = ((in[7 + inpos] >>> 12) & 1048575L);
                out[24 + outpos] = ((in[7 + inpos] >>> 32) & 1048575L);
                out[25 + outpos] = (in[7 + inpos] >>> 52)
                        | ((in[8 + inpos] & 255L) << (20 - 8));
                out[26 + outpos] = ((in[8 + inpos] >>> 8) & 1048575L);
                out[27 + outpos] = ((in[8 + inpos] >>> 28) & 1048575L);
                out[28 + outpos] = (in[8 + inpos] >>> 48)
                        | ((in[9 + inpos] & 15L) << (20 - 4));
                out[29 + outpos] = ((in[9 + inpos] >>> 4) & 1048575L);
                out[30 + outpos] = ((in[9 + inpos] >>> 24) & 1048575L);
                out[31 + outpos] = (in[9 + inpos] >>> 44);
                out[32 + outpos] = (in[10 + inpos] & 1048575L);
                out[33 + outpos] = ((in[10 + inpos] >>> 20) & 1048575L);
                out[34 + outpos] = ((in[10 + inpos] >>> 40) & 1048575L);
                out[35 + outpos] = (in[10 + inpos] >>> 60)
                        | ((in[11 + inpos] & 65535L) << (20 - 16));
                out[36 + outpos] = ((in[11 + inpos] >>> 16) & 1048575L);
                out[37 + outpos] = ((in[11 + inpos] >>> 36) & 1048575L);
                out[38 + outpos] = (in[11 + inpos] >>> 56)
                        | ((in[12 + inpos] & 4095L) << (20 - 12));
                out[39 + outpos] = ((in[12 + inpos] >>> 12) & 1048575L);
                out[40 + outpos] = ((in[12 + inpos] >>> 32) & 1048575L);
                out[41 + outpos] = (in[12 + inpos] >>> 52)
                        | ((in[13 + inpos] & 255L) << (20 - 8));
                out[42 + outpos] = ((in[13 + inpos] >>> 8) & 1048575L);
                out[43 + outpos] = ((in[13 + inpos] >>> 28) & 1048575L);
                out[44 + outpos] = (in[13 + inpos] >>> 48)
                        | ((in[14 + inpos] & 15L) << (20 - 4));
                out[45 + outpos] = ((in[14 + inpos] >>> 4) & 1048575L);
                out[46 + outpos] = ((in[14 + inpos] >>> 24) & 1048575L);
                out[47 + outpos] = (in[14 + inpos] >>> 44);
                out[48 + outpos] = (in[15 + inpos] & 1048575L);
                out[49 + outpos] = ((in[15 + inpos] >>> 20) & 1048575L);
                out[50 + outpos] = ((in[15 + inpos] >>> 40) & 1048575L);
                out[51 + outpos] = (in[15 + inpos] >>> 60)
                        | ((in[16 + inpos] & 65535L) << (20 - 16));
                out[52 + outpos] = ((in[16 + inpos] >>> 16) & 1048575L);
                out[53 + outpos] = ((in[16 + inpos] >>> 36) & 1048575L);
                out[54 + outpos] = (in[16 + inpos] >>> 56)
                        | ((in[17 + inpos] & 4095L) << (20 - 12));
                out[55 + outpos] = ((in[17 + inpos] >>> 12) & 1048575L);
                out[56 + outpos] = ((in[17 + inpos] >>> 32) & 1048575L);
                out[57 + outpos] = (in[17 + inpos] >>> 52)
                        | ((in[18 + inpos] & 255L) << (20 - 8));
                out[58 + outpos] = ((in[18 + inpos] >>> 8) & 1048575L);
                out[59 + outpos] = ((in[18 + inpos] >>> 28) & 1048575L);
                out[60 + outpos] = (in[18 + inpos] >>> 48)
                        | ((in[19 + inpos] & 15L) << (20 - 4));
                out[61 + outpos] = ((in[19 + inpos] >>> 4) & 1048575L);
                out[62 + outpos] = ((in[19 + inpos] >>> 24) & 1048575L);
                out[63 + outpos] = (in[19 + inpos] >>> 44);
        }

        protected static void fastunpack21(final long[] in, int inpos,
                final long[] out, int outpos) {
                out[outpos] = (in[inpos] & 2097151L);
                out[1 + outpos] = ((in[inpos] >>> 21) & 2097151L);
                out[2 + outpos] = ((in[inpos] >>> 42) & 2097151L);
                out[3 + outpos] = (in[inpos] >>> 63)
                        | ((in[1 + inpos] & 1048575L) << (21 - 20));
                out[4 + outpos] = ((in[1 + inpos] >>> 20) & 2097151L);
                out[5 + outpos] = ((in[1 + inpos] >>> 41) & 2097151L);
                out[6 + outpos] = (in[1 + inpos] >>> 62)
                        | ((in[2 + inpos] & 524287L) << (21 - 19));
                out[7 + outpos] = ((in[2 + inpos] >>> 19) & 2097151L);
                out[8 + outpos] = ((in[2 + inpos] >>> 40) & 2097151L);
                out[9 + outpos] = (in[2 + inpos] >>> 61)
                        | ((in[3 + inpos] & 262143L) << (21 - 18));
                out[10 + outpos] = ((in[3 + inpos] >>> 18) & 2097151L);
                out[11 + outpos] = ((in[3 + inpos] >>> 39) & 2097151L);
                out[12 + outpos] = (in[3 + inpos] >>> 60)
                        | ((in[4 + inpos] & 131071L) << (21 - 17));
                out[13 + outpos] = ((in[4 + inpos] >>> 17) & 2097151L);
                out[14 + outpos] = ((in[4 + inpos] >>> 38) & 2097151L);
                out[15 + outpos] = (in[4 + inpos] >>> 59)
                        | ((in[5 + inpos] & 65535L) << (21 - 16));
                out[16 + outpos] = ((in[5 + inpos] >>> 16) & 2097151L);
                out[17 + outpos] = ((in[5 + inpos] >>> 37) & 2097151L);
                out[18 + outpos] = (in[5 + inpos] >>> 58)
                        | ((in[6 + inpos] & 32767L) << (21 - 15));
                out[19 + outpos] = ((in[6 + inpos] >>> 15) & 2097151L);
                out[20 + outpos] = ((in[6 + inpos] >>> 36) & 2097151L);
                out[21 + outpos] = (in[6 + inpos] >>> 57)
                        | ((in[7 + inpos] & 16383L) << (21 - 14));
                out[22 + outpos] = ((in[7 + inpos] >>> 14) & 2097151L);
                out[23 + outpos] = ((in[7 + inpos] >>> 35) & 2097151L);
                out[24 + outpos] = (in[7 + inpos] >>> 56)
                        | ((in[8 + inpos] & 8191L) << (21 - 13));
                out[25 + outpos] = ((in[8 + inpos] >>> 13) & 2097151L);
                out[26 + outpos] = ((in[8 + inpos] >>> 34) & 2097151L);
                out[27 + outpos] = (in[8 + inpos] >>> 55)
                        | ((in[9 + inpos] & 4095L) << (21 - 12));
                out[28 + outpos] = ((in[9 + inpos] >>> 12) & 2097151L);
                out[29 + outpos] = ((in[9 + inpos] >>> 33) & 2097151L);
                out[30 + outpos] = (in[9 + inpos] >>> 54)
                        | ((in[10 + inpos] & 2047L) << (21 - 11));
                out[31 + outpos] = ((in[10 + inpos] >>> 11) & 2097151L);
                out[32 + outpos] = ((in[10 + inpos] >>> 32) & 2097151L);
                out[33 + outpos] = (in[10 + inpos] >>> 53)
                        | ((in[11 + inpos] & 1023L) << (21 - 10));
                out[34 + outpos] = ((in[11 + inpos] >>> 10) & 2097151L);
                out[35 + outpos] = ((in[11 + inpos] >>> 31) & 2097151L);
                out[36 + outpos] = (in[11 + inpos] >>> 52)
                        | ((in[12 + inpos] & 511L) << (21 - 9));
                out[37 + outpos] = ((in[12 + inpos] >>> 9) & 2097151L);
                out[38 + outpos] = ((in[12 + inpos] >>> 30) & 2097151L);
                out[39 + outpos] = (in[12 + inpos] >>> 51)
                        | ((in[13 + inpos] & 255L) << (21 - 8));
                out[40 + outpos] = ((in[13 + inpos] >>> 8) & 2097151L);
                out[41 + outpos] = ((in[13 + inpos] >>> 29) & 2097151L);
                out[42 + outpos] = (in[13 + inpos] >>> 50)
                        | ((in[14 + inpos] & 127L) << (21 - 7));
                out[43 + outpos] = ((in[14 + inpos] >>> 7) & 2097151L);
                out[44 + outpos] = ((in[14 + inpos] >>> 28) & 2097151L);
                out[45 + outpos] = (in[14 + inpos] >>> 49)
                        | ((in[15 + inpos] & 63L) << (21 - 6));
                out[46 + outpos] = ((in[15 + inpos] >>> 6) & 2097151L);
                out[47 + outpos] = ((in[15 + inpos] >>> 27) & 2097151L);
                out[48 + outpos] = (in[15 + inpos] >>> 48)
                        | ((in[16 + inpos] & 31L) << (21 - 5));
                out[49 + outpos] = ((in[16 + inpos] >>> 5) & 2097151L);
                out[50 + outpos] = ((in[16 + inpos] >>> 26) & 2097151L);
                out[51 + outpos] = (in[16 + inpos] >>> 47)
                        | ((in[17 + inpos] & 15L) << (21 - 4));
                out[52 + outpos] = ((in[17 + inpos] >>> 4) & 2097151L);
                out[53 + outpos] = ((in[17 + inpos] >>> 25) & 2097151L);
                out[54 + outpos] = (in[17 + inpos] >>> 46)
                        | ((in[18 + inpos] & 7L) << (21 - 3));
                out[55 + outpos] = ((in[18 + inpos] >>> 3) & 2097151L);
                out[56 + outpos] = ((in[18 + inpos] >>> 24) & 2097151L);
                out[57 + outpos] = (in[18 + inpos] >>> 45)
                        | ((in[19 + inpos] & 3L) << (21 - 2));
                out[58 + outpos] = ((in[19 + inpos] >>> 2) & 2097151L);
                out[59 + outpos] = ((in[19 + inpos] >>> 23) & 2097151L);
                out[60 + outpos] = (in[19 + inpos] >>> 44)
                        | ((in[20 + inpos] & 1L) << (21 - 1));
                out[61 + outpos] = ((in[20 + inpos] >>> 1) & 2097151L);
                out[62 + outpos] = ((in[20 + inpos] >>> 22) & 2097151L);
                out[63 + outpos] = (in[20 + inpos] >>> 43);
        }

        protected static void fastunpack22(final long[] in, int inpos,
                final long[] out, int outpos) {
                out[outpos] = (in[inpos] & 4194303L);
                out[1 + outpos] = ((in[inpos] >>> 22) & 4194303L);
                out[2 + outpos] = (in[inpos] >>> 44)
                        | ((in[1 + inpos] & 3L) << (22 - 2));
                out[3 + outpos] = ((in[1 + inpos] >>> 2) & 4194303L);
                out[4 + outpos] = ((in[1 + inpos] >>> 24) & 4194303L);
                out[5 + outpos] = (in[1 + inpos] >>> 46)
                        | ((in[2 + inpos] & 15L) << (22 - 4));
                out[6 + outpos] = ((in[2 + inpos] >>> 4) & 4194303L);
                out[7 + outpos] = ((in[2 + inpos] >>> 26) & 4194303L);
                out[8 + outpos] = (in[2 + inpos] >>> 48)
                        | ((in[3 + inpos] & 63L) << (22 - 6));
                out[9 + outpos] = ((in[3 + inpos] >>> 6) & 4194303L);
                out[10 + outpos] = ((in[3 + inpos] >>> 28) & 4194303L);
                out[11 + outpos] = (in[3 + inpos] >>> 50)
                        | ((in[4 + inpos] & 255L) << (22 - 8));
                out[12 + outpos] = ((in[4 + inpos] >>> 8) & 4194303L);
                out[13 + outpos] = ((in[4 + inpos] >>> 30) & 4194303L);
                out[14 + outpos] = (in[4 + inpos] >>> 52)
                        | ((in[5 + inpos] & 1023L) << (22 - 10));
                out[15 + outpos] = ((in[5 + inpos] >>> 10) & 4194303L);
                out[16 + outpos] = ((in[5 + inpos] >>> 32) & 4194303L);
                out[17 + outpos] = (in[5 + inpos] >>> 54)
                        | ((in[6 + inpos] & 4095L) << (22 - 12));
                out[18 + outpos] = ((in[6 + inpos] >>> 12) & 4194303L);
                out[19 + outpos] = ((in[6 + inpos] >>> 34) & 4194303L);
                out[20 + outpos] = (in[6 + inpos] >>> 56)
                        | ((in[7 + inpos] & 16383L) << (22 - 14));
                out[21 + outpos] = ((in[7 + inpos] >>> 14) & 4194303L);
                out[22 + outpos] = ((in[7 + inpos] >>> 36) & 4194303L);
                out[23 + outpos] = (in[7 + inpos] >>> 58)
                        | ((in[8 + inpos] & 65535L) << (22 - 16));
                out[24 + outpos] = ((in[8 + inpos] >>> 16) & 4194303L);
                out[25 + outpos] = ((in[8 + inpos] >>> 38) & 4194303L);
                out[26 + outpos] = (in[8 + inpos] >>> 60)
                        | ((in[9 + inpos] & 262143L) << (22 - 18));
                out[27 + outpos] = ((in[9 + inpos] >>> 18) & 4194303L);
                out[28 + outpos] = ((in[9 + inpos] >>> 40) & 4194303L);
                out[29 + outpos] = (in[9 + inpos] >>> 62)
                        | ((in[10 + inpos] & 1048575L) << (22 - 20));
                out[30 + outpos] = ((in[10 + inpos] >>> 20) & 4194303L);
                out[31 + outpos] = (in[10 + inpos] >>> 42);
                out[32 + outpos] = (in[11 + inpos] & 4194303L);
                out[33 + outpos] = ((in[11 + inpos] >>> 22) & 4194303L);
                out[34 + outpos] = (in[11 + inpos] >>> 44)
                        | ((in[12 + inpos] & 3L) << (22 - 2));
                out[35 + outpos] = ((in[12 + inpos] >>> 2) & 4194303L);
                out[36 + outpos] = ((in[12 + inpos] >>> 24) & 4194303L);
                out[37 + outpos] = (in[12 + inpos] >>> 46)
                        | ((in[13 + inpos] & 15L) << (22 - 4));
                out[38 + outpos] = ((in[13 + inpos] >>> 4) & 4194303L);
                out[39 + outpos] = ((in[13 + inpos] >>> 26) & 4194303L);
                out[40 + outpos] = (in[13 + inpos] >>> 48)
                        | ((in[14 + inpos] & 63L) << (22 - 6));
                out[41 + outpos] = ((in[14 + inpos] >>> 6) & 4194303L);
                out[42 + outpos] = ((in[14 + inpos] >>> 28) & 4194303L);
                out[43 + outpos] = (in[14 + inpos] >>> 50)
                        | ((in[15 + inpos] & 255L) << (22 - 8));
                out[44 + outpos] = ((in[15 + inpos] >>> 8) & 4194303L);
                out[45 + outpos] = ((in[15 + inpos] >>> 30) & 4194303L);
                out[46 + outpos] = (in[15 + inpos] >>> 52)
                        | ((in[16 + inpos] & 1023L) << (22 - 10));
                out[47 + outpos] = ((in[16 + inpos] >>> 10) & 4194303L);
                out[48 + outpos] = ((in[16 + inpos] >>> 32) & 4194303L);
                out[49 + outpos] = (in[16 + inpos] >>> 54)
                        | ((in[17 + inpos] & 4095L) << (22 - 12));
                out[50 + outpos] = ((in[17 + inpos] >>> 12) & 4194303L);
                out[51 + outpos] = ((in[17 + inpos] >>> 34) & 4194303L);
                out[52 + outpos] = (in[17 + inpos] >>> 56)
                        | ((in[18 + inpos] & 16383L) << (22 - 14));
                out[53 + outpos] = ((in[18 + inpos] >>> 14) & 4194303L);
                out[54 + outpos] = ((in[18 + inpos] >>> 36) & 4194303L);
                out[55 + outpos] = (in[18 + inpos] >>> 58)
                        | ((in[19 + inpos] & 65535L) << (22 - 16));
                out[56 + outpos] = ((in[19 + inpos] >>> 16) & 4194303L);
                out[57 + outpos] = ((in[19 + inpos] >>> 38) & 4194303L);
                out[58 + outpos] = (in[19 + inpos] >>> 60)
                        | ((in[20 + inpos] & 262143L) << (22 - 18));
                out[59 + outpos] = ((in[20 + inpos] >>> 18) & 4194303L);
                out[60 + outpos] = ((in[20 + inpos] >>> 40) & 4194303L);
                out[61 + outpos] = (in[20 + inpos] >>> 62)
                        | ((in[21 + inpos] & 1048575L) << (22 - 20));
                out[62 + outpos] = ((in[21 + inpos] >>> 20) & 4194303L);
                out[63 + outpos] = (in[21 + inpos] >>> 42);
        }

        protected static void fastunpack23(final long[] in, int inpos,
                final long[] out, int outpos) {
                out[outpos] = (in[inpos] & 8388607L);
                out[1 + outpos] = ((in[inpos] >>> 23) & 8388607L);
                out[2 + outpos] = (in[inpos] >>> 46)
                        | ((in[1 + inpos] & 31L) << (23 - 5));
                out[3 + outpos] = ((in[1 + inpos] >>> 5) & 8388607L);
                out[4 + outpos] = ((in[1 + inpos] >>> 28) & 8388607L);
                out[5 + outpos] = (in[1 + inpos] >>> 51)
                        | ((in[2 + inpos] & 1023L) << (23 - 10));
                out[6 + outpos] = ((in[2 + inpos] >>> 10) & 8388607L);
                out[7 + outpos] = ((in[2 + inpos] >>> 33) & 8388607L);
                out[8 + outpos] = (in[2 + inpos] >>> 56)
                        | ((in[3 + inpos] & 32767L) << (23 - 15));
                out[9 + outpos] = ((in[3 + inpos] >>> 15) & 8388607L);
                out[10 + outpos] = ((in[3 + inpos] >>> 38) & 8388607L);
                out[11 + outpos] = (in[3 + inpos] >>> 61)
                        | ((in[4 + inpos] & 1048575L) << (23 - 20));
                out[12 + outpos] = ((in[4 + inpos] >>> 20) & 8388607L);
                out[13 + outpos] = (in[4 + inpos] >>> 43)
                        | ((in[5 + inpos] & 3L) << (23 - 2));
                out[14 + outpos] = ((in[5 + inpos] >>> 2) & 8388607L);
                out[15 + outpos] = ((in[5 + inpos] >>> 25) & 8388607L);
                out[16 + outpos] = (in[5 + inpos] >>> 48)
                        | ((in[6 + inpos] & 127L) << (23 - 7));
                out[17 + outpos] = ((in[6 + inpos] >>> 7) & 8388607L);
                out[18 + outpos] = ((in[6 + inpos] >>> 30) & 8388607L);
                out[19 + outpos] = (in[6 + inpos] >>> 53)
                        | ((in[7 + inpos] & 4095L) << (23 - 12));
                out[20 + outpos] = ((in[7 + inpos] >>> 12) & 8388607L);
                out[21 + outpos] = ((in[7 + inpos] >>> 35) & 8388607L);
                out[22 + outpos] = (in[7 + inpos] >>> 58)
                        | ((in[8 + inpos] & 131071L) << (23 - 17));
                out[23 + outpos] = ((in[8 + inpos] >>> 17) & 8388607L);
                out[24 + outpos] = ((in[8 + inpos] >>> 40) & 8388607L);
                out[25 + outpos] = (in[8 + inpos] >>> 63)
                        | ((in[9 + inpos] & 4194303L) << (23 - 22));
                out[26 + outpos] = ((in[9 + inpos] >>> 22) & 8388607L);
                out[27 + outpos] = (in[9 + inpos] >>> 45)
                        | ((in[10 + inpos] & 15L) << (23 - 4));
                out[28 + outpos] = ((in[10 + inpos] >>> 4) & 8388607L);
                out[29 + outpos] = ((in[10 + inpos] >>> 27) & 8388607L);
                out[30 + outpos] = (in[10 + inpos] >>> 50)
                        | ((in[11 + inpos] & 511L) << (23 - 9));
                out[31 + outpos] = ((in[11 + inpos] >>> 9) & 8388607L);
                out[32 + outpos] = ((in[11 + inpos] >>> 32) & 8388607L);
                out[33 + outpos] = (in[11 + inpos] >>> 55)
                        | ((in[12 + inpos] & 16383L) << (23 - 14));
                out[34 + outpos] = ((in[12 + inpos] >>> 14) & 8388607L);
                out[35 + outpos] = ((in[12 + inpos] >>> 37) & 8388607L);
                out[36 + outpos] = (in[12 + inpos] >>> 60)
                        | ((in[13 + inpos] & 524287L) << (23 - 19));
                out[37 + outpos] = ((in[13 + inpos] >>> 19) & 8388607L);
                out[38 + outpos] = (in[13 + inpos] >>> 42)
                        | ((in[14 + inpos] & 1L) << (23 - 1));
                out[39 + outpos] = ((in[14 + inpos] >>> 1) & 8388607L);
                out[40 + outpos] = ((in[14 + inpos] >>> 24) & 8388607L);
                out[41 + outpos] = (in[14 + inpos] >>> 47)
                        | ((in[15 + inpos] & 63L) << (23 - 6));
                out[42 + outpos] = ((in[15 + inpos] >>> 6) & 8388607L);
                out[43 + outpos] = ((in[15 + inpos] >>> 29) & 8388607L);
                out[44 + outpos] = (in[15 + inpos] >>> 52)
                        | ((in[16 + inpos] & 2047L) << (23 - 11));
                out[45 + outpos] = ((in[16 + inpos] >>> 11) & 8388607L);
                out[46 + outpos] = ((in[16 + inpos] >>> 34) & 8388607L);
                out[47 + outpos] = (in[16 + inpos] >>> 57)
                        | ((in[17 + inpos] & 65535L) << (23 - 16));
                out[48 + outpos] = ((in[17 + inpos] >>> 16) & 8388607L);
                out[49 + outpos] = ((in[17 + inpos] >>> 39) & 8388607L);
                out[50 + outpos] = (in[17 + inpos] >>> 62)
                        | ((in[18 + inpos] & 2097151L) << (23 - 21));
                out[51 + outpos] = ((in[18 + inpos] >>> 21) & 8388607L);
                out[52 + outpos] = (in[18 + inpos] >>> 44)
                        | ((in[19 + inpos] & 7L) << (23 - 3));
                out[53 + outpos] = ((in[19 + inpos] >>> 3) & 8388607L);
                out[54 + outpos] = ((in[19 + inpos] >>> 26) & 8388607L);
                out[55 + outpos] = (in[19 + inpos] >>> 49)
                        | ((in[20 + inpos] & 255L) << (23 - 8));
                out[56 + outpos] = ((in[20 + inpos] >>> 8) & 8388607L);
                out[57 + outpos] = ((in[20 + inpos] >>> 31) & 8388607L);
                out[58 + outpos] = (in[20 + inpos] >>> 54)
                        | ((in[21 + inpos] & 8191L) << (23 - 13));
                out[59 + outpos] = ((in[21 + inpos] >>> 13) & 8388607L);
                out[60 + outpos] = ((in[21 + inpos] >>> 36) & 8388607L);
                out[61 + outpos] = (in[21 + inpos] >>> 59)
                        | ((in[22 + inpos] & 262143L) << (23 - 18));
                out[62 + outpos] = ((in[22 + inpos] >>> 18) & 8388607L);
                out[63 + outpos] = (in[22 + inpos] >>> 41);
        }

        protected static void fastunpack24(final long[] in, int inpos,
                final long[] out, int outpos) {
                out[outpos] = (in[inpos] & 16777215L);
                out[1 + outpos] = ((in[inpos] >>> 24) & 16777215L);
                out[2 + outpos] = (in[inpos] >>> 48)
                        | ((in[1 + inpos] & 255L) << (24 - 8));
                out[3 + outpos] = ((in[1 + inpos] >>> 8) & 16777215L);
                out[4 + outpos] = ((in[1 + inpos] >>> 32) & 16777215L);
                out[5 + outpos] = (in[1 + inpos] >>> 56)
                        | ((in[2 + inpos] & 65535L) << (24 - 16));
                out[6 + outpos] = ((in[2 + inpos] >>> 16) & 16777215L);
                out[7 + outpos] = (in[2 + inpos] >>> 40);
                out[8 + outpos] = (in[3 + inpos] & 16777215L);
                out[9 + outpos] = ((in[3 + inpos] >>> 24) & 16777215L);
                out[10 + outpos] = (in[3 + inpos] >>> 48)
                        | ((in[4 + inpos] & 255L) << (24 - 8));
                out[11 + outpos] = ((in[4 + inpos] >>> 8) & 16777215L);
                out[12 + outpos] = ((in[4 + inpos] >>> 32) & 16777215L);
                out[13 + outpos] = (in[4 + inpos] >>> 56)
                        | ((in[5 + inpos] & 65535L) << (24 - 16));
                out[14 + outpos] = ((in[5 + inpos] >>> 16) & 16777215L);
                out[15 + outpos] = (in[5 + inpos] >>> 40);
                out[16 + outpos] = (in[6 + inpos] & 16777215L);
                out[17 + outpos] = ((in[6 + inpos] >>> 24) & 16777215L);
                out[18 + outpos] = (in[6 + inpos] >>> 48)
                        | ((in[7 + inpos] & 255L) << (24 - 8));
                out[19 + outpos] = ((in[7 + inpos] >>> 8) & 16777215L);
                out[20 + outpos] = ((in[7 + inpos] >>> 32) & 16777215L);
                out[21 + outpos] = (in[7 + inpos] >>> 56)
                        | ((in[8 + inpos] & 65535L) << (24 - 16));
                out[22 + outpos] = ((in[8 + inpos] >>> 16) & 16777215L);
                out[23 + outpos] = (in[8 + inpos] >>> 40);
                out[24 + outpos] = (in[9 + inpos] & 16777215L);
                out[25 + outpos] = ((in[9 + inpos] >>> 24) & 16777215L);
                out[26 + outpos] = (in[9 + inpos] >>> 48)
                        | ((in[10 + inpos] & 255L) << (24 - 8));
                out[27 + outpos] = ((in[10 + inpos] >>> 8) & 16777215L);
                out[28 + outpos] = ((in[10 + inpos] >>> 32) & 16777215L);
                out[29 + outpos] = (in[10 + inpos] >>> 56)
                        | ((in[11 + inpos] & 65535L) << (24 - 16));
                out[30 + outpos] = ((in[11 + inpos] >>> 16) & 16777215L);
                out[31 + outpos] = (in[11 + inpos] >>> 40);
                out[32 + outpos] = (in[12 + inpos] & 16777215L);
                out[33 + outpos] = ((in[12 + inpos] >>> 24) & 16777215L);
                out[34 + outpos] = (in[12 + inpos] >>> 48)
                        | ((in[13 + inpos] & 255L) << (24 - 8));
                out[35 + outpos] = ((in[13 + inpos] >>> 8) & 16777215L);
                out[36 + outpos] = ((in[13 + inpos] >>> 32) & 16777215L);
                out[37 + outpos] = (in[13 + inpos] >>> 56)
                        | ((in[14 + inpos] & 65535L) << (24 - 16));
                out[38 + outpos] = ((in[14 + inpos] >>> 16) & 16777215L);
                out[39 + outpos] = (in[14 + inpos] >>> 40);
                out[40 + outpos] = (in[15 + inpos] & 16777215L);
                out[41 + outpos] = ((in[15 + inpos] >>> 24) & 16777215L);
                out[42 + outpos] = (in[15 + inpos] >>> 48)
                        | ((in[16 + inpos] & 255L) << (24 - 8));
                out[43 + outpos] = ((in[16 + inpos] >>> 8) & 16777215L);
                out[44 + outpos] = ((in[16 + inpos] >>> 32) & 16777215L);
                out[45 + outpos] = (in[16 + inpos] >>> 56)
                        | ((in[17 + inpos] & 65535L) << (24 - 16));
                out[46 + outpos] = ((in[17 + inpos] >>> 16) & 16777215L);
                out[47 + outpos] = (in[17 + inpos] >>> 40);
                out[48 + outpos] = (in[18 + inpos] & 16777215L);
                out[49 + outpos] = ((in[18 + inpos] >>> 24) & 16777215L);
                out[50 + outpos] = (in[18 + inpos] >>> 48)
                        | ((in[19 + inpos] & 255L) << (24 - 8));
                out[51 + outpos] = ((in[19 + inpos] >>> 8) & 16777215L);
                out[52 + outpos] = ((in[19 + inpos] >>> 32) & 16777215L);
                out[53 + outpos] = (in[19 + inpos] >>> 56)
                        | ((in[20 + inpos] & 65535L) << (24 - 16));
                out[54 + outpos] = ((in[20 + inpos] >>> 16) & 16777215L);
                out[55 + outpos] = (in[20 + inpos] >>> 40);
                out[56 + outpos] = (in[21 + inpos] & 16777215L);
                out[57 + outpos] = ((in[21 + inpos] >>> 24) & 16777215L);
                out[58 + outpos] = (in[21 + inpos] >>> 48)
                        | ((in[22 + inpos] & 255L) << (24 - 8));
                out[59 + outpos] = ((in[22 + inpos] >>> 8) & 16777215L);
                out[60 + outpos] = ((in[22 + inpos] >>> 32) & 16777215L);
                out[61 + outpos] = (in[22 + inpos] >>> 56)
                        | ((in[23 + inpos] & 65535L) << (24 - 16));
                out[62 + outpos] = ((in[23 + inpos] >>> 16) & 16777215L);
                out[63 + outpos] = (in[23 + inpos] >>> 40);
        }

        protected static void fastunpack25(final long[] in, int inpos,
                final long[] out, int outpos) {
                out[outpos] = (in[inpos] & 33554431L);
                out[1 + outpos] = ((in[inpos] >>> 25) & 33554431L);
                out[2 + outpos] = (in[inpos] >>> 50)
                        | ((in[1 + inpos] & 2047L) << (25 - 11));
                out[3 + outpos] = ((in[1 + inpos] >>> 11) & 33554431L);
                out[4 + outpos] = ((in[1 + inpos] >>> 36) & 33554431L);
                out[5 + outpos] = (in[1 + inpos] >>> 61)
                        | ((in[2 + inpos] & 4194303L) << (25 - 22));
                out[6 + outpos] = ((in[2 + inpos] >>> 22) & 33554431L);
                out[7 + outpos] = (in[2 + inpos] >>> 47)
                        | ((in[3 + inpos] & 255L) << (25 - 8));
                out[8 + outpos] = ((in[3 + inpos] >>> 8) & 33554431L);
                out[9 + outpos] = ((in[3 + inpos] >>> 33) & 33554431L);
                out[10 + outpos] = (in[3 + inpos] >>> 58)
                        | ((in[4 + inpos] & 524287L) << (25 - 19));
                out[11 + outpos] = ((in[4 + inpos] >>> 19) & 33554431L);
                out[12 + outpos] = (in[4 + inpos] >>> 44)
                        | ((in[5 + inpos] & 31L) << (25 - 5));
                out[13 + outpos] = ((in[5 + inpos] >>> 5) & 33554431L);
                out[14 + outpos] = ((in[5 + inpos] >>> 30) & 33554431L);
                out[15 + outpos] = (in[5 + inpos] >>> 55)
                        | ((in[6 + inpos] & 65535L) << (25 - 16));
                out[16 + outpos] = ((in[6 + inpos] >>> 16) & 33554431L);
                out[17 + outpos] = (in[6 + inpos] >>> 41)
                        | ((in[7 + inpos] & 3L) << (25 - 2));
                out[18 + outpos] = ((in[7 + inpos] >>> 2) & 33554431L);
                out[19 + outpos] = ((in[7 + inpos] >>> 27) & 33554431L);
                out[20 + outpos] = (in[7 + inpos] >>> 52)
                        | ((in[8 + inpos] & 8191L) << (25 - 13));
                out[21 + outpos] = ((in[8 + inpos] >>> 13) & 33554431L);
                out[22 + outpos] = ((in[8 + inpos] >>> 38) & 33554431L);
                out[23 + outpos] = (in[8 + inpos] >>> 63)
                        | ((in[9 + inpos] & 16777215L) << (25 - 24));
                out[24 + outpos] = ((in[9 + inpos] >>> 24) & 33554431L);
                out[25 + outpos] = (in[9 + inpos] >>> 49)
                        | ((in[10 + inpos] & 1023L) << (25 - 10));
                out[26 + outpos] = ((in[10 + inpos] >>> 10) & 33554431L);
                out[27 + outpos] = ((in[10 + inpos] >>> 35) & 33554431L);
                out[28 + outpos] = (in[10 + inpos] >>> 60)
                        | ((in[11 + inpos] & 2097151L) << (25 - 21));
                out[29 + outpos] = ((in[11 + inpos] >>> 21) & 33554431L);
                out[30 + outpos] = (in[11 + inpos] >>> 46)
                        | ((in[12 + inpos] & 127L) << (25 - 7));
                out[31 + outpos] = ((in[12 + inpos] >>> 7) & 33554431L);
                out[32 + outpos] = ((in[12 + inpos] >>> 32) & 33554431L);
                out[33 + outpos] = (in[12 + inpos] >>> 57)
                        | ((in[13 + inpos] & 262143L) << (25 - 18));
                out[34 + outpos] = ((in[13 + inpos] >>> 18) & 33554431L);
                out[35 + outpos] = (in[13 + inpos] >>> 43)
                        | ((in[14 + inpos] & 15L) << (25 - 4));
                out[36 + outpos] = ((in[14 + inpos] >>> 4) & 33554431L);
                out[37 + outpos] = ((in[14 + inpos] >>> 29) & 33554431L);
                out[38 + outpos] = (in[14 + inpos] >>> 54)
                        | ((in[15 + inpos] & 32767L) << (25 - 15));
                out[39 + outpos] = ((in[15 + inpos] >>> 15) & 33554431L);
                out[40 + outpos] = (in[15 + inpos] >>> 40)
                        | ((in[16 + inpos] & 1L) << (25 - 1));
                out[41 + outpos] = ((in[16 + inpos] >>> 1) & 33554431L);
                out[42 + outpos] = ((in[16 + inpos] >>> 26) & 33554431L);
                out[43 + outpos] = (in[16 + inpos] >>> 51)
                        | ((in[17 + inpos] & 4095L) << (25 - 12));
                out[44 + outpos] = ((in[17 + inpos] >>> 12) & 33554431L);
                out[45 + outpos] = ((in[17 + inpos] >>> 37) & 33554431L);
                out[46 + outpos] = (in[17 + inpos] >>> 62)
                        | ((in[18 + inpos] & 8388607L) << (25 - 23));
                out[47 + outpos] = ((in[18 + inpos] >>> 23) & 33554431L);
                out[48 + outpos] = (in[18 + inpos] >>> 48)
                        | ((in[19 + inpos] & 511L) << (25 - 9));
                out[49 + outpos] = ((in[19 + inpos] >>> 9) & 33554431L);
                out[50 + outpos] = ((in[19 + inpos] >>> 34) & 33554431L);
                out[51 + outpos] = (in[19 + inpos] >>> 59)
                        | ((in[20 + inpos] & 1048575L) << (25 - 20));
                out[52 + outpos] = ((in[20 + inpos] >>> 20) & 33554431L);
                out[53 + outpos] = (in[20 + inpos] >>> 45)
                        | ((in[21 + inpos] & 63L) << (25 - 6));
                out[54 + outpos] = ((in[21 + inpos] >>> 6) & 33554431L);
                out[55 + outpos] = ((in[21 + inpos] >>> 31) & 33554431L);
                out[56 + outpos] = (in[21 + inpos] >>> 56)
                        | ((in[22 + inpos] & 131071L) << (25 - 17));
                out[57 + outpos] = ((in[22 + inpos] >>> 17) & 33554431L);
                out[58 + outpos] = (in[22 + inpos] >>> 42)
                        | ((in[23 + inpos] & 7L) << (25 - 3));
                out[59 + outpos] = ((in[23 + inpos] >>> 3) & 33554431L);
                out[60 + outpos] = ((in[23 + inpos] >>> 28) & 33554431L);
                out[61 + outpos] = (in[23 + inpos] >>> 53)
                        | ((in[24 + inpos] & 16383L) << (25 - 14));
                out[62 + outpos] = ((in[24 + inpos] >>> 14) & 33554431L);
                out[63 + outpos] = (in[24 + inpos] >>> 39);
        }

        protected static void fastunpack26(final long[] in, int inpos,
                final long[] out, int outpos) {
                out[outpos] = (in[inpos] & 67108863L);
                out[1 + outpos] = ((in[inpos] >>> 26) & 67108863L);
                out[2 + outpos] = (in[inpos] >>> 52)
                        | ((in[1 + inpos] & 16383L) << (26 - 14));
                out[3 + outpos] = ((in[1 + inpos] >>> 14) & 67108863L);
                out[4 + outpos] = (in[1 + inpos] >>> 40)
                        | ((in[2 + inpos] & 3L) << (26 - 2));
                out[5 + outpos] = ((in[2 + inpos] >>> 2) & 67108863L);
                out[6 + outpos] = ((in[2 + inpos] >>> 28) & 67108863L);
                out[7 + outpos] = (in[2 + inpos] >>> 54)
                        | ((in[3 + inpos] & 65535L) << (26 - 16));
                out[8 + outpos] = ((in[3 + inpos] >>> 16) & 67108863L);
                out[9 + outpos] = (in[3 + inpos] >>> 42)
                        | ((in[4 + inpos] & 15L) << (26 - 4));
                out[10 + outpos] = ((in[4 + inpos] >>> 4) & 67108863L);
                out[11 + outpos] = ((in[4 + inpos] >>> 30) & 67108863L);
                out[12 + outpos] = (in[4 + inpos] >>> 56)
                        | ((in[5 + inpos] & 262143L) << (26 - 18));
                out[13 + outpos] = ((in[5 + inpos] >>> 18) & 67108863L);
                out[14 + outpos] = (in[5 + inpos] >>> 44)
                        | ((in[6 + inpos] & 63L) << (26 - 6));
                out[15 + outpos] = ((in[6 + inpos] >>> 6) & 67108863L);
                out[16 + outpos] = ((in[6 + inpos] >>> 32) & 67108863L);
                out[17 + outpos] = (in[6 + inpos] >>> 58)
                        | ((in[7 + inpos] & 1048575L) << (26 - 20));
                out[18 + outpos] = ((in[7 + inpos] >>> 20) & 67108863L);
                out[19 + outpos] = (in[7 + inpos] >>> 46)
                        | ((in[8 + inpos] & 255L) << (26 - 8));
                out[20 + outpos] = ((in[8 + inpos] >>> 8) & 67108863L);
                out[21 + outpos] = ((in[8 + inpos] >>> 34) & 67108863L);
                out[22 + outpos] = (in[8 + inpos] >>> 60)
                        | ((in[9 + inpos] & 4194303L) << (26 - 22));
                out[23 + outpos] = ((in[9 + inpos] >>> 22) & 67108863L);
                out[24 + outpos] = (in[9 + inpos] >>> 48)
                        | ((in[10 + inpos] & 1023L) << (26 - 10));
                out[25 + outpos] = ((in[10 + inpos] >>> 10) & 67108863L);
                out[26 + outpos] = ((in[10 + inpos] >>> 36) & 67108863L);
                out[27 + outpos] = (in[10 + inpos] >>> 62)
                        | ((in[11 + inpos] & 16777215L) << (26 - 24));
                out[28 + outpos] = ((in[11 + inpos] >>> 24) & 67108863L);
                out[29 + outpos] = (in[11 + inpos] >>> 50)
                        | ((in[12 + inpos] & 4095L) << (26 - 12));
                out[30 + outpos] = ((in[12 + inpos] >>> 12) & 67108863L);
                out[31 + outpos] = (in[12 + inpos] >>> 38);
                out[32 + outpos] = (in[13 + inpos] & 67108863L);
                out[33 + outpos] = ((in[13 + inpos] >>> 26) & 67108863L);
                out[34 + outpos] = (in[13 + inpos] >>> 52)
                        | ((in[14 + inpos] & 16383L) << (26 - 14));
                out[35 + outpos] = ((in[14 + inpos] >>> 14) & 67108863L);
                out[36 + outpos] = (in[14 + inpos] >>> 40)
                        | ((in[15 + inpos] & 3L) << (26 - 2));
                out[37 + outpos] = ((in[15 + inpos] >>> 2) & 67108863L);
                out[38 + outpos] = ((in[15 + inpos] >>> 28) & 67108863L);
                out[39 + outpos] = (in[15 + inpos] >>> 54)
                        | ((in[16 + inpos] & 65535L) << (26 - 16));
                out[40 + outpos] = ((in[16 + inpos] >>> 16) & 67108863L);
                out[41 + outpos] = (in[16 + inpos] >>> 42)
                        | ((in[17 + inpos] & 15L) << (26 - 4));
                out[42 + outpos] = ((in[17 + inpos] >>> 4) & 67108863L);
                out[43 + outpos] = ((in[17 + inpos] >>> 30) & 67108863L);
                out[44 + outpos] = (in[17 + inpos] >>> 56)
                        | ((in[18 + inpos] & 262143L) << (26 - 18));
                out[45 + outpos] = ((in[18 + inpos] >>> 18) & 67108863L);
                out[46 + outpos] = (in[18 + inpos] >>> 44)
                        | ((in[19 + inpos] & 63L) << (26 - 6));
                out[47 + outpos] = ((in[19 + inpos] >>> 6) & 67108863L);
                out[48 + outpos] = ((in[19 + inpos] >>> 32) & 67108863L);
                out[49 + outpos] = (in[19 + inpos] >>> 58)
                        | ((in[20 + inpos] & 1048575L) << (26 - 20));
                out[50 + outpos] = ((in[20 + inpos] >>> 20) & 67108863L);
                out[51 + outpos] = (in[20 + inpos] >>> 46)
                        | ((in[21 + inpos] & 255L) << (26 - 8));
                out[52 + outpos] = ((in[21 + inpos] >>> 8) & 67108863L);
                out[53 + outpos] = ((in[21 + inpos] >>> 34) & 67108863L);
                out[54 + outpos] = (in[21 + inpos] >>> 60)
                        | ((in[22 + inpos] & 4194303L) << (26 - 22));
                out[55 + outpos] = ((in[22 + inpos] >>> 22) & 67108863L);
                out[56 + outpos] = (in[22 + inpos] >>> 48)
                        | ((in[23 + inpos] & 1023L) << (26 - 10));
                out[57 + outpos] = ((in[23 + inpos] >>> 10) & 67108863L);
                out[58 + outpos] = ((in[23 + inpos] >>> 36) & 67108863L);
                out[59 + outpos] = (in[23 + inpos] >>> 62)
                        | ((in[24 + inpos] & 16777215L) << (26 - 24));
                out[60 + outpos] = ((in[24 + inpos] >>> 24) & 67108863L);
                out[61 + outpos] = (in[24 + inpos] >>> 50)
                        | ((in[25 + inpos] & 4095L) << (26 - 12));
                out[62 + outpos] = ((in[25 + inpos] >>> 12) & 67108863L);
                out[63 + outpos] = (in[25 + inpos] >>> 38);
        }

        protected static void fastunpack27(final long[] in, int inpos,
                final long[] out, int outpos) {
                out[outpos] = (in[inpos] & 134217727L);
                out[1 + outpos] = ((in[inpos] >>> 27) & 134217727L);
                out[2 + outpos] = (in[inpos] >>> 54)
                        | ((in[1 + inpos] & 131071L) << (27 - 17));
                out[3 + outpos] = ((in[1 + inpos] >>> 17) & 134217727L);
                out[4 + outpos] = (in[1 + inpos] >>> 44)
                        | ((in[2 + inpos] & 127L) << (27 - 7));
                out[5 + outpos] = ((in[2 + inpos] >>> 7) & 134217727L);
                out[6 + outpos] = ((in[2 + inpos] >>> 34) & 134217727L);
                out[7 + outpos] = (in[2 + inpos] >>> 61)
                        | ((in[3 + inpos] & 16777215L) << (27 - 24));
                out[8 + outpos] = ((in[3 + inpos] >>> 24) & 134217727L);
                out[9 + outpos] = (in[3 + inpos] >>> 51)
                        | ((in[4 + inpos] & 16383L) << (27 - 14));
                out[10 + outpos] = ((in[4 + inpos] >>> 14) & 134217727L);
                out[11 + outpos] = (in[4 + inpos] >>> 41)
                        | ((in[5 + inpos] & 15L) << (27 - 4));
                out[12 + outpos] = ((in[5 + inpos] >>> 4) & 134217727L);
                out[13 + outpos] = ((in[5 + inpos] >>> 31) & 134217727L);
                out[14 + outpos] = (in[5 + inpos] >>> 58)
                        | ((in[6 + inpos] & 2097151L) << (27 - 21));
                out[15 + outpos] = ((in[6 + inpos] >>> 21) & 134217727L);
                out[16 + outpos] = (in[6 + inpos] >>> 48)
                        | ((in[7 + inpos] & 2047L) << (27 - 11));
                out[17 + outpos] = ((in[7 + inpos] >>> 11) & 134217727L);
                out[18 + outpos] = (in[7 + inpos] >>> 38)
                        | ((in[8 + inpos] & 1L) << (27 - 1));
                out[19 + outpos] = ((in[8 + inpos] >>> 1) & 134217727L);
                out[20 + outpos] = ((in[8 + inpos] >>> 28) & 134217727L);
                out[21 + outpos] = (in[8 + inpos] >>> 55)
                        | ((in[9 + inpos] & 262143L) << (27 - 18));
                out[22 + outpos] = ((in[9 + inpos] >>> 18) & 134217727L);
                out[23 + outpos] = (in[9 + inpos] >>> 45)
                        | ((in[10 + inpos] & 255L) << (27 - 8));
                out[24 + outpos] = ((in[10 + inpos] >>> 8) & 134217727L);
                out[25 + outpos] = ((in[10 + inpos] >>> 35) & 134217727L);
                out[26 + outpos] = (in[10 + inpos] >>> 62)
                        | ((in[11 + inpos] & 33554431L) << (27 - 25));
                out[27 + outpos] = ((in[11 + inpos] >>> 25) & 134217727L);
                out[28 + outpos] = (in[11 + inpos] >>> 52)
                        | ((in[12 + inpos] & 32767L) << (27 - 15));
                out[29 + outpos] = ((in[12 + inpos] >>> 15) & 134217727L);
                out[30 + outpos] = (in[12 + inpos] >>> 42)
                        | ((in[13 + inpos] & 31L) << (27 - 5));
                out[31 + outpos] = ((in[13 + inpos] >>> 5) & 134217727L);
                out[32 + outpos] = ((in[13 + inpos] >>> 32) & 134217727L);
                out[33 + outpos] = (in[13 + inpos] >>> 59)
                        | ((in[14 + inpos] & 4194303L) << (27 - 22));
                out[34 + outpos] = ((in[14 + inpos] >>> 22) & 134217727L);
                out[35 + outpos] = (in[14 + inpos] >>> 49)
                        | ((in[15 + inpos] & 4095L) << (27 - 12));
                out[36 + outpos] = ((in[15 + inpos] >>> 12) & 134217727L);
                out[37 + outpos] = (in[15 + inpos] >>> 39)
                        | ((in[16 + inpos] & 3L) << (27 - 2));
                out[38 + outpos] = ((in[16 + inpos] >>> 2) & 134217727L);
                out[39 + outpos] = ((in[16 + inpos] >>> 29) & 134217727L);
                out[40 + outpos] = (in[16 + inpos] >>> 56)
                        | ((in[17 + inpos] & 524287L) << (27 - 19));
                out[41 + outpos] = ((in[17 + inpos] >>> 19) & 134217727L);
                out[42 + outpos] = (in[17 + inpos] >>> 46)
                        | ((in[18 + inpos] & 511L) << (27 - 9));
                out[43 + outpos] = ((in[18 + inpos] >>> 9) & 134217727L);
                out[44 + outpos] = ((in[18 + inpos] >>> 36) & 134217727L);
                out[45 + outpos] = (in[18 + inpos] >>> 63)
                        | ((in[19 + inpos] & 67108863L) << (27 - 26));
                out[46 + outpos] = ((in[19 + inpos] >>> 26) & 134217727L);
                out[47 + outpos] = (in[19 + inpos] >>> 53)
                        | ((in[20 + inpos] & 65535L) << (27 - 16));
                out[48 + outpos] = ((in[20 + inpos] >>> 16) & 134217727L);
                out[49 + outpos] = (in[20 + inpos] >>> 43)
                        | ((in[21 + inpos] & 63L) << (27 - 6));
                out[50 + outpos] = ((in[21 + inpos] >>> 6) & 134217727L);
                out[51 + outpos] = ((in[21 + inpos] >>> 33) & 134217727L);
                out[52 + outpos] = (in[21 + inpos] >>> 60)
                        | ((in[22 + inpos] & 8388607L) << (27 - 23));
                out[53 + outpos] = ((in[22 + inpos] >>> 23) & 134217727L);
                out[54 + outpos] = (in[22 + inpos] >>> 50)
                        | ((in[23 + inpos] & 8191L) << (27 - 13));
                out[55 + outpos] = ((in[23 + inpos] >>> 13) & 134217727L);
                out[56 + outpos] = (in[23 + inpos] >>> 40)
                        | ((in[24 + inpos] & 7L) << (27 - 3));
                out[57 + outpos] = ((in[24 + inpos] >>> 3) & 134217727L);
                out[58 + outpos] = ((in[24 + inpos] >>> 30) & 134217727L);
                out[59 + outpos] = (in[24 + inpos] >>> 57)
                        | ((in[25 + inpos] & 1048575L) << (27 - 20));
                out[60 + outpos] = ((in[25 + inpos] >>> 20) & 134217727L);
                out[61 + outpos] = (in[25 + inpos] >>> 47)
                        | ((in[26 + inpos] & 1023L) << (27 - 10));
                out[62 + outpos] = ((in[26 + inpos] >>> 10) & 134217727L);
                out[63 + outpos] = (in[26 + inpos] >>> 37);
        }

        protected static void fastunpack28(final long[] in, int inpos,
                final long[] out, int outpos) {
                out[outpos] = (in[inpos] & 268435455L);
                out[1 + outpos] = ((in[inpos] >>> 28) & 268435455L);
                out[2 + outpos] = (in[inpos] >>> 56)
                        | ((in[1 + inpos] & 1048575L) << (28 - 20));
                out[3 + outpos] = ((in[1 + inpos] >>> 20) & 268435455L);
                out[4 + outpos] = (in[1 + inpos] >>> 48)
                        | ((in[2 + inpos] & 4095L) << (28 - 12));
                out[5 + outpos] = ((in[2 + inpos] >>> 12) & 268435455L);
                out[6 + outpos] = (in[2 + inpos] >>> 40)
                        | ((in[3 + inpos] & 15L) << (28 - 4));
                out[7 + outpos] = ((in[3 + inpos] >>> 4) & 268435455L);
                out[8 + outpos] = ((in[3 + inpos] >>> 32) & 268435455L);
                out[9 + outpos] = (in[3 + inpos] >>> 60)
                        | ((in[4 + inpos] & 16777215L) << (28 - 24));
                out[10 + outpos] = ((in[4 + inpos] >>> 24) & 268435455L);
                out[11 + outpos] = (in[4 + inpos] >>> 52)
                        | ((in[5 + inpos] & 65535L) << (28 - 16));
                out[12 + outpos] = ((in[5 + inpos] >>> 16) & 268435455L);
                out[13 + outpos] = (in[5 + inpos] >>> 44)
                        | ((in[6 + inpos] & 255L) << (28 - 8));
                out[14 + outpos] = ((in[6 + inpos] >>> 8) & 268435455L);
                out[15 + outpos] = (in[6 + inpos] >>> 36);
                out[16 + outpos] = (in[7 + inpos] & 268435455L);
                out[17 + outpos] = ((in[7 + inpos] >>> 28) & 268435455L);
                out[18 + outpos] = (in[7 + inpos] >>> 56)
                        | ((in[8 + inpos] & 1048575L) << (28 - 20));
                out[19 + outpos] = ((in[8 + inpos] >>> 20) & 268435455L);
                out[20 + outpos] = (in[8 + inpos] >>> 48)
                        | ((in[9 + inpos] & 4095L) << (28 - 12));
                out[21 + outpos] = ((in[9 + inpos] >>> 12) & 268435455L);
                out[22 + outpos] = (in[9 + inpos] >>> 40)
                        | ((in[10 + inpos] & 15L) << (28 - 4));
                out[23 + outpos] = ((in[10 + inpos] >>> 4) & 268435455L);
                out[24 + outpos] = ((in[10 + inpos] >>> 32) & 268435455L);
                out[25 + outpos] = (in[10 + inpos] >>> 60)
                        | ((in[11 + inpos] & 16777215L) << (28 - 24));
                out[26 + outpos] = ((in[11 + inpos] >>> 24) & 268435455L);
                out[27 + outpos] = (in[11 + inpos] >>> 52)
                        | ((in[12 + inpos] & 65535L) << (28 - 16));
                out[28 + outpos] = ((in[12 + inpos] >>> 16) & 268435455L);
                out[29 + outpos] = (in[12 + inpos] >>> 44)
                        | ((in[13 + inpos] & 255L) << (28 - 8));
                out[30 + outpos] = ((in[13 + inpos] >>> 8) & 268435455L);
                out[31 + outpos] = (in[13 + inpos] >>> 36);
                out[32 + outpos] = (in[14 + inpos] & 268435455L);
                out[33 + outpos] = ((in[14 + inpos] >>> 28) & 268435455L);
                out[34 + outpos] = (in[14 + inpos] >>> 56)
                        | ((in[15 + inpos] & 1048575L) << (28 - 20));
                out[35 + outpos] = ((in[15 + inpos] >>> 20) & 268435455L);
                out[36 + outpos] = (in[15 + inpos] >>> 48)
                        | ((in[16 + inpos] & 4095L) << (28 - 12));
                out[37 + outpos] = ((in[16 + inpos] >>> 12) & 268435455L);
                out[38 + outpos] = (in[16 + inpos] >>> 40)
                        | ((in[17 + inpos] & 15L) << (28 - 4));
                out[39 + outpos] = ((in[17 + inpos] >>> 4) & 268435455L);
                out[40 + outpos] = ((in[17 + inpos] >>> 32) & 268435455L);
                out[41 + outpos] = (in[17 + inpos] >>> 60)
                        | ((in[18 + inpos] & 16777215L) << (28 - 24));
                out[42 + outpos] = ((in[18 + inpos] >>> 24) & 268435455L);
                out[43 + outpos] = (in[18 + inpos] >>> 52)
                        | ((in[19 + inpos] & 65535L) << (28 - 16));
                out[44 + outpos] = ((in[19 + inpos] >>> 16) & 268435455L);
                out[45 + outpos] = (in[19 + inpos] >>> 44)
                        | ((in[20 + inpos] & 255L) << (28 - 8));
                out[46 + outpos] = ((in[20 + inpos] >>> 8) & 268435455L);
                out[47 + outpos] = (in[20 + inpos] >>> 36);
                out[48 + outpos] = (in[21 + inpos] & 268435455L);
                out[49 + outpos] = ((in[21 + inpos] >>> 28) & 268435455L);
                out[50 + outpos] = (in[21 + inpos] >>> 56)
                        | ((in[22 + inpos] & 1048575L) << (28 - 20));
                out[51 + outpos] = ((in[22 + inpos] >>> 20) & 268435455L);
                out[52 + outpos] = (in[22 + inpos] >>> 48)
                        | ((in[23 + inpos] & 4095L) << (28 - 12));
                out[53 + outpos] = ((in[23 + inpos] >>> 12) & 268435455L);
                out[54 + outpos] = (in[23 + inpos] >>> 40)
                        | ((in[24 + inpos] & 15L) << (28 - 4));
                out[55 + outpos] = ((in[24 + inpos] >>> 4) & 268435455L);
                out[56 + outpos] = ((in[24 + inpos] >>> 32) & 268435455L);
                out[57 + outpos] = (in[24 + inpos] >>> 60)
                        | ((in[25 + inpos] & 16777215L) << (28 - 24));
                out[58 + outpos] = ((in[25 + inpos] >>> 24) & 268435455L);
                out[59 + outpos] = (in[25 + inpos] >>> 52)
                        | ((in[26 + inpos] & 65535L) << (28 - 16));
                out[60 + outpos] = ((in[26 + inpos] >>> 16) & 268435455L);
                out[61 + outpos] = (in[26 + inpos] >>> 44)
                        | ((in[27 + inpos] & 255L) << (28 - 8));
                out[62 + outpos] = ((in[27 + inpos] >>> 8) & 268435455L);
                out[63 + outpos] = (in[27 + inpos] >>> 36);
        }

        protected static void fastunpack29(final long[] in, int inpos,
                final long[] out, int outpos) {
                out[outpos] = (in[inpos] & 536870911L);
                out[1 + outpos] = ((in[inpos] >>> 29) & 536870911L);
                out[2 + outpos] = (in[inpos] >>> 58)
                        | ((in[1 + inpos] & 8388607L) << (29 - 23));
                out[3 + outpos] = ((in[1 + inpos] >>> 23) & 536870911L);
                out[4 + outpos] = (in[1 + inpos] >>> 52)
                        | ((in[2 + inpos] & 131071L) << (29 - 17));
                out[5 + outpos] = ((in[2 + inpos] >>> 17) & 536870911L);
                out[6 + outpos] = (in[2 + inpos] >>> 46)
                        | ((in[3 + inpos] & 2047L) << (29 - 11));
                out[7 + outpos] = ((in[3 + inpos] >>> 11) & 536870911L);
                out[8 + outpos] = (in[3 + inpos] >>> 40)
                        | ((in[4 + inpos] & 31L) << (29 - 5));
                out[9 + outpos] = ((in[4 + inpos] >>> 5) & 536870911L);
                out[10 + outpos] = ((in[4 + inpos] >>> 34) & 536870911L);
                out[11 + outpos] = (in[4 + inpos] >>> 63)
                        | ((in[5 + inpos] & 268435455L) << (29 - 28));
                out[12 + outpos] = ((in[5 + inpos] >>> 28) & 536870911L);
                out[13 + outpos] = (in[5 + inpos] >>> 57)
                        | ((in[6 + inpos] & 4194303L) << (29 - 22));
                out[14 + outpos] = ((in[6 + inpos] >>> 22) & 536870911L);
                out[15 + outpos] = (in[6 + inpos] >>> 51)
                        | ((in[7 + inpos] & 65535L) << (29 - 16));
                out[16 + outpos] = ((in[7 + inpos] >>> 16) & 536870911L);
                out[17 + outpos] = (in[7 + inpos] >>> 45)
                        | ((in[8 + inpos] & 1023L) << (29 - 10));
                out[18 + outpos] = ((in[8 + inpos] >>> 10) & 536870911L);
                out[19 + outpos] = (in[8 + inpos] >>> 39)
                        | ((in[9 + inpos] & 15L) << (29 - 4));
                out[20 + outpos] = ((in[9 + inpos] >>> 4) & 536870911L);
                out[21 + outpos] = ((in[9 + inpos] >>> 33) & 536870911L);
                out[22 + outpos] = (in[9 + inpos] >>> 62)
                        | ((in[10 + inpos] & 134217727L) << (29 - 27));
                out[23 + outpos] = ((in[10 + inpos] >>> 27) & 536870911L);
                out[24 + outpos] = (in[10 + inpos] >>> 56)
                        | ((in[11 + inpos] & 2097151L) << (29 - 21));
                out[25 + outpos] = ((in[11 + inpos] >>> 21) & 536870911L);
                out[26 + outpos] = (in[11 + inpos] >>> 50)
                        | ((in[12 + inpos] & 32767L) << (29 - 15));
                out[27 + outpos] = ((in[12 + inpos] >>> 15) & 536870911L);
                out[28 + outpos] = (in[12 + inpos] >>> 44)
                        | ((in[13 + inpos] & 511L) << (29 - 9));
                out[29 + outpos] = ((in[13 + inpos] >>> 9) & 536870911L);
                out[30 + outpos] = (in[13 + inpos] >>> 38)
                        | ((in[14 + inpos] & 7L) << (29 - 3));
                out[31 + outpos] = ((in[14 + inpos] >>> 3) & 536870911L);
                out[32 + outpos] = ((in[14 + inpos] >>> 32) & 536870911L);
                out[33 + outpos] = (in[14 + inpos] >>> 61)
                        | ((in[15 + inpos] & 67108863L) << (29 - 26));
                out[34 + outpos] = ((in[15 + inpos] >>> 26) & 536870911L);
                out[35 + outpos] = (in[15 + inpos] >>> 55)
                        | ((in[16 + inpos] & 1048575L) << (29 - 20));
                out[36 + outpos] = ((in[16 + inpos] >>> 20) & 536870911L);
                out[37 + outpos] = (in[16 + inpos] >>> 49)
                        | ((in[17 + inpos] & 16383L) << (29 - 14));
                out[38 + outpos] = ((in[17 + inpos] >>> 14) & 536870911L);
                out[39 + outpos] = (in[17 + inpos] >>> 43)
                        | ((in[18 + inpos] & 255L) << (29 - 8));
                out[40 + outpos] = ((in[18 + inpos] >>> 8) & 536870911L);
                out[41 + outpos] = (in[18 + inpos] >>> 37)
                        | ((in[19 + inpos] & 3L) << (29 - 2));
                out[42 + outpos] = ((in[19 + inpos] >>> 2) & 536870911L);
                out[43 + outpos] = ((in[19 + inpos] >>> 31) & 536870911L);
                out[44 + outpos] = (in[19 + inpos] >>> 60)
                        | ((in[20 + inpos] & 33554431L) << (29 - 25));
                out[45 + outpos] = ((in[20 + inpos] >>> 25) & 536870911L);
                out[46 + outpos] = (in[20 + inpos] >>> 54)
                        | ((in[21 + inpos] & 524287L) << (29 - 19));
                out[47 + outpos] = ((in[21 + inpos] >>> 19) & 536870911L);
                out[48 + outpos] = (in[21 + inpos] >>> 48)
                        | ((in[22 + inpos] & 8191L) << (29 - 13));
                out[49 + outpos] = ((in[22 + inpos] >>> 13) & 536870911L);
                out[50 + outpos] = (in[22 + inpos] >>> 42)
                        | ((in[23 + inpos] & 127L) << (29 - 7));
                out[51 + outpos] = ((in[23 + inpos] >>> 7) & 536870911L);
                out[52 + outpos] = (in[23 + inpos] >>> 36)
                        | ((in[24 + inpos] & 1L) << (29 - 1));
                out[53 + outpos] = ((in[24 + inpos] >>> 1) & 536870911L);
                out[54 + outpos] = ((in[24 + inpos] >>> 30) & 536870911L);
                out[55 + outpos] = (in[24 + inpos] >>> 59)
                        | ((in[25 + inpos] & 16777215L) << (29 - 24));
                out[56 + outpos] = ((in[25 + inpos] >>> 24) & 536870911L);
                out[57 + outpos] = (in[25 + inpos] >>> 53)
                        | ((in[26 + inpos] & 262143L) << (29 - 18));
                out[58 + outpos] = ((in[26 + inpos] >>> 18) & 536870911L);
                out[59 + outpos] = (in[26 + inpos] >>> 47)
                        | ((in[27 + inpos] & 4095L) << (29 - 12));
                out[60 + outpos] = ((in[27 + inpos] >>> 12) & 536870911L);
                out[61 + outpos] = (in[27 + inpos] >>> 41)
                        | ((in[28 + inpos] & 63L) << (29 - 6));
                out[62 + outpos] = ((in[28 + inpos] >>> 6) & 536870911L);
                out[63 + outpos] = (in[28 + inpos] >>> 35);
        }

        protected static void fastunpack30(final long[] in, int inpos,
                final long[] out, int outpos) {
                out[outpos] = (in[inpos] & 1073741823L);
                out[1 + outpos] = ((in[inpos] >>> 30) & 1073741823L);
                out[2 + outpos] = (in[inpos] >>> 60)
                        | ((in[1 + inpos] & 67108863L) << (30 - 26));
                out[3 + outpos] = ((in[1 + inpos] >>> 26) & 1073741823L);
                out[4 + outpos] = (in[1 + inpos] >>> 56)
                        | ((in[2 + inpos] & 4194303L) << (30 - 22));
                out[5 + outpos] = ((in[2 + inpos] >>> 22) & 1073741823L);
                out[6 + outpos] = (in[2 + inpos] >>> 52)
                        | ((in[3 + inpos] & 262143L) << (30 - 18));
                out[7 + outpos] = ((in[3 + inpos] >>> 18) & 1073741823L);
                out[8 + outpos] = (in[3 + inpos] >>> 48)
                        | ((in[4 + inpos] & 16383L) << (30 - 14));
                out[9 + outpos] = ((in[4 + inpos] >>> 14) & 1073741823L);
                out[10 + outpos] = (in[4 + inpos] >>> 44)
                        | ((in[5 + inpos] & 1023L) << (30 - 10));
                out[11 + outpos] = ((in[5 + inpos] >>> 10) & 1073741823L);
                out[12 + outpos] = (in[5 + inpos] >>> 40)
                        | ((in[6 + inpos] & 63L) << (30 - 6));
                out[13 + outpos] = ((in[6 + inpos] >>> 6) & 1073741823L);
                out[14 + outpos] = (in[6 + inpos] >>> 36)
                        | ((in[7 + inpos] & 3L) << (30 - 2));
                out[15 + outpos] = ((in[7 + inpos] >>> 2) & 1073741823L);
                out[16 + outpos] = ((in[7 + inpos] >>> 32) & 1073741823L);
                out[17 + outpos] = (in[7 + inpos] >>> 62)
                        | ((in[8 + inpos] & 268435455L) << (30 - 28));
                out[18 + outpos] = ((in[8 + inpos] >>> 28) & 1073741823L);
                out[19 + outpos] = (in[8 + inpos] >>> 58)
                        | ((in[9 + inpos] & 16777215L) << (30 - 24));
                out[20 + outpos] = ((in[9 + inpos] >>> 24) & 1073741823L);
                out[21 + outpos] = (in[9 + inpos] >>> 54)
                        | ((in[10 + inpos] & 1048575L) << (30 - 20));
                out[22 + outpos] = ((in[10 + inpos] >>> 20) & 1073741823L);
                out[23 + outpos] = (in[10 + inpos] >>> 50)
                        | ((in[11 + inpos] & 65535L) << (30 - 16));
                out[24 + outpos] = ((in[11 + inpos] >>> 16) & 1073741823L);
                out[25 + outpos] = (in[11 + inpos] >>> 46)
                        | ((in[12 + inpos] & 4095L) << (30 - 12));
                out[26 + outpos] = ((in[12 + inpos] >>> 12) & 1073741823L);
                out[27 + outpos] = (in[12 + inpos] >>> 42)
                        | ((in[13 + inpos] & 255L) << (30 - 8));
                out[28 + outpos] = ((in[13 + inpos] >>> 8) & 1073741823L);
                out[29 + outpos] = (in[13 + inpos] >>> 38)
                        | ((in[14 + inpos] & 15L) << (30 - 4));
                out[30 + outpos] = ((in[14 + inpos] >>> 4) & 1073741823L);
                out[31 + outpos] = (in[14 + inpos] >>> 34);
                out[32 + outpos] = (in[15 + inpos] & 1073741823L);
                out[33 + outpos] = ((in[15 + inpos] >>> 30) & 1073741823L);
                out[34 + outpos] = (in[15 + inpos] >>> 60)
                        | ((in[16 + inpos] & 67108863L) << (30 - 26));
                out[35 + outpos] = ((in[16 + inpos] >>> 26) & 1073741823L);
                out[36 + outpos] = (in[16 + inpos] >>> 56)
                        | ((in[17 + inpos] & 4194303L) << (30 - 22));
                out[37 + outpos] = ((in[17 + inpos] >>> 22) & 1073741823L);
                out[38 + outpos] = (in[17 + inpos] >>> 52)
                        | ((in[18 + inpos] & 262143L) << (30 - 18));
                out[39 + outpos] = ((in[18 + inpos] >>> 18) & 1073741823L);
                out[40 + outpos] = (in[18 + inpos] >>> 48)
                        | ((in[19 + inpos] & 16383L) << (30 - 14));
                out[41 + outpos] = ((in[19 + inpos] >>> 14) & 1073741823L);
                out[42 + outpos] = (in[19 + inpos] >>> 44)
                        | ((in[20 + inpos] & 1023L) << (30 - 10));
                out[43 + outpos] = ((in[20 + inpos] >>> 10) & 1073741823L);
                out[44 + outpos] = (in[20 + inpos] >>> 40)
                        | ((in[21 + inpos] & 63L) << (30 - 6));
                out[45 + outpos] = ((in[21 + inpos] >>> 6) & 1073741823L);
                out[46 + outpos] = (in[21 + inpos] >>> 36)
                        | ((in[22 + inpos] & 3L) << (30 - 2));
                out[47 + outpos] = ((in[22 + inpos] >>> 2) & 1073741823L);
                out[48 + outpos] = ((in[22 + inpos] >>> 32) & 1073741823L);
                out[49 + outpos] = (in[22 + inpos] >>> 62)
                        | ((in[23 + inpos] & 268435455L) << (30 - 28));
                out[50 + outpos] = ((in[23 + inpos] >>> 28) & 1073741823L);
                out[51 + outpos] = (in[23 + inpos] >>> 58)
                        | ((in[24 + inpos] & 16777215L) << (30 - 24));
                out[52 + outpos] = ((in[24 + inpos] >>> 24) & 1073741823L);
                out[53 + outpos] = (in[24 + inpos] >>> 54)
                        | ((in[25 + inpos] & 1048575L) << (30 - 20));
                out[54 + outpos] = ((in[25 + inpos] >>> 20) & 1073741823L);
                out[55 + outpos] = (in[25 + inpos] >>> 50)
                        | ((in[26 + inpos] & 65535L) << (30 - 16));
                out[56 + outpos] = ((in[26 + inpos] >>> 16) & 1073741823L);
                out[57 + outpos] = (in[26 + inpos] >>> 46)
                        | ((in[27 + inpos] & 4095L) << (30 - 12));
                out[58 + outpos] = ((in[27 + inpos] >>> 12) & 1073741823L);
                out[59 + outpos] = (in[27 + inpos] >>> 42)
                        | ((in[28 + inpos] & 255L) << (30 - 8));
                out[60 + outpos] = ((in[28 + inpos] >>> 8) & 1073741823L);
                out[61 + outpos] = (in[28 + inpos] >>> 38)
                        | ((in[29 + inpos] & 15L) << (30 - 4));
                out[62 + outpos] = ((in[29 + inpos] >>> 4) & 1073741823L);
                out[63 + outpos] = (in[29 + inpos] >>> 34);
        }

        protected static void fastunpack31(final long[] in, int inpos,
                final long[] out, int outpos) {
                out[outpos] = (in[inpos] & 2147483647L);
                out[1 + outpos] = ((in[inpos] >>> 31) & 2147483647L);
                out[2 + outpos] = (in[inpos] >>> 62)
                        | ((in[1 + inpos] & 536870911L) << (31 - 29));
                out[3 + outpos] = ((in[1 + inpos] >>> 29) & 2147483647L);
                out[4 + outpos] = (in[1 + inpos] >>> 60)
                        | ((in[2 + inpos] & 134217727L) << (31 - 27));
                out[5 + outpos] = ((in[2 + inpos] >>> 27) & 2147483647L);
                out[6 + outpos] = (in[2 + inpos] >>> 58)
                        | ((in[3 + inpos] & 33554431L) << (31 - 25));
                out[7 + outpos] = ((in[3 + inpos] >>> 25) & 2147483647L);
                out[8 + outpos] = (in[3 + inpos] >>> 56)
                        | ((in[4 + inpos] & 8388607L) << (31 - 23));
                out[9 + outpos] = ((in[4 + inpos] >>> 23) & 2147483647L);
                out[10 + outpos] = (in[4 + inpos] >>> 54)
                        | ((in[5 + inpos] & 2097151L) << (31 - 21));
                out[11 + outpos] = ((in[5 + inpos] >>> 21) & 2147483647L);
                out[12 + outpos] = (in[5 + inpos] >>> 52)
                        | ((in[6 + inpos] & 524287L) << (31 - 19));
                out[13 + outpos] = ((in[6 + inpos] >>> 19) & 2147483647L);
                out[14 + outpos] = (in[6 + inpos] >>> 50)
                        | ((in[7 + inpos] & 131071L) << (31 - 17));
                out[15 + outpos] = ((in[7 + inpos] >>> 17) & 2147483647L);
                out[16 + outpos] = (in[7 + inpos] >>> 48)
                        | ((in[8 + inpos] & 32767L) << (31 - 15));
                out[17 + outpos] = ((in[8 + inpos] >>> 15) & 2147483647L);
                out[18 + outpos] = (in[8 + inpos] >>> 46)
                        | ((in[9 + inpos] & 8191L) << (31 - 13));
                out[19 + outpos] = ((in[9 + inpos] >>> 13) & 2147483647L);
                out[20 + outpos] = (in[9 + inpos] >>> 44)
                        | ((in[10 + inpos] & 2047L) << (31 - 11));
                out[21 + outpos] = ((in[10 + inpos] >>> 11) & 2147483647L);
                out[22 + outpos] = (in[10 + inpos] >>> 42)
                        | ((in[11 + inpos] & 511L) << (31 - 9));
                out[23 + outpos] = ((in[11 + inpos] >>> 9) & 2147483647L);
                out[24 + outpos] = (in[11 + inpos] >>> 40)
                        | ((in[12 + inpos] & 127L) << (31 - 7));
                out[25 + outpos] = ((in[12 + inpos] >>> 7) & 2147483647L);
                out[26 + outpos] = (in[12 + inpos] >>> 38)
                        | ((in[13 + inpos] & 31L) << (31 - 5));
                out[27 + outpos] = ((in[13 + inpos] >>> 5) & 2147483647L);
                out[28 + outpos] = (in[13 + inpos] >>> 36)
                        | ((in[14 + inpos] & 7L) << (31 - 3));
                out[29 + outpos] = ((in[14 + inpos] >>> 3) & 2147483647L);
                out[30 + outpos] = (in[14 + inpos] >>> 34)
                        | ((in[15 + inpos] & 1L) << (31 - 1));
                out[31 + outpos] = ((in[15 + inpos] >>> 1) & 2147483647L);
                out[32 + outpos] = ((in[15 + inpos] >>> 32) & 2147483647L);
                out[33 + outpos] = (in[15 + inpos] >>> 63)
                        | ((in[16 + inpos] & 1073741823L) << (31 - 30));
                out[34 + outpos] = ((in[16 + inpos] >>> 30) & 2147483647L);
                out[35 + outpos] = (in[16 + inpos] >>> 61)
                        | ((in[17 + inpos] & 268435455L) << (31 - 28));
                out[36 + outpos] = ((in[17 + inpos] >>> 28) & 2147483647L);
                out[37 + outpos] = (in[17 + inpos] >>> 59)
                        | ((in[18 + inpos] & 67108863L) << (31 - 26));
                out[38 + outpos] = ((in[18 + inpos] >>> 26) & 2147483647L);
                out[39 + outpos] = (in[18 + inpos] >>> 57)
                        | ((in[19 + inpos] & 16777215L) << (31 - 24));
                out[40 + outpos] = ((in[19 + inpos] >>> 24) & 2147483647L);
                out[41 + outpos] = (in[19 + inpos] >>> 55)
                        | ((in[20 + inpos] & 4194303L) << (31 - 22));
                out[42 + outpos] = ((in[20 + inpos] >>> 22) & 2147483647L);
                out[43 + outpos] = (in[20 + inpos] >>> 53)
                        | ((in[21 + inpos] & 1048575L) << (31 - 20));
                out[44 + outpos] = ((in[21 + inpos] >>> 20) & 2147483647L);
                out[45 + outpos] = (in[21 + inpos] >>> 51)
                        | ((in[22 + inpos] & 262143L) << (31 - 18));
                out[46 + outpos] = ((in[22 + inpos] >>> 18) & 2147483647L);
                out[47 + outpos] = (in[22 + inpos] >>> 49)
                        | ((in[23 + inpos] & 65535L) << (31 - 16));
                out[48 + outpos] = ((in[23 + inpos] >>> 16) & 2147483647L);
                out[49 + outpos] = (in[23 + inpos] >>> 47)
                        | ((in[24 + inpos] & 16383L) << (31 - 14));
                out[50 + outpos] = ((in[24 + inpos] >>> 14) & 2147483647L);
                out[51 + outpos] = (in[24 + inpos] >>> 45)
                        | ((in[25 + inpos] & 4095L) << (31 - 12));
                out[52 + outpos] = ((in[25 + inpos] >>> 12) & 2147483647L);
                out[53 + outpos] = (in[25 + inpos] >>> 43)
                        | ((in[26 + inpos] & 1023L) << (31 - 10));
                out[54 + outpos] = ((in[26 + inpos] >>> 10) & 2147483647L);
                out[55 + outpos] = (in[26 + inpos] >>> 41)
                        | ((in[27 + inpos] & 255L) << (31 - 8));
                out[56 + outpos] = ((in[27 + inpos] >>> 8) & 2147483647L);
                out[57 + outpos] = (in[27 + inpos] >>> 39)
                        | ((in[28 + inpos] & 63L) << (31 - 6));
                out[58 + outpos] = ((in[28 + inpos] >>> 6) & 2147483647L);
                out[59 + outpos] = (in[28 + inpos] >>> 37)
                        | ((in[29 + inpos] & 15L) << (31 - 4));
                out[60 + outpos] = ((in[29 + inpos] >>> 4) & 2147483647L);
                out[61 + outpos] = (in[29 + inpos] >>> 35)
                        | ((in[30 + inpos] & 3L) << (31 - 2));
                out[62 + outpos] = ((in[30 + inpos] >>> 2) & 2147483647L);
                out[63 + outpos] = (in[30 + inpos] >>> 33);
        }

        protected static void fastunpack32(final long[] in, int inpos,
                final long[] out, int outpos) {
                out[outpos] = (in[inpos] & 4294967295L);
                out[1 + outpos] = (in[inpos] >>> 32);
                out[2 + outpos] = (in[1 + inpos] & 4294967295L);
                out[3 + outpos] = (in[1 + inpos] >>> 32);
                out[4 + outpos] = (in[2 + inpos] & 4294967295L);
                out[5 + outpos] = (in[2 + inpos] >>> 32);
                out[6 + outpos] = (in[3 + inpos] & 4294967295L);
                out[7 + outpos] = (in[3 + inpos] >>> 32);
                out[8 + outpos] = (in[4 + inpos] & 4294967295L);
                out[9 + outpos] = (in[4 + inpos] >>> 32);
                out[10 + outpos] = (in[5 + inpos] & 4294967295L);
                out[11 + outpos] = (in[5 + inpos] >>> 32);
                out[12 + outpos] = (in[6 + inpos] & 4294967295L);
                out[13 + outpos] = (in[6 + inpos] >>> 32);
                out[14 + outpos] = (in[7 + inpos] & 4294967295L);
                out[15 + outpos] = (in[7 + inpos] >>> 32);
                out[16 + outpos] = (in[8 + inpos] & 4294967295L);
                out[17 + outpos] = (in[8 + inpos] >>> 32);
                out[18 + outpos] = (in[9 + inpos] & 4294967295L);
                out[19 + outpos] = (in[9 + inpos] >>> 32);
                out[20 + outpos] = (in[10 + inpos] & 4294967295L);
                out[21 + outpos] = (in[10 + inpos] >>> 32);
                out[22 + outpos] = (in[11 + inpos] & 4294967295L);
                out[23 + outpos] = (in[11 + inpos] >>> 32);
                out[24 + outpos] = (in[12 + inpos] & 4294967295L);
                out[25 + outpos] = (in[12 + inpos] >>> 32);
                out[26 + outpos] = (in[13 + inpos] & 4294967295L);
                out[27 + outpos] = (in[13 + inpos] >>> 32);
                out[28 + outpos] = (in[14 + inpos] & 4294967295L);
                out[29 + outpos] = (in[14 + inpos] >>> 32);
                out[30 + outpos] = (in[15 + inpos] & 4294967295L);
                out[31 + outpos] = (in[15 + inpos] >>> 32);
                out[32 + outpos] = (in[16 + inpos] & 4294967295L);
                out[33 + outpos] = (in[16 + inpos] >>> 32);
                out[34 + outpos] = (in[17 + inpos] & 4294967295L);
                out[35 + outpos] = (in[17 + inpos] >>> 32);
                out[36 + outpos] = (in[18 + inpos] & 4294967295L);
                out[37 + outpos] = (in[18 + inpos] >>> 32);
                out[38 + outpos] = (in[19 + inpos] & 4294967295L);
                out[39 + outpos] = (in[19 + inpos] >>> 32);
                out[40 + outpos] = (in[20 + inpos] & 4294967295L);
                out[41 + outpos] = (in[20 + inpos] >>> 32);
                out[42 + outpos] = (in[21 + inpos] & 4294967295L);
                out[43 + outpos] = (in[21 + inpos] >>> 32);
                out[44 + outpos] = (in[22 + inpos] & 4294967295L);
                out[45 + outpos] = (in[22 + inpos] >>> 32);
                out[46 + outpos] = (in[23 + inpos] & 4294967295L);
                out[47 + outpos] = (in[23 + inpos] >>> 32);
                out[48 + outpos] = (in[24 + inpos] & 4294967295L);
                out[49 + outpos] = (in[24 + inpos] >>> 32);
                out[50 + outpos] = (in[25 + inpos] & 4294967295L);
                out[51 + outpos] = (in[25 + inpos] >>> 32);
                out[52 + outpos] = (in[26 + inpos] & 4294967295L);
                out[53 + outpos] = (in[26 + inpos] >>> 32);
                out[54 + outpos] = (in[27 + inpos] & 4294967295L);
                out[55 + outpos] = (in[27 + inpos] >>> 32);
                out[56 + outpos] = (in[28 + inpos] & 4294967295L);
                out[57 + outpos] = (in[28 + inpos] >>> 32);
                out[58 + outpos] = (in[29 + inpos] & 4294967295L);
                out[59 + outpos] = (in[29 + inpos] >>> 32);
                out[60 + outpos] = (in[30 + inpos] & 4294967295L);
                out[61 + outpos] = (in[30 + inpos] >>> 32);
                out[62 + outpos] = (in[31 + inpos] & 4294967295L);
                out[63 + outpos] = (in[31 + inpos] >>> 32);
        }

        protected static void fastunpack33(final long[] in, int inpos,
                final long[] out, int outpos) {
                out[outpos] = (in[inpos] & 8589934591L);
                out[1 + outpos] = (in[inpos] >>> 33)
                        | ((in[1 + inpos] & 3L) << (33 - 2));
                out[2 + outpos] = ((in[1 + inpos] >>> 2) & 8589934591L);
                out[3 + outpos] = (in[1 + inpos] >>> 35)
                        | ((in[2 + inpos] & 15L) << (33 - 4));
                out[4 + outpos] = ((in[2 + inpos] >>> 4) & 8589934591L);
                out[5 + outpos] = (in[2 + inpos] >>> 37)
                        | ((in[3 + inpos] & 63L) << (33 - 6));
                out[6 + outpos] = ((in[3 + inpos] >>> 6) & 8589934591L);
                out[7 + outpos] = (in[3 + inpos] >>> 39)
                        | ((in[4 + inpos] & 255L) << (33 - 8));
                out[8 + outpos] = ((in[4 + inpos] >>> 8) & 8589934591L);
                out[9 + outpos] = (in[4 + inpos] >>> 41)
                        | ((in[5 + inpos] & 1023L) << (33 - 10));
                out[10 + outpos] = ((in[5 + inpos] >>> 10) & 8589934591L);
                out[11 + outpos] = (in[5 + inpos] >>> 43)
                        | ((in[6 + inpos] & 4095L) << (33 - 12));
                out[12 + outpos] = ((in[6 + inpos] >>> 12) & 8589934591L);
                out[13 + outpos] = (in[6 + inpos] >>> 45)
                        | ((in[7 + inpos] & 16383L) << (33 - 14));
                out[14 + outpos] = ((in[7 + inpos] >>> 14) & 8589934591L);
                out[15 + outpos] = (in[7 + inpos] >>> 47)
                        | ((in[8 + inpos] & 65535L) << (33 - 16));
                out[16 + outpos] = ((in[8 + inpos] >>> 16) & 8589934591L);
                out[17 + outpos] = (in[8 + inpos] >>> 49)
                        | ((in[9 + inpos] & 262143L) << (33 - 18));
                out[18 + outpos] = ((in[9 + inpos] >>> 18) & 8589934591L);
                out[19 + outpos] = (in[9 + inpos] >>> 51)
                        | ((in[10 + inpos] & 1048575L) << (33 - 20));
                out[20 + outpos] = ((in[10 + inpos] >>> 20) & 8589934591L);
                out[21 + outpos] = (in[10 + inpos] >>> 53)
                        | ((in[11 + inpos] & 4194303L) << (33 - 22));
                out[22 + outpos] = ((in[11 + inpos] >>> 22) & 8589934591L);
                out[23 + outpos] = (in[11 + inpos] >>> 55)
                        | ((in[12 + inpos] & 16777215L) << (33 - 24));
                out[24 + outpos] = ((in[12 + inpos] >>> 24) & 8589934591L);
                out[25 + outpos] = (in[12 + inpos] >>> 57)
                        | ((in[13 + inpos] & 67108863L) << (33 - 26));
                out[26 + outpos] = ((in[13 + inpos] >>> 26) & 8589934591L);
                out[27 + outpos] = (in[13 + inpos] >>> 59)
                        | ((in[14 + inpos] & 268435455L) << (33 - 28));
                out[28 + outpos] = ((in[14 + inpos] >>> 28) & 8589934591L);
                out[29 + outpos] = (in[14 + inpos] >>> 61)
                        | ((in[15 + inpos] & 1073741823L) << (33 - 30));
                out[30 + outpos] = ((in[15 + inpos] >>> 30) & 8589934591L);
                out[31 + outpos] = (in[15 + inpos] >>> 63)
                        | ((in[16 + inpos] & 4294967295L) << (33 - 32));
                out[32 + outpos] = (in[16 + inpos] >>> 32)
                        | ((in[17 + inpos] & 1L) << (33 - 1));
                out[33 + outpos] = ((in[17 + inpos] >>> 1) & 8589934591L);
                out[34 + outpos] = (in[17 + inpos] >>> 34)
                        | ((in[18 + inpos] & 7L) << (33 - 3));
                out[35 + outpos] = ((in[18 + inpos] >>> 3) & 8589934591L);
                out[36 + outpos] = (in[18 + inpos] >>> 36)
                        | ((in[19 + inpos] & 31L) << (33 - 5));
                out[37 + outpos] = ((in[19 + inpos] >>> 5) & 8589934591L);
                out[38 + outpos] = (in[19 + inpos] >>> 38)
                        | ((in[20 + inpos] & 127L) << (33 - 7));
                out[39 + outpos] = ((in[20 + inpos] >>> 7) & 8589934591L);
                out[40 + outpos] = (in[20 + inpos] >>> 40)
                        | ((in[21 + inpos] & 511L) << (33 - 9));
                out[41 + outpos] = ((in[21 + inpos] >>> 9) & 8589934591L);
                out[42 + outpos] = (in[21 + inpos] >>> 42)
                        | ((in[22 + inpos] & 2047L) << (33 - 11));
                out[43 + outpos] = ((in[22 + inpos] >>> 11) & 8589934591L);
                out[44 + outpos] = (in[22 + inpos] >>> 44)
                        | ((in[23 + inpos] & 8191L) << (33 - 13));
                out[45 + outpos] = ((in[23 + inpos] >>> 13) & 8589934591L);
                out[46 + outpos] = (in[23 + inpos] >>> 46)
                        | ((in[24 + inpos] & 32767L) << (33 - 15));
                out[47 + outpos] = ((in[24 + inpos] >>> 15) & 8589934591L);
                out[48 + outpos] = (in[24 + inpos] >>> 48)
                        | ((in[25 + inpos] & 131071L) << (33 - 17));
                out[49 + outpos] = ((in[25 + inpos] >>> 17) & 8589934591L);
                out[50 + outpos] = (in[25 + inpos] >>> 50)
                        | ((in[26 + inpos] & 524287L) << (33 - 19));
                out[51 + outpos] = ((in[26 + inpos] >>> 19) & 8589934591L);
                out[52 + outpos] = (in[26 + inpos] >>> 52)
                        | ((in[27 + inpos] & 2097151L) << (33 - 21));
                out[53 + outpos] = ((in[27 + inpos] >>> 21) & 8589934591L);
                out[54 + outpos] = (in[27 + inpos] >>> 54)
                        | ((in[28 + inpos] & 8388607L) << (33 - 23));
                out[55 + outpos] = ((in[28 + inpos] >>> 23) & 8589934591L);
                out[56 + outpos] = (in[28 + inpos] >>> 56)
                        | ((in[29 + inpos] & 33554431L) << (33 - 25));
                out[57 + outpos] = ((in[29 + inpos] >>> 25) & 8589934591L);
                out[58 + outpos] = (in[29 + inpos] >>> 58)
                        | ((in[30 + inpos] & 134217727L) << (33 - 27));
                out[59 + outpos] = ((in[30 + inpos] >>> 27) & 8589934591L);
                out[60 + outpos] = (in[30 + inpos] >>> 60)
                        | ((in[31 + inpos] & 536870911L) << (33 - 29));
                out[61 + outpos] = ((in[31 + inpos] >>> 29) & 8589934591L);
                out[62 + outpos] = (in[31 + inpos] >>> 62)
                        | ((in[32 + inpos] & 2147483647L) << (33 - 31));
                out[63 + outpos] = (in[32 + inpos] >>> 31);
        }

        protected static void fastunpack34(final long[] in, int inpos,
                final long[] out, int outpos) {
                out[outpos] = (in[inpos] & 17179869183L);
                out[1 + outpos] = (in[inpos] >>> 34)
                        | ((in[1 + inpos] & 15L) << (34 - 4));
                out[2 + outpos] = ((in[1 + inpos] >>> 4) & 17179869183L);
                out[3 + outpos] = (in[1 + inpos] >>> 38)
                        | ((in[2 + inpos] & 255L) << (34 - 8));
                out[4 + outpos] = ((in[2 + inpos] >>> 8) & 17179869183L);
                out[5 + outpos] = (in[2 + inpos] >>> 42)
                        | ((in[3 + inpos] & 4095L) << (34 - 12));
                out[6 + outpos] = ((in[3 + inpos] >>> 12) & 17179869183L);
                out[7 + outpos] = (in[3 + inpos] >>> 46)
                        | ((in[4 + inpos] & 65535L) << (34 - 16));
                out[8 + outpos] = ((in[4 + inpos] >>> 16) & 17179869183L);
                out[9 + outpos] = (in[4 + inpos] >>> 50)
                        | ((in[5 + inpos] & 1048575L) << (34 - 20));
                out[10 + outpos] = ((in[5 + inpos] >>> 20) & 17179869183L);
                out[11 + outpos] = (in[5 + inpos] >>> 54)
                        | ((in[6 + inpos] & 16777215L) << (34 - 24));
                out[12 + outpos] = ((in[6 + inpos] >>> 24) & 17179869183L);
                out[13 + outpos] = (in[6 + inpos] >>> 58)
                        | ((in[7 + inpos] & 268435455L) << (34 - 28));
                out[14 + outpos] = ((in[7 + inpos] >>> 28) & 17179869183L);
                out[15 + outpos] = (in[7 + inpos] >>> 62)
                        | ((in[8 + inpos] & 4294967295L) << (34 - 32));
                out[16 + outpos] = (in[8 + inpos] >>> 32)
                        | ((in[9 + inpos] & 3L) << (34 - 2));
                out[17 + outpos] = ((in[9 + inpos] >>> 2) & 17179869183L);
                out[18 + outpos] = (in[9 + inpos] >>> 36)
                        | ((in[10 + inpos] & 63L) << (34 - 6));
                out[19 + outpos] = ((in[10 + inpos] >>> 6) & 17179869183L);
                out[20 + outpos] = (in[10 + inpos] >>> 40)
                        | ((in[11 + inpos] & 1023L) << (34 - 10));
                out[21 + outpos] = ((in[11 + inpos] >>> 10) & 17179869183L);
                out[22 + outpos] = (in[11 + inpos] >>> 44)
                        | ((in[12 + inpos] & 16383L) << (34 - 14));
                out[23 + outpos] = ((in[12 + inpos] >>> 14) & 17179869183L);
                out[24 + outpos] = (in[12 + inpos] >>> 48)
                        | ((in[13 + inpos] & 262143L) << (34 - 18));
                out[25 + outpos] = ((in[13 + inpos] >>> 18) & 17179869183L);
                out[26 + outpos] = (in[13 + inpos] >>> 52)
                        | ((in[14 + inpos] & 4194303L) << (34 - 22));
                out[27 + outpos] = ((in[14 + inpos] >>> 22) & 17179869183L);
                out[28 + outpos] = (in[14 + inpos] >>> 56)
                        | ((in[15 + inpos] & 67108863L) << (34 - 26));
                out[29 + outpos] = ((in[15 + inpos] >>> 26) & 17179869183L);
                out[30 + outpos] = (in[15 + inpos] >>> 60)
                        | ((in[16 + inpos] & 1073741823L) << (34 - 30));
                out[31 + outpos] = (in[16 + inpos] >>> 30);
                out[32 + outpos] = (in[17 + inpos] & 17179869183L);
                out[33 + outpos] = (in[17 + inpos] >>> 34)
                        | ((in[18 + inpos] & 15L) << (34 - 4));
                out[34 + outpos] = ((in[18 + inpos] >>> 4) & 17179869183L);
                out[35 + outpos] = (in[18 + inpos] >>> 38)
                        | ((in[19 + inpos] & 255L) << (34 - 8));
                out[36 + outpos] = ((in[19 + inpos] >>> 8) & 17179869183L);
                out[37 + outpos] = (in[19 + inpos] >>> 42)
                        | ((in[20 + inpos] & 4095L) << (34 - 12));
                out[38 + outpos] = ((in[20 + inpos] >>> 12) & 17179869183L);
                out[39 + outpos] = (in[20 + inpos] >>> 46)
                        | ((in[21 + inpos] & 65535L) << (34 - 16));
                out[40 + outpos] = ((in[21 + inpos] >>> 16) & 17179869183L);
                out[41 + outpos] = (in[21 + inpos] >>> 50)
                        | ((in[22 + inpos] & 1048575L) << (34 - 20));
                out[42 + outpos] = ((in[22 + inpos] >>> 20) & 17179869183L);
                out[43 + outpos] = (in[22 + inpos] >>> 54)
                        | ((in[23 + inpos] & 16777215L) << (34 - 24));
                out[44 + outpos] = ((in[23 + inpos] >>> 24) & 17179869183L);
                out[45 + outpos] = (in[23 + inpos] >>> 58)
                        | ((in[24 + inpos] & 268435455L) << (34 - 28));
                out[46 + outpos] = ((in[24 + inpos] >>> 28) & 17179869183L);
                out[47 + outpos] = (in[24 + inpos] >>> 62)
                        | ((in[25 + inpos] & 4294967295L) << (34 - 32));
                out[48 + outpos] = (in[25 + inpos] >>> 32)
                        | ((in[26 + inpos] & 3L) << (34 - 2));
                out[49 + outpos] = ((in[26 + inpos] >>> 2) & 17179869183L);
                out[50 + outpos] = (in[26 + inpos] >>> 36)
                        | ((in[27 + inpos] & 63L) << (34 - 6));
                out[51 + outpos] = ((in[27 + inpos] >>> 6) & 17179869183L);
                out[52 + outpos] = (in[27 + inpos] >>> 40)
                        | ((in[28 + inpos] & 1023L) << (34 - 10));
                out[53 + outpos] = ((in[28 + inpos] >>> 10) & 17179869183L);
                out[54 + outpos] = (in[28 + inpos] >>> 44)
                        | ((in[29 + inpos] & 16383L) << (34 - 14));
                out[55 + outpos] = ((in[29 + inpos] >>> 14) & 17179869183L);
                out[56 + outpos] = (in[29 + inpos] >>> 48)
                        | ((in[30 + inpos] & 262143L) << (34 - 18));
                out[57 + outpos] = ((in[30 + inpos] >>> 18) & 17179869183L);
                out[58 + outpos] = (in[30 + inpos] >>> 52)
                        | ((in[31 + inpos] & 4194303L) << (34 - 22));
                out[59 + outpos] = ((in[31 + inpos] >>> 22) & 17179869183L);
                out[60 + outpos] = (in[31 + inpos] >>> 56)
                        | ((in[32 + inpos] & 67108863L) << (34 - 26));
                out[61 + outpos] = ((in[32 + inpos] >>> 26) & 17179869183L);
                out[62 + outpos] = (in[32 + inpos] >>> 60)
                        | ((in[33 + inpos] & 1073741823L) << (34 - 30));
                out[63 + outpos] = (in[33 + inpos] >>> 30);
        }

        protected static void fastunpack35(final long[] in, int inpos,
                final long[] out, int outpos) {
                out[outpos] = (in[inpos] & 34359738367L);
                out[1 + outpos] = (in[inpos] >>> 35)
                        | ((in[1 + inpos] & 63L) << (35 - 6));
                out[2 + outpos] = ((in[1 + inpos] >>> 6) & 34359738367L);
                out[3 + outpos] = (in[1 + inpos] >>> 41)
                        | ((in[2 + inpos] & 4095L) << (35 - 12));
                out[4 + outpos] = ((in[2 + inpos] >>> 12) & 34359738367L);
                out[5 + outpos] = (in[2 + inpos] >>> 47)
                        | ((in[3 + inpos] & 262143L) << (35 - 18));
                out[6 + outpos] = ((in[3 + inpos] >>> 18) & 34359738367L);
                out[7 + outpos] = (in[3 + inpos] >>> 53)
                        | ((in[4 + inpos] & 16777215L) << (35 - 24));
                out[8 + outpos] = ((in[4 + inpos] >>> 24) & 34359738367L);
                out[9 + outpos] = (in[4 + inpos] >>> 59)
                        | ((in[5 + inpos] & 1073741823L) << (35 - 30));
                out[10 + outpos] = (in[5 + inpos] >>> 30)
                        | ((in[6 + inpos] & 1L) << (35 - 1));
                out[11 + outpos] = ((in[6 + inpos] >>> 1) & 34359738367L);
                out[12 + outpos] = (in[6 + inpos] >>> 36)
                        | ((in[7 + inpos] & 127L) << (35 - 7));
                out[13 + outpos] = ((in[7 + inpos] >>> 7) & 34359738367L);
                out[14 + outpos] = (in[7 + inpos] >>> 42)
                        | ((in[8 + inpos] & 8191L) << (35 - 13));
                out[15 + outpos] = ((in[8 + inpos] >>> 13) & 34359738367L);
                out[16 + outpos] = (in[8 + inpos] >>> 48)
                        | ((in[9 + inpos] & 524287L) << (35 - 19));
                out[17 + outpos] = ((in[9 + inpos] >>> 19) & 34359738367L);
                out[18 + outpos] = (in[9 + inpos] >>> 54)
                        | ((in[10 + inpos] & 33554431L) << (35 - 25));
                out[19 + outpos] = ((in[10 + inpos] >>> 25) & 34359738367L);
                out[20 + outpos] = (in[10 + inpos] >>> 60)
                        | ((in[11 + inpos] & 2147483647L) << (35 - 31));
                out[21 + outpos] = (in[11 + inpos] >>> 31)
                        | ((in[12 + inpos] & 3L) << (35 - 2));
                out[22 + outpos] = ((in[12 + inpos] >>> 2) & 34359738367L);
                out[23 + outpos] = (in[12 + inpos] >>> 37)
                        | ((in[13 + inpos] & 255L) << (35 - 8));
                out[24 + outpos] = ((in[13 + inpos] >>> 8) & 34359738367L);
                out[25 + outpos] = (in[13 + inpos] >>> 43)
                        | ((in[14 + inpos] & 16383L) << (35 - 14));
                out[26 + outpos] = ((in[14 + inpos] >>> 14) & 34359738367L);
                out[27 + outpos] = (in[14 + inpos] >>> 49)
                        | ((in[15 + inpos] & 1048575L) << (35 - 20));
                out[28 + outpos] = ((in[15 + inpos] >>> 20) & 34359738367L);
                out[29 + outpos] = (in[15 + inpos] >>> 55)
                        | ((in[16 + inpos] & 67108863L) << (35 - 26));
                out[30 + outpos] = ((in[16 + inpos] >>> 26) & 34359738367L);
                out[31 + outpos] = (in[16 + inpos] >>> 61)
                        | ((in[17 + inpos] & 4294967295L) << (35 - 32));
                out[32 + outpos] = (in[17 + inpos] >>> 32)
                        | ((in[18 + inpos] & 7L) << (35 - 3));
                out[33 + outpos] = ((in[18 + inpos] >>> 3) & 34359738367L);
                out[34 + outpos] = (in[18 + inpos] >>> 38)
                        | ((in[19 + inpos] & 511L) << (35 - 9));
                out[35 + outpos] = ((in[19 + inpos] >>> 9) & 34359738367L);
                out[36 + outpos] = (in[19 + inpos] >>> 44)
                        | ((in[20 + inpos] & 32767L) << (35 - 15));
                out[37 + outpos] = ((in[20 + inpos] >>> 15) & 34359738367L);
                out[38 + outpos] = (in[20 + inpos] >>> 50)
                        | ((in[21 + inpos] & 2097151L) << (35 - 21));
                out[39 + outpos] = ((in[21 + inpos] >>> 21) & 34359738367L);
                out[40 + outpos] = (in[21 + inpos] >>> 56)
                        | ((in[22 + inpos] & 134217727L) << (35 - 27));
                out[41 + outpos] = ((in[22 + inpos] >>> 27) & 34359738367L);
                out[42 + outpos] = (in[22 + inpos] >>> 62)
                        | ((in[23 + inpos] & 8589934591L) << (35 - 33));
                out[43 + outpos] = (in[23 + inpos] >>> 33)
                        | ((in[24 + inpos] & 15L) << (35 - 4));
                out[44 + outpos] = ((in[24 + inpos] >>> 4) & 34359738367L);
                out[45 + outpos] = (in[24 + inpos] >>> 39)
                        | ((in[25 + inpos] & 1023L) << (35 - 10));
                out[46 + outpos] = ((in[25 + inpos] >>> 10) & 34359738367L);
                out[47 + outpos] = (in[25 + inpos] >>> 45)
                        | ((in[26 + inpos] & 65535L) << (35 - 16));
                out[48 + outpos] = ((in[26 + inpos] >>> 16) & 34359738367L);
                out[49 + outpos] = (in[26 + inpos] >>> 51)
                        | ((in[27 + inpos] & 4194303L) << (35 - 22));
                out[50 + outpos] = ((in[27 + inpos] >>> 22) & 34359738367L);
                out[51 + outpos] = (in[27 + inpos] >>> 57)
                        | ((in[28 + inpos] & 268435455L) << (35 - 28));
                out[52 + outpos] = ((in[28 + inpos] >>> 28) & 34359738367L);
                out[53 + outpos] = (in[28 + inpos] >>> 63)
                        | ((in[29 + inpos] & 17179869183L) << (35 - 34));
                out[54 + outpos] = (in[29 + inpos] >>> 34)
                        | ((in[30 + inpos] & 31L) << (35 - 5));
                out[55 + outpos] = ((in[30 + inpos] >>> 5) & 34359738367L);
                out[56 + outpos] = (in[30 + inpos] >>> 40)
                        | ((in[31 + inpos] & 2047L) << (35 - 11));
                out[57 + outpos] = ((in[31 + inpos] >>> 11) & 34359738367L);
                out[58 + outpos] = (in[31 + inpos] >>> 46)
                        | ((in[32 + inpos] & 131071L) << (35 - 17));
                out[59 + outpos] = ((in[32 + inpos] >>> 17) & 34359738367L);
                out[60 + outpos] = (in[32 + inpos] >>> 52)
                        | ((in[33 + inpos] & 8388607L) << (35 - 23));
                out[61 + outpos] = ((in[33 + inpos] >>> 23) & 34359738367L);
                out[62 + outpos] = (in[33 + inpos] >>> 58)
                        | ((in[34 + inpos] & 536870911L) << (35 - 29));
                out[63 + outpos] = (in[34 + inpos] >>> 29);
        }

        protected static void fastunpack36(final long[] in, int inpos,
                final long[] out, int outpos) {
                out[outpos] = (in[inpos] & 68719476735L);
                out[1 + outpos] = (in[inpos] >>> 36)
                        | ((in[1 + inpos] & 255L) << (36 - 8));
                out[2 + outpos] = ((in[1 + inpos] >>> 8) & 68719476735L);
                out[3 + outpos] = (in[1 + inpos] >>> 44)
                        | ((in[2 + inpos] & 65535L) << (36 - 16));
                out[4 + outpos] = ((in[2 + inpos] >>> 16) & 68719476735L);
                out[5 + outpos] = (in[2 + inpos] >>> 52)
                        | ((in[3 + inpos] & 16777215L) << (36 - 24));
                out[6 + outpos] = ((in[3 + inpos] >>> 24) & 68719476735L);
                out[7 + outpos] = (in[3 + inpos] >>> 60)
                        | ((in[4 + inpos] & 4294967295L) << (36 - 32));
                out[8 + outpos] = (in[4 + inpos] >>> 32)
                        | ((in[5 + inpos] & 15L) << (36 - 4));
                out[9 + outpos] = ((in[5 + inpos] >>> 4) & 68719476735L);
                out[10 + outpos] = (in[5 + inpos] >>> 40)
                        | ((in[6 + inpos] & 4095L) << (36 - 12));
                out[11 + outpos] = ((in[6 + inpos] >>> 12) & 68719476735L);
                out[12 + outpos] = (in[6 + inpos] >>> 48)
                        | ((in[7 + inpos] & 1048575L) << (36 - 20));
                out[13 + outpos] = ((in[7 + inpos] >>> 20) & 68719476735L);
                out[14 + outpos] = (in[7 + inpos] >>> 56)
                        | ((in[8 + inpos] & 268435455L) << (36 - 28));
                out[15 + outpos] = (in[8 + inpos] >>> 28);
                out[16 + outpos] = (in[9 + inpos] & 68719476735L);
                out[17 + outpos] = (in[9 + inpos] >>> 36)
                        | ((in[10 + inpos] & 255L) << (36 - 8));
                out[18 + outpos] = ((in[10 + inpos] >>> 8) & 68719476735L);
                out[19 + outpos] = (in[10 + inpos] >>> 44)
                        | ((in[11 + inpos] & 65535L) << (36 - 16));
                out[20 + outpos] = ((in[11 + inpos] >>> 16) & 68719476735L);
                out[21 + outpos] = (in[11 + inpos] >>> 52)
                        | ((in[12 + inpos] & 16777215L) << (36 - 24));
                out[22 + outpos] = ((in[12 + inpos] >>> 24) & 68719476735L);
                out[23 + outpos] = (in[12 + inpos] >>> 60)
                        | ((in[13 + inpos] & 4294967295L) << (36 - 32));
                out[24 + outpos] = (in[13 + inpos] >>> 32)
                        | ((in[14 + inpos] & 15L) << (36 - 4));
                out[25 + outpos] = ((in[14 + inpos] >>> 4) & 68719476735L);
                out[26 + outpos] = (in[14 + inpos] >>> 40)
                        | ((in[15 + inpos] & 4095L) << (36 - 12));
                out[27 + outpos] = ((in[15 + inpos] >>> 12) & 68719476735L);
                out[28 + outpos] = (in[15 + inpos] >>> 48)
                        | ((in[16 + inpos] & 1048575L) << (36 - 20));
                out[29 + outpos] = ((in[16 + inpos] >>> 20) & 68719476735L);
                out[30 + outpos] = (in[16 + inpos] >>> 56)
                        | ((in[17 + inpos] & 268435455L) << (36 - 28));
                out[31 + outpos] = (in[17 + inpos] >>> 28);
                out[32 + outpos] = (in[18 + inpos] & 68719476735L);
                out[33 + outpos] = (in[18 + inpos] >>> 36)
                        | ((in[19 + inpos] & 255L) << (36 - 8));
                out[34 + outpos] = ((in[19 + inpos] >>> 8) & 68719476735L);
                out[35 + outpos] = (in[19 + inpos] >>> 44)
                        | ((in[20 + inpos] & 65535L) << (36 - 16));
                out[36 + outpos] = ((in[20 + inpos] >>> 16) & 68719476735L);
                out[37 + outpos] = (in[20 + inpos] >>> 52)
                        | ((in[21 + inpos] & 16777215L) << (36 - 24));
                out[38 + outpos] = ((in[21 + inpos] >>> 24) & 68719476735L);
                out[39 + outpos] = (in[21 + inpos] >>> 60)
                        | ((in[22 + inpos] & 4294967295L) << (36 - 32));
                out[40 + outpos] = (in[22 + inpos] >>> 32)
                        | ((in[23 + inpos] & 15L) << (36 - 4));
                out[41 + outpos] = ((in[23 + inpos] >>> 4) & 68719476735L);
                out[42 + outpos] = (in[23 + inpos] >>> 40)
                        | ((in[24 + inpos] & 4095L) << (36 - 12));
                out[43 + outpos] = ((in[24 + inpos] >>> 12) & 68719476735L);
                out[44 + outpos] = (in[24 + inpos] >>> 48)
                        | ((in[25 + inpos] & 1048575L) << (36 - 20));
                out[45 + outpos] = ((in[25 + inpos] >>> 20) & 68719476735L);
                out[46 + outpos] = (in[25 + inpos] >>> 56)
                        | ((in[26 + inpos] & 268435455L) << (36 - 28));
                out[47 + outpos] = (in[26 + inpos] >>> 28);
                out[48 + outpos] = (in[27 + inpos] & 68719476735L);
                out[49 + outpos] = (in[27 + inpos] >>> 36)
                        | ((in[28 + inpos] & 255L) << (36 - 8));
                out[50 + outpos] = ((in[28 + inpos] >>> 8) & 68719476735L);
                out[51 + outpos] = (in[28 + inpos] >>> 44)
                        | ((in[29 + inpos] & 65535L) << (36 - 16));
                out[52 + outpos] = ((in[29 + inpos] >>> 16) & 68719476735L);
                out[53 + outpos] = (in[29 + inpos] >>> 52)
                        | ((in[30 + inpos] & 16777215L) << (36 - 24));
                out[54 + outpos] = ((in[30 + inpos] >>> 24) & 68719476735L);
                out[55 + outpos] = (in[30 + inpos] >>> 60)
                        | ((in[31 + inpos] & 4294967295L) << (36 - 32));
                out[56 + outpos] = (in[31 + inpos] >>> 32)
                        | ((in[32 + inpos] & 15L) << (36 - 4));
                out[57 + outpos] = ((in[32 + inpos] >>> 4) & 68719476735L);
                out[58 + outpos] = (in[32 + inpos] >>> 40)
                        | ((in[33 + inpos] & 4095L) << (36 - 12));
                out[59 + outpos] = ((in[33 + inpos] >>> 12) & 68719476735L);
                out[60 + outpos] = (in[33 + inpos] >>> 48)
                        | ((in[34 + inpos] & 1048575L) << (36 - 20));
                out[61 + outpos] = ((in[34 + inpos] >>> 20) & 68719476735L);
                out[62 + outpos] = (in[34 + inpos] >>> 56)
                        | ((in[35 + inpos] & 268435455L) << (36 - 28));
                out[63 + outpos] = (in[35 + inpos] >>> 28);
        }

        protected static void fastunpack37(final long[] in, int inpos,
                final long[] out, int outpos) {
                out[outpos] = (in[inpos] & 137438953471L);
                out[1 + outpos] = (in[inpos] >>> 37)
                        | ((in[1 + inpos] & 1023L) << (37 - 10));
                out[2 + outpos] = ((in[1 + inpos] >>> 10) & 137438953471L);
                out[3 + outpos] = (in[1 + inpos] >>> 47)
                        | ((in[2 + inpos] & 1048575L) << (37 - 20));
                out[4 + outpos] = ((in[2 + inpos] >>> 20) & 137438953471L);
                out[5 + outpos] = (in[2 + inpos] >>> 57)
                        | ((in[3 + inpos] & 1073741823L) << (37 - 30));
                out[6 + outpos] = (in[3 + inpos] >>> 30)
                        | ((in[4 + inpos] & 7L) << (37 - 3));
                out[7 + outpos] = ((in[4 + inpos] >>> 3) & 137438953471L);
                out[8 + outpos] = (in[4 + inpos] >>> 40)
                        | ((in[5 + inpos] & 8191L) << (37 - 13));
                out[9 + outpos] = ((in[5 + inpos] >>> 13) & 137438953471L);
                out[10 + outpos] = (in[5 + inpos] >>> 50)
                        | ((in[6 + inpos] & 8388607L) << (37 - 23));
                out[11 + outpos] = ((in[6 + inpos] >>> 23) & 137438953471L);
                out[12 + outpos] = (in[6 + inpos] >>> 60)
                        | ((in[7 + inpos] & 8589934591L) << (37 - 33));
                out[13 + outpos] = (in[7 + inpos] >>> 33)
                        | ((in[8 + inpos] & 63L) << (37 - 6));
                out[14 + outpos] = ((in[8 + inpos] >>> 6) & 137438953471L);
                out[15 + outpos] = (in[8 + inpos] >>> 43)
                        | ((in[9 + inpos] & 65535L) << (37 - 16));
                out[16 + outpos] = ((in[9 + inpos] >>> 16) & 137438953471L);
                out[17 + outpos] = (in[9 + inpos] >>> 53)
                        | ((in[10 + inpos] & 67108863L) << (37 - 26));
                out[18 + outpos] = ((in[10 + inpos] >>> 26) & 137438953471L);
                out[19 + outpos] = (in[10 + inpos] >>> 63)
                        | ((in[11 + inpos] & 68719476735L) << (37 - 36));
                out[20 + outpos] = (in[11 + inpos] >>> 36)
                        | ((in[12 + inpos] & 511L) << (37 - 9));
                out[21 + outpos] = ((in[12 + inpos] >>> 9) & 137438953471L);
                out[22 + outpos] = (in[12 + inpos] >>> 46)
                        | ((in[13 + inpos] & 524287L) << (37 - 19));
                out[23 + outpos] = ((in[13 + inpos] >>> 19) & 137438953471L);
                out[24 + outpos] = (in[13 + inpos] >>> 56)
                        | ((in[14 + inpos] & 536870911L) << (37 - 29));
                out[25 + outpos] = (in[14 + inpos] >>> 29)
                        | ((in[15 + inpos] & 3L) << (37 - 2));
                out[26 + outpos] = ((in[15 + inpos] >>> 2) & 137438953471L);
                out[27 + outpos] = (in[15 + inpos] >>> 39)
                        | ((in[16 + inpos] & 4095L) << (37 - 12));
                out[28 + outpos] = ((in[16 + inpos] >>> 12) & 137438953471L);
                out[29 + outpos] = (in[16 + inpos] >>> 49)
                        | ((in[17 + inpos] & 4194303L) << (37 - 22));
                out[30 + outpos] = ((in[17 + inpos] >>> 22) & 137438953471L);
                out[31 + outpos] = (in[17 + inpos] >>> 59)
                        | ((in[18 + inpos] & 4294967295L) << (37 - 32));
                out[32 + outpos] = (in[18 + inpos] >>> 32)
                        | ((in[19 + inpos] & 31L) << (37 - 5));
                out[33 + outpos] = ((in[19 + inpos] >>> 5) & 137438953471L);
                out[34 + outpos] = (in[19 + inpos] >>> 42)
                        | ((in[20 + inpos] & 32767L) << (37 - 15));
                out[35 + outpos] = ((in[20 + inpos] >>> 15) & 137438953471L);
                out[36 + outpos] = (in[20 + inpos] >>> 52)
                        | ((in[21 + inpos] & 33554431L) << (37 - 25));
                out[37 + outpos] = ((in[21 + inpos] >>> 25) & 137438953471L);
                out[38 + outpos] = (in[21 + inpos] >>> 62)
                        | ((in[22 + inpos] & 34359738367L) << (37 - 35));
                out[39 + outpos] = (in[22 + inpos] >>> 35)
                        | ((in[23 + inpos] & 255L) << (37 - 8));
                out[40 + outpos] = ((in[23 + inpos] >>> 8) & 137438953471L);
                out[41 + outpos] = (in[23 + inpos] >>> 45)
                        | ((in[24 + inpos] & 262143L) << (37 - 18));
                out[42 + outpos] = ((in[24 + inpos] >>> 18) & 137438953471L);
                out[43 + outpos] = (in[24 + inpos] >>> 55)
                        | ((in[25 + inpos] & 268435455L) << (37 - 28));
                out[44 + outpos] = (in[25 + inpos] >>> 28)
                        | ((in[26 + inpos] & 1L) << (37 - 1));
                out[45 + outpos] = ((in[26 + inpos] >>> 1) & 137438953471L);
                out[46 + outpos] = (in[26 + inpos] >>> 38)
                        | ((in[27 + inpos] & 2047L) << (37 - 11));
                out[47 + outpos] = ((in[27 + inpos] >>> 11) & 137438953471L);
                out[48 + outpos] = (in[27 + inpos] >>> 48)
                        | ((in[28 + inpos] & 2097151L) << (37 - 21));
                out[49 + outpos] = ((in[28 + inpos] >>> 21) & 137438953471L);
                out[50 + outpos] = (in[28 + inpos] >>> 58)
                        | ((in[29 + inpos] & 2147483647L) << (37 - 31));
                out[51 + outpos] = (in[29 + inpos] >>> 31)
                        | ((in[30 + inpos] & 15L) << (37 - 4));
                out[52 + outpos] = ((in[30 + inpos] >>> 4) & 137438953471L);
                out[53 + outpos] = (in[30 + inpos] >>> 41)
                        | ((in[31 + inpos] & 16383L) << (37 - 14));
                out[54 + outpos] = ((in[31 + inpos] >>> 14) & 137438953471L);
                out[55 + outpos] = (in[31 + inpos] >>> 51)
                        | ((in[32 + inpos] & 16777215L) << (37 - 24));
                out[56 + outpos] = ((in[32 + inpos] >>> 24) & 137438953471L);
                out[57 + outpos] = (in[32 + inpos] >>> 61)
                        | ((in[33 + inpos] & 17179869183L) << (37 - 34));
                out[58 + outpos] = (in[33 + inpos] >>> 34)
                        | ((in[34 + inpos] & 127L) << (37 - 7));
                out[59 + outpos] = ((in[34 + inpos] >>> 7) & 137438953471L);
                out[60 + outpos] = (in[34 + inpos] >>> 44)
                        | ((in[35 + inpos] & 131071L) << (37 - 17));
                out[61 + outpos] = ((in[35 + inpos] >>> 17) & 137438953471L);
                out[62 + outpos] = (in[35 + inpos] >>> 54)
                        | ((in[36 + inpos] & 134217727L) << (37 - 27));
                out[63 + outpos] = (in[36 + inpos] >>> 27);
        }

        protected static void fastunpack38(final long[] in, int inpos,
                final long[] out, int outpos) {
                out[outpos] = (in[inpos] & 274877906943L);
                out[1 + outpos] = (in[inpos] >>> 38)
                        | ((in[1 + inpos] & 4095L) << (38 - 12));
                out[2 + outpos] = ((in[1 + inpos] >>> 12) & 274877906943L);
                out[3 + outpos] = (in[1 + inpos] >>> 50)
                        | ((in[2 + inpos] & 16777215L) << (38 - 24));
                out[4 + outpos] = ((in[2 + inpos] >>> 24) & 274877906943L);
                out[5 + outpos] = (in[2 + inpos] >>> 62)
                        | ((in[3 + inpos] & 68719476735L) << (38 - 36));
                out[6 + outpos] = (in[3 + inpos] >>> 36)
                        | ((in[4 + inpos] & 1023L) << (38 - 10));
                out[7 + outpos] = ((in[4 + inpos] >>> 10) & 274877906943L);
                out[8 + outpos] = (in[4 + inpos] >>> 48)
                        | ((in[5 + inpos] & 4194303L) << (38 - 22));
                out[9 + outpos] = ((in[5 + inpos] >>> 22) & 274877906943L);
                out[10 + outpos] = (in[5 + inpos] >>> 60)
                        | ((in[6 + inpos] & 17179869183L) << (38 - 34));
                out[11 + outpos] = (in[6 + inpos] >>> 34)
                        | ((in[7 + inpos] & 255L) << (38 - 8));
                out[12 + outpos] = ((in[7 + inpos] >>> 8) & 274877906943L);
                out[13 + outpos] = (in[7 + inpos] >>> 46)
                        | ((in[8 + inpos] & 1048575L) << (38 - 20));
                out[14 + outpos] = ((in[8 + inpos] >>> 20) & 274877906943L);
                out[15 + outpos] = (in[8 + inpos] >>> 58)
                        | ((in[9 + inpos] & 4294967295L) << (38 - 32));
                out[16 + outpos] = (in[9 + inpos] >>> 32)
                        | ((in[10 + inpos] & 63L) << (38 - 6));
                out[17 + outpos] = ((in[10 + inpos] >>> 6) & 274877906943L);
                out[18 + outpos] = (in[10 + inpos] >>> 44)
                        | ((in[11 + inpos] & 262143L) << (38 - 18));
                out[19 + outpos] = ((in[11 + inpos] >>> 18) & 274877906943L);
                out[20 + outpos] = (in[11 + inpos] >>> 56)
                        | ((in[12 + inpos] & 1073741823L) << (38 - 30));
                out[21 + outpos] = (in[12 + inpos] >>> 30)
                        | ((in[13 + inpos] & 15L) << (38 - 4));
                out[22 + outpos] = ((in[13 + inpos] >>> 4) & 274877906943L);
                out[23 + outpos] = (in[13 + inpos] >>> 42)
                        | ((in[14 + inpos] & 65535L) << (38 - 16));
                out[24 + outpos] = ((in[14 + inpos] >>> 16) & 274877906943L);
                out[25 + outpos] = (in[14 + inpos] >>> 54)
                        | ((in[15 + inpos] & 268435455L) << (38 - 28));
                out[26 + outpos] = (in[15 + inpos] >>> 28)
                        | ((in[16 + inpos] & 3L) << (38 - 2));
                out[27 + outpos] = ((in[16 + inpos] >>> 2) & 274877906943L);
                out[28 + outpos] = (in[16 + inpos] >>> 40)
                        | ((in[17 + inpos] & 16383L) << (38 - 14));
                out[29 + outpos] = ((in[17 + inpos] >>> 14) & 274877906943L);
                out[30 + outpos] = (in[17 + inpos] >>> 52)
                        | ((in[18 + inpos] & 67108863L) << (38 - 26));
                out[31 + outpos] = (in[18 + inpos] >>> 26);
                out[32 + outpos] = (in[19 + inpos] & 274877906943L);
                out[33 + outpos] = (in[19 + inpos] >>> 38)
                        | ((in[20 + inpos] & 4095L) << (38 - 12));
                out[34 + outpos] = ((in[20 + inpos] >>> 12) & 274877906943L);
                out[35 + outpos] = (in[20 + inpos] >>> 50)
                        | ((in[21 + inpos] & 16777215L) << (38 - 24));
                out[36 + outpos] = ((in[21 + inpos] >>> 24) & 274877906943L);
                out[37 + outpos] = (in[21 + inpos] >>> 62)
                        | ((in[22 + inpos] & 68719476735L) << (38 - 36));
                out[38 + outpos] = (in[22 + inpos] >>> 36)
                        | ((in[23 + inpos] & 1023L) << (38 - 10));
                out[39 + outpos] = ((in[23 + inpos] >>> 10) & 274877906943L);
                out[40 + outpos] = (in[23 + inpos] >>> 48)
                        | ((in[24 + inpos] & 4194303L) << (38 - 22));
                out[41 + outpos] = ((in[24 + inpos] >>> 22) & 274877906943L);
                out[42 + outpos] = (in[24 + inpos] >>> 60)
                        | ((in[25 + inpos] & 17179869183L) << (38 - 34));
                out[43 + outpos] = (in[25 + inpos] >>> 34)
                        | ((in[26 + inpos] & 255L) << (38 - 8));
                out[44 + outpos] = ((in[26 + inpos] >>> 8) & 274877906943L);
                out[45 + outpos] = (in[26 + inpos] >>> 46)
                        | ((in[27 + inpos] & 1048575L) << (38 - 20));
                out[46 + outpos] = ((in[27 + inpos] >>> 20) & 274877906943L);
                out[47 + outpos] = (in[27 + inpos] >>> 58)
                        | ((in[28 + inpos] & 4294967295L) << (38 - 32));
                out[48 + outpos] = (in[28 + inpos] >>> 32)
                        | ((in[29 + inpos] & 63L) << (38 - 6));
                out[49 + outpos] = ((in[29 + inpos] >>> 6) & 274877906943L);
                out[50 + outpos] = (in[29 + inpos] >>> 44)
                        | ((in[30 + inpos] & 262143L) << (38 - 18));
                out[51 + outpos] = ((in[30 + inpos] >>> 18) & 274877906943L);
                out[52 + outpos] = (in[30 + inpos] >>> 56)
                        | ((in[31 + inpos] & 1073741823L) << (38 - 30));
                out[53 + outpos] = (in[31 + inpos] >>> 30)
                        | ((in[32 + inpos] & 15L) << (38 - 4));
                out[54 + outpos] = ((in[32 + inpos] >>> 4) & 274877906943L);
                out[55 + outpos] = (in[32 + inpos] >>> 42)
                        | ((in[33 + inpos] & 65535L) << (38 - 16));
                out[56 + outpos] = ((in[33 + inpos] >>> 16) & 274877906943L);
                out[57 + outpos] = (in[33 + inpos] >>> 54)
                        | ((in[34 + inpos] & 268435455L) << (38 - 28));
                out[58 + outpos] = (in[34 + inpos] >>> 28)
                        | ((in[35 + inpos] & 3L) << (38 - 2));
                out[59 + outpos] = ((in[35 + inpos] >>> 2) & 274877906943L);
                out[60 + outpos] = (in[35 + inpos] >>> 40)
                        | ((in[36 + inpos] & 16383L) << (38 - 14));
                out[61 + outpos] = ((in[36 + inpos] >>> 14) & 274877906943L);
                out[62 + outpos] = (in[36 + inpos] >>> 52)
                        | ((in[37 + inpos] & 67108863L) << (38 - 26));
                out[63 + outpos] = (in[37 + inpos] >>> 26);
        }

        protected static void fastunpack39(final long[] in, int inpos,
                final long[] out, int outpos) {
                out[outpos] = (in[inpos] & 549755813887L);
                out[1 + outpos] = (in[inpos] >>> 39)
                        | ((in[1 + inpos] & 16383L) << (39 - 14));
                out[2 + outpos] = ((in[1 + inpos] >>> 14) & 549755813887L);
                out[3 + outpos] = (in[1 + inpos] >>> 53)
                        | ((in[2 + inpos] & 268435455L) << (39 - 28));
                out[4 + outpos] = (in[2 + inpos] >>> 28)
                        | ((in[3 + inpos] & 7L) << (39 - 3));
                out[5 + outpos] = ((in[3 + inpos] >>> 3) & 549755813887L);
                out[6 + outpos] = (in[3 + inpos] >>> 42)
                        | ((in[4 + inpos] & 131071L) << (39 - 17));
                out[7 + outpos] = ((in[4 + inpos] >>> 17) & 549755813887L);
                out[8 + outpos] = (in[4 + inpos] >>> 56)
                        | ((in[5 + inpos] & 2147483647L) << (39 - 31));
                out[9 + outpos] = (in[5 + inpos] >>> 31)
                        | ((in[6 + inpos] & 63L) << (39 - 6));
                out[10 + outpos] = ((in[6 + inpos] >>> 6) & 549755813887L);
                out[11 + outpos] = (in[6 + inpos] >>> 45)
                        | ((in[7 + inpos] & 1048575L) << (39 - 20));
                out[12 + outpos] = ((in[7 + inpos] >>> 20) & 549755813887L);
                out[13 + outpos] = (in[7 + inpos] >>> 59)
                        | ((in[8 + inpos] & 17179869183L) << (39 - 34));
                out[14 + outpos] = (in[8 + inpos] >>> 34)
                        | ((in[9 + inpos] & 511L) << (39 - 9));
                out[15 + outpos] = ((in[9 + inpos] >>> 9) & 549755813887L);
                out[16 + outpos] = (in[9 + inpos] >>> 48)
                        | ((in[10 + inpos] & 8388607L) << (39 - 23));
                out[17 + outpos] = ((in[10 + inpos] >>> 23) & 549755813887L);
                out[18 + outpos] = (in[10 + inpos] >>> 62)
                        | ((in[11 + inpos] & 137438953471L) << (39 - 37));
                out[19 + outpos] = (in[11 + inpos] >>> 37)
                        | ((in[12 + inpos] & 4095L) << (39 - 12));
                out[20 + outpos] = ((in[12 + inpos] >>> 12) & 549755813887L);
                out[21 + outpos] = (in[12 + inpos] >>> 51)
                        | ((in[13 + inpos] & 67108863L) << (39 - 26));
                out[22 + outpos] = (in[13 + inpos] >>> 26)
                        | ((in[14 + inpos] & 1L) << (39 - 1));
                out[23 + outpos] = ((in[14 + inpos] >>> 1) & 549755813887L);
                out[24 + outpos] = (in[14 + inpos] >>> 40)
                        | ((in[15 + inpos] & 32767L) << (39 - 15));
                out[25 + outpos] = ((in[15 + inpos] >>> 15) & 549755813887L);
                out[26 + outpos] = (in[15 + inpos] >>> 54)
                        | ((in[16 + inpos] & 536870911L) << (39 - 29));
                out[27 + outpos] = (in[16 + inpos] >>> 29)
                        | ((in[17 + inpos] & 15L) << (39 - 4));
                out[28 + outpos] = ((in[17 + inpos] >>> 4) & 549755813887L);
                out[29 + outpos] = (in[17 + inpos] >>> 43)
                        | ((in[18 + inpos] & 262143L) << (39 - 18));
                out[30 + outpos] = ((in[18 + inpos] >>> 18) & 549755813887L);
                out[31 + outpos] = (in[18 + inpos] >>> 57)
                        | ((in[19 + inpos] & 4294967295L) << (39 - 32));
                out[32 + outpos] = (in[19 + inpos] >>> 32)
                        | ((in[20 + inpos] & 127L) << (39 - 7));
                out[33 + outpos] = ((in[20 + inpos] >>> 7) & 549755813887L);
                out[34 + outpos] = (in[20 + inpos] >>> 46)
                        | ((in[21 + inpos] & 2097151L) << (39 - 21));
                out[35 + outpos] = ((in[21 + inpos] >>> 21) & 549755813887L);
                out[36 + outpos] = (in[21 + inpos] >>> 60)
                        | ((in[22 + inpos] & 34359738367L) << (39 - 35));
                out[37 + outpos] = (in[22 + inpos] >>> 35)
                        | ((in[23 + inpos] & 1023L) << (39 - 10));
                out[38 + outpos] = ((in[23 + inpos] >>> 10) & 549755813887L);
                out[39 + outpos] = (in[23 + inpos] >>> 49)
                        | ((in[24 + inpos] & 16777215L) << (39 - 24));
                out[40 + outpos] = ((in[24 + inpos] >>> 24) & 549755813887L);
                out[41 + outpos] = (in[24 + inpos] >>> 63)
                        | ((in[25 + inpos] & 274877906943L) << (39 - 38));
                out[42 + outpos] = (in[25 + inpos] >>> 38)
                        | ((in[26 + inpos] & 8191L) << (39 - 13));
                out[43 + outpos] = ((in[26 + inpos] >>> 13) & 549755813887L);
                out[44 + outpos] = (in[26 + inpos] >>> 52)
                        | ((in[27 + inpos] & 134217727L) << (39 - 27));
                out[45 + outpos] = (in[27 + inpos] >>> 27)
                        | ((in[28 + inpos] & 3L) << (39 - 2));
                out[46 + outpos] = ((in[28 + inpos] >>> 2) & 549755813887L);
                out[47 + outpos] = (in[28 + inpos] >>> 41)
                        | ((in[29 + inpos] & 65535L) << (39 - 16));
                out[48 + outpos] = ((in[29 + inpos] >>> 16) & 549755813887L);
                out[49 + outpos] = (in[29 + inpos] >>> 55)
                        | ((in[30 + inpos] & 1073741823L) << (39 - 30));
                out[50 + outpos] = (in[30 + inpos] >>> 30)
                        | ((in[31 + inpos] & 31L) << (39 - 5));
                out[51 + outpos] = ((in[31 + inpos] >>> 5) & 549755813887L);
                out[52 + outpos] = (in[31 + inpos] >>> 44)
                        | ((in[32 + inpos] & 524287L) << (39 - 19));
                out[53 + outpos] = ((in[32 + inpos] >>> 19) & 549755813887L);
                out[54 + outpos] = (in[32 + inpos] >>> 58)
                        | ((in[33 + inpos] & 8589934591L) << (39 - 33));
                out[55 + outpos] = (in[33 + inpos] >>> 33)
                        | ((in[34 + inpos] & 255L) << (39 - 8));
                out[56 + outpos] = ((in[34 + inpos] >>> 8) & 549755813887L);
                out[57 + outpos] = (in[34 + inpos] >>> 47)
                        | ((in[35 + inpos] & 4194303L) << (39 - 22));
                out[58 + outpos] = ((in[35 + inpos] >>> 22) & 549755813887L);
                out[59 + outpos] = (in[35 + inpos] >>> 61)
                        | ((in[36 + inpos] & 68719476735L) << (39 - 36));
                out[60 + outpos] = (in[36 + inpos] >>> 36)
                        | ((in[37 + inpos] & 2047L) << (39 - 11));
                out[61 + outpos] = ((in[37 + inpos] >>> 11) & 549755813887L);
                out[62 + outpos] = (in[37 + inpos] >>> 50)
                        | ((in[38 + inpos] & 33554431L) << (39 - 25));
                out[63 + outpos] = (in[38 + inpos] >>> 25);
        }

        protected static void fastunpack40(final long[] in, int inpos,
                final long[] out, int outpos) {
                out[outpos] = (in[inpos] & 1099511627775L);
                out[1 + outpos] = (in[inpos] >>> 40)
                        | ((in[1 + inpos] & 65535L) << (40 - 16));
                out[2 + outpos] = ((in[1 + inpos] >>> 16) & 1099511627775L);
                out[3 + outpos] = (in[1 + inpos] >>> 56)
                        | ((in[2 + inpos] & 4294967295L) << (40 - 32));
                out[4 + outpos] = (in[2 + inpos] >>> 32)
                        | ((in[3 + inpos] & 255L) << (40 - 8));
                out[5 + outpos] = ((in[3 + inpos] >>> 8) & 1099511627775L);
                out[6 + outpos] = (in[3 + inpos] >>> 48)
                        | ((in[4 + inpos] & 16777215L) << (40 - 24));
                out[7 + outpos] = (in[4 + inpos] >>> 24);
                out[8 + outpos] = (in[5 + inpos] & 1099511627775L);
                out[9 + outpos] = (in[5 + inpos] >>> 40)
                        | ((in[6 + inpos] & 65535L) << (40 - 16));
                out[10 + outpos] = ((in[6 + inpos] >>> 16) & 1099511627775L);
                out[11 + outpos] = (in[6 + inpos] >>> 56)
                        | ((in[7 + inpos] & 4294967295L) << (40 - 32));
                out[12 + outpos] = (in[7 + inpos] >>> 32)
                        | ((in[8 + inpos] & 255L) << (40 - 8));
                out[13 + outpos] = ((in[8 + inpos] >>> 8) & 1099511627775L);
                out[14 + outpos] = (in[8 + inpos] >>> 48)
                        | ((in[9 + inpos] & 16777215L) << (40 - 24));
                out[15 + outpos] = (in[9 + inpos] >>> 24);
                out[16 + outpos] = (in[10 + inpos] & 1099511627775L);
                out[17 + outpos] = (in[10 + inpos] >>> 40)
                        | ((in[11 + inpos] & 65535L) << (40 - 16));
                out[18 + outpos] = ((in[11 + inpos] >>> 16) & 1099511627775L);
                out[19 + outpos] = (in[11 + inpos] >>> 56)
                        | ((in[12 + inpos] & 4294967295L) << (40 - 32));
                out[20 + outpos] = (in[12 + inpos] >>> 32)
                        | ((in[13 + inpos] & 255L) << (40 - 8));
                out[21 + outpos] = ((in[13 + inpos] >>> 8) & 1099511627775L);
                out[22 + outpos] = (in[13 + inpos] >>> 48)
                        | ((in[14 + inpos] & 16777215L) << (40 - 24));
                out[23 + outpos] = (in[14 + inpos] >>> 24);
                out[24 + outpos] = (in[15 + inpos] & 1099511627775L);
                out[25 + outpos] = (in[15 + inpos] >>> 40)
                        | ((in[16 + inpos] & 65535L) << (40 - 16));
                out[26 + outpos] = ((in[16 + inpos] >>> 16) & 1099511627775L);
                out[27 + outpos] = (in[16 + inpos] >>> 56)
                        | ((in[17 + inpos] & 4294967295L) << (40 - 32));
                out[28 + outpos] = (in[17 + inpos] >>> 32)
                        | ((in[18 + inpos] & 255L) << (40 - 8));
                out[29 + outpos] = ((in[18 + inpos] >>> 8) & 1099511627775L);
                out[30 + outpos] = (in[18 + inpos] >>> 48)
                        | ((in[19 + inpos] & 16777215L) << (40 - 24));
                out[31 + outpos] = (in[19 + inpos] >>> 24);
                out[32 + outpos] = (in[20 + inpos] & 1099511627775L);
                out[33 + outpos] = (in[20 + inpos] >>> 40)
                        | ((in[21 + inpos] & 65535L) << (40 - 16));
                out[34 + outpos] = ((in[21 + inpos] >>> 16) & 1099511627775L);
                out[35 + outpos] = (in[21 + inpos] >>> 56)
                        | ((in[22 + inpos] & 4294967295L) << (40 - 32));
                out[36 + outpos] = (in[22 + inpos] >>> 32)
                        | ((in[23 + inpos] & 255L) << (40 - 8));
                out[37 + outpos] = ((in[23 + inpos] >>> 8) & 1099511627775L);
                out[38 + outpos] = (in[23 + inpos] >>> 48)
                        | ((in[24 + inpos] & 16777215L) << (40 - 24));
                out[39 + outpos] = (in[24 + inpos] >>> 24);
                out[40 + outpos] = (in[25 + inpos] & 1099511627775L);
                out[41 + outpos] = (in[25 + inpos] >>> 40)
                        | ((in[26 + inpos] & 65535L) << (40 - 16));
                out[42 + outpos] = ((in[26 + inpos] >>> 16) & 1099511627775L);
                out[43 + outpos] = (in[26 + inpos] >>> 56)
                        | ((in[27 + inpos] & 4294967295L) << (40 - 32));
                out[44 + outpos] = (in[27 + inpos] >>> 32)
                        | ((in[28 + inpos] & 255L) << (40 - 8));
                out[45 + outpos] = ((in[28 + inpos] >>> 8) & 1099511627775L);
                out[46 + outpos] = (in[28 + inpos] >>> 48)
                        | ((in[29 + inpos] & 16777215L) << (40 - 24));
                out[47 + outpos] = (in[29 + inpos] >>> 24);
                out[48 + outpos] = (in[30 + inpos] & 1099511627775L);
                out[49 + outpos] = (in[30 + inpos] >>> 40)
                        | ((in[31 + inpos] & 65535L) << (40 - 16));
                out[50 + outpos] = ((in[31 + inpos] >>> 16) & 1099511627775L);
                out[51 + outpos] = (in[31 + inpos] >>> 56)
                        | ((in[32 + inpos] & 4294967295L) << (40 - 32));
                out[52 + outpos] = (in[32 + inpos] >>> 32)
                        | ((in[33 + inpos] & 255L) << (40 - 8));
                out[53 + outpos] = ((in[33 + inpos] >>> 8) & 1099511627775L);
                out[54 + outpos] = (in[33 + inpos] >>> 48)
                        | ((in[34 + inpos] & 16777215L) << (40 - 24));
                out[55 + outpos] = (in[34 + inpos] >>> 24);
                out[56 + outpos] = (in[35 + inpos] & 1099511627775L);
                out[57 + outpos] = (in[35 + inpos] >>> 40)
                        | ((in[36 + inpos] & 65535L) << (40 - 16));
                out[58 + outpos] = ((in[36 + inpos] >>> 16) & 1099511627775L);
                out[59 + outpos] = (in[36 + inpos] >>> 56)
                        | ((in[37 + inpos] & 4294967295L) << (40 - 32));
                out[60 + outpos] = (in[37 + inpos] >>> 32)
                        | ((in[38 + inpos] & 255L) << (40 - 8));
                out[61 + outpos] = ((in[38 + inpos] >>> 8) & 1099511627775L);
                out[62 + outpos] = (in[38 + inpos] >>> 48)
                        | ((in[39 + inpos] & 16777215L) << (40 - 24));
                out[63 + outpos] = (in[39 + inpos] >>> 24);
        }

        protected static void fastunpack41(final long[] in, int inpos,
                final long[] out, int outpos) {
                out[outpos] = (in[inpos] & 2199023255551L);
                out[1 + outpos] = (in[inpos] >>> 41)
                        | ((in[1 + inpos] & 262143L) << (41 - 18));
                out[2 + outpos] = ((in[1 + inpos] >>> 18) & 2199023255551L);
                out[3 + outpos] = (in[1 + inpos] >>> 59)
                        | ((in[2 + inpos] & 68719476735L) << (41 - 36));
                out[4 + outpos] = (in[2 + inpos] >>> 36)
                        | ((in[3 + inpos] & 8191L) << (41 - 13));
                out[5 + outpos] = ((in[3 + inpos] >>> 13) & 2199023255551L);
                out[6 + outpos] = (in[3 + inpos] >>> 54)
                        | ((in[4 + inpos] & 2147483647L) << (41 - 31));
                out[7 + outpos] = (in[4 + inpos] >>> 31)
                        | ((in[5 + inpos] & 255L) << (41 - 8));
                out[8 + outpos] = ((in[5 + inpos] >>> 8) & 2199023255551L);
                out[9 + outpos] = (in[5 + inpos] >>> 49)
                        | ((in[6 + inpos] & 67108863L) << (41 - 26));
                out[10 + outpos] = (in[6 + inpos] >>> 26)
                        | ((in[7 + inpos] & 7L) << (41 - 3));
                out[11 + outpos] = ((in[7 + inpos] >>> 3) & 2199023255551L);
                out[12 + outpos] = (in[7 + inpos] >>> 44)
                        | ((in[8 + inpos] & 2097151L) << (41 - 21));
                out[13 + outpos] = ((in[8 + inpos] >>> 21) & 2199023255551L);
                out[14 + outpos] = (in[8 + inpos] >>> 62)
                        | ((in[9 + inpos] & 549755813887L) << (41 - 39));
                out[15 + outpos] = (in[9 + inpos] >>> 39)
                        | ((in[10 + inpos] & 65535L) << (41 - 16));
                out[16 + outpos] = ((in[10 + inpos] >>> 16) & 2199023255551L);
                out[17 + outpos] = (in[10 + inpos] >>> 57)
                        | ((in[11 + inpos] & 17179869183L) << (41 - 34));
                out[18 + outpos] = (in[11 + inpos] >>> 34)
                        | ((in[12 + inpos] & 2047L) << (41 - 11));
                out[19 + outpos] = ((in[12 + inpos] >>> 11) & 2199023255551L);
                out[20 + outpos] = (in[12 + inpos] >>> 52)
                        | ((in[13 + inpos] & 536870911L) << (41 - 29));
                out[21 + outpos] = (in[13 + inpos] >>> 29)
                        | ((in[14 + inpos] & 63L) << (41 - 6));
                out[22 + outpos] = ((in[14 + inpos] >>> 6) & 2199023255551L);
                out[23 + outpos] = (in[14 + inpos] >>> 47)
                        | ((in[15 + inpos] & 16777215L) << (41 - 24));
                out[24 + outpos] = (in[15 + inpos] >>> 24)
                        | ((in[16 + inpos] & 1L) << (41 - 1));
                out[25 + outpos] = ((in[16 + inpos] >>> 1) & 2199023255551L);
                out[26 + outpos] = (in[16 + inpos] >>> 42)
                        | ((in[17 + inpos] & 524287L) << (41 - 19));
                out[27 + outpos] = ((in[17 + inpos] >>> 19) & 2199023255551L);
                out[28 + outpos] = (in[17 + inpos] >>> 60)
                        | ((in[18 + inpos] & 137438953471L) << (41 - 37));
                out[29 + outpos] = (in[18 + inpos] >>> 37)
                        | ((in[19 + inpos] & 16383L) << (41 - 14));
                out[30 + outpos] = ((in[19 + inpos] >>> 14) & 2199023255551L);
                out[31 + outpos] = (in[19 + inpos] >>> 55)
                        | ((in[20 + inpos] & 4294967295L) << (41 - 32));
                out[32 + outpos] = (in[20 + inpos] >>> 32)
                        | ((in[21 + inpos] & 511L) << (41 - 9));
                out[33 + outpos] = ((in[21 + inpos] >>> 9) & 2199023255551L);
                out[34 + outpos] = (in[21 + inpos] >>> 50)
                        | ((in[22 + inpos] & 134217727L) << (41 - 27));
                out[35 + outpos] = (in[22 + inpos] >>> 27)
                        | ((in[23 + inpos] & 15L) << (41 - 4));
                out[36 + outpos] = ((in[23 + inpos] >>> 4) & 2199023255551L);
                out[37 + outpos] = (in[23 + inpos] >>> 45)
                        | ((in[24 + inpos] & 4194303L) << (41 - 22));
                out[38 + outpos] = ((in[24 + inpos] >>> 22) & 2199023255551L);
                out[39 + outpos] = (in[24 + inpos] >>> 63)
                        | ((in[25 + inpos] & 1099511627775L) << (41 - 40));
                out[40 + outpos] = (in[25 + inpos] >>> 40)
                        | ((in[26 + inpos] & 131071L) << (41 - 17));
                out[41 + outpos] = ((in[26 + inpos] >>> 17) & 2199023255551L);
                out[42 + outpos] = (in[26 + inpos] >>> 58)
                        | ((in[27 + inpos] & 34359738367L) << (41 - 35));
                out[43 + outpos] = (in[27 + inpos] >>> 35)
                        | ((in[28 + inpos] & 4095L) << (41 - 12));
                out[44 + outpos] = ((in[28 + inpos] >>> 12) & 2199023255551L);
                out[45 + outpos] = (in[28 + inpos] >>> 53)
                        | ((in[29 + inpos] & 1073741823L) << (41 - 30));
                out[46 + outpos] = (in[29 + inpos] >>> 30)
                        | ((in[30 + inpos] & 127L) << (41 - 7));
                out[47 + outpos] = ((in[30 + inpos] >>> 7) & 2199023255551L);
                out[48 + outpos] = (in[30 + inpos] >>> 48)
                        | ((in[31 + inpos] & 33554431L) << (41 - 25));
                out[49 + outpos] = (in[31 + inpos] >>> 25)
                        | ((in[32 + inpos] & 3L) << (41 - 2));
                out[50 + outpos] = ((in[32 + inpos] >>> 2) & 2199023255551L);
                out[51 + outpos] = (in[32 + inpos] >>> 43)
                        | ((in[33 + inpos] & 1048575L) << (41 - 20));
                out[52 + outpos] = ((in[33 + inpos] >>> 20) & 2199023255551L);
                out[53 + outpos] = (in[33 + inpos] >>> 61)
                        | ((in[34 + inpos] & 274877906943L) << (41 - 38));
                out[54 + outpos] = (in[34 + inpos] >>> 38)
                        | ((in[35 + inpos] & 32767L) << (41 - 15));
                out[55 + outpos] = ((in[35 + inpos] >>> 15) & 2199023255551L);
                out[56 + outpos] = (in[35 + inpos] >>> 56)
                        | ((in[36 + inpos] & 8589934591L) << (41 - 33));
                out[57 + outpos] = (in[36 + inpos] >>> 33)
                        | ((in[37 + inpos] & 1023L) << (41 - 10));
                out[58 + outpos] = ((in[37 + inpos] >>> 10) & 2199023255551L);
                out[59 + outpos] = (in[37 + inpos] >>> 51)
                        | ((in[38 + inpos] & 268435455L) << (41 - 28));
                out[60 + outpos] = (in[38 + inpos] >>> 28)
                        | ((in[39 + inpos] & 31L) << (41 - 5));
                out[61 + outpos] = ((in[39 + inpos] >>> 5) & 2199023255551L);
                out[62 + outpos] = (in[39 + inpos] >>> 46)
                        | ((in[40 + inpos] & 8388607L) << (41 - 23));
                out[63 + outpos] = (in[40 + inpos] >>> 23);
        }

        protected static void fastunpack42(final long[] in, int inpos,
                final long[] out, int outpos) {
                out[outpos] = (in[inpos] & 4398046511103L);
                out[1 + outpos] = (in[inpos] >>> 42)
                        | ((in[1 + inpos] & 1048575L) << (42 - 20));
                out[2 + outpos] = ((in[1 + inpos] >>> 20) & 4398046511103L);
                out[3 + outpos] = (in[1 + inpos] >>> 62)
                        | ((in[2 + inpos] & 1099511627775L) << (42 - 40));
                out[4 + outpos] = (in[2 + inpos] >>> 40)
                        | ((in[3 + inpos] & 262143L) << (42 - 18));
                out[5 + outpos] = ((in[3 + inpos] >>> 18) & 4398046511103L);
                out[6 + outpos] = (in[3 + inpos] >>> 60)
                        | ((in[4 + inpos] & 274877906943L) << (42 - 38));
                out[7 + outpos] = (in[4 + inpos] >>> 38)
                        | ((in[5 + inpos] & 65535L) << (42 - 16));
                out[8 + outpos] = ((in[5 + inpos] >>> 16) & 4398046511103L);
                out[9 + outpos] = (in[5 + inpos] >>> 58)
                        | ((in[6 + inpos] & 68719476735L) << (42 - 36));
                out[10 + outpos] = (in[6 + inpos] >>> 36)
                        | ((in[7 + inpos] & 16383L) << (42 - 14));
                out[11 + outpos] = ((in[7 + inpos] >>> 14) & 4398046511103L);
                out[12 + outpos] = (in[7 + inpos] >>> 56)
                        | ((in[8 + inpos] & 17179869183L) << (42 - 34));
                out[13 + outpos] = (in[8 + inpos] >>> 34)
                        | ((in[9 + inpos] & 4095L) << (42 - 12));
                out[14 + outpos] = ((in[9 + inpos] >>> 12) & 4398046511103L);
                out[15 + outpos] = (in[9 + inpos] >>> 54)
                        | ((in[10 + inpos] & 4294967295L) << (42 - 32));
                out[16 + outpos] = (in[10 + inpos] >>> 32)
                        | ((in[11 + inpos] & 1023L) << (42 - 10));
                out[17 + outpos] = ((in[11 + inpos] >>> 10) & 4398046511103L);
                out[18 + outpos] = (in[11 + inpos] >>> 52)
                        | ((in[12 + inpos] & 1073741823L) << (42 - 30));
                out[19 + outpos] = (in[12 + inpos] >>> 30)
                        | ((in[13 + inpos] & 255L) << (42 - 8));
                out[20 + outpos] = ((in[13 + inpos] >>> 8) & 4398046511103L);
                out[21 + outpos] = (in[13 + inpos] >>> 50)
                        | ((in[14 + inpos] & 268435455L) << (42 - 28));
                out[22 + outpos] = (in[14 + inpos] >>> 28)
                        | ((in[15 + inpos] & 63L) << (42 - 6));
                out[23 + outpos] = ((in[15 + inpos] >>> 6) & 4398046511103L);
                out[24 + outpos] = (in[15 + inpos] >>> 48)
                        | ((in[16 + inpos] & 67108863L) << (42 - 26));
                out[25 + outpos] = (in[16 + inpos] >>> 26)
                        | ((in[17 + inpos] & 15L) << (42 - 4));
                out[26 + outpos] = ((in[17 + inpos] >>> 4) & 4398046511103L);
                out[27 + outpos] = (in[17 + inpos] >>> 46)
                        | ((in[18 + inpos] & 16777215L) << (42 - 24));
                out[28 + outpos] = (in[18 + inpos] >>> 24)
                        | ((in[19 + inpos] & 3L) << (42 - 2));
                out[29 + outpos] = ((in[19 + inpos] >>> 2) & 4398046511103L);
                out[30 + outpos] = (in[19 + inpos] >>> 44)
                        | ((in[20 + inpos] & 4194303L) << (42 - 22));
                out[31 + outpos] = (in[20 + inpos] >>> 22);
                out[32 + outpos] = (in[21 + inpos] & 4398046511103L);
                out[33 + outpos] = (in[21 + inpos] >>> 42)
                        | ((in[22 + inpos] & 1048575L) << (42 - 20));
                out[34 + outpos] = ((in[22 + inpos] >>> 20) & 4398046511103L);
                out[35 + outpos] = (in[22 + inpos] >>> 62)
                        | ((in[23 + inpos] & 1099511627775L) << (42 - 40));
                out[36 + outpos] = (in[23 + inpos] >>> 40)
                        | ((in[24 + inpos] & 262143L) << (42 - 18));
                out[37 + outpos] = ((in[24 + inpos] >>> 18) & 4398046511103L);
                out[38 + outpos] = (in[24 + inpos] >>> 60)
                        | ((in[25 + inpos] & 274877906943L) << (42 - 38));
                out[39 + outpos] = (in[25 + inpos] >>> 38)
                        | ((in[26 + inpos] & 65535L) << (42 - 16));
                out[40 + outpos] = ((in[26 + inpos] >>> 16) & 4398046511103L);
                out[41 + outpos] = (in[26 + inpos] >>> 58)
                        | ((in[27 + inpos] & 68719476735L) << (42 - 36));
                out[42 + outpos] = (in[27 + inpos] >>> 36)
                        | ((in[28 + inpos] & 16383L) << (42 - 14));
                out[43 + outpos] = ((in[28 + inpos] >>> 14) & 4398046511103L);
                out[44 + outpos] = (in[28 + inpos] >>> 56)
                        | ((in[29 + inpos] & 17179869183L) << (42 - 34));
                out[45 + outpos] = (in[29 + inpos] >>> 34)
                        | ((in[30 + inpos] & 4095L) << (42 - 12));
                out[46 + outpos] = ((in[30 + inpos] >>> 12) & 4398046511103L);
                out[47 + outpos] = (in[30 + inpos] >>> 54)
                        | ((in[31 + inpos] & 4294967295L) << (42 - 32));
                out[48 + outpos] = (in[31 + inpos] >>> 32)
                        | ((in[32 + inpos] & 1023L) << (42 - 10));
                out[49 + outpos] = ((in[32 + inpos] >>> 10) & 4398046511103L);
                out[50 + outpos] = (in[32 + inpos] >>> 52)
                        | ((in[33 + inpos] & 1073741823L) << (42 - 30));
                out[51 + outpos] = (in[33 + inpos] >>> 30)
                        | ((in[34 + inpos] & 255L) << (42 - 8));
                out[52 + outpos] = ((in[34 + inpos] >>> 8) & 4398046511103L);
                out[53 + outpos] = (in[34 + inpos] >>> 50)
                        | ((in[35 + inpos] & 268435455L) << (42 - 28));
                out[54 + outpos] = (in[35 + inpos] >>> 28)
                        | ((in[36 + inpos] & 63L) << (42 - 6));
                out[55 + outpos] = ((in[36 + inpos] >>> 6) & 4398046511103L);
                out[56 + outpos] = (in[36 + inpos] >>> 48)
                        | ((in[37 + inpos] & 67108863L) << (42 - 26));
                out[57 + outpos] = (in[37 + inpos] >>> 26)
                        | ((in[38 + inpos] & 15L) << (42 - 4));
                out[58 + outpos] = ((in[38 + inpos] >>> 4) & 4398046511103L);
                out[59 + outpos] = (in[38 + inpos] >>> 46)
                        | ((in[39 + inpos] & 16777215L) << (42 - 24));
                out[60 + outpos] = (in[39 + inpos] >>> 24)
                        | ((in[40 + inpos] & 3L) << (42 - 2));
                out[61 + outpos] = ((in[40 + inpos] >>> 2) & 4398046511103L);
                out[62 + outpos] = (in[40 + inpos] >>> 44)
                        | ((in[41 + inpos] & 4194303L) << (42 - 22));
                out[63 + outpos] = (in[41 + inpos] >>> 22);
        }

        protected static void fastunpack43(final long[] in, int inpos,
                final long[] out, int outpos) {
                out[outpos] = (in[inpos] & 8796093022207L);
                out[1 + outpos] = (in[inpos] >>> 43)
                        | ((in[1 + inpos] & 4194303L) << (43 - 22));
                out[2 + outpos] = (in[1 + inpos] >>> 22)
                        | ((in[2 + inpos] & 1L) << (43 - 1));
                out[3 + outpos] = ((in[2 + inpos] >>> 1) & 8796093022207L);
                out[4 + outpos] = (in[2 + inpos] >>> 44)
                        | ((in[3 + inpos] & 8388607L) << (43 - 23));
                out[5 + outpos] = (in[3 + inpos] >>> 23)
                        | ((in[4 + inpos] & 3L) << (43 - 2));
                out[6 + outpos] = ((in[4 + inpos] >>> 2) & 8796093022207L);
                out[7 + outpos] = (in[4 + inpos] >>> 45)
                        | ((in[5 + inpos] & 16777215L) << (43 - 24));
                out[8 + outpos] = (in[5 + inpos] >>> 24)
                        | ((in[6 + inpos] & 7L) << (43 - 3));
                out[9 + outpos] = ((in[6 + inpos] >>> 3) & 8796093022207L);
                out[10 + outpos] = (in[6 + inpos] >>> 46)
                        | ((in[7 + inpos] & 33554431L) << (43 - 25));
                out[11 + outpos] = (in[7 + inpos] >>> 25)
                        | ((in[8 + inpos] & 15L) << (43 - 4));
                out[12 + outpos] = ((in[8 + inpos] >>> 4) & 8796093022207L);
                out[13 + outpos] = (in[8 + inpos] >>> 47)
                        | ((in[9 + inpos] & 67108863L) << (43 - 26));
                out[14 + outpos] = (in[9 + inpos] >>> 26)
                        | ((in[10 + inpos] & 31L) << (43 - 5));
                out[15 + outpos] = ((in[10 + inpos] >>> 5) & 8796093022207L);
                out[16 + outpos] = (in[10 + inpos] >>> 48)
                        | ((in[11 + inpos] & 134217727L) << (43 - 27));
                out[17 + outpos] = (in[11 + inpos] >>> 27)
                        | ((in[12 + inpos] & 63L) << (43 - 6));
                out[18 + outpos] = ((in[12 + inpos] >>> 6) & 8796093022207L);
                out[19 + outpos] = (in[12 + inpos] >>> 49)
                        | ((in[13 + inpos] & 268435455L) << (43 - 28));
                out[20 + outpos] = (in[13 + inpos] >>> 28)
                        | ((in[14 + inpos] & 127L) << (43 - 7));
                out[21 + outpos] = ((in[14 + inpos] >>> 7) & 8796093022207L);
                out[22 + outpos] = (in[14 + inpos] >>> 50)
                        | ((in[15 + inpos] & 536870911L) << (43 - 29));
                out[23 + outpos] = (in[15 + inpos] >>> 29)
                        | ((in[16 + inpos] & 255L) << (43 - 8));
                out[24 + outpos] = ((in[16 + inpos] >>> 8) & 8796093022207L);
                out[25 + outpos] = (in[16 + inpos] >>> 51)
                        | ((in[17 + inpos] & 1073741823L) << (43 - 30));
                out[26 + outpos] = (in[17 + inpos] >>> 30)
                        | ((in[18 + inpos] & 511L) << (43 - 9));
                out[27 + outpos] = ((in[18 + inpos] >>> 9) & 8796093022207L);
                out[28 + outpos] = (in[18 + inpos] >>> 52)
                        | ((in[19 + inpos] & 2147483647L) << (43 - 31));
                out[29 + outpos] = (in[19 + inpos] >>> 31)
                        | ((in[20 + inpos] & 1023L) << (43 - 10));
                out[30 + outpos] = ((in[20 + inpos] >>> 10) & 8796093022207L);
                out[31 + outpos] = (in[20 + inpos] >>> 53)
                        | ((in[21 + inpos] & 4294967295L) << (43 - 32));
                out[32 + outpos] = (in[21 + inpos] >>> 32)
                        | ((in[22 + inpos] & 2047L) << (43 - 11));
                out[33 + outpos] = ((in[22 + inpos] >>> 11) & 8796093022207L);
                out[34 + outpos] = (in[22 + inpos] >>> 54)
                        | ((in[23 + inpos] & 8589934591L) << (43 - 33));
                out[35 + outpos] = (in[23 + inpos] >>> 33)
                        | ((in[24 + inpos] & 4095L) << (43 - 12));
                out[36 + outpos] = ((in[24 + inpos] >>> 12) & 8796093022207L);
                out[37 + outpos] = (in[24 + inpos] >>> 55)
                        | ((in[25 + inpos] & 17179869183L) << (43 - 34));
                out[38 + outpos] = (in[25 + inpos] >>> 34)
                        | ((in[26 + inpos] & 8191L) << (43 - 13));
                out[39 + outpos] = ((in[26 + inpos] >>> 13) & 8796093022207L);
                out[40 + outpos] = (in[26 + inpos] >>> 56)
                        | ((in[27 + inpos] & 34359738367L) << (43 - 35));
                out[41 + outpos] = (in[27 + inpos] >>> 35)
                        | ((in[28 + inpos] & 16383L) << (43 - 14));
                out[42 + outpos] = ((in[28 + inpos] >>> 14) & 8796093022207L);
                out[43 + outpos] = (in[28 + inpos] >>> 57)
                        | ((in[29 + inpos] & 68719476735L) << (43 - 36));
                out[44 + outpos] = (in[29 + inpos] >>> 36)
                        | ((in[30 + inpos] & 32767L) << (43 - 15));
                out[45 + outpos] = ((in[30 + inpos] >>> 15) & 8796093022207L);
                out[46 + outpos] = (in[30 + inpos] >>> 58)
                        | ((in[31 + inpos] & 137438953471L) << (43 - 37));
                out[47 + outpos] = (in[31 + inpos] >>> 37)
                        | ((in[32 + inpos] & 65535L) << (43 - 16));
                out[48 + outpos] = ((in[32 + inpos] >>> 16) & 8796093022207L);
                out[49 + outpos] = (in[32 + inpos] >>> 59)
                        | ((in[33 + inpos] & 274877906943L) << (43 - 38));
                out[50 + outpos] = (in[33 + inpos] >>> 38)
                        | ((in[34 + inpos] & 131071L) << (43 - 17));
                out[51 + outpos] = ((in[34 + inpos] >>> 17) & 8796093022207L);
                out[52 + outpos] = (in[34 + inpos] >>> 60)
                        | ((in[35 + inpos] & 549755813887L) << (43 - 39));
                out[53 + outpos] = (in[35 + inpos] >>> 39)
                        | ((in[36 + inpos] & 262143L) << (43 - 18));
                out[54 + outpos] = ((in[36 + inpos] >>> 18) & 8796093022207L);
                out[55 + outpos] = (in[36 + inpos] >>> 61)
                        | ((in[37 + inpos] & 1099511627775L) << (43 - 40));
                out[56 + outpos] = (in[37 + inpos] >>> 40)
                        | ((in[38 + inpos] & 524287L) << (43 - 19));
                out[57 + outpos] = ((in[38 + inpos] >>> 19) & 8796093022207L);
                out[58 + outpos] = (in[38 + inpos] >>> 62)
                        | ((in[39 + inpos] & 2199023255551L) << (43 - 41));
                out[59 + outpos] = (in[39 + inpos] >>> 41)
                        | ((in[40 + inpos] & 1048575L) << (43 - 20));
                out[60 + outpos] = ((in[40 + inpos] >>> 20) & 8796093022207L);
                out[61 + outpos] = (in[40 + inpos] >>> 63)
                        | ((in[41 + inpos] & 4398046511103L) << (43 - 42));
                out[62 + outpos] = (in[41 + inpos] >>> 42)
                        | ((in[42 + inpos] & 2097151L) << (43 - 21));
                out[63 + outpos] = (in[42 + inpos] >>> 21);
        }

        protected static void fastunpack44(final long[] in, int inpos,
                final long[] out, int outpos) {
                out[outpos] = (in[inpos] & 17592186044415L);
                out[1 + outpos] = (in[inpos] >>> 44)
                        | ((in[1 + inpos] & 16777215L) << (44 - 24));
                out[2 + outpos] = (in[1 + inpos] >>> 24)
                        | ((in[2 + inpos] & 15L) << (44 - 4));
                out[3 + outpos] = ((in[2 + inpos] >>> 4) & 17592186044415L);
                out[4 + outpos] = (in[2 + inpos] >>> 48)
                        | ((in[3 + inpos] & 268435455L) << (44 - 28));
                out[5 + outpos] = (in[3 + inpos] >>> 28)
                        | ((in[4 + inpos] & 255L) << (44 - 8));
                out[6 + outpos] = ((in[4 + inpos] >>> 8) & 17592186044415L);
                out[7 + outpos] = (in[4 + inpos] >>> 52)
                        | ((in[5 + inpos] & 4294967295L) << (44 - 32));
                out[8 + outpos] = (in[5 + inpos] >>> 32)
                        | ((in[6 + inpos] & 4095L) << (44 - 12));
                out[9 + outpos] = ((in[6 + inpos] >>> 12) & 17592186044415L);
                out[10 + outpos] = (in[6 + inpos] >>> 56)
                        | ((in[7 + inpos] & 68719476735L) << (44 - 36));
                out[11 + outpos] = (in[7 + inpos] >>> 36)
                        | ((in[8 + inpos] & 65535L) << (44 - 16));
                out[12 + outpos] = ((in[8 + inpos] >>> 16) & 17592186044415L);
                out[13 + outpos] = (in[8 + inpos] >>> 60)
                        | ((in[9 + inpos] & 1099511627775L) << (44 - 40));
                out[14 + outpos] = (in[9 + inpos] >>> 40)
                        | ((in[10 + inpos] & 1048575L) << (44 - 20));
                out[15 + outpos] = (in[10 + inpos] >>> 20);
                out[16 + outpos] = (in[11 + inpos] & 17592186044415L);
                out[17 + outpos] = (in[11 + inpos] >>> 44)
                        | ((in[12 + inpos] & 16777215L) << (44 - 24));
                out[18 + outpos] = (in[12 + inpos] >>> 24)
                        | ((in[13 + inpos] & 15L) << (44 - 4));
                out[19 + outpos] = ((in[13 + inpos] >>> 4) & 17592186044415L);
                out[20 + outpos] = (in[13 + inpos] >>> 48)
                        | ((in[14 + inpos] & 268435455L) << (44 - 28));
                out[21 + outpos] = (in[14 + inpos] >>> 28)
                        | ((in[15 + inpos] & 255L) << (44 - 8));
                out[22 + outpos] = ((in[15 + inpos] >>> 8) & 17592186044415L);
                out[23 + outpos] = (in[15 + inpos] >>> 52)
                        | ((in[16 + inpos] & 4294967295L) << (44 - 32));
                out[24 + outpos] = (in[16 + inpos] >>> 32)
                        | ((in[17 + inpos] & 4095L) << (44 - 12));
                out[25 + outpos] = ((in[17 + inpos] >>> 12) & 17592186044415L);
                out[26 + outpos] = (in[17 + inpos] >>> 56)
                        | ((in[18 + inpos] & 68719476735L) << (44 - 36));
                out[27 + outpos] = (in[18 + inpos] >>> 36)
                        | ((in[19 + inpos] & 65535L) << (44 - 16));
                out[28 + outpos] = ((in[19 + inpos] >>> 16) & 17592186044415L);
                out[29 + outpos] = (in[19 + inpos] >>> 60)
                        | ((in[20 + inpos] & 1099511627775L) << (44 - 40));
                out[30 + outpos] = (in[20 + inpos] >>> 40)
                        | ((in[21 + inpos] & 1048575L) << (44 - 20));
                out[31 + outpos] = (in[21 + inpos] >>> 20);
                out[32 + outpos] = (in[22 + inpos] & 17592186044415L);
                out[33 + outpos] = (in[22 + inpos] >>> 44)
                        | ((in[23 + inpos] & 16777215L) << (44 - 24));
                out[34 + outpos] = (in[23 + inpos] >>> 24)
                        | ((in[24 + inpos] & 15L) << (44 - 4));
                out[35 + outpos] = ((in[24 + inpos] >>> 4) & 17592186044415L);
                out[36 + outpos] = (in[24 + inpos] >>> 48)
                        | ((in[25 + inpos] & 268435455L) << (44 - 28));
                out[37 + outpos] = (in[25 + inpos] >>> 28)
                        | ((in[26 + inpos] & 255L) << (44 - 8));
                out[38 + outpos] = ((in[26 + inpos] >>> 8) & 17592186044415L);
                out[39 + outpos] = (in[26 + inpos] >>> 52)
                        | ((in[27 + inpos] & 4294967295L) << (44 - 32));
                out[40 + outpos] = (in[27 + inpos] >>> 32)
                        | ((in[28 + inpos] & 4095L) << (44 - 12));
                out[41 + outpos] = ((in[28 + inpos] >>> 12) & 17592186044415L);
                out[42 + outpos] = (in[28 + inpos] >>> 56)
                        | ((in[29 + inpos] & 68719476735L) << (44 - 36));
                out[43 + outpos] = (in[29 + inpos] >>> 36)
                        | ((in[30 + inpos] & 65535L) << (44 - 16));
                out[44 + outpos] = ((in[30 + inpos] >>> 16) & 17592186044415L);
                out[45 + outpos] = (in[30 + inpos] >>> 60)
                        | ((in[31 + inpos] & 1099511627775L) << (44 - 40));
                out[46 + outpos] = (in[31 + inpos] >>> 40)
                        | ((in[32 + inpos] & 1048575L) << (44 - 20));
                out[47 + outpos] = (in[32 + inpos] >>> 20);
                out[48 + outpos] = (in[33 + inpos] & 17592186044415L);
                out[49 + outpos] = (in[33 + inpos] >>> 44)
                        | ((in[34 + inpos] & 16777215L) << (44 - 24));
                out[50 + outpos] = (in[34 + inpos] >>> 24)
                        | ((in[35 + inpos] & 15L) << (44 - 4));
                out[51 + outpos] = ((in[35 + inpos] >>> 4) & 17592186044415L);
                out[52 + outpos] = (in[35 + inpos] >>> 48)
                        | ((in[36 + inpos] & 268435455L) << (44 - 28));
                out[53 + outpos] = (in[36 + inpos] >>> 28)
                        | ((in[37 + inpos] & 255L) << (44 - 8));
                out[54 + outpos] = ((in[37 + inpos] >>> 8) & 17592186044415L);
                out[55 + outpos] = (in[37 + inpos] >>> 52)
                        | ((in[38 + inpos] & 4294967295L) << (44 - 32));
                out[56 + outpos] = (in[38 + inpos] >>> 32)
                        | ((in[39 + inpos] & 4095L) << (44 - 12));
                out[57 + outpos] = ((in[39 + inpos] >>> 12) & 17592186044415L);
                out[58 + outpos] = (in[39 + inpos] >>> 56)
                        | ((in[40 + inpos] & 68719476735L) << (44 - 36));
                out[59 + outpos] = (in[40 + inpos] >>> 36)
                        | ((in[41 + inpos] & 65535L) << (44 - 16));
                out[60 + outpos] = ((in[41 + inpos] >>> 16) & 17592186044415L);
                out[61 + outpos] = (in[41 + inpos] >>> 60)
                        | ((in[42 + inpos] & 1099511627775L) << (44 - 40));
                out[62 + outpos] = (in[42 + inpos] >>> 40)
                        | ((in[43 + inpos] & 1048575L) << (44 - 20));
                out[63 + outpos] = (in[43 + inpos] >>> 20);
        }

        protected static void fastunpack45(final long[] in, int inpos,
                final long[] out, int outpos) {
                out[outpos] = (in[inpos] & 35184372088831L);
                out[1 + outpos] = (in[inpos] >>> 45)
                        | ((in[1 + inpos] & 67108863L) << (45 - 26));
                out[2 + outpos] = (in[1 + inpos] >>> 26)
                        | ((in[2 + inpos] & 127L) << (45 - 7));
                out[3 + outpos] = ((in[2 + inpos] >>> 7) & 35184372088831L);
                out[4 + outpos] = (in[2 + inpos] >>> 52)
                        | ((in[3 + inpos] & 8589934591L) << (45 - 33));
                out[5 + outpos] = (in[3 + inpos] >>> 33)
                        | ((in[4 + inpos] & 16383L) << (45 - 14));
                out[6 + outpos] = ((in[4 + inpos] >>> 14) & 35184372088831L);
                out[7 + outpos] = (in[4 + inpos] >>> 59)
                        | ((in[5 + inpos] & 1099511627775L) << (45 - 40));
                out[8 + outpos] = (in[5 + inpos] >>> 40)
                        | ((in[6 + inpos] & 2097151L) << (45 - 21));
                out[9 + outpos] = (in[6 + inpos] >>> 21)
                        | ((in[7 + inpos] & 3L) << (45 - 2));
                out[10 + outpos] = ((in[7 + inpos] >>> 2) & 35184372088831L);
                out[11 + outpos] = (in[7 + inpos] >>> 47)
                        | ((in[8 + inpos] & 268435455L) << (45 - 28));
                out[12 + outpos] = (in[8 + inpos] >>> 28)
                        | ((in[9 + inpos] & 511L) << (45 - 9));
                out[13 + outpos] = ((in[9 + inpos] >>> 9) & 35184372088831L);
                out[14 + outpos] = (in[9 + inpos] >>> 54)
                        | ((in[10 + inpos] & 34359738367L) << (45 - 35));
                out[15 + outpos] = (in[10 + inpos] >>> 35)
                        | ((in[11 + inpos] & 65535L) << (45 - 16));
                out[16 + outpos] = ((in[11 + inpos] >>> 16) & 35184372088831L);
                out[17 + outpos] = (in[11 + inpos] >>> 61)
                        | ((in[12 + inpos] & 4398046511103L) << (45 - 42));
                out[18 + outpos] = (in[12 + inpos] >>> 42)
                        | ((in[13 + inpos] & 8388607L) << (45 - 23));
                out[19 + outpos] = (in[13 + inpos] >>> 23)
                        | ((in[14 + inpos] & 15L) << (45 - 4));
                out[20 + outpos] = ((in[14 + inpos] >>> 4) & 35184372088831L);
                out[21 + outpos] = (in[14 + inpos] >>> 49)
                        | ((in[15 + inpos] & 1073741823L) << (45 - 30));
                out[22 + outpos] = (in[15 + inpos] >>> 30)
                        | ((in[16 + inpos] & 2047L) << (45 - 11));
                out[23 + outpos] = ((in[16 + inpos] >>> 11) & 35184372088831L);
                out[24 + outpos] = (in[16 + inpos] >>> 56)
                        | ((in[17 + inpos] & 137438953471L) << (45 - 37));
                out[25 + outpos] = (in[17 + inpos] >>> 37)
                        | ((in[18 + inpos] & 262143L) << (45 - 18));
                out[26 + outpos] = ((in[18 + inpos] >>> 18) & 35184372088831L);
                out[27 + outpos] = (in[18 + inpos] >>> 63)
                        | ((in[19 + inpos] & 17592186044415L) << (45 - 44));
                out[28 + outpos] = (in[19 + inpos] >>> 44)
                        | ((in[20 + inpos] & 33554431L) << (45 - 25));
                out[29 + outpos] = (in[20 + inpos] >>> 25)
                        | ((in[21 + inpos] & 63L) << (45 - 6));
                out[30 + outpos] = ((in[21 + inpos] >>> 6) & 35184372088831L);
                out[31 + outpos] = (in[21 + inpos] >>> 51)
                        | ((in[22 + inpos] & 4294967295L) << (45 - 32));
                out[32 + outpos] = (in[22 + inpos] >>> 32)
                        | ((in[23 + inpos] & 8191L) << (45 - 13));
                out[33 + outpos] = ((in[23 + inpos] >>> 13) & 35184372088831L);
                out[34 + outpos] = (in[23 + inpos] >>> 58)
                        | ((in[24 + inpos] & 549755813887L) << (45 - 39));
                out[35 + outpos] = (in[24 + inpos] >>> 39)
                        | ((in[25 + inpos] & 1048575L) << (45 - 20));
                out[36 + outpos] = (in[25 + inpos] >>> 20)
                        | ((in[26 + inpos] & 1L) << (45 - 1));
                out[37 + outpos] = ((in[26 + inpos] >>> 1) & 35184372088831L);
                out[38 + outpos] = (in[26 + inpos] >>> 46)
                        | ((in[27 + inpos] & 134217727L) << (45 - 27));
                out[39 + outpos] = (in[27 + inpos] >>> 27)
                        | ((in[28 + inpos] & 255L) << (45 - 8));
                out[40 + outpos] = ((in[28 + inpos] >>> 8) & 35184372088831L);
                out[41 + outpos] = (in[28 + inpos] >>> 53)
                        | ((in[29 + inpos] & 17179869183L) << (45 - 34));
                out[42 + outpos] = (in[29 + inpos] >>> 34)
                        | ((in[30 + inpos] & 32767L) << (45 - 15));
                out[43 + outpos] = ((in[30 + inpos] >>> 15) & 35184372088831L);
                out[44 + outpos] = (in[30 + inpos] >>> 60)
                        | ((in[31 + inpos] & 2199023255551L) << (45 - 41));
                out[45 + outpos] = (in[31 + inpos] >>> 41)
                        | ((in[32 + inpos] & 4194303L) << (45 - 22));
                out[46 + outpos] = (in[32 + inpos] >>> 22)
                        | ((in[33 + inpos] & 7L) << (45 - 3));
                out[47 + outpos] = ((in[33 + inpos] >>> 3) & 35184372088831L);
                out[48 + outpos] = (in[33 + inpos] >>> 48)
                        | ((in[34 + inpos] & 536870911L) << (45 - 29));
                out[49 + outpos] = (in[34 + inpos] >>> 29)
                        | ((in[35 + inpos] & 1023L) << (45 - 10));
                out[50 + outpos] = ((in[35 + inpos] >>> 10) & 35184372088831L);
                out[51 + outpos] = (in[35 + inpos] >>> 55)
                        | ((in[36 + inpos] & 68719476735L) << (45 - 36));
                out[52 + outpos] = (in[36 + inpos] >>> 36)
                        | ((in[37 + inpos] & 131071L) << (45 - 17));
                out[53 + outpos] = ((in[37 + inpos] >>> 17) & 35184372088831L);
                out[54 + outpos] = (in[37 + inpos] >>> 62)
                        | ((in[38 + inpos] & 8796093022207L) << (45 - 43));
                out[55 + outpos] = (in[38 + inpos] >>> 43)
                        | ((in[39 + inpos] & 16777215L) << (45 - 24));
                out[56 + outpos] = (in[39 + inpos] >>> 24)
                        | ((in[40 + inpos] & 31L) << (45 - 5));
                out[57 + outpos] = ((in[40 + inpos] >>> 5) & 35184372088831L);
                out[58 + outpos] = (in[40 + inpos] >>> 50)
                        | ((in[41 + inpos] & 2147483647L) << (45 - 31));
                out[59 + outpos] = (in[41 + inpos] >>> 31)
                        | ((in[42 + inpos] & 4095L) << (45 - 12));
                out[60 + outpos] = ((in[42 + inpos] >>> 12) & 35184372088831L);
                out[61 + outpos] = (in[42 + inpos] >>> 57)
                        | ((in[43 + inpos] & 274877906943L) << (45 - 38));
                out[62 + outpos] = (in[43 + inpos] >>> 38)
                        | ((in[44 + inpos] & 524287L) << (45 - 19));
                out[63 + outpos] = (in[44 + inpos] >>> 19);
        }

        protected static void fastunpack46(final long[] in, int inpos,
                final long[] out, int outpos) {
                out[outpos] = (in[inpos] & 70368744177663L);
                out[1 + outpos] = (in[inpos] >>> 46)
                        | ((in[1 + inpos] & 268435455L) << (46 - 28));
                out[2 + outpos] = (in[1 + inpos] >>> 28)
                        | ((in[2 + inpos] & 1023L) << (46 - 10));
                out[3 + outpos] = ((in[2 + inpos] >>> 10) & 70368744177663L);
                out[4 + outpos] = (in[2 + inpos] >>> 56)
                        | ((in[3 + inpos] & 274877906943L) << (46 - 38));
                out[5 + outpos] = (in[3 + inpos] >>> 38)
                        | ((in[4 + inpos] & 1048575L) << (46 - 20));
                out[6 + outpos] = (in[4 + inpos] >>> 20)
                        | ((in[5 + inpos] & 3L) << (46 - 2));
                out[7 + outpos] = ((in[5 + inpos] >>> 2) & 70368744177663L);
                out[8 + outpos] = (in[5 + inpos] >>> 48)
                        | ((in[6 + inpos] & 1073741823L) << (46 - 30));
                out[9 + outpos] = (in[6 + inpos] >>> 30)
                        | ((in[7 + inpos] & 4095L) << (46 - 12));
                out[10 + outpos] = ((in[7 + inpos] >>> 12) & 70368744177663L);
                out[11 + outpos] = (in[7 + inpos] >>> 58)
                        | ((in[8 + inpos] & 1099511627775L) << (46 - 40));
                out[12 + outpos] = (in[8 + inpos] >>> 40)
                        | ((in[9 + inpos] & 4194303L) << (46 - 22));
                out[13 + outpos] = (in[9 + inpos] >>> 22)
                        | ((in[10 + inpos] & 15L) << (46 - 4));
                out[14 + outpos] = ((in[10 + inpos] >>> 4) & 70368744177663L);
                out[15 + outpos] = (in[10 + inpos] >>> 50)
                        | ((in[11 + inpos] & 4294967295L) << (46 - 32));
                out[16 + outpos] = (in[11 + inpos] >>> 32)
                        | ((in[12 + inpos] & 16383L) << (46 - 14));
                out[17 + outpos] = ((in[12 + inpos] >>> 14) & 70368744177663L);
                out[18 + outpos] = (in[12 + inpos] >>> 60)
                        | ((in[13 + inpos] & 4398046511103L) << (46 - 42));
                out[19 + outpos] = (in[13 + inpos] >>> 42)
                        | ((in[14 + inpos] & 16777215L) << (46 - 24));
                out[20 + outpos] = (in[14 + inpos] >>> 24)
                        | ((in[15 + inpos] & 63L) << (46 - 6));
                out[21 + outpos] = ((in[15 + inpos] >>> 6) & 70368744177663L);
                out[22 + outpos] = (in[15 + inpos] >>> 52)
                        | ((in[16 + inpos] & 17179869183L) << (46 - 34));
                out[23 + outpos] = (in[16 + inpos] >>> 34)
                        | ((in[17 + inpos] & 65535L) << (46 - 16));
                out[24 + outpos] = ((in[17 + inpos] >>> 16) & 70368744177663L);
                out[25 + outpos] = (in[17 + inpos] >>> 62)
                        | ((in[18 + inpos] & 17592186044415L) << (46 - 44));
                out[26 + outpos] = (in[18 + inpos] >>> 44)
                        | ((in[19 + inpos] & 67108863L) << (46 - 26));
                out[27 + outpos] = (in[19 + inpos] >>> 26)
                        | ((in[20 + inpos] & 255L) << (46 - 8));
                out[28 + outpos] = ((in[20 + inpos] >>> 8) & 70368744177663L);
                out[29 + outpos] = (in[20 + inpos] >>> 54)
                        | ((in[21 + inpos] & 68719476735L) << (46 - 36));
                out[30 + outpos] = (in[21 + inpos] >>> 36)
                        | ((in[22 + inpos] & 262143L) << (46 - 18));
                out[31 + outpos] = (in[22 + inpos] >>> 18);
                out[32 + outpos] = (in[23 + inpos] & 70368744177663L);
                out[33 + outpos] = (in[23 + inpos] >>> 46)
                        | ((in[24 + inpos] & 268435455L) << (46 - 28));
                out[34 + outpos] = (in[24 + inpos] >>> 28)
                        | ((in[25 + inpos] & 1023L) << (46 - 10));
                out[35 + outpos] = ((in[25 + inpos] >>> 10) & 70368744177663L);
                out[36 + outpos] = (in[25 + inpos] >>> 56)
                        | ((in[26 + inpos] & 274877906943L) << (46 - 38));
                out[37 + outpos] = (in[26 + inpos] >>> 38)
                        | ((in[27 + inpos] & 1048575L) << (46 - 20));
                out[38 + outpos] = (in[27 + inpos] >>> 20)
                        | ((in[28 + inpos] & 3L) << (46 - 2));
                out[39 + outpos] = ((in[28 + inpos] >>> 2) & 70368744177663L);
                out[40 + outpos] = (in[28 + inpos] >>> 48)
                        | ((in[29 + inpos] & 1073741823L) << (46 - 30));
                out[41 + outpos] = (in[29 + inpos] >>> 30)
                        | ((in[30 + inpos] & 4095L) << (46 - 12));
                out[42 + outpos] = ((in[30 + inpos] >>> 12) & 70368744177663L);
                out[43 + outpos] = (in[30 + inpos] >>> 58)
                        | ((in[31 + inpos] & 1099511627775L) << (46 - 40));
                out[44 + outpos] = (in[31 + inpos] >>> 40)
                        | ((in[32 + inpos] & 4194303L) << (46 - 22));
                out[45 + outpos] = (in[32 + inpos] >>> 22)
                        | ((in[33 + inpos] & 15L) << (46 - 4));
                out[46 + outpos] = ((in[33 + inpos] >>> 4) & 70368744177663L);
                out[47 + outpos] = (in[33 + inpos] >>> 50)
                        | ((in[34 + inpos] & 4294967295L) << (46 - 32));
                out[48 + outpos] = (in[34 + inpos] >>> 32)
                        | ((in[35 + inpos] & 16383L) << (46 - 14));
                out[49 + outpos] = ((in[35 + inpos] >>> 14) & 70368744177663L);
                out[50 + outpos] = (in[35 + inpos] >>> 60)
                        | ((in[36 + inpos] & 4398046511103L) << (46 - 42));
                out[51 + outpos] = (in[36 + inpos] >>> 42)
                        | ((in[37 + inpos] & 16777215L) << (46 - 24));
                out[52 + outpos] = (in[37 + inpos] >>> 24)
                        | ((in[38 + inpos] & 63L) << (46 - 6));
                out[53 + outpos] = ((in[38 + inpos] >>> 6) & 70368744177663L);
                out[54 + outpos] = (in[38 + inpos] >>> 52)
                        | ((in[39 + inpos] & 17179869183L) << (46 - 34));
                out[55 + outpos] = (in[39 + inpos] >>> 34)
                        | ((in[40 + inpos] & 65535L) << (46 - 16));
                out[56 + outpos] = ((in[40 + inpos] >>> 16) & 70368744177663L);
                out[57 + outpos] = (in[40 + inpos] >>> 62)
                        | ((in[41 + inpos] & 17592186044415L) << (46 - 44));
                out[58 + outpos] = (in[41 + inpos] >>> 44)
                        | ((in[42 + inpos] & 67108863L) << (46 - 26));
                out[59 + outpos] = (in[42 + inpos] >>> 26)
                        | ((in[43 + inpos] & 255L) << (46 - 8));
                out[60 + outpos] = ((in[43 + inpos] >>> 8) & 70368744177663L);
                out[61 + outpos] = (in[43 + inpos] >>> 54)
                        | ((in[44 + inpos] & 68719476735L) << (46 - 36));
                out[62 + outpos] = (in[44 + inpos] >>> 36)
                        | ((in[45 + inpos] & 262143L) << (46 - 18));
                out[63 + outpos] = (in[45 + inpos] >>> 18);
        }

        protected static void fastunpack47(final long[] in, int inpos,
                final long[] out, int outpos) {
                out[outpos] = (in[inpos] & 140737488355327L);
                out[1 + outpos] = (in[inpos] >>> 47)
                        | ((in[1 + inpos] & 1073741823L) << (47 - 30));
                out[2 + outpos] = (in[1 + inpos] >>> 30)
                        | ((in[2 + inpos] & 8191L) << (47 - 13));
                out[3 + outpos] = ((in[2 + inpos] >>> 13) & 140737488355327L);
                out[4 + outpos] = (in[2 + inpos] >>> 60)
                        | ((in[3 + inpos] & 8796093022207L) << (47 - 43));
                out[5 + outpos] = (in[3 + inpos] >>> 43)
                        | ((in[4 + inpos] & 67108863L) << (47 - 26));
                out[6 + outpos] = (in[4 + inpos] >>> 26)
                        | ((in[5 + inpos] & 511L) << (47 - 9));
                out[7 + outpos] = ((in[5 + inpos] >>> 9) & 140737488355327L);
                out[8 + outpos] = (in[5 + inpos] >>> 56)
                        | ((in[6 + inpos] & 549755813887L) << (47 - 39));
                out[9 + outpos] = (in[6 + inpos] >>> 39)
                        | ((in[7 + inpos] & 4194303L) << (47 - 22));
                out[10 + outpos] = (in[7 + inpos] >>> 22)
                        | ((in[8 + inpos] & 31L) << (47 - 5));
                out[11 + outpos] = ((in[8 + inpos] >>> 5) & 140737488355327L);
                out[12 + outpos] = (in[8 + inpos] >>> 52)
                        | ((in[9 + inpos] & 34359738367L) << (47 - 35));
                out[13 + outpos] = (in[9 + inpos] >>> 35)
                        | ((in[10 + inpos] & 262143L) << (47 - 18));
                out[14 + outpos] = (in[10 + inpos] >>> 18)
                        | ((in[11 + inpos] & 1L) << (47 - 1));
                out[15 + outpos] = ((in[11 + inpos] >>> 1) & 140737488355327L);
                out[16 + outpos] = (in[11 + inpos] >>> 48)
                        | ((in[12 + inpos] & 2147483647L) << (47 - 31));
                out[17 + outpos] = (in[12 + inpos] >>> 31)
                        | ((in[13 + inpos] & 16383L) << (47 - 14));
                out[18 + outpos] = ((in[13 + inpos] >>> 14) & 140737488355327L);
                out[19 + outpos] = (in[13 + inpos] >>> 61)
                        | ((in[14 + inpos] & 17592186044415L) << (47 - 44));
                out[20 + outpos] = (in[14 + inpos] >>> 44)
                        | ((in[15 + inpos] & 134217727L) << (47 - 27));
                out[21 + outpos] = (in[15 + inpos] >>> 27)
                        | ((in[16 + inpos] & 1023L) << (47 - 10));
                out[22 + outpos] = ((in[16 + inpos] >>> 10) & 140737488355327L);
                out[23 + outpos] = (in[16 + inpos] >>> 57)
                        | ((in[17 + inpos] & 1099511627775L) << (47 - 40));
                out[24 + outpos] = (in[17 + inpos] >>> 40)
                        | ((in[18 + inpos] & 8388607L) << (47 - 23));
                out[25 + outpos] = (in[18 + inpos] >>> 23)
                        | ((in[19 + inpos] & 63L) << (47 - 6));
                out[26 + outpos] = ((in[19 + inpos] >>> 6) & 140737488355327L);
                out[27 + outpos] = (in[19 + inpos] >>> 53)
                        | ((in[20 + inpos] & 68719476735L) << (47 - 36));
                out[28 + outpos] = (in[20 + inpos] >>> 36)
                        | ((in[21 + inpos] & 524287L) << (47 - 19));
                out[29 + outpos] = (in[21 + inpos] >>> 19)
                        | ((in[22 + inpos] & 3L) << (47 - 2));
                out[30 + outpos] = ((in[22 + inpos] >>> 2) & 140737488355327L);
                out[31 + outpos] = (in[22 + inpos] >>> 49)
                        | ((in[23 + inpos] & 4294967295L) << (47 - 32));
                out[32 + outpos] = (in[23 + inpos] >>> 32)
                        | ((in[24 + inpos] & 32767L) << (47 - 15));
                out[33 + outpos] = ((in[24 + inpos] >>> 15) & 140737488355327L);
                out[34 + outpos] = (in[24 + inpos] >>> 62)
                        | ((in[25 + inpos] & 35184372088831L) << (47 - 45));
                out[35 + outpos] = (in[25 + inpos] >>> 45)
                        | ((in[26 + inpos] & 268435455L) << (47 - 28));
                out[36 + outpos] = (in[26 + inpos] >>> 28)
                        | ((in[27 + inpos] & 2047L) << (47 - 11));
                out[37 + outpos] = ((in[27 + inpos] >>> 11) & 140737488355327L);
                out[38 + outpos] = (in[27 + inpos] >>> 58)
                        | ((in[28 + inpos] & 2199023255551L) << (47 - 41));
                out[39 + outpos] = (in[28 + inpos] >>> 41)
                        | ((in[29 + inpos] & 16777215L) << (47 - 24));
                out[40 + outpos] = (in[29 + inpos] >>> 24)
                        | ((in[30 + inpos] & 127L) << (47 - 7));
                out[41 + outpos] = ((in[30 + inpos] >>> 7) & 140737488355327L);
                out[42 + outpos] = (in[30 + inpos] >>> 54)
                        | ((in[31 + inpos] & 137438953471L) << (47 - 37));
                out[43 + outpos] = (in[31 + inpos] >>> 37)
                        | ((in[32 + inpos] & 1048575L) << (47 - 20));
                out[44 + outpos] = (in[32 + inpos] >>> 20)
                        | ((in[33 + inpos] & 7L) << (47 - 3));
                out[45 + outpos] = ((in[33 + inpos] >>> 3) & 140737488355327L);
                out[46 + outpos] = (in[33 + inpos] >>> 50)
                        | ((in[34 + inpos] & 8589934591L) << (47 - 33));
                out[47 + outpos] = (in[34 + inpos] >>> 33)
                        | ((in[35 + inpos] & 65535L) << (47 - 16));
                out[48 + outpos] = ((in[35 + inpos] >>> 16) & 140737488355327L);
                out[49 + outpos] = (in[35 + inpos] >>> 63)
                        | ((in[36 + inpos] & 70368744177663L) << (47 - 46));
                out[50 + outpos] = (in[36 + inpos] >>> 46)
                        | ((in[37 + inpos] & 536870911L) << (47 - 29));
                out[51 + outpos] = (in[37 + inpos] >>> 29)
                        | ((in[38 + inpos] & 4095L) << (47 - 12));
                out[52 + outpos] = ((in[38 + inpos] >>> 12) & 140737488355327L);
                out[53 + outpos] = (in[38 + inpos] >>> 59)
                        | ((in[39 + inpos] & 4398046511103L) << (47 - 42));
                out[54 + outpos] = (in[39 + inpos] >>> 42)
                        | ((in[40 + inpos] & 33554431L) << (47 - 25));
                out[55 + outpos] = (in[40 + inpos] >>> 25)
                        | ((in[41 + inpos] & 255L) << (47 - 8));
                out[56 + outpos] = ((in[41 + inpos] >>> 8) & 140737488355327L);
                out[57 + outpos] = (in[41 + inpos] >>> 55)
                        | ((in[42 + inpos] & 274877906943L) << (47 - 38));
                out[58 + outpos] = (in[42 + inpos] >>> 38)
                        | ((in[43 + inpos] & 2097151L) << (47 - 21));
                out[59 + outpos] = (in[43 + inpos] >>> 21)
                        | ((in[44 + inpos] & 15L) << (47 - 4));
                out[60 + outpos] = ((in[44 + inpos] >>> 4) & 140737488355327L);
                out[61 + outpos] = (in[44 + inpos] >>> 51)
                        | ((in[45 + inpos] & 17179869183L) << (47 - 34));
                out[62 + outpos] = (in[45 + inpos] >>> 34)
                        | ((in[46 + inpos] & 131071L) << (47 - 17));
                out[63 + outpos] = (in[46 + inpos] >>> 17);
        }

        protected static void fastunpack48(final long[] in, int inpos,
                final long[] out, int outpos) {
                out[outpos] = (in[inpos] & 281474976710655L);
                out[1 + outpos] = (in[inpos] >>> 48)
                        | ((in[1 + inpos] & 4294967295L) << (48 - 32));
                out[2 + outpos] = (in[1 + inpos] >>> 32)
                        | ((in[2 + inpos] & 65535L) << (48 - 16));
                out[3 + outpos] = (in[2 + inpos] >>> 16);
                out[4 + outpos] = (in[3 + inpos] & 281474976710655L);
                out[5 + outpos] = (in[3 + inpos] >>> 48)
                        | ((in[4 + inpos] & 4294967295L) << (48 - 32));
                out[6 + outpos] = (in[4 + inpos] >>> 32)
                        | ((in[5 + inpos] & 65535L) << (48 - 16));
                out[7 + outpos] = (in[5 + inpos] >>> 16);
                out[8 + outpos] = (in[6 + inpos] & 281474976710655L);
                out[9 + outpos] = (in[6 + inpos] >>> 48)
                        | ((in[7 + inpos] & 4294967295L) << (48 - 32));
                out[10 + outpos] = (in[7 + inpos] >>> 32)
                        | ((in[8 + inpos] & 65535L) << (48 - 16));
                out[11 + outpos] = (in[8 + inpos] >>> 16);
                out[12 + outpos] = (in[9 + inpos] & 281474976710655L);
                out[13 + outpos] = (in[9 + inpos] >>> 48)
                        | ((in[10 + inpos] & 4294967295L) << (48 - 32));
                out[14 + outpos] = (in[10 + inpos] >>> 32)
                        | ((in[11 + inpos] & 65535L) << (48 - 16));
                out[15 + outpos] = (in[11 + inpos] >>> 16);
                out[16 + outpos] = (in[12 + inpos] & 281474976710655L);
                out[17 + outpos] = (in[12 + inpos] >>> 48)
                        | ((in[13 + inpos] & 4294967295L) << (48 - 32));
                out[18 + outpos] = (in[13 + inpos] >>> 32)
                        | ((in[14 + inpos] & 65535L) << (48 - 16));
                out[19 + outpos] = (in[14 + inpos] >>> 16);
                out[20 + outpos] = (in[15 + inpos] & 281474976710655L);
                out[21 + outpos] = (in[15 + inpos] >>> 48)
                        | ((in[16 + inpos] & 4294967295L) << (48 - 32));
                out[22 + outpos] = (in[16 + inpos] >>> 32)
                        | ((in[17 + inpos] & 65535L) << (48 - 16));
                out[23 + outpos] = (in[17 + inpos] >>> 16);
                out[24 + outpos] = (in[18 + inpos] & 281474976710655L);
                out[25 + outpos] = (in[18 + inpos] >>> 48)
                        | ((in[19 + inpos] & 4294967295L) << (48 - 32));
                out[26 + outpos] = (in[19 + inpos] >>> 32)
                        | ((in[20 + inpos] & 65535L) << (48 - 16));
                out[27 + outpos] = (in[20 + inpos] >>> 16);
                out[28 + outpos] = (in[21 + inpos] & 281474976710655L);
                out[29 + outpos] = (in[21 + inpos] >>> 48)
                        | ((in[22 + inpos] & 4294967295L) << (48 - 32));
                out[30 + outpos] = (in[22 + inpos] >>> 32)
                        | ((in[23 + inpos] & 65535L) << (48 - 16));
                out[31 + outpos] = (in[23 + inpos] >>> 16);
                out[32 + outpos] = (in[24 + inpos] & 281474976710655L);
                out[33 + outpos] = (in[24 + inpos] >>> 48)
                        | ((in[25 + inpos] & 4294967295L) << (48 - 32));
                out[34 + outpos] = (in[25 + inpos] >>> 32)
                        | ((in[26 + inpos] & 65535L) << (48 - 16));
                out[35 + outpos] = (in[26 + inpos] >>> 16);
                out[36 + outpos] = (in[27 + inpos] & 281474976710655L);
                out[37 + outpos] = (in[27 + inpos] >>> 48)
                        | ((in[28 + inpos] & 4294967295L) << (48 - 32));
                out[38 + outpos] = (in[28 + inpos] >>> 32)
                        | ((in[29 + inpos] & 65535L) << (48 - 16));
                out[39 + outpos] = (in[29 + inpos] >>> 16);
                out[40 + outpos] = (in[30 + inpos] & 281474976710655L);
                out[41 + outpos] = (in[30 + inpos] >>> 48)
                        | ((in[31 + inpos] & 4294967295L) << (48 - 32));
                out[42 + outpos] = (in[31 + inpos] >>> 32)
                        | ((in[32 + inpos] & 65535L) << (48 - 16));
                out[43 + outpos] = (in[32 + inpos] >>> 16);
                out[44 + outpos] = (in[33 + inpos] & 281474976710655L);
                out[45 + outpos] = (in[33 + inpos] >>> 48)
                        | ((in[34 + inpos] & 4294967295L) << (48 - 32));
                out[46 + outpos] = (in[34 + inpos] >>> 32)
                        | ((in[35 + inpos] & 65535L) << (48 - 16));
                out[47 + outpos] = (in[35 + inpos] >>> 16);
                out[48 + outpos] = (in[36 + inpos] & 281474976710655L);
                out[49 + outpos] = (in[36 + inpos] >>> 48)
                        | ((in[37 + inpos] & 4294967295L) << (48 - 32));
                out[50 + outpos] = (in[37 + inpos] >>> 32)
                        | ((in[38 + inpos] & 65535L) << (48 - 16));
                out[51 + outpos] = (in[38 + inpos] >>> 16);
                out[52 + outpos] = (in[39 + inpos] & 281474976710655L);
                out[53 + outpos] = (in[39 + inpos] >>> 48)
                        | ((in[40 + inpos] & 4294967295L) << (48 - 32));
                out[54 + outpos] = (in[40 + inpos] >>> 32)
                        | ((in[41 + inpos] & 65535L) << (48 - 16));
                out[55 + outpos] = (in[41 + inpos] >>> 16);
                out[56 + outpos] = (in[42 + inpos] & 281474976710655L);
                out[57 + outpos] = (in[42 + inpos] >>> 48)
                        | ((in[43 + inpos] & 4294967295L) << (48 - 32));
                out[58 + outpos] = (in[43 + inpos] >>> 32)
                        | ((in[44 + inpos] & 65535L) << (48 - 16));
                out[59 + outpos] = (in[44 + inpos] >>> 16);
                out[60 + outpos] = (in[45 + inpos] & 281474976710655L);
                out[61 + outpos] = (in[45 + inpos] >>> 48)
                        | ((in[46 + inpos] & 4294967295L) << (48 - 32));
                out[62 + outpos] = (in[46 + inpos] >>> 32)
                        | ((in[47 + inpos] & 65535L) << (48 - 16));
                out[63 + outpos] = (in[47 + inpos] >>> 16);
        }

        protected static void fastunpack49(final long[] in, int inpos,
                final long[] out, int outpos) {
                out[outpos] = (in[inpos] & 562949953421311L);
                out[1 + outpos] = (in[inpos] >>> 49)
                        | ((in[1 + inpos] & 17179869183L) << (49 - 34));
                out[2 + outpos] = (in[1 + inpos] >>> 34)
                        | ((in[2 + inpos] & 524287L) << (49 - 19));
                out[3 + outpos] = (in[2 + inpos] >>> 19)
                        | ((in[3 + inpos] & 15L) << (49 - 4));
                out[4 + outpos] = ((in[3 + inpos] >>> 4) & 562949953421311L);
                out[5 + outpos] = (in[3 + inpos] >>> 53)
                        | ((in[4 + inpos] & 274877906943L) << (49 - 38));
                out[6 + outpos] = (in[4 + inpos] >>> 38)
                        | ((in[5 + inpos] & 8388607L) << (49 - 23));
                out[7 + outpos] = (in[5 + inpos] >>> 23)
                        | ((in[6 + inpos] & 255L) << (49 - 8));
                out[8 + outpos] = ((in[6 + inpos] >>> 8) & 562949953421311L);
                out[9 + outpos] = (in[6 + inpos] >>> 57)
                        | ((in[7 + inpos] & 4398046511103L) << (49 - 42));
                out[10 + outpos] = (in[7 + inpos] >>> 42)
                        | ((in[8 + inpos] & 134217727L) << (49 - 27));
                out[11 + outpos] = (in[8 + inpos] >>> 27)
                        | ((in[9 + inpos] & 4095L) << (49 - 12));
                out[12 + outpos] = ((in[9 + inpos] >>> 12) & 562949953421311L);
                out[13 + outpos] = (in[9 + inpos] >>> 61)
                        | ((in[10 + inpos] & 70368744177663L) << (49 - 46));
                out[14 + outpos] = (in[10 + inpos] >>> 46)
                        | ((in[11 + inpos] & 2147483647L) << (49 - 31));
                out[15 + outpos] = (in[11 + inpos] >>> 31)
                        | ((in[12 + inpos] & 65535L) << (49 - 16));
                out[16 + outpos] = (in[12 + inpos] >>> 16)
                        | ((in[13 + inpos] & 1L) << (49 - 1));
                out[17 + outpos] = ((in[13 + inpos] >>> 1) & 562949953421311L);
                out[18 + outpos] = (in[13 + inpos] >>> 50)
                        | ((in[14 + inpos] & 34359738367L) << (49 - 35));
                out[19 + outpos] = (in[14 + inpos] >>> 35)
                        | ((in[15 + inpos] & 1048575L) << (49 - 20));
                out[20 + outpos] = (in[15 + inpos] >>> 20)
                        | ((in[16 + inpos] & 31L) << (49 - 5));
                out[21 + outpos] = ((in[16 + inpos] >>> 5) & 562949953421311L);
                out[22 + outpos] = (in[16 + inpos] >>> 54)
                        | ((in[17 + inpos] & 549755813887L) << (49 - 39));
                out[23 + outpos] = (in[17 + inpos] >>> 39)
                        | ((in[18 + inpos] & 16777215L) << (49 - 24));
                out[24 + outpos] = (in[18 + inpos] >>> 24)
                        | ((in[19 + inpos] & 511L) << (49 - 9));
                out[25 + outpos] = ((in[19 + inpos] >>> 9) & 562949953421311L);
                out[26 + outpos] = (in[19 + inpos] >>> 58)
                        | ((in[20 + inpos] & 8796093022207L) << (49 - 43));
                out[27 + outpos] = (in[20 + inpos] >>> 43)
                        | ((in[21 + inpos] & 268435455L) << (49 - 28));
                out[28 + outpos] = (in[21 + inpos] >>> 28)
                        | ((in[22 + inpos] & 8191L) << (49 - 13));
                out[29 + outpos] = ((in[22 + inpos] >>> 13) & 562949953421311L);
                out[30 + outpos] = (in[22 + inpos] >>> 62)
                        | ((in[23 + inpos] & 140737488355327L) << (49 - 47));
                out[31 + outpos] = (in[23 + inpos] >>> 47)
                        | ((in[24 + inpos] & 4294967295L) << (49 - 32));
                out[32 + outpos] = (in[24 + inpos] >>> 32)
                        | ((in[25 + inpos] & 131071L) << (49 - 17));
                out[33 + outpos] = (in[25 + inpos] >>> 17)
                        | ((in[26 + inpos] & 3L) << (49 - 2));
                out[34 + outpos] = ((in[26 + inpos] >>> 2) & 562949953421311L);
                out[35 + outpos] = (in[26 + inpos] >>> 51)
                        | ((in[27 + inpos] & 68719476735L) << (49 - 36));
                out[36 + outpos] = (in[27 + inpos] >>> 36)
                        | ((in[28 + inpos] & 2097151L) << (49 - 21));
                out[37 + outpos] = (in[28 + inpos] >>> 21)
                        | ((in[29 + inpos] & 63L) << (49 - 6));
                out[38 + outpos] = ((in[29 + inpos] >>> 6) & 562949953421311L);
                out[39 + outpos] = (in[29 + inpos] >>> 55)
                        | ((in[30 + inpos] & 1099511627775L) << (49 - 40));
                out[40 + outpos] = (in[30 + inpos] >>> 40)
                        | ((in[31 + inpos] & 33554431L) << (49 - 25));
                out[41 + outpos] = (in[31 + inpos] >>> 25)
                        | ((in[32 + inpos] & 1023L) << (49 - 10));
                out[42 + outpos] = ((in[32 + inpos] >>> 10) & 562949953421311L);
                out[43 + outpos] = (in[32 + inpos] >>> 59)
                        | ((in[33 + inpos] & 17592186044415L) << (49 - 44));
                out[44 + outpos] = (in[33 + inpos] >>> 44)
                        | ((in[34 + inpos] & 536870911L) << (49 - 29));
                out[45 + outpos] = (in[34 + inpos] >>> 29)
                        | ((in[35 + inpos] & 16383L) << (49 - 14));
                out[46 + outpos] = ((in[35 + inpos] >>> 14) & 562949953421311L);
                out[47 + outpos] = (in[35 + inpos] >>> 63)
                        | ((in[36 + inpos] & 281474976710655L) << (49 - 48));
                out[48 + outpos] = (in[36 + inpos] >>> 48)
                        | ((in[37 + inpos] & 8589934591L) << (49 - 33));
                out[49 + outpos] = (in[37 + inpos] >>> 33)
                        | ((in[38 + inpos] & 262143L) << (49 - 18));
                out[50 + outpos] = (in[38 + inpos] >>> 18)
                        | ((in[39 + inpos] & 7L) << (49 - 3));
                out[51 + outpos] = ((in[39 + inpos] >>> 3) & 562949953421311L);
                out[52 + outpos] = (in[39 + inpos] >>> 52)
                        | ((in[40 + inpos] & 137438953471L) << (49 - 37));
                out[53 + outpos] = (in[40 + inpos] >>> 37)
                        | ((in[41 + inpos] & 4194303L) << (49 - 22));
                out[54 + outpos] = (in[41 + inpos] >>> 22)
                        | ((in[42 + inpos] & 127L) << (49 - 7));
                out[55 + outpos] = ((in[42 + inpos] >>> 7) & 562949953421311L);
                out[56 + outpos] = (in[42 + inpos] >>> 56)
                        | ((in[43 + inpos] & 2199023255551L) << (49 - 41));
                out[57 + outpos] = (in[43 + inpos] >>> 41)
                        | ((in[44 + inpos] & 67108863L) << (49 - 26));
                out[58 + outpos] = (in[44 + inpos] >>> 26)
                        | ((in[45 + inpos] & 2047L) << (49 - 11));
                out[59 + outpos] = ((in[45 + inpos] >>> 11) & 562949953421311L);
                out[60 + outpos] = (in[45 + inpos] >>> 60)
                        | ((in[46 + inpos] & 35184372088831L) << (49 - 45));
                out[61 + outpos] = (in[46 + inpos] >>> 45)
                        | ((in[47 + inpos] & 1073741823L) << (49 - 30));
                out[62 + outpos] = (in[47 + inpos] >>> 30)
                        | ((in[48 + inpos] & 32767L) << (49 - 15));
                out[63 + outpos] = (in[48 + inpos] >>> 15);
        }

        protected static void fastunpack50(final long[] in, int inpos,
                final long[] out, int outpos) {
                out[outpos] = (in[inpos] & 1125899906842623L);
                out[1 + outpos] = (in[inpos] >>> 50)
                        | ((in[1 + inpos] & 68719476735L) << (50 - 36));
                out[2 + outpos] = (in[1 + inpos] >>> 36)
                        | ((in[2 + inpos] & 4194303L) << (50 - 22));
                out[3 + outpos] = (in[2 + inpos] >>> 22)
                        | ((in[3 + inpos] & 255L) << (50 - 8));
                out[4 + outpos] = ((in[3 + inpos] >>> 8) & 1125899906842623L);
                out[5 + outpos] = (in[3 + inpos] >>> 58)
                        | ((in[4 + inpos] & 17592186044415L) << (50 - 44));
                out[6 + outpos] = (in[4 + inpos] >>> 44)
                        | ((in[5 + inpos] & 1073741823L) << (50 - 30));
                out[7 + outpos] = (in[5 + inpos] >>> 30)
                        | ((in[6 + inpos] & 65535L) << (50 - 16));
                out[8 + outpos] = (in[6 + inpos] >>> 16)
                        | ((in[7 + inpos] & 3L) << (50 - 2));
                out[9 + outpos] = ((in[7 + inpos] >>> 2) & 1125899906842623L);
                out[10 + outpos] = (in[7 + inpos] >>> 52)
                        | ((in[8 + inpos] & 274877906943L) << (50 - 38));
                out[11 + outpos] = (in[8 + inpos] >>> 38)
                        | ((in[9 + inpos] & 16777215L) << (50 - 24));
                out[12 + outpos] = (in[9 + inpos] >>> 24)
                        | ((in[10 + inpos] & 1023L) << (50 - 10));
                out[13 + outpos] = ((in[10 + inpos] >>> 10) & 1125899906842623L);
                out[14 + outpos] = (in[10 + inpos] >>> 60)
                        | ((in[11 + inpos] & 70368744177663L) << (50 - 46));
                out[15 + outpos] = (in[11 + inpos] >>> 46)
                        | ((in[12 + inpos] & 4294967295L) << (50 - 32));
                out[16 + outpos] = (in[12 + inpos] >>> 32)
                        | ((in[13 + inpos] & 262143L) << (50 - 18));
                out[17 + outpos] = (in[13 + inpos] >>> 18)
                        | ((in[14 + inpos] & 15L) << (50 - 4));
                out[18 + outpos] = ((in[14 + inpos] >>> 4) & 1125899906842623L);
                out[19 + outpos] = (in[14 + inpos] >>> 54)
                        | ((in[15 + inpos] & 1099511627775L) << (50 - 40));
                out[20 + outpos] = (in[15 + inpos] >>> 40)
                        | ((in[16 + inpos] & 67108863L) << (50 - 26));
                out[21 + outpos] = (in[16 + inpos] >>> 26)
                        | ((in[17 + inpos] & 4095L) << (50 - 12));
                out[22 + outpos] = ((in[17 + inpos] >>> 12) & 1125899906842623L);
                out[23 + outpos] = (in[17 + inpos] >>> 62)
                        | ((in[18 + inpos] & 281474976710655L) << (50 - 48));
                out[24 + outpos] = (in[18 + inpos] >>> 48)
                        | ((in[19 + inpos] & 17179869183L) << (50 - 34));
                out[25 + outpos] = (in[19 + inpos] >>> 34)
                        | ((in[20 + inpos] & 1048575L) << (50 - 20));
                out[26 + outpos] = (in[20 + inpos] >>> 20)
                        | ((in[21 + inpos] & 63L) << (50 - 6));
                out[27 + outpos] = ((in[21 + inpos] >>> 6) & 1125899906842623L);
                out[28 + outpos] = (in[21 + inpos] >>> 56)
                        | ((in[22 + inpos] & 4398046511103L) << (50 - 42));
                out[29 + outpos] = (in[22 + inpos] >>> 42)
                        | ((in[23 + inpos] & 268435455L) << (50 - 28));
                out[30 + outpos] = (in[23 + inpos] >>> 28)
                        | ((in[24 + inpos] & 16383L) << (50 - 14));
                out[31 + outpos] = (in[24 + inpos] >>> 14);
                out[32 + outpos] = (in[25 + inpos] & 1125899906842623L);
                out[33 + outpos] = (in[25 + inpos] >>> 50)
                        | ((in[26 + inpos] & 68719476735L) << (50 - 36));
                out[34 + outpos] = (in[26 + inpos] >>> 36)
                        | ((in[27 + inpos] & 4194303L) << (50 - 22));
                out[35 + outpos] = (in[27 + inpos] >>> 22)
                        | ((in[28 + inpos] & 255L) << (50 - 8));
                out[36 + outpos] = ((in[28 + inpos] >>> 8) & 1125899906842623L);
                out[37 + outpos] = (in[28 + inpos] >>> 58)
                        | ((in[29 + inpos] & 17592186044415L) << (50 - 44));
                out[38 + outpos] = (in[29 + inpos] >>> 44)
                        | ((in[30 + inpos] & 1073741823L) << (50 - 30));
                out[39 + outpos] = (in[30 + inpos] >>> 30)
                        | ((in[31 + inpos] & 65535L) << (50 - 16));
                out[40 + outpos] = (in[31 + inpos] >>> 16)
                        | ((in[32 + inpos] & 3L) << (50 - 2));
                out[41 + outpos] = ((in[32 + inpos] >>> 2) & 1125899906842623L);
                out[42 + outpos] = (in[32 + inpos] >>> 52)
                        | ((in[33 + inpos] & 274877906943L) << (50 - 38));
                out[43 + outpos] = (in[33 + inpos] >>> 38)
                        | ((in[34 + inpos] & 16777215L) << (50 - 24));
                out[44 + outpos] = (in[34 + inpos] >>> 24)
                        | ((in[35 + inpos] & 1023L) << (50 - 10));
                out[45 + outpos] = ((in[35 + inpos] >>> 10) & 1125899906842623L);
                out[46 + outpos] = (in[35 + inpos] >>> 60)
                        | ((in[36 + inpos] & 70368744177663L) << (50 - 46));
                out[47 + outpos] = (in[36 + inpos] >>> 46)
                        | ((in[37 + inpos] & 4294967295L) << (50 - 32));
                out[48 + outpos] = (in[37 + inpos] >>> 32)
                        | ((in[38 + inpos] & 262143L) << (50 - 18));
                out[49 + outpos] = (in[38 + inpos] >>> 18)
                        | ((in[39 + inpos] & 15L) << (50 - 4));
                out[50 + outpos] = ((in[39 + inpos] >>> 4) & 1125899906842623L);
                out[51 + outpos] = (in[39 + inpos] >>> 54)
                        | ((in[40 + inpos] & 1099511627775L) << (50 - 40));
                out[52 + outpos] = (in[40 + inpos] >>> 40)
                        | ((in[41 + inpos] & 67108863L) << (50 - 26));
                out[53 + outpos] = (in[41 + inpos] >>> 26)
                        | ((in[42 + inpos] & 4095L) << (50 - 12));
                out[54 + outpos] = ((in[42 + inpos] >>> 12) & 1125899906842623L);
                out[55 + outpos] = (in[42 + inpos] >>> 62)
                        | ((in[43 + inpos] & 281474976710655L) << (50 - 48));
                out[56 + outpos] = (in[43 + inpos] >>> 48)
                        | ((in[44 + inpos] & 17179869183L) << (50 - 34));
                out[57 + outpos] = (in[44 + inpos] >>> 34)
                        | ((in[45 + inpos] & 1048575L) << (50 - 20));
                out[58 + outpos] = (in[45 + inpos] >>> 20)
                        | ((in[46 + inpos] & 63L) << (50 - 6));
                out[59 + outpos] = ((in[46 + inpos] >>> 6) & 1125899906842623L);
                out[60 + outpos] = (in[46 + inpos] >>> 56)
                        | ((in[47 + inpos] & 4398046511103L) << (50 - 42));
                out[61 + outpos] = (in[47 + inpos] >>> 42)
                        | ((in[48 + inpos] & 268435455L) << (50 - 28));
                out[62 + outpos] = (in[48 + inpos] >>> 28)
                        | ((in[49 + inpos] & 16383L) << (50 - 14));
                out[63 + outpos] = (in[49 + inpos] >>> 14);
        }

        protected static void fastunpack51(final long[] in, int inpos,
                final long[] out, int outpos) {
                out[outpos] = (in[inpos] & 2251799813685247L);
                out[1 + outpos] = (in[inpos] >>> 51)
                        | ((in[1 + inpos] & 274877906943L) << (51 - 38));
                out[2 + outpos] = (in[1 + inpos] >>> 38)
                        | ((in[2 + inpos] & 33554431L) << (51 - 25));
                out[3 + outpos] = (in[2 + inpos] >>> 25)
                        | ((in[3 + inpos] & 4095L) << (51 - 12));
                out[4 + outpos] = ((in[3 + inpos] >>> 12) & 2251799813685247L);
                out[5 + outpos] = (in[3 + inpos] >>> 63)
                        | ((in[4 + inpos] & 1125899906842623L) << (51 - 50));
                out[6 + outpos] = (in[4 + inpos] >>> 50)
                        | ((in[5 + inpos] & 137438953471L) << (51 - 37));
                out[7 + outpos] = (in[5 + inpos] >>> 37)
                        | ((in[6 + inpos] & 16777215L) << (51 - 24));
                out[8 + outpos] = (in[6 + inpos] >>> 24)
                        | ((in[7 + inpos] & 2047L) << (51 - 11));
                out[9 + outpos] = ((in[7 + inpos] >>> 11) & 2251799813685247L);
                out[10 + outpos] = (in[7 + inpos] >>> 62)
                        | ((in[8 + inpos] & 562949953421311L) << (51 - 49));
                out[11 + outpos] = (in[8 + inpos] >>> 49)
                        | ((in[9 + inpos] & 68719476735L) << (51 - 36));
                out[12 + outpos] = (in[9 + inpos] >>> 36)
                        | ((in[10 + inpos] & 8388607L) << (51 - 23));
                out[13 + outpos] = (in[10 + inpos] >>> 23)
                        | ((in[11 + inpos] & 1023L) << (51 - 10));
                out[14 + outpos] = ((in[11 + inpos] >>> 10) & 2251799813685247L);
                out[15 + outpos] = (in[11 + inpos] >>> 61)
                        | ((in[12 + inpos] & 281474976710655L) << (51 - 48));
                out[16 + outpos] = (in[12 + inpos] >>> 48)
                        | ((in[13 + inpos] & 34359738367L) << (51 - 35));
                out[17 + outpos] = (in[13 + inpos] >>> 35)
                        | ((in[14 + inpos] & 4194303L) << (51 - 22));
                out[18 + outpos] = (in[14 + inpos] >>> 22)
                        | ((in[15 + inpos] & 511L) << (51 - 9));
                out[19 + outpos] = ((in[15 + inpos] >>> 9) & 2251799813685247L);
                out[20 + outpos] = (in[15 + inpos] >>> 60)
                        | ((in[16 + inpos] & 140737488355327L) << (51 - 47));
                out[21 + outpos] = (in[16 + inpos] >>> 47)
                        | ((in[17 + inpos] & 17179869183L) << (51 - 34));
                out[22 + outpos] = (in[17 + inpos] >>> 34)
                        | ((in[18 + inpos] & 2097151L) << (51 - 21));
                out[23 + outpos] = (in[18 + inpos] >>> 21)
                        | ((in[19 + inpos] & 255L) << (51 - 8));
                out[24 + outpos] = ((in[19 + inpos] >>> 8) & 2251799813685247L);
                out[25 + outpos] = (in[19 + inpos] >>> 59)
                        | ((in[20 + inpos] & 70368744177663L) << (51 - 46));
                out[26 + outpos] = (in[20 + inpos] >>> 46)
                        | ((in[21 + inpos] & 8589934591L) << (51 - 33));
                out[27 + outpos] = (in[21 + inpos] >>> 33)
                        | ((in[22 + inpos] & 1048575L) << (51 - 20));
                out[28 + outpos] = (in[22 + inpos] >>> 20)
                        | ((in[23 + inpos] & 127L) << (51 - 7));
                out[29 + outpos] = ((in[23 + inpos] >>> 7) & 2251799813685247L);
                out[30 + outpos] = (in[23 + inpos] >>> 58)
                        | ((in[24 + inpos] & 35184372088831L) << (51 - 45));
                out[31 + outpos] = (in[24 + inpos] >>> 45)
                        | ((in[25 + inpos] & 4294967295L) << (51 - 32));
                out[32 + outpos] = (in[25 + inpos] >>> 32)
                        | ((in[26 + inpos] & 524287L) << (51 - 19));
                out[33 + outpos] = (in[26 + inpos] >>> 19)
                        | ((in[27 + inpos] & 63L) << (51 - 6));
                out[34 + outpos] = ((in[27 + inpos] >>> 6) & 2251799813685247L);
                out[35 + outpos] = (in[27 + inpos] >>> 57)
                        | ((in[28 + inpos] & 17592186044415L) << (51 - 44));
                out[36 + outpos] = (in[28 + inpos] >>> 44)
                        | ((in[29 + inpos] & 2147483647L) << (51 - 31));
                out[37 + outpos] = (in[29 + inpos] >>> 31)
                        | ((in[30 + inpos] & 262143L) << (51 - 18));
                out[38 + outpos] = (in[30 + inpos] >>> 18)
                        | ((in[31 + inpos] & 31L) << (51 - 5));
                out[39 + outpos] = ((in[31 + inpos] >>> 5) & 2251799813685247L);
                out[40 + outpos] = (in[31 + inpos] >>> 56)
                        | ((in[32 + inpos] & 8796093022207L) << (51 - 43));
                out[41 + outpos] = (in[32 + inpos] >>> 43)
                        | ((in[33 + inpos] & 1073741823L) << (51 - 30));
                out[42 + outpos] = (in[33 + inpos] >>> 30)
                        | ((in[34 + inpos] & 131071L) << (51 - 17));
                out[43 + outpos] = (in[34 + inpos] >>> 17)
                        | ((in[35 + inpos] & 15L) << (51 - 4));
                out[44 + outpos] = ((in[35 + inpos] >>> 4) & 2251799813685247L);
                out[45 + outpos] = (in[35 + inpos] >>> 55)
                        | ((in[36 + inpos] & 4398046511103L) << (51 - 42));
                out[46 + outpos] = (in[36 + inpos] >>> 42)
                        | ((in[37 + inpos] & 536870911L) << (51 - 29));
                out[47 + outpos] = (in[37 + inpos] >>> 29)
                        | ((in[38 + inpos] & 65535L) << (51 - 16));
                out[48 + outpos] = (in[38 + inpos] >>> 16)
                        | ((in[39 + inpos] & 7L) << (51 - 3));
                out[49 + outpos] = ((in[39 + inpos] >>> 3) & 2251799813685247L);
                out[50 + outpos] = (in[39 + inpos] >>> 54)
                        | ((in[40 + inpos] & 2199023255551L) << (51 - 41));
                out[51 + outpos] = (in[40 + inpos] >>> 41)
                        | ((in[41 + inpos] & 268435455L) << (51 - 28));
                out[52 + outpos] = (in[41 + inpos] >>> 28)
                        | ((in[42 + inpos] & 32767L) << (51 - 15));
                out[53 + outpos] = (in[42 + inpos] >>> 15)
                        | ((in[43 + inpos] & 3L) << (51 - 2));
                out[54 + outpos] = ((in[43 + inpos] >>> 2) & 2251799813685247L);
                out[55 + outpos] = (in[43 + inpos] >>> 53)
                        | ((in[44 + inpos] & 1099511627775L) << (51 - 40));
                out[56 + outpos] = (in[44 + inpos] >>> 40)
                        | ((in[45 + inpos] & 134217727L) << (51 - 27));
                out[57 + outpos] = (in[45 + inpos] >>> 27)
                        | ((in[46 + inpos] & 16383L) << (51 - 14));
                out[58 + outpos] = (in[46 + inpos] >>> 14)
                        | ((in[47 + inpos] & 1L) << (51 - 1));
                out[59 + outpos] = ((in[47 + inpos] >>> 1) & 2251799813685247L);
                out[60 + outpos] = (in[47 + inpos] >>> 52)
                        | ((in[48 + inpos] & 549755813887L) << (51 - 39));
                out[61 + outpos] = (in[48 + inpos] >>> 39)
                        | ((in[49 + inpos] & 67108863L) << (51 - 26));
                out[62 + outpos] = (in[49 + inpos] >>> 26)
                        | ((in[50 + inpos] & 8191L) << (51 - 13));
                out[63 + outpos] = (in[50 + inpos] >>> 13);
        }

        protected static void fastunpack52(final long[] in, int inpos,
                final long[] out, int outpos) {
                out[outpos] = (in[inpos] & 4503599627370495L);
                out[1 + outpos] = (in[inpos] >>> 52)
                        | ((in[1 + inpos] & 1099511627775L) << (52 - 40));
                out[2 + outpos] = (in[1 + inpos] >>> 40)
                        | ((in[2 + inpos] & 268435455L) << (52 - 28));
                out[3 + outpos] = (in[2 + inpos] >>> 28)
                        | ((in[3 + inpos] & 65535L) << (52 - 16));
                out[4 + outpos] = (in[3 + inpos] >>> 16)
                        | ((in[4 + inpos] & 15L) << (52 - 4));
                out[5 + outpos] = ((in[4 + inpos] >>> 4) & 4503599627370495L);
                out[6 + outpos] = (in[4 + inpos] >>> 56)
                        | ((in[5 + inpos] & 17592186044415L) << (52 - 44));
                out[7 + outpos] = (in[5 + inpos] >>> 44)
                        | ((in[6 + inpos] & 4294967295L) << (52 - 32));
                out[8 + outpos] = (in[6 + inpos] >>> 32)
                        | ((in[7 + inpos] & 1048575L) << (52 - 20));
                out[9 + outpos] = (in[7 + inpos] >>> 20)
                        | ((in[8 + inpos] & 255L) << (52 - 8));
                out[10 + outpos] = ((in[8 + inpos] >>> 8) & 4503599627370495L);
                out[11 + outpos] = (in[8 + inpos] >>> 60)
                        | ((in[9 + inpos] & 281474976710655L) << (52 - 48));
                out[12 + outpos] = (in[9 + inpos] >>> 48)
                        | ((in[10 + inpos] & 68719476735L) << (52 - 36));
                out[13 + outpos] = (in[10 + inpos] >>> 36)
                        | ((in[11 + inpos] & 16777215L) << (52 - 24));
                out[14 + outpos] = (in[11 + inpos] >>> 24)
                        | ((in[12 + inpos] & 4095L) << (52 - 12));
                out[15 + outpos] = (in[12 + inpos] >>> 12);
                out[16 + outpos] = (in[13 + inpos] & 4503599627370495L);
                out[17 + outpos] = (in[13 + inpos] >>> 52)
                        | ((in[14 + inpos] & 1099511627775L) << (52 - 40));
                out[18 + outpos] = (in[14 + inpos] >>> 40)
                        | ((in[15 + inpos] & 268435455L) << (52 - 28));
                out[19 + outpos] = (in[15 + inpos] >>> 28)
                        | ((in[16 + inpos] & 65535L) << (52 - 16));
                out[20 + outpos] = (in[16 + inpos] >>> 16)
                        | ((in[17 + inpos] & 15L) << (52 - 4));
                out[21 + outpos] = ((in[17 + inpos] >>> 4) & 4503599627370495L);
                out[22 + outpos] = (in[17 + inpos] >>> 56)
                        | ((in[18 + inpos] & 17592186044415L) << (52 - 44));
                out[23 + outpos] = (in[18 + inpos] >>> 44)
                        | ((in[19 + inpos] & 4294967295L) << (52 - 32));
                out[24 + outpos] = (in[19 + inpos] >>> 32)
                        | ((in[20 + inpos] & 1048575L) << (52 - 20));
                out[25 + outpos] = (in[20 + inpos] >>> 20)
                        | ((in[21 + inpos] & 255L) << (52 - 8));
                out[26 + outpos] = ((in[21 + inpos] >>> 8) & 4503599627370495L);
                out[27 + outpos] = (in[21 + inpos] >>> 60)
                        | ((in[22 + inpos] & 281474976710655L) << (52 - 48));
                out[28 + outpos] = (in[22 + inpos] >>> 48)
                        | ((in[23 + inpos] & 68719476735L) << (52 - 36));
                out[29 + outpos] = (in[23 + inpos] >>> 36)
                        | ((in[24 + inpos] & 16777215L) << (52 - 24));
                out[30 + outpos] = (in[24 + inpos] >>> 24)
                        | ((in[25 + inpos] & 4095L) << (52 - 12));
                out[31 + outpos] = (in[25 + inpos] >>> 12);
                out[32 + outpos] = (in[26 + inpos] & 4503599627370495L);
                out[33 + outpos] = (in[26 + inpos] >>> 52)
                        | ((in[27 + inpos] & 1099511627775L) << (52 - 40));
                out[34 + outpos] = (in[27 + inpos] >>> 40)
                        | ((in[28 + inpos] & 268435455L) << (52 - 28));
                out[35 + outpos] = (in[28 + inpos] >>> 28)
                        | ((in[29 + inpos] & 65535L) << (52 - 16));
                out[36 + outpos] = (in[29 + inpos] >>> 16)
                        | ((in[30 + inpos] & 15L) << (52 - 4));
                out[37 + outpos] = ((in[30 + inpos] >>> 4) & 4503599627370495L);
                out[38 + outpos] = (in[30 + inpos] >>> 56)
                        | ((in[31 + inpos] & 17592186044415L) << (52 - 44));
                out[39 + outpos] = (in[31 + inpos] >>> 44)
                        | ((in[32 + inpos] & 4294967295L) << (52 - 32));
                out[40 + outpos] = (in[32 + inpos] >>> 32)
                        | ((in[33 + inpos] & 1048575L) << (52 - 20));
                out[41 + outpos] = (in[33 + inpos] >>> 20)
                        | ((in[34 + inpos] & 255L) << (52 - 8));
                out[42 + outpos] = ((in[34 + inpos] >>> 8) & 4503599627370495L);
                out[43 + outpos] = (in[34 + inpos] >>> 60)
                        | ((in[35 + inpos] & 281474976710655L) << (52 - 48));
                out[44 + outpos] = (in[35 + inpos] >>> 48)
                        | ((in[36 + inpos] & 68719476735L) << (52 - 36));
                out[45 + outpos] = (in[36 + inpos] >>> 36)
                        | ((in[37 + inpos] & 16777215L) << (52 - 24));
                out[46 + outpos] = (in[37 + inpos] >>> 24)
                        | ((in[38 + inpos] & 4095L) << (52 - 12));
                out[47 + outpos] = (in[38 + inpos] >>> 12);
                out[48 + outpos] = (in[39 + inpos] & 4503599627370495L);
                out[49 + outpos] = (in[39 + inpos] >>> 52)
                        | ((in[40 + inpos] & 1099511627775L) << (52 - 40));
                out[50 + outpos] = (in[40 + inpos] >>> 40)
                        | ((in[41 + inpos] & 268435455L) << (52 - 28));
                out[51 + outpos] = (in[41 + inpos] >>> 28)
                        | ((in[42 + inpos] & 65535L) << (52 - 16));
                out[52 + outpos] = (in[42 + inpos] >>> 16)
                        | ((in[43 + inpos] & 15L) << (52 - 4));
                out[53 + outpos] = ((in[43 + inpos] >>> 4) & 4503599627370495L);
                out[54 + outpos] = (in[43 + inpos] >>> 56)
                        | ((in[44 + inpos] & 17592186044415L) << (52 - 44));
                out[55 + outpos] = (in[44 + inpos] >>> 44)
                        | ((in[45 + inpos] & 4294967295L) << (52 - 32));
                out[56 + outpos] = (in[45 + inpos] >>> 32)
                        | ((in[46 + inpos] & 1048575L) << (52 - 20));
                out[57 + outpos] = (in[46 + inpos] >>> 20)
                        | ((in[47 + inpos] & 255L) << (52 - 8));
                out[58 + outpos] = ((in[47 + inpos] >>> 8) & 4503599627370495L);
                out[59 + outpos] = (in[47 + inpos] >>> 60)
                        | ((in[48 + inpos] & 281474976710655L) << (52 - 48));
                out[60 + outpos] = (in[48 + inpos] >>> 48)
                        | ((in[49 + inpos] & 68719476735L) << (52 - 36));
                out[61 + outpos] = (in[49 + inpos] >>> 36)
                        | ((in[50 + inpos] & 16777215L) << (52 - 24));
                out[62 + outpos] = (in[50 + inpos] >>> 24)
                        | ((in[51 + inpos] & 4095L) << (52 - 12));
                out[63 + outpos] = (in[51 + inpos] >>> 12);
        }

        protected static void fastunpack53(final long[] in, int inpos,
                final long[] out, int outpos) {
                out[outpos] = (in[inpos] & 9007199254740991L);
                out[1 + outpos] = (in[inpos] >>> 53)
                        | ((in[1 + inpos] & 4398046511103L) << (53 - 42));
                out[2 + outpos] = (in[1 + inpos] >>> 42)
                        | ((in[2 + inpos] & 2147483647L) << (53 - 31));
                out[3 + outpos] = (in[2 + inpos] >>> 31)
                        | ((in[3 + inpos] & 1048575L) << (53 - 20));
                out[4 + outpos] = (in[3 + inpos] >>> 20)
                        | ((in[4 + inpos] & 511L) << (53 - 9));
                out[5 + outpos] = ((in[4 + inpos] >>> 9) & 9007199254740991L);
                out[6 + outpos] = (in[4 + inpos] >>> 62)
                        | ((in[5 + inpos] & 2251799813685247L) << (53 - 51));
                out[7 + outpos] = (in[5 + inpos] >>> 51)
                        | ((in[6 + inpos] & 1099511627775L) << (53 - 40));
                out[8 + outpos] = (in[6 + inpos] >>> 40)
                        | ((in[7 + inpos] & 536870911L) << (53 - 29));
                out[9 + outpos] = (in[7 + inpos] >>> 29)
                        | ((in[8 + inpos] & 262143L) << (53 - 18));
                out[10 + outpos] = (in[8 + inpos] >>> 18)
                        | ((in[9 + inpos] & 127L) << (53 - 7));
                out[11 + outpos] = ((in[9 + inpos] >>> 7) & 9007199254740991L);
                out[12 + outpos] = (in[9 + inpos] >>> 60)
                        | ((in[10 + inpos] & 562949953421311L) << (53 - 49));
                out[13 + outpos] = (in[10 + inpos] >>> 49)
                        | ((in[11 + inpos] & 274877906943L) << (53 - 38));
                out[14 + outpos] = (in[11 + inpos] >>> 38)
                        | ((in[12 + inpos] & 134217727L) << (53 - 27));
                out[15 + outpos] = (in[12 + inpos] >>> 27)
                        | ((in[13 + inpos] & 65535L) << (53 - 16));
                out[16 + outpos] = (in[13 + inpos] >>> 16)
                        | ((in[14 + inpos] & 31L) << (53 - 5));
                out[17 + outpos] = ((in[14 + inpos] >>> 5) & 9007199254740991L);
                out[18 + outpos] = (in[14 + inpos] >>> 58)
                        | ((in[15 + inpos] & 140737488355327L) << (53 - 47));
                out[19 + outpos] = (in[15 + inpos] >>> 47)
                        | ((in[16 + inpos] & 68719476735L) << (53 - 36));
                out[20 + outpos] = (in[16 + inpos] >>> 36)
                        | ((in[17 + inpos] & 33554431L) << (53 - 25));
                out[21 + outpos] = (in[17 + inpos] >>> 25)
                        | ((in[18 + inpos] & 16383L) << (53 - 14));
                out[22 + outpos] = (in[18 + inpos] >>> 14)
                        | ((in[19 + inpos] & 7L) << (53 - 3));
                out[23 + outpos] = ((in[19 + inpos] >>> 3) & 9007199254740991L);
                out[24 + outpos] = (in[19 + inpos] >>> 56)
                        | ((in[20 + inpos] & 35184372088831L) << (53 - 45));
                out[25 + outpos] = (in[20 + inpos] >>> 45)
                        | ((in[21 + inpos] & 17179869183L) << (53 - 34));
                out[26 + outpos] = (in[21 + inpos] >>> 34)
                        | ((in[22 + inpos] & 8388607L) << (53 - 23));
                out[27 + outpos] = (in[22 + inpos] >>> 23)
                        | ((in[23 + inpos] & 4095L) << (53 - 12));
                out[28 + outpos] = (in[23 + inpos] >>> 12)
                        | ((in[24 + inpos] & 1L) << (53 - 1));
                out[29 + outpos] = ((in[24 + inpos] >>> 1) & 9007199254740991L);
                out[30 + outpos] = (in[24 + inpos] >>> 54)
                        | ((in[25 + inpos] & 8796093022207L) << (53 - 43));
                out[31 + outpos] = (in[25 + inpos] >>> 43)
                        | ((in[26 + inpos] & 4294967295L) << (53 - 32));
                out[32 + outpos] = (in[26 + inpos] >>> 32)
                        | ((in[27 + inpos] & 2097151L) << (53 - 21));
                out[33 + outpos] = (in[27 + inpos] >>> 21)
                        | ((in[28 + inpos] & 1023L) << (53 - 10));
                out[34 + outpos] = ((in[28 + inpos] >>> 10) & 9007199254740991L);
                out[35 + outpos] = (in[28 + inpos] >>> 63)
                        | ((in[29 + inpos] & 4503599627370495L) << (53 - 52));
                out[36 + outpos] = (in[29 + inpos] >>> 52)
                        | ((in[30 + inpos] & 2199023255551L) << (53 - 41));
                out[37 + outpos] = (in[30 + inpos] >>> 41)
                        | ((in[31 + inpos] & 1073741823L) << (53 - 30));
                out[38 + outpos] = (in[31 + inpos] >>> 30)
                        | ((in[32 + inpos] & 524287L) << (53 - 19));
                out[39 + outpos] = (in[32 + inpos] >>> 19)
                        | ((in[33 + inpos] & 255L) << (53 - 8));
                out[40 + outpos] = ((in[33 + inpos] >>> 8) & 9007199254740991L);
                out[41 + outpos] = (in[33 + inpos] >>> 61)
                        | ((in[34 + inpos] & 1125899906842623L) << (53 - 50));
                out[42 + outpos] = (in[34 + inpos] >>> 50)
                        | ((in[35 + inpos] & 549755813887L) << (53 - 39));
                out[43 + outpos] = (in[35 + inpos] >>> 39)
                        | ((in[36 + inpos] & 268435455L) << (53 - 28));
                out[44 + outpos] = (in[36 + inpos] >>> 28)
                        | ((in[37 + inpos] & 131071L) << (53 - 17));
                out[45 + outpos] = (in[37 + inpos] >>> 17)
                        | ((in[38 + inpos] & 63L) << (53 - 6));
                out[46 + outpos] = ((in[38 + inpos] >>> 6) & 9007199254740991L);
                out[47 + outpos] = (in[38 + inpos] >>> 59)
                        | ((in[39 + inpos] & 281474976710655L) << (53 - 48));
                out[48 + outpos] = (in[39 + inpos] >>> 48)
                        | ((in[40 + inpos] & 137438953471L) << (53 - 37));
                out[49 + outpos] = (in[40 + inpos] >>> 37)
                        | ((in[41 + inpos] & 67108863L) << (53 - 26));
                out[50 + outpos] = (in[41 + inpos] >>> 26)
                        | ((in[42 + inpos] & 32767L) << (53 - 15));
                out[51 + outpos] = (in[42 + inpos] >>> 15)
                        | ((in[43 + inpos] & 15L) << (53 - 4));
                out[52 + outpos] = ((in[43 + inpos] >>> 4) & 9007199254740991L);
                out[53 + outpos] = (in[43 + inpos] >>> 57)
                        | ((in[44 + inpos] & 70368744177663L) << (53 - 46));
                out[54 + outpos] = (in[44 + inpos] >>> 46)
                        | ((in[45 + inpos] & 34359738367L) << (53 - 35));
                out[55 + outpos] = (in[45 + inpos] >>> 35)
                        | ((in[46 + inpos] & 16777215L) << (53 - 24));
                out[56 + outpos] = (in[46 + inpos] >>> 24)
                        | ((in[47 + inpos] & 8191L) << (53 - 13));
                out[57 + outpos] = (in[47 + inpos] >>> 13)
                        | ((in[48 + inpos] & 3L) << (53 - 2));
                out[58 + outpos] = ((in[48 + inpos] >>> 2) & 9007199254740991L);
                out[59 + outpos] = (in[48 + inpos] >>> 55)
                        | ((in[49 + inpos] & 17592186044415L) << (53 - 44));
                out[60 + outpos] = (in[49 + inpos] >>> 44)
                        | ((in[50 + inpos] & 8589934591L) << (53 - 33));
                out[61 + outpos] = (in[50 + inpos] >>> 33)
                        | ((in[51 + inpos] & 4194303L) << (53 - 22));
                out[62 + outpos] = (in[51 + inpos] >>> 22)
                        | ((in[52 + inpos] & 2047L) << (53 - 11));
                out[63 + outpos] = (in[52 + inpos] >>> 11);
        }

        protected static void fastunpack54(final long[] in, int inpos,
                final long[] out, int outpos) {
                out[outpos] = (in[inpos] & 18014398509481983L);
                out[1 + outpos] = (in[inpos] >>> 54)
                        | ((in[1 + inpos] & 17592186044415L) << (54 - 44));
                out[2 + outpos] = (in[1 + inpos] >>> 44)
                        | ((in[2 + inpos] & 17179869183L) << (54 - 34));
                out[3 + outpos] = (in[2 + inpos] >>> 34)
                        | ((in[3 + inpos] & 16777215L) << (54 - 24));
                out[4 + outpos] = (in[3 + inpos] >>> 24)
                        | ((in[4 + inpos] & 16383L) << (54 - 14));
                out[5 + outpos] = (in[4 + inpos] >>> 14)
                        | ((in[5 + inpos] & 15L) << (54 - 4));
                out[6 + outpos] = ((in[5 + inpos] >>> 4) & 18014398509481983L);
                out[7 + outpos] = (in[5 + inpos] >>> 58)
                        | ((in[6 + inpos] & 281474976710655L) << (54 - 48));
                out[8 + outpos] = (in[6 + inpos] >>> 48)
                        | ((in[7 + inpos] & 274877906943L) << (54 - 38));
                out[9 + outpos] = (in[7 + inpos] >>> 38)
                        | ((in[8 + inpos] & 268435455L) << (54 - 28));
                out[10 + outpos] = (in[8 + inpos] >>> 28)
                        | ((in[9 + inpos] & 262143L) << (54 - 18));
                out[11 + outpos] = (in[9 + inpos] >>> 18)
                        | ((in[10 + inpos] & 255L) << (54 - 8));
                out[12 + outpos] = ((in[10 + inpos] >>> 8) & 18014398509481983L);
                out[13 + outpos] = (in[10 + inpos] >>> 62)
                        | ((in[11 + inpos] & 4503599627370495L) << (54 - 52));
                out[14 + outpos] = (in[11 + inpos] >>> 52)
                        | ((in[12 + inpos] & 4398046511103L) << (54 - 42));
                out[15 + outpos] = (in[12 + inpos] >>> 42)
                        | ((in[13 + inpos] & 4294967295L) << (54 - 32));
                out[16 + outpos] = (in[13 + inpos] >>> 32)
                        | ((in[14 + inpos] & 4194303L) << (54 - 22));
                out[17 + outpos] = (in[14 + inpos] >>> 22)
                        | ((in[15 + inpos] & 4095L) << (54 - 12));
                out[18 + outpos] = (in[15 + inpos] >>> 12)
                        | ((in[16 + inpos] & 3L) << (54 - 2));
                out[19 + outpos] = ((in[16 + inpos] >>> 2) & 18014398509481983L);
                out[20 + outpos] = (in[16 + inpos] >>> 56)
                        | ((in[17 + inpos] & 70368744177663L) << (54 - 46));
                out[21 + outpos] = (in[17 + inpos] >>> 46)
                        | ((in[18 + inpos] & 68719476735L) << (54 - 36));
                out[22 + outpos] = (in[18 + inpos] >>> 36)
                        | ((in[19 + inpos] & 67108863L) << (54 - 26));
                out[23 + outpos] = (in[19 + inpos] >>> 26)
                        | ((in[20 + inpos] & 65535L) << (54 - 16));
                out[24 + outpos] = (in[20 + inpos] >>> 16)
                        | ((in[21 + inpos] & 63L) << (54 - 6));
                out[25 + outpos] = ((in[21 + inpos] >>> 6) & 18014398509481983L);
                out[26 + outpos] = (in[21 + inpos] >>> 60)
                        | ((in[22 + inpos] & 1125899906842623L) << (54 - 50));
                out[27 + outpos] = (in[22 + inpos] >>> 50)
                        | ((in[23 + inpos] & 1099511627775L) << (54 - 40));
                out[28 + outpos] = (in[23 + inpos] >>> 40)
                        | ((in[24 + inpos] & 1073741823L) << (54 - 30));
                out[29 + outpos] = (in[24 + inpos] >>> 30)
                        | ((in[25 + inpos] & 1048575L) << (54 - 20));
                out[30 + outpos] = (in[25 + inpos] >>> 20)
                        | ((in[26 + inpos] & 1023L) << (54 - 10));
                out[31 + outpos] = (in[26 + inpos] >>> 10);
                out[32 + outpos] = (in[27 + inpos] & 18014398509481983L);
                out[33 + outpos] = (in[27 + inpos] >>> 54)
                        | ((in[28 + inpos] & 17592186044415L) << (54 - 44));
                out[34 + outpos] = (in[28 + inpos] >>> 44)
                        | ((in[29 + inpos] & 17179869183L) << (54 - 34));
                out[35 + outpos] = (in[29 + inpos] >>> 34)
                        | ((in[30 + inpos] & 16777215L) << (54 - 24));
                out[36 + outpos] = (in[30 + inpos] >>> 24)
                        | ((in[31 + inpos] & 16383L) << (54 - 14));
                out[37 + outpos] = (in[31 + inpos] >>> 14)
                        | ((in[32 + inpos] & 15L) << (54 - 4));
                out[38 + outpos] = ((in[32 + inpos] >>> 4) & 18014398509481983L);
                out[39 + outpos] = (in[32 + inpos] >>> 58)
                        | ((in[33 + inpos] & 281474976710655L) << (54 - 48));
                out[40 + outpos] = (in[33 + inpos] >>> 48)
                        | ((in[34 + inpos] & 274877906943L) << (54 - 38));
                out[41 + outpos] = (in[34 + inpos] >>> 38)
                        | ((in[35 + inpos] & 268435455L) << (54 - 28));
                out[42 + outpos] = (in[35 + inpos] >>> 28)
                        | ((in[36 + inpos] & 262143L) << (54 - 18));
                out[43 + outpos] = (in[36 + inpos] >>> 18)
                        | ((in[37 + inpos] & 255L) << (54 - 8));
                out[44 + outpos] = ((in[37 + inpos] >>> 8) & 18014398509481983L);
                out[45 + outpos] = (in[37 + inpos] >>> 62)
                        | ((in[38 + inpos] & 4503599627370495L) << (54 - 52));
                out[46 + outpos] = (in[38 + inpos] >>> 52)
                        | ((in[39 + inpos] & 4398046511103L) << (54 - 42));
                out[47 + outpos] = (in[39 + inpos] >>> 42)
                        | ((in[40 + inpos] & 4294967295L) << (54 - 32));
                out[48 + outpos] = (in[40 + inpos] >>> 32)
                        | ((in[41 + inpos] & 4194303L) << (54 - 22));
                out[49 + outpos] = (in[41 + inpos] >>> 22)
                        | ((in[42 + inpos] & 4095L) << (54 - 12));
                out[50 + outpos] = (in[42 + inpos] >>> 12)
                        | ((in[43 + inpos] & 3L) << (54 - 2));
                out[51 + outpos] = ((in[43 + inpos] >>> 2) & 18014398509481983L);
                out[52 + outpos] = (in[43 + inpos] >>> 56)
                        | ((in[44 + inpos] & 70368744177663L) << (54 - 46));
                out[53 + outpos] = (in[44 + inpos] >>> 46)
                        | ((in[45 + inpos] & 68719476735L) << (54 - 36));
                out[54 + outpos] = (in[45 + inpos] >>> 36)
                        | ((in[46 + inpos] & 67108863L) << (54 - 26));
                out[55 + outpos] = (in[46 + inpos] >>> 26)
                        | ((in[47 + inpos] & 65535L) << (54 - 16));
                out[56 + outpos] = (in[47 + inpos] >>> 16)
                        | ((in[48 + inpos] & 63L) << (54 - 6));
                out[57 + outpos] = ((in[48 + inpos] >>> 6) & 18014398509481983L);
                out[58 + outpos] = (in[48 + inpos] >>> 60)
                        | ((in[49 + inpos] & 1125899906842623L) << (54 - 50));
                out[59 + outpos] = (in[49 + inpos] >>> 50)
                        | ((in[50 + inpos] & 1099511627775L) << (54 - 40));
                out[60 + outpos] = (in[50 + inpos] >>> 40)
                        | ((in[51 + inpos] & 1073741823L) << (54 - 30));
                out[61 + outpos] = (in[51 + inpos] >>> 30)
                        | ((in[52 + inpos] & 1048575L) << (54 - 20));
                out[62 + outpos] = (in[52 + inpos] >>> 20)
                        | ((in[53 + inpos] & 1023L) << (54 - 10));
                out[63 + outpos] = (in[53 + inpos] >>> 10);
        }

        protected static void fastunpack55(final long[] in, int inpos,
                final long[] out, int outpos) {
                out[outpos] = (in[inpos] & 36028797018963967L);
                out[1 + outpos] = (in[inpos] >>> 55)
                        | ((in[1 + inpos] & 70368744177663L) << (55 - 46));
                out[2 + outpos] = (in[1 + inpos] >>> 46)
                        | ((in[2 + inpos] & 137438953471L) << (55 - 37));
                out[3 + outpos] = (in[2 + inpos] >>> 37)
                        | ((in[3 + inpos] & 268435455L) << (55 - 28));
                out[4 + outpos] = (in[3 + inpos] >>> 28)
                        | ((in[4 + inpos] & 524287L) << (55 - 19));
                out[5 + outpos] = (in[4 + inpos] >>> 19)
                        | ((in[5 + inpos] & 1023L) << (55 - 10));
                out[6 + outpos] = (in[5 + inpos] >>> 10)
                        | ((in[6 + inpos] & 1L) << (55 - 1));
                out[7 + outpos] = ((in[6 + inpos] >>> 1) & 36028797018963967L);
                out[8 + outpos] = (in[6 + inpos] >>> 56)
                        | ((in[7 + inpos] & 140737488355327L) << (55 - 47));
                out[9 + outpos] = (in[7 + inpos] >>> 47)
                        | ((in[8 + inpos] & 274877906943L) << (55 - 38));
                out[10 + outpos] = (in[8 + inpos] >>> 38)
                        | ((in[9 + inpos] & 536870911L) << (55 - 29));
                out[11 + outpos] = (in[9 + inpos] >>> 29)
                        | ((in[10 + inpos] & 1048575L) << (55 - 20));
                out[12 + outpos] = (in[10 + inpos] >>> 20)
                        | ((in[11 + inpos] & 2047L) << (55 - 11));
                out[13 + outpos] = (in[11 + inpos] >>> 11)
                        | ((in[12 + inpos] & 3L) << (55 - 2));
                out[14 + outpos] = ((in[12 + inpos] >>> 2) & 36028797018963967L);
                out[15 + outpos] = (in[12 + inpos] >>> 57)
                        | ((in[13 + inpos] & 281474976710655L) << (55 - 48));
                out[16 + outpos] = (in[13 + inpos] >>> 48)
                        | ((in[14 + inpos] & 549755813887L) << (55 - 39));
                out[17 + outpos] = (in[14 + inpos] >>> 39)
                        | ((in[15 + inpos] & 1073741823L) << (55 - 30));
                out[18 + outpos] = (in[15 + inpos] >>> 30)
                        | ((in[16 + inpos] & 2097151L) << (55 - 21));
                out[19 + outpos] = (in[16 + inpos] >>> 21)
                        | ((in[17 + inpos] & 4095L) << (55 - 12));
                out[20 + outpos] = (in[17 + inpos] >>> 12)
                        | ((in[18 + inpos] & 7L) << (55 - 3));
                out[21 + outpos] = ((in[18 + inpos] >>> 3) & 36028797018963967L);
                out[22 + outpos] = (in[18 + inpos] >>> 58)
                        | ((in[19 + inpos] & 562949953421311L) << (55 - 49));
                out[23 + outpos] = (in[19 + inpos] >>> 49)
                        | ((in[20 + inpos] & 1099511627775L) << (55 - 40));
                out[24 + outpos] = (in[20 + inpos] >>> 40)
                        | ((in[21 + inpos] & 2147483647L) << (55 - 31));
                out[25 + outpos] = (in[21 + inpos] >>> 31)
                        | ((in[22 + inpos] & 4194303L) << (55 - 22));
                out[26 + outpos] = (in[22 + inpos] >>> 22)
                        | ((in[23 + inpos] & 8191L) << (55 - 13));
                out[27 + outpos] = (in[23 + inpos] >>> 13)
                        | ((in[24 + inpos] & 15L) << (55 - 4));
                out[28 + outpos] = ((in[24 + inpos] >>> 4) & 36028797018963967L);
                out[29 + outpos] = (in[24 + inpos] >>> 59)
                        | ((in[25 + inpos] & 1125899906842623L) << (55 - 50));
                out[30 + outpos] = (in[25 + inpos] >>> 50)
                        | ((in[26 + inpos] & 2199023255551L) << (55 - 41));
                out[31 + outpos] = (in[26 + inpos] >>> 41)
                        | ((in[27 + inpos] & 4294967295L) << (55 - 32));
                out[32 + outpos] = (in[27 + inpos] >>> 32)
                        | ((in[28 + inpos] & 8388607L) << (55 - 23));
                out[33 + outpos] = (in[28 + inpos] >>> 23)
                        | ((in[29 + inpos] & 16383L) << (55 - 14));
                out[34 + outpos] = (in[29 + inpos] >>> 14)
                        | ((in[30 + inpos] & 31L) << (55 - 5));
                out[35 + outpos] = ((in[30 + inpos] >>> 5) & 36028797018963967L);
                out[36 + outpos] = (in[30 + inpos] >>> 60)
                        | ((in[31 + inpos] & 2251799813685247L) << (55 - 51));
                out[37 + outpos] = (in[31 + inpos] >>> 51)
                        | ((in[32 + inpos] & 4398046511103L) << (55 - 42));
                out[38 + outpos] = (in[32 + inpos] >>> 42)
                        | ((in[33 + inpos] & 8589934591L) << (55 - 33));
                out[39 + outpos] = (in[33 + inpos] >>> 33)
                        | ((in[34 + inpos] & 16777215L) << (55 - 24));
                out[40 + outpos] = (in[34 + inpos] >>> 24)
                        | ((in[35 + inpos] & 32767L) << (55 - 15));
                out[41 + outpos] = (in[35 + inpos] >>> 15)
                        | ((in[36 + inpos] & 63L) << (55 - 6));
                out[42 + outpos] = ((in[36 + inpos] >>> 6) & 36028797018963967L);
                out[43 + outpos] = (in[36 + inpos] >>> 61)
                        | ((in[37 + inpos] & 4503599627370495L) << (55 - 52));
                out[44 + outpos] = (in[37 + inpos] >>> 52)
                        | ((in[38 + inpos] & 8796093022207L) << (55 - 43));
                out[45 + outpos] = (in[38 + inpos] >>> 43)
                        | ((in[39 + inpos] & 17179869183L) << (55 - 34));
                out[46 + outpos] = (in[39 + inpos] >>> 34)
                        | ((in[40 + inpos] & 33554431L) << (55 - 25));
                out[47 + outpos] = (in[40 + inpos] >>> 25)
                        | ((in[41 + inpos] & 65535L) << (55 - 16));
                out[48 + outpos] = (in[41 + inpos] >>> 16)
                        | ((in[42 + inpos] & 127L) << (55 - 7));
                out[49 + outpos] = ((in[42 + inpos] >>> 7) & 36028797018963967L);
                out[50 + outpos] = (in[42 + inpos] >>> 62)
                        | ((in[43 + inpos] & 9007199254740991L) << (55 - 53));
                out[51 + outpos] = (in[43 + inpos] >>> 53)
                        | ((in[44 + inpos] & 17592186044415L) << (55 - 44));
                out[52 + outpos] = (in[44 + inpos] >>> 44)
                        | ((in[45 + inpos] & 34359738367L) << (55 - 35));
                out[53 + outpos] = (in[45 + inpos] >>> 35)
                        | ((in[46 + inpos] & 67108863L) << (55 - 26));
                out[54 + outpos] = (in[46 + inpos] >>> 26)
                        | ((in[47 + inpos] & 131071L) << (55 - 17));
                out[55 + outpos] = (in[47 + inpos] >>> 17)
                        | ((in[48 + inpos] & 255L) << (55 - 8));
                out[56 + outpos] = ((in[48 + inpos] >>> 8) & 36028797018963967L);
                out[57 + outpos] = (in[48 + inpos] >>> 63)
                        | ((in[49 + inpos] & 18014398509481983L) << (55 - 54));
                out[58 + outpos] = (in[49 + inpos] >>> 54)
                        | ((in[50 + inpos] & 35184372088831L) << (55 - 45));
                out[59 + outpos] = (in[50 + inpos] >>> 45)
                        | ((in[51 + inpos] & 68719476735L) << (55 - 36));
                out[60 + outpos] = (in[51 + inpos] >>> 36)
                        | ((in[52 + inpos] & 134217727L) << (55 - 27));
                out[61 + outpos] = (in[52 + inpos] >>> 27)
                        | ((in[53 + inpos] & 262143L) << (55 - 18));
                out[62 + outpos] = (in[53 + inpos] >>> 18)
                        | ((in[54 + inpos] & 511L) << (55 - 9));
                out[63 + outpos] = (in[54 + inpos] >>> 9);
        }

        protected static void fastunpack56(final long[] in, int inpos,
                final long[] out, int outpos) {
                out[outpos] = (in[inpos] & 72057594037927935L);
                out[1 + outpos] = (in[inpos] >>> 56)
                        | ((in[1 + inpos] & 281474976710655L) << (56 - 48));
                out[2 + outpos] = (in[1 + inpos] >>> 48)
                        | ((in[2 + inpos] & 1099511627775L) << (56 - 40));
                out[3 + outpos] = (in[2 + inpos] >>> 40)
                        | ((in[3 + inpos] & 4294967295L) << (56 - 32));
                out[4 + outpos] = (in[3 + inpos] >>> 32)
                        | ((in[4 + inpos] & 16777215L) << (56 - 24));
                out[5 + outpos] = (in[4 + inpos] >>> 24)
                        | ((in[5 + inpos] & 65535L) << (56 - 16));
                out[6 + outpos] = (in[5 + inpos] >>> 16)
                        | ((in[6 + inpos] & 255L) << (56 - 8));
                out[7 + outpos] = (in[6 + inpos] >>> 8);
                out[8 + outpos] = (in[7 + inpos] & 72057594037927935L);
                out[9 + outpos] = (in[7 + inpos] >>> 56)
                        | ((in[8 + inpos] & 281474976710655L) << (56 - 48));
                out[10 + outpos] = (in[8 + inpos] >>> 48)
                        | ((in[9 + inpos] & 1099511627775L) << (56 - 40));
                out[11 + outpos] = (in[9 + inpos] >>> 40)
                        | ((in[10 + inpos] & 4294967295L) << (56 - 32));
                out[12 + outpos] = (in[10 + inpos] >>> 32)
                        | ((in[11 + inpos] & 16777215L) << (56 - 24));
                out[13 + outpos] = (in[11 + inpos] >>> 24)
                        | ((in[12 + inpos] & 65535L) << (56 - 16));
                out[14 + outpos] = (in[12 + inpos] >>> 16)
                        | ((in[13 + inpos] & 255L) << (56 - 8));
                out[15 + outpos] = (in[13 + inpos] >>> 8);
                out[16 + outpos] = (in[14 + inpos] & 72057594037927935L);
                out[17 + outpos] = (in[14 + inpos] >>> 56)
                        | ((in[15 + inpos] & 281474976710655L) << (56 - 48));
                out[18 + outpos] = (in[15 + inpos] >>> 48)
                        | ((in[16 + inpos] & 1099511627775L) << (56 - 40));
                out[19 + outpos] = (in[16 + inpos] >>> 40)
                        | ((in[17 + inpos] & 4294967295L) << (56 - 32));
                out[20 + outpos] = (in[17 + inpos] >>> 32)
                        | ((in[18 + inpos] & 16777215L) << (56 - 24));
                out[21 + outpos] = (in[18 + inpos] >>> 24)
                        | ((in[19 + inpos] & 65535L) << (56 - 16));
                out[22 + outpos] = (in[19 + inpos] >>> 16)
                        | ((in[20 + inpos] & 255L) << (56 - 8));
                out[23 + outpos] = (in[20 + inpos] >>> 8);
                out[24 + outpos] = (in[21 + inpos] & 72057594037927935L);
                out[25 + outpos] = (in[21 + inpos] >>> 56)
                        | ((in[22 + inpos] & 281474976710655L) << (56 - 48));
                out[26 + outpos] = (in[22 + inpos] >>> 48)
                        | ((in[23 + inpos] & 1099511627775L) << (56 - 40));
                out[27 + outpos] = (in[23 + inpos] >>> 40)
                        | ((in[24 + inpos] & 4294967295L) << (56 - 32));
                out[28 + outpos] = (in[24 + inpos] >>> 32)
                        | ((in[25 + inpos] & 16777215L) << (56 - 24));
                out[29 + outpos] = (in[25 + inpos] >>> 24)
                        | ((in[26 + inpos] & 65535L) << (56 - 16));
                out[30 + outpos] = (in[26 + inpos] >>> 16)
                        | ((in[27 + inpos] & 255L) << (56 - 8));
                out[31 + outpos] = (in[27 + inpos] >>> 8);
                out[32 + outpos] = (in[28 + inpos] & 72057594037927935L);
                out[33 + outpos] = (in[28 + inpos] >>> 56)
                        | ((in[29 + inpos] & 281474976710655L) << (56 - 48));
                out[34 + outpos] = (in[29 + inpos] >>> 48)
                        | ((in[30 + inpos] & 1099511627775L) << (56 - 40));
                out[35 + outpos] = (in[30 + inpos] >>> 40)
                        | ((in[31 + inpos] & 4294967295L) << (56 - 32));
                out[36 + outpos] = (in[31 + inpos] >>> 32)
                        | ((in[32 + inpos] & 16777215L) << (56 - 24));
                out[37 + outpos] = (in[32 + inpos] >>> 24)
                        | ((in[33 + inpos] & 65535L) << (56 - 16));
                out[38 + outpos] = (in[33 + inpos] >>> 16)
                        | ((in[34 + inpos] & 255L) << (56 - 8));
                out[39 + outpos] = (in[34 + inpos] >>> 8);
                out[40 + outpos] = (in[35 + inpos] & 72057594037927935L);
                out[41 + outpos] = (in[35 + inpos] >>> 56)
                        | ((in[36 + inpos] & 281474976710655L) << (56 - 48));
                out[42 + outpos] = (in[36 + inpos] >>> 48)
                        | ((in[37 + inpos] & 1099511627775L) << (56 - 40));
                out[43 + outpos] = (in[37 + inpos] >>> 40)
                        | ((in[38 + inpos] & 4294967295L) << (56 - 32));
                out[44 + outpos] = (in[38 + inpos] >>> 32)
                        | ((in[39 + inpos] & 16777215L) << (56 - 24));
                out[45 + outpos] = (in[39 + inpos] >>> 24)
                        | ((in[40 + inpos] & 65535L) << (56 - 16));
                out[46 + outpos] = (in[40 + inpos] >>> 16)
                        | ((in[41 + inpos] & 255L) << (56 - 8));
                out[47 + outpos] = (in[41 + inpos] >>> 8);
                out[48 + outpos] = (in[42 + inpos] & 72057594037927935L);
                out[49 + outpos] = (in[42 + inpos] >>> 56)
                        | ((in[43 + inpos] & 281474976710655L) << (56 - 48));
                out[50 + outpos] = (in[43 + inpos] >>> 48)
                        | ((in[44 + inpos] & 1099511627775L) << (56 - 40));
                out[51 + outpos] = (in[44 + inpos] >>> 40)
                        | ((in[45 + inpos] & 4294967295L) << (56 - 32));
                out[52 + outpos] = (in[45 + inpos] >>> 32)
                        | ((in[46 + inpos] & 16777215L) << (56 - 24));
                out[53 + outpos] = (in[46 + inpos] >>> 24)
                        | ((in[47 + inpos] & 65535L) << (56 - 16));
                out[54 + outpos] = (in[47 + inpos] >>> 16)
                        | ((in[48 + inpos] & 255L) << (56 - 8));
                out[55 + outpos] = (in[48 + inpos] >>> 8);
                out[56 + outpos] = (in[49 + inpos] & 72057594037927935L);
                out[57 + outpos] = (in[49 + inpos] >>> 56)
                        | ((in[50 + inpos] & 281474976710655L) << (56 - 48));
                out[58 + outpos] = (in[50 + inpos] >>> 48)
                        | ((in[51 + inpos] & 1099511627775L) << (56 - 40));
                out[59 + outpos] = (in[51 + inpos] >>> 40)
                        | ((in[52 + inpos] & 4294967295L) << (56 - 32));
                out[60 + outpos] = (in[52 + inpos] >>> 32)
                        | ((in[53 + inpos] & 16777215L) << (56 - 24));
                out[61 + outpos] = (in[53 + inpos] >>> 24)
                        | ((in[54 + inpos] & 65535L) << (56 - 16));
                out[62 + outpos] = (in[54 + inpos] >>> 16)
                        | ((in[55 + inpos] & 255L) << (56 - 8));
                out[63 + outpos] = (in[55 + inpos] >>> 8);
        }

        protected static void fastunpack57(final long[] in, int inpos,
                final long[] out, int outpos) {
                out[outpos] = (in[inpos] & 144115188075855871L);
                out[1 + outpos] = (in[inpos] >>> 57)
                        | ((in[1 + inpos] & 1125899906842623L) << (57 - 50));
                out[2 + outpos] = (in[1 + inpos] >>> 50)
                        | ((in[2 + inpos] & 8796093022207L) << (57 - 43));
                out[3 + outpos] = (in[2 + inpos] >>> 43)
                        | ((in[3 + inpos] & 68719476735L) << (57 - 36));
                out[4 + outpos] = (in[3 + inpos] >>> 36)
                        | ((in[4 + inpos] & 536870911L) << (57 - 29));
                out[5 + outpos] = (in[4 + inpos] >>> 29)
                        | ((in[5 + inpos] & 4194303L) << (57 - 22));
                out[6 + outpos] = (in[5 + inpos] >>> 22)
                        | ((in[6 + inpos] & 32767L) << (57 - 15));
                out[7 + outpos] = (in[6 + inpos] >>> 15)
                        | ((in[7 + inpos] & 255L) << (57 - 8));
                out[8 + outpos] = (in[7 + inpos] >>> 8)
                        | ((in[8 + inpos] & 1L) << (57 - 1));
                out[9 + outpos] = ((in[8 + inpos] >>> 1) & 144115188075855871L);
                out[10 + outpos] = (in[8 + inpos] >>> 58)
                        | ((in[9 + inpos] & 2251799813685247L) << (57 - 51));
                out[11 + outpos] = (in[9 + inpos] >>> 51)
                        | ((in[10 + inpos] & 17592186044415L) << (57 - 44));
                out[12 + outpos] = (in[10 + inpos] >>> 44)
                        | ((in[11 + inpos] & 137438953471L) << (57 - 37));
                out[13 + outpos] = (in[11 + inpos] >>> 37)
                        | ((in[12 + inpos] & 1073741823L) << (57 - 30));
                out[14 + outpos] = (in[12 + inpos] >>> 30)
                        | ((in[13 + inpos] & 8388607L) << (57 - 23));
                out[15 + outpos] = (in[13 + inpos] >>> 23)
                        | ((in[14 + inpos] & 65535L) << (57 - 16));
                out[16 + outpos] = (in[14 + inpos] >>> 16)
                        | ((in[15 + inpos] & 511L) << (57 - 9));
                out[17 + outpos] = (in[15 + inpos] >>> 9)
                        | ((in[16 + inpos] & 3L) << (57 - 2));
                out[18 + outpos] = ((in[16 + inpos] >>> 2) & 144115188075855871L);
                out[19 + outpos] = (in[16 + inpos] >>> 59)
                        | ((in[17 + inpos] & 4503599627370495L) << (57 - 52));
                out[20 + outpos] = (in[17 + inpos] >>> 52)
                        | ((in[18 + inpos] & 35184372088831L) << (57 - 45));
                out[21 + outpos] = (in[18 + inpos] >>> 45)
                        | ((in[19 + inpos] & 274877906943L) << (57 - 38));
                out[22 + outpos] = (in[19 + inpos] >>> 38)
                        | ((in[20 + inpos] & 2147483647L) << (57 - 31));
                out[23 + outpos] = (in[20 + inpos] >>> 31)
                        | ((in[21 + inpos] & 16777215L) << (57 - 24));
                out[24 + outpos] = (in[21 + inpos] >>> 24)
                        | ((in[22 + inpos] & 131071L) << (57 - 17));
                out[25 + outpos] = (in[22 + inpos] >>> 17)
                        | ((in[23 + inpos] & 1023L) << (57 - 10));
                out[26 + outpos] = (in[23 + inpos] >>> 10)
                        | ((in[24 + inpos] & 7L) << (57 - 3));
                out[27 + outpos] = ((in[24 + inpos] >>> 3) & 144115188075855871L);
                out[28 + outpos] = (in[24 + inpos] >>> 60)
                        | ((in[25 + inpos] & 9007199254740991L) << (57 - 53));
                out[29 + outpos] = (in[25 + inpos] >>> 53)
                        | ((in[26 + inpos] & 70368744177663L) << (57 - 46));
                out[30 + outpos] = (in[26 + inpos] >>> 46)
                        | ((in[27 + inpos] & 549755813887L) << (57 - 39));
                out[31 + outpos] = (in[27 + inpos] >>> 39)
                        | ((in[28 + inpos] & 4294967295L) << (57 - 32));
                out[32 + outpos] = (in[28 + inpos] >>> 32)
                        | ((in[29 + inpos] & 33554431L) << (57 - 25));
                out[33 + outpos] = (in[29 + inpos] >>> 25)
                        | ((in[30 + inpos] & 262143L) << (57 - 18));
                out[34 + outpos] = (in[30 + inpos] >>> 18)
                        | ((in[31 + inpos] & 2047L) << (57 - 11));
                out[35 + outpos] = (in[31 + inpos] >>> 11)
                        | ((in[32 + inpos] & 15L) << (57 - 4));
                out[36 + outpos] = ((in[32 + inpos] >>> 4) & 144115188075855871L);
                out[37 + outpos] = (in[32 + inpos] >>> 61)
                        | ((in[33 + inpos] & 18014398509481983L) << (57 - 54));
                out[38 + outpos] = (in[33 + inpos] >>> 54)
                        | ((in[34 + inpos] & 140737488355327L) << (57 - 47));
                out[39 + outpos] = (in[34 + inpos] >>> 47)
                        | ((in[35 + inpos] & 1099511627775L) << (57 - 40));
                out[40 + outpos] = (in[35 + inpos] >>> 40)
                        | ((in[36 + inpos] & 8589934591L) << (57 - 33));
                out[41 + outpos] = (in[36 + inpos] >>> 33)
                        | ((in[37 + inpos] & 67108863L) << (57 - 26));
                out[42 + outpos] = (in[37 + inpos] >>> 26)
                        | ((in[38 + inpos] & 524287L) << (57 - 19));
                out[43 + outpos] = (in[38 + inpos] >>> 19)
                        | ((in[39 + inpos] & 4095L) << (57 - 12));
                out[44 + outpos] = (in[39 + inpos] >>> 12)
                        | ((in[40 + inpos] & 31L) << (57 - 5));
                out[45 + outpos] = ((in[40 + inpos] >>> 5) & 144115188075855871L);
                out[46 + outpos] = (in[40 + inpos] >>> 62)
                        | ((in[41 + inpos] & 36028797018963967L) << (57 - 55));
                out[47 + outpos] = (in[41 + inpos] >>> 55)
                        | ((in[42 + inpos] & 281474976710655L) << (57 - 48));
                out[48 + outpos] = (in[42 + inpos] >>> 48)
                        | ((in[43 + inpos] & 2199023255551L) << (57 - 41));
                out[49 + outpos] = (in[43 + inpos] >>> 41)
                        | ((in[44 + inpos] & 17179869183L) << (57 - 34));
                out[50 + outpos] = (in[44 + inpos] >>> 34)
                        | ((in[45 + inpos] & 134217727L) << (57 - 27));
                out[51 + outpos] = (in[45 + inpos] >>> 27)
                        | ((in[46 + inpos] & 1048575L) << (57 - 20));
                out[52 + outpos] = (in[46 + inpos] >>> 20)
                        | ((in[47 + inpos] & 8191L) << (57 - 13));
                out[53 + outpos] = (in[47 + inpos] >>> 13)
                        | ((in[48 + inpos] & 63L) << (57 - 6));
                out[54 + outpos] = ((in[48 + inpos] >>> 6) & 144115188075855871L);
                out[55 + outpos] = (in[48 + inpos] >>> 63)
                        | ((in[49 + inpos] & 72057594037927935L) << (57 - 56));
                out[56 + outpos] = (in[49 + inpos] >>> 56)
                        | ((in[50 + inpos] & 562949953421311L) << (57 - 49));
                out[57 + outpos] = (in[50 + inpos] >>> 49)
                        | ((in[51 + inpos] & 4398046511103L) << (57 - 42));
                out[58 + outpos] = (in[51 + inpos] >>> 42)
                        | ((in[52 + inpos] & 34359738367L) << (57 - 35));
                out[59 + outpos] = (in[52 + inpos] >>> 35)
                        | ((in[53 + inpos] & 268435455L) << (57 - 28));
                out[60 + outpos] = (in[53 + inpos] >>> 28)
                        | ((in[54 + inpos] & 2097151L) << (57 - 21));
                out[61 + outpos] = (in[54 + inpos] >>> 21)
                        | ((in[55 + inpos] & 16383L) << (57 - 14));
                out[62 + outpos] = (in[55 + inpos] >>> 14)
                        | ((in[56 + inpos] & 127L) << (57 - 7));
                out[63 + outpos] = (in[56 + inpos] >>> 7);
        }

        protected static void fastunpack58(final long[] in, int inpos,
                final long[] out, int outpos) {
                out[outpos] = (in[inpos] & 288230376151711743L);
                out[1 + outpos] = (in[inpos] >>> 58)
                        | ((in[1 + inpos] & 4503599627370495L) << (58 - 52));
                out[2 + outpos] = (in[1 + inpos] >>> 52)
                        | ((in[2 + inpos] & 70368744177663L) << (58 - 46));
                out[3 + outpos] = (in[2 + inpos] >>> 46)
                        | ((in[3 + inpos] & 1099511627775L) << (58 - 40));
                out[4 + outpos] = (in[3 + inpos] >>> 40)
                        | ((in[4 + inpos] & 17179869183L) << (58 - 34));
                out[5 + outpos] = (in[4 + inpos] >>> 34)
                        | ((in[5 + inpos] & 268435455L) << (58 - 28));
                out[6 + outpos] = (in[5 + inpos] >>> 28)
                        | ((in[6 + inpos] & 4194303L) << (58 - 22));
                out[7 + outpos] = (in[6 + inpos] >>> 22)
                        | ((in[7 + inpos] & 65535L) << (58 - 16));
                out[8 + outpos] = (in[7 + inpos] >>> 16)
                        | ((in[8 + inpos] & 1023L) << (58 - 10));
                out[9 + outpos] = (in[8 + inpos] >>> 10)
                        | ((in[9 + inpos] & 15L) << (58 - 4));
                out[10 + outpos] = ((in[9 + inpos] >>> 4) & 288230376151711743L);
                out[11 + outpos] = (in[9 + inpos] >>> 62)
                        | ((in[10 + inpos] & 72057594037927935L) << (58 - 56));
                out[12 + outpos] = (in[10 + inpos] >>> 56)
                        | ((in[11 + inpos] & 1125899906842623L) << (58 - 50));
                out[13 + outpos] = (in[11 + inpos] >>> 50)
                        | ((in[12 + inpos] & 17592186044415L) << (58 - 44));
                out[14 + outpos] = (in[12 + inpos] >>> 44)
                        | ((in[13 + inpos] & 274877906943L) << (58 - 38));
                out[15 + outpos] = (in[13 + inpos] >>> 38)
                        | ((in[14 + inpos] & 4294967295L) << (58 - 32));
                out[16 + outpos] = (in[14 + inpos] >>> 32)
                        | ((in[15 + inpos] & 67108863L) << (58 - 26));
                out[17 + outpos] = (in[15 + inpos] >>> 26)
                        | ((in[16 + inpos] & 1048575L) << (58 - 20));
                out[18 + outpos] = (in[16 + inpos] >>> 20)
                        | ((in[17 + inpos] & 16383L) << (58 - 14));
                out[19 + outpos] = (in[17 + inpos] >>> 14)
                        | ((in[18 + inpos] & 255L) << (58 - 8));
                out[20 + outpos] = (in[18 + inpos] >>> 8)
                        | ((in[19 + inpos] & 3L) << (58 - 2));
                out[21 + outpos] = ((in[19 + inpos] >>> 2) & 288230376151711743L);
                out[22 + outpos] = (in[19 + inpos] >>> 60)
                        | ((in[20 + inpos] & 18014398509481983L) << (58 - 54));
                out[23 + outpos] = (in[20 + inpos] >>> 54)
                        | ((in[21 + inpos] & 281474976710655L) << (58 - 48));
                out[24 + outpos] = (in[21 + inpos] >>> 48)
                        | ((in[22 + inpos] & 4398046511103L) << (58 - 42));
                out[25 + outpos] = (in[22 + inpos] >>> 42)
                        | ((in[23 + inpos] & 68719476735L) << (58 - 36));
                out[26 + outpos] = (in[23 + inpos] >>> 36)
                        | ((in[24 + inpos] & 1073741823L) << (58 - 30));
                out[27 + outpos] = (in[24 + inpos] >>> 30)
                        | ((in[25 + inpos] & 16777215L) << (58 - 24));
                out[28 + outpos] = (in[25 + inpos] >>> 24)
                        | ((in[26 + inpos] & 262143L) << (58 - 18));
                out[29 + outpos] = (in[26 + inpos] >>> 18)
                        | ((in[27 + inpos] & 4095L) << (58 - 12));
                out[30 + outpos] = (in[27 + inpos] >>> 12)
                        | ((in[28 + inpos] & 63L) << (58 - 6));
                out[31 + outpos] = (in[28 + inpos] >>> 6);
                out[32 + outpos] = (in[29 + inpos] & 288230376151711743L);
                out[33 + outpos] = (in[29 + inpos] >>> 58)
                        | ((in[30 + inpos] & 4503599627370495L) << (58 - 52));
                out[34 + outpos] = (in[30 + inpos] >>> 52)
                        | ((in[31 + inpos] & 70368744177663L) << (58 - 46));
                out[35 + outpos] = (in[31 + inpos] >>> 46)
                        | ((in[32 + inpos] & 1099511627775L) << (58 - 40));
                out[36 + outpos] = (in[32 + inpos] >>> 40)
                        | ((in[33 + inpos] & 17179869183L) << (58 - 34));
                out[37 + outpos] = (in[33 + inpos] >>> 34)
                        | ((in[34 + inpos] & 268435455L) << (58 - 28));
                out[38 + outpos] = (in[34 + inpos] >>> 28)
                        | ((in[35 + inpos] & 4194303L) << (58 - 22));
                out[39 + outpos] = (in[35 + inpos] >>> 22)
                        | ((in[36 + inpos] & 65535L) << (58 - 16));
                out[40 + outpos] = (in[36 + inpos] >>> 16)
                        | ((in[37 + inpos] & 1023L) << (58 - 10));
                out[41 + outpos] = (in[37 + inpos] >>> 10)
                        | ((in[38 + inpos] & 15L) << (58 - 4));
                out[42 + outpos] = ((in[38 + inpos] >>> 4) & 288230376151711743L);
                out[43 + outpos] = (in[38 + inpos] >>> 62)
                        | ((in[39 + inpos] & 72057594037927935L) << (58 - 56));
                out[44 + outpos] = (in[39 + inpos] >>> 56)
                        | ((in[40 + inpos] & 1125899906842623L) << (58 - 50));
                out[45 + outpos] = (in[40 + inpos] >>> 50)
                        | ((in[41 + inpos] & 17592186044415L) << (58 - 44));
                out[46 + outpos] = (in[41 + inpos] >>> 44)
                        | ((in[42 + inpos] & 274877906943L) << (58 - 38));
                out[47 + outpos] = (in[42 + inpos] >>> 38)
                        | ((in[43 + inpos] & 4294967295L) << (58 - 32));
                out[48 + outpos] = (in[43 + inpos] >>> 32)
                        | ((in[44 + inpos] & 67108863L) << (58 - 26));
                out[49 + outpos] = (in[44 + inpos] >>> 26)
                        | ((in[45 + inpos] & 1048575L) << (58 - 20));
                out[50 + outpos] = (in[45 + inpos] >>> 20)
                        | ((in[46 + inpos] & 16383L) << (58 - 14));
                out[51 + outpos] = (in[46 + inpos] >>> 14)
                        | ((in[47 + inpos] & 255L) << (58 - 8));
                out[52 + outpos] = (in[47 + inpos] >>> 8)
                        | ((in[48 + inpos] & 3L) << (58 - 2));
                out[53 + outpos] = ((in[48 + inpos] >>> 2) & 288230376151711743L);
                out[54 + outpos] = (in[48 + inpos] >>> 60)
                        | ((in[49 + inpos] & 18014398509481983L) << (58 - 54));
                out[55 + outpos] = (in[49 + inpos] >>> 54)
                        | ((in[50 + inpos] & 281474976710655L) << (58 - 48));
                out[56 + outpos] = (in[50 + inpos] >>> 48)
                        | ((in[51 + inpos] & 4398046511103L) << (58 - 42));
                out[57 + outpos] = (in[51 + inpos] >>> 42)
                        | ((in[52 + inpos] & 68719476735L) << (58 - 36));
                out[58 + outpos] = (in[52 + inpos] >>> 36)
                        | ((in[53 + inpos] & 1073741823L) << (58 - 30));
                out[59 + outpos] = (in[53 + inpos] >>> 30)
                        | ((in[54 + inpos] & 16777215L) << (58 - 24));
                out[60 + outpos] = (in[54 + inpos] >>> 24)
                        | ((in[55 + inpos] & 262143L) << (58 - 18));
                out[61 + outpos] = (in[55 + inpos] >>> 18)
                        | ((in[56 + inpos] & 4095L) << (58 - 12));
                out[62 + outpos] = (in[56 + inpos] >>> 12)
                        | ((in[57 + inpos] & 63L) << (58 - 6));
                out[63 + outpos] = (in[57 + inpos] >>> 6);
        }

        protected static void fastunpack59(final long[] in, int inpos,
                final long[] out, int outpos) {
                out[outpos] = (in[inpos] & 576460752303423487L);
                out[1 + outpos] = (in[inpos] >>> 59)
                        | ((in[1 + inpos] & 18014398509481983L) << (59 - 54));
                out[2 + outpos] = (in[1 + inpos] >>> 54)
                        | ((in[2 + inpos] & 562949953421311L) << (59 - 49));
                out[3 + outpos] = (in[2 + inpos] >>> 49)
                        | ((in[3 + inpos] & 17592186044415L) << (59 - 44));
                out[4 + outpos] = (in[3 + inpos] >>> 44)
                        | ((in[4 + inpos] & 549755813887L) << (59 - 39));
                out[5 + outpos] = (in[4 + inpos] >>> 39)
                        | ((in[5 + inpos] & 17179869183L) << (59 - 34));
                out[6 + outpos] = (in[5 + inpos] >>> 34)
                        | ((in[6 + inpos] & 536870911L) << (59 - 29));
                out[7 + outpos] = (in[6 + inpos] >>> 29)
                        | ((in[7 + inpos] & 16777215L) << (59 - 24));
                out[8 + outpos] = (in[7 + inpos] >>> 24)
                        | ((in[8 + inpos] & 524287L) << (59 - 19));
                out[9 + outpos] = (in[8 + inpos] >>> 19)
                        | ((in[9 + inpos] & 16383L) << (59 - 14));
                out[10 + outpos] = (in[9 + inpos] >>> 14)
                        | ((in[10 + inpos] & 511L) << (59 - 9));
                out[11 + outpos] = (in[10 + inpos] >>> 9)
                        | ((in[11 + inpos] & 15L) << (59 - 4));
                out[12 + outpos] = ((in[11 + inpos] >>> 4) & 576460752303423487L);
                out[13 + outpos] = (in[11 + inpos] >>> 63)
                        | ((in[12 + inpos] & 288230376151711743L) << (59 - 58));
                out[14 + outpos] = (in[12 + inpos] >>> 58)
                        | ((in[13 + inpos] & 9007199254740991L) << (59 - 53));
                out[15 + outpos] = (in[13 + inpos] >>> 53)
                        | ((in[14 + inpos] & 281474976710655L) << (59 - 48));
                out[16 + outpos] = (in[14 + inpos] >>> 48)
                        | ((in[15 + inpos] & 8796093022207L) << (59 - 43));
                out[17 + outpos] = (in[15 + inpos] >>> 43)
                        | ((in[16 + inpos] & 274877906943L) << (59 - 38));
                out[18 + outpos] = (in[16 + inpos] >>> 38)
                        | ((in[17 + inpos] & 8589934591L) << (59 - 33));
                out[19 + outpos] = (in[17 + inpos] >>> 33)
                        | ((in[18 + inpos] & 268435455L) << (59 - 28));
                out[20 + outpos] = (in[18 + inpos] >>> 28)
                        | ((in[19 + inpos] & 8388607L) << (59 - 23));
                out[21 + outpos] = (in[19 + inpos] >>> 23)
                        | ((in[20 + inpos] & 262143L) << (59 - 18));
                out[22 + outpos] = (in[20 + inpos] >>> 18)
                        | ((in[21 + inpos] & 8191L) << (59 - 13));
                out[23 + outpos] = (in[21 + inpos] >>> 13)
                        | ((in[22 + inpos] & 255L) << (59 - 8));
                out[24 + outpos] = (in[22 + inpos] >>> 8)
                        | ((in[23 + inpos] & 7L) << (59 - 3));
                out[25 + outpos] = ((in[23 + inpos] >>> 3) & 576460752303423487L);
                out[26 + outpos] = (in[23 + inpos] >>> 62)
                        | ((in[24 + inpos] & 144115188075855871L) << (59 - 57));
                out[27 + outpos] = (in[24 + inpos] >>> 57)
                        | ((in[25 + inpos] & 4503599627370495L) << (59 - 52));
                out[28 + outpos] = (in[25 + inpos] >>> 52)
                        | ((in[26 + inpos] & 140737488355327L) << (59 - 47));
                out[29 + outpos] = (in[26 + inpos] >>> 47)
                        | ((in[27 + inpos] & 4398046511103L) << (59 - 42));
                out[30 + outpos] = (in[27 + inpos] >>> 42)
                        | ((in[28 + inpos] & 137438953471L) << (59 - 37));
                out[31 + outpos] = (in[28 + inpos] >>> 37)
                        | ((in[29 + inpos] & 4294967295L) << (59 - 32));
                out[32 + outpos] = (in[29 + inpos] >>> 32)
                        | ((in[30 + inpos] & 134217727L) << (59 - 27));
                out[33 + outpos] = (in[30 + inpos] >>> 27)
                        | ((in[31 + inpos] & 4194303L) << (59 - 22));
                out[34 + outpos] = (in[31 + inpos] >>> 22)
                        | ((in[32 + inpos] & 131071L) << (59 - 17));
                out[35 + outpos] = (in[32 + inpos] >>> 17)
                        | ((in[33 + inpos] & 4095L) << (59 - 12));
                out[36 + outpos] = (in[33 + inpos] >>> 12)
                        | ((in[34 + inpos] & 127L) << (59 - 7));
                out[37 + outpos] = (in[34 + inpos] >>> 7)
                        | ((in[35 + inpos] & 3L) << (59 - 2));
                out[38 + outpos] = ((in[35 + inpos] >>> 2) & 576460752303423487L);
                out[39 + outpos] = (in[35 + inpos] >>> 61)
                        | ((in[36 + inpos] & 72057594037927935L) << (59 - 56));
                out[40 + outpos] = (in[36 + inpos] >>> 56)
                        | ((in[37 + inpos] & 2251799813685247L) << (59 - 51));
                out[41 + outpos] = (in[37 + inpos] >>> 51)
                        | ((in[38 + inpos] & 70368744177663L) << (59 - 46));
                out[42 + outpos] = (in[38 + inpos] >>> 46)
                        | ((in[39 + inpos] & 2199023255551L) << (59 - 41));
                out[43 + outpos] = (in[39 + inpos] >>> 41)
                        | ((in[40 + inpos] & 68719476735L) << (59 - 36));
                out[44 + outpos] = (in[40 + inpos] >>> 36)
                        | ((in[41 + inpos] & 2147483647L) << (59 - 31));
                out[45 + outpos] = (in[41 + inpos] >>> 31)
                        | ((in[42 + inpos] & 67108863L) << (59 - 26));
                out[46 + outpos] = (in[42 + inpos] >>> 26)
                        | ((in[43 + inpos] & 2097151L) << (59 - 21));
                out[47 + outpos] = (in[43 + inpos] >>> 21)
                        | ((in[44 + inpos] & 65535L) << (59 - 16));
                out[48 + outpos] = (in[44 + inpos] >>> 16)
                        | ((in[45 + inpos] & 2047L) << (59 - 11));
                out[49 + outpos] = (in[45 + inpos] >>> 11)
                        | ((in[46 + inpos] & 63L) << (59 - 6));
                out[50 + outpos] = (in[46 + inpos] >>> 6)
                        | ((in[47 + inpos] & 1L) << (59 - 1));
                out[51 + outpos] = ((in[47 + inpos] >>> 1) & 576460752303423487L);
                out[52 + outpos] = (in[47 + inpos] >>> 60)
                        | ((in[48 + inpos] & 36028797018963967L) << (59 - 55));
                out[53 + outpos] = (in[48 + inpos] >>> 55)
                        | ((in[49 + inpos] & 1125899906842623L) << (59 - 50));
                out[54 + outpos] = (in[49 + inpos] >>> 50)
                        | ((in[50 + inpos] & 35184372088831L) << (59 - 45));
                out[55 + outpos] = (in[50 + inpos] >>> 45)
                        | ((in[51 + inpos] & 1099511627775L) << (59 - 40));
                out[56 + outpos] = (in[51 + inpos] >>> 40)
                        | ((in[52 + inpos] & 34359738367L) << (59 - 35));
                out[57 + outpos] = (in[52 + inpos] >>> 35)
                        | ((in[53 + inpos] & 1073741823L) << (59 - 30));
                out[58 + outpos] = (in[53 + inpos] >>> 30)
                        | ((in[54 + inpos] & 33554431L) << (59 - 25));
                out[59 + outpos] = (in[54 + inpos] >>> 25)
                        | ((in[55 + inpos] & 1048575L) << (59 - 20));
                out[60 + outpos] = (in[55 + inpos] >>> 20)
                        | ((in[56 + inpos] & 32767L) << (59 - 15));
                out[61 + outpos] = (in[56 + inpos] >>> 15)
                        | ((in[57 + inpos] & 1023L) << (59 - 10));
                out[62 + outpos] = (in[57 + inpos] >>> 10)
                        | ((in[58 + inpos] & 31L) << (59 - 5));
                out[63 + outpos] = (in[58 + inpos] >>> 5);
        }

        protected static void fastunpack60(final long[] in, int inpos,
                final long[] out, int outpos) {
                out[outpos] = (in[inpos] & 1152921504606846975L);
                out[1 + outpos] = (in[inpos] >>> 60)
                        | ((in[1 + inpos] & 72057594037927935L) << (60 - 56));
                out[2 + outpos] = (in[1 + inpos] >>> 56)
                        | ((in[2 + inpos] & 4503599627370495L) << (60 - 52));
                out[3 + outpos] = (in[2 + inpos] >>> 52)
                        | ((in[3 + inpos] & 281474976710655L) << (60 - 48));
                out[4 + outpos] = (in[3 + inpos] >>> 48)
                        | ((in[4 + inpos] & 17592186044415L) << (60 - 44));
                out[5 + outpos] = (in[4 + inpos] >>> 44)
                        | ((in[5 + inpos] & 1099511627775L) << (60 - 40));
                out[6 + outpos] = (in[5 + inpos] >>> 40)
                        | ((in[6 + inpos] & 68719476735L) << (60 - 36));
                out[7 + outpos] = (in[6 + inpos] >>> 36)
                        | ((in[7 + inpos] & 4294967295L) << (60 - 32));
                out[8 + outpos] = (in[7 + inpos] >>> 32)
                        | ((in[8 + inpos] & 268435455L) << (60 - 28));
                out[9 + outpos] = (in[8 + inpos] >>> 28)
                        | ((in[9 + inpos] & 16777215L) << (60 - 24));
                out[10 + outpos] = (in[9 + inpos] >>> 24)
                        | ((in[10 + inpos] & 1048575L) << (60 - 20));
                out[11 + outpos] = (in[10 + inpos] >>> 20)
                        | ((in[11 + inpos] & 65535L) << (60 - 16));
                out[12 + outpos] = (in[11 + inpos] >>> 16)
                        | ((in[12 + inpos] & 4095L) << (60 - 12));
                out[13 + outpos] = (in[12 + inpos] >>> 12)
                        | ((in[13 + inpos] & 255L) << (60 - 8));
                out[14 + outpos] = (in[13 + inpos] >>> 8)
                        | ((in[14 + inpos] & 15L) << (60 - 4));
                out[15 + outpos] = (in[14 + inpos] >>> 4);
                out[16 + outpos] = (in[15 + inpos] & 1152921504606846975L);
                out[17 + outpos] = (in[15 + inpos] >>> 60)
                        | ((in[16 + inpos] & 72057594037927935L) << (60 - 56));
                out[18 + outpos] = (in[16 + inpos] >>> 56)
                        | ((in[17 + inpos] & 4503599627370495L) << (60 - 52));
                out[19 + outpos] = (in[17 + inpos] >>> 52)
                        | ((in[18 + inpos] & 281474976710655L) << (60 - 48));
                out[20 + outpos] = (in[18 + inpos] >>> 48)
                        | ((in[19 + inpos] & 17592186044415L) << (60 - 44));
                out[21 + outpos] = (in[19 + inpos] >>> 44)
                        | ((in[20 + inpos] & 1099511627775L) << (60 - 40));
                out[22 + outpos] = (in[20 + inpos] >>> 40)
                        | ((in[21 + inpos] & 68719476735L) << (60 - 36));
                out[23 + outpos] = (in[21 + inpos] >>> 36)
                        | ((in[22 + inpos] & 4294967295L) << (60 - 32));
                out[24 + outpos] = (in[22 + inpos] >>> 32)
                        | ((in[23 + inpos] & 268435455L) << (60 - 28));
                out[25 + outpos] = (in[23 + inpos] >>> 28)
                        | ((in[24 + inpos] & 16777215L) << (60 - 24));
                out[26 + outpos] = (in[24 + inpos] >>> 24)
                        | ((in[25 + inpos] & 1048575L) << (60 - 20));
                out[27 + outpos] = (in[25 + inpos] >>> 20)
                        | ((in[26 + inpos] & 65535L) << (60 - 16));
                out[28 + outpos] = (in[26 + inpos] >>> 16)
                        | ((in[27 + inpos] & 4095L) << (60 - 12));
                out[29 + outpos] = (in[27 + inpos] >>> 12)
                        | ((in[28 + inpos] & 255L) << (60 - 8));
                out[30 + outpos] = (in[28 + inpos] >>> 8)
                        | ((in[29 + inpos] & 15L) << (60 - 4));
                out[31 + outpos] = (in[29 + inpos] >>> 4);
                out[32 + outpos] = (in[30 + inpos] & 1152921504606846975L);
                out[33 + outpos] = (in[30 + inpos] >>> 60)
                        | ((in[31 + inpos] & 72057594037927935L) << (60 - 56));
                out[34 + outpos] = (in[31 + inpos] >>> 56)
                        | ((in[32 + inpos] & 4503599627370495L) << (60 - 52));
                out[35 + outpos] = (in[32 + inpos] >>> 52)
                        | ((in[33 + inpos] & 281474976710655L) << (60 - 48));
                out[36 + outpos] = (in[33 + inpos] >>> 48)
                        | ((in[34 + inpos] & 17592186044415L) << (60 - 44));
                out[37 + outpos] = (in[34 + inpos] >>> 44)
                        | ((in[35 + inpos] & 1099511627775L) << (60 - 40));
                out[38 + outpos] = (in[35 + inpos] >>> 40)
                        | ((in[36 + inpos] & 68719476735L) << (60 - 36));
                out[39 + outpos] = (in[36 + inpos] >>> 36)
                        | ((in[37 + inpos] & 4294967295L) << (60 - 32));
                out[40 + outpos] = (in[37 + inpos] >>> 32)
                        | ((in[38 + inpos] & 268435455L) << (60 - 28));
                out[41 + outpos] = (in[38 + inpos] >>> 28)
                        | ((in[39 + inpos] & 16777215L) << (60 - 24));
                out[42 + outpos] = (in[39 + inpos] >>> 24)
                        | ((in[40 + inpos] & 1048575L) << (60 - 20));
                out[43 + outpos] = (in[40 + inpos] >>> 20)
                        | ((in[41 + inpos] & 65535L) << (60 - 16));
                out[44 + outpos] = (in[41 + inpos] >>> 16)
                        | ((in[42 + inpos] & 4095L) << (60 - 12));
                out[45 + outpos] = (in[42 + inpos] >>> 12)
                        | ((in[43 + inpos] & 255L) << (60 - 8));
                out[46 + outpos] = (in[43 + inpos] >>> 8)
                        | ((in[44 + inpos] & 15L) << (60 - 4));
                out[47 + outpos] = (in[44 + inpos] >>> 4);
                out[48 + outpos] = (in[45 + inpos] & 1152921504606846975L);
                out[49 + outpos] = (in[45 + inpos] >>> 60)
                        | ((in[46 + inpos] & 72057594037927935L) << (60 - 56));
                out[50 + outpos] = (in[46 + inpos] >>> 56)
                        | ((in[47 + inpos] & 4503599627370495L) << (60 - 52));
                out[51 + outpos] = (in[47 + inpos] >>> 52)
                        | ((in[48 + inpos] & 281474976710655L) << (60 - 48));
                out[52 + outpos] = (in[48 + inpos] >>> 48)
                        | ((in[49 + inpos] & 17592186044415L) << (60 - 44));
                out[53 + outpos] = (in[49 + inpos] >>> 44)
                        | ((in[50 + inpos] & 1099511627775L) << (60 - 40));
                out[54 + outpos] = (in[50 + inpos] >>> 40)
                        | ((in[51 + inpos] & 68719476735L) << (60 - 36));
                out[55 + outpos] = (in[51 + inpos] >>> 36)
                        | ((in[52 + inpos] & 4294967295L) << (60 - 32));
                out[56 + outpos] = (in[52 + inpos] >>> 32)
                        | ((in[53 + inpos] & 268435455L) << (60 - 28));
                out[57 + outpos] = (in[53 + inpos] >>> 28)
                        | ((in[54 + inpos] & 16777215L) << (60 - 24));
                out[58 + outpos] = (in[54 + inpos] >>> 24)
                        | ((in[55 + inpos] & 1048575L) << (60 - 20));
                out[59 + outpos] = (in[55 + inpos] >>> 20)
                        | ((in[56 + inpos] & 65535L) << (60 - 16));
                out[60 + outpos] = (in[56 + inpos] >>> 16)
                        | ((in[57 + inpos] & 4095L) << (60 - 12));
                out[61 + outpos] = (in[57 + inpos] >>> 12)
                        | ((in[58 + inpos] & 255L) << (60 - 8));
                out[62 + outpos] = (in[58 + inpos] >>> 8)
                        | ((in[59 + inpos] & 15L) << (60 - 4));
                out[63 + outpos] = (in[59 + inpos] >>> 4);
        }

        protected static void fastunpack61(final long[] in, int inpos,
                final long[] out, int outpos) {
                out[outpos] = (in[inpos] & 2305843009213693951L);
                out[1 + outpos] = (in[inpos] >>> 61)
                        | ((in[1 + inpos] & 288230376151711743L) << (61 - 58));
                out[2 + outpos] = (in[1 + inpos] >>> 58)
                        | ((in[2 + inpos] & 36028797018963967L) << (61 - 55));
                out[3 + outpos] = (in[2 + inpos] >>> 55)
                        | ((in[3 + inpos] & 4503599627370495L) << (61 - 52));
                out[4 + outpos] = (in[3 + inpos] >>> 52)
                        | ((in[4 + inpos] & 562949953421311L) << (61 - 49));
                out[5 + outpos] = (in[4 + inpos] >>> 49)
                        | ((in[5 + inpos] & 70368744177663L) << (61 - 46));
                out[6 + outpos] = (in[5 + inpos] >>> 46)
                        | ((in[6 + inpos] & 8796093022207L) << (61 - 43));
                out[7 + outpos] = (in[6 + inpos] >>> 43)
                        | ((in[7 + inpos] & 1099511627775L) << (61 - 40));
                out[8 + outpos] = (in[7 + inpos] >>> 40)
                        | ((in[8 + inpos] & 137438953471L) << (61 - 37));
                out[9 + outpos] = (in[8 + inpos] >>> 37)
                        | ((in[9 + inpos] & 17179869183L) << (61 - 34));
                out[10 + outpos] = (in[9 + inpos] >>> 34)
                        | ((in[10 + inpos] & 2147483647L) << (61 - 31));
                out[11 + outpos] = (in[10 + inpos] >>> 31)
                        | ((in[11 + inpos] & 268435455L) << (61 - 28));
                out[12 + outpos] = (in[11 + inpos] >>> 28)
                        | ((in[12 + inpos] & 33554431L) << (61 - 25));
                out[13 + outpos] = (in[12 + inpos] >>> 25)
                        | ((in[13 + inpos] & 4194303L) << (61 - 22));
                out[14 + outpos] = (in[13 + inpos] >>> 22)
                        | ((in[14 + inpos] & 524287L) << (61 - 19));
                out[15 + outpos] = (in[14 + inpos] >>> 19)
                        | ((in[15 + inpos] & 65535L) << (61 - 16));
                out[16 + outpos] = (in[15 + inpos] >>> 16)
                        | ((in[16 + inpos] & 8191L) << (61 - 13));
                out[17 + outpos] = (in[16 + inpos] >>> 13)
                        | ((in[17 + inpos] & 1023L) << (61 - 10));
                out[18 + outpos] = (in[17 + inpos] >>> 10)
                        | ((in[18 + inpos] & 127L) << (61 - 7));
                out[19 + outpos] = (in[18 + inpos] >>> 7)
                        | ((in[19 + inpos] & 15L) << (61 - 4));
                out[20 + outpos] = (in[19 + inpos] >>> 4)
                        | ((in[20 + inpos] & 1L) << (61 - 1));
                out[21 + outpos] = ((in[20 + inpos] >>> 1) & 2305843009213693951L);
                out[22 + outpos] = (in[20 + inpos] >>> 62)
                        | ((in[21 + inpos] & 576460752303423487L) << (61 - 59));
                out[23 + outpos] = (in[21 + inpos] >>> 59)
                        | ((in[22 + inpos] & 72057594037927935L) << (61 - 56));
                out[24 + outpos] = (in[22 + inpos] >>> 56)
                        | ((in[23 + inpos] & 9007199254740991L) << (61 - 53));
                out[25 + outpos] = (in[23 + inpos] >>> 53)
                        | ((in[24 + inpos] & 1125899906842623L) << (61 - 50));
                out[26 + outpos] = (in[24 + inpos] >>> 50)
                        | ((in[25 + inpos] & 140737488355327L) << (61 - 47));
                out[27 + outpos] = (in[25 + inpos] >>> 47)
                        | ((in[26 + inpos] & 17592186044415L) << (61 - 44));
                out[28 + outpos] = (in[26 + inpos] >>> 44)
                        | ((in[27 + inpos] & 2199023255551L) << (61 - 41));
                out[29 + outpos] = (in[27 + inpos] >>> 41)
                        | ((in[28 + inpos] & 274877906943L) << (61 - 38));
                out[30 + outpos] = (in[28 + inpos] >>> 38)
                        | ((in[29 + inpos] & 34359738367L) << (61 - 35));
                out[31 + outpos] = (in[29 + inpos] >>> 35)
                        | ((in[30 + inpos] & 4294967295L) << (61 - 32));
                out[32 + outpos] = (in[30 + inpos] >>> 32)
                        | ((in[31 + inpos] & 536870911L) << (61 - 29));
                out[33 + outpos] = (in[31 + inpos] >>> 29)
                        | ((in[32 + inpos] & 67108863L) << (61 - 26));
                out[34 + outpos] = (in[32 + inpos] >>> 26)
                        | ((in[33 + inpos] & 8388607L) << (61 - 23));
                out[35 + outpos] = (in[33 + inpos] >>> 23)
                        | ((in[34 + inpos] & 1048575L) << (61 - 20));
                out[36 + outpos] = (in[34 + inpos] >>> 20)
                        | ((in[35 + inpos] & 131071L) << (61 - 17));
                out[37 + outpos] = (in[35 + inpos] >>> 17)
                        | ((in[36 + inpos] & 16383L) << (61 - 14));
                out[38 + outpos] = (in[36 + inpos] >>> 14)
                        | ((in[37 + inpos] & 2047L) << (61 - 11));
                out[39 + outpos] = (in[37 + inpos] >>> 11)
                        | ((in[38 + inpos] & 255L) << (61 - 8));
                out[40 + outpos] = (in[38 + inpos] >>> 8)
                        | ((in[39 + inpos] & 31L) << (61 - 5));
                out[41 + outpos] = (in[39 + inpos] >>> 5)
                        | ((in[40 + inpos] & 3L) << (61 - 2));
                out[42 + outpos] = ((in[40 + inpos] >>> 2) & 2305843009213693951L);
                out[43 + outpos] = (in[40 + inpos] >>> 63)
                        | ((in[41 + inpos] & 1152921504606846975L) << (61 - 60));
                out[44 + outpos] = (in[41 + inpos] >>> 60)
                        | ((in[42 + inpos] & 144115188075855871L) << (61 - 57));
                out[45 + outpos] = (in[42 + inpos] >>> 57)
                        | ((in[43 + inpos] & 18014398509481983L) << (61 - 54));
                out[46 + outpos] = (in[43 + inpos] >>> 54)
                        | ((in[44 + inpos] & 2251799813685247L) << (61 - 51));
                out[47 + outpos] = (in[44 + inpos] >>> 51)
                        | ((in[45 + inpos] & 281474976710655L) << (61 - 48));
                out[48 + outpos] = (in[45 + inpos] >>> 48)
                        | ((in[46 + inpos] & 35184372088831L) << (61 - 45));
                out[49 + outpos] = (in[46 + inpos] >>> 45)
                        | ((in[47 + inpos] & 4398046511103L) << (61 - 42));
                out[50 + outpos] = (in[47 + inpos] >>> 42)
                        | ((in[48 + inpos] & 549755813887L) << (61 - 39));
                out[51 + outpos] = (in[48 + inpos] >>> 39)
                        | ((in[49 + inpos] & 68719476735L) << (61 - 36));
                out[52 + outpos] = (in[49 + inpos] >>> 36)
                        | ((in[50 + inpos] & 8589934591L) << (61 - 33));
                out[53 + outpos] = (in[50 + inpos] >>> 33)
                        | ((in[51 + inpos] & 1073741823L) << (61 - 30));
                out[54 + outpos] = (in[51 + inpos] >>> 30)
                        | ((in[52 + inpos] & 134217727L) << (61 - 27));
                out[55 + outpos] = (in[52 + inpos] >>> 27)
                        | ((in[53 + inpos] & 16777215L) << (61 - 24));
                out[56 + outpos] = (in[53 + inpos] >>> 24)
                        | ((in[54 + inpos] & 2097151L) << (61 - 21));
                out[57 + outpos] = (in[54 + inpos] >>> 21)
                        | ((in[55 + inpos] & 262143L) << (61 - 18));
                out[58 + outpos] = (in[55 + inpos] >>> 18)
                        | ((in[56 + inpos] & 32767L) << (61 - 15));
                out[59 + outpos] = (in[56 + inpos] >>> 15)
                        | ((in[57 + inpos] & 4095L) << (61 - 12));
                out[60 + outpos] = (in[57 + inpos] >>> 12)
                        | ((in[58 + inpos] & 511L) << (61 - 9));
                out[61 + outpos] = (in[58 + inpos] >>> 9)
                        | ((in[59 + inpos] & 63L) << (61 - 6));
                out[62 + outpos] = (in[59 + inpos] >>> 6)
                        | ((in[60 + inpos] & 7L) << (61 - 3));
                out[63 + outpos] = (in[60 + inpos] >>> 3);
        }

        protected static void fastunpack62(final long[] in, int inpos,
                final long[] out, int outpos) {
                out[outpos] = (in[inpos] & 4611686018427387903L);
                out[1 + outpos] = (in[inpos] >>> 62)
                        | ((in[1 + inpos] & 1152921504606846975L) << (62 - 60));
                out[2 + outpos] = (in[1 + inpos] >>> 60)
                        | ((in[2 + inpos] & 288230376151711743L) << (62 - 58));
                out[3 + outpos] = (in[2 + inpos] >>> 58)
                        | ((in[3 + inpos] & 72057594037927935L) << (62 - 56));
                out[4 + outpos] = (in[3 + inpos] >>> 56)
                        | ((in[4 + inpos] & 18014398509481983L) << (62 - 54));
                out[5 + outpos] = (in[4 + inpos] >>> 54)
                        | ((in[5 + inpos] & 4503599627370495L) << (62 - 52));
                out[6 + outpos] = (in[5 + inpos] >>> 52)
                        | ((in[6 + inpos] & 1125899906842623L) << (62 - 50));
                out[7 + outpos] = (in[6 + inpos] >>> 50)
                        | ((in[7 + inpos] & 281474976710655L) << (62 - 48));
                out[8 + outpos] = (in[7 + inpos] >>> 48)
                        | ((in[8 + inpos] & 70368744177663L) << (62 - 46));
                out[9 + outpos] = (in[8 + inpos] >>> 46)
                        | ((in[9 + inpos] & 17592186044415L) << (62 - 44));
                out[10 + outpos] = (in[9 + inpos] >>> 44)
                        | ((in[10 + inpos] & 4398046511103L) << (62 - 42));
                out[11 + outpos] = (in[10 + inpos] >>> 42)
                        | ((in[11 + inpos] & 1099511627775L) << (62 - 40));
                out[12 + outpos] = (in[11 + inpos] >>> 40)
                        | ((in[12 + inpos] & 274877906943L) << (62 - 38));
                out[13 + outpos] = (in[12 + inpos] >>> 38)
                        | ((in[13 + inpos] & 68719476735L) << (62 - 36));
                out[14 + outpos] = (in[13 + inpos] >>> 36)
                        | ((in[14 + inpos] & 17179869183L) << (62 - 34));
                out[15 + outpos] = (in[14 + inpos] >>> 34)
                        | ((in[15 + inpos] & 4294967295L) << (62 - 32));
                out[16 + outpos] = (in[15 + inpos] >>> 32)
                        | ((in[16 + inpos] & 1073741823L) << (62 - 30));
                out[17 + outpos] = (in[16 + inpos] >>> 30)
                        | ((in[17 + inpos] & 268435455L) << (62 - 28));
                out[18 + outpos] = (in[17 + inpos] >>> 28)
                        | ((in[18 + inpos] & 67108863L) << (62 - 26));
                out[19 + outpos] = (in[18 + inpos] >>> 26)
                        | ((in[19 + inpos] & 16777215L) << (62 - 24));
                out[20 + outpos] = (in[19 + inpos] >>> 24)
                        | ((in[20 + inpos] & 4194303L) << (62 - 22));
                out[21 + outpos] = (in[20 + inpos] >>> 22)
                        | ((in[21 + inpos] & 1048575L) << (62 - 20));
                out[22 + outpos] = (in[21 + inpos] >>> 20)
                        | ((in[22 + inpos] & 262143L) << (62 - 18));
                out[23 + outpos] = (in[22 + inpos] >>> 18)
                        | ((in[23 + inpos] & 65535L) << (62 - 16));
                out[24 + outpos] = (in[23 + inpos] >>> 16)
                        | ((in[24 + inpos] & 16383L) << (62 - 14));
                out[25 + outpos] = (in[24 + inpos] >>> 14)
                        | ((in[25 + inpos] & 4095L) << (62 - 12));
                out[26 + outpos] = (in[25 + inpos] >>> 12)
                        | ((in[26 + inpos] & 1023L) << (62 - 10));
                out[27 + outpos] = (in[26 + inpos] >>> 10)
                        | ((in[27 + inpos] & 255L) << (62 - 8));
                out[28 + outpos] = (in[27 + inpos] >>> 8)
                        | ((in[28 + inpos] & 63L) << (62 - 6));
                out[29 + outpos] = (in[28 + inpos] >>> 6)
                        | ((in[29 + inpos] & 15L) << (62 - 4));
                out[30 + outpos] = (in[29 + inpos] >>> 4)
                        | ((in[30 + inpos] & 3L) << (62 - 2));
                out[31 + outpos] = (in[30 + inpos] >>> 2);
                out[32 + outpos] = (in[31 + inpos] & 4611686018427387903L);
                out[33 + outpos] = (in[31 + inpos] >>> 62)
                        | ((in[32 + inpos] & 1152921504606846975L) << (62 - 60));
                out[34 + outpos] = (in[32 + inpos] >>> 60)
                        | ((in[33 + inpos] & 288230376151711743L) << (62 - 58));
                out[35 + outpos] = (in[33 + inpos] >>> 58)
                        | ((in[34 + inpos] & 72057594037927935L) << (62 - 56));
                out[36 + outpos] = (in[34 + inpos] >>> 56)
                        | ((in[35 + inpos] & 18014398509481983L) << (62 - 54));
                out[37 + outpos] = (in[35 + inpos] >>> 54)
                        | ((in[36 + inpos] & 4503599627370495L) << (62 - 52));
                out[38 + outpos] = (in[36 + inpos] >>> 52)
                        | ((in[37 + inpos] & 1125899906842623L) << (62 - 50));
                out[39 + outpos] = (in[37 + inpos] >>> 50)
                        | ((in[38 + inpos] & 281474976710655L) << (62 - 48));
                out[40 + outpos] = (in[38 + inpos] >>> 48)
                        | ((in[39 + inpos] & 70368744177663L) << (62 - 46));
                out[41 + outpos] = (in[39 + inpos] >>> 46)
                        | ((in[40 + inpos] & 17592186044415L) << (62 - 44));
                out[42 + outpos] = (in[40 + inpos] >>> 44)
                        | ((in[41 + inpos] & 4398046511103L) << (62 - 42));
                out[43 + outpos] = (in[41 + inpos] >>> 42)
                        | ((in[42 + inpos] & 1099511627775L) << (62 - 40));
                out[44 + outpos] = (in[42 + inpos] >>> 40)
                        | ((in[43 + inpos] & 274877906943L) << (62 - 38));
                out[45 + outpos] = (in[43 + inpos] >>> 38)
                        | ((in[44 + inpos] & 68719476735L) << (62 - 36));
                out[46 + outpos] = (in[44 + inpos] >>> 36)
                        | ((in[45 + inpos] & 17179869183L) << (62 - 34));
                out[47 + outpos] = (in[45 + inpos] >>> 34)
                        | ((in[46 + inpos] & 4294967295L) << (62 - 32));
                out[48 + outpos] = (in[46 + inpos] >>> 32)
                        | ((in[47 + inpos] & 1073741823L) << (62 - 30));
                out[49 + outpos] = (in[47 + inpos] >>> 30)
                        | ((in[48 + inpos] & 268435455L) << (62 - 28));
                out[50 + outpos] = (in[48 + inpos] >>> 28)
                        | ((in[49 + inpos] & 67108863L) << (62 - 26));
                out[51 + outpos] = (in[49 + inpos] >>> 26)
                        | ((in[50 + inpos] & 16777215L) << (62 - 24));
                out[52 + outpos] = (in[50 + inpos] >>> 24)
                        | ((in[51 + inpos] & 4194303L) << (62 - 22));
                out[53 + outpos] = (in[51 + inpos] >>> 22)
                        | ((in[52 + inpos] & 1048575L) << (62 - 20));
                out[54 + outpos] = (in[52 + inpos] >>> 20)
                        | ((in[53 + inpos] & 262143L) << (62 - 18));
                out[55 + outpos] = (in[53 + inpos] >>> 18)
                        | ((in[54 + inpos] & 65535L) << (62 - 16));
                out[56 + outpos] = (in[54 + inpos] >>> 16)
                        | ((in[55 + inpos] & 16383L) << (62 - 14));
                out[57 + outpos] = (in[55 + inpos] >>> 14)
                        | ((in[56 + inpos] & 4095L) << (62 - 12));
                out[58 + outpos] = (in[56 + inpos] >>> 12)
                        | ((in[57 + inpos] & 1023L) << (62 - 10));
                out[59 + outpos] = (in[57 + inpos] >>> 10)
                        | ((in[58 + inpos] & 255L) << (62 - 8));
                out[60 + outpos] = (in[58 + inpos] >>> 8)
                        | ((in[59 + inpos] & 63L) << (62 - 6));
                out[61 + outpos] = (in[59 + inpos] >>> 6)
                        | ((in[60 + inpos] & 15L) << (62 - 4));
                out[62 + outpos] = (in[60 + inpos] >>> 4)
                        | ((in[61 + inpos] & 3L) << (62 - 2));
                out[63 + outpos] = (in[61 + inpos] >>> 2);
        }

        protected static void fastunpack63(final long[] in, int inpos,
                final long[] out, int outpos) {
                out[outpos] = (in[inpos] & 9223372036854775807L);
                out[1 + outpos] = (in[inpos] >>> 63)
                        | ((in[1 + inpos] & 4611686018427387903L) << (63 - 62));
                out[2 + outpos] = (in[1 + inpos] >>> 62)
                        | ((in[2 + inpos] & 2305843009213693951L) << (63 - 61));
                out[3 + outpos] = (in[2 + inpos] >>> 61)
                        | ((in[3 + inpos] & 1152921504606846975L) << (63 - 60));
                out[4 + outpos] = (in[3 + inpos] >>> 60)
                        | ((in[4 + inpos] & 576460752303423487L) << (63 - 59));
                out[5 + outpos] = (in[4 + inpos] >>> 59)
                        | ((in[5 + inpos] & 288230376151711743L) << (63 - 58));
                out[6 + outpos] = (in[5 + inpos] >>> 58)
                        | ((in[6 + inpos] & 144115188075855871L) << (63 - 57));
                out[7 + outpos] = (in[6 + inpos] >>> 57)
                        | ((in[7 + inpos] & 72057594037927935L) << (63 - 56));
                out[8 + outpos] = (in[7 + inpos] >>> 56)
                        | ((in[8 + inpos] & 36028797018963967L) << (63 - 55));
                out[9 + outpos] = (in[8 + inpos] >>> 55)
                        | ((in[9 + inpos] & 18014398509481983L) << (63 - 54));
                out[10 + outpos] = (in[9 + inpos] >>> 54)
                        | ((in[10 + inpos] & 9007199254740991L) << (63 - 53));
                out[11 + outpos] = (in[10 + inpos] >>> 53)
                        | ((in[11 + inpos] & 4503599627370495L) << (63 - 52));
                out[12 + outpos] = (in[11 + inpos] >>> 52)
                        | ((in[12 + inpos] & 2251799813685247L) << (63 - 51));
                out[13 + outpos] = (in[12 + inpos] >>> 51)
                        | ((in[13 + inpos] & 1125899906842623L) << (63 - 50));
                out[14 + outpos] = (in[13 + inpos] >>> 50)
                        | ((in[14 + inpos] & 562949953421311L) << (63 - 49));
                out[15 + outpos] = (in[14 + inpos] >>> 49)
                        | ((in[15 + inpos] & 281474976710655L) << (63 - 48));
                out[16 + outpos] = (in[15 + inpos] >>> 48)
                        | ((in[16 + inpos] & 140737488355327L) << (63 - 47));
                out[17 + outpos] = (in[16 + inpos] >>> 47)
                        | ((in[17 + inpos] & 70368744177663L) << (63 - 46));
                out[18 + outpos] = (in[17 + inpos] >>> 46)
                        | ((in[18 + inpos] & 35184372088831L) << (63 - 45));
                out[19 + outpos] = (in[18 + inpos] >>> 45)
                        | ((in[19 + inpos] & 17592186044415L) << (63 - 44));
                out[20 + outpos] = (in[19 + inpos] >>> 44)
                        | ((in[20 + inpos] & 8796093022207L) << (63 - 43));
                out[21 + outpos] = (in[20 + inpos] >>> 43)
                        | ((in[21 + inpos] & 4398046511103L) << (63 - 42));
                out[22 + outpos] = (in[21 + inpos] >>> 42)
                        | ((in[22 + inpos] & 2199023255551L) << (63 - 41));
                out[23 + outpos] = (in[22 + inpos] >>> 41)
                        | ((in[23 + inpos] & 1099511627775L) << (63 - 40));
                out[24 + outpos] = (in[23 + inpos] >>> 40)
                        | ((in[24 + inpos] & 549755813887L) << (63 - 39));
                out[25 + outpos] = (in[24 + inpos] >>> 39)
                        | ((in[25 + inpos] & 274877906943L) << (63 - 38));
                out[26 + outpos] = (in[25 + inpos] >>> 38)
                        | ((in[26 + inpos] & 137438953471L) << (63 - 37));
                out[27 + outpos] = (in[26 + inpos] >>> 37)
                        | ((in[27 + inpos] & 68719476735L) << (63 - 36));
                out[28 + outpos] = (in[27 + inpos] >>> 36)
                        | ((in[28 + inpos] & 34359738367L) << (63 - 35));
                out[29 + outpos] = (in[28 + inpos] >>> 35)
                        | ((in[29 + inpos] & 17179869183L) << (63 - 34));
                out[30 + outpos] = (in[29 + inpos] >>> 34)
                        | ((in[30 + inpos] & 8589934591L) << (63 - 33));
                out[31 + outpos] = (in[30 + inpos] >>> 33)
                        | ((in[31 + inpos] & 4294967295L) << (63 - 32));
                out[32 + outpos] = (in[31 + inpos] >>> 32)
                        | ((in[32 + inpos] & 2147483647L) << (63 - 31));
                out[33 + outpos] = (in[32 + inpos] >>> 31)
                        | ((in[33 + inpos] & 1073741823L) << (63 - 30));
                out[34 + outpos] = (in[33 + inpos] >>> 30)
                        | ((in[34 + inpos] & 536870911L) << (63 - 29));
                out[35 + outpos] = (in[34 + inpos] >>> 29)
                        | ((in[35 + inpos] & 268435455L) << (63 - 28));
                out[36 + outpos] = (in[35 + inpos] >>> 28)
                        | ((in[36 + inpos] & 134217727L) << (63 - 27));
                out[37 + outpos] = (in[36 + inpos] >>> 27)
                        | ((in[37 + inpos] & 67108863L) << (63 - 26));
                out[38 + outpos] = (in[37 + inpos] >>> 26)
                        | ((in[38 + inpos] & 33554431L) << (63 - 25));
                out[39 + outpos] = (in[38 + inpos] >>> 25)
                        | ((in[39 + inpos] & 16777215L) << (63 - 24));
                out[40 + outpos] = (in[39 + inpos] >>> 24)
                        | ((in[40 + inpos] & 8388607L) << (63 - 23));
                out[41 + outpos] = (in[40 + inpos] >>> 23)
                        | ((in[41 + inpos] & 4194303L) << (63 - 22));
                out[42 + outpos] = (in[41 + inpos] >>> 22)
                        | ((in[42 + inpos] & 2097151L) << (63 - 21));
                out[43 + outpos] = (in[42 + inpos] >>> 21)
                        | ((in[43 + inpos] & 1048575L) << (63 - 20));
                out[44 + outpos] = (in[43 + inpos] >>> 20)
                        | ((in[44 + inpos] & 524287L) << (63 - 19));
                out[45 + outpos] = (in[44 + inpos] >>> 19)
                        | ((in[45 + inpos] & 262143L) << (63 - 18));
                out[46 + outpos] = (in[45 + inpos] >>> 18)
                        | ((in[46 + inpos] & 131071L) << (63 - 17));
                out[47 + outpos] = (in[46 + inpos] >>> 17)
                        | ((in[47 + inpos] & 65535L) << (63 - 16));
                out[48 + outpos] = (in[47 + inpos] >>> 16)
                        | ((in[48 + inpos] & 32767L) << (63 - 15));
                out[49 + outpos] = (in[48 + inpos] >>> 15)
                        | ((in[49 + inpos] & 16383L) << (63 - 14));
                out[50 + outpos] = (in[49 + inpos] >>> 14)
                        | ((in[50 + inpos] & 8191L) << (63 - 13));
                out[51 + outpos] = (in[50 + inpos] >>> 13)
                        | ((in[51 + inpos] & 4095L) << (63 - 12));
                out[52 + outpos] = (in[51 + inpos] >>> 12)
                        | ((in[52 + inpos] & 2047L) << (63 - 11));
                out[53 + outpos] = (in[52 + inpos] >>> 11)
                        | ((in[53 + inpos] & 1023L) << (63 - 10));
                out[54 + outpos] = (in[53 + inpos] >>> 10)
                        | ((in[54 + inpos] & 511L) << (63 - 9));
                out[55 + outpos] = (in[54 + inpos] >>> 9)
                        | ((in[55 + inpos] & 255L) << (63 - 8));
                out[56 + outpos] = (in[55 + inpos] >>> 8)
                        | ((in[56 + inpos] & 127L) << (63 - 7));
                out[57 + outpos] = (in[56 + inpos] >>> 7)
                        | ((in[57 + inpos] & 63L) << (63 - 6));
                out[58 + outpos] = (in[57 + inpos] >>> 6)
                        | ((in[58 + inpos] & 31L) << (63 - 5));
                out[59 + outpos] = (in[58 + inpos] >>> 5)
                        | ((in[59 + inpos] & 15L) << (63 - 4));
                out[60 + outpos] = (in[59 + inpos] >>> 4)
                        | ((in[60 + inpos] & 7L) << (63 - 3));
                out[61 + outpos] = (in[60 + inpos] >>> 3)
                        | ((in[61 + inpos] & 3L) << (63 - 2));
                out[62 + outpos] = (in[61 + inpos] >>> 2)
                        | ((in[62 + inpos] & 1L) << (63 - 1));
                out[63 + outpos] = (in[62 + inpos] >>> 1);
        }
        
        protected static void fastunpack64(final long[] in, int inpos,
                final long[] out, int outpos) {
                System.arraycopy(in, inpos, out, outpos, 64);
        }

        protected static void slowunpack(final long[] in, int inpos,
                final long[] out, int outpos, final int bit) {
                int bucket = 0;
                int shift = 0;
                for (int i = 0 ; i < 64 ; i++) {
                    if (shift >= 64) {
                        bucket++;
                        shift -= 64;

                        if (shift > 0) {
                            // There is some leftovers from previous input in the next bucket
                            out[outpos + i - 1] |= (in[inpos + bucket] << (bit - shift) & ((1L << bit) - 1));
                        }
                    }
                    out[outpos + i] = ((in[inpos + bucket] >>> shift) & ((1L << bit) - 1));
                    
                    shift += bit;
                }
        }
}

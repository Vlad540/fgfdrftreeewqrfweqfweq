package org.apache.commons.codec.binary;

import org.apache.commons.codec.BinaryDecoder;
import org.apache.commons.codec.BinaryEncoder;
import org.apache.commons.codec.DecoderException;
import org.apache.commons.codec.EncoderException;

@Deprecated
public class BinaryCodec implements BinaryDecoder, BinaryEncoder {
    private static final int[] BITS = {1, 2, 4, 8, 16, 32, 64, BIT_7};
    private static final int BIT_0 = 1;
    private static final int BIT_1 = 2;
    private static final int BIT_2 = 4;
    private static final int BIT_3 = 8;
    private static final int BIT_4 = 16;
    private static final int BIT_5 = 32;
    private static final int BIT_6 = 64;
    private static final int BIT_7 = 128;
    private static final byte[] EMPTY_BYTE_ARRAY = new byte[0];
    private static final char[] EMPTY_CHAR_ARRAY = new char[0];

    public static byte[] fromAscii(char[] cArr) {
        if (cArr == null || cArr.length == 0) {
            return EMPTY_BYTE_ARRAY;
        }
        int length = cArr.length >> 3;
        byte[] bArr = new byte[length];
        int length2 = cArr.length - 1;
        int i = 0;
        while (i < length) {
            int i2 = 0;
            while (true) {
                int[] iArr = BITS;
                if (i2 >= iArr.length) {
                    break;
                }
                if (cArr[length2 - i2] == '1') {
                    bArr[i] = (byte) (iArr[i2] | bArr[i]);
                }
                i2++;
            }
            i++;
            length2 -= 8;
        }
        return bArr;
    }

    public static byte[] toAsciiBytes(byte[] bArr) {
        if (bArr == null || bArr.length == 0) {
            return EMPTY_BYTE_ARRAY;
        }
        int length = bArr.length << 3;
        byte[] bArr2 = new byte[length];
        int i = length - 1;
        int i2 = 0;
        while (i2 < bArr.length) {
            int i3 = 0;
            while (true) {
                int[] iArr = BITS;
                if (i3 >= iArr.length) {
                    break;
                }
                if ((iArr[i3] & bArr[i2]) == 0) {
                    bArr2[i - i3] = 48;
                } else {
                    bArr2[i - i3] = 49;
                }
                i3++;
            }
            i2++;
            i -= 8;
        }
        return bArr2;
    }

    public static char[] toAsciiChars(byte[] bArr) {
        if (bArr == null || bArr.length == 0) {
            return EMPTY_CHAR_ARRAY;
        }
        int length = bArr.length << 3;
        char[] cArr = new char[length];
        int i = length - 1;
        int i2 = 0;
        while (i2 < bArr.length) {
            int i3 = 0;
            while (true) {
                int[] iArr = BITS;
                if (i3 >= iArr.length) {
                    break;
                }
                if ((iArr[i3] & bArr[i2]) == 0) {
                    cArr[i - i3] = '0';
                } else {
                    cArr[i - i3] = '1';
                }
                i3++;
            }
            i2++;
            i -= 8;
        }
        return cArr;
    }

    public static String toAsciiString(byte[] bArr) {
        return new String(toAsciiChars(bArr));
    }

    public Object decode(Object obj) throws DecoderException {
        if (obj == null) {
            return EMPTY_BYTE_ARRAY;
        }
        if (obj instanceof byte[]) {
            return fromAscii((byte[]) obj);
        }
        if (obj instanceof char[]) {
            return fromAscii((char[]) obj);
        }
        if (obj instanceof String) {
            return fromAscii(((String) obj).toCharArray());
        }
        throw new DecoderException("argument not a byte array");
    }

    public byte[] encode(byte[] bArr) {
        return toAsciiBytes(bArr);
    }

    public byte[] toByteArray(String str) {
        return str == null ? EMPTY_BYTE_ARRAY : fromAscii(str.toCharArray());
    }

    public Object encode(Object obj) throws EncoderException {
        if (obj instanceof byte[]) {
            return toAsciiChars((byte[]) obj);
        }
        throw new EncoderException("argument not a byte array");
    }

    public static byte[] fromAscii(byte[] bArr) {
        if (bArr == null || bArr.length == 0) {
            return EMPTY_BYTE_ARRAY;
        }
        int length = bArr.length >> 3;
        byte[] bArr2 = new byte[length];
        int length2 = bArr.length - 1;
        int i = 0;
        while (i < length) {
            int i2 = 0;
            while (true) {
                int[] iArr = BITS;
                if (i2 >= iArr.length) {
                    break;
                }
                if (bArr[length2 - i2] == 49) {
                    bArr2[i] = (byte) (iArr[i2] | bArr2[i]);
                }
                i2++;
            }
            i++;
            length2 -= 8;
        }
        return bArr2;
    }

    public byte[] decode(byte[] bArr) {
        return fromAscii(bArr);
    }
}

package net.jpountz.lz4;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import sun.misc.Unsafe;

final class LZ4JavaUnsafeFastDecompressor extends LZ4FastDecompressor {
    public static final LZ4FastDecompressor INSTANCE = new LZ4JavaUnsafeFastDecompressor();

    public int decompress(byte[] bArr, int i, byte[] bArr2, int i2, int i3) {
        int i4;
        byte a;
        int i5;
        byte a2;
        Unsafe unsafe = cve.a;
        njc.a(i, bArr);
        njc.b(i2, bArr2, i3);
        if (i3 != 0) {
            int i6 = i3 + i2;
            int i7 = i;
            int i8 = i2;
            while (true) {
                byte a3 = cve.a(i7, bArr);
                int i9 = i7 + 1;
                int i10 = (a3 & 255) >>> 4;
                if (i10 == 15) {
                    while (true) {
                        i5 = i9 + 1;
                        a2 = cve.a(i9, bArr);
                        if (a2 != -1) {
                            break;
                        }
                        i10 += 255;
                        i9 = i5;
                    }
                    i10 += a2 & 255;
                    i9 = i5;
                }
                int i11 = i8 + i10;
                int i12 = i6 - 8;
                if (i11 <= i12) {
                    LZ4UnsafeUtils.wildArraycopy(bArr, i9, bArr2, i8, i10);
                    int i13 = i9 + i10;
                    short f = cve.f(i13, bArr);
                    if (pze.a == ByteOrder.BIG_ENDIAN) {
                        f = Short.reverseBytes(f);
                    }
                    i7 = i13 + 2;
                    int i14 = i11 - (f & 65535);
                    if (i14 >= i2) {
                        int i15 = a3 & 15;
                        if (i15 == 15) {
                            while (true) {
                                i4 = i7 + 1;
                                a = cve.a(i7, bArr);
                                if (a != -1) {
                                    break;
                                }
                                i15 += 255;
                                i7 = i4;
                            }
                            i15 += a & 255;
                            i7 = i4;
                        }
                        int i16 = i15 + 4;
                        int i17 = i11 + i16;
                        if (i17 <= i12) {
                            LZ4UnsafeUtils.wildIncrementalCopy(bArr2, i14, i11, i17);
                        } else if (i17 <= i6) {
                            LZ4UnsafeUtils.safeIncrementalCopy(bArr2, i14, i11, i16);
                        } else {
                            throw new LZ4Exception(wn6.h(i7, "Malformed input at "));
                        }
                        i8 = i17;
                    } else {
                        throw new LZ4Exception(wn6.h(i7, "Malformed input at "));
                    }
                } else if (i11 == i6) {
                    LZ4UnsafeUtils.safeArraycopy(bArr, i9, bArr2, i8, i10);
                    return (i9 + i10) - i;
                } else {
                    throw new LZ4Exception(wn6.h(i9, "Malformed input at "));
                }
            }
        } else if (cve.a(i, bArr) == 0) {
            return 1;
        } else {
            throw new LZ4Exception(wn6.h(i, "Malformed input at "));
        }
    }

    public int decompress(ByteBuffer byteBuffer, int i, ByteBuffer byteBuffer2, int i2, int i3) {
        int i4;
        byte b;
        int i5;
        byte b2;
        if (!byteBuffer.hasArray() || !byteBuffer2.hasArray()) {
            ByteBuffer c = nu0.c(byteBuffer);
            ByteBuffer c2 = nu0.c(byteBuffer2);
            nu0.a(i, c);
            nu0.b(c2, i2, i3);
            if (i3 != 0) {
                int i6 = i3 + i2;
                int i7 = i;
                int i8 = i2;
                while (true) {
                    byte b3 = c.get(i7);
                    int i9 = i7 + 1;
                    int i10 = (b3 & 255) >>> 4;
                    if (i10 == 15) {
                        while (true) {
                            i5 = i9 + 1;
                            b2 = c.get(i9);
                            if (b2 != -1) {
                                break;
                            }
                            i10 += 255;
                            i9 = i5;
                        }
                        i10 += b2 & 255;
                        i9 = i5;
                    }
                    int i11 = i8 + i10;
                    int i12 = i6 - 8;
                    if (i11 <= i12) {
                        LZ4ByteBufferUtils.wildArraycopy(c, i9, c2, i8, i10);
                        int i13 = i9 + i10;
                        int d = nu0.d(i13, c);
                        i7 = i13 + 2;
                        int i14 = i11 - d;
                        if (i14 >= i2) {
                            int i15 = b3 & 15;
                            if (i15 == 15) {
                                while (true) {
                                    i4 = i7 + 1;
                                    b = c.get(i7);
                                    if (b != -1) {
                                        break;
                                    }
                                    i15 += 255;
                                    i7 = i4;
                                }
                                i15 += b & 255;
                                i7 = i4;
                            }
                            int i16 = i15 + 4;
                            int i17 = i11 + i16;
                            if (i17 <= i12) {
                                LZ4ByteBufferUtils.wildIncrementalCopy(c2, i14, i11, i17);
                            } else if (i17 <= i6) {
                                LZ4ByteBufferUtils.safeIncrementalCopy(c2, i14, i11, i16);
                            } else {
                                throw new LZ4Exception(wn6.h(i7, "Malformed input at "));
                            }
                            i8 = i17;
                        } else {
                            throw new LZ4Exception(wn6.h(i7, "Malformed input at "));
                        }
                    } else if (i11 == i6) {
                        LZ4ByteBufferUtils.safeArraycopy(c, i9, c2, i8, i10);
                        return (i9 + i10) - i;
                    } else {
                        throw new LZ4Exception(wn6.h(i9, "Malformed input at "));
                    }
                }
            } else if (c.get(i) == 0) {
                return 1;
            } else {
                throw new LZ4Exception(wn6.h(i, "Malformed input at "));
            }
        } else {
            return decompress(byteBuffer.array(), byteBuffer.arrayOffset() + i, byteBuffer2.array(), byteBuffer2.arrayOffset() + i2, i3);
        }
    }
}

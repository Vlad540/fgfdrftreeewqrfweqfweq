package defpackage;

import java.io.BufferedOutputStream;
import java.io.ByteArrayOutputStream;
import java.io.FilterOutputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.HashMap;
import java.util.Map;

/* renamed from: y25  reason: default package */
public final class y25 extends FilterOutputStream {
    public static final byte[] Z = "Exif\u0000\u0000".getBytes(j25.d);
    public int X;
    public int Y;
    public final n25 a;
    public final byte[] b = new byte[1];
    public final ByteBuffer c = ByteBuffer.allocate(4);
    public int o = 0;

    public y25(ByteArrayOutputStream byteArrayOutputStream, n25 n25) {
        super(new BufferedOutputStream(byteArrayOutputStream, 65536));
        this.a = n25;
    }

    public final void write(byte[] bArr, int i, int i2) {
        int i3;
        int i4;
        n25 n25;
        int i5;
        byte[] bArr2 = bArr;
        int i6 = 0;
        int i7 = 1;
        int i8 = i;
        int i9 = i2;
        while (true) {
            int i10 = this.X;
            if ((i10 > 0 || this.Y > 0 || this.o != 2) && i9 > 0) {
                if (i10 > 0) {
                    int min = Math.min(i9, i10);
                    i9 -= min;
                    this.X -= min;
                    i8 += min;
                }
                int i11 = this.Y;
                if (i11 > 0) {
                    int min2 = Math.min(i9, i11);
                    this.out.write(bArr2, i8, min2);
                    i9 -= min2;
                    this.Y -= min2;
                    i8 += min2;
                }
                if (i9 != 0) {
                    int i12 = this.o;
                    int i13 = 4;
                    ByteBuffer byteBuffer = this.c;
                    if (i12 != 0) {
                        if (i12 == i7) {
                            int min3 = Math.min(i9, 4 - byteBuffer.position());
                            byteBuffer.put(bArr2, i8, min3);
                            i8 += min3;
                            i9 -= min3;
                            if (byteBuffer.position() == 2 && byteBuffer.getShort() == -39) {
                                this.out.write(byteBuffer.array(), i6, 2);
                                byteBuffer.rewind();
                            }
                            if (byteBuffer.position() >= 4) {
                                byteBuffer.rewind();
                                short s = byteBuffer.getShort();
                                if (s == -31) {
                                    this.X = (byteBuffer.getShort() & 65535) - 2;
                                    this.o = 2;
                                } else if (s < -64 || s > -49 || s == -60 || s == -56 || s == -52) {
                                    this.out.write(byteBuffer.array(), i6, 4);
                                    this.Y = (byteBuffer.getShort() & 65535) - 2;
                                } else {
                                    this.out.write(byteBuffer.array(), i6, 4);
                                    this.o = 2;
                                }
                                byteBuffer.rewind();
                            } else {
                                return;
                            }
                        }
                        i3 = i6;
                        i4 = i7;
                    } else {
                        int min4 = Math.min(i9, 2 - byteBuffer.position());
                        byteBuffer.put(bArr2, i8, min4);
                        i8 += min4;
                        i9 -= min4;
                        if (byteBuffer.position() >= 2) {
                            byteBuffer.rewind();
                            if (byteBuffer.getShort() == -40) {
                                this.out.write(byteBuffer.array(), i6, 2);
                                this.o = i7;
                                byteBuffer.rewind();
                                ou0 ou0 = new ou0(this.out, ByteOrder.BIG_ENDIAN, i6);
                                ou0.g(-31);
                                int[] iArr = new int[4];
                                int[] iArr2 = new int[4];
                                z25[] z25Arr = n25.c;
                                int i14 = i6;
                                while (true) {
                                    n25 = this.a;
                                    if (i14 >= i13) {
                                        break;
                                    }
                                    z25 z25 = z25Arr[i14];
                                    int i15 = i6;
                                    while (true) {
                                        z25[] z25Arr2 = n25.c;
                                        if (i15 >= i13) {
                                            break;
                                        }
                                        n25.a(i15).remove(z25.b);
                                        i15 += i7;
                                        i13 = 4;
                                    }
                                    i14 += i7;
                                    i13 = 4;
                                }
                                boolean isEmpty = n25.a(i7).isEmpty();
                                ByteOrder byteOrder = n25.b;
                                if (!isEmpty) {
                                    n25.a(i6).put(n25.c[i7].b, j25.a(0, byteOrder));
                                }
                                if (!n25.a(2).isEmpty()) {
                                    n25.a(i6).put(n25.c[2].b, j25.a(0, byteOrder));
                                }
                                if (!n25.a(3).isEmpty()) {
                                    n25.a(i7).put(n25.c[3].b, j25.a(0, byteOrder));
                                }
                                int i16 = i6;
                                while (true) {
                                    z25[] z25Arr3 = n25.c;
                                    if (i16 >= 4) {
                                        break;
                                    }
                                    int i17 = i6;
                                    for (Map.Entry value : n25.a(i16).entrySet()) {
                                        j25 j25 = (j25) value.getValue();
                                        int i18 = j25.f[j25.a] * j25.b;
                                        if (i18 > 4) {
                                            i17 += i18;
                                        }
                                    }
                                    iArr2[i16] = iArr2[i16] + i17;
                                    i16 += i7;
                                    i6 = 0;
                                }
                                int i19 = 0;
                                int i20 = 8;
                                while (true) {
                                    z25[] z25Arr4 = n25.c;
                                    if (i19 >= 4) {
                                        break;
                                    }
                                    if (!n25.a(i19).isEmpty()) {
                                        iArr[i19] = i20;
                                        i20 += (n25.a(i19).size() * 12) + 6 + iArr2[i19];
                                    }
                                    i19 += i7;
                                }
                                int i21 = i20 + 8;
                                if (!n25.a(i7).isEmpty()) {
                                    n25.a(0).put(n25.c[i7].b, j25.a((long) iArr[i7], byteOrder));
                                }
                                if (!n25.a(2).isEmpty()) {
                                    i5 = i21;
                                    n25.a(0).put(n25.c[2].b, j25.a((long) iArr[2], byteOrder));
                                } else {
                                    i5 = i21;
                                }
                                if (!n25.a(3).isEmpty()) {
                                    n25.a(i7).put(n25.c[3].b, j25.a((long) iArr[3], byteOrder));
                                }
                                ou0.g((short) i5);
                                ou0.write(Z);
                                ou0.g(byteOrder == ByteOrder.BIG_ENDIAN ? (short) 19789 : 18761);
                                ou0.c = byteOrder;
                                ou0.g((short) 42);
                                ou0.d((int) 8);
                                int i22 = 0;
                                while (true) {
                                    z25[] z25Arr5 = n25.c;
                                    if (i22 >= 4) {
                                        break;
                                    }
                                    if (!n25.a(i22).isEmpty()) {
                                        ou0.g((short) n25.a(i22).size());
                                        int size = (n25.a(i22).size() * 12) + iArr[i22] + 2 + 4;
                                        for (Map.Entry entry : n25.a(i22).entrySet()) {
                                            z25 z252 = (z25) ((HashMap) m25.f.get(i22)).get(entry.getKey());
                                            e07.o(z252, "Tag not supported: " + ((String) entry.getKey()) + ". Tag needs to be ported from ExifInterface to ExifData.");
                                            j25 j252 = (j25) entry.getValue();
                                            int i23 = j25.f[j252.a];
                                            int i24 = j252.b;
                                            int i25 = i23 * i24;
                                            ou0.g((short) z252.a);
                                            ou0.g((short) j252.a);
                                            ou0.d(i24);
                                            if (i25 > 4) {
                                                ou0.d((int) ((long) size));
                                                size += i25;
                                            } else {
                                                ou0.write(j252.c);
                                                if (i25 < 4) {
                                                    for (int i26 = 4; i25 < i26; i26 = 4) {
                                                        ou0.b.write(0);
                                                        i25++;
                                                    }
                                                }
                                            }
                                        }
                                        ou0.d((int) 0);
                                        for (Map.Entry value2 : n25.a(i22).entrySet()) {
                                            byte[] bArr3 = ((j25) value2.getValue()).c;
                                            if (bArr3.length > 4) {
                                                ou0.write(bArr3, 0, bArr3.length);
                                            }
                                        }
                                    }
                                    i22++;
                                    i7 = 1;
                                }
                                i4 = i7;
                                i3 = 0;
                                ou0.c = ByteOrder.BIG_ENDIAN;
                            } else {
                                throw new IOException("Not a valid jpeg image, cannot write exif");
                            }
                        } else {
                            return;
                        }
                    }
                    i7 = i4;
                    i6 = i3;
                } else {
                    return;
                }
            }
        }
        if (i9 > 0) {
            this.out.write(bArr2, i8, i9);
        }
    }

    public final void write(int i) {
        byte[] bArr = this.b;
        bArr[0] = (byte) (i & 255);
        write(bArr);
    }

    public final void write(byte[] bArr) {
        write(bArr, 0, bArr.length);
    }
}

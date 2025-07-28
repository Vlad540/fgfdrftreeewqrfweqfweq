package defpackage;

/* renamed from: es0  reason: default package */
public abstract class es0 {
    public static final byte[] a = "0123456789abcdef".getBytes(e22.a);

    public static final String a(wr0 wr0, long j) {
        if (j > 0) {
            long j2 = j - 1;
            if (wr0.S(j2) == ((byte) 13)) {
                String o0 = wr0.o0(j2, e22.a);
                wr0.R(2);
                return o0;
            }
        }
        String o02 = wr0.o0(j, e22.a);
        wr0.R(1);
        return o02;
    }

    public static final int b(wr0 wr0, gga gga, boolean z) {
        int i;
        int i2;
        byte[] bArr;
        kuc kuc;
        int i3;
        kuc kuc2 = wr0.a;
        int i4 = -2;
        if (kuc2 == null) {
            return z ? -2 : -1;
        }
        int i5 = kuc2.b;
        int i6 = kuc2.c;
        byte[] bArr2 = kuc2.a;
        kuc kuc3 = kuc2;
        int i7 = -1;
        int i8 = 0;
        loop0:
        while (true) {
            int i9 = i8 + 1;
            int[] iArr = gga.b;
            int i10 = iArr[i8];
            int i11 = i8 + 2;
            int i12 = iArr[i9];
            if (i12 != -1) {
                i7 = i12;
            }
            if (kuc3 == null) {
                break;
            }
            if (i10 < 0) {
                int i13 = (i10 * -1) + i11;
                while (true) {
                    int i14 = i5 + 1;
                    int i15 = i11 + 1;
                    if ((bArr2[i5] & 255) != iArr[i11]) {
                        return i7;
                    }
                    boolean z2 = i15 == i13;
                    if (i14 == i6) {
                        kuc kuc4 = kuc3.f;
                        i3 = kuc4.b;
                        int i16 = kuc4.c;
                        bArr = kuc4.a;
                        if (kuc4 != kuc2) {
                            int i17 = i16;
                            kuc = kuc4;
                            i6 = i17;
                        } else if (!z2) {
                            break loop0;
                        } else {
                            i6 = i16;
                            kuc = null;
                        }
                    } else {
                        kuc = kuc3;
                        bArr = bArr2;
                        i3 = i14;
                    }
                    if (z2) {
                        i = iArr[i15];
                        i2 = i3;
                        bArr2 = bArr;
                        kuc3 = kuc;
                        break;
                    }
                    i5 = i3;
                    bArr2 = bArr;
                    kuc3 = kuc;
                    i11 = i15;
                }
            } else {
                int i18 = i5 + 1;
                byte b = bArr2[i5] & 255;
                int i19 = i11 + i10;
                while (i11 != i19) {
                    if (b == iArr[i11]) {
                        i = iArr[i11 + i10];
                        if (i18 == i6) {
                            kuc3 = kuc3.f;
                            i2 = kuc3.b;
                            i6 = kuc3.c;
                            bArr2 = kuc3.a;
                            if (kuc3 == kuc2) {
                                kuc3 = null;
                            }
                        } else {
                            i2 = i18;
                        }
                    } else {
                        i11++;
                    }
                }
                return i7;
            }
            if (i >= 0) {
                return i;
            }
            i8 = -i;
            i5 = i2;
            i4 = -2;
        }
        return z ? i4 : i7;
    }
}

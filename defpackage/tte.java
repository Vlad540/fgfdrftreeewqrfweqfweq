package defpackage;

import com.fasterxml.jackson.core.exc.StreamReadException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Arrays;
import me.leolin.shortcutbadger.BuildConfig;

/* renamed from: tte  reason: default package */
public final class tte extends jja {
    public static final int c1 = g67.ALLOW_TRAILING_COMMA.b;
    public static final int d1 = g67.ALLOW_NUMERIC_LEADING_ZEROS.b;
    public static final int e1 = g67.ALLOW_NON_NUMERIC_NUMBERS.b;
    public static final int f1 = g67.ALLOW_MISSING_VALUES.b;
    public static final int g1 = g67.ALLOW_SINGLE_QUOTES.b;
    public static final int h1 = g67.ALLOW_UNQUOTED_FIELD_NAMES.b;
    public static final int i1 = g67.ALLOW_COMMENTS.b;
    public static final int j1 = g67.ALLOW_YAML_COMMENTS.b;
    public static final int[] k1 = a22.d;
    public static final int[] l1 = a22.c;
    public final qu0 W0;
    public int[] X0 = new int[16];
    public boolean Y0;
    public InputStream Z0;
    public byte[] a1;
    public final boolean b1;

    public tte(tn6 tn6, int i, InputStream inputStream, qu0 qu0, byte[] bArr, int i2, int i3, int i4, boolean z) {
        super(tn6, i);
        this.Z0 = inputStream;
        this.W0 = qu0;
        this.a1 = bArr;
        this.X = i2;
        this.Y = i3;
        this.x0 = i2 - i4;
        this.Z = (long) ((-i2) + i4);
        this.b1 = z;
    }

    public static final int j1(int i, int i2) {
        return i2 == 4 ? i : i | (-1 << (i2 << 3));
    }

    public final void A1() {
        if (this.X >= this.Y) {
            d1();
        }
        byte[] bArr = this.a1;
        int i = this.X;
        int i2 = i + 1;
        this.X = i2;
        byte b = bArr[i];
        if ((b & 192) == 128) {
            if (i2 >= this.Y) {
                d1();
            }
            byte[] bArr2 = this.a1;
            int i3 = this.X;
            int i4 = i3 + 1;
            this.X = i4;
            byte b2 = bArr2[i3];
            if ((b2 & 192) == 128) {
                if (i4 >= this.Y) {
                    d1();
                }
                byte[] bArr3 = this.a1;
                int i5 = this.X;
                int i6 = i5 + 1;
                this.X = i6;
                byte b3 = bArr3[i5];
                if ((b3 & 192) != 128) {
                    s1(b3 & 255, i6);
                    throw null;
                }
                return;
            }
            s1(b2 & 255, i4);
            throw null;
        }
        s1(b & 255, i2);
        throw null;
    }

    public final int B1() {
        byte b;
        while (true) {
            if (this.X < this.Y || c1()) {
                byte[] bArr = this.a1;
                int i = this.X;
                int i2 = i + 1;
                this.X = i2;
                b = bArr[i] & 255;
                if (b > 32) {
                    if (b == 47) {
                        w1();
                    } else if (b != 35 || (this.a & j1) == 0) {
                        return b;
                    } else {
                        x1();
                    }
                } else if (b == 32) {
                    continue;
                } else if (b == 10) {
                    this.w0++;
                    this.x0 = i2;
                } else if (b == 13) {
                    u1();
                } else if (b != 9) {
                    J0(b);
                    throw null;
                }
            } else {
                throw new StreamReadException(this, "Unexpected end-of-input within/between " + this.A0.e() + " entries");
            }
        }
        return b;
    }

    public final int C1() {
        byte b;
        while (true) {
            if (this.X < this.Y || c1()) {
                byte[] bArr = this.a1;
                int i = this.X;
                int i2 = i + 1;
                this.X = i2;
                b = bArr[i] & 255;
                if (b > 32) {
                    if (b == 47) {
                        w1();
                    } else if (b != 35 || (this.a & j1) == 0) {
                        return b;
                    } else {
                        x1();
                    }
                } else if (b == 32) {
                    continue;
                } else if (b == 10) {
                    this.w0++;
                    this.x0 = i2;
                } else if (b == 13) {
                    u1();
                } else if (b != 9) {
                    J0(b);
                    throw null;
                }
            } else {
                y0();
                return -1;
            }
        }
        return b;
    }

    /* JADX WARNING: Removed duplicated region for block: B:9:0x003a A[LOOP:0: B:9:0x003a->B:12:0x0045, LOOP_START] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void D0() {
        /*
            r14 = this;
            super.D0()
            qu0 r0 = r14.W0
            qu0 r1 = r0.a
            if (r1 == 0) goto L_0x0049
            boolean r2 = r0.o
            r3 = 1
            r2 = r2 ^ r3
            if (r2 == 0) goto L_0x0049
            pu0 r2 = new pu0
            r2.<init>(r0)
            java.util.concurrent.atomic.AtomicReference r1 = r1.b
            java.lang.Object r4 = r1.get()
            pu0 r4 = (defpackage.pu0) r4
            int r5 = r4.b
            int r6 = r2.b
            if (r6 != r5) goto L_0x0023
            goto L_0x0047
        L_0x0023:
            r5 = 6000(0x1770, float:8.408E-42)
            if (r6 <= r5) goto L_0x003a
            pu0 r2 = new pu0
            r13 = 512(0x200, float:7.175E-43)
            int[] r10 = new int[r13]
            r5 = 128(0x80, float:1.794E-43)
            java.lang.String[] r11 = new java.lang.String[r5]
            r12 = 448(0x1c0, float:6.28E-43)
            r8 = 64
            r9 = 4
            r7 = r2
            r7.<init>(r8, r9, r10, r11, r12, r13)
        L_0x003a:
            boolean r5 = r1.compareAndSet(r4, r2)
            if (r5 == 0) goto L_0x0041
            goto L_0x0047
        L_0x0041:
            java.lang.Object r5 = r1.get()
            if (r5 == r4) goto L_0x003a
        L_0x0047:
            r0.o = r3
        L_0x0049:
            boolean r0 = r14.b1
            if (r0 == 0) goto L_0x005c
            byte[] r0 = r14.a1
            if (r0 == 0) goto L_0x005c
            byte[] r1 = defpackage.jja.N0
            if (r0 == r1) goto L_0x005c
            r14.a1 = r1
            tn6 r14 = r14.c
            r14.a(r0)
        L_0x005c:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.tte.D0():void");
    }

    public final void D1() {
        this.y0 = this.w0;
        this.z0 = this.X - this.x0;
    }

    public final int E1() {
        if (this.X >= this.Y && !c1()) {
            return 48;
        }
        byte[] bArr = this.a1;
        int i = this.X;
        byte b = bArr[i] & 255;
        if (b < 48 || b > 57) {
            return 48;
        }
        if ((this.a & d1) != 0) {
            this.X = i + 1;
            if (b == 48) {
                do {
                    if (this.X >= this.Y && !c1()) {
                        break;
                    }
                    byte[] bArr2 = this.a1;
                    int i2 = this.X;
                    b = bArr2[i2] & 255;
                    if (b < 48 || b > 57) {
                        return 48;
                    }
                    this.X = i2 + 1;
                } while (b == 48);
            }
            return b;
        }
        E0("Invalid numeric value: Leading zeroes not allowed");
        throw null;
    }

    public final void F1(int i) {
        int i2 = this.X + 1;
        this.X = i2;
        if (i == 9) {
            return;
        }
        if (i == 10) {
            this.w0++;
            this.x0 = i2;
        } else if (i == 13) {
            u1();
        } else if (i != 32) {
            I0(i, "Expected space separating root-level values");
            throw null;
        }
    }

    public final String G1(int i, int i2, int[] iArr) {
        int i3;
        int i4;
        char c;
        int i5;
        char c2;
        int i6;
        int i7;
        int i8;
        int i9 = i;
        int i10 = i2;
        int[] iArr2 = iArr;
        int i11 = 240;
        int i12 = 224;
        boolean z = true;
        int i13 = ((i9 << 2) - 4) + i10;
        if (i10 < 4) {
            int i14 = i9 - 1;
            i3 = iArr2[i14];
            iArr2[i14] = i3 << ((4 - i10) << 3);
        } else {
            i3 = 0;
        }
        bfe bfe = this.C0;
        char[] h = bfe.h();
        int i15 = 0;
        int i16 = 0;
        while (i15 < i13) {
            int i17 = iArr2[i15 >> 2] >> ((3 - (i15 & 3)) << 3);
            int i18 = i17 & 255;
            int i19 = i15 + 1;
            if (i18 > 127) {
                if ((i17 & 224) == 192) {
                    i7 = i17 & 31;
                    i6 = 1;
                } else if ((i17 & 240) == i12) {
                    i7 = i17 & 15;
                    i6 = 2;
                } else if ((i17 & 248) == i11) {
                    i7 = i17 & 7;
                    i6 = 3;
                } else {
                    q1(i18);
                    throw null;
                }
                if (i19 + i6 <= i13) {
                    int i20 = iArr2[i19 >> 2] >> ((3 - (i19 & 3)) << 3);
                    i19 = i15 + 2;
                    if ((i20 & 192) == 128) {
                        int i21 = (i20 & 63) | (i7 << 6);
                        if (i6 > 1) {
                            c = 3;
                            int i22 = iArr2[i19 >> 2] >> ((3 - (i19 & 3)) << 3);
                            i19 = i15 + 3;
                            if ((i22 & 192) == 128) {
                                int i23 = (i21 << 6) | (i22 & 63);
                                if (i6 > 2) {
                                    int i24 = iArr2[i19 >> 2] >> ((3 - (i19 & 3)) << 3);
                                    i19 = i15 + 4;
                                    if ((i24 & 192) == 128) {
                                        i18 = (i23 << 6) | (i24 & 63);
                                        i8 = 2;
                                    } else {
                                        r1(i24 & 255);
                                        throw null;
                                    }
                                } else {
                                    i18 = i23;
                                    i8 = 2;
                                }
                            } else {
                                r1(i22);
                                throw null;
                            }
                        } else {
                            c = 3;
                            i18 = i21;
                            i8 = 2;
                        }
                        if (i6 > i8) {
                            int i25 = i18 - 65536;
                            int i26 = i16;
                            if (i26 >= h.length) {
                                char[] cArr = (char[]) bfe.j;
                                int length = cArr.length;
                                int i27 = length + (length >> 1);
                                if (i27 > 65536) {
                                    i27 = length + (length >> 2);
                                }
                                h = Arrays.copyOf(cArr, i27);
                                bfe.j = h;
                            }
                            h[i26] = (char) ((i25 >> 10) + 55296);
                            i18 = (i25 & 1023) | 56320;
                            i5 = i26 + 1;
                        } else {
                            i4 = i16;
                            i5 = i4;
                        }
                    } else {
                        r1(i20);
                        throw null;
                    }
                } else {
                    q67 q67 = q67.NOT_AVAILABLE;
                    F0(" in field name");
                    throw null;
                }
            } else {
                i4 = i16;
                c = 3;
                i5 = i4;
            }
            i15 = i19;
            if (i5 >= h.length) {
                char[] cArr2 = (char[]) bfe.j;
                int length2 = cArr2.length;
                int i28 = (length2 >> 1) + length2;
                if (i28 > 65536) {
                    c2 = 2;
                    i28 = (length2 >> 2) + length2;
                } else {
                    c2 = 2;
                }
                char[] copyOf = Arrays.copyOf(cArr2, i28);
                bfe.j = copyOf;
                h = copyOf;
            } else {
                c2 = 2;
            }
            i16 = i5 + 1;
            h[i5] = (char) i18;
            char c3 = c;
            char c4 = c2;
            i11 = 240;
            z = true;
            i12 = 224;
        }
        boolean z2 = z;
        String str = new String(h, 0, i16);
        if (i10 < 4) {
            iArr2[i9 - 1] = i3;
        }
        return this.W0.f(str, iArr2, i9);
    }

    public final String H1(int i, int i2) {
        int j12 = j1(i, i2);
        String j = this.W0.j(j12);
        if (j != null) {
            return j;
        }
        int[] iArr = this.X0;
        iArr[0] = j12;
        return G1(1, i2, iArr);
    }

    public final String I1(int i, int i2, int i3) {
        int j12 = j1(i2, i3);
        String k = this.W0.k(i, j12);
        if (k != null) {
            return k;
        }
        int[] iArr = this.X0;
        iArr[0] = i;
        iArr[1] = j12;
        return G1(2, i3, iArr);
    }

    public final String J1(int i, int i2, int i3, int i4) {
        int j12 = j1(i3, i4);
        String l = this.W0.l(i, i2, j12);
        if (l != null) {
            return l;
        }
        int[] iArr = this.X0;
        iArr[0] = i;
        iArr[1] = i2;
        iArr[2] = j1(j12, i4);
        return G1(3, i4, iArr);
    }

    public final String K1(int i, int i2, int i3, int[] iArr) {
        if (i >= iArr.length) {
            iArr = jja.N0(iArr.length, iArr);
            this.X0 = iArr;
        }
        int i4 = i + 1;
        iArr[i] = j1(i2, i3);
        String m = this.W0.m(i4, iArr);
        return m == null ? G1(i4, i3, iArr) : m;
    }

    public final int L1() {
        if (this.X >= this.Y) {
            d1();
        }
        byte[] bArr = this.a1;
        int i = this.X;
        this.X = i + 1;
        return bArr[i] & 255;
    }

    public final String M1(int i, int i2, int i3, int i4, int[] iArr) {
        int i5;
        int i6;
        while (true) {
            if (l1[i3] != 0) {
                if (i3 == 34) {
                    if (i4 > 0) {
                        if (i >= iArr.length) {
                            iArr = jja.N0(iArr.length, iArr);
                            this.X0 = iArr;
                        }
                        iArr[i] = j1(i2, i4);
                        i = 1 + i;
                    }
                    String m = this.W0.m(i, iArr);
                    return m == null ? G1(i, i4, iArr) : m;
                }
                if (i3 != 92) {
                    K0(i3, "name");
                } else {
                    i3 = T0();
                }
                if (i3 > 127) {
                    int i7 = 0;
                    if (i4 >= 4) {
                        if (i >= iArr.length) {
                            iArr = jja.N0(iArr.length, iArr);
                            this.X0 = iArr;
                        }
                        iArr[i] = i2;
                        i++;
                        i2 = 0;
                        i4 = 0;
                    }
                    if (i3 < 2048) {
                        i5 = i2 << 8;
                        i6 = (i3 >> 6) | 192;
                    } else {
                        int i8 = (i2 << 8) | (i3 >> 12) | 224;
                        r8++;
                        if (r8 >= 4) {
                            if (i >= iArr.length) {
                                iArr = jja.N0(iArr.length, iArr);
                                this.X0 = iArr;
                            }
                            iArr[i] = i8;
                            i++;
                            r8 = 0;
                        } else {
                            i7 = i8;
                        }
                        i5 = i7 << 8;
                        i6 = ((i3 >> 6) & 63) | 128;
                    }
                    i2 = i5 | i6;
                    i4 = r8 + 1;
                    i3 = (i3 & 63) | 128;
                }
            }
            if (i4 < 4) {
                i4++;
                i2 = (i2 << 8) | i3;
            } else {
                if (i >= iArr.length) {
                    iArr = jja.N0(iArr.length, iArr);
                    this.X0 = iArr;
                }
                iArr[i] = i2;
                i2 = i3;
                i++;
                i4 = 1;
            }
            if (this.X < this.Y || c1()) {
                byte[] bArr = this.a1;
                int i9 = this.X;
                this.X = i9 + 1;
                i3 = bArr[i9] & 255;
            } else {
                q67 q67 = q67.NOT_AVAILABLE;
                F0(" in field name");
                throw null;
            }
        }
    }

    public final String N1(int i, int i2, int i3, int i4, int i5) {
        int[] iArr = this.X0;
        iArr[0] = i;
        iArr[1] = i2;
        return M1(2, i3, i4, i5, iArr);
    }

    public final int S0(int i) {
        int i2;
        char c;
        int i3 = i & 255;
        if (i3 <= 127) {
            return i3;
        }
        if ((i & 224) == 192) {
            i2 = i & 31;
            c = 1;
        } else if ((i & 240) == 224) {
            i2 = i & 15;
            c = 2;
        } else if ((i & 248) == 240) {
            i2 = i & 7;
            c = 3;
        } else {
            q1(i & 255);
            throw null;
        }
        int L1 = L1();
        if ((L1 & 192) == 128) {
            int i4 = (i2 << 6) | (L1 & 63);
            if (c > 1) {
                int L12 = L1();
                if ((L12 & 192) == 128) {
                    i4 = (i4 << 6) | (L12 & 63);
                    if (c > 2) {
                        int L13 = L1();
                        if ((L13 & 192) == 128) {
                            return (i4 << 6) | (L13 & 63);
                        }
                        r1(L13 & 255);
                        throw null;
                    }
                } else {
                    r1(L12 & 255);
                    throw null;
                }
            }
            return i4;
        }
        r1(L1 & 255);
        throw null;
    }

    public final char T0() {
        if (this.X < this.Y || c1()) {
            byte[] bArr = this.a1;
            int i = this.X;
            this.X = i + 1;
            byte b = bArr[i];
            if (b == 34 || b == 47 || b == 92) {
                return (char) b;
            }
            if (b == 98) {
                return 8;
            }
            if (b == 102) {
                return 12;
            }
            if (b == 110) {
                return 10;
            }
            if (b == 114) {
                return 13;
            }
            if (b == 116) {
                return 9;
            }
            if (b != 117) {
                char S0 = (char) S0(b);
                z0(S0);
                return S0;
            }
            int i2 = 0;
            int i3 = 0;
            while (i2 < 4) {
                if (this.X < this.Y || c1()) {
                    byte[] bArr2 = this.a1;
                    int i4 = this.X;
                    this.X = i4 + 1;
                    byte b2 = bArr2[i4] & 255;
                    int i5 = a22.i[b2];
                    if (i5 >= 0) {
                        i3 = (i3 << 4) | i5;
                        i2++;
                    } else {
                        I0(b2, "expected a hex-digit for character escape sequence");
                        throw null;
                    }
                } else {
                    q67 q67 = q67.NOT_AVAILABLE;
                    F0(" in character escape sequence");
                    throw null;
                }
            }
            return (char) i3;
        }
        q67 q672 = q67.NOT_AVAILABLE;
        F0(" in character escape sequence");
        throw null;
    }

    public final int U0(int i) {
        if (this.X >= this.Y) {
            d1();
        }
        byte[] bArr = this.a1;
        int i2 = this.X;
        int i3 = i2 + 1;
        this.X = i3;
        byte b = bArr[i2];
        if ((b & 192) == 128) {
            return ((i & 31) << 6) | (b & 63);
        }
        s1(b & 255, i3);
        throw null;
    }

    public final int V0(int i) {
        if (this.X >= this.Y) {
            d1();
        }
        int i2 = i & 15;
        byte[] bArr = this.a1;
        int i3 = this.X;
        int i4 = i3 + 1;
        this.X = i4;
        byte b = bArr[i3];
        if ((b & 192) == 128) {
            byte b2 = (i2 << 6) | (b & 63);
            if (i4 >= this.Y) {
                d1();
            }
            byte[] bArr2 = this.a1;
            int i5 = this.X;
            int i6 = i5 + 1;
            this.X = i6;
            byte b3 = bArr2[i5];
            if ((b3 & 192) == 128) {
                return (b2 << 6) | (b3 & 63);
            }
            s1(b3 & 255, i6);
            throw null;
        }
        s1(b & 255, i4);
        throw null;
    }

    public final int W0(int i) {
        int i2 = i & 15;
        byte[] bArr = this.a1;
        int i3 = this.X;
        int i4 = i3 + 1;
        this.X = i4;
        byte b = bArr[i3];
        if ((b & 192) == 128) {
            byte b2 = (i2 << 6) | (b & 63);
            int i5 = i3 + 2;
            this.X = i5;
            byte b3 = bArr[i4];
            if ((b3 & 192) == 128) {
                return (b2 << 6) | (b3 & 63);
            }
            s1(b3 & 255, i5);
            throw null;
        }
        s1(b & 255, i4);
        throw null;
    }

    public final int X0(int i) {
        if (this.X >= this.Y) {
            d1();
        }
        byte[] bArr = this.a1;
        int i2 = this.X;
        int i3 = i2 + 1;
        this.X = i3;
        byte b = bArr[i2];
        if ((b & 192) == 128) {
            byte b2 = ((i & 7) << 6) | (b & 63);
            if (i3 >= this.Y) {
                d1();
            }
            byte[] bArr2 = this.a1;
            int i4 = this.X;
            int i5 = i4 + 1;
            this.X = i5;
            byte b3 = bArr2[i4];
            if ((b3 & 192) == 128) {
                byte b4 = (b2 << 6) | (b3 & 63);
                if (i5 >= this.Y) {
                    d1();
                }
                byte[] bArr3 = this.a1;
                int i6 = this.X;
                int i7 = i6 + 1;
                this.X = i7;
                byte b5 = bArr3[i6];
                if ((b5 & 192) == 128) {
                    return ((b4 << 6) | (b5 & 63)) - 65536;
                }
                s1(b5 & 255, i7);
                throw null;
            }
            s1(b3 & 255, i5);
            throw null;
        }
        s1(b & 255, i3);
        throw null;
    }

    public final void Y0() {
        int i = this.X;
        if (i >= this.Y) {
            d1();
            i = this.X;
        }
        bfe bfe = this.C0;
        char[] h = bfe.h();
        int min = Math.min(this.Y, h.length + i);
        byte[] bArr = this.a1;
        int i2 = 0;
        while (true) {
            if (i >= min) {
                break;
            }
            byte b = bArr[i] & 255;
            if (k1[b] == 0) {
                i++;
                h[i2] = (char) b;
                i2++;
            } else if (b == 34) {
                this.X = i + 1;
                bfe.g = i2;
                return;
            }
        }
        this.X = i;
        Z0(h, i2);
    }

    public final void Z0(char[] cArr, int i) {
        byte[] bArr = this.a1;
        while (true) {
            int i2 = this.X;
            if (i2 >= this.Y) {
                d1();
                i2 = this.X;
            }
            int length = cArr.length;
            int i3 = 0;
            bfe bfe = this.C0;
            if (i >= length) {
                cArr = bfe.j();
                i = 0;
            }
            int min = Math.min(this.Y, (cArr.length - i) + i2);
            while (true) {
                if (i2 >= min) {
                    this.X = i2;
                    break;
                }
                int i4 = i2 + 1;
                int i5 = bArr[i2] & 255;
                int i6 = k1[i5];
                if (i6 != 0) {
                    this.X = i4;
                    if (i5 == 34) {
                        bfe.g = i;
                        return;
                    }
                    if (i6 == 1) {
                        i5 = T0();
                    } else if (i6 == 2) {
                        i5 = U0(i5);
                    } else if (i6 == 3) {
                        i5 = this.Y - i4 >= 2 ? W0(i5) : V0(i5);
                    } else if (i6 == 4) {
                        int X02 = X0(i5);
                        int i7 = i + 1;
                        cArr[i] = (char) ((X02 >> 10) | 55296);
                        if (i7 >= cArr.length) {
                            cArr = bfe.j();
                            i = 0;
                        } else {
                            i = i7;
                        }
                        i5 = (X02 & 1023) | 56320;
                    } else if (i5 < 32) {
                        K0(i5, "string value");
                    } else {
                        p1(i5);
                        throw null;
                    }
                    if (i >= cArr.length) {
                        cArr = bfe.j();
                    } else {
                        i3 = i;
                    }
                    i = i3 + 1;
                    cArr[i3] = (char) i5;
                } else {
                    cArr[i] = (char) i5;
                    i2 = i4;
                    i++;
                }
            }
        }
    }

    /*  JADX ERROR: JadxRuntimeException in pass: InitCodeVariables
        jadx.core.utils.exceptions.JadxRuntimeException: Several immutable types in one variable: [int, byte], vars: [r4v0 ?, r4v1 ?, r4v4 ?]
        	at jadx.core.dex.visitors.InitCodeVariables.setCodeVarType(InitCodeVariables.java:102)
        	at jadx.core.dex.visitors.InitCodeVariables.setCodeVar(InitCodeVariables.java:78)
        	at jadx.core.dex.visitors.InitCodeVariables.initCodeVar(InitCodeVariables.java:69)
        	at jadx.core.dex.visitors.InitCodeVariables.initCodeVars(InitCodeVariables.java:48)
        	at jadx.core.dex.visitors.InitCodeVariables.visit(InitCodeVariables.java:32)
        */
    public final defpackage.q67 a1(
/*
Method generation error in method: tte.a1(int, boolean):q67, dex: classes.dex
    jadx.core.utils.exceptions.JadxRuntimeException: Code variable not set in r4v0 ?
    	at jadx.core.dex.instructions.args.SSAVar.getCodeVar(SSAVar.java:189)
    	at jadx.core.codegen.MethodGen.addMethodArguments(MethodGen.java:157)
    	at jadx.core.codegen.MethodGen.addDefinition(MethodGen.java:129)
    	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:313)
    	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:271)
    	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$2(ClassGen.java:240)
    	at java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:183)
    	at java.util.ArrayList.forEach(ArrayList.java:1259)
    	at java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
    	at java.util.stream.Sink$ChainedReference.end(Sink.java:258)
    	at java.util.stream.AbstractPipeline.copyInto(AbstractPipeline.java:483)
    	at java.util.stream.AbstractPipeline.wrapAndCopyInto(AbstractPipeline.java:472)
    	at java.util.stream.ForEachOps$ForEachOp.evaluateSequential(ForEachOps.java:150)
    	at java.util.stream.ForEachOps$ForEachOp$OfRef.evaluateSequential(ForEachOps.java:173)
    	at java.util.stream.AbstractPipeline.evaluate(AbstractPipeline.java:234)
    	at java.util.stream.ReferencePipeline.forEach(ReferencePipeline.java:485)
    	at jadx.core.codegen.ClassGen.addInnerClsAndMethods(ClassGen.java:236)
    	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:227)
    	at jadx.core.codegen.ClassGen.addClassCode(ClassGen.java:112)
    	at jadx.core.codegen.ClassGen.makeClass(ClassGen.java:78)
    	at jadx.core.codegen.CodeGen.wrapCodeGen(CodeGen.java:44)
    	at jadx.core.codegen.CodeGen.generateJavaCode(CodeGen.java:33)
    	at jadx.core.codegen.CodeGen.generate(CodeGen.java:21)
    	at jadx.core.ProcessClass.generateCode(ProcessClass.java:61)
    	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:273)
    
*/

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0021, code lost:
        if (r13 != 44) goto L_0x0148;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x004f, code lost:
        if (r12.A0.b() == false) goto L_0x0148;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final defpackage.q67 b1(int r13) {
        /*
            r12 = this;
            r0 = 0
            r1 = 39
            int r2 = r12.a
            r3 = 0
            r4 = 1
            if (r13 == r1) goto L_0x009a
            r1 = 73
            int r5 = e1
            if (r13 == r1) goto L_0x0084
            r1 = 78
            if (r13 == r1) goto L_0x006e
            r1 = 93
            if (r13 == r1) goto L_0x0049
            r1 = 125(0x7d, float:1.75E-43)
            if (r13 == r1) goto L_0x0068
            r1 = 43
            if (r13 == r1) goto L_0x0025
            r0 = 44
            if (r13 == r0) goto L_0x0053
            goto L_0x0148
        L_0x0025:
            int r13 = r12.X
            int r1 = r12.Y
            if (r13 < r1) goto L_0x0038
            boolean r13 = r12.c1()
            if (r13 == 0) goto L_0x0032
            goto L_0x0038
        L_0x0032:
            q67 r13 = defpackage.q67.VALUE_NUMBER_INT
            r12.G0(r13)
            throw r3
        L_0x0038:
            byte[] r13 = r12.a1
            int r1 = r12.X
            int r2 = r1 + 1
            r12.X = r2
            byte r13 = r13[r1]
            r13 = r13 & 255(0xff, float:3.57E-43)
            q67 r12 = r12.a1(r13, r0)
            return r12
        L_0x0049:
            k67 r0 = r12.A0
            boolean r0 = r0.b()
            if (r0 != 0) goto L_0x0053
            goto L_0x0148
        L_0x0053:
            k67 r0 = r12.A0
            boolean r0 = r0.d()
            if (r0 != 0) goto L_0x0068
            int r0 = f1
            r0 = r0 & r2
            if (r0 == 0) goto L_0x0068
            int r13 = r12.X
            int r13 = r13 - r4
            r12.X = r13
            q67 r12 = defpackage.q67.VALUE_NULL
            return r12
        L_0x0068:
            java.lang.String r0 = "expected a value"
            r12.I0(r13, r0)
            throw r3
        L_0x006e:
            java.lang.String r13 = "NaN"
            r12.g1(r4, r13)
            r0 = r2 & r5
            if (r0 == 0) goto L_0x007e
            r0 = 9221120237041090560(0x7ff8000000000000, double:NaN)
            q67 r12 = r12.Q0(r13, r0)
            return r12
        L_0x007e:
            java.lang.String r13 = "Non-standard token 'NaN': enable JsonParser.Feature.ALLOW_NON_NUMERIC_NUMBERS to allow"
            r12.E0(r13)
            throw r3
        L_0x0084:
            java.lang.String r13 = "Infinity"
            r12.g1(r4, r13)
            r0 = r2 & r5
            if (r0 == 0) goto L_0x0094
            r0 = 9218868437227405312(0x7ff0000000000000, double:Infinity)
            q67 r12 = r12.Q0(r13, r0)
            return r12
        L_0x0094:
            java.lang.String r13 = "Non-standard token 'Infinity': enable JsonParser.Feature.ALLOW_NON_NUMERIC_NUMBERS to allow"
            r12.E0(r13)
            throw r3
        L_0x009a:
            int r5 = g1
            r2 = r2 & r5
            if (r2 == 0) goto L_0x0148
            bfe r2 = r12.C0
            char[] r13 = r2.h()
            byte[] r5 = r12.a1
            r6 = r0
        L_0x00a8:
            int r7 = r12.X
            int r8 = r12.Y
            if (r7 < r8) goto L_0x00b1
            r12.d1()
        L_0x00b1:
            int r7 = r13.length
            if (r6 < r7) goto L_0x00b9
            char[] r13 = r2.j()
            r6 = r0
        L_0x00b9:
            int r7 = r12.Y
            int r8 = r12.X
            int r9 = r13.length
            int r9 = r9 - r6
            int r9 = r9 + r8
            if (r9 >= r7) goto L_0x00c3
            r7 = r9
        L_0x00c3:
            int r8 = r12.X
            if (r8 >= r7) goto L_0x00a8
            int r9 = r8 + 1
            r12.X = r9
            byte r8 = r5[r8]
            r8 = r8 & 255(0xff, float:3.57E-43)
            int[] r10 = k1
            if (r8 == r1) goto L_0x00df
            r11 = r10[r8]
            if (r11 == 0) goto L_0x00d8
            goto L_0x00df
        L_0x00d8:
            int r9 = r6 + 1
            char r8 = (char) r8
            r13[r6] = r8
            r6 = r9
            goto L_0x00c3
        L_0x00df:
            if (r8 != r1) goto L_0x00e6
            r2.g = r6
            q67 r12 = defpackage.q67.VALUE_STRING
            return r12
        L_0x00e6:
            r7 = r10[r8]
            if (r7 == r4) goto L_0x0134
            r10 = 2
            if (r7 == r10) goto L_0x012f
            r11 = 3
            if (r7 == r11) goto L_0x0120
            r9 = 4
            if (r7 == r9) goto L_0x0100
            r13 = 32
            if (r8 >= r13) goto L_0x00fc
            java.lang.String r13 = "string value"
            r12.K0(r8, r13)
        L_0x00fc:
            r12.p1(r8)
            throw r3
        L_0x0100:
            int r7 = r12.X0(r8)
            int r8 = r6 + 1
            int r9 = r7 >> 10
            r10 = 55296(0xd800, float:7.7486E-41)
            r9 = r9 | r10
            char r9 = (char) r9
            r13[r6] = r9
            int r6 = r13.length
            if (r8 < r6) goto L_0x0118
            char[] r13 = r2.j()
            r6 = r0
            goto L_0x0119
        L_0x0118:
            r6 = r8
        L_0x0119:
            r7 = r7 & 1023(0x3ff, float:1.434E-42)
            r8 = 56320(0xdc00, float:7.8921E-41)
            r7 = r7 | r8
            goto L_0x0138
        L_0x0120:
            int r7 = r12.Y
            int r7 = r7 - r9
            if (r7 < r10) goto L_0x012a
            int r7 = r12.W0(r8)
            goto L_0x0138
        L_0x012a:
            int r7 = r12.V0(r8)
            goto L_0x0138
        L_0x012f:
            int r7 = r12.U0(r8)
            goto L_0x0138
        L_0x0134:
            char r7 = r12.T0()
        L_0x0138:
            int r8 = r13.length
            if (r6 < r8) goto L_0x0140
            char[] r13 = r2.j()
            r6 = r0
        L_0x0140:
            int r8 = r6 + 1
            char r7 = (char) r7
            r13[r6] = r7
            r6 = r8
            goto L_0x00a8
        L_0x0148:
            boolean r0 = java.lang.Character.isJavaIdentifierStart(r13)
            if (r0 == 0) goto L_0x0165
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = ""
            r0.<init>(r1)
            char r13 = (char) r13
            r0.append(r13)
            java.lang.String r13 = r0.toString()
            java.lang.String r0 = r12.L0()
            r12.t1(r13, r0)
            throw r3
        L_0x0165:
            java.lang.String r0 = r12.L0()
            java.lang.String r1 = "expected a valid value "
            java.lang.String r0 = r1.concat(r0)
            r12.I0(r13, r0)
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.tte.b1(int):q67");
    }

    public final boolean c1() {
        byte[] bArr;
        int length;
        InputStream inputStream = this.Z0;
        if (inputStream == null || (length = bArr.length) == 0) {
            return false;
        }
        int read = inputStream.read((bArr = this.a1), 0, length);
        if (read > 0) {
            int i = this.Y;
            this.Z += (long) i;
            this.x0 -= i;
            this.X = 0;
            this.Y = read;
            return true;
        }
        v0();
        if (read == 0) {
            throw new IOException(wn6.j(new StringBuilder("InputStream.read() returned 0 characters when trying to read "), this.a1.length, " bytes"));
        }
        return false;
    }

    public final void d1() {
        if (!c1()) {
            F0(" in " + this.b);
            throw null;
        }
    }

    public final void e1() {
        byte b;
        int i = this.X;
        if (i + 4 < this.Y) {
            byte[] bArr = this.a1;
            int i2 = i + 1;
            if (bArr[i] == 97) {
                int i3 = i + 2;
                if (bArr[i2] == 108) {
                    int i4 = i + 3;
                    if (bArr[i3] == 115) {
                        int i5 = i + 4;
                        if (bArr[i4] == 101 && ((b = bArr[i5] & 255) < 48 || b == 93 || b == 125)) {
                            this.X = i5;
                            return;
                        }
                    }
                }
            }
        }
        h1(1, "false");
    }

    public final void f1() {
        byte b;
        int i = this.X;
        if (i + 3 < this.Y) {
            byte[] bArr = this.a1;
            int i2 = i + 1;
            if (bArr[i] == 117) {
                int i3 = i + 2;
                if (bArr[i2] == 108) {
                    int i4 = i + 3;
                    if (bArr[i3] == 108 && ((b = bArr[i4] & 255) < 48 || b == 93 || b == 125)) {
                        this.X = i4;
                        return;
                    }
                }
            }
        }
        h1(1, "null");
    }

    public final void g1(int i, String str) {
        int length = str.length();
        if (this.X + length >= this.Y) {
            h1(i, str);
            return;
        }
        while (this.a1[this.X] == str.charAt(i)) {
            int i2 = this.X + 1;
            this.X = i2;
            i++;
            if (i >= length) {
                byte b = this.a1[i2] & 255;
                if (b >= 48 && b != 93 && b != 125 && Character.isJavaIdentifierPart((char) S0(b))) {
                    t1(str.substring(0, i), L0());
                    throw null;
                }
                return;
            }
        }
        t1(str.substring(0, i), L0());
        throw null;
    }

    public final void h1(int i, String str) {
        int i2;
        byte b;
        int length = str.length();
        do {
            if ((this.X < this.Y || c1()) && this.a1[this.X] == str.charAt(i)) {
                i2 = this.X + 1;
                this.X = i2;
                i++;
            } else {
                t1(str.substring(0, i), L0());
                throw null;
            }
        } while (i < length);
        if ((i2 < this.Y || c1()) && (b = this.a1[this.X] & 255) >= 48 && b != 93 && b != 125 && Character.isJavaIdentifierPart((char) S0(b))) {
            t1(str.substring(0, i), L0());
            throw null;
        }
    }

    public final void i1() {
        byte b;
        int i = this.X;
        if (i + 3 < this.Y) {
            byte[] bArr = this.a1;
            int i2 = i + 1;
            if (bArr[i] == 114) {
                int i3 = i + 2;
                if (bArr[i2] == 117) {
                    int i4 = i + 3;
                    if (bArr[i3] == 101 && ((b = bArr[i4] & 255) < 48 || b == 93 || b == 125)) {
                        this.X = i4;
                        return;
                    }
                }
            }
        }
        h1(1, "true");
    }

    public final q67 k1(char[] cArr, int i, int i2, boolean z, int i3) {
        boolean z2;
        bfe bfe = this.C0;
        if (i2 == 46) {
            if (i >= cArr.length) {
                cArr = bfe.j();
                i = 0;
            }
            cArr[i] = (char) i2;
            i++;
            int i4 = 0;
            while (true) {
                if (this.X >= this.Y && !c1()) {
                    z2 = true;
                    break;
                }
                byte[] bArr = this.a1;
                int i5 = this.X;
                this.X = i5 + 1;
                i2 = bArr[i5] & 255;
                if (i2 < 48 || i2 > 57) {
                    z2 = false;
                } else {
                    i4++;
                    if (i >= cArr.length) {
                        cArr = bfe.j();
                        i = 0;
                    }
                    cArr[i] = (char) i2;
                    i++;
                }
            }
            z2 = false;
            if (i4 == 0) {
                P0(i2, "Decimal point not followed by a digit");
                throw null;
            }
        } else {
            z2 = false;
        }
        if (r13 == 101 || r13 == 69) {
            if (i >= cArr.length) {
                cArr = bfe.j();
                i = 0;
            }
            int i6 = i + 1;
            cArr[i] = (char) r13;
            if (this.X >= this.Y) {
                d1();
            }
            byte[] bArr2 = this.a1;
            int i7 = this.X;
            this.X = i7 + 1;
            byte b = bArr2[i7] & 255;
            if (b == 45 || b == 43) {
                if (i6 >= cArr.length) {
                    cArr = bfe.j();
                    i6 = 0;
                }
                int i8 = i6 + 1;
                cArr[i6] = (char) b;
                if (this.X >= this.Y) {
                    d1();
                }
                byte[] bArr3 = this.a1;
                int i9 = this.X;
                this.X = i9 + 1;
                b = bArr3[i9] & 255;
                i6 = i8;
            }
            r13 = b;
            int i10 = 0;
            while (true) {
                if (r13 < 48 || r13 > 57) {
                    break;
                }
                i10++;
                if (i6 >= cArr.length) {
                    cArr = bfe.j();
                    i6 = 0;
                }
                int i11 = i6 + 1;
                cArr[i6] = (char) r13;
                if (this.X >= this.Y && !c1()) {
                    z2 = true;
                    i6 = i11;
                    break;
                }
                byte[] bArr4 = this.a1;
                int i12 = this.X;
                this.X = i12 + 1;
                r13 = bArr4[i12] & 255;
                i6 = i11;
            }
            if (i10 != 0) {
                i = i6;
            } else {
                P0(r13, "Exponent indicator not followed by a digit");
                throw null;
            }
        }
        if (!z2) {
            this.X--;
            if (this.A0.d()) {
                F1(r13);
            }
        }
        bfe.g = i;
        this.L0 = z;
        this.M0 = i3;
        this.F0 = 0;
        return q67.VALUE_NUMBER_FLOAT;
    }

    public final q67 l1() {
        if (!l67.ALLOW_LEADING_DECIMAL_POINT_FOR_NUMBERS.b.a(this.a)) {
            return b1(46);
        }
        return k1(this.C0.h(), 0, 46, false, 0);
    }

    public final q67 m1() {
        int i;
        byte b;
        bfe bfe = this.C0;
        char[] h = bfe.h();
        h[0] = '-';
        if (this.X >= this.Y) {
            d1();
        }
        byte[] bArr = this.a1;
        int i2 = this.X;
        this.X = i2 + 1;
        int i3 = bArr[i2] & 255;
        if (i3 <= 48) {
            if (i3 != 48) {
                return a1(i3, true);
            }
            i3 = E1();
        } else if (i3 > 57) {
            return a1(i3, true);
        }
        h[1] = (char) i3;
        int i4 = 2;
        int min = Math.min(this.Y, (this.X + h.length) - 2);
        int i5 = 1;
        while (true) {
            i = this.X;
            if (i >= min) {
                return n1(h, i4, true, i5);
            }
            byte[] bArr2 = this.a1;
            this.X = i + 1;
            b = bArr2[i] & 255;
            if (b >= 48 && b <= 57) {
                i5++;
                h[i4] = (char) b;
                i4++;
            }
        }
        if (b == 46 || b == 101 || b == 69) {
            return k1(h, i4, b, true, i5);
        }
        this.X = i;
        bfe.g = i4;
        if (this.A0.d()) {
            F1(b);
        }
        return R0(i5, true);
    }

    public final q67 n1(char[] cArr, int i, boolean z, int i2) {
        bfe bfe;
        int i3;
        byte b;
        char[] cArr2 = cArr;
        int i4 = i;
        int i5 = i2;
        while (true) {
            int i6 = this.X;
            int i7 = this.Y;
            bfe = this.C0;
            if (i6 < i7 || c1()) {
                byte[] bArr = this.a1;
                i3 = this.X;
                this.X = i3 + 1;
                b = bArr[i3] & 255;
                if (b <= 57 && b >= 48) {
                    if (i4 >= cArr2.length) {
                        i4 = 0;
                        cArr2 = bfe.j();
                    }
                    cArr2[i4] = (char) b;
                    i5++;
                    i4++;
                }
            } else {
                bfe.g = i4;
                return R0(i5, z);
            }
        }
        if (b == 46 || b == 101 || b == 69) {
            return k1(cArr2, i4, b, z, i5);
        }
        this.X = i3;
        bfe.g = i4;
        if (this.A0.d()) {
            F1(this.a1[this.X] & 255);
        }
        return R0(i5, z);
    }

    public final e67 o() {
        Object x0 = x0();
        long j = this.Z;
        return new e67(this.w0, (this.X - this.x0) + 1, ((long) this.X) + j, -1, x0);
    }

    public final q67 o1(int i) {
        int i2;
        byte b;
        bfe bfe = this.C0;
        char[] h = bfe.h();
        if (i == 48) {
            i = E1();
        }
        h[0] = (char) i;
        int i3 = 1;
        int min = Math.min(this.Y, (this.X + h.length) - 1);
        int i4 = 1;
        while (true) {
            i2 = this.X;
            if (i2 >= min) {
                return n1(h, i3, false, i4);
            }
            byte[] bArr = this.a1;
            this.X = i2 + 1;
            b = bArr[i2] & 255;
            if (b >= 48 && b <= 57) {
                i4++;
                h[i3] = (char) b;
                i3++;
            }
        }
        if (b == 46 || b == 101 || b == 69) {
            return k1(h, i3, b, false, i4);
        }
        this.X = i2;
        bfe.g = i3;
        if (this.A0.d()) {
            F1(b);
        }
        return R0(i4, false);
    }

    public final void p1(int i) {
        if (i < 32) {
            J0(i);
            throw null;
        } else {
            q1(i);
            throw null;
        }
    }

    public final String q0() {
        q67 q67 = this.b;
        q67 q672 = q67.VALUE_STRING;
        bfe bfe = this.C0;
        if (q67 == q672) {
            if (!this.Y0) {
                return bfe.g();
            }
            this.Y0 = false;
            int i = this.X;
            if (i >= this.Y) {
                d1();
                i = this.X;
            }
            char[] h = bfe.h();
            int min = Math.min(this.Y, h.length + i);
            byte[] bArr = this.a1;
            int i2 = 0;
            while (true) {
                if (i >= min) {
                    break;
                }
                byte b = bArr[i] & 255;
                if (k1[b] == 0) {
                    i++;
                    h[i2] = (char) b;
                    i2++;
                } else if (b == 34) {
                    this.X = i + 1;
                    bfe.g = i2;
                    if (bfe.f > 0) {
                        return bfe.g();
                    }
                    String str = i2 == 0 ? BuildConfig.FLAVOR : new String((char[]) bfe.j, 0, i2);
                    bfe.c = str;
                    return str;
                }
            }
            this.X = i;
            Z0(h, i2);
            return bfe.g();
        } else if (q67 == null) {
            return null;
        } else {
            int i3 = q67.o;
            return i3 != 5 ? (i3 == 6 || i3 == 7 || i3 == 8) ? bfe.g() : q67.a : this.A0.f;
        }
    }

    public final void q1(int i) {
        E0("Invalid UTF-8 start byte 0x" + Integer.toHexString(i));
        throw null;
    }

    public final char[] r0() {
        q67 q67 = this.b;
        if (q67 == null) {
            return null;
        }
        int i = q67.o;
        if (i != 5) {
            if (i != 6) {
                if (!(i == 7 || i == 8)) {
                    return q67.b;
                }
            } else if (this.Y0) {
                this.Y0 = false;
                Y0();
            }
            return this.C0.m();
        }
        if (!this.E0) {
            String str = this.A0.f;
            int length = str.length();
            char[] cArr = this.D0;
            if (cArr == null) {
                tn6 tn6 = this.c;
                if (tn6.h == null) {
                    char[] a = tn6.d.a(3, length);
                    tn6.h = a;
                    this.D0 = a;
                } else {
                    throw new IllegalStateException("Trying to call same allocXxx() method second time");
                }
            } else if (cArr.length < length) {
                this.D0 = new char[length];
            }
            str.getChars(0, length, this.D0, 0);
            this.E0 = true;
        }
        return this.D0;
    }

    public final void r1(int i) {
        E0("Invalid UTF-8 middle byte 0x" + Integer.toHexString(i));
        throw null;
    }

    public final int s0() {
        q67 q67 = this.b;
        if (q67 == null) {
            return 0;
        }
        int i = q67.o;
        if (i == 5) {
            return this.A0.f.length();
        }
        if (i != 6) {
            if (!(i == 7 || i == 8)) {
                return q67.b.length;
            }
        } else if (this.Y0) {
            this.Y0 = false;
            Y0();
        }
        return this.C0.t();
    }

    public final void s1(int i, int i2) {
        this.X = i2;
        r1(i);
        throw null;
    }

    public final int t0() {
        q67 q67 = this.b;
        if (q67 == null) {
            return 0;
        }
        int i = q67.o;
        if (i != 6) {
            if (!(i == 7 || i == 8)) {
                return 0;
            }
        } else if (this.Y0) {
            this.Y0 = false;
            Y0();
        }
        int i2 = this.C0.d;
        if (i2 >= 0) {
            return i2;
        }
        return 0;
    }

    public final void t1(String str, String str2) {
        StringBuilder sb = new StringBuilder(str);
        while (true) {
            if (this.X >= this.Y && !c1()) {
                break;
            }
            byte[] bArr = this.a1;
            int i = this.X;
            this.X = i + 1;
            char S0 = (char) S0(bArr[i]);
            if (!Character.isJavaIdentifierPart(S0)) {
                break;
            }
            sb.append(S0);
            if (sb.length() >= 256) {
                sb.append("...");
                break;
            }
        }
        throw new StreamReadException(this, "Unrecognized token '" + sb + "': was expecting " + str2);
    }

    public final q67 u0() {
        int i;
        int i2;
        String str;
        int i3;
        q67 q67;
        byte b;
        byte b2;
        String M1;
        String J1;
        String str2;
        int i4;
        int i5;
        int B1;
        if (this.b == q67.FIELD_NAME) {
            this.E0 = false;
            q67 q672 = this.B0;
            this.B0 = null;
            if (q672 == q67.START_ARRAY) {
                this.A0 = this.A0.f(this.y0, this.z0);
            } else if (q672 == q67.START_OBJECT) {
                this.A0 = this.A0.g(this.y0, this.z0);
            }
            this.b = q672;
            return q672;
        }
        this.F0 = 0;
        if (this.Y0) {
            this.Y0 = false;
            byte[] bArr = this.a1;
            while (true) {
                int i6 = this.X;
                int i7 = this.Y;
                if (i6 >= i7) {
                    d1();
                    i6 = this.X;
                    i7 = this.Y;
                }
                while (true) {
                    if (i6 >= i7) {
                        this.X = i6;
                        break;
                    }
                    int i8 = i6 + 1;
                    byte b3 = bArr[i6] & 255;
                    int i9 = k1[b3];
                    if (i9 != 0) {
                        this.X = i8;
                        if (b3 == 34) {
                            break;
                        } else if (i9 == 1) {
                            T0();
                        } else if (i9 == 2) {
                            y1();
                        } else if (i9 == 3) {
                            z1();
                        } else if (i9 == 4) {
                            A1();
                        } else if (b3 < 32) {
                            K0(b3, "string value");
                        } else {
                            p1(b3);
                            throw null;
                        }
                    } else {
                        i6 = i8;
                    }
                }
            }
        }
        if (this.X < this.Y || c1()) {
            byte[] bArr2 = this.a1;
            int i10 = this.X;
            int i11 = i10 + 1;
            this.X = i11;
            i = bArr2[i10] & 255;
            if (i <= 32) {
                if (i != 32) {
                    if (i == 10) {
                        this.w0++;
                        this.x0 = i11;
                    } else if (i == 13) {
                        u1();
                    } else if (i != 9) {
                        J0(i);
                        throw null;
                    }
                }
                while (true) {
                    int i12 = this.X;
                    if (i12 >= this.Y) {
                        i = C1();
                        break;
                    }
                    byte[] bArr3 = this.a1;
                    int i13 = i12 + 1;
                    this.X = i13;
                    byte b4 = bArr3[i12] & 255;
                    if (b4 > 32) {
                        if (b4 == 47 || b4 == 35) {
                            this.X = i12;
                            i = C1();
                        } else {
                            i = b4;
                        }
                    } else if (b4 != 32) {
                        if (b4 == 10) {
                            this.w0++;
                            this.x0 = i13;
                        } else if (b4 == 13) {
                            u1();
                        } else if (b4 != 9) {
                            J0(b4);
                            throw null;
                        }
                    }
                }
            } else if (i == 47 || i == 35) {
                this.X = i10;
                i = C1();
            }
        } else {
            y0();
            i = -1;
        }
        if (i < 0) {
            close();
            this.b = null;
            return null;
        } else if (i == 93) {
            D1();
            if (this.A0.b()) {
                this.A0 = this.A0.c;
                q67 q673 = q67.END_ARRAY;
                this.b = q673;
                return q673;
            }
            H0('}', 93);
            throw null;
        } else if (i == 125) {
            D1();
            if (this.A0.c()) {
                this.A0 = this.A0.c;
                q67 q674 = q67.END_OBJECT;
                this.b = q674;
                return q674;
            }
            H0(']', 125);
            throw null;
        } else {
            k67 k67 = this.A0;
            int i14 = k67.b + 1;
            k67.b = i14;
            boolean z = k67.a != 0 && i14 > 0;
            int i15 = this.a;
            if (z) {
                if (i == 44) {
                    while (true) {
                        int i16 = this.X;
                        if (i16 >= this.Y) {
                            B1 = B1();
                            break;
                        }
                        byte[] bArr4 = this.a1;
                        int i17 = i16 + 1;
                        this.X = i17;
                        byte b5 = bArr4[i16] & 255;
                        if (b5 > 32) {
                            if (b5 == 47 || b5 == 35) {
                                this.X = i16;
                                B1 = B1();
                            } else {
                                B1 = b5;
                            }
                        } else if (b5 != 32) {
                            if (b5 == 10) {
                                this.w0++;
                                this.x0 = i17;
                            } else if (b5 == 13) {
                                u1();
                            } else if (b5 != 9) {
                                J0(b5);
                                throw null;
                            }
                        }
                    }
                    if ((c1 & i15) != 0 && (i == 93 || i == 125)) {
                        if (i == 125) {
                            D1();
                            if (this.A0.c()) {
                                this.A0 = this.A0.c;
                                q67 q675 = q67.END_OBJECT;
                                this.b = q675;
                                return q675;
                            }
                            H0(']', 125);
                            throw null;
                        }
                        D1();
                        if (this.A0.b()) {
                            this.A0 = this.A0.c;
                            q67 q676 = q67.END_ARRAY;
                            this.b = q676;
                            return q676;
                        }
                        H0('}', 93);
                        throw null;
                    }
                } else {
                    I0(i, "was expecting comma to separate " + this.A0.e() + " entries");
                    throw null;
                }
            }
            if (!this.A0.c()) {
                D1();
                if (i == 34) {
                    this.Y0 = true;
                    q67 q677 = q67.VALUE_STRING;
                    this.b = q677;
                    return q677;
                } else if (i == 45) {
                    q67 m1 = m1();
                    this.b = m1;
                    return m1;
                } else if (i == 46) {
                    q67 l12 = l1();
                    this.b = l12;
                    return l12;
                } else if (i == 91) {
                    this.A0 = this.A0.f(this.y0, this.z0);
                    q67 q678 = q67.START_ARRAY;
                    this.b = q678;
                    return q678;
                } else if (i == 102) {
                    e1();
                    q67 q679 = q67.VALUE_FALSE;
                    this.b = q679;
                    return q679;
                } else if (i == 110) {
                    f1();
                    q67 q6710 = q67.VALUE_NULL;
                    this.b = q6710;
                    return q6710;
                } else if (i == 116) {
                    i1();
                    q67 q6711 = q67.VALUE_TRUE;
                    this.b = q6711;
                    return q6711;
                } else if (i != 123) {
                    switch (i) {
                        case 48:
                        case 49:
                        case 50:
                        case 51:
                        case 52:
                        case 53:
                        case 54:
                        case 55:
                        case 56:
                        case 57:
                            q67 o1 = o1(i);
                            this.b = o1;
                            return o1;
                        default:
                            q67 b12 = b1(i);
                            this.b = b12;
                            return b12;
                    }
                } else {
                    this.A0 = this.A0.g(this.y0, this.z0);
                    q67 q6712 = q67.START_OBJECT;
                    this.b = q6712;
                    return q6712;
                }
            } else {
                int i18 = this.X;
                int[] iArr = l1;
                String str3 = BuildConfig.FLAVOR;
                if (i != 34) {
                    qu0 qu0 = this.W0;
                    char c = '\'';
                    if (i != 39 || (i15 & g1) == 0) {
                        if ((h1 & i15) != 0) {
                            int[] iArr2 = a22.f;
                            if (iArr2[i] == 0) {
                                int[] iArr3 = this.X0;
                                int i19 = 0;
                                int i20 = 0;
                                int i21 = 0;
                                while (true) {
                                    if (i19 < 4) {
                                        i19++;
                                        i21 = i | (i21 << 8);
                                    } else {
                                        if (i20 >= iArr3.length) {
                                            iArr3 = jja.N0(iArr3.length, iArr3);
                                            this.X0 = iArr3;
                                        }
                                        iArr3[i20] = i21;
                                        i21 = i;
                                        i20++;
                                        i19 = 1;
                                    }
                                    if (this.X < this.Y || c1()) {
                                        byte[] bArr5 = this.a1;
                                        int i22 = this.X;
                                        i = bArr5[i22] & 255;
                                        if (iArr2[i] != 0) {
                                            if (i19 > 0) {
                                                if (i20 >= iArr3.length) {
                                                    iArr3 = jja.N0(iArr3.length, iArr3);
                                                    this.X0 = iArr3;
                                                }
                                                iArr3[i20] = i21;
                                                i20++;
                                            }
                                            str2 = qu0.m(i20, iArr3);
                                            if (str2 == null) {
                                                str2 = G1(i20, i19, iArr3);
                                            }
                                        } else {
                                            this.X = i22 + 1;
                                        }
                                    } else {
                                        q67 q6713 = q67.NOT_AVAILABLE;
                                        F0(" in field name");
                                        throw null;
                                    }
                                }
                            } else {
                                I0(i, "was expecting either valid name character (for unquoted name) or double-quote (for quoted) to start field name");
                                throw null;
                            }
                        } else {
                            I0((char) S0(i), "was expecting double-quote to start field name");
                            throw null;
                        }
                    } else if (i18 < this.Y || c1()) {
                        byte[] bArr6 = this.a1;
                        int i23 = this.X;
                        this.X = i23 + 1;
                        char c2 = bArr6[i23] & 255;
                        if (c2 != '\'') {
                            int[] iArr4 = this.X0;
                            int i24 = 0;
                            int i25 = 0;
                            int i26 = 0;
                            while (c2 != c) {
                                if (!(iArr[c2] == 0 || c2 == '\"')) {
                                    if (c2 != '\\') {
                                        K0(c2, "name");
                                    } else {
                                        c2 = T0();
                                    }
                                    if (c2 > 127) {
                                        if (i4 >= 4) {
                                            if (i24 >= iArr4.length) {
                                                iArr4 = jja.N0(iArr4.length, iArr4);
                                                this.X0 = iArr4;
                                            }
                                            iArr4[i24] = i26;
                                            i24++;
                                            i4 = 0;
                                            i26 = 0;
                                        }
                                        if (c2 < 2048) {
                                            i5 = (i26 << 8) | (c2 >> 6) | 192;
                                            i4++;
                                        } else {
                                            int i27 = (i26 << 8) | (c2 >> 12) | 224;
                                            int i28 = i4 + 1;
                                            if (i28 >= 4) {
                                                if (i24 >= iArr4.length) {
                                                    iArr4 = jja.N0(iArr4.length, iArr4);
                                                    this.X0 = iArr4;
                                                }
                                                iArr4[i24] = i27;
                                                i24++;
                                                i27 = 0;
                                                i28 = 0;
                                            }
                                            i5 = (i27 << 8) | ((c2 >> 6) & 63) | 128;
                                            i4 = i28 + 1;
                                        }
                                        i26 = i5;
                                        c2 = (c2 & '?') | 128;
                                    }
                                }
                                if (i4 < 4) {
                                    i25 = i4 + 1;
                                    i26 = c2 | (i26 << 8);
                                } else {
                                    if (i24 >= iArr4.length) {
                                        iArr4 = jja.N0(iArr4.length, iArr4);
                                        this.X0 = iArr4;
                                    }
                                    iArr4[i24] = i26;
                                    i26 = c2;
                                    i24++;
                                    i25 = 1;
                                }
                                if (this.X < this.Y || c1()) {
                                    byte[] bArr7 = this.a1;
                                    int i29 = this.X;
                                    this.X = i29 + 1;
                                    c2 = bArr7[i29] & 255;
                                    c = '\'';
                                } else {
                                    q67 q6714 = q67.NOT_AVAILABLE;
                                    F0(" in field name");
                                    throw null;
                                }
                            }
                            if (i4 > 0) {
                                if (i24 >= iArr4.length) {
                                    iArr4 = jja.N0(iArr4.length, iArr4);
                                    this.X0 = iArr4;
                                }
                                iArr4[i24] = j1(i26, i4);
                                i24++;
                            }
                            str2 = qu0.m(i24, iArr4);
                            if (str2 == null) {
                                str2 = G1(i24, i4, iArr4);
                            }
                        }
                        str = str3;
                        i2 = 45;
                    } else {
                        q67 q6715 = q67.NOT_AVAILABLE;
                        F0(": was expecting closing ''' for field name");
                        throw null;
                    }
                    str3 = str2;
                    str = str3;
                    i2 = 45;
                } else {
                    int i30 = 13 + i18;
                    int i31 = this.Y;
                    if (i30 <= i31) {
                        i2 = 45;
                        byte[] bArr8 = this.a1;
                        int i32 = i18 + 1;
                        this.X = i32;
                        byte b6 = bArr8[i18] & 255;
                        if (iArr[b6] == 0) {
                            int i33 = i18 + 2;
                            this.X = i33;
                            byte b7 = bArr8[i32] & 255;
                            if (iArr[b7] == 0) {
                                byte b8 = b7 | (b6 << 8);
                                int i34 = i18 + 3;
                                this.X = i34;
                                byte b9 = bArr8[i33] & 255;
                                if (iArr[b9] == 0) {
                                    byte b10 = (b8 << 8) | b9;
                                    int i35 = i18 + 4;
                                    this.X = i35;
                                    byte b11 = bArr8[i34] & 255;
                                    if (iArr[b11] == 0) {
                                        int i36 = (b10 << 8) | b11;
                                        int i37 = i18 + 5;
                                        this.X = i37;
                                        byte b13 = bArr8[i35] & 255;
                                        if (iArr[b13] == 0) {
                                            int i38 = i18 + 6;
                                            this.X = i38;
                                            byte b14 = bArr8[i37] & 255;
                                            if (iArr[b14] == 0) {
                                                byte b15 = b14 | (b13 << 8);
                                                int i39 = i18 + 7;
                                                this.X = i39;
                                                byte b16 = bArr8[i38] & 255;
                                                if (iArr[b16] == 0) {
                                                    byte b17 = (b15 << 8) | b16;
                                                    int i40 = i18 + 8;
                                                    this.X = i40;
                                                    byte b18 = bArr8[i39] & 255;
                                                    if (iArr[b18] == 0) {
                                                        int i41 = (b17 << 8) | b18;
                                                        int i42 = i18 + 9;
                                                        this.X = i42;
                                                        byte b19 = bArr8[i40] & 255;
                                                        if (iArr[b19] == 0) {
                                                            int i43 = 10 + i18;
                                                            this.X = i43;
                                                            byte b20 = bArr8[i42] & 255;
                                                            if (iArr[b20] != 0) {
                                                                M1 = b20 == 34 ? J1(i36, i41, b19, 1) : N1(i36, i41, b19, b20, 1);
                                                            } else {
                                                                byte b21 = b20 | (b19 << 8);
                                                                int i44 = i18 + 11;
                                                                this.X = i44;
                                                                byte b22 = bArr8[i43] & 255;
                                                                if (iArr[b22] == 0) {
                                                                    byte b23 = (b21 << 8) | b22;
                                                                    int i45 = i18 + 12;
                                                                    this.X = i45;
                                                                    byte b24 = bArr8[i44] & 255;
                                                                    if (iArr[b24] == 0) {
                                                                        int i46 = (b23 << 8) | b24;
                                                                        this.X = i30;
                                                                        byte b25 = bArr8[i45] & 255;
                                                                        if (iArr[b25] == 0) {
                                                                            int[] iArr5 = this.X0;
                                                                            iArr5[0] = i36;
                                                                            iArr5[1] = i41;
                                                                            iArr5[2] = i46;
                                                                            byte b26 = b25;
                                                                            int i47 = 3;
                                                                            while (true) {
                                                                                int i48 = this.X;
                                                                                int i49 = i48 + 4;
                                                                                if (i49 > this.Y) {
                                                                                    M1 = M1(i47, 0, b26, 0, this.X0);
                                                                                    break;
                                                                                }
                                                                                int i50 = i48 + 1;
                                                                                this.X = i50;
                                                                                byte b27 = bArr8[i48] & 255;
                                                                                if (iArr[b27] != 0) {
                                                                                    M1 = b27 == 34 ? K1(i47, b26, 1, this.X0) : M1(i47, b26, b27, 1, this.X0);
                                                                                } else {
                                                                                    byte b28 = (b26 << 8) | b27;
                                                                                    int i51 = i48 + 2;
                                                                                    this.X = i51;
                                                                                    byte b29 = bArr8[i50] & 255;
                                                                                    if (iArr[b29] != 0) {
                                                                                        M1 = b29 == 34 ? K1(i47, b28, 2, this.X0) : M1(i47, b28, b29, 2, this.X0);
                                                                                    } else {
                                                                                        byte b30 = (b28 << 8) | b29;
                                                                                        int i52 = i48 + 3;
                                                                                        this.X = i52;
                                                                                        byte b31 = bArr8[i51] & 255;
                                                                                        if (iArr[b31] != 0) {
                                                                                            M1 = b31 == 34 ? K1(i47, b30, 3, this.X0) : M1(i47, b30, b31, 3, this.X0);
                                                                                        } else {
                                                                                            int i53 = (b30 << 8) | b31;
                                                                                            this.X = i49;
                                                                                            byte b32 = bArr8[i52] & 255;
                                                                                            if (iArr[b32] != 0) {
                                                                                                M1 = b32 == 34 ? K1(i47, i53, 4, this.X0) : M1(i47, i53, b32, 4, this.X0);
                                                                                            } else {
                                                                                                int[] iArr6 = this.X0;
                                                                                                if (i47 >= iArr6.length) {
                                                                                                    this.X0 = jja.N0(i47, iArr6);
                                                                                                }
                                                                                                this.X0[i47] = i53;
                                                                                                b26 = b32;
                                                                                                i47++;
                                                                                            }
                                                                                        }
                                                                                    }
                                                                                }
                                                                            }
                                                                        } else {
                                                                            M1 = b25 == 34 ? J1(i36, i41, i46, 4) : N1(i36, i41, i46, b25, 4);
                                                                        }
                                                                    } else if (b24 == 34) {
                                                                        J1 = J1(i36, i41, b23, 3);
                                                                    } else {
                                                                        M1 = N1(i36, i41, b23, b24, 3);
                                                                    }
                                                                } else if (b22 == 34) {
                                                                    J1 = J1(i36, i41, b21, 2);
                                                                } else {
                                                                    M1 = N1(i36, i41, b21, b22, 2);
                                                                }
                                                                M1 = J1;
                                                            }
                                                        } else if (b19 == 34) {
                                                            M1 = I1(i36, i41, 4);
                                                        } else {
                                                            int[] iArr7 = this.X0;
                                                            iArr7[0] = i36;
                                                            M1 = M1(1, i41, b19, 4, iArr7);
                                                        }
                                                    } else if (b18 == 34) {
                                                        M1 = I1(i36, b17, 3);
                                                    } else {
                                                        int[] iArr8 = this.X0;
                                                        iArr8[0] = i36;
                                                        M1 = M1(1, b17, b18, 3, iArr8);
                                                    }
                                                } else if (b16 == 34) {
                                                    M1 = I1(i36, b15, 2);
                                                } else {
                                                    int[] iArr9 = this.X0;
                                                    iArr9[0] = i36;
                                                    M1 = M1(1, b15, b16, 2, iArr9);
                                                }
                                            } else if (b14 == 34) {
                                                M1 = I1(i36, b13, 1);
                                            } else {
                                                int[] iArr10 = this.X0;
                                                iArr10[0] = i36;
                                                M1 = M1(1, b13, b14, 1, iArr10);
                                            }
                                            str3 = M1;
                                        } else {
                                            str3 = b13 == 34 ? H1(i36, 4) : M1(0, i36, b13, 4, this.X0);
                                        }
                                    } else {
                                        str3 = b11 == 34 ? H1(b10, 3) : M1(0, b10, b11, 3, this.X0);
                                    }
                                } else {
                                    str3 = b9 == 34 ? H1(b8, 2) : M1(0, b8, b9, 2, this.X0);
                                }
                            } else {
                                str3 = b7 == 34 ? H1(b6, 1) : M1(0, b6, b7, 1, this.X0);
                            }
                        } else if (b6 != 34) {
                            str3 = M1(0, 0, b6, 0, this.X0);
                        }
                    } else if (i18 < i31 || c1()) {
                        byte[] bArr9 = this.a1;
                        int i54 = this.X;
                        this.X = i54 + 1;
                        byte b33 = bArr9[i54] & 255;
                        if (b33 == 34) {
                            i2 = 45;
                        } else {
                            i2 = 45;
                            str3 = M1(0, 0, b33, 0, this.X0);
                        }
                    } else {
                        q67 q6716 = q67.NOT_AVAILABLE;
                        F0(": was expecting closing '\"' for name");
                        throw null;
                    }
                    str = str3;
                }
                this.A0.h(str);
                this.b = q67.FIELD_NAME;
                int i55 = this.X;
                if (i55 + 4 >= this.Y) {
                    i3 = v1(false);
                } else {
                    byte[] bArr10 = this.a1;
                    byte b34 = bArr10[i55];
                    if (b34 == 58) {
                        int i56 = 1 + i55;
                        this.X = i56;
                        b = bArr10[i56];
                        if (b <= 32) {
                            if (b == 32 || b == 9) {
                                int i57 = i55 + 2;
                                this.X = i57;
                                b2 = bArr10[i57];
                                if (b2 > 32) {
                                    if (b2 == 47 || b2 == 35) {
                                        i3 = v1(true);
                                    } else {
                                        this.X = i55 + 3;
                                        i3 = b2;
                                    }
                                }
                            }
                            i3 = v1(true);
                        } else if (b == 47 || b == 35) {
                            i3 = v1(true);
                        } else {
                            this.X = i55 + 2;
                        }
                    } else {
                        if (b34 == 32 || b34 == 9) {
                            int i58 = i55 + 1;
                            this.X = i58;
                            b34 = bArr10[i58];
                        }
                        if (b34 == 58) {
                            int i59 = this.X;
                            int i60 = 1 + i59;
                            this.X = i60;
                            b = bArr10[i60];
                            if (b <= 32) {
                                if (b == 32 || b == 9) {
                                    int i61 = i59 + 2;
                                    this.X = i61;
                                    b2 = bArr10[i61];
                                    if (b2 > 32) {
                                        if (b2 == 47 || b2 == 35) {
                                            i3 = v1(true);
                                        } else {
                                            this.X = i59 + 3;
                                            i3 = b2;
                                        }
                                    }
                                }
                                i3 = v1(true);
                            } else if (b == 47 || b == 35) {
                                i3 = v1(true);
                            } else {
                                this.X = i59 + 2;
                            }
                        } else {
                            i3 = v1(false);
                        }
                    }
                    i3 = b;
                }
                D1();
                if (i3 == 34) {
                    this.Y0 = true;
                    this.B0 = q67.VALUE_STRING;
                    return this.b;
                }
                if (i3 == i2) {
                    q67 = m1();
                } else if (i3 == 46) {
                    q67 = l1();
                } else if (i3 == 91) {
                    q67 = q67.START_ARRAY;
                } else if (i3 == 102) {
                    e1();
                    q67 = q67.VALUE_FALSE;
                } else if (i3 == 110) {
                    f1();
                    q67 = q67.VALUE_NULL;
                } else if (i3 == 116) {
                    i1();
                    q67 = q67.VALUE_TRUE;
                } else if (i3 != 123) {
                    switch (i3) {
                        case 48:
                        case 49:
                        case 50:
                        case 51:
                        case 52:
                        case 53:
                        case 54:
                        case 55:
                        case 56:
                        case 57:
                            q67 = o1(i3);
                            break;
                        default:
                            q67 = b1(i3);
                            break;
                    }
                } else {
                    q67 = q67.START_OBJECT;
                }
                this.B0 = q67;
                return this.b;
            }
        }
    }

    public final void u1() {
        if (this.X < this.Y || c1()) {
            byte[] bArr = this.a1;
            int i = this.X;
            if (bArr[i] == 10) {
                this.X = i + 1;
            }
        }
        this.w0++;
        this.x0 = this.X;
    }

    public final void v0() {
        if (this.Z0 != null) {
            if (this.c.c || g67.AUTO_CLOSE_SOURCE.a(this.a)) {
                this.Z0.close();
            }
            this.Z0 = null;
        }
    }

    public final int v1(boolean z) {
        while (true) {
            if (this.X < this.Y || c1()) {
                byte[] bArr = this.a1;
                int i = this.X;
                int i2 = i + 1;
                this.X = i2;
                byte b = bArr[i] & 255;
                if (b > 32) {
                    if (b == 47) {
                        w1();
                    } else if (b == 35 && (this.a & j1) != 0) {
                        x1();
                    } else if (z) {
                        return b;
                    } else {
                        if (b == 58) {
                            z = true;
                        } else {
                            I0(b, "was expecting a colon to separate field name and value");
                            throw null;
                        }
                    }
                } else if (b == 32) {
                    continue;
                } else if (b == 10) {
                    this.w0++;
                    this.x0 = i2;
                } else if (b == 13) {
                    u1();
                } else if (b != 9) {
                    J0(b);
                    throw null;
                }
            } else {
                F0(" within/between " + this.A0.e() + " entries");
                throw null;
            }
        }
    }

    public final void w1() {
        if ((this.a & i1) == 0) {
            I0(47, "maybe a (non-standard) comment? (not recognized as one since Feature 'ALLOW_COMMENTS' not enabled for parser)");
            throw null;
        } else if (this.X < this.Y || c1()) {
            byte[] bArr = this.a1;
            int i = this.X;
            this.X = i + 1;
            byte b = bArr[i] & 255;
            if (b == 47) {
                x1();
            } else if (b == 42) {
                int[] iArr = a22.g;
                while (true) {
                    if (this.X >= this.Y && !c1()) {
                        break;
                    }
                    byte[] bArr2 = this.a1;
                    int i2 = this.X;
                    int i3 = i2 + 1;
                    this.X = i3;
                    byte b2 = bArr2[i2] & 255;
                    int i4 = iArr[b2];
                    if (i4 != 0) {
                        if (i4 == 2) {
                            y1();
                        } else if (i4 == 3) {
                            z1();
                        } else if (i4 == 4) {
                            A1();
                        } else if (i4 == 10) {
                            this.w0++;
                            this.x0 = i3;
                        } else if (i4 == 13) {
                            u1();
                        } else if (i4 == 42) {
                            if (i3 >= this.Y && !c1()) {
                                break;
                            }
                            byte[] bArr3 = this.a1;
                            int i5 = this.X;
                            if (bArr3[i5] == 47) {
                                this.X = i5 + 1;
                                return;
                            }
                        } else {
                            p1(b2);
                            throw null;
                        }
                    }
                }
                F0(" in a comment");
                throw null;
            } else {
                I0(b, "was expecting either '*' or '/' for a comment");
                throw null;
            }
        } else {
            F0(" in a comment");
            throw null;
        }
    }

    public final void x1() {
        int[] iArr = a22.g;
        while (true) {
            if (this.X < this.Y || c1()) {
                byte[] bArr = this.a1;
                int i = this.X;
                int i2 = i + 1;
                this.X = i2;
                byte b = bArr[i] & 255;
                int i3 = iArr[b];
                if (i3 != 0) {
                    if (i3 == 2) {
                        y1();
                    } else if (i3 == 3) {
                        z1();
                    } else if (i3 == 4) {
                        A1();
                    } else if (i3 == 10) {
                        this.w0++;
                        this.x0 = i2;
                        return;
                    } else if (i3 == 13) {
                        u1();
                        return;
                    } else if (i3 != 42 && i3 < 0) {
                        p1(b);
                        throw null;
                    }
                }
            } else {
                return;
            }
        }
    }

    public final void y1() {
        if (this.X >= this.Y) {
            d1();
        }
        byte[] bArr = this.a1;
        int i = this.X;
        int i2 = i + 1;
        this.X = i2;
        byte b = bArr[i];
        if ((b & 192) != 128) {
            s1(b & 255, i2);
            throw null;
        }
    }

    public final void z1() {
        if (this.X >= this.Y) {
            d1();
        }
        byte[] bArr = this.a1;
        int i = this.X;
        int i2 = i + 1;
        this.X = i2;
        byte b = bArr[i];
        if ((b & 192) == 128) {
            if (i2 >= this.Y) {
                d1();
            }
            byte[] bArr2 = this.a1;
            int i3 = this.X;
            int i4 = i3 + 1;
            this.X = i4;
            byte b2 = bArr2[i3];
            if ((b2 & 192) != 128) {
                s1(b2 & 255, i4);
                throw null;
            }
            return;
        }
        s1(b & 255, i2);
        throw null;
    }
}

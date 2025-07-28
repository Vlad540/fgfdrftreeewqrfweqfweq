package defpackage;

import com.fasterxml.jackson.core.JsonProcessingException;
import java.io.Writer;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Arrays;

/* renamed from: evf  reason: default package */
public final class evf extends c67 {
    public static final char[] F0 = ((char[]) a22.a.clone());
    public char[] A0;
    public int B0;
    public int C0;
    public final int D0;
    public char[] E0;
    public final Writer y0;
    public final char z0;

    public evf(tn6 tn6, int i, Writer writer, char c) {
        super(tn6, i);
        this.y0 = writer;
        if (tn6.g == null) {
            char[] a = tn6.d.a(1, 0);
            tn6.g = a;
            this.A0 = a;
            this.D0 = a.length;
            this.z0 = c;
            if (c != '\"') {
                int[] iArr = a22.h;
                if (c != '\"') {
                    int[][] iArr2 = z12.b.a;
                    int[] iArr3 = iArr2[c];
                    if (iArr3 == null) {
                        iArr = Arrays.copyOf(iArr, 128);
                        if (iArr[c] == 0) {
                            iArr[c] = -1;
                        }
                        iArr2[c] = iArr;
                    } else {
                        iArr = iArr3;
                    }
                }
                this.X = iArr;
                return;
            }
            return;
        }
        throw new IllegalStateException("Trying to call same allocXxx() method second time");
    }

    public final void A0(String str) {
        char c;
        s67 s67 = this.c;
        int i = s67.a;
        boolean z = false;
        if (i == 2) {
            if (!s67.g) {
                z = true;
            } else {
                s67.g = false;
                s67.b++;
                z = true;
            }
        } else if (i == 1) {
            int i2 = s67.b;
            s67.b = i2 + 1;
            if (i2 >= 0) {
                z = true;
            }
        } else {
            int i3 = s67.b + 1;
            s67.b = i3;
            if (i3 != 0) {
                z = true;
            }
        }
        if (z) {
            c = ',';
        } else if (z) {
            c = ':';
        } else if (!z) {
            if (z) {
                b67.d("Can not " + str + ", expecting field name (context: " + s67.e() + ")");
                throw null;
            }
            return;
        } else if (this.Z != null) {
            E0(" ");
            return;
        } else {
            return;
        }
        if (this.C0 >= this.D0) {
            x0();
        }
        char[] cArr = this.A0;
        int i4 = this.C0;
        this.C0 = i4 + 1;
        cArr[i4] = c;
    }

    public final void B0() {
        if (this.C0 + 4 >= this.D0) {
            x0();
        }
        int i = this.C0;
        char[] cArr = this.A0;
        cArr[i] = 'n';
        cArr[i + 1] = 'u';
        cArr[i + 2] = 'l';
        cArr[i + 3] = 'l';
        this.C0 = i + 4;
    }

    public final void C0(String str) {
        int i = this.C0;
        int i2 = this.D0;
        if (i >= i2) {
            x0();
        }
        char[] cArr = this.A0;
        int i3 = this.C0;
        this.C0 = i3 + 1;
        char c = this.z0;
        cArr[i3] = c;
        E0(str);
        if (this.C0 >= i2) {
            x0();
        }
        char[] cArr2 = this.A0;
        int i4 = this.C0;
        this.C0 = i4 + 1;
        cArr2[i4] = c;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:68:0x010f, code lost:
        r5 = r6.B0;
        r4 = r4 - r5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:69:0x0112, code lost:
        if (r4 <= 0) goto L_0x0117;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:70:0x0114, code lost:
        r10.write(r3, r5, r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:71:0x0117, code lost:
        r3 = r6.A0;
        r4 = r6.C0;
        r6.C0 = r4 + 1;
        r3 = r3[r4];
        z0(r3, r0[r3]);
     */
    /* JADX WARNING: Removed duplicated region for block: B:81:0x0043 A[EDGE_INSN: B:81:0x0043->B:15:0x0043 ?: BREAK  , SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:89:0x012d A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void D0(java.lang.String r20) {
        /*
            r19 = this;
            r6 = r19
            r7 = r20
            int r0 = r20.length()
            r9 = 0
            java.io.Writer r10 = r6.y0
            int r11 = r6.D0
            if (r0 <= r11) goto L_0x00ad
            r19.x0()
            int r12 = r20.length()
            r0 = r9
        L_0x0017:
            int r1 = r0 + r11
            if (r1 <= r12) goto L_0x001f
            int r1 = r12 - r0
            r13 = r1
            goto L_0x0020
        L_0x001f:
            r13 = r11
        L_0x0020:
            int r14 = r0 + r13
            char[] r1 = r6.A0
            r7.getChars(r0, r14, r1, r9)
            int r15 = r6.Y
            if (r15 == 0) goto L_0x0075
            int[] r5 = r6.X
            int r0 = r5.length
            int r1 = r15 + 1
            int r4 = java.lang.Math.min(r0, r1)
            r0 = r9
            r1 = r0
            r2 = r1
        L_0x0037:
            if (r0 >= r13) goto L_0x00a7
        L_0x0039:
            char[] r3 = r6.A0
            char r8 = r3[r0]
            if (r8 >= r4) goto L_0x0046
            r2 = r5[r8]
            if (r2 == 0) goto L_0x004b
        L_0x0043:
            r16 = r2
            goto L_0x0050
        L_0x0046:
            if (r8 <= r15) goto L_0x004b
            r16 = -1
            goto L_0x0050
        L_0x004b:
            int r0 = r0 + 1
            if (r0 < r13) goto L_0x0039
            goto L_0x0043
        L_0x0050:
            int r2 = r0 - r1
            if (r2 <= 0) goto L_0x005a
            r10.write(r3, r1, r2)
            if (r0 < r13) goto L_0x005a
            goto L_0x00a7
        L_0x005a:
            int r17 = r0 + 1
            char[] r1 = r6.A0
            r0 = r19
            r2 = r17
            r3 = r13
            r18 = r4
            r4 = r8
            r8 = r5
            r5 = r16
            int r1 = r0.y0(r1, r2, r3, r4, r5)
            r5 = r8
            r2 = r16
            r0 = r17
            r4 = r18
            goto L_0x0037
        L_0x0075:
            int[] r8 = r6.X
            int r15 = r8.length
            r0 = r9
            r1 = r0
        L_0x007a:
            if (r0 >= r13) goto L_0x00a7
        L_0x007c:
            char[] r2 = r6.A0
            char r4 = r2[r0]
            if (r4 >= r15) goto L_0x0087
            r3 = r8[r4]
            if (r3 == 0) goto L_0x0087
            goto L_0x008b
        L_0x0087:
            int r0 = r0 + 1
            if (r0 < r13) goto L_0x007c
        L_0x008b:
            int r3 = r0 - r1
            if (r3 <= 0) goto L_0x0095
            r10.write(r2, r1, r3)
            if (r0 < r13) goto L_0x0095
            goto L_0x00a7
        L_0x0095:
            int r16 = r0 + 1
            char[] r1 = r6.A0
            r5 = r8[r4]
            r0 = r19
            r2 = r16
            r3 = r13
            int r1 = r0.y0(r1, r2, r3, r4, r5)
            r0 = r16
            goto L_0x007a
        L_0x00a7:
            if (r14 < r12) goto L_0x00aa
            return
        L_0x00aa:
            r0 = r14
            goto L_0x0017
        L_0x00ad:
            int r1 = r6.C0
            int r1 = r1 + r0
            if (r1 <= r11) goto L_0x00b5
            r19.x0()
        L_0x00b5:
            char[] r1 = r6.A0
            int r2 = r6.C0
            r7.getChars(r9, r0, r1, r2)
            int r1 = r6.Y
            if (r1 == 0) goto L_0x00f9
            int r2 = r6.C0
            int r2 = r2 + r0
            int[] r0 = r6.X
            int r3 = r0.length
            int r4 = r1 + 1
            int r3 = java.lang.Math.min(r3, r4)
        L_0x00cc:
            int r4 = r6.C0
            if (r4 >= r2) goto L_0x012d
        L_0x00d0:
            char[] r4 = r6.A0
            int r5 = r6.C0
            char r7 = r4[r5]
            if (r7 >= r3) goto L_0x00dd
            r8 = r0[r7]
            if (r8 == 0) goto L_0x00f2
            goto L_0x00e0
        L_0x00dd:
            if (r7 <= r1) goto L_0x00f2
            r8 = -1
        L_0x00e0:
            int r9 = r6.B0
            int r5 = r5 - r9
            if (r5 <= 0) goto L_0x00e8
            r10.write(r4, r9, r5)
        L_0x00e8:
            int r4 = r6.C0
            int r4 = r4 + 1
            r6.C0 = r4
            r6.z0(r7, r8)
            goto L_0x00cc
        L_0x00f2:
            int r5 = r5 + 1
            r6.C0 = r5
            if (r5 < r2) goto L_0x00d0
            goto L_0x012d
        L_0x00f9:
            int r1 = r6.C0
            int r1 = r1 + r0
            int[] r0 = r6.X
            int r2 = r0.length
        L_0x00ff:
            int r3 = r6.C0
            if (r3 >= r1) goto L_0x012d
        L_0x0103:
            char[] r3 = r6.A0
            int r4 = r6.C0
            char r5 = r3[r4]
            if (r5 >= r2) goto L_0x0127
            r5 = r0[r5]
            if (r5 == 0) goto L_0x0127
            int r5 = r6.B0
            int r4 = r4 - r5
            if (r4 <= 0) goto L_0x0117
            r10.write(r3, r5, r4)
        L_0x0117:
            char[] r3 = r6.A0
            int r4 = r6.C0
            int r5 = r4 + 1
            r6.C0 = r5
            char r3 = r3[r4]
            r4 = r0[r3]
            r6.z0(r3, r4)
            goto L_0x00ff
        L_0x0127:
            int r4 = r4 + 1
            r6.C0 = r4
            if (r4 < r1) goto L_0x0103
        L_0x012d:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.evf.D0(java.lang.String):void");
    }

    public final void E0(String str) {
        int length = str.length();
        int i = this.C0;
        int i2 = this.D0;
        int i3 = i2 - i;
        if (i3 == 0) {
            x0();
            i3 = i2 - this.C0;
        }
        if (i3 >= length) {
            str.getChars(0, length, this.A0, this.C0);
            this.C0 += length;
            return;
        }
        int i4 = this.C0;
        int i5 = i2 - i4;
        str.getChars(0, i5, this.A0, i4);
        this.C0 += i5;
        x0();
        int length2 = str.length() - i5;
        while (length2 > i2) {
            int i6 = i5 + i2;
            str.getChars(i5, i6, this.A0, 0);
            this.B0 = 0;
            this.C0 = i2;
            x0();
            length2 -= i2;
            i5 = i6;
        }
        str.getChars(i5, i5 + length2, this.A0, 0);
        this.B0 = 0;
        this.C0 = length2;
    }

    public final void S(double d) {
        if (!this.b) {
            String str = zr9.a;
            if ((!Double.isNaN(d) && !Double.isInfinite(d)) || !u0(a67.QUOTE_NON_NUMERIC_NUMBERS)) {
                A0("write a number");
                E0(String.valueOf(d));
                return;
            }
        }
        r0(String.valueOf(d));
    }

    public final void U(float f) {
        if (!this.b) {
            String str = zr9.a;
            if ((!Float.isNaN(f) && !Float.isInfinite(f)) || !u0(a67.QUOTE_NON_NUMERIC_NUMBERS)) {
                A0("write a number");
                E0(String.valueOf(f));
                return;
            }
        }
        r0(String.valueOf(f));
    }

    public final void close() {
        if (this.A0 != null && u0(a67.AUTO_CLOSE_JSON_CONTENT)) {
            while (true) {
                s67 s67 = this.c;
                if (!s67.b()) {
                    if (!s67.c()) {
                        break;
                    }
                    n();
                } else {
                    m();
                }
            }
        }
        x0();
        this.B0 = 0;
        this.C0 = 0;
        tn6 tn6 = this.o;
        Writer writer = this.y0;
        if (writer != null) {
            if (tn6.c || u0(a67.AUTO_CLOSE_TARGET)) {
                writer.close();
            } else if (u0(a67.FLUSH_PASSED_TO_STREAM)) {
                writer.flush();
            }
        }
        char[] cArr = this.A0;
        if (cArr != null) {
            this.A0 = null;
            char[] cArr2 = tn6.g;
            if (cArr == cArr2 || cArr.length >= cArr2.length) {
                tn6.g = null;
                tn6.d.b.set(1, cArr);
                return;
            }
            throw new IllegalArgumentException("Trying to release buffer smaller than original");
        }
    }

    public final void e0(int i) {
        A0("write a number");
        boolean z = this.b;
        int i2 = this.D0;
        if (z) {
            if (this.C0 + 13 >= i2) {
                x0();
            }
            char[] cArr = this.A0;
            int i3 = this.C0;
            int i4 = i3 + 1;
            this.C0 = i4;
            char c = this.z0;
            cArr[i3] = c;
            int d = zr9.d(cArr, i, i4);
            char[] cArr2 = this.A0;
            this.C0 = d + 1;
            cArr2[d] = c;
            return;
        }
        if (this.C0 + 11 >= i2) {
            x0();
        }
        this.C0 = zr9.d(this.A0, i, this.C0);
    }

    public final void flush() {
        x0();
        Writer writer = this.y0;
        if (writer != null && u0(a67.FLUSH_PASSED_TO_STREAM)) {
            writer.flush();
        }
    }

    public final void g(boolean z) {
        int i;
        A0("write a boolean value");
        if (this.C0 + 5 >= this.D0) {
            x0();
        }
        int i2 = this.C0;
        char[] cArr = this.A0;
        if (z) {
            cArr[i2] = 't';
            cArr[i2 + 1] = 'r';
            cArr[i2 + 2] = 'u';
            i = i2 + 3;
            cArr[i] = 'e';
        } else {
            cArr[i2] = 'f';
            cArr[i2 + 1] = 'a';
            cArr[i2 + 2] = 'l';
            cArr[i2 + 3] = 's';
            i = i2 + 4;
            cArr[i] = 'e';
        }
        this.C0 = i + 1;
    }

    public final void m() {
        if (this.c.b()) {
            if (this.C0 >= this.D0) {
                x0();
            }
            char[] cArr = this.A0;
            int i = this.C0;
            this.C0 = i + 1;
            cArr[i] = ']';
            this.c = this.c.c;
            return;
        }
        b67.d("Current context not Array but ".concat(this.c.e()));
        throw null;
    }

    public final void m0(long j) {
        A0("write a number");
        boolean z = this.b;
        int i = this.D0;
        if (z) {
            if (this.C0 + 23 >= i) {
                x0();
            }
            char[] cArr = this.A0;
            int i2 = this.C0;
            int i3 = i2 + 1;
            this.C0 = i3;
            char c = this.z0;
            cArr[i2] = c;
            int e = zr9.e(j, cArr, i3);
            char[] cArr2 = this.A0;
            this.C0 = e + 1;
            cArr2[e] = c;
            return;
        }
        if (this.C0 + 21 >= i) {
            x0();
        }
        this.C0 = zr9.e(j, this.A0, this.C0);
    }

    public final void n() {
        if (this.c.c()) {
            if (this.C0 >= this.D0) {
                x0();
            }
            char[] cArr = this.A0;
            int i = this.C0;
            this.C0 = i + 1;
            cArr[i] = '}';
            this.c = this.c.c;
            return;
        }
        b67.d("Current context not Object but ".concat(this.c.e()));
        throw null;
    }

    public final void n0(BigDecimal bigDecimal) {
        A0("write a number");
        if (bigDecimal == null) {
            B0();
        } else if (this.b) {
            C0(t0(bigDecimal));
        } else {
            E0(t0(bigDecimal));
        }
    }

    public final void o(String str) {
        boolean z;
        s67 s67 = this.c;
        boolean z2 = false;
        if (s67.a != 2 || s67.g) {
            z = true;
        } else {
            s67.g = true;
            s67.f = str;
            nxc nxc = s67.d;
            if (nxc == null || !nxc.M(str)) {
                z = s67.b >= 0;
            } else {
                String i = wn6.i("Duplicate field '", str, "'");
                boolean z3 = nxc.b instanceof b67;
                throw new JsonProcessingException(i, (e67) null, (NumberFormatException) null);
            }
        }
        if (!z) {
            if (z) {
                z2 = true;
            }
            int i2 = this.C0 + 1;
            int i3 = this.D0;
            if (i2 >= i3) {
                x0();
            }
            if (z2) {
                char[] cArr = this.A0;
                int i4 = this.C0;
                this.C0 = i4 + 1;
                cArr[i4] = ',';
            }
            if (this.w0) {
                D0(str);
                return;
            }
            char[] cArr2 = this.A0;
            int i5 = this.C0;
            this.C0 = i5 + 1;
            char c = this.z0;
            cArr2[i5] = c;
            D0(str);
            if (this.C0 >= i3) {
                x0();
            }
            char[] cArr3 = this.A0;
            int i6 = this.C0;
            this.C0 = i6 + 1;
            cArr3[i6] = c;
            return;
        }
        b67.d("Can not write a field name, expecting a value");
        throw null;
    }

    public final void o0(BigInteger bigInteger) {
        A0("write a number");
        if (bigInteger == null) {
            B0();
        } else if (this.b) {
            C0(bigInteger.toString());
        } else {
            E0(bigInteger.toString());
        }
    }

    public final void p0() {
        A0("start an array");
        s67 s67 = this.c;
        s67 s672 = s67.e;
        nxc nxc = null;
        if (s672 == null) {
            nxc nxc2 = s67.d;
            if (nxc2 != null) {
                nxc = new nxc(nxc2.b);
            }
            s672 = new s67(1, s67, nxc);
            s67.e = s672;
        } else {
            s672.a = 1;
            s672.b = -1;
            s672.f = null;
            s672.g = false;
            nxc nxc3 = s672.d;
            if (nxc3 != null) {
                nxc3.a = null;
                nxc3.c = null;
                nxc3.o = null;
            }
        }
        this.c = s672;
        if (this.C0 >= this.D0) {
            x0();
        }
        char[] cArr = this.A0;
        int i = this.C0;
        this.C0 = i + 1;
        cArr[i] = '[';
    }

    public final void q0() {
        A0("start an object");
        s67 s67 = this.c;
        s67 s672 = s67.e;
        nxc nxc = null;
        if (s672 == null) {
            nxc nxc2 = s67.d;
            if (nxc2 != null) {
                nxc = new nxc(nxc2.b);
            }
            s672 = new s67(2, s67, nxc);
            s67.e = s672;
        } else {
            s672.a = 2;
            s672.b = -1;
            s672.f = null;
            s672.g = false;
            nxc nxc3 = s672.d;
            if (nxc3 != null) {
                nxc3.a = null;
                nxc3.c = null;
                nxc3.o = null;
            }
        }
        this.c = s672;
        if (this.C0 >= this.D0) {
            x0();
        }
        char[] cArr = this.A0;
        int i = this.C0;
        this.C0 = i + 1;
        cArr[i] = '{';
    }

    public final void r0(String str) {
        A0("write a string");
        if (str == null) {
            B0();
            return;
        }
        int i = this.C0;
        int i2 = this.D0;
        if (i >= i2) {
            x0();
        }
        char[] cArr = this.A0;
        int i3 = this.C0;
        this.C0 = i3 + 1;
        char c = this.z0;
        cArr[i3] = c;
        D0(str);
        if (this.C0 >= i2) {
            x0();
        }
        char[] cArr2 = this.A0;
        int i4 = this.C0;
        this.C0 = i4 + 1;
        cArr2[i4] = c;
    }

    public final void s0(char[] cArr, int i, int i2) {
        char c;
        char[] cArr2 = cArr;
        A0("write a string");
        int i3 = this.C0;
        int i4 = this.D0;
        if (i3 >= i4) {
            x0();
        }
        char[] cArr3 = this.A0;
        int i5 = this.C0;
        this.C0 = i5 + 1;
        char c2 = this.z0;
        cArr3[i5] = c2;
        int i6 = this.Y;
        Writer writer = this.y0;
        int i7 = 32;
        if (i6 != 0) {
            int i8 = i2 + i;
            int[] iArr = this.X;
            int min = Math.min(iArr.length, i6 + 1);
            int i9 = 0;
            int i10 = i;
            while (i10 < i8) {
                int i11 = i10;
                while (true) {
                    c = cArr2[i11];
                    if (c >= min) {
                        if (c > i6) {
                            i9 = -1;
                            break;
                        }
                    } else {
                        i9 = iArr[c];
                        if (i9 != 0) {
                            break;
                        }
                    }
                    i11++;
                    if (i11 >= i8) {
                        break;
                    }
                }
                int i12 = i11 - i10;
                if (i12 < i7) {
                    if (this.C0 + i12 > i4) {
                        x0();
                    }
                    if (i12 > 0) {
                        System.arraycopy(cArr2, i10, this.A0, this.C0, i12);
                        this.C0 += i12;
                    }
                } else {
                    x0();
                    writer.write(cArr2, i10, i12);
                }
                if (i11 >= i8) {
                    break;
                }
                i10 = i11 + 1;
                w0(c, i9);
                i7 = 32;
            }
        } else {
            int i13 = i2 + i;
            int[] iArr2 = this.X;
            int length = iArr2.length;
            int i14 = i;
            while (i14 < i13) {
                int i15 = i14;
                do {
                    char c3 = cArr2[i15];
                    if ((c3 < length && iArr2[c3] != 0) || (i15 = i15 + 1) >= i13) {
                        int i16 = i15 - i14;
                    }
                    char c32 = cArr2[i15];
                    break;
                } while ((i15 = i15 + 1) >= i13);
                int i162 = i15 - i14;
                if (i162 < 32) {
                    if (this.C0 + i162 > i4) {
                        x0();
                    }
                    if (i162 > 0) {
                        System.arraycopy(cArr2, i14, this.A0, this.C0, i162);
                        this.C0 += i162;
                    }
                } else {
                    x0();
                    writer.write(cArr2, i14, i162);
                }
                if (i15 >= i13) {
                    break;
                }
                i14 = i15 + 1;
                char c4 = cArr2[i15];
                w0(c4, iArr2[c4]);
            }
        }
        if (this.C0 >= i4) {
            x0();
        }
        char[] cArr4 = this.A0;
        int i17 = this.C0;
        this.C0 = i17 + 1;
        cArr4[i17] = c2;
    }

    public final char[] v0() {
        char[] cArr = new char[14];
        cArr[0] = '\\';
        cArr[2] = '\\';
        cArr[3] = 'u';
        cArr[4] = '0';
        cArr[5] = '0';
        cArr[8] = '\\';
        cArr[9] = 'u';
        this.E0 = cArr;
        return cArr;
    }

    public final void w0(char c, int i) {
        int i2;
        int i3 = this.D0;
        if (i >= 0) {
            if (this.C0 + 2 > i3) {
                x0();
            }
            char[] cArr = this.A0;
            int i4 = this.C0;
            int i5 = i4 + 1;
            this.C0 = i5;
            cArr[i4] = '\\';
            this.C0 = i4 + 2;
            cArr[i5] = (char) i;
        } else if (i != -2) {
            if (this.C0 + 5 >= i3) {
                x0();
            }
            int i6 = this.C0;
            char[] cArr2 = this.A0;
            cArr2[i6] = '\\';
            int i7 = i6 + 2;
            cArr2[i6 + 1] = 'u';
            char[] cArr3 = F0;
            if (c > 255) {
                int i8 = c >> 8;
                int i9 = i6 + 3;
                cArr2[i7] = cArr3[(i8 & 255) >> 4];
                i2 = i6 + 4;
                cArr2[i9] = cArr3[i8 & 15];
                c = (char) (c & 255);
            } else {
                int i10 = i6 + 3;
                cArr2[i7] = '0';
                i2 = i6 + 4;
                cArr2[i10] = '0';
            }
            cArr2[i2] = cArr3[c >> 4];
            cArr2[i2 + 1] = cArr3[c & 15];
            this.C0 = i2 + 2;
        } else {
            throw null;
        }
    }

    public final void x0() {
        int i = this.C0;
        int i2 = this.B0;
        int i3 = i - i2;
        if (i3 > 0) {
            this.B0 = 0;
            this.C0 = 0;
            this.y0.write(this.A0, i2, i3);
        }
    }

    public final int y0(char[] cArr, int i, int i2, char c, int i3) {
        int i4;
        Writer writer = this.y0;
        if (i3 >= 0) {
            if (i <= 1 || i >= i2) {
                char[] cArr2 = this.E0;
                if (cArr2 == null) {
                    cArr2 = v0();
                }
                cArr2[1] = (char) i3;
                writer.write(cArr2, 0, 2);
                return i;
            }
            int i5 = i - 2;
            cArr[i5] = '\\';
            cArr[i - 1] = (char) i3;
            return i5;
        } else if (i3 != -2) {
            char[] cArr3 = F0;
            if (i <= 5 || i >= i2) {
                char[] cArr4 = this.E0;
                if (cArr4 == null) {
                    cArr4 = v0();
                }
                this.B0 = this.C0;
                if (c > 255) {
                    int i6 = c >> 8;
                    cArr4[10] = cArr3[(i6 & 255) >> 4];
                    cArr4[11] = cArr3[i6 & 15];
                    cArr4[12] = cArr3[(c & 255) >> 4];
                    cArr4[13] = cArr3[c & 15];
                    writer.write(cArr4, 8, 6);
                    return i;
                }
                cArr4[6] = cArr3[c >> 4];
                cArr4[7] = cArr3[c & 15];
                writer.write(cArr4, 2, 6);
                return i;
            }
            cArr[i - 6] = '\\';
            int i7 = i - 4;
            cArr[i - 5] = 'u';
            if (c > 255) {
                int i8 = c >> 8;
                int i9 = i - 3;
                cArr[i7] = cArr3[(i8 & 255) >> 4];
                i4 = i - 2;
                cArr[i9] = cArr3[i8 & 15];
                c = (char) (c & 255);
            } else {
                int i10 = i - 3;
                cArr[i7] = '0';
                i4 = i - 2;
                cArr[i10] = '0';
            }
            cArr[i4] = cArr3[c >> 4];
            cArr[i4 + 1] = cArr3[c & 15];
            return i4 - 4;
        } else {
            throw null;
        }
    }

    public final void z0(char c, int i) {
        int i2;
        Writer writer = this.y0;
        if (i >= 0) {
            int i3 = this.C0;
            if (i3 >= 2) {
                int i4 = i3 - 2;
                this.B0 = i4;
                char[] cArr = this.A0;
                cArr[i4] = '\\';
                cArr[i3 - 1] = (char) i;
                return;
            }
            char[] cArr2 = this.E0;
            if (cArr2 == null) {
                cArr2 = v0();
            }
            this.B0 = this.C0;
            cArr2[1] = (char) i;
            writer.write(cArr2, 0, 2);
        } else if (i != -2) {
            int i5 = this.C0;
            char[] cArr3 = F0;
            if (i5 >= 6) {
                char[] cArr4 = this.A0;
                int i6 = i5 - 6;
                this.B0 = i6;
                cArr4[i6] = '\\';
                cArr4[i5 - 5] = 'u';
                if (c > 255) {
                    int i7 = c >> 8;
                    cArr4[i5 - 4] = cArr3[(i7 & 255) >> 4];
                    i2 = i5 - 3;
                    cArr4[i2] = cArr3[i7 & 15];
                    c = (char) (c & 255);
                } else {
                    cArr4[i5 - 4] = '0';
                    i2 = i5 - 3;
                    cArr4[i2] = '0';
                }
                cArr4[i2 + 1] = cArr3[c >> 4];
                cArr4[i2 + 2] = cArr3[c & 15];
                return;
            }
            char[] cArr5 = this.E0;
            if (cArr5 == null) {
                cArr5 = v0();
            }
            this.B0 = this.C0;
            if (c > 255) {
                int i8 = c >> 8;
                cArr5[10] = cArr3[(i8 & 255) >> 4];
                cArr5[11] = cArr3[i8 & 15];
                cArr5[12] = cArr3[(c & 255) >> 4];
                cArr5[13] = cArr3[c & 15];
                writer.write(cArr5, 8, 6);
                return;
            }
            cArr5[6] = cArr3[c >> 4];
            cArr5[7] = cArr3[c & 15];
            writer.write(cArr5, 2, 6);
        } else {
            throw null;
        }
    }
}

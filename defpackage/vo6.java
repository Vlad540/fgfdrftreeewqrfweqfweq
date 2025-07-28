package defpackage;

import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Locale;
import me.leolin.shortcutbadger.BuildConfig;

/* renamed from: vo6  reason: default package */
public final class vo6 extends xs7 {
    public static final yc5 F = new yc5(23);
    public final so6 E;

    public vo6(so6 so6) {
        this.E = so6;
    }

    public static tl W(yze yze, int i, int i2) {
        int i3;
        String str;
        int v = yze.v();
        String k0 = k0(v);
        int i4 = i - 1;
        byte[] bArr = new byte[i4];
        yze.g(0, bArr, i4);
        if (i2 == 2) {
            String valueOf = String.valueOf(fja.A(new String(bArr, 0, 3, "ISO-8859-1")));
            str = valueOf.length() != 0 ? "image/".concat(valueOf) : new String("image/");
            if ("image/jpg".equals(str)) {
                str = "image/jpeg";
            }
            i3 = 2;
        } else {
            i3 = n0(0, bArr);
            str = fja.A(new String(bArr, 0, i3, "ISO-8859-1"));
            if (str.indexOf(47) == -1) {
                str = str.length() != 0 ? "image/".concat(str) : new String("image/");
            }
        }
        byte b = bArr[i3 + 1] & 255;
        int i5 = i3 + 2;
        int m0 = m0(i5, bArr, v);
        String str2 = new String(bArr, i5, m0 - i5, k0);
        int j0 = j0(v) + m0;
        return new tl(str, str2, b, i4 <= j0 ? mze.f : Arrays.copyOfRange(bArr, j0, i4));
    }

    public static p12 X(yze yze, int i, int i2, boolean z, int i3, so6 so6) {
        yze yze2 = yze;
        int i4 = yze2.b;
        int n0 = n0(i4, yze2.a);
        String str = new String(yze2.a, i4, n0 - i4, "ISO-8859-1");
        yze.H(n0 + 1);
        int h = yze.h();
        int h2 = yze.h();
        long w = yze.w();
        long j = w == 4294967295L ? -1 : w;
        long w2 = yze.w();
        long j2 = w2 == 4294967295L ? -1 : w2;
        ArrayList arrayList = new ArrayList();
        int i5 = i4 + i;
        while (yze2.b < i5) {
            xo6 a0 = a0(i2, yze, z, i3, so6);
            if (a0 != null) {
                arrayList.add(a0);
            }
        }
        return new p12(str, h, h2, j, j2, (xo6[]) arrayList.toArray(new xo6[0]));
    }

    public static r12 Y(yze yze, int i, int i2, boolean z, int i3, so6 so6) {
        yze yze2 = yze;
        int i4 = yze2.b;
        int n0 = n0(i4, yze2.a);
        String str = new String(yze2.a, i4, n0 - i4, "ISO-8859-1");
        yze2.H(n0 + 1);
        int v = yze.v();
        boolean z2 = (v & 2) != 0;
        boolean z3 = (v & 1) != 0;
        int v2 = yze.v();
        String[] strArr = new String[v2];
        for (int i5 = 0; i5 < v2; i5++) {
            int i6 = yze2.b;
            int n02 = n0(i6, yze2.a);
            strArr[i5] = new String(yze2.a, i6, n02 - i6, "ISO-8859-1");
            yze2.H(n02 + 1);
        }
        ArrayList arrayList = new ArrayList();
        int i7 = i4 + i;
        while (yze2.b < i7) {
            xo6 a0 = a0(i2, yze2, z, i3, so6);
            if (a0 != null) {
                arrayList.add(a0);
            }
        }
        return new r12(str, z2, z3, strArr, (xo6[]) arrayList.toArray(new xo6[0]));
    }

    public static x33 Z(int i, yze yze) {
        if (i < 4) {
            return null;
        }
        int v = yze.v();
        String k0 = k0(v);
        byte[] bArr = new byte[3];
        yze.g(0, bArr, 3);
        String str = new String(bArr, 0, 3);
        int i2 = i - 4;
        byte[] bArr2 = new byte[i2];
        yze.g(0, bArr2, i2);
        int m0 = m0(0, bArr2, v);
        String str2 = new String(bArr2, 0, m0, k0);
        int j0 = j0(v) + m0;
        return new x33(str, str2, e0(bArr2, j0, m0(j0, bArr2, v), k0));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:129:0x016f, code lost:
        if (r13 == 67) goto L_0x0171;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static defpackage.xo6 a0(int r17, defpackage.yze r18, boolean r19, int r20, defpackage.so6 r21) {
        /*
            r0 = r17
            r7 = r18
            int r8 = r18.v()
            int r9 = r18.v()
            int r10 = r18.v()
            r12 = 3
            if (r0 < r12) goto L_0x0019
            int r1 = r18.v()
            r13 = r1
            goto L_0x001a
        L_0x0019:
            r13 = 0
        L_0x001a:
            r14 = 4
            if (r0 != r14) goto L_0x003c
            int r1 = r18.y()
            if (r19 != 0) goto L_0x003a
            r2 = r1 & 255(0xff, float:3.57E-43)
            int r3 = r1 >> 8
            r3 = r3 & 255(0xff, float:3.57E-43)
            int r3 = r3 << 7
            r2 = r2 | r3
            int r3 = r1 >> 16
            r3 = r3 & 255(0xff, float:3.57E-43)
            int r3 = r3 << 14
            r2 = r2 | r3
            int r1 = r1 >> 24
            r1 = r1 & 255(0xff, float:3.57E-43)
            int r1 = r1 << 21
            r1 = r1 | r2
        L_0x003a:
            r15 = r1
            goto L_0x0048
        L_0x003c:
            if (r0 != r12) goto L_0x0043
            int r1 = r18.y()
            goto L_0x003a
        L_0x0043:
            int r1 = r18.x()
            goto L_0x003a
        L_0x0048:
            if (r0 < r12) goto L_0x0050
            int r1 = r18.A()
            r6 = r1
            goto L_0x0051
        L_0x0050:
            r6 = 0
        L_0x0051:
            r16 = 0
            if (r8 != 0) goto L_0x0065
            if (r9 != 0) goto L_0x0065
            if (r10 != 0) goto L_0x0065
            if (r13 != 0) goto L_0x0065
            if (r15 != 0) goto L_0x0065
            if (r6 != 0) goto L_0x0065
            int r0 = r7.c
            r7.H(r0)
            return r16
        L_0x0065:
            int r1 = r7.b
            int r5 = r1 + r15
            int r1 = r7.c
            if (r5 <= r1) goto L_0x0071
            r7.H(r1)
            return r16
        L_0x0071:
            if (r21 == 0) goto L_0x0087
            r1 = r21
            r2 = r17
            r3 = r8
            r4 = r9
            r11 = r5
            r5 = r10
            r14 = r6
            r6 = r13
            boolean r1 = r1.c(r2, r3, r4, r5, r6)
            if (r1 != 0) goto L_0x0089
            r7.H(r11)
            return r16
        L_0x0087:
            r11 = r5
            r14 = r6
        L_0x0089:
            r1 = 1
            if (r0 != r12) goto L_0x00a4
            r2 = r14 & 128(0x80, float:1.794E-43)
            if (r2 == 0) goto L_0x0092
            r2 = r1
            goto L_0x0093
        L_0x0092:
            r2 = 0
        L_0x0093:
            r3 = r14 & 64
            if (r3 == 0) goto L_0x0099
            r3 = r1
            goto L_0x009a
        L_0x0099:
            r3 = 0
        L_0x009a:
            r4 = r14 & 32
            if (r4 == 0) goto L_0x00a0
            r4 = r1
            goto L_0x00a1
        L_0x00a0:
            r4 = 0
        L_0x00a1:
            r6 = r2
            r5 = 0
            goto L_0x00ce
        L_0x00a4:
            r2 = 4
            if (r0 != r2) goto L_0x00c9
            r2 = r14 & 64
            if (r2 == 0) goto L_0x00ad
            r4 = r1
            goto L_0x00ae
        L_0x00ad:
            r4 = 0
        L_0x00ae:
            r2 = r14 & 8
            if (r2 == 0) goto L_0x00b4
            r2 = r1
            goto L_0x00b5
        L_0x00b4:
            r2 = 0
        L_0x00b5:
            r3 = r14 & 4
            if (r3 == 0) goto L_0x00bb
            r3 = r1
            goto L_0x00bc
        L_0x00bb:
            r3 = 0
        L_0x00bc:
            r5 = r14 & 2
            if (r5 == 0) goto L_0x00c2
            r5 = r1
            goto L_0x00c3
        L_0x00c2:
            r5 = 0
        L_0x00c3:
            r6 = r14 & 1
            if (r6 == 0) goto L_0x00cd
            r6 = r1
            goto L_0x00ce
        L_0x00c9:
            r2 = 0
            r3 = 0
            r4 = 0
            r5 = 0
        L_0x00cd:
            r6 = 0
        L_0x00ce:
            if (r2 != 0) goto L_0x01f4
            if (r3 == 0) goto L_0x00d4
            goto L_0x01f4
        L_0x00d4:
            if (r4 == 0) goto L_0x00db
            int r15 = r15 + -1
            r7.I(r1)
        L_0x00db:
            if (r6 == 0) goto L_0x00e3
            int r15 = r15 + -4
            r1 = 4
            r7.I(r1)
        L_0x00e3:
            if (r5 == 0) goto L_0x00eb
            int r1 = o0(r15, r7)
            r2 = r1
            goto L_0x00ec
        L_0x00eb:
            r2 = r15
        L_0x00ec:
            r1 = 2
            r3 = 84
            r4 = 88
            if (r8 != r3) goto L_0x0104
            if (r9 != r4) goto L_0x0104
            if (r10 != r4) goto L_0x0104
            if (r0 == r1) goto L_0x00fb
            if (r13 != r4) goto L_0x0104
        L_0x00fb:
            nfe r1 = g0(r2, r7)     // Catch:{ UnsupportedEncodingException -> 0x01f0, all -> 0x0101 }
            goto L_0x01d7
        L_0x0101:
            r0 = move-exception
            goto L_0x01ec
        L_0x0104:
            if (r8 != r3) goto L_0x0110
            java.lang.String r1 = l0(r0, r8, r9, r10, r13)     // Catch:{ UnsupportedEncodingException -> 0x01f0, all -> 0x0101 }
            nfe r1 = f0(r2, r7, r1)     // Catch:{ UnsupportedEncodingException -> 0x01f0, all -> 0x0101 }
            goto L_0x01d7
        L_0x0110:
            r5 = 87
            if (r8 != r5) goto L_0x0122
            if (r9 != r4) goto L_0x0122
            if (r10 != r4) goto L_0x0122
            if (r0 == r1) goto L_0x011c
            if (r13 != r4) goto L_0x0122
        L_0x011c:
            iye r1 = i0(r2, r7)     // Catch:{ UnsupportedEncodingException -> 0x01f0, all -> 0x0101 }
            goto L_0x01d7
        L_0x0122:
            if (r8 != r5) goto L_0x012e
            java.lang.String r1 = l0(r0, r8, r9, r10, r13)     // Catch:{ UnsupportedEncodingException -> 0x01f0, all -> 0x0101 }
            iye r1 = h0(r2, r7, r1)     // Catch:{ UnsupportedEncodingException -> 0x01f0, all -> 0x0101 }
            goto L_0x01d7
        L_0x012e:
            r4 = 73
            r5 = 80
            if (r8 != r5) goto L_0x0144
            r6 = 82
            if (r9 != r6) goto L_0x0144
            if (r10 != r4) goto L_0x0144
            r6 = 86
            if (r13 != r6) goto L_0x0144
            y3b r1 = d0(r2, r7)     // Catch:{ UnsupportedEncodingException -> 0x01f0, all -> 0x0101 }
            goto L_0x01d7
        L_0x0144:
            r6 = 71
            r12 = 79
            if (r8 != r6) goto L_0x015c
            r6 = 69
            if (r9 != r6) goto L_0x015c
            if (r10 != r12) goto L_0x015c
            r6 = 66
            if (r13 == r6) goto L_0x0156
            if (r0 != r1) goto L_0x015c
        L_0x0156:
            d76 r1 = b0(r2, r7)     // Catch:{ UnsupportedEncodingException -> 0x01f0, all -> 0x0101 }
            goto L_0x01d7
        L_0x015c:
            r6 = 65
            r14 = 67
            if (r0 != r1) goto L_0x0169
            if (r8 != r5) goto L_0x0177
            if (r9 != r4) goto L_0x0177
            if (r10 != r14) goto L_0x0177
            goto L_0x0171
        L_0x0169:
            if (r8 != r6) goto L_0x0177
            if (r9 != r5) goto L_0x0177
            if (r10 != r4) goto L_0x0177
            if (r13 != r14) goto L_0x0177
        L_0x0171:
            tl r1 = W(r7, r2, r0)     // Catch:{ UnsupportedEncodingException -> 0x01f0, all -> 0x0101 }
            goto L_0x01d7
        L_0x0177:
            r4 = 77
            if (r8 != r14) goto L_0x0188
            if (r9 != r12) goto L_0x0188
            if (r10 != r4) goto L_0x0188
            if (r13 == r4) goto L_0x0183
            if (r0 != r1) goto L_0x0188
        L_0x0183:
            x33 r1 = Z(r2, r7)     // Catch:{ UnsupportedEncodingException -> 0x01f0, all -> 0x0101 }
            goto L_0x01d7
        L_0x0188:
            if (r8 != r14) goto L_0x01a1
            r1 = 72
            if (r9 != r1) goto L_0x01a1
            if (r10 != r6) goto L_0x01a1
            if (r13 != r5) goto L_0x01a1
            r1 = r18
            r3 = r17
            r4 = r19
            r5 = r20
            r6 = r21
            p12 r1 = X(r1, r2, r3, r4, r5, r6)     // Catch:{ UnsupportedEncodingException -> 0x01f0, all -> 0x0101 }
            goto L_0x01d7
        L_0x01a1:
            if (r8 != r14) goto L_0x01b8
            if (r9 != r3) goto L_0x01b8
            if (r10 != r12) goto L_0x01b8
            if (r13 != r14) goto L_0x01b8
            r1 = r18
            r3 = r17
            r4 = r19
            r5 = r20
            r6 = r21
            r12 r1 = Y(r1, r2, r3, r4, r5, r6)     // Catch:{ UnsupportedEncodingException -> 0x01f0, all -> 0x0101 }
            goto L_0x01d7
        L_0x01b8:
            if (r8 != r4) goto L_0x01c7
            r1 = 76
            if (r9 != r1) goto L_0x01c7
            if (r10 != r1) goto L_0x01c7
            if (r13 != r3) goto L_0x01c7
            t59 r1 = c0(r2, r7)     // Catch:{ UnsupportedEncodingException -> 0x01f0, all -> 0x0101 }
            goto L_0x01d7
        L_0x01c7:
            java.lang.String r1 = l0(r0, r8, r9, r10, r13)     // Catch:{ UnsupportedEncodingException -> 0x01f0, all -> 0x0101 }
            byte[] r3 = new byte[r2]     // Catch:{ UnsupportedEncodingException -> 0x01f0, all -> 0x0101 }
            r4 = 0
            r7.g(r4, r3, r2)     // Catch:{ UnsupportedEncodingException -> 0x01f0, all -> 0x0101 }
            bl0 r2 = new bl0     // Catch:{ UnsupportedEncodingException -> 0x01f0, all -> 0x0101 }
            r2.<init>(r3, r1)     // Catch:{ UnsupportedEncodingException -> 0x01f0, all -> 0x0101 }
            r1 = r2
        L_0x01d7:
            if (r1 != 0) goto L_0x01e8
            java.lang.String r0 = l0(r0, r8, r9, r10, r13)     // Catch:{ UnsupportedEncodingException -> 0x01f0, all -> 0x0101 }
            int r0 = r0.length()     // Catch:{ UnsupportedEncodingException -> 0x01f0, all -> 0x0101 }
            int r0 = r0 + 50
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ UnsupportedEncodingException -> 0x01f0, all -> 0x0101 }
            r2.<init>(r0)     // Catch:{ UnsupportedEncodingException -> 0x01f0, all -> 0x0101 }
        L_0x01e8:
            r7.H(r11)
            return r1
        L_0x01ec:
            r7.H(r11)
            throw r0
        L_0x01f0:
            r7.H(r11)
            return r16
        L_0x01f4:
            r7.H(r11)
            return r16
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.vo6.a0(int, yze, boolean, int, so6):xo6");
    }

    public static d76 b0(int i, yze yze) {
        int v = yze.v();
        String k0 = k0(v);
        int i2 = i - 1;
        byte[] bArr = new byte[i2];
        yze.g(0, bArr, i2);
        int n0 = n0(0, bArr);
        String str = new String(bArr, 0, n0, "ISO-8859-1");
        int i3 = n0 + 1;
        int m0 = m0(i3, bArr, v);
        String e0 = e0(bArr, i3, m0, k0);
        int j0 = j0(v) + m0;
        int m02 = m0(j0, bArr, v);
        String e02 = e0(bArr, j0, m02, k0);
        int j02 = j0(v) + m02;
        return new d76(str, i2 <= j02 ? mze.f : Arrays.copyOfRange(bArr, j02, i2), e0, e02);
    }

    public static t59 c0(int i, yze yze) {
        int A = yze.A();
        int x = yze.x();
        int x2 = yze.x();
        int v = yze.v();
        int v2 = yze.v();
        wx1 wx1 = new wx1(1);
        wx1.o(yze.c, yze.a);
        wx1.q(yze.b * 8);
        int i2 = ((i - 10) * 8) / (v + v2);
        int[] iArr = new int[i2];
        int[] iArr2 = new int[i2];
        for (int i3 = 0; i3 < i2; i3++) {
            int i4 = wx1.i(v);
            int i5 = wx1.i(v2);
            iArr[i3] = i4;
            iArr2[i3] = i5;
        }
        return new t59(A, x, x2, iArr, iArr2);
    }

    public static y3b d0(int i, yze yze) {
        byte[] bArr = new byte[i];
        yze.g(0, bArr, i);
        int n0 = n0(0, bArr);
        String str = new String(bArr, 0, n0, "ISO-8859-1");
        int i2 = n0 + 1;
        return new y3b(i <= i2 ? mze.f : Arrays.copyOfRange(bArr, i2, i), str);
    }

    public static String e0(byte[] bArr, int i, int i2, String str) {
        return (i2 <= i || i2 > bArr.length) ? BuildConfig.FLAVOR : new String(bArr, i, i2 - i, str);
    }

    public static nfe f0(int i, yze yze, String str) {
        if (i < 1) {
            return null;
        }
        int v = yze.v();
        String k0 = k0(v);
        int i2 = i - 1;
        byte[] bArr = new byte[i2];
        yze.g(0, bArr, i2);
        return new nfe(str, (String) null, new String(bArr, 0, m0(0, bArr, v), k0));
    }

    public static nfe g0(int i, yze yze) {
        if (i < 1) {
            return null;
        }
        int v = yze.v();
        String k0 = k0(v);
        int i2 = i - 1;
        byte[] bArr = new byte[i2];
        yze.g(0, bArr, i2);
        int m0 = m0(0, bArr, v);
        String str = new String(bArr, 0, m0, k0);
        int j0 = j0(v) + m0;
        return new nfe("TXXX", str, e0(bArr, j0, m0(j0, bArr, v), k0));
    }

    public static iye h0(int i, yze yze, String str) {
        byte[] bArr = new byte[i];
        yze.g(0, bArr, i);
        return new iye(str, (String) null, new String(bArr, 0, n0(0, bArr), "ISO-8859-1"));
    }

    public static iye i0(int i, yze yze) {
        if (i < 1) {
            return null;
        }
        int v = yze.v();
        String k0 = k0(v);
        int i2 = i - 1;
        byte[] bArr = new byte[i2];
        yze.g(0, bArr, i2);
        int m0 = m0(0, bArr, v);
        String str = new String(bArr, 0, m0, k0);
        int j0 = j0(v) + m0;
        return new iye("WXXX", str, e0(bArr, j0, n0(j0, bArr), "ISO-8859-1"));
    }

    public static int j0(int i) {
        return (i == 0 || i == 3) ? 1 : 2;
    }

    public static String k0(int i) {
        return i != 1 ? i != 2 ? i != 3 ? "ISO-8859-1" : "UTF-8" : "UTF-16BE" : "UTF-16";
    }

    public static String l0(int i, int i2, int i3, int i4, int i5) {
        return i == 2 ? String.format(Locale.US, "%c%c%c", new Object[]{Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4)}) : String.format(Locale.US, "%c%c%c%c", new Object[]{Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4), Integer.valueOf(i5)});
    }

    public static int m0(int i, byte[] bArr, int i2) {
        int n0 = n0(i, bArr);
        if (i2 == 0 || i2 == 3) {
            return n0;
        }
        while (n0 < bArr.length - 1) {
            if ((n0 - i) % 2 == 0 && bArr[n0 + 1] == 0) {
                return n0;
            }
            n0 = n0(n0 + 1, bArr);
        }
        return bArr.length;
    }

    public static int n0(int i, byte[] bArr) {
        while (i < bArr.length) {
            if (bArr[i] == 0) {
                return i;
            }
            i++;
        }
        return bArr.length;
    }

    public static int o0(int i, yze yze) {
        byte[] bArr = yze.a;
        int i2 = yze.b;
        int i3 = i2;
        while (true) {
            int i4 = i3 + 1;
            if (i4 >= i2 + i) {
                return i;
            }
            if ((bArr[i3] & 255) == 255 && bArr[i4] == 0) {
                System.arraycopy(bArr, i3 + 2, bArr, i4, (i - (i3 - i2)) - 2);
                i--;
            }
            i3 = i4;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:32:0x0077, code lost:
        if ((r10 & 1) != 0) goto L_0x008c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x0087, code lost:
        if ((r10 & 128) != 0) goto L_0x008c;
     */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x008e  */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x0099 A[SYNTHETIC, Splitter:B:48:0x0099] */
    /* JADX WARNING: Removed duplicated region for block: B:63:0x0095 A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean p0(defpackage.yze r18, int r19, int r20, boolean r21) {
        /*
            r1 = r18
            r0 = r19
            int r2 = r1.b
        L_0x0006:
            int r3 = r18.c()     // Catch:{ all -> 0x0020 }
            r4 = 1
            r5 = r20
            if (r3 < r5) goto L_0x00ac
            r3 = 3
            r6 = 0
            if (r0 < r3) goto L_0x0023
            int r7 = r18.h()     // Catch:{ all -> 0x0020 }
            long r8 = r18.w()     // Catch:{ all -> 0x0020 }
            int r10 = r18.A()     // Catch:{ all -> 0x0020 }
            goto L_0x002d
        L_0x0020:
            r0 = move-exception
            goto L_0x00b0
        L_0x0023:
            int r7 = r18.x()     // Catch:{ all -> 0x0020 }
            int r8 = r18.x()     // Catch:{ all -> 0x0020 }
            long r8 = (long) r8
            r10 = r6
        L_0x002d:
            r11 = 0
            if (r7 != 0) goto L_0x003b
            int r7 = (r8 > r11 ? 1 : (r8 == r11 ? 0 : -1))
            if (r7 != 0) goto L_0x003b
            if (r10 != 0) goto L_0x003b
            r1.H(r2)
            return r4
        L_0x003b:
            r7 = 4
            if (r0 != r7) goto L_0x006c
            if (r21 != 0) goto L_0x006c
            r13 = 8421504(0x808080, double:4.160776E-317)
            long r13 = r13 & r8
            int r11 = (r13 > r11 ? 1 : (r13 == r11 ? 0 : -1))
            if (r11 == 0) goto L_0x004c
            r1.H(r2)
            return r6
        L_0x004c:
            r11 = 255(0xff, double:1.26E-321)
            long r13 = r8 & r11
            r15 = 8
            long r15 = r8 >> r15
            long r15 = r15 & r11
            r17 = 7
            long r15 = r15 << r17
            long r13 = r13 | r15
            r15 = 16
            long r15 = r8 >> r15
            long r15 = r15 & r11
            r17 = 14
            long r15 = r15 << r17
            long r13 = r13 | r15
            r15 = 24
            long r8 = r8 >> r15
            long r8 = r8 & r11
            r11 = 21
            long r8 = r8 << r11
            long r8 = r8 | r13
        L_0x006c:
            if (r0 != r7) goto L_0x007c
            r3 = r10 & 64
            if (r3 == 0) goto L_0x0074
            r3 = r4
            goto L_0x0075
        L_0x0074:
            r3 = r6
        L_0x0075:
            r7 = r10 & 1
            if (r7 == 0) goto L_0x007a
            goto L_0x008c
        L_0x007a:
            r4 = r6
            goto L_0x008c
        L_0x007c:
            if (r0 != r3) goto L_0x008a
            r3 = r10 & 32
            if (r3 == 0) goto L_0x0084
            r3 = r4
            goto L_0x0085
        L_0x0084:
            r3 = r6
        L_0x0085:
            r7 = r10 & 128(0x80, float:1.794E-43)
            if (r7 == 0) goto L_0x007a
            goto L_0x008c
        L_0x008a:
            r3 = r6
            r4 = r3
        L_0x008c:
            if (r4 == 0) goto L_0x0090
            int r3 = r3 + 4
        L_0x0090:
            long r3 = (long) r3
            int r3 = (r8 > r3 ? 1 : (r8 == r3 ? 0 : -1))
            if (r3 >= 0) goto L_0x0099
            r1.H(r2)
            return r6
        L_0x0099:
            int r3 = r18.c()     // Catch:{ all -> 0x0020 }
            long r3 = (long) r3
            int r3 = (r3 > r8 ? 1 : (r3 == r8 ? 0 : -1))
            if (r3 >= 0) goto L_0x00a6
            r1.H(r2)
            return r6
        L_0x00a6:
            int r3 = (int) r8
            r1.I(r3)     // Catch:{ all -> 0x0020 }
            goto L_0x0006
        L_0x00ac:
            r1.H(r2)
            return r4
        L_0x00b0:
            r1.H(r2)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.vo6.p0(yze, int, int, boolean):boolean");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0050, code lost:
        if ((r7 & 64) != 0) goto L_0x0017;
     */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x008a A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x008b  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final defpackage.y29 V(int r12, byte[] r13) {
        /*
            r11 = this;
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            yze r1 = new yze
            r1.<init>((int) r12, (byte[]) r13)
            int r12 = r1.c()
            r13 = 2
            r2 = 10
            r3 = 0
            r4 = 1
            r5 = 0
            r6 = 4
            if (r12 >= r2) goto L_0x001a
        L_0x0017:
            r9 = r5
            goto L_0x0088
        L_0x001a:
            int r12 = r1.x()
            r7 = 4801587(0x494433, float:6.728456E-39)
            if (r12 == r7) goto L_0x003d
            java.lang.Integer r12 = java.lang.Integer.valueOf(r12)
            java.lang.Object[] r12 = new java.lang.Object[]{r12}
            java.lang.String r7 = "%06X"
            java.lang.String r12 = java.lang.String.format(r7, r12)
            int r7 = r12.length()
            if (r7 == 0) goto L_0x0017
            java.lang.String r7 = "Unexpected first three bytes of ID3 tag header: 0x"
            r7.concat(r12)
            goto L_0x0017
        L_0x003d:
            int r12 = r1.v()
            r1.I(r4)
            int r7 = r1.v()
            int r8 = r1.u()
            if (r12 != r13) goto L_0x0053
            r9 = r7 & 64
            if (r9 == 0) goto L_0x007a
            goto L_0x0017
        L_0x0053:
            r9 = 3
            if (r12 != r9) goto L_0x0064
            r9 = r7 & 64
            if (r9 == 0) goto L_0x007a
            int r9 = r1.h()
            r1.I(r9)
            int r9 = r9 + r6
            int r8 = r8 - r9
            goto L_0x007a
        L_0x0064:
            if (r12 != r6) goto L_0x0017
            r9 = r7 & 64
            if (r9 == 0) goto L_0x0074
            int r9 = r1.u()
            int r10 = r9 + -4
            r1.I(r10)
            int r8 = r8 - r9
        L_0x0074:
            r9 = r7 & 16
            if (r9 == 0) goto L_0x007a
            int r8 = r8 + -10
        L_0x007a:
            if (r12 >= r6) goto L_0x0082
            r7 = r7 & 128(0x80, float:1.794E-43)
            if (r7 == 0) goto L_0x0082
            r7 = r4
            goto L_0x0083
        L_0x0082:
            r7 = r3
        L_0x0083:
            uo6 r9 = new uo6
            r9.<init>(r12, r8, r7)
        L_0x0088:
            if (r9 != 0) goto L_0x008b
            return r5
        L_0x008b:
            int r12 = r1.b
            int r7 = r9.a
            if (r7 != r13) goto L_0x0092
            r2 = 6
        L_0x0092:
            int r13 = r9.c
            boolean r8 = r9.b
            if (r8 == 0) goto L_0x009c
            int r13 = o0(r13, r1)
        L_0x009c:
            int r12 = r12 + r13
            r1.G(r12)
            boolean r12 = p0(r1, r7, r2, r3)
            if (r12 != 0) goto L_0x00b1
            if (r7 != r6) goto L_0x00b0
            boolean r12 = p0(r1, r6, r2, r4)
            if (r12 == 0) goto L_0x00b0
            r3 = r4
            goto L_0x00b1
        L_0x00b0:
            return r5
        L_0x00b1:
            int r12 = r1.c()
            if (r12 < r2) goto L_0x00c3
            so6 r12 = r11.E
            xo6 r12 = a0(r7, r1, r3, r2, r12)
            if (r12 == 0) goto L_0x00b1
            r0.add(r12)
            goto L_0x00b1
        L_0x00c3:
            y29 r11 = new y29
            r11.<init>((java.util.List) r0)
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.vo6.V(int, byte[]):y29");
    }

    public final y29 k(e39 e39, ByteBuffer byteBuffer) {
        return V(byteBuffer.limit(), byteBuffer.array());
    }
}

package defpackage;

import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Locale;
import me.leolin.shortcutbadger.BuildConfig;

/* renamed from: wo6  reason: default package */
public final class wo6 extends at7 {
    public static final yc5 C0 = new yc5(24);
    public final to6 B0;

    public wo6(to6 to6) {
        super(17);
        this.B0 = to6;
    }

    public static ul a0(ija ija, int i, int i2) {
        int i3;
        String str;
        int u = ija.u();
        Charset p0 = p0(u);
        int i4 = i - 1;
        byte[] bArr = new byte[i4];
        ija.e(0, bArr, i4);
        if (i2 == 2) {
            str = "image/" + fja.A(new String(bArr, 0, 3, f22.b));
            if ("image/jpg".equals(str)) {
                str = "image/jpeg";
            }
            i3 = 2;
        } else {
            i3 = s0(0, bArr);
            String A = fja.A(new String(bArr, 0, i3, f22.b));
            str = A.indexOf(47) == -1 ? "image/".concat(A) : A;
        }
        byte b = bArr[i3 + 1] & 255;
        int i5 = i3 + 2;
        int r0 = r0(i5, bArr, u);
        String str2 = new String(bArr, i5, r0 - i5, p0);
        int o0 = o0(u) + r0;
        return new ul(str, str2, b, i4 <= o0 ? oze.f : Arrays.copyOfRange(bArr, o0, i4));
    }

    public static q12 b0(ija ija, int i, int i2, boolean z, int i3, to6 to6) {
        ija ija2 = ija;
        int i4 = ija2.b;
        int s0 = s0(i4, ija2.a);
        String str = new String(ija2.a, i4, s0 - i4, f22.b);
        ija.G(s0 + 1);
        int g = ija.g();
        int g2 = ija.g();
        long w = ija.w();
        long j = w == 4294967295L ? -1 : w;
        long w2 = ija.w();
        long j2 = w2 == 4294967295L ? -1 : w2;
        ArrayList arrayList = new ArrayList();
        int i5 = i4 + i;
        while (ija2.b < i5) {
            yo6 e0 = e0(i2, ija, z, i3, to6);
            if (e0 != null) {
                arrayList.add(e0);
            }
        }
        return new q12(str, g, g2, j, j2, (yo6[]) arrayList.toArray(new yo6[0]));
    }

    public static s12 c0(ija ija, int i, int i2, boolean z, int i3, to6 to6) {
        ija ija2 = ija;
        int i4 = ija2.b;
        int s0 = s0(i4, ija2.a);
        String str = new String(ija2.a, i4, s0 - i4, f22.b);
        ija2.G(s0 + 1);
        int u = ija.u();
        boolean z2 = (u & 2) != 0;
        boolean z3 = (u & 1) != 0;
        int u2 = ija.u();
        String[] strArr = new String[u2];
        for (int i5 = 0; i5 < u2; i5++) {
            int i6 = ija2.b;
            int s02 = s0(i6, ija2.a);
            strArr[i5] = new String(ija2.a, i6, s02 - i6, f22.b);
            ija2.G(s02 + 1);
        }
        ArrayList arrayList = new ArrayList();
        int i7 = i4 + i;
        while (ija2.b < i7) {
            yo6 e0 = e0(i2, ija2, z, i3, to6);
            if (e0 != null) {
                arrayList.add(e0);
            }
        }
        return new s12(str, z2, z3, strArr, (yo6[]) arrayList.toArray(new yo6[0]));
    }

    public static y33 d0(int i, ija ija) {
        if (i < 4) {
            return null;
        }
        int u = ija.u();
        Charset p0 = p0(u);
        byte[] bArr = new byte[3];
        ija.e(0, bArr, 3);
        String str = new String(bArr, 0, 3);
        int i2 = i - 4;
        byte[] bArr2 = new byte[i2];
        ija.e(0, bArr2, i2);
        int r0 = r0(0, bArr2, u);
        String str2 = new String(bArr2, 0, r0, p0);
        int o0 = o0(u) + r0;
        return new y33(str, str2, i0(bArr2, o0, r0(o0, bArr2, u), p0));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:131:0x017e, code lost:
        if (r13 == 67) goto L_0x0180;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static defpackage.yo6 e0(int r18, defpackage.ija r19, boolean r20, int r21, defpackage.to6 r22) {
        /*
            r7 = r18
            r8 = r19
            int r9 = r19.u()
            int r10 = r19.u()
            int r11 = r19.u()
            r12 = 3
            if (r7 < r12) goto L_0x0019
            int r1 = r19.u()
            r13 = r1
            goto L_0x001a
        L_0x0019:
            r13 = 0
        L_0x001a:
            r14 = 4
            if (r7 != r14) goto L_0x003c
            int r1 = r19.y()
            if (r20 != 0) goto L_0x003a
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
            if (r7 != r12) goto L_0x0043
            int r1 = r19.y()
            goto L_0x003a
        L_0x0043:
            int r1 = r19.x()
            goto L_0x003a
        L_0x0048:
            if (r7 < r12) goto L_0x0050
            int r1 = r19.A()
            r6 = r1
            goto L_0x0051
        L_0x0050:
            r6 = 0
        L_0x0051:
            r16 = 0
            if (r9 != 0) goto L_0x0065
            if (r10 != 0) goto L_0x0065
            if (r11 != 0) goto L_0x0065
            if (r13 != 0) goto L_0x0065
            if (r15 != 0) goto L_0x0065
            if (r6 != 0) goto L_0x0065
            int r0 = r8.c
            r8.G(r0)
            return r16
        L_0x0065:
            int r1 = r8.b
            int r5 = r1 + r15
            int r1 = r8.c
            if (r5 <= r1) goto L_0x0078
            java.lang.String r0 = "Frame size exceeds remaining tag data"
            defpackage.ez3.j0(r0)
            int r0 = r8.c
            r8.G(r0)
            return r16
        L_0x0078:
            if (r22 == 0) goto L_0x008e
            r1 = r22
            r2 = r18
            r3 = r9
            r4 = r10
            r14 = r5
            r5 = r11
            r0 = r6
            r6 = r13
            boolean r1 = r1.c(r2, r3, r4, r5, r6)
            if (r1 != 0) goto L_0x0090
            r8.G(r14)
            return r16
        L_0x008e:
            r14 = r5
            r0 = r6
        L_0x0090:
            r1 = 1
            if (r7 != r12) goto L_0x00ac
            r2 = r0 & 128(0x80, float:1.794E-43)
            if (r2 == 0) goto L_0x0099
            r2 = r1
            goto L_0x009a
        L_0x0099:
            r2 = 0
        L_0x009a:
            r3 = r0 & 64
            if (r3 == 0) goto L_0x00a0
            r3 = r1
            goto L_0x00a1
        L_0x00a0:
            r3 = 0
        L_0x00a1:
            r0 = r0 & 32
            if (r0 == 0) goto L_0x00a7
            r0 = r1
            goto L_0x00a8
        L_0x00a7:
            r0 = 0
        L_0x00a8:
            r4 = r3
            r5 = 0
            r3 = r2
            goto L_0x00dd
        L_0x00ac:
            r2 = 4
            if (r7 != r2) goto L_0x00d8
            r2 = r0 & 64
            if (r2 == 0) goto L_0x00b5
            r2 = r1
            goto L_0x00b6
        L_0x00b5:
            r2 = 0
        L_0x00b6:
            r3 = r0 & 8
            if (r3 == 0) goto L_0x00bc
            r3 = r1
            goto L_0x00bd
        L_0x00bc:
            r3 = 0
        L_0x00bd:
            r4 = r0 & 4
            if (r4 == 0) goto L_0x00c3
            r4 = r1
            goto L_0x00c4
        L_0x00c3:
            r4 = 0
        L_0x00c4:
            r5 = r0 & 2
            if (r5 == 0) goto L_0x00ca
            r5 = r1
            goto L_0x00cb
        L_0x00ca:
            r5 = 0
        L_0x00cb:
            r0 = r0 & r1
            if (r0 == 0) goto L_0x00d0
            r0 = r1
            goto L_0x00d1
        L_0x00d0:
            r0 = 0
        L_0x00d1:
            r17 = r3
            r3 = r0
            r0 = r2
            r2 = r17
            goto L_0x00dd
        L_0x00d8:
            r0 = 0
            r2 = 0
            r3 = 0
            r4 = 0
            r5 = 0
        L_0x00dd:
            if (r2 != 0) goto L_0x0219
            if (r4 == 0) goto L_0x00e3
            goto L_0x0219
        L_0x00e3:
            if (r0 == 0) goto L_0x00ea
            int r15 = r15 + -1
            r8.H(r1)
        L_0x00ea:
            if (r3 == 0) goto L_0x00f2
            int r15 = r15 + -4
            r0 = 4
            r8.H(r0)
        L_0x00f2:
            if (r5 == 0) goto L_0x00f8
            int r15 = t0(r15, r8)
        L_0x00f8:
            r0 = 2
            r1 = 84
            r2 = 88
            if (r9 != r1) goto L_0x0113
            if (r10 != r2) goto L_0x0113
            if (r11 != r2) goto L_0x0113
            if (r7 == r0) goto L_0x0107
            if (r13 != r2) goto L_0x0113
        L_0x0107:
            ofe r0 = l0(r15, r8)     // Catch:{ Exception | OutOfMemoryError -> 0x0110, all -> 0x010d }
            goto L_0x01e8
        L_0x010d:
            r0 = move-exception
            goto L_0x01f2
        L_0x0110:
            r0 = move-exception
            goto L_0x01f6
        L_0x0113:
            if (r9 != r1) goto L_0x011f
            java.lang.String r0 = q0(r7, r9, r10, r11, r13)     // Catch:{ Exception | OutOfMemoryError -> 0x0110, all -> 0x010d }
            ofe r0 = j0(r15, r8, r0)     // Catch:{ Exception | OutOfMemoryError -> 0x0110, all -> 0x010d }
            goto L_0x01e8
        L_0x011f:
            r3 = 87
            if (r9 != r3) goto L_0x0131
            if (r10 != r2) goto L_0x0131
            if (r11 != r2) goto L_0x0131
            if (r7 == r0) goto L_0x012b
            if (r13 != r2) goto L_0x0131
        L_0x012b:
            jye r0 = n0(r15, r8)     // Catch:{ Exception | OutOfMemoryError -> 0x0110, all -> 0x010d }
            goto L_0x01e8
        L_0x0131:
            if (r9 != r3) goto L_0x013d
            java.lang.String r0 = q0(r7, r9, r10, r11, r13)     // Catch:{ Exception | OutOfMemoryError -> 0x0110, all -> 0x010d }
            jye r0 = m0(r15, r8, r0)     // Catch:{ Exception | OutOfMemoryError -> 0x0110, all -> 0x010d }
            goto L_0x01e8
        L_0x013d:
            r2 = 73
            r3 = 80
            if (r9 != r3) goto L_0x0153
            r4 = 82
            if (r10 != r4) goto L_0x0153
            if (r11 != r2) goto L_0x0153
            r4 = 86
            if (r13 != r4) goto L_0x0153
            z3b r0 = h0(r15, r8)     // Catch:{ Exception | OutOfMemoryError -> 0x0110, all -> 0x010d }
            goto L_0x01e8
        L_0x0153:
            r4 = 71
            r5 = 79
            if (r9 != r4) goto L_0x016b
            r4 = 69
            if (r10 != r4) goto L_0x016b
            if (r11 != r5) goto L_0x016b
            r4 = 66
            if (r13 == r4) goto L_0x0165
            if (r7 != r0) goto L_0x016b
        L_0x0165:
            e76 r0 = f0(r15, r8)     // Catch:{ Exception | OutOfMemoryError -> 0x0110, all -> 0x010d }
            goto L_0x01e8
        L_0x016b:
            r4 = 65
            r6 = 67
            if (r7 != r0) goto L_0x0178
            if (r9 != r3) goto L_0x0186
            if (r10 != r2) goto L_0x0186
            if (r11 != r6) goto L_0x0186
            goto L_0x0180
        L_0x0178:
            if (r9 != r4) goto L_0x0186
            if (r10 != r3) goto L_0x0186
            if (r11 != r2) goto L_0x0186
            if (r13 != r6) goto L_0x0186
        L_0x0180:
            ul r0 = a0(r8, r15, r7)     // Catch:{ Exception | OutOfMemoryError -> 0x0110, all -> 0x010d }
            goto L_0x01e8
        L_0x0186:
            r2 = 77
            if (r9 != r6) goto L_0x0197
            if (r10 != r5) goto L_0x0197
            if (r11 != r2) goto L_0x0197
            if (r13 == r2) goto L_0x0192
            if (r7 != r0) goto L_0x0197
        L_0x0192:
            y33 r0 = d0(r15, r8)     // Catch:{ Exception | OutOfMemoryError -> 0x0110, all -> 0x010d }
            goto L_0x01e8
        L_0x0197:
            if (r9 != r6) goto L_0x01b1
            r0 = 72
            if (r10 != r0) goto L_0x01b1
            if (r11 != r4) goto L_0x01b1
            if (r13 != r3) goto L_0x01b1
            r1 = r19
            r2 = r15
            r3 = r18
            r4 = r20
            r5 = r21
            r6 = r22
            q12 r0 = b0(r1, r2, r3, r4, r5, r6)     // Catch:{ Exception | OutOfMemoryError -> 0x0110, all -> 0x010d }
            goto L_0x01e8
        L_0x01b1:
            if (r9 != r6) goto L_0x01c9
            if (r10 != r1) goto L_0x01c9
            if (r11 != r5) goto L_0x01c9
            if (r13 != r6) goto L_0x01c9
            r1 = r19
            r2 = r15
            r3 = r18
            r4 = r20
            r5 = r21
            r6 = r22
            s12 r0 = c0(r1, r2, r3, r4, r5, r6)     // Catch:{ Exception | OutOfMemoryError -> 0x0110, all -> 0x010d }
            goto L_0x01e8
        L_0x01c9:
            if (r9 != r2) goto L_0x01d8
            r0 = 76
            if (r10 != r0) goto L_0x01d8
            if (r11 != r0) goto L_0x01d8
            if (r13 != r1) goto L_0x01d8
            u59 r0 = g0(r15, r8)     // Catch:{ Exception | OutOfMemoryError -> 0x0110, all -> 0x010d }
            goto L_0x01e8
        L_0x01d8:
            java.lang.String r0 = q0(r7, r9, r10, r11, r13)     // Catch:{ Exception | OutOfMemoryError -> 0x0110, all -> 0x010d }
            byte[] r1 = new byte[r15]     // Catch:{ Exception | OutOfMemoryError -> 0x0110, all -> 0x010d }
            r2 = 0
            r8.e(r2, r1, r15)     // Catch:{ Exception | OutOfMemoryError -> 0x0110, all -> 0x010d }
            cl0 r2 = new cl0     // Catch:{ Exception | OutOfMemoryError -> 0x0110, all -> 0x010d }
            r2.<init>(r1, r0)     // Catch:{ Exception | OutOfMemoryError -> 0x0110, all -> 0x010d }
            r0 = r2
        L_0x01e8:
            r8.G(r14)
            r17 = r16
            r16 = r0
            r0 = r17
            goto L_0x01f9
        L_0x01f2:
            r8.G(r14)
            throw r0
        L_0x01f6:
            r8.G(r14)
        L_0x01f9:
            if (r16 != 0) goto L_0x0218
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "Failed to decode frame: id="
            r1.<init>(r2)
            java.lang.String r2 = q0(r7, r9, r10, r11, r13)
            r1.append(r2)
            java.lang.String r2 = ", frameSize="
            r1.append(r2)
            r1.append(r15)
            java.lang.String r1 = r1.toString()
            defpackage.ez3.k0(r1, r0)
        L_0x0218:
            return r16
        L_0x0219:
            java.lang.String r0 = "Skipping unsupported compressed or encrypted frame"
            defpackage.ez3.j0(r0)
            r8.G(r14)
            return r16
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.wo6.e0(int, ija, boolean, int, to6):yo6");
    }

    public static e76 f0(int i, ija ija) {
        int u = ija.u();
        Charset p0 = p0(u);
        int i2 = i - 1;
        byte[] bArr = new byte[i2];
        ija.e(0, bArr, i2);
        int s0 = s0(0, bArr);
        String l = c49.l(new String(bArr, 0, s0, f22.b));
        int i3 = s0 + 1;
        int r0 = r0(i3, bArr, u);
        String i0 = i0(bArr, i3, r0, p0);
        int o0 = o0(u) + r0;
        int r02 = r0(o0, bArr, u);
        String i02 = i0(bArr, o0, r02, p0);
        int o02 = o0(u) + r02;
        return new e76(l, i2 <= o02 ? oze.f : Arrays.copyOfRange(bArr, o02, i2), i0, i02);
    }

    public static u59 g0(int i, ija ija) {
        int A = ija.A();
        int x = ija.x();
        int x2 = ija.x();
        int u = ija.u();
        int u2 = ija.u();
        wx1 wx1 = new wx1(2);
        wx1.p(ija);
        int i2 = ((i - 10) * 8) / (u + u2);
        int[] iArr = new int[i2];
        int[] iArr2 = new int[i2];
        for (int i3 = 0; i3 < i2; i3++) {
            int i4 = wx1.i(u);
            int i5 = wx1.i(u2);
            iArr[i3] = i4;
            iArr2[i3] = i5;
        }
        return new u59(A, x, x2, iArr, iArr2);
    }

    public static z3b h0(int i, ija ija) {
        byte[] bArr = new byte[i];
        ija.e(0, bArr, i);
        int s0 = s0(0, bArr);
        String str = new String(bArr, 0, s0, f22.b);
        int i2 = s0 + 1;
        return new z3b(i <= i2 ? oze.f : Arrays.copyOfRange(bArr, i2, i), str);
    }

    public static String i0(byte[] bArr, int i, int i2, Charset charset) {
        return (i2 <= i || i2 > bArr.length) ? BuildConfig.FLAVOR : new String(bArr, i, i2 - i, charset);
    }

    public static ofe j0(int i, ija ija, String str) {
        if (i < 1) {
            return null;
        }
        int u = ija.u();
        int i2 = i - 1;
        byte[] bArr = new byte[i2];
        ija.e(0, bArr, i2);
        return new ofe(str, (String) null, k0(u, bArr, 0));
    }

    public static e8c k0(int i, byte[] bArr, int i2) {
        if (i2 >= bArr.length) {
            return ws6.n(BuildConfig.FLAVOR);
        }
        ts6 i3 = ws6.i();
        int r0 = r0(i2, bArr, i);
        while (i2 < r0) {
            i3.a(new String(bArr, i2, r0 - i2, p0(i)));
            i2 = o0(i) + r0;
            r0 = r0(i2, bArr, i);
        }
        e8c j = i3.j();
        return j.isEmpty() ? ws6.n(BuildConfig.FLAVOR) : j;
    }

    public static ofe l0(int i, ija ija) {
        if (i < 1) {
            return null;
        }
        int u = ija.u();
        int i2 = i - 1;
        byte[] bArr = new byte[i2];
        ija.e(0, bArr, i2);
        int r0 = r0(0, bArr, u);
        return new ofe("TXXX", new String(bArr, 0, r0, p0(u)), k0(u, bArr, o0(u) + r0));
    }

    public static jye m0(int i, ija ija, String str) {
        byte[] bArr = new byte[i];
        ija.e(0, bArr, i);
        return new jye(str, (String) null, new String(bArr, 0, s0(0, bArr), f22.b));
    }

    public static jye n0(int i, ija ija) {
        if (i < 1) {
            return null;
        }
        int u = ija.u();
        int i2 = i - 1;
        byte[] bArr = new byte[i2];
        ija.e(0, bArr, i2);
        int r0 = r0(0, bArr, u);
        String str = new String(bArr, 0, r0, p0(u));
        int o0 = o0(u) + r0;
        return new jye("WXXX", str, i0(bArr, o0, s0(o0, bArr), f22.b));
    }

    public static int o0(int i) {
        return (i == 0 || i == 3) ? 1 : 2;
    }

    public static Charset p0(int i) {
        return i != 1 ? i != 2 ? i != 3 ? f22.b : f22.c : f22.d : f22.f;
    }

    public static String q0(int i, int i2, int i3, int i4, int i5) {
        return i == 2 ? String.format(Locale.US, "%c%c%c", new Object[]{Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4)}) : String.format(Locale.US, "%c%c%c%c", new Object[]{Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4), Integer.valueOf(i5)});
    }

    public static int r0(int i, byte[] bArr, int i2) {
        int s0 = s0(i, bArr);
        if (i2 == 0 || i2 == 3) {
            return s0;
        }
        while (s0 < bArr.length - 1) {
            if ((s0 - i) % 2 == 0 && bArr[s0 + 1] == 0) {
                return s0;
            }
            s0 = s0(s0 + 1, bArr);
        }
        return bArr.length;
    }

    public static int s0(int i, byte[] bArr) {
        while (i < bArr.length) {
            if (bArr[i] == 0) {
                return i;
            }
            i++;
        }
        return bArr.length;
    }

    public static int t0(int i, ija ija) {
        byte[] bArr = ija.a;
        int i2 = ija.b;
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
    public static boolean u0(defpackage.ija r18, int r19, int r20, boolean r21) {
        /*
            r1 = r18
            r0 = r19
            int r2 = r1.b
        L_0x0006:
            int r3 = r18.a()     // Catch:{ all -> 0x0020 }
            r4 = 1
            r5 = r20
            if (r3 < r5) goto L_0x00ac
            r3 = 3
            r6 = 0
            if (r0 < r3) goto L_0x0023
            int r7 = r18.g()     // Catch:{ all -> 0x0020 }
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
            r1.G(r2)
            return r4
        L_0x003b:
            r7 = 4
            if (r0 != r7) goto L_0x006c
            if (r21 != 0) goto L_0x006c
            r13 = 8421504(0x808080, double:4.160776E-317)
            long r13 = r13 & r8
            int r11 = (r13 > r11 ? 1 : (r13 == r11 ? 0 : -1))
            if (r11 == 0) goto L_0x004c
            r1.G(r2)
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
            r1.G(r2)
            return r6
        L_0x0099:
            int r3 = r18.a()     // Catch:{ all -> 0x0020 }
            long r3 = (long) r3
            int r3 = (r3 > r8 ? 1 : (r3 == r8 ? 0 : -1))
            if (r3 >= 0) goto L_0x00a6
            r1.G(r2)
            return r6
        L_0x00a6:
            int r3 = (int) r8
            r1.H(r3)     // Catch:{ all -> 0x0020 }
            goto L_0x0006
        L_0x00ac:
            r1.G(r2)
            return r4
        L_0x00b0:
            r1.G(r2)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.wo6.u0(ija, int, int, boolean):boolean");
    }

    /* JADX WARNING: Removed duplicated region for block: B:32:0x0099 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x009a  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final defpackage.a39 Z(int r12, byte[] r13) {
        /*
            r11 = this;
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            ija r1 = new ija
            r1.<init>(r12, r13)
            int r12 = r1.a()
            r13 = 4
            r2 = 2
            r3 = 10
            r4 = 0
            r5 = 1
            r6 = 0
            if (r12 >= r3) goto L_0x001f
            java.lang.String r12 = "Data too short to be an ID3 tag"
            defpackage.ez3.j0(r12)
        L_0x001c:
            r9 = r6
            goto L_0x0097
        L_0x001f:
            int r12 = r1.x()
            r7 = 4801587(0x494433, float:6.728456E-39)
            if (r12 == r7) goto L_0x0040
            java.lang.Integer r12 = java.lang.Integer.valueOf(r12)
            java.lang.Object[] r12 = new java.lang.Object[]{r12}
            java.lang.String r7 = "%06X"
            java.lang.String r12 = java.lang.String.format(r7, r12)
            java.lang.String r7 = "Unexpected first three bytes of ID3 tag header: 0x"
            java.lang.String r12 = r7.concat(r12)
            defpackage.ez3.j0(r12)
            goto L_0x001c
        L_0x0040:
            int r12 = r1.u()
            r1.H(r5)
            int r7 = r1.u()
            int r8 = r1.t()
            if (r12 != r2) goto L_0x005b
            r9 = r7 & 64
            if (r9 == 0) goto L_0x0082
            java.lang.String r12 = "Skipped ID3 tag with majorVersion=2 and undefined compression scheme"
            defpackage.ez3.j0(r12)
            goto L_0x001c
        L_0x005b:
            r9 = 3
            if (r12 != r9) goto L_0x006c
            r9 = r7 & 64
            if (r9 == 0) goto L_0x0082
            int r9 = r1.g()
            r1.H(r9)
            int r9 = r9 + r13
            int r8 = r8 - r9
            goto L_0x0082
        L_0x006c:
            if (r12 != r13) goto L_0x0091
            r9 = r7 & 64
            if (r9 == 0) goto L_0x007c
            int r9 = r1.t()
            int r10 = r9 + -4
            r1.H(r10)
            int r8 = r8 - r9
        L_0x007c:
            r9 = r7 & 16
            if (r9 == 0) goto L_0x0082
            int r8 = r8 + -10
        L_0x0082:
            if (r12 >= r13) goto L_0x008a
            r7 = r7 & 128(0x80, float:1.794E-43)
            if (r7 == 0) goto L_0x008a
            r7 = r5
            goto L_0x008b
        L_0x008a:
            r7 = r4
        L_0x008b:
            uo6 r9 = new uo6
            r9.<init>(r12, r8, r7)
            goto L_0x0097
        L_0x0091:
            java.lang.String r7 = "Skipped ID3 tag with unsupported majorVersion="
            us8.l(r12, r7)
            goto L_0x001c
        L_0x0097:
            if (r9 != 0) goto L_0x009a
            return r6
        L_0x009a:
            int r12 = r1.b
            int r7 = r9.a
            if (r7 != r2) goto L_0x00a1
            r3 = 6
        L_0x00a1:
            boolean r2 = r9.b
            int r8 = r9.c
            if (r2 == 0) goto L_0x00ab
            int r8 = t0(r8, r1)
        L_0x00ab:
            int r12 = r12 + r8
            r1.F(r12)
            boolean r12 = u0(r1, r7, r3, r4)
            if (r12 != 0) goto L_0x00c5
            if (r7 != r13) goto L_0x00bf
            boolean r12 = u0(r1, r13, r3, r5)
            if (r12 == 0) goto L_0x00bf
            r4 = r5
            goto L_0x00c5
        L_0x00bf:
            java.lang.String r11 = "Failed to validate ID3 tag with majorVersion="
            us8.l(r7, r11)
            return r6
        L_0x00c5:
            int r12 = r1.a()
            if (r12 < r3) goto L_0x00d7
            to6 r12 = r11.B0
            yo6 r12 = e0(r7, r1, r4, r3, r12)
            if (r12 == 0) goto L_0x00c5
            r0.add(r12)
            goto L_0x00c5
        L_0x00d7:
            a39 r11 = new a39
            r11.<init>((java.util.List) r0)
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.wo6.Z(int, byte[]):a39");
    }

    public final a39 m(f39 f39, ByteBuffer byteBuffer) {
        return Z(byteBuffer.limit(), byteBuffer.array());
    }
}

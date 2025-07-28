package defpackage;

import android.graphics.ColorSpace;
import java.io.Closeable;
import java.io.InputStream;
import me.leolin.shortcutbadger.BuildConfig;

/* renamed from: ax4  reason: default package */
public final class ax4 implements Closeable {
    public int X = 0;
    public int Y = -1;
    public int Z = -1;
    public final e13 a;
    public final o3e b;
    public lq6 c = lq6.c;
    public int o = -1;
    public int w0 = 1;
    public int x0 = -1;
    public ColorSpace y0;
    public String z0;

    public ax4(e13 e13) {
        if (e13.n0(e13)) {
            this.a = e13.m();
            this.b = null;
            return;
        }
        throw new IllegalArgumentException();
    }

    public static boolean U(ax4 ax4) {
        return ax4.o >= 0 && ax4.Y >= 0 && ax4.Z >= 0;
    }

    public static ax4 a(ax4 ax4) {
        ax4 ax42 = null;
        if (ax4 != null) {
            o3e o3e = ax4.b;
            if (o3e != null) {
                ax42 = new ax4(o3e, ax4.x0);
            } else {
                e13 o2 = e13.o(ax4.a);
                if (o2 != null) {
                    try {
                        ax42 = new ax4(o2);
                    } catch (Throwable th) {
                        e13.S(o2);
                        throw th;
                    }
                }
                e13.S(o2);
            }
            if (ax42 != null) {
                ax42.g(ax4);
            }
        }
        return ax42;
    }

    public static void d(ax4 ax4) {
        if (ax4 != null) {
            ax4.close();
        }
    }

    public static boolean m0(ax4 ax4) {
        return ax4 != null && ax4.e0();
    }

    /* JADX WARNING: type inference failed for: r5v1 */
    /* JADX WARNING: type inference failed for: r5v25 */
    /* JADX WARNING: type inference failed for: r5v26, types: [wia] */
    /* JADX WARNING: type inference failed for: r5v27 */
    /* JADX WARNING: type inference failed for: r5v30 */
    /* JADX WARNING: type inference failed for: r5v32, types: [java.io.InputStream] */
    /* JADX WARNING: type inference failed for: r5v34 */
    /* JADX WARNING: type inference failed for: r5v35 */
    /* JADX WARNING: type inference failed for: r5v36 */
    /* JADX WARNING: type inference failed for: r5v37 */
    /* JADX WARNING: type inference failed for: r5v38 */
    /* JADX WARNING: type inference failed for: r5v39 */
    /* JADX WARNING: type inference failed for: r5v40 */
    /* JADX WARNING: type inference failed for: r5v41 */
    /* JADX WARNING: type inference failed for: r5v42 */
    /* JADX WARNING: Failed to insert additional move for type inference */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:140:0x01f0 A[Catch:{ IOException -> 0x0237 }] */
    /* JADX WARNING: Removed duplicated region for block: B:89:0x014d  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void S() {
        /*
            r15 = this;
            r0 = 2
            r1 = -1
            r2 = 8
            r3 = 1
            java.io.InputStream r4 = r15.n()
            t97 r5 = defpackage.mq6.d
            r5 = 0
            lq6 r4 = defpackage.xy6.r(r4)     // Catch:{ IOException -> 0x0295 }
            r15.c = r4
            lq6 r6 = defpackage.o84.f
            r7 = 0
            if (r4 == r6) goto L_0x0026
            lq6 r6 = defpackage.o84.g
            if (r4 == r6) goto L_0x0026
            lq6 r6 = defpackage.o84.h
            if (r4 == r6) goto L_0x0026
            lq6 r6 = defpackage.o84.i
            if (r4 != r6) goto L_0x0024
            goto L_0x0026
        L_0x0024:
            r6 = r7
            goto L_0x0027
        L_0x0026:
            r6 = r3
        L_0x0027:
            r8 = 255(0xff, float:3.57E-43)
            r9 = 4
            if (r6 != 0) goto L_0x0067
            lq6 r6 = defpackage.o84.j
            if (r4 != r6) goto L_0x0031
            goto L_0x0067
        L_0x0031:
            java.io.InputStream r5 = r15.n()     // Catch:{ all -> 0x005a }
            afc r6 = defpackage.mn0.a(r5)     // Catch:{ all -> 0x005a }
            java.lang.Object r10 = r6.a     // Catch:{ all -> 0x005a }
            android.graphics.ColorSpace r10 = (android.graphics.ColorSpace) r10     // Catch:{ all -> 0x005a }
            r15.y0 = r10     // Catch:{ all -> 0x005a }
            java.lang.Object r6 = r6.b
            wia r6 = (defpackage.wia) r6
            if (r6 == 0) goto L_0x005c
            java.lang.Object r10 = r6.a     // Catch:{ all -> 0x005a }
            java.lang.Integer r10 = (java.lang.Integer) r10     // Catch:{ all -> 0x005a }
            int r10 = r10.intValue()     // Catch:{ all -> 0x005a }
            r15.Y = r10     // Catch:{ all -> 0x005a }
            java.lang.Object r10 = r6.b     // Catch:{ all -> 0x005a }
            java.lang.Integer r10 = (java.lang.Integer) r10     // Catch:{ all -> 0x005a }
            int r10 = r10.intValue()     // Catch:{ all -> 0x005a }
            r15.Z = r10     // Catch:{ all -> 0x005a }
            goto L_0x005c
        L_0x005a:
            r15 = move-exception
            goto L_0x0061
        L_0x005c:
            r5.close()     // Catch:{ IOException -> 0x0162 }
            goto L_0x0162
        L_0x0061:
            if (r5 == 0) goto L_0x0066
            r5.close()     // Catch:{ IOException -> 0x0066 }
        L_0x0066:
            throw r15
        L_0x0067:
            java.io.InputStream r6 = r15.n()
            if (r6 != 0) goto L_0x006f
            goto L_0x0161
        L_0x006f:
            byte[] r10 = new byte[r9]
            r6.read(r10)     // Catch:{ IOException -> 0x011e }
            java.lang.String r11 = "RIFF"
            boolean r11 = ct0.f(r10, r11)     // Catch:{ IOException -> 0x011e }
            if (r11 != 0) goto L_0x0087
            r6.close()     // Catch:{ IOException -> 0x0081 }
            goto L_0x014b
        L_0x0081:
            r6 = move-exception
            r6.printStackTrace()
            goto L_0x014b
        L_0x0087:
            ct0.o(r6)     // Catch:{ IOException -> 0x011e }
            r6.read(r10)     // Catch:{ IOException -> 0x011e }
            java.lang.String r11 = "WEBP"
            boolean r11 = ct0.f(r10, r11)     // Catch:{ IOException -> 0x011e }
            if (r11 != 0) goto L_0x009a
            r6.close()     // Catch:{ IOException -> 0x0081 }
            goto L_0x014b
        L_0x009a:
            r6.read(r10)     // Catch:{ IOException -> 0x011e }
            java.lang.StringBuilder r11 = new java.lang.StringBuilder     // Catch:{ IOException -> 0x011e }
            r11.<init>()     // Catch:{ IOException -> 0x011e }
            r12 = r7
        L_0x00a3:
            if (r12 >= r9) goto L_0x00b2
            byte r13 = r10[r12]     // Catch:{ IOException -> 0x011e }
            short r13 = (short) r13     // Catch:{ IOException -> 0x011e }
            r14 = 65535(0xffff, float:9.1834E-41)
            r13 = r13 & r14
            char r13 = (char) r13     // Catch:{ IOException -> 0x011e }
            r11.append(r13)     // Catch:{ IOException -> 0x011e }
            int r12 = r12 + r3
            goto L_0x00a3
        L_0x00b2:
            java.lang.String r10 = r11.toString()     // Catch:{ IOException -> 0x011e }
            int r11 = r10.hashCode()     // Catch:{ IOException -> 0x011e }
            r12 = 2640674(0x284b22, float:3.700372E-39)
            if (r11 == r12) goto L_0x0131
            r12 = 2640718(0x284b4e, float:3.700434E-39)
            if (r11 == r12) goto L_0x0120
            r12 = 2640730(0x284b5a, float:3.700451E-39)
            if (r11 == r12) goto L_0x00cb
            goto L_0x0141
        L_0x00cb:
            java.lang.String r11 = "VP8X"
            boolean r10 = r10.equals(r11)     // Catch:{ IOException -> 0x011e }
            if (r10 != 0) goto L_0x00d5
            goto L_0x0141
        L_0x00d5:
            r10 = 8
            r6.skip(r10)     // Catch:{ IOException -> 0x011e }
            wia r10 = new wia     // Catch:{ IOException -> 0x011e }
            int r11 = r6.read()     // Catch:{ IOException -> 0x011e }
            r11 = r11 & r8
            int r12 = r6.read()     // Catch:{ IOException -> 0x011e }
            r12 = r12 & r8
            int r13 = r6.read()     // Catch:{ IOException -> 0x011e }
            r13 = r13 & r8
            int r13 = r13 << 16
            int r12 = r12 << r2
            r12 = r12 | r13
            r11 = r11 | r12
            int r11 = r11 + r3
            java.lang.Integer r11 = java.lang.Integer.valueOf(r11)     // Catch:{ IOException -> 0x011e }
            int r12 = r6.read()     // Catch:{ IOException -> 0x011e }
            r12 = r12 & r8
            int r13 = r6.read()     // Catch:{ IOException -> 0x011e }
            r13 = r13 & r8
            int r14 = r6.read()     // Catch:{ IOException -> 0x011e }
            r14 = r14 & r8
            int r14 = r14 << 16
            int r13 = r13 << r2
            r13 = r13 | r14
            r12 = r12 | r13
            int r12 = r12 + r3
            java.lang.Integer r12 = java.lang.Integer.valueOf(r12)     // Catch:{ IOException -> 0x011e }
            r10.<init>(r11, r12)     // Catch:{ IOException -> 0x011e }
            r6.close()     // Catch:{ IOException -> 0x0115 }
            goto L_0x0119
        L_0x0115:
            r5 = move-exception
            r5.printStackTrace()
        L_0x0119:
            r5 = r10
            goto L_0x014b
        L_0x011b:
            r15 = move-exception
            goto L_0x028c
        L_0x011e:
            r10 = move-exception
            goto L_0x0145
        L_0x0120:
            java.lang.String r11 = "VP8L"
            boolean r10 = r10.equals(r11)     // Catch:{ IOException -> 0x011e }
            if (r10 != 0) goto L_0x0129
            goto L_0x0141
        L_0x0129:
            wia r5 = ct0.u(r6)     // Catch:{ IOException -> 0x011e }
            r6.close()     // Catch:{ IOException -> 0x0081 }
            goto L_0x014b
        L_0x0131:
            java.lang.String r11 = "VP8 "
            boolean r10 = r10.equals(r11)     // Catch:{ IOException -> 0x011e }
            if (r10 == 0) goto L_0x0141
            wia r5 = ct0.t(r6)     // Catch:{ IOException -> 0x011e }
            r6.close()     // Catch:{ IOException -> 0x0081 }
            goto L_0x014b
        L_0x0141:
            r6.close()     // Catch:{ IOException -> 0x0081 }
            goto L_0x014b
        L_0x0145:
            r10.printStackTrace()     // Catch:{ all -> 0x011b }
            r6.close()     // Catch:{ IOException -> 0x0081 }
        L_0x014b:
            if (r5 == 0) goto L_0x0161
            java.lang.Object r6 = r5.a
            java.lang.Integer r6 = (java.lang.Integer) r6
            int r6 = r6.intValue()
            r15.Y = r6
            java.lang.Object r6 = r5.b
            java.lang.Integer r6 = (java.lang.Integer) r6
            int r6 = r6.intValue()
            r15.Z = r6
        L_0x0161:
            r6 = r5
        L_0x0162:
            lq6 r5 = defpackage.o84.a
            r10 = 3
            if (r4 != r5) goto L_0x0240
            int r5 = r15.o
            if (r5 != r1) goto L_0x0240
            if (r6 == 0) goto L_0x028b
            java.io.InputStream r4 = r15.n()
        L_0x0171:
            int r5 = defpackage.vx3.H(r4, r3, r7)     // Catch:{ IOException -> 0x0237 }
            if (r5 != r8) goto L_0x01b5
            r5 = r8
        L_0x0178:
            if (r5 != r8) goto L_0x017f
            int r5 = defpackage.vx3.H(r4, r3, r7)     // Catch:{ IOException -> 0x0237 }
            goto L_0x0178
        L_0x017f:
            r6 = 225(0xe1, float:3.15E-43)
            if (r5 != r6) goto L_0x019d
            int r5 = defpackage.vx3.H(r4, r0, r7)     // Catch:{ IOException -> 0x0237 }
            int r6 = r5 + -2
            r8 = 6
            if (r6 <= r8) goto L_0x01b5
            int r6 = defpackage.vx3.H(r4, r9, r7)     // Catch:{ IOException -> 0x0237 }
            int r8 = defpackage.vx3.H(r4, r0, r7)     // Catch:{ IOException -> 0x0237 }
            int r5 = r5 - r2
            r11 = 1165519206(0x45786966, float:3974.5874)
            if (r6 != r11) goto L_0x01b5
            if (r8 != 0) goto L_0x01b5
            goto L_0x01b6
        L_0x019d:
            if (r5 == r3) goto L_0x0171
            r6 = 216(0xd8, float:3.03E-43)
            if (r5 == r6) goto L_0x0171
            r6 = 217(0xd9, float:3.04E-43)
            if (r5 == r6) goto L_0x01b5
            r6 = 218(0xda, float:3.05E-43)
            if (r5 == r6) goto L_0x01b5
            int r5 = defpackage.vx3.H(r4, r0, r7)     // Catch:{ IOException -> 0x0237 }
            int r5 = r5 - r0
            long r5 = (long) r5     // Catch:{ IOException -> 0x0237 }
            r4.skip(r5)     // Catch:{ IOException -> 0x0237 }
            goto L_0x0171
        L_0x01b5:
            r5 = r7
        L_0x01b6:
            if (r5 != 0) goto L_0x01ba
            goto L_0x0237
        L_0x01ba:
            if (r5 > r2) goto L_0x01c0
        L_0x01bc:
            r5 = r7
            r6 = r5
            r11 = r6
            goto L_0x01ed
        L_0x01c0:
            int r6 = defpackage.vx3.H(r4, r9, r7)     // Catch:{ IOException -> 0x0237 }
            java.lang.Class<xie> r8 = defpackage.xie.class
            r11 = 1229531648(0x49492a00, float:823968.0)
            if (r6 == r11) goto L_0x01d6
            r12 = 1296891946(0x4d4d002a, float:2.14958752E8)
            if (r6 == r12) goto L_0x01d6
            java.lang.String r5 = "Invalid TIFF header"
            defpackage.m75.a(r8, r5)     // Catch:{ IOException -> 0x0237 }
            goto L_0x01bc
        L_0x01d6:
            if (r6 != r11) goto L_0x01da
            r6 = r3
            goto L_0x01db
        L_0x01da:
            r6 = r7
        L_0x01db:
            int r11 = defpackage.vx3.H(r4, r9, r6)     // Catch:{ IOException -> 0x0237 }
            int r5 = r5 + -8
            if (r11 < r2) goto L_0x01e7
            int r12 = r11 + -8
            if (r12 <= r5) goto L_0x01ed
        L_0x01e7:
            java.lang.String r5 = "Invalid offset"
            defpackage.m75.a(r8, r5)     // Catch:{ IOException -> 0x0237 }
            r5 = r7
        L_0x01ed:
            int r11 = r11 - r2
            if (r5 == 0) goto L_0x0237
            if (r11 <= r5) goto L_0x01f3
            goto L_0x0237
        L_0x01f3:
            long r12 = (long) r11     // Catch:{ IOException -> 0x0237 }
            r4.skip(r12)     // Catch:{ IOException -> 0x0237 }
            int r5 = r5 - r11
            r2 = 14
            if (r5 >= r2) goto L_0x01fe
        L_0x01fc:
            r11 = r7
            goto L_0x0220
        L_0x01fe:
            int r2 = defpackage.vx3.H(r4, r0, r6)     // Catch:{ IOException -> 0x0237 }
            int r5 = r5 + -2
        L_0x0204:
            int r8 = r2 + -1
            if (r2 <= 0) goto L_0x01fc
            r2 = 12
            if (r5 < r2) goto L_0x01fc
            int r2 = defpackage.vx3.H(r4, r0, r6)     // Catch:{ IOException -> 0x0237 }
            int r11 = r5 + -2
            r12 = 274(0x112, float:3.84E-43)
            if (r2 != r12) goto L_0x0217
            goto L_0x0220
        L_0x0217:
            r11 = 10
            r4.skip(r11)     // Catch:{ IOException -> 0x0237 }
            int r5 = r5 + -12
            r2 = r8
            goto L_0x0204
        L_0x0220:
            r1 = 10
            if (r11 >= r1) goto L_0x0225
            goto L_0x0237
        L_0x0225:
            int r1 = defpackage.vx3.H(r4, r0, r6)     // Catch:{ IOException -> 0x0237 }
            if (r1 == r10) goto L_0x022c
            goto L_0x0237
        L_0x022c:
            int r1 = defpackage.vx3.H(r4, r9, r6)     // Catch:{ IOException -> 0x0237 }
            if (r1 == r3) goto L_0x0233
            goto L_0x0237
        L_0x0233:
            int r7 = defpackage.vx3.H(r4, r0, r6)     // Catch:{ IOException -> 0x0237 }
        L_0x0237:
            r15.X = r7
            int r0 = defpackage.d8.q(r7)
            r15.o = r0
            goto L_0x028b
        L_0x0240:
            lq6 r0 = defpackage.o84.k
            if (r4 != r0) goto L_0x0285
            int r0 = r15.o
            if (r0 != r1) goto L_0x0285
            java.io.InputStream r0 = r15.n()
            java.lang.String r1 = "HeifExifUtil"
            if (r0 != 0) goto L_0x0260
            eo7 r0 = defpackage.m75.a
            boolean r0 = r0.i(r10)
            if (r0 == 0) goto L_0x027c
            eo7 r0 = defpackage.m75.a
            java.lang.String r2 = "Trying to read Heif Exif from null inputStream -> ignoring"
            r0.d(r1, r2)
            goto L_0x027c
        L_0x0260:
            v25 r2 = new v25     // Catch:{ IOException -> 0x026c }
            r2.<init>((java.io.InputStream) r0)     // Catch:{ IOException -> 0x026c }
            java.lang.String r0 = "Orientation"
            int r7 = r2.e(r3, r0)     // Catch:{ IOException -> 0x026c }
            goto L_0x027c
        L_0x026c:
            r0 = move-exception
            eo7 r2 = defpackage.m75.a
            boolean r2 = r2.i(r10)
            if (r2 == 0) goto L_0x027c
            eo7 r2 = defpackage.m75.a
            java.lang.String r3 = "Failed reading Heif Exif orientation -> ignoring"
            r2.d(r1, r3, r0)
        L_0x027c:
            r15.X = r7
            int r0 = defpackage.d8.q(r7)
            r15.o = r0
            goto L_0x028b
        L_0x0285:
            int r0 = r15.o
            if (r0 != r1) goto L_0x028b
            r15.o = r7
        L_0x028b:
            return
        L_0x028c:
            r6.close()     // Catch:{ IOException -> 0x0290 }
            goto L_0x0294
        L_0x0290:
            r0 = move-exception
            r0.printStackTrace()
        L_0x0294:
            throw r15
        L_0x0295:
            r15 = move-exception
            bm3.z(r15)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ax4.S():void");
    }

    public final void close() {
        e13.S(this.a);
    }

    public final synchronized boolean e0() {
        return e13.n0(this.a) || this.b != null;
    }

    public final void g(ax4 ax4) {
        ax4.n0();
        this.c = ax4.c;
        ax4.n0();
        this.Y = ax4.Y;
        ax4.n0();
        this.Z = ax4.Z;
        ax4.n0();
        this.o = ax4.o;
        ax4.n0();
        this.X = ax4.X;
        this.w0 = ax4.w0;
        this.x0 = ax4.o();
        ax4.getClass();
        ax4.n0();
        this.y0 = ax4.y0;
    }

    /* JADX INFO: finally extract failed */
    public final String m() {
        e13 o2 = e13.o(this.a);
        if (o2 == null) {
            return BuildConfig.FLAVOR;
        }
        int min = Math.min(o(), 10);
        byte[] bArr = new byte[min];
        try {
            ((jl8) o2.e0()).S(0, 0, min, bArr);
            o2.close();
            StringBuilder sb = new StringBuilder(min * 2);
            for (int i = 0; i < min; i++) {
                sb.append(String.format("%02X", new Object[]{Byte.valueOf(bArr[i])}));
            }
            return sb.toString();
        } catch (Throwable th) {
            o2.close();
            throw th;
        }
    }

    public final InputStream n() {
        o3e o3e = this.b;
        if (o3e != null) {
            return (InputStream) o3e.get();
        }
        e13 o2 = e13.o(this.a);
        if (o2 == null) {
            return null;
        }
        try {
            return new k0b((jl8) o2.e0());
        } finally {
            e13.S(o2);
        }
    }

    public final void n0() {
        if (this.Y < 0 || this.Z < 0) {
            S();
        }
    }

    public final int o() {
        e13 e13 = this.a;
        if (e13 == null) {
            return this.x0;
        }
        e13.e0();
        return ((jl8) e13.e0()).U();
    }

    public ax4(o3e o3e, int i) {
        o3e.getClass();
        this.a = null;
        this.b = o3e;
        this.x0 = i;
    }
}

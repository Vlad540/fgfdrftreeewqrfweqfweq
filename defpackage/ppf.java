package defpackage;

import java.io.Closeable;
import java.io.IOException;
import java.util.Random;

/* renamed from: ppf  reason: default package */
public final class ppf implements Closeable {
    public final byte[] X;
    public final nr0 Y;
    public final zs0 Z;
    public final wr0 a = new Object();
    public final wr0 b;
    public boolean c;
    public xo8 o;
    public final Random w0;
    public final boolean x0;
    public final boolean y0;
    public final long z0;

    /* JADX WARNING: type inference failed for: r2v1, types: [wr0, java.lang.Object] */
    public ppf(u0c u0c, Random random, boolean z, boolean z2, long j) {
        this.Z = u0c;
        this.w0 = random;
        this.x0 = z;
        this.y0 = z2;
        this.z0 = j;
        this.b = u0c.a;
        this.X = new byte[4];
        this.Y = new nr0();
    }

    public final void a(int i, uu0 uu0) {
        if (!this.c) {
            int c2 = uu0.c();
            if (((long) c2) <= 125) {
                wr0 wr0 = this.b;
                wr0.u0(i | 128);
                wr0.u0(c2 | 128);
                Random random = this.w0;
                byte[] bArr = this.X;
                random.nextBytes(bArr);
                wr0.write(bArr, 0, bArr.length);
                if (c2 > 0) {
                    long j = wr0.b;
                    uu0.k(wr0, uu0.c());
                    nr0 nr0 = this.Y;
                    wr0.m0(nr0);
                    nr0.d(j);
                    gp0.I(nr0, bArr);
                    nr0.close();
                }
                this.Z.flush();
                return;
            }
            throw new IllegalArgumentException("Payload size must be less than or equal to 125".toString());
        }
        throw new IOException("closed");
    }

    public final void close() {
        xo8 xo8 = this.o;
        if (xo8 != null) {
            xo8.close();
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:52:0x016b  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void d(defpackage.uu0 r21) {
        /*
            r20 = this;
            r0 = r20
            r1 = r21
            boolean r2 = r0.c
            if (r2 != 0) goto L_0x0184
            wr0 r2 = r0.a
            r2.getClass()
            int r3 = r21.c()
            r1.k(r2, r3)
            r3 = 0
            boolean r4 = r0.x0
            r5 = 0
            if (r4 == 0) goto L_0x00b6
            byte[] r1 = r1.c
            int r1 = r1.length
            long r7 = (long) r1
            long r9 = r0.z0
            int r1 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            if (r1 < 0) goto L_0x00b6
            xo8 r1 = r0.o
            if (r1 == 0) goto L_0x002a
            goto L_0x0034
        L_0x002a:
            xo8 r1 = new xo8
            boolean r4 = r0.y0
            r7 = 0
            r1.<init>(r4, r7)
            r0.o = r1
        L_0x0034:
            wr0 r4 = r1.b
            long r7 = r4.b
            int r7 = (r7 > r5 ? 1 : (r7 == r5 ? 0 : -1))
            if (r7 != 0) goto L_0x00aa
            boolean r7 = r1.c
            if (r7 == 0) goto L_0x0047
            java.lang.Object r7 = r1.o
            java.util.zip.Deflater r7 = (java.util.zip.Deflater) r7
            r7.reset()
        L_0x0047:
            long r7 = r2.b
            java.io.Closeable r1 = r1.X
            gd4 r1 = (defpackage.gd4) r1
            r1.N(r2, r7)
            r1.flush()
            uu0 r1 = defpackage.yo8.a
            long r7 = r4.b
            byte[] r9 = r1.c
            int r10 = r9.length
            long r10 = (long) r10
            long r10 = r7 - r10
            int r12 = r9.length
            int r13 = (r10 > r5 ? 1 : (r10 == r5 ? 0 : -1))
            if (r13 < 0) goto L_0x009f
            if (r12 < 0) goto L_0x009f
            long r7 = r7 - r10
            long r13 = (long) r12
            int r7 = (r7 > r13 ? 1 : (r7 == r13 ? 0 : -1))
            if (r7 < 0) goto L_0x009f
            int r7 = r9.length
            if (r7 >= r12) goto L_0x006e
            goto L_0x009f
        L_0x006e:
            r7 = r3
        L_0x006f:
            if (r7 >= r12) goto L_0x0081
            long r8 = (long) r7
            long r8 = r8 + r10
            byte r8 = r4.S(r8)
            byte[] r9 = r1.c
            byte r9 = r9[r7]
            if (r8 == r9) goto L_0x007e
            goto L_0x009f
        L_0x007e:
            int r7 = r7 + 1
            goto L_0x006f
        L_0x0081:
            long r7 = r4.b
            r1 = 4
            long r9 = (long) r1
            long r7 = r7 - r9
            nr0 r1 = new nr0
            r1.<init>()
            r4.m0(r1)
            r1.a(r7)     // Catch:{ all -> 0x0096 }
            r7 = 0
            defpackage.urd.l(r1, r7)
            goto L_0x00a2
        L_0x0096:
            r0 = move-exception
            r2 = r0
            throw r2     // Catch:{ all -> 0x0099 }
        L_0x0099:
            r0 = move-exception
            r3 = r0
            defpackage.urd.l(r1, r2)
            throw r3
        L_0x009f:
            r4.u0(r3)
        L_0x00a2:
            long r7 = r4.b
            r2.N(r4, r7)
            r1 = 193(0xc1, float:2.7E-43)
            goto L_0x00b8
        L_0x00aa:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = "Failed requirement."
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L_0x00b6:
            r1 = 129(0x81, float:1.81E-43)
        L_0x00b8:
            long r7 = r2.b
            wr0 r4 = r0.b
            r4.u0(r1)
            r9 = 125(0x7d, double:6.2E-322)
            int r1 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            if (r1 > 0) goto L_0x00d2
            int r1 = (int) r7
            r9 = 128(0x80, float:1.794E-43)
            r1 = r1 | r9
            r4.u0(r1)
        L_0x00cc:
            r11 = r4
            r18 = r7
            r4 = r2
            goto L_0x0159
        L_0x00d2:
            r9 = 65535(0xffff, double:3.23786E-319)
            int r1 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            if (r1 > 0) goto L_0x00e3
            r1 = 254(0xfe, float:3.56E-43)
            r4.u0(r1)
            int r1 = (int) r7
            r4.y0(r1)
            goto L_0x00cc
        L_0x00e3:
            r1 = 255(0xff, float:3.57E-43)
            r4.u0(r1)
            r1 = 8
            kuc r9 = r4.r0(r1)
            int r10 = r9.c
            int r11 = r10 + 1
            r12 = 56
            long r12 = r7 >>> r12
            r14 = 255(0xff, double:1.26E-321)
            long r12 = r12 & r14
            int r12 = (int) r12
            byte r12 = (byte) r12
            byte[] r13 = r9.a
            r13[r10] = r12
            int r12 = r10 + 2
            r16 = 48
            long r16 = r7 >>> r16
            long r5 = r16 & r14
            int r5 = (int) r5
            byte r5 = (byte) r5
            r13[r11] = r5
            int r5 = r10 + 3
            r6 = 40
            long r16 = r7 >>> r6
            r11 = r4
            long r3 = r16 & r14
            int r3 = (int) r3
            byte r3 = (byte) r3
            r13[r12] = r3
            int r3 = r10 + 4
            r4 = 32
            long r16 = r7 >>> r4
            r4 = r2
            long r1 = r16 & r14
            int r1 = (int) r1
            byte r1 = (byte) r1
            r13[r5] = r1
            int r1 = r10 + 5
            r2 = 24
            long r16 = r7 >>> r2
            r18 = r7
            long r6 = r16 & r14
            int r5 = (int) r6
            byte r5 = (byte) r5
            r13[r3] = r5
            int r3 = r10 + 6
            r5 = 16
            long r5 = r18 >>> r5
            long r5 = r5 & r14
            int r5 = (int) r5
            byte r5 = (byte) r5
            r13[r1] = r5
            int r1 = r10 + 7
            r5 = 8
            long r6 = r18 >>> r5
            long r6 = r6 & r14
            int r6 = (int) r6
            byte r6 = (byte) r6
            r13[r3] = r6
            int r10 = r10 + r5
            long r5 = r18 & r14
            int r3 = (int) r5
            byte r3 = (byte) r3
            r13[r1] = r3
            r9.c = r10
            long r5 = r11.b
            r7 = 8
            long r5 = r5 + r7
            r11.b = r5
        L_0x0159:
            java.util.Random r1 = r0.w0
            byte[] r3 = r0.X
            r1.nextBytes(r3)
            int r1 = r3.length
            r2 = 0
            r11.write(r3, r2, r1)
            r1 = 0
            int r5 = (r18 > r1 ? 1 : (r18 == r1 ? 0 : -1))
            if (r5 <= 0) goto L_0x0179
            nr0 r5 = r0.Y
            r4.m0(r5)
            r5.d(r1)
            gp0.I(r5, r3)
            r5.close()
        L_0x0179:
            r1 = r18
            r11.N(r4, r1)
            zs0 r0 = r0.Z
            r0.x()
            return
        L_0x0184:
            java.io.IOException r0 = new java.io.IOException
            java.lang.String r1 = "closed"
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ppf.d(uu0):void");
    }
}

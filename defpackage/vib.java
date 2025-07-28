package defpackage;

import android.util.SparseArray;

/* renamed from: vib  reason: default package */
public final class vib implements e75 {
    public boolean X;
    public boolean Y;
    public boolean Z;
    public final cke a = new cke(0);
    public final SparseArray b = new SparseArray();
    public final ija c = new ija(4096);
    public final rib o = new rib(1);
    public long w0;
    public ni5 x0;
    public i75 y0;
    public boolean z0;

    public final void S(i75 i75) {
        this.y0 = i75;
    }

    public final void d(long j, long j2) {
        long j3;
        cke cke = this.a;
        synchronized (cke) {
            j3 = cke.b;
        }
        int i = (j3 > -9223372036854775807L ? 1 : (j3 == -9223372036854775807L ? 0 : -1));
        boolean z = true;
        boolean z2 = i == 0;
        if (!z2) {
            long d = cke.d();
            if (d == -9223372036854775807L || d == 0 || d == j2) {
                z = false;
            }
            z2 = z;
        }
        if (z2) {
            cke.f(j2);
        }
        ni5 ni5 = this.x0;
        if (ni5 != null) {
            ni5.e(j2);
        }
        int i2 = 0;
        while (true) {
            SparseArray sparseArray = this.b;
            if (i2 < sparseArray.size()) {
                tib tib = (tib) sparseArray.valueAt(i2);
                tib.f = false;
                tib.a.a();
                i2++;
            } else {
                return;
            }
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v12, resolved type: ll0} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v9, resolved type: ni5} */
    /* JADX WARNING: type inference failed for: r4v22, types: [java.lang.Object, hl0] */
    /* JADX WARNING: type inference failed for: r3v11, types: [otf, java.lang.Object] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int g(defpackage.g75 r27, le4 r28) {
        /*
            r26 = this;
            r0 = r26
            r1 = r28
            i75 r2 = r0.y0
            defpackage.oyb.l(r2)
            r2 = r27
            r74 r2 = (defpackage.r74) r2
            long r14 = r2.c
            r17 = -1
            int r2 = (r14 > r17 ? 1 : (r14 == r17 ? 0 : -1))
            r12 = 1
            r13 = 4
            r10 = 0
            r11 = 3
            r8 = 442(0x1ba, float:6.2E-43)
            rib r5 = r0.o
            if (r2 == 0) goto L_0x0110
            boolean r6 = r5.a
            if (r6 != 0) goto L_0x0110
            boolean r0 = r5.c
            java.lang.Object r2 = r5.h
            ija r2 = (defpackage.ija) r2
            r6 = 20000(0x4e20, double:9.8813E-320)
            if (r0 != 0) goto L_0x007d
            r0 = r27
            r74 r0 = (defpackage.r74) r0
            long r14 = r0.c
            long r6 = java.lang.Math.min(r6, r14)
            int r6 = (int) r6
            long r3 = (long) r6
            long r14 = r14 - r3
            long r3 = r0.o
            int r3 = (r3 > r14 ? 1 : (r3 == r14 ? 0 : -1))
            if (r3 == 0) goto L_0x0041
            r1.a = r14
            goto L_0x007a
        L_0x0041:
            r2.D(r6)
            r0.Y = r10
            byte[] r1 = r2.a
            r0.r(r1, r10, r6, r10)
            int r0 = r2.b
            int r1 = r2.c
            int r1 = r1 - r13
        L_0x0050:
            if (r1 < r0) goto L_0x0070
            byte[] r3 = r2.a
            int r3 = defpackage.rib.d(r1, r3)
            if (r3 != r8) goto L_0x006d
            int r3 = r1 + 4
            r2.G(r3)
            long r3 = defpackage.rib.e(r2)
            r6 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r9 = (r3 > r6 ? 1 : (r3 == r6 ? 0 : -1))
            if (r9 == 0) goto L_0x006d
            goto L_0x0075
        L_0x006d:
            int r1 = r1 + -1
            goto L_0x0050
        L_0x0070:
            r3 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
        L_0x0075:
            r5.e = r3
            r5.c = r12
        L_0x0079:
            r12 = r10
        L_0x007a:
            r10 = r12
            goto L_0x010f
        L_0x007d:
            long r3 = r5.e
            r13 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r0 = (r3 > r13 ? 1 : (r3 == r13 ? 0 : -1))
            if (r0 != 0) goto L_0x0091
            r0 = r27
            r74 r0 = (defpackage.r74) r0
            r5.b(r0)
            goto L_0x010f
        L_0x0091:
            boolean r0 = r5.b
            if (r0 != 0) goto L_0x00e4
            r0 = r27
            r74 r0 = (defpackage.r74) r0
            long r3 = r0.c
            long r3 = java.lang.Math.min(r6, r3)
            int r3 = (int) r3
            long r6 = r0.o
            long r13 = (long) r10
            int r4 = (r6 > r13 ? 1 : (r6 == r13 ? 0 : -1))
            if (r4 == 0) goto L_0x00aa
            r1.a = r13
            goto L_0x007a
        L_0x00aa:
            r2.D(r3)
            r0.Y = r10
            byte[] r1 = r2.a
            r0.r(r1, r10, r3, r10)
            int r0 = r2.b
            int r1 = r2.c
        L_0x00b8:
            int r3 = r1 + -3
            if (r0 >= r3) goto L_0x00da
            byte[] r3 = r2.a
            int r3 = defpackage.rib.d(r0, r3)
            if (r3 != r8) goto L_0x00d7
            int r3 = r0 + 4
            r2.G(r3)
            long r3 = defpackage.rib.e(r2)
            r6 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r9 = (r3 > r6 ? 1 : (r3 == r6 ? 0 : -1))
            if (r9 == 0) goto L_0x00d7
            goto L_0x00df
        L_0x00d7:
            int r0 = r0 + 1
            goto L_0x00b8
        L_0x00da:
            r3 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
        L_0x00df:
            r5.d = r3
            r5.b = r12
            goto L_0x0079
        L_0x00e4:
            long r0 = r5.d
            r2 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r2 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r2 != 0) goto L_0x00f7
            r0 = r27
            r74 r0 = (defpackage.r74) r0
            r5.b(r0)
            goto L_0x010f
        L_0x00f7:
            java.lang.Object r2 = r5.g
            cke r2 = (defpackage.cke) r2
            long r0 = r2.b(r0)
            long r3 = r5.e
            long r2 = r2.c(r3)
            long r2 = r2 - r0
            r5.f = r2
            r0 = r27
            r74 r0 = (defpackage.r74) r0
            r5.b(r0)
        L_0x010f:
            return r10
        L_0x0110:
            boolean r3 = r0.z0
            if (r3 != 0) goto L_0x0170
            r0.z0 = r12
            long r6 = r5.f
            r3 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r3 = (r6 > r3 ? 1 : (r6 == r3 ? 0 : -1))
            if (r3 == 0) goto L_0x0161
            ni5 r9 = new ni5
            om3 r4 = new om3
            r4.<init>()
            otf r3 = new otf
            java.lang.Object r5 = r5.g
            cke r5 = (defpackage.cke) r5
            r3.<init>()
            r3.a = r5
            ija r5 = new ija
            r5.<init>()
            r3.b = r5
            r19 = 1
            long r19 = r6 + r19
            r16 = 1000(0x3e8, float:1.401E-42)
            r21 = 0
            r23 = 188(0xbc, double:9.3E-322)
            r5 = r3
            r3 = r9
            r25 = r2
            r2 = r9
            r8 = r19
            r10 = r21
            r12 = r14
            r19 = r14
            r14 = r23
            r3.<init>((defpackage.hl0) r4, (defpackage.kl0) r5, (long) r6, (long) r8, (long) r10, (long) r12, (long) r14, (int) r16)
            r0.x0 = r2
            i75 r3 = r0.y0
            java.lang.Object r2 = r2.c
            el0 r2 = (defpackage.el0) r2
            r3.M(r2)
            goto L_0x0174
        L_0x0161:
            r25 = r2
            r19 = r14
            i75 r2 = r0.y0
            wc0 r3 = new wc0
            r3.<init>(r6)
            r2.M(r3)
            goto L_0x0174
        L_0x0170:
            r25 = r2
            r19 = r14
        L_0x0174:
            ni5 r2 = r0.x0
            if (r2 == 0) goto L_0x0187
            java.lang.Object r3 = r2.e
            fl0 r3 = (defpackage.fl0) r3
            if (r3 == 0) goto L_0x0187
            r0 = r27
            r74 r0 = (defpackage.r74) r0
            int r0 = r2.b(r0, r1)
            return r0
        L_0x0187:
            r1 = r27
            r74 r1 = (defpackage.r74) r1
            r2 = 0
            r1.Y = r2
            if (r25 == 0) goto L_0x0197
            long r3 = r1.s()
            long r14 = r19 - r3
            goto L_0x0199
        L_0x0197:
            r14 = r17
        L_0x0199:
            int r3 = (r14 > r17 ? 1 : (r14 == r17 ? 0 : -1))
            r4 = -1
            if (r3 == 0) goto L_0x01a5
            r5 = 4
            int r3 = (r14 > r5 ? 1 : (r14 == r5 ? 0 : -1))
            if (r3 >= 0) goto L_0x01a5
            return r4
        L_0x01a5:
            ija r3 = r0.c
            byte[] r5 = r3.a
            r6 = 1
            r7 = 4
            boolean r5 = r1.r(r5, r2, r7, r6)
            if (r5 != 0) goto L_0x01b2
            return r4
        L_0x01b2:
            r3.G(r2)
            int r5 = r3.g()
            r8 = 441(0x1b9, float:6.18E-43)
            if (r5 != r8) goto L_0x01be
            return r4
        L_0x01be:
            r4 = 442(0x1ba, float:6.2E-43)
            if (r5 != r4) goto L_0x01da
            byte[] r0 = r3.a
            r4 = 10
            r1.r(r0, r2, r4, r2)
            r0 = 9
            r3.G(r0)
            int r0 = r3.u()
            r0 = r0 & 7
            int r0 = r0 + 14
            r1.z(r0)
            return r2
        L_0x01da:
            r4 = 443(0x1bb, float:6.21E-43)
            r8 = 2
            r9 = 6
            if (r5 != r4) goto L_0x01f1
            byte[] r0 = r3.a
            r1.r(r0, r2, r8, r2)
            r3.G(r2)
            int r0 = r3.A()
            int r0 = r0 + r9
            r1.z(r0)
            return r2
        L_0x01f1:
            r4 = r5 & -256(0xffffffffffffff00, float:NaN)
            r10 = 8
            int r4 = r4 >> r10
            if (r4 == r6) goto L_0x01fc
            r1.z(r6)
            return r2
        L_0x01fc:
            r4 = r5 & 255(0xff, float:3.57E-43)
            android.util.SparseArray r11 = r0.b
            java.lang.Object r12 = r11.get(r4)
            tib r12 = (defpackage.tib) r12
            boolean r13 = r0.X
            if (r13 != 0) goto L_0x027a
            if (r12 != 0) goto L_0x025c
            r13 = 189(0xbd, float:2.65E-43)
            if (r4 != r13) goto L_0x021c
            u3 r5 = new u3
            r5.<init>()
            r0.Y = r6
            long r13 = r1.o
            r0.w0 = r13
            goto L_0x0242
        L_0x021c:
            r13 = r5 & 224(0xe0, float:3.14E-43)
            r14 = 192(0xc0, float:2.69E-43)
            r15 = 0
            if (r13 != r14) goto L_0x022f
            b89 r5 = new b89
            r5.<init>(r15, r2)
            r0.Y = r6
            long r13 = r1.o
            r0.w0 = r13
            goto L_0x0242
        L_0x022f:
            r5 = r5 & 240(0xf0, float:3.36E-43)
            r13 = 224(0xe0, float:3.14E-43)
            if (r5 != r13) goto L_0x0241
            gd6 r5 = new gd6
            r5.<init>(r15)
            r0.Z = r6
            long r13 = r1.o
            r0.w0 = r13
            goto L_0x0242
        L_0x0241:
            r5 = r15
        L_0x0242:
            if (r5 == 0) goto L_0x025c
            pse r12 = new pse
            r13 = 256(0x100, float:3.59E-43)
            r14 = 1
            r15 = 0
            r12.<init>((int) r4, (int) r13, (int) r14, (byte) r15)
            i75 r13 = r0.y0
            r5.k(r13, r12)
            tib r12 = new tib
            cke r13 = r0.a
            r12.<init>(r5, r13)
            r11.put(r4, r12)
        L_0x025c:
            boolean r4 = r0.Y
            if (r4 == 0) goto L_0x026a
            boolean r4 = r0.Z
            if (r4 == 0) goto L_0x026a
            long r4 = r0.w0
            r13 = 8192(0x2000, double:4.0474E-320)
            long r4 = r4 + r13
            goto L_0x026d
        L_0x026a:
            r4 = 1048576(0x100000, double:5.180654E-318)
        L_0x026d:
            long r13 = r1.o
            int r4 = (r13 > r4 ? 1 : (r13 == r4 ? 0 : -1))
            if (r4 <= 0) goto L_0x027a
            r0.X = r6
            i75 r0 = r0.y0
            r0.w()
        L_0x027a:
            byte[] r0 = r3.a
            r1.r(r0, r2, r8, r2)
            r3.G(r2)
            int r0 = r3.A()
            int r0 = r0 + r9
            if (r12 != 0) goto L_0x028f
            r1.z(r0)
            r0 = r2
            goto L_0x033c
        L_0x028f:
            r3.D(r0)
            byte[] r4 = r3.a
            r1.i(r4, r2, r0, r2)
            r3.G(r9)
            wx1 r0 = r12.c
            byte[] r1 = r0.b
            r4 = 3
            r3.e(r2, r1, r4)
            r0.q(r2)
            r0.t(r10)
            boolean r1 = r0.h()
            r12.d = r1
            boolean r1 = r0.h()
            r12.e = r1
            r0.t(r9)
            int r1 = r0.i(r10)
            byte[] r5 = r0.b
            r3.e(r2, r5, r1)
            r0.q(r2)
            r8 = 0
            r12.g = r8
            boolean r1 = r12.d
            if (r1 == 0) goto L_0x0327
            r0.t(r7)
            int r1 = r0.i(r4)
            long r8 = (long) r1
            r1 = 30
            long r8 = r8 << r1
            r0.t(r6)
            r5 = 15
            int r10 = r0.i(r5)
            int r10 = r10 << r5
            long r10 = (long) r10
            long r8 = r8 | r10
            r0.t(r6)
            int r10 = r0.i(r5)
            long r10 = (long) r10
            long r8 = r8 | r10
            r0.t(r6)
            boolean r10 = r12.f
            cke r11 = r12.b
            if (r10 != 0) goto L_0x031f
            boolean r10 = r12.e
            if (r10 == 0) goto L_0x031f
            r0.t(r7)
            int r4 = r0.i(r4)
            long r13 = (long) r4
            long r13 = r13 << r1
            r0.t(r6)
            int r1 = r0.i(r5)
            int r1 = r1 << r5
            r4 = r3
            long r2 = (long) r1
            long r1 = r13 | r2
            r0.t(r6)
            int r3 = r0.i(r5)
            long r13 = (long) r3
            long r1 = r1 | r13
            r0.t(r6)
            r11.b(r1)
            r12.f = r6
            goto L_0x0320
        L_0x031f:
            r4 = r3
        L_0x0320:
            long r0 = r11.b(r8)
            r12.g = r0
            goto L_0x0328
        L_0x0327:
            r4 = r3
        L_0x0328:
            long r0 = r12.g
            ys4 r2 = r12.a
            r2.h(r7, r0)
            r2.f(r4)
            r0 = 0
            r2.j(r0)
            byte[] r1 = r4.a
            int r1 = r1.length
            r4.F(r1)
        L_0x033c:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.vib.g(g75, le4):int");
    }

    public final boolean n(g75 g75) {
        byte[] bArr = new byte[14];
        ((r74) g75).r(bArr, 0, 14, false);
        if (442 != (((bArr[0] & 255) << 24) | ((bArr[1] & 255) << 16) | ((bArr[2] & 255) << 8) | (bArr[3] & 255)) || (bArr[4] & 196) != 68 || (bArr[6] & 4) != 4 || (bArr[8] & 4) != 4 || (bArr[9] & 1) != 1 || (bArr[12] & 3) != 3) {
            return false;
        }
        r74 r74 = (r74) g75;
        r74.b(bArr[13] & 7, false);
        r74.r(bArr, 0, 3, false);
        return 1 == ((((bArr[0] & 255) << 16) | ((bArr[1] & 255) << 8)) | (bArr[2] & 255));
    }

    public final void release() {
    }
}

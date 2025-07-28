package defpackage;

import android.util.SparseArray;

/* renamed from: uib  reason: default package */
public final class uib implements d75 {
    public final bke a = new bke(0);
    public final SparseArray b = new SparseArray();
    public final yze c = new yze(4096);
    public final rib d = new rib(0);
    public boolean e;
    public boolean f;
    public boolean g;
    public long h;
    public mi5 i;
    public h75 j;
    public boolean k;

    public final void d(long j2, long j3) {
        long j4;
        bke bke = this.a;
        synchronized (bke) {
            j4 = bke.b;
        }
        int i2 = (j4 > -9223372036854775807L ? 1 : (j4 == -9223372036854775807L ? 0 : -1));
        boolean z = true;
        boolean z2 = i2 == 0;
        if (!z2) {
            long c2 = bke.c();
            if (c2 == -9223372036854775807L || c2 == 0 || c2 == j3) {
                z = false;
            }
            z2 = z;
        }
        if (z2) {
            bke.d(j3);
        }
        mi5 mi5 = this.i;
        if (mi5 != null) {
            mi5.e(j3);
        }
        int i3 = 0;
        while (true) {
            SparseArray sparseArray = this.b;
            if (i3 < sparseArray.size()) {
                sib sib = (sib) sparseArray.valueAt(i3);
                sib.f = false;
                sib.a.a();
                i3++;
            } else {
                return;
            }
        }
    }

    public final void g(h75 h75) {
        this.j = h75;
    }

    public final boolean h(f75 f75) {
        byte[] bArr = new byte[14];
        q74 q74 = (q74) f75;
        q74.r(bArr, 0, 14, false);
        if (442 != (((bArr[0] & 255) << 24) | ((bArr[1] & 255) << 16) | ((bArr[2] & 255) << 8) | (bArr[3] & 255)) || (bArr[4] & 196) != 68 || (bArr[6] & 4) != 4 || (bArr[8] & 4) != 4 || (bArr[9] & 1) != 1 || (bArr[12] & 3) != 3) {
            return false;
        }
        q74.b(bArr[13] & 7, false);
        q74.r(bArr, 0, 3, false);
        return 1 == ((((bArr[0] & 255) << 16) | ((bArr[1] & 255) << 8)) | (bArr[2] & 255));
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r27v0, resolved type: ll0} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v11, resolved type: mi5} */
    /* JADX WARNING: type inference failed for: r4v21, types: [gl0] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:99:0x0233  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int i(defpackage.f75 r29, le4 r30) {
        /*
            r28 = this;
            r0 = r28
            r1 = r30
            h75 r2 = r0.j
            swb.i(r2)
            r2 = r29
            q74 r2 = (defpackage.q74) r2
            long r14 = r2.c
            r17 = -1
            int r2 = (r14 > r17 ? 1 : (r14 == r17 ? 0 : -1))
            r12 = 1
            r13 = 4
            r10 = 0
            r11 = 3
            r3 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r6 = 442(0x1ba, float:6.2E-43)
            rib r5 = r0.d
            if (r2 == 0) goto L_0x0101
            boolean r7 = r5.a
            if (r7 != 0) goto L_0x0101
            boolean r0 = r5.c
            java.lang.Object r2 = r5.h
            yze r2 = (defpackage.yze) r2
            r14 = 20000(0x4e20, double:9.8813E-320)
            if (r0 != 0) goto L_0x0079
            r0 = r29
            q74 r0 = (defpackage.q74) r0
            long r7 = r0.c
            long r14 = java.lang.Math.min(r14, r7)
            int r9 = (int) r14
            long r14 = (long) r9
            long r7 = r7 - r14
            long r14 = r0.o
            int r11 = (r14 > r7 ? 1 : (r14 == r7 ? 0 : -1))
            if (r11 == 0) goto L_0x0046
            r1.a = r7
            goto L_0x0076
        L_0x0046:
            r2.E(r9)
            r0.Y = r10
            byte[] r1 = r2.a
            r0.r(r1, r10, r9, r10)
            int r0 = r2.b
            int r1 = r2.c
            int r1 = r1 - r13
        L_0x0055:
            if (r1 < r0) goto L_0x0071
            byte[] r7 = r2.a
            int r7 = defpackage.rib.c(r1, r7)
            if (r7 != r6) goto L_0x006e
            int r7 = r1 + 4
            r2.H(r7)
            long r7 = defpackage.rib.f(r2)
            int r9 = (r7 > r3 ? 1 : (r7 == r3 ? 0 : -1))
            if (r9 == 0) goto L_0x006e
            r3 = r7
            goto L_0x0071
        L_0x006e:
            int r1 = r1 + -1
            goto L_0x0055
        L_0x0071:
            r5.e = r3
            r5.c = r12
        L_0x0075:
            r12 = r10
        L_0x0076:
            r10 = r12
            goto L_0x0100
        L_0x0079:
            long r8 = r5.e
            int r0 = (r8 > r3 ? 1 : (r8 == r3 ? 0 : -1))
            if (r0 != 0) goto L_0x0088
            r0 = r29
            q74 r0 = (defpackage.q74) r0
            r5.a(r0)
            goto L_0x0100
        L_0x0088:
            boolean r0 = r5.b
            if (r0 != 0) goto L_0x00d2
            r0 = r29
            q74 r0 = (defpackage.q74) r0
            long r7 = r0.c
            long r7 = java.lang.Math.min(r14, r7)
            int r7 = (int) r7
            long r8 = r0.o
            long r13 = (long) r10
            int r8 = (r8 > r13 ? 1 : (r8 == r13 ? 0 : -1))
            if (r8 == 0) goto L_0x00a1
            r1.a = r13
            goto L_0x0076
        L_0x00a1:
            r2.E(r7)
            r0.Y = r10
            byte[] r1 = r2.a
            r0.r(r1, r10, r7, r10)
            int r0 = r2.b
            int r1 = r2.c
        L_0x00af:
            int r7 = r1 + -3
            if (r0 >= r7) goto L_0x00cd
            byte[] r7 = r2.a
            int r7 = defpackage.rib.c(r0, r7)
            if (r7 != r6) goto L_0x00ca
            int r7 = r0 + 4
            r2.H(r7)
            long r7 = defpackage.rib.f(r2)
            int r9 = (r7 > r3 ? 1 : (r7 == r3 ? 0 : -1))
            if (r9 == 0) goto L_0x00ca
            r3 = r7
            goto L_0x00cd
        L_0x00ca:
            int r0 = r0 + 1
            goto L_0x00af
        L_0x00cd:
            r5.d = r3
            r5.b = r12
            goto L_0x0075
        L_0x00d2:
            long r0 = r5.d
            int r2 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r2 != 0) goto L_0x00e0
            r0 = r29
            q74 r0 = (defpackage.q74) r0
            r5.a(r0)
            goto L_0x0100
        L_0x00e0:
            java.lang.Object r2 = r5.g
            bke r2 = (defpackage.bke) r2
            long r0 = r2.b(r0)
            long r6 = r5.e
            long r6 = r2.b(r6)
            long r6 = r6 - r0
            r5.f = r6
            r8 = 0
            int r0 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r0 >= 0) goto L_0x00f9
            r5.f = r3
        L_0x00f9:
            r0 = r29
            q74 r0 = (defpackage.q74) r0
            r5.a(r0)
        L_0x0100:
            return r10
        L_0x0101:
            r8 = 0
            boolean r7 = r0.k
            if (r7 != 0) goto L_0x015e
            r0.k = r12
            long r6 = r5.f
            int r3 = (r6 > r3 ? 1 : (r6 == r3 ? 0 : -1))
            if (r3 == 0) goto L_0x014e
            mi5 r4 = new mi5
            zl3 r19 = new zl3
            r19.<init>()
            v4b r3 = new v4b
            java.lang.Object r5 = r5.g
            bke r5 = (defpackage.bke) r5
            r3.<init>(r5)
            r20 = 1
            long r20 = r6 + r20
            r22 = 1000(0x3e8, float:1.401E-42)
            r23 = 0
            r25 = 188(0xbc, double:9.3E-322)
            r5 = r3
            r3 = r4
            r27 = r4
            r4 = r19
            r8 = r20
            r19 = r2
            r2 = r10
            r10 = r23
            r12 = r14
            r20 = r14
            r14 = r25
            r16 = r22
            r3.<init>((defpackage.gl0) r4, (defpackage.jl0) r5, (long) r6, (long) r8, (long) r10, (long) r12, (long) r14, (int) r16)
            r3 = r27
            r0.i = r3
            h75 r4 = r0.j
            java.lang.Object r3 = r3.c
            dl0 r3 = (defpackage.dl0) r3
            r4.K(r3)
            goto L_0x0163
        L_0x014e:
            r19 = r2
            r2 = r10
            r20 = r14
            h75 r3 = r0.j
            si5 r4 = new si5
            r4.<init>(r6)
            r3.K(r4)
            goto L_0x0163
        L_0x015e:
            r19 = r2
            r2 = r10
            r20 = r14
        L_0x0163:
            mi5 r3 = r0.i
            if (r3 == 0) goto L_0x0176
            java.lang.Object r4 = r3.e
            fl0 r4 = (defpackage.fl0) r4
            if (r4 == 0) goto L_0x0176
            r0 = r29
            q74 r0 = (defpackage.q74) r0
            int r0 = r3.a(r0, r1)
            return r0
        L_0x0176:
            r1 = r29
            q74 r1 = (defpackage.q74) r1
            r1.Y = r2
            if (r19 == 0) goto L_0x0185
            long r3 = r1.s()
            long r14 = r20 - r3
            goto L_0x0187
        L_0x0185:
            r14 = r17
        L_0x0187:
            int r3 = (r14 > r17 ? 1 : (r14 == r17 ? 0 : -1))
            r4 = -1
            if (r3 == 0) goto L_0x0193
            r5 = 4
            int r3 = (r14 > r5 ? 1 : (r14 == r5 ? 0 : -1))
            if (r3 >= 0) goto L_0x0193
            return r4
        L_0x0193:
            yze r3 = r0.c
            byte[] r5 = r3.a
            r6 = 1
            r7 = 4
            boolean r5 = r1.r(r5, r2, r7, r6)
            if (r5 != 0) goto L_0x01a0
            return r4
        L_0x01a0:
            r3.H(r2)
            int r5 = r3.h()
            r8 = 441(0x1b9, float:6.18E-43)
            if (r5 != r8) goto L_0x01ac
            return r4
        L_0x01ac:
            r4 = 442(0x1ba, float:6.2E-43)
            if (r5 != r4) goto L_0x01c8
            byte[] r0 = r3.a
            r4 = 10
            r1.r(r0, r2, r4, r2)
            r0 = 9
            r3.H(r0)
            int r0 = r3.v()
            r0 = r0 & 7
            int r0 = r0 + 14
            r1.z(r0)
            return r2
        L_0x01c8:
            r4 = 443(0x1bb, float:6.21E-43)
            r8 = 2
            r9 = 6
            if (r5 != r4) goto L_0x01df
            byte[] r0 = r3.a
            r1.r(r0, r2, r8, r2)
            r3.H(r2)
            int r0 = r3.A()
            int r0 = r0 + r9
            r1.z(r0)
            return r2
        L_0x01df:
            r4 = r5 & -256(0xffffffffffffff00, float:NaN)
            r10 = 8
            int r4 = r4 >> r10
            if (r4 == r6) goto L_0x01ea
            r1.z(r6)
            return r2
        L_0x01ea:
            r4 = r5 & 255(0xff, float:3.57E-43)
            android.util.SparseArray r11 = r0.b
            java.lang.Object r12 = r11.get(r4)
            sib r12 = (defpackage.sib) r12
            boolean r13 = r0.e
            if (r13 != 0) goto L_0x0269
            if (r12 != 0) goto L_0x024b
            r13 = 189(0xbd, float:2.65E-43)
            r14 = 0
            if (r4 != r13) goto L_0x020d
            t3 r5 = new t3
            r13 = 0
            r5.<init>(r14, r13)
            r0.f = r6
            long r13 = r1.o
            r0.h = r13
        L_0x020b:
            r14 = r5
            goto L_0x0231
        L_0x020d:
            r13 = r5 & 224(0xe0, float:3.14E-43)
            r15 = 192(0xc0, float:2.69E-43)
            if (r13 != r15) goto L_0x021f
            a89 r5 = new a89
            r5.<init>(r14)
            r0.f = r6
            long r13 = r1.o
            r0.h = r13
            goto L_0x020b
        L_0x021f:
            r5 = r5 & 240(0xf0, float:3.36E-43)
            r13 = 224(0xe0, float:3.14E-43)
            if (r5 != r13) goto L_0x0231
            fd6 r5 = new fd6
            r5.<init>(r14)
            r0.g = r6
            long r13 = r1.o
            r0.h = r13
            goto L_0x020b
        L_0x0231:
            if (r14 == 0) goto L_0x024b
            pse r5 = new pse
            r12 = 256(0x100, float:3.59E-43)
            r13 = 0
            r15 = 0
            r5.<init>((int) r4, (int) r12, (int) r13, (byte) r15)
            h75 r12 = r0.j
            r14.l(r12, r5)
            sib r12 = new sib
            bke r5 = r0.a
            r12.<init>(r14, r5)
            r11.put(r4, r12)
        L_0x024b:
            boolean r4 = r0.f
            if (r4 == 0) goto L_0x0259
            boolean r4 = r0.g
            if (r4 == 0) goto L_0x0259
            long r4 = r0.h
            r13 = 8192(0x2000, double:4.0474E-320)
            long r4 = r4 + r13
            goto L_0x025c
        L_0x0259:
            r4 = 1048576(0x100000, double:5.180654E-318)
        L_0x025c:
            long r13 = r1.o
            int r4 = (r13 > r4 ? 1 : (r13 == r4 ? 0 : -1))
            if (r4 <= 0) goto L_0x0269
            r0.e = r6
            h75 r0 = r0.j
            r0.w()
        L_0x0269:
            byte[] r0 = r3.a
            r1.r(r0, r2, r8, r2)
            r3.H(r2)
            int r0 = r3.A()
            int r0 = r0 + r9
            if (r12 != 0) goto L_0x027e
            r1.z(r0)
            r0 = r2
            goto L_0x032b
        L_0x027e:
            r3.E(r0)
            byte[] r4 = r3.a
            r1.i(r4, r2, r0, r2)
            r3.H(r9)
            wx1 r0 = r12.c
            byte[] r1 = r0.b
            r4 = 3
            r3.g(r2, r1, r4)
            r0.q(r2)
            r0.t(r10)
            boolean r1 = r0.h()
            r12.d = r1
            boolean r1 = r0.h()
            r12.e = r1
            r0.t(r9)
            int r1 = r0.i(r10)
            byte[] r5 = r0.b
            r3.g(r2, r5, r1)
            r0.q(r2)
            r8 = 0
            r12.g = r8
            boolean r1 = r12.d
            if (r1 == 0) goto L_0x0316
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
            bke r11 = r12.b
            if (r10 != 0) goto L_0x030e
            boolean r10 = r12.e
            if (r10 == 0) goto L_0x030e
            r0.t(r7)
            int r4 = r0.i(r4)
            long r13 = (long) r4
            long r13 = r13 << r1
            r0.t(r6)
            int r1 = r0.i(r5)
            int r1 = r1 << r5
            r10 = r3
            long r2 = (long) r1
            long r1 = r13 | r2
            r0.t(r6)
            int r3 = r0.i(r5)
            long r13 = (long) r3
            long r1 = r1 | r13
            r0.t(r6)
            r11.b(r1)
            r12.f = r6
            goto L_0x030f
        L_0x030e:
            r10 = r3
        L_0x030f:
            long r0 = r11.b(r8)
            r12.g = r0
            goto L_0x0317
        L_0x0316:
            r10 = r3
        L_0x0317:
            long r0 = r12.g
            xs4 r2 = r12.a
            r2.h(r7, r0)
            r2.g(r10)
            r2.i()
            byte[] r0 = r10.a
            int r0 = r0.length
            r10.G(r0)
            r0 = 0
        L_0x032b:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.uib.i(f75, le4):int");
    }

    public final void release() {
    }
}

package defpackage;

/* renamed from: ir8  reason: default package */
public final class ir8 {
    public final nj4 a;

    public ir8(nj4 nj4) {
        this.a = nj4;
    }

    public static boolean a(i22 i22, jb5 jb5, boolean z) {
        if (i22 == null || !i22.b0()) {
            return false;
        }
        return !i22.G() || i22.v() || (((kb5) jb5).s() && ((i22.w() && z) || i22.a0() || d8.v(i22.d(i22.Y), 1024) || z));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0016, code lost:
        r0 = r7.D0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean c(defpackage.i22 r6, defpackage.vo8 r7) {
        /*
            boolean r0 = r7.t()
            r1 = 0
            if (r0 == 0) goto L_0x0008
            return r1
        L_0x0008:
            boolean r0 = r7.m()
            if (r0 != 0) goto L_0x002a
            java.lang.String r0 = r7.w0
            boolean r0 = r1g.p(r0)
            if (r0 == 0) goto L_0x002a
            jj7 r0 = r7.D0
            if (r0 == 0) goto L_0x0021
            java.lang.Object r2 = r0.b
            vw6 r2 = (defpackage.vw6) r2
            if (r2 == 0) goto L_0x0021
            goto L_0x0029
        L_0x0021:
            if (r0 == 0) goto L_0x002a
            java.lang.Object r0 = r0.c
            v9c r0 = (defpackage.v9c) r0
            if (r0 == 0) goto L_0x002a
        L_0x0029:
            return r1
        L_0x002a:
            if (r6 == 0) goto L_0x0041
            o62 r6 = r6.b
            boolean r6 = r6.g()
            if (r6 == 0) goto L_0x0041
            long r2 = r7.c
            r4 = 0
            int r6 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r6 == 0) goto L_0x0041
            int r6 = r7.Q0
            if (r6 != 0) goto L_0x0041
            r1 = 1
        L_0x0041:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ir8.c(i22, vo8):boolean");
    }

    /* JADX WARNING: Removed duplicated region for block: B:51:0x00aa  */
    /* JADX WARNING: Removed duplicated region for block: B:72:0x00fc  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean b(defpackage.i22 r12, defpackage.xm8 r13) {
        /*
            r11 = this;
            vo8 r0 = r13.a
            boolean r1 = r0.t()
            r2 = 0
            if (r1 != 0) goto L_0x0153
            boolean r1 = r0.u()
            if (r1 != 0) goto L_0x0153
            boolean r1 = r0.B()
            if (r1 != 0) goto L_0x0153
            boolean r1 = r0.w()
            if (r1 != 0) goto L_0x0153
            boolean r1 = r0.s()
            if (r1 != 0) goto L_0x0153
            boolean r1 = r0.m()
            jj7 r3 = r0.D0
            if (r1 == 0) goto L_0x0033
            j10 r1 = defpackage.j10.x0
            o10 r1 = r3.x(r1)
            if (r1 == 0) goto L_0x0033
            goto L_0x0153
        L_0x0033:
            boolean r1 = r0.o()
            if (r1 != 0) goto L_0x0153
            boolean r1 = r0.z()
            if (r1 == 0) goto L_0x0041
            goto L_0x0153
        L_0x0041:
            nj4 r11 = r11.a
            java.lang.Object r1 = r11.get()
            g2b r1 = (defpackage.g2b) r1
            j2b r1 = (defpackage.j2b) r1
            kb5 r1 = r1.e
            boolean r1 = r12.R(r1)
            if (r1 != 0) goto L_0x0054
            return r2
        L_0x0054:
            boolean r1 = r0.m()
            r4 = 1
            if (r1 == 0) goto L_0x0098
            java.lang.Object r1 = r3.a
            java.util.List r1 = (java.util.List) r1
            boolean r5 = r1 instanceof java.util.Collection
            if (r5 == 0) goto L_0x006b
            boolean r5 = r1.isEmpty()
            if (r5 == 0) goto L_0x006b
            r5 = r2
            goto L_0x0090
        L_0x006b:
            java.util.Iterator r1 = r1.iterator()
            r5 = r2
        L_0x0070:
            boolean r6 = r1.hasNext()
            if (r6 == 0) goto L_0x0090
            java.lang.Object r6 = r1.next()
            o10 r6 = (defpackage.o10) r6     // Catch:{ all -> 0x0089 }
            j10 r6 = r6.a     // Catch:{ all -> 0x0089 }
            j10 r7 = defpackage.j10.c     // Catch:{ all -> 0x0089 }
            if (r6 == r7) goto L_0x0086
            j10 r7 = defpackage.j10.o     // Catch:{ all -> 0x0089 }
            if (r6 != r7) goto L_0x0070
        L_0x0086:
            int r5 = r5 + 1
            goto L_0x0070
        L_0x0089:
            r11 = move-exception
            java.lang.RuntimeException r12 = new java.lang.RuntimeException
            r12.<init>(r11)
            throw r12
        L_0x0090:
            int r1 = r3.v()
            if (r5 != r1) goto L_0x0098
            r1 = r4
            goto L_0x0099
        L_0x0098:
            r1 = r2
        L_0x0099:
            java.lang.String r3 = r0.w0
            boolean r3 = r1g.p(r3)
            if (r3 == 0) goto L_0x00a4
            if (r1 != 0) goto L_0x00a4
            return r2
        L_0x00a4:
            boolean r1 = r12.G()
            if (r1 == 0) goto L_0x00fc
            java.lang.Object r0 = r11.get()
            g2b r0 = (defpackage.g2b) r0
            j2b r0 = (defpackage.j2b) r0
            kb5 r0 = r0.e
            boolean r0 = r0.s()
            if (r0 == 0) goto L_0x00c8
            boolean r0 = r12.w()
            if (r0 == 0) goto L_0x00c8
            tf3 r13 = r13.b
            boolean r13 = r13.Y
            if (r13 == 0) goto L_0x00c8
            r13 = r4
            goto L_0x00c9
        L_0x00c8:
            r13 = r2
        L_0x00c9:
            java.lang.Object r11 = r11.get()
            g2b r11 = (defpackage.g2b) r11
            j2b r11 = (defpackage.j2b) r11
            kb5 r11 = r11.e
            boolean r11 = r11.s()
            if (r11 == 0) goto L_0x00ef
            boolean r11 = r12.a0()
            if (r11 != 0) goto L_0x00ed
            long r0 = r12.Y
            int r11 = r12.d(r0)
            r0 = 512(0x200, float:7.175E-43)
            boolean r11 = d8.v(r11, r0)
            if (r11 == 0) goto L_0x00ef
        L_0x00ed:
            r11 = r4
            goto L_0x00f0
        L_0x00ef:
            r11 = r2
        L_0x00f0:
            boolean r12 = r12.v()
            if (r12 != 0) goto L_0x00fa
            if (r13 != 0) goto L_0x00fa
            if (r11 == 0) goto L_0x00fb
        L_0x00fa:
            r2 = r4
        L_0x00fb:
            return r2
        L_0x00fc:
            boolean r13 = r0.n()
            if (r13 == 0) goto L_0x0103
            return r4
        L_0x0103:
            long r5 = r0.c
            r7 = 0
            int r13 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r13 == 0) goto L_0x0134
            java.lang.Object r13 = r11.get()
            g2b r13 = (defpackage.g2b) r13
            j2b r13 = (defpackage.j2b) r13
            i03 r1 = r13.a
            long r5 = r1.m()
            long r9 = r0.o
            long r5 = r5 - r9
            r9 = 1000(0x3e8, double:4.94E-321)
            long r5 = r5 / r9
            yzc r13 = r13.b
            r13.getClass()
            ru.ok.tamtam.android.prefs.PmsKey r1 = ru.ok.tamtam.android.prefs.PmsKey.f32edittimeout
            r3 = 86400(0x15180, float:1.21072E-40)
            long r9 = (long) r3
            long r9 = r13.o(r1, r9)
            int r13 = (int) r9
            long r9 = (long) r13
            int r13 = (r5 > r9 ? 1 : (r5 == r9 ? 0 : -1))
            if (r13 >= 0) goto L_0x0153
        L_0x0134:
            java.lang.Object r11 = r11.get()
            g2b r11 = (defpackage.g2b) r11
            j2b r11 = (defpackage.j2b) r11
            i03 r11 = r11.a
            long r5 = r11.s()
            long r0 = r0.Y
            int r11 = (r0 > r5 ? 1 : (r0 == r5 ? 0 : -1))
            if (r11 == 0) goto L_0x0152
            boolean r11 = r12.D()
            if (r11 == 0) goto L_0x0153
            int r11 = (r0 > r7 ? 1 : (r0 == r7 ? 0 : -1))
            if (r11 != 0) goto L_0x0153
        L_0x0152:
            r2 = r4
        L_0x0153:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ir8.b(i22, xm8):boolean");
    }

    public final boolean d(i22 i22, xm8 xm8) {
        if (i22.R(((j2b) ((g2b) this.a.get())).e) && i22.b.g()) {
            vo8 vo8 = xm8.a;
            return vo8.c != 0 && vo8.Q0 == 0;
        }
    }
}

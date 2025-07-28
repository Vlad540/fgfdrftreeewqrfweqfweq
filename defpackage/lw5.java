package defpackage;

/* renamed from: lw5  reason: default package */
public final class lw5 {
    public final t97 a;
    public final t97 b;
    public final t97 c;
    public final t97 d;

    public lw5(t97 t97, t97 t972, t97 t973, t97 t974) {
        this.a = t97;
        this.b = t972;
        this.c = t974;
        this.d = t973;
    }

    /* JADX WARNING: Removed duplicated region for block: B:15:0x005a  */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x00f3  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x00f5  */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x00fa  */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x00ff  */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x0103  */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x0145 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x0146  */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x014d  */
    /* JADX WARNING: Removed duplicated region for block: B:62:0x0157  */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x0030  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object a(vo8 r19, java.lang.Long r20, kotlin.coroutines.Continuation r21) {
        /*
            r18 = this;
            r0 = r18
            r1 = r19
            r2 = r20
            r3 = r21
            boolean r4 = r3 instanceof defpackage.jw5
            if (r4 == 0) goto L_0x001c
            r4 = r3
            jw5 r4 = (defpackage.jw5) r4
            int r5 = r4.y0
            r6 = -2147483648(0xffffffff80000000, float:-0.0)
            r7 = r5 & r6
            if (r7 == 0) goto L_0x001c
            int r5 = r5 - r6
            r4.y0 = r5
        L_0x001a:
            r10 = r4
            goto L_0x0022
        L_0x001c:
            jw5 r4 = new jw5
            r4.<init>(r0, r3)
            goto L_0x001a
        L_0x0022:
            java.lang.Object r3 = r10.w0
            pu3 r4 = defpackage.pu3.a
            int r5 = r10.y0
            java.lang.String r6 = ""
            r7 = 2
            r12 = 0
            r13 = 0
            r14 = 1
            if (r5 == 0) goto L_0x005a
            if (r5 == r14) goto L_0x0048
            if (r5 != r7) goto L_0x0040
            int r0 = r10.Z
            java.lang.Object r1 = r10.o
            mge r1 = (mge) r1
            defpackage.wx3.H(r3)
            r2 = r1
            goto L_0x0147
        L_0x0040:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r1)
            throw r0
        L_0x0048:
            java.lang.Long r0 = r10.Y
            vo8 r1 = r10.X
            java.lang.Object r2 = r10.o
            lw5 r2 = (defpackage.lw5) r2
            defpackage.wx3.H(r3)
            r17 = r2
            r2 = r0
            r0 = r17
            goto L_0x00e9
        L_0x005a:
            defpackage.wx3.H(r3)
            long r8 = r1.Y
            t97 r3 = r0.a
            java.lang.Object r3 = r3.getValue()
            f03 r3 = (f03) r3
            lqc r3 = (lqc) r3
            long r15 = r3.s()
            int r3 = (r8 > r15 ? 1 : (r8 == r15 ? 0 : -1))
            if (r3 != 0) goto L_0x007e
            int r3 = defpackage.h2a.U
            hge r5 = new hge
            r5.<init>(r3)
        L_0x0078:
            r6 = r1
            r8 = r2
            r2 = r5
            r1 = r13
            goto L_0x0112
        L_0x007e:
            if (r2 == 0) goto L_0x0088
            int r3 = defpackage.h2a.W
            hge r5 = new hge
            r5.<init>(r3)
            goto L_0x0078
        L_0x0088:
            r3 = 4
            int r5 = r1.Z0
            if (r5 != r3) goto L_0x00d0
            t97 r3 = r0.c
            java.lang.Object r3 = r3.getValue()
            bv2 r3 = (bv2) r3
            long r8 = r1.x0
            aw2 r3 = (aw2) r3
            t0c r3 = r3.m(r8)
            zqd r3 = r3.a
            java.lang.Object r3 = r3.getValue()
            i22 r3 = (i22) r3
            if (r3 == 0) goto L_0x00af
            boolean r5 = r3.U()
            if (r5 != r14) goto L_0x00af
            r5 = r14
            goto L_0x00b0
        L_0x00af:
            r5 = r13
        L_0x00b0:
            int r8 = defpackage.h2a.V
            if (r3 == 0) goto L_0x00b9
            java.lang.String r3 = r3.p()
            goto L_0x00ba
        L_0x00b9:
            r3 = r12
        L_0x00ba:
            if (r3 != 0) goto L_0x00bd
            goto L_0x00be
        L_0x00bd:
            r6 = r3
        L_0x00be:
            java.lang.Object[] r3 = new java.lang.Object[]{r6}
            jge r6 = new jge
            java.util.List r3 = defpackage.cs.g0(r3)
            r6.<init>(r8, r3)
        L_0x00cb:
            r8 = r2
            r2 = r6
            r6 = r1
            r1 = r5
            goto L_0x0112
        L_0x00d0:
            t97 r3 = r0.b
            java.lang.Object r3 = r3.getValue()
            ap3 r3 = (ap3) r3
            r10.o = r0
            r10.X = r1
            r10.Y = r2
            r10.y0 = r14
            long r8 = r1.Y
            java.lang.Comparable r3 = r3.b(r8, r10)
            if (r3 != r4) goto L_0x00e9
            return r4
        L_0x00e9:
            tf3 r3 = (tf3) r3
            if (r3 == 0) goto L_0x00f5
            boolean r5 = r3.u()
            if (r5 != r14) goto L_0x00f5
            r5 = r14
            goto L_0x00f6
        L_0x00f5:
            r5 = r13
        L_0x00f6:
            int r8 = defpackage.h2a.V
            if (r3 == 0) goto L_0x00ff
            java.lang.String r3 = r3.d()
            goto L_0x0100
        L_0x00ff:
            r3 = r12
        L_0x0100:
            if (r3 != 0) goto L_0x0103
            goto L_0x0104
        L_0x0103:
            r6 = r3
        L_0x0104:
            java.lang.Object[] r3 = new java.lang.Object[]{r6}
            jge r6 = new jge
            java.util.List r3 = defpackage.cs.g0(r3)
            r6.<init>(r8, r3)
            goto L_0x00cb
        L_0x0112:
            t97 r0 = r0.d
            java.lang.Object r0 = r0.getValue()
            r5 = r0
            ny r5 = (ny) r5
            nge r0 = nte.l
            yq4 r3 = yq4.b
            long r15 = r0.g(r3)
            float r0 = ah4.e(r15)
            android.content.res.Resources r3 = dh4.c()
            android.util.DisplayMetrics r3 = r3.getDisplayMetrics()
            float r3 = r3.density
            float r0 = r0 * r3
            int r9 = (int) r0
            r10.o = r2
            r10.X = r12
            r10.Y = r12
            r10.Z = r1
            r10.y0 = r7
            r7 = 0
            r11 = 2
            java.lang.Object r3 = ny.b(r5, r6, r7, r8, r9, r10, r11)
            if (r3 != r4) goto L_0x0146
            return r4
        L_0x0146:
            r0 = r1
        L_0x0147:
            iy r3 = (iy) r3
            java.lang.CharSequence r1 = r3.a
            if (r1 == 0) goto L_0x0152
            lge r12 = new lge
            r12.<init>(r1)
        L_0x0152:
            r4 = r12
            iw5 r8 = new iw5
            if (r0 == 0) goto L_0x0158
            r13 = r14
        L_0x0158:
            java.lang.Integer r6 = r3.d
            java.lang.Integer r7 = r3.c
            java.lang.String r5 = r3.b
            r1 = r8
            r3 = r13
            r1.<init>(r2, r3, r4, r5, r6, r7)
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.lw5.a(vo8, java.lang.Long, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0031  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0021  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object b(int r8, long r9, kotlin.coroutines.Continuation r11) {
        /*
            r7 = this;
            boolean r0 = r11 instanceof defpackage.kw5
            if (r0 == 0) goto L_0x0013
            r0 = r11
            kw5 r0 = (defpackage.kw5) r0
            int r1 = r0.Z
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.Z = r1
            goto L_0x0018
        L_0x0013:
            kw5 r0 = new kw5
            r0.<init>(r7, r11)
        L_0x0018:
            java.lang.Object r11 = r0.X
            pu3 r1 = defpackage.pu3.a
            int r2 = r0.Z
            r3 = 1
            if (r2 == 0) goto L_0x0031
            if (r2 != r3) goto L_0x0029
            int r8 = r0.o
            defpackage.wx3.H(r11)
            goto L_0x0047
        L_0x0029:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L_0x0031:
            defpackage.wx3.H(r11)
            t97 r7 = r7.c
            java.lang.Object r7 = r7.getValue()
            bv2 r7 = (bv2) r7
            r0.o = r8
            r0.Z = r3
            java.lang.Object r11 = r7.d(r9, r0)
            if (r11 != r1) goto L_0x0047
            return r1
        L_0x0047:
            i22 r11 = (i22) r11
            r11.h0()
            java.lang.CharSequence r7 = r11.y0
            boolean r2 = r11.U()
            iw5 r9 = new iw5
            int r10 = defpackage.g2a.a
            java.lang.Integer r11 = new java.lang.Integer
            r11.<init>(r8)
            java.lang.Object[] r7 = new java.lang.Object[]{r11, r7}
            fge r1 = new fge
            java.util.List r7 = defpackage.cs.g0(r7)
            r1.<init>(r7, r10, r8)
            r3 = 0
            r4 = 0
            r5 = 0
            r6 = 0
            r0 = r9
            r0.<init>(r1, r2, r3, r4, r5, r6)
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.lw5.b(int, long, kotlin.coroutines.Continuation):java.lang.Object");
    }
}

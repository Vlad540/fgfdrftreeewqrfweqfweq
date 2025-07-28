package defpackage;

/* renamed from: xh2  reason: default package */
public final class xh2 implements rj5 {
    public final /* synthetic */ int a;
    public final /* synthetic */ rj5 b;
    public final /* synthetic */ di2 c;

    public /* synthetic */ xh2(rj5 rj5, di2 di2, int i) {
        this.a = i;
        this.b = rj5;
        this.c = di2;
    }

    /* JADX WARNING: Removed duplicated region for block: B:10:0x0026  */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x0035  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x00e5  */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x00f4  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object a(java.lang.Object r14, kotlin.coroutines.Continuation r15) {
        /*
            r13 = this;
            int r0 = r13.a
            switch(r0) {
                case 0: goto L_0x00c4;
                default: goto L_0x0005;
            }
        L_0x0005:
            boolean r0 = r15 instanceof defpackage.bi2
            if (r0 == 0) goto L_0x0018
            r0 = r15
            bi2 r0 = (defpackage.bi2) r0
            int r1 = r0.X
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0018
            int r1 = r1 - r2
            r0.X = r1
            goto L_0x001d
        L_0x0018:
            bi2 r0 = new bi2
            r0.<init>(r13, r15)
        L_0x001d:
            java.lang.Object r15 = r0.o
            pu3 r1 = pu3.a
            int r2 = r0.X
            r3 = 1
            if (r2 == 0) goto L_0x0035
            if (r2 != r3) goto L_0x002d
            wx3.H(r15)
            goto L_0x00c1
        L_0x002d:
            java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
            java.lang.String r14 = "call to 'resume' before 'invoke' with coroutine"
            r13.<init>(r14)
            throw r13
        L_0x0035:
            wx3.H(r15)
            i22 r14 = (defpackage.i22) r14
            di2 r15 = r13.c
            int r2 = r15.A0
            int r2 = hr1.t(r2)
            if (r2 == 0) goto L_0x004f
            if (r2 != r3) goto L_0x0049
            int r2 = defpackage.l8a.v0
            goto L_0x0051
        L_0x0049:
            kotlin.NoWhenBranchMatchedException r13 = new kotlin.NoWhenBranchMatchedException
            r13.<init>()
            throw r13
        L_0x004f:
            int r2 = defpackage.l8a.n0
        L_0x0051:
            int r15 = r15.A0
            int r15 = hr1.t(r15)
            if (r15 == 0) goto L_0x0082
            if (r15 != r3) goto L_0x007c
            int r15 = defpackage.k8a.b
            o62 r4 = r14.b
            int r4 = r4.c()
            o62 r5 = r14.b
            int r5 = r5.c()
            java.lang.Integer r6 = new java.lang.Integer
            r6.<init>(r5)
            java.lang.Object[] r5 = new java.lang.Object[]{r6}
            fge r6 = new fge
            java.util.List r5 = cs.g0(r5)
            r6.<init>(r5, r15, r4)
            goto L_0x00a2
        L_0x007c:
            kotlin.NoWhenBranchMatchedException r13 = new kotlin.NoWhenBranchMatchedException
            r13.<init>()
            throw r13
        L_0x0082:
            int r15 = defpackage.k8a.a
            o62 r4 = r14.b
            int r4 = r4.c()
            o62 r5 = r14.b
            int r5 = r5.c()
            java.lang.Integer r6 = new java.lang.Integer
            r6.<init>(r5)
            java.lang.Object[] r5 = new java.lang.Object[]{r6}
            fge r6 = new fge
            java.util.List r5 = cs.g0(r5)
            r6.<init>(r5, r15, r4)
        L_0x00a2:
            ih2 r15 = new ih2
            boolean r4 = r14.Y()
            if (r4 == 0) goto L_0x00b2
            boolean r14 = r14.r()
            if (r14 == 0) goto L_0x00b2
            r14 = r3
            goto L_0x00b3
        L_0x00b2:
            r14 = 0
        L_0x00b3:
            r15.<init>(r2, r6, r14)
            r0.X = r3
            rj5 r13 = r13.b
            java.lang.Object r13 = r13.a(r15, r0)
            if (r13 != r1) goto L_0x00c1
            goto L_0x00c3
        L_0x00c1:
            jue r1 = jue.a
        L_0x00c3:
            return r1
        L_0x00c4:
            boolean r0 = r15 instanceof defpackage.wh2
            if (r0 == 0) goto L_0x00d7
            r0 = r15
            wh2 r0 = (defpackage.wh2) r0
            int r1 = r0.X
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x00d7
            int r1 = r1 - r2
            r0.X = r1
            goto L_0x00dc
        L_0x00d7:
            wh2 r0 = new wh2
            r0.<init>(r13, r15)
        L_0x00dc:
            java.lang.Object r15 = r0.o
            pu3 r1 = pu3.a
            int r2 = r0.X
            r3 = 1
            if (r2 == 0) goto L_0x00f4
            if (r2 != r3) goto L_0x00ec
            wx3.H(r15)
            goto L_0x01de
        L_0x00ec:
            java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
            java.lang.String r14 = "call to 'resume' before 'invoke' with coroutine"
            r13.<init>(r14)
            throw r13
        L_0x00f4:
            wx3.H(r15)
            i22 r14 = (defpackage.i22) r14
            bi8 r15 = new bi8
            di2 r2 = r13.c
            int r4 = r2.A0
            int r4 = hr1.t(r4)
            if (r4 == 0) goto L_0x0150
            if (r4 != r3) goto L_0x014a
            boolean r4 = r14.r()
            lg7 r5 = hwf.c()
            if (r4 == 0) goto L_0x0128
            int r4 = defpackage.j8a.u0
            int r6 = defpackage.phc.b
            int r7 = defpackage.l8a.Z1
            hge r8 = new hge
            r8.<init>(r7)
            xh8 r7 = new xh8
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
            r7.<init>(r4, r8, r6)
            r5.add(r7)
        L_0x0128:
            boolean r4 = defpackage.di2.t(r14)
            if (r4 == 0) goto L_0x0145
            int r4 = defpackage.j8a.D0
            int r6 = defpackage.phc.e1
            int r7 = defpackage.l8a.k2
            hge r8 = new hge
            r8.<init>(r7)
            xh8 r7 = new xh8
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
            r7.<init>(r4, r8, r6)
            r5.add(r7)
        L_0x0145:
            lg7 r4 = hwf.a(r5)
            goto L_0x0192
        L_0x014a:
            kotlin.NoWhenBranchMatchedException r13 = new kotlin.NoWhenBranchMatchedException
            r13.<init>()
            throw r13
        L_0x0150:
            boolean r4 = r14.r()
            lg7 r5 = hwf.c()
            if (r4 == 0) goto L_0x0171
            int r4 = defpackage.j8a.u0
            int r6 = defpackage.phc.b
            int r7 = defpackage.l8a.Y1
            hge r8 = new hge
            r8.<init>(r7)
            xh8 r7 = new xh8
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
            r7.<init>(r4, r8, r6)
            r5.add(r7)
        L_0x0171:
            boolean r4 = defpackage.di2.t(r14)
            if (r4 == 0) goto L_0x018e
            int r4 = defpackage.j8a.D0
            int r6 = defpackage.phc.e1
            int r7 = defpackage.l8a.k2
            hge r8 = new hge
            r8.<init>(r7)
            xh8 r7 = new xh8
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
            r7.<init>(r4, r8, r6)
            r5.add(r7)
        L_0x018e:
            lg7 r4 = hwf.a(r5)
        L_0x0192:
            hw4 r5 = hw4.a
            boolean r2 = r2.c
            if (r2 == 0) goto L_0x01d0
            o62 r14 = r14.b
            int r2 = r14.c()
            r6 = 10
            if (r2 <= r6) goto L_0x01d0
            int r8 = defpackage.j8a.W0
            int r2 = defpackage.phc.g2
            int r5 = defpackage.l8a.E2
            hge r9 = new hge
            r9.<init>(r5)
            d7d r10 = defpackage.d7d.b
            x6d r12 = new x6d
            int r14 = r14.c()
            java.lang.String r14 = java.lang.String.valueOf(r14)
            lge r5 = new lge
            r5.<init>(r14)
            r14 = 0
            r12.<init>(r5, r14)
            xh8 r14 = new xh8
            java.lang.Integer r11 = java.lang.Integer.valueOf(r2)
            r7 = r14
            r7.<init>(r8, r9, r10, r11, r12)
            java.util.List r5 = java.util.Collections.singletonList(r14)
        L_0x01d0:
            r15.<init>(r4, r5)
            r0.X = r3
            rj5 r13 = r13.b
            java.lang.Object r13 = r13.a(r15, r0)
            if (r13 != r1) goto L_0x01de
            goto L_0x01e0
        L_0x01de:
            jue r1 = jue.a
        L_0x01e0:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.xh2.a(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
    }
}

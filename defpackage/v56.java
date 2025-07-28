package defpackage;

/* renamed from: v56  reason: default package */
public final class v56 implements rj5 {
    public final /* synthetic */ int a;
    public final /* synthetic */ rj5 b;
    public final /* synthetic */ m66 c;

    public /* synthetic */ v56(rj5 rj5, m66 m66, int i) {
        this.a = i;
        this.b = rj5;
        this.c = m66;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:67:0x0122, code lost:
        if (r11 == r6) goto L_0x0124;
     */
    /* JADX WARNING: Removed duplicated region for block: B:10:0x002f  */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x003b  */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x0076  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x0082  */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x00c1  */
    /* JADX WARNING: Removed duplicated region for block: B:60:0x00ec  */
    /* JADX WARNING: Removed duplicated region for block: B:66:0x0102  */
    /* JADX WARNING: Removed duplicated region for block: B:73:0x0090 A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object a(java.lang.Object r12, kotlin.coroutines.Continuation r13) {
        /*
            r11 = this;
            r0 = 0
            jue r1 = jue.a
            rj5 r2 = r11.b
            m66 r3 = r11.c
            java.lang.String r4 = "call to 'resume' before 'invoke' with coroutine"
            r5 = 1
            pu3 r6 = pu3.a
            r7 = -2147483648(0xffffffff80000000, float:-0.0)
            int r8 = r11.a
            switch(r8) {
                case 0: goto L_0x00cf;
                case 1: goto L_0x005a;
                default: goto L_0x0013;
            }
        L_0x0013:
            boolean r0 = r13 instanceof defpackage.i66
            if (r0 == 0) goto L_0x0024
            r0 = r13
            i66 r0 = (defpackage.i66) r0
            int r8 = r0.X
            r9 = r8 & r7
            if (r9 == 0) goto L_0x0024
            int r8 = r8 - r7
            r0.X = r8
            goto L_0x0029
        L_0x0024:
            i66 r0 = new i66
            r0.<init>(r11, r13)
        L_0x0029:
            java.lang.Object r11 = r0.o
            int r13 = r0.X
            if (r13 == 0) goto L_0x003b
            if (r13 != r5) goto L_0x0035
            wx3.H(r11)
            goto L_0x0059
        L_0x0035:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            r11.<init>(r4)
            throw r11
        L_0x003b:
            wx3.H(r11)
            java.util.List r12 = (java.util.List) r12
            q46 r11 = r3.b
            boolean r11 = r11.a
            if (r11 == 0) goto L_0x0050
            g56 r11 = defpackage.g56.b
            java.util.List r11 = java.util.Collections.singletonList(r11)
            java.util.ArrayList r12 = o23.i0(r11, r12)
        L_0x0050:
            r0.X = r5
            java.lang.Object r11 = r2.a(r12, r0)
            if (r11 != r6) goto L_0x0059
            r1 = r6
        L_0x0059:
            return r1
        L_0x005a:
            boolean r8 = r13 instanceof defpackage.x56
            if (r8 == 0) goto L_0x006b
            r8 = r13
            x56 r8 = (defpackage.x56) r8
            int r9 = r8.X
            r10 = r9 & r7
            if (r10 == 0) goto L_0x006b
            int r9 = r9 - r7
            r8.X = r9
            goto L_0x0070
        L_0x006b:
            x56 r8 = new x56
            r8.<init>(r11, r13)
        L_0x0070:
            java.lang.Object r11 = r8.o
            int r13 = r8.X
            if (r13 == 0) goto L_0x0082
            if (r13 != r5) goto L_0x007c
            wx3.H(r11)
            goto L_0x00ce
        L_0x007c:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            r11.<init>(r4)
            throw r11
        L_0x0082:
            wx3.H(r11)
            java.util.List r12 = (java.util.List) r12
            java.util.ArrayList r11 = new java.util.ArrayList
            r11.<init>()
            java.util.Iterator r12 = r12.iterator()
        L_0x0090:
            boolean r13 = r12.hasNext()
            if (r13 == 0) goto L_0x00c5
            java.lang.Object r13 = r12.next()
            o46 r13 = (defpackage.o46) r13
            boolean r4 = r13.d
            if (r4 == 0) goto L_0x00b5
            k46 r4 = defpackage.k46.a
            n46 r7 = r13.a
            boolean r4 = hhd.f(r7, r4)
            if (r4 != 0) goto L_0x00b5
            l46 r4 = defpackage.l46.a
            boolean r4 = hhd.f(r7, r4)
            if (r4 == 0) goto L_0x00b3
            goto L_0x00b5
        L_0x00b3:
            r4 = 0
            goto L_0x00b6
        L_0x00b5:
            r4 = r5
        L_0x00b6:
            q46 r7 = r3.b
            boolean r7 = r7.w0
            if (r7 == 0) goto L_0x00bf
            if (r4 == 0) goto L_0x00bf
            r13 = r0
        L_0x00bf:
            if (r13 == 0) goto L_0x0090
            r11.add(r13)
            goto L_0x0090
        L_0x00c5:
            r8.X = r5
            java.lang.Object r11 = r2.a(r11, r8)
            if (r11 != r6) goto L_0x00ce
            r1 = r6
        L_0x00ce:
            return r1
        L_0x00cf:
            boolean r8 = r13 instanceof defpackage.u56
            if (r8 == 0) goto L_0x00e0
            r8 = r13
            u56 r8 = (defpackage.u56) r8
            int r9 = r8.X
            r10 = r9 & r7
            if (r10 == 0) goto L_0x00e0
            int r9 = r9 - r7
            r8.X = r9
            goto L_0x00e5
        L_0x00e0:
            u56 r8 = new u56
            r8.<init>(r11, r13)
        L_0x00e5:
            java.lang.Object r11 = r8.o
            int r13 = r8.X
            r7 = 2
            if (r13 == 0) goto L_0x0102
            if (r13 == r5) goto L_0x00fa
            if (r13 != r7) goto L_0x00f4
            wx3.H(r11)
            goto L_0x013a
        L_0x00f4:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            r11.<init>(r4)
            throw r11
        L_0x00fa:
            o46 r12 = r8.w0
            rj5 r2 = r8.Y
            wx3.H(r11)
            goto L_0x0126
        L_0x0102:
            wx3.H(r11)
            o46 r12 = (defpackage.o46) r12
            java.lang.String r11 = "album changed"
            java.lang.String r13 = "m66"
            udd.q(r13, r11)
            gl7 r11 = r3.X
            n46 r13 = r12.a
            bv6 r11 = (defpackage.bv6) r11
            java.util.List r11 = r11.c(r13)
            r8.Y = r2
            r8.w0 = r12
            r8.X = r5
            java.lang.Object r11 = defpackage.m66.q(r3, r11, r8)
            if (r11 != r6) goto L_0x0126
        L_0x0124:
            r1 = r6
            goto L_0x013a
        L_0x0126:
            java.util.List r11 = (java.util.List) r11
            wia r13 = new wia
            r13.<init>(r12, r11)
            r8.Y = r0
            r8.w0 = r0
            r8.X = r7
            java.lang.Object r11 = r2.a(r13, r8)
            if (r11 != r6) goto L_0x013a
            goto L_0x0124
        L_0x013a:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.v56.a(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
    }
}

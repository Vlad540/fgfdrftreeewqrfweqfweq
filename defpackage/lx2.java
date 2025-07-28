package defpackage;

/* renamed from: lx2  reason: default package */
public final class lx2 implements rj5 {
    public final /* synthetic */ int a;
    public final /* synthetic */ rj5 b;
    public final /* synthetic */ km4 c;

    public /* synthetic */ lx2(rj5 rj5, km4 km4, int i) {
        this.a = i;
        this.b = rj5;
        this.c = km4;
    }

    /* JADX WARNING: Removed duplicated region for block: B:10:0x0026  */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x0034  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x008d  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x009b  */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x00e1  */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x00ef  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object a(java.lang.Object r8, kotlin.coroutines.Continuation r9) {
        /*
            r7 = this;
            int r0 = r7.a
            switch(r0) {
                case 0: goto L_0x00c0;
                case 1: goto L_0x006c;
                default: goto L_0x0005;
            }
        L_0x0005:
            boolean r8 = r9 instanceof defpackage.ux2
            if (r8 == 0) goto L_0x0018
            r8 = r9
            ux2 r8 = (defpackage.ux2) r8
            int r0 = r8.X
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r2 = r0 & r1
            if (r2 == 0) goto L_0x0018
            int r0 = r0 - r1
            r8.X = r0
            goto L_0x001d
        L_0x0018:
            ux2 r8 = new ux2
            r8.<init>(r7, r9)
        L_0x001d:
            java.lang.Object r9 = r8.o
            pu3 r0 = pu3.a
            int r1 = r8.X
            r2 = 1
            if (r1 == 0) goto L_0x0034
            if (r1 != r2) goto L_0x002c
            wx3.H(r9)
            goto L_0x0069
        L_0x002c:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L_0x0034:
            wx3.H(r9)
            rj5 r9 = r7.b
            km4 r1 = r7.c
            java.lang.Object r1 = r1.a
            java.lang.String r1 = (java.lang.String) r1
            fn6 r3 = udd.e
            if (r3 != 0) goto L_0x0044
            goto L_0x0052
        L_0x0044:
            boolean r4 = r3.c()
            if (r4 == 0) goto L_0x0052
            tn7 r4 = defpackage.tn7.X
            r5 = 0
            java.lang.String r6 = "big_flow: map"
            r3.d(r4, r1, r6, r5)
        L_0x0052:
            km4 r7 = r7.c
            java.lang.Object r1 = r7.X
            ul7 r1 = (defpackage.ul7) r1
            java.lang.String r7 = r7.j()
            pda r7 = r1.t(r7)
            r8.X = r2
            java.lang.Object r7 = r9.a(r7, r8)
            if (r7 != r0) goto L_0x0069
            goto L_0x006b
        L_0x0069:
            jue r0 = jue.a
        L_0x006b:
            return r0
        L_0x006c:
            boolean r0 = r9 instanceof defpackage.tx2
            if (r0 == 0) goto L_0x007f
            r0 = r9
            tx2 r0 = (defpackage.tx2) r0
            int r1 = r0.X
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x007f
            int r1 = r1 - r2
            r0.X = r1
            goto L_0x0084
        L_0x007f:
            tx2 r0 = new tx2
            r0.<init>(r7, r9)
        L_0x0084:
            java.lang.Object r9 = r0.o
            pu3 r1 = pu3.a
            int r2 = r0.X
            r3 = 1
            if (r2 == 0) goto L_0x009b
            if (r2 != r3) goto L_0x0093
            wx3.H(r9)
            goto L_0x00bd
        L_0x0093:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L_0x009b:
            wx3.H(r9)
            r9 = r8
            java.lang.Number r9 = (java.lang.Number) r9
            r9.floatValue()
            km4 r9 = r7.c
            java.lang.Object r9 = r9.Y
            jg8 r9 = (defpackage.jg8) r9
            bk9 r9 = r9.r()
            boolean r9 = r9 instanceof defpackage.wj9
            if (r9 == 0) goto L_0x00bd
            r0.X = r3
            rj5 r7 = r7.b
            java.lang.Object r7 = r7.a(r8, r0)
            if (r7 != r1) goto L_0x00bd
            goto L_0x00bf
        L_0x00bd:
            jue r1 = jue.a
        L_0x00bf:
            return r1
        L_0x00c0:
            boolean r0 = r9 instanceof defpackage.kx2
            if (r0 == 0) goto L_0x00d3
            r0 = r9
            kx2 r0 = (defpackage.kx2) r0
            int r1 = r0.X
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x00d3
            int r1 = r1 - r2
            r0.X = r1
            goto L_0x00d8
        L_0x00d3:
            kx2 r0 = new kx2
            r0.<init>(r7, r9)
        L_0x00d8:
            java.lang.Object r9 = r0.o
            pu3 r1 = pu3.a
            int r2 = r0.X
            r3 = 1
            if (r2 == 0) goto L_0x00ef
            if (r2 != r3) goto L_0x00e7
            wx3.H(r9)
            goto L_0x0109
        L_0x00e7:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L_0x00ef:
            wx3.H(r9)
            java.lang.String r8 = (java.lang.String) r8
            km4 r8 = r7.c
            java.lang.Object r8 = r8.Y
            jg8 r8 = (defpackage.jg8) r8
            bk9 r8 = r8.r()
            r0.X = r3
            rj5 r7 = r7.b
            java.lang.Object r7 = r7.a(r8, r0)
            if (r7 != r1) goto L_0x0109
            goto L_0x010b
        L_0x0109:
            jue r1 = jue.a
        L_0x010b:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.lx2.a(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
    }
}

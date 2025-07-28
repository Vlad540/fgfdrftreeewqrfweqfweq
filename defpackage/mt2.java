package defpackage;

/* renamed from: mt2  reason: default package */
public final class mt2 implements rj5 {
    public final /* synthetic */ int a;
    public final /* synthetic */ rj5 b;
    public final /* synthetic */ fu2 c;

    public /* synthetic */ mt2(rj5 rj5, fu2 fu2, int i) {
        this.a = i;
        this.b = rj5;
        this.c = fu2;
    }

    /* JADX WARNING: Removed duplicated region for block: B:10:0x002f  */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x003b  */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x00a1  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x00ad  */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x0108  */
    /* JADX WARNING: Removed duplicated region for block: B:61:0x0114  */
    /* JADX WARNING: Removed duplicated region for block: B:72:0x0147  */
    /* JADX WARNING: Removed duplicated region for block: B:76:0x0153  */
    /* JADX WARNING: Removed duplicated region for block: B:89:0x0192  */
    /* JADX WARNING: Removed duplicated region for block: B:93:0x019e  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object a(java.lang.Object r12, kotlin.coroutines.Continuation r13) {
        /*
            r11 = this;
            r0 = 0
            jue r1 = defpackage.jue.a
            rj5 r2 = r11.b
            fu2 r3 = r11.c
            java.lang.String r4 = "call to 'resume' before 'invoke' with coroutine"
            r5 = 1
            pu3 r6 = defpackage.pu3.a
            r7 = -2147483648(0xffffffff80000000, float:-0.0)
            int r8 = r11.a
            switch(r8) {
                case 0: goto L_0x0176;
                case 1: goto L_0x012b;
                case 2: goto L_0x00ec;
                case 3: goto L_0x0085;
                default: goto L_0x0013;
            }
        L_0x0013:
            boolean r8 = r13 instanceof defpackage.bu2
            if (r8 == 0) goto L_0x0024
            r8 = r13
            bu2 r8 = (defpackage.bu2) r8
            int r9 = r8.X
            r10 = r9 & r7
            if (r10 == 0) goto L_0x0024
            int r9 = r9 - r7
            r8.X = r9
            goto L_0x0029
        L_0x0024:
            bu2 r8 = new bu2
            r8.<init>(r11, r13)
        L_0x0029:
            java.lang.Object r11 = r8.o
            int r13 = r8.X
            if (r13 == 0) goto L_0x003b
            if (r13 != r5) goto L_0x0035
            defpackage.wx3.H(r11)
            goto L_0x0084
        L_0x0035:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            r11.<init>(r4)
            throw r11
        L_0x003b:
            defpackage.wx3.H(r11)
            java.util.List r12 = (java.util.List) r12
            zb9 r11 = new zb9
            r11.<init>((java.lang.Object) r0)
            java.util.Iterator r12 = r12.iterator()
        L_0x0049:
            boolean r13 = r12.hasNext()
            if (r13 == 0) goto L_0x007b
            java.lang.Object r13 = r12.next()
            java.lang.Number r13 = (java.lang.Number) r13
            long r9 = r13.longValue()
            bv2 r13 = defpackage.fu2.r(r3)
            aw2 r13 = (aw2) r13
            t0c r13 = r13.m(r9)
            zqd r13 = r13.a
            java.lang.Object r13 = r13.getValue()
            i22 r13 = (i22) r13
            if (r13 == 0) goto L_0x0049
            tf3 r13 = r13.k()
            if (r13 == 0) goto L_0x0049
            long r9 = r13.n()
            r11.a(r9)
            goto L_0x0049
        L_0x007b:
            r8.X = r5
            java.lang.Object r11 = r2.a(r11, r8)
            if (r11 != r6) goto L_0x0084
            r1 = r6
        L_0x0084:
            return r1
        L_0x0085:
            boolean r8 = r13 instanceof defpackage.yt2
            if (r8 == 0) goto L_0x0096
            r8 = r13
            yt2 r8 = (defpackage.yt2) r8
            int r9 = r8.X
            r10 = r9 & r7
            if (r10 == 0) goto L_0x0096
            int r9 = r9 - r7
            r8.X = r9
            goto L_0x009b
        L_0x0096:
            yt2 r8 = new yt2
            r8.<init>(r11, r13)
        L_0x009b:
            java.lang.Object r11 = r8.o
            int r13 = r8.X
            if (r13 == 0) goto L_0x00ad
            if (r13 != r5) goto L_0x00a7
            defpackage.wx3.H(r11)
            goto L_0x00eb
        L_0x00a7:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            r11.<init>(r4)
            throw r11
        L_0x00ad:
            defpackage.wx3.H(r11)
            wia r12 = (defpackage.wia) r12
            java.lang.Object r11 = r12.a
            hq2 r11 = (defpackage.hq2) r11
            java.lang.Object r12 = r12.b
            java.util.List r12 = (java.util.List) r12
            java.util.Iterator r12 = r12.iterator()
        L_0x00be:
            boolean r13 = r12.hasNext()
            if (r13 == 0) goto L_0x00d6
            java.lang.Object r13 = r12.next()
            r4 = r13
            ep5 r4 = (ep5) r4
            java.lang.String r4 = r4.a
            java.lang.String r7 = r3.c
            boolean r4 = defpackage.hhd.f(r4, r7)
            if (r4 == 0) goto L_0x00be
            goto L_0x00d7
        L_0x00d6:
            r13 = r0
        L_0x00d7:
            ep5 r13 = (ep5) r13
            if (r13 == 0) goto L_0x00dd
            java.util.List r0 = r13.F0
        L_0x00dd:
            wia r12 = new wia
            r12.<init>(r11, r0)
            r8.X = r5
            java.lang.Object r11 = r2.a(r12, r8)
            if (r11 != r6) goto L_0x00eb
            r1 = r6
        L_0x00eb:
            return r1
        L_0x00ec:
            boolean r0 = r13 instanceof defpackage.pt2
            if (r0 == 0) goto L_0x00fd
            r0 = r13
            pt2 r0 = (defpackage.pt2) r0
            int r8 = r0.X
            r9 = r8 & r7
            if (r9 == 0) goto L_0x00fd
            int r8 = r8 - r7
            r0.X = r8
            goto L_0x0102
        L_0x00fd:
            pt2 r0 = new pt2
            r0.<init>(r11, r13)
        L_0x0102:
            java.lang.Object r11 = r0.o
            int r13 = r0.X
            if (r13 == 0) goto L_0x0114
            if (r13 != r5) goto L_0x010e
            defpackage.wx3.H(r11)
            goto L_0x012a
        L_0x010e:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            r11.<init>(r4)
            throw r11
        L_0x0114:
            defpackage.wx3.H(r11)
            java.lang.Number r12 = (java.lang.Number) r12
            r12.longValue()
            ok3 r11 = r3.b
            r11.b()
            r0.X = r5
            java.lang.Object r11 = r2.a(r1, r0)
            if (r11 != r6) goto L_0x012a
            r1 = r6
        L_0x012a:
            return r1
        L_0x012b:
            boolean r0 = r13 instanceof defpackage.ot2
            if (r0 == 0) goto L_0x013c
            r0 = r13
            ot2 r0 = (defpackage.ot2) r0
            int r8 = r0.X
            r9 = r8 & r7
            if (r9 == 0) goto L_0x013c
            int r8 = r8 - r7
            r0.X = r8
            goto L_0x0141
        L_0x013c:
            ot2 r0 = new ot2
            r0.<init>(r11, r13)
        L_0x0141:
            java.lang.Object r11 = r0.o
            int r13 = r0.X
            if (r13 == 0) goto L_0x0153
            if (r13 != r5) goto L_0x014d
            defpackage.wx3.H(r11)
            goto L_0x0175
        L_0x014d:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            r11.<init>(r4)
            throw r11
        L_0x0153:
            defpackage.wx3.H(r11)
            r11 = r12
            java.lang.Number r11 = (java.lang.Number) r11
            r11.longValue()
            t0c r11 = r3.K0
            zqd r11 = r11.a
            java.lang.Object r11 = r11.getValue()
            hq2 r11 = (defpackage.hq2) r11
            boolean r11 = defpackage.fu2.q(r3, r11)
            if (r11 == 0) goto L_0x0175
            r0.X = r5
            java.lang.Object r11 = r2.a(r12, r0)
            if (r11 != r6) goto L_0x0175
            r1 = r6
        L_0x0175:
            return r1
        L_0x0176:
            boolean r0 = r13 instanceof defpackage.lt2
            if (r0 == 0) goto L_0x0187
            r0 = r13
            lt2 r0 = (defpackage.lt2) r0
            int r8 = r0.X
            r9 = r8 & r7
            if (r9 == 0) goto L_0x0187
            int r8 = r8 - r7
            r0.X = r8
            goto L_0x018c
        L_0x0187:
            lt2 r0 = new lt2
            r0.<init>(r11, r13)
        L_0x018c:
            java.lang.Object r11 = r0.o
            int r13 = r0.X
            if (r13 == 0) goto L_0x019e
            if (r13 != r5) goto L_0x0198
            defpackage.wx3.H(r11)
            goto L_0x01c9
        L_0x0198:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            r11.<init>(r4)
            throw r11
        L_0x019e:
            defpackage.wx3.H(r11)
            r11 = r12
            hq2 r11 = (defpackage.hq2) r11
            k77[] r13 = defpackage.fu2.Z0
            r3.getClass()
            hq2 r13 = defpackage.hq2.c
            boolean r11 = defpackage.hhd.f(r11, r13)
            if (r11 != 0) goto L_0x01b3
            r11 = 0
            goto L_0x01be
        L_0x01b3:
            grd r11 = r3.J0
            java.lang.Object r11 = r11.getValue()
            boolean r11 = defpackage.hhd.f(r11, r13)
            r11 = r11 ^ r5
        L_0x01be:
            if (r11 != 0) goto L_0x01c9
            r0.X = r5
            java.lang.Object r11 = r2.a(r12, r0)
            if (r11 != r6) goto L_0x01c9
            r1 = r6
        L_0x01c9:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.mt2.a(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
    }
}

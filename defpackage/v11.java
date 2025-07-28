package defpackage;

/* renamed from: v11  reason: default package */
public final class v11 implements pj5 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object o;

    public /* synthetic */ v11(Object obj, Object obj2, Object obj3, int i) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
        this.o = obj3;
    }

    /* JADX WARNING: type inference failed for: r12v3, types: [l7c, java.lang.Object] */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x00ad, code lost:
        if (r11.a(r8, r0) == r7) goto L_0x00af;
     */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x007b  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x0097  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object c(defpackage.rj5 r11, kotlin.coroutines.Continuation r12) {
        /*
            r10 = this;
            r0 = 3
            r1 = 1
            r2 = 2
            r3 = 0
            java.lang.Object r4 = r10.b
            java.lang.Object r5 = r10.o
            jue r6 = defpackage.jue.a
            pu3 r7 = defpackage.pu3.a
            java.lang.Object r8 = r10.c
            int r9 = r10.a
            switch(r9) {
                case 0: goto L_0x00f5;
                case 1: goto L_0x00e2;
                case 2: goto L_0x00cf;
                case 3: goto L_0x005d;
                case 4: goto L_0x0040;
                case 5: goto L_0x0028;
                default: goto L_0x0013;
            }
        L_0x0013:
            a40 r10 = new a40
            x19 r8 = (x19) r8
            aqc r5 = (aqc) r5
            r0 = 8
            r10.<init>(r11, r8, r5, r0)
            pj5 r4 = (defpackage.pj5) r4
            java.lang.Object r10 = r4.c(r10, r12)
            if (r10 != r7) goto L_0x0027
            r6 = r10
        L_0x0027:
            return r6
        L_0x0028:
            ba1 r10 = new ba1
            pj5[] r4 = (defpackage.pj5[]) r4
            r10.<init>(r4, r0)
            qc6 r0 = new qc6
            java.util.List r8 = (java.util.List) r8
            tc6 r5 = (tc6) r5
            r0.<init>(r3, r8, r5)
            java.lang.Object r10 = defpackage.d8.g(r11, r10, r0, r12, r4)
            if (r10 != r7) goto L_0x003f
            r6 = r10
        L_0x003f:
            return r6
        L_0x0040:
            pj5 r4 = (defpackage.pj5) r4
            pj5 r8 = (defpackage.pj5) r8
            pj5[] r10 = new defpackage.pj5[r2]
            r0 = 0
            r10[r0] = r4
            r10[r1] = r8
            yr3 r0 = yr3.Z
            zl5 r1 = new zl5
            k26 r5 = (defpackage.k26) r5
            r2 = 4
            r1.<init>((java.lang.Object) r5, (kotlin.coroutines.Continuation) r3, (int) r2)
            java.lang.Object r10 = defpackage.d8.g(r11, r0, r1, r12, r10)
            if (r10 != r7) goto L_0x005c
            r6 = r10
        L_0x005c:
            return r6
        L_0x005d:
            boolean r0 = r12 instanceof defpackage.sm5
            if (r0 == 0) goto L_0x0070
            r0 = r12
            sm5 r0 = (defpackage.sm5) r0
            int r4 = r0.X
            r5 = -2147483648(0xffffffff80000000, float:-0.0)
            r9 = r4 & r5
            if (r9 == 0) goto L_0x0070
            int r4 = r4 - r5
            r0.X = r4
            goto L_0x0075
        L_0x0070:
            sm5 r0 = new sm5
            r0.<init>(r10, r12)
        L_0x0075:
            java.lang.Object r12 = r0.o
            int r4 = r0.X
            if (r4 == 0) goto L_0x0097
            if (r4 == r1) goto L_0x008b
            if (r4 != r2) goto L_0x0083
            defpackage.wx3.H(r12)
            goto L_0x00ce
        L_0x0083:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r11)
            throw r10
        L_0x008b:
            l7c r10 = r0.x0
            rj5 r11 = r0.w0
            v11 r1 = r0.Z
            defpackage.wx3.H(r12)
            r12 = r10
            r10 = r1
            goto L_0x00b1
        L_0x0097:
            defpackage.wx3.H(r12)
            l7c r12 = new l7c
            r12.<init>()
            r12.a = r8
            r0.Z = r10
            r0.w0 = r11
            r0.x0 = r12
            r0.X = r1
            java.lang.Object r1 = r11.a(r8, r0)
            if (r1 != r7) goto L_0x00b1
        L_0x00af:
            r6 = r7
            goto L_0x00ce
        L_0x00b1:
            java.lang.Object r1 = r10.b
            pj5 r1 = (defpackage.pj5) r1
            a40 r4 = new a40
            java.lang.Object r10 = r10.o
            k26 r10 = (defpackage.k26) r10
            r5 = 7
            r4.<init>(r12, r10, r11, r5)
            r0.Z = r3
            r0.w0 = r3
            r0.x0 = r3
            r0.X = r2
            java.lang.Object r10 = r1.c(r4, r0)
            if (r10 != r7) goto L_0x00ce
            goto L_0x00af
        L_0x00ce:
            return r6
        L_0x00cf:
            a40 r10 = new a40
            nn2 r8 = (defpackage.nn2) r8
            t97 r5 = (defpackage.t97) r5
            r10.<init>(r11, r8, r5, r0)
            pj5 r4 = (defpackage.pj5) r4
            java.lang.Object r10 = r4.c(r10, r12)
            if (r10 != r7) goto L_0x00e1
            r6 = r10
        L_0x00e1:
            return r6
        L_0x00e2:
            a40 r10 = new a40
            stf r8 = (defpackage.stf) r8
            android.content.Context r5 = (android.content.Context) r5
            r10.<init>(r11, r8, r5, r2)
            pj5 r4 = (defpackage.pj5) r4
            java.lang.Object r10 = r4.c(r10, r12)
            if (r10 != r7) goto L_0x00f4
            r6 = r10
        L_0x00f4:
            return r6
        L_0x00f5:
            a40 r10 = new a40
            x11 r8 = (defpackage.x11) r8
            i22 r5 = (i22) r5
            r10.<init>(r11, r8, r5, r1)
            pj5 r4 = (defpackage.pj5) r4
            java.lang.Object r10 = r4.c(r10, r12)
            if (r10 != r7) goto L_0x0107
            r6 = r10
        L_0x0107:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.v11.c(rj5, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public v11(Object obj, pj5 pj5, k26 k26) {
        this.a = 3;
        this.c = obj;
        this.b = pj5;
        this.o = k26;
    }
}

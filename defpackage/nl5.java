package defpackage;

/* renamed from: nl5  reason: default package */
public final class nl5 implements pj5 {
    public final /* synthetic */ int a;
    public final /* synthetic */ pj5 b;
    public final /* synthetic */ int c;

    public /* synthetic */ nl5(pj5 pj5, int i, int i2) {
        this.a = i2;
        this.b = pj5;
        this.c = i;
    }

    /* JADX WARNING: type inference failed for: r0v1, types: [j7c, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r2v2, types: [j7c, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r9v6, types: [l7c, java.lang.Object] */
    /* JADX WARNING: Removed duplicated region for block: B:13:0x003d  */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x0055  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x007b  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x00ad  */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x00bf  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object c(defpackage.rj5 r8, kotlin.coroutines.Continuation r9) {
        /*
            r7 = this;
            int r0 = r7.a
            switch(r0) {
                case 0: goto L_0x00ea;
                case 1: goto L_0x008c;
                case 2: goto L_0x001b;
                default: goto L_0x0005;
            }
        L_0x0005:
            m33 r0 = new m33
            int r1 = r7.c
            r2 = 1
            r0.<init>(r1, r2, r8)
            pj5 r7 = r7.b
            java.lang.Object r7 = r7.c(r0, r9)
            pu3 r8 = defpackage.pu3.a
            if (r7 != r8) goto L_0x0018
            goto L_0x001a
        L_0x0018:
            jue r7 = defpackage.jue.a
        L_0x001a:
            return r7
        L_0x001b:
            boolean r0 = r9 instanceof defpackage.om5
            if (r0 == 0) goto L_0x002e
            r0 = r9
            om5 r0 = (defpackage.om5) r0
            int r1 = r0.X
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x002e
            int r1 = r1 - r2
            r0.X = r1
            goto L_0x0033
        L_0x002e:
            om5 r0 = new om5
            r0.<init>(r7, r9)
        L_0x0033:
            java.lang.Object r9 = r0.o
            pu3 r1 = defpackage.pu3.a
            int r2 = r0.X
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L_0x0055
            if (r2 == r4) goto L_0x004d
            if (r2 != r3) goto L_0x0045
            defpackage.wx3.H(r9)
            goto L_0x0089
        L_0x0045:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L_0x004d:
            l7c r7 = r0.w0
            rj5 r8 = r0.Z
            defpackage.wx3.H(r9)
            goto L_0x0075
        L_0x0055:
            defpackage.wx3.H(r9)
            l7c r9 = new l7c
            r9.<init>()
            ek5 r2 = new ek5
            int r5 = r7.c
            r6 = 1
            r2.<init>(r9, r5, r8, r6)
            r0.Z = r8
            r0.w0 = r9
            r0.X = r4
            pj5 r7 = r7.b
            java.lang.Object r7 = r7.c(r2, r0)
            if (r7 != r1) goto L_0x0074
            goto L_0x008b
        L_0x0074:
            r7 = r9
        L_0x0075:
            java.lang.Object r7 = r7.a
            java.util.ArrayList r7 = (java.util.ArrayList) r7
            if (r7 == 0) goto L_0x0089
            r9 = 0
            r0.Z = r9
            r0.w0 = r9
            r0.X = r3
            java.lang.Object r7 = r8.a(r7, r0)
            if (r7 != r1) goto L_0x0089
            goto L_0x008b
        L_0x0089:
            jue r1 = defpackage.jue.a
        L_0x008b:
            return r1
        L_0x008c:
            boolean r0 = r9 instanceof defpackage.ql5
            if (r0 == 0) goto L_0x009f
            r0 = r9
            ql5 r0 = (defpackage.ql5) r0
            int r1 = r0.X
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x009f
            int r1 = r1 - r2
            r0.X = r1
            goto L_0x00a4
        L_0x009f:
            ql5 r0 = new ql5
            r0.<init>(r7, r9)
        L_0x00a4:
            java.lang.Object r9 = r0.o
            pu3 r1 = defpackage.pu3.a
            int r2 = r0.X
            r3 = 1
            if (r2 == 0) goto L_0x00bf
            if (r2 != r3) goto L_0x00b7
            java.lang.Object r7 = r0.Z
            defpackage.wx3.H(r9)     // Catch:{ AbortFlowException -> 0x00b5 }
            goto L_0x00e6
        L_0x00b5:
            r8 = move-exception
            goto L_0x00e2
        L_0x00b7:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L_0x00bf:
            defpackage.wx3.H(r9)
            java.lang.Object r9 = new java.lang.Object
            r9.<init>()
            j7c r2 = new j7c
            r2.<init>()
            pj5 r4 = r7.b     // Catch:{ AbortFlowException -> 0x00e0 }
            bk2 r5 = new bk2     // Catch:{ AbortFlowException -> 0x00e0 }
            int r7 = r7.c     // Catch:{ AbortFlowException -> 0x00e0 }
            r5.<init>(r2, r7, r8, r9)     // Catch:{ AbortFlowException -> 0x00e0 }
            r0.Z = r9     // Catch:{ AbortFlowException -> 0x00e0 }
            r0.X = r3     // Catch:{ AbortFlowException -> 0x00e0 }
            java.lang.Object r7 = r4.c(r5, r0)     // Catch:{ AbortFlowException -> 0x00e0 }
            if (r7 != r1) goto L_0x00e6
            goto L_0x00e8
        L_0x00e0:
            r8 = move-exception
            r7 = r9
        L_0x00e2:
            java.lang.Object r9 = r8.a
            if (r9 != r7) goto L_0x00e9
        L_0x00e6:
            jue r1 = defpackage.jue.a
        L_0x00e8:
            return r1
        L_0x00e9:
            throw r8
        L_0x00ea:
            j7c r0 = new j7c
            r0.<init>()
            h42 r1 = new h42
            int r2 = r7.c
            r1.<init>(r0, r2, r8)
            pj5 r7 = r7.b
            java.lang.Object r7 = r7.c(r1, r9)
            pu3 r8 = defpackage.pu3.a
            if (r7 != r8) goto L_0x0101
            goto L_0x0103
        L_0x0101:
            jue r7 = defpackage.jue.a
        L_0x0103:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.nl5.c(rj5, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public nl5(pj5 pj5, int i) {
        this.a = i;
        switch (i) {
            case 2:
                this.b = pj5;
                this.c = 20;
                return;
            default:
                this.b = pj5;
                this.c = 1;
                return;
        }
    }
}

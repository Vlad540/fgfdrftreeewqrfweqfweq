package defpackage;

/* renamed from: cv5  reason: default package */
public final class cv5 {
    public final t97 a;

    public cv5(w4 w4Var) {
        this.a = w4Var.d(lw5.class);
    }

    public static tt8 c(iw5 iw5, boolean z, boolean z2) {
        Integer num;
        Integer valueOf;
        mge mge = iw5.a;
        if (!z) {
            if (z2) {
                valueOf = Integer.valueOf(phc.L1);
            } else if (!z2) {
                valueOf = Integer.valueOf(phc.K1);
            }
            num = valueOf;
            return new tt8(3, mge, iw5.b, iw5.c, iw5.d, iw5.f, iw5.e, z2, num);
        }
        num = null;
        return new tt8(3, mge, iw5.b, iw5.c, iw5.d, iw5.f, iw5.e, z2, num);
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0035  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0021  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object a(vo8 r5, java.lang.Long r6, boolean r7, boolean r8, kotlin.coroutines.Continuation r9) {
        /*
            r4 = this;
            boolean r0 = r9 instanceof defpackage.av5
            if (r0 == 0) goto L_0x0013
            r0 = r9
            av5 r0 = (defpackage.av5) r0
            int r1 = r0.x0
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.x0 = r1
            goto L_0x0018
        L_0x0013:
            av5 r0 = new av5
            r0.<init>(r4, r9)
        L_0x0018:
            java.lang.Object r9 = r0.Z
            pu3 r1 = defpackage.pu3.a
            int r2 = r0.x0
            r3 = 1
            if (r2 == 0) goto L_0x0035
            if (r2 != r3) goto L_0x002d
            boolean r8 = r0.X
            boolean r7 = r0.o
            cv5 r4 = r0.Y
            defpackage.wx3.H(r9)
            goto L_0x004f
        L_0x002d:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L_0x0035:
            defpackage.wx3.H(r9)
            t97 r9 = r4.a
            java.lang.Object r9 = r9.getValue()
            lw5 r9 = (defpackage.lw5) r9
            r0.Y = r4
            r0.o = r7
            r0.X = r8
            r0.x0 = r3
            java.lang.Object r9 = r9.a(r5, r6, r0)
            if (r9 != r1) goto L_0x004f
            return r1
        L_0x004f:
            iw5 r9 = (defpackage.iw5) r9
            r4.getClass()
            tt8 r4 = c(r9, r7, r8)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cv5.a(vo8, java.lang.Long, boolean, boolean, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0033  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0021  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object b(int r5, long r6, boolean r8, kotlin.coroutines.Continuation r9) {
        /*
            r4 = this;
            boolean r0 = r9 instanceof defpackage.bv5
            if (r0 == 0) goto L_0x0013
            r0 = r9
            bv5 r0 = (defpackage.bv5) r0
            int r1 = r0.w0
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.w0 = r1
            goto L_0x0018
        L_0x0013:
            bv5 r0 = new bv5
            r0.<init>(r4, r9)
        L_0x0018:
            java.lang.Object r9 = r0.Y
            pu3 r1 = defpackage.pu3.a
            int r2 = r0.w0
            r3 = 1
            if (r2 == 0) goto L_0x0033
            if (r2 != r3) goto L_0x002b
            boolean r8 = r0.o
            cv5 r4 = r0.X
            defpackage.wx3.H(r9)
            goto L_0x004b
        L_0x002b:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L_0x0033:
            defpackage.wx3.H(r9)
            t97 r9 = r4.a
            java.lang.Object r9 = r9.getValue()
            lw5 r9 = (defpackage.lw5) r9
            r0.X = r4
            r0.o = r8
            r0.w0 = r3
            java.lang.Object r9 = r9.b(r5, r6, r0)
            if (r9 != r1) goto L_0x004b
            return r1
        L_0x004b:
            iw5 r9 = (defpackage.iw5) r9
            r4.getClass()
            r4 = 0
            tt8 r4 = c(r9, r4, r8)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cv5.b(int, long, boolean, kotlin.coroutines.Continuation):java.lang.Object");
    }
}

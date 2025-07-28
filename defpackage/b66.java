package defpackage;

import kotlin.coroutines.Continuation;

/* renamed from: b66  reason: default package */
public final class b66 extends l5e implements i26 {
    public int X;
    public /* synthetic */ Object Y;
    public final /* synthetic */ m66 Z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public b66(m66 m66, Continuation continuation) {
        super(2, continuation);
        this.Z = m66;
    }

    public final Object invoke(Object obj, Object obj2) {
        return n((ou3) obj, (Continuation) obj2).o(jue.a);
    }

    public final Continuation n(Object obj, Continuation continuation) {
        b66 b66 = new b66(this.Z, continuation);
        b66.Y = obj;
        return b66;
    }

    /* JADX WARNING: Removed duplicated region for block: B:28:0x00a4 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x00a5  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object o(java.lang.Object r11) {
        /*
            r10 = this;
            pu3 r0 = pu3.a
            int r1 = r10.X
            jue r2 = jue.a
            r3 = 2
            r4 = 1
            java.lang.String r5 = "m66"
            m66 r6 = r10.Z
            r7 = 0
            if (r1 == 0) goto L_0x002f
            if (r1 == r4) goto L_0x0024
            if (r1 != r3) goto L_0x001c
            java.lang.Object r10 = r10.Y
            ou3 r10 = (ou3) r10
            wx3.H(r11)
            goto L_0x009c
        L_0x001c:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r11)
            throw r10
        L_0x0024:
            java.lang.Object r1 = r10.Y
            ou3 r1 = (ou3) r1
            wx3.H(r11)
            r9 = r1
            r1 = r11
            r11 = r9
            goto L_0x0060
        L_0x002f:
            wx3.H(r11)
            java.lang.Object r11 = r10.Y
            ou3 r11 = (ou3) r11
            java.lang.String r1 = "loadMoreItems(): loadingItemsJob start"
            udd.q(r5, r1)
            grd r1 = r6.D0
            java.lang.Boolean r8 = java.lang.Boolean.TRUE
            r1.m(r7, r8)
            grd r1 = r6.F0
            java.lang.Object r1 = r1.getValue()
            o46 r1 = (defpackage.o46) r1
            if (r1 != 0) goto L_0x004d
            return r2
        L_0x004d:
            j56 r8 = r6.C0
            int r8 = r8.b
            r10.Y = r11
            r10.X = r4
            gl7 r4 = r6.X
            bv6 r4 = (defpackage.bv6) r4
            java.lang.Object r1 = r4.d(r1, r8, r10)
            if (r1 != r0) goto L_0x0060
            return r0
        L_0x0060:
            fl7 r1 = (defpackage.fl7) r1
            grd r4 = r6.D0
            java.lang.Boolean r8 = java.lang.Boolean.FALSE
            r4.m(r7, r8)
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            java.lang.String r8 = "loadMoreItems(): get result "
            r4.<init>(r8)
            r4.append(r1)
            java.lang.String r4 = r4.toString()
            udd.q(r5, r4)
            boolean r4 = n1g.A(r11)
            if (r4 != 0) goto L_0x0081
            return r2
        L_0x0081:
            boolean r4 = r1 instanceof defpackage.dl7
            if (r4 == 0) goto L_0x0086
            return r2
        L_0x0086:
            boolean r4 = r1 instanceof defpackage.el7
            if (r4 == 0) goto L_0x00ba
            el7 r1 = (defpackage.el7) r1
            java.util.List r1 = r1.a
            r10.Y = r11
            r10.X = r3
            java.lang.Object r10 = defpackage.m66.q(r6, r1, r10)
            if (r10 != r0) goto L_0x0099
            return r0
        L_0x0099:
            r9 = r11
            r11 = r10
            r10 = r9
        L_0x009c:
            java.util.List r11 = (java.util.List) r11
            boolean r10 = n1g.A(r10)
            if (r10 != 0) goto L_0x00a5
            return r2
        L_0x00a5:
            grd r10 = r6.A0
            java.lang.Object r0 = r10.getValue()
            java.util.Collection r0 = (java.util.Collection) r0
            java.util.ArrayList r11 = o23.i0(r0, r11)
            r10.m(r7, r11)
            java.lang.String r10 = "loadMoreItems(): loadingItemsJob finish"
            udd.q(r5, r10)
            return r2
        L_0x00ba:
            kotlin.NoWhenBranchMatchedException r10 = new kotlin.NoWhenBranchMatchedException
            r10.<init>()
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.b66.o(java.lang.Object):java.lang.Object");
    }
}

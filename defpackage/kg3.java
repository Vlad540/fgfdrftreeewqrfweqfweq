package defpackage;

import kotlin.coroutines.Continuation;

/* renamed from: kg3  reason: default package */
public final class kg3 extends l5e implements i26 {
    public int X;
    public final /* synthetic */ bh3 Y;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public kg3(bh3 bh3, Continuation continuation) {
        super(2, continuation);
        this.Y = bh3;
    }

    public final Object invoke(Object obj, Object obj2) {
        return n((ou3) obj, (Continuation) obj2).o(jue.a);
    }

    public final Continuation n(Object obj, Continuation continuation) {
        return new kg3(this.Y, continuation);
    }

    /* JADX WARNING: Removed duplicated region for block: B:19:0x0072  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x00a5  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object o(java.lang.Object r8) {
        /*
            r7 = this;
            pu3 r0 = pu3.a
            int r1 = r7.X
            r2 = 3
            r3 = 2
            r4 = 1
            r5 = 0
            bh3 r6 = r7.Y
            if (r1 == 0) goto L_0x0026
            if (r1 == r4) goto L_0x0022
            if (r1 == r3) goto L_0x001e
            if (r1 != r2) goto L_0x0016
            wx3.H(r8)
            goto L_0x0087
        L_0x0016:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L_0x001e:
            wx3.H(r8)
            goto L_0x0047
        L_0x0022:
            wx3.H(r8)
            goto L_0x0032
        L_0x0026:
            wx3.H(r8)
            r7.X = r4
            java.lang.Object r8 = defpackage.bh3.r(r6, r7)
            if (r8 != r0) goto L_0x0032
            return r0
        L_0x0032:
            bg3 r8 = (defpackage.bg3) r8
            grd r1 = r6.y0
            java.util.List r8 = java.util.Collections.singletonList(r8)
            r1.m(r5, r8)
            r7.X = r3
            r8 = 0
            java.io.Serializable r8 = defpackage.bh3.q(r6, r8, r7)
            if (r8 != r0) goto L_0x0047
            return r0
        L_0x0047:
            wia r8 = (wia) r8
            java.lang.Object r1 = r8.a
            java.util.List r1 = (java.util.List) r1
            java.lang.Object r8 = r8.b
            java.lang.Number r8 = (java.lang.Number) r8
            int r8 = r8.intValue()
            grd r3 = r6.y0
            java.lang.Object r4 = r3.getValue()
            java.util.Collection r4 = (java.util.Collection) r4
            java.util.ArrayList r1 = o23.i0(r4, r1)
            r3.m(r5, r1)
        L_0x0064:
            grd r1 = r6.y0
            java.lang.Object r1 = r1.getValue()
            java.util.List r1 = (java.util.List) r1
            int r1 = r1.size()
            if (r1 >= r8) goto L_0x00a5
            grd r8 = r6.y0
            java.lang.Object r8 = r8.getValue()
            java.util.List r8 = (java.util.List) r8
            int r8 = r8.size()
            r7.X = r2
            java.io.Serializable r8 = defpackage.bh3.q(r6, r8, r7)
            if (r8 != r0) goto L_0x0087
            return r0
        L_0x0087:
            wia r8 = (wia) r8
            java.lang.Object r1 = r8.a
            java.util.List r1 = (java.util.List) r1
            java.lang.Object r8 = r8.b
            java.lang.Number r8 = (java.lang.Number) r8
            int r8 = r8.intValue()
            grd r3 = r6.y0
            java.lang.Object r4 = r3.getValue()
            java.util.Collection r4 = (java.util.Collection) r4
            java.util.ArrayList r1 = o23.i0(r4, r1)
            r3.m(r5, r1)
            goto L_0x0064
        L_0x00a5:
            jue r7 = jue.a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.kg3.o(java.lang.Object):java.lang.Object");
    }
}

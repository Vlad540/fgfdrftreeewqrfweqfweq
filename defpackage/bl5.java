package defpackage;

import kotlin.coroutines.Continuation;

/* renamed from: bl5  reason: default package */
public final class bl5 extends l5e implements i26 {
    public int X;
    public /* synthetic */ Object Y;
    public final /* synthetic */ rj5 Z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public bl5(rj5 rj5, Continuation continuation) {
        super(2, continuation);
        this.Z = rj5;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((bl5) n(new m12(((m12) obj).a), (Continuation) obj2)).o(jue.a);
    }

    public final Continuation n(Object obj, Continuation continuation) {
        bl5 bl5 = new bl5(this.Z, continuation);
        bl5.Y = obj;
        return bl5;
    }

    /* JADX WARNING: Removed duplicated region for block: B:15:0x0037  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x0041  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object o(java.lang.Object r4) {
        /*
            r3 = this;
            pu3 r0 = defpackage.pu3.a
            int r1 = r3.X
            r2 = 1
            if (r1 == 0) goto L_0x0017
            if (r1 != r2) goto L_0x000f
            java.lang.Object r3 = r3.Y
            defpackage.wx3.H(r4)
            goto L_0x0032
        L_0x000f:
            java.lang.IllegalStateException r3 = new java.lang.IllegalStateException
            java.lang.String r4 = "call to 'resume' before 'invoke' with coroutine"
            r3.<init>(r4)
            throw r3
        L_0x0017:
            defpackage.wx3.H(r4)
            java.lang.Object r4 = r3.Y
            m12 r4 = (defpackage.m12) r4
            java.lang.Object r4 = r4.a
            boolean r1 = r4 instanceof defpackage.l12
            if (r1 != 0) goto L_0x0033
            r3.Y = r4
            r3.X = r2
            rj5 r1 = r3.Z
            java.lang.Object r3 = r1.a(r4, r3)
            if (r3 != r0) goto L_0x0031
            return r0
        L_0x0031:
            r3 = r4
        L_0x0032:
            r4 = r3
        L_0x0033:
            boolean r3 = r4 instanceof defpackage.k12
            if (r3 == 0) goto L_0x0041
            java.lang.Throwable r3 = defpackage.m12.a(r4)
            if (r3 != 0) goto L_0x0040
            java.lang.Boolean r3 = java.lang.Boolean.FALSE
            return r3
        L_0x0040:
            throw r3
        L_0x0041:
            java.lang.Boolean r3 = java.lang.Boolean.TRUE
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bl5.o(java.lang.Object):java.lang.Object");
    }
}

package defpackage;

import kotlin.coroutines.Continuation;

/* renamed from: b82  reason: default package */
public final class b82 extends l5e implements i26 {
    public String X;
    public b92 Y;
    public int Z;
    public final /* synthetic */ b92 w0;
    public final /* synthetic */ String x0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public b82(b92 b92, String str, Continuation continuation) {
        super(2, continuation);
        this.w0 = b92;
        this.x0 = str;
    }

    public final Object invoke(Object obj, Object obj2) {
        return n((ou3) obj, (Continuation) obj2).o(jue.a);
    }

    public final Continuation n(Object obj, Continuation continuation) {
        return new b82(this.w0, this.x0, continuation);
    }

    /* JADX WARNING: Removed duplicated region for block: B:18:0x0070 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x0071  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object o(java.lang.Object r9) {
        /*
            r8 = this;
            r0 = 1
            pu3 r1 = pu3.a
            int r2 = r8.Z
            b92 r3 = r8.w0
            r4 = 3
            r5 = 2
            if (r2 == 0) goto L_0x002e
            if (r2 == r0) goto L_0x002a
            if (r2 == r5) goto L_0x001f
            if (r2 != r4) goto L_0x0017
            java.lang.String r8 = r8.X
            wx3.H(r9)
            goto L_0x0072
        L_0x0017:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L_0x001f:
            b92 r3 = r8.Y
            java.lang.String r2 = r8.X
            wx3.H(r9)
            r7 = r2
            r2 = r9
            r9 = r7
            goto L_0x0061
        L_0x002a:
            wx3.H(r9)
            goto L_0x004c
        L_0x002e:
            wx3.H(r9)
            java.lang.String r9 = defpackage.b92.O0
            udc r9 = r3.e()
            r8.Z = r0
            r9.getClass()
            ndc r2 = new ndc
            java.lang.String r6 = r8.x0
            r2.<init>(r9, r6, r0)
            aec r9 = r9.a
            java.lang.Object r9 = a24.m0(r9, r2, r8)
            if (r9 != r1) goto L_0x004c
            return r1
        L_0x004c:
            java.lang.String r9 = (java.lang.String) r9
            java.lang.String r2 = defpackage.b92.O0
            udc r2 = r3.e()
            r8.X = r9
            r8.Y = r3
            r8.Z = r5
            java.lang.Object r2 = r2.d(r8)
            if (r2 != r1) goto L_0x0061
            return r1
        L_0x0061:
            java.util.List r2 = (java.util.List) r2
            r8.X = r9
            r5 = 0
            r8.Y = r5
            r8.Z = r4
            java.lang.Object r8 = defpackage.b92.j(r3, r2, r0, r8)
            if (r8 != r1) goto L_0x0071
            return r1
        L_0x0071:
            r8 = r9
        L_0x0072:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.b82.o(java.lang.Object):java.lang.Object");
    }
}

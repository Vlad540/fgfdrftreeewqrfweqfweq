package defpackage;

import kotlin.coroutines.Continuation;

/* renamed from: z82  reason: default package */
public final class z82 extends l5e implements i26 {
    public b92 X;
    public int Y;
    public final /* synthetic */ b92 Z;
    public final /* synthetic */ String w0;
    public final /* synthetic */ String x0;
    public final /* synthetic */ CharSequence y0 = null;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public z82(b92 b92, String str, String str2, Continuation continuation) {
        super(2, continuation);
        this.Z = b92;
        this.w0 = str;
        this.x0 = str2;
    }

    public final Object invoke(Object obj, Object obj2) {
        return n((ou3) obj, (Continuation) obj2).o(jue.a);
    }

    public final Continuation n(Object obj, Continuation continuation) {
        return new z82(this.Z, this.w0, this.x0, continuation);
    }

    /* JADX WARNING: Removed duplicated region for block: B:22:0x006f A[RETURN] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object o(java.lang.Object r11) {
        /*
            r10 = this;
            pu3 r0 = pu3.a
            int r1 = r10.Y
            r2 = 1
            r3 = 0
            b92 r4 = r10.Z
            r5 = 3
            r6 = 2
            if (r1 == 0) goto L_0x0028
            if (r1 == r2) goto L_0x0024
            if (r1 == r6) goto L_0x001e
            if (r1 != r5) goto L_0x0016
            wx3.H(r11)
            goto L_0x0070
        L_0x0016:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r11)
            throw r10
        L_0x001e:
            b92 r4 = r10.X
            wx3.H(r11)
            goto L_0x0063
        L_0x0024:
            wx3.H(r11)
            goto L_0x0052
        L_0x0028:
            wx3.H(r11)
            java.lang.String r11 = defpackage.b92.O0
            udc r11 = r4.e()
            java.lang.CharSequence r1 = r10.y0
            if (r1 == 0) goto L_0x003a
            java.lang.String r1 = r1.toString()
            goto L_0x003b
        L_0x003a:
            r1 = r3
        L_0x003b:
            r10.Y = r2
            r11.getClass()
            rdc r7 = new rdc
            java.lang.String r8 = r10.x0
            java.lang.String r9 = r10.w0
            r7.<init>(r11, r8, r1, r9)
            aec r11 = r11.a
            java.lang.Object r11 = r1g.h(r11, r7, r10)
            if (r11 != r0) goto L_0x0052
            return r0
        L_0x0052:
            java.lang.String r11 = defpackage.b92.O0
            udc r11 = r4.e()
            r10.X = r4
            r10.Y = r6
            java.lang.Object r11 = r11.d(r10)
            if (r11 != r0) goto L_0x0063
            return r0
        L_0x0063:
            java.util.List r11 = (java.util.List) r11
            r10.X = r3
            r10.Y = r5
            java.lang.Object r10 = defpackage.b92.j(r4, r11, r2, r10)
            if (r10 != r0) goto L_0x0070
            return r0
        L_0x0070:
            jue r10 = jue.a
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.z82.o(java.lang.Object):java.lang.Object");
    }
}

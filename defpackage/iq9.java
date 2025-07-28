package defpackage;

import kotlin.coroutines.Continuation;

/* renamed from: iq9  reason: default package */
public final class iq9 extends l5e implements i26 {
    public i22 X;
    public int Y;
    public final /* synthetic */ kq9 Z;
    public final /* synthetic */ long w0;
    public final /* synthetic */ long x0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public iq9(kq9 kq9, long j, long j2, Continuation continuation) {
        super(2, continuation);
        this.Z = kq9;
        this.w0 = j;
        this.x0 = j2;
    }

    public final Object invoke(Object obj, Object obj2) {
        return n((ou3) obj, (Continuation) obj2).o(jue.a);
    }

    public final Continuation n(Object obj, Continuation continuation) {
        return new iq9(this.Z, this.w0, this.x0, continuation);
    }

    /* JADX WARNING: Removed duplicated region for block: B:21:0x005c  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object o(java.lang.Object r11) {
        /*
            r10 = this;
            pu3 r0 = pu3.a
            int r1 = r10.Y
            jue r2 = jue.a
            r3 = 3
            r4 = 2
            r5 = 1
            kq9 r6 = r10.Z
            if (r1 == 0) goto L_0x0029
            if (r1 == r5) goto L_0x0025
            if (r1 == r4) goto L_0x001f
            if (r1 != r3) goto L_0x0017
            wx3.H(r11)
            goto L_0x0078
        L_0x0017:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r11)
            throw r10
        L_0x001f:
            i22 r1 = r10.X
            wx3.H(r11)
            goto L_0x0054
        L_0x0025:
            wx3.H(r11)
            goto L_0x0041
        L_0x0029:
            wx3.H(r11)
            t97 r11 = r6.b
            java.lang.Object r11 = r11.getValue()
            bv2 r11 = (defpackage.bv2) r11
            r10.Y = r5
            aw2 r11 = (defpackage.aw2) r11
            long r7 = r10.w0
            java.lang.Comparable r11 = r11.j(r7, r10)
            if (r11 != r0) goto L_0x0041
            return r0
        L_0x0041:
            r1 = r11
            i22 r1 = (defpackage.i22) r1
            if (r1 != 0) goto L_0x0047
            return r2
        L_0x0047:
            r10.X = r1
            r10.Y = r4
            long r4 = r10.x0
            java.lang.Object r11 = defpackage.kq9.b(r6, r1, r4, r10)
            if (r11 != r0) goto L_0x0054
            return r0
        L_0x0054:
            java.lang.Boolean r11 = (java.lang.Boolean) r11
            boolean r11 = r11.booleanValue()
            if (r11 == 0) goto L_0x0078
            t97 r11 = r6.X
            java.lang.Object r11 = r11.getValue()
            r4 = r11
            mr9 r4 = (defpackage.mr9) r4
            o62 r11 = r1.b
            long r5 = r11.a
            r11 = 0
            r10.X = r11
            r10.Y = r3
            long r7 = r10.x0
            r9 = r10
            java.lang.Object r10 = r4.g(r5, r7, r9)
            if (r10 != r0) goto L_0x0078
            return r0
        L_0x0078:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.iq9.o(java.lang.Object):java.lang.Object");
    }
}

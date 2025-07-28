package defpackage;

import kotlin.coroutines.Continuation;

/* renamed from: bv  reason: default package */
public final class bv extends l5e implements i26 {
    public int X;
    public int Y;
    public final /* synthetic */ yc4 Z;
    public final /* synthetic */ yc4 w0;
    public final /* synthetic */ fw x0;
    public final /* synthetic */ long y0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public bv(zc4 zc4, zc4 zc42, fw fwVar, long j, Continuation continuation) {
        super(2, continuation);
        this.Z = zc4;
        this.w0 = zc42;
        this.x0 = fwVar;
        this.y0 = j;
    }

    public final Object invoke(Object obj, Object obj2) {
        return n((ou3) obj, (Continuation) obj2).o(jue.a);
    }

    public final Continuation n(Object obj, Continuation continuation) {
        return new bv(this.Z, this.w0, this.x0, this.y0, continuation);
    }

    /* JADX WARNING: Removed duplicated region for block: B:21:0x005e  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object o(java.lang.Object r8) {
        /*
            r7 = this;
            pu3 r0 = pu3.a
            int r1 = r7.Y
            r2 = 3
            r3 = 2
            r4 = 1
            if (r1 == 0) goto L_0x0025
            if (r1 == r4) goto L_0x0021
            if (r1 == r3) goto L_0x001b
            if (r1 != r2) goto L_0x0013
            wx3.H(r8)
            goto L_0x0067
        L_0x0013:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L_0x001b:
            int r1 = r7.X
            wx3.H(r8)
            goto L_0x0046
        L_0x0021:
            wx3.H(r8)
            goto L_0x0033
        L_0x0025:
            wx3.H(r8)
            r7.Y = r4
            yc4 r8 = r7.Z
            java.lang.Object r8 = r8.a(r7)
            if (r8 != r0) goto L_0x0033
            return r0
        L_0x0033:
            java.lang.Number r8 = (java.lang.Number) r8
            int r1 = r8.intValue()
            r7.X = r1
            r7.Y = r3
            yc4 r8 = r7.w0
            java.lang.Object r8 = r8.a(r7)
            if (r8 != r0) goto L_0x0046
            return r0
        L_0x0046:
            java.lang.Number r8 = (java.lang.Number) r8
            int r8 = r8.intValue()
            if (r1 > 0) goto L_0x0050
            if (r8 <= 0) goto L_0x0067
        L_0x0050:
            k77[] r8 = defpackage.fw.F
            fw r8 = r7.x0
            long r3 = r8.i()
            long r5 = r7.y0
            int r1 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r1 != 0) goto L_0x0067
            r7.Y = r2
            java.lang.Object r7 = r8.s(r5, r7)
            if (r7 != r0) goto L_0x0067
            return r0
        L_0x0067:
            jue r7 = jue.a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bv.o(java.lang.Object):java.lang.Object");
    }
}

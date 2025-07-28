package defpackage;

import kotlin.coroutines.Continuation;

/* renamed from: p40  reason: default package */
public final class p40 extends l5e implements i26 {
    public /* synthetic */ float X;
    public final /* synthetic */ r40 Y;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public p40(r40 r40, Continuation continuation) {
        super(2, continuation);
        this.Y = r40;
    }

    public final Object invoke(Object obj, Object obj2) {
        Float valueOf = Float.valueOf(((Number) obj).floatValue());
        jue jue = jue.a;
        n(valueOf, (Continuation) obj2).o(jue);
        return jue;
    }

    public final Continuation n(Object obj, Continuation continuation) {
        p40 p40 = new p40(this.Y, continuation);
        p40.X = ((Number) obj).floatValue();
        return p40;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x002d, code lost:
        if (hhd.f(r1, qr4.b) != false) goto L_0x0043;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object o(java.lang.Object r5) {
        /*
            r4 = this;
            wx3.H(r5)
            float r5 = r4.X
            java.lang.Float r0 = new java.lang.Float
            r0.<init>(r5)
            r40 r4 = r4.Y
            x40 r5 = r4.U0
            r1 = 0
            if (r5 == 0) goto L_0x0014
            java.lang.Long r5 = r5.a
            goto L_0x0015
        L_0x0014:
            r5 = r1
        L_0x0015:
            t60 r2 = r4.H0
            if (r5 == 0) goto L_0x0043
            java.lang.Long r3 = r4.S0
            boolean r3 = r5.equals(r3)
            if (r3 == 0) goto L_0x0030
            x40 r3 = r4.U0
            if (r3 == 0) goto L_0x0027
            o20 r1 = r3.c
        L_0x0027:
            qr4 r3 = qr4.b
            boolean r1 = hhd.f(r1, r3)
            if (r1 == 0) goto L_0x0030
            goto L_0x0043
        L_0x0030:
            boolean r1 = r2.K0
            if (r1 == 0) goto L_0x0035
            goto L_0x0048
        L_0x0035:
            float r0 = r0.floatValue()
            java.lang.Long r4 = r4.S0
            boolean r4 = r5.equals(r4)
            r2.c(r0, r4)
            goto L_0x0048
        L_0x0043:
            r4 = 0
            r5 = 0
            r2.c(r4, r5)
        L_0x0048:
            jue r4 = jue.a
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.p40.o(java.lang.Object):java.lang.Object");
    }
}

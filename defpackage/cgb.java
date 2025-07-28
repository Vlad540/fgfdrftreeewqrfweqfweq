package defpackage;

import kotlin.coroutines.Continuation;

/* renamed from: cgb  reason: default package */
public final class cgb extends l5e implements i26 {
    public int X;
    public final /* synthetic */ fgb Y;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public cgb(fgb fgb, Continuation continuation) {
        super(2, continuation);
        this.Y = fgb;
    }

    public final Object invoke(Object obj, Object obj2) {
        return n((ou3) obj, (Continuation) obj2).o(jue.a);
    }

    public final Continuation n(Object obj, Continuation continuation) {
        return new cgb(this.Y, continuation);
    }

    /* JADX WARNING: Removed duplicated region for block: B:16:0x003b  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object o(java.lang.Object r6) {
        /*
            r5 = this;
            pu3 r0 = pu3.a
            int r1 = r5.X
            r2 = 2
            r3 = 1
            fgb r4 = r5.Y
            if (r1 == 0) goto L_0x001e
            if (r1 == r3) goto L_0x001a
            if (r1 != r2) goto L_0x0012
            wx3.H(r6)
            goto L_0x0037
        L_0x0012:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L_0x001a:
            wx3.H(r6)
            goto L_0x002c
        L_0x001e:
            wx3.H(r6)
            h5b r6 = r4.T0
            r5.X = r3
            java.lang.Object r6 = r6.B(r5)
            if (r6 != r0) goto L_0x002c
            return r0
        L_0x002c:
            h5b r6 = r4.T0
            r5.X = r2
            java.lang.Object r6 = r6.n(r5)
            if (r6 != r0) goto L_0x0037
            return r0
        L_0x0037:
            i22 r6 = (defpackage.i22) r6
            if (r6 == 0) goto L_0x0049
            l05 r5 = r4.F0
            vdb r0 = new vdb
            r6b r1 = defpackage.r6b.LOCAL_CHAT
            long r2 = r6.a
            r0.<init>(r2, r1)
            defpackage.taf.o(r5, r0)
        L_0x0049:
            jue r5 = jue.a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cgb.o(java.lang.Object):java.lang.Object");
    }
}

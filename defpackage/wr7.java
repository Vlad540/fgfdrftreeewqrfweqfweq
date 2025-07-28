package defpackage;

import kotlin.coroutines.Continuation;

/* renamed from: wr7  reason: default package */
public final class wr7 extends l5e implements i26 {
    public int X;
    public /* synthetic */ Object Y;
    public final /* synthetic */ xr7 Z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public wr7(xr7 xr7, Continuation continuation) {
        super(2, continuation);
        this.Z = xr7;
    }

    public final Object invoke(Object obj, Object obj2) {
        return n((ou3) obj, (Continuation) obj2).o(jue.a);
    }

    public final Continuation n(Object obj, Continuation continuation) {
        wr7 wr7 = new wr7(this.Z, continuation);
        wr7.Y = obj;
        return wr7;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v3, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v5, resolved type: ou3} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object o(java.lang.Object r7) {
        /*
            r6 = this;
            pu3 r0 = pu3.a
            int r1 = r6.X
            jue r2 = jue.a
            r3 = 2
            r4 = 1
            if (r1 == 0) goto L_0x0022
            if (r1 == r4) goto L_0x001a
            if (r1 != r3) goto L_0x0012
            wx3.H(r7)
            goto L_0x0059
        L_0x0012:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L_0x001a:
            java.lang.Object r1 = r6.Y
            ou3 r1 = (ou3) r1
            wx3.H(r7)
            goto L_0x0037
        L_0x0022:
            wx3.H(r7)
            java.lang.Object r7 = r6.Y
            r1 = r7
            ou3 r1 = (ou3) r1
            r6.Y = r1
            r6.X = r4
            r4 = 10000(0x2710, double:4.9407E-320)
            java.lang.Object r7 = defpackage.ek8.q(r4, r6)
            if (r7 != r0) goto L_0x0037
            return r0
        L_0x0037:
            boolean r7 = n1g.A(r1)
            if (r7 != 0) goto L_0x003e
            return r2
        L_0x003e:
            xr7 r7 = r6.Z
            pae r1 = r7.a
            n3a r1 = (n3a) r1
            zr7 r1 = r1.c()
            vr7 r4 = new vr7
            r5 = 0
            r4.<init>(r7, r5)
            r6.Y = r5
            r6.X = r3
            java.lang.Object r6 = xs7.U(r1, r4, r6)
            if (r6 != r0) goto L_0x0059
            return r0
        L_0x0059:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.wr7.o(java.lang.Object):java.lang.Object");
    }
}

package defpackage;

import kotlin.coroutines.Continuation;

/* renamed from: d86  reason: default package */
public final class d86 extends l5e implements i26 {
    public bv2 X;
    public int Y;
    public final /* synthetic */ g86 Z;
    public final /* synthetic */ z63 w0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public d86(g86 g86, a73 a73, Continuation continuation) {
        super(2, continuation);
        this.Z = g86;
        this.w0 = a73;
    }

    public final Object invoke(Object obj, Object obj2) {
        return n((ou3) obj, (Continuation) obj2).o(jue.a);
    }

    public final Continuation n(Object obj, Continuation continuation) {
        return new d86(this.Z, this.w0, continuation);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v8, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v2, resolved type: bv2} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object o(java.lang.Object r6) {
        /*
            r5 = this;
            pu3 r0 = pu3.a
            int r1 = r5.Y
            r2 = 2
            r3 = 1
            if (r1 == 0) goto L_0x001e
            if (r1 == r3) goto L_0x0018
            if (r1 != r2) goto L_0x0010
            wx3.H(r6)
            goto L_0x004d
        L_0x0010:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L_0x0018:
            bv2 r1 = r5.X
            wx3.H(r6)
            goto L_0x003b
        L_0x001e:
            wx3.H(r6)
            g86 r6 = r5.Z
            t97 r6 = r6.b
            java.lang.Object r6 = r6.getValue()
            r1 = r6
            bv2 r1 = (defpackage.bv2) r1
            r5.X = r1
            r5.Y = r3
            z63 r6 = r5.w0
            a73 r6 = (a73) r6
            java.lang.Object r6 = r6.awaitInternal(r5)
            if (r6 != r0) goto L_0x003b
            return r0
        L_0x003b:
            java.lang.Number r6 = (java.lang.Number) r6
            long r3 = r6.longValue()
            r6 = 0
            r5.X = r6
            r5.Y = r2
            java.lang.Object r6 = r1.d(r3, r5)
            if (r6 != r0) goto L_0x004d
            return r0
        L_0x004d:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.d86.o(java.lang.Object):java.lang.Object");
    }
}

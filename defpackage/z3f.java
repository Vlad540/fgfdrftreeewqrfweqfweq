package defpackage;

import kotlin.coroutines.Continuation;

/* renamed from: z3f  reason: default package */
public final class z3f extends l5e implements i26 {
    public int X;
    public /* synthetic */ Object Y;
    public final /* synthetic */ d4f Z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public z3f(d4f d4f, Continuation continuation) {
        super(2, continuation);
        this.Z = d4f;
    }

    public final Object invoke(Object obj, Object obj2) {
        return n((rj5) obj, (Continuation) obj2).o(jue.a);
    }

    public final Continuation n(Object obj, Continuation continuation) {
        z3f z3f = new z3f(this.Z, continuation);
        z3f.Y = obj;
        return z3f;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v2, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v2, resolved type: rj5} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object o(java.lang.Object r5) {
        /*
            r4 = this;
            pu3 r0 = pu3.a
            int r1 = r4.X
            r2 = 2
            r3 = 1
            if (r1 == 0) goto L_0x0020
            if (r1 == r3) goto L_0x0018
            if (r1 != r2) goto L_0x0010
            wx3.H(r5)
            goto L_0x0041
        L_0x0010:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L_0x0018:
            java.lang.Object r1 = r4.Y
            rj5 r1 = (rj5) r1
            wx3.H(r5)
            goto L_0x0035
        L_0x0020:
            wx3.H(r5)
            java.lang.Object r5 = r4.Y
            r1 = r5
            rj5 r1 = (rj5) r1
            r4.Y = r1
            r4.X = r3
            d4f r5 = r4.Z
            java.lang.Object r5 = r5.a(r4)
            if (r5 != r0) goto L_0x0035
            return r0
        L_0x0035:
            r3 = 0
            r4.Y = r3
            r4.X = r2
            java.lang.Object r4 = r1.a(r5, r4)
            if (r4 != r0) goto L_0x0041
            return r0
        L_0x0041:
            jue r4 = jue.a
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.z3f.o(java.lang.Object):java.lang.Object");
    }
}

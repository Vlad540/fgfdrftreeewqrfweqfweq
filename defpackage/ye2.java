package defpackage;

import kotlin.coroutines.Continuation;

/* renamed from: ye2  reason: default package */
public final class ye2 extends l5e implements i26 {
    public Object X;
    public l05 Y;
    public int Z;
    public final /* synthetic */ gf2 w0;
    public final /* synthetic */ rh8 x0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ye2(gf2 gf2, rh8 rh8, Continuation continuation) {
        super(2, continuation);
        this.w0 = gf2;
        this.x0 = rh8;
    }

    public final Object invoke(Object obj, Object obj2) {
        return n((ou3) obj, (Continuation) obj2).o(jue.a);
    }

    public final Continuation n(Object obj, Continuation continuation) {
        return new ye2(this.w0, this.x0, continuation);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v3, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v2, resolved type: gf2} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object o(java.lang.Object r10) {
        /*
            r9 = this;
            pu3 r0 = pu3.a
            int r1 = r9.Z
            jue r2 = jue.a
            rh8 r3 = r9.x0
            r4 = 2
            r5 = 1
            gf2 r6 = r9.w0
            if (r1 == 0) goto L_0x002d
            if (r1 == r5) goto L_0x0025
            if (r1 != r4) goto L_0x001d
            l05 r0 = r9.Y
            java.lang.Object r9 = r9.X
            r6 = r9
            gf2 r6 = (defpackage.gf2) r6
            wx3.H(r10)
            goto L_0x0065
        L_0x001d:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L_0x0025:
            java.lang.Object r1 = r9.X
            i22 r1 = (defpackage.i22) r1
            wx3.H(r10)
            goto L_0x0048
        L_0x002d:
            wx3.H(r10)
            k77[] r10 = defpackage.gf2.V0
            i22 r1 = r6.v()
            if (r1 != 0) goto L_0x0039
            return r2
        L_0x0039:
            long r7 = r3.j()
            r9.X = r1
            r9.Z = r5
            java.lang.Object r10 = r6.y(r7, r9)
            if (r10 != r0) goto L_0x0048
            return r0
        L_0x0048:
            xm8 r10 = (defpackage.xm8) r10
            if (r10 != 0) goto L_0x004d
            return r2
        L_0x004d:
            l05 r5 = r6.O0
            r7e r7 = r6.L0
            java.lang.Object r7 = r7.getValue()
            za2 r7 = (defpackage.za2) r7
            r9.X = r6
            r9.Y = r5
            r9.Z = r4
            java.lang.Object r10 = r7.b(r1, r10, r3, r9)
            if (r10 != r0) goto L_0x0064
            return r0
        L_0x0064:
            r0 = r5
        L_0x0065:
            k77[] r9 = defpackage.gf2.V0
            r6.getClass()
            defpackage.taf.o(r0, r10)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ye2.o(java.lang.Object):java.lang.Object");
    }
}

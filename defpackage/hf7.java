package defpackage;

import kotlin.coroutines.Continuation;

/* renamed from: hf7  reason: default package */
public final class hf7 extends l5e implements i26 {
    public int X;
    public /* synthetic */ Object Y;
    public final /* synthetic */ ne7 Z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public hf7(ne7 ne7, Continuation continuation) {
        super(2, continuation);
        this.Z = ne7;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((hf7) n((rj5) obj, (Continuation) obj2)).o(jue.a);
    }

    public final Continuation n(Object obj, Continuation continuation) {
        hf7 hf7 = new hf7(this.Z, continuation);
        hf7.Y = obj;
        return hf7;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v3, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v2, resolved type: rj5} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object o(java.lang.Object r6) {
        /*
            r5 = this;
            pu3 r0 = defpackage.pu3.a
            int r1 = r5.X
            r2 = 2
            r3 = 1
            if (r1 == 0) goto L_0x0020
            if (r1 == r3) goto L_0x0018
            if (r1 != r2) goto L_0x0010
            defpackage.wx3.H(r6)
            goto L_0x0043
        L_0x0010:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L_0x0018:
            java.lang.Object r1 = r5.Y
            rj5 r1 = (defpackage.rj5) r1
            defpackage.wx3.H(r6)
            goto L_0x0035
        L_0x0020:
            defpackage.wx3.H(r6)
            java.lang.Object r6 = r5.Y
            r1 = r6
            rj5 r1 = (defpackage.rj5) r1
            r5.Y = r1
            r5.X = r3
            r3 = 300(0x12c, double:1.48E-321)
            java.lang.Object r6 = ek8.q(r3, r5)
            if (r6 != r0) goto L_0x0035
            return r0
        L_0x0035:
            r6 = 0
            r5.Y = r6
            r5.X = r2
            ne7 r6 = r5.Z
            java.lang.Object r5 = r1.a(r6, r5)
            if (r5 != r0) goto L_0x0043
            return r0
        L_0x0043:
            jue r5 = defpackage.jue.a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.hf7.o(java.lang.Object):java.lang.Object");
    }
}

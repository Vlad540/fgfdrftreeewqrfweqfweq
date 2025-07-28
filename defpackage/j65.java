package defpackage;

import kotlin.coroutines.Continuation;

/* renamed from: j65  reason: default package */
public final class j65 extends l5e implements i26 {
    public int X;
    public /* synthetic */ Object Y;
    public final /* synthetic */ String Z;
    public final /* synthetic */ m65 w0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public j65(m65 m65, String str, Continuation continuation) {
        super(2, continuation);
        this.Z = str;
        this.w0 = m65;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((j65) n((rj5) obj, (Continuation) obj2)).o(jue.a);
    }

    public final Continuation n(Object obj, Continuation continuation) {
        j65 j65 = new j65(this.w0, this.Z, continuation);
        j65.Y = obj;
        return j65;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v2, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v2, resolved type: rj5} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object o(java.lang.Object r7) {
        /*
            r6 = this;
            pu3 r0 = defpackage.pu3.a
            int r1 = r6.X
            r2 = 2
            r3 = 1
            if (r1 == 0) goto L_0x0020
            if (r1 == r3) goto L_0x0018
            if (r1 != r2) goto L_0x0010
            defpackage.wx3.H(r7)
            goto L_0x0059
        L_0x0010:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L_0x0018:
            java.lang.Object r1 = r6.Y
            rj5 r1 = (defpackage.rj5) r1
            defpackage.wx3.H(r7)
            goto L_0x004d
        L_0x0020:
            defpackage.wx3.H(r7)
            java.lang.Object r7 = r6.Y
            r1 = r7
            rj5 r1 = (defpackage.rj5) r1
            pn2 r7 = new pn2
            dfa r4 = dfa.z1
            r5 = 13
            r7.<init>(r4, r5)
            java.lang.String r4 = "url"
            java.lang.String r5 = r6.Z
            r7.s(r4, r5)
            m65 r4 = r6.w0
            t97 r4 = r4.b
            java.lang.Object r4 = r4.getValue()
            sce r4 = (sce) r4
            r6.Y = r1
            r6.X = r3
            java.lang.Object r7 = r4.e(r7, r6)
            if (r7 != r0) goto L_0x004d
            return r0
        L_0x004d:
            r3 = 0
            r6.Y = r3
            r6.X = r2
            java.lang.Object r6 = r1.a(r7, r6)
            if (r6 != r0) goto L_0x0059
            return r0
        L_0x0059:
            jue r6 = defpackage.jue.a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.j65.o(java.lang.Object):java.lang.Object");
    }
}

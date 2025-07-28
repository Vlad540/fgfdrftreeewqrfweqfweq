package defpackage;

import kotlin.coroutines.Continuation;

/* renamed from: vd2  reason: default package */
public final class vd2 extends l5e implements i26 {
    public int X;
    public /* synthetic */ Object Y;
    public final /* synthetic */ zd2 Z;
    public final /* synthetic */ dt w0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public vd2(zd2 zd2, dt dtVar, Continuation continuation) {
        super(2, continuation);
        this.Z = zd2;
        this.w0 = dtVar;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((vd2) n((rj5) obj, (Continuation) obj2)).o(jue.a);
    }

    public final Continuation n(Object obj, Continuation continuation) {
        vd2 vd2 = new vd2(this.Z, this.w0, continuation);
        vd2.Y = obj;
        return vd2;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v2, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v2, resolved type: rj5} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object o(java.lang.Object r5) {
        /*
            r4 = this;
            pu3 r0 = defpackage.pu3.a
            int r1 = r4.X
            r2 = 2
            r3 = 1
            if (r1 == 0) goto L_0x0020
            if (r1 == r3) goto L_0x0018
            if (r1 != r2) goto L_0x0010
            defpackage.wx3.H(r5)
            goto L_0x004f
        L_0x0010:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L_0x0018:
            java.lang.Object r1 = r4.Y
            rj5 r1 = (defpackage.rj5) r1
            defpackage.wx3.H(r5)
            goto L_0x0043
        L_0x0020:
            defpackage.wx3.H(r5)
            java.lang.Object r5 = r4.Y
            r1 = r5
            rj5 r1 = (defpackage.rj5) r1
            zd2 r5 = r4.Z
            java.lang.Object r5 = r5.i
            t97 r5 = (defpackage.t97) r5
            java.lang.Object r5 = r5.getValue()
            pk r5 = (pk) r5
            r4.Y = r1
            r4.X = r3
            gy9 r5 = (gy9) r5
            dt r3 = r4.w0
            java.lang.Object r5 = r5.K(r3, r4)
            if (r5 != r0) goto L_0x0043
            return r0
        L_0x0043:
            r3 = 0
            r4.Y = r3
            r4.X = r2
            java.lang.Object r4 = r1.a(r5, r4)
            if (r4 != r0) goto L_0x004f
            return r0
        L_0x004f:
            jue r4 = defpackage.jue.a
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.vd2.o(java.lang.Object):java.lang.Object");
    }
}

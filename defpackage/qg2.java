package defpackage;

import kotlin.coroutines.Continuation;

/* renamed from: qg2  reason: default package */
public final class qg2 extends l5e implements i26 {
    public final /* synthetic */ ah2 X;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public qg2(ah2 ah2, Continuation continuation) {
        super(2, continuation);
        this.X = ah2;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((qg2) n((ou3) obj, (Continuation) obj2)).o(jue.a);
    }

    public final Continuation n(Object obj, Continuation continuation) {
        return new qg2(this.X, continuation);
    }

    public final Object o(Object obj) {
        wx3.H(obj);
        k77[] k77Arr = ah2.h1;
        ah2 ah2 = this.X;
        k68 x = ah2.x();
        t0c t0c = ah2.a1;
        k68 k68 = ((cg2) t0c.a.getValue()).a;
        boolean z = x instanceof i68;
        jue jue = jue.a;
        hcd hcd = ah2.b1;
        if (!z || !hhd.f(k68, x)) {
            hcd.g(Boolean.FALSE);
            return jue;
        }
        cg2 cg2 = new cg2((i68) null, 3);
        grd grd = ah2.Z0;
        grd.m((Object) null, cg2);
        grd.setValue((cg2) t0c.a.getValue());
        hcd.g(Boolean.TRUE);
        return jue;
    }
}

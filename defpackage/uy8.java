package defpackage;

import kotlin.coroutines.Continuation;

/* renamed from: uy8  reason: default package */
public final class uy8 extends l5e implements i26 {
    public final /* synthetic */ zz8 X;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public uy8(zz8 zz8, Continuation continuation) {
        super(2, continuation);
        this.X = zz8;
    }

    public final Object invoke(Object obj, Object obj2) {
        jue jue = jue.a;
        n((ou3) obj, (Continuation) obj2).o(jue);
        return jue;
    }

    public final Continuation n(Object obj, Continuation continuation) {
        return new uy8(this.X, continuation);
    }

    public final Object o(Object obj) {
        wx3.H(obj);
        k77[] k77Arr = zz8.I1;
        hba B = this.X.B();
        B.f(new vba(phc.n));
        B.h(new hge(c7a.t0));
        B.j();
        return jue.a;
    }
}

package defpackage;

import kotlin.coroutines.Continuation;

/* renamed from: te2  reason: default package */
public final class te2 extends l5e implements i26 {
    public final /* synthetic */ gf2 X;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public te2(gf2 gf2, Continuation continuation) {
        super(2, continuation);
        this.X = gf2;
    }

    public final Object invoke(Object obj, Object obj2) {
        return n((ou3) obj, (Continuation) obj2).o(jue.a);
    }

    public final Continuation n(Object obj, Continuation continuation) {
        return new te2(this.X, continuation);
    }

    public final Object o(Object obj) {
        wx3.H(obj);
        k77[] k77Arr = gf2.V0;
        hba hba = (hba) this.X.B0.getValue();
        hba.h(new hge(l8a.S1));
        hba.f(new vba(phc.n));
        return hba.j();
    }
}

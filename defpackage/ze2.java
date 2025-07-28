package defpackage;

import kotlin.coroutines.Continuation;

/* renamed from: ze2  reason: default package */
public final class ze2 extends l5e implements i26 {
    public final /* synthetic */ o10 X;
    public final /* synthetic */ gf2 Y;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ze2(o10 o10, gf2 gf2, Continuation continuation) {
        super(2, continuation);
        this.X = o10;
        this.Y = gf2;
    }

    public final Object invoke(Object obj, Object obj2) {
        jue jue = jue.a;
        n((ou3) obj, (Continuation) obj2).o(jue);
        return jue;
    }

    public final Continuation n(Object obj, Continuation continuation) {
        return new ze2(this.X, this.Y, continuation);
    }

    public final Object o(Object obj) {
        wx3.H(obj);
        int i = this.X.d() ? l8a.P1 : l8a.Q1;
        k77[] k77Arr = gf2.V0;
        hba hba = (hba) this.Y.B0.getValue();
        hba.h(new hge(i));
        hba.f(new vba(phc.n));
        hba.j();
        return jue.a;
    }
}

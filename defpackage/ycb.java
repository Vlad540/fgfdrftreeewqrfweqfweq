package defpackage;

import kotlin.coroutines.Continuation;

/* renamed from: ycb  reason: default package */
public final class ycb extends l5e implements i26 {
    public final /* synthetic */ jdb X;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ycb(jdb jdb, Continuation continuation) {
        super(2, continuation);
        this.X = jdb;
    }

    public final Object invoke(Object obj, Object obj2) {
        jue jue = jue.a;
        n((ou3) obj, (Continuation) obj2).o(jue);
        return jue;
    }

    public final Continuation n(Object obj, Continuation continuation) {
        return new ycb(this.X, continuation);
    }

    public final Object o(Object obj) {
        wx3.H(obj);
        hba hba = (hba) this.X.Y.getValue();
        hba.h(new hge(i8a.I1));
        hba.f(new vba(phc.J));
        hba.j();
        return jue.a;
    }
}

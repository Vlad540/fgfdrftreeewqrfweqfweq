package defpackage;

import kotlin.coroutines.Continuation;

/* renamed from: pj  reason: default package */
public final class pj extends l5e implements i26 {
    public final /* synthetic */ rj X;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public pj(rj rjVar, Continuation continuation) {
        super(2, continuation);
        this.X = rjVar;
    }

    public final Object invoke(Object obj, Object obj2) {
        jue jue = jue.a;
        n((ou3) obj, (Continuation) obj2).o(jue);
        return jue;
    }

    public final Continuation n(Object obj, Continuation continuation) {
        return new pj(this.X, continuation);
    }

    public final Object o(Object obj) {
        wx3.H(obj);
        rj rjVar = this.X;
        ma2 ma2 = (ho2) rjVar.f.getValue();
        ma2.t.i(-1);
        ma2.v.i(-1);
        ((n1b) rjVar.d.getValue()).a();
        ((aw2) ((bv2) rjVar.e.getValue())).l().O();
        ((xg0) rjVar.g.getValue()).a(cq2.a);
        return jue.a;
    }
}

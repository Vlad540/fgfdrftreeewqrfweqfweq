package defpackage;

import kotlin.coroutines.Continuation;

/* renamed from: kc1  reason: default package */
public final class kc1 extends l5e implements i26 {
    public final /* synthetic */ nc1 X;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public kc1(nc1 nc1, Continuation continuation) {
        super(2, continuation);
        this.X = nc1;
    }

    public final Object invoke(Object obj, Object obj2) {
        jue jue = jue.a;
        ((kc1) n((eoc) obj, (Continuation) obj2)).o(jue);
        return jue;
    }

    public final Continuation n(Object obj, Continuation continuation) {
        return new kc1(this.X, continuation);
    }

    public final Object o(Object obj) {
        wx3.H(obj);
        taf.o(this.X.w0, eh1.C);
        return jue.a;
    }
}

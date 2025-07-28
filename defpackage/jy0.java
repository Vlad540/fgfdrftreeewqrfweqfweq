package defpackage;

import kotlin.coroutines.Continuation;

/* renamed from: jy0  reason: default package */
public final class jy0 extends l5e implements i26 {
    public final /* synthetic */ py0 X;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public jy0(py0 py0, Continuation continuation) {
        super(2, continuation);
        this.X = py0;
    }

    public final Object invoke(Object obj, Object obj2) {
        jue jue = jue.a;
        ((jy0) n((kj3) obj, (Continuation) obj2)).o(jue);
        return jue;
    }

    public final Continuation n(Object obj, Continuation continuation) {
        return new jy0(this.X, continuation);
    }

    public final Object o(Object obj) {
        wx3.H(obj);
        k77[] k77Arr = py0.G0;
        this.X.j();
        return jue.a;
    }
}

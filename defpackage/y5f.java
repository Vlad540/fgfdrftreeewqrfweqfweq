package defpackage;

import kotlin.coroutines.Continuation;

/* renamed from: y5f  reason: default package */
public final class y5f extends l5e implements i26 {
    public /* synthetic */ Object X;
    public final /* synthetic */ a6f Y;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public y5f(a6f a6f, Continuation continuation) {
        super(2, continuation);
        this.Y = a6f;
    }

    public final Object invoke(Object obj, Object obj2) {
        jue jue = jue.a;
        n((ez) obj, (Continuation) obj2).o(jue);
        return jue;
    }

    public final Continuation n(Object obj, Continuation continuation) {
        y5f y5f = new y5f(this.Y, continuation);
        y5f.X = obj;
        return y5f;
    }

    public final Object o(Object obj) {
        wx3.H(obj);
        k77[] k77Arr = a6f.O0;
        this.Y.u((ez) this.X);
        return jue.a;
    }
}

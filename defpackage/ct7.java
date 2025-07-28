package defpackage;

import kotlin.coroutines.Continuation;

/* renamed from: ct7  reason: default package */
public final class ct7 extends l5e implements i26 {
    public final /* synthetic */ ez2 X;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ct7(ez2 ez2, Continuation continuation) {
        super(2, continuation);
        this.X = ez2;
    }

    public final Object invoke(Object obj, Object obj2) {
        jue jue = jue.a;
        n((ou3) obj, (Continuation) obj2).o(jue);
        return jue;
    }

    public final Continuation n(Object obj, Continuation continuation) {
        return new ct7(this.X, continuation);
    }

    public final Object o(Object obj) {
        wx3.H(obj);
        k4b k4b = k4b.w0;
        k4b.w0.Y.a(new d6c(6, this.X));
        return jue.a;
    }
}

package defpackage;

import kotlin.coroutines.Continuation;

/* renamed from: o5f  reason: default package */
public final class o5f extends l5e implements i26 {
    public final /* synthetic */ u5f X;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public o5f(u5f u5f, Continuation continuation) {
        super(2, continuation);
        this.X = u5f;
    }

    public final Object invoke(Object obj, Object obj2) {
        jue jue = jue.a;
        n((ou3) obj, (Continuation) obj2).o(jue);
        return jue;
    }

    public final Continuation n(Object obj, Continuation continuation) {
        return new o5f(this.X, continuation);
    }

    public final Object o(Object obj) {
        wx3.H(obj);
        this.X.d().a().M0();
        return jue.a;
    }
}

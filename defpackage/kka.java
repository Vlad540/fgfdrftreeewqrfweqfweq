package defpackage;

import kotlin.coroutines.Continuation;

/* renamed from: kka  reason: default package */
public final class kka extends l5e implements i26 {
    public final /* synthetic */ oka X;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public kka(oka oka, Continuation continuation) {
        super(2, continuation);
        this.X = oka;
    }

    public final Object invoke(Object obj, Object obj2) {
        jue jue = jue.a;
        ((kka) n((kj3) obj, (Continuation) obj2)).o(jue);
        return jue;
    }

    public final Continuation n(Object obj, Continuation continuation) {
        return new kka(this.X, continuation);
    }

    public final Object o(Object obj) {
        wx3.H(obj);
        this.X.d();
        return jue.a;
    }
}

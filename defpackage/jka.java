package defpackage;

import kotlin.coroutines.Continuation;

/* renamed from: jka  reason: default package */
public final class jka extends l5e implements i26 {
    public final /* synthetic */ oka X;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public jka(oka oka, Continuation continuation) {
        super(2, continuation);
        this.X = oka;
    }

    public final Object invoke(Object obj, Object obj2) {
        Boolean bool = (Boolean) obj;
        bool.booleanValue();
        jue jue = jue.a;
        ((jka) n(bool, (Continuation) obj2)).o(jue);
        return jue;
    }

    public final Continuation n(Object obj, Continuation continuation) {
        return new jka(this.X, continuation);
    }

    public final Object o(Object obj) {
        wx3.H(obj);
        this.X.d();
        return jue.a;
    }
}

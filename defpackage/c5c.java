package defpackage;

import kotlin.coroutines.Continuation;

/* renamed from: c5c  reason: default package */
public final class c5c extends l5e implements i26 {
    public final /* synthetic */ h5c X;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public c5c(h5c h5c, Continuation continuation) {
        super(2, continuation);
        this.X = h5c;
    }

    public final Object invoke(Object obj, Object obj2) {
        jue jue = jue.a;
        ((c5c) n((eoc) obj, (Continuation) obj2)).o(jue);
        return jue;
    }

    public final Continuation n(Object obj, Continuation continuation) {
        return new c5c(this.X, continuation);
    }

    public final Object o(Object obj) {
        wx3.H(obj);
        taf.o(this.X.y0, eh1.C);
        return jue.a;
    }
}

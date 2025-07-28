package defpackage;

import kotlin.coroutines.Continuation;

/* renamed from: tr7  reason: default package */
public final class tr7 extends l5e implements i26 {
    public final /* synthetic */ xr7 X;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public tr7(xr7 xr7, Continuation continuation) {
        super(2, continuation);
        this.X = xr7;
    }

    public final Object invoke(Object obj, Object obj2) {
        jue jue = jue.a;
        n((ou3) obj, (Continuation) obj2).o(jue);
        return jue;
    }

    public final Continuation n(Object obj, Continuation continuation) {
        return new tr7(this.X, continuation);
    }

    public final Object o(Object obj) {
        wx3.H(obj);
        ((uma) this.X.c.getValue()).d(2, 1);
        return jue.a;
    }
}

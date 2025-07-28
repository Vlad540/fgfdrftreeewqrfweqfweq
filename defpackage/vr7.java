package defpackage;

import kotlin.coroutines.Continuation;

/* renamed from: vr7  reason: default package */
public final class vr7 extends l5e implements i26 {
    public final /* synthetic */ xr7 X;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public vr7(xr7 xr7, Continuation continuation) {
        super(2, continuation);
        this.X = xr7;
    }

    public final Object invoke(Object obj, Object obj2) {
        jue jue = jue.a;
        n((ou3) obj, (Continuation) obj2).o(jue);
        return jue;
    }

    public final Continuation n(Object obj, Continuation continuation) {
        return new vr7(this.X, continuation);
    }

    public final Object o(Object obj) {
        wx3.H(obj);
        ((uma) this.X.c.getValue()).e(2, 1);
        return jue.a;
    }
}

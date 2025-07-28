package defpackage;

import kotlin.coroutines.Continuation;

/* renamed from: pv2  reason: default package */
public final class pv2 extends l5e implements i26 {
    public final /* synthetic */ t97 X;
    public final /* synthetic */ aw2 Y;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public pv2(t97 t97, aw2 aw2, Continuation continuation) {
        super(2, continuation);
        this.X = t97;
        this.Y = aw2;
    }

    public final Object invoke(Object obj, Object obj2) {
        jue jue = jue.a;
        n((ou3) obj, (Continuation) obj2).o(jue);
        return jue;
    }

    public final Continuation n(Object obj, Continuation continuation) {
        return new pv2(this.X, this.Y, continuation);
    }

    public final Object o(Object obj) {
        wx3.H(obj);
        ((t52) this.X.getValue()).G = this.Y.b;
        return jue.a;
    }
}

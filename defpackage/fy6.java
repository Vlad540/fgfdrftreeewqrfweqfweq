package defpackage;

import kotlin.coroutines.Continuation;

/* renamed from: fy6  reason: default package */
public final class fy6 extends l5e implements i26 {
    public final /* synthetic */ t97 X;
    public final /* synthetic */ v3a Y;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public fy6(t97 t97, v3a v3a, Continuation continuation) {
        super(2, continuation);
        this.X = t97;
        this.Y = v3a;
    }

    public final Object invoke(Object obj, Object obj2) {
        return n((ou3) obj, (Continuation) obj2).o(jue.a);
    }

    public final Continuation n(Object obj, Continuation continuation) {
        return new fy6(this.X, this.Y, continuation);
    }

    public final Object o(Object obj) {
        wx3.H(obj);
        String A = gt0.A((loa) this.X.getValue(), this.Y.a);
        if (A == null) {
            A = "";
        }
        return new lge(A);
    }
}

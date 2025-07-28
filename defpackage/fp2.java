package defpackage;

import kotlin.coroutines.Continuation;

/* renamed from: fp2  reason: default package */
public final class fp2 extends l5e implements i26 {
    public final /* synthetic */ gp2 X;
    public final /* synthetic */ i22 Y;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public fp2(gp2 gp2, i22 i22, Continuation continuation) {
        super(2, continuation);
        this.X = gp2;
        this.Y = i22;
    }

    public final Object invoke(Object obj, Object obj2) {
        jue jue = jue.a;
        n((ou3) obj, (Continuation) obj2).o(jue);
        return jue;
    }

    public final Continuation n(Object obj, Continuation continuation) {
        return new fp2(this.X, this.Y, continuation);
    }

    public final Object o(Object obj) {
        wx3.H(obj);
        gp2.q(this.X, this.Y.a);
        return jue.a;
    }
}

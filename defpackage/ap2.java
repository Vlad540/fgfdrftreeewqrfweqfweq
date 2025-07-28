package defpackage;

import kotlin.coroutines.Continuation;

/* renamed from: ap2  reason: default package */
public final class ap2 extends l5e implements i26 {
    public final /* synthetic */ gp2 X;
    public final /* synthetic */ vv3 Y;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ap2(gp2 gp2, vv3 vv3, Continuation continuation) {
        super(2, continuation);
        this.X = gp2;
        this.Y = vv3;
    }

    public final Object invoke(Object obj, Object obj2) {
        jue jue = jue.a;
        n((ou3) obj, (Continuation) obj2).o(jue);
        return jue;
    }

    public final Continuation n(Object obj, Continuation continuation) {
        return new ap2(this.X, this.Y, continuation);
    }

    public final Object o(Object obj) {
        wx3.H(obj);
        gp2.q(this.X, ((uv3) this.Y).b);
        return jue.a;
    }
}

package defpackage;

import kotlin.coroutines.Continuation;

/* renamed from: xm5  reason: default package */
public final class xm5 extends l5e implements i26 {
    public final /* synthetic */ yh7 X;
    public final /* synthetic */ cw9 Y;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public xm5(yh7 yh7, cw9 cw9, Continuation continuation) {
        super(2, continuation);
        this.X = yh7;
        this.Y = cw9;
    }

    public final Object invoke(Object obj, Object obj2) {
        jue jue = jue.a;
        ((xm5) n((ou3) obj, (Continuation) obj2)).o(jue);
        return jue;
    }

    public final Continuation n(Object obj, Continuation continuation) {
        return new xm5(this.X, this.Y, continuation);
    }

    public final Object o(Object obj) {
        wx3.H(obj);
        this.X.j(this.Y);
        return jue.a;
    }
}

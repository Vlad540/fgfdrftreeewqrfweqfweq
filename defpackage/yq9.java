package defpackage;

import kotlin.coroutines.Continuation;

/* renamed from: yq9  reason: default package */
public final class yq9 extends l5e implements i26 {
    public final /* synthetic */ cr9 X;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public yq9(cr9 cr9, Continuation continuation) {
        super(2, continuation);
        this.X = cr9;
    }

    public final Object invoke(Object obj, Object obj2) {
        jue jue = jue.a;
        n((ou3) obj, (Continuation) obj2).o(jue);
        return jue;
    }

    public final Continuation n(Object obj, Continuation continuation) {
        return new yq9(this.X, continuation);
    }

    public final Object o(Object obj) {
        wx3.H(obj);
        k77[] k77Arr = cr9.G0;
        cr9 cr9 = this.X;
        ((kp) cr9.q()).i("app.notification.show.text", !((kp) cr9.q()).g.getBoolean("app.notification.show.text", true));
        ((p7a) cr9.Y.getValue()).c();
        grd grd = cr9.B0;
        grd.m((Object) null, new Integer(((Number) grd.getValue()).intValue() + 1));
        return jue.a;
    }
}

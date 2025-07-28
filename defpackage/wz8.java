package defpackage;

import kotlin.coroutines.Continuation;

/* renamed from: wz8  reason: default package */
public final class wz8 extends l5e implements i26 {
    public final /* synthetic */ zz8 X;
    public final /* synthetic */ z63 Y;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public wz8(zz8 zz8, a73 a73, Continuation continuation) {
        super(2, continuation);
        this.X = zz8;
        this.Y = a73;
    }

    public final Object invoke(Object obj, Object obj2) {
        jue jue = jue.a;
        n((ou3) obj, (Continuation) obj2).o(jue);
        return jue;
    }

    public final Continuation n(Object obj, Continuation continuation) {
        return new wz8(this.X, this.Y, continuation);
    }

    public final Object o(Object obj) {
        wx3.H(obj);
        k77[] k77Arr = zz8.I1;
        hba B = this.X.B();
        B.f(yba.a);
        B.h(new hge(c7a.i0));
        B.g(new dca(new hge(c7a.j0)));
        B.d(new ss8(3, (Object) this.Y));
        B.j();
        return jue.a;
    }
}

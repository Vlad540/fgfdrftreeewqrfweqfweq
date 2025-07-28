package defpackage;

import kotlin.coroutines.Continuation;

/* renamed from: qz8  reason: default package */
public final class qz8 extends l5e implements i26 {
    public final /* synthetic */ zz8 X;
    public final /* synthetic */ vo8 Y;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public qz8(zz8 zz8, vo8 vo8, Continuation continuation) {
        super(2, continuation);
        this.X = zz8;
        this.Y = vo8;
    }

    public final Object invoke(Object obj, Object obj2) {
        jue jue = jue.a;
        n((ou3) obj, (Continuation) obj2).o(jue);
        return jue;
    }

    public final Continuation n(Object obj, Continuation continuation) {
        return new qz8(this.X, this.Y, continuation);
    }

    public final Object o(Object obj) {
        wx3.H(obj);
        long j = this.Y.b;
        k77[] k77Arr = zz8.I1;
        this.X.J(j, false, false, false);
        return jue.a;
    }
}

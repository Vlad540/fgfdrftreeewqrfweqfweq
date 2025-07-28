package defpackage;

import kotlin.coroutines.Continuation;

/* renamed from: mz8  reason: default package */
public final class mz8 extends l5e implements i26 {
    public final /* synthetic */ zz8 X;
    public final /* synthetic */ vo8 Y;
    public final /* synthetic */ boolean Z;
    public final /* synthetic */ o10 w0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public mz8(zz8 zz8, vo8 vo8, boolean z, o10 o10, Continuation continuation) {
        super(2, continuation);
        this.X = zz8;
        this.Y = vo8;
        this.Z = z;
        this.w0 = o10;
    }

    public final Object invoke(Object obj, Object obj2) {
        jue jue = jue.a;
        n((ou3) obj, (Continuation) obj2).o(jue);
        return jue;
    }

    public final Continuation n(Object obj, Continuation continuation) {
        return new mz8(this.X, this.Y, this.Z, this.w0, continuation);
    }

    public final Object o(Object obj) {
        wx3.H(obj);
        this.X.J(this.Y.b, this.Z, false, this.w0.d());
        return jue.a;
    }
}

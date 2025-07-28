package defpackage;

import kotlin.coroutines.Continuation;

/* renamed from: t5f  reason: default package */
public final class t5f extends l5e implements i26 {
    public final /* synthetic */ b6f X;
    public final /* synthetic */ vo8 Y;
    public final /* synthetic */ h5f Z;
    public final /* synthetic */ v2f w0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public t5f(b6f b6f, vo8 vo8, h5f h5f, v2f v2f, Continuation continuation) {
        super(2, continuation);
        this.X = b6f;
        this.Y = vo8;
        this.Z = h5f;
        this.w0 = v2f;
    }

    public final Object invoke(Object obj, Object obj2) {
        jue jue = jue.a;
        n((ou3) obj, (Continuation) obj2).o(jue);
        return jue;
    }

    public final Continuation n(Object obj, Continuation continuation) {
        return new t5f(this.X, this.Y, this.Z, this.w0, continuation);
    }

    public final Object o(Object obj) {
        wx3.H(obj);
        this.X.c(this.Y.b, this.Z, this.w0);
        return jue.a;
    }
}

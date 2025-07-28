package defpackage;

import kotlin.coroutines.Continuation;

/* renamed from: s5f  reason: default package */
public final class s5f extends l5e implements i26 {
    public final /* synthetic */ b6f X;
    public final /* synthetic */ h5f Y;
    public final /* synthetic */ v2f Z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public s5f(b6f b6f, h5f h5f, v2f v2f, Continuation continuation) {
        super(2, continuation);
        this.X = b6f;
        this.Y = h5f;
        this.Z = v2f;
    }

    public final Object invoke(Object obj, Object obj2) {
        jue jue = jue.a;
        n((ou3) obj, (Continuation) obj2).o(jue);
        return jue;
    }

    public final Continuation n(Object obj, Continuation continuation) {
        return new s5f(this.X, this.Y, this.Z, continuation);
    }

    public final Object o(Object obj) {
        wx3.H(obj);
        h5f h5f = this.Y;
        this.X.c(h5f.a, h5f, this.Z);
        return jue.a;
    }
}

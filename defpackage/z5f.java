package defpackage;

import kotlin.coroutines.Continuation;

/* renamed from: z5f  reason: default package */
public final class z5f extends l5e implements i26 {
    public /* synthetic */ Object X;
    public final /* synthetic */ a6f Y;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public z5f(a6f a6f, Continuation continuation) {
        super(2, continuation);
        this.Y = a6f;
    }

    public final Object invoke(Object obj, Object obj2) {
        jue jue = jue.a;
        n((t6f) obj, (Continuation) obj2).o(jue);
        return jue;
    }

    public final Continuation n(Object obj, Continuation continuation) {
        z5f z5f = new z5f(this.Y, continuation);
        z5f.X = obj;
        return z5f;
    }

    public final Object o(Object obj) {
        wx3.H(obj);
        a6f.i(this.Y, (t6f) this.X);
        return jue.a;
    }
}

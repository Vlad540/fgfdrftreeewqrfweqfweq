package defpackage;

import kotlin.coroutines.Continuation;

/* renamed from: of0  reason: default package */
public final class of0 extends l5e implements i26 {
    public final /* synthetic */ qf0 X;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public of0(qf0 qf0, Continuation continuation) {
        super(2, continuation);
        this.X = qf0;
    }

    public final Object invoke(Object obj, Object obj2) {
        jue jue = jue.a;
        ((of0) n((rj5) obj, (Continuation) obj2)).o(jue);
        return jue;
    }

    public final Continuation n(Object obj, Continuation continuation) {
        return new of0(this.X, continuation);
    }

    /* JADX WARNING: type inference failed for: r0v2, types: [android.app.Application$ActivityLifecycleCallbacks, hf0] */
    public final Object o(Object obj) {
        wx3.H(obj);
        qf0 qf0 = this.X;
        qf0.a.registerActivityLifecycleCallbacks(qf0.f);
        return jue.a;
    }
}

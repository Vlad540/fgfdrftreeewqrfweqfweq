package defpackage;

import kotlin.coroutines.Continuation;

/* renamed from: wq  reason: default package */
public final class wq extends l5e implements i26 {
    public /* synthetic */ Object X;

    public final Object invoke(Object obj, Object obj2) {
        jue jue = jue.a;
        ((wq) n((sg9) obj, (Continuation) obj2)).o(jue);
        return jue;
    }

    /* JADX WARNING: type inference failed for: r1v1, types: [kotlin.coroutines.Continuation, wq, l5e] */
    public final Continuation n(Object obj, Continuation continuation) {
        ? l5e = new l5e(2, continuation);
        l5e.X = obj;
        return l5e;
    }

    public final Object o(Object obj) {
        wx3.H(obj);
        if (hhd.f((sg9) this.X, v03.b)) {
            lq.c.P1().d();
        }
        return jue.a;
    }
}

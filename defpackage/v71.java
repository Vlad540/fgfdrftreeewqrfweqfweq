package defpackage;

import kotlin.coroutines.Continuation;

/* renamed from: v71  reason: default package */
public final class v71 extends l5e implements i26 {
    public /* synthetic */ Object X;

    public final Object invoke(Object obj, Object obj2) {
        return ((v71) n((ou3) obj, (Continuation) obj2)).o(jue.a);
    }

    /* JADX WARNING: type inference failed for: r1v1, types: [v71, kotlin.coroutines.Continuation, l5e] */
    public final Continuation n(Object obj, Continuation continuation) {
        ? l5e = new l5e(2, continuation);
        l5e.X = obj;
        return l5e;
    }

    /* JADX WARNING: type inference failed for: r3v1, types: [i26, l5e] */
    public final Object o(Object obj) {
        wx3.H(obj);
        return xs7.E((ou3) this.X, (hu3) null, (ru3) null, new l5e(2, (Continuation) null), 3);
    }
}

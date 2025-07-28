package defpackage;

import kotlin.coroutines.Continuation;

/* renamed from: km5  reason: default package */
public final class km5 extends l5e implements i26 {
    public /* synthetic */ int X;

    public final Object invoke(Object obj, Object obj2) {
        return ((km5) n(Integer.valueOf(((Number) obj).intValue()), (Continuation) obj2)).o(jue.a);
    }

    /* JADX WARNING: type inference failed for: r1v1, types: [km5, kotlin.coroutines.Continuation, l5e] */
    public final Continuation n(Object obj, Continuation continuation) {
        ? l5e = new l5e(2, continuation);
        l5e.X = ((Number) obj).intValue();
        return l5e;
    }

    public final Object o(Object obj) {
        wx3.H(obj);
        return Boolean.valueOf(this.X > 0);
    }
}

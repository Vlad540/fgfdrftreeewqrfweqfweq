package defpackage;

import java.util.Collection;
import kotlin.coroutines.Continuation;

/* renamed from: b5f  reason: default package */
public final class b5f extends l5e implements i26 {
    public /* synthetic */ Object X;

    public final Object invoke(Object obj, Object obj2) {
        jue jue = jue.a;
        ((b5f) n((Collection) obj, (Continuation) obj2)).o(jue);
        return jue;
    }

    /* JADX WARNING: type inference failed for: r1v1, types: [b5f, kotlin.coroutines.Continuation, l5e] */
    public final Continuation n(Object obj, Continuation continuation) {
        ? l5e = new l5e(2, continuation);
        l5e.X = obj;
        return l5e;
    }

    public final Object o(Object obj) {
        wx3.H(obj);
        Collection collection = (Collection) this.X;
        return jue.a;
    }
}

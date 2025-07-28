package defpackage;

import com.my.tracker.MyTracker;
import kotlin.coroutines.Continuation;

/* renamed from: qf9  reason: default package */
public final class qf9 extends l5e implements i26 {
    public /* synthetic */ long X;

    public final Object invoke(Object obj, Object obj2) {
        Long valueOf = Long.valueOf(((Number) obj).longValue());
        jue jue = jue.a;
        ((qf9) n(valueOf, (Continuation) obj2)).o(jue);
        return jue;
    }

    /* JADX WARNING: type inference failed for: r1v1, types: [kotlin.coroutines.Continuation, qf9, l5e] */
    public final Continuation n(Object obj, Continuation continuation) {
        ? l5e = new l5e(2, continuation);
        l5e.X = ((Number) obj).longValue();
        return l5e;
    }

    public final Object o(Object obj) {
        wx3.H(obj);
        MyTracker.trackLoginEvent(String.valueOf(this.X), (String) null);
        return jue.a;
    }
}

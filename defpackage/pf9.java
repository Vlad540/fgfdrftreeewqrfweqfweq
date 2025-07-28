package defpackage;

import com.my.tracker.MyTracker;
import kotlin.coroutines.Continuation;

/* renamed from: pf9  reason: default package */
public final class pf9 extends l5e implements i26 {
    public /* synthetic */ Object X;

    public final Object invoke(Object obj, Object obj2) {
        jue jue = jue.a;
        ((pf9) n((Long) obj, (Continuation) obj2)).o(jue);
        return jue;
    }

    /* JADX WARNING: type inference failed for: r1v1, types: [pf9, kotlin.coroutines.Continuation, l5e] */
    public final Continuation n(Object obj, Continuation continuation) {
        ? l5e = new l5e(2, continuation);
        l5e.X = obj;
        return l5e;
    }

    public final Object o(Object obj) {
        wx3.H(obj);
        MyTracker.getTrackerParams().setCustomUserId(String.valueOf(((Long) this.X).longValue()));
        return jue.a;
    }
}

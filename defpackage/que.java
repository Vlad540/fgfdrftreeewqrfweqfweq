package defpackage;

import kotlinx.coroutines.internal.LimitedDispatcherKt;

/* renamed from: que  reason: default package */
public final class que extends ju3 {
    public static final que a = new ju3();

    public final void dispatch(hu3 hu3, Runnable runnable) {
        ha4 ha4 = ha4.b;
        ha4.a.n(runnable, oee.h, false);
    }

    public final void dispatchYield(hu3 hu3, Runnable runnable) {
        ha4 ha4 = ha4.b;
        ha4.a.n(runnable, oee.h, true);
    }

    public final ju3 limitedParallelism(int i, String str) {
        LimitedDispatcherKt.checkParallelism(i);
        return i >= oee.d ? LimitedDispatcherKt.namedOrThis(this, str) : super.limitedParallelism(i, str);
    }

    public final String toString() {
        return "Dispatchers.IO";
    }
}

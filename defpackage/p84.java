package defpackage;

import java.util.concurrent.Executor;
import kotlinx.coroutines.internal.SystemPropsKt;

/* renamed from: p84  reason: default package */
public final class p84 extends r15 implements Executor {
    public static final p84 a = new ju3();
    public static final ju3 b;

    /* JADX WARNING: type inference failed for: r0v0, types: [ju3, p84] */
    static {
        que que = que.a;
        int available_processors = SystemPropsKt.getAVAILABLE_PROCESSORS();
        b = ju3.limitedParallelism$default(que, SystemPropsKt__SystemProps_commonKt.systemProp$default("kotlinx.coroutines.io.parallelism", 64 < available_processors ? available_processors : 64, 0, 0, 12, (Object) null), (String) null, 2, (Object) null);
    }

    public final void close() {
        throw new IllegalStateException("Cannot be invoked on Dispatchers.IO".toString());
    }

    public final void dispatch(hu3 hu3, Runnable runnable) {
        b.dispatch(hu3, runnable);
    }

    public final void dispatchYield(hu3 hu3, Runnable runnable) {
        b.dispatchYield(hu3, runnable);
    }

    public final void execute(Runnable runnable) {
        dispatch(bw4.a, runnable);
    }

    public final ju3 limitedParallelism(int i, String str) {
        return que.a.limitedParallelism(i, str);
    }

    public final Executor n() {
        return this;
    }

    public final String toString() {
        return "Dispatchers.IO";
    }
}

package defpackage;

import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;

/* renamed from: s37  reason: default package */
public final class s37 implements ch7 {
    public final b4d a = new Object();

    /* JADX WARNING: type inference failed for: r0v0, types: [b4d, java.lang.Object] */
    public s37(h37 h37) {
        h37.invokeOnCompletion(new c0(2, this));
    }

    public final void c(Runnable runnable, Executor executor) {
        this.a.c(runnable, executor);
    }

    public final boolean cancel(boolean z) {
        return this.a.cancel(z);
    }

    public final Object get() {
        return this.a.get();
    }

    public final boolean isCancelled() {
        return this.a.a instanceof r0;
    }

    public final boolean isDone() {
        return this.a.isDone();
    }

    public final Object get(long j, TimeUnit timeUnit) {
        return this.a.get(j, timeUnit);
    }
}

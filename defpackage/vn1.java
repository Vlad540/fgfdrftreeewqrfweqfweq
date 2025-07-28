package defpackage;

import java.lang.ref.WeakReference;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;

/* renamed from: vn1  reason: default package */
public final class vn1 implements ch7 {
    public final WeakReference a;
    public final un1 b = new un1(this);

    public vn1(sn1 sn1) {
        this.a = new WeakReference(sn1);
    }

    public final void c(Runnable runnable, Executor executor) {
        this.b.c(runnable, executor);
    }

    public final boolean cancel(boolean z) {
        sn1 sn1 = (sn1) this.a.get();
        boolean cancel = this.b.cancel(z);
        if (cancel && sn1 != null) {
            sn1.a = null;
            sn1.b = null;
            sn1.c.i((Object) null);
        }
        return cancel;
    }

    public final Object get() {
        return this.b.get();
    }

    public final boolean isCancelled() {
        return this.b.a instanceof h3;
    }

    public final boolean isDone() {
        return this.b.isDone();
    }

    public final String toString() {
        return this.b.toString();
    }

    public final Object get(long j, TimeUnit timeUnit) {
        return this.b.get(j, timeUnit);
    }
}

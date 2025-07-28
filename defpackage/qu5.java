package defpackage;

import java.util.concurrent.ForkJoinTask;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: qu5  reason: default package */
public final class qu5 extends ForkJoinTask {
    public final Runnable a;
    public final AtomicBoolean b = new AtomicBoolean(false);
    public final AtomicReference c;
    public volatile Throwable o;

    public qu5(Object obj, wc3 wc3) {
        this.a = wc3;
        this.c = new AtomicReference(obj);
    }

    public final boolean exec() {
        if (!this.b.compareAndSet(false, true)) {
            return false;
        }
        try {
            this.a.run();
            return true;
        } catch (Throwable th) {
            this.o = th;
            throw th;
        }
    }

    public final Object getRawResult() {
        return this.c.get();
    }

    public final void setRawResult(Object obj) {
        this.c.set(obj);
    }
}

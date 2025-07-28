package defpackage;

import java.util.concurrent.Delayed;
import java.util.concurrent.Executor;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* renamed from: h69  reason: default package */
public final class h69 extends at7 implements ScheduledFuture, ch7, Future {
    public final ch7 B0;
    public final ScheduledFuture C0;

    public h69(k1 k1Var, ScheduledFuture scheduledFuture) {
        super(10);
        this.B0 = k1Var;
        this.C0 = scheduledFuture;
    }

    public final boolean Z(boolean z) {
        return this.B0.cancel(z);
    }

    public final void c(Runnable runnable, Executor executor) {
        this.B0.c(runnable, executor);
    }

    public final boolean cancel(boolean z) {
        boolean Z = Z(z);
        if (Z) {
            this.C0.cancel(z);
        }
        return Z;
    }

    public final int compareTo(Object obj) {
        return this.C0.compareTo((Delayed) obj);
    }

    public final Object get() {
        return this.B0.get();
    }

    public final long getDelay(TimeUnit timeUnit) {
        return this.C0.getDelay(timeUnit);
    }

    public final boolean isCancelled() {
        return this.B0.isCancelled();
    }

    public final boolean isDone() {
        return this.B0.isDone();
    }

    public final Object n() {
        return this.B0;
    }

    public final Object get(long j, TimeUnit timeUnit) {
        return this.B0.get(j, timeUnit);
    }
}

package defpackage;

import java.util.concurrent.Callable;
import java.util.concurrent.CancellationException;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.Delayed;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: g9a  reason: default package */
public final class g9a implements ScheduledFuture {
    public final CountDownLatch X = new CountDownLatch(1);
    public volatile Object Y;
    public final AtomicReference Z = new AtomicReference((Object) null);
    public final Callable a;
    public final ExecutorService b;
    public final AtomicBoolean c = new AtomicBoolean(false);
    public final AtomicBoolean o = new AtomicBoolean(false);
    public ScheduledFuture w0;

    public g9a(Callable callable, ExecutorService executorService) {
        this.a = callable;
        this.b = executorService;
    }

    public final boolean cancel(boolean z) {
        AtomicBoolean atomicBoolean = this.o;
        if (atomicBoolean.get()) {
            return false;
        }
        AtomicBoolean atomicBoolean2 = this.c;
        if (atomicBoolean2.get()) {
            return false;
        }
        atomicBoolean2.set(true);
        atomicBoolean.set(true);
        ScheduledFuture scheduledFuture = this.w0;
        if (scheduledFuture == null) {
            scheduledFuture = null;
        }
        scheduledFuture.cancel(z);
        this.X.countDown();
        return true;
    }

    public final int compareTo(Object obj) {
        Delayed delayed = (Delayed) obj;
        ScheduledFuture scheduledFuture = this.w0;
        if (scheduledFuture == null) {
            scheduledFuture = null;
        }
        return scheduledFuture.compareTo(delayed);
    }

    public final Object get() {
        if (!this.o.get()) {
            this.X.await();
        }
        Exception exc = (Exception) this.Z.get();
        if (exc != null) {
            ExecutionException executionException = exc instanceof ExecutionException ? (ExecutionException) exc : null;
            if (executionException == null) {
                executionException = new ExecutionException(exc);
            }
            throw executionException;
        } else if (!this.c.get()) {
            return this.Y;
        } else {
            throw new CancellationException("Future is cancelled");
        }
    }

    public final long getDelay(TimeUnit timeUnit) {
        ScheduledFuture scheduledFuture = this.w0;
        if (scheduledFuture == null) {
            scheduledFuture = null;
        }
        return scheduledFuture.getDelay(timeUnit);
    }

    public final boolean isCancelled() {
        return this.c.get();
    }

    public final boolean isDone() {
        return this.o.get();
    }

    public final Object get(long j, TimeUnit timeUnit) {
        if (this.o.get() || this.X.await(j, timeUnit)) {
            Exception exc = (Exception) this.Z.get();
            if (exc == null) {
                return this.Y;
            }
            ExecutionException executionException = exc instanceof ExecutionException ? (ExecutionException) exc : null;
            if (executionException == null) {
                executionException = new ExecutionException(exc);
            }
            throw executionException;
        }
        throw new TimeoutException("No result for " + j + " " + timeUnit);
    }
}

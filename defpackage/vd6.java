package defpackage;

import android.os.Handler;
import android.os.SystemClock;
import java.util.List;
import java.util.concurrent.AbstractExecutorService;
import java.util.concurrent.Callable;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* renamed from: vd6  reason: default package */
public final class vd6 extends AbstractExecutorService implements ScheduledExecutorService {
    public final Handler a;

    static {
        new rt0(8);
    }

    public vd6(Handler handler) {
        this.a = handler;
    }

    public final boolean awaitTermination(long j, TimeUnit timeUnit) {
        throw new UnsupportedOperationException(vd6.class.getSimpleName().concat(" cannot be shut down. Use Looper.quitSafely()."));
    }

    public final void execute(Runnable runnable) {
        Handler handler = this.a;
        if (!handler.post(runnable)) {
            throw new RejectedExecutionException(handler + " is shutting down");
        }
    }

    public final boolean isShutdown() {
        return false;
    }

    public final boolean isTerminated() {
        return false;
    }

    public final ScheduledFuture schedule(Runnable runnable, long j, TimeUnit timeUnit) {
        return schedule((Callable) new g74(6, runnable), j, timeUnit);
    }

    public final ScheduledFuture scheduleAtFixedRate(Runnable runnable, long j, long j2, TimeUnit timeUnit) {
        throw new UnsupportedOperationException(vd6.class.getSimpleName().concat(" does not yet support fixed-rate scheduling."));
    }

    public final ScheduledFuture scheduleWithFixedDelay(Runnable runnable, long j, long j2, TimeUnit timeUnit) {
        throw new UnsupportedOperationException(vd6.class.getSimpleName().concat(" does not yet support fixed-delay scheduling."));
    }

    public final void shutdown() {
        throw new UnsupportedOperationException(vd6.class.getSimpleName().concat(" cannot be shut down. Use Looper.quitSafely()."));
    }

    public final List shutdownNow() {
        throw new UnsupportedOperationException(vd6.class.getSimpleName().concat(" cannot be shut down. Use Looper.quitSafely()."));
    }

    /* JADX WARNING: type inference failed for: r3v4, types: [java.util.concurrent.ScheduledFuture, as6] */
    public final ScheduledFuture schedule(Callable callable, long j, TimeUnit timeUnit) {
        long convert = TimeUnit.MILLISECONDS.convert(j, timeUnit) + SystemClock.uptimeMillis();
        Handler handler = this.a;
        ud6 ud6 = new ud6(handler, convert, callable);
        if (handler.postAtTime(ud6, convert)) {
            return ud6;
        }
        return new as6(1, new RejectedExecutionException(handler + " is shutting down"));
    }
}

package defpackage;

import android.os.Handler;
import java.util.List;
import java.util.concurrent.AbstractExecutorService;
import java.util.concurrent.Callable;
import java.util.concurrent.Future;
import java.util.concurrent.RunnableFuture;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* renamed from: aue  reason: default package */
public final class aue extends AbstractExecutorService implements ScheduledExecutorService {
    public static aue b;
    public final Handler a;

    public aue(Handler handler) {
        this.a = handler;
    }

    public final void a(Runnable runnable) {
        this.a.post(runnable);
    }

    public final boolean awaitTermination(long j, TimeUnit timeUnit) {
        throw new UnsupportedOperationException();
    }

    public final void execute(Runnable runnable) {
        if (Thread.currentThread() == this.a.getLooper().getThread()) {
            runnable.run();
        } else {
            a(runnable);
        }
    }

    public final boolean isShutdown() {
        return false;
    }

    public final boolean isTerminated() {
        return false;
    }

    public final RunnableFuture newTaskFor(Runnable runnable, Object obj) {
        return new slc(runnable, obj);
    }

    public final ScheduledFuture schedule(Runnable runnable, long j, TimeUnit timeUnit) {
        slc slc = new slc(runnable, (Object) null);
        this.a.postDelayed(slc, timeUnit.toMillis(j));
        return slc;
    }

    public final ScheduledFuture scheduleAtFixedRate(Runnable runnable, long j, long j2, TimeUnit timeUnit) {
        throw new UnsupportedOperationException();
    }

    public final ScheduledFuture scheduleWithFixedDelay(Runnable runnable, long j, long j2, TimeUnit timeUnit) {
        throw new UnsupportedOperationException();
    }

    public final void shutdown() {
        throw new UnsupportedOperationException();
    }

    public final List shutdownNow() {
        throw new UnsupportedOperationException();
    }

    public final Future submit(Runnable runnable) {
        runnable.getClass();
        slc slc = new slc(runnable, (Object) null);
        execute(slc);
        return slc;
    }

    public final RunnableFuture newTaskFor(Callable callable) {
        return new slc(callable);
    }

    public final ScheduledFuture schedule(Callable callable, long j, TimeUnit timeUnit) {
        slc slc = new slc(callable);
        this.a.postDelayed(slc, timeUnit.toMillis(j));
        return slc;
    }

    public final Future submit(Runnable runnable, Object obj) {
        runnable.getClass();
        slc slc = new slc(runnable, obj);
        execute(slc);
        return slc;
    }

    public final Future submit(Callable callable) {
        callable.getClass();
        slc slc = new slc(callable);
        execute(slc);
        return slc;
    }
}

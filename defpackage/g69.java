package defpackage;

import java.util.List;
import java.util.concurrent.AbstractExecutorService;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.RunnableFuture;
import java.util.concurrent.TimeUnit;

/* renamed from: g69  reason: default package */
public class g69 extends AbstractExecutorService implements rh7 {
    public final ExecutorService a;

    public g69(ExecutorService executorService) {
        executorService.getClass();
        this.a = executorService;
    }

    public final ch7 a(Callable callable) {
        return (ch7) super.submit(callable);
    }

    public final boolean awaitTermination(long j, TimeUnit timeUnit) {
        return this.a.awaitTermination(j, timeUnit);
    }

    public final void execute(Runnable runnable) {
        this.a.execute(runnable);
    }

    public final boolean isShutdown() {
        return this.a.isShutdown();
    }

    public final boolean isTerminated() {
        return this.a.isTerminated();
    }

    public final RunnableFuture newTaskFor(Callable callable) {
        return new ise(callable);
    }

    public final void shutdown() {
        this.a.shutdown();
    }

    public final List shutdownNow() {
        return this.a.shutdownNow();
    }

    public final Future submit(Runnable runnable) {
        return (ch7) super.submit(runnable);
    }

    public final String toString() {
        return super.toString() + "[" + this.a + "]";
    }

    public final RunnableFuture newTaskFor(Runnable runnable, Object obj) {
        return new ise(Executors.callable(runnable, obj));
    }

    public final Future submit(Runnable runnable, Object obj) {
        return (ch7) super.submit(runnable, obj);
    }

    public final Future submit(Callable callable) {
        return (ch7) super.submit(callable);
    }
}

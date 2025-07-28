package defpackage;

import java.util.Collection;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;

/* renamed from: i06  reason: default package */
public final class i06 implements ExecutorService {
    public final ExecutorService a;
    public final t97 b = ez3.O(3, new fs5(7));

    public i06(ExecutorService executorService) {
        this.a = executorService;
    }

    public final boolean a() {
        return Thread.currentThread() == ((Thread) this.b.getValue());
    }

    public final boolean awaitTermination(long j, TimeUnit timeUnit) {
        return this.a.awaitTermination(j, timeUnit);
    }

    public final void execute(Runnable runnable) {
        if (a()) {
            runnable.run();
            return;
        }
        this.a.execute(new k30(runnable, 1));
    }

    public final List invokeAll(Collection collection) {
        return this.a.invokeAll(collection);
    }

    public final Object invokeAny(Collection collection) {
        return this.a.invokeAny(collection);
    }

    public final boolean isShutdown() {
        return this.a.isShutdown();
    }

    public final boolean isTerminated() {
        return this.a.isTerminated();
    }

    public final void shutdown() {
        throw new UnsupportedOperationException();
    }

    public final List shutdownNow() {
        throw new UnsupportedOperationException();
    }

    public final Future submit(Runnable runnable) {
        if (a()) {
            runnable.run();
            return CompletableFuture.completedFuture(jue.a);
        }
        return this.a.submit(new k30(runnable, 3));
    }

    public final List invokeAll(Collection collection, long j, TimeUnit timeUnit) {
        return this.a.invokeAll(collection, j, timeUnit);
    }

    public final Object invokeAny(Collection collection, long j, TimeUnit timeUnit) {
        return this.a.invokeAny(collection, j, timeUnit);
    }

    public final Future submit(Runnable runnable, Object obj) {
        if (a()) {
            runnable.run();
            return CompletableFuture.completedFuture(obj);
        }
        return this.a.submit(new k30(runnable, 2), obj);
    }

    public final Future submit(Callable callable) {
        if (a()) {
            return CompletableFuture.completedFuture(callable.call());
        }
        return this.a.submit(new m5(5, callable));
    }
}

package defpackage;

import java.util.List;
import java.util.concurrent.AbstractExecutorService;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.Executor;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: la4  reason: default package */
public final class la4 extends AbstractExecutorService implements wyc {
    public static final /* synthetic */ int w0 = 0;
    public final re X;
    public final AtomicInteger Y;
    public final AtomicInteger Z;
    public final String a = "SerialExecutor";
    public final Executor b;
    public volatile int c;
    public final BlockingQueue o;

    public la4(Executor executor) {
        LinkedBlockingQueue linkedBlockingQueue = new LinkedBlockingQueue();
        this.b = executor;
        this.c = 1;
        this.o = linkedBlockingQueue;
        this.X = new re(12, this);
        this.Y = new AtomicInteger(0);
        this.Z = new AtomicInteger(0);
    }

    public final void a(Runnable runnable) {
        if (runnable != null) {
            BlockingQueue blockingQueue = this.o;
            boolean offer = blockingQueue.offer(runnable);
            String str = this.a;
            if (offer) {
                int size = blockingQueue.size();
                AtomicInteger atomicInteger = this.Z;
                int i = atomicInteger.get();
                if (size > i && atomicInteger.compareAndSet(i, size)) {
                    m75.e(la4.class, "%s: max pending work in queue = %d", str, Integer.valueOf(size));
                }
                b();
                return;
            }
            throw new RejectedExecutionException(str + " queue is full, size=" + blockingQueue.size());
        }
        throw new NullPointerException("runnable parameter is null");
    }

    public final boolean awaitTermination(long j, TimeUnit timeUnit) {
        throw new UnsupportedOperationException();
    }

    public final void b() {
        int i = this.Y.get();
        while (i < this.c) {
            int i2 = i + 1;
            Class<la4> cls = la4.class;
            if (this.Y.compareAndSet(i, i2)) {
                m75.f(cls, "%s: starting worker %d of %d", this.a, Integer.valueOf(i2), Integer.valueOf(this.c));
                this.b.execute(this.X);
                return;
            }
            m75.d(cls, this.a, "%s: race in startWorkerIfNeeded; retrying");
            i = this.Y.get();
        }
    }

    public final synchronized void execute(Runnable runnable) {
        a(runnable);
    }

    public final boolean isShutdown() {
        return false;
    }

    public final boolean isTerminated() {
        return false;
    }

    public final void shutdown() {
        throw new UnsupportedOperationException();
    }

    public final List shutdownNow() {
        throw new UnsupportedOperationException();
    }
}

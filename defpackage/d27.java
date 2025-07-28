package defpackage;

import java.util.Iterator;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;

/* renamed from: d27  reason: default package */
public final class d27 implements Runnable {
    public final ScheduledFuture X;
    public final ThreadFactory Y;
    public final long a;
    public final ConcurrentLinkedQueue b;
    public final n83 c;
    public final ScheduledExecutorService o;

    /* JADX WARNING: type inference failed for: r8v4, types: [n83, java.lang.Object] */
    public d27(long j, TimeUnit timeUnit, ThreadFactory threadFactory) {
        ScheduledFuture<?> scheduledFuture;
        ScheduledExecutorService scheduledExecutorService;
        long nanos = timeUnit != null ? timeUnit.toNanos(j) : 0;
        this.a = nanos;
        this.b = new ConcurrentLinkedQueue();
        this.c = new Object();
        this.Y = threadFactory;
        if (timeUnit != null) {
            scheduledExecutorService = Executors.newScheduledThreadPool(1, g27.e);
            scheduledFuture = scheduledExecutorService.scheduleWithFixedDelay(this, nanos, nanos, TimeUnit.NANOSECONDS);
        } else {
            scheduledExecutorService = null;
            scheduledFuture = null;
        }
        this.o = scheduledExecutorService;
        this.X = scheduledFuture;
    }

    public final void run() {
        ConcurrentLinkedQueue concurrentLinkedQueue = this.b;
        if (!concurrentLinkedQueue.isEmpty()) {
            long nanoTime = System.nanoTime();
            Iterator it = concurrentLinkedQueue.iterator();
            while (it.hasNext()) {
                f27 f27 = (f27) it.next();
                if (f27.c > nanoTime) {
                    return;
                }
                if (concurrentLinkedQueue.remove(f27)) {
                    this.c.b(f27);
                }
            }
        }
    }
}

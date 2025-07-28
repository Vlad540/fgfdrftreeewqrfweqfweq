package defpackage;

import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: g27  reason: default package */
public final class g27 extends qmc {
    public static final qic d;
    public static final qic e;
    public static final long f = Long.getLong("rx3.io-keep-alive-time", 60).longValue();
    public static final TimeUnit g = TimeUnit.SECONDS;
    public static final f27 h;
    public static final boolean i = Boolean.getBoolean("rx3.io-scheduled-release");
    public static final d27 j;
    public final AtomicReference c;

    static {
        f27 f27 = new f27(new qic("RxCachedThreadSchedulerShutdown"));
        h = f27;
        f27.f();
        int max = Math.max(1, Math.min(10, Integer.getInteger("rx3.io-priority", 5).intValue()));
        qic qic = new qic("RxCachedThreadScheduler", max, false);
        d = qic;
        e = new qic("RxCachedWorkerPoolEvictor", max, false);
        d27 d27 = new d27(0, (TimeUnit) null, qic);
        j = d27;
        d27.c.f();
        ScheduledFuture scheduledFuture = d27.X;
        if (scheduledFuture != null) {
            scheduledFuture.cancel(true);
        }
        ScheduledExecutorService scheduledExecutorService = d27.o;
        if (scheduledExecutorService != null) {
            scheduledExecutorService.shutdownNow();
        }
    }

    public g27() {
        AtomicReference atomicReference;
        d27 d27 = j;
        this.c = new AtomicReference(d27);
        d27 d272 = new d27(f, g, d);
        do {
            atomicReference = this.c;
            if (atomicReference.compareAndSet(d27, d272)) {
                return;
            }
        } while (atomicReference.get() == d27);
        d272.c.f();
        ScheduledFuture scheduledFuture = d272.X;
        if (scheduledFuture != null) {
            scheduledFuture.cancel(true);
        }
        ScheduledExecutorService scheduledExecutorService = d272.o;
        if (scheduledExecutorService != null) {
            scheduledExecutorService.shutdownNow();
        }
    }

    public final omc a() {
        return new e27((d27) this.c.get());
    }
}

package defpackage;

import java.util.concurrent.Callable;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* renamed from: rlc  reason: default package */
public final class rlc extends f25 implements ScheduledExecutorService {
    public final ScheduledExecutorService A0;

    public rlc(ScheduledExecutorService scheduledExecutorService, w4a w4a, uy1 uy1) {
        super(scheduledExecutorService, w4a, uy1);
        this.A0 = scheduledExecutorService;
    }

    public final ScheduledFuture schedule(Runnable runnable, long j, TimeUnit timeUnit) {
        return this.A0.schedule(i(runnable, b()), j, timeUnit);
    }

    public final ScheduledFuture scheduleAtFixedRate(Runnable runnable, long j, long j2, TimeUnit timeUnit) {
        return this.A0.scheduleAtFixedRate(i(runnable, b()), j, j2, timeUnit);
    }

    public final ScheduledFuture scheduleWithFixedDelay(Runnable runnable, long j, long j2, TimeUnit timeUnit) {
        return this.A0.scheduleAtFixedRate(i(runnable, b()), j, j2, timeUnit);
    }

    public final ScheduledFuture schedule(Callable callable, long j, TimeUnit timeUnit) {
        return this.A0.schedule(h(callable, b()), j, timeUnit);
    }
}

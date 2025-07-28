package defpackage;

import java.util.concurrent.Callable;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* renamed from: j69  reason: default package */
public final class j69 extends g69 implements ScheduledExecutorService {
    public final ScheduledExecutorService b;

    public j69(ScheduledExecutorService scheduledExecutorService) {
        super(scheduledExecutorService);
        this.b = scheduledExecutorService;
    }

    public final ScheduledFuture schedule(Callable callable, long j, TimeUnit timeUnit) {
        ise ise = new ise(callable);
        return new h69(ise, this.b.schedule(ise, j, timeUnit));
    }

    public final ScheduledFuture scheduleAtFixedRate(Runnable runnable, long j, long j2, TimeUnit timeUnit) {
        i69 i69 = new i69(runnable);
        return new h69(i69, this.b.scheduleAtFixedRate(i69, j, j2, timeUnit));
    }

    public final ScheduledFuture scheduleWithFixedDelay(Runnable runnable, long j, long j2, TimeUnit timeUnit) {
        i69 i69 = new i69(runnable);
        return new h69(i69, this.b.scheduleWithFixedDelay(i69, j, j2, timeUnit));
    }

    public final ScheduledFuture schedule(Runnable runnable, long j, TimeUnit timeUnit) {
        ise ise = new ise(Executors.callable(runnable, (Object) null));
        return new h69(ise, this.b.schedule(ise, j, timeUnit));
    }
}

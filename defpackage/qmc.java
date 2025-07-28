package defpackage;

import java.util.Objects;
import java.util.concurrent.TimeUnit;

/* renamed from: qmc  reason: default package */
public abstract class qmc {
    public static final boolean a = Boolean.getBoolean("rx3.scheduler.use-nanotime");
    public static final long b;

    static {
        long longValue = Long.getLong("rx3.scheduler.drift-tolerance", 15).longValue();
        String property = System.getProperty("rx3.scheduler.drift-tolerance-unit", "minutes");
        b = "seconds".equalsIgnoreCase(property) ? TimeUnit.SECONDS.toNanos(longValue) : "milliseconds".equalsIgnoreCase(property) ? TimeUnit.MILLISECONDS.toNanos(longValue) : TimeUnit.MINUTES.toNanos(longValue);
    }

    public abstract omc a();

    public xi4 b(Runnable runnable) {
        return c(runnable, 0, TimeUnit.NANOSECONDS);
    }

    public xi4 c(Runnable runnable, long j, TimeUnit timeUnit) {
        omc a2 = a();
        Objects.requireNonNull(runnable, "run is null");
        mmc mmc = new mmc(runnable, a2);
        a2.c(mmc, j, timeUnit);
        return mmc;
    }

    public xi4 d(Runnable runnable, long j, long j2, TimeUnit timeUnit) {
        omc a2 = a();
        Objects.requireNonNull(runnable, "run is null");
        xd6 xd6 = new xd6(runnable, a2);
        xi4 d = a2.d(xd6, j, j2, timeUnit);
        return d == cw4.a ? d : xd6;
    }
}

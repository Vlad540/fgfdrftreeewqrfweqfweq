package defpackage;

import java.util.concurrent.TimeUnit;

/* renamed from: omc  reason: default package */
public abstract class omc implements xi4 {
    public static long a(TimeUnit timeUnit) {
        return !qmc.a ? timeUnit.convert(System.currentTimeMillis(), TimeUnit.MILLISECONDS) : timeUnit.convert(System.nanoTime(), TimeUnit.NANOSECONDS);
    }

    public xi4 b(Runnable runnable) {
        return c(runnable, 0, TimeUnit.NANOSECONDS);
    }

    public abstract xi4 c(Runnable runnable, long j, TimeUnit timeUnit);

    public final xi4 d(Runnable runnable, long j, long j2, TimeUnit timeUnit) {
        long j3 = j;
        TimeUnit timeUnit2 = timeUnit;
        bw1 bw1 = new bw1(2);
        bw1 bw12 = new bw1(bw1);
        long nanos = timeUnit2.toNanos(j2);
        long a = a(TimeUnit.NANOSECONDS);
        xi4 c = c(new nmc(this, timeUnit2.toNanos(j3) + a, runnable, a, bw12, nanos), j3, timeUnit2);
        if (c == cw4.a) {
            return c;
        }
        bj4.c(bw1, c);
        return bw12;
    }
}

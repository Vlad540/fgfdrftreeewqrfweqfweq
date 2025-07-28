package defpackage;

import java.util.Objects;
import java.util.concurrent.TimeUnit;

/* renamed from: xpe  reason: default package */
public final class xpe extends qmc {
    public static final xpe c = new Object();

    public final omc a() {
        return new wpe();
    }

    public final xi4 b(Runnable runnable) {
        Objects.requireNonNull(runnable, "run is null");
        runnable.run();
        return cw4.a;
    }

    public final xi4 c(Runnable runnable, long j, TimeUnit timeUnit) {
        try {
            timeUnit.sleep(j);
            Objects.requireNonNull(runnable, "run is null");
            runnable.run();
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
            xs7.F(e);
        }
        return cw4.a;
    }
}

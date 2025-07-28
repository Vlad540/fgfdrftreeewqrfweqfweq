package defpackage;

import java.util.Objects;
import java.util.concurrent.Future;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* renamed from: nid  reason: default package */
public final class nid extends omc {
    public final ScheduledExecutorService a;
    public final n83 b = new Object();
    public volatile boolean c;

    /* JADX WARNING: type inference failed for: r1v1, types: [n83, java.lang.Object] */
    public nid(ScheduledExecutorService scheduledExecutorService) {
        this.a = scheduledExecutorService;
    }

    public final xi4 c(Runnable runnable, long j, TimeUnit timeUnit) {
        Future future;
        boolean z = this.c;
        cw4 cw4 = cw4.a;
        if (z) {
            return cw4;
        }
        Objects.requireNonNull(runnable, "run is null");
        ulc ulc = new ulc(runnable, this.b);
        this.b.a(ulc);
        if (j <= 0) {
            try {
                future = this.a.submit(ulc);
            } catch (RejectedExecutionException e) {
                f();
                xs7.F(e);
                return cw4;
            }
        } else {
            future = this.a.schedule(ulc, j, timeUnit);
        }
        ulc.a(future);
        return ulc;
    }

    public final void f() {
        if (!this.c) {
            this.c = true;
            this.b.f();
        }
    }

    public final boolean h() {
        return this.c;
    }
}

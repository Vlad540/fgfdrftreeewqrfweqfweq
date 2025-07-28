package defpackage;

import java.util.Objects;
import java.util.concurrent.Future;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;

/* renamed from: uj9  reason: default package */
public class uj9 extends omc {
    public final ScheduledThreadPoolExecutor a;
    public volatile boolean b;

    public uj9(ThreadFactory threadFactory) {
        boolean z = wmc.a;
        ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = new ScheduledThreadPoolExecutor(1, threadFactory);
        scheduledThreadPoolExecutor.setRemoveOnCancelPolicy(wmc.a);
        this.a = scheduledThreadPoolExecutor;
    }

    public final xi4 b(Runnable runnable) {
        return c(runnable, 0, (TimeUnit) null);
    }

    public final xi4 c(Runnable runnable, long j, TimeUnit timeUnit) {
        return this.b ? cw4.a : e(runnable, j, timeUnit, (yi4) null);
    }

    public final ulc e(Runnable runnable, long j, TimeUnit timeUnit, yi4 yi4) {
        Future future;
        Objects.requireNonNull(runnable, "run is null");
        ulc ulc = new ulc(runnable, yi4);
        if (yi4 != null && !yi4.a(ulc)) {
            return ulc;
        }
        int i = (j > 0 ? 1 : (j == 0 ? 0 : -1));
        ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = this.a;
        if (i <= 0) {
            try {
                future = scheduledThreadPoolExecutor.submit(ulc);
            } catch (RejectedExecutionException e) {
                if (yi4 != null) {
                    yi4.b(ulc);
                }
                xs7.F(e);
            }
        } else {
            future = scheduledThreadPoolExecutor.schedule(ulc, j, timeUnit);
        }
        ulc.a(future);
        return ulc;
    }

    public final void f() {
        if (!this.b) {
            this.b = true;
            this.a.shutdownNow();
        }
    }

    public final boolean h() {
        return this.b;
    }
}

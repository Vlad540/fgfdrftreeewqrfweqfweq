package defpackage;

import java.util.Objects;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* renamed from: y15  reason: default package */
public final class y15 extends qmc {
    public final boolean c;
    public final boolean d = false;
    public final Executor e;

    public y15(Executor executor, boolean z) {
        this.e = executor;
        this.c = z;
    }

    public final omc a() {
        return new w15(this.e, this.c, this.d);
    }

    /* JADX WARNING: type inference failed for: r1v3, types: [xi4, h0, java.util.concurrent.Callable] */
    public final xi4 b(Runnable runnable) {
        Executor executor = this.e;
        Objects.requireNonNull(runnable, "run is null");
        try {
            boolean z = executor instanceof ExecutorService;
            boolean z2 = this.c;
            if (z) {
                ? h0Var = new h0(runnable, z2);
                h0Var.a(((ExecutorService) executor).submit(h0Var));
                return h0Var;
            } else if (z2) {
                v15 v15 = new v15(runnable, (yi4) null);
                executor.execute(v15);
                return v15;
            } else {
                u15 u15 = new u15(runnable);
                executor.execute(u15);
                return u15;
            }
        } catch (RejectedExecutionException e2) {
            xs7.F(e2);
            return cw4.a;
        }
    }

    /* JADX WARNING: type inference failed for: r1v2, types: [xi4, h0, java.util.concurrent.Callable] */
    public final xi4 c(Runnable runnable, long j, TimeUnit timeUnit) {
        Objects.requireNonNull(runnable, "run is null");
        Executor executor = this.e;
        if (executor instanceof ScheduledExecutorService) {
            try {
                ? h0Var = new h0(runnable, this.c);
                h0Var.a(((ScheduledExecutorService) executor).schedule(h0Var, j, timeUnit));
                return h0Var;
            } catch (RejectedExecutionException e2) {
                xs7.F(e2);
                return cw4.a;
            }
        } else {
            t15 t15 = new t15(runnable);
            xi4 c2 = x15.a.c(new p36((Object) this, (Object) t15, false, 6), j, timeUnit);
            bw1 bw1 = t15.a;
            bw1.getClass();
            bj4.c(bw1, c2);
            return t15;
        }
    }

    /* JADX WARNING: type inference failed for: r3v0, types: [java.lang.Runnable] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final defpackage.xi4 d(java.lang.Runnable r10, long r11, long r13, java.util.concurrent.TimeUnit r15) {
        /*
            r9 = this;
            java.util.concurrent.Executor r0 = r9.e
            boolean r1 = r0 instanceof java.util.concurrent.ScheduledExecutorService
            if (r1 == 0) goto L_0x0028
            java.lang.String r1 = "run is null"
            java.util.Objects.requireNonNull(r10, r1)
            plc r1 = new plc     // Catch:{ RejectedExecutionException -> 0x0021 }
            boolean r9 = r9.c     // Catch:{ RejectedExecutionException -> 0x0021 }
            r1.<init>(r10, r9)     // Catch:{ RejectedExecutionException -> 0x0021 }
            r2 = r0
            java.util.concurrent.ScheduledExecutorService r2 = (java.util.concurrent.ScheduledExecutorService) r2     // Catch:{ RejectedExecutionException -> 0x0021 }
            r3 = r1
            r4 = r11
            r6 = r13
            r8 = r15
            java.util.concurrent.ScheduledFuture r9 = r2.scheduleAtFixedRate(r3, r4, r6, r8)     // Catch:{ RejectedExecutionException -> 0x0021 }
            r1.a(r9)     // Catch:{ RejectedExecutionException -> 0x0021 }
            return r1
        L_0x0021:
            r9 = move-exception
            defpackage.xs7.F(r9)
            cw4 r9 = defpackage.cw4.a
            return r9
        L_0x0028:
            xi4 r9 = super.d(r10, r11, r13, r15)
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.y15.d(java.lang.Runnable, long, long, java.util.concurrent.TimeUnit):xi4");
    }
}

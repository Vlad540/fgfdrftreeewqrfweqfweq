package defpackage;

import java.util.Objects;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: oid  reason: default package */
public final class oid extends qmc {
    public static final qic d = new qic("RxSingleScheduler", Math.max(1, Math.min(10, Integer.getInteger("rx3.single-priority", 5).intValue())), true);
    public static final ScheduledExecutorService e;
    public final AtomicReference c;

    static {
        ScheduledExecutorService newScheduledThreadPool = Executors.newScheduledThreadPool(0);
        e = newScheduledThreadPool;
        newScheduledThreadPool.shutdown();
    }

    public oid() {
        AtomicReference atomicReference = new AtomicReference();
        this.c = atomicReference;
        boolean z = wmc.a;
        ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = new ScheduledThreadPoolExecutor(1, d);
        scheduledThreadPoolExecutor.setRemoveOnCancelPolicy(wmc.a);
        atomicReference.lazySet(scheduledThreadPoolExecutor);
    }

    public final omc a() {
        return new nid((ScheduledExecutorService) this.c.get());
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [xi4, h0, java.util.concurrent.Callable] */
    public final xi4 c(Runnable runnable, long j, TimeUnit timeUnit) {
        Future future;
        Objects.requireNonNull(runnable, "run is null");
        ? h0Var = new h0(runnable, true);
        int i = (j > 0 ? 1 : (j == 0 ? 0 : -1));
        AtomicReference atomicReference = this.c;
        if (i <= 0) {
            try {
                future = ((ScheduledExecutorService) atomicReference.get()).submit(h0Var);
            } catch (RejectedExecutionException e2) {
                xs7.F(e2);
                return cw4.a;
            }
        } else {
            future = ((ScheduledExecutorService) atomicReference.get()).schedule(h0Var, j, timeUnit);
        }
        h0Var.a(future);
        return h0Var;
    }

    /* JADX WARNING: type inference failed for: r1v3, types: [java.lang.Runnable] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final defpackage.xi4 d(java.lang.Runnable r11, long r12, long r14, java.util.concurrent.TimeUnit r16) {
        /*
            r10 = this;
            r0 = r11
            r2 = r12
            java.lang.String r1 = "run is null"
            java.util.Objects.requireNonNull(r11, r1)
            r4 = 0
            int r1 = (r14 > r4 ? 1 : (r14 == r4 ? 0 : -1))
            cw4 r7 = defpackage.cw4.a
            r6 = r10
            java.util.concurrent.atomic.AtomicReference r6 = r6.c
            if (r1 > 0) goto L_0x0036
            java.lang.Object r1 = r6.get()
            java.util.concurrent.ScheduledExecutorService r1 = (java.util.concurrent.ScheduledExecutorService) r1
            yy6 r6 = new yy6
            r6.<init>(r11, r1)
            int r0 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r0 > 0) goto L_0x0028
            java.util.concurrent.Future r0 = r1.submit(r6)     // Catch:{ RejectedExecutionException -> 0x0026 }
            goto L_0x002e
        L_0x0026:
            r0 = move-exception
            goto L_0x0032
        L_0x0028:
            r8 = r16
            java.util.concurrent.ScheduledFuture r0 = r1.schedule(r6, r12, r8)     // Catch:{ RejectedExecutionException -> 0x0026 }
        L_0x002e:
            r6.a(r0)     // Catch:{ RejectedExecutionException -> 0x0026 }
            return r6
        L_0x0032:
            defpackage.xs7.F(r0)
            return r7
        L_0x0036:
            r8 = r16
            plc r9 = new plc
            r1 = 1
            r9.<init>(r11, r1)
            java.lang.Object r0 = r6.get()     // Catch:{ RejectedExecutionException -> 0x0051 }
            java.util.concurrent.ScheduledExecutorService r0 = (java.util.concurrent.ScheduledExecutorService) r0     // Catch:{ RejectedExecutionException -> 0x0051 }
            r1 = r9
            r2 = r12
            r4 = r14
            r6 = r16
            java.util.concurrent.ScheduledFuture r0 = r0.scheduleAtFixedRate(r1, r2, r4, r6)     // Catch:{ RejectedExecutionException -> 0x0051 }
            r9.a(r0)     // Catch:{ RejectedExecutionException -> 0x0051 }
            return r9
        L_0x0051:
            r0 = move-exception
            defpackage.xs7.F(r0)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.oid.d(java.lang.Runnable, long, long, java.util.concurrent.TimeUnit):xi4");
    }
}

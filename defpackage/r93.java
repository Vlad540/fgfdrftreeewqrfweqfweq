package defpackage;

import java.util.Objects;
import java.util.concurrent.Future;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: r93  reason: default package */
public final class r93 extends qmc {
    public static final p93 d;
    public static final qic e;
    public static final int f;
    public static final q93 g;
    public final AtomicReference c;

    /* JADX WARNING: type inference failed for: r0v3, types: [uj9, q93] */
    static {
        int availableProcessors = Runtime.getRuntime().availableProcessors();
        int intValue = Integer.getInteger("rx3.computation-threads", 0).intValue();
        if (intValue > 0 && intValue <= availableProcessors) {
            availableProcessors = intValue;
        }
        f = availableProcessors;
        ? uj9 = new uj9(new qic("RxComputationShutdown"));
        g = uj9;
        uj9.f();
        qic qic = new qic("RxComputationThreadPool", Math.max(1, Math.min(10, Integer.getInteger("rx3.computation-priority", 5).intValue())), true);
        e = qic;
        p93 p93 = new p93(0, qic);
        d = p93;
        for (q93 f2 : p93.b) {
            f2.f();
        }
    }

    public r93() {
        AtomicReference atomicReference;
        p93 p93 = d;
        this.c = new AtomicReference(p93);
        p93 p932 = new p93(f, e);
        do {
            atomicReference = this.c;
            if (atomicReference.compareAndSet(p93, p932)) {
                return;
            }
        } while (atomicReference.get() == p93);
        for (q93 f2 : p932.b) {
            f2.f();
        }
    }

    public final omc a() {
        return new o93(((p93) this.c.get()).a());
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [xi4, h0, java.util.concurrent.Callable] */
    public final xi4 c(Runnable runnable, long j, TimeUnit timeUnit) {
        Future future;
        q93 a = ((p93) this.c.get()).a();
        a.getClass();
        Objects.requireNonNull(runnable, "run is null");
        ? h0Var = new h0(runnable, true);
        int i = (j > 0 ? 1 : (j == 0 ? 0 : -1));
        ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = a.a;
        if (i <= 0) {
            try {
                future = scheduledThreadPoolExecutor.submit(h0Var);
            } catch (RejectedExecutionException e2) {
                xs7.F(e2);
                return cw4.a;
            }
        } else {
            future = scheduledThreadPoolExecutor.schedule(h0Var, j, timeUnit);
        }
        h0Var.a(future);
        return h0Var;
    }

    /* JADX WARNING: type inference failed for: r1v6, types: [java.lang.Runnable] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final defpackage.xi4 d(java.lang.Runnable r11, long r12, long r14, java.util.concurrent.TimeUnit r16) {
        /*
            r10 = this;
            r0 = r11
            r2 = r12
            r1 = r10
            java.util.concurrent.atomic.AtomicReference r1 = r1.c
            java.lang.Object r1 = r1.get()
            p93 r1 = (defpackage.p93) r1
            q93 r1 = r1.a()
            r1.getClass()
            java.lang.String r4 = "run is null"
            java.util.Objects.requireNonNull(r11, r4)
            r4 = 0
            int r6 = (r14 > r4 ? 1 : (r14 == r4 ? 0 : -1))
            cw4 r7 = defpackage.cw4.a
            java.util.concurrent.ScheduledThreadPoolExecutor r1 = r1.a
            if (r6 > 0) goto L_0x003f
            yy6 r6 = new yy6
            r6.<init>(r11, r1)
            int r0 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r0 > 0) goto L_0x002f
            java.util.concurrent.Future r0 = r1.submit(r6)     // Catch:{ RejectedExecutionException -> 0x003a }
            goto L_0x0035
        L_0x002f:
            r8 = r16
            java.util.concurrent.ScheduledFuture r0 = r1.schedule(r6, r12, r8)     // Catch:{ RejectedExecutionException -> 0x003a }
        L_0x0035:
            r6.a(r0)     // Catch:{ RejectedExecutionException -> 0x003a }
            r7 = r6
            goto L_0x005a
        L_0x003a:
            r0 = move-exception
            defpackage.xs7.F(r0)
            goto L_0x005a
        L_0x003f:
            r8 = r16
            plc r9 = new plc
            r4 = 1
            r9.<init>(r11, r4)
            r0 = r1
            r1 = r9
            r2 = r12
            r4 = r14
            r6 = r16
            java.util.concurrent.ScheduledFuture r0 = r0.scheduleAtFixedRate(r1, r2, r4, r6)     // Catch:{ RejectedExecutionException -> 0x0056 }
            r9.a(r0)     // Catch:{ RejectedExecutionException -> 0x0056 }
            r7 = r9
            goto L_0x005a
        L_0x0056:
            r0 = move-exception
            defpackage.xs7.F(r0)
        L_0x005a:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.r93.d(java.lang.Runnable, long, long, java.util.concurrent.TimeUnit):xi4");
    }
}

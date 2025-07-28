package defpackage;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: hv9  reason: default package */
public final class hv9 extends jv9 {
    public final AtomicInteger w0 = new AtomicInteger(1);

    public hv9(zyc zyc, long j, TimeUnit timeUnit, qmc qmc) {
        super(zyc, j, timeUnit, qmc);
    }

    public final void a() {
        e();
        if (this.w0.decrementAndGet() == 0) {
            this.a.b();
        }
    }

    public final void run() {
        AtomicInteger atomicInteger = this.w0;
        if (atomicInteger.incrementAndGet() == 2) {
            e();
            if (atomicInteger.decrementAndGet() == 0) {
                this.a.b();
            }
        }
    }
}

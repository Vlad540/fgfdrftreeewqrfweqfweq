package defpackage;

import java.util.concurrent.TimeUnit;

/* renamed from: zv9  reason: default package */
public final class zv9 extends ms9 {
    public final qmc a;
    public final long b;
    public final TimeUnit c;

    public zv9(long j, TimeUnit timeUnit, qmc qmc) {
        this.b = j;
        this.c = timeUnit;
        this.a = qmc;
    }

    public final void q(bw9 bw9) {
        yv9 yv9 = new yv9(bw9);
        bw9.d(yv9);
        xi4 c2 = this.a.c(yv9, this.b, this.c);
        while (!yv9.compareAndSet((Object) null, c2)) {
            if (yv9.get() != null) {
                if (yv9.get() == bj4.a) {
                    c2.f();
                    return;
                }
                return;
            }
        }
    }
}

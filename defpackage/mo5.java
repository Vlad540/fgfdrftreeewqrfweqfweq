package defpackage;

import java.util.concurrent.TimeUnit;

/* renamed from: mo5  reason: default package */
public final class mo5 extends an5 {
    public final qmc b;
    public final long c;
    public final TimeUnit o;

    public mo5(long j, TimeUnit timeUnit, qmc qmc) {
        this.c = j;
        this.o = timeUnit;
        this.b = qmc;
    }

    public final void g(b1e b1e) {
        lo5 lo5 = new lo5(b1e);
        b1e.e(lo5);
        xi4 c2 = this.b.c(lo5, this.c, this.o);
        while (!lo5.compareAndSet((Object) null, c2)) {
            if (lo5.get() != null) {
                if (lo5.get() == bj4.a) {
                    c2.f();
                    return;
                }
                return;
            }
        }
    }
}

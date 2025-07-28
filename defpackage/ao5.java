package defpackage;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: ao5  reason: default package */
public final class ao5 extends AtomicInteger implements ko5, d1e {
    public final bjb a;
    public final AtomicReference b = new AtomicReference();
    public final AtomicLong c = new AtomicLong();
    public bo5 o;

    public ao5(bjb bjb) {
        this.a = bjb;
    }

    public final void b() {
        this.o.cancel();
        this.o.x0.b();
    }

    public final void c(Object obj) {
        if (getAndIncrement() == 0) {
            while (this.b.get() != f1e.a) {
                this.a.f(this.o);
                if (decrementAndGet() == 0) {
                    return;
                }
            }
        }
    }

    public final void cancel() {
        f1e.a(this.b);
    }

    public final void e(d1e d1e) {
        AtomicReference atomicReference = this.b;
        AtomicLong atomicLong = this.c;
        if (f1e.c(atomicReference, d1e)) {
            long andSet = atomicLong.getAndSet(0);
            if (andSet != 0) {
                d1e.i(andSet);
            }
        }
    }

    public final void i(long j) {
        f1e.b(this.b, this.c, j);
    }

    public final void onError(Throwable th) {
        this.o.cancel();
        this.o.x0.onError(th);
    }
}

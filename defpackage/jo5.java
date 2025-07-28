package defpackage;

import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: jo5  reason: default package */
public final class jo5 extends AtomicReference implements ko5, d1e, Runnable {
    public final boolean X;
    public bjb Y;
    public final b1e a;
    public final omc b;
    public final AtomicReference c = new AtomicReference();
    public final AtomicLong o = new AtomicLong();

    public jo5(b1e b1e, omc omc, bjb bjb, boolean z) {
        this.a = b1e;
        this.b = omc;
        this.Y = bjb;
        this.X = !z;
    }

    public final void a(long j, d1e d1e) {
        if (this.X || Thread.currentThread() == get()) {
            d1e.i(j);
            return;
        }
        this.b.b(new io5(j, d1e));
    }

    public final void b() {
        this.a.b();
        this.b.f();
    }

    public final void c(Object obj) {
        this.a.c(obj);
    }

    public final void cancel() {
        f1e.a(this.c);
        this.b.f();
    }

    public final void e(d1e d1e) {
        if (f1e.c(this.c, d1e)) {
            long andSet = this.o.getAndSet(0);
            if (andSet != 0) {
                a(andSet, d1e);
            }
        }
    }

    public final void i(long j) {
        if (f1e.d(j)) {
            AtomicReference atomicReference = this.c;
            d1e d1e = (d1e) atomicReference.get();
            if (d1e != null) {
                a(j, d1e);
                return;
            }
            AtomicLong atomicLong = this.o;
            z3d.b(atomicLong, j);
            d1e d1e2 = (d1e) atomicReference.get();
            if (d1e2 != null) {
                long andSet = atomicLong.getAndSet(0);
                if (andSet != 0) {
                    a(andSet, d1e2);
                }
            }
        }
    }

    public final void onError(Throwable th) {
        this.a.onError(th);
        this.b.f();
    }

    public final void run() {
        lazySet(Thread.currentThread());
        an5 an5 = this.Y;
        this.Y = null;
        an5.f(this);
    }
}

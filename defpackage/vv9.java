package defpackage;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: vv9  reason: default package */
public final class vv9 extends AtomicLong implements bw9, xi4, wv9 {
    public final bw1 X = new bw1(2);
    public final AtomicReference Y = new AtomicReference();
    public final bw9 a;
    public final long b;
    public final TimeUnit c;
    public final omc o;

    public vv9(bw9 bw9, long j, TimeUnit timeUnit, omc omc) {
        this.a = bw9;
        this.b = j;
        this.c = timeUnit;
        this.o = omc;
    }

    public final void a(long j) {
        if (compareAndSet(j, Long.MAX_VALUE)) {
            bj4.a(this.Y);
            this.a.onError(new TimeoutException(i15.e(this.b, this.c)));
            this.o.f();
        }
    }

    public final void b() {
        if (getAndSet(Long.MAX_VALUE) != Long.MAX_VALUE) {
            bw1 bw1 = this.X;
            bw1.getClass();
            bj4.a(bw1);
            this.a.b();
            this.o.f();
        }
    }

    public final void c(Object obj) {
        long j = get();
        if (j != Long.MAX_VALUE) {
            long j2 = 1 + j;
            if (compareAndSet(j, j2)) {
                bw1 bw1 = this.X;
                ((xi4) bw1.get()).f();
                this.a.c(obj);
                xi4 c2 = this.o.c(new io5(j2, (wv9) this), this.b, this.c);
                bw1.getClass();
                bj4.c(bw1, c2);
            }
        }
    }

    public final void d(xi4 xi4) {
        bj4.e(this.Y, xi4);
    }

    public final void f() {
        bj4.a(this.Y);
        this.o.f();
    }

    public final boolean h() {
        return bj4.b((xi4) this.Y.get());
    }

    public final void onError(Throwable th) {
        if (getAndSet(Long.MAX_VALUE) != Long.MAX_VALUE) {
            bw1 bw1 = this.X;
            bw1.getClass();
            bj4.a(bw1);
            this.a.onError(th);
            this.o.f();
            return;
        }
        xs7.F(th);
    }
}

package defpackage;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: uv9  reason: default package */
public final class uv9 extends AtomicReference implements bw9, xi4, wv9 {
    public final bw1 X = new bw1(2);
    public final AtomicLong Y = new AtomicLong();
    public final AtomicReference Z = new AtomicReference();
    public final bw9 a;
    public final long b;
    public final TimeUnit c;
    public final omc o;
    public nv9 w0 = null;

    public uv9(bw9 bw9, long j, TimeUnit timeUnit, omc omc) {
        this.a = bw9;
        this.b = j;
        this.c = timeUnit;
        this.o = omc;
    }

    public final void a(long j) {
        if (this.Y.compareAndSet(j, Long.MAX_VALUE)) {
            bj4.a(this.Z);
            nv9 nv9 = this.w0;
            this.w0 = null;
            nv9.a(new b2b(this.a, this, false, 27));
            this.o.f();
        }
    }

    public final void b() {
        if (this.Y.getAndSet(Long.MAX_VALUE) != Long.MAX_VALUE) {
            bw1 bw1 = this.X;
            bw1.getClass();
            bj4.a(bw1);
            this.a.b();
            this.o.f();
        }
    }

    public final void c(Object obj) {
        AtomicLong atomicLong = this.Y;
        long j = atomicLong.get();
        if (j != Long.MAX_VALUE) {
            long j2 = 1 + j;
            if (atomicLong.compareAndSet(j, j2)) {
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
        bj4.e(this.Z, xi4);
    }

    public final void f() {
        bj4.a(this.Z);
        bj4.a(this);
        this.o.f();
    }

    public final boolean h() {
        return bj4.b((xi4) get());
    }

    public final void onError(Throwable th) {
        if (this.Y.getAndSet(Long.MAX_VALUE) != Long.MAX_VALUE) {
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

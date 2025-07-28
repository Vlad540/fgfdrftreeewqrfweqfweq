package defpackage;

import io.reactivex.rxjava3.exceptions.QueueOverflowException;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: ln5  reason: default package */
public final class ln5 extends AtomicReference implements ko5, xi4 {
    public volatile boolean X;
    public volatile xgd Y;
    public long Z;
    public final long a;
    public final mn5 b;
    public final int c;
    public final int o;
    public int w0;

    public ln5(mn5 mn5, int i, long j) {
        this.a = j;
        this.b = mn5;
        this.o = i;
        this.c = i >> 2;
    }

    public final void a(long j) {
        if (this.w0 != 1) {
            long j2 = this.Z + j;
            if (j2 >= ((long) this.c)) {
                this.Z = 0;
                ((d1e) get()).i(j2);
                return;
            }
            this.Z = j2;
        }
    }

    public final void b() {
        this.X = true;
        this.b.d();
    }

    public final void c(Object obj) {
        if (this.w0 != 2) {
            mn5 mn5 = this.b;
            if (mn5.get() != 0 || !mn5.compareAndSet(0, 1)) {
                xgd xgd = this.Y;
                if (xgd == null) {
                    xgd = new jnd(mn5.X);
                    this.Y = xgd;
                }
                if (!xgd.offer(obj)) {
                    mn5.onError(new QueueOverflowException());
                    return;
                } else if (mn5.getAndIncrement() != 0) {
                    return;
                }
            } else {
                long j = mn5.z0.get();
                xgd xgd2 = this.Y;
                if (j == 0 || (xgd2 != null && !xgd2.isEmpty())) {
                    if (xgd2 == null) {
                        xgd2 = new jnd(mn5.X);
                        this.Y = xgd2;
                    }
                    if (!xgd2.offer(obj)) {
                        mn5.onError(new QueueOverflowException());
                    }
                } else {
                    mn5.a.c(obj);
                    if (j != Long.MAX_VALUE) {
                        mn5.z0.decrementAndGet();
                    }
                    a(1);
                }
                if (mn5.decrementAndGet() == 0) {
                    return;
                }
            }
            mn5.f();
            return;
        }
        this.b.d();
    }

    public final void e(d1e d1e) {
        if (f1e.c(this, d1e)) {
            if (d1e instanceof zjb) {
                zjb zjb = (zjb) d1e;
                int q = zjb.q(7);
                if (q == 1) {
                    this.w0 = q;
                    this.Y = zjb;
                    this.X = true;
                    this.b.d();
                    return;
                } else if (q == 2) {
                    this.w0 = q;
                    this.Y = zjb;
                }
            }
            d1e.i((long) this.o);
        }
    }

    public final void f() {
        f1e.a(this);
    }

    public final boolean h() {
        return get() == f1e.a;
    }

    public final void onError(Throwable th) {
        lazySet(f1e.a);
        mn5 mn5 = this.b;
        if (mn5.w0.a(th)) {
            this.X = true;
            if (!mn5.c) {
                mn5.A0.cancel();
                for (ln5 ln5 : (ln5[]) mn5.y0.getAndSet(mn5.H0)) {
                    ln5.getClass();
                    f1e.a(ln5);
                }
            }
            mn5.d();
        }
    }
}

package defpackage;

import java.util.Objects;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: bo5  reason: default package */
public final class bo5 extends AtomicInteger implements ko5, d1e {
    public long A0;
    public final AtomicLong X = new AtomicLong();
    public final boolean Y = false;
    public volatile boolean Z;
    public d1e a;
    public long b;
    public final AtomicReference c = new AtomicReference();
    public final AtomicLong o = new AtomicLong();
    public boolean w0;
    public final b1e x0;
    public final zn5 y0;
    public final d1e z0;

    public bo5(dzc dzc, azc azc, ao5 ao5) {
        this.x0 = dzc;
        this.y0 = azc;
        this.z0 = ao5;
    }

    public final void a() {
        if (getAndIncrement() == 0) {
            d();
        }
    }

    public final void b() {
        this.z0.cancel();
        this.x0.b();
    }

    public final void c(Object obj) {
        this.A0++;
        this.x0.c(obj);
    }

    public final void cancel() {
        if (!this.Z) {
            this.Z = true;
            a();
        }
        this.z0.cancel();
    }

    public final void d() {
        int i = 1;
        long j = 0;
        d1e d1e = null;
        do {
            d1e d1e2 = (d1e) this.c.get();
            if (d1e2 != null) {
                d1e2 = (d1e) this.c.getAndSet((Object) null);
            }
            long j2 = this.o.get();
            if (j2 != 0) {
                j2 = this.o.getAndSet(0);
            }
            long j3 = this.X.get();
            if (j3 != 0) {
                j3 = this.X.getAndSet(0);
            }
            d1e d1e3 = this.a;
            if (this.Z) {
                if (d1e3 != null) {
                    d1e3.cancel();
                    this.a = null;
                }
                if (d1e2 != null) {
                    d1e2.cancel();
                }
            } else {
                long j4 = this.b;
                if (j4 != Long.MAX_VALUE) {
                    j4 = z3d.c(j4, j2);
                    if (j4 != Long.MAX_VALUE) {
                        j4 -= j3;
                        if (j4 < 0) {
                            xs7.F(new IllegalStateException(us8.i(j4, "More produced than requested: ")));
                            j4 = 0;
                        }
                    }
                    this.b = j4;
                }
                if (d1e2 != null) {
                    if (d1e3 != null && this.Y) {
                        d1e3.cancel();
                    }
                    this.a = d1e2;
                    if (j4 != 0) {
                        j = z3d.c(j, j4);
                        d1e = d1e2;
                    }
                } else if (!(d1e3 == null || j2 == 0)) {
                    j = z3d.c(j, j2);
                    d1e = d1e3;
                }
            }
            i = addAndGet(-i);
        } while (i != 0);
        if (j != 0) {
            d1e.i(j);
        }
    }

    public void e(d1e d1e) {
        f(d1e);
    }

    public final void f(d1e d1e) {
        if (this.Z) {
            d1e.cancel();
            return;
        }
        Objects.requireNonNull(d1e, "s is null");
        if (get() != 0 || !compareAndSet(0, 1)) {
            d1e d1e2 = (d1e) this.c.getAndSet(d1e);
            if (d1e2 != null && this.Y) {
                d1e2.cancel();
            }
            a();
            return;
        }
        d1e d1e3 = this.a;
        if (d1e3 != null && this.Y) {
            d1e3.cancel();
        }
        this.a = d1e;
        long j = this.b;
        if (decrementAndGet() != 0) {
            d();
        }
        if (j != 0) {
            d1e.i(j);
        }
    }

    public final void i(long j) {
        if (f1e.d(j) && !this.w0) {
            if (get() != 0 || !compareAndSet(0, 1)) {
                z3d.b(this.o, j);
                a();
                return;
            }
            long j2 = this.b;
            if (j2 != Long.MAX_VALUE) {
                long c2 = z3d.c(j2, j);
                this.b = c2;
                if (c2 == Long.MAX_VALUE) {
                    this.w0 = true;
                }
            }
            d1e d1e = this.a;
            if (decrementAndGet() != 0) {
                d();
            }
            if (d1e != null) {
                d1e.i(j);
            }
        }
    }

    public final void onError(Throwable th) {
        f(vw4.a);
        long j = this.A0;
        long j2 = 0;
        if (j != 0) {
            this.A0 = 0;
            if (!this.w0) {
                if (get() != 0 || !compareAndSet(0, 1)) {
                    z3d.b(this.X, j);
                    a();
                } else {
                    long j3 = this.b;
                    if (j3 != Long.MAX_VALUE) {
                        long j4 = j3 - j;
                        if (j4 < 0) {
                            xs7.F(new IllegalStateException(us8.i(j4, "More produced than requested: ")));
                        } else {
                            j2 = j4;
                        }
                        this.b = j2;
                    }
                    if (decrementAndGet() != 0) {
                        d();
                    }
                }
            }
        }
        this.z0.i(1);
        this.y0.c(th);
    }
}

package defpackage;

import io.reactivex.rxjava3.exceptions.QueueOverflowException;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: gn5  reason: default package */
public final class gn5 extends AtomicInteger implements d1e, ko5 {
    public final fn5 A0;
    public long B0;
    public int C0;
    public Object D0;
    public volatile int E0;
    public d1e X;
    public volatile boolean Y;
    public volatile boolean Z;
    public final ey a = new AtomicReference();
    public final int b;
    public final int c;
    public xgd o;
    public boolean w0;
    public final b1e x0;
    public final j26 y0;
    public final AtomicLong z0;

    /* JADX WARNING: type inference failed for: r4v1, types: [ey, java.util.concurrent.atomic.AtomicReference] */
    public gn5(b1e b1e, j26 j26, int i, int i2) {
        this.c = i2;
        this.b = i;
        this.x0 = b1e;
        this.y0 = j26;
        this.z0 = new AtomicLong();
        this.A0 = new fn5(0, this);
    }

    public final void a() {
        if (getAndIncrement() == 0) {
            b1e b1e = this.x0;
            int i = this.c;
            xgd xgd = this.o;
            ey eyVar = this.a;
            AtomicLong atomicLong = this.z0;
            int i2 = this.b;
            int i3 = i2 - (i2 >> 1);
            boolean z = this.w0;
            int i4 = 1;
            while (true) {
                if (this.Z) {
                    xgd.clear();
                    this.D0 = null;
                } else {
                    int i5 = this.E0;
                    if (eyVar.get() == null || !(i == 1 || (i == 2 && i5 == 0))) {
                        if (i5 == 0) {
                            boolean z2 = this.Y;
                            try {
                                Object poll = xgd.poll();
                                boolean z3 = poll == null;
                                if (z2 && z3) {
                                    eyVar.e(b1e);
                                    return;
                                } else if (!z3) {
                                    if (!z) {
                                        int i6 = this.C0 + 1;
                                        if (i6 == i3) {
                                            this.C0 = 0;
                                            this.X.i((long) i3);
                                        } else {
                                            this.C0 = i6;
                                        }
                                    }
                                    try {
                                        Object apply = this.y0.apply(poll);
                                        Objects.requireNonNull(apply, "The mapper returned a null SingleSource");
                                        dhd dhd = (dhd) apply;
                                        this.E0 = 1;
                                        dhd.k(this.A0);
                                    } catch (Throwable th) {
                                        ek8.a0(th);
                                        this.X.cancel();
                                        xgd.clear();
                                        eyVar.a(th);
                                        eyVar.e(b1e);
                                        return;
                                    }
                                }
                            } catch (Throwable th2) {
                                Throwable th3 = th2;
                                ek8.a0(th3);
                                this.X.cancel();
                                eyVar.a(th3);
                                eyVar.e(b1e);
                                return;
                            }
                        } else if (i5 == 2) {
                            long j = this.B0;
                            if (j != atomicLong.get()) {
                                Object obj = this.D0;
                                this.D0 = null;
                                b1e.c(obj);
                                this.B0 = j + 1;
                                this.E0 = 0;
                            }
                        }
                    }
                }
                i4 = addAndGet(-i4);
                if (i4 == 0) {
                    return;
                }
            }
            xgd.clear();
            this.D0 = null;
            eyVar.e(b1e);
        }
    }

    public final void b() {
        this.Y = true;
        a();
    }

    public final void c(Object obj) {
        if (obj == null || this.o.offer(obj)) {
            a();
            return;
        }
        this.X.cancel();
        onError(new QueueOverflowException());
    }

    public final void cancel() {
        this.Z = true;
        this.X.cancel();
        fn5 fn5 = this.A0;
        fn5.getClass();
        bj4.a(fn5);
        this.a.b();
        if (getAndIncrement() == 0) {
            this.o.clear();
            this.D0 = null;
        }
    }

    public final void e(d1e d1e) {
        if (f1e.e(this.X, d1e)) {
            this.X = d1e;
            if (d1e instanceof zjb) {
                zjb zjb = (zjb) d1e;
                int q = zjb.q(7);
                if (q == 1) {
                    this.o = zjb;
                    this.w0 = true;
                    this.Y = true;
                    this.x0.e(this);
                    a();
                    return;
                } else if (q == 2) {
                    this.o = zjb;
                    this.x0.e(this);
                    this.X.i((long) this.b);
                    return;
                }
            }
            this.o = new jnd(this.b);
            this.x0.e(this);
            this.X.i((long) this.b);
        }
    }

    public final void i(long j) {
        z3d.b(this.z0, j);
        a();
    }

    public final void onError(Throwable th) {
        if (this.a.a(th)) {
            if (this.c == 1) {
                fn5 fn5 = this.A0;
                fn5.getClass();
                bj4.a(fn5);
            }
            this.Y = true;
            a();
        }
    }
}

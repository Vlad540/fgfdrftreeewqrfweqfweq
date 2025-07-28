package defpackage;

import java.util.Objects;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: zs9  reason: default package */
public final class zs9 extends AtomicInteger implements bw9, xi4 {
    public volatile int A0;
    public xi4 X;
    public volatile boolean Y;
    public volatile boolean Z;
    public final ey a = new AtomicReference();
    public final int b = 2;
    public final int c = 1;
    public xgd o;
    public final bw9 w0;
    public final j26 x0;
    public final fn5 y0;
    public Object z0;

    /* JADX WARNING: type inference failed for: r0v1, types: [ey, java.util.concurrent.atomic.AtomicReference] */
    public zs9(bw9 bw9, j26 j26) {
        this.w0 = bw9;
        this.x0 = j26;
        this.y0 = new fn5(1, this);
    }

    public final void a() {
        if (getAndIncrement() == 0) {
            bw9 bw9 = this.w0;
            int i = this.c;
            xgd xgd = this.o;
            ey eyVar = this.a;
            int i2 = 1;
            while (true) {
                if (this.Z) {
                    xgd.clear();
                    this.z0 = null;
                } else {
                    int i3 = this.A0;
                    if (eyVar.get() == null || !(i == 1 || (i == 2 && i3 == 0))) {
                        boolean z = false;
                        if (i3 == 0) {
                            boolean z2 = this.Y;
                            try {
                                Object poll = xgd.poll();
                                if (poll == null) {
                                    z = true;
                                }
                                if (z2 && z) {
                                    eyVar.d(bw9);
                                    return;
                                } else if (!z) {
                                    try {
                                        Object apply = this.x0.apply(poll);
                                        Objects.requireNonNull(apply, "The mapper returned a null SingleSource");
                                        dhd dhd = (dhd) apply;
                                        this.A0 = 1;
                                        dhd.k(this.y0);
                                    } catch (Throwable th) {
                                        ek8.a0(th);
                                        this.X.f();
                                        xgd.clear();
                                        eyVar.a(th);
                                        eyVar.d(bw9);
                                        return;
                                    }
                                }
                            } catch (Throwable th2) {
                                ek8.a0(th2);
                                this.Z = true;
                                this.X.f();
                                eyVar.a(th2);
                                eyVar.d(bw9);
                                return;
                            }
                        } else if (i3 == 2) {
                            Object obj = this.z0;
                            this.z0 = null;
                            bw9.c(obj);
                            this.A0 = 0;
                        }
                    }
                }
                i2 = addAndGet(-i2);
                if (i2 == 0) {
                    return;
                }
            }
            xgd.clear();
            this.z0 = null;
            eyVar.d(bw9);
        }
    }

    public final void b() {
        this.Y = true;
        a();
    }

    public final void c(Object obj) {
        if (obj != null) {
            this.o.offer(obj);
        }
        a();
    }

    public final void d(xi4 xi4) {
        if (bj4.g(this.X, xi4)) {
            this.X = xi4;
            if (xi4 instanceof xjb) {
                xjb xjb = (xjb) xi4;
                int q = xjb.q(7);
                if (q == 1) {
                    this.o = xjb;
                    this.Y = true;
                    this.w0.d(this);
                    a();
                    return;
                } else if (q == 2) {
                    this.o = xjb;
                    this.w0.d(this);
                    return;
                }
            }
            this.o = new knd(this.b);
            this.w0.d(this);
        }
    }

    public final void f() {
        this.Z = true;
        this.X.f();
        fn5 fn5 = this.y0;
        fn5.getClass();
        bj4.a(fn5);
        this.a.b();
        if (getAndIncrement() == 0) {
            this.o.clear();
            this.z0 = null;
        }
    }

    public final boolean h() {
        return this.Z;
    }

    public final void onError(Throwable th) {
        if (this.a.a(th)) {
            if (this.c == 1) {
                fn5 fn5 = this.y0;
                fn5.getClass();
                bj4.a(fn5);
            }
            this.Y = true;
            a();
        }
    }
}

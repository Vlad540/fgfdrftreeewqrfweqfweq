package defpackage;

import java.util.Objects;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: xs9  reason: default package */
public final class xs9 extends AtomicInteger implements bw9, xi4 {
    public xgd X;
    public xi4 Y;
    public volatile boolean Z;
    public final bw9 a;
    public final j26 b;
    public final vs9 c;
    public final int o;
    public volatile boolean w0;
    public volatile boolean x0;
    public int y0;

    public xs9(zyc zyc, j26 j26, int i) {
        this.a = zyc;
        this.b = j26;
        this.o = i;
        this.c = new vs9(zyc, this, 1);
    }

    public final void a() {
        if (getAndIncrement() == 0) {
            while (!this.w0) {
                if (!this.Z) {
                    boolean z = this.x0;
                    try {
                        Object poll = this.X.poll();
                        boolean z2 = poll == null;
                        if (z && z2) {
                            this.w0 = true;
                            this.a.b();
                            return;
                        } else if (!z2) {
                            try {
                                Object apply = this.b.apply(poll);
                                Objects.requireNonNull(apply, "The mapper returned a null ObservableSource");
                                nv9 nv9 = (nv9) apply;
                                this.Z = true;
                                nv9.a(this.c);
                            } catch (Throwable th) {
                                ek8.a0(th);
                                f();
                                this.X.clear();
                                this.a.onError(th);
                                return;
                            }
                        }
                    } catch (Throwable th2) {
                        ek8.a0(th2);
                        f();
                        this.X.clear();
                        this.a.onError(th2);
                        return;
                    }
                }
                if (decrementAndGet() == 0) {
                    return;
                }
            }
            this.X.clear();
        }
    }

    public final void b() {
        if (!this.x0) {
            this.x0 = true;
            a();
        }
    }

    public final void c(Object obj) {
        if (!this.x0) {
            if (this.y0 == 0) {
                this.X.offer(obj);
            }
            a();
        }
    }

    public final void d(xi4 xi4) {
        if (bj4.g(this.Y, xi4)) {
            this.Y = xi4;
            if (xi4 instanceof xjb) {
                xjb xjb = (xjb) xi4;
                int q = xjb.q(3);
                if (q == 1) {
                    this.y0 = q;
                    this.X = xjb;
                    this.x0 = true;
                    this.a.d(this);
                    a();
                    return;
                } else if (q == 2) {
                    this.y0 = q;
                    this.X = xjb;
                    this.a.d(this);
                    return;
                }
            }
            this.X = new knd(this.o);
            this.a.d(this);
        }
    }

    public final void f() {
        this.w0 = true;
        vs9 vs9 = this.c;
        vs9.getClass();
        bj4.a(vs9);
        this.Y.f();
        if (getAndIncrement() == 0) {
            this.X.clear();
        }
    }

    public final boolean h() {
        return this.w0;
    }

    public final void onError(Throwable th) {
        if (this.x0) {
            xs7.F(th);
            return;
        }
        this.x0 = true;
        f();
        this.a.onError(th);
    }
}

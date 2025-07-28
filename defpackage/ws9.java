package defpackage;

import java.util.Objects;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: ws9  reason: default package */
public final class ws9 extends AtomicInteger implements bw9, xi4 {
    public int A0;
    public final vs9 X;
    public final boolean Y;
    public xgd Z;
    public final bw9 a;
    public final j26 b;
    public final int c;
    public final ey o = new AtomicReference();
    public xi4 w0;
    public volatile boolean x0;
    public volatile boolean y0;
    public volatile boolean z0;

    /* JADX WARNING: type inference failed for: r2v1, types: [ey, java.util.concurrent.atomic.AtomicReference] */
    public ws9(bw9 bw9, j26 j26, int i, boolean z) {
        this.a = bw9;
        this.b = j26;
        this.c = i;
        this.Y = z;
        this.X = new vs9(bw9, this, 0);
    }

    public final void a() {
        if (getAndIncrement() == 0) {
            bw9 bw9 = this.a;
            xgd xgd = this.Z;
            ey eyVar = this.o;
            while (true) {
                if (!this.x0) {
                    if (this.z0) {
                        xgd.clear();
                        return;
                    } else if (this.Y || ((Throwable) eyVar.get()) == null) {
                        boolean z = this.y0;
                        try {
                            Object poll = xgd.poll();
                            boolean z2 = poll == null;
                            if (z && z2) {
                                this.z0 = true;
                                eyVar.d(bw9);
                                return;
                            } else if (!z2) {
                                try {
                                    Object apply = this.b.apply(poll);
                                    Objects.requireNonNull(apply, "The mapper returned a null ObservableSource");
                                    nv9 nv9 = (nv9) apply;
                                    if (nv9 instanceof q3e) {
                                        try {
                                            Object obj = ((q3e) nv9).get();
                                            if (obj != null && !this.z0) {
                                                bw9.c(obj);
                                            }
                                        } catch (Throwable th) {
                                            ek8.a0(th);
                                            eyVar.a(th);
                                        }
                                    } else {
                                        this.x0 = true;
                                        nv9.a(this.X);
                                    }
                                } catch (Throwable th2) {
                                    ek8.a0(th2);
                                    this.z0 = true;
                                    this.w0.f();
                                    xgd.clear();
                                    eyVar.a(th2);
                                    eyVar.d(bw9);
                                    return;
                                }
                            }
                        } catch (Throwable th3) {
                            ek8.a0(th3);
                            this.z0 = true;
                            this.w0.f();
                            eyVar.a(th3);
                            eyVar.d(bw9);
                            return;
                        }
                    } else {
                        xgd.clear();
                        this.z0 = true;
                        eyVar.d(bw9);
                        return;
                    }
                }
                if (decrementAndGet() == 0) {
                    return;
                }
            }
        }
    }

    public final void b() {
        this.y0 = true;
        a();
    }

    public final void c(Object obj) {
        if (this.A0 == 0) {
            this.Z.offer(obj);
        }
        a();
    }

    public final void d(xi4 xi4) {
        if (bj4.g(this.w0, xi4)) {
            this.w0 = xi4;
            if (xi4 instanceof xjb) {
                xjb xjb = (xjb) xi4;
                int q = xjb.q(3);
                if (q == 1) {
                    this.A0 = q;
                    this.Z = xjb;
                    this.y0 = true;
                    this.a.d(this);
                    a();
                    return;
                } else if (q == 2) {
                    this.A0 = q;
                    this.Z = xjb;
                    this.a.d(this);
                    return;
                }
            }
            this.Z = new knd(this.c);
            this.a.d(this);
        }
    }

    public final void f() {
        this.z0 = true;
        this.w0.f();
        vs9 vs9 = this.X;
        vs9.getClass();
        bj4.a(vs9);
        this.o.b();
    }

    public final boolean h() {
        return this.z0;
    }

    public final void onError(Throwable th) {
        if (this.o.a(th)) {
            this.y0 = true;
            a();
        }
    }
}

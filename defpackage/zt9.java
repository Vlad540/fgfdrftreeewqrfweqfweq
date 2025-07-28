package defpackage;

import java.util.Objects;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: zt9  reason: default package */
public final class zt9 extends AtomicInteger implements bw9, xi4 {
    public final AtomicInteger X;
    public final ey Y;
    public final j26 Z;
    public final /* synthetic */ int a;
    public final bw9 b;
    public final boolean c;
    public final n83 o;
    public final AtomicReference w0;
    public xi4 x0;
    public volatile boolean y0;

    /* JADX WARNING: type inference failed for: r1v2, types: [n83, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r1v3, types: [ey, java.util.concurrent.atomic.AtomicReference] */
    /* JADX WARNING: type inference failed for: r1v7, types: [n83, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r1v8, types: [ey, java.util.concurrent.atomic.AtomicReference] */
    public zt9(bw9 bw9, j26 j26, int i) {
        this.a = i;
        switch (i) {
            case 1:
                this.b = bw9;
                this.Z = j26;
                this.c = false;
                this.o = new Object();
                this.Y = new AtomicReference();
                this.X = new AtomicInteger(1);
                this.w0 = new AtomicReference();
                return;
            default:
                this.b = bw9;
                this.Z = j26;
                this.c = false;
                this.o = new Object();
                this.Y = new AtomicReference();
                this.X = new AtomicInteger(1);
                this.w0 = new AtomicReference();
                return;
        }
    }

    public final void a() {
        switch (this.a) {
            case 0:
                bw9 bw9 = this.b;
                AtomicInteger atomicInteger = this.X;
                AtomicReference atomicReference = this.w0;
                int i = 1;
                while (!this.y0) {
                    if (this.c || ((Throwable) this.Y.get()) == null) {
                        boolean z = false;
                        boolean z2 = atomicInteger.get() == 0;
                        knd knd = (knd) atomicReference.get();
                        Object poll = knd != null ? knd.poll() : null;
                        if (poll == null) {
                            z = true;
                        }
                        if (z2 && z) {
                            this.Y.d(bw9);
                            return;
                        } else if (z) {
                            i = addAndGet(-i);
                            if (i == 0) {
                                return;
                            }
                        } else {
                            bw9.c(poll);
                        }
                    } else {
                        knd knd2 = (knd) this.w0.get();
                        if (knd2 != null) {
                            knd2.clear();
                        }
                        this.Y.d(bw9);
                        return;
                    }
                }
                knd knd3 = (knd) this.w0.get();
                if (knd3 != null) {
                    knd3.clear();
                    return;
                }
                return;
            default:
                bw9 bw92 = this.b;
                AtomicInteger atomicInteger2 = this.X;
                AtomicReference atomicReference2 = this.w0;
                int i2 = 1;
                while (!this.y0) {
                    if (this.c || ((Throwable) this.Y.get()) == null) {
                        boolean z3 = false;
                        boolean z4 = atomicInteger2.get() == 0;
                        knd knd4 = (knd) atomicReference2.get();
                        Object poll2 = knd4 != null ? knd4.poll() : null;
                        if (poll2 == null) {
                            z3 = true;
                        }
                        if (z4 && z3) {
                            this.Y.d(this.b);
                            return;
                        } else if (z3) {
                            i2 = addAndGet(-i2);
                            if (i2 == 0) {
                                return;
                            }
                        } else {
                            bw92.c(poll2);
                        }
                    } else {
                        knd knd5 = (knd) this.w0.get();
                        if (knd5 != null) {
                            knd5.clear();
                        }
                        this.Y.d(bw92);
                        return;
                    }
                }
                knd knd6 = (knd) this.w0.get();
                if (knd6 != null) {
                    knd6.clear();
                    return;
                }
                return;
        }
    }

    public final void b() {
        switch (this.a) {
            case 0:
                this.X.decrementAndGet();
                if (getAndIncrement() == 0) {
                    a();
                    return;
                }
                return;
            default:
                this.X.decrementAndGet();
                if (getAndIncrement() == 0) {
                    a();
                    return;
                }
                return;
        }
    }

    public final void c(Object obj) {
        switch (this.a) {
            case 0:
                try {
                    Object apply = this.Z.apply(obj);
                    Objects.requireNonNull(apply, "The mapper returned a null MaybeSource");
                    ay7 ay7 = (ay7) apply;
                    this.X.getAndIncrement();
                    ex7 ex7 = new ex7(this);
                    if (!this.y0 && this.o.a(ex7)) {
                        ay7.a(ex7);
                        return;
                    }
                    return;
                } catch (Throwable th) {
                    ek8.a0(th);
                    this.x0.f();
                    onError(th);
                    return;
                }
            default:
                try {
                    Object apply2 = this.Z.apply(obj);
                    Objects.requireNonNull(apply2, "The mapper returned a null SingleSource");
                    dhd dhd = (dhd) apply2;
                    this.X.getAndIncrement();
                    at9 at9 = new at9(this, 2);
                    if (!this.y0 && this.o.a(at9)) {
                        dhd.k(at9);
                        return;
                    }
                    return;
                } catch (Throwable th2) {
                    ek8.a0(th2);
                    this.x0.f();
                    onError(th2);
                    return;
                }
        }
    }

    public final void d(xi4 xi4) {
        switch (this.a) {
            case 0:
                if (bj4.g(this.x0, xi4)) {
                    this.x0 = xi4;
                    this.b.d(this);
                    return;
                }
                return;
            default:
                if (bj4.g(this.x0, xi4)) {
                    this.x0 = xi4;
                    this.b.d(this);
                    return;
                }
                return;
        }
    }

    public final void f() {
        switch (this.a) {
            case 0:
                this.y0 = true;
                this.x0.f();
                this.o.f();
                this.Y.b();
                return;
            default:
                this.y0 = true;
                this.x0.f();
                this.o.f();
                this.Y.b();
                return;
        }
    }

    public final boolean h() {
        switch (this.a) {
            case 0:
                return this.y0;
            default:
                return this.y0;
        }
    }

    public final void onError(Throwable th) {
        switch (this.a) {
            case 0:
                this.X.decrementAndGet();
                if (this.Y.a(th)) {
                    if (!this.c) {
                        this.o.f();
                    }
                    if (getAndIncrement() == 0) {
                        a();
                        return;
                    }
                    return;
                }
                return;
            default:
                this.X.decrementAndGet();
                if (this.Y.a(th)) {
                    if (!this.c) {
                        this.o.f();
                    }
                    if (getAndIncrement() == 0) {
                        a();
                        return;
                    }
                    return;
                }
                return;
        }
    }
}

package defpackage;

import java.util.Objects;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: on5  reason: default package */
public final class on5 extends AtomicInteger implements ko5, d1e {
    public final n83 X = new Object();
    public final AtomicInteger Y = new AtomicInteger(1);
    public final ey Z = new AtomicReference();
    public final b1e a;
    public final boolean b;
    public final int c;
    public final AtomicLong o = new AtomicLong();
    public final j26 w0;
    public final AtomicReference x0 = new AtomicReference();
    public d1e y0;
    public volatile boolean z0;

    /* JADX WARNING: type inference failed for: r1v2, types: [n83, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r1v3, types: [ey, java.util.concurrent.atomic.AtomicReference] */
    public on5(b1e b1e, j26 j26, boolean z, int i) {
        this.a = b1e;
        this.w0 = j26;
        this.b = z;
        this.c = i;
    }

    public final void a() {
        knd knd = (knd) this.x0.get();
        if (knd != null) {
            knd.clear();
        }
    }

    public final void b() {
        this.Y.decrementAndGet();
        d();
    }

    public final void c(Object obj) {
        try {
            Object apply = this.w0.apply(obj);
            Objects.requireNonNull(apply, "The mapper returned a null SingleSource");
            dhd dhd = (dhd) apply;
            this.Y.getAndIncrement();
            at9 at9 = new at9(this, 1);
            if (!this.z0 && this.X.a(at9)) {
                dhd.k(at9);
            }
        } catch (Throwable th) {
            ek8.a0(th);
            this.y0.cancel();
            onError(th);
        }
    }

    public final void cancel() {
        this.z0 = true;
        this.y0.cancel();
        this.X.f();
        this.Z.b();
    }

    public final void d() {
        if (getAndIncrement() == 0) {
            f();
        }
    }

    public final void e(d1e d1e) {
        if (f1e.e(this.y0, d1e)) {
            this.y0 = d1e;
            this.a.e(this);
            int i = this.c;
            if (i == Integer.MAX_VALUE) {
                d1e.i(Long.MAX_VALUE);
            } else {
                d1e.i((long) i);
            }
        }
    }

    public final void f() {
        int i;
        boolean z;
        b1e b1e = this.a;
        AtomicInteger atomicInteger = this.Y;
        AtomicReference atomicReference = this.x0;
        int i2 = 1;
        do {
            long j = this.o.get();
            long j2 = 0;
            while (true) {
                i = (j2 > j ? 1 : (j2 == j ? 0 : -1));
                z = false;
                if (i == 0) {
                    break;
                } else if (this.z0) {
                    a();
                    return;
                } else if (this.b || ((Throwable) this.Z.get()) == null) {
                    boolean z2 = atomicInteger.get() == 0;
                    knd knd = (knd) atomicReference.get();
                    Object poll = knd != null ? knd.poll() : null;
                    boolean z3 = poll == null;
                    if (z2 && z3) {
                        this.Z.e(b1e);
                        return;
                    } else if (z3) {
                        break;
                    } else {
                        b1e.c(poll);
                        j2++;
                    }
                } else {
                    a();
                    this.Z.e(this.a);
                    return;
                }
            }
            if (i == 0) {
                if (this.z0) {
                    a();
                    return;
                } else if (this.b || ((Throwable) this.Z.get()) == null) {
                    boolean z4 = atomicInteger.get() == 0;
                    knd knd2 = (knd) atomicReference.get();
                    if (knd2 == null || knd2.isEmpty()) {
                        z = true;
                    }
                    if (z4 && z) {
                        this.Z.e(b1e);
                        return;
                    }
                } else {
                    a();
                    this.Z.e(b1e);
                    return;
                }
            }
            if (j2 != 0) {
                z3d.J(this.o, j2);
                if (this.c != Integer.MAX_VALUE) {
                    this.y0.i(j2);
                }
            }
            i2 = addAndGet(-i2);
        } while (i2 != 0);
    }

    public final knd g() {
        AtomicReference atomicReference = this.x0;
        knd knd = (knd) atomicReference.get();
        if (knd != null) {
            return knd;
        }
        knd knd2 = new knd(an5.a);
        while (!atomicReference.compareAndSet((Object) null, knd2)) {
            if (atomicReference.get() != null) {
                return (knd) atomicReference.get();
            }
        }
        return knd2;
    }

    public final void i(long j) {
        if (f1e.d(j)) {
            z3d.b(this.o, j);
            d();
        }
    }

    public final void onError(Throwable th) {
        this.Y.decrementAndGet();
        if (this.Z.a(th)) {
            if (!this.b) {
                this.X.f();
            }
            d();
        }
    }
}

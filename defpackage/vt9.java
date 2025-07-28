package defpackage;

import java.util.Objects;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: vt9  reason: default package */
public final class vt9 extends qj0 implements bw9 {
    public final n83 X = new Object();
    public xi4 Y;
    public volatile boolean Z;
    public final bw9 a;
    public final ey b = new AtomicReference();
    public final j26 c;
    public final boolean o;

    /* JADX WARNING: type inference failed for: r1v1, types: [ey, java.util.concurrent.atomic.AtomicReference] */
    /* JADX WARNING: type inference failed for: r1v2, types: [n83, java.lang.Object] */
    public vt9(bw9 bw9, j26 j26, boolean z) {
        this.a = bw9;
        this.c = j26;
        this.o = z;
        lazySet(1);
    }

    public final void b() {
        if (decrementAndGet() == 0) {
            this.b.d(this.a);
        }
    }

    public final void c(Object obj) {
        try {
            Object apply = this.c.apply(obj);
            Objects.requireNonNull(apply, "The mapper returned a null CompletableSource");
            v63 v63 = (v63) apply;
            getAndIncrement();
            ihd ihd = new ihd(this);
            if (!this.Z && this.X.a(ihd)) {
                v63.i(ihd);
            }
        } catch (Throwable th) {
            ek8.a0(th);
            this.Y.f();
            onError(th);
        }
    }

    public final void clear() {
    }

    public final void d(xi4 xi4) {
        if (bj4.g(this.Y, xi4)) {
            this.Y = xi4;
            this.a.d(this);
        }
    }

    public final void f() {
        this.Z = true;
        this.Y.f();
        this.X.f();
        this.b.b();
    }

    public final boolean h() {
        return this.Y.h();
    }

    public final boolean isEmpty() {
        return true;
    }

    public final void onError(Throwable th) {
        if (!this.b.a(th)) {
            return;
        }
        if (!this.o) {
            this.Z = true;
            this.Y.f();
            this.X.f();
            this.b.d(this.a);
        } else if (decrementAndGet() == 0) {
            this.b.d(this.a);
        }
    }

    public final Object poll() {
        return null;
    }

    public final int q(int i) {
        return 2;
    }
}

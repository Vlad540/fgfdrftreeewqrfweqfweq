package defpackage;

import java.util.Objects;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: xt9  reason: default package */
public final class xt9 extends AtomicInteger implements xi4, bw9 {
    public final n83 X = new Object();
    public xi4 Y;
    public volatile boolean Z;
    public final g73 a;
    public final ey b = new AtomicReference();
    public final j26 c;
    public final boolean o;

    /* JADX WARNING: type inference failed for: r1v1, types: [ey, java.util.concurrent.atomic.AtomicReference] */
    /* JADX WARNING: type inference failed for: r1v2, types: [n83, java.lang.Object] */
    public xt9(g73 g73, j26 j26, boolean z) {
        this.a = g73;
        this.c = j26;
        this.o = z;
        lazySet(1);
    }

    public final void b() {
        if (decrementAndGet() == 0) {
            this.b.c(this.a);
        }
    }

    public final void c(Object obj) {
        try {
            Object apply = this.c.apply(obj);
            Objects.requireNonNull(apply, "The mapper returned a null CompletableSource");
            v63 v63 = (v63) apply;
            getAndIncrement();
            x63 x63 = new x63(this);
            if (!this.Z && this.X.a(x63)) {
                v63.i(x63);
            }
        } catch (Throwable th) {
            ek8.a0(th);
            this.Y.f();
            onError(th);
        }
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

    public final void onError(Throwable th) {
        if (!this.b.a(th)) {
            return;
        }
        if (!this.o) {
            this.Z = true;
            this.Y.f();
            this.X.f();
            this.b.c(this.a);
        } else if (decrementAndGet() == 0) {
            this.b.c(this.a);
        }
    }
}

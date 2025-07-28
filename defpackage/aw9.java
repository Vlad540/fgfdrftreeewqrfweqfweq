package defpackage;

import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: aw9  reason: default package */
public final class aw9 extends AtomicBoolean implements bw9, xi4 {
    public final bw9 a;
    public final qmc b;
    public xi4 c;

    public aw9(bw9 bw9, y15 y15) {
        this.a = bw9;
        this.b = y15;
    }

    public final void b() {
        if (!get()) {
            this.a.b();
        }
    }

    public final void c(Object obj) {
        if (!get()) {
            this.a.c(obj);
        }
    }

    public final void d(xi4 xi4) {
        if (bj4.g(this.c, xi4)) {
            this.c = xi4;
            this.a.d(this);
        }
    }

    public final void f() {
        if (compareAndSet(false, true)) {
            this.b.b(new vp6(17, this));
        }
    }

    public final boolean h() {
        return get();
    }

    public final void onError(Throwable th) {
        if (get()) {
            xs7.F(th);
        } else {
            this.a.onError(th);
        }
    }
}

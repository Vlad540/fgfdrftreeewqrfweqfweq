package defpackage;

import java.util.concurrent.atomic.AtomicReference;

/* renamed from: khd  reason: default package */
public final class khd extends AtomicReference implements bw9, xi4 {
    public final zhd a;
    public final dhd b;
    public boolean c;

    public khd(zhd zhd, dhd dhd) {
        this.a = zhd;
        this.b = dhd;
    }

    public final void b() {
        if (!this.c) {
            this.c = true;
            this.b.k(new d4b(this, 3, this.a));
        }
    }

    public final void c(Object obj) {
        ((xi4) get()).f();
        b();
    }

    public final void d(xi4 xi4) {
        if (bj4.e(this, xi4)) {
            this.a.d(this);
        }
    }

    public final void f() {
        bj4.a(this);
    }

    public final boolean h() {
        return bj4.b((xi4) get());
    }

    public final void onError(Throwable th) {
        if (this.c) {
            xs7.F(th);
            return;
        }
        this.c = true;
        this.a.onError(th);
    }
}

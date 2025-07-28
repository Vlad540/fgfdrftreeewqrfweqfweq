package defpackage;

import java.util.concurrent.atomic.AtomicLong;

/* renamed from: xn5  reason: default package */
public final class xn5 extends AtomicLong implements ko5, d1e {
    public final b1e a;
    public d1e b;
    public boolean c;

    public xn5(b1e b1e) {
        this.a = b1e;
    }

    public final void b() {
        if (!this.c) {
            this.c = true;
            this.a.b();
        }
    }

    public final void c(Object obj) {
        if (!this.c) {
            if (get() != 0) {
                this.a.c(obj);
                z3d.J(this, 1);
                return;
            }
            this.b.cancel();
            onError(new RuntimeException("Could not emit value due to lack of requests"));
        }
    }

    public final void cancel() {
        this.b.cancel();
    }

    public final void e(d1e d1e) {
        if (f1e.e(this.b, d1e)) {
            this.b = d1e;
            this.a.e(this);
            d1e.i(Long.MAX_VALUE);
        }
    }

    public final void i(long j) {
        if (f1e.d(j)) {
            z3d.b(this, j);
        }
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

package defpackage;

import java.util.concurrent.atomic.AtomicReference;

/* renamed from: ey  reason: default package */
public final class ey extends AtomicReference {
    public final boolean a(Throwable th) {
        if (i15.a(this, th)) {
            return true;
        }
        xs7.F(th);
        return false;
    }

    public final void b() {
        Throwable d = i15.d(this);
        if (d != null && d != i15.a) {
            xs7.F(d);
        }
    }

    public final void c(g73 g73) {
        Throwable d = i15.d(this);
        if (d == null) {
            g73.b();
        } else if (d != i15.a) {
            g73.onError(d);
        }
    }

    public final void d(bw9 bw9) {
        Throwable d = i15.d(this);
        if (d == null) {
            bw9.b();
        } else if (d != i15.a) {
            bw9.onError(d);
        }
    }

    public final void e(b1e b1e) {
        Throwable d = i15.d(this);
        if (d == null) {
            b1e.b();
        } else if (d != i15.a) {
            b1e.onError(d);
        }
    }
}

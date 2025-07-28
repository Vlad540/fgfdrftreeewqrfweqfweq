package defpackage;

import io.reactivex.rxjava3.exceptions.CompositeException;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: d97  reason: default package */
public final class d97 extends AtomicReference implements ko5, d1e, xi4 {
    public final of3 a;
    public final of3 b;
    public final j6 c;
    public final of3 o;

    public d97(qs7 qs7, ps7 ps7) {
        z26 z26 = z3d.i;
        vn5 vn5 = vn5.a;
        this.a = qs7;
        this.b = ps7;
        this.c = z26;
        this.o = vn5;
    }

    public final void b() {
        Object obj = get();
        f1e f1e = f1e.a;
        if (obj != f1e) {
            lazySet(f1e);
            try {
                this.c.run();
            } catch (Throwable th) {
                ek8.a0(th);
                xs7.F(th);
            }
        }
    }

    public final void c(Object obj) {
        if (!h()) {
            try {
                this.a.accept(obj);
            } catch (Throwable th) {
                ek8.a0(th);
                ((d1e) get()).cancel();
                onError(th);
            }
        }
    }

    public final void cancel() {
        f1e.a(this);
    }

    public final void e(d1e d1e) {
        if (f1e.c(this, d1e)) {
            try {
                this.o.accept(this);
            } catch (Throwable th) {
                ek8.a0(th);
                d1e.cancel();
                onError(th);
            }
        }
    }

    public final void f() {
        f1e.a(this);
    }

    public final boolean h() {
        return get() == f1e.a;
    }

    public final void i(long j) {
        ((d1e) get()).i(j);
    }

    public final void onError(Throwable th) {
        Object obj = get();
        f1e f1e = f1e.a;
        if (obj != f1e) {
            lazySet(f1e);
            try {
                this.b.accept(th);
            } catch (Throwable th2) {
                ek8.a0(th2);
                xs7.F(new CompositeException(th, th2));
            }
        } else {
            xs7.F(th);
        }
    }
}

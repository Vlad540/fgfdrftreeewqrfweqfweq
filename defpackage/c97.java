package defpackage;

import io.reactivex.rxjava3.exceptions.CompositeException;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: c97  reason: default package */
public final class c97 extends AtomicReference implements bw9, xi4 {
    public final of3 a;
    public final of3 b;
    public final j6 c;
    public final of3 o;

    public c97(of3 of3, of3 of32, j6 j6Var) {
        gf6 gf6 = z3d.j;
        this.a = of3;
        this.b = of32;
        this.c = j6Var;
        this.o = gf6;
    }

    public final void b() {
        if (!h()) {
            lazySet(bj4.a);
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
                ((xi4) get()).f();
                onError(th);
            }
        }
    }

    public final void d(xi4 xi4) {
        if (bj4.e(this, xi4)) {
            try {
                this.o.accept(this);
            } catch (Throwable th) {
                ek8.a0(th);
                xi4.f();
                onError(th);
            }
        }
    }

    public final void f() {
        bj4.a(this);
    }

    public final boolean h() {
        return get() == bj4.a;
    }

    public final void onError(Throwable th) {
        if (!h()) {
            lazySet(bj4.a);
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

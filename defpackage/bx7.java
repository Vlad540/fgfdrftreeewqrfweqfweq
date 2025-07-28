package defpackage;

import io.reactivex.rxjava3.exceptions.CompositeException;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: bx7  reason: default package */
public final class bx7 extends AtomicReference implements wx7, xi4 {
    public final /* synthetic */ int a = 0;
    public final Object b;
    public final Object c;
    public Object o;

    public bx7(of3 of3, of3 of32, j6 j6Var) {
        this.b = of3;
        this.c = of32;
        this.o = j6Var;
    }

    public final void a(Object obj) {
        switch (this.a) {
            case 0:
                lazySet(bj4.a);
                try {
                    ((of3) this.b).accept(obj);
                    return;
                } catch (Throwable th) {
                    ek8.a0(th);
                    xs7.F(th);
                    return;
                }
            default:
                try {
                    Object apply = ((j26) this.c).apply(obj);
                    Objects.requireNonNull(apply, "The mapper returned a null MaybeSource");
                    ay7 ay7 = (ay7) apply;
                    if (!h()) {
                        ay7.a(new mb1(15, this));
                        return;
                    }
                    return;
                } catch (Throwable th2) {
                    ek8.a0(th2);
                    ((wx7) this.b).onError(th2);
                    return;
                }
        }
    }

    public final void b() {
        switch (this.a) {
            case 0:
                lazySet(bj4.a);
                try {
                    ((j6) this.o).run();
                    return;
                } catch (Throwable th) {
                    ek8.a0(th);
                    xs7.F(th);
                    return;
                }
            default:
                ((wx7) this.b).b();
                return;
        }
    }

    public final void d(xi4 xi4) {
        switch (this.a) {
            case 0:
                bj4.e(this, xi4);
                return;
            default:
                if (bj4.g((xi4) this.o, xi4)) {
                    this.o = xi4;
                    ((wx7) this.b).d(this);
                    return;
                }
                return;
        }
    }

    public final void f() {
        switch (this.a) {
            case 0:
                bj4.a(this);
                return;
            default:
                bj4.a(this);
                ((xi4) this.o).f();
                return;
        }
    }

    public final boolean h() {
        switch (this.a) {
            case 0:
                return bj4.b((xi4) get());
            default:
                return bj4.b((xi4) get());
        }
    }

    public final void onError(Throwable th) {
        switch (this.a) {
            case 0:
                lazySet(bj4.a);
                try {
                    ((of3) this.c).accept(th);
                    return;
                } catch (Throwable th2) {
                    ek8.a0(th2);
                    xs7.F(new CompositeException(th, th2));
                    return;
                }
            default:
                ((wx7) this.b).onError(th);
                return;
        }
    }

    public bx7(wx7 wx7, j26 j26) {
        this.b = wx7;
        this.c = j26;
    }
}

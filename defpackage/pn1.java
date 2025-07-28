package defpackage;

import io.reactivex.rxjava3.exceptions.CompositeException;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: pn1  reason: default package */
public final class pn1 extends AtomicReference implements g73, xi4, zhd, wx7, bw9 {
    public final /* synthetic */ int a;
    public final Object b;
    public Object c;

    public /* synthetic */ pn1(Object obj, int i, Object obj2) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }

    public void a(Object obj) {
        switch (this.a) {
            case 2:
                lazySet(bj4.a);
                try {
                    ((of3) this.b).accept(obj);
                    return;
                } catch (Throwable th) {
                    ek8.a0(th);
                    xs7.F(th);
                    return;
                }
            case 3:
                ((wx7) this.c).a(obj);
                return;
            case 4:
                ((wx7) this.b).a(obj);
                return;
            case 6:
                ((zhd) this.b).a(obj);
                return;
            default:
                try {
                    Object apply = ((j26) this.c).apply(obj);
                    Objects.requireNonNull(apply, "The mapper returned a null CompletableSource");
                    v63 v63 = (v63) apply;
                    if (!h()) {
                        v63.i(this);
                        return;
                    }
                    return;
                } catch (Throwable th2) {
                    ek8.a0(th2);
                    onError(th2);
                    return;
                }
        }
    }

    public void b() {
        switch (this.a) {
            case 0:
                try {
                    ((j6) this.c).run();
                } catch (Throwable th) {
                    ek8.a0(th);
                    xs7.F(th);
                }
                lazySet(bj4.a);
                return;
            case 1:
                ((v63) this.c).i(new nu7(this, (g73) this.b));
                return;
            case 3:
                ((wx7) this.c).b();
                return;
            case 4:
                xi4 xi4 = (xi4) get();
                if (xi4 != bj4.a && compareAndSet(xi4, (Object) null)) {
                    ((ay7) this.c).a(new afc((wx7) this.b, this));
                    return;
                }
                return;
            case 5:
                ((bw9) this.b).b();
                return;
            default:
                ((g73) this.b).b();
                return;
        }
    }

    public void c(Object obj) {
        ((bw9) this.b).c(obj);
    }

    public final void d(xi4 xi4) {
        switch (this.a) {
            case 0:
                bj4.e(this, xi4);
                return;
            case 1:
                if (bj4.e(this, xi4)) {
                    ((g73) this.b).d(this);
                    return;
                }
                return;
            case 2:
                bj4.e(this, xi4);
                return;
            case 3:
                bj4.e(this, xi4);
                return;
            case 4:
                if (bj4.e(this, xi4)) {
                    ((wx7) this.b).d(this);
                    return;
                }
                return;
            case 5:
                bj4.e((AtomicReference) this.c, xi4);
                return;
            case 6:
                if (bj4.g((xi4) this.c, xi4)) {
                    this.c = xi4;
                    ((zhd) this.b).d(this);
                    return;
                }
                return;
            default:
                bj4.c(this, xi4);
                return;
        }
    }

    public final void f() {
        switch (this.a) {
            case 0:
                bj4.a(this);
                return;
            case 1:
                bj4.a(this);
                return;
            case 2:
                bj4.a(this);
                return;
            case 3:
                bj4.a(this);
                bw1 bw1 = (bw1) this.b;
                bw1.getClass();
                bj4.a(bw1);
                return;
            case 4:
                bj4.a(this);
                return;
            case 5:
                bj4.a((AtomicReference) this.c);
                bj4.a(this);
                return;
            case 6:
                j6 j6Var = (j6) getAndSet((Object) null);
                if (j6Var != null) {
                    try {
                        j6Var.run();
                    } catch (Throwable th) {
                        ek8.a0(th);
                        xs7.F(th);
                    }
                    ((xi4) this.c).f();
                    return;
                }
                return;
            default:
                bj4.a(this);
                return;
        }
    }

    public final boolean h() {
        switch (this.a) {
            case 0:
                return get() == bj4.a;
            case 1:
                return bj4.b((xi4) get());
            case 2:
                return get() == bj4.a;
            case 3:
                return bj4.b((xi4) get());
            case 4:
                return bj4.b((xi4) get());
            case 5:
                return bj4.b((xi4) get());
            case 6:
                return ((xi4) this.c).h();
            default:
                return bj4.b((xi4) get());
        }
    }

    public final void onError(Throwable th) {
        switch (this.a) {
            case 0:
                try {
                    ((of3) this.b).accept(th);
                } catch (Throwable th2) {
                    ek8.a0(th2);
                    xs7.F(th2);
                }
                lazySet(bj4.a);
                return;
            case 1:
                ((g73) this.b).onError(th);
                return;
            case 2:
                lazySet(bj4.a);
                try {
                    ((of3) this.c).accept(th);
                    return;
                } catch (Throwable th3) {
                    ek8.a0(th3);
                    xs7.F(new CompositeException(th, th3));
                    return;
                }
            case 3:
                ((wx7) this.c).onError(th);
                return;
            case 4:
                ((wx7) this.b).onError(th);
                return;
            case 5:
                ((bw9) this.b).onError(th);
                return;
            case 6:
                ((zhd) this.b).onError(th);
                return;
            default:
                ((g73) this.b).onError(th);
                return;
        }
    }

    public pn1(bw9 bw9) {
        this.a = 5;
        this.b = bw9;
        this.c = new AtomicReference();
    }

    public pn1(zhd zhd, j6 j6Var) {
        this.a = 6;
        this.b = zhd;
        lazySet(j6Var);
    }

    public pn1(wx7 wx7) {
        this.a = 3;
        this.c = wx7;
        this.b = new bw1(2);
    }
}

package defpackage;

import io.reactivex.rxjava3.exceptions.CompositeException;
import java.util.Collection;
import java.util.NoSuchElementException;
import java.util.Objects;

/* renamed from: i73  reason: default package */
public final class i73 implements g73, xi4, wx7, bw9, zhd {
    public final /* synthetic */ int a;
    public xi4 b;
    public final Object c;
    public Object o;

    public /* synthetic */ i73(Object obj, int i, Object obj2) {
        this.a = i;
        this.c = obj;
        this.o = obj2;
    }

    public void a(Object obj) {
        switch (this.a) {
            case 1:
                wx7 wx7 = (wx7) this.c;
                try {
                    Object apply = ((j26) this.o).apply(obj);
                    Objects.requireNonNull(apply, "The mapper returned a null item");
                    wx7.a(apply);
                    return;
                } catch (Throwable th) {
                    ek8.a0(th);
                    wx7.onError(th);
                    return;
                }
            case 2:
                xi4 xi4 = this.b;
                bj4 bj4 = bj4.a;
                if (xi4 != bj4) {
                    try {
                        ((zx7) this.o).b.accept(obj);
                        this.b = bj4;
                        ((wx7) this.c).a(obj);
                        e();
                        return;
                    } catch (Throwable th2) {
                        ek8.a0(th2);
                        g(th2);
                        return;
                    }
                } else {
                    return;
                }
            case 3:
                this.b = bj4.a;
                ((zhd) this.c).a(obj);
                return;
            case 6:
                ((zhd) this.c).a(obj);
                try {
                    ((of3) this.o).accept(obj);
                    return;
                } catch (Throwable th3) {
                    ek8.a0(th3);
                    xs7.F(th3);
                    return;
                }
            default:
                ((zhd) this.c).a(obj);
                try {
                    ((j6) this.o).run();
                    return;
                } catch (Throwable th4) {
                    ek8.a0(th4);
                    xs7.F(th4);
                    return;
                }
        }
    }

    public void b() {
        switch (this.a) {
            case 0:
                g73 g73 = (g73) this.c;
                j73 j73 = (j73) this.o;
                if (this.b != bj4.a) {
                    try {
                        j73.o.run();
                        j73.X.run();
                        g73.b();
                        try {
                            j73.Y.run();
                            return;
                        } catch (Throwable th) {
                            ek8.a0(th);
                            xs7.F(th);
                            return;
                        }
                    } catch (Throwable th2) {
                        ek8.a0(th2);
                        g73.onError(th2);
                        return;
                    }
                } else {
                    return;
                }
            case 1:
                ((wx7) this.c).b();
                return;
            case 2:
                xi4 xi4 = this.b;
                bj4 bj4 = bj4.a;
                if (xi4 != bj4) {
                    try {
                        ((zx7) this.o).o.run();
                        this.b = bj4;
                        ((wx7) this.c).b();
                        e();
                        return;
                    } catch (Throwable th3) {
                        ek8.a0(th3);
                        g(th3);
                        return;
                    }
                } else {
                    return;
                }
            case 3:
                this.b = bj4.a;
                zhd zhd = (zhd) this.c;
                Object obj = this.o;
                if (obj != null) {
                    zhd.a(obj);
                    return;
                } else {
                    zhd.onError(new NoSuchElementException("The MaybeSource is empty"));
                    return;
                }
            case 4:
                this.o = null;
                bw9 bw9 = (bw9) this.c;
                bw9.c((Collection) this.o);
                bw9.b();
                return;
            default:
                this.o = null;
                ((zhd) this.c).a((Collection) this.o);
                return;
        }
    }

    public void c(Object obj) {
        switch (this.a) {
            case 4:
                ((Collection) this.o).add(obj);
                return;
            default:
                ((Collection) this.o).add(obj);
                return;
        }
    }

    public final void d(xi4 xi4) {
        switch (this.a) {
            case 0:
                g73 g73 = (g73) this.c;
                try {
                    ((j73) this.o).b.accept(xi4);
                    if (bj4.g(this.b, xi4)) {
                        this.b = xi4;
                        g73.d(this);
                        return;
                    }
                    return;
                } catch (Throwable th) {
                    ek8.a0(th);
                    xi4.f();
                    this.b = bj4.a;
                    g73.d(cw4.a);
                    g73.onError(th);
                    return;
                }
            case 1:
                if (bj4.g(this.b, xi4)) {
                    this.b = xi4;
                    ((wx7) this.c).d(this);
                    return;
                }
                return;
            case 2:
                wx7 wx7 = (wx7) this.c;
                if (bj4.g(this.b, xi4)) {
                    try {
                        ((zx7) this.o).getClass();
                        this.b = xi4;
                        wx7.d(this);
                        return;
                    } catch (Throwable th2) {
                        ek8.a0(th2);
                        xi4.f();
                        this.b = bj4.a;
                        wx7.d(cw4.a);
                        wx7.onError(th2);
                        return;
                    }
                } else {
                    return;
                }
            case 3:
                if (bj4.g(this.b, xi4)) {
                    this.b = xi4;
                    ((zhd) this.c).d(this);
                    return;
                }
                return;
            case 4:
                if (bj4.g(this.b, xi4)) {
                    this.b = xi4;
                    ((bw9) this.c).d(this);
                    return;
                }
                return;
            case 5:
                if (bj4.g(this.b, xi4)) {
                    this.b = xi4;
                    ((zhd) this.c).d(this);
                    return;
                }
                return;
            case 6:
                if (bj4.g(this.b, xi4)) {
                    this.b = xi4;
                    ((zhd) this.c).d(this);
                    return;
                }
                return;
            default:
                if (bj4.g(this.b, xi4)) {
                    this.b = xi4;
                    ((zhd) this.c).d(this);
                    return;
                }
                return;
        }
    }

    public void e() {
        try {
            ((zx7) this.o).getClass();
        } catch (Throwable th) {
            ek8.a0(th);
            xs7.F(th);
        }
    }

    public final void f() {
        switch (this.a) {
            case 0:
                try {
                    ((j73) this.o).Z.run();
                } catch (Throwable th) {
                    ek8.a0(th);
                    xs7.F(th);
                }
                this.b.f();
                return;
            case 1:
                xi4 xi4 = this.b;
                this.b = bj4.a;
                xi4.f();
                return;
            case 2:
                try {
                    ((zx7) this.o).getClass();
                } catch (Throwable th2) {
                    ek8.a0(th2);
                    xs7.F(th2);
                }
                this.b.f();
                this.b = bj4.a;
                return;
            case 3:
                this.b.f();
                this.b = bj4.a;
                return;
            case 4:
                this.b.f();
                return;
            case 5:
                this.b.f();
                return;
            case 6:
                this.b.f();
                return;
            default:
                this.b.f();
                return;
        }
    }

    public void g(Throwable th) {
        try {
            ((zx7) this.o).c.accept(th);
        } catch (Throwable th2) {
            ek8.a0(th2);
            th = new CompositeException(th, th2);
        }
        this.b = bj4.a;
        ((wx7) this.c).onError(th);
        e();
    }

    public final boolean h() {
        switch (this.a) {
            case 0:
                return this.b.h();
            case 1:
                return this.b.h();
            case 2:
                return this.b.h();
            case 3:
                return this.b.h();
            case 4:
                return this.b.h();
            case 5:
                return this.b.h();
            case 6:
                return this.b.h();
            default:
                return this.b.h();
        }
    }

    public final void onError(Throwable th) {
        switch (this.a) {
            case 0:
                j73 j73 = (j73) this.o;
                if (this.b == bj4.a) {
                    xs7.F(th);
                    return;
                }
                try {
                    j73.c.accept(th);
                    j73.X.run();
                } catch (Throwable th2) {
                    ek8.a0(th2);
                    th = new CompositeException(th, th2);
                }
                ((g73) this.c).onError(th);
                try {
                    j73.Y.run();
                    return;
                } catch (Throwable th3) {
                    ek8.a0(th3);
                    xs7.F(th3);
                    return;
                }
            case 1:
                ((wx7) this.c).onError(th);
                return;
            case 2:
                if (this.b == bj4.a) {
                    xs7.F(th);
                    return;
                } else {
                    g(th);
                    return;
                }
            case 3:
                this.b = bj4.a;
                ((zhd) this.c).onError(th);
                return;
            case 4:
                this.o = null;
                ((bw9) this.c).onError(th);
                return;
            case 5:
                this.o = null;
                ((zhd) this.c).onError(th);
                return;
            case 6:
                ((zhd) this.c).onError(th);
                return;
            default:
                ((zhd) this.c).onError(th);
                try {
                    ((j6) this.o).run();
                    return;
                } catch (Throwable th4) {
                    ek8.a0(th4);
                    xs7.F(th4);
                    return;
                }
        }
    }

    public i73(j73 j73, g73 g73) {
        this.a = 0;
        this.o = j73;
        this.c = g73;
    }
}

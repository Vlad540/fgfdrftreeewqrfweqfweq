package defpackage;

import io.reactivex.rxjava3.exceptions.CompositeException;
import java.util.Objects;

/* renamed from: bu9  reason: default package */
public final class bu9 implements bw9, xi4 {
    public final /* synthetic */ int a;
    public final bw9 b;
    public final j26 c;
    public xi4 o;

    public /* synthetic */ bu9(bw9 bw9, j26 j26, int i) {
        this.a = i;
        this.b = bw9;
        this.c = j26;
    }

    public final void b() {
        switch (this.a) {
            case 0:
                xi4 xi4 = this.o;
                bj4 bj4 = bj4.a;
                if (xi4 != bj4) {
                    this.o = bj4;
                    this.b.b();
                    return;
                }
                return;
            default:
                this.b.b();
                return;
        }
    }

    public final void c(Object obj) {
        switch (this.a) {
            case 0:
                if (this.o != bj4.a) {
                    try {
                        for (Object next : (Iterable) this.c.apply(obj)) {
                            try {
                                try {
                                    Objects.requireNonNull(next, "The iterator returned a null value");
                                    this.b.c(next);
                                } catch (Throwable th) {
                                    ek8.a0(th);
                                    this.o.f();
                                    onError(th);
                                    return;
                                }
                            } catch (Throwable th2) {
                                ek8.a0(th2);
                                this.o.f();
                                onError(th2);
                                return;
                            }
                        }
                        return;
                    } catch (Throwable th3) {
                        ek8.a0(th3);
                        this.o.f();
                        onError(th3);
                        return;
                    }
                } else {
                    return;
                }
            default:
                this.b.c(obj);
                return;
        }
    }

    public final void d(xi4 xi4) {
        switch (this.a) {
            case 0:
                if (bj4.g(this.o, xi4)) {
                    this.o = xi4;
                    this.b.d(this);
                    return;
                }
                return;
            default:
                if (bj4.g(this.o, xi4)) {
                    this.o = xi4;
                    this.b.d(this);
                    return;
                }
                return;
        }
    }

    public final void f() {
        switch (this.a) {
            case 0:
                this.o.f();
                this.o = bj4.a;
                return;
            default:
                this.o.f();
                return;
        }
    }

    public final boolean h() {
        switch (this.a) {
            case 0:
                return this.o.h();
            default:
                return this.o.h();
        }
    }

    public final void onError(Throwable th) {
        switch (this.a) {
            case 0:
                xi4 xi4 = this.o;
                bj4 bj4 = bj4.a;
                if (xi4 == bj4) {
                    xs7.F(th);
                    return;
                }
                this.o = bj4;
                this.b.onError(th);
                return;
            default:
                bw9 bw9 = this.b;
                try {
                    Object apply = this.c.apply(th);
                    if (apply == null) {
                        NullPointerException nullPointerException = new NullPointerException("The supplied value is null");
                        nullPointerException.initCause(th);
                        bw9.onError(nullPointerException);
                        return;
                    }
                    bw9.c(apply);
                    bw9.b();
                    return;
                } catch (Throwable th2) {
                    ek8.a0(th2);
                    bw9.onError(new CompositeException(th, th2));
                    return;
                }
        }
    }
}

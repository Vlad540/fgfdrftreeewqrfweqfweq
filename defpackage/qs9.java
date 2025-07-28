package defpackage;

import java.util.NoSuchElementException;

/* renamed from: qs9  reason: default package */
public final class qs9 implements bw9, xi4 {
    public Object X;
    public final /* synthetic */ int a = 1;
    public final zhd b;
    public xi4 c;
    public boolean o;

    public qs9(zhd zhd) {
        this.b = zhd;
    }

    public final void b() {
        switch (this.a) {
            case 0:
                if (!this.o) {
                    this.o = true;
                    this.b.a(Boolean.FALSE);
                    return;
                }
                return;
            default:
                if (!this.o) {
                    this.o = true;
                    Object obj = this.X;
                    this.X = null;
                    if (obj == null) {
                        obj = null;
                    }
                    zhd zhd = this.b;
                    if (obj != null) {
                        zhd.a(obj);
                        return;
                    } else {
                        zhd.onError(new NoSuchElementException());
                        return;
                    }
                } else {
                    return;
                }
        }
    }

    public final void c(Object obj) {
        switch (this.a) {
            case 0:
                if (!this.o) {
                    try {
                        if (((v1b) this.X).test(obj)) {
                            this.o = true;
                            this.c.f();
                            this.b.a(Boolean.TRUE);
                            return;
                        }
                        return;
                    } catch (Throwable th) {
                        ek8.a0(th);
                        this.c.f();
                        onError(th);
                        return;
                    }
                } else {
                    return;
                }
            default:
                if (!this.o) {
                    if (this.X != null) {
                        this.o = true;
                        this.c.f();
                        this.b.onError(new IllegalArgumentException("Sequence contains more than one element!"));
                        return;
                    }
                    this.X = obj;
                    return;
                }
                return;
        }
    }

    public final void d(xi4 xi4) {
        switch (this.a) {
            case 0:
                if (bj4.g(this.c, xi4)) {
                    this.c = xi4;
                    this.b.d(this);
                    return;
                }
                return;
            default:
                if (bj4.g(this.c, xi4)) {
                    this.c = xi4;
                    this.b.d(this);
                    return;
                }
                return;
        }
    }

    public final void f() {
        switch (this.a) {
            case 0:
                this.c.f();
                return;
            default:
                this.c.f();
                return;
        }
    }

    public final boolean h() {
        switch (this.a) {
            case 0:
                return this.c.h();
            default:
                return this.c.h();
        }
    }

    public final void onError(Throwable th) {
        switch (this.a) {
            case 0:
                if (this.o) {
                    xs7.F(th);
                    return;
                }
                this.o = true;
                this.b.onError(th);
                return;
            default:
                if (this.o) {
                    xs7.F(th);
                    return;
                }
                this.o = true;
                this.b.onError(th);
                return;
        }
    }

    public qs9(zhd zhd, v1b v1b) {
        this.b = zhd;
        this.X = v1b;
    }
}

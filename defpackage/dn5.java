package defpackage;

import java.util.NoSuchElementException;

/* renamed from: dn5  reason: default package */
public final class dn5 implements ko5, xi4 {
    public boolean X;
    public Object Y;
    public final /* synthetic */ int a = 1;
    public final zhd b;
    public final Object c;
    public d1e o;

    public dn5(zhd zhd, Object obj) {
        this.b = zhd;
        this.c = obj;
    }

    public final void b() {
        switch (this.a) {
            case 0:
                if (!this.X) {
                    this.X = true;
                    this.o = f1e.a;
                    this.b.a(this.c);
                    return;
                }
                return;
            default:
                if (!this.X) {
                    this.X = true;
                    this.o = f1e.a;
                    Object obj = this.Y;
                    this.Y = null;
                    if (obj == null) {
                        obj = this.c;
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
                if (!this.X) {
                    try {
                        ((lk0) this.Y).accept(this.c, obj);
                        return;
                    } catch (Throwable th) {
                        ek8.a0(th);
                        this.o.cancel();
                        onError(th);
                        return;
                    }
                } else {
                    return;
                }
            default:
                if (!this.X) {
                    if (this.Y != null) {
                        this.X = true;
                        this.o.cancel();
                        this.o = f1e.a;
                        this.b.onError(new IllegalArgumentException("Sequence contains more than one element!"));
                        return;
                    }
                    this.Y = obj;
                    return;
                }
                return;
        }
    }

    public final void e(d1e d1e) {
        switch (this.a) {
            case 0:
                if (f1e.e(this.o, d1e)) {
                    this.o = d1e;
                    this.b.d(this);
                    d1e.i(Long.MAX_VALUE);
                    return;
                }
                return;
            default:
                if (f1e.e(this.o, d1e)) {
                    this.o = d1e;
                    this.b.d(this);
                    d1e.i(Long.MAX_VALUE);
                    return;
                }
                return;
        }
    }

    public final void f() {
        switch (this.a) {
            case 0:
                this.o.cancel();
                this.o = f1e.a;
                return;
            default:
                this.o.cancel();
                this.o = f1e.a;
                return;
        }
    }

    public final boolean h() {
        switch (this.a) {
            case 0:
                return this.o == f1e.a;
            default:
                return this.o == f1e.a;
        }
    }

    public final void onError(Throwable th) {
        switch (this.a) {
            case 0:
                if (this.X) {
                    xs7.F(th);
                    return;
                }
                this.X = true;
                this.o = f1e.a;
                this.b.onError(th);
                return;
            default:
                if (this.X) {
                    xs7.F(th);
                    return;
                }
                this.X = true;
                this.o = f1e.a;
                this.b.onError(th);
                return;
        }
    }

    public dn5(zhd zhd, Object obj, lk0 lk0) {
        this.b = zhd;
        this.Y = lk0;
        this.c = obj;
    }
}

package defpackage;

import io.reactivex.rxjava3.exceptions.CompositeException;

/* renamed from: ix7  reason: default package */
public final class ix7 implements zhd, xi4, wx7 {
    public final /* synthetic */ int a;
    public final wx7 b;
    public final v1b c;
    public xi4 o;

    public /* synthetic */ ix7(wx7 wx7, v1b v1b, int i) {
        this.a = i;
        this.b = wx7;
        this.c = v1b;
    }

    public final void a(Object obj) {
        switch (this.a) {
            case 0:
                wx7 wx7 = this.b;
                try {
                    if (this.c.test(obj)) {
                        wx7.a(obj);
                        return;
                    } else {
                        wx7.b();
                        return;
                    }
                } catch (Throwable th) {
                    ek8.a0(th);
                    wx7.onError(th);
                    return;
                }
            default:
                this.b.a(obj);
                return;
        }
    }

    public void b() {
        this.b.b();
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
                xi4 xi4 = this.o;
                this.o = bj4.a;
                xi4.f();
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
                this.b.onError(th);
                return;
            default:
                wx7 wx7 = this.b;
                try {
                    if (this.c.test(th)) {
                        wx7.b();
                        return;
                    } else {
                        wx7.onError(th);
                        return;
                    }
                } catch (Throwable th2) {
                    ek8.a0(th2);
                    wx7.onError(new CompositeException(th, th2));
                    return;
                }
        }
    }
}

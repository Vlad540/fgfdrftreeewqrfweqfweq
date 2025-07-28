package defpackage;

/* renamed from: ss9  reason: default package */
public final class ss9 implements bw9, xi4 {
    public boolean X;
    public final Object Y;
    public final /* synthetic */ int a;
    public final lk0 b;
    public final Object c;
    public xi4 o;

    public /* synthetic */ ss9(Object obj, Object obj2, lk0 lk0, int i) {
        this.a = i;
        this.Y = obj;
        this.b = lk0;
        this.c = obj2;
    }

    public final void b() {
        switch (this.a) {
            case 0:
                if (!this.X) {
                    this.X = true;
                    Object obj = this.c;
                    bw9 bw9 = (bw9) this.Y;
                    bw9.c(obj);
                    bw9.b();
                    return;
                }
                return;
            default:
                if (!this.X) {
                    this.X = true;
                    ((zhd) this.Y).a(this.c);
                    return;
                }
                return;
        }
    }

    public final void c(Object obj) {
        switch (this.a) {
            case 0:
                if (!this.X) {
                    try {
                        this.b.accept(this.c, obj);
                        return;
                    } catch (Throwable th) {
                        ek8.a0(th);
                        this.o.f();
                        onError(th);
                        return;
                    }
                } else {
                    return;
                }
            default:
                if (!this.X) {
                    try {
                        this.b.accept(this.c, obj);
                        return;
                    } catch (Throwable th2) {
                        ek8.a0(th2);
                        this.o.f();
                        onError(th2);
                        return;
                    }
                } else {
                    return;
                }
        }
    }

    public final void d(xi4 xi4) {
        switch (this.a) {
            case 0:
                if (bj4.g(this.o, xi4)) {
                    this.o = xi4;
                    ((bw9) this.Y).d(this);
                    return;
                }
                return;
            default:
                if (bj4.g(this.o, xi4)) {
                    this.o = xi4;
                    ((zhd) this.Y).d(this);
                    return;
                }
                return;
        }
    }

    public final void f() {
        switch (this.a) {
            case 0:
                this.o.f();
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
                if (this.X) {
                    xs7.F(th);
                    return;
                }
                this.X = true;
                ((bw9) this.Y).onError(th);
                return;
            default:
                if (this.X) {
                    xs7.F(th);
                    return;
                }
                this.X = true;
                ((zhd) this.Y).onError(th);
                return;
        }
    }
}

package defpackage;

/* renamed from: cj4  reason: default package */
public final class cj4 implements bw9, xi4 {
    public final bw9 a;
    public final of3 b;
    public final j6 c;
    public xi4 o;

    public cj4(bw9 bw9, of3 of3, j6 j6Var) {
        this.a = bw9;
        this.b = of3;
        this.c = j6Var;
    }

    public final void b() {
        xi4 xi4 = this.o;
        bj4 bj4 = bj4.a;
        if (xi4 != bj4) {
            this.o = bj4;
            this.a.b();
        }
    }

    public final void c(Object obj) {
        this.a.c(obj);
    }

    public final void d(xi4 xi4) {
        bw9 bw9 = this.a;
        try {
            this.b.accept(xi4);
            if (bj4.g(this.o, xi4)) {
                this.o = xi4;
                bw9.d(this);
            }
        } catch (Throwable th) {
            ek8.a0(th);
            xi4.f();
            this.o = bj4.a;
            cw4.b(th, bw9);
        }
    }

    public final void f() {
        xi4 xi4 = this.o;
        bj4 bj4 = bj4.a;
        if (xi4 != bj4) {
            this.o = bj4;
            try {
                this.c.run();
            } catch (Throwable th) {
                ek8.a0(th);
                xs7.F(th);
            }
            xi4.f();
        }
    }

    public final boolean h() {
        return this.o.h();
    }

    public final void onError(Throwable th) {
        xi4 xi4 = this.o;
        bj4 bj4 = bj4.a;
        if (xi4 != bj4) {
            this.o = bj4;
            this.a.onError(th);
            return;
        }
        xs7.F(th);
    }
}

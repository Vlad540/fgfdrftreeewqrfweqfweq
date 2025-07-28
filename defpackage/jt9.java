package defpackage;

import io.reactivex.rxjava3.exceptions.CompositeException;

/* renamed from: jt9  reason: default package */
public final class jt9 implements bw9, xi4 {
    public final j6 X;
    public xi4 Y;
    public boolean Z;
    public final bw9 a;
    public final of3 b;
    public final of3 c;
    public final j6 o;

    public jt9(bw9 bw9, of3 of3, of3 of32, j6 j6Var) {
        z26 z26 = z3d.i;
        this.a = bw9;
        this.b = of3;
        this.c = of32;
        this.o = j6Var;
        this.X = z26;
    }

    public final void b() {
        if (!this.Z) {
            try {
                this.o.run();
                this.Z = true;
                this.a.b();
                try {
                    this.X.run();
                } catch (Throwable th) {
                    ek8.a0(th);
                    xs7.F(th);
                }
            } catch (Throwable th2) {
                ek8.a0(th2);
                onError(th2);
            }
        }
    }

    public final void c(Object obj) {
        if (!this.Z) {
            try {
                this.b.accept(obj);
                this.a.c(obj);
            } catch (Throwable th) {
                ek8.a0(th);
                this.Y.f();
                onError(th);
            }
        }
    }

    public final void d(xi4 xi4) {
        if (bj4.g(this.Y, xi4)) {
            this.Y = xi4;
            this.a.d(this);
        }
    }

    public final void f() {
        this.Y.f();
    }

    public final boolean h() {
        return this.Y.h();
    }

    public final void onError(Throwable th) {
        if (this.Z) {
            xs7.F(th);
            return;
        }
        this.Z = true;
        try {
            this.c.accept(th);
        } catch (Throwable th2) {
            ek8.a0(th2);
            th = new CompositeException(th, th2);
        }
        this.a.onError(th);
        try {
            this.X.run();
        } catch (Throwable th3) {
            ek8.a0(th3);
            xs7.F(th3);
        }
    }
}

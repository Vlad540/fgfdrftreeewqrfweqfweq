package defpackage;

import java.util.concurrent.TimeUnit;

/* renamed from: ct9  reason: default package */
public final class ct9 implements bw9, xi4 {
    public xi4 X;
    public bt9 Y;
    public volatile long Z;
    public final bw9 a;
    public final long b = 1000;
    public final TimeUnit c;
    public final omc o;
    public boolean w0;

    public ct9(zyc zyc, TimeUnit timeUnit, omc omc) {
        this.a = zyc;
        this.c = timeUnit;
        this.o = omc;
    }

    public final void b() {
        if (!this.w0) {
            this.w0 = true;
            bt9 bt9 = this.Y;
            if (bt9 != null) {
                bj4.a(bt9);
            }
            if (bt9 != null) {
                bt9.run();
            }
            this.a.b();
            this.o.f();
        }
    }

    public final void c(Object obj) {
        if (!this.w0) {
            long j = this.Z + 1;
            this.Z = j;
            bt9 bt9 = this.Y;
            if (bt9 != null) {
                bj4.a(bt9);
            }
            bt9 bt92 = new bt9(obj, j, this);
            this.Y = bt92;
            bj4.c(bt92, this.o.c(bt92, this.b, this.c));
        }
    }

    public final void d(xi4 xi4) {
        if (bj4.g(this.X, xi4)) {
            this.X = xi4;
            this.a.d(this);
        }
    }

    public final void f() {
        this.X.f();
        this.o.f();
    }

    public final boolean h() {
        return this.o.h();
    }

    public final void onError(Throwable th) {
        if (this.w0) {
            xs7.F(th);
            return;
        }
        bt9 bt9 = this.Y;
        if (bt9 != null) {
            bj4.a(bt9);
        }
        this.w0 = true;
        this.a.onError(th);
        this.o.f();
    }
}

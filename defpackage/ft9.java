package defpackage;

import java.util.concurrent.TimeUnit;

/* renamed from: ft9  reason: default package */
public final class ft9 implements bw9, xi4 {
    public final boolean X = false;
    public xi4 Y;
    public final bw9 a;
    public final long b;
    public final TimeUnit c;
    public final omc o;

    public ft9(bw9 bw9, long j, TimeUnit timeUnit, omc omc) {
        this.a = bw9;
        this.b = j;
        this.c = timeUnit;
        this.o = omc;
    }

    public final void b() {
        this.o.c(new vp6(16, this), this.b, this.c);
    }

    public final void c(Object obj) {
        this.o.c(new p36((Object) this, obj, false, 13), this.b, this.c);
    }

    public final void d(xi4 xi4) {
        if (bj4.g(this.Y, xi4)) {
            this.Y = xi4;
            this.a.d(this);
        }
    }

    public final void f() {
        this.Y.f();
        this.o.f();
    }

    public final boolean h() {
        return this.o.h();
    }

    public final void onError(Throwable th) {
        this.o.c(new q36((Object) this, (Object) th, false, 10), this.X ? this.b : 0, this.c);
    }
}

package defpackage;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: rv9  reason: default package */
public final class rv9 extends AtomicReference implements bw9, xi4, Runnable {
    public final of3 X = null;
    public xi4 Y;
    public volatile boolean Z;
    public final bw9 a;
    public final long b;
    public final TimeUnit c;
    public final omc o;

    public rv9(zyc zyc, long j, TimeUnit timeUnit, omc omc) {
        this.a = zyc;
        this.b = j;
        this.c = timeUnit;
        this.o = omc;
    }

    public final void b() {
        this.a.b();
        this.o.f();
    }

    public final void c(Object obj) {
        if (!this.Z) {
            this.Z = true;
            this.a.c(obj);
            xi4 xi4 = (xi4) get();
            if (xi4 != null) {
                xi4.f();
            }
            bj4.c(this, this.o.c(this, this.b, this.c));
            return;
        }
        of3 of3 = this.X;
        if (of3 != null) {
            try {
                of3.accept(obj);
            } catch (Throwable th) {
                ek8.a0(th);
                this.Y.f();
                this.a.onError(th);
                this.o.f();
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
        this.o.f();
    }

    public final boolean h() {
        return this.o.h();
    }

    public final void onError(Throwable th) {
        this.a.onError(th);
        this.o.f();
    }

    public final void run() {
        this.Z = false;
    }
}

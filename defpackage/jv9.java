package defpackage;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: jv9  reason: default package */
public abstract class jv9 extends AtomicReference implements bw9, xi4, Runnable {
    public final of3 X;
    public final AtomicReference Y = new AtomicReference();
    public xi4 Z;
    public final bw9 a;
    public final long b;
    public final TimeUnit c;
    public final qmc o;

    public jv9(zyc zyc, long j, TimeUnit timeUnit, qmc qmc) {
        this.a = zyc;
        this.b = j;
        this.c = timeUnit;
        this.o = qmc;
        this.X = null;
    }

    public abstract void a();

    public final void b() {
        bj4.a(this.Y);
        a();
    }

    public final void c(Object obj) {
        of3 of3;
        Object andSet = getAndSet(obj);
        if (andSet != null && (of3 = this.X) != null) {
            try {
                of3.accept(andSet);
            } catch (Throwable th) {
                ek8.a0(th);
                bj4.a(this.Y);
                this.Z.f();
                this.a.onError(th);
            }
        }
    }

    public final void d(xi4 xi4) {
        if (bj4.g(this.Z, xi4)) {
            this.Z = xi4;
            this.a.d(this);
            long j = this.b;
            bj4.c(this.Y, this.o.d(this, j, j, this.c));
        }
    }

    public final void e() {
        Object andSet = getAndSet((Object) null);
        if (andSet != null) {
            this.a.c(andSet);
        }
    }

    public final void f() {
        bj4.a(this.Y);
        this.Z.f();
    }

    public final boolean h() {
        return this.Z.h();
    }

    public final void onError(Throwable th) {
        bj4.a(this.Y);
        this.a.onError(th);
    }

    public void run() {
        e();
    }
}

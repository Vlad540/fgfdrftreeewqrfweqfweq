package defpackage;

import java.util.concurrent.CountDownLatch;

/* renamed from: ho0  reason: default package */
public final class ho0 extends CountDownLatch implements bw9, xi4 {
    public Object a;
    public Throwable b;
    public xi4 c;
    public volatile boolean o;

    public final void b() {
        countDown();
    }

    public final void c(Object obj) {
        if (this.a == null) {
            this.a = obj;
            this.c.f();
            countDown();
        }
    }

    public final void d(xi4 xi4) {
        this.c = xi4;
        if (this.o) {
            xi4.f();
        }
    }

    public final void f() {
        this.o = true;
        xi4 xi4 = this.c;
        if (xi4 != null) {
            xi4.f();
        }
    }

    public final boolean h() {
        return this.o;
    }

    public final void onError(Throwable th) {
        if (this.a == null) {
            this.b = th;
        }
        countDown();
    }
}

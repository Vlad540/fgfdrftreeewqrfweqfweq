package defpackage;

import java.util.concurrent.CountDownLatch;

/* renamed from: io0  reason: default package */
public final class io0 extends CountDownLatch implements zhd, g73, wx7 {
    public Object a;
    public Throwable b;
    public xi4 c;
    public volatile boolean o;

    public final void a(Object obj) {
        this.a = obj;
        countDown();
    }

    public final void b() {
        countDown();
    }

    public final Object c() {
        if (getCount() != 0) {
            try {
                await();
            } catch (InterruptedException e) {
                this.o = true;
                xi4 xi4 = this.c;
                if (xi4 != null) {
                    xi4.f();
                }
                throw i15.f(e);
            }
        }
        Throwable th = this.b;
        if (th == null) {
            return this.a;
        }
        throw i15.f(th);
    }

    public final void d(xi4 xi4) {
        this.c = xi4;
        if (this.o) {
            xi4.f();
        }
    }

    public final void onError(Throwable th) {
        this.b = th;
        countDown();
    }
}

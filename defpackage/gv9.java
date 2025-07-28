package defpackage;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: gv9  reason: default package */
public final class gv9 extends AtomicInteger implements bw9, xi4 {
    public final fn5 X = new fn5(this);
    public final AtomicReference Y = new AtomicReference();
    public final nv9 Z;
    public final bw9 a;
    public final AtomicInteger b = new AtomicInteger();
    public final ey c = new AtomicReference();
    public final tc3 o;
    public volatile boolean w0;

    /* JADX WARNING: type inference failed for: r1v2, types: [ey, java.util.concurrent.atomic.AtomicReference] */
    public gv9(bw9 bw9, czc czc, nv9 nv9) {
        this.a = bw9;
        this.o = czc;
        this.Z = nv9;
    }

    public final void a() {
        if (this.b.getAndIncrement() == 0) {
            while (!h()) {
                if (!this.w0) {
                    this.w0 = true;
                    this.Z.a(this);
                }
                if (this.b.decrementAndGet() == 0) {
                    return;
                }
            }
        }
    }

    public final void b() {
        bj4.a(this.X);
        if (getAndIncrement() == 0) {
            this.c.d(this.a);
        }
    }

    public final void c(Object obj) {
        if (get() == 0 && compareAndSet(0, 1)) {
            bw9 bw9 = this.a;
            bw9.c(obj);
            if (decrementAndGet() != 0) {
                this.c.d(bw9);
            }
        }
    }

    public final void d(xi4 xi4) {
        bj4.c(this.Y, xi4);
    }

    public final void f() {
        bj4.a(this.Y);
        bj4.a(this.X);
    }

    public final boolean h() {
        return bj4.b((xi4) this.Y.get());
    }

    public final void onError(Throwable th) {
        bj4.c(this.Y, (xi4) null);
        this.w0 = false;
        this.o.c(th);
    }
}

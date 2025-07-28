package defpackage;

import java.util.concurrent.atomic.AtomicReference;

/* renamed from: tt9  reason: default package */
public final class tt9 extends AtomicReference implements bw9 {
    public final ut9 a;
    public volatile boolean b;
    public volatile xgd c;
    public int o;

    public tt9(ut9 ut9) {
        this.a = ut9;
    }

    public final void b() {
        this.b = true;
        this.a.g();
    }

    public final void c(Object obj) {
        if (this.o == 0) {
            ut9 ut9 = this.a;
            if (ut9.get() != 0 || !ut9.compareAndSet(0, 1)) {
                xgd xgd = this.c;
                if (xgd == null) {
                    xgd = new knd(ut9.X);
                    this.c = xgd;
                }
                xgd.offer(obj);
                if (ut9.getAndIncrement() != 0) {
                    return;
                }
            } else {
                ut9.a.c(obj);
                if (ut9.decrementAndGet() == 0) {
                    return;
                }
            }
            ut9.i();
            return;
        }
        this.a.g();
    }

    public final void d(xi4 xi4) {
        if (bj4.e(this, xi4) && (xi4 instanceof xjb)) {
            xjb xjb = (xjb) xi4;
            int q = xjb.q(7);
            if (q == 1) {
                this.o = q;
                this.c = xjb;
                this.b = true;
                this.a.g();
            } else if (q == 2) {
                this.o = q;
                this.c = xjb;
            }
        }
    }

    public final void onError(Throwable th) {
        if (this.a.w0.a(th)) {
            ut9 ut9 = this.a;
            if (!ut9.c) {
                ut9.e();
            }
            this.b = true;
            this.a.g();
        }
    }
}

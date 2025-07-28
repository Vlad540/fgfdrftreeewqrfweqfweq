package defpackage;

import java.util.concurrent.atomic.AtomicReference;

/* renamed from: e73  reason: default package */
public final class e73 extends AtomicReference implements g73, xi4, Runnable, zhd {
    public final /* synthetic */ int a = 0;
    public final Object b;
    public final Object c;
    public Object o;

    public e73(g73 g73, qmc qmc) {
        this.b = g73;
        this.c = qmc;
    }

    public void a(Object obj) {
        ((zhd) this.b).a(obj);
    }

    public void b() {
        switch (this.a) {
            case 0:
                bj4.c(this, ((qmc) this.c).b(this));
                return;
            default:
                ((g73) this.b).b();
                return;
        }
    }

    public final void d(xi4 xi4) {
        switch (this.a) {
            case 0:
                if (bj4.e(this, xi4)) {
                    ((g73) this.b).d(this);
                    return;
                }
                return;
            case 1:
                bj4.e(this, xi4);
                return;
            default:
                bj4.e(this, xi4);
                return;
        }
    }

    public final void f() {
        switch (this.a) {
            case 0:
                bj4.a(this);
                return;
            case 1:
                bj4.a(this);
                bw1 bw1 = (bw1) this.c;
                bw1.getClass();
                bj4.a(bw1);
                return;
            default:
                bj4.a(this);
                bw1 bw12 = (bw1) this.c;
                bw12.getClass();
                bj4.a(bw12);
                return;
        }
    }

    public final boolean h() {
        switch (this.a) {
            case 0:
                return bj4.b((xi4) get());
            case 1:
                return bj4.b((xi4) get());
            default:
                return bj4.b((xi4) get());
        }
    }

    public final void onError(Throwable th) {
        switch (this.a) {
            case 0:
                this.o = th;
                bj4.c(this, ((qmc) this.c).b(this));
                return;
            case 1:
                ((g73) this.b).onError(th);
                return;
            default:
                ((zhd) this.b).onError(th);
                return;
        }
    }

    public final void run() {
        switch (this.a) {
            case 0:
                Throwable th = (Throwable) this.o;
                g73 g73 = (g73) this.b;
                if (th != null) {
                    this.o = null;
                    g73.onError(th);
                    return;
                }
                g73.b();
                return;
            case 1:
                ((v63) this.o).i(this);
                return;
            default:
                ((dhd) this.o).k(this);
                return;
        }
    }

    public e73(zhd zhd, dhd dhd) {
        this.b = zhd;
        this.o = dhd;
        this.c = new bw1(2);
    }

    public e73(g73 g73, v63 v63) {
        this.b = g73;
        this.o = v63;
        this.c = new bw1(2);
    }
}

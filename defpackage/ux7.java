package defpackage;

import java.util.concurrent.atomic.AtomicReference;

/* renamed from: ux7  reason: default package */
public final class ux7 extends AtomicReference implements wx7, xi4, Runnable, zhd {
    public final Object X;
    public final /* synthetic */ int a;
    public final qmc b;
    public Object c;
    public Throwable o;

    public /* synthetic */ ux7(Object obj, qmc qmc, int i) {
        this.a = i;
        this.X = obj;
        this.b = qmc;
    }

    public final void a(Object obj) {
        switch (this.a) {
            case 0:
                this.c = obj;
                bj4.c(this, this.b.b(this));
                return;
            default:
                this.c = obj;
                bj4.c(this, this.b.b(this));
                return;
        }
    }

    public void b() {
        bj4.c(this, this.b.b(this));
    }

    public final void d(xi4 xi4) {
        switch (this.a) {
            case 0:
                if (bj4.e(this, xi4)) {
                    ((wx7) this.X).d(this);
                    return;
                }
                return;
            default:
                if (bj4.e(this, xi4)) {
                    ((zhd) this.X).d(this);
                    return;
                }
                return;
        }
    }

    public final void f() {
        switch (this.a) {
            case 0:
                bj4.a(this);
                return;
            default:
                bj4.a(this);
                return;
        }
    }

    public final boolean h() {
        switch (this.a) {
            case 0:
                return bj4.b((xi4) get());
            default:
                return bj4.b((xi4) get());
        }
    }

    public final void onError(Throwable th) {
        switch (this.a) {
            case 0:
                this.o = th;
                bj4.c(this, this.b.b(this));
                return;
            default:
                this.o = th;
                bj4.c(this, this.b.b(this));
                return;
        }
    }

    public final void run() {
        switch (this.a) {
            case 0:
                Throwable th = this.o;
                wx7 wx7 = (wx7) this.X;
                if (th != null) {
                    this.o = null;
                    wx7.onError(th);
                    return;
                }
                Object obj = this.c;
                if (obj != null) {
                    this.c = null;
                    wx7.a(obj);
                    return;
                }
                wx7.b();
                return;
            default:
                Throwable th2 = this.o;
                zhd zhd = (zhd) this.X;
                if (th2 != null) {
                    zhd.onError(th2);
                    return;
                } else {
                    zhd.a(this.c);
                    return;
                }
        }
    }
}

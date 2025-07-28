package defpackage;

import java.util.concurrent.atomic.AtomicReference;

/* renamed from: cy7  reason: default package */
public final class cy7 extends AtomicReference implements wx7, xi4, g73 {
    public final /* synthetic */ int a;
    public final zhd b;
    public final dhd c;

    public /* synthetic */ cy7(zhd zhd, dhd dhd, int i) {
        this.a = i;
        this.b = zhd;
        this.c = dhd;
    }

    public void a(Object obj) {
        this.b.a(obj);
    }

    public final void b() {
        switch (this.a) {
            case 0:
                xi4 xi4 = (xi4) get();
                if (xi4 != bj4.a && compareAndSet(xi4, (Object) null)) {
                    this.c.k(new by7(this.b, (AtomicReference) this));
                    return;
                }
                return;
            default:
                this.c.k(new d4b(this, 3, this.b));
                return;
        }
    }

    public final void d(xi4 xi4) {
        switch (this.a) {
            case 0:
                if (bj4.e(this, xi4)) {
                    this.b.d(this);
                    return;
                }
                return;
            default:
                if (bj4.e(this, xi4)) {
                    this.b.d(this);
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
                this.b.onError(th);
                return;
            default:
                this.b.onError(th);
                return;
        }
    }
}

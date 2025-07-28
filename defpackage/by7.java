package defpackage;

import java.util.concurrent.atomic.AtomicReference;

/* renamed from: by7  reason: default package */
public final class by7 implements zhd {
    public final /* synthetic */ int a = 1;
    public final AtomicReference b;
    public final zhd c;

    public by7(AtomicReference atomicReference, zhd zhd) {
        this.b = atomicReference;
        this.c = zhd;
    }

    public final void a(Object obj) {
        switch (this.a) {
            case 0:
                this.c.a(obj);
                return;
            default:
                this.c.a(obj);
                return;
        }
    }

    public final void d(xi4 xi4) {
        switch (this.a) {
            case 0:
                bj4.e(this.b, xi4);
                return;
            default:
                bj4.c(this.b, xi4);
                return;
        }
    }

    public final void onError(Throwable th) {
        switch (this.a) {
            case 0:
                this.c.onError(th);
                return;
            default:
                this.c.onError(th);
                return;
        }
    }

    public by7(zhd zhd, AtomicReference atomicReference) {
        this.c = zhd;
        this.b = atomicReference;
    }
}

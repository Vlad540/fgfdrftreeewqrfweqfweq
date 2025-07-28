package defpackage;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: tid  reason: default package */
public final class tid extends AtomicReference implements zhd, Runnable, xi4 {
    public final long X;
    public final TimeUnit Y;
    public final zhd a;
    public final AtomicReference b = new AtomicReference();
    public final fn5 c;
    public dhd o;

    public tid(zhd zhd, dhd dhd, long j, TimeUnit timeUnit) {
        this.a = zhd;
        this.o = dhd;
        this.X = j;
        this.Y = timeUnit;
        if (dhd != null) {
            this.c = new fn5(3, zhd);
        } else {
            this.c = null;
        }
    }

    public final void a(Object obj) {
        xi4 xi4 = (xi4) get();
        bj4 bj4 = bj4.a;
        if (xi4 != bj4 && compareAndSet(xi4, bj4)) {
            bj4.a(this.b);
            this.a.a(obj);
        }
    }

    public final void d(xi4 xi4) {
        bj4.e(this, xi4);
    }

    public final void f() {
        bj4.a(this);
        bj4.a(this.b);
        fn5 fn5 = this.c;
        if (fn5 != null) {
            bj4.a(fn5);
        }
    }

    public final boolean h() {
        return bj4.b((xi4) get());
    }

    public final void onError(Throwable th) {
        xi4 xi4 = (xi4) get();
        bj4 bj4 = bj4.a;
        if (xi4 == bj4 || !compareAndSet(xi4, bj4)) {
            xs7.F(th);
            return;
        }
        bj4.a(this.b);
        this.a.onError(th);
    }

    public final void run() {
        if (bj4.a(this)) {
            dhd dhd = this.o;
            if (dhd == null) {
                this.a.onError(new TimeoutException(i15.e(this.X, this.Y)));
                return;
            }
            this.o = null;
            dhd.k(this.c);
        }
    }
}

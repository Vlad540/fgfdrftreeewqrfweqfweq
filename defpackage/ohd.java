package defpackage;

import io.reactivex.rxjava3.exceptions.CompositeException;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: ohd  reason: default package */
public final class ohd extends AtomicReference implements zhd, xi4 {
    public final /* synthetic */ int a;
    public final zhd b;
    public final j26 c;

    public /* synthetic */ ohd(int i, j26 j26, zhd zhd) {
        this.a = i;
        this.b = zhd;
        this.c = j26;
    }

    public final void a(Object obj) {
        switch (this.a) {
            case 0:
                zhd zhd = this.b;
                try {
                    Object apply = this.c.apply(obj);
                    Objects.requireNonNull(apply, "The single returned by the mapper is null");
                    dhd dhd = (dhd) apply;
                    if (!h()) {
                        dhd.k(new by7((AtomicReference) this, zhd));
                        return;
                    }
                    return;
                } catch (Throwable th) {
                    ek8.a0(th);
                    zhd.onError(th);
                    return;
                }
            default:
                this.b.a(obj);
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
                zhd zhd = this.b;
                try {
                    Object apply = this.c.apply(th);
                    Objects.requireNonNull(apply, "The nextFunction returned a null SingleSource.");
                    ((dhd) apply).k(new d4b(this, 3, zhd));
                    return;
                } catch (Throwable th2) {
                    ek8.a0(th2);
                    zhd.onError(new CompositeException(th, th2));
                    return;
                }
        }
    }
}

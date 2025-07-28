package defpackage;

import java.util.Objects;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: djd  reason: default package */
public final class djd extends AtomicReference implements zhd {
    public final cjd a;
    public final int b;

    public djd(cjd cjd, int i) {
        this.a = cjd;
        this.b = i;
    }

    public final void a(Object obj) {
        cjd cjd = this.a;
        zhd zhd = cjd.a;
        Object[] objArr = cjd.o;
        if (objArr != null) {
            objArr[this.b] = obj;
        }
        if (cjd.decrementAndGet() == 0) {
            try {
                Object apply = cjd.b.apply(objArr);
                Objects.requireNonNull(apply, "The zipper returned a null value");
                cjd.o = null;
                zhd.a(apply);
            } catch (Throwable th) {
                ek8.a0(th);
                cjd.o = null;
                zhd.onError(th);
            }
        }
    }

    public final void d(xi4 xi4) {
        bj4.e(this, xi4);
    }

    public final void onError(Throwable th) {
        this.a.a(th, this.b);
    }
}

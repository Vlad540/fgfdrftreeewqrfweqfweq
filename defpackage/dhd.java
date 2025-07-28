package defpackage;

import java.util.Objects;
import java.util.concurrent.CountDownLatch;

/* renamed from: dhd  reason: default package */
public abstract class dhd {
    public static jhd f(Throwable th) {
        Objects.requireNonNull(th, "throwable is null");
        return new jhd(new b36(th), 1);
    }

    public static mv9 g(Object obj) {
        Objects.requireNonNull(obj, "item is null");
        return new mv9(3, obj);
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [java.util.concurrent.CountDownLatch, zhd, io0] */
    public final Object e() {
        ? countDownLatch = new CountDownLatch(1);
        k(countDownLatch);
        return countDownLatch.c();
    }

    public final phd h(j26 j26) {
        Objects.requireNonNull(j26, "mapper is null");
        return new phd(this, j26, 1);
    }

    public final yhd i(qmc qmc) {
        Objects.requireNonNull(qmc, "scheduler is null");
        return new yhd(this, qmc, 0);
    }

    public final ho5 j(ice ice) {
        return new ho5(new co5(this instanceof e36 ? ((e36) this).b() : new kn5(3, this), ice, 0), 0);
    }

    public final void k(zhd zhd) {
        Objects.requireNonNull(zhd, "observer is null");
        try {
            l(zhd);
        } catch (NullPointerException e) {
            throw e;
        } catch (Throwable th) {
            ek8.a0(th);
            NullPointerException nullPointerException = new NullPointerException("subscribeActual failed");
            nullPointerException.initCause(th);
            throw nullPointerException;
        }
    }

    public abstract void l(zhd zhd);

    public final yhd m(qmc qmc) {
        Objects.requireNonNull(qmc, "scheduler is null");
        return new yhd(this, qmc, 1);
    }

    public final ms9 n() {
        return this instanceof f36 ? ((f36) this).c() : new n73(6, this);
    }
}

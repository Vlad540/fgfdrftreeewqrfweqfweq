package defpackage;

import java.util.Objects;
import java.util.concurrent.CountDownLatch;

/* renamed from: v63  reason: default package */
public abstract class v63 {
    /* JADX WARNING: type inference failed for: r0v0, types: [java.util.concurrent.CountDownLatch, g73, io0] */
    public final void a() {
        ? countDownLatch = new CountDownLatch(1);
        i(countDownLatch);
        countDownLatch.c();
    }

    public final w63 e(v63 v63) {
        Objects.requireNonNull(v63, "other is null");
        return new w63(this, 0, v63);
    }

    public final j73 f(j6 j6Var) {
        return new j73(this, z3d.j, j6Var);
    }

    public final j73 g(of3 of3) {
        return new j73(this, of3, z3d.i);
    }

    public final f73 h(qmc qmc) {
        Objects.requireNonNull(qmc, "scheduler is null");
        return new f73(this, qmc, 0);
    }

    public final void i(g73 g73) {
        Objects.requireNonNull(g73, "observer is null");
        try {
            j(g73);
        } catch (NullPointerException e) {
            throw e;
        } catch (Throwable th) {
            ek8.a0(th);
            xs7.F(th);
            NullPointerException nullPointerException = new NullPointerException("Actually not, but can't pass out an exception otherwise...");
            nullPointerException.initCause(th);
            throw nullPointerException;
        }
    }

    public abstract void j(g73 g73);

    public final f73 k(qmc qmc) {
        Objects.requireNonNull(qmc, "scheduler is null");
        return new f73(this, qmc, 1);
    }

    public final ms9 l() {
        return this instanceof f36 ? ((f36) this).c() : new n73(0, this);
    }
}

package defpackage;

import java.util.Comparator;
import java.util.Objects;
import java.util.concurrent.TimeUnit;

/* renamed from: ms9  reason: default package */
public abstract class ms9 implements nv9 {
    public static et9 g(Throwable th) {
        Objects.requireNonNull(th, "throwable is null");
        return new et9(new b36(th), 1);
    }

    public static n73 j(Iterable iterable) {
        Objects.requireNonNull(iterable, "source is null");
        return new n73(4, iterable);
    }

    public static ku9 k(long j, long j2, TimeUnit timeUnit, qmc qmc) {
        Objects.requireNonNull(timeUnit, "unit is null");
        Objects.requireNonNull(qmc, "scheduler is null");
        return new ku9(Math.max(0, j), Math.max(0, j2), timeUnit, qmc);
    }

    public static ku9 l(long j, TimeUnit timeUnit) {
        return k(j, j, timeUnit, cnc.a());
    }

    public static lu9 m(Object obj) {
        Objects.requireNonNull(obj, "item is null");
        return new lu9(obj);
    }

    public static zv9 u(long j, TimeUnit timeUnit, qmc qmc) {
        Objects.requireNonNull(timeUnit, "unit is null");
        Objects.requireNonNull(qmc, "scheduler is null");
        return new zv9(Math.max(j, 0), timeUnit, qmc);
    }

    public final void a(bw9 bw9) {
        Objects.requireNonNull(bw9, "observer is null");
        try {
            q(bw9);
        } catch (NullPointerException e) {
            throw e;
        } catch (Throwable th) {
            ek8.a0(th);
            xs7.F(th);
            NullPointerException nullPointerException = new NullPointerException("Actually not, but can't throw other exceptions due to RS");
            nullPointerException.initCause(th);
            throw nullPointerException;
        }
    }

    public final ms9 e(j26 j26) {
        fja.D(2, "bufferSize");
        if (!(this instanceof dlc)) {
            return new ys9(this, j26, 2, 1);
        }
        Object obj = ((dlc) this).get();
        return obj == null ? rt9.a : new lx7(obj, j26, 2);
    }

    public final lx7 f(j26 j26) {
        fja.D(2, "bufferSize");
        return new lx7(this, j26, 1);
    }

    public final ms9 h(j26 j26) {
        return i(j26, Integer.MAX_VALUE);
    }

    public final ms9 i(j26 j26, int i) {
        int i2 = an5.a;
        fja.D(i, "maxConcurrency");
        fja.D(i2, "bufferSize");
        if (!(this instanceof dlc)) {
            return new ys9((nv9) this, j26, i, i2);
        }
        Object obj = ((dlc) this).get();
        return obj == null ? rt9.a : new lx7(obj, j26, 2);
    }

    public final nu9 n(qmc qmc) {
        int i = an5.a;
        Objects.requireNonNull(qmc, "scheduler is null");
        fja.D(i, "bufferSize");
        return new nu9(this, qmc, i);
    }

    public final fv9 o(long j, v1b v1b) {
        if (j >= 0) {
            return new fv9(this, j, v1b);
        }
        throw new IllegalArgumentException(us8.i(j, "times >= 0 required but it was "));
    }

    public final c97 p(of3 of3) {
        c97 c97 = new c97(of3, z3d.k, z3d.i);
        a(c97);
        return c97;
    }

    public abstract void q(bw9 bw9);

    public final ov9 r(qmc qmc) {
        Objects.requireNonNull(qmc, "scheduler is null");
        return new ov9(this, qmc, 0);
    }

    public final qv9 s(long j) {
        if (j >= 0) {
            return new qv9(this, j);
        }
        throw new IllegalArgumentException(us8.i(j, "count >= 0 required but it was "));
    }

    public final sv9 t(long j, TimeUnit timeUnit) {
        qmc a = cnc.a();
        Objects.requireNonNull(timeUnit, "unit is null");
        Objects.requireNonNull(a, "scheduler is null");
        return new sv9(this, j, timeUnit, a);
    }

    public final rs9 v() {
        fja.D(16, "capacityHint");
        return new rs9(this);
    }

    public final phd w(Comparator comparator) {
        return v().h(new mb1(14, comparator));
    }
}

package defpackage;

import java.util.Objects;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: f1e  reason: default package */
public enum f1e implements d1e {
    ;

    public static void a(AtomicReference atomicReference) {
        d1e d1e;
        d1e d1e2 = (d1e) atomicReference.get();
        d1e d1e3 = a;
        if (d1e2 != d1e3 && (d1e = (d1e) atomicReference.getAndSet(d1e3)) != d1e3 && d1e != null) {
            d1e.cancel();
        }
    }

    public static void b(AtomicReference atomicReference, AtomicLong atomicLong, long j) {
        d1e d1e = (d1e) atomicReference.get();
        if (d1e != null) {
            d1e.i(j);
        } else if (d(j)) {
            z3d.b(atomicLong, j);
            d1e d1e2 = (d1e) atomicReference.get();
            if (d1e2 != null) {
                long andSet = atomicLong.getAndSet(0);
                if (andSet != 0) {
                    d1e2.i(andSet);
                }
            }
        }
    }

    public static boolean c(AtomicReference atomicReference, d1e d1e) {
        Objects.requireNonNull(d1e, "s is null");
        while (!atomicReference.compareAndSet((Object) null, d1e)) {
            if (atomicReference.get() != null) {
                d1e.cancel();
                if (atomicReference.get() == a) {
                    return false;
                }
                xs7.F(new IllegalStateException("Subscription already set!"));
                return false;
            }
        }
        return true;
    }

    public static boolean d(long j) {
        if (j > 0) {
            return true;
        }
        xs7.F(new IllegalArgumentException(us8.i(j, "n > 0 required but it was ")));
        return false;
    }

    public static boolean e(d1e d1e, d1e d1e2) {
        if (d1e2 == null) {
            xs7.F(new NullPointerException("next is null"));
            return false;
        } else if (d1e == null) {
            return true;
        } else {
            d1e2.cancel();
            xs7.F(new IllegalStateException("Subscription already set!"));
            return false;
        }
    }

    public final void cancel() {
    }

    public final void i(long j) {
    }
}

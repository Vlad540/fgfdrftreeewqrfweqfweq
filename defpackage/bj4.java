package defpackage;

import java.util.Objects;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: bj4  reason: default package */
public enum bj4 implements xi4 {
    ;

    public static boolean a(AtomicReference atomicReference) {
        xi4 xi4;
        xi4 xi42 = (xi4) atomicReference.get();
        bj4 bj4 = a;
        if (xi42 == bj4 || (xi4 = (xi4) atomicReference.getAndSet(bj4)) == bj4) {
            return false;
        }
        if (xi4 == null) {
            return true;
        }
        xi4.f();
        return true;
    }

    public static boolean b(xi4 xi4) {
        return xi4 == a;
    }

    public static boolean c(AtomicReference atomicReference, xi4 xi4) {
        while (true) {
            xi4 xi42 = (xi4) atomicReference.get();
            if (xi42 != a) {
                while (true) {
                    if (atomicReference.compareAndSet(xi42, xi4)) {
                        return true;
                    }
                    if (atomicReference.get() != xi42) {
                    }
                }
            } else if (xi4 == null) {
                return false;
            } else {
                xi4.f();
                return false;
            }
        }
    }

    public static void d(AtomicReference atomicReference, xi4 xi4) {
        while (true) {
            xi4 xi42 = (xi4) atomicReference.get();
            if (xi42 == a) {
                xi4.f();
                return;
            }
            while (true) {
                if (atomicReference.compareAndSet(xi42, xi4)) {
                    if (xi42 != null) {
                        xi42.f();
                        return;
                    }
                    return;
                } else if (atomicReference.get() != xi42) {
                }
            }
        }
    }

    public static boolean e(AtomicReference atomicReference, xi4 xi4) {
        Objects.requireNonNull(xi4, "d is null");
        while (!atomicReference.compareAndSet((Object) null, xi4)) {
            if (atomicReference.get() != null) {
                xi4.f();
                if (atomicReference.get() == a) {
                    return false;
                }
                xs7.F(new IllegalStateException("Disposable already set!"));
                return false;
            }
        }
        return true;
    }

    public static boolean g(xi4 xi4, xi4 xi42) {
        if (xi42 == null) {
            xs7.F(new NullPointerException("next is null"));
            return false;
        } else if (xi4 == null) {
            return true;
        } else {
            xi42.f();
            xs7.F(new IllegalStateException("Disposable already set!"));
            return false;
        }
    }

    public final void f() {
    }

    public final boolean h() {
        return true;
    }
}

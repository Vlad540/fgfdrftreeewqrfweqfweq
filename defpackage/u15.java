package defpackage;

import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: u15  reason: default package */
public final class u15 extends AtomicBoolean implements Runnable, xi4 {
    public final Runnable a;

    public u15(Runnable runnable) {
        this.a = runnable;
    }

    public final void f() {
        lazySet(true);
    }

    public final boolean h() {
        return get();
    }

    public final void run() {
        if (!get()) {
            try {
                this.a.run();
                lazySet(true);
            } catch (Throwable th) {
                lazySet(true);
                throw th;
            }
        }
    }
}

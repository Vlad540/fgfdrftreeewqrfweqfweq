package defpackage;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

/* renamed from: fie  reason: default package */
public final class fie extends t37 {
    public static final /* synthetic */ AtomicIntegerFieldUpdater o = AtomicIntegerFieldUpdater.newUpdater(fie.class, "_state$volatile");
    private volatile /* synthetic */ int _state$volatile;
    public final Thread b = Thread.currentThread();
    public aj4 c;

    public static void f(int i) {
        throw new IllegalStateException(("Illegal state " + i).toString());
    }

    public final boolean c() {
        return true;
    }

    public final void d(Throwable th) {
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater;
        int i;
        do {
            atomicIntegerFieldUpdater = o;
            i = atomicIntegerFieldUpdater.get(this);
            if (i != 0) {
                if (i != 1 && i != 2 && i != 3) {
                    f(i);
                    throw null;
                }
                return;
            }
        } while (!atomicIntegerFieldUpdater.compareAndSet(this, i, 2));
        this.b.interrupt();
        atomicIntegerFieldUpdater.set(this, 3);
    }

    public final void e() {
        while (true) {
            AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = o;
            int i = atomicIntegerFieldUpdater.get(this);
            if (i != 0) {
                if (i != 2) {
                    if (i == 3) {
                        Thread.interrupted();
                        return;
                    } else {
                        f(i);
                        throw null;
                    }
                }
            } else if (atomicIntegerFieldUpdater.compareAndSet(this, i, 1)) {
                aj4 aj4 = this.c;
                if (aj4 != null) {
                    aj4.dispose();
                    return;
                }
                return;
            }
        }
    }
}

package defpackage;

import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: clc  reason: default package */
public final class clc extends AtomicInteger implements zjb {
    public final Object a;
    public final b1e b;

    public clc(b1e b1e, Object obj) {
        this.b = b1e;
        this.a = obj;
    }

    public final void cancel() {
        lazySet(2);
    }

    public final void clear() {
        lazySet(1);
    }

    public final void i(long j) {
        if (f1e.d(j) && compareAndSet(0, 1)) {
            Object obj = this.a;
            b1e b1e = this.b;
            b1e.c(obj);
            if (get() != 2) {
                b1e.b();
            }
        }
    }

    public final boolean isEmpty() {
        return get() != 0;
    }

    public final boolean offer(Object obj) {
        throw new UnsupportedOperationException("Should not be called!");
    }

    public final Object poll() {
        if (get() != 0) {
            return null;
        }
        lazySet(1);
        return this.a;
    }

    public final int q(int i) {
        return 1;
    }
}

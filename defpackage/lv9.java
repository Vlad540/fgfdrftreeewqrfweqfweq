package defpackage;

import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: lv9  reason: default package */
public final class lv9 extends AtomicInteger implements xjb, Runnable {
    public final bw9 a;
    public final Object b;

    public lv9(bw9 bw9, Object obj) {
        this.a = bw9;
        this.b = obj;
    }

    public final void clear() {
        lazySet(3);
    }

    public final void f() {
        set(3);
    }

    public final boolean h() {
        return get() == 3;
    }

    public final boolean isEmpty() {
        return get() != 1;
    }

    public final boolean offer(Object obj) {
        throw new UnsupportedOperationException("Should not be called!");
    }

    public final Object poll() {
        if (get() != 1) {
            return null;
        }
        lazySet(3);
        return this.b;
    }

    public final int q(int i) {
        lazySet(1);
        return 1;
    }

    public final void run() {
        if (get() == 0 && compareAndSet(0, 2)) {
            Object obj = this.b;
            bw9 bw9 = this.a;
            bw9.c(obj);
            if (get() == 2) {
                lazySet(3);
                bw9.b();
            }
        }
    }
}

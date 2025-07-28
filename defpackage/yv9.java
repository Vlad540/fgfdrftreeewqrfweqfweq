package defpackage;

import java.util.concurrent.atomic.AtomicReference;

/* renamed from: yv9  reason: default package */
public final class yv9 extends AtomicReference implements xi4, Runnable {
    public final bw9 a;

    public yv9(bw9 bw9) {
        this.a = bw9;
    }

    public final void f() {
        bj4.a(this);
    }

    public final boolean h() {
        return get() == bj4.a;
    }

    public final void run() {
        if (!h()) {
            bw9 bw9 = this.a;
            bw9.c(0L);
            lazySet(cw4.a);
            bw9.b();
        }
    }
}

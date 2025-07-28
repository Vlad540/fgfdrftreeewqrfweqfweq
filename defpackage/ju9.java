package defpackage;

import java.util.concurrent.atomic.AtomicReference;

/* renamed from: ju9  reason: default package */
public final class ju9 extends AtomicReference implements xi4, Runnable {
    public final bw9 a;
    public long b;

    public ju9(bw9 bw9) {
        this.a = bw9;
    }

    public final void f() {
        bj4.a(this);
    }

    public final boolean h() {
        return get() == bj4.a;
    }

    public final void run() {
        if (get() != bj4.a) {
            long j = this.b;
            this.b = 1 + j;
            this.a.c(Long.valueOf(j));
        }
    }
}

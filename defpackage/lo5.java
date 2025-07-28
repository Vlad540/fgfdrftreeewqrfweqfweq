package defpackage;

import java.util.concurrent.atomic.AtomicReference;

/* renamed from: lo5  reason: default package */
public final class lo5 extends AtomicReference implements d1e, Runnable {
    public final b1e a;
    public volatile boolean b;

    public lo5(b1e b1e) {
        this.a = b1e;
    }

    public final void cancel() {
        bj4.a(this);
    }

    public final void i(long j) {
        if (f1e.d(j)) {
            this.b = true;
        }
    }

    public final void run() {
        if (get() != bj4.a) {
            boolean z = this.b;
            cw4 cw4 = cw4.a;
            if (z) {
                this.a.c(0L);
                lazySet(cw4);
                this.a.b();
                return;
            }
            lazySet(cw4);
            this.a.onError(new RuntimeException("Could not emit value due to lack of requests"));
        }
    }
}

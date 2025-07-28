package defpackage;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: e27  reason: default package */
public final class e27 extends omc implements Runnable {
    public final n83 a;
    public final d27 b;
    public final f27 c;
    public final AtomicBoolean o = new AtomicBoolean();

    /* JADX WARNING: type inference failed for: r0v1, types: [n83, java.lang.Object] */
    public e27(d27 d27) {
        f27 f27;
        f27 f272;
        this.b = d27;
        this.a = new Object();
        if (d27.c.b) {
            f27 = g27.h;
        } else {
            while (true) {
                if (d27.b.isEmpty()) {
                    f272 = new f27(d27.Y);
                    d27.c.a(f272);
                    break;
                }
                f272 = (f27) d27.b.poll();
                if (f272 != null) {
                    break;
                }
            }
            f27 = f272;
        }
        this.c = f27;
    }

    public final xi4 c(Runnable runnable, long j, TimeUnit timeUnit) {
        if (this.a.b) {
            return cw4.a;
        }
        return this.c.e(runnable, j, timeUnit, this.a);
    }

    public final void f() {
        if (this.o.compareAndSet(false, true)) {
            this.a.f();
            if (g27.i) {
                this.c.e(this, 0, TimeUnit.NANOSECONDS, (yi4) null);
                return;
            }
            d27 d27 = this.b;
            d27.getClass();
            f27 f27 = this.c;
            f27.c = System.nanoTime() + d27.a;
            d27.b.offer(f27);
        }
    }

    public final boolean h() {
        return this.o.get();
    }

    public final void run() {
        d27 d27 = this.b;
        d27.getClass();
        f27 f27 = this.c;
        f27.c = System.nanoTime() + d27.a;
        d27.b.offer(f27);
    }
}

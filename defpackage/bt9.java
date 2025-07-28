package defpackage;

import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: bt9  reason: default package */
public final class bt9 extends AtomicReference implements Runnable, xi4 {
    public final Object a;
    public final long b;
    public final ct9 c;
    public final AtomicBoolean o = new AtomicBoolean();

    public bt9(Object obj, long j, ct9 ct9) {
        this.a = obj;
        this.b = j;
        this.c = ct9;
    }

    public final void f() {
        bj4.a(this);
    }

    public final boolean h() {
        return get() == bj4.a;
    }

    public final void run() {
        if (this.o.compareAndSet(false, true)) {
            ct9 ct9 = this.c;
            long j = this.b;
            Object obj = this.a;
            if (j == ct9.Z) {
                ct9.a.c(obj);
                bj4.a(this);
            }
        }
    }
}

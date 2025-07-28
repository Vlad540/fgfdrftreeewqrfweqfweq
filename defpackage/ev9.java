package defpackage;

import io.reactivex.rxjava3.exceptions.CompositeException;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: ev9  reason: default package */
public final class ev9 extends AtomicInteger implements bw9 {
    public long X;
    public final bw9 a;
    public final bw1 b;
    public final nv9 c;
    public final v1b o;

    public ev9(bw9 bw9, long j, v1b v1b, bw1 bw1, nv9 nv9) {
        this.a = bw9;
        this.b = bw1;
        this.c = nv9;
        this.o = v1b;
        this.X = j;
    }

    public final void a() {
        if (getAndIncrement() == 0) {
            int i = 1;
            while (!this.b.h()) {
                this.c.a(this);
                i = addAndGet(-i);
                if (i == 0) {
                    return;
                }
            }
        }
    }

    public final void b() {
        this.a.b();
    }

    public final void c(Object obj) {
        this.a.c(obj);
    }

    public final void d(xi4 xi4) {
        bw1 bw1 = this.b;
        bw1.getClass();
        bj4.c(bw1, xi4);
    }

    public final void onError(Throwable th) {
        long j = this.X;
        if (j != Long.MAX_VALUE) {
            this.X = j - 1;
        }
        int i = (j > 0 ? 1 : (j == 0 ? 0 : -1));
        bw9 bw9 = this.a;
        if (i == 0) {
            bw9.onError(th);
            return;
        }
        try {
            if (!this.o.test(th)) {
                bw9.onError(th);
            } else {
                a();
            }
        } catch (Throwable th2) {
            ek8.a0(th2);
            bw9.onError(new CompositeException(th, th2));
        }
    }
}

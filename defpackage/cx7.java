package defpackage;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: cx7  reason: default package */
public final class cx7 extends AtomicInteger implements wx7, d1e {
    public final ay7[] X;
    public int Y;
    public long Z;
    public final b1e a;
    public final AtomicLong b = new AtomicLong();
    public final AtomicReference c = new AtomicReference(ap9.a);
    public final bw1 o = new bw1(2);

    public cx7(b1e b1e, ay7[] ay7Arr) {
        this.a = b1e;
        this.X = ay7Arr;
    }

    public final void a(Object obj) {
        this.c.lazySet(obj);
        c();
    }

    public final void b() {
        this.c.lazySet(ap9.a);
        c();
    }

    public final void c() {
        if (getAndIncrement() == 0) {
            AtomicReference atomicReference = this.c;
            do {
                bw1 bw1 = this.o;
                if (bw1.h()) {
                    atomicReference.lazySet((Object) null);
                    return;
                }
                Object obj = atomicReference.get();
                if (obj != null) {
                    ap9 ap9 = ap9.a;
                    b1e b1e = this.a;
                    if (obj != ap9) {
                        long j = this.Z;
                        if (j != this.b.get()) {
                            this.Z = j + 1;
                            atomicReference.lazySet((Object) null);
                            b1e.c(obj);
                        }
                    } else {
                        atomicReference.lazySet((Object) null);
                    }
                    if (!bw1.h()) {
                        int i = this.Y;
                        ay7[] ay7Arr = this.X;
                        if (i == ay7Arr.length) {
                            b1e.b();
                            return;
                        } else {
                            this.Y = i + 1;
                            ay7Arr[i].a(this);
                        }
                    }
                }
            } while (decrementAndGet() != 0);
        }
    }

    public final void cancel() {
        bw1 bw1 = this.o;
        bw1.getClass();
        bj4.a(bw1);
    }

    public final void d(xi4 xi4) {
        bw1 bw1 = this.o;
        bw1.getClass();
        bj4.c(bw1, xi4);
    }

    public final void i(long j) {
        if (f1e.d(j)) {
            z3d.b(this.b, j);
            c();
        }
    }

    public final void onError(Throwable th) {
        this.a.onError(th);
    }
}

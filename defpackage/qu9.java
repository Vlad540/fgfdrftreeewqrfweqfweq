package defpackage;

import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: qu9  reason: default package */
public final class qu9 extends AtomicReference implements bw9, xi4 {
    public static final pu9[] X = new pu9[0];
    public static final pu9[] Y = new pu9[0];
    public final AtomicBoolean a = new AtomicBoolean();
    public final AtomicReference b;
    public final AtomicReference c;
    public Throwable o;

    public qu9(AtomicReference atomicReference) {
        this.b = atomicReference;
        this.c = new AtomicReference();
        lazySet(X);
    }

    public final void a(pu9 pu9) {
        pu9[] pu9Arr;
        pu9[] pu9Arr2;
        do {
            pu9Arr = (pu9[]) get();
            int length = pu9Arr.length;
            if (length != 0) {
                int i = 0;
                while (true) {
                    if (i >= length) {
                        i = -1;
                        break;
                    } else if (pu9Arr[i] == pu9) {
                        break;
                    } else {
                        i++;
                    }
                }
                if (i >= 0) {
                    pu9Arr2 = X;
                    if (length != 1) {
                        pu9Arr2 = new pu9[(length - 1)];
                        System.arraycopy(pu9Arr, 0, pu9Arr2, 0, i);
                        System.arraycopy(pu9Arr, i + 1, pu9Arr2, i, (length - i) - 1);
                    }
                } else {
                    return;
                }
            } else {
                return;
            }
        } while (!compareAndSet(pu9Arr, pu9Arr2));
    }

    public final void b() {
        this.c.lazySet(bj4.a);
        for (pu9 pu9 : (pu9[]) getAndSet(Y)) {
            pu9.a.b();
        }
    }

    public final void c(Object obj) {
        for (pu9 pu9 : (pu9[]) get()) {
            pu9.a.c(obj);
        }
    }

    public final void d(xi4 xi4) {
        bj4.e(this.c, xi4);
    }

    public final void f() {
        AtomicReference atomicReference;
        getAndSet(Y);
        do {
            atomicReference = this.b;
            if (atomicReference.compareAndSet(this, (Object) null) || atomicReference.get() != this) {
                bj4.a(this.c);
            }
            atomicReference = this.b;
            break;
        } while (atomicReference.get() != this);
        bj4.a(this.c);
    }

    public final boolean h() {
        return get() == Y;
    }

    public final void onError(Throwable th) {
        AtomicReference atomicReference = this.c;
        Object obj = atomicReference.get();
        bj4 bj4 = bj4.a;
        if (obj != bj4) {
            this.o = th;
            atomicReference.lazySet(bj4);
            for (pu9 pu9 : (pu9[]) getAndSet(Y)) {
                pu9.a.onError(th);
            }
            return;
        }
        xs7.F(th);
    }
}

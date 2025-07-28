package defpackage;

/* renamed from: dd4  reason: default package */
public abstract class dd4 extends rj0 {
    public final b1e a;
    public Object b;

    public dd4(b1e b1e) {
        this.a = b1e;
    }

    public void a(Object obj) {
        f(obj);
    }

    public final void clear() {
        lazySet(32);
        this.b = null;
    }

    public final void f(Object obj) {
        int i = get();
        do {
            b1e b1e = this.a;
            if (i == 8) {
                this.b = obj;
                lazySet(16);
                b1e.c((Object) null);
                if (get() != 4) {
                    b1e.b();
                    return;
                }
                return;
            } else if ((i & -3) == 0) {
                if (i == 2) {
                    lazySet(3);
                    b1e.c(obj);
                    if (get() != 4) {
                        b1e.b();
                        return;
                    }
                    return;
                }
                this.b = obj;
                if (!compareAndSet(0, 1)) {
                    i = get();
                } else {
                    return;
                }
            } else {
                return;
            }
        } while (i != 4);
        this.b = null;
    }

    public final void i(long j) {
        Object obj;
        if (f1e.d(j)) {
            do {
                int i = get();
                if ((i & -2) == 0) {
                    if (i == 1) {
                        if (compareAndSet(1, 3) && (obj = this.b) != null) {
                            this.b = null;
                            b1e b1e = this.a;
                            b1e.c(obj);
                            if (get() != 4) {
                                b1e.b();
                                return;
                            }
                            return;
                        }
                        return;
                    }
                } else {
                    return;
                }
            } while (!compareAndSet(0, 2));
        }
    }

    public final boolean isEmpty() {
        return get() != 16;
    }

    public final Object poll() {
        if (get() != 16) {
            return null;
        }
        lazySet(32);
        Object obj = this.b;
        this.b = null;
        return obj;
    }

    public final int q(int i) {
        lazySet(8);
        return 2;
    }
}

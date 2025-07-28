package defpackage;

import java.util.Objects;

/* renamed from: sn5  reason: default package */
public final class sn5 extends uj0 {
    public final Object[] a;
    public int b;
    public volatile boolean c;
    public final b1e o;

    public sn5(b1e b1e, Object[] objArr) {
        this.a = objArr;
        this.o = b1e;
    }

    public final void cancel() {
        this.c = true;
    }

    public final void clear() {
        this.b = this.a.length;
    }

    public final void i(long j) {
        if (f1e.d(j) && z3d.b(this, j) == 0) {
            if (j == Long.MAX_VALUE) {
                Object[] objArr = this.a;
                int length = objArr.length;
                b1e b1e = this.o;
                int i = this.b;
                while (i != length) {
                    if (!this.c) {
                        Object obj = objArr[i];
                        if (obj == null) {
                            b1e.onError(new NullPointerException(rf0.f(i, "The element at index ", " is null")));
                            return;
                        } else {
                            b1e.c(obj);
                            i++;
                        }
                    } else {
                        return;
                    }
                }
                if (!this.c) {
                    b1e.b();
                    return;
                }
                return;
            }
            Object[] objArr2 = this.a;
            int length2 = objArr2.length;
            int i2 = this.b;
            b1e b1e2 = this.o;
            do {
                long j2 = 0;
                while (true) {
                    if (j2 == j || i2 == length2) {
                        if (i2 != length2) {
                            j = get();
                            if (j2 == j) {
                                this.b = i2;
                                j = addAndGet(-j2);
                            }
                        } else if (!this.c) {
                            b1e2.b();
                            return;
                        } else {
                            return;
                        }
                    } else if (!this.c) {
                        Object obj2 = objArr2[i2];
                        if (obj2 == null) {
                            b1e2.onError(new NullPointerException(rf0.f(i2, "The element at index ", " is null")));
                            return;
                        }
                        b1e2.c(obj2);
                        j2++;
                        i2++;
                    } else {
                        return;
                    }
                }
            } while (j != 0);
        }
    }

    public final boolean isEmpty() {
        return this.b == this.a.length;
    }

    public final Object poll() {
        int i = this.b;
        Object[] objArr = this.a;
        if (i == objArr.length) {
            return null;
        }
        this.b = i + 1;
        Object obj = objArr[i];
        Objects.requireNonNull(obj, "array element is null");
        return obj;
    }

    public final int q(int i) {
        return 1;
    }
}

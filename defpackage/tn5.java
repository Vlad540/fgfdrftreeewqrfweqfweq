package defpackage;

import java.util.Iterator;
import java.util.Objects;

/* renamed from: tn5  reason: default package */
public final class tn5 extends uj0 {
    public Iterator a;
    public volatile boolean b;
    public boolean c;
    public final b1e o;

    public tn5(b1e b1e, Iterator it) {
        this.a = it;
        this.o = b1e;
    }

    public final void a() {
        Iterator it = this.a;
        b1e b1e = this.o;
        while (!this.b) {
            try {
                Object next = it.next();
                if (!this.b) {
                    if (next == null) {
                        b1e.onError(new NullPointerException("Iterator.next() returned a null value"));
                        return;
                    }
                    b1e.c(next);
                    if (!this.b) {
                        try {
                            if (!it.hasNext()) {
                                if (!this.b) {
                                    b1e.b();
                                    return;
                                }
                                return;
                            }
                        } catch (Throwable th) {
                            ek8.a0(th);
                            b1e.onError(th);
                            return;
                        }
                    } else {
                        return;
                    }
                } else {
                    return;
                }
            } catch (Throwable th2) {
                ek8.a0(th2);
                b1e.onError(th2);
                return;
            }
        }
    }

    public final void b(long j) {
        Iterator it = this.a;
        b1e b1e = this.o;
        do {
            long j2 = 0;
            while (true) {
                if (j2 == j) {
                    j = get();
                    if (j2 == j) {
                        j = addAndGet(-j2);
                    }
                } else if (!this.b) {
                    try {
                        Object next = it.next();
                        if (!this.b) {
                            if (next == null) {
                                b1e.onError(new NullPointerException("Iterator.next() returned a null value"));
                                return;
                            }
                            b1e.c(next);
                            if (!this.b) {
                                try {
                                    if (it.hasNext()) {
                                        j2++;
                                    } else if (!this.b) {
                                        b1e.b();
                                        return;
                                    } else {
                                        return;
                                    }
                                } catch (Throwable th) {
                                    ek8.a0(th);
                                    b1e.onError(th);
                                    return;
                                }
                            } else {
                                return;
                            }
                        } else {
                            return;
                        }
                    } catch (Throwable th2) {
                        ek8.a0(th2);
                        b1e.onError(th2);
                        return;
                    }
                } else {
                    return;
                }
            }
        } while (j != 0);
    }

    public final void cancel() {
        this.b = true;
    }

    public final void clear() {
        this.a = null;
    }

    public final void i(long j) {
        if (f1e.d(j) && z3d.b(this, j) == 0) {
            if (j == Long.MAX_VALUE) {
                a();
            } else {
                b(j);
            }
        }
    }

    public final boolean isEmpty() {
        Iterator it = this.a;
        if (it == null) {
            return true;
        }
        if (!this.c || it.hasNext()) {
            return false;
        }
        this.a = null;
        return true;
    }

    public final Object poll() {
        Iterator it = this.a;
        if (it == null) {
            return null;
        }
        if (!this.c) {
            this.c = true;
        } else if (!it.hasNext()) {
            return null;
        }
        Object next = this.a.next();
        Objects.requireNonNull(next, "Iterator.next() returned a null value");
        return next;
    }

    public final int q(int i) {
        return 1;
    }
}

package defpackage;

import java.util.Collection;
import java.util.Objects;

/* renamed from: in5  reason: default package */
public final class in5 implements ko5, zjb {
    public int X;
    public final Collection Y;
    public final j26 Z;
    public final b1e a;
    public d1e b;
    public zjb c;
    public boolean o;

    public in5(b1e b1e, j26 j26, Collection collection) {
        this.a = b1e;
        this.Z = j26;
        this.Y = collection;
    }

    public final void b() {
        if (!this.o) {
            this.o = true;
            this.Y.clear();
            this.a.b();
        }
    }

    public final void c(Object obj) {
        if (!this.o) {
            int i = this.X;
            b1e b1e = this.a;
            if (i == 0) {
                try {
                    Object apply = this.Z.apply(obj);
                    Objects.requireNonNull(apply, "The keySelector returned a null key");
                    if (this.Y.add(apply)) {
                        b1e.c(obj);
                    } else {
                        this.b.i(1);
                    }
                } catch (Throwable th) {
                    ek8.a0(th);
                    this.b.cancel();
                    onError(th);
                }
            } else {
                b1e.c((Object) null);
            }
        }
    }

    public final void cancel() {
        this.b.cancel();
    }

    public final void clear() {
        this.Y.clear();
        this.c.clear();
    }

    public final void e(d1e d1e) {
        if (f1e.e(this.b, d1e)) {
            this.b = d1e;
            if (d1e instanceof zjb) {
                this.c = (zjb) d1e;
            }
            this.a.e(this);
        }
    }

    public final void i(long j) {
        this.b.i(j);
    }

    public final boolean isEmpty() {
        return this.c.isEmpty();
    }

    public final boolean offer(Object obj) {
        throw new UnsupportedOperationException("Should not be called!");
    }

    public final void onError(Throwable th) {
        if (this.o) {
            xs7.F(th);
            return;
        }
        this.o = true;
        this.Y.clear();
        this.a.onError(th);
    }

    public final Object poll() {
        Object poll;
        while (true) {
            poll = this.c.poll();
            if (poll == null) {
                break;
            }
            Object apply = this.Z.apply(poll);
            Objects.requireNonNull(apply, "The keySelector returned a null key");
            if (this.Y.add(apply)) {
                break;
            } else if (this.X == 2) {
                this.b.i(1);
            }
        }
        return poll;
    }

    public final int q(int i) {
        zjb zjb = this.c;
        if (zjb == null || (i & 4) != 0) {
            return 0;
        }
        int q = zjb.q(i);
        if (q == 0) {
            return q;
        }
        this.X = q;
        return q;
    }
}

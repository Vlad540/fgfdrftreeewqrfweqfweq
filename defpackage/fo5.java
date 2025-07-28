package defpackage;

import java.util.NoSuchElementException;

/* renamed from: fo5  reason: default package */
public final class fo5 extends dd4 implements ko5 {
    public d1e X;
    public boolean Y;
    public final Object c;
    public final boolean o;

    public fo5(b1e b1e, Object obj, boolean z) {
        super(b1e);
        this.c = obj;
        this.o = z;
    }

    public final void b() {
        if (!this.Y) {
            this.Y = true;
            Object obj = this.b;
            this.b = null;
            if (obj == null) {
                obj = this.c;
            }
            if (obj == null) {
                boolean z = this.o;
                b1e b1e = this.a;
                if (z) {
                    b1e.onError(new NoSuchElementException());
                } else {
                    b1e.b();
                }
            } else {
                f(obj);
            }
        }
    }

    public final void c(Object obj) {
        if (!this.Y) {
            if (this.b != null) {
                this.Y = true;
                this.X.cancel();
                this.a.onError(new IllegalArgumentException("Sequence contains more than one element!"));
                return;
            }
            this.b = obj;
        }
    }

    public final void cancel() {
        set(4);
        this.b = null;
        this.X.cancel();
    }

    public final void e(d1e d1e) {
        if (f1e.e(this.X, d1e)) {
            this.X = d1e;
            this.a.e(this);
            d1e.i(Long.MAX_VALUE);
        }
    }

    public final void onError(Throwable th) {
        if (this.Y) {
            xs7.F(th);
            return;
        }
        this.Y = true;
        this.a.onError(th);
    }
}

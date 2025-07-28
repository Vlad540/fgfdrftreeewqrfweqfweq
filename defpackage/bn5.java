package defpackage;

/* renamed from: bn5  reason: default package */
public final class bn5 extends dd4 implements ko5 {
    public d1e X;
    public boolean Y;
    public final lk0 c;
    public final Object o;

    public bn5(b1e b1e, Object obj, lk0 lk0) {
        super(b1e);
        this.c = lk0;
        this.o = obj;
    }

    public final void b() {
        if (!this.Y) {
            this.Y = true;
            f(this.o);
        }
    }

    public final void c(Object obj) {
        if (!this.Y) {
            try {
                this.c.accept(this.o, obj);
            } catch (Throwable th) {
                ek8.a0(th);
                this.X.cancel();
                onError(th);
            }
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

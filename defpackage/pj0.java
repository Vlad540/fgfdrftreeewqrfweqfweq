package defpackage;

/* renamed from: pj0  reason: default package */
public abstract class pj0 implements bw9, xjb {
    public int X;
    public final bw9 a;
    public xi4 b;
    public xjb c;
    public boolean o;

    public pj0(bw9 bw9) {
        this.a = bw9;
    }

    public final int a(int i) {
        xjb xjb = this.c;
        if (xjb == null || (i & 4) != 0) {
            return 0;
        }
        int q = xjb.q(i);
        if (q != 0) {
            this.X = q;
        }
        return q;
    }

    public void b() {
        if (!this.o) {
            this.o = true;
            this.a.b();
        }
    }

    public void clear() {
        this.c.clear();
    }

    public final void d(xi4 xi4) {
        if (bj4.g(this.b, xi4)) {
            this.b = xi4;
            if (xi4 instanceof xjb) {
                this.c = (xjb) xi4;
            }
            this.a.d(this);
        }
    }

    public final void f() {
        this.b.f();
    }

    public final boolean h() {
        return this.b.h();
    }

    public final boolean isEmpty() {
        return this.c.isEmpty();
    }

    public final boolean offer(Object obj) {
        throw new UnsupportedOperationException("Should not be called!");
    }

    public void onError(Throwable th) {
        if (this.o) {
            xs7.F(th);
            return;
        }
        this.o = true;
        this.a.onError(th);
    }

    public int q(int i) {
        return a(i);
    }
}

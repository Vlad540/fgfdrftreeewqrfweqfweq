package defpackage;

/* renamed from: eu9  reason: default package */
public final class eu9 implements g73, zjb, xjb {
    public final bw9 a;
    public xi4 b;

    public eu9(bw9 bw9) {
        this.a = bw9;
    }

    public final void b() {
        this.b = bj4.a;
        this.a.b();
    }

    public final void cancel() {
    }

    public final void clear() {
    }

    public final void d(xi4 xi4) {
        if (bj4.g(this.b, xi4)) {
            this.b = xi4;
            this.a.d(this);
        }
    }

    public final void f() {
        this.b.f();
        this.b = bj4.a;
    }

    public final boolean h() {
        return this.b.h();
    }

    public final void i(long j) {
    }

    public final boolean isEmpty() {
        return true;
    }

    public final boolean offer(Object obj) {
        throw new UnsupportedOperationException("Should not be called!");
    }

    public final void onError(Throwable th) {
        this.b = bj4.a;
        this.a.onError(th);
    }

    public final Object poll() {
        return null;
    }

    public final int q(int i) {
        return 2;
    }
}

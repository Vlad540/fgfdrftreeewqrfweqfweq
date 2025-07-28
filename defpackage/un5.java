package defpackage;

/* renamed from: un5  reason: default package */
public final class un5 implements bw9, d1e {
    public final b1e a;
    public xi4 b;

    public un5(b1e b1e) {
        this.a = b1e;
    }

    public final void b() {
        this.a.b();
    }

    public final void c(Object obj) {
        this.a.c(obj);
    }

    public final void cancel() {
        this.b.f();
    }

    public final void d(xi4 xi4) {
        this.b = xi4;
        this.a.e(this);
    }

    public final void i(long j) {
    }

    public final void onError(Throwable th) {
        this.a.onError(th);
    }
}

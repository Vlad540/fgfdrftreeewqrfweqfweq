package defpackage;

/* renamed from: gu9  reason: default package */
public final class gu9 implements ko5, xi4 {
    public final bw9 a;
    public d1e b;

    public gu9(bw9 bw9) {
        this.a = bw9;
    }

    public final void b() {
        this.a.b();
    }

    public final void c(Object obj) {
        this.a.c(obj);
    }

    public final void e(d1e d1e) {
        if (f1e.e(this.b, d1e)) {
            this.b = d1e;
            this.a.d(this);
            d1e.i(Long.MAX_VALUE);
        }
    }

    public final void f() {
        this.b.cancel();
        this.b = f1e.a;
    }

    public final boolean h() {
        return this.b == f1e.a;
    }

    public final void onError(Throwable th) {
        this.a.onError(th);
    }
}

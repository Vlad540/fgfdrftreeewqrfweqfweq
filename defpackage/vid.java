package defpackage;

/* renamed from: vid  reason: default package */
public final class vid extends dd4 implements zhd {
    public xi4 c;

    public final void cancel() {
        set(4);
        this.b = null;
        this.c.f();
    }

    public final void d(xi4 xi4) {
        if (bj4.g(this.c, xi4)) {
            this.c = xi4;
            this.a.e(this);
        }
    }

    public final void onError(Throwable th) {
        this.a.onError(th);
    }
}

package defpackage;

/* renamed from: dy7  reason: default package */
public final class dy7 extends cd4 implements wx7, zhd {
    public final /* synthetic */ int c;
    public xi4 o;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public /* synthetic */ dy7(bw9 bw9, int i) {
        super(bw9);
        this.c = i;
    }

    public void b() {
        if ((get() & 54) == 0) {
            lazySet(2);
            this.a.b();
        }
    }

    public final void d(xi4 xi4) {
        switch (this.c) {
            case 0:
                if (bj4.g(this.o, xi4)) {
                    this.o = xi4;
                    this.a.d(this);
                    return;
                }
                return;
            default:
                if (bj4.g(this.o, xi4)) {
                    this.o = xi4;
                    this.a.d(this);
                    return;
                }
                return;
        }
    }

    public final void f() {
        switch (this.c) {
            case 0:
                super.f();
                this.o.f();
                return;
            default:
                super.f();
                this.o.f();
                return;
        }
    }

    public final void onError(Throwable th) {
        switch (this.c) {
            case 0:
                if ((get() & 54) != 0) {
                    xs7.F(th);
                    return;
                }
                lazySet(2);
                this.a.onError(th);
                return;
            default:
                if ((get() & 54) != 0) {
                    xs7.F(th);
                    return;
                }
                lazySet(2);
                this.a.onError(th);
                return;
        }
    }
}

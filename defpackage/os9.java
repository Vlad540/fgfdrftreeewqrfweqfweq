package defpackage;

/* renamed from: os9  reason: default package */
public final class os9 implements bw9, xi4 {
    public boolean X;
    public final /* synthetic */ int a;
    public final bw9 b;
    public final v1b c;
    public xi4 o;

    public /* synthetic */ os9(bw9 bw9, v1b v1b, int i) {
        this.a = i;
        this.b = bw9;
        this.c = v1b;
    }

    public final void b() {
        switch (this.a) {
            case 0:
                if (!this.X) {
                    this.X = true;
                    Boolean bool = Boolean.FALSE;
                    bw9 bw9 = this.b;
                    bw9.c(bool);
                    bw9.b();
                    return;
                }
                return;
            case 1:
                this.b.b();
                return;
            default:
                if (!this.X) {
                    this.X = true;
                    this.b.b();
                    return;
                }
                return;
        }
    }

    public final void c(Object obj) {
        switch (this.a) {
            case 0:
                if (!this.X) {
                    try {
                        if (this.c.test(obj)) {
                            this.X = true;
                            this.o.f();
                            Boolean bool = Boolean.TRUE;
                            bw9 bw9 = this.b;
                            bw9.c(bool);
                            bw9.b();
                            return;
                        }
                        return;
                    } catch (Throwable th) {
                        ek8.a0(th);
                        this.o.f();
                        onError(th);
                        return;
                    }
                } else {
                    return;
                }
            case 1:
                boolean z = this.X;
                bw9 bw92 = this.b;
                if (z) {
                    bw92.c(obj);
                    return;
                }
                try {
                    if (!this.c.test(obj)) {
                        this.X = true;
                        bw92.c(obj);
                        return;
                    }
                    return;
                } catch (Throwable th2) {
                    ek8.a0(th2);
                    this.o.f();
                    bw92.onError(th2);
                    return;
                }
            default:
                if (!this.X) {
                    bw9 bw93 = this.b;
                    bw93.c(obj);
                    try {
                        if (this.c.test(obj)) {
                            this.X = true;
                            this.o.f();
                            bw93.b();
                            return;
                        }
                        return;
                    } catch (Throwable th3) {
                        ek8.a0(th3);
                        this.o.f();
                        onError(th3);
                        return;
                    }
                } else {
                    return;
                }
        }
    }

    public final void d(xi4 xi4) {
        switch (this.a) {
            case 0:
                if (bj4.g(this.o, xi4)) {
                    this.o = xi4;
                    this.b.d(this);
                    return;
                }
                return;
            case 1:
                if (bj4.g(this.o, xi4)) {
                    this.o = xi4;
                    this.b.d(this);
                    return;
                }
                return;
            default:
                if (bj4.g(this.o, xi4)) {
                    this.o = xi4;
                    this.b.d(this);
                    return;
                }
                return;
        }
    }

    public final void f() {
        switch (this.a) {
            case 0:
                this.o.f();
                return;
            case 1:
                this.o.f();
                return;
            default:
                this.o.f();
                return;
        }
    }

    public final boolean h() {
        switch (this.a) {
            case 0:
                return this.o.h();
            case 1:
                return this.o.h();
            default:
                return this.o.h();
        }
    }

    public final void onError(Throwable th) {
        switch (this.a) {
            case 0:
                if (this.X) {
                    xs7.F(th);
                    return;
                }
                this.X = true;
                this.b.onError(th);
                return;
            case 1:
                this.b.onError(th);
                return;
            default:
                if (!this.X) {
                    this.X = true;
                    this.b.onError(th);
                    return;
                }
                xs7.F(th);
                return;
        }
    }
}

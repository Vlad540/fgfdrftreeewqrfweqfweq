package defpackage;

import java.util.Objects;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: kx7  reason: default package */
public final class kx7 extends AtomicReference implements bw9, wx7, xi4, zhd {
    public final /* synthetic */ int a;
    public final bw9 b;
    public final j26 c;

    public /* synthetic */ kx7(bw9 bw9, j26 j26, int i) {
        this.a = i;
        this.b = bw9;
        this.c = j26;
    }

    public final void a(Object obj) {
        switch (this.a) {
            case 0:
                try {
                    Object apply = this.c.apply(obj);
                    Objects.requireNonNull(apply, "The mapper returned a null Publisher");
                    nv9 nv9 = (nv9) apply;
                    if (!h()) {
                        nv9.a(this);
                        return;
                    }
                    return;
                } catch (Throwable th) {
                    ek8.a0(th);
                    this.b.onError(th);
                    return;
                }
            default:
                try {
                    Object apply2 = this.c.apply(obj);
                    Objects.requireNonNull(apply2, "The mapper returned a null Publisher");
                    nv9 nv92 = (nv9) apply2;
                    if (!h()) {
                        nv92.a(this);
                        return;
                    }
                    return;
                } catch (Throwable th2) {
                    ek8.a0(th2);
                    this.b.onError(th2);
                    return;
                }
        }
    }

    public final void b() {
        switch (this.a) {
            case 0:
                this.b.b();
                return;
            default:
                this.b.b();
                return;
        }
    }

    public final void c(Object obj) {
        switch (this.a) {
            case 0:
                this.b.c(obj);
                return;
            default:
                this.b.c(obj);
                return;
        }
    }

    public final void d(xi4 xi4) {
        switch (this.a) {
            case 0:
                bj4.c(this, xi4);
                return;
            default:
                bj4.c(this, xi4);
                return;
        }
    }

    public final void f() {
        switch (this.a) {
            case 0:
                bj4.a(this);
                return;
            default:
                bj4.a(this);
                return;
        }
    }

    public final boolean h() {
        switch (this.a) {
            case 0:
                return bj4.b((xi4) get());
            default:
                return bj4.b((xi4) get());
        }
    }

    public final void onError(Throwable th) {
        switch (this.a) {
            case 0:
                this.b.onError(th);
                return;
            default:
                this.b.onError(th);
                return;
        }
    }
}

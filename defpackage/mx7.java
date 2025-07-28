package defpackage;

import java.util.Objects;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: mx7  reason: default package */
public final class mx7 extends AtomicReference implements wx7, xi4, zhd {
    public final /* synthetic */ int a;
    public final wx7 b;
    public final j26 c;

    public /* synthetic */ mx7(wx7 wx7, j26 j26, int i) {
        this.a = i;
        this.b = wx7;
        this.c = j26;
    }

    public final void a(Object obj) {
        switch (this.a) {
            case 0:
                try {
                    Object apply = this.c.apply(obj);
                    Objects.requireNonNull(apply, "The mapper returned a null SingleSource");
                    dhd dhd = (dhd) apply;
                    if (!h()) {
                        dhd.k(new b2b(this, this.b, false, 23));
                        return;
                    }
                    return;
                } catch (Throwable th) {
                    ek8.a0(th);
                    onError(th);
                    return;
                }
            default:
                try {
                    Object apply2 = this.c.apply(obj);
                    Objects.requireNonNull(apply2, "The mapper returned a null MaybeSource");
                    ay7 ay7 = (ay7) apply2;
                    if (!h()) {
                        ay7.a(new f2b(this, this.b, false, 7));
                        return;
                    }
                    return;
                } catch (Throwable th2) {
                    ek8.a0(th2);
                    onError(th2);
                    return;
                }
        }
    }

    public void b() {
        this.b.b();
    }

    public final void d(xi4 xi4) {
        switch (this.a) {
            case 0:
                if (bj4.e(this, xi4)) {
                    this.b.d(this);
                    return;
                }
                return;
            default:
                if (bj4.e(this, xi4)) {
                    this.b.d(this);
                    return;
                }
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

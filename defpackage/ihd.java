package defpackage;

import java.util.concurrent.atomic.AtomicReference;

/* renamed from: ihd  reason: default package */
public final class ihd extends AtomicReference implements nhd, xi4, g73 {
    public final /* synthetic */ int a = 1;
    public final Object b;

    public ihd(zhd zhd) {
        this.b = zhd;
    }

    public void a(Object obj) {
        xi4 xi4;
        Object obj2 = get();
        bj4 bj4 = bj4.a;
        if (obj2 != bj4 && (xi4 = (xi4) getAndSet(bj4)) != bj4) {
            zhd zhd = (zhd) this.b;
            if (obj == null) {
                try {
                    zhd.onError(i15.b("onSuccess called with a null value."));
                } finally {
                    if (xi4 != null) {
                        xi4.f();
                    }
                }
            } else {
                zhd.a(obj);
            }
        }
    }

    public void b() {
        vt9 vt9 = (vt9) this.b;
        vt9.X.c(this);
        vt9.b();
    }

    public boolean c(Throwable th) {
        xi4 xi4;
        if (th == null) {
            th = i15.b("onError called with a null Throwable.");
        }
        Object obj = get();
        bj4 bj4 = bj4.a;
        if (obj == bj4 || (xi4 = (xi4) getAndSet(bj4)) == bj4) {
            return false;
        }
        try {
            ((zhd) this.b).onError(th);
        } finally {
            if (xi4 != null) {
                xi4.f();
            }
        }
    }

    public void d(xi4 xi4) {
        bj4.e(this, xi4);
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
                if (!c(th)) {
                    xs7.F(th);
                    return;
                }
                return;
            default:
                vt9 vt9 = (vt9) this.b;
                vt9.X.c(this);
                vt9.onError(th);
                return;
        }
    }

    public String toString() {
        switch (this.a) {
            case 0:
                String simpleName = ihd.class.getSimpleName();
                String atomicReference = super.toString();
                return simpleName + "{" + atomicReference + "}";
            default:
                return super.toString();
        }
    }

    public ihd(vt9 vt9) {
        this.b = vt9;
    }
}

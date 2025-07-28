package defpackage;

import java.util.Queue;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: x63  reason: default package */
public final class x63 extends AtomicReference implements b73, xi4, bw9, g73 {
    public static final Object c = new Object();
    public final /* synthetic */ int a;
    public final Object b;

    public /* synthetic */ x63(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    public boolean a(Throwable th) {
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
            ((g73) this.b).onError(th);
        } finally {
            if (xi4 != null) {
                xi4.f();
            }
        }
    }

    public final void b() {
        xi4 xi4;
        switch (this.a) {
            case 0:
                Object obj = get();
                bj4 bj4 = bj4.a;
                if (obj != bj4 && (xi4 = (xi4) getAndSet(bj4)) != bj4) {
                    try {
                        ((g73) this.b).b();
                        if (xi4 == null) {
                            return;
                        }
                        return;
                    } finally {
                        if (xi4 != null) {
                            xi4.f();
                        }
                    }
                } else {
                    return;
                }
            case 1:
                ((Queue) this.b).offer(ap9.a);
                return;
            default:
                xt9 xt9 = (xt9) this.b;
                xt9.X.c(this);
                xt9.b();
                return;
        }
    }

    public void c(Object obj) {
        ((Queue) this.b).offer(obj);
    }

    public void d(xi4 xi4) {
        switch (this.a) {
            case 1:
                bj4.e(this, xi4);
                return;
            default:
                bj4.e(this, xi4);
                return;
        }
    }

    public final void f() {
        switch (this.a) {
            case 0:
                bj4.a(this);
                return;
            case 1:
                if (bj4.a(this)) {
                    ((Queue) this.b).offer(c);
                    return;
                }
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
            case 1:
                return get() == bj4.a;
            default:
                return bj4.b((xi4) get());
        }
    }

    public void onError(Throwable th) {
        switch (this.a) {
            case 1:
                ((Queue) this.b).offer(new yo9(th));
                return;
            default:
                xt9 xt9 = (xt9) this.b;
                xt9.X.c(this);
                xt9.onError(th);
                return;
        }
    }

    public String toString() {
        switch (this.a) {
            case 0:
                String simpleName = x63.class.getSimpleName();
                String atomicReference = super.toString();
                return simpleName + "{" + atomicReference + "}";
            default:
                return super.toString();
        }
    }

    public x63(xt9 xt9) {
        this.a = 2;
        this.b = xt9;
    }
}

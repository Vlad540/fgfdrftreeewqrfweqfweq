package defpackage;

import java.util.Collection;

/* renamed from: no5  reason: default package */
public final class no5 extends dd4 implements ko5 {
    public d1e c;

    public final void b() {
        f(this.b);
    }

    public final void c(Object obj) {
        Collection collection = (Collection) this.b;
        if (collection != null) {
            collection.add(obj);
        }
    }

    public final void cancel() {
        set(4);
        this.b = null;
        this.c.cancel();
    }

    public final void e(d1e d1e) {
        if (f1e.e(this.c, d1e)) {
            this.c = d1e;
            this.a.e(this);
            d1e.i(Long.MAX_VALUE);
        }
    }

    public final void onError(Throwable th) {
        this.b = null;
        this.a.onError(th);
    }
}

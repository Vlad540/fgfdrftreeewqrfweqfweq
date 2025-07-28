package defpackage;

import java.util.ArrayList;
import java.util.Collection;

/* renamed from: oo5  reason: default package */
public final class oo5 implements ko5, xi4 {
    public final zhd a;
    public d1e b;
    public Collection c;

    public oo5(zhd zhd, ArrayList arrayList) {
        this.a = zhd;
        this.c = arrayList;
    }

    public final void b() {
        this.b = f1e.a;
        this.a.a(this.c);
    }

    public final void c(Object obj) {
        this.c.add(obj);
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
        this.c = null;
        this.b = f1e.a;
        this.a.onError(th);
    }
}

package defpackage;

import android.util.Size;

/* renamed from: n4e  reason: default package */
public final class n4e extends xc4 {
    public final vn1 n = hwf.f(new sic(22, this));
    public sn1 o;
    public xc4 p;
    public q4e q;

    public n4e(Size size, int i) {
        super(size, i);
    }

    public final void a() {
        super.a();
        gt0.I(new l4e(this, 2));
    }

    public final ch7 e() {
        return this.n;
    }

    public final boolean f(xc4 xc4, Runnable runnable) {
        boolean z;
        gt0.i();
        xc4.getClass();
        xc4 xc42 = this.p;
        boolean z2 = false;
        if (xc42 == xc4) {
            return false;
        }
        e07.p("A different provider has been set. To change the provider, call SurfaceEdge#invalidate before calling SurfaceEdge#setProvider", xc42 == null);
        Size size = this.h;
        Size size2 = xc4.h;
        e07.j("The provider's size(" + size + ") must match the parent(" + size2 + ")", size.equals(size2));
        int i = xc4.i;
        int i2 = this.i;
        if (i2 == i) {
            z2 = true;
        }
        e07.j(rf0.g("The provider's format(", i2, ") must match the parent(", i, ")"), z2);
        synchronized (this.a) {
            z = this.c;
        }
        e07.p("The parent is closed. Call SurfaceEdge#invalidate() before setting a new provider.", !z);
        this.p = xc4;
        ct0.C(xc4.c(), this.o);
        xc4.d();
        ct0.A(this.e).c(new wc4(xc4, 2), pa2.j());
        ct0.A(xc4.g).c(runnable, pa2.A());
        return true;
    }
}

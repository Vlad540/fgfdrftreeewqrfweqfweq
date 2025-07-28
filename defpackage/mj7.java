package defpackage;

import android.os.Bundle;

/* renamed from: mj7  reason: default package */
public final class mj7 extends vb9 {
    public final int l = 0;
    public final Bundle m = null;
    public final l2g n;
    public nc7 o;
    public nj7 p;
    public l2g q;

    public mj7(l2g l2g) {
        this.n = l2g;
        this.q = null;
        if (l2g.b == null) {
            l2g.b = this;
            l2g.a = 0;
            return;
        }
        throw new IllegalStateException("There is already a listener registered");
    }

    public final void g() {
        l2g l2g = this.n;
        l2g.c = true;
        l2g.e = false;
        l2g.d = false;
        l2g.j.drainPermits();
        l2g.a();
        l2g.h = new ww(l2g);
        l2g.b();
    }

    public final void h() {
        this.n.c = false;
    }

    public final void j(cw9 cw9) {
        super.j(cw9);
        this.o = null;
        this.p = null;
    }

    public final void k(Object obj) {
        super.k(obj);
        l2g l2g = this.q;
        if (l2g != null) {
            l2g.e = true;
            l2g.c = false;
            l2g.d = false;
            l2g.f = false;
            this.q = null;
        }
    }

    public final void l() {
        nc7 nc7 = this.o;
        nj7 nj7 = this.p;
        if (nc7 != null && nj7 != null) {
            super.j(nj7);
            e(nc7, nj7);
        }
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(64);
        sb.append("LoaderInfo{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append(" #");
        sb.append(this.l);
        sb.append(" : ");
        xy6.e(sb, this.n);
        sb.append("}}");
        return sb.toString();
    }
}

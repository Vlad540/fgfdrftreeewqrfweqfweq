package defpackage;

/* renamed from: h9  reason: default package */
public final class h9 extends o94 {
    public final /* synthetic */ int d;
    public final long e;
    public final t97 f;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public /* synthetic */ h9(long j, t97 t97, t97 t972, t97 t973, t97 t974, int i) {
        super(t972, t973, t974);
        this.d = i;
        this.e = j;
        this.f = t97;
    }

    public mge a(tf3 tf3) {
        switch (this.d) {
            case 1:
                i22 g = g();
                if (g == null) {
                    return null;
                }
                long n = tf3.n();
                String str = (g.A() && g.C(n)) ? ((x52) g.b.R.get(Long.valueOf(n))).d : null;
                if (str != null && !h0e.c0(str)) {
                    return new lge(str);
                }
                if (g.V(tf3.n())) {
                    return new hge(l8a.o2);
                }
                if (g.C(tf3.n())) {
                    return new hge(l8a.a2);
                }
                return null;
            default:
                return super.a(tf3);
        }
    }

    public mge c(tf3 tf3) {
        switch (this.d) {
            case 0:
                if (tf3.Y) {
                    return new hge(l8a.n2);
                }
                i22 i22 = (i22) ((aw2) ((bv2) this.f.getValue())).m(this.e).a.getValue();
                return (i22 == null || !i22.C(tf3.n())) ? super.c(tf3) : new hge(l8a.l2);
            default:
                return super.c(tf3);
        }
    }

    public boolean d(tf3 tf3) {
        switch (this.d) {
            case 0:
                if (!tf3.Y) {
                    i22 i22 = (i22) ((aw2) ((bv2) this.f.getValue())).m(this.e).a.getValue();
                    if (i22 == null || !i22.C(tf3.n())) {
                        return true;
                    }
                }
                return false;
            default:
                return super.d(tf3);
        }
    }

    public boolean e(tf3 tf3) {
        i22 g;
        switch (this.d) {
            case 1:
                boolean z = tf3.n() != ((lqc) b()).s();
                i22 g2 = g();
                boolean z2 = g2 != null && !g2.V(tf3.n());
                i22 g3 = g();
                boolean z3 = g3 != null && d8.v(g3.d(((lqc) b()).s()), 4) && (g = g()) != null && g.C(tf3.n());
                i22 g4 = g();
                boolean z4 = !(g4 != null && g4.C(tf3.n()));
                if (!z2 || !z) {
                    return false;
                }
                return z3 || z4;
            default:
                return super.e(tf3);
        }
    }

    public ei8 f(tf3 tf3) {
        switch (this.d) {
            case 1:
                ei8 f2 = super.f(tf3);
                i22 g = g();
                boolean z = false;
                if (g != null && g.V(tf3.n())) {
                    z = true;
                }
                return ei8.k(f2, z);
            default:
                return super.f(tf3);
        }
    }

    public i22 g() {
        return (i22) ((aw2) ((bv2) this.f.getValue())).m(this.e).a.getValue();
    }
}

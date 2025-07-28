package defpackage;

/* renamed from: o22  reason: default package */
public final class o22 extends o94 {
    public final long d;
    public final t97 e;
    public final t97 f;
    public final t97 g;
    public final r7e h = new r7e(new nl1(5, this));

    public o22(long j, t97 t97, t97 t972, t97 t973, t97 t974, t97 t975, t97 t976) {
        super(t973, t974, t975);
        this.d = j;
        this.e = t97;
        this.f = t972;
        this.g = t976;
    }

    public final mge c(tf3 tf3) {
        String d2;
        i22 g2 = g();
        Long c = g2 != null ? g2.c(tf3.n()) : null;
        if (tf3.Y) {
            return new hge(l8a.n2);
        }
        long s = ((lqc) b()).s();
        r7e r7e = this.h;
        if (c != null && c.longValue() == s) {
            return new hge(((Boolean) r7e.getValue()).booleanValue() ? l8a.R : l8a.m2);
        }
        i22 g3 = g();
        if (g3 != null && g3.V(tf3.n()) && ((Boolean) r7e.getValue()).booleanValue()) {
            i22 g4 = g();
            return new hge((g4 == null || !g4.G()) ? l8a.q2 : l8a.p2);
        } else if (c == null || !((Boolean) r7e.getValue()).booleanValue()) {
            return super.c(tf3);
        } else {
            tf3 tf32 = (tf3) ((ap3) this.f.getValue()).c(c.longValue()).a.getValue();
            return (tf32 == null || (d2 = tf32.d()) == null) ? super.c(tf3) : new jge(l8a.Q, cs.g0(new Object[]{d2}));
        }
    }

    public final boolean e(tf3 tf3) {
        i22 g2;
        boolean z = tf3.n() != ((lqc) b()).s();
        i22 g3 = g();
        boolean z2 = g3 != null && !g3.V(tf3.n());
        i22 g4 = g();
        boolean z3 = g4 != null && d8.v(g4.d(((lqc) b()).s()), 4) && (g2 = g()) != null && g2.C(tf3.n());
        i22 g5 = g();
        boolean z4 = !(g5 != null && g5.C(tf3.n()));
        if (!z2 || !z) {
            return false;
        }
        return z3 || z4;
    }

    public final ei8 f(tf3 tf3) {
        ei8 f2 = super.f(tf3);
        i22 g2 = g();
        boolean z = false;
        if (g2 != null && g2.V(tf3.n())) {
            z = true;
        }
        return ei8.k(f2, z);
    }

    public final i22 g() {
        return (i22) ((aw2) ((bv2) this.e.getValue())).m(this.d).a.getValue();
    }
}

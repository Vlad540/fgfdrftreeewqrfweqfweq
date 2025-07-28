package defpackage;

import java.util.List;

/* renamed from: n0d  reason: default package */
public final class n0d extends f1d {
    public final long D0;
    public final String E0;
    public final List F0;

    public n0d(m0d m0d) {
        super(m0d);
        this.D0 = m0d.l;
        this.E0 = m0d.m;
        this.F0 = m0d.n;
    }

    public final void x() {
        vo8 q;
        ls8 ls8;
        i22 B = b().B(this.c);
        if (B != null && (q = n().q(this.D0)) != null && (ls8 = q.z0) != ls8.DELETED) {
            n().x(q, bp8.SENDING);
            d0d d0d = this.a;
            if (d0d == null) {
                d0d = null;
            }
            ((wr4) d0d.q.getValue()).a(this.D0, this.c, this.E0, this.F0, ls8.EDITED, (List) null, false);
            ((gy9) a()).D(this.c, this.D0, B.b.a, q.c, this.E0, q.w0, ls8, q.m() ? (List) q.D0.a : null, false, q.V0);
        }
    }

    public final uo8 y() {
        uo8 uo8 = new uo8();
        String str = this.E0;
        if (!r1g.p(str)) {
            uo8.g = str;
        }
        List list = this.F0;
        if (!list.isEmpty()) {
            uo8.F = list;
        }
        uo8.H = this.C0;
        return uo8;
    }
}

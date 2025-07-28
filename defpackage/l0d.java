package defpackage;

import java.util.ArrayList;
import java.util.List;

/* renamed from: l0d  reason: default package */
public final class l0d extends d1d {
    public final long H0;

    public l0d(k0d k0d) {
        super(k0d);
        this.H0 = k0d.p;
    }

    public final void x() {
        long j;
        vo8 q;
        ls8 ls8;
        i22 B = b().B(this.c);
        if (B != null && (q = n().q(j)) != null && (ls8 = q.z0) != ls8.DELETED) {
            n().x(q, bp8.SENDING);
            jj7 jj7 = y().n;
            List list = jj7 != null ? (List) jj7.a : null;
            if (list == null) {
                list = hw4.a;
            }
            List list2 = list;
            d0d d0d = this.a;
            if (d0d == null) {
                d0d = null;
            }
            ((wr4) d0d.q.getValue()).a(this.H0, this.c, this.D0, this.E0, ls8.EDITED, list2, true);
            ((gy9) a()).D(this.c, this.H0, B.b.a, q.c, this.D0, q.w0, ls8, q.m() ? (List) q.D0.a : null, true, q.V0);
            vo8 q2 = n().q((j = this.H0));
            if (q2 != null) {
                int size = this.F0.size();
                for (int i = 0; i < size; i++) {
                    if (!(this.F0.get(i) instanceof nz)) {
                        o2 o2Var = (o2) this.F0.get(i);
                        String str = q2.D0.u(i).q;
                        d0d d0d2 = this.a;
                        if (d0d2 == null) {
                            d0d2 = null;
                        }
                        ((uc5) d0d2.b.getValue()).c(o2Var, this.H0, B.a, str);
                    }
                }
            }
        }
    }

    /* JADX WARNING: type inference failed for: r1v1, types: [java.lang.Object, p10] */
    public final uo8 y() {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList(this.F0.size());
        for (o2 o2Var : this.F0) {
            d0d d0d = this.a;
            if (d0d == null) {
                d0d = null;
            }
            xia b = ((n4b) d0d.B.getValue()).b(o2Var, this.G0);
            if (b != null) {
                o2 o2Var2 = (o2) b.a;
                o10 o10 = (o10) b.b;
                if (!(o2Var2 == null || o10 == null)) {
                    arrayList2.add(o2Var2);
                    arrayList.add(o10);
                }
            }
        }
        this.F0 = arrayList2;
        ? obj = new Object();
        obj.a = arrayList;
        jj7 c = obj.c();
        uo8 uo8 = new uo8();
        uo8.n = c;
        String str = this.D0;
        if (!r1g.p(str)) {
            uo8.g = str;
        }
        List list = this.E0;
        if (list != null && !list.isEmpty()) {
            uo8.F = list;
        }
        uo8.H = this.C0;
        return uo8;
    }
}

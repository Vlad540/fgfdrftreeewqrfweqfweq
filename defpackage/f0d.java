package defpackage;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

/* renamed from: f0d  reason: default package */
public final class f0d extends c0d {
    public final long b;
    public final boolean c;
    public final String o = f0d.class.getName();

    public f0d(long j, boolean z) {
        this.b = j;
        this.c = z;
    }

    public final void x() {
        o62 o62;
        ArrayList arrayList;
        ArrayList arrayList2;
        StringBuilder sb = new StringBuilder("process, chatsIds = ");
        long j = this.b;
        sb.append(j);
        sb.append(" , forAll = ");
        boolean z = this.c;
        sb.append(z);
        udd.q(this.o, sb.toString());
        if (j != 0) {
            ArrayList arrayList3 = new ArrayList();
            i22 B = d().B(j);
            if (B != null) {
                o62 o622 = B.b;
                long j2 = o622.k;
                o().y(this.b, j2, ls8.DELETED);
                d().v(j);
                t52 d = d();
                d.getClass();
                z52 z52 = z52.o;
                long j3 = B.a;
                d.c(j3, z52);
                d.h(j3, false, new ak0(18));
                pk a = a();
                boolean z2 = B.D() || z;
                gy9 gy9 = (gy9) a;
                long j4 = B.a;
                if (!gy9.o(j4)) {
                    arrayList = arrayList3;
                    o62 = o622;
                } else {
                    long n = ((j2b) gy9.z()).a.n();
                    arrayList = arrayList3;
                    long j5 = o622.a;
                    o62 = o622;
                    p42 p42 = r7;
                    p42 p422 = new p42(n, j4, j5, j2, z2);
                    gy9.w(gy9, p42);
                }
                t().c(new q42(j));
                tf3 k = B.k();
                if (k != null) {
                    arrayList2 = arrayList;
                    arrayList2.add(Long.valueOf(k.n()));
                } else {
                    arrayList2 = arrayList;
                }
                um7 m = m();
                o().i(j);
                m.getClass();
                d0d d0d = this.a;
                if (d0d == null) {
                    d0d = null;
                }
                ((p7a) d0d.x.getValue()).a(o62.a);
                if (!arrayList2.isEmpty()) {
                    t().c(new lp3((Collection) arrayList2));
                }
                t().c(new mw2(Collections.singletonList(Long.valueOf(j)), true, false, (md4) null, (a4b) null, 124));
            }
        }
    }
}

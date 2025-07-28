package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;

/* renamed from: qh0  reason: default package */
public final /* synthetic */ class qh0 implements of3, w1b, bid {
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ long b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ Object o;

    public /* synthetic */ qh0(long j, boolean z, ak0 ak0) {
        this.b = j;
        this.c = z;
        this.o = ak0;
    }

    public void accept(Object obj) {
        Map map = (Map) obj;
        nt7 nt7 = (nt7) this.o;
        nt7.getClass();
        boolean z = this.c;
        om0 om0 = z ? (om0) map.get(rt7.a) : (om0) map.get(rt7.c);
        for (sh0 sh0 : nt7.b.values()) {
            int i = (sh0.b.j > this.b ? 1 : (sh0.b.j == this.b ? 0 : -1));
            c9 c9Var = sh0.a;
            if (i != 0) {
                c9Var.w(om0);
            } else if (z) {
                c9Var.w((om0) map.get(rt7.b));
            } else {
                c9Var.w((om0) map.get(rt7.o));
            }
            c9Var.y();
        }
    }

    public void j(ihd ihd) {
        long j = this.b;
        Object obj = this.o;
        switch (this.a) {
            case 2:
                bd2 bd2 = (bd2) obj;
                bd2.getClass();
                udd.q("bd2", "loadNetworkPrevPage, messageId = " + j);
                to8 to8 = bd2.r;
                vo8 q = to8.q(j);
                ArrayList l = ((hz3) to8.a).c.l(bd2.a, q != null ? q.o : Long.MAX_VALUE, bd2.f, (Integer) null, this.c);
                ArrayList b2 = bd2.u.b(l);
                Iterator it = l.iterator();
                while (it.hasNext()) {
                    bd2.t.e((vo8) it.next());
                }
                ihd.a(b2);
                return;
            default:
                di3 di3 = (di3) obj;
                di3.b();
                tf3 h = di3.h(j, this.c);
                if (h != null) {
                    if (!ihd.h()) {
                        ihd.a(h);
                        return;
                    }
                    return;
                } else if (!ihd.h()) {
                    ihd.onError(new Exception(us8.i(j, "contact not found: ")));
                    return;
                } else {
                    return;
                }
        }
    }

    public boolean test(Object obj) {
        i22 i22 = (i22) obj;
        if (i22.b.f(this.b)) {
            if (!this.c || i22.b.k <= 0) {
                return false;
            }
        } else if (!t52.N.test(i22)) {
            return false;
        } else {
            w1b w1b = (w1b) this.o;
            if (w1b != null && !w1b.test(i22)) {
                return false;
            }
        }
        return true;
    }

    public /* synthetic */ qh0(bd2 bd2, long j, boolean z) {
        this.o = bd2;
        this.b = j;
        this.c = z;
    }

    public /* synthetic */ qh0(di3 di3, long j) {
        this.o = di3;
        this.b = j;
        this.c = false;
    }

    public /* synthetic */ qh0(nt7 nt7, boolean z, long j) {
        this.o = nt7;
        this.c = z;
        this.b = j;
    }
}

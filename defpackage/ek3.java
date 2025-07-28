package defpackage;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

/* renamed from: ek3  reason: default package */
public final class ek3 extends ol implements qce {
    public final int X = 40;
    public final int o;

    public ek3(long j, int i) {
        super(j);
        this.o = i;
    }

    public final void c(lbe lbe) {
        List<uj3> list;
        hw4 hw4;
        List list2 = ((fk3) lbe).c;
        if (!(list2 instanceof Collection) || !list2.isEmpty()) {
            ArrayList arrayList = new ArrayList();
            for (Object next : list2) {
                try {
                    if (((uj3) next) != sj3.E0) {
                        arrayList.add(next);
                    }
                } catch (Throwable th) {
                    throw new RuntimeException(th);
                }
            }
            list = arrayList;
        } else {
            list = Collections.emptyList();
        }
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        for (uj3 uj3 : list) {
            if (n().g(uj3.a)) {
                arrayList2.add(uj3);
            } else {
                arrayList3.add(uj3);
            }
        }
        n().t(arrayList2, mi3.a);
        n().t(arrayList3, mi3.b);
        tt0 l = l();
        if (list.isEmpty()) {
            hw4 = hw4.a;
        } else {
            hw4 arrayList4 = new ArrayList(list.size());
            for (uj3 uj32 : list) {
                try {
                    arrayList4.add(Long.valueOf(uj32.a));
                } catch (Throwable th2) {
                    throw new RuntimeException(th2);
                }
            }
            hw4 = arrayList4;
        }
        l.c(new ik3(this.o, this.a, hw4));
    }

    public final void d(uae uae) {
        boolean z = uae instanceof lae;
        long j = this.a;
        if (z) {
            l().c(new jh0(j, uae));
            return;
        }
        l().c(new ik3(this.o, j, hw4.a));
    }

    public final ibe i() {
        pn2 pn2 = new pn2((dfa) null, 7);
        pn2.s("status", "BLOCKED");
        int i = this.o;
        if (i > 0) {
            pn2.g(i, "from");
        }
        int i2 = this.X;
        if (i2 > 0) {
            pn2.g(i2, "count");
        }
        return pn2;
    }
}

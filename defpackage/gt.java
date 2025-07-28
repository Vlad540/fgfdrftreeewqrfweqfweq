package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: gt  reason: default package */
public final class gt extends ol implements qce {
    public final long[] X;
    public final int o;

    public gt(int i, long j, long[] jArr) {
        super(j);
        this.o = i;
        this.X = jArr;
    }

    public final void c(lbe lbe) {
        ht htVar = (ht) lbe;
        int i = this.o;
        int t = hr1.t(i);
        pl plVar = null;
        if (t == 1) {
            pl plVar2 = this.c;
            if (plVar2 == null) {
                plVar2 = null;
            }
            zsd zsd = (zsd) plVar2.n.getValue();
            List<psd> list = htVar.c;
            ArrayList arrayList = new ArrayList();
            for (psd r : list) {
                arrayList.add(fu7.r(r));
            }
            zsd.e(arrayList);
            pl plVar3 = this.c;
            if (plVar3 == null) {
                plVar3 = null;
            }
            l95 l95 = (l95) plVar3.q.getValue();
            List<psd> list2 = htVar.c;
            ArrayList arrayList2 = new ArrayList(q23.H(list2, 10));
            for (psd psd : list2) {
                arrayList2.add(Long.valueOf(psd.k));
            }
            l95.e(arrayList2);
        } else if (t == 2) {
            pl plVar4 = this.c;
            if (plVar4 == null) {
                plVar4 = null;
            }
            lud lud = (lud) plVar4.o.getValue();
            List<ytd> list3 = htVar.o;
            lud.getClass();
            ArrayList arrayList3 = new ArrayList();
            ArrayList arrayList4 = new ArrayList();
            for (ytd ytd : list3) {
                arrayList3.addAll(((zsd) lud.b).c(ytd.h));
                arrayList4.add(lud.e(ytd));
            }
            if (!arrayList3.isEmpty()) {
                ek8.U(arrayList3);
                Iterator it = ek8.Z(arrayList3).iterator();
                while (it.hasNext()) {
                    lud.c.c(2, (List) it.next());
                }
            }
            if (!arrayList4.isEmpty()) {
                nud nud = lud.a;
                nud.getClass();
                iu7.a0(new w63(new au9(ms9.j(arrayList4), new xsd(25), 3).v(), 2, new kud(nud, 1)).l(), z3d.j, new d52(26, arrayList4), new b95(6, arrayList4));
            }
            pl plVar5 = this.c;
            if (plVar5 == null) {
                plVar5 = null;
            }
            l95 l952 = (l95) plVar5.q.getValue();
            List<ytd> list4 = htVar.o;
            ArrayList arrayList5 = new ArrayList(q23.H(list4, 10));
            for (ytd ytd2 : list4) {
                arrayList5.add(Long.valueOf(ytd2.a));
            }
            l952.e(arrayList5);
        }
        pl plVar6 = this.c;
        if (plVar6 != null) {
            plVar = plVar6;
        }
        plVar.b().c(new jt(i, this.a, cs.f0(this.X)));
    }

    public final void d(uae uae) {
        udd.s("gt", uae.toString(), (Throwable) null);
    }

    public final ibe i() {
        return new dt(this.o, this.X);
    }
}

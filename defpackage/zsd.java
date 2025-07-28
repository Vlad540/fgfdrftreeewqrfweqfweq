package defpackage;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: zsd  reason: default package */
public final class zsd implements pud {
    public final ConcurrentHashMap a = new ConcurrentHashMap();
    public final ConcurrentHashMap b = new ConcurrentHashMap();
    public final nj4 c;
    public final g2b d;
    public final nj4 e;
    public final nj4 f;
    public final qmc g;
    public final qmc h;
    public final nj4 i;
    public final nj4 j;
    public pn1 k;
    public final jk0 l;

    public zsd(nj4 nj4, g2b g2b, nj4 nj42, nj4 nj43, qmc qmc, qmc qmc2, nj4 nj44, nj4 nj45) {
        new ConcurrentHashMap();
        this.l = jk0.z(Collections.emptyList());
        this.c = nj4;
        this.d = g2b;
        this.e = nj42;
        this.f = nj43;
        this.g = qmc;
        this.h = qmc2;
        this.i = nj44;
        this.j = nj45;
    }

    public final au9 a() {
        return new au9(((v2c) this.j.get()).b().a(Collections.singletonList(r2c.STICKER)), new vsd(this, 0), 3);
    }

    public final phd b(List list) {
        udd.p("zsd", "getStickersByIds: ids count=%d", new Object[]{Integer.valueOf(list.size())});
        return new lx7(new phd(new au9(new ps9(ms9.j(this.a.entrySet()), new d52(24, list), 1), new xsd(1), 3).v(), new wsd(this, list, 0), 0), new dd9(3), 3).w(new jce(list, new lpa(29)));
    }

    public final ArrayList c(List list) {
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            Long l2 = (Long) it.next();
            l2.getClass();
            if (((osd) this.a.get(l2)) == null) {
                arrayList.add(l2);
            }
        }
        return arrayList;
    }

    public final yhd d(List list) {
        udd.p("zsd", "loadNetworkStickers: %s", new Object[]{list});
        ek8.U(list);
        lx7 f2 = ms9.j(ek8.Z(list)).f(new vsd(this, 1));
        ArrayList arrayList = new ArrayList();
        return new us9(f2, new b36(arrayList), new xsd(3)).m(this.g);
    }

    public final synchronized void e(List list) {
        try {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                osd osd = (osd) it.next();
                this.a.put(Long.valueOf(osd.a), osd);
            }
            tic.a(new sz(this, 13, list), this.h, (j6) null, new xsd(7), (qmc) null);
        } catch (Throwable th) {
            while (true) {
                throw th;
            }
        }
    }

    public final synchronized void f() {
        if (!lp.Q(((mg5) ((bf5) this.e.get())).p(), this.b)) {
            udd.q("zsd", "Failed to store initial showcase");
        }
    }

    public final void g(List list) {
        ConcurrentHashMap concurrentHashMap;
        Iterator it = list.iterator();
        while (true) {
            boolean hasNext = it.hasNext();
            concurrentHashMap = this.b;
            if (!hasNext) {
                break;
            }
            wsc wsc = (wsc) it.next();
            Iterator it2 = concurrentHashMap.entrySet().iterator();
            while (it2.hasNext()) {
                if (((String) ((Map.Entry) it2.next()).getKey()).equals(wsc.b)) {
                    it2.remove();
                }
            }
        }
        Iterator it3 = list.iterator();
        while (it3.hasNext()) {
            wsc wsc2 = (wsc) it3.next();
            int i2 = wsc2.a;
            String str = wsc2.b;
            if (i2 == 3) {
                if (!((oud) wsc2).c.isEmpty()) {
                    concurrentHashMap.put(str, wsc2);
                }
            } else if (i2 == 2 && !((dwd) wsc2).c.isEmpty()) {
                concurrentHashMap.put(str, wsc2);
            }
        }
        this.l.c(concurrentHashMap.values());
    }

    public final void h(List list) {
        udd.q("zsd", "Update recent section");
        int i2 = 0;
        while (i2 < list.size()) {
            wsc wsc = (wsc) list.get(i2);
            if (!"RECENT".equals(wsc.b) || wsc.a != 4) {
                i2++;
            } else {
                tic.b(this.k);
                v2c v2c = (v2c) this.j.get();
                v2c.getClass();
                List list2 = ((w2c) wsc).c;
                udd.p("v2c", "Replace recents. New size = %d", new Object[]{Integer.valueOf(list2.size())});
                n2c b2 = v2c.b();
                f73 k2 = new w63(b2.b(), 2, new m2c(b2, (ArrayList) list2, 0)).k(this.h);
                pn1 pn1 = new pn1(new xsd(10), 0, new d74(9));
                k2.i(pn1);
                this.k = pn1;
                return;
            }
        }
    }
}

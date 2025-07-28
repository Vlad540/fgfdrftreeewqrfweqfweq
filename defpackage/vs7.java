package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: vs7  reason: default package */
public final class vs7 {
    public final t52 a;
    public final qmc b;
    public final qmc c;
    public final qbe d;
    public final tt0 e;
    public final lce f;
    public final g15 g;
    public ms7 h;
    public d97 i;
    public pn1 j;
    public pn1 k;
    public pn1 l;
    public ArrayList m = new ArrayList();
    public volatile List n = new ArrayList();
    public final ArrayList o = new ArrayList();
    public final ArrayList p = new ArrayList();
    public String q;
    public String r = "";
    public final fq3 s;

    public vs7(t52 t52, di3 di3, gsc gsc, kn3 kn3, qmc qmc, qmc qmc2, qbe qbe, tt0 tt0, lce lce, boolean z, g15 g15, xzc xzc) {
        this.a = t52;
        this.b = qmc2;
        this.c = qmc;
        this.d = qbe;
        this.e = tt0;
        this.f = lce;
        this.g = g15;
        this.s = new fq3(new rs7(t52, di3, kn3, gsc, z, xzc));
    }

    public final void a() {
        if (!tic.c(this.i)) {
            d97 d97 = this.i;
            d97.getClass();
            f1e.a(d97);
            try {
                this.e.f(this);
            } catch (Exception unused) {
            }
        }
        this.m.clear();
        this.q = null;
        this.r = "";
    }

    public final void b() {
        if (!tic.c(this.j)) {
            pn1 pn1 = this.j;
            pn1.getClass();
            bj4.a(pn1);
            try {
                this.e.f(this);
            } catch (Exception unused) {
            }
        }
        this.o.clear();
        this.n.clear();
    }

    public final void c() {
        if (!tic.c(this.k)) {
            pn1 pn1 = this.k;
            pn1.getClass();
            bj4.a(pn1);
        }
        this.p.clear();
        this.r = "";
    }

    public final void d() {
        udd.q("vs7", "clear");
        a();
        b();
        c();
    }

    public final yhd e(String str) {
        bm9 bm9 = new bm9((dfa) null, 4);
        bm9.s("query", str);
        bm9.g(5, "count");
        bm9.s("type", "ALL");
        ybe ybe = (ybe) this.d;
        ybe.getClass();
        mv9 mv9 = new mv9(1, new joc(ybe, 6, bm9));
        qmc qmc = this.c;
        return new aid(mv9.i(qmc).h(new os7(this, 2)).h(new j67(6)), new j67(7), (Object) null).m(qmc);
    }

    public final void f(String str) {
        long currentTimeMillis = System.currentTimeMillis();
        udd.I("vs7", "searchChats start", new Object[0]);
        b();
        yhd i2 = new mv9(2, new rz3(this, 5, str)).m(this.c).i(this.b);
        pn1 pn1 = new pn1(new qs7(this, currentTimeMillis, str, 1), 2, new ps7(this, str, 2));
        i2.k(pn1);
        this.j = pn1;
    }

    @a1e
    public void onEvent(mw2 mw2) {
        Iterator it = this.m.iterator();
        while (it.hasNext()) {
            i22 i22 = ((prc) it.next()).o;
            if (i22 != null && mw2.b.contains(Long.valueOf(i22.a))) {
                tic.b(this.l);
                this.l = tic.a(new f5(11, this), this.c, (j6) null, new j67(14), (qmc) null);
                return;
            }
        }
    }
}

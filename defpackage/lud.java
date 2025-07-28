package defpackage;

import java.util.Collections;
import java.util.List;

/* renamed from: lud  reason: default package */
public final class lud implements pp7 {
    public final qmc X;
    public final lce Y;
    public final nud a;
    public final pud b;
    public final pk c;
    public final qmc o;

    public lud(nud nud, pud pud, pk pkVar, qmc qmc, qmc qmc2, lce lce) {
        this.a = nud;
        this.b = pud;
        this.c = pkVar;
        this.o = qmc;
        this.X = qmc2;
        this.Y = lce;
    }

    /* JADX WARNING: type inference failed for: r2v0, types: [vtd, java.lang.Object] */
    public static bud e(ytd ytd) {
        long j = ytd.a;
        ? obj = new Object();
        obj.a = j;
        obj.b = ytd.b;
        obj.c = ytd.c;
        obj.d = ytd.d;
        obj.e = ytd.e;
        obj.f = ytd.f;
        obj.g = ytd.g;
        obj.h = ytd.h;
        obj.i = ytd.i;
        return new bud(obj);
    }

    public final void a() {
        udd.q("lud", "clear: ");
        iu7.a0(new w63(this.a.a.n().h(new xsd(24)), 2, new xsd(20)).l(), z3d.j, new xsd(16), new d74(11));
    }

    public final ov9 b(long j) {
        dx7 dx7 = new dx7(new ay7[]{new nx7(this.a.a(new long[]{j}), new xsd(21), 0), new jx7(d(Collections.singletonList(Long.valueOf(j))), 2, new xsd(18))}, 0);
        iud iud = new iud(this, 2);
        fja.D(2, "prefetch");
        return new it9(new n73(5, new hn5(dx7, iud)), 0).r(this.X);
    }

    public final phd c(List list) {
        return new lx7(new phd(new o73(this.a.a(ek8.n(list)), 1, new mv9(2, new be(1))), new jud(this, list, 1), 0), new dd9(3), 3).f(new iud(this, 2)).w(new jce(list, new xsd(19)));
    }

    public final yhd d(List list) {
        udd.p("lud", "getStickersSetsFromNetwork: %s", new Object[]{list});
        dt dtVar = new dt(3, ek8.n(list));
        qmc qmc = this.o;
        mhd mhd = new mhd(new au9(new lx7(((gy9) this.c).L(dtVar, qmc).h(new mb1(13, ht.class)).h(new xsd(17)), new dd9(3), 3), new iud(this, 0), 3).v(), new iud(this, 1), 2);
        lce lce = this.Y;
        lce.getClass();
        return mhd.j(new ice(lce, 2, 0)).m(qmc);
    }
}

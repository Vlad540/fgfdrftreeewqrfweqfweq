package defpackage;

import java.util.List;

/* renamed from: i2c  reason: default package */
public final class i2c {
    public final t52 a;
    public final di3 b;
    public final qmc c;

    public i2c(t52 t52, di3 di3, qmc qmc) {
        this.a = t52;
        this.b = di3;
        this.c = qmc;
    }

    public final List a() {
        List D = this.a.D(t52.I);
        udd.q("i2c", "getRecentContacts:");
        return (List) new ts9(new au9(new au9(new ps9(ms9.j(D), new h2c(this, 1), 1).v().n(), new mb1(14, new xb4(16)), 3), z3d.g, 2).i(new lpa(7), Integer.MAX_VALUE), new lpa(5)).s((long) 10).v().n().i(new ph0(this, D), Integer.MAX_VALUE).v().e();
    }

    public final List b() {
        n73 n73 = new n73(3, new nv9[]{new au9(new ps9(ms9.j(this.a.D(t52.I)), new h2c(this, 2), 1), new lpa(6), 3), new au9(new ps9(new ps9(ms9.j(this.b.j(di3.r, di3.t)), new h2c(this, 6), 1), new h2c(this, 0), 1), new lpa(8), 3)});
        ns7 ns7 = z3d.g;
        return (List) new au9(new au9(new au9(n73.i(ns7, 2).v().n(), new mb1(14, c36.a), 3), ns7, 2).s((long) 10), new lpa(10), 3).v().e();
    }
}

package defpackage;

import java.util.Objects;

/* renamed from: hxe  reason: default package */
public final class hxe {
    public final ewe a;
    public final btd b;
    public final qmc c;
    public final nj4 d;

    public hxe(ewe ewe, btd btd, qmc qmc, nj4 nj4) {
        this.a = ewe;
        this.d = nj4;
        this.b = btd;
        this.c = qmc;
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [af8, java.lang.Object] */
    public static fwe b(ys8 ys8) {
        ? obj = new Object();
        obj.d = r1g.p(ys8.f) ? ys8.a.c : ys8.f;
        obj.c = ys8.b;
        obj.b = ys8.d;
        obj.a = ys8.c;
        return new fwe(obj);
    }

    public final ov9 a(ys8 ys8) {
        au9 au9 = new au9(ms9.m(ys8).e(new gxe(this, 0)), new gxe(this, 1), 3);
        ewe ewe = this.a;
        Objects.requireNonNull(ewe);
        return new kt9(au9.e(new yve(ewe, 9)).e(new gxe(this, 3)), z3d.j, new joc(this, 12, ys8), z3d.i).o(Long.MAX_VALUE, new gxe(this, 2)).r(this.c);
    }
}

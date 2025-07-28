package defpackage;

import java.util.HashSet;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArraySet;

/* renamed from: me0  reason: default package */
public final class me0 {
    public final xwf a = new xwf();
    public final et4 b = new et4();
    public final et4 c = new et4();
    public final boolean d;
    public final p7 e;
    public final p7 f;
    public final yq7 g;
    public final yq7 h;
    public final exf i;
    public final exf j;
    public final CopyOnWriteArraySet k = new CopyOnWriteArraySet();
    public final boolean l;
    public boolean m;
    public boolean n;
    public double o;
    public double p;

    /* JADX WARNING: type inference failed for: r2v1, types: [java.lang.Object, yq7] */
    /* JADX WARNING: type inference failed for: r2v2, types: [java.lang.Object, yq7] */
    /* JADX WARNING: type inference failed for: r2v5, types: [exf, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r2v6, types: [exf, java.lang.Object] */
    public me0(boolean z, boolean z2) {
        this.l = z2;
        this.d = z;
        this.g = new Object();
        this.h = new Object();
        this.e = new p7(11, false);
        this.f = new p7(11, false);
        this.i = new Object();
        this.j = new Object();
    }

    public static boolean b(xwf xwf, double d2, double d3, double d4, ke0 ke0) {
        if (d2 > d4 && d4 > 0.0d) {
            return xwf.a(ke0, true);
        }
        if (d2 >= d3 || d3 <= 0.0d) {
            return false;
        }
        return xwf.a(ke0, false);
    }

    public final void a() {
        boolean a2;
        boolean a3;
        ge1 q;
        boolean z = this.a.b == 0;
        double d2 = this.b.b;
        xwf xwf = this.a;
        double d3 = (double) this.i.a;
        double d4 = (double) this.j.a;
        ke0 ke0 = ke0.b;
        boolean b2 = b(xwf, d2, d3, d4, ke0);
        double d5 = this.c.b;
        xwf xwf2 = this.a;
        double d6 = this.i.b;
        double d7 = this.j.b;
        ke0 ke02 = ke0.c;
        boolean b3 = b2 | b(xwf2, d5, d6, d7, ke02);
        boolean z2 = this.n;
        ke0 ke03 = ke0.a;
        boolean a4 = b3 | (z2 ? this.a.a(ke03, this.m) : this.a.a(ke03, false));
        boolean z3 = this.l;
        ke0 ke04 = ke0.X;
        ke0 ke05 = ke0.o;
        if (!z3 || Double.isNaN(this.o) || Double.isNaN(this.p)) {
            a2 = a4 | this.a.a(ke04, false);
            a3 = this.a.a(ke05, false);
        } else {
            a2 = a4 | b(this.a, this.o, (double) this.i.a, (double) this.j.a, ke05);
            a3 = b(this.a, this.p, this.i.b, this.j.b, ke04);
        }
        if (a2 || a3) {
            xwf xwf3 = this.a;
            boolean z4 = xwf3.b == 0;
            HashSet hashSet = new HashSet();
            ke0[] values = ke0.values();
            int i2 = 0;
            while (true) {
                boolean[] zArr = xwf3.a;
                if (i2 >= zArr.length) {
                    break;
                }
                if (zArr[i2]) {
                    hashSet.add(values[i2]);
                }
                i2++;
            }
            Iterator it = this.k.iterator();
            while (it.hasNext()) {
                le0 le0 = (le0) it.next();
                if (z4 != z) {
                    if (z4) {
                        le0.getClass();
                    } else {
                        le0.getClass();
                    }
                }
                jyf jyf = (jyf) le0;
                gx0 gx0 = jyf.b;
                boolean z5 = gx0.y0.A.c.a;
                if (!gx0.E0 && gx0.x1.H(ane.b) && !z5 && (q = gx0.q()) != null) {
                    if (!jyf.a && (hashSet.contains(ke0) || hashSet.contains(ke02))) {
                        jyf.a = true;
                        gx0.Z.i(ct0.g(q, true));
                    } else if (jyf.a && !hashSet.contains(ke0) && !hashSet.contains(ke02)) {
                        jyf.a = false;
                        gx0.Z.i(ct0.g(q, false));
                    }
                }
            }
        }
    }
}

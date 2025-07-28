package defpackage;

import java.io.IOException;

/* renamed from: ugb  reason: default package */
public final class ugb implements yjc {
    public final int a;
    public final /* synthetic */ ygb b;

    public ugb(ygb ygb, int i) {
        this.b = ygb;
        this.a = i;
    }

    public final void c() {
        ygb ygb = this.b;
        ygb.I0[this.a].u();
        int k = ygb.o.k(ygb.S0);
        ul7 ul7 = ygb.A0;
        IOException iOException = (IOException) ul7.c;
        if (iOException == null) {
            ej7 ej7 = (ej7) ul7.b;
            if (ej7 != null) {
                if (k == Integer.MIN_VALUE) {
                    k = ej7.b;
                }
                IOException iOException2 = ej7.o;
                if (iOException2 != null && ej7.X > k) {
                    throw iOException2;
                }
                return;
            }
            return;
        }
        throw iOException;
    }

    public final boolean d() {
        ygb ygb = this.b;
        return !ygb.A() && ygb.I0[this.a].s(ygb.b1);
    }

    public final int e(long j) {
        ygb ygb = this.b;
        if (ygb.A()) {
            return 0;
        }
        int i = this.a;
        ygb.t(i);
        wjc wjc = ygb.I0[i];
        int p = wjc.p(j, ygb.b1);
        wjc.B(p);
        if (p == 0) {
            ygb.v(i);
        }
        return p;
    }

    public final int j(qe4 qe4, n24 n24, int i) {
        ygb ygb = this.b;
        if (ygb.A()) {
            return -3;
        }
        int i2 = this.a;
        ygb.t(i2);
        int x = ygb.I0[i2].x(qe4, n24, i, ygb.b1);
        if (x == -3) {
            ygb.v(i2);
        }
        return x;
    }
}

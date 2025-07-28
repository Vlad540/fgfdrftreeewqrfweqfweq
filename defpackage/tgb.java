package defpackage;

import java.io.IOException;

/* renamed from: tgb  reason: default package */
public final class tgb implements xjc {
    public final int a;
    public final /* synthetic */ xgb b;

    public tgb(xgb xgb, int i) {
        this.b = xgb;
        this.a = i;
    }

    public final void c() {
        xgb xgb = this.b;
        xgb.H0[this.a].v();
        int h = xgb.o.h(xgb.Q0);
        jj7 jj7 = xgb.z0;
        IOException iOException = (IOException) jj7.c;
        if (iOException == null) {
            ej7 ej7 = (ej7) jj7.b;
            if (ej7 != null) {
                if (h == Integer.MIN_VALUE) {
                    h = ej7.b;
                }
                IOException iOException2 = ej7.o;
                if (iOException2 != null && ej7.X > h) {
                    throw iOException2;
                }
                return;
            }
            return;
        }
        throw iOException;
    }

    public final boolean d() {
        xgb xgb = this.b;
        return !xgb.x() && xgb.H0[this.a].t(xgb.Z0);
    }

    public final int e(long j) {
        xgb xgb = this.b;
        if (xgb.x()) {
            return 0;
        }
        int i = this.a;
        xgb.m(i);
        vjc vjc = xgb.H0[i];
        int q = vjc.q(j, xgb.Z0);
        vjc.B(q);
        if (q == 0) {
            xgb.n(i);
        }
        return q;
    }

    public final int h(otf otf, m24 m24, int i) {
        xgb xgb = this.b;
        if (xgb.x()) {
            return -3;
        }
        int i2 = this.a;
        xgb.m(i2);
        int y = xgb.H0[i2].y(otf, m24, i, xgb.Z0);
        if (y == -3) {
            xgb.n(i2);
        }
        return y;
    }
}

package defpackage;

import java.util.Map;
import kotlin.coroutines.Continuation;

/* renamed from: u42  reason: default package */
public final /* synthetic */ class u42 implements of3, iba {
    public final /* synthetic */ long a;
    public final /* synthetic */ long b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object o;

    public /* synthetic */ u42(t52 t52, long j, vo8 vo8, long j2) {
        this.c = t52;
        this.a = j;
        this.o = vo8;
        this.b = j2;
    }

    public void J(jba jba) {
        if (jba == jba.X) {
            tva tva = (tva) this.c;
            xs7.E(tva.d, tva.b.b(), (ru3) null, new qva(tva, (i22) this.o, this.a, this.b, (Continuation) null), 2);
        }
    }

    public void accept(Object obj) {
        xm8 xm8;
        y52 y52 = (y52) obj;
        t52 t52 = (t52) this.c;
        t52.getClass();
        if (y52.a == 0) {
            y52.a = this.a;
        }
        vo8 vo8 = (vo8) this.o;
        boolean v = vo8.v();
        long j = this.b;
        if (v) {
            t52.R(j, y52, vo8);
        }
        i62 i62 = y52.n;
        nd4 nd4 = vo8.X0;
        long j2 = nd4 != null ? nd4.a : vo8.o;
        md4 md4 = vo8.Y0;
        if (i62.c(md4) == 0) {
            i62.a(new h62(j2, j2), md4);
        } else {
            wia z = oyb.z(i62.d(md4));
            h62 h62 = (h62) z.b;
            if (h62.b < j2) {
                p7 c2 = h62.c();
                c2.b(j2);
                i62.d(md4).remove(((Integer) z.a).intValue());
                i62.e(md4);
                i62.a(c2.a(), md4);
            }
        }
        md4 md42 = md4.REGULAR;
        if (md4 == md42) {
            i22 B = t52.B(j);
            if (!(B == null || (xm8 = B.c) == null || xm8.a.c >= vo8.c)) {
                t52.l0(y52, vo8);
            }
            if (B != null) {
                o62 o62 = B.b;
                if (o62.x == 0 && o62.n.c(md42) == 0) {
                    t52.u(j, y52, 0);
                }
            }
            if (B != null && B.m() < vo8.k() && B.b.m == 0) {
                long J = t52.J();
                Map d = y52.d();
                if (((Long) y52.d().get(Long.valueOf(J))) != null) {
                    d.put(Long.valueOf(J), Long.valueOf(vo8.k()));
                    y52.e = d;
                }
            }
        }
    }

    public /* synthetic */ u42(tva tva, i22 i22, long j, long j2) {
        this.c = tva;
        this.o = i22;
        this.a = j;
        this.b = j2;
    }
}

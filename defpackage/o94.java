package defpackage;

import android.net.Uri;

/* renamed from: o94  reason: default package */
public class o94 {
    public final t97 a;
    public final t97 b;
    public final t97 c;

    public o94(t97 t97, t97 t972, t97 t973) {
        this.a = t97;
        this.b = t972;
        this.c = t973;
    }

    public mge a(tf3 tf3) {
        return null;
    }

    public final f03 b() {
        return (f03) this.b.getValue();
    }

    public mge c(tf3 tf3) {
        return tf3.n() == ((lqc) b()).s() ? new hge(whc.F) : (!tf3.t() || !tf3.v()) ? (!tf3.t() || tf3.v()) ? new lge(((q2b) ((s2b) this.c.getValue()).a.getValue()).b(tf3)) : new hge(cic.p) : new hge(cic.K2);
    }

    public boolean d(tf3 tf3) {
        return true;
    }

    public boolean e(tf3 tf3) {
        return true;
    }

    public ei8 f(tf3 tf3) {
        l2b b2 = ((o2b) this.a.getValue()).b(tf3.n());
        String q = tf3.q(((lqc) b()).p(), fj0.c);
        boolean z = tf3.n() == ((lqc) b()).s();
        long n = tf3.n();
        String d = tf3.d();
        if (d != null) {
            return new ei8(n, d, ehe.b(tf3.g()), c(tf3), q != null ? Uri.parse(q) : null, tf3.m(), tf3.u(), z, false, d(tf3), e(tf3), b2.b, a(tf3));
        }
        throw new IllegalArgumentException("Required value was null.".toString());
    }
}

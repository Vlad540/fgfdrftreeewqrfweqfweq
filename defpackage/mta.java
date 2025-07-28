package defpackage;

import android.net.Uri;

/* renamed from: mta  reason: default package */
public final class mta {
    public final t97 a;
    public final t97 b;
    public final t97 c;

    public mta(t97 t97, t97 t972, t97 t973) {
        this.a = t97;
        this.b = t972;
        this.c = t973;
    }

    public final ira a(tf3 tf3, boolean z) {
        hge hge;
        tf3 tf32 = tf3;
        int i = ((o2b) this.c.getValue()).b(tf3.n()).a;
        boolean z2 = i == 10 || i == 20 || i == 40;
        t97 t97 = this.a;
        String q = tf32.q(((f03) t97.getValue()).p(), fj0.c);
        if (tf3.t()) {
            hge = new hge(cic.p);
        } else {
            CharSequence b2 = ((q2b) this.b.getValue()).b(tf32);
            hge = b2.length() == 0 ? new hge(h2a.G) : new lge(b2);
        }
        hge hge2 = hge;
        long s = z ? ((f03) t97.getValue()).s() ^ tf3.n() : tf3.n();
        long n = tf3.n();
        long n2 = tf3.n();
        String d = tf3.d();
        if (d != null) {
            return new ira(n, n2, d, hge2, q != null ? Uri.parse(q) : null, z2, tf3.u(), new zta(s, yta.b), tf3.m(), true);
        }
        throw new IllegalArgumentException("Required value was null.".toString());
    }
}

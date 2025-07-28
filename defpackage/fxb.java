package defpackage;

import me.leolin.shortcutbadger.BuildConfig;

/* renamed from: fxb  reason: default package */
public final class fxb extends taf {
    public final le1 b;
    public final po1 c;
    public final t0c o;

    public fxb(le1 le1, po1 po1) {
        Object value;
        hge hge;
        String str;
        this.b = le1;
        this.c = po1;
        grd a = hrd.a(ixb.c);
        this.o = new t0c(a);
        do {
            value = a.getValue();
            ixb ixb = (ixb) value;
            qja d = this.c.d();
            qja qja = (qja) ((bka) ((t0c) this.c.e()).a.getValue()).c.get(this.b);
            hge = hhd.f(d.a.getId(), this.b) ? new hge(r1a.l1) : new hge(r1a.k1);
            ne1 ne1 = d.a;
            str = null;
            if (!hhd.f(ne1.getId(), this.b) && ne1.m()) {
                int i = r1a.j1;
                str = qja != null ? qja.b.getName() : str;
                str = new jge(i, cs.g0(new Object[]{str == null ? BuildConfig.FLAVOR : str}));
            }
            ixb.getClass();
        } while (!a.b(value, new ixb(hge, str)));
    }
}

package defpackage;

/* renamed from: bd9  reason: default package */
public final /* synthetic */ class bd9 implements of3 {
    public final /* synthetic */ int a;
    public final /* synthetic */ fd9 b;

    public /* synthetic */ bd9(fd9 fd9, int i) {
        this.a = i;
        this.b = fd9;
    }

    public final void accept(Object obj) {
        fd9 fd9 = this.b;
        switch (this.a) {
            case 0:
                Long l = (Long) obj;
                fd9.getClass();
                udd.n("fd9", "hideControls");
                o7f a2 = fd9.D0.a();
                a2.a = false;
                p7f p7f = new p7f(a2);
                fd9.D0 = p7f;
                ((lf9) ((ge9) fd9.b)).d(p7f);
                ed9 ed9 = fd9.y0;
                if (ed9 != null) {
                    ed9.q(false);
                    return;
                }
                return;
            case 1:
                u2f u2f = (u2f) obj;
                d1c d1c = fd9.F0;
                if (d1c != null) {
                    d1c.d = u2f;
                    udd.q("d1c", "sendVideoRePlayStat");
                    int i = d1c.b;
                    d1c.f("replay", (Object) null, (String) null, (String) null, i == 1, d1c.a(), i == 5, i == 3 ? "auto" : null);
                }
                String str = fd9.E0.d;
                ((al7) fd9.c).r(u2f, fd9);
                o7f a3 = fd9.D0.a();
                a3.n = u2f;
                a3.p = null;
                a3.q = null;
                p7f p7f2 = new p7f(a3);
                fd9.D0 = p7f2;
                lf9 lf9 = (lf9) ((ge9) fd9.b);
                lf9.d(p7f2);
                fd9.n2();
                lf9.b(fd9);
                return;
            case 2:
                fd9.d2((Throwable) obj);
                return;
            case 3:
                Long l2 = (Long) obj;
                fd9.getClass();
                o7f a4 = fd9.D0.a();
                n10 n10 = fd9.E0;
                g2b g2b = fd9.x0;
                a4.h = ete.Z(g2b, n10);
                p7f p7f3 = new p7f(a4);
                fd9.D0 = p7f3;
                ((lf9) ((ge9) fd9.b)).d(p7f3);
                if (!ete.O(g2b, fd9.E0)) {
                    tic.b(fd9.J0);
                    fd9.i2();
                    return;
                }
                return;
            default:
                Long l3 = (Long) obj;
                fd9.getClass();
                o7f a5 = fd9.D0.a();
                al7 al7 = (al7) fd9.c;
                a5.k = al7.e();
                a5.l = al7.c();
                a5.q = null;
                a5.p = null;
                p7f p7f4 = new p7f(a5);
                fd9.D0 = p7f4;
                ((lf9) ((ge9) fd9.b)).d(p7f4);
                return;
        }
    }
}

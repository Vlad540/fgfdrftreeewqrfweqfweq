package defpackage;

/* renamed from: sza  reason: default package */
public final class sza extends ax5 {
    public final /* synthetic */ int f = 0;
    public final Object g;

    public sza(vje vje, l68 l68) {
        super(vje);
        this.g = l68;
    }

    public qje g(int i, qje qje, boolean z) {
        switch (this.f) {
            case 0:
                vje vje = this.e;
                qje g2 = vje.g(i, qje, z);
                if (vje.n(g2.c, (tje) this.g, 0).a()) {
                    g2.j(qje.a, qje.b, qje.c, qje.d, qje.e, w8.g, true);
                } else {
                    g2.f = true;
                }
                return g2;
            default:
                return super.g(i, qje, z);
        }
    }

    public tje n(int i, tje tje, long j) {
        switch (this.f) {
            case 1:
                super.n(i, tje, j);
                l68 l68 = (l68) this.g;
                tje.c = l68;
                a68 a68 = l68.b;
                tje.b = a68 != null ? a68.h : null;
                return tje;
            default:
                return super.n(i, tje, j);
        }
    }

    public sza(vje vje) {
        super(vje);
        this.g = new tje();
    }
}

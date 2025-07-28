package defpackage;

/* renamed from: dd8  reason: default package */
public final /* synthetic */ class dd8 implements ld8 {
    public final /* synthetic */ int a;
    public final /* synthetic */ md8 b;

    public /* synthetic */ dd8(md8 md8, int i) {
        this.a = i;
        this.b = md8;
    }

    public final void b(ic8 ic8) {
        switch (this.a) {
            case 0:
                this.b.f.s.K0();
                return;
            case 1:
                cd8 cd8 = this.b.f;
                if (cd8.s.W() != null) {
                    cd8.s(ic8);
                    cd8.e.getClass();
                    swb.A(new p2d(-6));
                    return;
                }
                return;
            case 2:
                this.b.f.s.V();
                return;
            case 3:
                this.b.f.s.D();
                return;
            case 4:
                this.b.f.s.L0();
                return;
            case 5:
                this.b.f.s.prepare();
                return;
            case 6:
                this.b.f.s.stop();
                return;
            case 7:
                cd8 cd82 = this.b.f;
                qza qza = cd82.s;
                if (oze.c0(qza, cd82.p)) {
                    oze.I(qza);
                    return;
                } else if (qza != null && qza.t1(1)) {
                    qza.pause();
                    return;
                } else {
                    return;
                }
            case 8:
                this.b.f.s.J0();
                return;
            case 9:
                this.b.f.s.f0();
                return;
            case 10:
                this.b.f.g(ic8, true);
                return;
            default:
                qza qza2 = this.b.f.s;
                if (qza2 != null && qza2.t1(1)) {
                    qza2.pause();
                    return;
                }
                return;
        }
    }

    public /* synthetic */ dd8(md8 md8, ayb ayb) {
        this.a = 1;
        this.b = md8;
    }
}

package defpackage;

/* renamed from: jre  reason: default package */
public final class jre extends fre {
    public final /* synthetic */ int a = 1;
    public kre b;

    public /* synthetic */ jre() {
    }

    public void a(cre cre) {
        switch (this.a) {
            case 1:
                kre kre = this.b;
                if (!kre.Y0) {
                    kre.P();
                    kre.Y0 = true;
                    return;
                }
                return;
            default:
                return;
        }
    }

    public void c(cre cre) {
        switch (this.a) {
            case 1:
                kre kre = this.b;
                int i = kre.X0 - 1;
                kre.X0 = i;
                if (i == 0) {
                    kre.Y0 = false;
                    kre.o();
                }
                cre.E(this);
                return;
            default:
                return;
        }
    }

    public void g(cre cre) {
        switch (this.a) {
            case 0:
                kre kre = this.b;
                kre.V0.remove(cre);
                if (!kre.x()) {
                    kre.B(kre, bre.h0, false);
                    kre.I0 = true;
                    kre.B(kre, bre.g0, false);
                    return;
                }
                return;
            default:
                return;
        }
    }

    public jre(kre kre) {
        this.b = kre;
    }
}

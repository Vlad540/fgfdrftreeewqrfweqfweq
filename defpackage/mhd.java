package defpackage;

/* renamed from: mhd  reason: default package */
public final class mhd extends dhd {
    public final /* synthetic */ int a;
    public final dhd b;
    public final of3 c;

    public /* synthetic */ mhd(dhd dhd, of3 of3, int i) {
        this.a = i;
        this.b = dhd;
        this.c = of3;
    }

    public final void l(zhd zhd) {
        switch (this.a) {
            case 0:
                this.b.k(new i73(zhd, 6, this.c));
                return;
            case 1:
                this.b.k(new j1c(this, zhd, false, 4));
                return;
            default:
                this.b.k(new v4b(this, zhd));
                return;
        }
    }
}

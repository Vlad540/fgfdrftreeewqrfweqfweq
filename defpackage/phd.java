package defpackage;

/* renamed from: phd  reason: default package */
public final class phd extends dhd {
    public final /* synthetic */ int a;
    public final dhd b;
    public final j26 c;

    public /* synthetic */ phd(dhd dhd, j26 j26, int i) {
        this.a = i;
        this.c = j26;
        this.b = dhd;
    }

    public final void l(zhd zhd) {
        switch (this.a) {
            case 0:
                this.b.k(new ohd(0, this.c, zhd));
                return;
            case 1:
                this.b.k(new v2b(zhd, this.c, false, 7));
                return;
            default:
                this.b.k(new ohd(1, this.c, zhd));
                return;
        }
    }
}

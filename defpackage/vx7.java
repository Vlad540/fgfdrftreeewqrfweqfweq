package defpackage;

/* renamed from: vx7  reason: default package */
public final class vx7 extends n2 {
    public final /* synthetic */ int b;
    public final qmc c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public /* synthetic */ vx7(ay7 ay7, qmc qmc, int i) {
        super(ay7);
        this.b = i;
        this.c = qmc;
    }

    public final void g(wx7 wx7) {
        switch (this.b) {
            case 0:
                this.a.a(new ux7(wx7, this.c, 0));
                return;
            default:
                pn1 pn1 = new pn1(wx7);
                wx7.d(pn1);
                xi4 b2 = this.c.b(new q36((Object) pn1, 8, (Object) this.a));
                bw1 bw1 = (bw1) pn1.b;
                bw1.getClass();
                bj4.c(bw1, b2);
                return;
        }
    }
}

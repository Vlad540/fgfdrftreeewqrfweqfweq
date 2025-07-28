package defpackage;

/* renamed from: f73  reason: default package */
public final class f73 extends v63 {
    public final /* synthetic */ int a;
    public final v63 b;
    public final qmc c;

    public /* synthetic */ f73(v63 v63, qmc qmc, int i) {
        this.a = i;
        this.b = v63;
        this.c = qmc;
    }

    public final void j(g73 g73) {
        switch (this.a) {
            case 0:
                this.b.i(new e73(g73, this.c));
                return;
            default:
                e73 e73 = new e73(g73, this.b);
                g73.d(e73);
                xi4 b2 = this.c.b(e73);
                bw1 bw1 = (bw1) e73.c;
                bw1.getClass();
                bj4.c(bw1, b2);
                return;
        }
    }
}

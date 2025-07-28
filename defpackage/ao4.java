package defpackage;

/* renamed from: ao4  reason: default package */
public final /* synthetic */ class ao4 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ eo4 b;
    public final /* synthetic */ go4 c;

    public /* synthetic */ ao4(eo4 eo4, go4 go4, int i) {
        this.a = i;
        this.b = eo4;
        this.c = go4;
    }

    public final void run() {
        switch (this.a) {
            case 0:
                eo4 eo4 = this.b;
                this.c.A(eo4.a, eo4.b);
                return;
            case 1:
                eo4 eo42 = this.b;
                this.c.H(eo42.a, eo42.b);
                return;
            case 2:
                eo4 eo43 = this.b;
                this.c.F(eo43.a, eo43.b);
                return;
            default:
                eo4 eo44 = this.b;
                this.c.v(eo44.a, eo44.b);
                return;
        }
    }
}

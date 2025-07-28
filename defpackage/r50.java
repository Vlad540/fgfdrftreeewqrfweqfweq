package defpackage;

/* renamed from: r50  reason: default package */
public final /* synthetic */ class r50 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ qe4 b;
    public final /* synthetic */ z50 c;

    public /* synthetic */ r50(qe4 qe4, z50 z50, int i) {
        this.a = i;
        this.b = qe4;
        this.c = z50;
    }

    public final void run() {
        z50 z50 = this.c;
        qe4 qe4 = this.b;
        int i = this.a;
        qe4.getClass();
        switch (i) {
            case 0:
                int i2 = oze.a;
                g44 g44 = ((h45) qe4.c).a.H0;
                gd I = g44.I();
                g44.J(I, 1032, new w34(I, z50, 1));
                return;
            default:
                int i3 = oze.a;
                g44 g442 = ((h45) qe4.c).a.H0;
                gd I2 = g442.I();
                g442.J(I2, 1031, new w34(I2, z50, 0));
                return;
        }
    }
}

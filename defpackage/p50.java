package defpackage;

/* renamed from: p50  reason: default package */
public final /* synthetic */ class p50 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ qe4 b;
    public final /* synthetic */ l24 c;

    public /* synthetic */ p50(qe4 qe4, l24 l24, int i) {
        this.a = i;
        this.b = qe4;
        this.c = l24;
    }

    public final void run() {
        switch (this.a) {
            case 0:
                qe4 qe4 = this.b;
                qe4.getClass();
                int i = oze.a;
                n45 n45 = ((h45) qe4.c).a;
                n45.getClass();
                g44 g44 = n45.H0;
                gd I = g44.I();
                g44.J(I, 1007, new u34(I, this.c, 2));
                return;
            default:
                qe4 qe42 = this.b;
                l24 l24 = this.c;
                qe42.getClass();
                synchronized (l24) {
                }
                int i2 = oze.a;
                g44 g442 = ((h45) qe42.c).a.H0;
                gd e = g442.e((se8) g442.o.e);
                g442.J(e, 1013, new u34(e, l24, 0));
                return;
        }
    }
}

package defpackage;

/* renamed from: i8f  reason: default package */
public final /* synthetic */ class i8f implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ v4b b;
    public final /* synthetic */ l24 c;

    public /* synthetic */ i8f(v4b v4b, l24 l24, int i) {
        this.a = i;
        this.b = v4b;
        this.c = l24;
    }

    public final void run() {
        switch (this.a) {
            case 0:
                v4b v4b = this.b;
                v4b.getClass();
                int i = oze.a;
                n45 n45 = ((h45) v4b.c).a;
                n45.getClass();
                g44 g44 = n45.H0;
                gd I = g44.I();
                g44.J(I, 1015, new u34(I, this.c, 1));
                return;
            default:
                v4b v4b2 = this.b;
                l24 l24 = this.c;
                v4b2.getClass();
                synchronized (l24) {
                }
                int i2 = oze.a;
                g44 g442 = ((h45) v4b2.c).a.H0;
                gd e = g442.e((se8) g442.o.e);
                g442.J(e, 1020, new j9(e, 27, l24));
                return;
        }
    }
}

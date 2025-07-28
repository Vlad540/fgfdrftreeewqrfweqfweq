package defpackage;

/* renamed from: x50  reason: default package */
public final /* synthetic */ class x50 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ otf b;
    public final /* synthetic */ l24 c;

    public /* synthetic */ x50(otf otf, l24 l24, int i) {
        this.a = i;
        this.b = otf;
        this.c = l24;
    }

    public final void run() {
        switch (this.a) {
            case 0:
                otf otf = this.b;
                otf.getClass();
                int i = mze.a;
                m45 m45 = ((g45) otf.b).a;
                m45.getClass();
                f44 f44 = m45.G0;
                fd P = f44.P();
                f44.Q(P, 1007, new z34(P, this.c, 3));
                return;
            default:
                otf otf2 = this.b;
                l24 l24 = this.c;
                otf2.getClass();
                synchronized (l24) {
                }
                int i2 = mze.a;
                f44 f442 = ((g45) otf2.b).a.G0;
                f442.Q(f442.M((re8) f442.o.e), 1013, new t34(11));
                return;
        }
    }
}

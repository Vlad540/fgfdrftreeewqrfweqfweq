package defpackage;

/* renamed from: g8f  reason: default package */
public final /* synthetic */ class g8f implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ long c;
    public final /* synthetic */ Object o;

    public /* synthetic */ g8f(Object obj, int i, long j, int i2) {
        this.a = i2;
        this.o = obj;
        this.b = i;
        this.c = j;
    }

    public final void run() {
        long j = this.c;
        int i = this.b;
        Object obj = this.o;
        switch (this.a) {
            case 0:
                d4b d4b = (d4b) obj;
                d4b.getClass();
                int i2 = mze.a;
                f44 f44 = ((g45) d4b.c).a.G0;
                fd M = f44.M((re8) f44.o.e);
                f44.Q(M, 1018, new x34(M, i, j));
                return;
            default:
                v4b v4b = (v4b) obj;
                v4b.getClass();
                int i3 = oze.a;
                g44 g44 = ((h45) v4b.c).a.H0;
                gd e = g44.e((se8) g44.o.e);
                g44.J(e, 1018, new p34(e, i, j));
                return;
        }
    }
}

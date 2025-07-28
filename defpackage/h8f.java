package defpackage;

/* renamed from: h8f  reason: default package */
public final /* synthetic */ class h8f implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ d4b b;
    public final /* synthetic */ l24 c;

    public /* synthetic */ h8f(d4b d4b, l24 l24, int i) {
        this.a = i;
        this.b = d4b;
        this.c = l24;
    }

    public final void run() {
        switch (this.a) {
            case 0:
                d4b d4b = this.b;
                l24 l24 = this.c;
                d4b.getClass();
                synchronized (l24) {
                }
                int i = mze.a;
                f44 f44 = ((g45) d4b.c).a.G0;
                f44.Q(f44.M((re8) f44.o.e), 1020, new t34(10));
                return;
            default:
                d4b d4b2 = this.b;
                d4b2.getClass();
                int i2 = mze.a;
                m45 m45 = ((g45) d4b2.c).a;
                m45.getClass();
                f44 f442 = m45.G0;
                fd P = f442.P();
                f442.Q(P, 1015, new t34((Object) P, 6, (Object) this.c));
                return;
        }
    }
}

package defpackage;

/* renamed from: rx4  reason: default package */
public final /* synthetic */ class rx4 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ tx4 b;
    public final /* synthetic */ sn1 c;

    public /* synthetic */ rx4(tx4 tx4, sn1 sn1, int i) {
        this.a = i;
        this.b = tx4;
        this.c = sn1;
    }

    public final void run() {
        switch (this.a) {
            case 0:
                this.c.b(this.b.b);
                return;
            default:
                tx4 tx4 = this.b;
                gs0 gs0 = tx4.b;
                gs0 gs02 = gs0.a;
                sn1 sn1 = this.c;
                if (gs0 == gs02) {
                    xx4 xx4 = tx4.o;
                    ch7 a2 = xx4.a();
                    ct0.C(a2, sn1);
                    sn1.a(new sx4(tx4, a2, 0), pa2.j());
                    tx4.c.add(a2);
                    a2.c(new sx4(tx4, a2, 1), xx4.h);
                    return;
                } else if (gs0 == gs0.b) {
                    sn1.d(new IllegalStateException("BufferProvider is not active."));
                    return;
                } else {
                    sn1.d(new IllegalStateException("Unknown state: " + tx4.b));
                    return;
                }
        }
    }
}

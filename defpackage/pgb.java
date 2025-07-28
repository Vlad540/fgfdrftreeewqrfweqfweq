package defpackage;

/* renamed from: pgb  reason: default package */
public final /* synthetic */ class pgb implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ ygb b;

    public /* synthetic */ pgb(ygb ygb, int i) {
        this.a = i;
        this.b = ygb;
    }

    public final void run() {
        switch (this.a) {
            case 0:
                this.b.W0 = true;
                return;
            case 1:
                this.b.q();
                return;
            default:
                ygb ygb = this.b;
                if (!ygb.c1) {
                    q88 q88 = ygb.G0;
                    q88.getClass();
                    q88.j(ygb);
                    return;
                }
                return;
        }
    }
}

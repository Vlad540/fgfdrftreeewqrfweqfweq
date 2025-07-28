package defpackage;

/* renamed from: p5c  reason: default package */
public final /* synthetic */ class p5c implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ y5c b;
    public final /* synthetic */ na0 c;

    public /* synthetic */ p5c(y5c y5c, na0 na0, int i) {
        this.a = i;
        this.b = y5c;
        this.c = na0;
    }

    public final void run() {
        switch (this.a) {
            case 0:
                this.b.t(this.c);
                return;
            default:
                y5c y5c = this.b;
                if (y5c.q == this.c && !y5c.r) {
                    if (y5c.n()) {
                        y5c.H.k();
                    }
                    hx4 hx4 = y5c.F;
                    if (hx4 != null) {
                        ((xx4) hx4).k();
                        na0 na0 = y5c.q;
                        na0.n(new f8f(na0.w0, y5c.k()));
                        return;
                    }
                    y5c.d0 = true;
                    return;
                }
                return;
        }
    }
}

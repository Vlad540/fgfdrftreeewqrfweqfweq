package defpackage;

/* renamed from: w35  reason: default package */
public final /* synthetic */ class w35 implements lh7 {
    public final /* synthetic */ int a;
    public final /* synthetic */ uxa b;

    public /* synthetic */ w35(uxa uxa, int i) {
        this.a = i;
        this.b = uxa;
    }

    public final void invoke(Object obj) {
        hya hya = (hya) obj;
        switch (this.a) {
            case 0:
                hya.r0(this.b.f);
                return;
            case 1:
                hya.x0(this.b.f);
                return;
            case 2:
                hya.X((spe) this.b.i.Y);
                return;
            case 3:
                uxa uxa = this.b;
                hya.o(uxa.g);
                hya.c(uxa.g);
                return;
            case 4:
                uxa uxa2 = this.b;
                hya.l(uxa2.e, uxa2.l);
                return;
            case 5:
                hya.h(this.b.e);
                return;
            case 6:
                uxa uxa3 = this.b;
                hya.d(uxa3.m, uxa3.l);
                return;
            case 7:
                hya.b(this.b.n);
                return;
            case 8:
                hya.n(this.b.k());
                return;
            default:
                hya.p0(this.b.o);
                return;
        }
    }
}

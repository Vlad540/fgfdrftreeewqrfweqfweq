package defpackage;

/* renamed from: i48  reason: default package */
public final /* synthetic */ class i48 implements lh7 {
    public final /* synthetic */ int a;
    public final /* synthetic */ fza b;
    public final /* synthetic */ Integer c;

    public /* synthetic */ i48(fza fza, Integer num, int i) {
        this.a = i;
        this.b = fza;
        this.c = num;
    }

    public final void invoke(Object obj) {
        hya hya = (hya) obj;
        switch (this.a) {
            case 0:
                hya.f0(this.b.j, this.c.intValue());
                return;
            case 1:
                fza fza = this.b;
                hya.q(fza.d, fza.e, this.c.intValue());
                return;
            default:
                hya.d(this.c.intValue(), this.b.t);
                return;
        }
    }
}

package defpackage;

/* renamed from: obe  reason: default package */
public final /* synthetic */ class obe implements s16 {
    public final /* synthetic */ int a;
    public final /* synthetic */ pbe b;

    public /* synthetic */ obe(fp fpVar, int i) {
        this.a = i;
        this.b = fpVar;
    }

    public final Object invoke() {
        switch (this.a) {
            case 0:
                pbe pbe = this.b;
                o54 o54 = pbe.b;
                return new ae5(pbe.a, pbe.a(), (h7a) pbe.d.getValue(), o54);
            default:
                pbe pbe2 = this.b;
                o54 o542 = pbe2.b;
                return new zt4(pbe2.a, pbe2.a(), (h7a) pbe2.d.getValue(), o542, (yt4) pbe2.c.getValue());
        }
    }
}

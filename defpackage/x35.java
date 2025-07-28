package defpackage;

/* renamed from: x35  reason: default package */
public final /* synthetic */ class x35 implements kh7 {
    public final /* synthetic */ int a;
    public final /* synthetic */ txa b;
    public final /* synthetic */ int c;

    public /* synthetic */ x35(txa txa, int i, int i2) {
        this.a = i2;
        this.b = txa;
        this.c = i;
    }

    public final void invoke(Object obj) {
        gya gya = (gya) obj;
        switch (this.a) {
            case 0:
                uje uje = this.b.a;
                gya.y(this.c);
                return;
            default:
                gya.d(this.c, this.b.l);
                return;
        }
    }
}

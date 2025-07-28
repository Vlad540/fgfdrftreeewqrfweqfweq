package defpackage;

/* renamed from: vdc  reason: default package */
public final /* synthetic */ class vdc implements s16 {
    public final /* synthetic */ int a;
    public final /* synthetic */ xdc b;

    public /* synthetic */ vdc(xdc xdc, int i) {
        this.a = i;
        this.b = xdc;
    }

    public final Object invoke() {
        switch (this.a) {
            case 0:
                return this.b.a.m().w();
            case 1:
                return this.b.a.m().N();
            default:
                return this.b.a.m().F();
        }
    }
}

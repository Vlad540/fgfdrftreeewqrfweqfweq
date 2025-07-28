package defpackage;

/* renamed from: wac  reason: default package */
public final /* synthetic */ class wac implements tn1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ xac b;

    public /* synthetic */ wac(xac xac, int i) {
        this.a = i;
        this.b = xac;
    }

    public final String z(sn1 sn1) {
        switch (this.a) {
            case 0:
                this.b.e = sn1;
                return "CaptureCompleteFuture";
            default:
                this.b.f = sn1;
                return "RequestCompleteFuture";
        }
    }
}

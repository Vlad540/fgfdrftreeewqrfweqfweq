package defpackage;

/* renamed from: t3f  reason: default package */
public final /* synthetic */ class t3f implements tn1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ vj4 b;

    public /* synthetic */ t3f(vj4 vj4, int i) {
        this.a = i;
        this.b = vj4;
    }

    public final String z(sn1 sn1) {
        switch (this.a) {
            case 0:
                vj4 vj4 = this.b;
                vj4.l = sn1;
                return "ReleasedFuture " + vj4;
            default:
                vj4 vj42 = this.b;
                vj42.n = sn1;
                return "ReadyToReleaseFuture " + vj42;
        }
    }
}

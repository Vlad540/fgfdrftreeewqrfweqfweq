package defpackage;

/* renamed from: n36  reason: default package */
public final /* synthetic */ class n36 implements tn1, au {
    public final /* synthetic */ int a;
    public final /* synthetic */ ch7 b;

    public /* synthetic */ n36(ch7 ch7, int i) {
        this.a = i;
        this.b = ch7;
    }

    public ch7 apply(Object obj) {
        switch (this.a) {
            case 2:
                vs1 vs1 = (vs1) obj;
                return ((vs1) this.b.get()).a();
            default:
                Void voidR = (Void) obj;
                return ((vs1) this.b.get()).b();
        }
    }

    public String z(sn1 sn1) {
        switch (this.a) {
            case 0:
                ya4 ya4 = new ya4(sn1, 1);
                mh4 j = pa2.j();
                ch7 ch7 = this.b;
                ch7.c(ya4, j);
                return "transformVoidFuture [" + ch7 + "]";
            default:
                mh4 j2 = pa2.j();
                ch7 ch72 = this.b;
                ct0.D(false, ch72, sn1, j2);
                return "nonCancellationPropagating[" + ch72 + "]";
        }
    }
}

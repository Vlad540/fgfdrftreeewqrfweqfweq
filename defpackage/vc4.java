package defpackage;

/* renamed from: vc4  reason: default package */
public final /* synthetic */ class vc4 implements tn1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ xc4 b;

    public /* synthetic */ vc4(xc4 xc4, int i) {
        this.a = i;
        this.b = xc4;
    }

    public final String z(sn1 sn1) {
        int i = this.a;
        xc4 xc4 = this.b;
        switch (i) {
            case 0:
                synchronized (xc4.a) {
                    xc4.d = sn1;
                }
                return "DeferrableSurface-termination(" + xc4 + ")";
            default:
                synchronized (xc4.a) {
                    xc4.f = sn1;
                }
                return "DeferrableSurface-close(" + xc4 + ")";
        }
    }
}

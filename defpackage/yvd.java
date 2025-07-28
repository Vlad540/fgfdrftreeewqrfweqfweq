package defpackage;

import java.util.function.UnaryOperator;

/* renamed from: yvd  reason: default package */
public final /* synthetic */ class yvd implements UnaryOperator {
    public final /* synthetic */ int a;
    public final /* synthetic */ fvd b;

    public /* synthetic */ yvd(fvd fvd, int i) {
        this.a = i;
        this.b = fvd;
    }

    public final Object apply(Object obj) {
        xvd xvd = (xvd) obj;
        switch (this.a) {
            case 0:
                return new xvd(xvd.a, this.b.b);
            default:
                return new xvd(xvd.a, this.b.b);
        }
    }
}

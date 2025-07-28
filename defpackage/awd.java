package defpackage;

import java.util.function.UnaryOperator;

/* renamed from: awd  reason: default package */
public final /* synthetic */ class awd implements UnaryOperator {
    public final /* synthetic */ int a;
    public final /* synthetic */ String b;

    public /* synthetic */ awd(String str, int i) {
        this.a = i;
        this.b = str;
    }

    public final Object apply(Object obj) {
        switch (this.a) {
            case 0:
                xvd xvd = (xvd) obj;
                return new xvd(this.b, 2);
            default:
                mwd mwd = (mwd) obj;
                return new mwd(this.b, 1);
        }
    }
}

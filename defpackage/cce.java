package defpackage;

import java.util.function.UnaryOperator;

/* renamed from: cce  reason: default package */
public final /* synthetic */ class cce implements UnaryOperator {
    public final /* synthetic */ int a;
    public final /* synthetic */ dce b;

    public /* synthetic */ cce(dce dce, int i) {
        this.a = i;
        this.b = dce;
    }

    public final Object apply(Object obj) {
        switch (this.a) {
            case 0:
                u1d u1d = (u1d) obj;
                if (u1d != null) {
                    u1d.d(false);
                }
                return this.b.g();
            default:
                return dce.d(this.b, (u1d) obj);
        }
    }
}

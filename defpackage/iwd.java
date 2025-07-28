package defpackage;

import java.util.function.UnaryOperator;

/* renamed from: iwd  reason: default package */
public final /* synthetic */ class iwd implements UnaryOperator {
    public final /* synthetic */ int a;
    public final /* synthetic */ gvd b;

    public /* synthetic */ iwd(gvd gvd, int i) {
        this.a = i;
        this.b = gvd;
    }

    public final Object apply(Object obj) {
        switch (this.a) {
            case 0:
                Long l = (Long) obj;
                return Long.valueOf(this.b.b);
            case 1:
                return new mwd(this.b.b, ((mwd) obj).b);
            default:
                return new mwd(this.b.b, ((mwd) obj).b);
        }
    }
}

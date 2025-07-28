package defpackage;

import java.util.function.Function;

/* renamed from: fi3  reason: default package */
public final /* synthetic */ class fi3 implements Function {
    public final /* synthetic */ int a;

    public /* synthetic */ fi3(int i) {
        this.a = i;
    }

    public final Object apply(Object obj) {
        switch (this.a) {
            case 0:
                return ((ii3) obj).c;
            case 1:
                return ((km3) obj).b;
            case 2:
                return Long.valueOf(((uj3) obj).a);
            case 3:
                return Long.valueOf(((prc) obj).o.a);
            case 4:
                return Long.valueOf(((prc) obj).X.n());
            case 5:
                return ((ii3) obj).a();
            case 6:
                return Long.valueOf(((prc) obj).o.b.a);
            default:
                return Long.valueOf(((prc) obj).X.n());
        }
    }
}

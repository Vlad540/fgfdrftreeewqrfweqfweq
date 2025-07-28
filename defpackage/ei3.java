package defpackage;

import java.util.Objects;
import java.util.function.Predicate;

/* renamed from: ei3  reason: default package */
public final /* synthetic */ class ei3 implements Predicate {
    public final /* synthetic */ int a;

    public /* synthetic */ ei3(int i) {
        this.a = i;
    }

    public final boolean test(Object obj) {
        switch (this.a) {
            case 0:
                return Objects.isNull((ii3) obj);
            case 1:
                return ((prc) obj).o != null;
            case 2:
                return ((prc) obj).X != null;
            case 3:
                return ((prc) obj).o != null;
            default:
                return ((prc) obj).X != null;
        }
    }
}

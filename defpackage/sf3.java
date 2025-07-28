package defpackage;

import java.util.function.IntPredicate;

/* renamed from: sf3  reason: default package */
public final /* synthetic */ class sf3 implements IntPredicate {
    public final /* synthetic */ int a;

    public /* synthetic */ sf3(int i) {
        this.a = i;
    }

    public final boolean test(int i) {
        switch (this.a) {
            case 0:
                return i == 1;
            default:
                return a24.R(i) || i == 8205 || i == 8419;
        }
    }
}

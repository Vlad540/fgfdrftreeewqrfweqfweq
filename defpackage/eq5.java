package defpackage;

import java.util.function.Predicate;

/* renamed from: eq5  reason: default package */
public final /* synthetic */ class eq5 implements Predicate {
    public final /* synthetic */ int a;
    public final /* synthetic */ u16 b;

    public /* synthetic */ eq5(int i, u16 u16) {
        this.a = i;
        this.b = u16;
    }

    public final boolean test(Object obj) {
        switch (this.a) {
            case 0:
                return ((Boolean) this.b.invoke(obj)).booleanValue();
            case 1:
                return ((Boolean) this.b.invoke(obj)).booleanValue();
            case 2:
                return ((Boolean) this.b.invoke(obj)).booleanValue();
            default:
                return ((Boolean) this.b.invoke(obj)).booleanValue();
        }
    }
}

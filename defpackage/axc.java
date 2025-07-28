package defpackage;

import java.util.Set;
import java.util.function.UnaryOperator;

/* renamed from: axc  reason: default package */
public final /* synthetic */ class axc implements UnaryOperator {
    public final /* synthetic */ long a;

    public /* synthetic */ axc(long j) {
        this.a = j;
    }

    public final Object apply(Object obj) {
        Set v0 = o23.v0((Set) obj);
        v0.removeIf(new eq5(3, new je2(this.a, 6)));
        return v0;
    }
}

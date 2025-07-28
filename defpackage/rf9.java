package defpackage;

import kotlinx.coroutines.internal.ContextScope;
import one.me.android.di.ConcurrentComponent;

/* renamed from: rf9  reason: default package */
public final class rf9 implements vw9 {
    public static final rf9 a = new Object();
    public static final ContextScope b = n1g.a(ConcurrentComponent.INSTANCE.getDispatchers().a().limitedParallelism(1, "mytracker").plus(lp.a()));
    public static final hcd c;
    public static final s0c d;

    /* JADX WARNING: type inference failed for: r0v0, types: [rf9, java.lang.Object] */
    static {
        hcd b2 = icd.b(1, 0, 2, 2);
        c = b2;
        d = new s0c(b2);
    }
}

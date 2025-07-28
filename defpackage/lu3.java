package defpackage;

import java.util.concurrent.CancellationException;
import java.util.function.BinaryOperator;

/* renamed from: lu3  reason: default package */
public final /* synthetic */ class lu3 implements BinaryOperator {
    public final Object apply(Object obj, Object obj2) {
        g37 g37 = (g37) obj;
        g37 g372 = (g37) obj2;
        if (g37 != null) {
            g37.cancel((CancellationException) null);
        }
        return g372;
    }
}

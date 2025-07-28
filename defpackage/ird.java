package defpackage;

import java.util.concurrent.atomic.AtomicReference;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.internal.Concurrent_commonKt;

/* renamed from: ird  reason: default package */
public final class ird extends q3 {
    public final AtomicReference a = new AtomicReference((Object) null);

    public final boolean a(p3 p3Var) {
        grd grd = (grd) p3Var;
        AtomicReference atomicReference = this.a;
        if (Concurrent_commonKt.getValue(atomicReference) != null) {
            return false;
        }
        Concurrent_commonKt.setValue(atomicReference, hrd.a);
        return true;
    }

    public final Continuation[] b(p3 p3Var) {
        grd grd = (grd) p3Var;
        Concurrent_commonKt.setValue(this.a, null);
        return js.a;
    }
}

package defpackage;

import kotlin.coroutines.Continuation;
import kotlinx.coroutines.internal.ContextScope;

/* renamed from: vva  reason: default package */
public final class vva {
    public final hcd a = icd.b(0, 0, 0, 7);
    public final ContextScope b;

    public vva(tt0 tt0, pae pae) {
        this.b = n1g.a(((n3a) pae).c());
        tt0.d(this);
    }

    /* JADX WARNING: type inference failed for: r5v3, types: [bqc, java.lang.Object] */
    @a1e
    public final void onEvent(mw2 mw2) {
        zb9 zb9 = new zb9((Object) null);
        for (Number longValue : mw2.b) {
            zb9.a(longValue.longValue());
        }
        xs7.E(this.b, (hu3) null, (ru3) null, new uva(this, new Object(), (Continuation) null), 3);
    }
}

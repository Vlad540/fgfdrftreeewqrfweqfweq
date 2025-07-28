package defpackage;

import kotlin.coroutines.Continuation;
import kotlinx.coroutines.internal.ContextScope;

/* renamed from: i92  reason: default package */
public final class i92 {
    public final hcd a = icd.b(0, 0, 0, 7);
    public final ContextScope b;

    public i92(tt0 tt0, pae pae) {
        this.b = n1g.a(((n3a) pae).c());
        tt0.d(this);
    }

    @a1e
    public final void onEvent(g92 g92) {
        xs7.E(this.b, (hu3) null, (ru3) null, new h92(this, g92, (Continuation) null), 3);
    }
}

package defpackage;

import kotlin.coroutines.Continuation;
import kotlinx.coroutines.internal.ContextScope;

/* renamed from: u92  reason: default package */
public final class u92 {
    public final hcd a = icd.b(0, 0, 0, 7);
    public final ContextScope b;

    public u92(tt0 tt0, pae pae) {
        this.b = n1g.a(((n3a) pae).c());
        tt0.d(this);
    }

    @a1e
    public final void onEvent(s92 s92) {
        xs7.E(this.b, (hu3) null, (ru3) null, new t92(this, s92, (Continuation) null), 3);
    }
}

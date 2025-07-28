package defpackage;

import kotlin.coroutines.Continuation;
import kotlinx.coroutines.internal.ContextScope;

/* renamed from: td7  reason: default package */
public final class td7 {
    public final hcd a = icd.b(0, 0, 0, 7);
    public final ContextScope b;

    public td7(tt0 tt0, pae pae) {
        this.b = n1g.a(((n3a) pae).c());
        tt0.d(this);
    }

    @a1e
    public final void onEvent(qd7 qd7) {
        xs7.E(this.b, (hu3) null, (ru3) null, new rd7(this, qd7, (Continuation) null), 3);
    }

    @a1e
    public final void onEvent(jh0 jh0) {
        xs7.E(this.b, (hu3) null, (ru3) null, new sd7(this, jh0, (Continuation) null), 3);
    }
}

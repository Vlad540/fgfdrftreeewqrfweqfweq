package defpackage;

import kotlin.coroutines.Continuation;
import kotlinx.coroutines.internal.ContextScope;

/* renamed from: mqa  reason: default package */
public final class mqa {
    public final hcd a = icd.b(0, 0, 0, 7);
    public final ContextScope b;

    public mqa(tt0 tt0, pae pae) {
        this.b = n1g.a(((n3a) pae).a());
        tt0.d(this);
    }

    @a1e
    public final void onEvent(vh2 vh2) {
        xs7.E(this.b, (hu3) null, (ru3) null, new kqa(this, vh2, (Continuation) null), 3);
    }

    @a1e
    public final void onEvent(jh0 jh0) {
        xs7.E(this.b, (hu3) null, (ru3) null, new lqa(this, jh0, (Continuation) null), 3);
    }
}

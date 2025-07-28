package defpackage;

import kotlin.coroutines.Continuation;
import kotlinx.coroutines.internal.ContextScope;

/* renamed from: yv3  reason: default package */
public final class yv3 {
    public final hcd a = icd.b(0, 0, 0, 7);
    public final ContextScope b;

    public yv3(tt0 tt0, pae pae) {
        this.b = n1g.a(((n3a) pae).a());
        tt0.d(this);
    }

    @a1e
    public final void onEvent(l02 l02) {
        xs7.E(this.b, (hu3) null, (ru3) null, new wv3(this, l02, (Continuation) null), 3);
    }

    @a1e
    public final void onEvent(jh0 jh0) {
        xs7.E(this.b, (hu3) null, (ru3) null, new xv3(this, jh0, (Continuation) null), 3);
    }
}

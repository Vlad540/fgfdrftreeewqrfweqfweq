package defpackage;

import kotlin.coroutines.Continuation;
import kotlinx.coroutines.internal.ContextScope;

/* renamed from: k19  reason: default package */
public final class k19 {
    public final hcd a = icd.b(0, 0, 0, 7);
    public final ContextScope b;

    public k19(tt0 tt0, pae pae) {
        this.b = n1g.a(((n3a) pae).c());
        tt0.d(this);
    }

    @a1e
    public final void onEvent(bk4 bk4) {
        xs7.E(this.b, (hu3) null, (ru3) null, new j19(this, new g19(bk4.X, bk4.o), (Continuation) null), 3);
    }

    @a1e
    public final void onEvent(dk4 dk4) {
        xs7.E(this.b, (hu3) null, (ru3) null, new j19(this, new h19(dk4.o, dk4.c), (Continuation) null), 3);
    }
}

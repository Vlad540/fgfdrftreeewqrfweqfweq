package defpackage;

import kotlin.coroutines.Continuation;
import kotlinx.coroutines.internal.ContextScope;

/* renamed from: ng0  reason: default package */
public final class ng0 {
    public final hcd a;
    public final s0c b;
    public final ContextScope c;

    public ng0(tt0 tt0, pae pae) {
        hcd b2 = icd.b(0, 0, 0, 7);
        this.a = b2;
        this.b = new s0c(b2);
        this.c = n1g.a(((n3a) pae).c());
        tt0.d(this);
    }

    @a1e
    public final void onBaseError(jh0 jh0) {
        xs7.E(this.c, (hu3) null, (ru3) null, new mg0(this, jh0, (Continuation) null), 3);
    }
}

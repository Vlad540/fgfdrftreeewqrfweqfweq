package defpackage;

import kotlin.coroutines.Continuation;
import kotlinx.coroutines.internal.ContextScope;

/* renamed from: rj3  reason: default package */
public final class rj3 {
    public final hcd a = icd.b(0, 0, 0, 7);
    public final ContextScope b;

    public rj3(tt0 tt0, pae pae) {
        this.b = n1g.a(((n3a) pae).a());
        tt0.d(this);
    }

    public final pj5 a() {
        return new s0c(this.a);
    }

    @a1e
    public final void onEvent(to7 to7) {
        xs7.E(this.b, (hu3) null, (ru3) null, new nj3(this, (Continuation) null), 3);
    }

    @a1e
    public final void onEvent(epa epa) {
        xs7.E(this.b, (hu3) null, (ru3) null, new oj3(this, (Continuation) null), 3);
    }

    @a1e
    public final void onEvent(lp3 lp3) {
        xs7.E(this.b, (hu3) null, (ru3) null, new pj3(this, lp3, (Continuation) null), 3);
    }

    @a1e
    public final void onEvent(fve fve) {
        xs7.E(this.b, (hu3) null, (ru3) null, new qj3(this, (Continuation) null), 3);
    }
}

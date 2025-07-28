package defpackage;

import kotlin.coroutines.Continuation;
import kotlinx.coroutines.internal.ContextScope;

/* renamed from: jp1  reason: default package */
public final class jp1 {
    public final hcd a = icd.b(0, 0, 0, 7);
    public final ContextScope b;

    public jp1(t97 t97, t97 t972) {
        this.b = n1g.a(((pae) t972.getValue()).c());
        ((tt0) t97.getValue()).d(this);
    }

    @a1e
    public final void onEvent(mp7 mp7) {
        xs7.E(this.b, (hu3) null, (ru3) null, new fp1(this, (Continuation) null), 3);
    }

    @a1e
    public final void onEvent(lp3 lp3) {
        xs7.E(this.b, (hu3) null, (ru3) null, new gp1(this, lp3, (Continuation) null), 3);
    }

    @a1e
    public final void onEvent(qd7 qd7) {
        xs7.E(this.b, (hu3) null, (ru3) null, new hp1(this, qd7, (Continuation) null), 3);
    }

    @a1e
    public final void onEvent(jh0 jh0) {
        xs7.E(this.b, (hu3) null, (ru3) null, new ip1(this, jh0, (Continuation) null), 3);
    }
}

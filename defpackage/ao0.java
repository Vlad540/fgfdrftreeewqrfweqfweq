package defpackage;

import kotlin.coroutines.Continuation;
import kotlinx.coroutines.internal.ContextScope;

/* renamed from: ao0  reason: default package */
public final class ao0 {
    public final t97 a;
    public final hcd b = icd.b(0, 0, 0, 7);
    public final ContextScope c;

    public ao0(t97 t97, t97 t972) {
        this.a = t97;
        this.c = n1g.a(((pae) t972.getValue()).a());
        ((tt0) t97.getValue()).d(this);
    }

    @a1e
    public final void onEvent(lp3 lp3) {
        xs7.E(this.c, (hu3) null, (ru3) null, new xn0(this, lp3, (Continuation) null), 3);
    }

    @a1e
    public final void onEvent(ik3 ik3) {
        xs7.E(this.c, (hu3) null, (ru3) null, new yn0(this, ik3, (Continuation) null), 3);
    }

    @a1e
    public final void onEvent(jh0 jh0) {
        xs7.E(this.c, (hu3) null, (ru3) null, new zn0(this, jh0, (Continuation) null), 3);
    }
}

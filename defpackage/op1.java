package defpackage;

import kotlin.coroutines.Continuation;
import kotlinx.coroutines.internal.ContextScope;

/* renamed from: op1  reason: default package */
public final class op1 {
    public final hcd a = icd.b(0, 0, 0, 7);
    public final ContextScope b;

    public op1(t97 t97) {
        t97 t972 = mqc.o;
        this.b = n1g.a(((pae) t97.getValue()).c());
        ((tt0) t972.getValue()).d(this);
    }

    @a1e
    public final void onEvent(m21 m21) {
        xs7.E(this.b, (hu3) null, (ru3) null, new mp1(this, m21, (Continuation) null), 3);
    }

    @a1e
    public final void onEvent(jh0 jh0) {
        xs7.E(this.b, (hu3) null, (ru3) null, new np1(this, jh0, (Continuation) null), 3);
    }
}

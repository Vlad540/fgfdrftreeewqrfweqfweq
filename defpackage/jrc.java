package defpackage;

import kotlin.coroutines.Continuation;
import kotlinx.coroutines.internal.ContextScope;

/* renamed from: jrc  reason: default package */
public final class jrc {
    public final hcd a = icd.b(0, 0, 0, 7);
    public final ContextScope b;

    public jrc() {
        t97 t97 = mqc.o;
        t97 t972 = mqc.l;
        this.b = n1g.a(((pae) t972.getValue()).c());
        ((tt0) t97.getValue()).d(this);
    }

    @a1e
    public final void onEvent(li2 li2) {
        xs7.E(this.b, (hu3) null, (ru3) null, new hrc(this, li2, (Continuation) null), 3);
    }

    @a1e
    public final void onEvent(jh0 jh0) {
        xs7.E(this.b, (hu3) null, (ru3) null, new irc(this, jh0, (Continuation) null), 3);
    }
}

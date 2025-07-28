package defpackage;

import kotlin.coroutines.Continuation;
import kotlinx.coroutines.internal.ContextScope;

/* renamed from: m5d  reason: default package */
public final class m5d {
    public final t97 a;
    public final hcd b = icd.b(0, 0, 0, 7);
    public final ContextScope c;

    public m5d(t97 t97, pae pae) {
        this.a = t97;
        this.c = n1g.a(((n3a) pae).a());
        ((tt0) t97.getValue()).d(this);
    }

    @a1e
    public final void onEvent(fd3 fd3) {
        throw null;
    }

    @a1e
    public final void onEvent(t3d t3d) {
        xs7.E(this.c, (hu3) null, (ru3) null, new j5d(this, t3d, (Continuation) null), 3);
    }

    @a1e
    public final void onEvent(r3d r3d) {
        xs7.E(this.c, (hu3) null, (ru3) null, new k5d(this, r3d, (Continuation) null), 3);
    }

    @a1e
    public final void onEvent(jh0 jh0) {
        xs7.E(this.c, (hu3) null, (ru3) null, new l5d(this, jh0, (Continuation) null), 3);
    }
}

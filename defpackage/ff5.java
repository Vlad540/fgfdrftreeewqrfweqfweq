package defpackage;

import kotlin.coroutines.Continuation;
import kotlinx.coroutines.internal.ContextScope;

/* renamed from: ff5  reason: default package */
public final class ff5 {
    public final tt0 a;
    public final hcd b = icd.b(0, 0, 0, 7);
    public final ContextScope c;

    public ff5(tt0 tt0, pae pae) {
        this.a = tt0;
        this.c = n1g.a(((n3a) pae).c());
        tt0.d(this);
    }

    @a1e
    public final void onEvent(hg5 hg5) {
        if (pa2.i.equals(hg5.c)) {
            xs7.E(this.c, (hu3) null, (ru3) null, new df5(this, (Continuation) null), 3);
        }
    }

    @a1e
    public final void onEvent(oxc oxc) {
        if ("file.local.max.size.reached".equals(oxc.b)) {
            xs7.E(this.c, (hu3) null, (ru3) null, new ef5(this, (Continuation) null), 3);
        }
    }
}

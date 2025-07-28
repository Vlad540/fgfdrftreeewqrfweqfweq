package defpackage;

import kotlin.coroutines.Continuation;
import kotlinx.coroutines.internal.ContextScope;

/* renamed from: yi8  reason: default package */
public final class yi8 {
    public final hcd a;
    public final ContextScope b;
    public final ck5 c;

    public yi8(tt0 tt0, pae pae) {
        hcd b2 = icd.b(0, 0, 0, 7);
        this.a = b2;
        this.b = n1g.a(((n3a) pae).c());
        int i = zp4.o;
        this.c = vx3.h(b2, mt0.P(1000, eq4.MILLISECONDS), new vg0(16));
        tt0.d(this);
    }

    public final void a() {
        xs7.E(this.b, (hu3) null, (ru3) null, new ti8(this, (Continuation) null), 3);
    }

    @a1e
    public final void onEvent(to7 to7) {
        a();
    }

    @a1e
    public final void onEvent(epa epa) {
        a();
    }

    @a1e
    public final void onEvent(lp3 lp3) {
        a();
    }

    @a1e
    public final void onEvent(fve fve) {
        a();
    }

    @a1e
    public final void onEvent(mw2 mw2) {
        a();
    }
}

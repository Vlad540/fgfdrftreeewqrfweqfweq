package defpackage;

import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.internal.ContextScope;

/* renamed from: q65  reason: default package */
public final class q65 {
    public final tt0 a;
    public final hcd b = icd.b(0, 0, 0, 7);
    public final ContextScope c;
    public final Long d;

    public q65(pae pae, tt0 tt0, long j, s62 s62, t97 t97) {
        int i;
        t0c t0c;
        this.a = tt0;
        this.c = n1g.a(((n3a) pae).c());
        tt0.d(this);
        int ordinal = s62.ordinal();
        if (ordinal == 0) {
            i = 1;
        } else if (ordinal == 1) {
            i = 2;
        } else {
            throw new NoWhenBranchMatchedException();
        }
        aw2 aw2 = (bv2) t97.getValue();
        aw2.getClass();
        int t = hr1.t(i);
        if (t == 0) {
            t0c = aw2.m(j);
        } else if (t == 1) {
            t0c = aw2.n(j);
        } else {
            throw new NoWhenBranchMatchedException();
        }
        i22 i22 = (i22) t0c.a.getValue();
        this.d = i22 != null ? Long.valueOf(i22.a) : null;
    }

    @a1e
    public final void onEvent(w8c w8c) {
        Long l = this.d;
        if (l != null) {
            if (w8c.b == l.longValue()) {
                xs7.E(this.c, (hu3) null, (ru3) null, new p65(this, (Continuation) null), 3);
            }
        }
    }
}

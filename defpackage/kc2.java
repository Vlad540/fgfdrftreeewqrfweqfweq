package defpackage;

import kotlin.coroutines.Continuation;
import kotlinx.coroutines.internal.ContextScope;

/* renamed from: kc2  reason: default package */
public final class kc2 {
    public final long a;
    public final hcd b = icd.b(0, 0, 0, 7);
    public final ContextScope c;

    public kc2(long j, tt0 tt0, pae pae) {
        this.a = j;
        this.c = n1g.a(((n3a) pae).a());
        tt0.d(this);
    }

    public final void a(ic2 ic2) {
        xs7.E(this.c, (hu3) null, (ru3) null, new jc2(this, ic2, (Continuation) null), 3);
    }

    @a1e
    public final void onEvent(bk4 bk4) {
        a(new dc2(bk4.X, bk4.o));
    }

    @a1e
    public final void onEvent(dk4 dk4) {
        a(new ec2(dk4.o));
    }

    @a1e
    public final void onEvent(ove ove) {
        if (ove.b == this.a) {
            a(new gc2(ove.c));
        }
    }

    @a1e
    public final void onEvent(gv6 gv6) {
        if (gv6.b == this.a && !gv6.Y) {
            a(new cc2(gv6.c));
        }
    }

    @a1e
    public final void onEvent(yga yga) {
        if (yga.b == this.a) {
            a(new cc2(yga.o));
        }
    }

    @a1e
    public final void onEvent(l89 l89) {
        if (l89.b == this.a) {
            a(new fc2(l89.X));
        }
    }
}

package defpackage;

import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.internal.ContextScope;

/* renamed from: r43  reason: default package */
public final class r43 {
    public final tt0 a;
    public final pae b;
    public final hcd c = icd.b(0, 0, 0, 7);
    public final t97 d;
    public final ContextScope e;

    public r43(tt0 tt0, pae pae, t97 t97) {
        this.a = tt0;
        this.b = pae;
        this.d = t97;
        this.e = n1g.a(((n3a) pae).a());
        tt0.d(this);
    }

    public final void a(m43 m43) {
        xs7.E(this.e, (hu3) null, (ru3) null, new n43(this, m43, (Continuation) null), 3);
    }

    @a1e
    public final void onAddChatEvent(m9 m9Var) {
        a(new k43(m9Var.b));
    }

    @a1e
    public final void onChatMembersUpdateEvent(vh2 vh2) {
        int t = hr1.t(vh2.X);
        long j = vh2.o;
        if (t == 0) {
            a(new k43(j));
        } else if (t == 1) {
            a(new l43(j));
        } else {
            throw new NoWhenBranchMatchedException();
        }
    }

    @a1e
    public final void onIncomingMessageEvent(gv6 gv6) {
        if (gv6.Y) {
            xs7.E(this.e, (hu3) null, (ru3) null, new q43(this, gv6, (Continuation) null), 3);
        }
    }

    @a1e
    public final void onLeaveChatEvent(ea7 ea7) {
        a(new l43(ea7.b));
    }

    @a1e
    public final void onRemoveChatEvent(w8c w8c) {
        a(new l43(w8c.b));
    }
}

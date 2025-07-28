package defpackage;

import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.internal.ContextScope;

/* renamed from: xi8  reason: default package */
public final class xi8 {
    public final hcd a = icd.b(0, 0, 0, 7);
    public final ContextScope b;

    public xi8(tt0 tt0, pae pae) {
        this.b = n1g.a(((n3a) pae).a());
        tt0.d(this);
    }

    @a1e
    public final void onChatMembersUpdateEvent(vh2 vh2) {
        si8 si8;
        int t = hr1.t(vh2.X);
        List list = vh2.b;
        ch2 ch2 = vh2.c;
        long j = vh2.o;
        if (t == 0) {
            si8 = new pi8(j, ch2, list);
        } else if (t == 1) {
            si8 = new ri8(j, ch2, list);
        } else {
            throw new NoWhenBranchMatchedException();
        }
        xs7.E(this.b, (hu3) null, (ru3) null, new ui8(this, si8, (Continuation) null), 3);
    }

    @a1e
    public final void onEvent(lp3 lp3) {
        xs7.E(this.b, (hu3) null, (ru3) null, new vi8(this, lp3, (Continuation) null), 3);
    }
}

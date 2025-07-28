package defpackage;

import kotlin.coroutines.Continuation;
import kotlinx.coroutines.internal.ContextScope;

/* renamed from: qg4  reason: default package */
public final class qg4 {
    public final long a;
    public final tt0 b;
    public final bv2 c;
    public final hcd d = icd.b(0, 0, 0, 7);
    public final ContextScope e;

    public qg4(long j, tt0 tt0, pae pae, bv2 bv2) {
        this.a = j;
        this.b = tt0;
        this.c = bv2;
        this.e = n1g.a(((n3a) pae).c().getImmediate());
        tt0.d(this);
    }

    @a1e
    public final void onEvent(mw2 mw2) {
        tf3 k;
        for (Number longValue : mw2.b) {
            i22 i22 = (i22) ((aw2) this.c).m(longValue.longValue()).a.getValue();
            if (i22 != null && (k = i22.k()) != null) {
                if (k.n() == this.a) {
                    xs7.E(this.e, (hu3) null, (ru3) null, new pg4(this, (Continuation) null), 3);
                    return;
                }
                return;
            }
        }
    }
}

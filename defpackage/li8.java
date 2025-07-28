package defpackage;

import kotlin.coroutines.Continuation;
import kotlinx.coroutines.internal.ContextScope;

/* renamed from: li8  reason: default package */
public final class li8 {
    public final long a;
    public final long b;
    public final tt0 c;
    public final hcd d = icd.b(0, 0, 0, 7);
    public final ContextScope e;

    public li8(long j, long j2, tt0 tt0, pae pae) {
        this.a = j;
        this.b = j2;
        this.c = tt0;
        this.e = n1g.a(((n3a) pae).a());
        tt0.d(this);
    }

    @a1e
    public final void onEvent(mw2 mw2) {
        if (mw2.b.contains(Long.valueOf(this.b))) {
            xs7.E(this.e, (hu3) null, (ru3) null, new ji8(this, (Continuation) null), 3);
        }
    }

    @a1e
    public final void onEvent(ove ove) {
        if (ove.b == this.b) {
            if (ove.c == this.a || ove.X) {
                xs7.E(this.e, (hu3) null, (ru3) null, new ki8(this, (Continuation) null), 3);
            }
        }
    }
}

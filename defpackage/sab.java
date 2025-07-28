package defpackage;

import kotlin.coroutines.Continuation;
import kotlinx.coroutines.internal.ContextScope;

/* renamed from: sab  reason: default package */
public final class sab {
    public final hcd a = icd.b(0, 0, 0, 7);
    public final ContextScope b;

    public sab(tt0 tt0, t97 t97) {
        this.b = n1g.a(((pae) t97.getValue()).c());
        tt0.d(this);
    }

    public static final mge a(sab sab, uae uae) {
        sab.getClass();
        String str = uae.o;
        if (str != null && str.length() != 0) {
            return new lge(str);
        }
        String str2 = uae.b;
        return (!iu7.F(str2) || !hhd.f(str2, "io.exception")) ? (!iu7.F(str2) || hhd.f(str2, "io.exception")) ? new hge(cic.E) : new hge(cic.H) : new hge(cic.F);
    }

    @a1e
    public final void onEvent(jh0 jh0) {
        xs7.E(this.b, (hu3) null, (ru3) null, new qab(this, jh0, (Continuation) null), 3);
    }

    @a1e
    public final void onEvent(iab iab) {
        xs7.E(this.b, (hu3) null, (ru3) null, new rab(this, iab, (Continuation) null), 3);
    }
}

package defpackage;

import kotlin.coroutines.Continuation;
import kotlinx.coroutines.internal.ContextScope;

/* renamed from: pab  reason: default package */
public final class pab {
    public final tt0 a;
    public final hcd b = icd.b(0, 0, 0, 7);
    public final ContextScope c;

    public pab(tt0 tt0, pae pae) {
        this.a = tt0;
        this.c = n1g.a(((n3a) pae).c());
        tt0.d(this);
    }

    @a1e
    public final void onEvent(jh0 jh0) {
        mge mge;
        hge hge;
        Long valueOf = Long.valueOf(jh0.a);
        uae uae = jh0.b;
        String str = uae.o;
        if (str == null || str.length() == 0) {
            String str2 = uae.b;
            if (iu7.F(str2) && hhd.f(str2, "io.exception")) {
                hge = new hge(cic.F);
            } else if (!iu7.F(str2) || hhd.f(str2, "io.exception")) {
                hge = new hge(cic.E);
            } else {
                hge = new hge(cic.H);
            }
            mge = hge;
        } else {
            mge = new lge(str);
        }
        xs7.E(this.c, (hu3) null, (ru3) null, new oab(this, new kab(valueOf, mge), (Continuation) null), 3);
    }

    @a1e
    public final void onEvent(op2 op2) {
        xs7.E(this.c, (hu3) null, (ru3) null, new oab(this, new lab(Long.valueOf(op2.a)), (Continuation) null), 3);
    }
}

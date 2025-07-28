package defpackage;

import android.app.Application;
import kotlin.NoWhenBranchMatchedException;
import kotlinx.coroutines.internal.ContextScope;

/* renamed from: lz  reason: default package */
public final class lz {
    public static final /* synthetic */ k77[] f;
    public final gz a;
    public final Application b;
    public final ContextScope c;
    public final e3 d = hwf.t();
    public final grd e = hrd.a((Object) null);

    static {
        k77 hc9 = new hc9(lz.class, "updateAttachJob", "getUpdateAttachJob()Lkotlinx/coroutines/Job;");
        m7c.a.getClass();
        f = new k77[]{hc9};
    }

    public lz(pae pae, gz gzVar, Application application) {
        this.a = gzVar;
        this.b = application;
        this.c = n1g.a(((n3a) pae).a());
    }

    public final ez a(nyb nyb) {
        Long l;
        boolean z = nyb instanceof jyb;
        Application application = this.b;
        if (z) {
            jyb jyb = (jyb) nyb;
            float f2 = jyb.c;
            Long l2 = jyb.e;
            long longValue = (l2 == null || (l = jyb.f) == null || l2.longValue() != 0) ? jyb.d : (long) ((f2 / ((float) 100)) * ((float) l.longValue()));
            long j = jyb.b;
            return new az(jyb.a, f2, j > 0 ? new lge(me4.i(dhe.w(longValue, false, application), "/", dhe.v(j, dhe.m(j), true, application))) : new hge(c7a.t));
        } else if (nyb instanceof myb) {
            myb myb = (myb) nyb;
            float f3 = (float) myb.b;
            float f4 = myb.c;
            String w = dhe.w((long) ((f4 / ((float) 100)) * f3), false, application);
            long j2 = myb.b;
            return new dz(myb.a, f4, new lge(me4.i(w, "/", dhe.v(j2, dhe.m(j2), true, application))));
        } else if (nyb instanceof kyb) {
            kyb kyb = (kyb) nyb;
            return new bz(kyb.a, new lge(dhe.w(kyb.b, true, application)));
        } else if (nyb instanceof lyb) {
            lyb lyb = (lyb) nyb;
            return new cz(lyb.a, new lge(dhe.w(lyb.b, true, application)));
        } else {
            throw new NoWhenBranchMatchedException();
        }
    }
}

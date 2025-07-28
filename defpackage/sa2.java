package defpackage;

import java.util.Collections;
import java.util.List;
import java.util.Set;

/* renamed from: sa2  reason: default package */
public final class sa2 extends ol implements qce {
    public final long X;
    public final long Y;
    public final long Z;
    public final long o;
    public final int w0;
    public final int x0;
    public final Set y0;
    public final String z0 = sa2.class.getName();

    public sa2(long j, long j2, long j3, long j4, long j5, int i, int i2, Set set) {
        super(j);
        this.o = j2;
        this.X = j3;
        this.Y = j4;
        this.Z = j5;
        this.w0 = i;
        this.x0 = i2;
        this.y0 = set;
    }

    public final void c(lbe lbe) {
        eb2 eb2 = (eb2) lbe;
        udd.q(this.z0, "onSuccess: " + eb2);
        if (m().B(this.o) != null) {
            to8 p = p();
            List c = eb2.c();
            p.g(this.o, ((j2b) r()).a.s(), c);
            t52 m = m();
            m.getClass();
            int i = eb2.X;
            udd.q("t52", "onChatMedia: totalCount = " + i);
            int i2 = this.x0;
            int i3 = this.w0;
            Set set = this.y0;
            long j = this.Y;
            long j2 = this.o;
            long j3 = j2;
            m.h(j3, false, new y42(m, i2, i3, set, i, eb2, j, j2));
            m.m.c(new mw2(Collections.singletonList(Long.valueOf(j3)), false));
            tt0 l = l();
            int size = eb2.c().size();
            l.c(new hc2(this.a, this.Y, this.w0, this.x0, size, this.y0));
        }
    }

    public final void d(uae uae) {
        l().c(new jh0(this.a, uae));
    }

    public final ibe i() {
        return new dt(this.X, Long.valueOf(this.Z), this.y0, Integer.valueOf(this.w0), Integer.valueOf(this.x0));
    }
}

package defpackage;

import java.util.Collections;

/* renamed from: p0d  reason: default package */
public final class p0d extends f1d {
    public final long D0;
    public final long E0;
    public final long F0;

    public p0d(o0d o0d) {
        super(o0d);
        this.D0 = o0d.l;
        this.E0 = o0d.m;
        this.F0 = o0d.n;
    }

    /* JADX WARNING: type inference failed for: r11v2, types: [java.lang.Object, p10] */
    public final uo8 y() {
        vo8 q = o().q(this.E0);
        String str = null;
        if (!(d().B(this.D0) == null || q == null)) {
            jj7 jj7 = q.D0;
            int v = jj7.v();
            int i = 0;
            while (i < v) {
                o10 u = jj7.u(i);
                if (u == null) {
                    return null;
                }
                boolean f = u.f();
                a10 a10 = u.b;
                long j = this.F0;
                if ((!f || a10.w0 != j) && ((!u.i() || u.d.a != j) && ((!u.h() || u.f.a != j) && (!u.g() || u.g.a != j)))) {
                    i++;
                } else {
                    if (u.f()) {
                        a10 a = a10.b().a();
                        m00 j2 = u.j();
                        j2.b = a;
                        u = j2.a();
                    }
                    ? obj = new Object();
                    obj.a = Collections.singletonList(u);
                    jj7 c = obj.c();
                    if (u.g()) {
                        str = u.g.b;
                    }
                    uo8 uo8 = new uo8();
                    uo8.g = str;
                    uo8.n = c;
                    return uo8;
                }
            }
        }
        return null;
    }
}

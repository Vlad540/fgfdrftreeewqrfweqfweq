package defpackage;

import java.util.Collections;
import java.util.List;

/* renamed from: hk7  reason: default package */
public final class hk7 implements pf4 {
    public final mge a;
    public final s16 b;
    public final u16 c;
    public final int d;
    public final u16 e;
    public final long f;
    public final grd g;
    public final t0c h;

    public hk7(mge mge, s16 s16, u16 u16, int i, int i2) {
        i = (i2 & 8) != 0 ? 0 : i;
        this.a = mge;
        this.b = s16;
        this.c = u16;
        this.d = i;
        this.e = null;
        this.f = du0.a.incrementAndGet();
        grd a2 = hrd.a(e());
        this.g = a2;
        this.h = new t0c(a2);
    }

    public final zqd c() {
        return this.h;
    }

    public final void d(z14 z14) {
        if (z14.a == this.f) {
            s16 s16 = this.b;
            this.c.invoke(Boolean.valueOf(!((Boolean) s16.invoke()).booleanValue()));
            this.g.m((Object) null, e());
            u16 u16 = this.e;
            if (u16 != null) {
                u16.invoke(s16.invoke());
            }
        }
    }

    public final List e() {
        y14 y14 = new y14(((Boolean) this.b.invoke()).booleanValue());
        return Collections.singletonList(new z14(this.f, this.a, this.d, (mge) null, y14, 8));
    }
}

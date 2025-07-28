package defpackage;

import java.util.Set;

/* renamed from: hb2  reason: default package */
public final class hb2 {
    public final pk a;
    public final t52 b;
    public final to8 c;
    public final g2b d;
    public final ed3 e;
    public final rp8 f;

    public hb2(pk pkVar, t52 t52, to8 to8, g2b g2b, ed3 ed3, rp8 rp8) {
        this.a = pkVar;
        this.b = t52;
        this.c = to8;
        this.d = g2b;
        this.e = ed3;
        this.f = rp8;
    }

    public final long a(i22 i22, vo8 vo8, boolean z, Set set) {
        int i;
        hb2 hb2;
        i22 i222 = i22;
        vo8 vo82 = vo8;
        long j = i222.b.a;
        long j2 = vo82 != null ? vo82.b : 0;
        long j3 = vo82 != null ? vo82.c : 0;
        int i2 = z ? 100 : 0;
        if (z) {
            hb2 = this;
            i = 0;
        } else {
            i = 100;
            hb2 = this;
        }
        gy9 gy9 = (gy9) hb2.a;
        long j4 = i222.a;
        if (!gy9.o(j4)) {
            return 0;
        }
        return gy9.v(gy9, new sa2(((j2b) gy9.z()).a.n(), j4, j, j2, j3, i2, i, set));
    }

    public final boolean b(boolean z) {
        int i = ((j2b) this.d).c.g.getInt("app.media.load.gif", 0);
        return z ? c(i) : i != -1;
    }

    public final boolean c(int i) {
        ed3 ed3 = this.e;
        boolean g = ed3.g();
        wd3 b2 = ed3.b();
        if (i != -1) {
            return i != 0 ? b2 == wd3.c : b2 == wd3.c || ((j2b) this.d).c.m() || !g;
        }
        return false;
    }

    public final boolean d() {
        return c(((j2b) this.d).c.g.getInt("app.media.load.photo", 0));
    }

    public final boolean e(boolean z) {
        int i = ((j2b) this.d).c.g.getInt("app.media.load.stickers", 0);
        return z ? c(i) : i != -1;
    }
}

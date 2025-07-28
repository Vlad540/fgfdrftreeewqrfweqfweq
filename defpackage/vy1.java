package defpackage;

/* renamed from: vy1  reason: default package */
public final class vy1 {
    public final t97 a;
    public final t97 b;
    public final t97 c;

    public vy1(t97 t97, t97 t972, t97 t973) {
        this.a = t973;
        this.b = t97;
        this.c = t972;
    }

    public final Long a(long j, String str, d10 d10) {
        t97 t97 = this.a;
        ((aw2) ((bv2) t97.getValue())).l().c(j, z52.b);
        if (((aw2) ((bv2) t97.getValue())).f(j, new uy1()) == null) {
            return new Long(0);
        }
        ((tt0) this.c.getValue()).c(new mw2(hr1.o(j), false, false, (md4) null, (a4b) null, 124));
        gy9 gy9 = (gy9) ((pk) this.b.getValue());
        return new Long(((luf) gy9.e.getValue()).b(new wy1(((j2b) gy9.z()).a.n(), str, j, d10, lp.x(str))));
    }
}

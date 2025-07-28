package defpackage;

/* renamed from: b6f  reason: default package */
public final class b6f implements j7f {
    public final t97 a;
    public final t97 b;
    public final grd c;
    public final t0c o;

    public b6f(t97 t97) {
        this.a = t97;
        this.b = ez3.O(3, new r9c(12, t97));
        grd a2 = hrd.a((Object) null);
        this.c = a2;
        this.o = new t0c(a2);
    }

    public final k7f a() {
        return (k7f) this.b.getValue();
    }

    public final void b() {
        k7f a2 = a();
        udd.q(a2.c, "Player. Clear");
        n45 n45 = a2.o;
        n45.w2();
        n45.p2((Object) null);
        n45.k2(0, 0);
        a2.Y = null;
        a2.Z = null;
        ((yya) this.a.getValue()).a(a());
    }

    public final void c(long j, h5f h5f, v2f v2f) {
        long j2 = j;
        this.c.m((Object) null, new t6f(j2, h5f.b, h5f, 0.0f, v2f, 1, a(), (yya) this.a.getValue()));
        k7f a2 = a();
        a2.g(1.0f);
        a2.K0(false);
        a2.Y = this;
        a2.H0(v2f);
    }

    public final void h() {
        grd grd;
        Object value;
        t6f t6f;
        if (this.b.a()) {
            do {
                grd = this.c;
                value = grd.getValue();
                t6f = (t6f) value;
            } while (!grd.b(value, t6f != null ? t6f.a(t6f, 3) : null));
        }
    }

    public final void i() {
        grd grd;
        Object value;
        t6f t6f;
        if (this.b.a()) {
            do {
                grd = this.c;
                value = grd.getValue();
                t6f = (t6f) value;
            } while (!grd.b(value, t6f != null ? t6f.a(t6f, 2) : null));
        }
    }

    public final void o() {
        grd grd;
        Object value;
        t6f t6f;
        if (this.b.a()) {
            do {
                grd = this.c;
                value = grd.getValue();
                t6f = (t6f) value;
            } while (!grd.b(value, t6f != null ? t6f.a(t6f, 4) : null));
            b();
        }
    }

    public final void t(float f) {
        a().g(f);
    }

    public final void u() {
        grd grd;
        Object value;
        t6f t6f;
        if (this.b.a()) {
            do {
                grd = this.c;
                value = grd.getValue();
                t6f = (t6f) value;
            } while (!grd.b(value, t6f != null ? t6f.a(t6f, 4) : null));
            b();
        }
    }
}

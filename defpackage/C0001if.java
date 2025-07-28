package defpackage;

/* renamed from: if  reason: invalid class name and default package and case insensitive filesystem */
public final class C0001if extends gf {
    public final nsf h(nsf nsf) {
        lsf lsf = nsf.a;
        qy6 f = lsf.f(this.j);
        qy6 f2 = lsf.f(this.d);
        qy6 b = qy6.b(f.a - f2.a, f.b - f2.b, f.c - f2.c, f.d - f2.d);
        qy6 b2 = qy6.b(Math.max(b.a, 0), Math.max(b.b, 0), Math.max(b.c, 0), Math.max(b.d, 0));
        this.a.setTranslationY((float) (b2.b - b2.d));
        return nsf;
    }

    public final void i() {
        this.a.setTranslationY(0.0f);
    }
}

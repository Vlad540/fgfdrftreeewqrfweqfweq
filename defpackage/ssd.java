package defpackage;

/* renamed from: ssd  reason: default package */
public final class ssd extends oy {
    public final t97 c;
    public final t97 d;
    public final bf5 e;
    public vw f;
    public final rsd g = new rsd(this);

    public ssd(o10 o10, r7e r7e, r7e r7e2, bf5 bf5) {
        super(o10);
        this.c = r7e;
        this.d = r7e2;
        this.e = bf5;
    }

    public final void a() {
        b(this.f, new Exception("cancelled"));
    }

    public final ms9 d() {
        ms9 d2 = super.d();
        if (d2 != null) {
            return d2;
        }
        vw vwVar = this.f;
        if (vwVar != null) {
            return vwVar;
        }
        this.f = new vw();
        i10 i10 = this.a.f;
        if (i10.j == 4) {
            kg9.a(i10.l, 1, true).e(this.g);
        } else {
            String str = i10.h;
            if (r1g.p(str)) {
                str = i10.b;
            }
            ((xq6) this.d.getValue()).a(str, new x3a(25, this));
        }
        return this.f;
    }
}

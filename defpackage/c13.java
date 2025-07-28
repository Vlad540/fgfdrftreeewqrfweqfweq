package defpackage;

/* renamed from: c13  reason: default package */
public final class c13 extends g0 {
    public final d4d h;
    public final sac i;
    public final /* synthetic */ int j;

    public c13(y4b y4b, d4d d4d, wz6 wz6, int i2) {
        this.j = i2;
        this.h = d4d;
        this.i = wz6;
        n06.s();
        this.a = d4d.Y;
        n06.s();
        wz6.c(d4d);
        n06.s();
        y4b.a(new g3(0, this), d4d);
    }

    public final boolean a() {
        if (!super.a()) {
            return false;
        }
        if (h()) {
            return true;
        }
        sac sac = this.i;
        d4d d4d = this.h;
        sac.h(d4d);
        d4d.e();
        return true;
    }

    public void b(Object obj) {
        switch (this.j) {
            case 0:
                e13.S((e13) obj);
                return;
            default:
                return;
        }
    }

    public Object e() {
        switch (this.j) {
            case 0:
                return e13.o((e13) super.e());
            default:
                return super.e();
        }
    }

    public void o(Object obj, int i2, z4b z4b) {
        switch (this.j) {
            case 0:
                p(e13.o((e13) obj), i2, z4b);
                return;
            default:
                p(obj, i2, z4b);
                return;
        }
    }

    public final void p(Object obj, int i2, z4b z4b) {
        boolean a = ah0.a(i2);
        if (l(obj, a, ((ji0) z4b).Y) && a) {
            this.i.g(this.h);
        }
    }
}

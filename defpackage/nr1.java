package defpackage;

/* renamed from: nr1  reason: default package */
public final class nr1 extends vh8 {
    public yh7 m;
    public final Object n;

    public nr1(Object obj) {
        this.n = obj;
    }

    public final Object d() {
        yh7 yh7 = this.m;
        return yh7 == null ? this.n : yh7.d();
    }

    public final void l(yh7 yh7, cw9 cw9) {
        throw null;
    }

    public final void m(yh7 yh7) {
        uh8 uh8;
        yh7 yh72 = this.m;
        if (!(yh72 == null || (uh8 = (uh8) this.l.c(yh72)) == null)) {
            uh8.a.j(uh8);
        }
        this.m = yh7;
        super.l(yh7, new mr1(0, this));
    }
}

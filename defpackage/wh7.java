package defpackage;

/* renamed from: wh7  reason: default package */
public final class wh7 extends xh7 implements dc7 {
    public final nc7 X;
    public final /* synthetic */ yh7 Y;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public wh7(yh7 yh7, nc7 nc7, cw9 cw9) {
        super(yh7, cw9);
        this.Y = yh7;
        this.X = nc7;
    }

    public final void b() {
        this.X.R().f(this);
    }

    public final boolean c(nc7 nc7) {
        return this.X == nc7;
    }

    public final boolean d() {
        return this.X.R().d.a(ob7.o);
    }

    public final void m(nc7 nc7, nb7 nb7) {
        nc7 nc72 = this.X;
        ob7 ob7 = nc72.R().d;
        if (ob7 == ob7.a) {
            this.Y.j(this.a);
            return;
        }
        ob7 ob72 = null;
        while (ob72 != ob7) {
            a(d());
            ob72 = ob7;
            ob7 = nc72.R().d;
        }
    }
}

package defpackage;

import java.util.List;

/* renamed from: nx8  reason: default package */
public final class nx8 extends taf {
    public final t0c X;
    public final grd Y;
    public final t0c Z;
    public final grd b;
    public final t0c c;
    public final grd o;
    public final l05 w0 = new l05(0);
    public final l05 x0 = new l05(0);

    public nx8() {
        grd a = hrd.a(Boolean.FALSE);
        this.b = a;
        this.c = new t0c(a);
        grd a2 = hrd.a((Object) null);
        this.o = a2;
        this.X = new t0c(a2);
        grd a3 = hrd.a((Object) null);
        this.Y = a3;
        this.Z = new t0c(a3);
    }

    public final void q(wia wia) {
        grd grd;
        Object value;
        do {
            grd = this.o;
            value = grd.getValue();
            fg6 fg6 = (fg6) value;
        } while (!grd.b(value, wia == null ? null : new fg6(((Number) wia.a).longValue(), (List) wia.b)));
    }
}

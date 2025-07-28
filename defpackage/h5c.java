package defpackage;

import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.Continuation;
import me.leolin.shortcutbadger.BuildConfig;

/* renamed from: h5c  reason: default package */
public final class h5c extends taf {
    public final t97 X;
    public final t97 Y;
    public final t97 Z;
    public final y4c b;
    public final Boolean c;
    public final po1 o;
    public final t0c w0;
    public final v11 x0;
    public final l05 y0 = new l05(0);

    public h5c(y4c y4c, Boolean bool, po1 po1, t97 t97, t97 t972, t97 t973) {
        Object value;
        e5c e5c;
        this.b = y4c;
        this.c = bool;
        this.o = po1;
        this.X = t97;
        this.Y = t972;
        this.Z = t973;
        grd a = hrd.a((Object) null);
        this.w0 = new t0c(a);
        this.x0 = new v11(ez3.d0(ez3.z(new v11(po1.e(), po1.f(), new f5c((Object) this, (Continuation) null, 0), 4)), this.a, ucd.a, yh1.g), ((doc) ((boc) t972.getValue())).z0, new c3(this, (Continuation) null, 29), 4);
        do {
            value = a.getValue();
            e5c e5c2 = (e5c) value;
            int ordinal = this.b.ordinal();
            if (ordinal != 0) {
                u0a u0a = u0a.b;
                if (ordinal == 1) {
                    e5c = new e5c(new hge(r1a.t1), new hge(r1a.s1), new d5c((long) o1a.h1, new hge(r1a.q1), u0a.a), new d5c((long) o1a.i1, new hge(r1a.r1), u0a), mge.a, false);
                } else if (ordinal == 2) {
                    hge hge = new hge(r1a.p1);
                    d5c d5c = new d5c((long) o1a.a1, new hge(r1a.n1), u0a);
                    d5c d5c2 = new d5c((long) o1a.Z0, new hge(r1a.o1), u0a);
                    CharSequence charSequence = ((k11) ((x11) this.o.f).k.getValue()).b;
                    e5c = new e5c(hge, (hge) null, d5c, d5c2, new lge(charSequence == null ? BuildConfig.FLAVOR : charSequence), true);
                } else {
                    throw new NoWhenBranchMatchedException();
                }
            } else {
                e5c = null;
            }
        } while (!a.b(value, e5c));
        if (this.b == y4c.b) {
            ez3.N(new ck5(new u09(((doc) ((boc) this.Y.getValue())).Z, 23), new c5c(this, (Continuation) null), 5), this.a);
        }
    }
}

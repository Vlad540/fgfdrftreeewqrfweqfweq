package defpackage;

import java.util.Set;
import kotlin.coroutines.Continuation;
import me.leolin.shortcutbadger.BuildConfig;

/* renamed from: xra  reason: default package */
public final class xra extends taf {
    public static final tra J0 = new tra((String) null, hw4.a);
    public final t0c A0;
    public final grd B0;
    public final t0c C0;
    public final grd D0;
    public final t0c E0;
    public final qe4 F0 = new qe4(17);
    public final l05 G0 = new l05(0);
    public final grd H0;
    public boolean I0;
    public final t97 X;
    public final t97 Y;
    public final grd Z;
    public final b9 b;
    public final qr2 c;
    public final t97 o;
    public final t0c w0;
    public final grd x0;
    public final t0c y0;
    public final grd z0;

    public xra(Set set, Set set2, b9 b9Var, t97 t97, pae pae, bua bua, t97 t972, qr2 qr2, t97 t973) {
        this.b = b9Var;
        this.c = qr2;
        this.o = t97;
        this.X = t972;
        this.Y = t973;
        iw4 iw4 = iw4.a;
        grd a = hrd.a(iw4);
        this.Z = a;
        this.w0 = new t0c(a);
        grd a2 = hrd.a(iw4);
        this.x0 = a2;
        this.y0 = new t0c(a2);
        grd a3 = hrd.a(set2);
        this.z0 = a3;
        this.A0 = new t0c(a3);
        grd a4 = hrd.a((Object) null);
        this.B0 = a4;
        this.C0 = new t0c(a4);
        grd a5 = hrd.a(J0);
        this.D0 = a5;
        this.E0 = new t0c(a5);
        grd a6 = hrd.a(BuildConfig.FLAVOR);
        this.H0 = a6;
        n3a n3a = (n3a) pae;
        ez3.N(ez3.J(ez3.P(a3, new mra(this, (Continuation) null)), n3a.b()), this.a);
        if (!set.isEmpty()) {
            taf.n(this, n3a.b(), (ru3) null, new nra(this, set, bua, (Continuation) null), 2);
        } else if (b9Var != null) {
            taf.n(this, n3a.b(), (ru3) null, new ora(this, bua, (Continuation) null), 2);
        }
        ez3.N(new ck5(ez3.P(ez3.z(new w09(ez3.x(a6, 200), this, 2)), new pra(this, (Continuation) null)), new rra(this, (Continuation) null), 5), this.a);
    }

    public final void p() {
        q().h = null;
    }

    public final vs7 q() {
        return (vs7) this.X.getValue();
    }

    public final void r(long j) {
        grd grd = this.z0;
        Set v0 = o23.v0((Iterable) grd.getValue());
        if (!v0.remove(Long.valueOf(j))) {
            v0.add(Long.valueOf(j));
        }
        grd.m((Object) null, v0);
    }
}

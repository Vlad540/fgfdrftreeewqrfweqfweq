package defpackage;

import java.util.Set;
import kotlin.coroutines.Continuation;
import me.leolin.shortcutbadger.BuildConfig;

/* renamed from: wra  reason: default package */
public final class wra extends taf {
    public final t0c X;
    public final grd Y;
    public final t0c Z;
    public final lta b;
    public final mua c;
    public final grd o;
    public final l05 w0 = new l05(0);
    public final grd x0;
    public final t0c y0;

    public wra(Set set, lta lta, mua mua, pae pae) {
        this.b = lta;
        this.c = mua;
        grd a = hrd.a(iw4.a);
        this.o = a;
        this.X = new t0c(a);
        grd a2 = hrd.a(set);
        this.Y = a2;
        this.Z = new t0c(a2);
        icd.b(0, Integer.MAX_VALUE, 0, 4);
        grd a3 = hrd.a(BuildConfig.FLAVOR);
        this.x0 = a3;
        pj5 z = ez3.z(ez3.x(a3, 200));
        Object value = a3.getValue();
        this.y0 = ez3.d0(z, this.a, ucd.a, value);
        ez3.N(ez3.J(ez3.P(a2, new vra(this, (Continuation) null)), ((n3a) pae).b()), this.a);
        mua.c(this.a);
    }

    public final void p() {
        this.c.a();
    }

    public final void q(long j, yta yta) {
        grd grd = this.Y;
        Set v0 = o23.v0((Iterable) grd.getValue());
        boolean remove = v0.remove(Long.valueOf(j));
        mua mua = this.c;
        if (!remove) {
            v0.add(Long.valueOf(j));
            if (yta != null) {
                mua.b(new zta(j, yta));
            } else {
                mua.getClass();
            }
        } else {
            mua.e(j);
        }
        grd.m((Object) null, v0);
    }
}

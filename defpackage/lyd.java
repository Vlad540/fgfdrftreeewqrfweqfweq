package defpackage;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicLong;
import kotlin.coroutines.Continuation;

/* renamed from: lyd  reason: default package */
public final class lyd extends taf {
    public static final /* synthetic */ k77[] F0;
    public final grd A0;
    public final t0c B0;
    public final e3 C0;
    public final e3 D0;
    public final e3 E0;
    public final t97 X;
    public final t97 Y;
    public final t97 Z;
    public final pae b;
    public final t97 c;
    public final t97 o;
    public final t97 w0;
    public final grd x0;
    public final t0c y0;
    public final AtomicLong z0 = new AtomicLong();

    static {
        Class<lyd> cls = lyd.class;
        F0 = new k77[]{new hc9(cls, "selectedFindJob", "getSelectedFindJob()Lkotlinx/coroutines/Job;"), c3d.g(m7c.a, cls, "addSetInFavoriteJob", "getAddSetInFavoriteJob()Lkotlinx/coroutines/Job;"), new hc9(cls, "clearRecentJob", "getClearRecentJob()Lkotlinx/coroutines/Job;")};
    }

    public lyd(pae pae, t97 t97, t97 t972, t97 t973, t97 t974, r7e r7e, t97 t975) {
        this.b = pae;
        this.c = t97;
        this.o = t972;
        this.X = t973;
        this.Y = t974;
        this.Z = r7e;
        this.w0 = t975;
        hw4 hw4 = hw4.a;
        grd a = hrd.a(new vxd(hw4, hw4));
        this.x0 = a;
        this.y0 = new t0c(a);
        grd a2 = hrd.a(new uxd(0, 0, 0, 7));
        this.A0 = a2;
        this.B0 = new t0c(a2);
        this.C0 = hwf.t();
        this.D0 = hwf.t();
        this.E0 = hwf.t();
    }

    public static void q(lg7 lg7, hud hud, ArrayList arrayList) {
        ix1 ix1 = new ix1(hud.a, hud);
        arrayList.add(ix1);
        lg7.add(ix1);
        lg7.addAll(hud.X);
    }

    public final hud r(xtd xtd, int i) {
        long j = xtd.a;
        String str = xtd.b;
        if (str == null) {
            str = "";
        }
        return new hud(j, new lge(str), xtd.c, (Integer) null, s(j, xtd.h), i, false, false, 200);
    }

    public final List s(long j, List list) {
        return myc.U(new vqe(myc.L(new es(2, list), new u1c(11)), new jfb(j, this, j == -9223372036854775807L || j == -9223372036854775806L || j == -9223372036854775805L)));
    }

    public final void t(long j, u16 u16) {
        qod D = xs7.D(this.a, this.b.b(), ru3.b, new jyd(u16, j, this, (Continuation) null));
        this.C0.o1(this, F0[0], D);
    }
}

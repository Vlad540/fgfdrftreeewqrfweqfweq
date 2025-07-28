package defpackage;

import android.view.View;
import kotlin.coroutines.Continuation;
import one.me.stickerssettings.StickersSettingsScreen;

/* renamed from: wwd  reason: default package */
public final /* synthetic */ class wwd implements u16 {
    public final /* synthetic */ int a;
    public final /* synthetic */ StickersSettingsScreen b;

    public /* synthetic */ wwd(StickersSettingsScreen stickersSettingsScreen, int i) {
        this.a = i;
        this.b = stickersSettingsScreen;
    }

    public final Object invoke(Object obj) {
        switch (this.a) {
            case 0:
                View view = (View) obj;
                k77[] k77Arr = StickersSettingsScreen.Y;
                this.b.getRouter().C();
                return jue.a;
            case 1:
                StickersSettingsScreen stickersSettingsScreen = this.b;
                k77[] k77Arr2 = StickersSettingsScreen.Y;
                gxd l0 = stickersSettingsScreen.l0();
                int g = ((b7c) obj).g();
                String name = gxd.class.getName();
                fn6 fn6 = udd.e;
                if (fn6 != null) {
                    l0.getClass();
                    if (fn6.c()) {
                        tn7 tn7 = tn7.X;
                        Long l = l0.x0;
                        Long l2 = l0.z0;
                        fn6.d(tn7, name, "Move finish. moved:" + l + ", target:" + l2, (Throwable) null);
                    }
                }
                Long l3 = l0.x0;
                Long l4 = l0.z0;
                if (l3 == null || l4 == null || l0.y0 == -1 || l0.y0 == g) {
                    l0.y0 = -1;
                    l0.x0 = null;
                    l0.z0 = null;
                } else {
                    l0.y0 = -1;
                    l0.x0 = null;
                    l0.z0 = null;
                    l0.A0.o1(l0, gxd.F0[0], xs7.D(l0.a, l0.c.b(), ru3.b, new exd(l0, l3, l4, (Continuation) null)));
                }
                return jue.a;
            case 2:
                dtc dtc = (dtc) obj;
                k77[] k77Arr3 = StickersSettingsScreen.Y;
                gxd l02 = this.b.l0();
                l02.getClass();
                boolean z = dtc instanceof btc;
                l05 l05 = l02.w0;
                if (z) {
                    vwd.c.getClass();
                    rf0.j(":stickers/set?set_id=" + ((btc) dtc).a, l05);
                } else if (dtc instanceof ctc) {
                    taf.o(l05, ((ctc) dtc).b);
                }
                return jue.a;
            case 3:
                dtc dtc2 = (dtc) obj;
                k77[] k77Arr4 = StickersSettingsScreen.Y;
                gxd l03 = this.b.l0();
                l03.getClass();
                if (dtc2 instanceof btc) {
                    lg7 c = hwf.c();
                    int i = rca.k;
                    hge hge = new hge(sca.n);
                    Integer valueOf = Integer.valueOf(phc.Z1);
                    int i2 = j9a.H;
                    c.add(new pq3(i, (mge) hge, valueOf, Integer.valueOf(i2), 4));
                    c.add(new pq3(rca.l, (mge) new hge(sca.o), Integer.valueOf(l9a.z), Integer.valueOf(i2), 4));
                    c.add(new pq3(rca.i, (mge) new hge(sca.f), Integer.valueOf(phc.u), Integer.valueOf(i2), 4));
                    c.add(new pq3(rca.j, (mge) new hge(sca.m), Integer.valueOf(phc.x), Integer.valueOf(j9a.F), 4));
                    lg7 a2 = hwf.a(c);
                    l03.B0 = Long.valueOf(((btc) dtc2).a);
                    taf.o(l03.Z, new o6d(a2));
                }
                return jue.a;
            default:
                b7c b7c = (b7c) obj;
                k77[] k77Arr5 = StickersSettingsScreen.Y;
                lp.K(b7c.a, je6.LONG_PRESS);
                o27 o27 = this.b.o;
                if (o27 != null) {
                    o27.t(b7c);
                }
                return jue.a;
        }
    }
}

package defpackage;

import android.content.Context;
import org.apache.http.conn.params.ConnManagerParams;
import org.apache.http.util.LangUtils;
import org.webrtc.PeerConnectionFactory;
import ru.ok.tamtam.android.db.room.OneMeRoomDatabase;
import ru.ok.tamtam.nano.Protos;

/* renamed from: spc  reason: default package */
public final class spc extends whd {
    public final /* synthetic */ int b;

    public /* synthetic */ spc(int i) {
        this.b = i;
    }

    public final Object b(w4 w4Var) {
        w4 w4Var2 = w4Var;
        Class<Context> cls = Context.class;
        Class<bce> cls2 = bce.class;
        Class<gee> cls3 = gee.class;
        Class<x4a> cls4 = x4a.class;
        Class<g15> cls5 = g15.class;
        Class<f3d> cls6 = f3d.class;
        Class<rf4> cls7 = rf4.class;
        Class<OneMeRoomDatabase> cls8 = OneMeRoomDatabase.class;
        Class<g2b> cls9 = g2b.class;
        Class<t52> cls10 = t52.class;
        Class<zy9> cls11 = zy9.class;
        Class<nae> cls12 = nae.class;
        Class<ad3> cls13 = ad3.class;
        Class<tt0> cls14 = tt0.class;
        Class<ku3> cls15 = ku3.class;
        Class<pk> cls16 = pk.class;
        Class<pae> cls17 = pae.class;
        Class<di3> cls18 = di3.class;
        Class<mr9> cls19 = mr9.class;
        switch (this.b) {
            case 0:
                Class<zy9> cls20 = cls11;
                Class<ad3> cls21 = cls13;
                return new dce(new h2d((t97) w4Var2.d(zz2.class), (t97) w4Var2.d(kd3.class), (t97) w4Var2.d(cls2), (t97) w4Var2.d(cde.class), (t97) w4Var2.d(yz9.class), (t97) w4Var2.d(i0a.class), new r7e(new jq2(w4Var2, 19))), w4Var2.d(cls9), w4Var2.d(cls20), w4Var2.d(cls7), w4Var2.d(cls21), (f3d) w4Var2.c(cls6), ((x4a) w4Var2.c(cls4)).b());
            case 1:
                return new hy((pk) w4Var2.c(cls16), (t52) w4Var2.c(cls10), (g2b) w4Var2.c(cls9), (di7) w4Var2.c(di7.class));
            case 2:
                return new gsc(w4Var2.d(w6a.class));
            case 3:
                t97 d = w4Var2.d(a04.class);
                t97 d2 = w4Var2.d(zz9.class);
                t97 d3 = w4Var2.d(cls11);
                return new voa((Context) w4Var2.c(cls), d, d2, d3, (tt0) w4Var2.c(cls14), (pae) w4Var2.c(cls17), (g15) w4Var2.c(cls5));
            case 4:
                return (noa) w4Var2.c(voa.class);
            case 5:
                return new ph4(w4Var2.d(cls10));
            case 6:
                Object obj = z3d.m;
                return new ck4(gt0.p(new gqc(w4Var2, 14)), gt0.p(new gqc(w4Var2, 15)), gt0.p(new gqc(w4Var2, 16)), gt0.p(new gqc(w4Var2, 11)), gt0.p(new gqc(w4Var2, 12)), gt0.p(new gqc(w4Var2, 13)), gt0.p(new jq2(w4Var2, 20)));
            case 7:
                return new hjb(w4Var2.d(cls13), w4Var2.d(cls7), w4Var2.d(cls9), w4Var2.d(m14.class), w4Var2.d(cls3), w4Var2.d(bd.class), w4Var2.d(cls16), w4Var2.d(xp9.class), w4Var2.d(cls19), w4Var2.d(kq9.class), w4Var2.d(cls11), w4Var2.d(jjb.class), (pae) w4Var2.c(cls17), (ku3) w4Var2.c(cls15));
            case 8:
                return ((OneMeRoomDatabase) w4Var2.c(cls8)).H();
            case 9:
                return new mr9(w4Var2.d(na5.class), w4Var2.d(nr9.class), w4Var2.d(ur9.class), (pae) w4Var2.c(cls17));
            case 10:
                r7e d4 = w4Var2.d(aq.class);
                r7e d5 = w4Var2.d(fj2.class);
                t97 d6 = w4Var2.d(h7a.class);
                t97 d7 = w4Var2.d(o7a.class);
                return new x19((Context) w4Var2.c(cls), d4, d5, d6, d7, w4Var2.d(en9.class), w4Var2.d(ap3.class), w4Var2.d(u98.class), w4Var2.d(cls19), (aqc) w4Var2.c(aqc.class), (pae) w4Var2.c(cls17), (ku3) w4Var2.c(cls15));
            case 11:
                r7e d8 = w4Var2.d(jee.class);
                r7e d9 = w4Var2.d(cls9);
                r7e d10 = w4Var2.d(cls7);
                t97 d11 = w4Var2.d(cls14);
                r7e d12 = w4Var2.d(cls4);
                t97 d13 = w4Var2.d(luf.class);
                t97 d14 = w4Var2.d(cls3);
                t97 d15 = w4Var2.d(dce.class);
                return new ybe(d8, d9, d10, d11, (g15) w4Var2.c(cls5), d12, d13, d14, (bce) w4Var2.c(cls2), d15, (f3d) w4Var2.c(cls6), w4Var2.d(pl.class));
            case Protos.Attaches.Attach.PRESENT:
                return (l19) w4Var2.c(x19.class);
            case 13:
                return new ed5((mb5) w4Var2.c(mb5.class), (u74) w4Var2.c(u74.class), (t52) w4Var2.c(cls10), (to8) w4Var2.c(to8.class), (zxe) w4Var2.c(zxe.class), (ft8) w4Var2.c(ft8.class), (j3f) w4Var2.c(j3f.class), (gd5) w4Var2.c(gd5.class), (fd5) w4Var2.c(fd5.class), (dd5) w4Var2.c(dd5.class));
            case Protos.Attaches.Attach.LOCATION:
                return new Object();
            case Protos.Attaches.Attach.DAILY_MEDIA:
                return new gd5((bf5) w4Var2.c(bf5.class));
            case PeerConnectionFactory.Options.ADAPTER_TYPE_LOOPBACK:
                return new ywc(((c9a) w4Var2.c(c9a.class)).m().O(), (a27) w4Var2.c(a27.class), (n64) w4Var2.c(n64.class));
            case LangUtils.HASH_SEED:
                return new kn3((g2b) w4Var2.c(cls9), (o2b) w4Var2.c(o2b.class), (di3) w4Var2.c(cls18), (t52) w4Var2.c(cls10), (rf4) w4Var2.c(cls7), (f3d) w4Var2.c(cls6), ((nbe) ((mbe) w4Var2.c(mbe.class))).a());
            case 18:
                return new wf3(w4Var2.d(cls18), w4Var2.d(bv2.class));
            case 19:
                return new ch3(w4Var2.d(cls18), w4Var2.d(cls10), w4Var2.d(cls12), w4Var2.d(cls16), w4Var2.d(cls14));
            case ConnManagerParams.DEFAULT_MAX_TOTAL_CONNECTIONS:
                return new cn3(w4Var2.d(cls18), w4Var2.d(cls12), w4Var2.d(f03.class), w4Var2.d(q2b.class), w4Var2.d(cls16), w4Var2.d(cls14));
            case 21:
                return new mn3(w4Var2.d(cls18), w4Var2.d(cls12), w4Var2.d(cls16), w4Var2.d(cls14));
            case 22:
                Object obj2 = z3d.m;
                return new l2d(gt0.p(new gqc(w4Var2, 18)), gt0.p(new gqc(w4Var2, 19)), gt0.p(new gqc(w4Var2, 20)), gt0.p(new gqc(w4Var2, 17)));
            case 23:
                return new xf3(w4Var2.d(cls18), w4Var2.d(cls12), w4Var2.d(cls16), w4Var2.d(cls14));
            case 24:
                return new dn3(w4Var2.d(cls18), w4Var2.d(cls12), w4Var2.d(cls16), w4Var2.d(cls14));
            case 25:
                return ((OneMeRoomDatabase) w4Var2.c(cls8)).G();
            case 26:
                return ((OneMeRoomDatabase) w4Var2.c(cls8)).C();
            case 27:
                return ((OneMeRoomDatabase) w4Var2.c(cls8)).D();
            case 28:
                Object obj3 = z3d.m;
                return new jjb((xzc) w4Var2.c(xzc.class), gt0.p(new gqc(w4Var2, 21)), gt0.p(new gqc(w4Var2, 22)));
            default:
                Object obj4 = z3d.m;
                return new nr9(gt0.p(new gqc(w4Var2, 23)), gt0.p(new gqc(w4Var2, 24)));
        }
    }
}

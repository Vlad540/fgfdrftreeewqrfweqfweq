package defpackage;

import android.content.Context;
import org.apache.http.conn.params.ConnManagerParams;
import org.apache.http.util.LangUtils;
import org.webrtc.PeerConnectionFactory;
import ru.ok.tamtam.android.db.room.OneMeRoomDatabase;
import ru.ok.tamtam.nano.Protos;

/* renamed from: tpc  reason: default package */
public final class tpc extends whd {
    public final /* synthetic */ int b;

    public /* synthetic */ tpc(int i) {
        this.b = i;
    }

    public final Object b(w4 w4Var) {
        w4 w4Var2 = w4Var;
        Class<h7a> cls = h7a.class;
        Class<qbe> cls2 = qbe.class;
        Class<lce> cls3 = lce.class;
        Class<xzc> cls4 = xzc.class;
        Class<pk> cls5 = pk.class;
        Class<to8> cls6 = to8.class;
        Class<tt0> cls7 = tt0.class;
        Class<t52> cls8 = t52.class;
        Class<Context> cls9 = Context.class;
        Class<mbe> cls10 = mbe.class;
        Class<di3> cls11 = di3.class;
        Class<g2b> cls12 = g2b.class;
        switch (this.b) {
            case 0:
                return ((OneMeRoomDatabase) w4Var2.c(OneMeRoomDatabase.class)).I();
            case 1:
                return new fj2(w4Var2.d(yj7.class), w4Var2.d(ab5.class), w4Var2.d(eb5.class), w4Var2.d(cls12), w4Var2.d(bv2.class), w4Var2.d(rf4.class), w4Var2.d(cls));
            case 2:
                return new yj7((Context) w4Var2.c(cls9), (g2b) w4Var2.c(cls12), w4Var2.d(cls8), w4Var2.d(cls11), w4Var2.d(cls6), w4Var2.d(cls), w4Var2.d(tp9.class), w4Var2.d(qp9.class), w4Var2.d(dq9.class), w4Var2.d(hb2.class));
            case 3:
                return new sce((qbe) w4Var2.c(cls2));
            case 4:
                return new ab5((Context) w4Var2.c(cls9), (g2b) w4Var2.c(cls12), w4Var2.d(hb2.class), w4Var2.d(xp9.class), w4Var2.d(eb5.class), w4Var2.d(dq9.class), w4Var2.d(cls8), w4Var2.d(cls11), w4Var2.d(cls), w4Var2.d(tp9.class), w4Var2.d(cls6), w4Var2.d(w6a.class), w4Var2.d(dhe.class), (pae) w4Var2.c(pae.class));
            case 5:
                return new tp9((Context) w4Var2.c(cls9), (qp9) w4Var2.c(qp9.class));
            case 6:
                Object obj = z3d.m;
                return new qp9((w6a) w4Var2.c(w6a.class), gt0.p(new gqc(w4Var2, 25)), gt0.p(new gqc(w4Var2, 26)), gt0.p(new gqc(w4Var2, 27)));
            case 7:
                return new od((Context) w4Var2.c(cls9), new r7e(new jq2(w4Var2, 21)));
            case 8:
                return new zf3(w4Var2.d(ap3.class), w4Var2.d(f03.class));
            case 9:
                r7e d = w4Var2.d(zf3.class);
                w4Var2.d(cls12);
                return new dhe(d);
            case 10:
                return new xq6(w4Var2.d(bf5.class), w4Var2.d(pae.class));
            case 11:
                w4Var2.d(m0c.class);
                w4Var2.d(bs8.class);
                return new Object();
            case Protos.Attaches.Attach.PRESENT:
                return new l86(w4Var2.d(cls5), w4Var2.d(zr8.class));
            case 13:
                w4Var2.d(x4a.class);
                w4Var2.d(cls6);
                w4Var2.d(rp8.class);
                w4Var2.d(jc5.class);
                w4Var2.d(bf5.class);
                return new Object();
            case Protos.Attaches.Attach.LOCATION:
                return new zs7();
            case Protos.Attaches.Attach.DAILY_MEDIA:
                ((nbe) ((mbe) w4Var2.c(cls10))).b();
                tt0 tt0 = (tt0) w4Var2.c(cls7);
                s40 s40 = (s40) w4Var2.c(s40.class);
                sk7 sk7 = (sk7) w4Var2.c(sk7.class);
                return new Object();
            case PeerConnectionFactory.Options.ADAPTER_TYPE_LOOPBACK:
                return hi7.a;
            case LangUtils.HASH_SEED:
                return new vs7((t52) w4Var2.c(cls8), (di3) w4Var2.c(cls11), (gsc) w4Var2.c(gsc.class), (kn3) w4Var2.c(kn3.class), ((nbe) ((mbe) w4Var2.c(cls10))).a(), ((nbe) ((mbe) w4Var2.c(cls10))).b(), (qbe) w4Var2.c(cls2), (tt0) w4Var2.c(cls7), (lce) w4Var2.c(cls3), false, (g15) w4Var2.c(g15.class), (xzc) w4Var2.c(cls4));
            case 18:
                new vs7((t52) w4Var2.c(cls8), (di3) w4Var2.c(cls11), (gsc) w4Var2.c(gsc.class), (kn3) w4Var2.c(kn3.class), ((nbe) ((mbe) w4Var2.c(cls10))).a(), ((nbe) ((mbe) w4Var2.c(cls10))).b(), (qbe) w4Var2.c(cls2), (tt0) w4Var2.c(cls7), (lce) w4Var2.c(cls3), true, (g15) w4Var2.c(g15.class), (xzc) w4Var2.c(cls4));
                return new ns7(0);
            case 19:
                pk pkVar = (pk) w4Var2.c(cls5);
                t52 t52 = (t52) w4Var2.c(cls8);
                to8 to8 = (to8) w4Var2.c(cls6);
                g2b g2b = (g2b) w4Var2.c(cls12);
                lce lce = (lce) w4Var2.c(cls3);
                bd bdVar = (bd) w4Var2.c(bd.class);
                return new Object();
            case ConnManagerParams.DEFAULT_MAX_TOTAL_CONNECTIONS:
                return (ae5) ((pbe) w4Var2.c(pbe.class)).i.getValue();
            case 21:
                ((nbe) ((mbe) w4Var2.c(cls10))).a();
                return new e74((j74) w4Var2.c(j74.class));
            case 22:
                gt0.p(new hqc(w4Var2, 8));
                gt0.p(new hqc(w4Var2, 17));
                gt0.p(new hqc(w4Var2, 18));
                gt0.p(new gqc(w4Var2, 28));
                gt0.p(new gqc(w4Var2, 29));
                gt0.p(new hqc(w4Var2, 0));
                gt0.p(new hqc(w4Var2, 1));
                gt0.p(new hqc(w4Var2, 2));
                gt0.p(new hqc(w4Var2, 3));
                gt0.p(new hqc(w4Var2, 4));
                gt0.p(new hqc(w4Var2, 5));
                gt0.p(new hqc(w4Var2, 6));
                gt0.p(new hqc(w4Var2, 7));
                gt0.p(new hqc(w4Var2, 9));
                gt0.p(new hqc(w4Var2, 10));
                gt0.p(new hqc(w4Var2, 11));
                gt0.p(new hqc(w4Var2, 12));
                gt0.p(new hqc(w4Var2, 13));
                gt0.p(new hqc(w4Var2, 14));
                gt0.p(new hqc(w4Var2, 15));
                gt0.p(new hqc(w4Var2, 16));
                return new dr9(0);
            case 23:
                Object obj2 = z3d.m;
                gt0.p(new hqc(w4Var2, 19));
                gt0.p(new hqc(w4Var2, 20));
                return new Object();
            case 24:
                gt0.p(new hqc(w4Var2, 22));
                return new wd5((Context) w4Var2.c(cls9), gt0.p(new hqc(w4Var2, 23)), gt0.p(new hqc(w4Var2, 24)), gt0.p(new hqc(w4Var2, 21)));
            case 25:
                return (tt0) w4Var2.c(zs7.class);
            case 26:
                return new gy9(w4Var2.d(sce.class), w4Var2.d(cls12), w4Var2.d(zy9.class), w4Var2.d(luf.class), new r7e(new jq2(w4Var2, 22)));
            case 27:
                mbe mbe = (mbe) w4Var2.c(cls10);
                mbe.getClass();
                qmc a = ((nbe) mbe).a();
                Object obj3 = z3d.m;
                return new hxe((ewe) w4Var2.c(ewe.class), (btd) w4Var2.c(btd.class), a, gt0.p(new hqc(w4Var2, 25)));
            case 28:
                Object obj4 = z3d.m;
                return new ry(gt0.p(new iqc(w4Var2, 1)), gt0.p(new iqc(w4Var2, 2)), gt0.p(new iqc(w4Var2, 3)), gt0.p(new hqc(w4Var2, 26)), gt0.p(new hqc(w4Var2, 27)), gt0.p(new hqc(w4Var2, 28)), gt0.p(new hqc(w4Var2, 29)), gt0.p(new iqc(w4Var2, 0)));
            default:
                return new v86(w4Var2.d(cls5), w4Var2.d(cls4), w4Var2.d(cls11), w4Var2.d(q2b.class), w4Var2.d(m07.class), w4Var2.d(cls7));
        }
    }
}

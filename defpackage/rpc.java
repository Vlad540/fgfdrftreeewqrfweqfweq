package defpackage;

import android.content.Context;
import org.apache.http.conn.params.ConnManagerParams;
import org.apache.http.util.LangUtils;
import org.webrtc.PeerConnectionFactory;
import ru.ok.tamtam.nano.Protos;

/* renamed from: rpc  reason: default package */
public final class rpc extends whd {
    public final /* synthetic */ int b;

    public /* synthetic */ rpc(int i) {
        this.b = i;
    }

    public final Object b(w4 w4Var) {
        w4 w4Var2 = w4Var;
        Class<ku3> cls = ku3.class;
        Class<di3> cls2 = di3.class;
        Class<bv2> cls3 = bv2.class;
        Class<bd> cls4 = bd.class;
        Class<bf5> cls5 = bf5.class;
        Class<f3d> cls6 = f3d.class;
        Class<pae> cls7 = pae.class;
        Class<rf4> cls8 = rf4.class;
        Class<g15> cls9 = g15.class;
        Class<mbe> cls10 = mbe.class;
        Class<pk> cls11 = pk.class;
        Class<t52> cls12 = t52.class;
        Class<to8> cls13 = to8.class;
        Class<tt0> cls14 = tt0.class;
        Class<ed3> cls15 = ed3.class;
        Class<g2b> cls16 = g2b.class;
        Class<xzc> cls17 = xzc.class;
        switch (this.b) {
            case 0:
                return new ece((f03) w4Var2.c(f03.class), (xzc) w4Var2.c(cls17));
            case 1:
                return new hb2((pk) w4Var2.c(cls11), (t52) w4Var2.c(cls12), (to8) w4Var2.c(cls13), (g2b) w4Var2.c(cls16), (ed3) w4Var2.c(cls15), (rp8) w4Var2.c(rp8.class));
            case 2:
                r7e d = w4Var2.d(cls4);
                t97 d2 = w4Var2.d(cls8);
                r7e d3 = w4Var2.d(cls15);
                t97 d4 = w4Var2.d(szc.class);
                t97 d5 = w4Var2.d(h0a.class);
                w4Var2.d(cls12);
                t97 d6 = w4Var2.d(cls2);
                t97 d7 = w4Var2.d(iv6.class);
                t97 d8 = w4Var2.d(m07.class);
                t97 d9 = w4Var2.d(in3.class);
                w4Var2.d(cls13);
                return new bce((g2b) w4Var2.c(cls16), d, d2, d3, d4, d5, d6, d7, d8, d9, w4Var2.d(cls9), w4Var2.d(zy9.class), w4Var2.d(q2b.class), w4Var2.d(so1.class));
            case 3:
                return (wl9) w4Var2.c(bce.class);
            case 4:
                return new kq9(w4Var2.d(dq9.class), w4Var2.d(cls3), w4Var2.d(f03.class), w4Var2.d(p7a.class), w4Var2.d(mr9.class), (pae) w4Var2.c(cls7), (ku3) w4Var2.c(cls));
            case 5:
                Object obj = z3d.m;
                return new mm9((tt0) w4Var2.c(cls14), gt0.p(new eqc(w4Var2, 8)), gt0.p(new eqc(w4Var2, 9)), gt0.p(new eqc(w4Var2, 10)));
            case 6:
                gt0.p(new eqc(w4Var2, 11));
                return new en9((Context) w4Var2.c(Context.class), (h7a) w4Var2.c(h7a.class), (o54) w4Var2.c(o54.class), (b4a) w4Var2.c(b4a.class), (g2b) w4Var2.c(cls16));
            case 7:
                Object obj2 = z3d.m;
                return new szc(gt0.p(new eqc(w4Var2, 22)), gt0.p(new eqc(w4Var2, 24)), gt0.p(new eqc(w4Var2, 25)), gt0.p(new eqc(w4Var2, 12)), gt0.p(new eqc(w4Var2, 13)), gt0.p(new eqc(w4Var2, 14)), gt0.p(new eqc(w4Var2, 15)), gt0.p(new eqc(w4Var2, 16)), gt0.p(new eqc(w4Var2, 17)), gt0.p(new eqc(w4Var2, 18)), gt0.p(new eqc(w4Var2, 19)), gt0.p(new eqc(w4Var2, 20)), gt0.p(new eqc(w4Var2, 21)), gt0.p(new eqc(w4Var2, 23)));
            case 8:
                return (f3d) w4Var2.c(h3d.class);
            case 9:
                Object obj3 = z3d.m;
                return new iv6(gt0.p(new fqc(w4Var2, 2)), gt0.p(new fqc(w4Var2, 3)), gt0.p(new fqc(w4Var2, 4)), gt0.p(new eqc(w4Var2, 26)), gt0.p(new eqc(w4Var2, 27)), gt0.p(new jq2(w4Var2, 18)), gt0.p(new eqc(w4Var2, 28)), gt0.p(new eqc(w4Var2, 29)), gt0.p(new fqc(w4Var2, 0)), gt0.p(new fqc(w4Var2, 1)));
            case 10:
                return new nce(w4Var2.d(gm6.class));
            case 11:
                Object obj4 = z3d.m;
                return new sl9((g15) w4Var2.c(cls9), gt0.p(new fqc(w4Var2, 5)), gt0.p(new fqc(w4Var2, 6)));
            case Protos.Attaches.Attach.PRESENT /*12*/:
                w4Var2.d(a04.class);
                r7e d10 = w4Var2.d(cls12);
                w4Var2.d(cls13);
                return new am9(w4Var2.d(cls11), w4Var2.d(luf.class), (g2b) w4Var2.c(cls16), (tt0) w4Var2.c(cls14), d10, w4Var2.d(p7a.class));
            case 13:
                Object obj5 = z3d.m;
                return new em9(gt0.p(new fqc(w4Var2, 17)), gt0.p(new fqc(w4Var2, 18)), (g2b) w4Var2.c(cls16), (tt0) w4Var2.c(cls14), gt0.p(new fqc(w4Var2, 19)), gt0.p(new fqc(w4Var2, 7)), gt0.p(new fqc(w4Var2, 8)), gt0.p(new fqc(w4Var2, 9)), gt0.p(new fqc(w4Var2, 10)), gt0.p(new fqc(w4Var2, 11)), gt0.p(new fqc(w4Var2, 12)), gt0.p(new fqc(w4Var2, 13)), gt0.p(new fqc(w4Var2, 14)), gt0.p(new fqc(w4Var2, 15)), gt0.p(new fqc(w4Var2, 16)));
            case Protos.Attaches.Attach.LOCATION /*14*/:
                return new pl9((g2b) w4Var2.c(cls16), (tt0) w4Var2.c(cls14), w4Var2.d(cls12), w4Var2.d(v72.class), w4Var2.d(oa3.class));
            case Protos.Attaches.Attach.DAILY_MEDIA /*15*/:
                Object obj6 = z3d.m;
                return new nl9(gt0.p(new fqc(w4Var2, 22)), gt0.p(new fqc(w4Var2, 23)), (tt0) w4Var2.c(cls14), gt0.p(new fqc(w4Var2, 24)), gt0.p(new fqc(w4Var2, 20)), gt0.p(new fqc(w4Var2, 21)));
            case PeerConnectionFactory.Options.ADAPTER_TYPE_LOOPBACK:
                Object obj7 = z3d.m;
                return new om9(gt0.p(new fqc(w4Var2, 25)), gt0.p(new fqc(w4Var2, 26)));
            case LangUtils.HASH_SEED:
                Object obj8 = z3d.m;
                return new ll9((tt0) w4Var2.c(cls14), gt0.p(new fqc(w4Var2, 27)));
            case 18:
                Object obj9 = z3d.m;
                return new yl9(gt0.p(new fqc(w4Var2, 28)));
            case 19:
                return new ad3(w4Var2.d(cls16), w4Var2.d(cls8), w4Var2.d(cls15), w4Var2.d(cls6));
            case ConnManagerParams.DEFAULT_MAX_TOTAL_CONNECTIONS:
                gt0.p(new gqc(w4Var2, 2));
                return new gl9(gt0.p(new gqc(w4Var2, 3)), gt0.p(new gqc(w4Var2, 4)), gt0.p(new fqc(w4Var2, 29)), gt0.p(new gqc(w4Var2, 0)), gt0.p(new gqc(w4Var2, 1)));
            case 21:
                Object obj10 = z3d.m;
                return new vl9(gt0.p(new gqc(w4Var2, 5)), gt0.p(new gqc(w4Var2, 6)), gt0.p(new gqc(w4Var2, 7)));
            case 22:
                return new qm9(w4Var2.d(bs8.class), w4Var2.d(cls17), w4Var2.d(zr8.class));
            case 23:
                return new km9(w4Var2.d(cls3), w4Var2.d(em9.class), w4Var2.d(mm9.class), w4Var2.d(cls2), w4Var2.d(hjb.class), w4Var2.d(s76.class), (pae) w4Var2.c(cls7), (ku3) w4Var2.c(cls));
            case 24:
                return new pc0();
            case 25:
                return new m14(w4Var2.d(l19.class), w4Var2.d(cls9), w4Var2.d(cls8), w4Var2.d(ip.class), w4Var2.d(cls7));
            case 26:
                return new zo0((bf5) w4Var2.c(cls5));
            case 27:
                qmc a = ((nbe) ((mbe) w4Var2.c(cls10))).a();
                Object obj11 = z3d.m;
                return new gm4(a, gt0.p(new gqc(w4Var2, 8)), gt0.p(new gqc(w4Var2, 9)), gt0.p(new gqc(w4Var2, 10)));
            case 28:
                mbe mbe = (mbe) w4Var2.c(cls10);
                mbe.getClass();
                return new j3f((u98) w4Var2.c(u98.class), (l3f) w4Var2.c(l3f.class), (bf5) w4Var2.c(cls5), (bd) w4Var2.c(cls4), (xmc) w4Var2.c(xmc.class), ((nbe) mbe).a(), (vmc) w4Var2.c(vmc.class));
            default:
                pk pkVar = (pk) w4Var2.c(cls11);
                tt0 tt0 = (tt0) w4Var2.c(cls14);
                t52 t52 = (t52) w4Var2.c(cls12);
                zo0 zo0 = (zo0) w4Var2.c(zo0.class);
                ((nbe) ((mbe) w4Var2.c(cls10))).a();
                gsc gsc = (gsc) w4Var2.c(gsc.class);
                w6a w6a = (w6a) w4Var2.c(w6a.class);
                g2b g2b = (g2b) w4Var2.c(cls16);
                o2b o2b = (o2b) w4Var2.c(o2b.class);
                f3d f3d = (f3d) w4Var2.c(cls6);
                w4Var2.d(ywc.class);
                w4Var2.d(kn3.class);
                return new i3e();
        }
    }
}

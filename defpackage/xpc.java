package defpackage;

import android.content.Context;
import org.apache.http.conn.params.ConnManagerParams;
import org.apache.http.util.LangUtils;
import org.webrtc.PeerConnectionFactory;
import ru.ok.tamtam.nano.Protos;

/* renamed from: xpc  reason: default package */
public final class xpc extends whd {
    public final /* synthetic */ int b;

    public /* synthetic */ xpc(int i) {
        this.b = i;
    }

    /* JADX WARNING: type inference failed for: r21v1, types: [zl3, java.lang.Object] */
    public final Object b(w4 w4Var) {
        w4 w4Var2 = w4Var;
        Class<di3> cls = di3.class;
        Class<und> cls2 = und.class;
        Class<ed3> cls3 = ed3.class;
        Class<gg7> cls4 = gg7.class;
        Class<hsd> cls5 = hsd.class;
        Class<uma> cls6 = uma.class;
        Class<pae> cls7 = pae.class;
        Class<a04> cls8 = a04.class;
        Class<mbe> cls9 = mbe.class;
        Class<rf4> cls10 = rf4.class;
        Class<to8> cls11 = to8.class;
        Class<Context> cls12 = Context.class;
        Class<g2b> cls13 = g2b.class;
        Class<qbe> cls14 = qbe.class;
        Class<p7a> cls15 = p7a.class;
        Class<xzc> cls16 = xzc.class;
        Class<n1b> cls17 = n1b.class;
        Class<bd> cls18 = bd.class;
        Class<m0c> cls19 = m0c.class;
        Class<tt0> cls20 = tt0.class;
        Class<f03> cls21 = f03.class;
        Class<t52> cls22 = t52.class;
        switch (this.b) {
            case 0:
                return new wr4((to8) w4Var2.c(cls11), (t52) w4Var2.c(cls22), (n1b) w4Var2.c(cls17), (tt0) w4Var2.c(cls20), (f03) w4Var2.c(cls21));
            case 1:
                Object obj = z3d.m;
                return new xod(gt0.p(new eqc(w4Var2, 5)), gt0.p(new eqc(w4Var2, 6)), gt0.p(new eqc(w4Var2, 7)), gt0.p(new eqc(w4Var2, 4)));
            case 2:
                return ((yae) w4Var2.c(yae.class)).e();
            case 3:
                return new yae((rf4) w4Var2.c(cls10), (g15) w4Var2.c(g15.class), (xzc) w4Var2.c(cls16), new r7e(new jq2(w4Var2, 15)));
            case 4:
                return new gy(w4Var2.d(hb2.class), w4Var2.d(cls11), w4Var2.d(u98.class), w4Var2.d(cls20), w4Var2.d(jc5.class));
            case 5:
                r7e d = w4Var2.d(cls20);
                w4Var2.d(cls21);
                return new bs8(d, w4Var2.d(bv2.class), w4Var2.d(cls11), w4Var2.d(zr8.class));
            case 6:
                return new m0c(w4Var2.d(pk.class), w4Var2.d(cls13), w4Var2.d(cls22), w4Var2.d(cls9), w4Var2.d(cls14), w4Var2.d(cls11), w4Var2.d(cls15), w4Var2.d(kq9.class));
            case 7:
                return new jz2(w4Var2.d(cls22), w4Var2.d(cls15));
            case 8:
                r7e d2 = w4Var2.d(cls22);
                r7e d3 = w4Var2.d(cls19);
                r7e d4 = w4Var2.d(cls15);
                r7e d5 = w4Var2.d(mm9.class);
                tt0 tt0 = (tt0) w4Var2.c(cls20);
                return new y8c(d2, d3, d4, d5);
            case 9:
                return new n22(w4Var2.d(bv2.class), w4Var2.d(tr2.class), w4Var2.d(v72.class), w4Var2.d(cls21), w4Var2.d(cls16));
            case 10:
                gg7 gg7 = (gg7) w4Var2.c(cls4);
                Context context = (Context) w4Var2.c(cls12);
                it4 it4 = new it4((rf4) w4Var2.c(cls10), (g2b) w4Var2.c(cls13), (ed3) w4Var2.c(cls3));
                String str = gg7.c;
                w4Var2.d(cls18);
                ? obj2 = new Object();
                yd3 yd3 = new yd3(w4Var2.d(cls3), (xzc) w4Var2.c(cls16));
                qmc a = ((nbe) ((mbe) w4Var2.c(cls9))).a();
                return new aa4(it4, str, gg7.d, (und) w4Var2.c(cls2), obj2, yd3, a);
            case 11:
                return new zj3(w4Var2.d(cls20), w4Var2.d(cls), w4Var2.d(m07.class));
            case Protos.Attaches.Attach.PRESENT:
                mbe mbe = (mbe) w4Var2.c(cls9);
                mbe.getClass();
                return new l92((t52) w4Var2.c(cls22), (to8) w4Var2.c(cls11), (g2b) w4Var2.c(cls13), (luf) w4Var2.c(luf.class), (p7a) w4Var2.c(cls15), (tt0) w4Var2.c(cls20), (jee) w4Var2.c(jee.class), ((nbe) mbe).a());
            case 13:
                return new lb1(w4Var2.d(nb1.class), new r7e(new jq2(w4Var2, 16)), new r7e(new jq2(w4Var2, 17)));
            case Protos.Attaches.Attach.LOCATION:
                return new zs8(w4Var2.d(ft8.class), w4Var2.d(zy9.class), w4Var2.d(x4a.class), w4Var2.d(uc5.class));
            case Protos.Attaches.Attach.DAILY_MEDIA:
                return new n4b((Context) w4Var2.c(cls12), w4Var2.d(u98.class), (tt0) w4Var2.c(cls20), w4Var2.d(cls16));
            case PeerConnectionFactory.Options.ADAPTER_TYPE_LOOPBACK:
                return new jp7(w4Var2.d(cls13), w4Var2.d(cls), w4Var2.d(o2b.class), w4Var2.d(cls22), w4Var2.d(cls19), w4Var2.d(cls17), w4Var2.d(zsd.class), w4Var2.d(cls15), w4Var2.d(cls8), w4Var2.d(cls14), w4Var2.d(cls10), w4Var2.d(s5a.class), w4Var2.d(zo0.class), w4Var2.d(zs8.class), w4Var2.d(gm4.class), w4Var2.d(ewe.class), w4Var2.d(j3f.class), w4Var2.d(di7.class), w4Var2.d(i3e.class), w4Var2.d(hy.class), w4Var2.d(fa5.class), w4Var2.b(pp7.class));
            case LangUtils.HASH_SEED:
                return new Object();
            case 18:
                return ((hz3) ((a04) w4Var2.c(cls8))).f;
            case 19:
                return ((hz3) ((a04) w4Var2.c(cls8))).d;
            case ConnManagerParams.DEFAULT_MAX_TOTAL_CONNECTIONS:
                return ((hz3) ((a04) w4Var2.c(cls8))).e;
            case 21:
                gg7 gg72 = (gg7) w4Var2.c(cls4);
                it4 it42 = new it4((rf4) w4Var2.c(cls10), (g2b) w4Var2.c(cls13), (ed3) w4Var2.c(cls3));
                String str2 = gg72.c;
                yd3 yd32 = new yd3(w4Var2.d(cls3), (xzc) w4Var2.c(cls16));
                qmc a2 = ((nbe) ((mbe) w4Var2.c(cls9))).a();
                return new q54(it42, str2, gg72.d, (und) w4Var2.c(cls2), yd32, a2);
            case 22:
                return new tif(w4Var2.d(cls18), w4Var2.d(cls21));
            case 23:
                return new bo8(w4Var2.d(cls18), w4Var2.d(cls21));
            case 24:
                return new xg9((pae) w4Var2.c(cls7), (aq) w4Var2.c(aq.class), (hsd) w4Var2.c(cls5), w4Var2.d(cls18), w4Var2.d(cls21), w4Var2.d(cls16), w4Var2.d(cls6));
            case 25:
                return new hsd();
            case 26:
                return (ye1) w4Var2.c(cls5);
            case 27:
                return new xr7(w4Var2.d(cls21), w4Var2.d(cls6), (pae) w4Var2.c(cls7));
            case 28:
                return new uma((xr7) w4Var2.c(xr7.class), w4Var2.d(cls18), w4Var2.d(cls21));
            default:
                return new mna(w4Var2.d(cls18), w4Var2.d(cls21), w4Var2.d(xg9.class), (pae) w4Var2.c(cls7));
        }
    }
}

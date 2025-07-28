package defpackage;

import android.content.Context;
import org.apache.http.conn.params.ConnManagerParams;
import org.apache.http.util.LangUtils;
import org.webrtc.PeerConnectionFactory;
import ru.ok.tamtam.logout.a;
import ru.ok.tamtam.nano.Protos;

/* renamed from: vpc  reason: default package */
public final class vpc extends whd {
    public final /* synthetic */ int b;

    public /* synthetic */ vpc(int i) {
        this.b = i;
    }

    /* JADX WARNING: type inference failed for: r2v19, types: [j54, java.lang.Object] */
    public final Object b(w4 w4Var) {
        w4 w4Var2 = w4Var;
        Class<n1b> cls = n1b.class;
        Class<eha> cls2 = eha.class;
        Class<a04> cls3 = a04.class;
        Class<rf4> cls4 = rf4.class;
        Class<w6a> cls5 = w6a.class;
        Class<luf> cls6 = luf.class;
        Class<f03> cls7 = f03.class;
        Class<g15> cls8 = g15.class;
        Class<mbe> cls9 = mbe.class;
        Class<pae> cls10 = pae.class;
        Class<di3> cls11 = di3.class;
        Class<tt0> cls12 = tt0.class;
        Class<pk> cls13 = pk.class;
        Class<g2b> cls14 = g2b.class;
        Class<zy9> cls15 = zy9.class;
        switch (this.b) {
            case 0:
                return cqc.a;
            case 1:
                return new c9a((Context) w4Var2.c(Context.class), (a) w4Var2.c(a.class), (dm4) w4Var2.c(dm4.class), (x4a) w4Var2.c(x4a.class), w4Var2.d(zr8.class));
            case 2:
                r7e d = w4Var2.d(cls7);
                r7e d2 = w4Var2.d(cls8);
                r7e d3 = w4Var2.d(zec.class);
                r7e d4 = w4Var2.d(cls6);
                r7e d5 = w4Var2.d(ed3.class);
                return new in7((aq) w4Var2.c(aq.class), (pae) w4Var2.c(cls10), d3, d, w4Var2.d(xzc.class), d4, d2, d5, w4Var2.d(jb5.class));
            case 3:
                return new bd(w4Var2.d(in7.class), w4Var2.d(dd.class), w4Var2.d(cls7));
            case 4:
                return new mf6(w4Var2.d(cls15), w4Var2.d(cls4), w4Var2.d(cls14), w4Var2.d(gee.class), w4Var2.d(ad3.class), w4Var2.d(cls13), w4Var2.d(cls6), w4Var2.d(in7.class));
            case 5:
                return new pva(w4Var2.d(cls13), w4Var2.d(cls4), w4Var2.d(cls15), w4Var2.d(cls6), new r7e(new jq2(w4Var2, 23)));
            case 6:
                return new ldf(w4Var2.d(cls15), w4Var2.d(pva.class), w4Var2.d(q2b.class), w4Var2.d(noa.class), w4Var2.d(cls2), w4Var2.d(qbe.class), w4Var2.d(ed5.class), w4Var2.d(ed3.class), w4Var2.d(so1.class), w4Var2.d(dce.class));
            case 7:
                return new tg(new Object(), new c9(20, w4Var2));
            case 8:
                return new ap3((di3) w4Var2.c(cls11), new r7e(new jq2(w4Var2, 24)), w4Var2.d(cls5), w4Var2.d(cls14));
            case 9:
                return new w94(w4Var2.d(oec.class));
            case 10:
                return new o2b(w4Var2.d(cls3), w4Var2.d(cls11), new r7e(new jq2(w4Var2, 25)), (pae) w4Var2.c(cls10), (g15) w4Var2.c(cls8));
            case 11:
                q2b q2b = new q2b(w4Var2.d(o2b.class), w4Var2.d(cls5), w4Var2.d(cls7), (tt0) w4Var2.c(cls12), w4Var2.d(cls15), w4Var2.d(cls13), (pae) w4Var2.c(cls10), new r7e(new jq2(w4Var2, 26)));
                ((h3d) ((f3d) w4Var2.c(f3d.class))).a(q2b);
                return q2b;
            case Protos.Attaches.Attach.PRESENT:
                return new s2b(w4Var2.d(q2b.class));
            case 13:
                gt0.p(new iqc(w4Var2, 15));
                return new di3(gt0.p(new iqc(w4Var2, 14)), (tt0) w4Var2.c(cls12), (g2b) w4Var2.c(cls14), gt0.p(new iqc(w4Var2, 16)), gt0.p(new iqc(w4Var2, 10)), gt0.p(new iqc(w4Var2, 11)), gt0.p(new iqc(w4Var2, 12)), ((nbe) ((mbe) w4Var2.c(cls9))).a(), (lne) w4Var2.c(lne.class), gt0.p(new iqc(w4Var2, 13)));
            case Protos.Attaches.Attach.LOCATION:
                t97 d6 = w4Var2.d(cls5);
                return new p1b(d6, w4Var2.d(cls11), w4Var2.d(cls14), w4Var2.d(cls4), w4Var2.d(cls8), w4Var2.d(rj.class));
            case Protos.Attaches.Attach.DAILY_MEDIA:
                return new mtf((Context) w4Var2.c(Context.class), (qmc) ((nbe) ((mbe) w4Var2.c(cls9))).c.getValue(), ((nbe) ((mbe) w4Var2.c(cls9))).a(), new r7e(new jq2(w4Var2, 27)), (xzc) w4Var2.c(xzc.class));
            case PeerConnectionFactory.Options.ADAPTER_TYPE_LOOPBACK:
                return new n1b((tt0) w4Var2.c(cls12), w4Var2.d(p1b.class));
            case LangUtils.HASH_SEED:
                Object obj = z3d.m;
                return new os8(gt0.p(new iqc(w4Var2, 17)));
            case 18:
                Object obj2 = z3d.m;
                return new ir8(gt0.p(new iqc(w4Var2, 18)));
            case 19:
                Object obj3 = z3d.m;
                return new go2(gt0.p(new iqc(w4Var2, 23)), gt0.p(new iqc(w4Var2, 24)), gt0.p(new iqc(w4Var2, 25)), gt0.p(new iqc(w4Var2, 19)), gt0.p(new iqc(w4Var2, 20)), gt0.p(new iqc(w4Var2, 21)), gt0.p(new iqc(w4Var2, 22)));
            case ConnManagerParams.DEFAULT_MAX_TOTAL_CONNECTIONS:
                return new rp8(w4Var2.d(cls11), w4Var2.d(cls), w4Var2.d(ir8.class), w4Var2.d(os8.class), w4Var2.d(ho2.class));
            case 21:
                return new b29((nec) w4Var2.c(nec.class), new r7e(new jq2(w4Var2, 28)), w4Var2.d(zpc.class));
            case 22:
                Object obj4 = z3d.m;
                return new eha(gt0.p(new iqc(w4Var2, 26)));
            case 23:
                pk pkVar = (pk) w4Var2.c(cls13);
                return new to8((a04) w4Var2.c(cls3), (tt0) w4Var2.c(cls12), (g2b) w4Var2.c(cls14), (eha) w4Var2.c(cls2), (luf) w4Var2.c(cls6), (n1b) w4Var2.c(cls), gt0.p(new iqc(w4Var2, 27)), ((nbe) ((mbe) w4Var2.c(cls9))).a());
            case 24:
                return new p72(w4Var2.d(go2.class), w4Var2.d(cls11), w4Var2.d(cls14), w4Var2.d(to8.class), w4Var2.d(rp8.class), w4Var2.d(t1a.class));
            case 25:
                return (qac) w4Var2.c(cls7);
            case 26:
                Object obj5 = z3d.m;
                return new jee(gt0.p(new iqc(w4Var2, 28)), (g15) w4Var2.c(cls8));
            case 27:
                return new j92(w4Var2.d(qac.class), w4Var2.d(sce.class));
            case 28:
                nj4 p = gt0.p(new jqc(w4Var2, 11));
                nj4 p2 = gt0.p(new jqc(w4Var2, 12));
                nj4 p3 = gt0.p(new iqc(w4Var2, 29));
                nj4 p4 = gt0.p(new jqc(w4Var2, 0));
                nj4 p5 = gt0.p(new jqc(w4Var2, 1));
                nj4 p6 = gt0.p(new jqc(w4Var2, 2));
                nbe nbe = (nbe) ((mbe) w4Var2.c(cls9));
                qmc b2 = nbe.b();
                nj4 p7 = gt0.p(new jqc(w4Var2, 3));
                nj4 p8 = gt0.p(new jqc(w4Var2, 4));
                nj4 p9 = gt0.p(new jqc(w4Var2, 5));
                nj4 p10 = gt0.p(new jqc(w4Var2, 6));
                gt0.p(new jqc(w4Var2, 7));
                return new t52(gt0.p(new jqc(w4Var2, 9)), (tt0) w4Var2.c(cls12), (g2b) w4Var2.c(cls14), p, p2, p3, p4, p5, p6, b2, p7, p8, p9, p10, nbe.a(), nbe.a(), gt0.p(new jqc(w4Var2, 8)), gt0.p(new jqc(w4Var2, 10)), w4Var2.d(v72.class));
            default:
                return new aw2(w4Var2.d(cls13), w4Var2.d(eq2.class), w4Var2.d(t52.class), w4Var2.d(aqc.class), (pae) w4Var2.c(cls10));
        }
    }
}

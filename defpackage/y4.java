package defpackage;

import android.app.Application;
import android.content.Context;
import one.me.calls.impl.service.CallServiceImpl;
import org.apache.http.conn.params.ConnManagerParams;
import org.apache.http.util.LangUtils;
import org.webrtc.PeerConnectionFactory;
import ru.ok.tamtam.android.prefs.PmsKey;
import ru.ok.tamtam.nano.Protos;

/* renamed from: y4  reason: default package */
public final class y4 extends whd {
    public final /* synthetic */ int b;

    public /* synthetic */ y4(int i) {
        this.b = i;
    }

    public final Object b(w4 w4Var) {
        w4 w4Var2 = w4Var;
        switch (this.b) {
            case 0:
                return new zy9(w4Var2.d(g2b.class), w4Var2.d(c5.class), (a5) w4Var2.c(a5.class), w4Var2.d(luf.class));
            case 1:
                w4Var2.d(g15.class);
                return new c5((Context) w4Var2.c(Context.class), (a5) w4Var2.c(a5.class));
            case 2:
                return new n70((Context) w4Var2.c(Context.class), (a5) w4Var2.c(a5.class), w4Var2.d(c5.class), w4Var2.d(zy9.class), w4Var2.d(luf.class));
            case 3:
                return new yy9(w4Var2.d(sce.class), w4Var2.d(f03.class), w4Var2.d(xzc.class), w4Var2.d(rf4.class));
            case 4:
                return new m1a(w4Var2.d(sce.class), w4Var2.d(f03.class), w4Var2.d(zy9.class));
            case 5:
                return new r2a(w4Var2.d(sce.class));
            case 6:
                return new d8a(w4Var2.d(sce.class));
            case 7:
                return new y6a(w4Var2.d(sce.class));
            case 8:
                pae pae = (pae) w4Var2.c(pae.class);
                r7e d = w4Var2.d(jr0.class);
                r7e d2 = w4Var2.d(p97.class);
                return new sw8(pae, (ua3) w4Var2.c(ua3.class), d, w4Var2.d(pge.class), d2, (Context) w4Var2.c(Context.class));
            case 9:
                r7e d3 = w4Var2.d(zf3.class);
                r7e d4 = w4Var2.d(sya.class);
                r7e d5 = w4Var2.d(q7f.class);
                r7e d6 = w4Var2.d(hy.class);
                r7e d7 = w4Var2.d(wz.class);
                r7e d8 = w4Var2.d(hb2.class);
                r7e d9 = w4Var2.d(lz.class);
                return new yy(w4Var2.d(bf5.class), w4Var2.d(tf4.class), w4Var2.d(f03.class), d4, w4Var2.d(jc5.class), w4Var2.d(wae.class), d3, d5, w4Var2.d(c4f.class), w4Var2.d(v70.class), d6, d7, d8, d9, w4Var2.d(b6f.class), w4Var2.d(wn8.class), w4Var2.d(jb5.class), (Context) w4Var2.c(Context.class));
            case 10:
                r7e d10 = w4Var2.d(pv3.class);
                r7e d11 = w4Var2.d(jr0.class);
                r7e d12 = w4Var2.d(o4a.class);
                return new wn8(d10, w4Var2.d(p97.class), d11, w4Var2.d(w6a.class), d12, (Context) w4Var2.c(Context.class));
            case 11:
                Class<w6a> cls = w6a.class;
                r7e d13 = w4Var2.d(cls);
                Class<rp8> cls2 = rp8.class;
                t97 d14 = w4Var2.d(cls2);
                r7e d15 = w4Var2.d(ap3.class);
                r7e d16 = w4Var2.d(n1b.class);
                t97 d17 = w4Var2.d(sw8.class);
                Class<zf3> cls3 = zf3.class;
                t97 d18 = w4Var2.d(cls3);
                Class<Context> cls4 = Context.class;
                r7e d19 = w4Var2.d(ip.class);
                r7e d20 = w4Var2.d(dhe.class);
                r7e d21 = w4Var2.d(f03.class);
                r7e d22 = w4Var2.d(pae.class);
                r7e d23 = w4Var2.d(cls4);
                r7e d24 = w4Var2.d(cls2);
                Class<bv2> cls5 = bv2.class;
                w4Var2.d(cls5);
                ny nyVar = new ny(d19, d20, d21, d22, d23, d24, w4Var2.d(cls3), w4Var2.d(cls));
                r7e d25 = w4Var2.d(r59.class);
                t97 d26 = w4Var2.d(wz.class);
                r7e d27 = w4Var2.d(cls5);
                aqc aqc = (aqc) w4Var2.c(aqc.class);
                return new l3a(d13, d14, d17, d15, d18, d16, (Context) w4Var2.c(cls4), (yy) w4Var2.c(yy.class), (wn8) w4Var2.c(wn8.class), nyVar, d25, d26, d27);
            case Protos.Attaches.Attach.PRESENT:
                return new fg0(w4Var2.d(qna.class), w4Var2.d(ap3.class), w4Var2.d(w94.class), w4Var2.d(pae.class));
            case 13:
                return new mq1((ro1) w4Var2.c(ro1.class), w4Var2.d(f03.class), w4Var2.d(m1a.class), w4Var2.d(q0a.class));
            case Protos.Attaches.Attach.LOCATION:
                Class<f03> cls6 = f03.class;
                Class<xzc> cls7 = xzc.class;
                jj7 jj7 = new jj7(w4Var2.d(cls6), w4Var2.d(cls7), w4Var2.d(jq1.class));
                r7e d28 = w4Var2.d(Context.class);
                r7e d29 = w4Var2.d(eq1.class);
                Class<q0a> cls8 = q0a.class;
                r7e d30 = w4Var2.d(cls8);
                r7e d31 = w4Var2.d(cls6);
                r7e d32 = w4Var2.d(cls7);
                l83 l83 = new l83();
                r7e d33 = w4Var2.d(rf4.class);
                r7e d34 = w4Var2.d(cls8);
                r7e d35 = w4Var2.d(cls7);
                Object obj = new Object();
                l83 l832 = new l83();
                l832.e = jj7;
                l832.g = jj7;
                l832.f = jj7;
                l832.c = new dz0(0, d33);
                ((q0a) d34.getValue()).getClass();
                vqc vqc = (vqc) ((xzc) d35.getValue());
                vqc.getClass();
                if (((int) vqc.o(PmsKey.f24debugmode, (long) 0)) == 3) {
                    l832.d = obj;
                }
                l83.l = l832.h().a();
                return new c51(d28, d29, d30, new v94(l83), d31, d32, w4Var2.d(jb5.class));
            case Protos.Attaches.Attach.DAILY_MEDIA:
                Class<kp1> cls9 = kp1.class;
                Class<vp1> cls10 = vp1.class;
                l21 l21 = new l21((kp1) w4Var2.c(cls9), w4Var2.d(cls10), w4Var2.d(km1.class));
                r7e d36 = w4Var2.d(Application.class);
                r7e d37 = w4Var2.d(dj1.class);
                r7e d38 = w4Var2.d(cls10);
                r7e d39 = w4Var2.d(bt3.class);
                w4Var2.d(d11.class);
                r7e d40 = w4Var2.d(dq4.class);
                r7e d41 = w4Var2.d(fdc.class);
                r7e d42 = w4Var2.d(qz0.class);
                r7e d43 = w4Var2.d(cq1.class);
                r7e d44 = w4Var2.d(boc.class);
                r7e d45 = w4Var2.d(aka.class);
                r7e d46 = w4Var2.d(qka.class);
                r7e d47 = w4Var2.d(xp1.class);
                r7e d48 = w4Var2.d(wi4.class);
                r7e d49 = w4Var2.d(n11.class);
                ro1 ro1 = (ro1) w4Var2.c(ro1.class);
                r7e d50 = w4Var2.d(jp1.class);
                r7e d51 = w4Var2.d(pae.class);
                r7e d52 = w4Var2.d(q0a.class);
                r7e d53 = w4Var2.d(pv3.class);
                w4Var2.d(f03.class);
                r7e d54 = w4Var2.d(ip.class);
                r7e d55 = w4Var2.d(xzc.class);
                r7e d56 = w4Var2.d(iq1.class);
                r7e d57 = w4Var2.d(qna.class);
                r7e d58 = w4Var2.d(r59.class);
                r7e d59 = w4Var2.d(di3.class);
                return new ep1(d36, d37, d38, d39, d40, d42, d41, d48, d46, d49, d43, d45, d44, w4Var2.d(nnc.class), d47, d50, d51, d52, d53, d54, d55, w4Var2.d(jb5.class), d56, d57, w4Var2.d(vx0.class), ro1, l21, (kp1) w4Var2.c(cls9), d58, d59);
            case PeerConnectionFactory.Options.ADAPTER_TYPE_LOOPBACK:
                return new py0(w4Var2.d(bt3.class), w4Var2.d(d11.class), w4Var2.d(qz0.class), w4Var2.d(nnc.class), (ro1) w4Var2.c(ro1.class), w4Var2.d(rj3.class), (km1) w4Var2.c(km1.class));
            case LangUtils.HASH_SEED:
                km1 km1 = new km1(w4Var2.d(pae.class), w4Var2.d(ap3.class), w4Var2.d(f03.class), w4Var2.d(r59.class));
                r7e d60 = w4Var2.d(bt3.class);
                Class<nnc> cls11 = nnc.class;
                rb1 rb1 = new rb1(w4Var2.d(cls11));
                r7e d61 = w4Var2.d(vp1.class);
                return new oka(d60, w4Var2.d(cls11), (ro1) w4Var2.c(ro1.class), km1, rb1, d61, w4Var2.d(rj3.class));
            case 18:
                return new vp1();
            case 19:
                return new bt3();
            case ConnManagerParams.DEFAULT_MAX_TOTAL_CONNECTIONS:
                return new dq4((ro1) w4Var2.c(ro1.class));
            case 21:
                return new d11(w4Var2.d(bt3.class));
            case 22:
                return new rz0(w4Var2.d(bt3.class), new bo1(w4Var2.d(Context.class), w4Var2.d(d11.class), new nib(w4Var2.d(mib.class)), w4Var2.d(q0a.class), w4Var2.d(xzc.class)));
            case 23:
                return CallServiceImpl.w0;
            case 24:
                return new rka(w4Var2.d(bt3.class), w4Var2.d(aka.class), w4Var2.d(d11.class));
            case 25:
                return new wi4(w4Var2.d(qka.class), (ro1) w4Var2.c(ro1.class));
            case 26:
                return new jp1(w4Var2.d(tt0.class), w4Var2.d(pae.class));
            case 27:
                return new x11((ro1) w4Var2.c(ro1.class), w4Var2.d(bv2.class), w4Var2.d(pk.class), w4Var2.d(jp1.class), w4Var2.d(w6a.class), w4Var2.d(pae.class), w4Var2.d(di3.class), w4Var2.d(rj3.class), w4Var2.d(r59.class));
            case 28:
                return new Object();
            default:
                return new ro1(w4Var2.d(pae.class), w4Var2.d(ku3.class));
        }
    }
}

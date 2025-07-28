package defpackage;

import android.content.Context;
import org.apache.http.conn.params.ConnManagerParams;
import org.apache.http.util.LangUtils;
import org.webrtc.PeerConnectionFactory;
import ru.ok.tamtam.nano.Protos;

/* renamed from: h2b  reason: default package */
public final class h2b extends whd {
    public final /* synthetic */ int b;

    public /* synthetic */ h2b(int i) {
        this.b = i;
    }

    public final Object b(w4 w4Var) {
        switch (this.b) {
            case 0:
                return new vqc((Context) w4Var.c(Context.class), (we5) w4Var.c(we5.class));
            case 1:
                return (vqc) w4Var.c(yzc.class);
            case 2:
                return (xzc) w4Var.c(yzc.class);
            case 3:
                return new sqc((Context) w4Var.c(Context.class), (we5) w4Var.c(we5.class), (vqc) w4Var.c(vqc.class));
            case 4:
                return (sqc) w4Var.c(kb5.class);
            case 5:
                return (jb5) w4Var.c(kb5.class);
            case 6:
                return ((hz3) ((a04) w4Var.c(a04.class))).c;
            case 7:
                return ((hz3) ((a04) w4Var.c(a04.class))).b;
            case 8:
                return ((hz3) ((a04) w4Var.c(a04.class))).h;
            case 9:
                return ((hz3) ((a04) w4Var.c(a04.class))).g;
            case 10:
                return ((hz3) ((a04) w4Var.c(a04.class))).j;
            case 11:
                return ((hz3) ((a04) w4Var.c(a04.class))).k;
            case Protos.Attaches.Attach.PRESENT /*12*/:
                return ((hz3) ((a04) w4Var.c(a04.class))).l;
            case 13:
                return ((hz3) ((a04) w4Var.c(a04.class))).i;
            case Protos.Attaches.Attach.LOCATION /*14*/:
                return ((hz3) ((a04) w4Var.c(a04.class))).m;
            case Protos.Attaches.Attach.DAILY_MEDIA /*15*/:
                return ((hz3) ((a04) w4Var.c(a04.class))).n;
            case PeerConnectionFactory.Options.ADAPTER_TYPE_LOOPBACK /*16*/:
                return new h3d(w4Var.d(ed3.class), (g15) w4Var.c(g15.class), w4Var.d(rf4.class));
            case LangUtils.HASH_SEED /*17*/:
                return ((hz3) ((a04) w4Var.c(a04.class))).p;
            case 18:
                return ((hz3) ((a04) w4Var.c(a04.class))).q;
            case 19:
                return ((hz3) ((a04) w4Var.c(a04.class))).r;
            case ConnManagerParams.DEFAULT_MAX_TOTAL_CONNECTIONS /*20*/:
                return ((hz3) ((a04) w4Var.c(a04.class))).s;
            case 21:
                return ((hz3) ((a04) w4Var.c(a04.class))).t;
            case 22:
                return ((hz3) ((a04) w4Var.c(a04.class))).o;
            case 23:
                return ((hz3) ((a04) w4Var.c(a04.class))).u;
            case 24:
                return new rj(w4Var.d(xzc.class), w4Var.d(ip.class), w4Var.d(n1b.class), w4Var.d(bv2.class), w4Var.d(ho2.class), w4Var.d(xg0.class), (rf4) w4Var.c(rf4.class), (pae) w4Var.c(pae.class));
            case 25:
                return new m07(w4Var.d(t52.class), w4Var.d(di3.class), w4Var.d(n1b.class), w4Var.d(p7a.class));
            case 26:
                return new lce(w4Var.d(f3d.class));
            case 27:
                return (kd3) w4Var.c(h3d.class);
            case 28:
                Class<mbe> cls = mbe.class;
                qmc a = ((nbe) ((mbe) w4Var.c(cls))).a();
                mbe mbe = (mbe) w4Var.c(cls);
                mbe.getClass();
                f03 f03 = (f03) w4Var.c(f03.class);
                return new aa5((pk) w4Var.c(pk.class), (lce) w4Var.c(lce.class), a, ((nbe) mbe).a(), (tt0) w4Var.c(tt0.class), (jee) w4Var.c(jee.class));
            default:
                Class<mbe> cls2 = mbe.class;
                qmc a2 = ((nbe) ((mbe) w4Var.c(cls2))).a();
                mbe mbe2 = (mbe) w4Var.c(cls2);
                mbe2.getClass();
                f03 f032 = (f03) w4Var.c(f03.class);
                return new w95((pk) w4Var.c(pk.class), (lce) w4Var.c(lce.class), a2, ((nbe) mbe2).a(), (tt0) w4Var.c(tt0.class), (jee) w4Var.c(jee.class));
        }
    }
}

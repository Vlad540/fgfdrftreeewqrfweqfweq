package defpackage;

import android.app.Application;
import android.app.NotificationManager;
import android.content.Context;
import one.me.sdk.vendor.SystemServicesManager$PushTokenGeneratedListener;
import org.apache.http.conn.params.ConnManagerParams;
import org.apache.http.util.LangUtils;
import org.webrtc.PeerConnectionFactory;
import ru.ok.tamtam.nano.Protos;

/* renamed from: vrd  reason: default package */
public final class vrd extends whd {
    public final /* synthetic */ int b;

    public /* synthetic */ vrd(int i) {
        this.b = i;
    }

    public final Object b(w4 w4Var) {
        switch (this.b) {
            case 0:
                return new gg0(w4Var.d(f03.class), w4Var.d(bd.class), w4Var.d(xg9.class));
            case 1:
                return new iq1(w4Var.d(f03.class), w4Var.d(bd.class), w4Var.d(xg9.class));
            case 2:
                return new iff(w4Var.d(bd.class), w4Var.d(f03.class));
            case 3:
                return new f87(w4Var.d(zsd.class), w4Var.d(fa5.class), w4Var.d(l95.class), w4Var.d(lwd.class));
            case 4:
                return new Object();
            case 5:
                return new ns7(17);
            case 6:
                return new Object();
            case 7:
                r7e d = w4Var.d(bd.class);
                r7e d2 = w4Var.d(g15.class);
                r7e d3 = w4Var.d(ed3.class);
                r7e d4 = w4Var.d(rf4.class);
                return new zpe(d, d3, d4, d2, w4Var.d(bf5.class), w4Var.d(u98.class), new r7e(new lq2(1, d4)));
            case 8:
                return new ewe((zxe) w4Var.c(zxe.class), (lce) w4Var.c(lce.class), (nce) w4Var.c(nce.class), (zpe) w4Var.c(zpe.class), (f03) w4Var.c(f03.class), (pk) w4Var.c(pk.class), (qmc) ((nbe) ((mbe) w4Var.c(mbe.class))).g.getValue());
            case 9:
                r7e d5 = w4Var.d(xr0.class);
                return new aqe(w4Var, (pae) w4Var.c(pae.class), new r7e(new jqc(w4Var, 28)), w4Var.d(qw9.class), d5, (zpe) w4Var.c(zpe.class));
            case 10:
                return new h6e(w4Var.d(pk.class), w4Var.d(f03.class), w4Var.d(f3d.class), w4Var.d(zxe.class), w4Var.d(aqe.class), (zpe) w4Var.c(zpe.class));
            case 11:
                return new n6e(w4Var.d(pae.class), w4Var.d(btd.class), w4Var.d(gt3.class), w4Var.d(h6e.class));
            case Protos.Attaches.Attach.PRESENT:
                return new gg5(w4Var.d(qw9.class), (zpe) w4Var.c(zpe.class));
            case 13:
                return new cm6(new rd(w4Var.d(qw9.class), (zpe) w4Var.c(zpe.class)));
            case Protos.Attaches.Attach.LOCATION:
                return new j5e(new dda(w4Var.d(qw9.class), (zpe) w4Var.c(zpe.class)));
            case Protos.Attaches.Attach.DAILY_MEDIA:
                return new qpe(new fh4());
            case PeerConnectionFactory.Options.ADAPTER_TYPE_LOOPBACK:
                return new znc((Context) w4Var.c(Context.class));
            case LangUtils.HASH_SEED:
                return new w0f(w4Var);
            case 18:
                return new b9e(w4Var.d(ezd.class), w4Var.d(f03.class), w4Var.d(q0a.class), (b27) w4Var.c(b27.class), w4Var.d(SystemServicesManager$PushTokenGeneratedListener.class), w4Var.d(pv3.class), (ku3) w4Var.c(ku3.class));
            case 19:
                Context context = (Context) w4Var.c(Context.class);
                hvf hvf = new hvf(context);
                return new x0f(((Boolean) z0f.a.getValue()).booleanValue(), hvf, (NotificationManager) context.getSystemService("notification"));
            case ConnManagerParams.DEFAULT_MAX_TOTAL_CONNECTIONS:
                return new kdf((Application) w4Var.c(Application.class), (znc) w4Var.c(znc.class), w4Var.d(ldf.class), w4Var.d(bd.class), w4Var.d(nae.class), ((pae) w4Var.c(pae.class)).b().limitedParallelism(1, "visibility-controller"), w4Var.d(qna.class));
            case 21:
                return (aq) w4Var.c(kdf.class);
            case 22:
                return (rf4) w4Var.c(tf4.class);
            case 23:
                return new tf4((Context) w4Var.c(Context.class), (g2b) w4Var.c(g2b.class), (ezd) w4Var.c(ezd.class), w4Var.d(q0a.class), w4Var.d(b9e.class), w4Var.d(kdf.class));
            case 24:
                return js.u((Context) w4Var.c(Context.class));
            case 25:
                return new i57(w4Var.d(pae.class), w4Var.a(q57.class));
            default:
                return new m53(r57.d, w4Var.d(tif.class));
        }
    }
}

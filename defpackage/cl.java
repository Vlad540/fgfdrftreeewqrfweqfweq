package defpackage;

import android.app.Application;
import android.content.Context;
import android.content.res.Resources;
import org.apache.http.conn.params.ConnManagerParams;
import org.apache.http.util.LangUtils;
import org.webrtc.PeerConnectionFactory;
import ru.ok.tamtam.nano.Protos;

/* renamed from: cl  reason: default package */
public final class cl extends wcc {
    public final /* synthetic */ int b;

    public /* synthetic */ cl(int i) {
        this.b = i;
    }

    public final Object b(w4 w4Var) {
        w4 w4Var2 = w4Var;
        switch (this.b) {
            case 0:
                return new ng0((tt0) w4Var2.c(tt0.class), (pae) w4Var2.c(pae.class));
            case 1:
                return new sya((pae) w4Var2.c(pae.class), (va9) w4Var2.c(va9.class), (v40) w4Var2.c(v40.class));
            case 2:
                return new lz((pae) w4Var2.c(pae.class), (gz) w4Var2.c(gz.class), (Application) w4Var2.c(Application.class));
            case 3:
                return new v70(w4Var2.d(ed3.class), w4Var2.d(g2b.class), (sma) w4Var2.c(sma.class));
            case 4:
                return new b6f(w4Var2.d(yya.class));
            case 5:
                return new u5f(w4Var2.d(nve.class), w4Var2.d(b6f.class), w4Var2.d(b29.class), w4Var2.d(pk.class), w4Var2.d(c4f.class), w4Var2.d(pae.class));
            case 6:
                return new v40((Context) w4Var2.c(Context.class), (va9) w4Var2.c(va9.class), (mib) w4Var2.c(mib.class));
            case 7:
                return new kp3();
            case 8:
                return new wn3();
            case 9:
                return new Object();
            case 10:
                return new qf0((Application) w4Var2.c(Application.class), (tt0) w4Var2.c(tt0.class), (pae) w4Var2.c(pae.class));
            case 11:
                return new eq9();
            case Protos.Attaches.Attach.PRESENT /*12*/:
                qz0 qz0 = (qz0) w4Var2.c(qz0.class);
                n11 n11 = (n11) w4Var2.c(n11.class);
                nnc nnc = (nnc) w4Var2.c(nnc.class);
                eq1 eq1 = (eq1) w4Var2.c(eq1.class);
                r7e d = w4Var2.d(iq1.class);
                return new po1((so1) w4Var2.c(so1.class), qz0, (dq4) w4Var2.c(dq4.class), (aka) w4Var2.c(aka.class), (d11) w4Var2.c(d11.class), n11, eq1, nnc, (boc) w4Var2.c(boc.class), (mib) w4Var2.c(mib.class), (ro1) w4Var2.c(ro1.class), (vx0) w4Var2.c(vx0.class), d, (ed3) w4Var2.c(ed3.class));
            case 13:
                return new xk1((Context) w4Var2.c(Context.class));
            case Protos.Attaches.Attach.LOCATION /*14*/:
                return new gw8(w4Var2.d(b29.class), w4Var2.d(rp8.class), w4Var2.d(pae.class));
            case Protos.Attaches.Attach.DAILY_MEDIA /*15*/:
                return new l47(w4Var2.d(pk.class), w4Var2.d(bv2.class), w4Var2.d(tt0.class), w4Var2.d(f03.class));
            case PeerConnectionFactory.Options.ADAPTER_TYPE_LOOPBACK /*16*/:
                return new yi8((tt0) w4Var2.c(tt0.class), (pae) w4Var2.c(pae.class));
            case LangUtils.HASH_SEED /*17*/:
                return new pk8((ap3) w4Var2.c(ap3.class), (bv2) w4Var2.c(bv2.class), (yi8) w4Var2.c(yi8.class), (pae) w4Var2.c(pae.class), w4Var2.d(kn3.class), w4Var2.d(gsc.class), new r7e(new jq2(w4Var2, 0)));
            case 18:
                return (dk8) w4Var2.c(pk8.class);
            case 19:
                return (dl8) w4Var2.c(pk8.class);
            case ConnManagerParams.DEFAULT_MAX_TOTAL_CONNECTIONS /*20*/:
                return new ni8(w4Var2.d(ap3.class));
            case 21:
                return new p76(w4Var2.d(xzc.class));
            case 22:
                return er5.c;
            case 23:
                return new ua6((Context) w4Var2.c(Context.class));
            case 24:
                return new Object();
            case 25:
                return new eb6((Context) w4Var2.c(Context.class), (pae) w4Var2.c(pae.class));
            case 26:
                return new et0(w4Var2.d(b29.class));
            case 27:
                return (va9) w4Var2.c(nb9.class);
            case 28:
                Resources resources = (Resources) w4Var2.c(Resources.class);
                return new Object();
            default:
                return new pb5((t97) w4Var2.d(rf4.class), (t97) w4Var2.d(zy9.class), (t97) w4Var2.d(ap3.class), (t97) w4Var2.d(f03.class), (t97) w4Var2.d(xzc.class), (t97) w4Var2.d(Context.class));
        }
    }
}

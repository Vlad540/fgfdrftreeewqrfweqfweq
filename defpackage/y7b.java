package defpackage;

import android.content.Context;
import org.apache.http.conn.params.ConnManagerParams;
import org.apache.http.util.LangUtils;
import org.webrtc.PeerConnectionFactory;
import ru.ok.tamtam.nano.Protos;

/* renamed from: y7b  reason: default package */
public final class y7b implements wy6 {
    public final /* synthetic */ int a;

    public /* synthetic */ y7b(int i) {
        this.a = i;
    }

    public final Object a(w4 w4Var) {
        switch (this.a) {
            case 0:
                Class<jb5> cls = jb5.class;
                Class<s2b> cls2 = s2b.class;
                Class<o2b> cls3 = o2b.class;
                return ((kb5) ((jb5) w4Var.c(cls))).s() ? new eeb(w4Var.d(cls3), w4Var.d(cls2), w4Var.d(ap3.class), w4Var.d(cls)) : new x6b(w4Var.d(cls3), w4Var.d(cls2), w4Var.d(cls));
            case 1:
                return (pp7) w4Var.c(kq9.class);
            case 2:
                return (pp7) w4Var.c(voa.class);
            case 3:
                return (pp7) w4Var.c(hjb.class);
            case 4:
                return (pp7) w4Var.c(dq9.class);
            case 5:
                return (pp7) w4Var.c(x19.class);
            case 6:
                return (pp7) w4Var.c(xp9.class);
            case 7:
                return (pp7) w4Var.c(na5.class);
            case 8:
                return (pp7) w4Var.c(eb5.class);
            case 9:
                return (pp7) w4Var.c(ur9.class);
            case 10:
                return (pp7) w4Var.c(e74.class);
            case 11:
                return new b0a(w4Var, 1);
            case Protos.Attaches.Attach.PRESENT:
                return (pp7) w4Var.c(rp1.class);
            case 13:
                return (pp7) w4Var.c(in7.class);
            case Protos.Attaches.Attach.LOCATION:
                return (pp7) w4Var.c(o2b.class);
            case Protos.Attaches.Attach.DAILY_MEDIA:
                return (pp7) w4Var.c(aw2.class);
            case PeerConnectionFactory.Options.ADAPTER_TYPE_LOOPBACK:
                return (pp7) w4Var.c(r59.class);
            case LangUtils.HASH_SEED:
                return (pp7) w4Var.c(yk9.class);
            case 18:
                return (pp7) w4Var.c(lud.class);
            case 19:
                return (pp7) w4Var.c(l95.class);
            case ConnManagerParams.DEFAULT_MAX_TOTAL_CONNECTIONS:
                return (pp7) w4Var.c(v72.class);
            case 21:
                return ((c9a) w4Var.c(c9a.class)).m().V();
            case 22:
                return new of6((mtf) w4Var.c(mtf.class));
            case 23:
                return new vp9((mtf) w4Var.c(mtf.class));
            case 24:
                return new s76((pk) w4Var.c(pk.class), (tt0) w4Var.c(tt0.class), (t52) w4Var.c(t52.class));
            case 25:
                return new tve(w4Var.d(pk.class), w4Var.d(ip.class), w4Var.d(f03.class), w4Var.d(xzc.class), w4Var.d(b27.class), w4Var.d(oa3.class));
            case 26:
                return new lve(w4Var.d(pk.class), w4Var.d(ip.class), w4Var.d(pae.class));
            case 27:
                return new i5a((Context) w4Var.c(Context.class), (w6a) w4Var.c(w6a.class));
            case 28:
                return new t7d(0);
            default:
                return h8d.a;
        }
    }
}

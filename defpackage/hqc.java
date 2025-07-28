package defpackage;

import org.apache.http.conn.params.ConnManagerParams;
import org.apache.http.util.LangUtils;
import org.webrtc.PeerConnectionFactory;
import ru.ok.tamtam.nano.Protos;

/* renamed from: hqc  reason: default package */
public final class hqc implements s16 {
    public final /* synthetic */ int a;
    public final /* synthetic */ w4 b;

    public /* synthetic */ hqc(w4 w4Var, int i) {
        this.a = i;
        this.b = w4Var;
    }

    public final Object invoke() {
        switch (this.a) {
            case 0:
                return this.b.c(pk.class);
            case 1:
                return this.b.c(zy9.class);
            case 2:
                return this.b.c(dce.class);
            case 3:
                return this.b.c(mbe.class);
            case 4:
                return this.b.c(rp8.class);
            case 5:
                return this.b.c(p72.class);
            case 6:
                return this.b.c(t52.class);
            case 7:
                return this.b.c(to8.class);
            case 8:
                return this.b.c(ad3.class);
            case 9:
                return this.b.c(mb5.class);
            case 10:
                return this.b.c(w6a.class);
            case 11:
                return this.b.c(g15.class);
            case Protos.Attaches.Attach.PRESENT /*12*/:
                return this.b.c(di3.class);
            case 13:
                return this.b.c(nec.class);
            case Protos.Attaches.Attach.LOCATION /*14*/:
                return this.b.c(hb2.class);
            case Protos.Attaches.Attach.DAILY_MEDIA /*15*/:
                return this.b.c(u98.class);
            case PeerConnectionFactory.Options.ADAPTER_TYPE_LOOPBACK /*16*/:
                return this.b.c(dhe.class);
            case LangUtils.HASH_SEED /*17*/:
                return this.b.c(rf4.class);
            case 18:
                return this.b.c(g2b.class);
            case 19:
                return this.b.c(t52.class);
            case ConnManagerParams.DEFAULT_MAX_TOTAL_CONNECTIONS /*20*/:
                return this.b.c(p7a.class);
            case 21:
                return this.b.c(xzc.class);
            case 22:
                return this.b.c(bf5.class);
            case 23:
                return this.b.c(g15.class);
            case 24:
                return this.b.c(b27.class);
            case 25:
                return this.b.c(gt3.class);
            case 26:
                return this.b.c(jc5.class);
            case 27:
                return this.b.c(tt0.class);
            case 28:
                return this.b.c(bf5.class);
            default:
                return this.b.c(xq6.class);
        }
    }
}

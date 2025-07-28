package defpackage;

import org.apache.http.conn.params.ConnManagerParams;
import org.apache.http.util.LangUtils;
import org.webrtc.PeerConnectionFactory;
import ru.ok.tamtam.nano.Protos;

/* renamed from: iqc  reason: default package */
public final class iqc implements s16 {
    public final /* synthetic */ int a;
    public final /* synthetic */ w4 b;

    public /* synthetic */ iqc(w4 w4Var, int i) {
        this.a = i;
        this.b = w4Var;
    }

    public final Object invoke() {
        switch (this.a) {
            case 0:
                return this.b.c(x4a.class);
            case 1:
                return this.b.c(mbe.class);
            case 2:
                return this.b.c(pk.class);
            case 3:
                return this.b.c(f03.class);
            case 4:
                return this.b.c(g15.class);
            case 5:
                return this.b.c(pk.class);
            case 6:
                return this.b.c(xzc.class);
            case 7:
                return this.b.c(bs8.class);
            case 8:
                return this.b.c(ph4.class);
            case 9:
                return this.b.c(ck4.class);
            case 10:
                return this.b.c(w6a.class);
            case 11:
                return this.b.c(q2b.class);
            case Protos.Attaches.Attach.PRESENT /*12*/:
                return this.b.c(nae.class);
            case 13:
                return this.b.c(v72.class);
            case Protos.Attaches.Attach.LOCATION /*14*/:
                return this.b.c(a04.class);
            case Protos.Attaches.Attach.DAILY_MEDIA /*15*/:
                return this.b.c(pk.class);
            case PeerConnectionFactory.Options.ADAPTER_TYPE_LOOPBACK /*16*/:
                return this.b.c(g15.class);
            case LangUtils.HASH_SEED /*17*/:
                return this.b.c(g2b.class);
            case 18:
                return this.b.c(g2b.class);
            case 19:
                return this.b.c(q2b.class);
            case ConnManagerParams.DEFAULT_MAX_TOTAL_CONNECTIONS /*20*/:
                return this.b.c(xzc.class);
            case 21:
                return this.b.c(zr8.class);
            case 22:
                return this.b.c(aqc.class);
            case 23:
                return this.b.c(ad3.class);
            case 24:
                return this.b.c(w6a.class);
            case 25:
                return this.b.c(o2b.class);
            case 26:
                return this.b.c(pk.class);
            case 27:
                return this.b.c(rp8.class);
            case 28:
                return this.b.c(a04.class);
            default:
                return this.b.c(zpc.class);
        }
    }
}

package defpackage;

import kotlin.coroutines.Continuation;
import org.apache.http.conn.params.ConnManagerParams;
import org.apache.http.util.LangUtils;
import org.webrtc.PeerConnectionFactory;
import ru.ok.tamtam.nano.Protos;

/* renamed from: jqc  reason: default package */
public final class jqc implements s16 {
    public final /* synthetic */ int a;
    public final /* synthetic */ w4 b;

    public /* synthetic */ jqc(w4 w4Var, int i) {
        this.a = i;
        this.b = w4Var;
    }

    public final Object invoke() {
        switch (this.a) {
            case 0:
                return this.b.c(di3.class);
            case 1:
                return this.b.c(to8.class);
            case 2:
                return this.b.c(jee.class);
            case 3:
                return this.b.c(eha.class);
            case 4:
                return this.b.c(luf.class);
            case 5:
                return this.b.c(p72.class);
            case 6:
                return this.b.c(j92.class);
            case 7:
                return this.b.c(bd.class);
            case 8:
                return this.b.c(lne.class);
            case 9:
                return this.b.c(a04.class);
            case 10:
                return this.b.c(kq9.class);
            case 11:
                return this.b.c(g15.class);
            case Protos.Attaches.Attach.PRESENT /*12*/:
                return this.b.c(pk.class);
            case 13:
                return this.b.c(lce.class);
            case Protos.Attaches.Attach.LOCATION /*14*/:
                return this.b.c(v2c.class);
            case Protos.Attaches.Attach.DAILY_MEDIA /*15*/:
                return this.b.c(a04.class);
            case PeerConnectionFactory.Options.ADAPTER_TYPE_LOOPBACK /*16*/:
                return this.b.c(bf5.class);
            case LangUtils.HASH_SEED /*17*/:
                return this.b.c(pk.class);
            case 18:
                return this.b.c(om4.class);
            case 19:
                return this.b.c(ft8.class);
            case ConnManagerParams.DEFAULT_MAX_TOTAL_CONNECTIONS /*20*/:
                return this.b.c(xzc.class);
            case 21:
                return this.b.c(aa5.class);
            case 22:
                return this.b.c(a95.class);
            case 23:
                return this.b.c(zsd.class);
            case 24:
                return this.b.c(f03.class);
            case 25:
                return this.b.c(to8.class);
            case 26:
                return this.b.c(luf.class);
            case 27:
                ha6 ha6 = ha6.a;
                w4 w4Var = this.b;
                xs7.E(ha6, ((pae) w4Var.c(pae.class)).b(), (ru3) null, new x8d(w4Var, (Continuation) null), 2);
                return jue.a;
            default:
                return ((x4a) this.b.c(x4a.class)).b();
        }
    }
}

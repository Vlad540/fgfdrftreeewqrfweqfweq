package defpackage;

import org.apache.http.conn.params.ConnManagerParams;
import org.apache.http.util.LangUtils;
import org.webrtc.PeerConnectionFactory;
import ru.ok.tamtam.nano.Protos;

/* renamed from: rh2  reason: default package */
public final class rh2 implements s16 {
    public final /* synthetic */ int a;
    public final /* synthetic */ s16 b;

    public /* synthetic */ rh2(int i, s16 s16) {
        this.a = i;
        this.b = s16;
    }

    public final Object invoke() {
        switch (this.a) {
            case 0:
                return new qh2(0, this.b);
            case 1:
                return new qh2(1, this.b);
            case 2:
                return new qh2(2, this.b);
            case 3:
                return new qh2(4, this.b);
            case 4:
                return new qh2(3, this.b);
            case 5:
                return new qh2(5, this.b);
            case 6:
                return new qh2(6, this.b);
            case 7:
                return new qh2(7, this.b);
            case 8:
                return new qh2(8, this.b);
            case 9:
                return new qh2(9, this.b);
            case 10:
                return new qh2(10, this.b);
            case 11:
                return new qh2(11, this.b);
            case Protos.Attaches.Attach.PRESENT /*12*/:
                return new qh2(12, this.b);
            case 13:
                return new qh2(13, this.b);
            case Protos.Attaches.Attach.LOCATION /*14*/:
                return new qh2(14, this.b);
            case Protos.Attaches.Attach.DAILY_MEDIA /*15*/:
                return new qh2(15, this.b);
            case PeerConnectionFactory.Options.ADAPTER_TYPE_LOOPBACK:
                return new qh2(16, this.b);
            case LangUtils.HASH_SEED:
                return new qh2(17, this.b);
            case 18:
                return new qh2(18, this.b);
            case 19:
                return new qh2(19, this.b);
            case ConnManagerParams.DEFAULT_MAX_TOTAL_CONNECTIONS:
                return new qh2(20, this.b);
            case 21:
                return new qh2(21, this.b);
            case 22:
                return new qh2(22, this.b);
            case 23:
                return new qh2(23, this.b);
            case 24:
                return new qh2(24, this.b);
            case 25:
                return new qh2(25, this.b);
            case 26:
                return new qh2(26, this.b);
            case 27:
                return new qh2(27, this.b);
            case 28:
                return new qh2(28, this.b);
            default:
                return new qh2(29, this.b);
        }
    }
}

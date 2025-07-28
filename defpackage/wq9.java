package defpackage;

import org.apache.http.conn.params.ConnManagerParams;
import org.apache.http.util.LangUtils;
import org.webrtc.PeerConnectionFactory;
import ru.ok.tamtam.nano.Protos;

/* renamed from: wq9  reason: default package */
public final class wq9 implements s16 {
    public final /* synthetic */ int a;
    public final /* synthetic */ s16 b;

    public /* synthetic */ wq9(int i, s16 s16) {
        this.a = i;
        this.b = s16;
    }

    public final Object invoke() {
        switch (this.a) {
            case 0:
                return new vq9(0, this.b);
            case 1:
                return new vq9(1, this.b);
            case 2:
                return new vq9(2, this.b);
            case 3:
                return new vq9(3, this.b);
            case 4:
                return new vq9(4, this.b);
            case 5:
                return new vq9(5, this.b);
            case 6:
                return new vq9(6, this.b);
            case 7:
                return new vq9(7, this.b);
            case 8:
                return new vq9(8, this.b);
            case 9:
                return new vq9(9, this.b);
            case 10:
                return new vq9(10, this.b);
            case 11:
                return new vq9(11, this.b);
            case Protos.Attaches.Attach.PRESENT:
                return new vq9(12, this.b);
            case 13:
                return new vq9(13, this.b);
            case Protos.Attaches.Attach.LOCATION:
                return new vq9(14, this.b);
            case Protos.Attaches.Attach.DAILY_MEDIA:
                return new vq9(15, this.b);
            case PeerConnectionFactory.Options.ADAPTER_TYPE_LOOPBACK:
                return new vq9(16, this.b);
            case LangUtils.HASH_SEED:
                return new vq9(17, this.b);
            case 18:
                return new vq9(18, this.b);
            case 19:
                return new vq9(19, this.b);
            case ConnManagerParams.DEFAULT_MAX_TOTAL_CONNECTIONS:
                return new vq9(20, this.b);
            case 21:
                return new vq9(21, this.b);
            case 22:
                return new vq9(22, this.b);
            case 23:
                return new vq9(23, this.b);
            case 24:
                return new vq9(24, this.b);
            case 25:
                return new vq9(25, this.b);
            case 26:
                return new vq9(26, this.b);
            case 27:
                return new vq9(27, this.b);
            case 28:
                return new vq9(28, this.b);
            default:
                return new vq9(29, this.b);
        }
    }
}

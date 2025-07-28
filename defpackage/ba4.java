package defpackage;

import java.util.List;
import org.webrtc.PeerConnection;

/* renamed from: ba4  reason: default package */
public final /* synthetic */ class ba4 implements pf3 {
    public final /* synthetic */ da4 a;
    public final /* synthetic */ String b;
    public final /* synthetic */ xm1 c;
    public final /* synthetic */ List d;

    public /* synthetic */ ba4(da4 da4, String str, xm1 xm1, List list) {
        this.a = da4;
        this.b = str;
        this.c = xm1;
        this.d = list;
    }

    public final void accept(Object obj) {
        PeerConnection peerConnection = (PeerConnection) obj;
        this.a.u(this.b, this.c, this.d);
    }
}

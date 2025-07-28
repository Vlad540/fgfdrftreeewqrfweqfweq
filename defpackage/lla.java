package defpackage;

import org.webrtc.PeerConnection;
import org.webrtc.Size;

/* renamed from: lla  reason: default package */
public final /* synthetic */ class lla implements pf3 {
    public final /* synthetic */ zla a;
    public final /* synthetic */ Size b;
    public final /* synthetic */ int c;
    public final /* synthetic */ int d;

    public /* synthetic */ lla(zla zla, Size size, int i, int i2) {
        this.a = zla;
        this.b = size;
        this.c = i;
        this.d = i2;
    }

    public final void accept(Object obj) {
        PeerConnection peerConnection = (PeerConnection) obj;
        zla zla = this.a;
        zla.F();
        Size size = this.b;
        int i = size.width;
        int i2 = size.height;
        int i3 = zla.C0;
        nw3 nw3 = zla.s1;
        if (!(i3 == i && zla.D0 == i2)) {
            nw3.f = i2;
            nw3.c = i;
            StringBuilder sb = new StringBuilder("Camera video size changed: ");
            sb.append(zla.C0);
            sb.append("x");
            th2.l(sb, zla.D0, " -> ", i, "x");
            sb.append(i2);
            zla.O0.log("PCRTCClient", sb.toString());
            zla.C0 = i;
            zla.D0 = i2;
            zla.u(peerConnection, false);
        }
        int i4 = zla.A0;
        int i5 = this.c;
        int i6 = this.d;
        if (i4 != i5 || zla.B0 != i6) {
            nw3.g = i5;
            nw3.h = i6;
            zla.A0 = i5;
            zla.B0 = i6;
            zla.k(peerConnection, false);
        }
    }
}

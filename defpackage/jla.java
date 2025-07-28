package defpackage;

import org.webrtc.MediaConstraints;
import org.webrtc.PeerConnection;

/* renamed from: jla  reason: default package */
public final /* synthetic */ class jla implements pf3 {
    public final /* synthetic */ int a;
    public final /* synthetic */ zla b;
    public final /* synthetic */ boolean c;

    public /* synthetic */ jla(zla zla, boolean z, int i) {
        this.a = i;
        this.b = zla;
        this.c = z;
    }

    /* JADX WARNING: type inference failed for: r5v2, types: [org.webrtc.SdpObserver, wla] */
    public final void accept(Object obj) {
        PeerConnection peerConnection = (PeerConnection) obj;
        switch (this.a) {
            case 0:
                zla zla = this.b;
                MediaConstraints mediaConstraints = zla.c1;
                if (this.c) {
                    mediaConstraints = new MediaConstraints();
                    mediaConstraints.optional.addAll(zla.c1.optional);
                    mediaConstraints.mandatory.addAll(zla.c1.mandatory);
                    mediaConstraints.mandatory.add(new MediaConstraints.KeyValuePair("IceRestart", "true"));
                }
                peerConnection.createOffer(new wla(zla, 0), mediaConstraints);
                return;
            default:
                zla zla2 = this.b;
                boolean z = this.c;
                zla2.u(peerConnection, z);
                zla2.k(peerConnection, z);
                return;
        }
    }
}

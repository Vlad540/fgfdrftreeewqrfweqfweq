package defpackage;

import android.os.Handler;
import org.webrtc.PeerConnection;
import org.webrtc.SessionDescription;

/* renamed from: pla  reason: default package */
public final /* synthetic */ class pla implements pf3 {
    public final /* synthetic */ zla a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ SessionDescription c;

    public /* synthetic */ pla(zla zla, boolean z, SessionDescription sessionDescription) {
        this.a = zla;
        this.b = z;
        this.c = sessionDescription;
    }

    public final void accept(Object obj) {
        PeerConnection peerConnection = (PeerConnection) obj;
        zla zla = this.a;
        Handler handler = zla.G0;
        boolean z = this.b;
        SessionDescription sessionDescription = this.c;
        if (z) {
            handler.post(new tla(zla, sessionDescription, 0));
        } else {
            handler.post(new tla(zla, sessionDescription, 1));
        }
    }
}

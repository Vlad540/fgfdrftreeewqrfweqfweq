package defpackage;

import org.webrtc.NetworkMonitor;
import org.webrtc.PeerConnection;

/* renamed from: gzc  reason: default package */
public final /* synthetic */ class gzc implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ izc b;

    public /* synthetic */ gzc(izc izc, int i) {
        this.a = i;
        this.b = izc;
    }

    public final void run() {
        rl1 rl1;
        int i = this.a;
        izc izc = this.b;
        switch (i) {
            case 0:
                izc.getClass();
                if (NetworkMonitor.isOnline() && izc.M0.H0 && (rl1 = izc.C0) != null) {
                    ((gx0) rl1).A(izc, PeerConnection.IceConnectionState.FAILED);
                    return;
                }
                return;
            default:
                if (izc.I()) {
                    iue iue = izc.M0;
                    if (iue.F0.C() != PeerConnection.IceConnectionState.CONNECTED) {
                        d59.d(iue.X, "SERVER_CONNECTION_TIMEOUT", "in");
                    }
                    if (iue.F0 != null) {
                        iue.F0.I(iue.C0);
                        return;
                    }
                    return;
                }
                return;
        }
    }
}

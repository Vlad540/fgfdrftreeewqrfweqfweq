package defpackage;

import java.util.Iterator;
import org.webrtc.EglBase;
import org.webrtc.PeerConnectionFactory;

/* renamed from: lw0  reason: default package */
public final /* synthetic */ class lw0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ gx0 b;

    public /* synthetic */ lw0(gx0 gx0, int i) {
        this.a = i;
        this.b = gx0;
    }

    public final void run() {
        switch (this.a) {
            case 0:
                gx0 gx0 = this.b;
                if (!gx0.E0) {
                    Iterator it = gx0.u1.iterator();
                    if (it.hasNext()) {
                        hr1.r(it.next());
                        throw null;
                    }
                    return;
                }
                return;
            case 1:
                gx0 gx02 = this.b;
                gx02.w0.post(new lw0(gx02, 3));
                return;
            case 2:
                gx0 gx03 = this.b;
                if (!gx03.E0) {
                    int c = gx03.p1.c();
                    boolean z = true;
                    if (!(c == 2 || c == 1)) {
                        z = false;
                    }
                    cc9 cc9 = gx03.C1;
                    if (z != cc9.f) {
                        gx03.Z0.log("OKRTCCall", "onLocalMediaStreamChanged, media settings video enabled state (" + cc9.f + ") != camera video enabled state (" + z + "). Let us update media settings");
                        gx03.G(z);
                        return;
                    }
                    return;
                }
                return;
            case 3:
                gx0 gx04 = this.b;
                xwb xwb = gx04.Z0;
                EglBase eglBase = gx04.B0;
                try {
                    xwb.log("OKRTCCall", "Releasing " + d59.c(eglBase));
                    eglBase.release();
                    xwb.log("OKRTCCall", d59.c(eglBase) + " was released");
                    return;
                } catch (Exception e) {
                    xwb.reportException("OKRTCCall", "release.egl", e);
                    return;
                }
            default:
                gx0 gx05 = this.b;
                gx05.getClass();
                try {
                    PeerConnectionFactory peerConnectionFactory = gx05.o1.d;
                    if (peerConnectionFactory != null) {
                        peerConnectionFactory.clearDumpRequests();
                        return;
                    }
                    return;
                } catch (Throwable th) {
                    gx05.Z0.logException("OKRTCCall", "Error stopping local audio dump", th);
                    return;
                }
        }
    }

    public /* synthetic */ lw0(gx0 gx0, boolean z) {
        this.a = 0;
        this.b = gx0;
    }
}

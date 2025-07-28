package defpackage;

import org.webrtc.PeerConnectionFactory;
import org.webrtc.audio.JavaAudioDeviceModule;

/* renamed from: mcd  reason: default package */
public final /* synthetic */ class mcd implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ ocd b;

    public /* synthetic */ mcd(ocd ocd, int i) {
        this.a = i;
        this.b = ocd;
    }

    public final void run() {
        switch (this.a) {
            case 0:
                JavaAudioDeviceModule javaAudioDeviceModule = this.b.g;
                if (javaAudioDeviceModule != null) {
                    javaAudioDeviceModule.restartAudioRecording();
                    return;
                }
                return;
            default:
                ocd ocd = this.b;
                ocd.b.log("SharedPeerConnectionFac", "releaseInternal");
                PeerConnectionFactory peerConnectionFactory = ocd.d;
                if (peerConnectionFactory != null) {
                    mh9 mh9 = ocd.i;
                    if (mh9 != null) {
                        mh9.a(ocd.j);
                    }
                    peerConnectionFactory.dispose();
                    xwb xwb = ocd.b;
                    xwb.log("SharedPeerConnectionFac", d59.c(peerConnectionFactory) + " was disposed.");
                    ocd.d = null;
                }
                JavaAudioDeviceModule javaAudioDeviceModule2 = ocd.g;
                if (javaAudioDeviceModule2 != null) {
                    javaAudioDeviceModule2.release();
                    ocd.g = null;
                    return;
                }
                return;
        }
    }
}

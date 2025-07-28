package defpackage;

import org.webrtc.MediaStreamTrack;
import org.webrtc.RtpReceiver;

/* renamed from: qla  reason: default package */
public final /* synthetic */ class qla implements RtpReceiver.Observer {
    public final /* synthetic */ zla a;

    public /* synthetic */ qla(zla zla) {
        this.a = zla;
    }

    public void onFirstPacketReceived(MediaStreamTrack.MediaType mediaType) {
        zla zla = this.a;
        zla.G0.post(new ola(zla, 5));
    }
}

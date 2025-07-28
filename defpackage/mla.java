package defpackage;

import java.util.Collections;
import java.util.regex.Matcher;
import org.json.HTTP;
import org.webrtc.PeerConnection;
import org.webrtc.SessionDescription;

/* renamed from: mla  reason: default package */
public final /* synthetic */ class mla implements pf3 {
    public final /* synthetic */ int a;
    public final /* synthetic */ zla b;
    public final /* synthetic */ SessionDescription c;

    public /* synthetic */ mla(zla zla, SessionDescription sessionDescription, int i) {
        this.a = i;
        this.b = zla;
        this.c = sessionDescription;
    }

    /* JADX WARNING: type inference failed for: r9v5, types: [vla, org.webrtc.SdpObserver] */
    /* JADX WARNING: type inference failed for: r9v9, types: [vla, org.webrtc.SdpObserver] */
    public final void accept(Object obj) {
        String group;
        switch (this.a) {
            case 0:
                PeerConnection peerConnection = (PeerConnection) obj;
                zla zla = this.b;
                zla.getClass();
                SessionDescription sessionDescription = this.c;
                String str = sessionDescription.description;
                xwb xwb = zla.O0;
                xie.o(str, xwb);
                if (zla.L0 != 2) {
                    str = zla.d(str, true);
                }
                boolean z = zla.Y;
                axb axb = zla.N0;
                if (z) {
                    str = xie.C(xie.e(str, "dred", "100", axb, xwb), Collections.singletonList("opus"), axb, xwb);
                }
                Integer num = zla.Z;
                if (num != null) {
                    str = xie.e(str, "minptime", String.valueOf(num.intValue()), axb, xwb);
                }
                Integer num2 = zla.w0;
                if (num2 != null) {
                    str = xie.e(str, "maxptime", String.valueOf(num2.intValue()), axb, xwb);
                }
                if (zla.o) {
                    str = xie.C(str, Collections.singletonList("red"), axb, xwb);
                }
                String i = me4.i(str, str.endsWith("\n") ? "" : HTTP.CRLF, "a=animoji:2\r\n");
                if (!zla.X) {
                    i = xie.e(i, "usedtx", String.valueOf(1), axb, xwb);
                }
                SessionDescription sessionDescription2 = new SessionDescription(sessionDescription.type, i);
                xwb.log("PCRTCClient", zla.toString() + ": set local sdp from " + sessionDescription2.type);
                peerConnection.setLocalDescription(new vla(zla, sessionDescription2, 0), sessionDescription2);
                return;
            default:
                zla zla2 = this.b;
                SessionDescription sessionDescription3 = this.c;
                PeerConnection peerConnection2 = (PeerConnection) obj;
                zla2.getClass();
                String str2 = sessionDescription3.description;
                xie.o(str2, zla2.O0);
                if (!zla2.v1 && zla2.k1 != null) {
                    if (zla.A1.matcher(str2).find()) {
                        xwb xwb2 = zla2.O0;
                        xwb2.log("PCRTCClient", zla2.toString() + ": remote sdp supports h264 decoding");
                    } else {
                        xwb xwb3 = zla2.O0;
                        xwb3.log("PCRTCClient", zla2.toString() + ": remote does not support h264 decoding");
                        zla2.k1.m(Float.valueOf(zla2.w1), Float.valueOf(zla2.x1));
                    }
                }
                SessionDescription sessionDescription4 = new SessionDescription(sessionDescription3.type, zla2.d(str2, false));
                if (zla2.x0.c == null) {
                    Matcher matcher = zla.B1.matcher(sessionDescription3.description);
                    int i2 = 1;
                    if (matcher.find() && (group = matcher.group(1)) != null) {
                        i2 = Integer.parseInt(group);
                    }
                    zla2.P0.getClass();
                    int min = Math.min(i2, 2);
                    xwb xwb4 = zla2.O0;
                    xwb4.log("PCRTCClient", zla2.toString() + ": set animoji protocol version: " + min + "(local: 2, remote: " + i2 + ")");
                    kj kjVar = zla2.x0;
                    if (kjVar.c != null) {
                        Throwable th = new Throwable("Resetting animoji protocol version");
                        xwb xwb5 = (xwb) kjVar.a.b;
                        String message = th.getMessage();
                        if (message == null) {
                            message = "animoji error";
                        }
                        xwb5.logException("AniSend", message, th);
                    }
                    kjVar.c = Integer.valueOf(min);
                    lt4 lt4 = kjVar.g;
                    if (lt4 != null) {
                        lt4.a();
                    }
                }
                xwb xwb6 = zla2.O0;
                xwb6.log("PCRTCClient", zla2.toString() + ": set remote sdp from " + sessionDescription3.type);
                peerConnection2.setRemoteDescription(new vla(zla2, sessionDescription4, 1), sessionDescription4);
                return;
        }
    }
}

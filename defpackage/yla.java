package defpackage;

import org.webrtc.IceCandidate;
import org.webrtc.PeerConnection;
import org.webrtc.SessionDescription;

/* renamed from: yla  reason: default package */
public interface yla {
    void b(zla zla, SessionDescription sessionDescription);

    void c(zla zla);

    void d(zla zla);

    void e();

    void f(String str);

    void g();

    void h(zla zla, String str);

    void i(zla zla, IceCandidate[] iceCandidateArr);

    void l(zla zla, PeerConnection.SignalingState signalingState);

    void m(zla zla, IceCandidate iceCandidate);

    void n(zla zla, SessionDescription sessionDescription);

    void o(zla zla, PeerConnection.IceConnectionState iceConnectionState);

    void p(zla zla, long j) {
    }

    void r(zla zla);
}

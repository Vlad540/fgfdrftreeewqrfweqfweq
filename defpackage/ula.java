package defpackage;

import android.os.SystemClock;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
import org.webrtc.DataChannel;
import org.webrtc.IceCandidate;
import org.webrtc.MediaStream;
import org.webrtc.PeerConnection;
import org.webrtc.RtpReceiver;
import org.webrtc.VideoTrack;

/* renamed from: ula  reason: default package */
public final class ula implements PeerConnection.Observer {
    public final /* synthetic */ zla a;

    public /* synthetic */ ula(zla zla) {
        this.a = zla;
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [tyf, java.lang.Runnable] */
    public void a(String str, pf3 pf3) {
        zla zla = this.a;
        zla.getClass();
        zla.i(str, new tyf(zla, pf3, 0));
    }

    public void onAddStream(MediaStream mediaStream) {
        String str;
        zla zla = this.a;
        xwb xwb = zla.O0;
        StringBuilder sb = new StringBuilder("handlePeerConnectionAddStream, ");
        sb.append(zla);
        sb.append(", stream =");
        sb.append(d59.c(mediaStream));
        sb.append(", video tracks=");
        List<VideoTrack> list = mediaStream.videoTracks;
        if (list == null || list.isEmpty()) {
            str = "[Ø]";
        } else {
            StringBuilder sb2 = new StringBuilder("[");
            boolean z = true;
            for (VideoTrack next : list) {
                if (!z) {
                    sb2.append(", ");
                }
                if (next != null) {
                    sb2.append(next.getClass().getSimpleName());
                    sb2.append('@');
                    sb2.append(System.identityHashCode(next));
                } else {
                    sb2.append(216);
                }
                z = false;
            }
            sb2.append(']');
            str = sb2.toString();
        }
        sb.append(str);
        xwb.log("PCRTCClient", sb.toString());
    }

    public void onAddTrack(RtpReceiver rtpReceiver, MediaStream[] mediaStreamArr) {
        String str;
        zla zla = this.a;
        xwb xwb = zla.O0;
        StringBuilder sb = new StringBuilder("handlePeerConnectionAddTrack, ");
        sb.append(zla);
        sb.append(", receiver=");
        sb.append(rtpReceiver);
        sb.append(", streams=");
        boolean z = d59.a;
        if (mediaStreamArr == null || mediaStreamArr.length == 0) {
            str = "[Ø]";
        } else {
            StringBuilder sb2 = new StringBuilder("[");
            int length = mediaStreamArr.length;
            boolean z2 = true;
            int i = 0;
            while (i < length) {
                MediaStream mediaStream = mediaStreamArr[i];
                if (!z2) {
                    sb2.append(", ");
                }
                if (mediaStream != null) {
                    sb2.append(mediaStream.getClass().getSimpleName());
                    sb2.append('@');
                    sb2.append(System.identityHashCode(mediaStream));
                } else {
                    sb2.append(216);
                }
                i++;
                z2 = false;
            }
            sb2.append(']');
            str = sb2.toString();
        }
        sb.append(str);
        xwb.log("PCRTCClient", sb.toString());
        rtpReceiver.SetObserver(new qla(zla));
        zla.t1.k(rtpReceiver, mediaStreamArr);
        zla.G0.post(new hg9(zla, 8, mediaStreamArr));
    }

    public void onDataChannel(DataChannel dataChannel) {
        zla zla = this.a;
        zla.getClass();
        boolean equals = "animoji".equals(dataChannel.label());
        xwb xwb = zla.O0;
        if (equals && zla.z1 == 2) {
            az3 az3 = new az3(dataChannel, xwb);
            ni niVar = zla.z0;
            if (niVar != null) {
                az3 az32 = niVar.c;
                if (az32 != null) {
                    az32.c(niVar);
                }
                niVar.c = az3;
                h2d h2d = niVar.b;
                ((AtomicInteger) h2d.X).set(0);
                ((AtomicInteger) h2d.Y).set(0);
                az3.a(niVar);
            }
            kj kjVar = zla.x0;
            if (kjVar != null) {
                kjVar.d(az3);
            }
        }
        xwb.log("handlePeerConnectionDataChannel", "created channel: " + dataChannel.label() + "/" + dataChannel.id());
    }

    /* JADX WARNING: type inference failed for: r4v1, types: [tyf, java.lang.Runnable] */
    public void onIceCandidate(IceCandidate iceCandidate) {
        zla zla = this.a;
        zla.getClass();
        zla.O0.log("PCRTCClient", "handlePeerConnectionIceCandidate, " + zla);
        zla.i("onIceCandidate", new tyf(zla, new nla(zla, iceCandidate, 1), 1));
    }

    /* JADX WARNING: type inference failed for: r4v1, types: [tyf, java.lang.Runnable] */
    public void onIceCandidatesRemoved(IceCandidate[] iceCandidateArr) {
        zla zla = this.a;
        zla.getClass();
        zla.O0.log("PCRTCClient", "handlePeerConnectionIceCandidatesRemoved, " + zla);
        zla.i("onIceCandidatesRemoved", new tyf(zla, new sla(zla, 3, iceCandidateArr), 1));
    }

    public void onIceConnectionChange(PeerConnection.IceConnectionState iceConnectionState) {
        zla zla = this.a;
        zla.getClass();
        zla.O0.log("PCRTCClient", "handlePeerConnectionIceConnectionChange, " + zla + " state=" + iceConnectionState);
        PeerConnection.IceConnectionState iceConnectionState2 = PeerConnection.IceConnectionState.CONNECTED;
        vn6 vn6 = zla.R0;
        if (iceConnectionState == iceConnectionState2) {
            vn6.a(true);
        } else if (iceConnectionState == PeerConnection.IceConnectionState.CLOSED) {
            vn6.a(false);
        }
        if (iceConnectionState == iceConnectionState2 && zla.y0) {
            mac mac = new mac(true);
            dhc dhc = zla.S0;
            if (dhc != null) {
                dhc.d(new bhc(new bhc((ahc) mac)));
            }
        }
        zla.G0.post(new hg9(zla, 7, iceConnectionState));
    }

    public void onIceConnectionReceivingChange(boolean z) {
        this.a.getClass();
    }

    /* JADX WARNING: type inference failed for: r4v1, types: [tyf, java.lang.Runnable] */
    public void onIceGatheringChange(PeerConnection.IceGatheringState iceGatheringState) {
        zla zla = this.a;
        zla.getClass();
        zla.O0.log("PCRTCClient", "handlePeerConnectionIceGatheringChange, " + zla + ", state=" + iceGatheringState);
        if (iceGatheringState == PeerConnection.IceGatheringState.GATHERING) {
            vn6 vn6 = zla.R0;
            vn6.getClass();
            vn6.e = SystemClock.elapsedRealtime();
        }
        zla.i("onIceGatheringChange", new tyf(zla, new sla(zla, 0, iceGatheringState), 1));
    }

    public void onRemoveStream(MediaStream mediaStream) {
        zla zla = this.a;
        xwb xwb = zla.O0;
        xwb.log("PCRTCClient", "handlePeerConnectionRemoveStream, " + zla + ", stream=" + d59.c(mediaStream));
    }

    public void onRenegotiationNeeded() {
        zla zla = this.a;
        zla.getClass();
        zla.O0.log("PCRTCClient", "handlePeerConnectionRenegotiationNeeded, " + zla);
        zla.G0.post(new ola(zla, 4));
    }

    public void onSignalingChange(PeerConnection.SignalingState signalingState) {
        zla zla = this.a;
        zla.getClass();
        zla.O0.log("PCRTCClient", "handlePeerConnectionSignalingChange, " + zla + ", state=" + signalingState);
        zla.G0.post(new hg9(zla, 6, signalingState));
    }
}

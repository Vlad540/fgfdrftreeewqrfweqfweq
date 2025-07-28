package defpackage;

import java.util.Iterator;
import java.util.List;
import org.webrtc.AudioTrack;
import org.webrtc.MediaStreamTrack;
import org.webrtc.PeerConnection;
import org.webrtc.RtpSender;
import org.webrtc.RtpTransceiver;
import org.webrtc.VideoTrack;

/* renamed from: rla  reason: default package */
public final /* synthetic */ class rla implements pf3 {
    public final /* synthetic */ int a;
    public final /* synthetic */ zla b;

    public /* synthetic */ rla(zla zla, int i) {
        this.a = i;
        this.b = zla;
    }

    /* JADX WARNING: type inference failed for: r0v4, types: [org.webrtc.SdpObserver, wla] */
    public final void accept(Object obj) {
        xwb xwb;
        RtpTransceiver rtpTransceiver;
        VideoTrack videoTrack;
        AudioTrack audioTrack;
        switch (this.a) {
            case 0:
                PeerConnection peerConnection = (PeerConnection) obj;
                zla zla = this.b;
                zla.u(peerConnection, false);
                zla.k(peerConnection, false);
                return;
            default:
                PeerConnection peerConnection2 = (PeerConnection) obj;
                zla zla2 = this.b;
                zla2.getClass();
                List<RtpTransceiver> transceivers = peerConnection2.getTransceivers();
                RtpTransceiver rtpTransceiver2 = null;
                zla2.g1 = null;
                zla2.i1 = null;
                Iterator<RtpTransceiver> it = transceivers.iterator();
                while (true) {
                    boolean hasNext = it.hasNext();
                    xwb = zla2.O0;
                    if (hasNext) {
                        rtpTransceiver = it.next();
                        if (rtpTransceiver.getMid() != null && rtpTransceiver.getMid().contains("s") && rtpTransceiver.getMediaType() == MediaStreamTrack.MediaType.MEDIA_TYPE_AUDIO) {
                            xwb.log("PCRTCClient", "audioShareTransceiver found");
                        }
                    } else {
                        rtpTransceiver = null;
                    }
                }
                d dVar = zla2.I0;
                if (rtpTransceiver != null) {
                    try {
                        rtpTransceiver.setDirection(RtpTransceiver.RtpTransceiverDirection.SEND_ONLY);
                    } catch (Exception e) {
                        xwb.log("PCRTCClient", "audioShareTransceiver setDirection failed with error: " + e.getMessage());
                    }
                    jl7 jl7 = (jl7) dVar.a().b;
                    if (!(jl7 == null || (audioTrack = (AudioTrack) ((MediaStreamTrack) jl7.j.X)) == null)) {
                        RtpSender sender = rtpTransceiver.getSender();
                        zla2.g1 = sender;
                        zla2.F0.c(sender, "audio-share");
                        sender.setTrack(audioTrack, false);
                        xwb.log("PCRTCClient", "audioShareTransceiver setTrack, trackId = " + audioTrack.id());
                    }
                }
                Iterator<RtpTransceiver> it2 = transceivers.iterator();
                while (true) {
                    if (it2.hasNext()) {
                        RtpTransceiver next = it2.next();
                        if (next.getMid() != null && next.getMid().contains("s") && next.getMediaType() == MediaStreamTrack.MediaType.MEDIA_TYPE_VIDEO) {
                            xwb.log("PCRTCClient", "shareScreenTransceiver found");
                            rtpTransceiver2 = next;
                        }
                    }
                }
                if (rtpTransceiver2 != null) {
                    try {
                        rtpTransceiver2.setDirection(RtpTransceiver.RtpTransceiverDirection.SEND_ONLY);
                    } catch (Exception e2) {
                        xwb.log("PCRTCClient", "shareScreenTransceiver setDirection failed with error: " + e2.getMessage());
                    }
                    jl7 jl72 = (jl7) dVar.a().b;
                    if (!(jl72 == null || (videoTrack = (VideoTrack) ((MediaStreamTrack) jl72.z.X)) == null)) {
                        RtpSender sender2 = rtpTransceiver2.getSender();
                        zla2.F0.d(sender2, "screen-share", 30000, 2048000, (Double) null, false);
                        zla2.i1 = sender2;
                        sender2.setTrack(videoTrack, false);
                        RtpSender rtpSender = zla2.i1;
                        if (zla2.v1 && rtpSender != null) {
                            rtpSender.setVideoEncoderObserver(new xp0(zla2, false));
                        }
                        xwb.log("PCRTCClient", "shareScreenTransceiver setTrack, trackId = " + videoTrack.id());
                        try {
                            zla2.l(peerConnection2, false, true, zla2.i1);
                        } catch (IllegalStateException e3) {
                            xwb.log("PCRTCClient", "IllegalStateException, " + zla2 + " ex=" + e3);
                        } catch (Exception e4) {
                            xwb.log("PCRTCClient", "Exception, " + zla2 + " ex=" + e4);
                        }
                    }
                }
                zla2.v(peerConnection2);
                peerConnection2.createAnswer(new wla(zla2, 1), zla2.c1);
                return;
        }
    }
}

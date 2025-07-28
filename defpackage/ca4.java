package defpackage;

import java.io.Serializable;
import org.webrtc.MediaStream;
import org.webrtc.MediaStreamTrack;
import org.webrtc.PeerConnection;
import org.webrtc.RtpReceiver;
import org.webrtc.VideoTrack;
import ru.ok.android.externcalls.sdk.id.ParticipantId;
import ru.ok.android.externcalls.sdk.sessionroom.internal.participant.SessionRoomParticipantsDataProviderImpl;

/* renamed from: ca4  reason: default package */
public final /* synthetic */ class ca4 implements pf3 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Serializable c;
    public final /* synthetic */ Object d;

    public /* synthetic */ ca4(Object obj, Object obj2, Serializable serializable, int i) {
        this.a = i;
        this.d = obj;
        this.b = obj2;
        this.c = serializable;
    }

    public final void accept(Object obj) {
        String str;
        switch (this.a) {
            case 0:
                PeerConnection peerConnection = (PeerConnection) obj;
                da4 da4 = (da4) this.d;
                da4.getClass();
                MediaStreamTrack track = ((RtpReceiver) this.b).track();
                for (VideoTrack next : ((MediaStream[]) this.c)[0].videoTracks) {
                    String id = next.id();
                    String h = rf0.h("remote video track ", id);
                    xwb xwb = (xwb) da4.b;
                    xwb.log("DefaultRemoteVideoTracks", h);
                    if (track != null && id.equals(track.id())) {
                        xwb.log("DefaultRemoteVideoTracks", "add remote video track ".concat(id));
                        if (id.startsWith("video-")) {
                            String substring = id.substring(6);
                            if (!substring.startsWith("u") && !substring.startsWith("g")) {
                                str = "video-u".concat(substring);
                                da4.Z.put(str, next);
                                next.setEnabled(true);
                                zla zla = ((qla) da4.o).a;
                                zla.G0.post(new kla(zla, id, 2));
                            }
                        }
                        str = id;
                        da4.Z.put(str, next);
                        next.setEnabled(true);
                        zla zla2 = ((qla) da4.o).a;
                        zla2.G0.post(new kla(zla2, id, 2));
                    }
                }
                return;
            case 1:
                vja vja = (vja) this.d;
                RtpReceiver rtpReceiver = (RtpReceiver) this.b;
                MediaStream[] mediaStreamArr = (MediaStream[]) this.c;
                PeerConnection peerConnection2 = (PeerConnection) obj;
                synchronized (vja) {
                    try {
                        MediaStreamTrack track2 = rtpReceiver.track();
                        for (VideoTrack next2 : mediaStreamArr[0].videoTracks) {
                            String id2 = next2.id();
                            ((xwb) vja.b).log("ParticipantsAgnosticVideoTracks", "remote video track " + id2);
                            if (track2 != null) {
                                if (id2.equals(track2.id())) {
                                    ((xwb) vja.b).log("ParticipantsAgnosticVideoTracks", "add remote video track ".concat(id2));
                                    wja wja = new wja(vja.y0, (gvf) vja.X);
                                    uja uja = new uja(vja, id2);
                                    vja.Z.add(wja);
                                    vja.w0.add(uja);
                                    vja.Y.add(next2);
                                    if (next2.isDisposed()) {
                                        ((xwb) vja.b).log("ParticipantsAgnosticVideoTracks", "error: video track is disposed");
                                    } else {
                                        next2.addSink(wja);
                                        next2.addSink(uja);
                                    }
                                }
                            }
                        }
                    } finally {
                    }
                }
                return;
            default:
                SessionRoomParticipantsDataProviderImpl.resolveInternalIdByExternal$lambda$0((u16) this.d, (u16) this.b, (ParticipantId) this.c, (ge1) obj);
                return;
        }
    }
}

package defpackage;

import android.os.SystemClock;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import org.webrtc.IceCandidate;
import org.webrtc.MediaStreamTrack;
import org.webrtc.PeerConnection;
import org.webrtc.StatsObserver;
import org.webrtc.VideoEncoderObserver;
import ru.ok.android.externcalls.sdk.waiting_room.WaitingRoomParticipants;

/* renamed from: sla  reason: default package */
public final /* synthetic */ class sla implements pf3 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ sla(Object obj, int i, Object obj2) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }

    public final void accept(Object obj) {
        switch (this.a) {
            case 0:
                PeerConnection peerConnection = (PeerConnection) obj;
                zla zla = (zla) this.b;
                zla.getClass();
                PeerConnection.IceGatheringState iceGatheringState = PeerConnection.IceGatheringState.GATHERING;
                PeerConnection.IceGatheringState iceGatheringState2 = (PeerConnection.IceGatheringState) this.c;
                if (iceGatheringState2 == iceGatheringState) {
                    zla.Y0 = SystemClock.elapsedRealtime();
                }
                if (iceGatheringState2 == PeerConnection.IceGatheringState.COMPLETE) {
                    StringBuilder sb = new StringBuilder();
                    sb.append(zla.toString());
                    sb.append(": iceGatheringState=");
                    ArrayList arrayList = zla.j1;
                    sb.append(arrayList.size());
                    sb.append(" ");
                    sb.append(arrayList);
                    zla.O0.log("PCRTCClient", sb.toString());
                    if (zla.l1) {
                        boolean z = false;
                        zla.l1 = false;
                        Iterator it = arrayList.iterator();
                        while (it.hasNext()) {
                            IceCandidate iceCandidate = (IceCandidate) it.next();
                            if (iceCandidate.sdp.contains("typ srflx") || iceCandidate.sdp.contains("typ prflx") || iceCandidate.sdp.contains("typ relay")) {
                                z = true;
                            }
                        }
                        if (!z) {
                            zla.N0.log(tqd.app_event, "rtc.no.stun.candidates", (String) null);
                            return;
                        }
                        return;
                    }
                    return;
                }
                return;
            case 1:
                PeerConnection peerConnection2 = (PeerConnection) obj;
                zla zla2 = (zla) this.b;
                zla2.getClass();
                if (((x7f) this.c).c == 0) {
                    zla2.u(peerConnection2, false);
                    return;
                } else {
                    zla2.k(peerConnection2, false);
                    return;
                }
            case 2:
                zla zla3 = (zla) this.b;
                zla3.getClass();
                if (!((PeerConnection) obj).getStats((StatsObserver) this.c, (MediaStreamTrack) null)) {
                    zla3.O0.log("PCRTCClient", zla3.toString() + ": failed to get stats");
                    return;
                }
                return;
            case 3:
                PeerConnection peerConnection3 = (PeerConnection) obj;
                zla zla4 = (zla) this.b;
                zla4.getClass();
                StringBuilder sb2 = new StringBuilder("❄ -> removed ice candidates: ");
                IceCandidate[] iceCandidateArr = (IceCandidate[]) this.c;
                sb2.append(Arrays.toString(iceCandidateArr));
                zla4.O0.log("PCRTCClient", sb2.toString());
                zla4.G0.post(new hg9(zla4, 10, iceCandidateArr));
                return;
            case 4:
                ((PeerConnection) obj).setConfiguration(((zla) this.b).g((List) this.c));
                return;
            case 5:
                PeerConnection peerConnection4 = (PeerConnection) obj;
                xp0 xp0 = (xp0) this.b;
                xp0.getClass();
                boolean isHardwareAccelerated = ((VideoEncoderObserver.EncoderInfo) this.c).isHardwareAccelerated();
                zla zla5 = (zla) xp0.b;
                if (isHardwareAccelerated) {
                    zla5.k1.m((Float) null, (Float) null);
                    return;
                } else {
                    zla5.k1.m(Float.valueOf(zla5.w1), Float.valueOf(zla5.x1));
                    return;
                }
            default:
                WaitingRoomParticipants.loadWaitingParticipantIdsPageSingle$lambda$6$lambda$4((WaitingRoomParticipants) this.b, (nhd) this.c, (kn1) obj);
                return;
        }
    }
}

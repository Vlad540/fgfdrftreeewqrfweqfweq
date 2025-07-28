package defpackage;

import java.util.List;
import org.webrtc.IceCandidate;
import org.webrtc.PeerConnection;
import ru.ok.android.externcalls.sdk.stereo.internal.StereoRoomManagerImpl;

/* renamed from: mf3  reason: default package */
public final /* synthetic */ class mf3 implements pf3 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ mf3(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    public final void accept(Object obj) {
        switch (this.a) {
            case 0:
                ((Runnable) this.b).run();
                return;
            case 1:
                da4 da4 = (da4) this.b;
                PeerConnection peerConnection = (PeerConnection) obj;
                synchronized (da4.Y) {
                    try {
                        for (String str : da4.w0.keySet()) {
                            da4.u(str, (xm1) da4.w0.get(str), (List) null);
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                return;
            case 2:
                ((PeerConnection) obj).removeIceCandidates((IceCandidate[]) this.b);
                return;
            case 3:
                ((PeerConnection) obj).getStats(new ss8(13, (Object) (zrd) this.b));
                return;
            case 4:
                StereoRoomManagerImpl.withInternalId$lambda$11((u16) this.b, (ge1) obj);
                return;
            default:
                ((nhd) this.b).a((ge1) obj);
                return;
        }
    }
}

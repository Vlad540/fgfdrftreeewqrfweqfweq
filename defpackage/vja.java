package defpackage;

import android.os.Handler;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import org.webrtc.VideoFrame;
import org.webrtc.VideoSink;

/* renamed from: vja  reason: default package */
public final class vja extends cf3 {
    public final ConcurrentHashMap A0 = new ConcurrentHashMap();
    public final ArrayList Y = new ArrayList();
    public final ArrayList Z = new ArrayList();
    public final ArrayList w0 = new ArrayList();
    public final HashMap x0 = new HashMap();
    public final ConcurrentHashMap y0 = new ConcurrentHashMap();
    public final ConcurrentHashMap z0 = new ConcurrentHashMap();

    public vja(ula ula, xwb xwb, qla qla, gvf gvf) {
        super(ula, xwb, qla, gvf);
    }

    public final void a(ge1 ge1, VideoFrame videoFrame) {
        it4 it4 = new it4();
        it4.a = ge1;
        it4.b = w8f.b;
        List<VideoSink> list = (List) this.y0.get(it4.a());
        if (list != null) {
            for (VideoSink onFrame : list) {
                onFrame.onFrame(videoFrame);
            }
        }
    }

    public final void d() {
        d59.e();
        this.y0.clear();
        this.x0.clear();
    }

    public final void e(ge1 ge1, String str) {
        d59.e();
        HashMap hashMap = this.x0;
        Set<xm1> set = (Set) hashMap.get(ge1);
        if (set != null) {
            for (xm1 remove : set) {
                this.y0.remove(remove);
            }
            hashMap.remove(ge1);
        }
    }

    public final void f() {
        ((Handler) this.c).removeCallbacksAndMessages((Object) null);
        ((ula) this.a).a.i("ParticipantsAgnosticRemoteVideoTracks.closeInternal", new eq6(22, this));
    }

    /* JADX WARNING: type inference failed for: r4v0, types: [org.webrtc.MediaStream[], java.io.Serializable] */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void k(org.webrtc.RtpReceiver r3, org.webrtc.MediaStream[] r4) {
        /*
            r2 = this;
            ca4 r0 = new ca4
            r1 = 1
            r0.<init>(r2, r3, r4, r1)
            java.lang.String r3 = "DefaultRemoteVideoTracks.handleVideoTracksOnExecutor"
            java.lang.Object r2 = r2.a
            ula r2 = (defpackage.ula) r2
            r2.a(r3, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.vja.k(org.webrtc.RtpReceiver, org.webrtc.MediaStream[]):void");
    }

    public final void p(String str, xm1 xm1, List list) {
        d59.e();
        ConcurrentHashMap concurrentHashMap = this.y0;
        HashMap hashMap = this.x0;
        if (list == null) {
            concurrentHashMap.remove(xm1);
            Set set = (Set) hashMap.get(xm1.b);
            if (set != null) {
                set.remove(xm1);
                return;
            }
            return;
        }
        concurrentHashMap.put(xm1, list);
        Set set2 = (Set) hashMap.get(xm1.b);
        if (set2 == null) {
            set2 = new HashSet();
            hashMap.put(xm1.b, set2);
        }
        set2.add(xm1);
    }
}

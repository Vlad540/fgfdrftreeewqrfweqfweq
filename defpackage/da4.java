package defpackage;

import android.os.Handler;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import org.webrtc.VideoFrame;
import org.webrtc.VideoSink;
import org.webrtc.VideoTrack;

/* renamed from: da4  reason: default package */
public final class da4 extends cf3 {
    public static final w8f[] y0 = {w8f.a, w8f.b};
    public final ConcurrentHashMap Y = new ConcurrentHashMap();
    public final HashMap Z = new HashMap();
    public final ConcurrentHashMap w0 = new ConcurrentHashMap();
    public final ConcurrentHashMap x0 = new ConcurrentHashMap();

    public da4(ula ula, xwb xwb, qla qla, gvf gvf) {
        super(ula, xwb, qla, gvf);
    }

    public final void a(ge1 ge1, VideoFrame videoFrame) {
        it4 it4 = new it4();
        it4.a = ge1;
        it4.b = w8f.b;
        List<j8f> list = (List) this.Y.get(it4.a());
        if (list != null) {
            for (j8f a : list) {
                a.a(videoFrame);
            }
        }
    }

    public final void d() {
        ((ula) this.a).a("DefaultRemoteVideoTracks.clearRemoteVideoRenderers", new mf3(1, this));
    }

    public final void e(ge1 ge1, String str) {
        w8f[] w8fArr = y0;
        for (int i = 0; i < 2; i++) {
            w8f w8f = w8fArr[i];
            it4 it4 = new it4();
            it4.b = w8f;
            it4.a = ge1;
            p(str, it4.a(), (List) null);
        }
    }

    public final void f() {
        ((Handler) this.c).removeCallbacksAndMessages((Object) null);
        synchronized (this.Y) {
            try {
                for (List<j8f> it : this.Y.values()) {
                    for (j8f j8f : it) {
                        j8f.a = null;
                    }
                }
            } catch (Throwable th) {
                while (true) {
                    throw th;
                }
            }
        }
        ((ula) this.a).a.i("DefaultRemoteVideoTracks.closeOnExecutor", new ds1(27, this));
    }

    /* JADX WARNING: type inference failed for: r4v0, types: [org.webrtc.MediaStream[], java.io.Serializable] */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void k(org.webrtc.RtpReceiver r3, org.webrtc.MediaStream[] r4) {
        /*
            r2 = this;
            ca4 r0 = new ca4
            r1 = 0
            r0.<init>(r2, r3, r4, r1)
            java.lang.String r3 = "DefaultRemoteVideoTracks.handleVideoTracksOnExecutor"
            java.lang.Object r2 = r2.a
            ula r2 = (defpackage.ula) r2
            r2.a(r3, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.da4.k(org.webrtc.RtpReceiver, org.webrtc.MediaStream[]):void");
    }

    public final void p(String str, xm1 xm1, List list) {
        ((ula) this.a).a("DefaultRemoteVideoTracks.setRemoteVideoRenderersOnExecutor", new ba4(this, str, xm1, list));
    }

    /* JADX WARNING: type inference failed for: r4v0, types: [j8f, java.lang.Object, org.webrtc.VideoSink] */
    public final void u(String str, xm1 xm1, List list) {
        synchronized (this.Y) {
            try {
                VideoTrack videoTrack = (VideoTrack) this.Z.get(str);
                if (videoTrack == null) {
                    ((xwb) this.b).log("DefaultRemoteVideoTracks", "no " + xm1 + " track");
                    return;
                }
                List<j8f> list2 = (List) this.Y.get(xm1);
                if (list2 == null) {
                    ((xwb) this.b).log("DefaultRemoteVideoTracks", "no renderers for " + xm1 + " track");
                } else {
                    for (j8f j8f : list2) {
                        j8f.a = null;
                        try {
                            videoTrack.removeSink(j8f);
                        } catch (Exception unused) {
                        }
                    }
                }
                ArrayList arrayList = new ArrayList();
                if (list != null) {
                    Iterator it = list.iterator();
                    while (it.hasNext()) {
                        ? obj = new Object();
                        obj.a = (VideoSink) it.next();
                        arrayList.add(obj);
                        if (xm1.a == w8f.a && !videoTrack.isDisposed()) {
                            videoTrack.addSink(obj);
                        }
                    }
                }
                xm1 xm12 = (xm1) this.w0.get(str);
                if (xm12 != null) {
                    this.w0.remove(str);
                    this.x0.remove(xm12);
                }
                this.w0.put(str, xm1);
                this.x0.put(xm1, str);
                this.Y.put(xm1, Collections.unmodifiableList(arrayList));
            } finally {
            }
        }
    }
}

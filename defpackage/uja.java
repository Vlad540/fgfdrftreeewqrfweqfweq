package defpackage;

import java.util.concurrent.ConcurrentHashMap;
import org.webrtc.VideoFrame;
import org.webrtc.VideoSink;

/* renamed from: uja  reason: default package */
public final class uja implements VideoSink {
    public final String a;
    public long b = -1;
    public final /* synthetic */ vja c;

    public uja(vja vja, String str) {
        this.c = vja;
        this.a = str;
    }

    public final void onFrame(VideoFrame videoFrame) {
        xm1 xm1;
        Long compactParticipantId = videoFrame.getCompactParticipantId();
        if (compactParticipantId == null) {
            compactParticipantId = -1L;
        }
        if (compactParticipantId.longValue() != this.b) {
            this.b = compactParticipantId.longValue();
            if (compactParticipantId.longValue() == -1) {
                compactParticipantId = null;
            }
            vja vja = this.c;
            ConcurrentHashMap concurrentHashMap = vja.z0;
            String str = this.a;
            xm1 xm12 = (xm1) concurrentHashMap.get(str);
            ConcurrentHashMap concurrentHashMap2 = vja.A0;
            ConcurrentHashMap concurrentHashMap3 = vja.z0;
            if (xm12 != null) {
                concurrentHashMap3.remove(str, xm12);
                concurrentHashMap2.remove(xm12, str);
            }
            if (compactParticipantId != null && (xm1 = (xm1) ((ConcurrentHashMap) ((gvf) vja.X).b).get(Integer.valueOf((int) compactParticipantId.longValue()))) != null) {
                concurrentHashMap3.put(str, xm1);
                concurrentHashMap2.put(xm1, str);
            }
        }
    }
}

package defpackage;

import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import org.webrtc.VideoFrame;
import org.webrtc.VideoSink;

/* renamed from: wja  reason: default package */
public final class wja implements VideoSink {
    public final Map a;
    public final gvf b;

    public wja(ConcurrentHashMap concurrentHashMap, gvf gvf) {
        this.a = concurrentHashMap;
        this.b = gvf;
    }

    public final void onFrame(VideoFrame videoFrame) {
        Long compactParticipantId;
        xm1 xm1;
        List<VideoSink> list;
        if ((videoFrame.getRotatedWidth() > 16 || videoFrame.getRotatedHeight() > 16) && (compactParticipantId = videoFrame.getCompactParticipantId()) != null && (xm1 = (xm1) ((ConcurrentHashMap) this.b.b).get(Integer.valueOf((int) compactParticipantId.longValue()))) != null && (list = (List) this.a.get(xm1)) != null) {
            for (VideoSink onFrame : list) {
                onFrame.onFrame(videoFrame);
            }
        }
    }
}

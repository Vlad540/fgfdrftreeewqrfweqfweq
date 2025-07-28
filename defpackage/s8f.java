package defpackage;

import org.webrtc.VideoFrame;
import org.webrtc.VideoSink;
import org.webrtc.VideoSource;

/* renamed from: s8f  reason: default package */
public final /* synthetic */ class s8f implements VideoSink {
    public final /* synthetic */ VideoSource a;

    public /* synthetic */ s8f(VideoSource videoSource) {
        this.a = videoSource;
    }

    public final void onFrame(VideoFrame videoFrame) {
        this.a.lambda$setVideoProcessor$1(videoFrame);
    }
}

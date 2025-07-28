package defpackage;

import org.webrtc.VideoFrame;
import ru.ok.android.externcalls.sdk.ui.FrameDecorator;
import ru.ok.android.externcalls.sdk.video.ParticipantVideoViewManager;

/* renamed from: tja  reason: default package */
public final /* synthetic */ class tja implements FrameDecorator {
    public final VideoFrame apply(VideoFrame videoFrame) {
        return ParticipantVideoViewManager.setParticipantView$lambda$0(videoFrame);
    }
}

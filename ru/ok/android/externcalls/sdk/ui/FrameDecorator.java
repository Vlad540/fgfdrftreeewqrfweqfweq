package ru.ok.android.externcalls.sdk.ui;

import kotlin.Metadata;
import org.webrtc.VideoFrame;

@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bæ\u0001\u0018\u0000 \u00052\u00020\u0001:\u0001\u0005J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0003H&ø\u0001\u0000\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0006À\u0006\u0001"}, d2 = {"Lru/ok/android/externcalls/sdk/ui/FrameDecorator;", "", "apply", "Lorg/webrtc/VideoFrame;", "frame", "Companion", "calls-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public interface FrameDecorator {
    public static final Companion Companion = Companion.$$INSTANCE;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001b\u0010\t\u001a\u00020\u00048FX\u0002¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006\n"}, d2 = {"Lru/ok/android/externcalls/sdk/ui/FrameDecorator$Companion;", "", "<init>", "()V", "Lru/ok/android/externcalls/sdk/ui/FrameDecorator;", "EMPTY$delegate", "Lt97;", "getEMPTY", "()Lru/ok/android/externcalls/sdk/ui/FrameDecorator;", "EMPTY", "calls-sdk_release"}, k = 1, mv = {1, 9, 0})
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();
        private static final t97 EMPTY$delegate = new r7e(FrameDecorator$Companion$EMPTY$2.INSTANCE);

        private Companion() {
        }

        public final FrameDecorator getEMPTY() {
            return (FrameDecorator) EMPTY$delegate.getValue();
        }
    }

    VideoFrame apply(VideoFrame videoFrame);
}

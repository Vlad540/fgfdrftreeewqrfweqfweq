package ru.ok.android.externcalls.sdk.video;

import android.content.Context;
import android.view.View;
import java.util.Collection;
import kotlin.Metadata;
import org.webrtc.VideoFrame;
import org.webrtc.VideoSink;
import ru.ok.android.externcalls.sdk.ConversationParticipant;
import ru.ok.android.externcalls.sdk.layout.ConversationDisplayLayoutItem;
import ru.ok.android.externcalls.sdk.layout.ConversationVideoTrackParticipantKey;
import ru.ok.android.externcalls.sdk.ui.FrameDecorator;
import ru.ok.android.externcalls.sdk.ui.RendererView;
import ru.ok.android.externcalls.sdk.video.internal.ParticipantVideoViewManagerImpl;

@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u001e\n\u0002\u0018\u0002\n\u0002\b\t\bf\u0018\u0000 +*\b\b\u0000\u0010\u0002*\u00020\u00012\u00020\u0003:\u0001+J\u0017\u0010\u0006\u001a\u00028\u00002\u0006\u0010\u0005\u001a\u00020\u0004H&¢\u0006\u0004\b\u0006\u0010\u0007J\u001f\u0010\f\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00028\u00002\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u000e\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ'\u0010\u0013\u001a\u00020\u000b2\u000e\u0010\u0012\u001a\n\u0018\u00010\u0010j\u0004\u0018\u0001`\u00112\u0006\u0010\b\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J/\u0010\u0013\u001a\u00020\u000b2\u000e\u0010\u0012\u001a\n\u0018\u00010\u0010j\u0004\u0018\u0001`\u00112\u0006\u0010\b\u001a\u00028\u00002\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\u0013\u0010\u0015J#\u0010\u0016\u001a\u00020\u000b2\n\u0010\u0012\u001a\u00060\u0010j\u0002`\u00112\u0006\u0010\b\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u0016\u0010\u0014J\u0017\u0010\u0017\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u0017\u0010\u000fJ#\u0010\u001a\u001a\u00020\u000b2\n\u0010\u0012\u001a\u00060\u0010j\u0002`\u00112\u0006\u0010\u0019\u001a\u00020\u0018H\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ\u0017\u0010\u001e\u001a\u00020\u000b2\u0006\u0010\u001d\u001a\u00020\u001cH\u0016¢\u0006\u0004\b\u001e\u0010\u001fJ\u000f\u0010 \u001a\u00020\u000bH\u0016¢\u0006\u0004\b \u0010!J\u001d\u0010%\u001a\u00020\u000b2\f\u0010$\u001a\b\u0012\u0004\u0012\u00020#0\"H\u0016¢\u0006\u0004\b%\u0010&J\u000f\u0010'\u001a\u00020\u000bH\u0016¢\u0006\u0004\b'\u0010!R\u001c\u0010*\u001a\n\u0018\u00010\u0010j\u0004\u0018\u0001`\u00118&X¦\u0004¢\u0006\u0006\u001a\u0004\b(\u0010)ø\u0001\u0000\u0002\u0006\n\u0004\b!0\u0001¨\u0006,À\u0006\u0001"}, d2 = {"Lru/ok/android/externcalls/sdk/video/ParticipantVideoViewManager;", "Lru/ok/android/externcalls/sdk/ui/RendererView;", "R", "", "Landroid/content/Context;", "context", "createVideoViewInstance", "(Landroid/content/Context;)Lru/ok/android/externcalls/sdk/ui/RendererView;", "renderView", "Lru/ok/android/externcalls/sdk/ui/FrameDecorator;", "decorator", "Ljue;", "setOwnVideoParticipantView", "(Lru/ok/android/externcalls/sdk/ui/RendererView;Lru/ok/android/externcalls/sdk/ui/FrameDecorator;)V", "removeOwnVideoParticipantView", "(Lru/ok/android/externcalls/sdk/ui/RendererView;)V", "Lru/ok/android/externcalls/sdk/layout/ConversationVideoTrackParticipantKey;", "Lru/ok/android/externcalls/sdk/video/VideoTrack;", "key", "setParticipantView", "(Lru/ok/android/externcalls/sdk/layout/ConversationVideoTrackParticipantKey;Lru/ok/android/externcalls/sdk/ui/RendererView;)V", "(Lru/ok/android/externcalls/sdk/layout/ConversationVideoTrackParticipantKey;Lru/ok/android/externcalls/sdk/ui/RendererView;Lru/ok/android/externcalls/sdk/ui/FrameDecorator;)V", "removeParticipantView", "releaseParticipantView", "", "isMirror", "setMirror", "(Lru/ok/android/externcalls/sdk/layout/ConversationVideoTrackParticipantKey;Z)V", "Lru/ok/android/externcalls/sdk/ConversationParticipant;", "participant", "rebindParticipantView", "(Lru/ok/android/externcalls/sdk/ConversationParticipant;)V", "rebindParticipantViews", "()V", "", "Lru/ok/android/externcalls/sdk/layout/ConversationDisplayLayoutItem;", "displayLayouts", "updateDisplayLayout", "(Ljava/util/Collection;)V", "clear", "getOwnVideoTrack", "()Lru/ok/android/externcalls/sdk/layout/ConversationVideoTrackParticipantKey;", "ownVideoTrack", "Companion", "calls-sdk_release"}, k = 1, mv = {1, 9, 0})
public interface ParticipantVideoViewManager<R extends RendererView> {
    public static final Companion Companion = Companion.$$INSTANCE;

    @Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J[\u0010\u0011\u001a\b\u0012\u0004\u0012\u00028\u00010\u0010\"\u0010\b\u0001\u0010\u0007*\u00020\u0004*\u00020\u0005*\u00020\u00062\u000e\u0010\n\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\t0\b2\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00028\u00010\u000b2\u000e\b\u0002\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\bH\u0007¢\u0006\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, d2 = {"Lru/ok/android/externcalls/sdk/video/ParticipantVideoViewManager$Companion;", "", "<init>", "()V", "Landroid/view/View;", "Lorg/webrtc/VideoSink;", "Lru/ok/android/externcalls/sdk/ui/RendererView;", "T", "Lkotlin/Function0;", "Lru/ok/android/externcalls/sdk/Conversation;", "conversation", "Lkotlin/Function1;", "Landroid/content/Context;", "factory", "Ljue;", "ownCameraCallback", "Lru/ok/android/externcalls/sdk/video/ParticipantVideoViewManager;", "newInstance", "(Ls16;Lu16;Ls16;)Lru/ok/android/externcalls/sdk/video/ParticipantVideoViewManager;", "calls-sdk_release"}, k = 1, mv = {1, 9, 0})
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();

        private Companion() {
        }

        public static /* synthetic */ ParticipantVideoViewManager newInstance$default(Companion companion, s16 s16, u16 u16, ParticipantVideoViewManager$Companion$newInstance$1 participantVideoViewManager$Companion$newInstance$1, int i, Object obj) {
            if ((i & 4) != 0) {
                participantVideoViewManager$Companion$newInstance$1 = ParticipantVideoViewManager$Companion$newInstance$1.INSTANCE;
            }
            return companion.newInstance(s16, u16, participantVideoViewManager$Companion$newInstance$1);
        }

        public final <T extends View & VideoSink & RendererView> ParticipantVideoViewManager<T> newInstance(s16 s16, u16 u16, s16 s162) {
            return new ParticipantVideoViewManagerImpl(s16, u16, s162);
        }
    }

    static <T extends View & VideoSink & RendererView> ParticipantVideoViewManager<T> newInstance(s16 s16, u16 u16, s16 s162) {
        return Companion.newInstance(s16, u16, s162);
    }

    /* access modifiers changed from: private */
    static VideoFrame setParticipantView$lambda$0(VideoFrame videoFrame) {
        return videoFrame;
    }

    void clear() {
    }

    R createVideoViewInstance(Context context);

    ConversationVideoTrackParticipantKey getOwnVideoTrack();

    void rebindParticipantView(ConversationParticipant conversationParticipant) {
    }

    void rebindParticipantViews() {
    }

    void releaseParticipantView(R r) {
    }

    void removeOwnVideoParticipantView(R r) {
    }

    void removeParticipantView(ConversationVideoTrackParticipantKey conversationVideoTrackParticipantKey, R r) {
    }

    void setMirror(ConversationVideoTrackParticipantKey conversationVideoTrackParticipantKey, boolean z) {
    }

    void setOwnVideoParticipantView(R r, FrameDecorator frameDecorator) {
    }

    void setParticipantView(ConversationVideoTrackParticipantKey conversationVideoTrackParticipantKey, R r, FrameDecorator frameDecorator) {
    }

    void updateDisplayLayout(Collection<ConversationDisplayLayoutItem> collection) {
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [ru.ok.android.externcalls.sdk.ui.FrameDecorator, java.lang.Object] */
    void setParticipantView(ConversationVideoTrackParticipantKey conversationVideoTrackParticipantKey, R r) {
        setParticipantView(conversationVideoTrackParticipantKey, r, new Object());
    }
}

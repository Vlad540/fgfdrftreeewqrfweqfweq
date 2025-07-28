package ru.ok.android.externcalls.sdk.video.internal;

import android.content.Context;
import android.view.View;
import java.util.Collection;
import kotlin.Metadata;
import org.webrtc.VideoSink;
import ru.ok.android.externcalls.sdk.Conversation;
import ru.ok.android.externcalls.sdk.ConversationParticipant;
import ru.ok.android.externcalls.sdk.layout.ConversationDisplayLayoutItem;
import ru.ok.android.externcalls.sdk.layout.ConversationVideoTrackParticipantKey;
import ru.ok.android.externcalls.sdk.ui.FrameDecorator;
import ru.ok.android.externcalls.sdk.ui.RendererView;
import ru.ok.android.externcalls.sdk.video.DisplayLayoutSender;
import ru.ok.android.externcalls.sdk.video.ParticipantVideoViewManager;
import ru.ok.android.externcalls.sdk.video.VideoRender;

@Metadata(d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\u001e\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u0000*\u0010\b\u0000\u0010\u0004*\u00020\u0001*\u00020\u0002*\u00020\u00032\b\u0012\u0004\u0012\u00028\u00000\u0005B9\u0012\u000e\u0010\b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u0006\u0012\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00028\u00000\t\u0012\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u0006¢\u0006\u0004\b\u000e\u0010\u000fJ\u001b\u0010\u0012\u001a\u00020\f*\u00020\u00072\u0006\u0010\u0011\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0015\u001a\u00028\u00002\u0006\u0010\u0014\u001a\u00020\nH\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u001f\u0010\u001a\u001a\u00020\f2\u0006\u0010\u0017\u001a\u00028\u00002\u0006\u0010\u0019\u001a\u00020\u0018H\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ\u0017\u0010\u001c\u001a\u00020\f2\u0006\u0010\u0017\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u001c\u0010\u001dJ/\u0010!\u001a\u00020\f2\u000e\u0010 \u001a\n\u0018\u00010\u001ej\u0004\u0018\u0001`\u001f2\u0006\u0010\u0017\u001a\u00028\u00002\u0006\u0010\u0019\u001a\u00020\u0018H\u0016¢\u0006\u0004\b!\u0010\"J#\u0010#\u001a\u00020\f2\n\u0010 \u001a\u00060\u001ej\u0002`\u001f2\u0006\u0010\u0017\u001a\u00028\u0000H\u0016¢\u0006\u0004\b#\u0010$J#\u0010'\u001a\u00020\f2\n\u0010 \u001a\u00060\u001ej\u0002`\u001f2\u0006\u0010&\u001a\u00020%H\u0016¢\u0006\u0004\b'\u0010(J\u0017\u0010\u0012\u001a\u00020\f2\u0006\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0012\u0010)J\u000f\u0010*\u001a\u00020\fH\u0016¢\u0006\u0004\b*\u0010+J\u001d\u0010/\u001a\u00020\f2\f\u0010.\u001a\b\u0012\u0004\u0012\u00020-0,H\u0016¢\u0006\u0004\b/\u00100J\u0017\u00101\u001a\u00020\f2\u0006\u0010\u0017\u001a\u00028\u0000H\u0016¢\u0006\u0004\b1\u0010\u001dR\u001c\u0010\b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u00068\u0002X\u0004¢\u0006\u0006\n\u0004\b\b\u00102R \u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00028\u00000\t8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u000b\u00103R\u001a\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u00068\u0002X\u0004¢\u0006\u0006\n\u0004\b\r\u00102R\u001a\u00105\u001a\b\u0012\u0004\u0012\u00028\u0000048\u0002X\u0004¢\u0006\u0006\n\u0004\b5\u00106R\u001c\u00109\u001a\n\u0018\u00010\u001ej\u0004\u0018\u0001`\u001f8VX\u0004¢\u0006\u0006\u001a\u0004\b7\u00108¨\u0006:"}, d2 = {"Lru/ok/android/externcalls/sdk/video/internal/ParticipantVideoViewManagerImpl;", "Landroid/view/View;", "Lorg/webrtc/VideoSink;", "Lru/ok/android/externcalls/sdk/ui/RendererView;", "R", "Lru/ok/android/externcalls/sdk/video/ParticipantVideoViewManager;", "Lkotlin/Function0;", "Lru/ok/android/externcalls/sdk/Conversation;", "conversation", "Lkotlin/Function1;", "Landroid/content/Context;", "factory", "Ljue;", "onOwnCameraRendererSet", "<init>", "(Ls16;Lu16;Ls16;)V", "Lru/ok/android/externcalls/sdk/ConversationParticipant;", "participant", "rebindParticipantView", "(Lru/ok/android/externcalls/sdk/Conversation;Lru/ok/android/externcalls/sdk/ConversationParticipant;)V", "context", "createVideoViewInstance", "(Landroid/content/Context;)Landroid/view/View;", "renderView", "Lru/ok/android/externcalls/sdk/ui/FrameDecorator;", "decorator", "setOwnVideoParticipantView", "(Landroid/view/View;Lru/ok/android/externcalls/sdk/ui/FrameDecorator;)V", "removeOwnVideoParticipantView", "(Landroid/view/View;)V", "Lru/ok/android/externcalls/sdk/layout/ConversationVideoTrackParticipantKey;", "Lru/ok/android/externcalls/sdk/video/VideoTrack;", "key", "setParticipantView", "(Lru/ok/android/externcalls/sdk/layout/ConversationVideoTrackParticipantKey;Landroid/view/View;Lru/ok/android/externcalls/sdk/ui/FrameDecorator;)V", "removeParticipantView", "(Lru/ok/android/externcalls/sdk/layout/ConversationVideoTrackParticipantKey;Landroid/view/View;)V", "", "isMirror", "setMirror", "(Lru/ok/android/externcalls/sdk/layout/ConversationVideoTrackParticipantKey;Z)V", "(Lru/ok/android/externcalls/sdk/ConversationParticipant;)V", "rebindParticipantViews", "()V", "", "Lru/ok/android/externcalls/sdk/layout/ConversationDisplayLayoutItem;", "displayLayouts", "updateDisplayLayout", "(Ljava/util/Collection;)V", "releaseParticipantView", "Ls16;", "Lu16;", "Lru/ok/android/externcalls/sdk/video/VideoRender;", "videoRender", "Lru/ok/android/externcalls/sdk/video/VideoRender;", "getOwnVideoTrack", "()Lru/ok/android/externcalls/sdk/layout/ConversationVideoTrackParticipantKey;", "ownVideoTrack", "calls-sdk_release"}, k = 1, mv = {1, 9, 0})
public final class ParticipantVideoViewManagerImpl<R extends View & VideoSink & RendererView> implements ParticipantVideoViewManager<R> {
    private final s16 conversation;
    private final u16 factory;
    private final s16 onOwnCameraRendererSet;
    private final VideoRender<R> videoRender = new VideoRender<>();

    public ParticipantVideoViewManagerImpl(s16 s16, u16 u16, s16 s162) {
        this.conversation = s16;
        this.factory = u16;
        this.onOwnCameraRendererSet = s162;
    }

    public ConversationVideoTrackParticipantKey getOwnVideoTrack() {
        Conversation conversation2 = (Conversation) this.conversation.invoke();
        if (conversation2 != null) {
            return new ConversationVideoTrackParticipantKey.Builder().setParticipantId(conversation2.getMe().getExternalId()).build();
        }
        return null;
    }

    public void rebindParticipantView(ConversationParticipant conversationParticipant) {
        Conversation conversation2 = (Conversation) this.conversation.invoke();
        if (conversation2 != null) {
            rebindParticipantView(conversation2, conversationParticipant);
        }
    }

    public void rebindParticipantViews() {
        Conversation conversation2 = (Conversation) this.conversation.invoke();
        if (conversation2 != null && conversation2.getState() == Conversation.State.Connected) {
            for (ConversationParticipant rebindParticipantView : conversation2.getParticipants()) {
                rebindParticipantView(conversation2, rebindParticipantView);
            }
        }
    }

    public void setMirror(ConversationVideoTrackParticipantKey conversationVideoTrackParticipantKey, boolean z) {
        this.videoRender.setMirror(conversationVideoTrackParticipantKey, z);
    }

    public void updateDisplayLayout(Collection<ConversationDisplayLayoutItem> collection) {
        DisplayLayoutSender displayLayoutSender;
        Conversation conversation2 = (Conversation) this.conversation.invoke();
        if (conversation2 != null && (displayLayoutSender = conversation2.getDisplayLayoutSender()) != null) {
            displayLayoutSender.sendDisplayLayouts(collection);
        }
    }

    private final void rebindParticipantView(Conversation conversation2, ConversationParticipant conversationParticipant) {
        if (conversationParticipant.isUseable()) {
            for (ConversationVideoTrackParticipantKey conversationVideoTrackParticipantKey : conversation2.getVideoRenderManager().getRenderers(conversationParticipant.getExternalId()).keySet()) {
                conversation2.getVideoRenderManager().setRenderers(conversationVideoTrackParticipantKey, this.videoRender.asOkVideoSink(conversationVideoTrackParticipantKey));
            }
        }
    }

    public R createVideoViewInstance(Context context) {
        return (View) this.factory.invoke(context);
    }

    public void releaseParticipantView(R r) {
        ((RendererView) r).release();
    }

    public void removeOwnVideoParticipantView(R r) {
        ConversationVideoTrackParticipantKey ownVideoTrack = getOwnVideoTrack();
        if (ownVideoTrack != null) {
            removeParticipantView(ownVideoTrack, r);
        }
    }

    public void removeParticipantView(ConversationVideoTrackParticipantKey conversationVideoTrackParticipantKey, R r) {
        ConversationParticipant conversationParticipant;
        Conversation conversation2 = (Conversation) this.conversation.invoke();
        VideoSink videoSink = (VideoSink) r;
        if (this.videoRender.contains(conversationVideoTrackParticipantKey, videoSink)) {
            this.videoRender.removeDelegate(conversationVideoTrackParticipantKey, videoSink);
            if (conversation2 != null && (conversationParticipant = conversation2.getParticipants().get(conversationVideoTrackParticipantKey.getParticipantId())) != null && conversationParticipant.isUseable()) {
                conversation2.getVideoRenderManager().setRenderers(conversationVideoTrackParticipantKey, this.videoRender.asOkVideoSink(conversationVideoTrackParticipantKey));
            }
        }
    }

    public void setOwnVideoParticipantView(R r, FrameDecorator frameDecorator) {
        setParticipantView(getOwnVideoTrack(), (RendererView) r);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0021, code lost:
        r1 = r5.getParticipantId();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void setParticipantView(ru.ok.android.externcalls.sdk.layout.ConversationVideoTrackParticipantKey r5, R r6, ru.ok.android.externcalls.sdk.ui.FrameDecorator r7) {
        /*
            r4 = this;
            s16 r0 = r4.conversation
            java.lang.Object r0 = r0.invoke()
            ru.ok.android.externcalls.sdk.Conversation r0 = (ru.ok.android.externcalls.sdk.Conversation) r0
            if (r0 == 0) goto L_0x007b
            ru.ok.android.externcalls.sdk.Conversation$State r1 = r0.getState()
            ru.ok.android.externcalls.sdk.Conversation$State r2 = ru.ok.android.externcalls.sdk.Conversation.State.Connected
            if (r1 == r2) goto L_0x0013
            goto L_0x007b
        L_0x0013:
            if (r5 == 0) goto L_0x007b
            ru.ok.android.externcalls.sdk.video.VideoRender<R> r1 = r4.videoRender
            r2 = r6
            org.webrtc.VideoSink r2 = (org.webrtc.VideoSink) r2
            boolean r1 = r1.contains(r5, r2)
            if (r1 == 0) goto L_0x0021
            goto L_0x007b
        L_0x0021:
            ru.ok.android.externcalls.sdk.id.ParticipantId r1 = r5.getParticipantId()
            ru.ok.android.externcalls.sdk.participant.collection.ParticipantCollection r3 = r0.getParticipants()
            ru.ok.android.externcalls.sdk.ConversationParticipant r3 = r3.get(r1)
            if (r3 == 0) goto L_0x007b
            boolean r3 = r3.isUseable()
            if (r3 != 0) goto L_0x0036
            goto L_0x007b
        L_0x0036:
            ru.ok.android.externcalls.sdk.video.VideoRender<R> r3 = r4.videoRender
            r3.addDelegate(r5, r2)
            ru.ok.android.externcalls.sdk.ConversationParticipant r2 = r0.getMe()
            ru.ok.android.externcalls.sdk.id.ParticipantId r2 = r2.getExternalId()
            boolean r1 = hhd.f(r2, r1)
            if (r1 == 0) goto L_0x0057
            w8f r1 = r5.getType()
            w8f r2 = defpackage.w8f.a
            if (r1 != r2) goto L_0x0057
            s16 r1 = r4.onOwnCameraRendererSet
            r1.invoke()
            goto L_0x005e
        L_0x0057:
            r1 = r6
            ru.ok.android.externcalls.sdk.ui.RendererView r1 = (ru.ok.android.externcalls.sdk.ui.RendererView) r1
            r2 = 0
            r1.setMirror(r2)
        L_0x005e:
            ru.ok.android.externcalls.sdk.video.VideoRenderManager r1 = r0.getVideoRenderManager()
            ru.ok.android.externcalls.sdk.video.VideoRender<R> r4 = r4.videoRender
            java.util.List r4 = r4.asOkVideoSink(r5)
            r1.setRenderers(r5, r4)
            ru.ok.android.externcalls.sdk.video.VideoRenderManager r4 = r0.getVideoRenderManager()
            tc1 r4 = r4.getCallRenderer()
            if (r4 == 0) goto L_0x007b
            ru.ok.android.externcalls.sdk.ui.RendererView r6 = (ru.ok.android.externcalls.sdk.ui.RendererView) r6
            r5 = 0
            r6.init((defpackage.tc1) r4, (org.webrtc.RendererCommon.RendererEvents) r5, (ru.ok.android.externcalls.sdk.ui.FrameDecorator) r7)
        L_0x007b:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: ru.ok.android.externcalls.sdk.video.internal.ParticipantVideoViewManagerImpl.setParticipantView(ru.ok.android.externcalls.sdk.layout.ConversationVideoTrackParticipantKey, android.view.View, ru.ok.android.externcalls.sdk.ui.FrameDecorator):void");
    }
}

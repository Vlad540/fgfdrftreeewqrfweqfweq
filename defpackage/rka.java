package defpackage;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import java.util.Collection;
import java.util.concurrent.ConcurrentHashMap;
import org.webrtc.RendererCommon;
import ru.ok.android.externcalls.sdk.Conversation;
import ru.ok.android.externcalls.sdk.ConversationParticipant;
import ru.ok.android.externcalls.sdk.layout.ConversationVideoTrackParticipantKey;
import ru.ok.android.externcalls.sdk.ui.FrameDecorator;
import ru.ok.android.externcalls.sdk.ui.RendererView;
import ru.ok.android.externcalls.sdk.ui.TextureViewRenderer;
import ru.ok.android.externcalls.sdk.video.DisplayLayoutSender;
import ru.ok.android.externcalls.sdk.video.VideoRender;
import ru.ok.android.externcalls.sdk.video.VideoRenderManager;

/* renamed from: rka  reason: default package */
public final class rka implements qka {
    public final ConcurrentHashMap.KeySetView X = ConcurrentHashMap.newKeySet();
    public final t97 a;
    public final t97 b;
    public final t97 c;
    public final VideoRender o = new VideoRender();

    public rka(t97 t97, t97 t972, t97 t973) {
        this.a = t973;
        this.b = t97;
        this.c = t972;
    }

    public final Conversation c() {
        return ((bt3) this.b.getValue()).a();
    }

    public final void clear() {
        ConcurrentHashMap.KeySetView<pka> keySetView = this.X;
        for (pka pka : keySetView) {
            an1 an1 = (an1) pka;
            an1.c();
            an1.x0 = null;
            an1.y0 = false;
        }
        this.o.clear();
        keySetView.clear();
    }

    public final RendererView createVideoViewInstance(Context context) {
        TextureViewRenderer textureViewRenderer = new TextureViewRenderer(context, (AttributeSet) null, 0, 6, (x54) null);
        textureViewRenderer.setId(View.generateViewId());
        textureViewRenderer.setScalingType(RendererCommon.ScalingType.SCALE_ASPECT_FILL, RendererCommon.ScalingType.SCALE_ASPECT_FIT);
        return textureViewRenderer;
    }

    /* renamed from: d */
    public final void removeParticipantView(ConversationVideoTrackParticipantKey conversationVideoTrackParticipantKey, TextureViewRenderer textureViewRenderer) {
        Conversation c2 = c();
        if (c2 != null) {
            VideoRender videoRender = this.o;
            if (videoRender.contains(conversationVideoTrackParticipantKey, textureViewRenderer)) {
                videoRender.removeDelegate(conversationVideoTrackParticipantKey, textureViewRenderer);
                textureViewRenderer.clearImage();
                ConversationParticipant conversationParticipant = c2.getParticipants().get(conversationVideoTrackParticipantKey.getParticipantId());
                if (conversationParticipant != null && conversationParticipant.isUseable()) {
                    c2.getVideoRenderManager().setRenderers(conversationVideoTrackParticipantKey, videoRender.asOkVideoSink(conversationVideoTrackParticipantKey));
                }
            }
        }
    }

    public final ConversationVideoTrackParticipantKey getOwnVideoTrack() {
        Conversation c2 = c();
        if (c2 != null) {
            return new ConversationVideoTrackParticipantKey.Builder().setParticipantId(c2.getMe().getExternalId()).build();
        }
        return null;
    }

    public final void onCameraChanged() {
        TextureViewRenderer textureViewRenderer;
        for (pka pka : this.X) {
            boolean b2 = ((d11) this.a.getValue()).b();
            an1 an1 = (an1) pka;
            t8f t8f = an1.z0;
            if (!(t8f == null || !t8f.c || (textureViewRenderer = an1.c) == null)) {
                textureViewRenderer.setMirror(b2);
            }
        }
    }

    public final void rebindParticipantViews() {
        Conversation c2 = c();
        if (c2 != null) {
            for (ConversationParticipant conversationParticipant : c2.getParticipants()) {
                VideoRenderManager videoRenderManager = c2.getVideoRenderManager();
                if (conversationParticipant.isUseable()) {
                    for (ConversationVideoTrackParticipantKey conversationVideoTrackParticipantKey : videoRenderManager.getRenderers(conversationParticipant.getExternalId()).keySet()) {
                        videoRenderManager.setRenderers(conversationVideoTrackParticipantKey, this.o.asOkVideoSink(conversationVideoTrackParticipantKey));
                    }
                }
            }
        }
    }

    public final void releaseParticipantView(RendererView rendererView) {
        ((TextureViewRenderer) rendererView).release();
    }

    public final void removeOwnVideoParticipantView(RendererView rendererView) {
        removeParticipantView(((oka) ((aka) this.c.getValue())).c().a.s().b, (TextureViewRenderer) rendererView);
    }

    public final void setOwnVideoParticipantView(RendererView rendererView, FrameDecorator frameDecorator) {
        setParticipantView(((oka) ((aka) this.c.getValue())).c().a.s().b, (TextureViewRenderer) rendererView);
    }

    public final void setParticipantView(ConversationVideoTrackParticipantKey conversationVideoTrackParticipantKey, RendererView rendererView, FrameDecorator frameDecorator) {
        TextureViewRenderer textureViewRenderer = (TextureViewRenderer) rendererView;
        Conversation c2 = c();
        if (c2 != null && conversationVideoTrackParticipantKey != null) {
            VideoRender videoRender = this.o;
            if (!videoRender.contains(conversationVideoTrackParticipantKey, textureViewRenderer)) {
                videoRender.addDelegate(conversationVideoTrackParticipantKey, textureViewRenderer);
                textureViewRenderer.setMirror(hhd.f(c2.getMe().getExternalId(), conversationVideoTrackParticipantKey.getParticipantId()) && conversationVideoTrackParticipantKey.getType() == w8f.a && ((d11) this.a.getValue()).b());
                VideoRenderManager videoRenderManager = c2.getVideoRenderManager();
                videoRenderManager.setRenderers(conversationVideoTrackParticipantKey, videoRender.asOkVideoSink(conversationVideoTrackParticipantKey));
                tc1 callRenderer = videoRenderManager.getCallRenderer();
                if (callRenderer != null) {
                    RendererView.init$default(textureViewRenderer, callRenderer, (RendererCommon.RendererEvents) null, (FrameDecorator) null, 4, (Object) null);
                }
            }
        }
    }

    public final void updateDisplayLayout(Collection collection) {
        Conversation c2 = c();
        DisplayLayoutSender displayLayoutSender = c2 != null ? c2.getDisplayLayoutSender() : null;
        if (displayLayoutSender != null) {
            displayLayoutSender.sendDisplayLayouts(collection);
        }
    }
}

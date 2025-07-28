package ru.ok.android.externcalls.sdk.video.internal;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import org.webrtc.EglBase;
import org.webrtc.VideoSink;
import ru.ok.android.externcalls.sdk.Conversation;
import ru.ok.android.externcalls.sdk.ConversationParticipant;
import ru.ok.android.externcalls.sdk.id.ParticipantId;
import ru.ok.android.externcalls.sdk.layout.ConversationVideoTrackParticipantKey;
import ru.ok.android.externcalls.sdk.participant.collection.ParticipantStore;
import ru.ok.android.externcalls.sdk.renderer.ConversationRenderers;
import ru.ok.android.externcalls.sdk.video.VideoRenderManager;

@Metadata(d1 = {"\u0000\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002B-\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ'\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u000f\u001a\u00020\u000e2\u000e\u0010\u0012\u001a\n\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u0010H\u0002¢\u0006\u0004\b\u0014\u0010\u0015J'\u0010\u0016\u001a\u00020\u00132\u0006\u0010\u000f\u001a\u00020\u000e2\u000e\u0010\u0012\u001a\n\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u0010H\u0002¢\u0006\u0004\b\u0016\u0010\u0015J'\u0010\u0018\u001a\u00020\u00132\u0006\u0010\u000f\u001a\u00020\u000e2\u000e\u0010\u0017\u001a\n\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u0010H\u0002¢\u0006\u0004\b\u0018\u0010\u0015J/\u0010\u001e\u001a\u001a\u0012\b\u0012\u00060\u001cj\u0002`\u001d\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u00100\u001b2\u0006\u0010\u001a\u001a\u00020\u0019H\u0016¢\u0006\u0004\b\u001e\u0010\u001fJ+\u0010\u0018\u001a\u00020\u00132\n\u0010\u000f\u001a\u00060\u001cj\u0002`\u001d2\u000e\u0010\u0012\u001a\n\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u0010H\u0016¢\u0006\u0004\b\u0018\u0010 J\u000f\u0010\"\u001a\u00020!H\u0016¢\u0006\u0004\b\"\u0010#J/\u0010&\u001a\u0016\u0012\u0004\u0012\u00020\u000e\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u00100\u001b2\n\u0010\u001a\u001a\u00060$j\u0002`%H\u0016¢\u0006\u0004\b&\u0010'R\u001a\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00038\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010(R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010)R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0004¢\u0006\u0006\n\u0004\b\t\u0010*R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010+R`\u0010/\u001aN\u0012\b\u0012\u00060$j\u0002`%\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u000e\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u00100-0,j&\u0012\b\u0012\u00060$j\u0002`%\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u000e\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u00100-`.8\u0002X\u0004¢\u0006\u0006\n\u0004\b/\u00100R\u0016\u00104\u001a\u0004\u0018\u0001018VX\u0004¢\u0006\u0006\u001a\u0004\b2\u00103R\u0016\u00108\u001a\u0004\u0018\u0001058VX\u0004¢\u0006\u0006\u001a\u0004\b6\u00107¨\u00069"}, d2 = {"Lru/ok/android/externcalls/sdk/video/internal/VideoRenderManagerImpl;", "Lru/ok/android/externcalls/sdk/video/VideoRenderManager;", "Lpd4;", "Lkotlin/Function0;", "Lru/ok/android/externcalls/sdk/Conversation$State;", "state", "Lgx0;", "call", "Lru/ok/android/externcalls/sdk/renderer/ConversationRenderers;", "conversationRenderers", "Lru/ok/android/externcalls/sdk/participant/collection/ParticipantStore;", "store", "<init>", "(Ls16;Lgx0;Lru/ok/android/externcalls/sdk/renderer/ConversationRenderers;Lru/ok/android/externcalls/sdk/participant/collection/ParticipantStore;)V", "Lxm1;", "key", "", "Lorg/webrtc/VideoSink;", "renderers", "Ljue;", "setRenderersForMe", "(Lxm1;Ljava/util/List;)V", "setRenderersForOthers", "value", "setRenderers", "Lru/ok/android/externcalls/sdk/id/ParticipantId;", "participantId", "", "Lru/ok/android/externcalls/sdk/layout/ConversationVideoTrackParticipantKey;", "Lru/ok/android/externcalls/sdk/video/VideoTrack;", "getRenderers", "(Lru/ok/android/externcalls/sdk/id/ParticipantId;)Ljava/util/Map;", "(Lru/ok/android/externcalls/sdk/layout/ConversationVideoTrackParticipantKey;Ljava/util/List;)V", "", "isEnabled", "()Z", "Lge1;", "Lru/ok/android/externcalls/sdk/id/InternalId;", "getRemoteVideoRenderers", "(Lge1;)Ljava/util/Map;", "Ls16;", "Lgx0;", "Lru/ok/android/externcalls/sdk/renderer/ConversationRenderers;", "Lru/ok/android/externcalls/sdk/participant/collection/ParticipantStore;", "Ljava/util/HashMap;", "", "Lkotlin/collections/HashMap;", "cache", "Ljava/util/HashMap;", "Ltc1;", "getCallRenderer", "()Ltc1;", "callRenderer", "Lorg/webrtc/EglBase$Context;", "getEglBaseContext", "()Lorg/webrtc/EglBase$Context;", "eglBaseContext", "calls-sdk_release"}, k = 1, mv = {1, 9, 0})
public final class VideoRenderManagerImpl implements VideoRenderManager, pd4 {
    private final HashMap<ge1, Map<xm1, List<VideoSink>>> cache = new HashMap<>();
    private final gx0 call;
    private final ConversationRenderers conversationRenderers;
    private final s16 state;
    private final ParticipantStore store;

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[w8f.values().length];
            try {
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[1] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[3] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[4] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[2] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public VideoRenderManagerImpl(s16 s16, gx0 gx0, ConversationRenderers conversationRenderers2, ParticipantStore participantStore) {
        this.state = s16;
        this.call = gx0;
        this.conversationRenderers = conversationRenderers2;
        this.store = participantStore;
    }

    private final void setRenderersForMe(xm1 xm1, List<? extends VideoSink> list) {
        int ordinal = xm1.a.ordinal();
        if (ordinal == 0) {
            gx0 gx0 = this.call;
            VideoSink videoSink = (list == null || list.isEmpty()) ? null : (VideoSink) list.get(0);
            if (gx0.i()) {
                d dVar = gx0.p1;
                dVar.E0 = videoSink;
                jl7 jl7 = dVar.D0;
                if (jl7 != null) {
                    jl7.k(videoSink);
                }
            }
        } else if (ordinal == 1) {
        } else {
            if (ordinal == 2) {
                gx0 gx02 = this.call;
                ge1 ge1 = gx02.t1.a.a;
                if (ge1 != null) {
                    it4 it4 = new it4();
                    it4.a = ge1;
                    it4.b = w8f.c;
                    it4.a();
                    gx02.I1.getClass();
                }
            } else if (ordinal == 3 || ordinal == 4) {
                setRenderers(xm1, list);
                gx0 gx03 = this.call;
                if (gx03.i()) {
                    gx03.x1.R(xm1, list);
                    gx03.I1.getClass();
                }
            } else {
                throw new RuntimeException("Unknown track type");
            }
        }
    }

    private final void setRenderersForOthers(xm1 xm1, List<? extends VideoSink> list) {
        setRenderers(xm1, list);
        gx0 gx0 = this.call;
        if (gx0.i()) {
            gx0.x1.R(xm1, list);
            gx0.I1.getClass();
        }
    }

    public tc1 getCallRenderer() {
        if (this.state.invoke() != Conversation.State.Finished) {
            return this.call.C0;
        }
        return null;
    }

    public EglBase.Context getEglBaseContext() {
        if (this.call.B0 == null || this.state.invoke() == Conversation.State.Finished) {
            return null;
        }
        return this.call.B0.getEglBaseContext();
    }

    public Map<xm1, List<VideoSink>> getRemoteVideoRenderers(ge1 ge1) {
        Map<xm1, List<VideoSink>> map = this.cache.get(ge1);
        return map == null ? iw4.a : map;
    }

    public Map<ConversationVideoTrackParticipantKey, List<VideoSink>> getRenderers(ParticipantId participantId) {
        return this.conversationRenderers.getRenderers(participantId);
    }

    public boolean isEnabled() {
        return true;
    }

    public void setRenderers(ConversationVideoTrackParticipantKey conversationVideoTrackParticipantKey, List<? extends VideoSink> list) {
        ConversationParticipant conversationParticipant = this.store.get(conversationVideoTrackParticipantKey.getParticipantId());
        if (conversationParticipant != null && conversationParticipant.isUseable()) {
            it4 it4 = new it4();
            it4.b = conversationVideoTrackParticipantKey.getType();
            it4.a = conversationParticipant.getCallParticipant().a;
            it4.c = conversationVideoTrackParticipantKey.getMovieId();
            xm1 a = it4.a();
            this.conversationRenderers.setRenderers(conversationVideoTrackParticipantKey, list);
            if (conversationParticipant == this.store.getMe()) {
                setRenderersForMe(a, list);
            } else {
                setRenderersForOthers(a, list);
            }
        }
    }

    private final void setRenderers(xm1 xm1, List<? extends VideoSink> list) {
        HashMap<ge1, Map<xm1, List<VideoSink>>> hashMap = this.cache;
        ge1 ge1 = xm1.b;
        Map<xm1, List<VideoSink>> map = hashMap.get(ge1);
        if (map == null) {
            map = new HashMap<>();
            hashMap.put(ge1, map);
        }
        map.put(xm1, list);
    }
}

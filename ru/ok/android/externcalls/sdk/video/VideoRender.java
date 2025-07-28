package ru.ok.android.externcalls.sdk.video;

import java.util.Collections;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Metadata;
import org.webrtc.VideoSink;
import ru.ok.android.externcalls.sdk.layout.ConversationVideoTrackParticipantKey;
import ru.ok.android.externcalls.sdk.log.GlobalRTCLogger;
import ru.ok.android.externcalls.sdk.ui.RendererView;

@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010!\n\u0002\b\u0004\u0018\u0000 \u001e*\u000e\b\u0000\u0010\u0003 \u0000*\u00020\u0001*\u00020\u00022\u00020\u0004:\u0001\u001eB\u0007¢\u0006\u0004\b\u0005\u0010\u0006J\u0019\u0010\u000b\u001a\u00020\n2\n\u0010\t\u001a\u00060\u0007j\u0002`\b¢\u0006\u0004\b\u000b\u0010\fJ!\u0010\u000b\u001a\u00020\n2\n\u0010\t\u001a\u00060\u0007j\u0002`\b2\u0006\u0010\r\u001a\u00028\u0000¢\u0006\u0004\b\u000b\u0010\u000eJ!\u0010\u0010\u001a\u00020\u000f2\n\u0010\t\u001a\u00060\u0007j\u0002`\b2\u0006\u0010\r\u001a\u00028\u0000¢\u0006\u0004\b\u0010\u0010\u0011J!\u0010\u0012\u001a\u00020\u000f2\n\u0010\t\u001a\u00060\u0007j\u0002`\b2\u0006\u0010\r\u001a\u00028\u0000¢\u0006\u0004\b\u0012\u0010\u0011J!\u0010\u0014\u001a\u00020\u000f2\n\u0010\t\u001a\u00060\u0007j\u0002`\b2\u0006\u0010\u0013\u001a\u00020\n¢\u0006\u0004\b\u0014\u0010\u0015J\r\u0010\u0016\u001a\u00020\u000f¢\u0006\u0004\b\u0016\u0010\u0006J\u001f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00010\u00172\n\u0010\t\u001a\u00060\u0007j\u0002`\b¢\u0006\u0004\b\u0018\u0010\u0019R*\u0010\u001c\u001a\u0018\u0012\b\u0012\u00060\u0007j\u0002`\b\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u001b0\u001a8\bX\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001d¨\u0006\u001f"}, d2 = {"Lru/ok/android/externcalls/sdk/video/VideoRender;", "Lorg/webrtc/VideoSink;", "Lru/ok/android/externcalls/sdk/ui/RendererView;", "T", "", "<init>", "()V", "Lru/ok/android/externcalls/sdk/layout/ConversationVideoTrackParticipantKey;", "Lru/ok/android/externcalls/sdk/video/VideoTrack;", "key", "", "contains", "(Lru/ok/android/externcalls/sdk/layout/ConversationVideoTrackParticipantKey;)Z", "render", "(Lru/ok/android/externcalls/sdk/layout/ConversationVideoTrackParticipantKey;Lorg/webrtc/VideoSink;)Z", "Ljue;", "addDelegate", "(Lru/ok/android/externcalls/sdk/layout/ConversationVideoTrackParticipantKey;Lorg/webrtc/VideoSink;)V", "removeDelegate", "mirror", "setMirror", "(Lru/ok/android/externcalls/sdk/layout/ConversationVideoTrackParticipantKey;Z)V", "clear", "", "asOkVideoSink", "(Lru/ok/android/externcalls/sdk/layout/ConversationVideoTrackParticipantKey;)Ljava/util/List;", "Ljava/util/concurrent/ConcurrentHashMap;", "", "delegates", "Ljava/util/concurrent/ConcurrentHashMap;", "Companion", "calls-sdk_release"}, k = 1, mv = {1, 9, 0})
public final class VideoRender<T extends VideoSink & RendererView> {
    private static final Companion Companion = new Companion((x54) null);
    private static final String LOG_TAG = "VideoRender";
    private final ConcurrentHashMap<ConversationVideoTrackParticipantKey, List<T>> delegates = new ConcurrentHashMap<>();

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lru/ok/android/externcalls/sdk/video/VideoRender$Companion;", "", "()V", "LOG_TAG", "", "calls-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(x54 x54) {
            this();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x002a, code lost:
        r0 = new java.util.concurrent.CopyOnWriteArrayList<>();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void addDelegate(ru.ok.android.externcalls.sdk.layout.ConversationVideoTrackParticipantKey r3, T r4) {
        /*
            r2 = this;
            boolean r0 = r2.contains(r3, r4)
            if (r0 == 0) goto L_0x0007
            return
        L_0x0007:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "adding "
            r0.<init>(r1)
            r0.append(r4)
            java.lang.String r1 = " to "
            r0.append(r1)
            r0.append(r3)
            java.lang.String r0 = r0.toString()
            java.lang.String r1 = "VideoRender"
            ru.ok.android.externcalls.sdk.log.GlobalRTCLogger.log(r1, r0)
            java.util.concurrent.ConcurrentHashMap<ru.ok.android.externcalls.sdk.layout.ConversationVideoTrackParticipantKey, java.util.List<T>> r2 = r2.delegates
            java.lang.Object r0 = r2.get(r3)
            if (r0 != 0) goto L_0x0037
            java.util.concurrent.CopyOnWriteArrayList r0 = new java.util.concurrent.CopyOnWriteArrayList
            r0.<init>()
            java.lang.Object r2 = r2.putIfAbsent(r3, r0)
            if (r2 != 0) goto L_0x0036
            goto L_0x0037
        L_0x0036:
            r0 = r2
        L_0x0037:
            java.util.List r0 = (java.util.List) r0
            r0.add(r4)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: ru.ok.android.externcalls.sdk.video.VideoRender.addDelegate(ru.ok.android.externcalls.sdk.layout.ConversationVideoTrackParticipantKey, org.webrtc.VideoSink):void");
    }

    public final List<VideoSink> asOkVideoSink(ConversationVideoTrackParticipantKey conversationVideoTrackParticipantKey) {
        return Collections.singletonList(new VideoSinkWrapper(conversationVideoTrackParticipantKey, this.delegates));
    }

    public final void clear() {
        for (List clear : this.delegates.values()) {
            clear.clear();
        }
        this.delegates.clear();
    }

    public final boolean contains(ConversationVideoTrackParticipantKey conversationVideoTrackParticipantKey) {
        List list = this.delegates.get(conversationVideoTrackParticipantKey);
        return list != null && !list.isEmpty();
    }

    public final void removeDelegate(ConversationVideoTrackParticipantKey conversationVideoTrackParticipantKey, T t) {
        GlobalRTCLogger.log(LOG_TAG, "removing " + t + " from " + conversationVideoTrackParticipantKey);
        List list = this.delegates.get(conversationVideoTrackParticipantKey);
        if (list != null) {
            list.remove(t);
        }
    }

    public final void setMirror(ConversationVideoTrackParticipantKey conversationVideoTrackParticipantKey, boolean z) {
        List<VideoSink> list = this.delegates.get(conversationVideoTrackParticipantKey);
        if (list != null) {
            for (VideoSink videoSink : list) {
                ((RendererView) videoSink).setMirror(z);
            }
        }
    }

    public final boolean contains(ConversationVideoTrackParticipantKey conversationVideoTrackParticipantKey, T t) {
        List list = this.delegates.get(conversationVideoTrackParticipantKey);
        return list != null && list.contains(t);
    }
}

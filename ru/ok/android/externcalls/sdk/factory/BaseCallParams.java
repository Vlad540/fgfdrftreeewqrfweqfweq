package ru.ok.android.externcalls.sdk.factory;

import kotlin.Metadata;
import ru.ok.android.externcalls.sdk.events.ConversationEventsListener;
import ru.ok.android.externcalls.sdk.factory.BaseCallParams.Builder;
import ru.ok.android.externcalls.sdk.id.ParticipantId;

@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0018\b&\u0018\u0000*\u000e\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u00028\u00010\u0001*\u0004\b\u0001\u0010\u00032\u00020\u0004:\u0001+Bc\b\u0004\u0012\n\u0010\u0007\u001a\u00060\u0005j\u0002`\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f0\n\u0012\u0012\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\f0\n\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014¢\u0006\u0004\b\u0016\u0010\u0017R\u001b\u0010\u0007\u001a\u00060\u0005j\u0002`\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u0019\u0010\t\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b\t\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR#\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f0\n8\u0006¢\u0006\f\n\u0004\b\r\u0010\u001e\u001a\u0004\b\u001f\u0010 R#\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\f0\n8\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u001e\u001a\u0004\b!\u0010 R\u0017\u0010\u0011\u001a\u00020\u00108\u0006¢\u0006\f\n\u0004\b\u0011\u0010\"\u001a\u0004\b#\u0010$R\u0019\u0010\u0013\u001a\u0004\u0018\u00010\u00128\u0006¢\u0006\f\n\u0004\b\u0013\u0010%\u001a\u0004\b&\u0010'R\u0019\u0010\u0015\u001a\u0004\u0018\u00010\u00148\u0006¢\u0006\f\n\u0004\b\u0015\u0010(\u001a\u0004\b)\u0010*¨\u0006,"}, d2 = {"Lru/ok/android/externcalls/sdk/factory/BaseCallParams;", "Lru/ok/android/externcalls/sdk/factory/BaseCallParams$Builder;", "B", "T", "", "Lru/ok/android/externcalls/sdk/id/ParticipantId;", "Lru/ok/android/externcalls/sdk/id/ExternalId;", "myId", "Lru/ok/android/externcalls/sdk/events/ConversationEventsListener;", "eventListener", "Lkotlin/Function1;", "Lru/ok/android/externcalls/sdk/Conversation;", "Ljue;", "onPrepared", "", "onError", "", "shouldStartWithVideo", "Lyw1;", "frameInterceptor", "Lcs9;", "cameraCapturerFactory", "<init>", "(Lru/ok/android/externcalls/sdk/id/ParticipantId;Lru/ok/android/externcalls/sdk/events/ConversationEventsListener;Lu16;Lu16;ZLyw1;Lcs9;)V", "Lru/ok/android/externcalls/sdk/id/ParticipantId;", "getMyId", "()Lru/ok/android/externcalls/sdk/id/ParticipantId;", "Lru/ok/android/externcalls/sdk/events/ConversationEventsListener;", "getEventListener", "()Lru/ok/android/externcalls/sdk/events/ConversationEventsListener;", "Lu16;", "getOnPrepared", "()Lu16;", "getOnError", "Z", "getShouldStartWithVideo", "()Z", "Lyw1;", "getFrameInterceptor", "()Lyw1;", "Lcs9;", "getCameraCapturerFactory", "()Lcs9;", "Builder", "calls-sdk_release"}, k = 1, mv = {1, 9, 0})
public abstract class BaseCallParams<B extends Builder<T>, T> {
    private final cs9 cameraCapturerFactory;
    private final ConversationEventsListener eventListener;
    private final yw1 frameInterceptor;
    private final ParticipantId myId;
    private final u16 onError;
    private final u16 onPrepared;
    private final boolean shouldStartWithVideo;

    @Metadata(d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\"\b&\u0018\u0000*\u0004\b\u0002\u0010\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u001f\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00020\u00002\n\u0010\u0007\u001a\u00060\u0005j\u0002`\u0006¢\u0006\u0004\b\b\u0010\tJ\u001b\u0010\f\u001a\b\u0012\u0004\u0012\u00028\u00020\u00002\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u001b\u0010\u0010\u001a\b\u0012\u0004\u0012\u00028\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0010\u0010\u0011J'\u0010\u0016\u001a\b\u0012\u0004\u0012\u00028\u00020\u00002\u0012\u0010\u0015\u001a\u000e\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u00140\u0012¢\u0006\u0004\b\u0016\u0010\u0017J!\u0010\u0016\u001a\b\u0012\u0004\u0012\u00028\u00020\u00002\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00130\u0018¢\u0006\u0004\b\u0016\u0010\u0019J#\u0010\u0016\u001a\b\u0012\u0004\u0012\u00028\u00020\u00002\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00140\u001aH\u0007¢\u0006\u0004\b\u0016\u0010\u001bJ\u001d\u0010\u0016\u001a\b\u0012\u0004\u0012\u00028\u00020\u00002\u0006\u0010\u0015\u001a\u00020\u001cH\u0007¢\u0006\u0004\b\u0016\u0010\u001dJ'\u0010 \u001a\b\u0012\u0004\u0012\u00028\u00020\u00002\u0012\u0010\u001f\u001a\u000e\u0012\u0004\u0012\u00020\u001e\u0012\u0004\u0012\u00020\u00140\u0012¢\u0006\u0004\b \u0010\u0017J!\u0010 \u001a\b\u0012\u0004\u0012\u00028\u00020\u00002\f\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u001e0\u0018¢\u0006\u0004\b \u0010\u0019J\u001d\u0010#\u001a\b\u0012\u0004\u0012\u00028\u00020\u00002\b\u0010\"\u001a\u0004\u0018\u00010!¢\u0006\u0004\b#\u0010$J\u001b\u0010'\u001a\b\u0012\u0004\u0012\u00028\u00020\u00002\u0006\u0010&\u001a\u00020%¢\u0006\u0004\b'\u0010(J\u000f\u0010)\u001a\u00028\u0002H&¢\u0006\u0004\b)\u0010*R*\u0010+\u001a\n\u0018\u00010\u0005j\u0004\u0018\u0001`\u00068\u0004@\u0004X\u000e¢\u0006\u0012\n\u0004\b+\u0010,\u001a\u0004\b-\u0010.\"\u0004\b\b\u0010/R$\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0004@\u0004X\u000e¢\u0006\u0012\n\u0004\b\u000b\u00100\u001a\u0004\b1\u00102\"\u0004\b\f\u00103R$\u00104\u001a\u0004\u0018\u00010\u000e8\u0004@\u0004X\u000e¢\u0006\u0012\n\u0004\b4\u00105\u001a\u0004\b6\u00107\"\u0004\b\u0010\u00108R0\u0010\u0015\u001a\u0010\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u0014\u0018\u00010\u00128\u0004@\u0004X\u000e¢\u0006\u0012\n\u0004\b\u0015\u00109\u001a\u0004\b:\u0010;\"\u0004\b\u0016\u0010<R0\u0010\u001f\u001a\u0010\u0012\u0004\u0012\u00020\u001e\u0012\u0004\u0012\u00020\u0014\u0018\u00010\u00128\u0004@\u0004X\u000e¢\u0006\u0012\n\u0004\b\u001f\u00109\u001a\u0004\b=\u0010;\"\u0004\b \u0010<R\"\u0010&\u001a\u00020%8\u0004@\u0004X\u000e¢\u0006\u0012\n\u0004\b&\u0010>\u001a\u0004\b?\u0010@\"\u0004\bA\u0010BR$\u0010\"\u001a\u0004\u0018\u00010!8\u0004@\u0004X\u000e¢\u0006\u0012\n\u0004\b\"\u0010C\u001a\u0004\bD\u0010E\"\u0004\b#\u0010F¨\u0006G"}, d2 = {"Lru/ok/android/externcalls/sdk/factory/BaseCallParams$Builder;", "T", "", "<init>", "()V", "Lru/ok/android/externcalls/sdk/id/ParticipantId;", "Lru/ok/android/externcalls/sdk/id/ExternalId;", "callerId", "setMyId", "(Lru/ok/android/externcalls/sdk/id/ParticipantId;)Lru/ok/android/externcalls/sdk/factory/BaseCallParams$Builder;", "Lru/ok/android/externcalls/sdk/events/ConversationEventsListener;", "eventListener", "setEventListener", "(Lru/ok/android/externcalls/sdk/events/ConversationEventsListener;)Lru/ok/android/externcalls/sdk/factory/BaseCallParams$Builder;", "Lcs9;", "factory", "setCameraCapturerFactory", "(Lcs9;)Lru/ok/android/externcalls/sdk/factory/BaseCallParams$Builder;", "Lkotlin/Function1;", "Lru/ok/android/externcalls/sdk/Conversation;", "Ljue;", "onPrepared", "setOnPrepared", "(Lu16;)Lru/ok/android/externcalls/sdk/factory/BaseCallParams$Builder;", "Lpf3;", "(Lpf3;)Lru/ok/android/externcalls/sdk/factory/BaseCallParams$Builder;", "Lkotlin/Function0;", "(Ls16;)Lru/ok/android/externcalls/sdk/factory/BaseCallParams$Builder;", "Ljava/lang/Runnable;", "(Ljava/lang/Runnable;)Lru/ok/android/externcalls/sdk/factory/BaseCallParams$Builder;", "", "onError", "setOnError", "Lyw1;", "frameInterceptor", "setFrameInterceptor", "(Lyw1;)Lru/ok/android/externcalls/sdk/factory/BaseCallParams$Builder;", "", "shouldStartWithVideo", "setStartWithVideo", "(Z)Lru/ok/android/externcalls/sdk/factory/BaseCallParams$Builder;", "build", "()Ljava/lang/Object;", "myId", "Lru/ok/android/externcalls/sdk/id/ParticipantId;", "getMyId", "()Lru/ok/android/externcalls/sdk/id/ParticipantId;", "(Lru/ok/android/externcalls/sdk/id/ParticipantId;)V", "Lru/ok/android/externcalls/sdk/events/ConversationEventsListener;", "getEventListener", "()Lru/ok/android/externcalls/sdk/events/ConversationEventsListener;", "(Lru/ok/android/externcalls/sdk/events/ConversationEventsListener;)V", "cameraCapturerFactory", "Lcs9;", "getCameraCapturerFactory", "()Lcs9;", "(Lcs9;)V", "Lu16;", "getOnPrepared", "()Lu16;", "(Lu16;)V", "getOnError", "Z", "getShouldStartWithVideo", "()Z", "setShouldStartWithVideo", "(Z)V", "Lyw1;", "getFrameInterceptor", "()Lyw1;", "(Lyw1;)V", "calls-sdk_release"}, k = 1, mv = {1, 9, 0})
    public static abstract class Builder<T> {
        private cs9 cameraCapturerFactory;
        private ConversationEventsListener eventListener;
        private yw1 frameInterceptor;
        private ParticipantId myId;
        private u16 onError;
        private u16 onPrepared;
        private boolean shouldStartWithVideo;

        /* access modifiers changed from: private */
        public static final void setOnPrepared$lambda$6$lambda$5(s16 s16) {
            s16.invoke();
        }

        public abstract T build();

        public final cs9 getCameraCapturerFactory() {
            return this.cameraCapturerFactory;
        }

        public final ConversationEventsListener getEventListener() {
            return this.eventListener;
        }

        public final yw1 getFrameInterceptor() {
            return null;
        }

        public final ParticipantId getMyId() {
            return this.myId;
        }

        public final u16 getOnError() {
            return this.onError;
        }

        public final u16 getOnPrepared() {
            return this.onPrepared;
        }

        public final boolean getShouldStartWithVideo() {
            return this.shouldStartWithVideo;
        }

        /* renamed from: setCameraCapturerFactory  reason: collision with other method in class */
        public final void m61setCameraCapturerFactory(cs9 cs9) {
            this.cameraCapturerFactory = cs9;
        }

        /* renamed from: setEventListener  reason: collision with other method in class */
        public final void m62setEventListener(ConversationEventsListener conversationEventsListener) {
            this.eventListener = conversationEventsListener;
        }

        /* renamed from: setFrameInterceptor  reason: collision with other method in class */
        public final void m63setFrameInterceptor(yw1 yw1) {
        }

        /* renamed from: setMyId  reason: collision with other method in class */
        public final void m64setMyId(ParticipantId participantId) {
            this.myId = participantId;
        }

        /* renamed from: setOnError  reason: collision with other method in class */
        public final void m65setOnError(u16 u16) {
            this.onError = u16;
        }

        public final Builder<T> setOnPrepared(Runnable runnable) {
            pf3 pf3;
            if (runnable == null) {
                pf3 = new lf3(0);
            } else {
                pf3 = new mf3(0, runnable);
            }
            setOnPrepared(pf3);
            return this;
        }

        public final void setShouldStartWithVideo(boolean z) {
            this.shouldStartWithVideo = z;
        }

        public final Builder<T> setStartWithVideo(boolean z) {
            this.shouldStartWithVideo = z;
            return this;
        }

        public final Builder<T> setCameraCapturerFactory(cs9 cs9) {
            this.cameraCapturerFactory = cs9;
            return this;
        }

        public final Builder<T> setEventListener(ConversationEventsListener conversationEventsListener) {
            this.eventListener = conversationEventsListener;
            return this;
        }

        public final Builder<T> setFrameInterceptor(yw1 yw1) {
            return this;
        }

        public final Builder<T> setMyId(ParticipantId participantId) {
            this.myId = participantId;
            return this;
        }

        public final Builder<T> setOnError(u16 u16) {
            this.onError = u16;
            return this;
        }

        public final Builder<T> setOnError(pf3 pf3) {
            this.onError = new BaseCallParams$Builder$setOnError$2$1(pf3);
            return this;
        }

        /* renamed from: setOnPrepared  reason: collision with other method in class */
        public final void m66setOnPrepared(u16 u16) {
            this.onPrepared = u16;
        }

        public final Builder<T> setOnPrepared(u16 u16) {
            this.onPrepared = u16;
            return this;
        }

        public final Builder<T> setOnPrepared(pf3 pf3) {
            this.onPrepared = new BaseCallParams$Builder$setOnPrepared$2$1(pf3);
            return this;
        }

        public final Builder<T> setOnPrepared(s16 s16) {
            setOnPrepared((pf3) new mf3(0, new tg0(0, s16)));
            return this;
        }
    }

    public BaseCallParams(ParticipantId participantId, ConversationEventsListener conversationEventsListener, u16 u16, u16 u162, boolean z, yw1 yw1, cs9 cs9) {
        this.myId = participantId;
        this.eventListener = conversationEventsListener;
        this.onPrepared = u16;
        this.onError = u162;
        this.shouldStartWithVideo = z;
        this.cameraCapturerFactory = cs9;
    }

    public final cs9 getCameraCapturerFactory() {
        return this.cameraCapturerFactory;
    }

    public final ConversationEventsListener getEventListener() {
        return this.eventListener;
    }

    public final yw1 getFrameInterceptor() {
        return null;
    }

    public final ParticipantId getMyId() {
        return this.myId;
    }

    public final u16 getOnError() {
        return this.onError;
    }

    public final u16 getOnPrepared() {
        return this.onPrepared;
    }

    public final boolean getShouldStartWithVideo() {
        return this.shouldStartWithVideo;
    }
}

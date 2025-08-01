package ru.ok.android.externcalls.sdk.factory;

import kotlin.Metadata;
import ru.ok.android.externcalls.sdk.events.ConversationEventsListener;
import ru.ok.android.externcalls.sdk.factory.BaseCallParams;
import ru.ok.android.externcalls.sdk.id.ParticipantId;

@Metadata(d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0017\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00000\u0001:\u00011B£\u0001\b\u0002\u0012\u000e\u0010\u0005\u001a\n\u0018\u00010\u0003j\u0004\u0018\u0001`\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\n\u0010\u0010\u001a\u00060\u0003j\u0002`\u0004\u0012\u0012\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u00130\u0011\u0012\u0012\u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u00130\u0011\u0012\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017\u0012\b\u0010\u001a\u001a\u0004\u0018\u00010\u0019\u0012\b\u0010\u001c\u001a\u0004\u0018\u00010\u001b\u0012\u0006\u0010\u001d\u001a\u00020\u000e¢\u0006\u0004\b\u001e\u0010\u001fR\u001f\u0010\u0005\u001a\n\u0018\u00010\u0003j\u0004\u0018\u0001`\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010 \u001a\u0004\b!\u0010\"R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010#\u001a\u0004\b$\u0010%R\u0019\u0010\t\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b\t\u0010&\u001a\u0004\b'\u0010(R\u0019\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006¢\u0006\f\n\u0004\b\u000b\u0010)\u001a\u0004\b*\u0010+R\u0019\u0010\r\u001a\u0004\u0018\u00010\f8\u0006¢\u0006\f\n\u0004\b\r\u0010,\u001a\u0004\b-\u0010.R\u0017\u0010\u000f\u001a\u00020\u000e8\u0006¢\u0006\f\n\u0004\b\u000f\u0010/\u001a\u0004\b\u000f\u00100¨\u00062"}, d2 = {"Lru/ok/android/externcalls/sdk/factory/StartCallParams;", "Lru/ok/android/externcalls/sdk/factory/BaseCallParams;", "Lru/ok/android/externcalls/sdk/factory/StartCallParams$Builder;", "Lru/ok/android/externcalls/sdk/id/ParticipantId;", "Lru/ok/android/externcalls/sdk/id/ExternalId;", "opponentId", "", "payload", "Lmle;", "tokenProvider", "Lrl;", "tokenInfoProvider", "", "chatId", "", "isWatchTogetherEnabledForAll", "myId", "Lkotlin/Function1;", "Lru/ok/android/externcalls/sdk/Conversation;", "Ljue;", "onPrepared", "", "onError", "Lyw1;", "frameInterceptor", "Lru/ok/android/externcalls/sdk/events/ConversationEventsListener;", "eventListener", "Lcs9;", "cameraCapturerFactory", "shouldStartWithVideo", "<init>", "(Lru/ok/android/externcalls/sdk/id/ParticipantId;Ljava/lang/String;Lmle;Lrl;Ljava/lang/Long;ZLru/ok/android/externcalls/sdk/id/ParticipantId;Lu16;Lu16;Lyw1;Lru/ok/android/externcalls/sdk/events/ConversationEventsListener;Lcs9;Z)V", "Lru/ok/android/externcalls/sdk/id/ParticipantId;", "getOpponentId", "()Lru/ok/android/externcalls/sdk/id/ParticipantId;", "Ljava/lang/String;", "getPayload", "()Ljava/lang/String;", "Lmle;", "getTokenProvider", "()Lmle;", "Lrl;", "getTokenInfoProvider", "()Lrl;", "Ljava/lang/Long;", "getChatId", "()Ljava/lang/Long;", "Z", "()Z", "Builder", "calls-sdk_release"}, k = 1, mv = {1, 9, 0})
public final class StartCallParams extends BaseCallParams<Builder, StartCallParams> {
    private final Long chatId;
    private final boolean isWatchTogetherEnabledForAll;
    private final ParticipantId opponentId;
    private final String payload;
    private final rl tokenInfoProvider;
    private final mle tokenProvider;

    @Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\r\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0019\u0010\b\u001a\u00020\u00002\n\u0010\u0007\u001a\u00060\u0005j\u0002`\u0006¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u00002\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\f\u0010\rJ\u0019\u0010\u0010\u001a\u00020\u00002\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eH\u0007¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0014\u001a\u00020\u00002\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012¢\u0006\u0004\b\u0014\u0010\u0015J\u0015\u0010\u0018\u001a\u00020\u00002\u0006\u0010\u0017\u001a\u00020\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u0015\u0010\u001c\u001a\u00020\u00002\u0006\u0010\u001b\u001a\u00020\u001a¢\u0006\u0004\b\u001c\u0010\u001dJ\u000f\u0010\u001e\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u001e\u0010\u001fR\u001e\u0010\u0007\u001a\n\u0018\u00010\u0005j\u0004\u0018\u0001`\u00068\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u0007\u0010 R\u0018\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u000b\u0010!R\u0018\u0010\u000f\u001a\u0004\u0018\u00010\u000e8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u000f\u0010\"R\u0018\u0010\u0013\u001a\u0004\u0018\u00010\u00128\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u0013\u0010#R\u0016\u0010$\u001a\u00020\u00168\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b$\u0010%R\u0018\u0010\u001b\u001a\u0004\u0018\u00010\u001a8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u001b\u0010&¨\u0006'"}, d2 = {"Lru/ok/android/externcalls/sdk/factory/StartCallParams$Builder;", "Lru/ok/android/externcalls/sdk/factory/BaseCallParams$Builder;", "Lru/ok/android/externcalls/sdk/factory/StartCallParams;", "<init>", "()V", "Lru/ok/android/externcalls/sdk/id/ParticipantId;", "Lru/ok/android/externcalls/sdk/id/ExternalId;", "opponentId", "setOpponentId", "(Lru/ok/android/externcalls/sdk/id/ParticipantId;)Lru/ok/android/externcalls/sdk/factory/StartCallParams$Builder;", "", "payload", "setPayload", "(Ljava/lang/String;)Lru/ok/android/externcalls/sdk/factory/StartCallParams$Builder;", "Lmle;", "tokenProvider", "setTokenProvider", "(Lmle;)Lru/ok/android/externcalls/sdk/factory/StartCallParams$Builder;", "Lrl;", "tokenInfoProvider", "setTokenInfoProvider", "(Lrl;)Lru/ok/android/externcalls/sdk/factory/StartCallParams$Builder;", "", "isEnabled", "setWatchTogetherEnabledForAll", "(Z)Lru/ok/android/externcalls/sdk/factory/StartCallParams$Builder;", "", "chatId", "setChatId", "(J)Lru/ok/android/externcalls/sdk/factory/StartCallParams$Builder;", "build", "()Lru/ok/android/externcalls/sdk/factory/StartCallParams;", "Lru/ok/android/externcalls/sdk/id/ParticipantId;", "Ljava/lang/String;", "Lmle;", "Lrl;", "isWatchTogetherEnabledForAll", "Z", "Ljava/lang/Long;", "calls-sdk_release"}, k = 1, mv = {1, 9, 0})
    public static final class Builder extends BaseCallParams.Builder<StartCallParams> {
        private Long chatId;
        private boolean isWatchTogetherEnabledForAll;
        private ParticipantId opponentId;
        private String payload;
        private rl tokenInfoProvider;
        private mle tokenProvider;

        public final Builder setChatId(long j) {
            this.chatId = Long.valueOf(j);
            return this;
        }

        public final Builder setOpponentId(ParticipantId participantId) {
            this.opponentId = participantId;
            return this;
        }

        public final Builder setPayload(String str) {
            this.payload = str;
            return this;
        }

        public final Builder setTokenInfoProvider(rl rlVar) {
            this.tokenInfoProvider = rlVar;
            return this;
        }

        public final Builder setTokenProvider(mle mle) {
            this.tokenProvider = mle;
            return this;
        }

        public final Builder setWatchTogetherEnabledForAll(boolean z) {
            this.isWatchTogetherEnabledForAll = z;
            return this;
        }

        public StartCallParams build() {
            if (this.chatId == null && this.opponentId == null) {
                throw new IllegalArgumentException("target should exist: userId, callId or groupId");
            }
            ParticipantId myId = getMyId();
            if (myId != null) {
                u16 onPrepared = getOnPrepared();
                if (onPrepared != null) {
                    u16 onError = getOnError();
                    if (onError != null) {
                        boolean shouldStartWithVideo = getShouldStartWithVideo();
                        ConversationEventsListener eventListener = getEventListener();
                        ParticipantId participantId = this.opponentId;
                        Long l = this.chatId;
                        String str = this.payload;
                        getFrameInterceptor();
                        return new StartCallParams(participantId, str, this.tokenProvider, this.tokenInfoProvider, l, this.isWatchTogetherEnabledForAll, myId, onPrepared, onError, (yw1) null, eventListener, getCameraCapturerFactory(), shouldStartWithVideo, (x54) null);
                    }
                    throw new IllegalArgumentException("onError callback is required".toString());
                }
                throw new IllegalArgumentException("onPrepared callback is required".toString());
            }
            throw new IllegalArgumentException("Caller id is required".toString());
        }
    }

    public /* synthetic */ StartCallParams(ParticipantId participantId, String str, mle mle, rl rlVar, Long l, boolean z, ParticipantId participantId2, u16 u16, u16 u162, yw1 yw1, ConversationEventsListener conversationEventsListener, cs9 cs9, boolean z2, x54 x54) {
        this(participantId, str, mle, rlVar, l, z, participantId2, u16, u162, yw1, conversationEventsListener, cs9, z2);
    }

    public final Long getChatId() {
        return this.chatId;
    }

    public final ParticipantId getOpponentId() {
        return this.opponentId;
    }

    public final String getPayload() {
        return this.payload;
    }

    public final rl getTokenInfoProvider() {
        return this.tokenInfoProvider;
    }

    public final mle getTokenProvider() {
        return this.tokenProvider;
    }

    public final boolean isWatchTogetherEnabledForAll() {
        return this.isWatchTogetherEnabledForAll;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    private StartCallParams(ParticipantId participantId, String str, mle mle, rl rlVar, Long l, boolean z, ParticipantId participantId2, u16 u16, u16 u162, yw1 yw1, ConversationEventsListener conversationEventsListener, cs9 cs9, boolean z2) {
        super(participantId2, conversationEventsListener, u16, u162, z2, yw1, cs9);
        this.opponentId = participantId;
        this.payload = str;
        this.tokenProvider = mle;
        this.tokenInfoProvider = rlVar;
        this.chatId = l;
        this.isWatchTogetherEnabledForAll = z;
    }
}

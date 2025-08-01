package ru.ok.android.externcalls.sdk.api;

import java.util.List;
import kotlin.Metadata;
import ru.ok.android.externcalls.sdk.ConversationParticipant;
import ru.ok.android.externcalls.sdk.conversation.StartCallApiParams;
import ru.ok.android.externcalls.sdk.log.GlobalRTCLogger;

@Metadata(d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\b\u0016\u0018\u0000 32\u00020\u0001:\u00013B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J_\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00140\u00132\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\t2\b\u0010\f\u001a\u0004\u0018\u00010\u000b2\u000e\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\r2\u000e\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\r2\u0006\u0010\u0012\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\u0015\u0010\u0016J+\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00180\u00132\u0006\u0010\b\u001a\u00020\u00062\u0006\u0010\u0017\u001a\u00020\u000e2\u0006\u0010\u0012\u001a\u00020\u0011¢\u0006\u0004\b\u0019\u0010\u001aJ+\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u001c0\u00132\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u001d\u0010\u001eJ7\u0010 \u001a\b\u0012\u0004\u0012\u00020\u001c0\u00132\b\u0010\u001f\u001a\u0004\u0018\u00010\u00062\b\u0010\u001b\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0017\u001a\u00020\u000e2\u0006\u0010\u0012\u001a\u00020\u0011¢\u0006\u0004\b \u0010!JK\u0010#\u001a\b\u0012\u0004\u0012\u00020\u00140\u00132\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\t2\b\u0010\f\u001a\u0004\u0018\u00010\u000b2\f\u0010\"\u001a\b\u0012\u0004\u0012\u00020\u000e0\r2\u0006\u0010\u0012\u001a\u00020\u0011¢\u0006\u0004\b#\u0010$JK\u0010&\u001a\b\u0012\u0004\u0012\u00020\u00140\u00132\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\t2\b\u0010\f\u001a\u0004\u0018\u00010\u000b2\f\u0010%\u001a\b\u0012\u0004\u0012\u00020\u00060\r2\u0006\u0010\u0012\u001a\u00020\u0011¢\u0006\u0004\b&\u0010$J\u001b\u0010'\u001a\b\u0012\u0004\u0012\u00020\u00060\u00132\u0006\u0010\b\u001a\u00020\u0006¢\u0006\u0004\b'\u0010(J\u001f\u0010,\u001a\u00020+2\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010*\u001a\u00020)H\u0016¢\u0006\u0004\b,\u0010-J7\u0010/\u001a\u00020+2\b\u0010\f\u001a\u0004\u0018\u00010\u000b2\f\u0010\"\u001a\b\u0012\u0004\u0012\u00020\u000e0\r2\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010.\u001a\u00020)H\u0016¢\u0006\u0004\b/\u00100J7\u00101\u001a\u00020+2\b\u0010\f\u001a\u0004\u0018\u00010\u000b2\f\u0010\"\u001a\b\u0012\u0004\u0012\u00020\u00060\r2\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010.\u001a\u00020)H\u0016¢\u0006\u0004\b1\u00100R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0003\u00102¨\u00064"}, d2 = {"Lru/ok/android/externcalls/sdk/api/OkApiService;", "", "Ljic;", "rxApiClient", "<init>", "(Ljic;)V", "", "servers", "cid", "", "createLink", "Lru/ok/android/externcalls/sdk/ConversationParticipant;", "opponent", "", "", "opponentInternalIds", "opponentExternalIds", "Lru/ok/android/externcalls/sdk/conversation/StartCallApiParams;", "params", "Ldhd;", "Lru/ok/android/externcalls/sdk/api/CallInfo;", "startConversationImpl", "(Ljava/lang/String;Ljava/lang/String;ZLru/ok/android/externcalls/sdk/ConversationParticipant;Ljava/util/List;Ljava/util/List;Lru/ok/android/externcalls/sdk/conversation/StartCallApiParams;)Ldhd;", "peerId", "Lru/ok/android/externcalls/sdk/api/JoinByIdResponse;", "joinToConversation", "(Ljava/lang/String;JLru/ok/android/externcalls/sdk/conversation/StartCallApiParams;)Ldhd;", "anonToken", "Lru/ok/android/externcalls/sdk/api/ConversationParams;", "getConversationParams", "(Ljava/lang/String;Ljava/lang/String;)Ldhd;", "initialJoinLink", "getJoinConversationParamsExt", "(Ljava/lang/String;Ljava/lang/String;JLru/ok/android/externcalls/sdk/conversation/StartCallApiParams;)Ldhd;", "opponents", "startConversation", "(Ljava/lang/String;Ljava/lang/String;ZLru/ok/android/externcalls/sdk/ConversationParticipant;Ljava/util/List;Lru/ok/android/externcalls/sdk/conversation/StartCallApiParams;)Ldhd;", "opponentIds", "startConversationWithExternalIds", "createJoinLink", "(Ljava/lang/String;)Ldhd;", "Lmj0;", "joinReq", "Ljue;", "addJoinToConversationParams", "(Lru/ok/android/externcalls/sdk/conversation/StartCallApiParams;Lmj0;)V", "startReq", "addCreateConversationParams", "(Lru/ok/android/externcalls/sdk/ConversationParticipant;Ljava/util/List;Lru/ok/android/externcalls/sdk/conversation/StartCallApiParams;Lmj0;)V", "addCreateConversationParamsByExternalOpponentIds", "Ljic;", "Companion", "calls-sdk_release"}, k = 1, mv = {1, 9, 0})
public class OkApiService {
    private static final Companion Companion = new Companion((x54) null);
    private static final String LOG_TAG = "OkApiService";
    private static final String METHOD_CREATE_JOIN_LINK = "vchat.createJoinLink";
    private static final String METHOD_GET_CONVERSATION_PARAMS = "vchat.getConversationParams";
    private static final String METHOD_JOIN_TO_CONVERSATION = "vchat.joinConversation";
    private static final String METHOD_START_CONVERSATION = "vchat.startConversation";
    private final jic rxApiClient;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\t"}, d2 = {"Lru/ok/android/externcalls/sdk/api/OkApiService$Companion;", "", "()V", "LOG_TAG", "", "METHOD_CREATE_JOIN_LINK", "METHOD_GET_CONVERSATION_PARAMS", "METHOD_JOIN_TO_CONVERSATION", "METHOD_START_CONVERSATION", "calls-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(x54 x54) {
            this();
        }
    }

    public OkApiService(jic jic) {
        this.rxApiClient = jic;
    }

    public static /* synthetic */ dhd getConversationParams$default(OkApiService okApiService, String str, String str2, int i, Object obj) {
        if (obj == null) {
            if ((i & 1) != 0) {
                str = null;
            }
            if ((i & 2) != 0) {
                str2 = null;
            }
            return okApiService.getConversationParams(str, str2);
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getConversationParams");
    }

    private final dhd startConversationImpl(String str, String str2, boolean z, ConversationParticipant conversationParticipant, List<Long> list, List<String> list2, StartCallApiParams startCallApiParams) {
        jic jic = this.rxApiClient;
        mj0 R = ez3.R(METHOD_START_CONVERSATION);
        R.b = kl.c;
        R.c(ApiProtocol.PARAM_IS_VIDEO, startCallApiParams.isVideo());
        R.b(ApiProtocol.PARAM_TURN_SERVERS, str);
        R.b(ApiProtocol.PARAM_CONVERSATION_ID, str2);
        R.c(ApiProtocol.PARAM_CREATE_JOIN_LINK, z);
        if (startCallApiParams.isMultipleDevicesEnabled()) {
            GlobalRTCLogger.log(LOG_TAG, "FEATURE_VOIP_MULTIPLE_DEVICES: Using protocolVersion = 6");
            R.c.a(new hz6(ApiProtocol.PARAM_PROTOCOL_VERSION, (long) 6));
        }
        String domainId = startCallApiParams.getDomainId();
        if (domainId != null) {
            R.b(ApiProtocol.PARAM_DOMAIN_ID, domainId);
        }
        String payload = startCallApiParams.getPayload();
        if (payload != null) {
            R.b(ApiProtocol.PARAM_PAYLOAD, payload);
        }
        if (list != null) {
            addCreateConversationParams(conversationParticipant, list, startCallApiParams, R);
        }
        if (list2 != null) {
            addCreateConversationParamsByExternalOpponentIds(conversationParticipant, list2, startCallApiParams, R);
        }
        R.c(ApiProtocol.PARAM_ONLY_ADMIN_CAN_SHARE_MOVIE, !startCallApiParams.isWatchTogetherEnabledForAll());
        return jic.a(R.a(CallInfo.PARSER)).i(de.a());
    }

    public void addCreateConversationParams(ConversationParticipant conversationParticipant, List<Long> list, StartCallApiParams startCallApiParams, mj0 mj0) {
        if (!list.isEmpty()) {
            mj0.b(ApiProtocol.PARAM_UIDS, o23.c0(list, ",", (String) null, (String) null, (u16) null, 62));
        }
    }

    public void addCreateConversationParamsByExternalOpponentIds(ConversationParticipant conversationParticipant, List<String> list, StartCallApiParams startCallApiParams, mj0 mj0) {
        if (!list.isEmpty()) {
            mj0.b(ApiProtocol.PARAM_EXTERNAL_IDS, o23.c0(list, ",", (String) null, (String) null, (u16) null, 62));
        }
    }

    public void addJoinToConversationParams(StartCallApiParams startCallApiParams, mj0 mj0) {
    }

    public final dhd createJoinLink(String str) {
        jic jic = this.rxApiClient;
        mj0 R = ez3.R(METHOD_CREATE_JOIN_LINK);
        R.b = kl.c;
        R.b(ApiProtocol.PARAM_CONVERSATION_ID, str);
        return jic.a(R.a(new UnwrappingParser(ApiProtocol.KEY_JOIN_LINK, new yc5(29)))).i(de.a());
    }

    public final dhd getConversationParams(String str, String str2) {
        jic jic = this.rxApiClient;
        mj0 R = ez3.R(METHOD_GET_CONVERSATION_PARAMS);
        R.b = kl.c;
        if (str != null) {
            R.b(ApiProtocol.PARAM_ANONYM_TOKEN, str);
        }
        if (str2 != null) {
            R.b(ApiProtocol.PARAM_CONVERSATION_ID, str2);
        }
        return jic.a(R.a(ConversationParams.PARSER)).i(de.a());
    }

    public final dhd getJoinConversationParamsExt(String str, String str2, long j, StartCallApiParams startCallApiParams) {
        mj0 R = ez3.R("vchat.joinConversationByLink");
        R.b = kl.c;
        R.b(ApiProtocol.PARAM_JOIN_LINK, str);
        R.c(ApiProtocol.PARAM_IS_VIDEO, startCallApiParams.isVideo());
        hz6 hz6 = new hz6(ApiProtocol.PARAM_PEER_ID, j);
        el elVar = R.c;
        elVar.a(hz6);
        R.b(ApiProtocol.PARAM_ANONYM_TOKEN, str2);
        if (startCallApiParams.getPayload() != null) {
            elVar.a(new f0e(ApiProtocol.PARAM_PAYLOAD, startCallApiParams.getPayload()));
        }
        if (startCallApiParams.isMultipleDevicesEnabled()) {
            elVar.a(new hz6(ApiProtocol.PARAM_PROTOCOL_VERSION, (long) 6));
        }
        return this.rxApiClient.a(R.a(JoinByLinkResponse.PARSER)).h(OkApiService$getJoinConversationParamsExt$1.INSTANCE);
    }

    public final dhd joinToConversation(String str, long j, StartCallApiParams startCallApiParams) {
        mj0 R = ez3.R(METHOD_JOIN_TO_CONVERSATION);
        R.b = kl.c;
        R.b(ApiProtocol.PARAM_CONVERSATION_ID, str);
        hz6 hz6 = new hz6(ApiProtocol.PARAM_PEER_ID, j);
        el elVar = R.c;
        elVar.a(hz6);
        R.c(ApiProtocol.PARAM_IS_VIDEO, startCallApiParams.isVideo());
        Long chatId = startCallApiParams.getChatId();
        if (chatId != null) {
            elVar.a(new hz6(ApiProtocol.PARAM_CHAT_ID, chatId.longValue()));
        }
        if (startCallApiParams.isMultipleDevicesEnabled()) {
            GlobalRTCLogger.log(LOG_TAG, "FEATURE_VOIP_MULTIPLE_DEVICES: Using protocolVersion = 6");
            elVar.a(new hz6(ApiProtocol.PARAM_PROTOCOL_VERSION, (long) 6));
        }
        addJoinToConversationParams(startCallApiParams, R);
        return this.rxApiClient.a(R.a(hhd.c)).h(OkApiService$joinToConversation$1.INSTANCE).i(de.a());
    }

    public final dhd startConversation(String str, String str2, boolean z, ConversationParticipant conversationParticipant, List<Long> list, StartCallApiParams startCallApiParams) {
        return startConversationImpl(str, str2, z, conversationParticipant, list, (List<String>) null, startCallApiParams);
    }

    public final dhd startConversationWithExternalIds(String str, String str2, boolean z, ConversationParticipant conversationParticipant, List<String> list, StartCallApiParams startCallApiParams) {
        return startConversationImpl(str, str2, z, conversationParticipant, (List<Long>) null, list, startCallApiParams);
    }
}

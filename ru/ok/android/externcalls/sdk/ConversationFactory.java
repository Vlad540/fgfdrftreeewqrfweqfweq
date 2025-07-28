package ru.ok.android.externcalls.sdk;

import android.content.Context;
import java.io.IOException;
import java.time.Clock;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Locale;
import java.util.Objects;
import java.util.UUID;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import org.webrtc.NativeLibraryLoader;
import ru.ok.android.externcalls.analytics.CallAnalyticsSender;
import ru.ok.android.externcalls.sdk.ConversationFactoryInitParams;
import ru.ok.android.externcalls.sdk.analytics.CallAnalyticsInitializer;
import ru.ok.android.externcalls.sdk.analytics.ConversationAnalyticsSender;
import ru.ok.android.externcalls.sdk.analytics.internal.ConversationAnalyticsSenderImpl;
import ru.ok.android.externcalls.sdk.api.ApiProtocol;
import ru.ok.android.externcalls.sdk.api.ConversationParams;
import ru.ok.android.externcalls.sdk.api.OkApiService;
import ru.ok.android.externcalls.sdk.api.log.LoggingApiRequestDebugger;
import ru.ok.android.externcalls.sdk.api.retry.RetryKt;
import ru.ok.android.externcalls.sdk.api.session.InMemorySessionStore;
import ru.ok.android.externcalls.sdk.chat.ChatStateListener;
import ru.ok.android.externcalls.sdk.connection.MediaConnectionSettings;
import ru.ok.android.externcalls.sdk.factory.AnswerCallParams;
import ru.ok.android.externcalls.sdk.factory.CreateConfParams;
import ru.ok.android.externcalls.sdk.factory.JoinAnonByLinkParams;
import ru.ok.android.externcalls.sdk.factory.JoinByLinkParams;
import ru.ok.android.externcalls.sdk.factory.JoinCallParams;
import ru.ok.android.externcalls.sdk.factory.StartCallParams;
import ru.ok.android.externcalls.sdk.factory.internal.RTCLogWrapper;
import ru.ok.android.externcalls.sdk.id.IdMappingWrapper;
import ru.ok.android.externcalls.sdk.id.ParticipantId;
import ru.ok.android.externcalls.sdk.id.mapping.IdsMapper;
import ru.ok.android.externcalls.sdk.log.ExtLogger;
import ru.ok.android.externcalls.sdk.log.GlobalRTCLogger;
import ru.ok.android.externcalls.sdk.log.stat.ProductStatisticsManagerImpl;
import ru.ok.android.externcalls.sdk.log.stat.StatisticsManager;
import ru.ok.android.externcalls.sdk.log.stat.item.ProductStatItem;
import ru.ok.android.externcalls.sdk.rate.rtt.RttRateHintConfig;

public class ConversationFactory {
    private static final String DEFAULT_APP_VERSION = "sdk-sdk-125.1.0.48.1";
    private static final String LOG_TAG = "ConversationFactory";
    public static final String SDK_VERSION = "sdk-125.1.0.48.1";
    private static final ExecutorService WEBRTC_EXECUTOR = Executors.newSingleThreadExecutor();
    private static volatile boolean initDone = false;
    private List<String> additionalWhitelistedCodecPrefixes;
    private bi animojiDataSupplier;
    private final mw9 api;
    private String appVersion;
    private String[] audioCodecs;
    private int audioLevelFrequencyMs;
    private pe0 badNetworkIndicatorConfig;
    private ce1 bitrates;
    private final CallAnalyticsSender callAnalyticsSender;
    private ChatStateListener chatStateListener;
    private final String clientType;
    private final Context context;
    private final ConversationAnalyticsSenderImpl conversationAnalyticsSender;
    private boolean dataChannelScreenshareRecvEnabled;
    private boolean dataChannelScreenshareSendEnabled;
    private final ExtLogger defaultStat;
    private final n83 disposable;
    private boolean dnsResolverEnabled;
    private String domainId;
    private boolean enableLossRttBadConnectionHandling;
    private final de1 experiments;
    private IdsMapper<ge1, ParticipantId> externalIdsMapper;
    private boolean fastRecoverEnabled;
    private boolean forceRelayPolicy;
    private my7 groupCallMediaAdaptationConfig;
    private boolean hotStart;
    private final IdMappingWrapper idMappingWrapper;
    private IdsMapper<ParticipantId, ge1> internalIdsMapper;
    private boolean isAsrOnlineEnabled;
    private boolean isAudienceModeEnabled;
    private boolean isConsumerUpdateEnabled;
    private boolean isDeviceAudioShareEnabled;
    private boolean isFastScreenCaptureEnabled;
    private boolean isMediaAdaptationFeatureEnabledForGroupCall;
    private boolean isMediaAdaptationFeatureEnabledForP2PCall;
    private boolean isSessionRoomsFeatureEnabled;
    private boolean isSignalingDefaultValuesFilteringEnabled;
    private boolean isWaitingRoomActivated;
    private boolean isWebRTCCodecFilteringEnabled;
    private Locale locale;
    private xwb log;
    private ywb logConfiguration;
    private MediaConnectionSettings mediaConnectionSettings;
    private long mediaReceivingTimeoutMs;
    private boolean multipleDevicesEnabled;
    private OkApiService okApiService;
    private boolean onDemandTracksEnabled;
    private my7 p2pCallMediaAdaptationConfig;
    private final StatisticsManager<ProductStatItem> prodStat;
    private ufc rotationProvider;
    private RttRateHintConfig rttRateHintConfig;
    private onc screenCapturePermissionProvider;
    private boolean serverTopologySuspendBelowMinBitrate;
    private boolean sessionIdEnabled;
    private boolean showLocalVideoInOriginalQuality;
    private final aoe tracerLiteFacade;
    private String[] videoCodecs;
    private int videoTracksCount;

    public ConversationFactory(mw9 mw9, Context context2, String str) {
        this(mw9, context2, str, (String) null);
    }

    public static String generateConversationId() {
        return UUID.randomUUID().toString();
    }

    private ConversationBuilder getBaseBuilder() {
        ConversationBuilder stat = new ConversationBuilder(this.idMappingWrapper).setCreator(this).setContext(this.context).setApi(this.api).setExecutorService(WEBRTC_EXECUTOR).setVersion(this.appVersion).setStat(this.defaultStat);
        xwb xwb = this.log;
        if (!(xwb instanceof ioe)) {
            xwb = new ioe(this.tracerLiteFacade, xwb);
        }
        return stat.setLog(xwb).setLogConfiguration(this.logConfiguration).setClientType(this.clientType).setHotStart(this.hotStart).setForceRelayPolicy(this.forceRelayPolicy).setAudioLevelFrequencyMs(this.audioLevelFrequencyMs).setDomainId(this.domainId).setConsumerUpdateEnabled(this.isConsumerUpdateEnabled).setOnDemandTracksEnabled(this.onDemandTracksEnabled).setAdditionalWhitelistedCodecPrefixes(this.additionalWhitelistedCodecPrefixes).setBitrates(this.bitrates).setEnableLossRttBadConnectionHandling(this.enableLossRttBadConnectionHandling).setDataChannelScreenshareRecvEnabled(this.dataChannelScreenshareRecvEnabled).setDataChannelScreenshareSendEnabled(this.dataChannelScreenshareSendEnabled).setVideoTracksCount(this.videoTracksCount).setFastRecoverEnabled(this.fastRecoverEnabled).setSessionIdEnabled(this.sessionIdEnabled).setMediaReceivingTimeoutMs(this.mediaReceivingTimeoutMs).setIsWaitingRoomActivated(this.isWaitingRoomActivated).setSignalingDefaultValuesFilteringEnabled(this.isSignalingDefaultValuesFilteringEnabled).setWebRTCCodecFilteringEnabled(this.isWebRTCCodecFilteringEnabled).setWebRTCAudioCodecs(this.audioCodecs).setWebRTCVideoCodecs(this.videoCodecs).setMultipleDevicesEnabled(this.multipleDevicesEnabled).setRotationProvider(this.rotationProvider).setAnimojiDataSupplier(this.animojiDataSupplier).setRotationProvider(this.rotationProvider).showLocalVideoInOriginalQuality(this.showLocalVideoInOriginalQuality).setSessionRoomsEnabled(this.isSessionRoomsFeatureEnabled).setLocale(this.locale).setInternalIdsMapper(this.internalIdsMapper).setExternalIdsMapper(this.externalIdsMapper).setMediaAdaptationFeatureEnabledForP2PCall(this.isMediaAdaptationFeatureEnabledForP2PCall).setP2PCallMediaAdaptationConfig(this.p2pCallMediaAdaptationConfig).setMediaAdaptationFeatureEnabledForGroupCall(this.isMediaAdaptationFeatureEnabledForGroupCall).setGroupCallMediaAdaptationConfig(this.groupCallMediaAdaptationConfig).setAsrOnlineEnabled(this.isAsrOnlineEnabled).setExperiments(this.experiments).setAudienceModelEnabled(this.isAudienceModeEnabled).setServerTopologySuspendBelowMinBitrate(this.serverTopologySuspendBelowMinBitrate).setFastScreenCaptureEnabled(this.isFastScreenCaptureEnabled).setDeviceAudioShareEnabled(this.isDeviceAudioShareEnabled).setChatStateListener(this.chatStateListener).setOkApiService(this.okApiService).setDnsResolverEnabled(this.dnsResolverEnabled).setBadNetworkIndicatorConfig(this.badNetworkIndicatorConfig).setAnalyticsSender(this.callAnalyticsSender).setScreenCapturePermissionProvider(this.screenCapturePermissionProvider).setMediaConnectionSettings(this.mediaConnectionSettings).setRttRateHintConfig(this.rttRateHintConfig);
    }

    public static synchronized void init(Context context2) {
        synchronized (ConversationFactory.class) {
            init(new ConversationFactoryInitParams.Builder(context2).build());
        }
    }

    private static /* synthetic */ nl lambda$answer$5(nl nlVar) {
        return new InMemorySessionStore();
    }

    private static /* synthetic */ nl lambda$call$2(nl nlVar) {
        return new InMemorySessionStore();
    }

    private static /* synthetic */ nl lambda$createConfRoom$18(nl nlVar) {
        return new InMemorySessionStore();
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ void lambda$hangup$22(Object obj) throws Throwable {
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ void lambda$hangup$23(Throwable th) throws Throwable {
    }

    private static /* synthetic */ nl lambda$joinAnonByLink$13(nl nlVar) {
        return new InMemorySessionStore();
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ ql lambda$joinAnonByLink$14(JoinAnonByLinkParams joinAnonByLinkParams) throws IOException {
        return new ql((String) null, joinAnonByLinkParams.getApiEndpoint());
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ String lambda$joinAnonByLink$15() {
        return null;
    }

    private static /* synthetic */ nl lambda$joinByLink$10(nl nlVar) {
        return new InMemorySessionStore();
    }

    /* access modifiers changed from: private */
    public /* synthetic */ xwb lambda$new$0() {
        return this.log;
    }

    /* access modifiers changed from: private */
    public /* synthetic */ xwb lambda$new$1() {
        return this.log;
    }

    public Conversation answer(u16 u16) {
        AnswerCallParams answerCallParams = (AnswerCallParams) u16.invoke(new AnswerCallParams.Builder());
        ConversationParams conversationParams = null;
        ConversationBuilder cameraCapturerFactory = getBaseBuilder().setHasVideo(answerCallParams.getShouldStartWithVideo()).setAnswerAsContact(answerCallParams.getAnswerAsContact()).setIsCaller(false).setIsAnswer(true).setPayload((String) null).setCid(answerCallParams.getConversationId()).setEventListener(answerCallParams.getEventListener()).setCameraCapturerFactory(answerCallParams.getCameraCapturerFactory());
        answerCallParams.getFrameInterceptor();
        ConversationBuilder opponentId = cameraCapturerFactory.setFrameInterceptor((yw1) null).setMyId(answerCallParams.getMyId()).setOpponentId(answerCallParams.getOpponentId());
        if (answerCallParams.getTokenProvider() != null) {
            l83 d = this.api.d();
            d.a = new SimpleConfigurationStore((ya3) d.a);
            d.b = answerCallParams.getTokenProvider();
            opponentId.setApi(d.h());
        }
        if (answerCallParams.getTokenInfoProvider() != null) {
            l83 d2 = this.api.d();
            d2.g = lambda$answer$5((nl) d2.g);
            d2.f = answerCallParams.getTokenInfoProvider();
            opponentId.setApi(d2.h());
        }
        ConversationImpl createConversation = opponentId.createConversation();
        try {
            this.log.log(LOG_TAG, "Try to decode provided conversation params");
            conversationParams = ConversationParams.decode(answerCallParams.getConversationParams());
        } catch (Throwable unused) {
            this.log.log(LOG_TAG, "Error while trying to decode provided conversation params");
        }
        createConversation.prepare(conversationParams, new xs3(answerCallParams, 0), new xs3(answerCallParams, 1));
        return createConversation;
    }

    public Conversation call(u16 u16) {
        StartCallParams startCallParams = (StartCallParams) u16.invoke(new StartCallParams.Builder());
        ConversationBuilder eventListener = getBaseBuilder().setHasVideo(startCallParams.getShouldStartWithVideo()).setIsCaller(true).setPayload(startCallParams.getPayload()).setCid(generateConversationId()).setEventListener(startCallParams.getEventListener());
        startCallParams.getFrameInterceptor();
        ConversationBuilder chatId = eventListener.setFrameInterceptor((yw1) null).setWatchTogetherEnabledForAll(startCallParams.isWatchTogetherEnabledForAll()).setCameraCapturerFactory(startCallParams.getCameraCapturerFactory()).setMyId(startCallParams.getMyId()).setOpponentId(startCallParams.getOpponentId()).setChatId(startCallParams.getChatId());
        if (startCallParams.getTokenProvider() != null) {
            l83 d = this.api.d();
            d.a = new SimpleConfigurationStore((ya3) d.a);
            d.b = startCallParams.getTokenProvider();
            chatId.setApi(d.h());
        }
        if (startCallParams.getTokenInfoProvider() != null) {
            l83 d2 = this.api.d();
            d2.g = lambda$call$2((nl) d2.g);
            d2.f = startCallParams.getTokenInfoProvider();
            chatId.setApi(d2.h());
        }
        ConversationImpl createConversation = chatId.createConversation();
        createConversation.prepare((ConversationParams) null, new ts3(startCallParams, 0), new ts3(startCallParams, 1));
        return createConversation;
    }

    public void clearApiAuthSession() {
        this.api.b().e();
    }

    public Conversation createConfRoom(u16 u16) {
        CreateConfParams createConfParams = (CreateConfParams) u16.invoke(new CreateConfParams.Builder());
        ConversationBuilder eventListener = getBaseBuilder().setHasVideo(createConfParams.getShouldStartWithVideo()).setIsCaller(true).setPayload(createConfParams.getPayload()).setCid(generateConversationId()).setEventListener(createConfParams.getEventListener());
        createConfParams.getFrameInterceptor();
        ConversationBuilder myId = eventListener.setFrameInterceptor((yw1) null).setCameraCapturerFactory(createConfParams.getCameraCapturerFactory()).setWatchTogetherEnabledForAll(createConfParams.isWatchTogetherEnabledForAll()).setMyId(createConfParams.getMyId());
        if (createConfParams.getTokenProvider() != null) {
            l83 d = this.api.d();
            d.b = createConfParams.getTokenProvider();
            d.a = new SimpleConfigurationStore((ya3) d.a);
            myId.setApi(d.h());
        }
        if (createConfParams.getTokenInfoProvider() != null) {
            l83 d2 = this.api.d();
            d2.g = lambda$createConfRoom$18((nl) d2.g);
            d2.f = createConfParams.getTokenInfoProvider();
            myId.setApi(d2.h());
        }
        ConversationImpl createConversation = myId.createConversation();
        createConversation.initStore(createConfParams.getInitialIds());
        createConversation.prepare((ConversationParams) null, true, createConfParams.isAnonForbidden(), new at3(createConfParams, 0), new at3(createConfParams, 1));
        return createConversation;
    }

    public ConversationAnalyticsSender getAnalyticsSender() {
        return this.conversationAnalyticsSender;
    }

    public bi getAnimojiDataSupplier() {
        return this.animojiDataSupplier;
    }

    public int getAudioLevelFrequencyMs() {
        return this.audioLevelFrequencyMs;
    }

    public StatisticsManager<ProductStatItem> getProductStatisticsManager() {
        return this.prodStat;
    }

    public void hangup(fe6 fe6, String str, String str2) {
        mj0 R = ez3.R("vchat.hangupConversation");
        R.b = kl.c;
        R.b(ApiProtocol.PARAM_CONVERSATION_ID, str);
        R.b("reason", fe6.toString());
        R.b(ApiProtocol.PARAM_ANONYM_TOKEN, str2);
        nj0 a = R.a(vx3.b);
        jic c = this.api.c();
        no3 no3 = new no3(1);
        c.getClass();
        dhd retryApiCallForBackgroundWork = RetryKt.retryApiCallForBackgroundWork(c.a(new w4g(a, no3)), this.experiments.h, this.log);
        no3 no32 = new no3(2);
        no3 no33 = new no3(3);
        retryApiCallForBackgroundWork.getClass();
        pn1 pn1 = new pn1(no32, 2, no33);
        retryApiCallForBackgroundWork.k(pn1);
        this.disposable.a(pn1);
    }

    public boolean isDnsResolverEnabled() {
        return this.dnsResolverEnabled;
    }

    public Conversation join(u16 u16) {
        JoinCallParams joinCallParams = (JoinCallParams) u16.invoke(new JoinCallParams.Builder());
        ConversationBuilder eventListener = getBaseBuilder().setHasVideo(joinCallParams.getShouldStartWithVideo()).setIsCaller(false).setIsJoined(true).setPayload((String) null).setCid(joinCallParams.getConversationId()).setEventListener(joinCallParams.getEventListener());
        joinCallParams.getFrameInterceptor();
        ConversationImpl createConversation = eventListener.setFrameInterceptor((yw1) null).setChatId(joinCallParams.getChatId()).setCameraCapturerFactory(joinCallParams.getCameraCapturerFactory()).setMyId(joinCallParams.getMyId()).createConversation();
        createConversation.initAsConfJoin();
        createConversation.prepare((ConversationParams) null, new ws3(joinCallParams, 0), new ws3(joinCallParams, 1));
        return createConversation;
    }

    public Conversation joinAnonByLink(u16 u16) {
        JoinAnonByLinkParams joinAnonByLinkParams = (JoinAnonByLinkParams) u16.invoke(new JoinAnonByLinkParams.Builder());
        l83 d = this.api.d();
        if (((rl) d.f) == null || joinAnonByLinkParams.getApiEndpoint() == null) {
            d.a = new SimpleConfigurationStore((ya3) d.a);
            d.b = new no3(4);
        } else {
            d.g = lambda$joinAnonByLink$13((nl) d.g);
            d.f = new zx1(26, joinAnonByLinkParams);
        }
        ConversationBuilder eventListener = getBaseBuilder().setHasVideo(joinAnonByLinkParams.getShouldStartWithVideo()).setIsCaller(false).setIsJoined(true).setPayload((String) null).setEventListener(joinAnonByLinkParams.getEventListener());
        joinAnonByLinkParams.getFrameInterceptor();
        ConversationImpl createConversation = eventListener.setFrameInterceptor((yw1) null).setJoinLink(joinAnonByLinkParams.getLink()).setApi(d.h()).setCameraCapturerFactory(joinAnonByLinkParams.getCameraCapturerFactory()).setMyId(joinAnonByLinkParams.getMyId()).createConversation();
        createConversation.initAsConfJoin();
        createConversation.prepareJoinByLink(new us3(joinAnonByLinkParams, 0), new us3(joinAnonByLinkParams, 1), joinAnonByLinkParams.getToken());
        return createConversation;
    }

    public Conversation joinByLink(u16 u16) {
        JoinByLinkParams joinByLinkParams = (JoinByLinkParams) u16.invoke(new JoinByLinkParams.Builder());
        ConversationBuilder eventListener = getBaseBuilder().setHasVideo(joinByLinkParams.getShouldStartWithVideo()).setIsCaller(false).setIsJoined(true).setPayload((String) null).setEventListener(joinByLinkParams.getEventListener());
        joinByLinkParams.getFrameInterceptor();
        ConversationBuilder myId = eventListener.setFrameInterceptor((yw1) null).setJoinLink(joinByLinkParams.getLink()).setCameraCapturerFactory(joinByLinkParams.getCameraCapturerFactory()).setPayload(joinByLinkParams.getPayload()).setMyId(joinByLinkParams.getMyId());
        if (joinByLinkParams.getTokenProvider() != null) {
            l83 d = this.api.d();
            d.b = joinByLinkParams.getTokenProvider();
            d.a = new SimpleConfigurationStore((ya3) d.a);
            myId.setApi(d.h());
        }
        if (joinByLinkParams.getTokenInfoProvider() != null) {
            l83 d2 = this.api.d();
            d2.g = lambda$joinByLink$10((nl) d2.g);
            d2.f = joinByLinkParams.getTokenInfoProvider();
            myId.setApi(d2.h());
        }
        ConversationImpl createConversation = myId.createConversation();
        createConversation.initAsConfJoin();
        createConversation.prepareJoinByLink(new vs3(joinByLinkParams, 0), new vs3(joinByLinkParams, 1), (String) null);
        return createConversation;
    }

    public void reset() {
        this.disposable.d();
        this.api.b().e();
        this.idMappingWrapper.clear();
    }

    public void setAdditionalWhitelistedCodecPrefixes(List<String> list) {
        this.additionalWhitelistedCodecPrefixes = list;
    }

    public void setAnimojiDataSupplier(bi biVar) {
        this.animojiDataSupplier = biVar;
    }

    public void setApiRetriesEnabled(boolean z) {
        this.experiments.h = z;
    }

    public void setAppVersion(String str) {
        this.appVersion = str;
    }

    public void setAsrOnlineEnabled(boolean z) {
        this.isAsrOnlineEnabled = z;
    }

    public void setAudienceModeEnabled(boolean z) {
        this.isAudienceModeEnabled = z;
    }

    public void setAudioCodecs(String[] strArr) {
        this.audioCodecs = strArr;
    }

    public void setAudioLevelFrequencyMs(int i) {
        this.audioLevelFrequencyMs = i;
    }

    public void setBadNetworkIndicatorConfig(pe0 pe0) {
        this.badNetworkIndicatorConfig = pe0;
    }

    @Deprecated(forRemoval = true, since = "125.1.0.24")
    public void setBitrateByTableCalculationEnabled(boolean z) {
    }

    public void setBitrates(ce1 ce1) {
        this.bitrates = ce1;
    }

    public void setCamera2ApiEnabled(boolean z) {
        this.experiments.a = z;
    }

    @Deprecated(since = "112.1.6.15")
    public void setCameraFrameMaxDimension(int i) {
        this.experiments.e = Integer.valueOf(i);
    }

    public void setChatStateListener(ChatStateListener chatStateListener2) {
        this.chatStateListener = chatStateListener2;
    }

    public void setConsumerUpdateEnabled(boolean z) {
        this.isConsumerUpdateEnabled = z;
    }

    public void setDataChannelScreenshareRecvEnabled(boolean z) {
        this.dataChannelScreenshareRecvEnabled = z;
    }

    public void setDataChannelScreenshareSendEnabled(boolean z) {
        this.dataChannelScreenshareSendEnabled = z;
    }

    public void setDeviceAudioShareEnabled(boolean z) {
        this.isDeviceAudioShareEnabled = z;
    }

    public void setDomainId(String str) {
        this.domainId = str;
    }

    public void setDtxDisabled(boolean z) {
        this.experiments.g = z;
    }

    public void setDynamicScreenShareSizeUpdateEnabled(boolean z) {
        this.experiments.k = z;
    }

    public void setEnableLossRttBadConnectionHandling(boolean z) {
        this.enableLossRttBadConnectionHandling = z;
    }

    public void setEnabledDnsResolver(boolean z) {
        this.dnsResolverEnabled = z;
    }

    public void setEnqueuedCommandMergeEnabled(boolean z) {
        this.experiments.i = z;
    }

    @Deprecated
    public void setExceptionConsumer(vwb vwb) {
    }

    public void setExternalIdsMapper(IdsMapper<ge1, ParticipantId> idsMapper) {
        this.externalIdsMapper = idsMapper;
    }

    public void setFastRecoverEnabled(boolean z) {
        this.fastRecoverEnabled = z;
    }

    public void setFastScreenCaptureEnabled(boolean z) {
        this.isFastScreenCaptureEnabled = z;
    }

    public void setForceRelayPolicy(boolean z) {
        this.forceRelayPolicy = z;
    }

    public void setGroupCallMediaAdaptationConfig(my7 my7) {
        this.groupCallMediaAdaptationConfig = my7;
    }

    public void setHotStart(boolean z) {
        this.hotStart = z;
    }

    public void setInternalIdsMapper(IdsMapper<ParticipantId, ge1> idsMapper) {
        this.internalIdsMapper = idsMapper;
    }

    public void setIsMediaAdaptationFeatureEnabledForGroupCall(boolean z) {
        this.isMediaAdaptationFeatureEnabledForGroupCall = z;
    }

    public void setIsMediaAdaptationFeatureEnabledForP2PCall(boolean z) {
        this.isMediaAdaptationFeatureEnabledForP2PCall = z;
    }

    public void setIsWaitingRoomActivated(boolean z) {
        this.isWaitingRoomActivated = z;
    }

    public void setLocale(Locale locale2) {
        this.locale = locale2;
    }

    public void setLogConfiguration(ywb ywb) {
        this.logConfiguration = ywb;
    }

    public void setLogger(xwb xwb) {
        if (xwb == null) {
            xwb = wwb.a;
            this.api.b().m(hl.a);
        } else {
            this.api.b().m(new LoggingApiRequestDebugger(xwb));
        }
        ioe ioe = new ioe(this.tracerLiteFacade, xwb);
        this.log = ioe;
        GlobalRTCLogger.setLog(ioe);
    }

    public void setMediaConnectionSettings(MediaConnectionSettings mediaConnectionSettings2) {
        this.mediaConnectionSettings = mediaConnectionSettings2;
    }

    public void setMediaReceivingTimeoutMs(long j) {
        this.mediaReceivingTimeoutMs = j;
    }

    public void setMultipleDevicesEnabled(boolean z) {
        this.multipleDevicesEnabled = z;
    }

    public void setOkApiService(OkApiService okApiService2) {
        this.okApiService = okApiService2;
    }

    public void setOnDemandTracksEnabled(boolean z) {
        this.onDemandTracksEnabled = z;
    }

    public void setP2PCallMediaAdaptationConfig(my7 my7) {
        this.p2pCallMediaAdaptationConfig = my7;
    }

    public void setRotationProvider(ufc ufc) {
        this.rotationProvider = ufc;
    }

    public void setRttRateHintConfig(RttRateHintConfig rttRateHintConfig2) {
        this.rttRateHintConfig = rttRateHintConfig2;
    }

    public void setScreenCapturePermissionProvider(onc onc) {
        this.screenCapturePermissionProvider = onc;
    }

    public void setServerTopologySuspendBelowMinBitrate(boolean z) {
        this.serverTopologySuspendBelowMinBitrate = z;
    }

    public void setSessionIdEnabled(boolean z) {
        this.sessionIdEnabled = z;
    }

    public void setSessionRoomsEnabled(boolean z) {
        this.isSessionRoomsFeatureEnabled = z;
    }

    public void setShowLocalVideoInOriginalQuality(boolean z) {
        this.showLocalVideoInOriginalQuality = z;
    }

    public void setSignalingDefaultValuesFilteringEnabled(boolean z) {
        this.isSignalingDefaultValuesFilteringEnabled = z;
    }

    public void setStartCallByExternalIdEnabled(boolean z) {
        this.experiments.j = z;
    }

    public void setTimeouts(ee1 ee1) {
        this.experiments.f = ee1;
    }

    public void setVideoCodecs(String[] strArr) {
        this.videoCodecs = strArr;
    }

    public void setVideoDegradationForSoftwareCodec(boolean z, Float f, Float f2) {
        de1 de1 = this.experiments;
        de1.b = z;
        if (z && f2 != null) {
            de1.c = f.floatValue();
        }
        if (z && f2 != null) {
            this.experiments.d = f2.floatValue();
        }
    }

    @Deprecated(forRemoval = true, since = "125.1.0.24")
    public void setVideoQualityUpdateNotificationEnabled(boolean z) {
    }

    public void setVideoTracksCount(int i) {
        if (i > 0) {
            this.videoTracksCount = i;
            return;
        }
        throw new IllegalArgumentException("Video tracks count must be positive");
    }

    public void setWebRTCCodecFilteringEnabled(boolean z) {
        this.isWebRTCCodecFilteringEnabled = z;
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    @android.annotation.SuppressLint({"NewApi"})
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public ConversationFactory(defpackage.mw9 r8, android.content.Context r9, java.lang.String r10, java.lang.String r11) {
        /*
            r7 = this;
            java.time.Clock r0 = java.time.Clock.systemUTC()
            java.util.Objects.requireNonNull(r0)
            zs3 r6 = new zs3
            r1 = 1
            r6.<init>(r0, r1)
            r1 = r7
            r2 = r8
            r3 = r9
            r4 = r10
            r5 = r11
            r1.<init>(r2, r3, r4, r5, r6)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: ru.ok.android.externcalls.sdk.ConversationFactory.<init>(mw9, android.content.Context, java.lang.String, java.lang.String):void");
    }

    public static synchronized void init(Context context2, NativeLibraryLoader nativeLibraryLoader) {
        synchronized (ConversationFactory.class) {
            init(new ConversationFactoryInitParams.Builder(context2).setPeerConnection(new ConversationFactoryInitParams.PeerConnection.Builder().setNativeLibraryLoader(nativeLibraryLoader).build()).build());
        }
    }

    /* JADX WARNING: type inference failed for: r8v1, types: [n83, java.lang.Object] */
    public ConversationFactory(mw9 mw9, Context context2, String str, String str2, ExtLogger.TimeProvider timeProvider) {
        this.isWaitingRoomActivated = true;
        this.enableLossRttBadConnectionHandling = false;
        this.hotStart = false;
        this.log = wwb.a;
        this.logConfiguration = CallUtil.LOG_CONFIGURATION;
        this.forceRelayPolicy = false;
        this.audioLevelFrequencyMs = 250;
        this.additionalWhitelistedCodecPrefixes = Arrays.asList(new String[]{"OMX.MTK", "OMX.hisi"});
        this.isConsumerUpdateEnabled = true;
        this.onDemandTracksEnabled = true;
        this.dataChannelScreenshareRecvEnabled = true;
        this.dataChannelScreenshareSendEnabled = true;
        this.videoTracksCount = 10;
        this.fastRecoverEnabled = true;
        this.sessionIdEnabled = true;
        this.mediaReceivingTimeoutMs = 10000;
        this.isSignalingDefaultValuesFilteringEnabled = true;
        this.rotationProvider = ufc.T;
        this.appVersion = DEFAULT_APP_VERSION;
        this.isWebRTCCodecFilteringEnabled = false;
        this.audioCodecs = null;
        this.videoCodecs = null;
        this.multipleDevicesEnabled = false;
        this.showLocalVideoInOriginalQuality = false;
        this.isSessionRoomsFeatureEnabled = true;
        this.isFastScreenCaptureEnabled = false;
        this.isDeviceAudioShareEnabled = false;
        this.isAsrOnlineEnabled = false;
        this.experiments = new de1();
        this.locale = null;
        this.animojiDataSupplier = j06.b;
        this.isMediaAdaptationFeatureEnabledForP2PCall = true;
        this.isMediaAdaptationFeatureEnabledForGroupCall = true;
        this.chatStateListener = ChatStateListener.EMPTY;
        this.serverTopologySuspendBelowMinBitrate = false;
        this.isAudienceModeEnabled = false;
        this.badNetworkIndicatorConfig = pe0.e;
        CallAnalyticsSender callAnalyticsSender2 = CallAnalyticsSender.INSTANCE;
        this.callAnalyticsSender = callAnalyticsSender2;
        ConversationAnalyticsSenderImpl conversationAnalyticsSenderImpl = new ConversationAnalyticsSenderImpl();
        this.conversationAnalyticsSender = conversationAnalyticsSenderImpl;
        this.mediaConnectionSettings = new MediaConnectionSettings();
        this.rttRateHintConfig = new RttRateHintConfig();
        this.clientType = str;
        this.domainId = str2;
        this.api = mw9;
        this.context = context2;
        this.disposable = new Object();
        IdMappingWrapper idMappingWrapper2 = IdMappingWrapper.get(context2, new RTCLogWrapper(new ys3(this, 0)));
        this.idMappingWrapper = idMappingWrapper2;
        Clock systemUTC = Clock.systemUTC();
        Objects.requireNonNull(systemUTC);
        this.prodStat = new ProductStatisticsManagerImpl(new zs3(systemUTC, 0));
        this.defaultStat = new ExtLogger(context2.getApplicationInfo().packageName, timeProvider);
        idMappingWrapper2.scheduleReadCacheFromDisk();
        this.additionalWhitelistedCodecPrefixes = Collections.emptyList();
        this.bitrates = CallUtil.createBitrates();
        this.okApiService = new OkApiService(mw9.c());
        this.tracerLiteFacade = new aoe(context2);
        new CallAnalyticsInitializer().init(callAnalyticsSender2, conversationAnalyticsSenderImpl.getConfiguration(), mw9, new ys3(this, 1));
    }

    public static synchronized void init(ConversationFactoryInitParams conversationFactoryInitParams) {
        bma bma;
        bma bma2;
        synchronized (ConversationFactory.class) {
            if (!initDone) {
                initDone = true;
                ConversationFactoryInitParams.PeerConnection peerConnection = conversationFactoryInitParams.getPeerConnection();
                ConversationFactoryInitParams.PeerConnection.DynamicRedundancyParameters dynamicRedundancyParams = peerConnection.getDynamicRedundancyParams();
                Context context2 = conversationFactoryInitParams.getContext();
                xwb logger = peerConnection.getLogger();
                Integer rttMultCapMs = peerConnection.getRttMultCapMs();
                boolean isREDEnabledP2P = peerConnection.isREDEnabledP2P();
                boolean isREDEnabledServer = peerConnection.isREDEnabledServer();
                boolean isOpusDREDEnabled = peerConnection.isOpusDREDEnabled();
                if (dynamicRedundancyParams == null) {
                    bma = null;
                } else {
                    bma = new bma(dynamicRedundancyParams.isEnabled(), dynamicRedundancyParams.getMinAudioBitrateBps(), dynamicRedundancyParams.getDREDSwitchBitrateBps(), dynamicRedundancyParams.isNoLACEEnabled(), dynamicRedundancyParams.isDREDWithFecEnabled(), dynamicRedundancyParams.isDREDLowBitrateEnabled(), dynamicRedundancyParams.getPTimeMinMs(), dynamicRedundancyParams.getPTimeMaxMs());
                }
                boolean isOpusDREDLowBitrateEnabled = peerConnection.isOpusDREDLowBitrateEnabled();
                String bonusFieldTrials = peerConnection.getBonusFieldTrials();
                String udpMarker = peerConnection.getUdpMarker();
                String tcpMarker = peerConnection.getTcpMarker();
                boolean isEarlyAudioPlayoutEnabled = peerConnection.isEarlyAudioPlayoutEnabled();
                boolean isEarlyAudioRecordingEnabled = peerConnection.isEarlyAudioRecordingEnabled();
                boolean isSkipRelayToNotRelayConnectionEnabled = peerConnection.isSkipRelayToNotRelayConnectionEnabled();
                if (bma == null) {
                    Boolean bool = Boolean.FALSE;
                    bma2 = new bma(false, (Integer) null, (Integer) null, bool, bool, (Boolean) null, (Integer) null, (Integer) null);
                } else {
                    bma2 = bma;
                }
                zla.D(context2, new afc((Object) new cma(isREDEnabledP2P, isREDEnabledServer, udpMarker, tcpMarker, rttMultCapMs, isEarlyAudioPlayoutEnabled, isEarlyAudioRecordingEnabled, isSkipRelayToNotRelayConnectionEnabled, isOpusDREDEnabled, bma2, isOpusDREDLowBitrateEnabled, bonusFieldTrials), (Object) logger), conversationFactoryInitParams.getPeerConnection().getLibraryLoader());
            }
        }
    }

    public void hangup(fe6 fe6, String str) {
        hangup(fe6, str, (String) null);
    }
}

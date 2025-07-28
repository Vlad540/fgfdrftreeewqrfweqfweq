package ru.ok.android.externcalls.sdk;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import ru.ok.android.externcalls.sdk.id.ParticipantId;
import ru.ok.android.externcalls.sdk.participant.collection.ParticipantStore;

public class CallUtil {
    static final xwb LOG = new xwb() {
        public /* bridge */ /* synthetic */ void log(String str, String str2) {
        }

        public /* bridge */ /* synthetic */ void logException(String str, String str2, Throwable th) {
        }

        public /* bridge */ /* synthetic */ void reportException(String str, String str2, Throwable th) {
        }
    };
    static final ywb LOG_CONFIGURATION = new ywb() {
        public /* bridge */ /* synthetic */ boolean shouldHideSensitiveInformation() {
            return false;
        }
    };

    public static List<String> collectOpponentExternalIds(ParticipantStore participantStore, ParticipantId participantId) {
        ArrayList arrayList = new ArrayList();
        Iterator<ConversationParticipant> it = participantStore.iterator();
        while (it.hasNext()) {
            ConversationParticipant next = it.next();
            if (next.getExternalId() != null && !next.getExternalId().equals(participantId)) {
                arrayList.add(next.getExternalId().id);
            }
        }
        return arrayList;
    }

    public static List<Long> collectOpponentInternalIds(ParticipantStore participantStore, ge1 ge1) {
        ArrayList arrayList = new ArrayList();
        Iterator<ConversationParticipant> it = participantStore.iterator();
        while (it.hasNext()) {
            ConversationParticipant next = it.next();
            if (next.getInternalId() != null && !next.getInternalId().equals(ge1)) {
                arrayList.add(Long.valueOf(next.getInternalId().a));
            }
        }
        return arrayList;
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [java.lang.Object, ce1] */
    public static ce1 createBitrates() {
        ? obj = new Object();
        obj.a = 204800;
        obj.b = 512000;
        obj.c = 2048000;
        obj.d = 2048000;
        obj.e = 16384;
        obj.f = 32768;
        obj.g = 65536;
        obj.h = 65536;
        return obj;
    }

    public static fe1 createCallParams(ConversationBuilder conversationBuilder) {
        ConversationBuilder conversationBuilder2 = conversationBuilder;
        ce1 ce1 = conversationBuilder2.bitrates;
        if (ce1 == null) {
            ce1 = createBitrates();
        }
        ce1 ce12 = ce1;
        de1 de1 = conversationBuilder2.experiments;
        ee1 ee1 = de1.f;
        if (ee1 == null) {
            ee1 = new ee1(conversationBuilder2.mediaReceivingTimeoutMs);
        }
        ee1 ee12 = ee1;
        mn mnVar = r2;
        mn mnVar2 = new mn(new xp0(conversationBuilder2.isMediaAdaptationFeatureEnabledForP2PCall, conversationBuilder2.ptpCallMediaAdaptationConfig), new xp0(conversationBuilder2.isMediaAdaptationFeatureEnabledForGroupCall, conversationBuilder2.groupCallMediaAdaptationConfig), false, 5);
        fe1 fe1 = r2;
        fe1 fe12 = new fe1(ce12, ee12, conversationBuilder2.dnsResolverEnabled, conversationBuilder2.isConsumerUpdateEnabled, conversationBuilder2.isOnDemandTracksEnabled, conversationBuilder2.enableLossRttBadConnectionHandling, conversationBuilder2.additionalWhitelistedCodecPrefixes, conversationBuilder2.isDataChannelScreenshareRecvEnabled, conversationBuilder2.isDataChannelScreenshareSendEnabled, conversationBuilder2.videoTracksCount, conversationBuilder2.fastRecoverEnabled, conversationBuilder2.sessionIdEnabled, conversationBuilder2.isWaitingRoomActivated, conversationBuilder2.isSignalingDefaultValuesFilteringEnabled, conversationBuilder2.isWebRTCCodecFilteringEnabled, conversationBuilder2.audioCodecs, conversationBuilder2.videoCodecs, conversationBuilder2.showLocalVideoInOriginalQuality, conversationBuilder2.isSessionRoomsFeatureEnabled, mnVar, conversationBuilder2.isAsrOnlineEnabled, de1, conversationBuilder2.isAudienceModeEnabled, conversationBuilder2.serverTopologySuspendBelowMinBitrate, conversationBuilder2.isFastScreenCaptureEnabled, conversationBuilder2.isDeviceAudioShareEnabled, conversationBuilder2.badNetworkIndicatorConfig);
        fe1 fe13 = fe1;
        fe13.c = true;
        return fe13;
    }
}

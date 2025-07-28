package ru.ok.android.externcalls.sdk;

import java.util.Collections;
import java.util.List;
import ru.ok.android.externcalls.sdk.id.IdMappingWrapper;
import ru.ok.android.externcalls.sdk.id.ParticipantId;
import ru.ok.android.externcalls.sdk.id.local.LocalIdMappings;
import ru.ok.android.externcalls.sdk.id.local.LocalParticipantId;
import ru.ok.android.externcalls.sdk.log.GlobalRTCLogger;

public class ConversationParticipant {
    private static final String LOG_TAG = "ConversationParticipant";
    private ke1 callParticipant;
    private ParticipantId externalId;
    private ge1 internalId;
    private final LocalParticipantId localParticipantId = LocalParticipantId.nextId();
    private boolean reported;

    private ConversationParticipant() {
    }

    public static ConversationParticipant fromExternal(ParticipantId participantId, IdMappingWrapper idMappingWrapper) {
        ConversationParticipant conversationParticipant = new ConversationParticipant();
        conversationParticipant.setExternalId(participantId);
        ge1 byExternal = idMappingWrapper.getByExternal(participantId);
        if (byExternal != null) {
            conversationParticipant.setInternalId(byExternal);
        }
        return conversationParticipant;
    }

    public static ConversationParticipant fromInternal(ge1 ge1, IdMappingWrapper idMappingWrapper) {
        ConversationParticipant conversationParticipant = new ConversationParticipant();
        conversationParticipant.setInternalId(ge1);
        ParticipantId byInternal = idMappingWrapper.getByInternal(ge1);
        if (byInternal != null) {
            conversationParticipant.setExternalId(byInternal);
        }
        return conversationParticipant;
    }

    public void deAnonymize(ke1 ke1, ParticipantId participantId, ParticipantId participantId2, LocalIdMappings localIdMappings) {
        this.externalId = participantId2;
        this.callParticipant = ke1;
        localIdMappings.deAnonymizeMapping(participantId, this);
    }

    public long getAcceptCallEpochMs() {
        ke1 ke1 = this.callParticipant;
        if (ke1 != null) {
            return ke1.m;
        }
        return 0;
    }

    public String getAcceptedCallClientType() {
        ke1 ke1 = this.callParticipant;
        if (ke1 == null) {
            return null;
        }
        return ke1.k;
    }

    public String getAcceptedCallPlatform() {
        ke1 ke1 = this.callParticipant;
        if (ke1 == null) {
            return null;
        }
        return ke1.l;
    }

    public k88 getAudioOptionState() {
        ke1 ke1 = this.callParticipant;
        return ke1 != null ? ke1.b.a : k88.a;
    }

    public ke1 getCallParticipant() {
        return this.callParticipant;
    }

    public ParticipantId getExternalId() {
        return this.externalId;
    }

    public ge1 getInternalId() {
        return this.internalId;
    }

    public LocalParticipantId getLocalParticipantId() {
        return this.localParticipantId;
    }

    public List<t69> getMovies() {
        ke1 ke1 = this.callParticipant;
        return ke1 == null ? Collections.emptyList() : ke1.q;
    }

    public xh9 getNetworkStatus() {
        ke1 ke1 = this.callParticipant;
        return ke1 == null ? xh9.a : ke1.i;
    }

    public k88 getScreenshareOptionState() {
        ke1 ke1 = this.callParticipant;
        return ke1 != null ? ke1.b.c : k88.a;
    }

    public k88 getVideoOptionState() {
        ke1 ke1 = this.callParticipant;
        return ke1 != null ? ke1.b.b : k88.a;
    }

    public k88 getWatchTogetherOptionState() {
        ke1 ke1 = this.callParticipant;
        return ke1 != null ? ke1.b.d : k88.a;
    }

    public boolean hasRegisteredPeers() {
        ke1 ke1 = this.callParticipant;
        return ke1 != null && (ke1.j != null || !ke1.f.isEmpty());
    }

    public boolean isAdmin() {
        ke1 ke1 = this.callParticipant;
        return ke1 != null && ke1.e.contains(je1.b);
    }

    public boolean isAnimojiEnabled() {
        ke1 ke1 = this.callParticipant;
        return ke1 != null && ke1.c.g;
    }

    public boolean isAudioEnabled() {
        ke1 ke1 = this.callParticipant;
        return ke1 != null && ke1.c.e;
    }

    public boolean isCallAccepted() {
        ke1 ke1 = this.callParticipant;
        return ke1 != null && ke1.b();
    }

    public boolean isConnected() {
        ke1 ke1 = this.callParticipant;
        return ke1 != null && ke1.g;
    }

    public boolean isCreator() {
        ke1 ke1 = this.callParticipant;
        return ke1 != null && ke1.e.contains(je1.a);
    }

    public boolean isPrimarySpeaker() {
        ke1 ke1 = this.callParticipant;
        return ke1 != null && ke1.c();
    }

    public boolean isReported() {
        return this.reported;
    }

    public boolean isScreenCaptureEnabled() {
        ke1 ke1 = this.callParticipant;
        return ke1 != null && ke1.c.b;
    }

    public boolean isTalking() {
        ke1 ke1 = this.callParticipant;
        return ke1 != null && ke1.d();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0006, code lost:
        r1 = r1.callParticipant;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean isUseable() {
        /*
            r1 = this;
            boolean r0 = r1.isReported()
            if (r0 == 0) goto L_0x0010
            ke1 r1 = r1.callParticipant
            if (r1 == 0) goto L_0x0010
            ge1 r1 = r1.a
            if (r1 == 0) goto L_0x0010
            r1 = 1
            goto L_0x0011
        L_0x0010:
            r1 = 0
        L_0x0011:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: ru.ok.android.externcalls.sdk.ConversationParticipant.isUseable():boolean");
    }

    public boolean isVideoEnabled() {
        ke1 ke1 = this.callParticipant;
        return ke1 != null && ke1.c.f;
    }

    public void setCallParticipant(ke1 ke1, LocalIdMappings localIdMappings) {
        this.callParticipant = ke1;
        if (ke1 != null) {
            this.internalId = ke1.a;
        }
        localIdMappings.addMappings(this);
    }

    public void setDeviceIndex(int i, LocalIdMappings localIdMappings) {
        ge1 ge1;
        GlobalRTCLogger globalRTCLogger = GlobalRTCLogger.INSTANCE;
        StringBuilder m = me4.m(i, "updateDeviceIndex ", " for ");
        m.append(this.externalId);
        GlobalRTCLogger.log(LOG_TAG, m.toString());
        if (this.externalId != null) {
            ParticipantId participantId = this.externalId;
            this.externalId = new ParticipantId(participantId.id, participantId.isAnon, i);
        }
        ge1 ge12 = this.internalId;
        if (ge12 != null) {
            this.internalId = new ge1(ge12.b, i, ge12.a);
        }
        ke1 ke1 = this.callParticipant;
        if (!(ke1 == null || (ge1 = ke1.a) == null)) {
            ke1.a = new ge1(ge1.b, i, ge1.a);
            y41 y41 = ke1.p;
            if (y41 != null) {
                ke1.p = new y41(y41.a, y41.b, i);
            }
        }
        localIdMappings.addMappings(this);
    }

    public void setExternalId(ParticipantId participantId) {
        this.externalId = participantId;
    }

    public void setInternalId(ge1 ge1) {
        this.internalId = ge1;
        ke1 ke1 = this.callParticipant;
        if (ke1 != null) {
            ke1.a = ge1;
        }
    }

    public void setReported(boolean z) {
        this.reported = z;
    }

    public String toString() {
        return this.externalId + "|" + this.internalId + "|" + this.callParticipant;
    }
}

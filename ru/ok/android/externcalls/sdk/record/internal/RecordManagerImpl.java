package ru.ok.android.externcalls.sdk.record.internal;

import java.util.Arrays;
import java.util.Calendar;
import java.util.Collections;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArraySet;
import kotlin.Metadata;
import org.json.JSONException;
import org.json.JSONObject;
import ru.ok.android.externcalls.sdk.ConversationParticipant;
import ru.ok.android.externcalls.sdk.events.RecordEventListener;
import ru.ok.android.externcalls.sdk.id.IdMappingWrapper;
import ru.ok.android.externcalls.sdk.id.ParticipantId;
import ru.ok.android.externcalls.sdk.id.mapping.IdMappingResolver;
import ru.ok.android.externcalls.sdk.participant.collection.ParticipantStore;
import ru.ok.android.externcalls.sdk.record.RecordDescription;
import ru.ok.android.externcalls.sdk.record.RecordDescriptionHistory;
import ru.ok.android.externcalls.sdk.record.RecordManager;
import ru.ok.android.externcalls.sdk.signaling.SignalingProvider;
import ru.ok.android.externcalls.sdk.signaling.SignalingProviderKt;

@Metadata(d1 = {"\u0000Ì\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0000\u0018\u0000 e2\u00020\u00012\u00020\u00022\u00020\u0003:\u0001eB7\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0010\u0010\u0011J\u001f\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0014\u001a\u00020\u0012H\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u0017\u0010\u001a\u001a\u00020\u00152\u0006\u0010\u0019\u001a\u00020\u0018H\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ\u0015\u0010\u001e\u001a\u0004\u0018\u00010\u001d*\u00020\u001cH\u0002¢\u0006\u0004\b\u001e\u0010\u001fJ1\u0010%\u001a\u00020\u00152\u000e\u0010\"\u001a\n\u0018\u00010 j\u0004\u0018\u0001`!2\u0006\u0010#\u001a\u00020\u00122\b\u0010$\u001a\u0004\u0018\u00010\u001dH\u0002¢\u0006\u0004\b%\u0010&J\u000f\u0010'\u001a\u00020\u0015H\u0002¢\u0006\u0004\b'\u0010(J\u001f\u0010*\u001a\u00020\u00152\u000e\u0010)\u001a\n\u0018\u00010 j\u0004\u0018\u0001`!H\u0002¢\u0006\u0004\b*\u0010+J\u0017\u0010.\u001a\u00020\u00152\u0006\u0010-\u001a\u00020,H\u0002¢\u0006\u0004\b.\u0010/J\u0017\u00101\u001a\u00020\u00152\u0006\u00100\u001a\u00020\u000eH\u0016¢\u0006\u0004\b1\u00102J\u0017\u00103\u001a\u00020\u00152\u0006\u00100\u001a\u00020\u000eH\u0016¢\u0006\u0004\b3\u00102J\u0017\u00106\u001a\u00020\u00152\u0006\u00105\u001a\u000204H\u0016¢\u0006\u0004\b6\u00107J=\u0010>\u001a\u00020\u00152\u0006\u00105\u001a\u0002082\u000e\u0010:\u001a\n\u0012\u0004\u0012\u00020\u0015\u0018\u0001092\u0014\u0010=\u001a\u0010\u0012\u0004\u0012\u00020<\u0012\u0004\u0012\u00020\u0015\u0018\u00010;H\u0016¢\u0006\u0004\b>\u0010?J=\u0010A\u001a\u00020\u00152\u0006\u00105\u001a\u00020@2\u000e\u0010:\u001a\n\u0012\u0004\u0012\u00020\u0015\u0018\u0001092\u0014\u0010=\u001a\u0010\u0012\u0004\u0012\u00020<\u0012\u0004\u0012\u00020\u0015\u0018\u00010;H\u0016¢\u0006\u0004\bA\u0010BJ\u0011\u0010C\u001a\u0004\u0018\u00010\u001dH\u0016¢\u0006\u0004\bC\u0010DJ\u001b\u0010G\u001a\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020F0EH\u0016¢\u0006\u0004\bG\u0010HJ\u0015\u0010I\u001a\n\u0018\u00010 j\u0004\u0018\u0001`!¢\u0006\u0004\bI\u0010JJ\u0017\u0010K\u001a\u00020\u00152\u0006\u0010\u0019\u001a\u00020\u0018H\u0016¢\u0006\u0004\bK\u0010\u001bJ\u0017\u0010M\u001a\u00020\u00152\u0006\u0010\u0019\u001a\u00020LH\u0016¢\u0006\u0004\bM\u0010NJ\u0017\u0010P\u001a\u00020\u00152\u0006\u0010\u0019\u001a\u00020OH\u0016¢\u0006\u0004\bP\u0010QR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010RR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010SR\u0014\u0010\t\u001a\u00020\b8\u0002X\u0004¢\u0006\u0006\n\u0004\b\t\u0010TR\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010UR\u0014\u0010\r\u001a\u00020\f8\u0002X\u0004¢\u0006\u0006\n\u0004\b\r\u0010VR\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010WR\u0014\u0010Y\u001a\u00020X8\u0002X\u0004¢\u0006\u0006\n\u0004\bY\u0010ZR\u001a\u0010\\\u001a\b\u0012\u0004\u0012\u00020\u000e0[8\u0002X\u0004¢\u0006\u0006\n\u0004\b\\\u0010]R0\u0010`\u001a\u001e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u001d0^j\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u001d`_8\u0002X\u0004¢\u0006\u0006\n\u0004\b`\u0010aR0\u0010b\u001a\u001e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020F0^j\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020F`_8\u0002X\u0004¢\u0006\u0006\n\u0004\bb\u0010aR\u0016\u0010c\u001a\u00020\u00128\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\bc\u0010d¨\u0006f"}, d2 = {"Lru/ok/android/externcalls/sdk/record/internal/RecordManagerImpl;", "Lru/ok/android/externcalls/sdk/record/RecordManager;", "Lnj1;", "Lvf1;", "Lxwb;", "logger", "Lru/ok/android/externcalls/sdk/participant/collection/ParticipantStore;", "participantStore", "Lru/ok/android/externcalls/sdk/id/mapping/IdMappingResolver;", "idMappingResolver", "Lru/ok/android/externcalls/sdk/id/IdMappingWrapper;", "idMappingWrapper", "Lru/ok/android/externcalls/sdk/signaling/SignalingProvider;", "signalingProvider", "Lru/ok/android/externcalls/sdk/events/RecordEventListener;", "deprecatedRecordListener", "<init>", "(Lxwb;Lru/ok/android/externcalls/sdk/participant/collection/ParticipantStore;Lru/ok/android/externcalls/sdk/id/mapping/IdMappingResolver;Lru/ok/android/externcalls/sdk/id/IdMappingWrapper;Lru/ok/android/externcalls/sdk/signaling/SignalingProvider;Lru/ok/android/externcalls/sdk/events/RecordEventListener;)V", "Lw2d;", "oldRoomId", "newRoomId", "Ljue;", "notifyListenersWhenActiveRoomChanged", "(Lw2d;Lw2d;)V", "Ltf1;", "info", "applyRecordStarted", "(Ltf1;)V", "Lrf1;", "Lru/ok/android/externcalls/sdk/record/RecordDescription;", "toRecordDescription", "(Lrf1;)Lru/ok/android/externcalls/sdk/record/RecordDescription;", "Lru/ok/android/externcalls/sdk/id/ParticipantId;", "Lru/ok/android/externcalls/sdk/id/ExternalId;", "initiatorId", "sessionRoomId", "current", "setMyRecordHistory", "(Lru/ok/android/externcalls/sdk/id/ParticipantId;Lw2d;Lru/ok/android/externcalls/sdk/record/RecordDescription;)V", "reportStarted", "()V", "whoStoppedRecordId", "reportStopped", "(Lru/ok/android/externcalls/sdk/id/ParticipantId;)V", "", "description", "reportError", "(Ljava/lang/String;)V", "listener", "addRecordListener", "(Lru/ok/android/externcalls/sdk/events/RecordEventListener;)V", "removeRecordListener", "Ljj1;", "params", "onCurrentParticipantActiveRoomChanged", "(Ljj1;)V", "Lru/ok/android/externcalls/sdk/record/RecordManager$StartParams;", "Lkotlin/Function0;", "onSuccess", "Lkotlin/Function1;", "", "onError", "startRecord", "(Lru/ok/android/externcalls/sdk/record/RecordManager$StartParams;Ls16;Lu16;)V", "Lru/ok/android/externcalls/sdk/record/RecordManager$StopParams;", "stopRecord", "(Lru/ok/android/externcalls/sdk/record/RecordManager$StopParams;Ls16;Lu16;)V", "getRecordDescription", "()Lru/ok/android/externcalls/sdk/record/RecordDescription;", "", "Lru/ok/android/externcalls/sdk/record/RecordDescriptionHistory;", "getRecordDescriptionHistory", "()Ljava/util/Map;", "getRecordAdmin", "()Lru/ok/android/externcalls/sdk/id/ParticipantId;", "onRecordStarted", "Luf1;", "onRecordStopped", "(Luf1;)V", "Lsf1;", "onRecordError", "(Lsf1;)V", "Lxwb;", "Lru/ok/android/externcalls/sdk/participant/collection/ParticipantStore;", "Lru/ok/android/externcalls/sdk/id/mapping/IdMappingResolver;", "Lru/ok/android/externcalls/sdk/id/IdMappingWrapper;", "Lru/ok/android/externcalls/sdk/signaling/SignalingProvider;", "Lru/ok/android/externcalls/sdk/events/RecordEventListener;", "Ly2c;", "commandParamsCreator", "Ly2c;", "Ljava/util/concurrent/CopyOnWriteArraySet;", "listeners", "Ljava/util/concurrent/CopyOnWriteArraySet;", "Ljava/util/HashMap;", "Lkotlin/collections/HashMap;", "sessionRoomToRecordInfo", "Ljava/util/HashMap;", "sessionRoomToRecordInfoHistory", "activeRoomId", "Lw2d;", "Companion", "calls-sdk_release"}, k = 1, mv = {1, 9, 0})
public final class RecordManagerImpl implements RecordManager, nj1, vf1 {
    private static final Companion Companion = new Companion((x54) null);
    private static final String LOG_TAG = "RecordManagerImpl";
    private w2d activeRoomId = u2d.a;
    private final y2c commandParamsCreator = new Object();
    private final RecordEventListener deprecatedRecordListener;
    private final IdMappingResolver idMappingResolver;
    private final IdMappingWrapper idMappingWrapper;
    private final CopyOnWriteArraySet<RecordEventListener> listeners = new CopyOnWriteArraySet<>();
    private final xwb logger;
    private final ParticipantStore participantStore;
    private final HashMap<w2d, RecordDescription> sessionRoomToRecordInfo = new HashMap<>();
    private final HashMap<w2d, RecordDescriptionHistory> sessionRoomToRecordInfoHistory = new HashMap<>();
    private final SignalingProvider signalingProvider;

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lru/ok/android/externcalls/sdk/record/internal/RecordManagerImpl$Companion;", "", "()V", "LOG_TAG", "", "calls-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(x54 x54) {
            this();
        }
    }

    /* JADX WARNING: type inference failed for: r1v1, types: [java.lang.Object, y2c] */
    public RecordManagerImpl(xwb xwb, ParticipantStore participantStore2, IdMappingResolver idMappingResolver2, IdMappingWrapper idMappingWrapper2, SignalingProvider signalingProvider2, RecordEventListener recordEventListener) {
        this.logger = xwb;
        this.participantStore = participantStore2;
        this.idMappingResolver = idMappingResolver2;
        this.idMappingWrapper = idMappingWrapper2;
        this.signalingProvider = signalingProvider2;
        this.deprecatedRecordListener = recordEventListener;
    }

    private final void applyRecordStarted(tf1 tf1) {
        RecordDescription recordDescription = toRecordDescription(tf1.b);
        if (recordDescription != null) {
            ParticipantId initiator = recordDescription.getInitiator();
            w2d w2d = tf1.a;
            setMyRecordHistory(initiator, w2d, recordDescription);
            this.sessionRoomToRecordInfo.put(w2d, recordDescription);
            if (hhd.f(w2d, this.activeRoomId)) {
                reportStarted();
            }
        }
    }

    private final void notifyListenersWhenActiveRoomChanged(w2d w2d, w2d w2d2) {
        if (this.sessionRoomToRecordInfo.get(w2d) != null) {
            RecordDescription recordDescription = this.sessionRoomToRecordInfo.get(w2d);
            reportStopped(recordDescription != null ? recordDescription.getInitiator() : null);
        }
        if (this.sessionRoomToRecordInfo.get(w2d2) != null) {
            reportStarted();
        }
    }

    /* access modifiers changed from: private */
    public static final void onRecordStarted$lambda$4(RecordManagerImpl recordManagerImpl, tf1 tf1) {
        recordManagerImpl.applyRecordStarted(tf1);
    }

    /* access modifiers changed from: private */
    public static final void onRecordStarted$lambda$5(RecordManagerImpl recordManagerImpl) {
        recordManagerImpl.logger.log(LOG_TAG, "Can't resolve internal id");
    }

    private final void reportError(String str) {
        this.deprecatedRecordListener.onRecordError(str);
        for (RecordEventListener onRecordError : this.listeners) {
            onRecordError.onRecordError(str);
        }
    }

    private final void reportStarted() {
        this.deprecatedRecordListener.onRecordStarted();
        for (RecordEventListener onRecordStarted : this.listeners) {
            onRecordStarted.onRecordStarted();
        }
    }

    private final void reportStopped(ParticipantId participantId) {
        ConversationParticipant byExternal = participantId != null ? this.participantStore.getByExternal(participantId) : null;
        this.deprecatedRecordListener.onRecordStopped(byExternal);
        for (RecordEventListener onRecordStopped : this.listeners) {
            onRecordStopped.onRecordStopped(byExternal);
        }
    }

    private final void setMyRecordHistory(ParticipantId participantId, w2d w2d, RecordDescription recordDescription) {
        ConversationParticipant me = this.participantStore.getMe();
        RecordDescription recordDescription2 = null;
        if (hhd.f(participantId, me != null ? me.getExternalId() : null)) {
            HashMap<w2d, RecordDescriptionHistory> hashMap = this.sessionRoomToRecordInfoHistory;
            RecordDescriptionHistory recordDescriptionHistory = hashMap.get(w2d);
            if (recordDescriptionHistory != null) {
                recordDescription2 = recordDescriptionHistory.getCurrentState();
            }
            hashMap.put(w2d, new RecordDescriptionHistory(recordDescription, recordDescription2));
        }
    }

    /* access modifiers changed from: private */
    public static final void startRecord$lambda$0(s16 s16, JSONObject jSONObject) {
        if (s16 != null) {
            s16.invoke();
        }
    }

    /* access modifiers changed from: private */
    public static final void startRecord$lambda$1(RecordManagerImpl recordManagerImpl, u16 u16, JSONObject jSONObject) {
        if ("error".equals(jSONObject.optString("type"))) {
            recordManagerImpl.reportError(jSONObject.optString("message"));
        }
        if (u16 != null) {
            u16.invoke(new RuntimeException("Can't start record " + jSONObject));
        }
    }

    /* access modifiers changed from: private */
    public static final void stopRecord$lambda$2(s16 s16, JSONObject jSONObject) {
        if (s16 != null) {
            s16.invoke();
        }
    }

    /* access modifiers changed from: private */
    public static final void stopRecord$lambda$3(RecordManagerImpl recordManagerImpl, u16 u16, JSONObject jSONObject) {
        if ("error".equals(jSONObject.optString("type"))) {
            recordManagerImpl.reportError(jSONObject.optString("message"));
        }
        if (u16 != null) {
            u16.invoke(new RuntimeException("Can't stop record " + jSONObject));
        }
    }

    private final RecordDescription toRecordDescription(rf1 rf1) {
        ParticipantId byInternal;
        ConversationParticipant byInternal2 = this.participantStore.getByInternal(rf1.c);
        if ((byInternal2 == null || (byInternal = byInternal2.getExternalId()) == null) && (byInternal = this.idMappingWrapper.getByInternal(rf1.c)) == null) {
            return null;
        }
        return new RecordDescription(byInternal, rf1.b, rf1.d, rf1.a, rf1.e, rf1.f);
    }

    public void addRecordListener(RecordEventListener recordEventListener) {
        this.listeners.add(recordEventListener);
    }

    public final ParticipantId getRecordAdmin() {
        RecordDescription recordDescription = this.sessionRoomToRecordInfo.get(this.activeRoomId);
        if (recordDescription != null) {
            return recordDescription.getInitiator();
        }
        return null;
    }

    public RecordDescription getRecordDescription() {
        return this.sessionRoomToRecordInfo.get(this.activeRoomId);
    }

    public Map<w2d, RecordDescriptionHistory> getRecordDescriptionHistory() {
        return this.sessionRoomToRecordInfoHistory;
    }

    public void onCurrentParticipantActiveRoomChanged(jj1 jj1) {
        w2d w2d = this.activeRoomId;
        w2d w2d2 = jj1.a;
        if (!hhd.f(w2d2, w2d)) {
            w2d w2d3 = this.activeRoomId;
            this.activeRoomId = w2d2;
            notifyListenersWhenActiveRoomChanged(w2d3, w2d2);
        }
    }

    public /* bridge */ /* synthetic */ void onCurrentParticipantInvitedToRoom(kj1 kj1) {
    }

    public void onRecordError(sf1 sf1) {
        reportError(sf1.a);
    }

    public void onRecordStarted(tf1 tf1) {
        ParticipantStore participantStore2 = this.participantStore;
        rf1 rf1 = tf1.b;
        if (participantStore2.getByInternal(rf1.c) != null) {
            applyRecordStarted(tf1);
        } else {
            this.idMappingResolver.resolveExternalsByInternalsIds(Collections.singletonList(rf1.c), new hg9(this, 27, tf1), new pzb(1, this));
        }
    }

    public void onRecordStopped(uf1 uf1) {
        HashMap<w2d, RecordDescription> hashMap = this.sessionRoomToRecordInfo;
        w2d w2d = uf1.a;
        RecordDescription recordDescription = hashMap.get(w2d);
        ParticipantId participantId = null;
        setMyRecordHistory(recordDescription != null ? recordDescription.getInitiator() : null, w2d, (RecordDescription) null);
        this.sessionRoomToRecordInfo.remove(w2d);
        if (hhd.f(w2d, this.activeRoomId)) {
            ge1 ge1 = uf1.b;
            ConversationParticipant byInternal = ge1 != null ? this.participantStore.getByInternal(ge1) : null;
            if (byInternal != null) {
                participantId = byInternal.getExternalId();
            }
            reportStopped(participantId);
        }
    }

    public /* bridge */ /* synthetic */ void onRoomRemoved(lj1 lj1) {
    }

    public /* bridge */ /* synthetic */ void onRoomUpdated(mj1 mj1) {
    }

    public void removeRecordListener(RecordEventListener recordEventListener) {
        this.listeners.remove(recordEventListener);
    }

    public void startRecord(RecordManager.StartParams startParams, s16 s16, u16 u16) {
        u16 u162 = u16;
        mfd mfd = SignalingProviderKt.get(this.signalingProvider, u162);
        if (mfd != null) {
            y2c y2c = this.commandParamsCreator;
            boolean isStream = startParams.isStream();
            Long movieId = startParams.getMovieId();
            w2d sessionRoomId = startParams.getSessionRoomId();
            if (sessionRoomId == null) {
                sessionRoomId = this.activeRoomId;
            }
            Long groupId = startParams.getGroupId();
            Object name = startParams.getName();
            CharSequence description = startParams.getDescription();
            String privacy = startParams.getPrivacy();
            String albumId = startParams.getAlbumId();
            y2c.getClass();
            Calendar instance = Calendar.getInstance();
            if (name == null) {
                name = String.format(Locale.getDefault(), "%4d-%2d-%2d %2d:%2d:%2d", Arrays.copyOf(new Object[]{Integer.valueOf(instance.get(1)), Integer.valueOf(instance.get(2) + 1), Integer.valueOf(instance.get(5)), Integer.valueOf(instance.get(11)), Integer.valueOf(instance.get(12)), Integer.valueOf(instance.get(13))}, 6));
            }
            try {
                x66 d = x87.d(new JSONObject().put("movieId", (Object) movieId).put("name", name).put("description", (Object) description).put("privacy", (Object) privacy).put("groupId", (Object) groupId).put("albumId", (Object) albumId).put("streamMovie", isStream), "record-start");
                if (sessionRoomId instanceof v2d) {
                    d.b(((v2d) sessionRoomId).a, "roomId");
                }
                mfd.d(d, false, new ps(9, s16), new l5c(this, u162, 1));
            } catch (JSONException e) {
                throw new RuntimeException(e);
            }
        }
    }

    public void stopRecord(RecordManager.StopParams stopParams, s16 s16, u16 u16) {
        mfd mfd = SignalingProviderKt.get(this.signalingProvider, u16);
        if (mfd != null) {
            y2c y2c = this.commandParamsCreator;
            w2d sessionRoomId = stopParams.getSessionRoomId();
            if (sessionRoomId == null) {
                sessionRoomId = this.activeRoomId;
            }
            boolean removeRecord = stopParams.getRemoveRecord();
            y2c.getClass();
            x66 d = x87.d((JSONObject) null, "record-stop");
            JSONObject jSONObject = d.a;
            jSONObject.put("command", (Object) "record-stop");
            if (sessionRoomId instanceof v2d) {
                d.b(((v2d) sessionRoomId).a, "roomId");
            }
            if (removeRecord) {
                jSONObject.put("remove", removeRecord);
            }
            mfd.d(d, false, new ps(8, s16), new l5c(this, u16, 0));
        }
    }
}

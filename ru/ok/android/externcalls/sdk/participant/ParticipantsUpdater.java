package ru.ok.android.externcalls.sdk.participant;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.Metadata;
import ru.ok.android.externcalls.sdk.ConversationParticipant;
import ru.ok.android.externcalls.sdk.ConversationParticipantExtensionsKt;
import ru.ok.android.externcalls.sdk.events.ConversationEventsListener;
import ru.ok.android.externcalls.sdk.id.CallExternalIdConverter;
import ru.ok.android.externcalls.sdk.id.IdMappingWrapper;
import ru.ok.android.externcalls.sdk.id.ParticipantId;
import ru.ok.android.externcalls.sdk.id.local.LocalIdMappings;
import ru.ok.android.externcalls.sdk.participant.collection.ParticipantStore;
import ru.ok.android.externcalls.sdk.participant.state.internal.ParticipantStatesManagerImpl;

@Metadata(d1 = {"\u0000°\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\r\b\u0000\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003:\u0002GHBG\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\u0006\u0010\u0013\u001a\u00020\u0012¢\u0006\u0004\b\u0014\u0010\u0015J\u0017\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u0017\u001a\u00020\u0016H\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ\u0017\u0010\u001c\u001a\u00020\u00182\u0006\u0010\u0017\u001a\u00020\u001bH\u0016¢\u0006\u0004\b\u001c\u0010\u001dJ\u0017\u0010\u001f\u001a\u00020\u00182\u0006\u0010\u0017\u001a\u00020\u001eH\u0016¢\u0006\u0004\b\u001f\u0010 J\u0017\u0010\"\u001a\u00020\u00182\u0006\u0010\u0017\u001a\u00020!H\u0016¢\u0006\u0004\b\"\u0010#J\u0017\u0010%\u001a\u00020\u00182\u0006\u0010\u0017\u001a\u00020$H\u0016¢\u0006\u0004\b%\u0010&J\u0017\u0010(\u001a\u00020\u00182\u0006\u0010\u0017\u001a\u00020'H\u0016¢\u0006\u0004\b(\u0010)J\u0017\u0010+\u001a\u00020\u00182\u0006\u0010\u0017\u001a\u00020*H\u0016¢\u0006\u0004\b+\u0010,J\u0017\u0010.\u001a\u00020\u00182\u0006\u0010\u0017\u001a\u00020-H\u0016¢\u0006\u0004\b.\u0010/J\u0017\u00101\u001a\u00020\u00182\u0006\u0010\u0017\u001a\u000200H\u0016¢\u0006\u0004\b1\u00102J\u0017\u00104\u001a\u00020\u00182\u0006\u0010\u0017\u001a\u000203H\u0016¢\u0006\u0004\b4\u00105J\u0017\u00107\u001a\u00020\u00182\u0006\u0010\u0017\u001a\u000206H\u0016¢\u0006\u0004\b7\u00108J\u0017\u0010:\u001a\u00020\u00182\u0006\u0010\u0017\u001a\u000209H\u0016¢\u0006\u0004\b:\u0010;J\u0017\u0010=\u001a\u00020\u00182\u0006\u0010\u0017\u001a\u00020<H\u0016¢\u0006\u0004\b=\u0010>R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010?R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010@R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0004¢\u0006\u0006\n\u0004\b\t\u0010AR\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010BR\u0014\u0010\r\u001a\u00020\f8\u0002X\u0004¢\u0006\u0006\n\u0004\b\r\u0010CR\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010DR\u0014\u0010\u0011\u001a\u00020\u00108\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010ER\u0014\u0010\u0013\u001a\u00020\u00128\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010F¨\u0006I"}, d2 = {"Lru/ok/android/externcalls/sdk/participant/ParticipantsUpdater;", "Lqx0;", "Lue1;", "Lnj1;", "Lru/ok/android/externcalls/sdk/events/ConversationEventsListener;", "listener", "Lru/ok/android/externcalls/sdk/participant/collection/ParticipantStore;", "store", "Lru/ok/android/externcalls/sdk/participant/state/internal/ParticipantStatesManagerImpl;", "statesManager", "Lru/ok/android/externcalls/sdk/id/IdMappingWrapper;", "idMappingWrapper", "Lru/ok/android/externcalls/sdk/id/local/LocalIdMappings;", "localIdMappings", "Lru/ok/android/externcalls/sdk/participant/ParticipantsUpdater$MappingUpdater;", "mappingUpdater", "Lru/ok/android/externcalls/sdk/participant/ParticipantsUpdater$MeChanger;", "meChanger", "Lfe1;", "callParams", "<init>", "(Lru/ok/android/externcalls/sdk/events/ConversationEventsListener;Lru/ok/android/externcalls/sdk/participant/collection/ParticipantStore;Lru/ok/android/externcalls/sdk/participant/state/internal/ParticipantStatesManagerImpl;Lru/ok/android/externcalls/sdk/id/IdMappingWrapper;Lru/ok/android/externcalls/sdk/id/local/LocalIdMappings;Lru/ok/android/externcalls/sdk/participant/ParticipantsUpdater$MappingUpdater;Lru/ok/android/externcalls/sdk/participant/ParticipantsUpdater$MeChanger;Lfe1;)V", "Lqe1;", "params", "Ljue;", "onCallParticipantsAdded", "(Lqe1;)V", "Llx0;", "onActiveParticipantsAdded", "(Llx0;)V", "Lre1;", "onCallParticipantsChanged", "(Lre1;)V", "Lmx0;", "onActiveParticipantsChanged", "(Lmx0;)V", "Lse1;", "onCallParticipantsDeAnonimized", "(Lse1;)V", "Lnx0;", "onActiveParticipantsDeAnonimized", "(Lnx0;)V", "Lte1;", "onCallParticipantsRemoved", "(Lte1;)V", "Lox0;", "onActiveParticipantsRemoved", "(Lox0;)V", "Lpx0;", "onActiveParticipantUpdated", "(Lpx0;)V", "Ljj1;", "onCurrentParticipantActiveRoomChanged", "(Ljj1;)V", "Lmj1;", "onRoomUpdated", "(Lmj1;)V", "Lkj1;", "onCurrentParticipantInvitedToRoom", "(Lkj1;)V", "Llj1;", "onRoomRemoved", "(Llj1;)V", "Lru/ok/android/externcalls/sdk/events/ConversationEventsListener;", "Lru/ok/android/externcalls/sdk/participant/collection/ParticipantStore;", "Lru/ok/android/externcalls/sdk/participant/state/internal/ParticipantStatesManagerImpl;", "Lru/ok/android/externcalls/sdk/id/IdMappingWrapper;", "Lru/ok/android/externcalls/sdk/id/local/LocalIdMappings;", "Lru/ok/android/externcalls/sdk/participant/ParticipantsUpdater$MappingUpdater;", "Lru/ok/android/externcalls/sdk/participant/ParticipantsUpdater$MeChanger;", "Lfe1;", "MappingUpdater", "MeChanger", "calls-sdk_release"}, k = 1, mv = {1, 9, 0})
public final class ParticipantsUpdater implements qx0, ue1, nj1 {
    private final fe1 callParams;
    private final IdMappingWrapper idMappingWrapper;
    private final ConversationEventsListener listener;
    private final LocalIdMappings localIdMappings;
    private final MappingUpdater mappingUpdater;
    private final MeChanger meChanger;
    private final ParticipantStatesManagerImpl statesManager;
    private final ParticipantStore store;

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0005\u001a\u00020\u0002H&¢\u0006\u0004\b\u0005\u0010\u0004ø\u0001\u0000\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0006À\u0006\u0001"}, d2 = {"Lru/ok/android/externcalls/sdk/participant/ParticipantsUpdater$MappingUpdater;", "", "Ljue;", "triggerMapUpdate", "()V", "reportIfApplicable", "calls-sdk_release"}, k = 1, mv = {1, 9, 0})
    public interface MappingUpdater {
        void reportIfApplicable();

        void triggerMapUpdate();
    }

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u001b\u0010\u0006\u001a\u00020\u00052\n\u0010\u0004\u001a\u00060\u0002j\u0002`\u0003H&¢\u0006\u0004\b\u0006\u0010\u0007ø\u0001\u0000\u0002\u0006\n\u0004\b!0\u0001¨\u0006\bÀ\u0006\u0001"}, d2 = {"Lru/ok/android/externcalls/sdk/participant/ParticipantsUpdater$MeChanger;", "", "Lru/ok/android/externcalls/sdk/id/ParticipantId;", "Lru/ok/android/externcalls/sdk/id/ExternalId;", "participantExternalId", "Ljue;", "updateMyExternalId", "(Lru/ok/android/externcalls/sdk/id/ParticipantId;)V", "calls-sdk_release"}, k = 1, mv = {1, 9, 0})
    public interface MeChanger {
        void updateMyExternalId(ParticipantId participantId);
    }

    public ParticipantsUpdater(ConversationEventsListener conversationEventsListener, ParticipantStore participantStore, ParticipantStatesManagerImpl participantStatesManagerImpl, IdMappingWrapper idMappingWrapper2, LocalIdMappings localIdMappings2, MappingUpdater mappingUpdater2, MeChanger meChanger2, fe1 fe1) {
        this.listener = conversationEventsListener;
        this.store = participantStore;
        this.statesManager = participantStatesManagerImpl;
        this.idMappingWrapper = idMappingWrapper2;
        this.localIdMappings = localIdMappings2;
        this.mappingUpdater = mappingUpdater2;
        this.meChanger = meChanger2;
        this.callParams = fe1;
    }

    public void onActiveParticipantUpdated(px0 px0) {
        this.store.setActiveSessionRoom(px0.c, px0.d);
        ConversationEventsListener conversationEventsListener = this.listener;
        Collection collection = px0.b;
        if (!(collection instanceof z67) || (collection instanceof a77)) {
            conversationEventsListener.onParticipantsUpdated(collection);
        } else {
            ete.b0(collection, "kotlin.collections.MutableCollection");
            throw null;
        }
    }

    public void onActiveParticipantsAdded(lx0 lx0) {
    }

    public void onActiveParticipantsChanged(mx0 mx0) {
    }

    public void onActiveParticipantsDeAnonimized(nx0 nx0) {
    }

    public void onActiveParticipantsRemoved(ox0 ox0) {
    }

    public void onCallParticipantsAdded(qe1 qe1) {
        List<ke1> list = qe1.b;
        ArrayList arrayList = new ArrayList(list.size());
        for (ke1 ke1 : list) {
            ParticipantStore participantStore = this.store;
            ge1 ge1 = ke1.a;
            if (ge1 != null) {
                ConversationParticipant byInternal = participantStore.getByInternal(ge1);
                ParticipantId convert = CallExternalIdConverter.convert(ke1.p);
                if (convert != null) {
                    this.idMappingWrapper.addMapping(convert, ke1.a);
                    if (byInternal == null) {
                        byInternal = this.store.getParticipantById(convert);
                    }
                }
                arrayList.add(byInternal);
            }
        }
        boolean z = false;
        int i = 0;
        boolean z2 = false;
        for (Object next : list) {
            int i2 = i + 1;
            if (i >= 0) {
                ke1 ke12 = (ke1) next;
                ConversationParticipant conversationParticipant = (ConversationParticipant) arrayList.get(i);
                if (conversationParticipant == null) {
                    ge1 ge12 = ke12.a;
                    if (ge12 != null) {
                        ConversationParticipant createConversationParticipantFromInternal = ConversationParticipantExtensionsKt.createConversationParticipantFromInternal(ge12, this.idMappingWrapper);
                        ConversationParticipantExtensionsKt.setCallParticipantExt(createConversationParticipantFromInternal, ke12, this.localIdMappings);
                        this.store.add(createConversationParticipantFromInternal, qe1.a);
                        z = true;
                    }
                } else {
                    if (conversationParticipant.getCallParticipant() == null) {
                        ConversationParticipantExtensionsKt.setCallParticipantExt(conversationParticipant, ke12, this.localIdMappings);
                    }
                    z2 = true;
                }
                i = i2;
            } else {
                p23.G();
                throw null;
            }
        }
        if (z) {
            this.mappingUpdater.triggerMapUpdate();
        }
        if (z2) {
            this.mappingUpdater.reportIfApplicable();
        }
    }

    public void onCallParticipantsChanged(re1 re1) {
        ParticipantId convert;
        ConversationParticipant participantById;
        ArrayList arrayList = new ArrayList();
        for (ke1 ke1 : re1.a) {
            ParticipantStore participantStore = this.store;
            ge1 ge1 = ke1.a;
            if (ge1 != null) {
                ConversationParticipant byInternal = participantStore.getByInternal(ge1);
                if (byInternal != null) {
                    if (byInternal.getCallParticipant() == null) {
                        ConversationParticipantExtensionsKt.setCallParticipantExt(byInternal, ke1, this.localIdMappings);
                    }
                    if (ConversationParticipantExtensionsKt.isReportedExt(byInternal)) {
                        arrayList.add(byInternal);
                    }
                } else if (!(!this.callParams.B.j || (convert = CallExternalIdConverter.convert(ke1.p)) == null || (participantById = this.store.getParticipantById(convert)) == null)) {
                    ConversationParticipantExtensionsKt.setCallParticipantExt(participantById, ke1, this.localIdMappings);
                }
            }
        }
        if (!arrayList.isEmpty()) {
            this.listener.onParticipantsChanged(arrayList);
        }
    }

    public void onCallParticipantsDeAnonimized(se1 se1) {
        ArrayList arrayList = new ArrayList();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (ke1 ke1 : se1.a) {
            ParticipantStore participantStore = this.store;
            ge1 ge1 = ke1.a;
            if (ge1 != null) {
                ConversationParticipant byInternal = participantStore.getByInternal(ge1);
                y41 y41 = ke1.p;
                if (!(byInternal == null || y41 == null)) {
                    if (!hhd.f(y41.a, byInternal.getExternalId().id)) {
                        ParticipantId externalId = byInternal.getExternalId();
                        ParticipantId convert = CallExternalIdConverter.convert(y41);
                        if (convert != null) {
                            ConversationParticipantExtensionsKt.deAnonymizeExt(byInternal, ke1, externalId, convert, this.localIdMappings);
                            ge1 ge12 = ke1.a;
                            ConversationParticipant me = this.store.getMe();
                            if (hhd.f(ge12, me != null ? me.getInternalId() : null)) {
                                this.meChanger.updateMyExternalId(convert);
                            }
                            if (ConversationParticipantExtensionsKt.isReportedExt(byInternal)) {
                                arrayList.add(byInternal);
                                linkedHashMap.put(convert, externalId);
                            }
                        }
                    }
                }
            }
        }
        if (!arrayList.isEmpty()) {
            this.listener.onParticipantsDeAnonymized(arrayList, linkedHashMap);
        }
    }

    public void onCallParticipantsRemoved(te1 te1) {
        ConversationParticipant byInternal;
        ArrayList arrayList = new ArrayList();
        HashSet hashSet = new HashSet();
        for (ke1 ke1 : te1.a) {
            ge1 ge1 = ke1.a;
            if (!(ge1 == null || (byInternal = this.store.getByInternal(ge1)) == null)) {
                if (byInternal.getCallParticipant() == null) {
                    ConversationParticipantExtensionsKt.setCallParticipantExt(byInternal, ke1, this.localIdMappings);
                }
                hashSet.add(ge1);
                if (ConversationParticipantExtensionsKt.isReportedExt(byInternal)) {
                    arrayList.add(byInternal);
                }
            }
        }
        this.store.removeByInternal((Collection<ge1>) hashSet);
        if (!arrayList.isEmpty()) {
            this.statesManager.onParticipantsRemoved(arrayList);
            this.listener.onParticipantsRemoved(arrayList);
        }
    }

    public void onCurrentParticipantActiveRoomChanged(jj1 jj1) {
        this.store.setActiveSessionRoom(jj1.a, jj1.b);
        this.mappingUpdater.reportIfApplicable();
    }

    public void onCurrentParticipantInvitedToRoom(kj1 kj1) {
        this.store.setProposedSessionRoom(kj1.b, kj1.c);
    }

    public void onRoomRemoved(lj1 lj1) {
        w2d proposedRoomId = this.store.getProposedRoomId();
        w2d w2d = lj1.a;
        boolean f = hhd.f(proposedRoomId, w2d);
        u2d u2d = u2d.a;
        if (f) {
            this.store.setProposedSessionRoom(u2d, (q2d) null);
        }
        if (hhd.f(this.store.getActiveRoomId(), w2d)) {
            this.store.setActiveSessionRoom(u2d, (q2d) null);
        }
    }

    public void onRoomUpdated(mj1 mj1) {
        this.store.maybeUpdateRoom(mj1.b);
    }
}

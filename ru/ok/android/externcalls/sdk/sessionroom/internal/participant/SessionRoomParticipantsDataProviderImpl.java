package ru.ok.android.externcalls.sdk.sessionroom.internal.participant;

import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import ru.ok.android.externcalls.sdk.ConversationParticipant;
import ru.ok.android.externcalls.sdk.id.IdMappingWrapper;
import ru.ok.android.externcalls.sdk.id.ParticipantId;
import ru.ok.android.externcalls.sdk.id.mapping.IdMappingResolver;
import ru.ok.android.externcalls.sdk.participant.collection.ParticipantStore;
import ru.ok.android.externcalls.sdk.sessionroom.internal.listener.SessionRoomListenerManagerImpl;
import ru.ok.android.externcalls.sdk.sessionroom.participant.SessionRoomParticipants;
import ru.ok.android.externcalls.sdk.sessionroom.participant.SessionRoomParticipantsDataProvider;

@Metadata(d1 = {"\u0000¡\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010$\n\u0002\b\u0005\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\b\u0004*\u0001J\b\u0000\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u0015\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\fH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ!\u0010\u0014\u001a\f\u0012\b\u0012\u00060\u0012j\u0002`\u00130\u00112\u0006\u0010\u0010\u001a\u00020\rH\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u0019\u0010\u0016\u001a\f\u0012\b\u0012\u00060\u0012j\u0002`\u00130\u0011H\u0002¢\u0006\u0004\b\u0016\u0010\u0017J/\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001a0\u00112\u0006\u0010\u0010\u001a\u00020\u00182\u0010\u0010\u0019\u001a\f\u0012\b\u0012\u00060\u0012j\u0002`\u00130\u0011H\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ\u001d\u0010\u001e\u001a\u0004\u0018\u00010\u001a2\n\u0010\u001d\u001a\u00060\u0012j\u0002`\u0013H\u0002¢\u0006\u0004\b\u001e\u0010\u001fJ\u0017\u0010\"\u001a\u00020\u001a2\u0006\u0010!\u001a\u00020 H\u0002¢\u0006\u0004\b\"\u0010#J9\u0010*\u001a\u00020&2\u0012\u0010'\u001a\u000e\u0012\u0004\u0012\u00020%\u0012\u0004\u0012\u00020&0$2\u0014\u0010)\u001a\u0010\u0012\u0004\u0012\u00020(\u0012\u0004\u0012\u00020&\u0018\u00010$H\u0002¢\u0006\u0004\b*\u0010+J+\u0010.\u001a\f\u0012\b\u0012\u00060\u0012j\u0002`\u00130-2\u0010\u0010,\u001a\f\u0012\b\u0012\u00060\u0012j\u0002`\u00130\u0011H\u0002¢\u0006\u0004\b.\u0010/JE\u00102\u001a\u00020&2\u0010\u0010,\u001a\f\u0012\b\u0012\u00060\u0012j\u0002`\u00130\u00112\f\u00101\u001a\b\u0012\u0004\u0012\u00020&002\u0014\u0010)\u001a\u0010\u0012\u0004\u0012\u00020(\u0012\u0004\u0012\u00020&\u0018\u00010$H\u0002¢\u0006\u0004\b2\u00103JA\u00104\u001a\u00020&2\u0006\u0010\u0010\u001a\u00020\u00182\u0012\u0010'\u001a\u000e\u0012\u0004\u0012\u00020%\u0012\u0004\u0012\u00020&0$2\u0014\u0010)\u001a\u0010\u0012\u0004\u0012\u00020(\u0012\u0004\u0012\u00020&\u0018\u00010$H\u0016¢\u0006\u0004\b4\u00105J?\u00106\u001a\u00020&2\u0018\u0010'\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020%0-\u0012\u0004\u0012\u00020&0$2\u0014\u0010)\u001a\u0010\u0012\u0004\u0012\u00020(\u0012\u0004\u0012\u00020&\u0018\u00010$H\u0016¢\u0006\u0004\b6\u0010+JE\u0010:\u001a\u00020&2\n\u00109\u001a\u000607j\u0002`82\u0012\u0010'\u001a\u000e\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020&0$2\u0014\u0010)\u001a\u0010\u0012\u0004\u0012\u00020(\u0012\u0004\u0012\u00020&\u0018\u00010$H\u0016¢\u0006\u0004\b:\u0010;JG\u0010>\u001a\u00020&2\n\u0010<\u001a\u000607j\u0002`82\u0016\u0010=\u001a\u0012\u0012\b\u0012\u00060\u0012j\u0002`\u0013\u0012\u0004\u0012\u00020&0$2\u0014\u0010)\u001a\u0010\u0012\u0004\u0012\u00020(\u0012\u0004\u0012\u00020&\u0018\u00010$¢\u0006\u0004\b>\u0010;J3\u0010A\u001a\u0016\u0012\b\u0012\u000607j\u0002`8\u0012\b\u0012\u00060\u0012j\u0002`\u00130@2\u0010\u0010?\u001a\f\u0012\b\u0012\u000607j\u0002`80\u0011¢\u0006\u0004\bA\u0010BR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010CR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010DR\u0014\u0010\t\u001a\u00020\b8\u0002X\u0004¢\u0006\u0006\n\u0004\b\t\u0010ER \u0010H\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020G0F8\u0002X\u0004¢\u0006\u0006\n\u0004\bH\u0010IR\u0014\u0010K\u001a\u00020J8\u0002X\u0004¢\u0006\u0006\n\u0004\bK\u0010L¨\u0006M"}, d2 = {"Lru/ok/android/externcalls/sdk/sessionroom/internal/participant/SessionRoomParticipantsDataProviderImpl;", "Lru/ok/android/externcalls/sdk/sessionroom/participant/SessionRoomParticipantsDataProvider;", "Lru/ok/android/externcalls/sdk/participant/collection/ParticipantStore;", "store", "Lru/ok/android/externcalls/sdk/sessionroom/internal/listener/SessionRoomListenerManagerImpl;", "listenerManager", "Lru/ok/android/externcalls/sdk/id/mapping/IdMappingResolver;", "idMappingResolver", "Lru/ok/android/externcalls/sdk/id/IdMappingWrapper;", "idMappingWrapper", "<init>", "(Lru/ok/android/externcalls/sdk/participant/collection/ParticipantStore;Lru/ok/android/externcalls/sdk/sessionroom/internal/listener/SessionRoomListenerManagerImpl;Lru/ok/android/externcalls/sdk/id/mapping/IdMappingResolver;Lru/ok/android/externcalls/sdk/id/IdMappingWrapper;)V", "", "Lv2d;", "getRoomIds", "()Ljava/util/Set;", "roomId", "", "Lge1;", "Lru/ok/android/externcalls/sdk/id/InternalId;", "getRoomParticipantIds", "(Lv2d;)Ljava/util/Collection;", "getAllRoomParticipantIds", "()Ljava/util/Collection;", "Lw2d;", "internalIds", "Lru/ok/android/externcalls/sdk/sessionroom/participant/SessionRoomParticipants$Participant;", "mapInternalIdsToSessionRoomParticipants", "(Lw2d;Ljava/util/Collection;)Ljava/util/Collection;", "internalId", "mapInternalIdToSessionRoomParticipant", "(Lge1;)Lru/ok/android/externcalls/sdk/sessionroom/participant/SessionRoomParticipants$Participant;", "Lru/ok/android/externcalls/sdk/ConversationParticipant;", "participant", "mapConversationParticipantToSessionRoomParticipant", "(Lru/ok/android/externcalls/sdk/ConversationParticipant;)Lru/ok/android/externcalls/sdk/sessionroom/participant/SessionRoomParticipants$Participant;", "Lkotlin/Function1;", "Lru/ok/android/externcalls/sdk/sessionroom/participant/SessionRoomParticipants;", "Ljue;", "onSuccess", "", "onError", "getMainCallParticipantIds", "(Lu16;Lu16;)V", "participantIds", "", "getUnresolvedExternalIds", "(Ljava/util/Collection;)Ljava/util/List;", "Lkotlin/Function0;", "onResolve", "resolveParticipantIds", "(Ljava/util/Collection;Ls16;Lu16;)V", "getRoomParticipants", "(Lw2d;Lu16;Lu16;)V", "getAllInRoomParticipants", "Lru/ok/android/externcalls/sdk/id/ParticipantId;", "Lru/ok/android/externcalls/sdk/id/ExternalId;", "participantId", "getParticipantRoomId", "(Lru/ok/android/externcalls/sdk/id/ParticipantId;Lu16;Lu16;)V", "externalId", "onIdResolved", "resolveInternalIdByExternal", "externalIds", "", "getInternalIdsByExternal", "(Ljava/util/Collection;)Ljava/util/Map;", "Lru/ok/android/externcalls/sdk/participant/collection/ParticipantStore;", "Lru/ok/android/externcalls/sdk/id/mapping/IdMappingResolver;", "Lru/ok/android/externcalls/sdk/id/IdMappingWrapper;", "", "Lq2d;", "knownSessionRooms", "Ljava/util/Map;", "ru/ok/android/externcalls/sdk/sessionroom/internal/participant/SessionRoomParticipantsDataProviderImpl$roomsListener$1", "roomsListener", "Lru/ok/android/externcalls/sdk/sessionroom/internal/participant/SessionRoomParticipantsDataProviderImpl$roomsListener$1;", "calls-sdk_release"}, k = 1, mv = {1, 9, 0})
public final class SessionRoomParticipantsDataProviderImpl implements SessionRoomParticipantsDataProvider {
    private final IdMappingResolver idMappingResolver;
    private final IdMappingWrapper idMappingWrapper;
    /* access modifiers changed from: private */
    public final Map<v2d, q2d> knownSessionRooms = new LinkedHashMap();
    private final SessionRoomParticipantsDataProviderImpl$roomsListener$1 roomsListener;
    private final ParticipantStore store;

    public SessionRoomParticipantsDataProviderImpl(ParticipantStore participantStore, SessionRoomListenerManagerImpl sessionRoomListenerManagerImpl, IdMappingResolver idMappingResolver2, IdMappingWrapper idMappingWrapper2) {
        this.store = participantStore;
        this.idMappingResolver = idMappingResolver2;
        this.idMappingWrapper = idMappingWrapper2;
        SessionRoomParticipantsDataProviderImpl$roomsListener$1 sessionRoomParticipantsDataProviderImpl$roomsListener$1 = new SessionRoomParticipantsDataProviderImpl$roomsListener$1(this);
        this.roomsListener = sessionRoomParticipantsDataProviderImpl$roomsListener$1;
        sessionRoomListenerManagerImpl.addListener(sessionRoomParticipantsDataProviderImpl$roomsListener$1);
    }

    private final Collection<ge1> getAllRoomParticipantIds() {
        Collection<q2d> values = this.knownSessionRooms.values();
        ArrayList arrayList = new ArrayList();
        for (q2d q2d : values) {
            List list = q2d.e;
            if (list != null) {
                arrayList.add(list);
            }
        }
        return q23.I(arrayList);
    }

    private final void getMainCallParticipantIds(u16 u16, u16 u162) {
        Set w0 = o23.w0(getAllRoomParticipantIds());
        ParticipantStore participantStore = this.store;
        u2d u2d = u2d.a;
        Collection<ConversationParticipant> participants = participantStore.getParticipants(u2d);
        ArrayList<ConversationParticipant> arrayList = new ArrayList<>();
        for (T next : participants) {
            ConversationParticipant conversationParticipant = (ConversationParticipant) next;
            if (!conversationParticipant.isAdmin() && !conversationParticipant.isCreator() && !w0.contains(conversationParticipant.getInternalId())) {
                arrayList.add(next);
            }
        }
        ArrayList arrayList2 = new ArrayList(q23.H(arrayList, 10));
        for (ConversationParticipant mapConversationParticipantToSessionRoomParticipant : arrayList) {
            arrayList2.add(mapConversationParticipantToSessionRoomParticipant(mapConversationParticipantToSessionRoomParticipant));
        }
        u16.invoke(new SessionRoomParticipants(u2d, arrayList2));
    }

    private final Set<v2d> getRoomIds() {
        return o23.w0(this.knownSessionRooms.keySet());
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Code restructure failed: missing block: B:2:0x000a, code lost:
        r0 = r0.e;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.util.Collection<defpackage.ge1> getRoomParticipantIds(defpackage.v2d r1) {
        /*
            r0 = this;
            java.util.Map<v2d, q2d> r0 = r0.knownSessionRooms
            java.lang.Object r0 = r0.get(r1)
            q2d r0 = (defpackage.q2d) r0
            if (r0 == 0) goto L_0x0013
            java.util.List r0 = r0.e
            if (r0 == 0) goto L_0x0013
            java.util.List r0 = o23.s0(r0)
            goto L_0x0015
        L_0x0013:
            hw4 r0 = hw4.a
        L_0x0015:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: ru.ok.android.externcalls.sdk.sessionroom.internal.participant.SessionRoomParticipantsDataProviderImpl.getRoomParticipantIds(v2d):java.util.Collection");
    }

    private final List<ge1> getUnresolvedExternalIds(Collection<ge1> collection) {
        ArrayList arrayList = new ArrayList();
        for (ge1 next : collection) {
            if (this.idMappingWrapper.getByInternal(next) == null) {
                arrayList.add(next);
            }
        }
        return arrayList;
    }

    private final SessionRoomParticipants.Participant mapConversationParticipantToSessionRoomParticipant(ConversationParticipant conversationParticipant) {
        return new SessionRoomParticipants.Participant(conversationParticipant.getExternalId(), this.store.getParticipantRoomId(conversationParticipant), conversationParticipant);
    }

    private final SessionRoomParticipants.Participant mapInternalIdToSessionRoomParticipant(ge1 ge1) {
        ConversationParticipant byInternal = this.store.getByInternal(ge1);
        if (byInternal != null) {
            return mapConversationParticipantToSessionRoomParticipant(byInternal);
        }
        ParticipantId byInternal2 = this.idMappingWrapper.getByInternal(ge1);
        if (byInternal2 != null) {
            return new SessionRoomParticipants.Participant(byInternal2, (w2d) null, (ConversationParticipant) null);
        }
        return null;
    }

    /* access modifiers changed from: private */
    public final Collection<SessionRoomParticipants.Participant> mapInternalIdsToSessionRoomParticipants(w2d w2d, Collection<ge1> collection) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (ge1 mapInternalIdToSessionRoomParticipant : collection) {
            SessionRoomParticipants.Participant mapInternalIdToSessionRoomParticipant2 = mapInternalIdToSessionRoomParticipant(mapInternalIdToSessionRoomParticipant);
            if (mapInternalIdToSessionRoomParticipant2 != null) {
                linkedHashMap.put(mapInternalIdToSessionRoomParticipant2.getId(), mapInternalIdToSessionRoomParticipant2);
            }
        }
        for (ConversationParticipant next : this.store.getParticipants(w2d)) {
            if (!linkedHashMap.containsKey(next.getExternalId()) && (next.isAdmin() || next.isCreator())) {
                linkedHashMap.put(next.getExternalId(), mapConversationParticipantToSessionRoomParticipant(next));
            }
        }
        return linkedHashMap.values();
    }

    /* access modifiers changed from: private */
    public static final void resolveInternalIdByExternal$lambda$0(u16 u16, u16 u162, ParticipantId participantId, ge1 ge1) {
        if (ge1 != null) {
            u16.invoke(ge1);
        } else if (u162 != null) {
            u162.invoke(new RuntimeException("Requested external id " + participantId + " resolved to null"));
        }
    }

    /* access modifiers changed from: private */
    public static final void resolveInternalIdByExternal$lambda$1(u16 u16, ParticipantId participantId) {
        if (u16 != null) {
            u16.invoke(new RuntimeException("Requested external id " + participantId + " could not be resolved to internal"));
        }
    }

    private final void resolveParticipantIds(Collection<ge1> collection, s16 s16, u16 u16) {
        if (collection.isEmpty()) {
            s16.invoke();
            return;
        }
        List<ge1> unresolvedExternalIds = getUnresolvedExternalIds(collection);
        if (unresolvedExternalIds.isEmpty()) {
            s16.invoke();
        } else {
            this.idMappingResolver.resolveExternalsByInternalsIds(unresolvedExternalIds, new tg0(7, s16), new x2d(0, u16));
        }
    }

    /* access modifiers changed from: private */
    public static final void resolveParticipantIds$lambda$8(s16 s16) {
        s16.invoke();
    }

    /* access modifiers changed from: private */
    public static final void resolveParticipantIds$lambda$9(u16 u16) {
        if (u16 != null) {
            u16.invoke(new RuntimeException("Can't resolve external ids"));
        }
    }

    public void getAllInRoomParticipants(u16 u16, u16 u162) {
        Set<v2d> roomIds = getRoomIds();
        if (roomIds.isEmpty()) {
            u16.invoke(hw4.a);
        } else {
            resolveParticipantIds(getAllRoomParticipantIds(), new SessionRoomParticipantsDataProviderImpl$getAllInRoomParticipants$1(roomIds, this, u16), u162);
        }
    }

    public final Map<ParticipantId, ge1> getInternalIdsByExternal(Collection<ParticipantId> collection) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (ParticipantId participantId : collection) {
            ge1 byExternal = this.idMappingWrapper.getByExternal(participantId);
            if (byExternal != null) {
                linkedHashMap.put(participantId, byExternal);
            } else {
                throw new RuntimeException("Unresolved external participant id " + participantId);
            }
        }
        return linkedHashMap;
    }

    public void getParticipantRoomId(ParticipantId participantId, u16 u16, u16 u162) {
        ConversationParticipant byExternal = this.store.getByExternal(participantId);
        if (byExternal != null) {
            w2d participantRoomId = this.store.getParticipantRoomId(byExternal);
            if (participantRoomId != null) {
                u16.invoke(participantRoomId);
            } else if (u162 != null) {
                u162.invoke(new RuntimeException("Can't find room data for participant " + participantId));
            }
        } else if (u162 != null) {
            u162.invoke(new RuntimeException("Participant " + participantId + " not found"));
        }
    }

    public void getRoomParticipants(w2d w2d, u16 u16, u16 u162) {
        if (w2d instanceof u2d) {
            getMainCallParticipantIds(u16, u162);
        } else if (w2d instanceof v2d) {
            Collection<ge1> roomParticipantIds = getRoomParticipantIds((v2d) w2d);
            resolveParticipantIds(roomParticipantIds, new SessionRoomParticipantsDataProviderImpl$getRoomParticipants$1(u16, w2d, this, roomParticipantIds), u162);
        }
    }

    public final void resolveInternalIdByExternal(ParticipantId participantId, u16 u16, u16 u162) {
        this.idMappingResolver.withInternalId(participantId, new ca4(u16, u162, participantId, 2), new sbc(u162, 16, participantId));
    }
}

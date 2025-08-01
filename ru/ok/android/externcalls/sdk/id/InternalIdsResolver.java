package ru.ok.android.externcalls.sdk.id;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import ru.ok.android.externcalls.sdk.ConversationParticipant;
import ru.ok.android.externcalls.sdk.ConversationParticipantExtensionsKt;
import ru.ok.android.externcalls.sdk.id.local.LocalIdMappings;
import ru.ok.android.externcalls.sdk.id.mapping.IdsMapper;
import ru.ok.android.externcalls.sdk.participant.collection.ParticipantStore;

public class InternalIdsResolver {
    private final IdMappingWrapper idMappingWrapper;
    private final LocalIdMappings localIdMappings;
    private final IdsMapper<ParticipantId, ge1> mapper;
    private final ParticipantPrivateStateModifier stateModifier;
    private final ParticipantStore store;

    public interface ParticipantPrivateStateModifier {
        void setInternalId(ConversationParticipant conversationParticipant, ge1 ge1);
    }

    public InternalIdsResolver(ParticipantStore participantStore, IdMappingWrapper idMappingWrapper2, ParticipantPrivateStateModifier participantPrivateStateModifier, LocalIdMappings localIdMappings2, IdsMapper<ParticipantId, ge1> idsMapper) {
        this.idMappingWrapper = idMappingWrapper2;
        this.store = participantStore;
        this.stateModifier = participantPrivateStateModifier;
        this.localIdMappings = localIdMappings2;
        this.mapper = idsMapper;
    }

    private void applyInternalIds(Map<ParticipantId, ge1> map) {
        for (Map.Entry next : map.entrySet()) {
            ge1 ge1 = (ge1) next.getValue();
            ParticipantId participantId = (ParticipantId) next.getKey();
            ConversationParticipant byExternal = this.store.getByExternal(participantId);
            this.idMappingWrapper.addMapping(participantId, ge1);
            if (byExternal != null) {
                this.stateModifier.setInternalId(byExternal, ge1);
                this.localIdMappings.addMappings(byExternal);
            }
        }
    }

    private List<ParticipantId> getResolutionCandidates() {
        ArrayList arrayList = new ArrayList();
        Iterator<ConversationParticipant> it = this.store.iterator();
        while (it.hasNext()) {
            ConversationParticipant next = it.next();
            if (ConversationParticipantExtensionsKt.getInternalIdExt(next) == null) {
                arrayList.add(next.getExternalId());
            }
        }
        return arrayList;
    }

    /* access modifiers changed from: private */
    public /* synthetic */ Set lambda$resolveIdsAndGetFailed$0() throws Exception {
        List<ParticipantId> resolutionCandidates = getResolutionCandidates();
        if (resolutionCandidates.isEmpty()) {
            return Collections.emptySet();
        }
        applyInternalIds(this.mapper.map(resolutionCandidates));
        HashSet hashSet = new HashSet(getResolutionCandidates());
        HashSet hashSet2 = new HashSet(resolutionCandidates);
        hashSet2.retainAll(hashSet);
        Iterator it = hashSet2.iterator();
        while (it.hasNext()) {
            this.store.removeByExternal((ParticipantId) it.next());
        }
        return hashSet2;
    }

    public dhd resolveIdsAndGetFailed() {
        return new mv9(2, new m5(7, this)).m(cnc.b());
    }
}

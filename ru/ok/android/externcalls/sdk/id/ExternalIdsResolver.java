package ru.ok.android.externcalls.sdk.id;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import ru.ok.android.externcalls.sdk.ConversationParticipant;
import ru.ok.android.externcalls.sdk.ConversationParticipantExtensionsKt;
import ru.ok.android.externcalls.sdk.id.local.LocalIdMappings;
import ru.ok.android.externcalls.sdk.id.local.LocalParticipantId;
import ru.ok.android.externcalls.sdk.id.mapping.IdsMapper;
import ru.ok.android.externcalls.sdk.participant.collection.ParticipantStore;

public class ExternalIdsResolver {
    private final ExtraResolver extraResolver;
    private final IdMappingWrapper idMappingWrapper;
    private final IdsMapper<ge1, ParticipantId> idsMapper;
    private final LocalIdMappings localIdMappings;
    private final ParticipantPrivateStateModifier participantPrivateStateModifier;
    private final ParticipantStore store;

    public interface ExtraResolver {
        ParticipantId onExternalByInternalResolution(ConversationParticipant conversationParticipant);
    }

    public interface ParticipantPrivateStateModifier {
        void setExternalId(ConversationParticipant conversationParticipant, ParticipantId participantId);
    }

    public ExternalIdsResolver(ParticipantStore participantStore, IdMappingWrapper idMappingWrapper2, ExtraResolver extraResolver2, ParticipantPrivateStateModifier participantPrivateStateModifier2, LocalIdMappings localIdMappings2, IdsMapper<ge1, ParticipantId> idsMapper2) {
        this.store = participantStore;
        this.idMappingWrapper = idMappingWrapper2;
        this.extraResolver = extraResolver2;
        this.participantPrivateStateModifier = participantPrivateStateModifier2;
        this.localIdMappings = localIdMappings2;
        this.idsMapper = idsMapper2;
    }

    private void applyExternals(Map<ge1, ParticipantId> map) {
        for (Map.Entry next : map.entrySet()) {
            ge1 ge1 = (ge1) next.getKey();
            ParticipantId participantId = (ParticipantId) next.getValue();
            ConversationParticipant byInternal = this.store.getByInternal(ge1);
            this.idMappingWrapper.addMapping(participantId, ge1);
            if (byInternal != null) {
                this.localIdMappings.addMappings(byInternal);
                this.participantPrivateStateModifier.setExternalId(byInternal, participantId);
            }
        }
    }

    private void collectExternalIdResolutionCandidatesForSessionRoom(List<ge1> list, Map<LocalParticipantId, ConversationParticipant> map) {
        for (ConversationParticipant next : map.values()) {
            if (next.getExternalId() == null) {
                ParticipantId onExternalByInternalResolution = this.extraResolver.onExternalByInternalResolution(next);
                if (onExternalByInternalResolution == null) {
                    list.add(ConversationParticipantExtensionsKt.getInternalIdExt(next));
                } else {
                    this.participantPrivateStateModifier.setExternalId(next, onExternalByInternalResolution);
                    this.idMappingWrapper.addMapping(onExternalByInternalResolution, ConversationParticipantExtensionsKt.getInternalIdExt(next));
                    this.localIdMappings.addMappings(next);
                }
            }
        }
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void lambda$resolveIds$0(List list) throws Throwable {
        applyExternals(this.idsMapper.map(list));
    }

    public List<ge1> collectExternalIdResolutionCandidates() {
        ArrayList arrayList = new ArrayList();
        Map<w2d, Map<LocalParticipantId, ConversationParticipant>> roomToParticipantsMap = this.store.getRoomToParticipantsMap();
        for (w2d w2d : roomToParticipantsMap.keySet()) {
            Map map = roomToParticipantsMap.get(w2d);
            if (map != null) {
                collectExternalIdResolutionCandidatesForSessionRoom(arrayList, map);
            }
        }
        return arrayList;
    }

    public v63 resolveIds(List<ge1> list) {
        return list.isEmpty() ? c73.a : new y63(1, new sz(this, 2, list)).k(cnc.b());
    }
}

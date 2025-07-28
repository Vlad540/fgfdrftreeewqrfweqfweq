package ru.ok.android.externcalls.sdk.participant.state;

import java.util.Collection;
import java.util.Set;
import kotlin.Metadata;
import ru.ok.android.externcalls.sdk.id.ParticipantId;

@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\b\u0007\n\u0002\u0010\"\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\bf\u0018\u00002\u00020\u0001:\u0003/01J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0007\u0010\u0006J\u0017\u0010\b\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\b\u0010\u0006J\u0017\u0010\t\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\t\u0010\u0006J\u000f\u0010\u000b\u001a\u00020\nH&¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\u000e\u001a\u00020\rH&¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0011\u001a\u00020\u00042\u0006\u0010\u0010\u001a\u00020\nH&¢\u0006\u0004\b\u0011\u0010\u0012J\u001b\u0010\u0016\u001a\u00020\u00042\n\u0010\u0015\u001a\u00060\u0013j\u0002`\u0014H&¢\u0006\u0004\b\u0016\u0010\u0017J9\u0010\u001d\u001a\u00020\u00042\u0010\b\u0002\u0010\u0019\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00182\u0016\b\u0002\u0010\u001c\u001a\u0010\u0012\u0004\u0012\u00020\u001b\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u001aH&¢\u0006\u0004\b\u001d\u0010\u001eJ\u001b\u0010\u001f\u001a\u00020\n2\n\u0010\u0015\u001a\u00060\u0013j\u0002`\u0014H&¢\u0006\u0004\b\u001f\u0010 J\u001b\u0010!\u001a\u00020\r2\n\u0010\u0015\u001a\u00060\u0013j\u0002`\u0014H&¢\u0006\u0004\b!\u0010\"J\u0019\u0010$\u001a\f\u0012\b\u0012\u00060\u0013j\u0002`\u00140#H&¢\u0006\u0004\b$\u0010%J\u000f\u0010&\u001a\u00020\nH&¢\u0006\u0004\b&\u0010\fJ\u000f\u0010'\u001a\u00020\rH&¢\u0006\u0004\b'\u0010\u000fJ\u001b\u0010&\u001a\u00020\n2\n\u0010\u0015\u001a\u00060\u0013j\u0002`\u0014H&¢\u0006\u0004\b&\u0010 J\u001b\u0010'\u001a\u00020\r2\n\u0010\u0015\u001a\u00060\u0013j\u0002`\u0014H&¢\u0006\u0004\b'\u0010\"J\u0017\u0010)\u001a\u00020\u00042\u0006\u0010(\u001a\u00020\nH&¢\u0006\u0004\b)\u0010\u0012J\u0019\u0010*\u001a\f\u0012\b\u0012\u00060\u0013j\u0002`\u00140#H&¢\u0006\u0004\b*\u0010%J\u0017\u0010-\u001a\u00020\u00042\u0006\u0010,\u001a\u00020+H&¢\u0006\u0004\b-\u0010.ø\u0001\u0000\u0002\u0006\n\u0004\b!0\u0001¨\u00062À\u0006\u0001"}, d2 = {"Lru/ok/android/externcalls/sdk/participant/state/ParticipantStatesManager;", "", "Lru/ok/android/externcalls/sdk/participant/state/ParticipantStatesManager$Listener;", "listener", "Ljue;", "addHandListener", "(Lru/ok/android/externcalls/sdk/participant/state/ParticipantStatesManager$Listener;)V", "removeHandListener", "addAssistanceRequestListener", "removeAssistanceRequestListener", "", "isOwnHandRaised", "()Z", "", "getOwnHandRaiseTime", "()J", "isRaised", "setOwnHandRaised", "(Z)V", "Lru/ok/android/externcalls/sdk/id/ParticipantId;", "Lru/ok/android/externcalls/sdk/id/ExternalId;", "participantId", "lowerHandParticipant", "(Lru/ok/android/externcalls/sdk/id/ParticipantId;)V", "Lkotlin/Function0;", "onSuccess", "Lkotlin/Function1;", "", "onError", "lowerHandForAll", "(Ls16;Lu16;)V", "isHandRaised", "(Lru/ok/android/externcalls/sdk/id/ParticipantId;)Z", "getHandRaiseTime", "(Lru/ok/android/externcalls/sdk/id/ParticipantId;)J", "", "getRaisedHandIds", "()Ljava/util/Set;", "isAssistanceRequested", "getAssistanceRequestTime", "isRequested", "setAssistanceRequested", "getAssistanceRequestIds", "Lv2d;", "roomId", "resetAssistanceRequests", "(Lv2d;)V", "Listener", "ParticipantStateChange", "StateChangedEvent", "calls-sdk_release"}, k = 1, mv = {1, 9, 0})
public interface ParticipantStatesManager {

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bæ\u0001\u0018\u00002\u00020\u0001J\u001f\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H&¢\u0006\u0004\b\u0007\u0010\bø\u0001\u0000\u0002\u0006\n\u0004\b!0\u0001¨\u0006\tÀ\u0006\u0001"}, d2 = {"Lru/ok/android/externcalls/sdk/participant/state/ParticipantStatesManager$Listener;", "", "Lru/ok/android/externcalls/sdk/participant/state/ParticipantStatesManager;", "manager", "Lru/ok/android/externcalls/sdk/participant/state/ParticipantStatesManager$StateChangedEvent;", "event", "Ljue;", "onParticipantStateChanged", "(Lru/ok/android/externcalls/sdk/participant/state/ParticipantStatesManager;Lru/ok/android/externcalls/sdk/participant/state/ParticipantStatesManager$StateChangedEvent;)V", "calls-sdk_release"}, k = 1, mv = {1, 9, 0})
    public interface Listener {
        void onParticipantStateChanged(ParticipantStatesManager participantStatesManager, StateChangedEvent stateChangedEvent);
    }

    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\t\n\u0002\b\r\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\b\u0018\u00002\u00020\u0001B!\u0012\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b¢\u0006\u0002\u0010\tJ\r\u0010\u000f\u001a\u00060\u0003j\u0002`\u0004HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0006HÆ\u0003J\t\u0010\u0011\u001a\u00020\bHÆ\u0003J+\u0010\u0012\u001a\u00020\u00002\f\b\u0002\u0010\u0002\u001a\u00060\u0003j\u0002`\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\bHÆ\u0001J\u0013\u0010\u0013\u001a\u00020\u00062\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001R\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\nR\u0015\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e¨\u0006\u0019"}, d2 = {"Lru/ok/android/externcalls/sdk/participant/state/ParticipantStatesManager$ParticipantStateChange;", "", "participantId", "Lru/ok/android/externcalls/sdk/id/ParticipantId;", "Lru/ok/android/externcalls/sdk/id/ExternalId;", "isOn", "", "updateTs", "", "(Lru/ok/android/externcalls/sdk/id/ParticipantId;ZJ)V", "()Z", "getParticipantId", "()Lru/ok/android/externcalls/sdk/id/ParticipantId;", "getUpdateTs", "()J", "component1", "component2", "component3", "copy", "equals", "other", "hashCode", "", "toString", "", "calls-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class ParticipantStateChange {
        private final boolean isOn;
        private final ParticipantId participantId;
        private final long updateTs;

        public ParticipantStateChange(ParticipantId participantId2, boolean z, long j) {
            this.participantId = participantId2;
            this.isOn = z;
            this.updateTs = j;
        }

        public static /* synthetic */ ParticipantStateChange copy$default(ParticipantStateChange participantStateChange, ParticipantId participantId2, boolean z, long j, int i, Object obj) {
            if ((i & 1) != 0) {
                participantId2 = participantStateChange.participantId;
            }
            if ((i & 2) != 0) {
                z = participantStateChange.isOn;
            }
            if ((i & 4) != 0) {
                j = participantStateChange.updateTs;
            }
            return participantStateChange.copy(participantId2, z, j);
        }

        public final ParticipantId component1() {
            return this.participantId;
        }

        public final boolean component2() {
            return this.isOn;
        }

        public final long component3() {
            return this.updateTs;
        }

        public final ParticipantStateChange copy(ParticipantId participantId2, boolean z, long j) {
            return new ParticipantStateChange(participantId2, z, j);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ParticipantStateChange)) {
                return false;
            }
            ParticipantStateChange participantStateChange = (ParticipantStateChange) obj;
            return hhd.f(this.participantId, participantStateChange.participantId) && this.isOn == participantStateChange.isOn && this.updateTs == participantStateChange.updateTs;
        }

        public final ParticipantId getParticipantId() {
            return this.participantId;
        }

        public final long getUpdateTs() {
            return this.updateTs;
        }

        public int hashCode() {
            return Long.hashCode(this.updateTs) + th2.f(this.participantId.hashCode() * 31, 31, this.isOn);
        }

        public final boolean isOn() {
            return this.isOn;
        }

        public String toString() {
            ParticipantId participantId2 = this.participantId;
            boolean z = this.isOn;
            long j = this.updateTs;
            StringBuilder sb = new StringBuilder("ParticipantStateChange(participantId=");
            sb.append(participantId2);
            sb.append(", isOn=");
            sb.append(z);
            sb.append(", updateTs=");
            return wn6.k(sb, j, ")");
        }
    }

    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u001e\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\b\u0018\u00002\u00020\u0001B\u0013\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0002\u0010\u0005J\u000f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u0019\u0010\t\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0011"}, d2 = {"Lru/ok/android/externcalls/sdk/participant/state/ParticipantStatesManager$StateChangedEvent;", "", "changes", "", "Lru/ok/android/externcalls/sdk/participant/state/ParticipantStatesManager$ParticipantStateChange;", "(Ljava/util/Collection;)V", "getChanges", "()Ljava/util/Collection;", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "", "calls-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class StateChangedEvent {
        private final Collection<ParticipantStateChange> changes;

        public StateChangedEvent(Collection<ParticipantStateChange> collection) {
            this.changes = collection;
        }

        public static /* synthetic */ StateChangedEvent copy$default(StateChangedEvent stateChangedEvent, Collection<ParticipantStateChange> collection, int i, Object obj) {
            if ((i & 1) != 0) {
                collection = stateChangedEvent.changes;
            }
            return stateChangedEvent.copy(collection);
        }

        public final Collection<ParticipantStateChange> component1() {
            return this.changes;
        }

        public final StateChangedEvent copy(Collection<ParticipantStateChange> collection) {
            return new StateChangedEvent(collection);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof StateChangedEvent) && hhd.f(this.changes, ((StateChangedEvent) obj).changes);
        }

        public final Collection<ParticipantStateChange> getChanges() {
            return this.changes;
        }

        public int hashCode() {
            return this.changes.hashCode();
        }

        public String toString() {
            Collection<ParticipantStateChange> collection = this.changes;
            return "StateChangedEvent(changes=" + collection + ")";
        }
    }

    static /* synthetic */ void lowerHandForAll$default(ParticipantStatesManager participantStatesManager, s16 s16, u16 u16, int i, Object obj) {
        if (obj == null) {
            if ((i & 1) != 0) {
                s16 = null;
            }
            if ((i & 2) != 0) {
                u16 = null;
            }
            participantStatesManager.lowerHandForAll(s16, u16);
            return;
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: lowerHandForAll");
    }

    void addAssistanceRequestListener(Listener listener);

    void addHandListener(Listener listener);

    Set<ParticipantId> getAssistanceRequestIds();

    long getAssistanceRequestTime();

    long getAssistanceRequestTime(ParticipantId participantId);

    long getHandRaiseTime(ParticipantId participantId);

    long getOwnHandRaiseTime();

    Set<ParticipantId> getRaisedHandIds();

    boolean isAssistanceRequested();

    boolean isAssistanceRequested(ParticipantId participantId);

    boolean isHandRaised(ParticipantId participantId);

    boolean isOwnHandRaised();

    void lowerHandForAll(s16 s16, u16 u16);

    void lowerHandParticipant(ParticipantId participantId);

    void removeAssistanceRequestListener(Listener listener);

    void removeHandListener(Listener listener);

    void resetAssistanceRequests(v2d v2d);

    void setAssistanceRequested(boolean z);

    void setOwnHandRaised(boolean z);
}

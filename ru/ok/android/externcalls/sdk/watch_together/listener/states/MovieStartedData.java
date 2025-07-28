package ru.ok.android.externcalls.sdk.watch_together.listener.states;

import kotlin.Metadata;
import ru.ok.android.externcalls.sdk.id.ParticipantId;

@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\t\b\b\u0018\u00002\u00020\u0001B#\u0012\n\u0010\u0004\u001a\u00060\u0002j\u0002`\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u0014\u0010\u000b\u001a\u00060\u0002j\u0002`\u0003HÆ\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0007HÆ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J2\u0010\u0011\u001a\u00020\u00002\f\b\u0002\u0010\u0004\u001a\u00060\u0002j\u0002`\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u0007HÆ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0017\u001a\u00020\u0016HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u001a\u0010\u001b\u001a\u00020\u001a2\b\u0010\u0019\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001b\u0010\u001cR\u001b\u0010\u0004\u001a\u00060\u0002j\u0002`\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u001d\u001a\u0004\b\u001e\u0010\fR\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u001f\u001a\u0004\b \u0010\u000eR\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010!\u001a\u0004\b\"\u0010\u0010¨\u0006#"}, d2 = {"Lru/ok/android/externcalls/sdk/watch_together/listener/states/MovieStartedData;", "", "Lru/ok/android/externcalls/sdk/id/ParticipantId;", "Lru/ok/android/externcalls/sdk/id/ExternalId;", "participant", "Lw2d;", "roomId", "Lt69;", "movie", "<init>", "(Lru/ok/android/externcalls/sdk/id/ParticipantId;Lw2d;Lt69;)V", "component1", "()Lru/ok/android/externcalls/sdk/id/ParticipantId;", "component2", "()Lw2d;", "component3", "()Lt69;", "copy", "(Lru/ok/android/externcalls/sdk/id/ParticipantId;Lw2d;Lt69;)Lru/ok/android/externcalls/sdk/watch_together/listener/states/MovieStartedData;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lru/ok/android/externcalls/sdk/id/ParticipantId;", "getParticipant", "Lw2d;", "getRoomId", "Lt69;", "getMovie", "calls-sdk_release"}, k = 1, mv = {1, 9, 0})
public final class MovieStartedData {
    private final t69 movie;
    private final ParticipantId participant;
    private final w2d roomId;

    public MovieStartedData(ParticipantId participantId, w2d w2d, t69 t69) {
        this.participant = participantId;
        this.roomId = w2d;
        this.movie = t69;
    }

    public static /* synthetic */ MovieStartedData copy$default(MovieStartedData movieStartedData, ParticipantId participantId, w2d w2d, t69 t69, int i, Object obj) {
        if ((i & 1) != 0) {
            participantId = movieStartedData.participant;
        }
        if ((i & 2) != 0) {
            w2d = movieStartedData.roomId;
        }
        if ((i & 4) != 0) {
            t69 = movieStartedData.movie;
        }
        return movieStartedData.copy(participantId, w2d, t69);
    }

    public final ParticipantId component1() {
        return this.participant;
    }

    public final w2d component2() {
        return this.roomId;
    }

    public final t69 component3() {
        return this.movie;
    }

    public final MovieStartedData copy(ParticipantId participantId, w2d w2d, t69 t69) {
        return new MovieStartedData(participantId, w2d, t69);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MovieStartedData)) {
            return false;
        }
        MovieStartedData movieStartedData = (MovieStartedData) obj;
        return hhd.f(this.participant, movieStartedData.participant) && hhd.f(this.roomId, movieStartedData.roomId) && hhd.f(this.movie, movieStartedData.movie);
    }

    public final t69 getMovie() {
        return this.movie;
    }

    public final ParticipantId getParticipant() {
        return this.participant;
    }

    public final w2d getRoomId() {
        return this.roomId;
    }

    public int hashCode() {
        int hashCode = this.roomId.hashCode();
        return this.movie.hashCode() + ((hashCode + (this.participant.hashCode() * 31)) * 31);
    }

    public String toString() {
        ParticipantId participantId = this.participant;
        w2d w2d = this.roomId;
        t69 t69 = this.movie;
        return "MovieStartedData(participant=" + participantId + ", roomId=" + w2d + ", movie=" + t69 + ")";
    }
}

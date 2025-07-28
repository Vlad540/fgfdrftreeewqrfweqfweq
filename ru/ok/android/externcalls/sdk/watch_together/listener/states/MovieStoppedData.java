package ru.ok.android.externcalls.sdk.watch_together.listener.states;

import kotlin.Metadata;
import ru.ok.android.externcalls.sdk.id.ParticipantId;

@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u000b\b\b\u0018\u00002\u00020\u0001B+\u0012\n\u0010\u0004\u001a\u00060\u0002j\u0002`\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\u0014\u0010\r\u001a\u00060\u0002j\u0002`\u0003HÆ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\u0007HÆ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\tHÆ\u0003¢\u0006\u0004\b\u0013\u0010\u0014J<\u0010\u0015\u001a\u00020\u00002\f\b\u0002\u0010\u0004\u001a\u00060\u0002j\u0002`\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\n\u001a\u00020\tHÆ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0018\u001a\u00020\u0017HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001b\u001a\u00020\u001aHÖ\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u001a\u0010\u001f\u001a\u00020\u001e2\b\u0010\u001d\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001f\u0010 R\u001b\u0010\u0004\u001a\u00060\u0002j\u0002`\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010!\u001a\u0004\b\"\u0010\u000eR\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010#\u001a\u0004\b$\u0010\u0010R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010%\u001a\u0004\b&\u0010\u0012R\u0017\u0010\n\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\n\u0010'\u001a\u0004\b(\u0010\u0014¨\u0006)"}, d2 = {"Lru/ok/android/externcalls/sdk/watch_together/listener/states/MovieStoppedData;", "", "Lru/ok/android/externcalls/sdk/id/ParticipantId;", "Lru/ok/android/externcalls/sdk/id/ExternalId;", "participant", "Lw2d;", "roomId", "Lw69;", "movieId", "Lc79;", "sourceType", "<init>", "(Lru/ok/android/externcalls/sdk/id/ParticipantId;Lw2d;Lw69;Lc79;)V", "component1", "()Lru/ok/android/externcalls/sdk/id/ParticipantId;", "component2", "()Lw2d;", "component3", "()Lw69;", "component4", "()Lc79;", "copy", "(Lru/ok/android/externcalls/sdk/id/ParticipantId;Lw2d;Lw69;Lc79;)Lru/ok/android/externcalls/sdk/watch_together/listener/states/MovieStoppedData;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lru/ok/android/externcalls/sdk/id/ParticipantId;", "getParticipant", "Lw2d;", "getRoomId", "Lw69;", "getMovieId", "Lc79;", "getSourceType", "calls-sdk_release"}, k = 1, mv = {1, 9, 0})
public final class MovieStoppedData {
    private final w69 movieId;
    private final ParticipantId participant;
    private final w2d roomId;
    private final c79 sourceType;

    public MovieStoppedData(ParticipantId participantId, w2d w2d, w69 w69, c79 c79) {
        this.participant = participantId;
        this.roomId = w2d;
        this.movieId = w69;
        this.sourceType = c79;
    }

    public static /* synthetic */ MovieStoppedData copy$default(MovieStoppedData movieStoppedData, ParticipantId participantId, w2d w2d, w69 w69, c79 c79, int i, Object obj) {
        if ((i & 1) != 0) {
            participantId = movieStoppedData.participant;
        }
        if ((i & 2) != 0) {
            w2d = movieStoppedData.roomId;
        }
        if ((i & 4) != 0) {
            w69 = movieStoppedData.movieId;
        }
        if ((i & 8) != 0) {
            c79 = movieStoppedData.sourceType;
        }
        return movieStoppedData.copy(participantId, w2d, w69, c79);
    }

    public final ParticipantId component1() {
        return this.participant;
    }

    public final w2d component2() {
        return this.roomId;
    }

    public final w69 component3() {
        return this.movieId;
    }

    public final c79 component4() {
        return this.sourceType;
    }

    public final MovieStoppedData copy(ParticipantId participantId, w2d w2d, w69 w69, c79 c79) {
        return new MovieStoppedData(participantId, w2d, w69, c79);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MovieStoppedData)) {
            return false;
        }
        MovieStoppedData movieStoppedData = (MovieStoppedData) obj;
        return hhd.f(this.participant, movieStoppedData.participant) && hhd.f(this.roomId, movieStoppedData.roomId) && hhd.f(this.movieId, movieStoppedData.movieId) && this.sourceType == movieStoppedData.sourceType;
    }

    public final w69 getMovieId() {
        return this.movieId;
    }

    public final ParticipantId getParticipant() {
        return this.participant;
    }

    public final w2d getRoomId() {
        return this.roomId;
    }

    public final c79 getSourceType() {
        return this.sourceType;
    }

    public int hashCode() {
        return this.sourceType.hashCode() + sxe.m((this.roomId.hashCode() + (this.participant.hashCode() * 31)) * 31, 31, this.movieId.a);
    }

    public String toString() {
        ParticipantId participantId = this.participant;
        w2d w2d = this.roomId;
        w69 w69 = this.movieId;
        c79 c79 = this.sourceType;
        return "MovieStoppedData(participant=" + participantId + ", roomId=" + w2d + ", movieId=" + w69 + ", sourceType=" + c79 + ")";
    }
}

package ru.ok.android.externcalls.sdk.watch_together.internal.sessionroom;

import java.util.Map;
import kotlin.Metadata;
import ru.ok.android.externcalls.sdk.ConversationParticipant;
import ru.ok.android.externcalls.sdk.id.ParticipantId;
import ru.ok.android.externcalls.sdk.participant.collection.ParticipantStore;
import ru.ok.android.externcalls.sdk.watch_together.WatchTogetherPlayer;
import ru.ok.android.externcalls.sdk.watch_together.listener.states.MovieState;

@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\r\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\r\u0010\u000eR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u000fR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0010R\u0016\u0010\u0012\u001a\u00020\u00118\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, d2 = {"Lru/ok/android/externcalls/sdk/watch_together/internal/sessionroom/SessionRoomWatchTogetherHandler;", "Lnj1;", "Lru/ok/android/externcalls/sdk/participant/collection/ParticipantStore;", "store", "Lru/ok/android/externcalls/sdk/watch_together/WatchTogetherPlayer;", "watchTogetherManager", "<init>", "(Lru/ok/android/externcalls/sdk/participant/collection/ParticipantStore;Lru/ok/android/externcalls/sdk/watch_together/WatchTogetherPlayer;)V", "Ljue;", "stopWatchTogetherForMe", "()V", "Ljj1;", "params", "onCurrentParticipantActiveRoomChanged", "(Ljj1;)V", "Lru/ok/android/externcalls/sdk/participant/collection/ParticipantStore;", "Lru/ok/android/externcalls/sdk/watch_together/WatchTogetherPlayer;", "Lw2d;", "roomId", "Lw2d;", "calls-sdk_release"}, k = 1, mv = {1, 9, 0})
public final class SessionRoomWatchTogetherHandler implements nj1 {
    private w2d roomId = u2d.a;
    private final ParticipantStore store;
    private final WatchTogetherPlayer watchTogetherManager;

    public SessionRoomWatchTogetherHandler(ParticipantStore participantStore, WatchTogetherPlayer watchTogetherPlayer) {
        this.store = participantStore;
        this.watchTogetherManager = watchTogetherPlayer;
    }

    private final void stopWatchTogetherForMe() {
        for (Map.Entry next : this.watchTogetherManager.getMovieStates().getStates().entrySet()) {
            w69 w69 = (w69) next.getKey();
            ParticipantId participantId = ((MovieState) next.getValue()).getParticipantId();
            ConversationParticipant me = this.store.getMe();
            if (hhd.f(participantId, me != null ? me.getExternalId() : null)) {
                WatchTogetherPlayer.stop$default(this.watchTogetherManager, w69, (s16) null, (u16) null, 6, (Object) null);
            }
        }
    }

    public void onCurrentParticipantActiveRoomChanged(jj1 jj1) {
        w2d w2d = this.roomId;
        w2d w2d2 = jj1.a;
        if (!hhd.f(w2d, w2d2)) {
            stopWatchTogetherForMe();
        }
        this.roomId = w2d2;
    }

    public /* bridge */ /* synthetic */ void onCurrentParticipantInvitedToRoom(kj1 kj1) {
    }

    public /* bridge */ /* synthetic */ void onRoomRemoved(lj1 lj1) {
    }

    public /* bridge */ /* synthetic */ void onRoomUpdated(mj1 mj1) {
    }
}

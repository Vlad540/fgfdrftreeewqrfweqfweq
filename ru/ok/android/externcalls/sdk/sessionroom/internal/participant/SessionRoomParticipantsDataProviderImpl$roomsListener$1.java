package ru.ok.android.externcalls.sdk.sessionroom.internal.participant;

import java.util.Map;
import kotlin.Metadata;
import ru.ok.android.externcalls.sdk.sessionroom.SessionRoomsManager;

@Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0007\u0010\u0006J\u0017\u0010\b\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\b\u0010\u0006J\u0017\u0010\t\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\t\u0010\u0006¨\u0006\n"}, d2 = {"ru/ok/android/externcalls/sdk/sessionroom/internal/participant/SessionRoomParticipantsDataProviderImpl$roomsListener$1", "Lru/ok/android/externcalls/sdk/sessionroom/SessionRoomsManager$OwnRoomsListener;", "Lru/ok/android/externcalls/sdk/sessionroom/SessionRoomsManager$SessionRoomInfo;", "event", "Ljue;", "onActiveRoomChanged", "(Lru/ok/android/externcalls/sdk/sessionroom/SessionRoomsManager$SessionRoomInfo;)V", "onProposedRoomChanged", "onRoomRemoved", "onRoomUpdated", "calls-sdk_release"}, k = 1, mv = {1, 9, 0})
public final class SessionRoomParticipantsDataProviderImpl$roomsListener$1 implements SessionRoomsManager.OwnRoomsListener {
    final /* synthetic */ SessionRoomParticipantsDataProviderImpl this$0;

    public SessionRoomParticipantsDataProviderImpl$roomsListener$1(SessionRoomParticipantsDataProviderImpl sessionRoomParticipantsDataProviderImpl) {
        this.this$0 = sessionRoomParticipantsDataProviderImpl;
    }

    public void onActiveRoomChanged(SessionRoomsManager.SessionRoomInfo sessionRoomInfo) {
    }

    public void onProposedRoomChanged(SessionRoomsManager.SessionRoomInfo sessionRoomInfo) {
    }

    public void onRoomRemoved(SessionRoomsManager.SessionRoomInfo sessionRoomInfo) {
        Map access$getKnownSessionRooms$p = this.this$0.knownSessionRooms;
        w2d roomId = sessionRoomInfo.getRoomId();
        ete.f(access$getKnownSessionRooms$p);
        access$getKnownSessionRooms$p.remove(roomId);
    }

    public void onRoomUpdated(SessionRoomsManager.SessionRoomInfo sessionRoomInfo) {
        q2d room = sessionRoomInfo.getRoom();
        if (room != null) {
            this.this$0.knownSessionRooms.put(room.a, room);
        }
    }
}

package ru.ok.android.externcalls.sdk.sessionroom;

import kotlin.Metadata;
import ru.ok.android.externcalls.sdk.sessionroom.admin.AssignParticipantsToRoomsParams;
import ru.ok.android.externcalls.sdk.sessionroom.admin.MoveParticipantParams;
import ru.ok.android.externcalls.sdk.sessionroom.participant.SessionRoomParticipantsDataProvider;

@Metadata(d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\bf\u0018\u00002\u00020\u0001:\u0002()J5\u0010\b\u001a\u00020\u00032\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00022\u0014\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0005H'¢\u0006\u0004\b\b\u0010\tJ=\u0010\f\u001a\u00020\u00032\u0006\u0010\u000b\u001a\u00020\n2\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00022\u0014\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0005H'¢\u0006\u0004\b\f\u0010\rJ5\u0010\u000e\u001a\u00020\u00032\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00022\u0014\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0005H'¢\u0006\u0004\b\u000e\u0010\tJ=\u0010\u0011\u001a\u00020\u00032\u0006\u0010\u0010\u001a\u00020\u000f2\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00022\u0014\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0005H'¢\u0006\u0004\b\u0011\u0010\u0012J=\u0010\u0014\u001a\u00020\u00032\u0006\u0010\u0010\u001a\u00020\u00132\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00022\u0014\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0005H'¢\u0006\u0004\b\u0014\u0010\u0015J=\u0010\u0017\u001a\u00020\u00032\u0006\u0010\u0010\u001a\u00020\u00162\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00022\u0014\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0005H'¢\u0006\u0004\b\u0017\u0010\u0018J=\u0010\u001a\u001a\u00020\u00032\u0006\u0010\u0010\u001a\u00020\u00192\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00022\u0014\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0005H'¢\u0006\u0004\b\u001a\u0010\u001bJ=\u0010\u001d\u001a\u00020\u00032\u0006\u0010\u0010\u001a\u00020\u001c2\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00022\u0014\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0005H'¢\u0006\u0004\b\u001d\u0010\u001eJ\u000f\u0010 \u001a\u00020\u001fH'¢\u0006\u0004\b \u0010!J\u000f\u0010\"\u001a\u00020\u001fH'¢\u0006\u0004\b\"\u0010!J\u0017\u0010%\u001a\u00020\u00032\u0006\u0010$\u001a\u00020#H'¢\u0006\u0004\b%\u0010&J\u0017\u0010'\u001a\u00020\u00032\u0006\u0010$\u001a\u00020#H'¢\u0006\u0004\b'\u0010&ø\u0001\u0000\u0002\u0006\n\u0004\b!0\u0001¨\u0006*À\u0006\u0001"}, d2 = {"Lru/ok/android/externcalls/sdk/sessionroom/SessionRoomsManager;", "Lru/ok/android/externcalls/sdk/sessionroom/participant/SessionRoomParticipantsDataProvider;", "Lkotlin/Function0;", "Ljue;", "onSuccess", "Lkotlin/Function1;", "", "onError", "requestAttention", "(Ls16;Lu16;)V", "Lv2d;", "roomId", "joinRoom", "(Lv2d;Ls16;Lu16;)V", "leaveRoom", "Lr7;", "params", "activateRooms", "(Lr7;Ls16;Lu16;)V", "Lrve;", "updateRooms", "(Lrve;Ls16;Lu16;)V", "Lru/ok/android/externcalls/sdk/sessionroom/admin/MoveParticipantParams;", "moveParticipant", "(Lru/ok/android/externcalls/sdk/sessionroom/admin/MoveParticipantParams;Ls16;Lu16;)V", "Lf9c;", "removeRooms", "(Lf9c;Ls16;Lu16;)V", "Lru/ok/android/externcalls/sdk/sessionroom/admin/AssignParticipantsToRoomsParams;", "assignParticipantsToRooms", "(Lru/ok/android/externcalls/sdk/sessionroom/admin/AssignParticipantsToRoomsParams;Ls16;Lu16;)V", "Lru/ok/android/externcalls/sdk/sessionroom/SessionRoomsManager$SessionRoomInfo;", "getOwnActiveRoom", "()Lru/ok/android/externcalls/sdk/sessionroom/SessionRoomsManager$SessionRoomInfo;", "getOwnProposedRoom", "Lru/ok/android/externcalls/sdk/sessionroom/SessionRoomsManager$OwnRoomsListener;", "listener", "addListener", "(Lru/ok/android/externcalls/sdk/sessionroom/SessionRoomsManager$OwnRoomsListener;)V", "removeListener", "OwnRoomsListener", "SessionRoomInfo", "calls-sdk_release"}, k = 1, mv = {1, 9, 0})
public interface SessionRoomsManager extends SessionRoomParticipantsDataProvider {

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\bf\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0007\u0010\u0006J\u0017\u0010\b\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\b\u0010\u0006J\u0017\u0010\t\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\t\u0010\u0006ø\u0001\u0000\u0002\u0006\n\u0004\b!0\u0001¨\u0006\nÀ\u0006\u0001"}, d2 = {"Lru/ok/android/externcalls/sdk/sessionroom/SessionRoomsManager$OwnRoomsListener;", "", "Lru/ok/android/externcalls/sdk/sessionroom/SessionRoomsManager$SessionRoomInfo;", "event", "Ljue;", "onRoomUpdated", "(Lru/ok/android/externcalls/sdk/sessionroom/SessionRoomsManager$SessionRoomInfo;)V", "onProposedRoomChanged", "onActiveRoomChanged", "onRoomRemoved", "calls-sdk_release"}, k = 1, mv = {1, 9, 0})
    public interface OwnRoomsListener {
        void onActiveRoomChanged(SessionRoomInfo sessionRoomInfo);

        void onProposedRoomChanged(SessionRoomInfo sessionRoomInfo);

        void onRoomRemoved(SessionRoomInfo sessionRoomInfo);

        void onRoomUpdated(SessionRoomInfo sessionRoomInfo);
    }

    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0007\b\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0012\u0010\n\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ&\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0016\u001a\u00020\u00152\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0018\u001a\u0004\b\u0019\u0010\tR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u001a\u001a\u0004\b\u001b\u0010\u000b¨\u0006\u001c"}, d2 = {"Lru/ok/android/externcalls/sdk/sessionroom/SessionRoomsManager$SessionRoomInfo;", "", "Lw2d;", "roomId", "Lq2d;", "room", "<init>", "(Lw2d;Lq2d;)V", "component1", "()Lw2d;", "component2", "()Lq2d;", "copy", "(Lw2d;Lq2d;)Lru/ok/android/externcalls/sdk/sessionroom/SessionRoomsManager$SessionRoomInfo;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lw2d;", "getRoomId", "Lq2d;", "getRoom", "calls-sdk_release"}, k = 1, mv = {1, 9, 0})
    public static final class SessionRoomInfo {
        private final q2d room;
        private final w2d roomId;

        public SessionRoomInfo(w2d w2d, q2d q2d) {
            this.roomId = w2d;
            this.room = q2d;
        }

        public static /* synthetic */ SessionRoomInfo copy$default(SessionRoomInfo sessionRoomInfo, w2d w2d, q2d q2d, int i, Object obj) {
            if ((i & 1) != 0) {
                w2d = sessionRoomInfo.roomId;
            }
            if ((i & 2) != 0) {
                q2d = sessionRoomInfo.room;
            }
            return sessionRoomInfo.copy(w2d, q2d);
        }

        public final w2d component1() {
            return this.roomId;
        }

        public final q2d component2() {
            return this.room;
        }

        public final SessionRoomInfo copy(w2d w2d, q2d q2d) {
            return new SessionRoomInfo(w2d, q2d);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof SessionRoomInfo)) {
                return false;
            }
            SessionRoomInfo sessionRoomInfo = (SessionRoomInfo) obj;
            return hhd.f(this.roomId, sessionRoomInfo.roomId) && hhd.f(this.room, sessionRoomInfo.room);
        }

        public final q2d getRoom() {
            return this.room;
        }

        public final w2d getRoomId() {
            return this.roomId;
        }

        public int hashCode() {
            int hashCode = this.roomId.hashCode() * 31;
            q2d q2d = this.room;
            return hashCode + (q2d == null ? 0 : q2d.hashCode());
        }

        public String toString() {
            w2d w2d = this.roomId;
            q2d q2d = this.room;
            return "SessionRoomInfo(roomId=" + w2d + ", room=" + q2d + ")";
        }
    }

    void activateRooms(r7 r7Var, s16 s16, u16 u16);

    void addListener(OwnRoomsListener ownRoomsListener);

    void assignParticipantsToRooms(AssignParticipantsToRoomsParams assignParticipantsToRoomsParams, s16 s16, u16 u16);

    SessionRoomInfo getOwnActiveRoom();

    SessionRoomInfo getOwnProposedRoom();

    void joinRoom(v2d v2d, s16 s16, u16 u16);

    void leaveRoom(s16 s16, u16 u16);

    void moveParticipant(MoveParticipantParams moveParticipantParams, s16 s16, u16 u16);

    void removeListener(OwnRoomsListener ownRoomsListener);

    void removeRooms(f9c f9c, s16 s16, u16 u16);

    void requestAttention(s16 s16, u16 u16);

    void updateRooms(rve rve, s16 s16, u16 u16);
}

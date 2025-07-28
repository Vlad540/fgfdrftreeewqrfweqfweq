package ru.ok.android.externcalls.sdk.sessionroom.internal.participant;

import java.util.Collection;
import kotlin.Metadata;
import ru.ok.android.externcalls.sdk.sessionroom.participant.SessionRoomParticipants;

@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Ljue;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
public final class SessionRoomParticipantsDataProviderImpl$getRoomParticipants$1 extends b97 implements s16 {
    final /* synthetic */ u16 $onSuccess;
    final /* synthetic */ Collection<ge1> $participantIds;
    final /* synthetic */ w2d $roomId;
    final /* synthetic */ SessionRoomParticipantsDataProviderImpl this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SessionRoomParticipantsDataProviderImpl$getRoomParticipants$1(u16 u16, w2d w2d, SessionRoomParticipantsDataProviderImpl sessionRoomParticipantsDataProviderImpl, Collection<ge1> collection) {
        super(0);
        this.$onSuccess = u16;
        this.$roomId = w2d;
        this.this$0 = sessionRoomParticipantsDataProviderImpl;
        this.$participantIds = collection;
    }

    public final void invoke() {
        u16 u16 = this.$onSuccess;
        w2d w2d = this.$roomId;
        u16.invoke(new SessionRoomParticipants(w2d, this.this$0.mapInternalIdsToSessionRoomParticipants(w2d, this.$participantIds)));
    }
}

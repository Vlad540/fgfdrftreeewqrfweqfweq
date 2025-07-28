package ru.ok.android.externcalls.sdk.waiting_room;

import java.util.List;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Ljue;", "run", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
public final class WaitingRoomParticipants$resolveInternalIds$1 implements Runnable {
    final /* synthetic */ u16 $onError;
    final /* synthetic */ u16 $onResult;
    final /* synthetic */ List<cn1> $waitingParticipants;
    final /* synthetic */ WaitingRoomParticipants this$0;

    public WaitingRoomParticipants$resolveInternalIds$1(WaitingRoomParticipants waitingRoomParticipants, List<cn1> list, u16 u16, u16 u162) {
        this.this$0 = waitingRoomParticipants;
        this.$waitingParticipants = list;
        this.$onResult = u16;
        this.$onError = u162;
    }

    public final void run() {
        try {
            this.$onResult.invoke(this.this$0.getResolvedWaitingParticipantIds(this.$waitingParticipants));
        } catch (Exception e) {
            this.$onError.invoke(e);
        }
    }
}

package ru.ok.android.externcalls.sdk.waiting_room;

import kotlin.Metadata;

@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0004\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002¨\u0006\u0003"}, d2 = {"Ljue;", "run", "()V", "ru/ok/android/externcalls/sdk/waiting_room/WaitingRoomParticipants$resolveInternalIds$2", "<anonymous>"}, k = 3, mv = {1, 9, 0})
public final class WaitingRoomParticipants$loadWaitingParticipantIdsPageSingle$lambda$6$lambda$4$$inlined$resolveInternalIds$2 implements Runnable {
    final /* synthetic */ nhd $emitter$inlined;

    public WaitingRoomParticipants$loadWaitingParticipantIdsPageSingle$lambda$6$lambda$4$$inlined$resolveInternalIds$2(nhd nhd) {
        this.$emitter$inlined = nhd;
    }

    public final void run() {
        RuntimeException runtimeException = new RuntimeException("Can't resolve extenral ids");
        this.$emitter$inlined.c(new RuntimeException(rf0.h("Can't resolve internal ids: ", runtimeException.getMessage())));
    }
}

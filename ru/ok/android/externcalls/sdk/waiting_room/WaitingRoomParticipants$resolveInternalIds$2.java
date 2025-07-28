package ru.ok.android.externcalls.sdk.waiting_room;

import kotlin.Metadata;

@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Ljue;", "run", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
public final class WaitingRoomParticipants$resolveInternalIds$2 implements Runnable {
    final /* synthetic */ u16 $onError;

    public WaitingRoomParticipants$resolveInternalIds$2(u16 u16) {
        this.$onError = u16;
    }

    public final void run() {
        this.$onError.invoke(new RuntimeException("Can't resolve extenral ids"));
    }
}

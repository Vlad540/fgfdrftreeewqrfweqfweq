package defpackage;

import ru.ok.android.externcalls.sdk.waiting_room.WaitingRoomParticipants;

/* renamed from: ief  reason: default package */
public final /* synthetic */ class ief implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ nhd b;

    public /* synthetic */ ief(nhd nhd, int i) {
        this.a = i;
        this.b = nhd;
    }

    public final void run() {
        int i = this.a;
        nhd nhd = this.b;
        switch (i) {
            case 0:
                WaitingRoomParticipants.loadWaitingParticipantIdsPageSingle$lambda$6$lambda$5(nhd);
                return;
            default:
                WaitingRoomParticipants.resolveInternalIdSingle$lambda$1$lambda$0(nhd);
                return;
        }
    }
}

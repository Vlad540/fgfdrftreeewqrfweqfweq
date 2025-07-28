package ru.ok.android.externcalls.sdk.stereo.hands;

import java.time.Clock;
import java.util.List;
import kotlin.Metadata;
import ru.ok.android.externcalls.sdk.id.ParticipantId;

@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Ljue;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
public final class StereoRoomHandsQueueImpl$onHandUp$1 extends b97 implements s16 {
    final /* synthetic */ gn1 $event;
    final /* synthetic */ StereoRoomHandsQueueImpl this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public StereoRoomHandsQueueImpl$onHandUp$1(gn1 gn1, StereoRoomHandsQueueImpl stereoRoomHandsQueueImpl) {
        super(0);
        this.$event = gn1;
        this.this$0 = stereoRoomHandsQueueImpl;
    }

    public final void invoke() {
        List<ge1> list = this.$event.c;
        StereoRoomHandsQueueImpl stereoRoomHandsQueueImpl = this.this$0;
        for (ge1 invoke : list) {
            ParticipantId participantId = (ParticipantId) stereoRoomHandsQueueImpl.getExternalId.invoke(invoke);
            if (participantId != null) {
                ((fje) stereoRoomHandsQueueImpl.timeProvider).getClass();
                stereoRoomHandsQueueImpl.participantHandChanged(new StereoHandQueueItem(participantId, Clock.systemUTC().millis()), false);
            }
        }
        List<ge1> list2 = this.$event.b;
        StereoRoomHandsQueueImpl stereoRoomHandsQueueImpl2 = this.this$0;
        for (ge1 invoke2 : list2) {
            ParticipantId participantId2 = (ParticipantId) stereoRoomHandsQueueImpl2.getExternalId.invoke(invoke2);
            if (participantId2 != null) {
                ((fje) stereoRoomHandsQueueImpl2.timeProvider).getClass();
                stereoRoomHandsQueueImpl2.participantHandChanged(new StereoHandQueueItem(participantId2, Clock.systemUTC().millis()), true);
            }
        }
        this.this$0.totalCount = this.$event.a;
        this.this$0.notifyHandsStatusChanged();
    }
}

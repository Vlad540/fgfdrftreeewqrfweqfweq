package ru.ok.android.externcalls.sdk.stereo.hands;

import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import ru.ok.android.externcalls.sdk.id.ParticipantId;

@Metadata(d1 = {"\u0000\u001e\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\n\u001a\u00020\u00072\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\n¢\u0006\u0004\b\b\u0010\t"}, d2 = {"", "totalCount", "", "hasMore", "", "Ldn1;", "queue", "Ljue;", "invoke", "(IZLjava/util/List;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
public final class StereoRoomHandsQueueImpl$loadHandsQueue$1 extends b97 implements k26 {
    final /* synthetic */ s16 $onSuccess;
    final /* synthetic */ StereoRoomHandsQueueImpl this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public StereoRoomHandsQueueImpl$loadHandsQueue$1(StereoRoomHandsQueueImpl stereoRoomHandsQueueImpl, s16 s16) {
        super(3);
        this.this$0 = stereoRoomHandsQueueImpl;
        this.$onSuccess = s16;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        invoke(((Number) obj).intValue(), ((Boolean) obj2).booleanValue(), (List<dn1>) (List) obj3);
        return jue.a;
    }

    public final void invoke(int i, boolean z, final List<dn1> list) {
        this.this$0.totalCount = i;
        this.this$0.hasMore = z;
        i26 access$getIdsResolverHelper$p = this.this$0.idsResolverHelper;
        ArrayList arrayList = new ArrayList(q23.H(list, 10));
        for (dn1 dn1 : list) {
            arrayList.add(dn1.b);
        }
        final s16 s16 = this.$onSuccess;
        final StereoRoomHandsQueueImpl stereoRoomHandsQueueImpl = this.this$0;
        access$getIdsResolverHelper$p.invoke(arrayList, new s16() {
            public final void invoke() {
                List<dn1> list = list;
                StereoRoomHandsQueueImpl stereoRoomHandsQueueImpl = stereoRoomHandsQueueImpl;
                for (dn1 dn1 : list) {
                    ParticipantId participantId = (ParticipantId) stereoRoomHandsQueueImpl.getExternalId.invoke(dn1.b);
                    if (participantId != null) {
                        stereoRoomHandsQueueImpl.participantHandChanged(new StereoHandQueueItem(participantId, dn1.a), true);
                    }
                }
                s16.invoke();
                stereoRoomHandsQueueImpl.notifyHandsStatusChanged();
            }
        });
    }
}

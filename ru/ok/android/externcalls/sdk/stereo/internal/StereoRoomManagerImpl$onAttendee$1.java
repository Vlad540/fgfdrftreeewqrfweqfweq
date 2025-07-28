package ru.ok.android.externcalls.sdk.stereo.internal;

import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import ru.ok.android.externcalls.sdk.id.ParticipantId;
import ru.ok.android.externcalls.sdk.stereo.internal.listener.StereoRoomListenerManagerImpl;
import ru.ok.android.externcalls.sdk.stereo.listener.StereoRoomManagerListener;

@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Ljue;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
public final class StereoRoomManagerImpl$onAttendee$1 extends b97 implements s16 {
    final /* synthetic */ en1 $event;
    final /* synthetic */ StereoRoomManagerImpl this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public StereoRoomManagerImpl$onAttendee$1(StereoRoomManagerImpl stereoRoomManagerImpl, en1 en1) {
        super(0);
        this.this$0 = stereoRoomManagerImpl;
        this.$event = en1;
    }

    public final void invoke() {
        StereoRoomListenerManagerImpl access$getListenersManager$p = this.this$0.listenersManager;
        en1 en1 = this.$event;
        int i = en1.a;
        List<ge1> list = en1.c;
        StereoRoomManagerImpl stereoRoomManagerImpl = this.this$0;
        ArrayList arrayList = new ArrayList();
        for (ge1 access$getExternalId : list) {
            ParticipantId access$getExternalId2 = stereoRoomManagerImpl.getExternalId(access$getExternalId);
            if (access$getExternalId2 != null) {
                arrayList.add(access$getExternalId2);
            }
        }
        List<ge1> list2 = this.$event.b;
        StereoRoomManagerImpl stereoRoomManagerImpl2 = this.this$0;
        ArrayList arrayList2 = new ArrayList();
        for (ge1 access$getExternalId3 : list2) {
            ParticipantId access$getExternalId4 = stereoRoomManagerImpl2.getExternalId(access$getExternalId3);
            if (access$getExternalId4 != null) {
                arrayList2.add(access$getExternalId4);
            }
        }
        access$getListenersManager$p.onListenersChanged(new StereoRoomManagerListener.ListenersUpdated(i, arrayList2, arrayList));
    }
}

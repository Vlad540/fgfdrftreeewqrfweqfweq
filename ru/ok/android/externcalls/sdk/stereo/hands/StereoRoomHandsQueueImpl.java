package ru.ok.android.externcalls.sdk.stereo.hands;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import ru.ok.android.externcalls.sdk.id.ParticipantId;
import ru.ok.android.externcalls.sdk.stereo.internal.command.StereoRoomCommandExecutor;
import ru.ok.android.externcalls.sdk.stereo.internal.listener.StereoRoomListenerManagerImpl;
import ru.ok.android.externcalls.sdk.stereo.listener.StereoRoomManagerListener;

@Metadata(d1 = {"\u0000v\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0003\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u0001Bi\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012(\u0010\n\u001a$\u0012\u000e\u0012\f\u0012\b\u0012\u00060\u0006j\u0002`\u00070\u0005\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\b\u0012\u0004\u0012\u00020\t0\u0004\u0012\u001e\u0010\u000e\u001a\u001a\u0012\b\u0012\u00060\u0006j\u0002`\u0007\u0012\f\u0012\n\u0018\u00010\fj\u0004\u0018\u0001`\r0\u000b\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\u0006\u0010\u0012\u001a\u00020\u0011¢\u0006\u0004\b\u0013\u0010\u0014J5\u0010\u0018\u001a\u00020\t2\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\t0\b2\u0016\b\u0002\u0010\u0017\u001a\u0010\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\t\u0018\u00010\u000bH\u0002¢\u0006\u0004\b\u0018\u0010\u0019J\u001f\u0010\u001e\u001a\u00020\t2\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u001d\u001a\u00020\u001cH\u0002¢\u0006\u0004\b\u001e\u0010\u001fJ\u000f\u0010 \u001a\u00020\tH\u0002¢\u0006\u0004\b \u0010!J\u0015\u0010\"\u001a\b\u0012\u0004\u0012\u00020\u001a0\u0005H\u0016¢\u0006\u0004\b\"\u0010#J\u000f\u0010%\u001a\u00020$H\u0016¢\u0006\u0004\b%\u0010&J\u000f\u0010'\u001a\u00020\u001cH\u0016¢\u0006\u0004\b'\u0010(J;\u0010)\u001a\u00020\t2\u0014\u0010\u0015\u001a\u0010\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\t\u0018\u00010\u000b2\u0014\u0010\u0017\u001a\u0010\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\t\u0018\u00010\u000bH\u0016¢\u0006\u0004\b)\u0010*J\u0015\u0010-\u001a\u00020\t2\u0006\u0010,\u001a\u00020+¢\u0006\u0004\b-\u0010.R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010/R6\u0010\n\u001a$\u0012\u000e\u0012\f\u0012\b\u0012\u00060\u0006j\u0002`\u00070\u0005\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\b\u0012\u0004\u0012\u00020\t0\u00048\u0002X\u0004¢\u0006\u0006\n\u0004\b\n\u00100R,\u0010\u000e\u001a\u001a\u0012\b\u0012\u00060\u0006j\u0002`\u0007\u0012\f\u0012\n\u0018\u00010\fj\u0004\u0018\u0001`\r0\u000b8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u000e\u00101R\u0014\u0010\u0010\u001a\u00020\u000f8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0010\u00102R\u0014\u0010\u0012\u001a\u00020\u00118\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0012\u00103R8\u00106\u001a&\u0012\b\u0012\u00060\fj\u0002`\r\u0012\u0004\u0012\u00020\u001a04j\u0012\u0012\b\u0012\u00060\fj\u0002`\r\u0012\u0004\u0012\u00020\u001a`58\u0002X\u0004¢\u0006\u0006\n\u0004\b6\u00107R\u0016\u00108\u001a\u00020$8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b8\u00109R\u0016\u0010'\u001a\u00020\u001c8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b'\u0010:¨\u0006;"}, d2 = {"Lru/ok/android/externcalls/sdk/stereo/hands/StereoRoomHandsQueueImpl;", "Lru/ok/android/externcalls/sdk/stereo/hands/StereoRoomHandsQueue;", "Lru/ok/android/externcalls/sdk/stereo/internal/command/StereoRoomCommandExecutor;", "commandExecutor", "Lkotlin/Function2;", "", "Lge1;", "Lru/ok/android/externcalls/sdk/id/InternalId;", "Lkotlin/Function0;", "Ljue;", "idsResolverHelper", "Lkotlin/Function1;", "Lru/ok/android/externcalls/sdk/id/ParticipantId;", "Lru/ok/android/externcalls/sdk/id/ExternalId;", "getExternalId", "Lru/ok/android/externcalls/sdk/stereo/internal/listener/StereoRoomListenerManagerImpl;", "listenersManager", "Leje;", "timeProvider", "<init>", "(Lru/ok/android/externcalls/sdk/stereo/internal/command/StereoRoomCommandExecutor;Li26;Lu16;Lru/ok/android/externcalls/sdk/stereo/internal/listener/StereoRoomListenerManagerImpl;Leje;)V", "onSuccess", "", "onError", "loadHandsQueue", "(Ls16;Lu16;)V", "Lru/ok/android/externcalls/sdk/stereo/hands/StereoHandQueueItem;", "item", "", "raised", "participantHandChanged", "(Lru/ok/android/externcalls/sdk/stereo/hands/StereoHandQueueItem;Z)V", "notifyHandsStatusChanged", "()V", "getQueue", "()Ljava/util/List;", "", "getTotalCount", "()I", "hasMore", "()Z", "loadMoreElements", "(Lu16;Lu16;)V", "Lgn1;", "event", "onHandUp", "(Lgn1;)V", "Lru/ok/android/externcalls/sdk/stereo/internal/command/StereoRoomCommandExecutor;", "Li26;", "Lu16;", "Lru/ok/android/externcalls/sdk/stereo/internal/listener/StereoRoomListenerManagerImpl;", "Leje;", "Ljava/util/HashMap;", "Lkotlin/collections/HashMap;", "handQueue", "Ljava/util/HashMap;", "totalCount", "I", "Z", "calls-sdk_release"}, k = 1, mv = {1, 9, 0})
public final class StereoRoomHandsQueueImpl implements StereoRoomHandsQueue {
    private final StereoRoomCommandExecutor commandExecutor;
    /* access modifiers changed from: private */
    public final u16 getExternalId;
    private final HashMap<ParticipantId, StereoHandQueueItem> handQueue = new HashMap<>();
    /* access modifiers changed from: private */
    public boolean hasMore = true;
    /* access modifiers changed from: private */
    public final i26 idsResolverHelper;
    private final StereoRoomListenerManagerImpl listenersManager;
    /* access modifiers changed from: private */
    public final eje timeProvider;
    /* access modifiers changed from: private */
    public int totalCount;

    public StereoRoomHandsQueueImpl(StereoRoomCommandExecutor stereoRoomCommandExecutor, i26 i26, u16 u16, StereoRoomListenerManagerImpl stereoRoomListenerManagerImpl, eje eje) {
        this.commandExecutor = stereoRoomCommandExecutor;
        this.idsResolverHelper = i26;
        this.getExternalId = u16;
        this.listenersManager = stereoRoomListenerManagerImpl;
        this.timeProvider = eje;
    }

    private final void loadHandsQueue(s16 s16, u16 u16) {
        this.commandExecutor.getHandsQueue(new StereoRoomHandsQueueImpl$loadHandsQueue$1(this, s16), u16);
    }

    public static /* synthetic */ void loadHandsQueue$default(StereoRoomHandsQueueImpl stereoRoomHandsQueueImpl, s16 s16, u16 u16, int i, Object obj) {
        if ((i & 2) != 0) {
            u16 = null;
        }
        stereoRoomHandsQueueImpl.loadHandsQueue(s16, u16);
    }

    /* access modifiers changed from: private */
    public final void notifyHandsStatusChanged() {
        this.listenersManager.onHandStatusChange(new StereoRoomManagerListener.HandStatusUpdated(this.totalCount, getQueue()));
    }

    /* access modifiers changed from: private */
    public final void participantHandChanged(StereoHandQueueItem stereoHandQueueItem, boolean z) {
        if (z) {
            this.handQueue.put(stereoHandQueueItem.getParticipantId(), stereoHandQueueItem);
        } else {
            this.handQueue.remove(stereoHandQueueItem.getParticipantId());
        }
    }

    public int getTotalCount() {
        return this.totalCount;
    }

    public boolean hasMore() {
        return this.hasMore;
    }

    public void loadMoreElements(u16 u16, u16 u162) {
        loadHandsQueue(new StereoRoomHandsQueueImpl$loadMoreElements$1(u16, this), u162);
    }

    public final void onHandUp(gn1 gn1) {
        this.idsResolverHelper.invoke(o23.i0(gn1.b, gn1.c), new StereoRoomHandsQueueImpl$onHandUp$1(gn1, this));
    }

    public List<StereoHandQueueItem> getQueue() {
        HashMap<ParticipantId, StereoHandQueueItem> hashMap = this.handQueue;
        ArrayList arrayList = new ArrayList();
        for (Map.Entry<ParticipantId, StereoHandQueueItem> value : hashMap.entrySet()) {
            StereoHandQueueItem stereoHandQueueItem = (StereoHandQueueItem) value.getValue();
            if (stereoHandQueueItem != null) {
                arrayList.add(stereoHandQueueItem);
            }
        }
        return o23.m0(arrayList, new StereoRoomHandsQueueImpl$getQueue$$inlined$sortedBy$1());
    }
}

package ru.ok.android.externcalls.sdk.stereo.hands;

import java.util.Collection;
import kotlin.Metadata;

@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u001e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001J\u0015\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H&¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H&¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\n\u001a\u00020\tH&¢\u0006\u0004\b\n\u0010\u000bJ?\u0010\u0011\u001a\u00020\r2\u0016\b\u0002\u0010\u000e\u001a\u0010\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\r\u0018\u00010\f2\u0016\b\u0002\u0010\u0010\u001a\u0010\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\r\u0018\u00010\fH&¢\u0006\u0004\b\u0011\u0010\u0012ø\u0001\u0000\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0013À\u0006\u0001"}, d2 = {"Lru/ok/android/externcalls/sdk/stereo/hands/StereoRoomHandsQueue;", "", "", "Lru/ok/android/externcalls/sdk/stereo/hands/StereoHandQueueItem;", "getQueue", "()Ljava/util/Collection;", "", "getTotalCount", "()I", "", "hasMore", "()Z", "Lkotlin/Function1;", "Ljue;", "onSuccess", "", "onError", "loadMoreElements", "(Lu16;Lu16;)V", "calls-sdk_release"}, k = 1, mv = {1, 9, 0})
public interface StereoRoomHandsQueue {
    static /* synthetic */ void loadMoreElements$default(StereoRoomHandsQueue stereoRoomHandsQueue, u16 u16, u16 u162, int i, Object obj) {
        if (obj == null) {
            if ((i & 1) != 0) {
                u16 = null;
            }
            if ((i & 2) != 0) {
                u162 = null;
            }
            stereoRoomHandsQueue.loadMoreElements(u16, u162);
            return;
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: loadMoreElements");
    }

    Collection<StereoHandQueueItem> getQueue();

    int getTotalCount();

    boolean hasMore();

    void loadMoreElements(u16 u16, u16 u162);
}

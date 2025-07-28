package ru.ok.android.externcalls.sdk.stereo;

import kotlin.Metadata;
import ru.ok.android.externcalls.sdk.id.ParticipantId;
import ru.ok.android.externcalls.sdk.stereo.hands.StereoRoomHandsQueue;
import ru.ok.android.externcalls.sdk.stereo.listener.StereoRoomListenerManager;

@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001J5\u0010\b\u001a\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0016\b\u0002\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0005H&¢\u0006\u0004\b\b\u0010\tJ5\u0010\n\u001a\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0016\b\u0002\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0005H&¢\u0006\u0004\b\n\u0010\tJ5\u0010\u000b\u001a\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0016\b\u0002\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0005H&¢\u0006\u0004\b\u000b\u0010\tJ5\u0010\f\u001a\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0016\b\u0002\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0005H&¢\u0006\u0004\b\f\u0010\tJA\u0010\u0010\u001a\u00020\u00032\n\u0010\u000f\u001a\u00060\rj\u0002`\u000e2\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0016\b\u0002\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0005H&¢\u0006\u0004\b\u0010\u0010\u0011JA\u0010\u0012\u001a\u00020\u00032\n\u0010\u000f\u001a\u00060\rj\u0002`\u000e2\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0016\b\u0002\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0005H&¢\u0006\u0004\b\u0012\u0010\u0011JA\u0010\u0013\u001a\u00020\u00032\n\u0010\u000f\u001a\u00060\rj\u0002`\u000e2\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0016\b\u0002\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0005H&¢\u0006\u0004\b\u0013\u0010\u0011JA\u0010\u0014\u001a\u00020\u00032\n\u0010\u000f\u001a\u00060\rj\u0002`\u000e2\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0016\b\u0002\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0005H&¢\u0006\u0004\b\u0014\u0010\u0011JA\u0010\u0015\u001a\u00020\u00032\n\u0010\u000f\u001a\u00060\rj\u0002`\u000e2\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0016\b\u0002\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0005H&¢\u0006\u0004\b\u0015\u0010\u0011JA\u0010\u0016\u001a\u00020\u00032\n\u0010\u000f\u001a\u00060\rj\u0002`\u000e2\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0016\b\u0002\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0005H&¢\u0006\u0004\b\u0016\u0010\u0011R\u0014\u0010\u0018\u001a\u00020\u00178&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u0019R\u0014\u0010\u001d\u001a\u00020\u001a8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u001b\u0010\u001cø\u0001\u0000\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u001eÀ\u0006\u0001"}, d2 = {"Lru/ok/android/externcalls/sdk/stereo/StereoRoomManager;", "Lru/ok/android/externcalls/sdk/stereo/listener/StereoRoomListenerManager;", "Lkotlin/Function0;", "Ljue;", "onSuccess", "Lkotlin/Function1;", "", "onError", "requestPromotion", "(Ls16;Lu16;)V", "cancelPromotionRequest", "acceptPromotion", "rejectPromotion", "Lru/ok/android/externcalls/sdk/id/ParticipantId;", "Lru/ok/android/externcalls/sdk/id/ExternalId;", "participantId", "promoteParticipant", "(Lru/ok/android/externcalls/sdk/id/ParticipantId;Ls16;Lu16;)V", "rejectPromotionRequest", "revokePromotion", "unpromoteParticipant", "grantAdmin", "revokeAdmin", "", "isMePromoted", "()Z", "Lru/ok/android/externcalls/sdk/stereo/hands/StereoRoomHandsQueue;", "getHandsQueue", "()Lru/ok/android/externcalls/sdk/stereo/hands/StereoRoomHandsQueue;", "handsQueue", "calls-sdk_release"}, k = 1, mv = {1, 9, 0})
public interface StereoRoomManager extends StereoRoomListenerManager {
    static /* synthetic */ void acceptPromotion$default(StereoRoomManager stereoRoomManager, s16 s16, u16 u16, int i, Object obj) {
        if (obj == null) {
            if ((i & 2) != 0) {
                u16 = null;
            }
            stereoRoomManager.acceptPromotion(s16, u16);
            return;
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: acceptPromotion");
    }

    static /* synthetic */ void cancelPromotionRequest$default(StereoRoomManager stereoRoomManager, s16 s16, u16 u16, int i, Object obj) {
        if (obj == null) {
            if ((i & 2) != 0) {
                u16 = null;
            }
            stereoRoomManager.cancelPromotionRequest(s16, u16);
            return;
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: cancelPromotionRequest");
    }

    static /* synthetic */ void grantAdmin$default(StereoRoomManager stereoRoomManager, ParticipantId participantId, s16 s16, u16 u16, int i, Object obj) {
        if (obj == null) {
            if ((i & 4) != 0) {
                u16 = null;
            }
            stereoRoomManager.grantAdmin(participantId, s16, u16);
            return;
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: grantAdmin");
    }

    static /* synthetic */ void promoteParticipant$default(StereoRoomManager stereoRoomManager, ParticipantId participantId, s16 s16, u16 u16, int i, Object obj) {
        if (obj == null) {
            if ((i & 4) != 0) {
                u16 = null;
            }
            stereoRoomManager.promoteParticipant(participantId, s16, u16);
            return;
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: promoteParticipant");
    }

    static /* synthetic */ void rejectPromotion$default(StereoRoomManager stereoRoomManager, s16 s16, u16 u16, int i, Object obj) {
        if (obj == null) {
            if ((i & 2) != 0) {
                u16 = null;
            }
            stereoRoomManager.rejectPromotion(s16, u16);
            return;
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: rejectPromotion");
    }

    static /* synthetic */ void rejectPromotionRequest$default(StereoRoomManager stereoRoomManager, ParticipantId participantId, s16 s16, u16 u16, int i, Object obj) {
        if (obj == null) {
            if ((i & 4) != 0) {
                u16 = null;
            }
            stereoRoomManager.rejectPromotionRequest(participantId, s16, u16);
            return;
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: rejectPromotionRequest");
    }

    static /* synthetic */ void requestPromotion$default(StereoRoomManager stereoRoomManager, s16 s16, u16 u16, int i, Object obj) {
        if (obj == null) {
            if ((i & 2) != 0) {
                u16 = null;
            }
            stereoRoomManager.requestPromotion(s16, u16);
            return;
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: requestPromotion");
    }

    static /* synthetic */ void revokeAdmin$default(StereoRoomManager stereoRoomManager, ParticipantId participantId, s16 s16, u16 u16, int i, Object obj) {
        if (obj == null) {
            if ((i & 4) != 0) {
                u16 = null;
            }
            stereoRoomManager.revokeAdmin(participantId, s16, u16);
            return;
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: revokeAdmin");
    }

    static /* synthetic */ void revokePromotion$default(StereoRoomManager stereoRoomManager, ParticipantId participantId, s16 s16, u16 u16, int i, Object obj) {
        if (obj == null) {
            if ((i & 4) != 0) {
                u16 = null;
            }
            stereoRoomManager.revokePromotion(participantId, s16, u16);
            return;
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: revokePromotion");
    }

    static /* synthetic */ void unpromoteParticipant$default(StereoRoomManager stereoRoomManager, ParticipantId participantId, s16 s16, u16 u16, int i, Object obj) {
        if (obj == null) {
            if ((i & 4) != 0) {
                u16 = null;
            }
            stereoRoomManager.unpromoteParticipant(participantId, s16, u16);
            return;
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: unpromoteParticipant");
    }

    void acceptPromotion(s16 s16, u16 u16);

    void cancelPromotionRequest(s16 s16, u16 u16);

    StereoRoomHandsQueue getHandsQueue();

    void grantAdmin(ParticipantId participantId, s16 s16, u16 u16);

    boolean isMePromoted();

    void promoteParticipant(ParticipantId participantId, s16 s16, u16 u16);

    void rejectPromotion(s16 s16, u16 u16);

    void rejectPromotionRequest(ParticipantId participantId, s16 s16, u16 u16);

    void requestPromotion(s16 s16, u16 u16);

    void revokeAdmin(ParticipantId participantId, s16 s16, u16 u16);

    void revokePromotion(ParticipantId participantId, s16 s16, u16 u16);

    void unpromoteParticipant(ParticipantId participantId, s16 s16, u16 u16);
}

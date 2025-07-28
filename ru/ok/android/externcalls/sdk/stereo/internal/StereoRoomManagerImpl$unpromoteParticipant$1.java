package ru.ok.android.externcalls.sdk.stereo.internal;

import kotlin.Metadata;
import ru.ok.android.externcalls.sdk.id.ParticipantId;

@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Ljue;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
public final class StereoRoomManagerImpl$unpromoteParticipant$1 extends b97 implements s16 {
    final /* synthetic */ u16 $onError;
    final /* synthetic */ s16 $onSuccess;
    final /* synthetic */ ParticipantId $participantId;
    final /* synthetic */ StereoRoomManagerImpl this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public StereoRoomManagerImpl$unpromoteParticipant$1(StereoRoomManagerImpl stereoRoomManagerImpl, ParticipantId participantId, s16 s16, u16 u16) {
        super(0);
        this.this$0 = stereoRoomManagerImpl;
        this.$participantId = participantId;
        this.$onSuccess = s16;
        this.$onError = u16;
    }

    public final void invoke() {
        this.this$0.unpromoteParticipantImpl(this.$participantId, this.$onSuccess, this.$onError);
    }
}

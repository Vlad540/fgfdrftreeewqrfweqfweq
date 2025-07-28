package ru.ok.android.externcalls.sdk.stereo.internal;

import kotlin.Metadata;
import ru.ok.android.externcalls.sdk.stereo.internal.command.StereoRoomCommandExecutor;

@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u00032\n\u0010\u0002\u001a\u00060\u0000j\u0002`\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lge1;", "Lru/ok/android/externcalls/sdk/id/InternalId;", "internalId", "Ljue;", "invoke", "(Lge1;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
public final class StereoRoomManagerImpl$unpromoteParticipantImpl$1 extends b97 implements u16 {
    final /* synthetic */ u16 $onError;
    final /* synthetic */ s16 $onSuccess;
    final /* synthetic */ StereoRoomManagerImpl this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public StereoRoomManagerImpl$unpromoteParticipantImpl$1(StereoRoomManagerImpl stereoRoomManagerImpl, s16 s16, u16 u16) {
        super(1);
        this.this$0 = stereoRoomManagerImpl;
        this.$onSuccess = s16;
        this.$onError = u16;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((ge1) obj);
        return jue.a;
    }

    public final void invoke(ge1 ge1) {
        this.this$0.commandExecutor.promoteParticipant(new StereoRoomCommandExecutor.PromoteParticipantParams(ge1, false), this.$onSuccess, this.$onError);
    }
}

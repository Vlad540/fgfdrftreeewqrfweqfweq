package defpackage;

import one.me.android.OneMeApplication;
import ru.ok.android.externcalls.sdk.factory.BaseCallParams;
import ru.ok.android.externcalls.sdk.sessionroom.internal.participant.SessionRoomParticipantsDataProviderImpl;
import ru.ok.android.externcalls.sdk.stereo.internal.StereoRoomManagerImpl;

/* renamed from: tg0  reason: default package */
public final /* synthetic */ class tg0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ s16 b;

    public /* synthetic */ tg0(int i, s16 s16) {
        this.a = i;
        this.b = s16;
    }

    public final void run() {
        s16 s16 = this.b;
        switch (this.a) {
            case 0:
                BaseCallParams.Builder.setOnPrepared$lambda$6$lambda$5(s16);
                return;
            case 1:
                s16.invoke();
                return;
            case 2:
                s16.invoke();
                return;
            case 3:
                s16.invoke();
                return;
            case 4:
                s16.invoke();
                return;
            case 5:
                s16.invoke();
                return;
            case 6:
                int i = OneMeApplication.w0;
                s16.invoke();
                return;
            case 7:
                SessionRoomParticipantsDataProviderImpl.resolveParticipantIds$lambda$8(s16);
                return;
            case 8:
                StereoRoomManagerImpl.revokeRoles$lambda$6(s16);
                return;
            case 9:
                StereoRoomManagerImpl.resolveIdsAndThen$lambda$9(s16);
                return;
            case 10:
                StereoRoomManagerImpl.grantAdmin$lambda$2$lambda$0(s16);
                return;
            default:
                StereoRoomManagerImpl.revokeAdmin$lambda$5$lambda$3(s16);
                return;
        }
    }
}

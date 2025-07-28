package defpackage;

import ru.ok.android.externcalls.sdk.sessionroom.internal.participant.SessionRoomParticipantsDataProviderImpl;
import ru.ok.android.externcalls.sdk.stereo.internal.StereoRoomManagerImpl;

/* renamed from: x2d  reason: default package */
public final /* synthetic */ class x2d implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ u16 b;

    public /* synthetic */ x2d(int i, u16 u16) {
        this.a = i;
        this.b = u16;
    }

    public final void run() {
        int i = this.a;
        u16 u16 = this.b;
        switch (i) {
            case 0:
                SessionRoomParticipantsDataProviderImpl.resolveParticipantIds$lambda$9(u16);
                return;
            case 1:
                StereoRoomManagerImpl.revokeRoles$lambda$7(u16);
                return;
            case 2:
                StereoRoomManagerImpl.grantAdmin$lambda$2$lambda$1(u16);
                return;
            default:
                StereoRoomManagerImpl.revokeAdmin$lambda$5$lambda$4(u16);
                return;
        }
    }
}

package defpackage;

import org.json.JSONObject;
import ru.ok.android.externcalls.sdk.stereo.internal.command.StereoRoomCommandExecutorImpl;

/* renamed from: nsd  reason: default package */
public final /* synthetic */ class nsd implements lfd {
    public final /* synthetic */ int a;
    public final /* synthetic */ StereoRoomCommandExecutorImpl b;
    public final /* synthetic */ u16 c;

    public /* synthetic */ nsd(StereoRoomCommandExecutorImpl stereoRoomCommandExecutorImpl, u16 u16, int i) {
        this.a = i;
        this.b = stereoRoomCommandExecutorImpl;
        this.c = u16;
    }

    public final void k(JSONObject jSONObject) {
        switch (this.a) {
            case 0:
                StereoRoomCommandExecutorImpl.getHandsQueue$lambda$9(this.b, this.c, jSONObject);
                return;
            case 1:
                StereoRoomCommandExecutorImpl.requestPromotion$lambda$3(this.b, this.c, jSONObject);
                return;
            case 2:
                StereoRoomCommandExecutorImpl.acceptPromotion$lambda$5(this.b, this.c, jSONObject);
                return;
            default:
                StereoRoomCommandExecutorImpl.promoteParticipant$lambda$1(this.b, this.c, jSONObject);
                return;
        }
    }
}

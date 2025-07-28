package defpackage;

import org.json.JSONObject;
import ru.ok.android.externcalls.sdk.sessionroom.internal.command.SessionRoomCommandExecutorImpl;

/* renamed from: t2d  reason: default package */
public final /* synthetic */ class t2d implements lfd {
    public final /* synthetic */ int a;
    public final /* synthetic */ SessionRoomCommandExecutorImpl b;
    public final /* synthetic */ u16 c;

    public /* synthetic */ t2d(SessionRoomCommandExecutorImpl sessionRoomCommandExecutorImpl, u16 u16, int i) {
        this.a = i;
        this.b = sessionRoomCommandExecutorImpl;
        this.c = u16;
    }

    public final void k(JSONObject jSONObject) {
        switch (this.a) {
            case 0:
                SessionRoomCommandExecutorImpl.joinRoom$lambda$3(this.b, this.c, jSONObject);
                return;
            case 1:
                SessionRoomCommandExecutorImpl.leaveRoom$lambda$5(this.b, this.c, jSONObject);
                return;
            default:
                SessionRoomCommandExecutorImpl.requestAttention$lambda$1(this.b, this.c, jSONObject);
                return;
        }
    }
}

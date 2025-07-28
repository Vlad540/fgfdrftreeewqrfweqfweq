package defpackage;

import org.json.JSONObject;
import ru.ok.android.externcalls.sdk.sessionroom.internal.command.SessionRoomAdminCommandExecutorImpl;

/* renamed from: r2d  reason: default package */
public final /* synthetic */ class r2d implements lfd {
    public final /* synthetic */ int a;
    public final /* synthetic */ SessionRoomAdminCommandExecutorImpl b;
    public final /* synthetic */ u16 c;

    public /* synthetic */ r2d(SessionRoomAdminCommandExecutorImpl sessionRoomAdminCommandExecutorImpl, u16 u16, int i) {
        this.a = i;
        this.b = sessionRoomAdminCommandExecutorImpl;
        this.c = u16;
    }

    public final void k(JSONObject jSONObject) {
        switch (this.a) {
            case 0:
                SessionRoomAdminCommandExecutorImpl.switchRoom$lambda$5(this.b, this.c, jSONObject);
                return;
            default:
                SessionRoomAdminCommandExecutorImpl.updateRooms$lambda$7(this.b, this.c, jSONObject);
                return;
        }
    }
}

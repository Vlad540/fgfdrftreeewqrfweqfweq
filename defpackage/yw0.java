package defpackage;

import java.util.Map;
import org.json.JSONObject;
import ru.ok.android.externcalls.sdk.participant.state.internal.ParticipantStatesManagerImpl;
import ru.ok.android.externcalls.sdk.stereo.internal.command.StereoRoomCommandExecutorImpl;

/* renamed from: yw0  reason: default package */
public final /* synthetic */ class yw0 implements lfd {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object o;

    public /* synthetic */ yw0(Object obj, Object obj2, Object obj3, int i) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
        this.o = obj3;
    }

    public final void k(JSONObject jSONObject) {
        switch (this.a) {
            case 0:
                kn1 p = ((gx0) this.b).R1.p(jSONObject);
                if (p != null) {
                    ((pf3) this.c).accept(p);
                    return;
                } else {
                    ((Runnable) this.o).run();
                    return;
                }
            case 1:
                JSONObject optJSONObject = jSONObject.optJSONObject("rooms");
                dgd C = optJSONObject != null ? ((ul7) ((otf) this.b).a).C(optJSONObject) : null;
                if (C == null) {
                    ((u16) this.c).invoke(new RuntimeException("Can't parse rooms from " + jSONObject));
                    return;
                }
                ((u16) this.o).invoke(C);
                return;
            case 2:
                ParticipantStatesManagerImpl.updateOwnStateInternal$lambda$19((lfd) this.b, (ParticipantStatesManagerImpl) this.c, (Map) this.o, jSONObject);
                return;
            default:
                StereoRoomCommandExecutorImpl.getHandsQueue$lambda$8((StereoRoomCommandExecutorImpl) this.b, (u16) this.c, (k26) this.o, jSONObject);
                return;
        }
    }
}

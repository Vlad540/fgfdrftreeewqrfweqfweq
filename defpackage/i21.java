package defpackage;

import org.json.JSONObject;
import ru.ok.android.externcalls.sdk.factory.StartCallParams;

/* renamed from: i21  reason: default package */
public final /* synthetic */ class i21 implements u16 {
    public final /* synthetic */ l21 X;
    public final /* synthetic */ u16 Y;
    public final /* synthetic */ u16 Z;
    public final /* synthetic */ vk1 a;
    public final /* synthetic */ JSONObject b;
    public final /* synthetic */ long c;
    public final /* synthetic */ gpd o;

    public /* synthetic */ i21(vk1 vk1, JSONObject jSONObject, long j, gpd gpd, l21 l21, to1 to1, f fVar) {
        this.a = vk1;
        this.b = jSONObject;
        this.c = j;
        this.o = gpd;
        this.X = l21;
        this.Y = to1;
        this.Z = fVar;
    }

    public final Object invoke(Object obj) {
        return (StartCallParams) ((StartCallParams.Builder) obj).setOpponentId(xja.c(this.a.c)).setPayload(this.b.toString()).setWatchTogetherEnabledForAll(false).setMyId(xja.c(this.c)).setStartWithVideo(this.o.b).setEventListener((vp1) this.X.b.getValue()).setOnPrepared(this.Y).setOnError(this.Z).build();
    }
}

package defpackage;

import org.json.JSONObject;
import ru.ok.android.externcalls.sdk.factory.CreateConfParams;
import ru.ok.android.externcalls.sdk.factory.JoinByLinkParams;

/* renamed from: h21  reason: default package */
public final /* synthetic */ class h21 implements u16 {
    public final /* synthetic */ u16 X;
    public final /* synthetic */ u16 Y;
    public final /* synthetic */ Object Z;
    public final /* synthetic */ int a;
    public final /* synthetic */ long b;
    public final /* synthetic */ gpd c;
    public final /* synthetic */ l21 o;

    public /* synthetic */ h21(Object obj, long j, gpd gpd, l21 l21, to1 to1, f fVar, int i) {
        this.a = i;
        this.Z = obj;
        this.b = j;
        this.c = gpd;
        this.o = l21;
        this.X = to1;
        this.Y = fVar;
    }

    public final Object invoke(Object obj) {
        switch (this.a) {
            case 0:
                return (CreateConfParams) ((CreateConfParams.Builder) obj).setPayload(((JSONObject) this.Z).toString()).setMyId(xja.c(this.b)).setStartWithVideo(this.c.b).setEventListener((vp1) this.o.b.getValue()).setOnPrepared(this.X).setOnError(this.Y).build();
            default:
                return (JoinByLinkParams) ((JoinByLinkParams.Builder) obj).setLink((String) this.Z).setMyId(xja.c(this.b)).setStartWithVideo(this.c.b).setEventListener((vp1) this.o.b.getValue()).setOnPrepared(this.X).setOnError(this.Y).build();
        }
    }
}

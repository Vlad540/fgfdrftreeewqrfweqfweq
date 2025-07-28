package defpackage;

import org.json.JSONObject;
import ru.ok.android.externcalls.sdk.record.internal.RecordManagerImpl;

/* renamed from: l5c  reason: default package */
public final /* synthetic */ class l5c implements lfd {
    public final /* synthetic */ int a;
    public final /* synthetic */ RecordManagerImpl b;
    public final /* synthetic */ u16 c;

    public /* synthetic */ l5c(RecordManagerImpl recordManagerImpl, u16 u16, int i) {
        this.a = i;
        this.b = recordManagerImpl;
        this.c = u16;
    }

    public final void k(JSONObject jSONObject) {
        switch (this.a) {
            case 0:
                RecordManagerImpl.stopRecord$lambda$3(this.b, this.c, jSONObject);
                return;
            default:
                RecordManagerImpl.startRecord$lambda$1(this.b, this.c, jSONObject);
                return;
        }
    }
}

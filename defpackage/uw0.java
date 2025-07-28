package defpackage;

import org.json.JSONException;
import org.json.JSONObject;
import ru.ok.android.externcalls.analytics.internal.upload.MultiFileUploader;

/* renamed from: uw0  reason: default package */
public final /* synthetic */ class uw0 implements lfd {
    public final /* synthetic */ Object X;
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object o;

    public /* synthetic */ uw0(gx0 gx0, ge1 ge1, lfd lfd) {
        this.b = gx0;
        this.c = ge1;
        this.o = null;
        this.X = lfd;
    }

    public final void k(JSONObject jSONObject) {
        lfd lfd;
        switch (this.a) {
            case 0:
                ge1 ge1 = (ge1) this.c;
                gx0 gx0 = (gx0) this.b;
                xwb xwb = gx0.Z0;
                xwb.log("OKRTCCall", "handle response from signaling on add-participant command");
                try {
                    int i = gxf.b[hr1.t(gx0.y(ge1, jSONObject.optJSONObject("participant")))];
                    if (i == 1) {
                        lfd lfd2 = (lfd) this.o;
                        if (lfd2 != null) {
                            lfd2.k(jSONObject);
                            return;
                        }
                        return;
                    } else if (i == 2 && (lfd = (lfd) this.X) != null) {
                        lfd.k(new JSONObject().put("error", (Object) "state.accepted"));
                        return;
                    } else {
                        return;
                    }
                } catch (JSONException e) {
                    xwb.reportException("OKRTCCall", "add.participant.success", e);
                    return;
                }
            default:
                JSONObject optJSONObject = jSONObject.optJSONObject(MultiFileUploader.CHUNK_FILE_NAME_PREFIX);
                agd S = optJSONObject != null ? ((mn) ((afc) this.b).a).S(optJSONObject, (w2d) ((lhd) this.c).b) : null;
                if (S == null) {
                    ((u16) this.o).invoke(new RuntimeException("Can't parse chunk " + jSONObject));
                    return;
                }
                ((u16) this.X).invoke(S);
                return;
        }
    }

    public /* synthetic */ uw0(afc afc, lhd lhd, h87 h87, av3 av3) {
        this.b = afc;
        this.c = lhd;
        this.o = h87;
        this.X = av3;
    }
}

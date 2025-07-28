package defpackage;

import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: kz0  reason: default package */
public final class kz0 implements hj1 {
    public final otf a;
    public final ob1 b;

    public kz0(otf otf, ob1 ob1) {
        this.a = otf;
        this.b = ob1;
        ob1.h.a.add(this);
    }

    public final void a(afc afc) {
        ob1 ob1 = this.b;
        v2d v2d = (v2d) afc.b;
        fz0 fz0 = (fz0) afc.a;
        if (fz0 == null) {
            ob1.m.onAsrRecordStopped(new hz0(v2d));
        } else {
            ob1.m.onAsrRecordStarted(new gz0(v2d, fz0));
        }
    }

    public final void b(JSONObject jSONObject) {
        otf otf = this.a;
        otf.getClass();
        ts tsVar = null;
        try {
            fz0 M = otf.M(jSONObject.getJSONObject("asrInfo"));
            if (M != null) {
                ((jk9) otf.b).getClass();
                tsVar = new ts(jk9.q(jSONObject), M);
            }
        } catch (JSONException e) {
            ((xwb) otf.a).logException("AsrParser", "Can't parse record start info", e);
        }
        if (tsVar != null) {
            this.b.m.onAsrRecordStarted(new gz0(tsVar.a, tsVar.b));
        }
    }

    public final void c(JSONObject jSONObject) {
        us usVar;
        otf otf = this.a;
        otf.getClass();
        try {
            ((jk9) otf.b).getClass();
            usVar = new us(jk9.q(jSONObject));
        } catch (JSONException e) {
            ((xwb) otf.a).logException("AsrParser", "Can't parse record stop info", e);
            usVar = null;
        }
        if (usVar != null) {
            this.b.m.onAsrRecordStopped(new hz0(usVar.a));
        }
    }
}

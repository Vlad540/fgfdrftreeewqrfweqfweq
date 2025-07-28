package defpackage;

import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: zf8  reason: default package */
public final /* synthetic */ class zf8 implements s16 {
    public final /* synthetic */ int a;
    public final /* synthetic */ ag8 b;

    public /* synthetic */ zf8(ag8 ag8, int i) {
        this.a = i;
        this.b = ag8;
    }

    public final Object invoke() {
        switch (this.a) {
            case 0:
                ag8 ag8 = this.b;
                String str = ag8.a;
                if (str == null) {
                    return null;
                }
                try {
                    return new JSONObject(str);
                } catch (JSONException e) {
                    udd.s(ag8.b, "Failed to parse media transform params", e);
                    return null;
                }
            case 1:
                JSONObject jSONObject = (JSONObject) this.b.c.getValue();
                boolean z = false;
                if (jSONObject != null) {
                    z = jSONObject.optBoolean("enabled", false);
                }
                return Boolean.valueOf(z);
            case 2:
                JSONObject jSONObject2 = (JSONObject) this.b.c.getValue();
                boolean z2 = false;
                if (jSONObject2 != null) {
                    z2 = jSONObject2.optBoolean("hevc_enabled", false);
                }
                return Boolean.valueOf(z2);
            default:
                JSONObject jSONObject3 = (JSONObject) this.b.c.getValue();
                boolean z3 = false;
                if (jSONObject3 != null) {
                    z3 = jSONObject3.optBoolean("hdr_enabled", false);
                }
                return Boolean.valueOf(z3);
        }
    }
}

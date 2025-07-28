package defpackage;

import java.net.URL;
import org.json.JSONObject;

/* renamed from: iu4  reason: default package */
public final class iu4 {
    public final URL a;
    public final JSONObject b;

    public iu4(JSONObject jSONObject, String str) {
        URL url;
        this.a = new URL(str);
        this.b = jSONObject;
        jSONObject.optInt("width");
        jSONObject.optInt("height");
        String optString = jSONObject.optString("staticUrl");
        if (optString != null) {
            try {
                url = new URL(optString);
            } catch (Throwable th) {
                url = new kcc(th);
            }
            URL url2 = url instanceof kcc ? null : url;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof iu4)) {
            return false;
        }
        iu4 iu4 = (iu4) obj;
        return hhd.f(this.a, iu4.a) && hhd.f(this.b, iu4.b);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        JSONObject jSONObject = this.b;
        return hashCode + (jSONObject == null ? 0 : jSONObject.hashCode());
    }

    public final String toString() {
        return "Animation(url=" + this.a + ", otherProperties=" + this.b + ")";
    }
}

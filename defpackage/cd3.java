package defpackage;

import org.apache.http.cookie.ClientCookie;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: cd3  reason: default package */
public final class cd3 {
    public final String a;
    public final String b;
    public final boolean c;
    public final r7e d = new r7e(new nl1(17, this));

    public cd3(String str, String str2, boolean z) {
        this.a = str;
        this.b = str2;
        this.c = z;
    }

    public static final cd3 a(JSONObject jSONObject) {
        try {
            return new cd3(jSONObject.optString("host"), jSONObject.optString(ClientCookie.PORT_ATTR), jSONObject.optBoolean("tls", true));
        } catch (JSONException unused) {
            return null;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cd3)) {
            return false;
        }
        cd3 cd3 = (cd3) obj;
        return hhd.f(this.a, cd3.a) && hhd.f(this.b, cd3.b) && this.c == cd3.c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.c) + me4.d(this.a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ConnectionHost{host=");
        sb.append(this.a);
        sb.append("|port=");
        sb.append(this.b);
        sb.append("|tls=");
        return hr1.j(sb, this.c, "}");
    }
}

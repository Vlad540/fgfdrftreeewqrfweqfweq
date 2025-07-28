package defpackage;

import android.text.TextUtils;
import java.util.concurrent.TimeUnit;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: dzd  reason: default package */
public final class dzd {
    public static final long d = TimeUnit.DAYS.toMillis(7);
    public static final /* synthetic */ int e = 0;
    public final String a;
    public final String b;
    public final long c;

    public dzd(long j, String str, String str2) {
        this.a = str;
        this.b = str2;
        this.c = j;
    }

    public static dzd a(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        if (!str.startsWith("{")) {
            return new dzd(0, str, (String) null);
        }
        try {
            JSONObject jSONObject = new JSONObject(str);
            return new dzd(jSONObject.getLong("timestamp"), jSONObject.getString("token"), jSONObject.getString("appVersion"));
        } catch (JSONException e2) {
            e2.toString();
            return null;
        }
    }
}

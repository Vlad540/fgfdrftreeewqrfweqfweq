package defpackage;

import android.net.Uri;
import android.os.ConditionVariable;
import java.util.LinkedHashMap;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: j3d  reason: default package */
public final class j3d {
    public volatile ConditionVariable a;

    public final void a(c9e c9e, List list, i3d i3d) {
        nne nne = nne.a;
        String a2 = nne.a();
        if (a2 != null) {
            List<fp4> d = nne.b().d();
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("buildUuid", (Object) c9e.e);
            jSONObject.put("deviceId", (Object) c9e.h);
            jSONObject.put("sessions", (Object) js.F(list));
            if (!d.isEmpty()) {
                JSONArray jSONArray = new JSONArray();
                for (fp4 fp4 : d) {
                    JSONObject jSONObject2 = new JSONObject();
                    jSONObject2.put("event", (Object) fp4.a);
                    jSONObject2.put("reason", (Object) fp4.b);
                    jSONObject2.put("count", fp4.c);
                    jSONArray.put((Object) jSONObject2);
                }
                jSONObject.put("drops", (Object) jSONArray);
            }
            nne nne2 = nne.a;
            Object obj = nne.c().get(xie.a);
            if ((obj instanceof cu3 ? (cu3) obj : null) == null) {
                ju7.W(new LinkedHashMap());
            }
            jg8 jg8 = new jg8(Uri.parse("https://sdk-api.apptracer.ru").buildUpon().appendEncodedPath("api/crash/trackSession").appendQueryParameter("crashToken", a2).toString(), (nm6) mk9.h("application/json; charset=utf-8", jSONObject.toString()));
            ConditionVariable conditionVariable = new ConditionVariable();
            this.a = conditionVariable;
            koe.b(new wc3(jg8, this, d, conditionVariable, i3d));
        }
    }
}

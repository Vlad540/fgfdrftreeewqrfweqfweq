package defpackage;

import android.util.Base64OutputStream;
import java.io.ByteArrayOutputStream;
import java.util.ArrayList;
import java.util.concurrent.Callable;
import java.util.zip.GZIPOutputStream;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: y74  reason: default package */
public final /* synthetic */ class y74 implements Callable {
    public final /* synthetic */ int a;
    public final /* synthetic */ z74 b;

    public /* synthetic */ y74(z74 z74, int i) {
        this.a = i;
        this.b = z74;
    }

    public final Object call() {
        Base64OutputStream base64OutputStream;
        GZIPOutputStream gZIPOutputStream;
        String byteArrayOutputStream;
        switch (this.a) {
            case 0:
                z74 z74 = this.b;
                synchronized (z74) {
                    try {
                        jf6 jf6 = (jf6) z74.a.get();
                        ArrayList c = jf6.c();
                        jf6.b();
                        JSONArray jSONArray = new JSONArray();
                        for (int i = 0; i < c.size(); i++) {
                            n90 n90 = (n90) c.get(i);
                            JSONObject jSONObject = new JSONObject();
                            jSONObject.put("agent", n90.a);
                            jSONObject.put("dates", new JSONArray(n90.b));
                            jSONArray.put(jSONObject);
                        }
                        JSONObject jSONObject2 = new JSONObject();
                        jSONObject2.put("heartbeats", jSONArray);
                        jSONObject2.put("version", "2");
                        ByteArrayOutputStream byteArrayOutputStream2 = new ByteArrayOutputStream();
                        base64OutputStream = new Base64OutputStream(byteArrayOutputStream2, 11);
                        gZIPOutputStream = new GZIPOutputStream(base64OutputStream);
                        gZIPOutputStream.write(jSONObject2.toString().getBytes("UTF-8"));
                        gZIPOutputStream.close();
                        base64OutputStream.close();
                        byteArrayOutputStream = byteArrayOutputStream2.toString("UTF-8");
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                return byteArrayOutputStream;
            default:
                z74 z742 = this.b;
                synchronized (z742) {
                    ((jf6) z742.a.get()).h(System.currentTimeMillis(), ((dc4) z742.c.get()).a());
                }
                return null;
        }
        throw th;
        throw th;
    }
}

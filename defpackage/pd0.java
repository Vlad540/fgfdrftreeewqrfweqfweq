package defpackage;

import android.content.Context;
import android.graphics.Color;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import kotlin.coroutines.Continuation;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: pd0  reason: default package */
public final class pd0 {
    public final t97 a;

    public pd0(t97 t97) {
        this.a = t97;
    }

    public static final p6e a(pd0 pd0, byte[] bArr, d0f d0f) {
        pd0.getClass();
        p6e p6e = new p6e(new String(bArr, e22.a), d0f.b, d0f.c);
        p6e.setAlpha(gwf.j((int) (d0f.d * ((float) 255)), 0, 255));
        p6e.a.g.setXfermode(new PorterDuffXfermode(d0f.e ? PorterDuff.Mode.OVERLAY : PorterDuff.Mode.SRC_OVER));
        Object a2 = do0.a(co0.a);
        p6e.setColorFilter(a2 != null ? bo0.a(d0f.f, a2) : null);
        return p6e;
    }

    public static LinkedHashMap b(Context context, ud0 ud0) {
        c0f c0f;
        ud0 ud02 = ud0;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        try {
            InputStream open = context.getAssets().open("themes.json");
            byte[] bArr = new byte[open.available()];
            open.read(bArr);
            open.close();
            try {
                JSONArray jSONArray = new JSONArray(new String(bArr, e22.a));
                int length = jSONArray.length();
                for (int i = 0; i < length; i++) {
                    JSONObject jSONObject = jSONArray.getJSONObject(i);
                    ud0 ud03 = new ud0(jSONObject.getString("name"));
                    if (ud02 == null || ud02.equals(ud03)) {
                        JSONObject jSONObject2 = jSONObject.has("pattern") ? jSONObject.getJSONObject("pattern") : null;
                        JSONObject jSONObject3 = jSONObject.has("gradient") ? jSONObject.getJSONObject("gradient") : null;
                        d0f d0f = jSONObject2 != null ? new d0f(jSONObject2.getString("image"), a24.X(((float) jSONObject2.getInt("width")) * dh4.c().getDisplayMetrics().density), a24.X(((float) jSONObject2.getInt("height")) * dh4.c().getDisplayMetrics().density), (float) jSONObject2.getDouble("opacity"), jSONObject2.getBoolean("is_overlay"), Color.parseColor(jSONObject2.getString("color"))) : null;
                        if (jSONObject3 != null) {
                            JSONArray jSONArray2 = jSONObject3.getJSONArray("colors");
                            ArrayList arrayList = new ArrayList();
                            int length2 = jSONArray2.length();
                            for (int i2 = 0; i2 < length2; i2++) {
                                arrayList.add(Integer.valueOf(Color.parseColor(jSONArray2.getString(i2))));
                            }
                            if (arrayList.size() > 1) {
                                c0f = new c0f(o23.r0(arrayList), (float) jSONObject3.getDouble("angle"));
                            } else {
                                throw new IllegalArgumentException("Failed requirement.".toString());
                            }
                        } else {
                            c0f = null;
                        }
                        linkedHashMap.put(ud03, new e0f(d0f, c0f));
                    }
                }
            } catch (JSONException e) {
                udd.q("BackgroundDataLoader", "parse theme json failed: " + e);
            }
        } catch (IOException e2) {
            udd.q("BackgroundDataLoader", "load assets failed: " + e2);
        }
        return linkedHashMap;
    }

    public final Object c(Context context, d0f d0f, Continuation continuation) {
        return xs7.U(((pae) this.a.getValue()).b(), new od0(this, context, d0f, (Continuation) null), continuation);
    }
}

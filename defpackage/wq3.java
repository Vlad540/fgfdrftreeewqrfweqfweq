package defpackage;

import android.content.res.Resources;
import android.graphics.Rect;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import java.util.Arrays;
import java.util.Collection;
import java.util.MissingFormatArgumentException;
import one.me.sdk.contextmenu.popup.ContextMenuPopupWindow;
import org.json.JSONArray;
import org.json.JSONException;
import ru.ok.android.externcalls.sdk.api.ApiProtocol;

/* renamed from: wq3  reason: default package */
public final class wq3 implements mq3 {
    public final Bundle a;

    public wq3(Bundle bundle) {
        this.a = new Bundle(bundle);
    }

    public static boolean q(Bundle bundle) {
        return "1".equals(bundle.getString("gcm.n.e")) || "1".equals(bundle.getString("gcm.n.e".replace("gcm.n.", "gcm.notification.")));
    }

    public static void s(String str) {
        if (str.startsWith("gcm.n.")) {
            str.substring(6);
        }
    }

    public mq3 a() {
        Rect rect = bg6.b;
        Rect rect2 = bg6.b;
        Bundle bundle = this.a;
        bundle.putParcelable("highlight_padding", rect2);
        bundle.remove("highlight_radius");
        return this;
    }

    public mq3 b() {
        Bundle bundle = this.a;
        bundle.remove("highlight_padding");
        bundle.remove("highlight_radius");
        return this;
    }

    public nq3 build() {
        return new ContextMenuPopupWindow(new Bundle(this.a));
    }

    public mq3 c(Rect rect, float f) {
        Bundle bundle = this.a;
        bundle.putParcelable("highlight_padding", rect);
        bundle.putFloat("highlight_radius", f);
        return this;
    }

    public mq3 d() {
        this.a.putBoolean("dark_theme", true);
        return this;
    }

    public mq3 e(Collection collection) {
        this.a.putBundle("actions", kjd.e(collection));
        return this;
    }

    public mq3 f(float f, float f2) {
        if (f < 0.0f || f2 < 0.0f) {
            throw new IllegalStateException("Check failed.".toString());
        }
        Bundle bundle = this.a;
        bundle.putFloat("x", f);
        bundle.putFloat("y", f2);
        return this;
    }

    public mq3 g(float f) {
        Rect rect = bg6.b;
        Bundle bundle = this.a;
        bundle.putParcelable("highlight_padding", rect);
        bundle.putFloat("highlight_radius", f);
        return this;
    }

    public mq3 h(Bundle bundle) {
        this.a.putBundle(ApiProtocol.PARAM_PAYLOAD, bundle);
        return this;
    }

    public mq3 i(lge lge) {
        this.a.putParcelable("header", lge);
        return this;
    }

    public mq3 j(View view) {
        if (view.getId() != -1) {
            int id = view.getId();
            Bundle bundle = this.a;
            bundle.putInt("anchor_id", id);
            bundle.putSerializable("anchor_class", view.getClass());
            return this;
        }
        throw new IllegalStateException("Check failed.".toString());
    }

    public mq3 k() {
        this.a.putBoolean("dim", true);
        return this;
    }

    public boolean l(String str) {
        String p = p(str);
        return "1".equals(p) || Boolean.parseBoolean(p);
    }

    public Integer m(String str) {
        String p = p(str);
        if (TextUtils.isEmpty(p)) {
            return null;
        }
        try {
            return Integer.valueOf(Integer.parseInt(p));
        } catch (NumberFormatException unused) {
            s(str);
            return null;
        }
    }

    public JSONArray n(String str) {
        String p = p(str);
        if (TextUtils.isEmpty(p)) {
            return null;
        }
        try {
            return new JSONArray(p);
        } catch (JSONException unused) {
            s(str);
            return null;
        }
    }

    public String o(Resources resources, String str, String str2) {
        String[] strArr;
        String p = p(str2);
        if (!TextUtils.isEmpty(p)) {
            return p;
        }
        String p2 = p(str2.concat("_loc_key"));
        if (TextUtils.isEmpty(p2)) {
            return null;
        }
        int identifier = resources.getIdentifier(p2, "string", str);
        if (identifier == 0) {
            s(str2.concat("_loc_key"));
            return null;
        }
        JSONArray n = n(str2.concat("_loc_args"));
        if (n == null) {
            strArr = null;
        } else {
            int length = n.length();
            strArr = new String[length];
            for (int i = 0; i < length; i++) {
                strArr[i] = n.optString(i);
            }
        }
        if (strArr == null) {
            return resources.getString(identifier);
        }
        try {
            return resources.getString(identifier, strArr);
        } catch (MissingFormatArgumentException unused) {
            s(str2);
            Arrays.toString(strArr);
            return null;
        }
    }

    public String p(String str) {
        Bundle bundle = this.a;
        if (!bundle.containsKey(str) && str.startsWith("gcm.n.")) {
            String replace = !str.startsWith("gcm.n.") ? str : str.replace("gcm.n.", "gcm.notification.");
            if (bundle.containsKey(replace)) {
                str = replace;
            }
        }
        return bundle.getString(str);
    }

    public Bundle r() {
        Bundle bundle = this.a;
        Bundle bundle2 = new Bundle(bundle);
        for (String next : bundle.keySet()) {
            if (!next.startsWith("google.c.a.") && !next.equals("from")) {
                bundle2.remove(next);
            }
        }
        return bundle2;
    }

    public wq3() {
        this.a = new Bundle();
    }
}

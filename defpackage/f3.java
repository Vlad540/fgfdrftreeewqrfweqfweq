package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONException;

/* renamed from: f3  reason: default package */
public abstract class f3 {
    public final String e;
    public final Context f;
    public final x97 g;

    public f3(Context context, String str, we5 we5) {
        this.f = context;
        this.e = "Prefs/" + str.replace(".prefs", "");
        this.g = new x97(context, new ve5(str), we5, new e3((Object) this));
    }

    public static void h(SharedPreferences.Editor editor, String str, Object obj) {
        if (obj instanceof Boolean) {
            editor.putBoolean(str, ((Boolean) obj).booleanValue());
        } else if (obj instanceof Float) {
            editor.putFloat(str, ((Float) obj).floatValue());
        } else if (obj instanceof Double) {
            editor.putFloat(str, ((Double) obj).floatValue());
        } else if (obj instanceof Integer) {
            editor.putInt(str, ((Integer) obj).intValue());
        } else if (obj instanceof Long) {
            editor.putLong(str, ((Long) obj).longValue());
        } else if (obj instanceof String) {
            editor.putString(str, (String) obj);
        } else if (obj instanceof Set) {
            editor.putStringSet(str, (Set) obj);
        } else if (obj instanceof Map) {
            editor.putString(str, h2g.F((Map) obj).toString());
        } else if (obj instanceof List) {
            editor.putString(str, h2g.E((List) obj).toString());
        }
    }

    public void b() {
        udd.p(this.e, "clear: %s", new Object[]{getClass().getSimpleName()});
        te5 edit = this.g.edit();
        edit.clear();
        edit.commit();
    }

    public boolean c(String str, boolean z) {
        return this.g.getBoolean(str, z);
    }

    public final int d(String str, int i) {
        return this.g.getInt(str, i);
    }

    public final long e(String str, long j) {
        return this.g.getLong(str, j);
    }

    public final String f(String str, String str2) {
        return this.g.getString(str, str2);
    }

    public final List g(String str, List list) {
        JSONArray jSONArray = null;
        String f2 = f(str, (String) null);
        if (f2 != null) {
            try {
                jSONArray = new JSONArray(f2);
            } catch (JSONException unused) {
            }
        }
        if (jSONArray == null) {
            return list;
        }
        ArrayList arrayList = new ArrayList(jSONArray.length());
        for (int i = 0; i < jSONArray.length(); i++) {
            try {
                arrayList.add(jSONArray.getString(i));
            } catch (JSONException unused2) {
            }
        }
        return arrayList;
    }

    public final void i(String str, boolean z) {
        te5 edit = this.g.edit();
        edit.putBoolean(str, z);
        edit.apply();
    }

    public final void j(int i, String str) {
        te5 edit = this.g.edit();
        edit.putInt(str, i);
        edit.apply();
    }

    public final void k(String str, Long l) {
        te5 edit = this.g.edit();
        edit.putLong(str, l.longValue());
        edit.apply();
    }

    public final void l(String str, String str2) {
        te5 edit = this.g.edit();
        edit.putString(str, str2);
        edit.apply();
    }
}

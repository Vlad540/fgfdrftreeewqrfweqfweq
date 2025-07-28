package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import java.util.Map;
import java.util.Set;

/* renamed from: x97  reason: default package */
public final class x97 implements SharedPreferences {
    public final r7e a;

    public x97(Context context, ve5 ve5, we5 we5, e3 e3Var) {
        this.a = new r7e(new cp(context.getDir("file_prefs", 0), ve5, we5, e3Var, 2));
    }

    public final ue5 a() {
        return (ue5) this.a.getValue();
    }

    public final boolean contains(String str) {
        return a().d.b(str);
    }

    public final SharedPreferences.Editor edit() {
        return a().edit();
    }

    public final Map getAll() {
        return a().getAll();
    }

    public final boolean getBoolean(String str, boolean z) {
        return a().getBoolean(str, z);
    }

    public final float getFloat(String str, float f) {
        return a().getFloat(str, f);
    }

    public final int getInt(String str, int i) {
        return a().getInt(str, i);
    }

    public final long getLong(String str, long j) {
        return a().getLong(str, j);
    }

    public final String getString(String str, String str2) {
        return a().getString(str, str2);
    }

    public final Set getStringSet(String str, Set set) {
        return a().getStringSet(str, set);
    }

    public final void registerOnSharedPreferenceChangeListener(SharedPreferences.OnSharedPreferenceChangeListener onSharedPreferenceChangeListener) {
        a().registerOnSharedPreferenceChangeListener(onSharedPreferenceChangeListener);
    }

    public final void unregisterOnSharedPreferenceChangeListener(SharedPreferences.OnSharedPreferenceChangeListener onSharedPreferenceChangeListener) {
        a().unregisterOnSharedPreferenceChangeListener(onSharedPreferenceChangeListener);
    }
}

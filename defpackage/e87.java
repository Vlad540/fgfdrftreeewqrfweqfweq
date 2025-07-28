package defpackage;

import android.content.Context;
import android.content.SharedPreferences;

/* renamed from: e87  reason: default package */
public final class e87 {
    public static final int a = a24.X(((float) 100) * dh4.c().getDisplayMetrics().density);
    public static final dc9 b = new dc9(6);
    public static int c;
    public static SharedPreferences d;
    public static final grd e;
    public static final grd f;

    static {
        grd a2 = hrd.a(Boolean.FALSE);
        e = a2;
        f = a2;
    }

    public static int a(Context context) {
        dc9 dc9 = b;
        String str = "pref_keyboard_height_landscape";
        if (dc9.e == 0) {
            SharedPreferences sharedPreferences = d;
            if (sharedPreferences == null) {
                sharedPreferences = context.getApplicationContext().getSharedPreferences("keyboard_prefs", 0);
            }
            if (d == null) {
                d = sharedPreferences;
            }
            int max = Math.max(context.getResources().getDisplayMetrics().widthPixels, context.getResources().getDisplayMetrics().heightPixels) / 3;
            dc9.d(sharedPreferences.getInt("pref_keyboard_height_portrait", max), "pref_keyboard_height_portrait");
            dc9.d(sharedPreferences.getInt("pref_keyboard_height_portrait", max), str);
        }
        if (1 == context.getResources().getConfiguration().orientation) {
            str = "pref_keyboard_height_portrait";
        }
        int b2 = dc9.b(str);
        return b2 >= 0 ? dc9.c[b2] : Math.max(context.getResources().getDisplayMetrics().widthPixels, context.getResources().getDisplayMetrics().heightPixels) / 3;
    }

    public static boolean b(int i) {
        return i > a;
    }
}

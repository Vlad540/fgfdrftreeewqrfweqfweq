package defpackage;

import android.content.Context;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.text.TextUtils;
import java.util.Locale;

/* renamed from: izf  reason: default package */
public abstract class izf {
    public static final kgd a = new kgd();
    public static Locale b;

    public static String a(Context context) {
        String packageName = context.getPackageName();
        try {
            Context context2 = (Context) suf.a(context).b;
            return context2.getPackageManager().getApplicationLabel(context2.getPackageManager().getApplicationInfo(packageName, 0)).toString();
        } catch (PackageManager.NameNotFoundException | NullPointerException unused) {
            String str = context.getApplicationInfo().name;
            return TextUtils.isEmpty(str) ? packageName : str;
        }
    }

    public static String b(Context context, int i) {
        Resources resources = context.getResources();
        return i != 1 ? i != 2 ? i != 3 ? resources.getString(17039370) : resources.getString(evb.common_google_play_services_enable_button) : resources.getString(evb.common_google_play_services_update_button) : resources.getString(evb.common_google_play_services_install_button);
    }

    public static String c(Context context, int i) {
        Resources resources = context.getResources();
        String a2 = a(context);
        if (i == 1) {
            return resources.getString(evb.common_google_play_services_install_text, new Object[]{a2});
        }
        if (i == 2) {
            return oyb.J(context) ? resources.getString(evb.common_google_play_services_wear_update_text) : resources.getString(evb.common_google_play_services_update_text, new Object[]{a2});
        }
        if (i == 3) {
            return resources.getString(evb.common_google_play_services_enable_text, new Object[]{a2});
        }
        if (i == 5) {
            return e(context, "common_google_play_services_invalid_account_text", a2);
        }
        if (i == 7) {
            return e(context, "common_google_play_services_network_error_text", a2);
        }
        if (i == 9) {
            return resources.getString(evb.common_google_play_services_unsupported_text, new Object[]{a2});
        }
        if (i == 20) {
            return e(context, "common_google_play_services_restricted_profile_text", a2);
        }
        switch (i) {
            case 16:
                return e(context, "common_google_play_services_api_unavailable_text", a2);
            case 17:
                return e(context, "common_google_play_services_sign_in_failed_text", a2);
            case 18:
                return resources.getString(evb.common_google_play_services_updating_text, new Object[]{a2});
            default:
                return resources.getString(fvb.common_google_play_services_unknown_issue, new Object[]{a2});
        }
    }

    public static String d(Context context, int i) {
        Resources resources = context.getResources();
        if (i == 1) {
            return resources.getString(evb.common_google_play_services_install_title);
        }
        if (i == 2) {
            return resources.getString(evb.common_google_play_services_update_title);
        }
        if (i == 3) {
            return resources.getString(evb.common_google_play_services_enable_title);
        }
        if (i == 5) {
            return f(context, "common_google_play_services_invalid_account_title");
        }
        if (i == 7) {
            return f(context, "common_google_play_services_network_error_title");
        }
        if (i == 17) {
            return f(context, "common_google_play_services_sign_in_failed_title");
        }
        if (i != 20) {
            return null;
        }
        return f(context, "common_google_play_services_restricted_profile_title");
    }

    public static String e(Context context, String str, String str2) {
        Resources resources = context.getResources();
        String f = f(context, str);
        if (f == null) {
            f = resources.getString(fvb.common_google_play_services_unknown_issue);
        }
        return String.format(resources.getConfiguration().locale, f, new Object[]{str2});
    }

    public static String f(Context context, String str) {
        Resources resources;
        kgd kgd = a;
        synchronized (kgd) {
            try {
                Locale locale = va3.a(context.getResources().getConfiguration()).get(0);
                if (!locale.equals(b)) {
                    kgd.clear();
                    b = locale;
                }
                String str2 = (String) kgd.get(str);
                if (str2 != null) {
                    return str2;
                }
                int i = xa6.e;
                try {
                    resources = context.getPackageManager().getResourcesForApplication("com.google.android.gms");
                } catch (PackageManager.NameNotFoundException unused) {
                    resources = null;
                }
                if (resources == null) {
                    return null;
                }
                int identifier = resources.getIdentifier(str, "string", "com.google.android.gms");
                if (identifier == 0) {
                    return null;
                }
                String string = resources.getString(identifier);
                if (TextUtils.isEmpty(string)) {
                    return null;
                }
                a.put(str, string);
                return string;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}

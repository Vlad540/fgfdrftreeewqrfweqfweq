package defpackage;

import android.app.LocaleManager;
import android.os.LocaleList;

/* renamed from: zl7  reason: default package */
public abstract class zl7 {
    public static LocaleList a(Object obj) {
        return ((LocaleManager) obj).getApplicationLocales();
    }

    public static LocaleList b(Object obj) {
        return ((LocaleManager) obj).getSystemLocales();
    }
}

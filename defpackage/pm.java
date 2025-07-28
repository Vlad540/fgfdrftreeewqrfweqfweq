package defpackage;

import android.app.LocaleManager;
import android.os.LocaleList;

/* renamed from: pm  reason: default package */
public abstract class pm {
    public static LocaleList a(Object obj) {
        return ((LocaleManager) obj).getApplicationLocales();
    }

    public static void b(Object obj, LocaleList localeList) {
        ((LocaleManager) obj).setApplicationLocales(localeList);
    }
}

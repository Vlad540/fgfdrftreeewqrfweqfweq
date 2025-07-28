package defpackage;

import android.os.LocaleList;
import java.util.Locale;

/* renamed from: wl7  reason: default package */
public abstract class wl7 {
    public static LocaleList a(Locale... localeArr) {
        return new LocaleList(localeArr);
    }

    public static LocaleList b() {
        return LocaleList.getAdjustedDefault();
    }

    public static LocaleList c() {
        return LocaleList.getDefault();
    }
}

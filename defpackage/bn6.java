package defpackage;

import android.icu.util.ULocale;
import java.util.Locale;

/* renamed from: bn6  reason: default package */
public abstract class bn6 {
    public static ULocale a(Object obj) {
        return ULocale.addLikelySubtags((ULocale) obj);
    }

    public static ULocale b(Locale locale) {
        return ULocale.forLocale(locale);
    }

    public static String c(Object obj) {
        return ((ULocale) obj).getScript();
    }
}

package defpackage;

import android.content.res.Configuration;
import android.os.LocaleList;

/* renamed from: vm  reason: default package */
public abstract class vm {
    public static void a(Configuration configuration, Configuration configuration2, Configuration configuration3) {
        LocaleList locales = configuration.getLocales();
        LocaleList locales2 = configuration2.getLocales();
        if (!locales.equals(locales2)) {
            configuration3.setLocales(locales2);
            configuration3.locale = configuration2.locale;
        }
    }

    public static xl7 b(Configuration configuration) {
        return xl7.a(configuration.getLocales().toLanguageTags());
    }

    public static void c(xl7 xl7) {
        LocaleList.setDefault(LocaleList.forLanguageTags(xl7.a.a.toLanguageTags()));
    }

    public static void d(Configuration configuration, xl7 xl7) {
        configuration.setLocales(LocaleList.forLanguageTags(xl7.a.a.toLanguageTags()));
    }
}

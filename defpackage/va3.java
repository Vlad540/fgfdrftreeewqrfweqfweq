package defpackage;

import android.content.res.Configuration;
import android.os.LocaleList;

/* renamed from: va3  reason: default package */
public abstract class va3 {
    public static LocaleList a(Configuration configuration) {
        return configuration.getLocales();
    }

    public static void b(Configuration configuration, xl7 xl7) {
        configuration.setLocales(xl7.a.a);
    }
}

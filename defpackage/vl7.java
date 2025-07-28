package defpackage;

import java.util.Locale;

/* renamed from: vl7  reason: default package */
public abstract class vl7 {
    public static final Locale[] a = {new Locale("en", "XA"), new Locale("ar", "XB")};

    public static Locale a(String str) {
        return Locale.forLanguageTag(str);
    }

    public static boolean b(Locale locale, Locale locale2) {
        if (locale.equals(locale2)) {
            return true;
        }
        if (!locale.getLanguage().equals(locale2.getLanguage())) {
            return false;
        }
        Locale[] localeArr = a;
        int length = localeArr.length;
        int i = 0;
        while (true) {
            if (i >= length) {
                int length2 = localeArr.length;
                int i2 = 0;
                while (i2 < length2) {
                    if (!localeArr[i2].equals(locale2)) {
                        i2++;
                    }
                }
                String c = bn6.c(bn6.a(bn6.b(locale)));
                if (!c.isEmpty()) {
                    return c.equals(bn6.c(bn6.a(bn6.b(locale2))));
                }
                String country = locale.getCountry();
                return country.isEmpty() || country.equals(locale2.getCountry());
            } else if (localeArr[i].equals(locale)) {
                break;
            } else {
                i++;
            }
        }
        return false;
    }
}

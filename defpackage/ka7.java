package defpackage;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

/* renamed from: ka7  reason: default package */
public final class ka7 {
    public static String a(Date date) {
        String format;
        synchronized (xs7.v) {
            if (xs7.u == null) {
                xs7.u = new SimpleDateFormat("yyyyMMdd_HHmmss", Locale.ENGLISH);
            }
            format = xs7.u.format(date);
        }
        return format;
    }
}

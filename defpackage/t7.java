package defpackage;

import java.util.List;
import java.util.Locale;

/* renamed from: t7  reason: default package */
public final class t7 {
    public final w4g a;
    public final String b;

    public t7(w4g w4g) {
        List list = u7.d;
        String str = "null";
        if (w4g != null) {
            String str2 = (String) w4g.c;
            str = str2 != null ? str2.toLowerCase(Locale.ROOT) : str;
            if (u7.d.contains(str)) {
                str = ((String) w4g.b) + ":" + str;
            }
        }
        this.a = w4g;
        this.b = str;
    }
}

package defpackage;

import java.util.Locale;

/* renamed from: xl7  reason: default package */
public final class xl7 {
    public static final xl7 b = new xl7(new yl7(wl7.a(new Locale[0])));
    public final yl7 a;

    public xl7(yl7 yl7) {
        this.a = yl7;
    }

    public static xl7 a(String str) {
        if (str == null || str.isEmpty()) {
            return b;
        }
        String[] split = str.split(",", -1);
        int length = split.length;
        Locale[] localeArr = new Locale[length];
        for (int i = 0; i < length; i++) {
            localeArr[i] = vl7.a(split[i]);
        }
        return new xl7(new yl7(wl7.a(localeArr)));
    }

    public final boolean equals(Object obj) {
        if (obj instanceof xl7) {
            if (this.a.equals(((xl7) obj).a)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return this.a.toString();
    }
}

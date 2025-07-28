package defpackage;

import java.util.Arrays;
import java.util.Locale;

/* renamed from: rfc  reason: default package */
public final class rfc {
    public static final rfc b = new rfc(false);
    public static final rfc c = new rfc(true);
    public final boolean a;

    public rfc(boolean z) {
        this.a = z;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof rfc)) {
            return false;
        }
        rfc rfc = (rfc) obj;
        rfc.getClass();
        return this.a == rfc.a;
    }

    public final int hashCode() {
        Integer num = -1;
        Boolean valueOf = Boolean.valueOf(this.a);
        return ((num.hashCode() + 31) * 31) + valueOf.hashCode();
    }

    public final String toString() {
        return String.format((Locale) null, "%d defer:%b", Arrays.copyOf(new Object[]{-1, Boolean.valueOf(this.a)}, 2));
    }
}

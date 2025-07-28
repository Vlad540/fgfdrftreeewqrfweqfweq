package defpackage;

import java.util.Locale;

/* renamed from: n9e  reason: default package */
public final class n9e {
    public final String a;
    public final String b;
    public final boolean c;
    public final int d;
    public final String e;
    public final int f;
    public final int g;

    public n9e(int i, int i2, String str, String str2, String str3, boolean z) {
        this.a = str;
        this.b = str2;
        this.c = z;
        this.d = i;
        this.e = str3;
        this.f = i2;
        String upperCase = str2.toUpperCase(Locale.US);
        this.g = h0e.R(upperCase, "INT", false) ? 3 : (h0e.R(upperCase, "CHAR", false) || h0e.R(upperCase, "CLOB", false) || h0e.R(upperCase, "TEXT", false)) ? 2 : h0e.R(upperCase, "BLOB", false) ? 5 : (h0e.R(upperCase, "REAL", false) || h0e.R(upperCase, "FLOA", false) || h0e.R(upperCase, "DOUB", false)) ? 4 : 1;
    }

    public final boolean equals(Object obj) {
        n9e n9e;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n9e) || this.d != (n9e = (n9e) obj).d) {
            return false;
        }
        if (!hhd.f(this.a, n9e.a) || this.c != n9e.c) {
            return false;
        }
        int i = n9e.f;
        String str = n9e.e;
        String str2 = this.e;
        int i2 = this.f;
        if (i2 == 1 && i == 2 && str2 != null && !ek8.p(str2, str)) {
            return false;
        }
        if (i2 == 2 && i == 1 && str != null && !ek8.p(str, str2)) {
            return false;
        }
        if (i2 == 0 || i2 != i || (str2 == null ? str == null : ek8.p(str2, str))) {
            return this.g == n9e.g;
        }
        return false;
    }

    public final int hashCode() {
        return (((((this.a.hashCode() * 31) + this.g) * 31) + (this.c ? 1231 : 1237)) * 31) + this.d;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Column{name='");
        sb.append(this.a);
        sb.append("', type='");
        sb.append(this.b);
        sb.append("', affinity='");
        sb.append(this.g);
        sb.append("', notNull=");
        sb.append(this.c);
        sb.append(", primaryKeyPosition=");
        sb.append(this.d);
        sb.append(", defaultValue='");
        String str = this.e;
        if (str == null) {
            str = "undefined";
        }
        return wn6.l(sb, str, "'}");
    }
}

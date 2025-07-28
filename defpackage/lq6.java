package defpackage;

/* renamed from: lq6  reason: default package */
public final class lq6 {
    public static final lq6 c = new lq6("UNKNOWN", (String) null);
    public final String a;
    public final String b;

    public lq6(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lq6)) {
            return false;
        }
        lq6 lq6 = (lq6) obj;
        return hhd.f(this.a, lq6.a) && hhd.f(this.b, lq6.b);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        String str = this.b;
        return hashCode + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        return this.a;
    }
}

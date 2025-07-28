package defpackage;

/* renamed from: y87  reason: default package */
public final class y87 {
    public static final String c = Integer.toString(0, 36);
    public static final String d = Integer.toString(1, 36);
    public final String a;
    public final String b;

    static {
        int i = oze.a;
    }

    public y87(String str, String str2) {
        this.a = oze.T(str);
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || y87.class != obj.getClass()) {
            return false;
        }
        y87 y87 = (y87) obj;
        return oze.a(this.a, y87.a) && oze.a(this.b, y87.b);
    }

    public final int hashCode() {
        int hashCode = this.b.hashCode() * 31;
        String str = this.a;
        return hashCode + (str != null ? str.hashCode() : 0);
    }
}

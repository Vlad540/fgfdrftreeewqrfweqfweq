package defpackage;

/* renamed from: f49  reason: default package */
public final class f49 {
    public final String a;
    public final String b;
    public final String c;

    public f49(String str, String str2, String str3) {
        this.a = str;
        this.b = str2;
        this.c = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f49)) {
            return false;
        }
        f49 f49 = (f49) obj;
        return hhd.f(this.a, f49.a) && hhd.f(this.b, f49.b) && hhd.f(this.c, f49.c);
    }

    public final int hashCode() {
        int d = me4.d(this.a.hashCode() * 31, 31, this.b);
        String str = this.c;
        return d + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("MiniAppData(title=");
        sb.append(this.a);
        sb.append(", url=");
        sb.append(this.b);
        sb.append(", queryId=");
        return wn6.l(sb, this.c, ")");
    }
}

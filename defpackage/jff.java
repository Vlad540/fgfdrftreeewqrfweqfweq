package defpackage;

/* renamed from: jff  reason: default package */
public final class jff {
    public final long a;
    public final String b;
    public final bff c;
    public final u12 d;
    public final String e = null;

    public jff(long j, String str, bff bff, u12 u12) {
        this.a = j;
        this.b = str;
        this.c = bff;
        this.d = u12;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jff)) {
            return false;
        }
        jff jff = (jff) obj;
        return this.a == jff.a && hhd.f(this.b, jff.b) && this.c == jff.c && hhd.f(this.d, jff.d) && hhd.f(this.e, jff.e);
    }

    public final int hashCode() {
        int hashCode = (this.d.hashCode() + ((this.c.hashCode() + me4.d(Long.hashCode(this.a) * 31, 31, this.b)) * 31)) * 31;
        String str = this.e;
        return hashCode + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("WebAppAnalyticsParam(botId=");
        sb.append(this.a);
        sb.append(", webAppName=");
        sb.append(this.b);
        sb.append(", entryPoint=");
        sb.append(this.c);
        sb.append(", sourceType=");
        sb.append(this.d);
        sb.append(", label=");
        return wn6.l(sb, this.e, ")");
    }
}

package defpackage;

/* renamed from: e2e  reason: default package */
public final class e2e {
    public final long a;
    public final int b;
    public final String c;
    public final String d;
    public final CharSequence e;
    public final String f;
    public final l2b g;
    public final String h;

    public e2e(long j, int i, String str, String str2, CharSequence charSequence, String str3, l2b l2b, String str4) {
        this.a = j;
        this.b = i;
        this.c = str;
        this.d = str2;
        this.e = charSequence;
        this.f = str3;
        this.g = l2b;
        this.h = str4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e2e)) {
            return false;
        }
        e2e e2e = (e2e) obj;
        return this.a == e2e.a && this.b == e2e.b && hhd.f(this.c, e2e.c) && hhd.f(this.d, e2e.d) && hhd.f(this.e, e2e.e) && hhd.f(this.f, e2e.f) && hhd.f(this.g, e2e.g) && hhd.f(this.h, e2e.h);
    }

    public final int hashCode() {
        int h2 = us8.h(this.b, Long.hashCode(this.a) * 31, 31);
        int i = 0;
        String str = this.c;
        int hashCode = (h2 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.d;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        CharSequence charSequence = this.e;
        int hashCode3 = (hashCode2 + (charSequence == null ? 0 : charSequence.hashCode())) * 31;
        String str3 = this.f;
        int hashCode4 = (hashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        l2b l2b = this.g;
        int hashCode5 = (hashCode4 + (l2b == null ? 0 : l2b.hashCode())) * 31;
        String str4 = this.h;
        if (str4 != null) {
            i = str4.hashCode();
        }
        return hashCode5 + i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Suggest(id=");
        sb.append(this.a);
        sb.append(", type=");
        sb.append(c3d.t(this.b));
        sb.append(", title=");
        sb.append(this.c);
        sb.append(", description=");
        sb.append(this.d);
        sb.append(", inputResult=");
        sb.append(this.e);
        sb.append(", avatarUrl=");
        sb.append(this.f);
        sb.append(", presence=");
        sb.append(this.g);
        sb.append(", query=");
        return wn6.l(sb, this.h, ")");
    }
}

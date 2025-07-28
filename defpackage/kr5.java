package defpackage;

/* renamed from: kr5  reason: default package */
public final class kr5 {
    public final long a;
    public final String b;
    public final String c;
    public final String d;
    public final Long e;
    public final String f;
    public final String g;
    public final String h;

    public kr5(long j, String str, String str2, String str3, Long l, String str4, String str5, String str6) {
        this.a = j;
        this.b = str;
        this.c = str2;
        this.d = str3;
        this.e = l;
        this.f = str4;
        this.g = str5;
        this.h = str6;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kr5)) {
            return false;
        }
        kr5 kr5 = (kr5) obj;
        return this.a == kr5.a && hhd.f(this.b, kr5.b) && hhd.f(this.c, kr5.c) && hhd.f(this.d, kr5.d) && hhd.f(this.e, kr5.e) && hhd.f(this.f, kr5.f) && hhd.f(this.g, kr5.g) && hhd.f(this.h, kr5.h);
    }

    public final int hashCode() {
        int d2 = me4.d(me4.d(Long.hashCode(this.a) * 31, 31, this.b), 31, this.c);
        int i = 0;
        String str = this.d;
        int hashCode = (d2 + (str == null ? 0 : str.hashCode())) * 31;
        Long l = this.e;
        int hashCode2 = (hashCode + (l == null ? 0 : l.hashCode())) * 31;
        String str2 = this.f;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.g;
        int hashCode4 = (hashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.h;
        if (str4 != null) {
            i = str4.hashCode();
        }
        return hashCode4 + i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("FolderWidget(id=");
        sb.append(this.a);
        sb.append(", name=");
        sb.append(this.b);
        sb.append(", background=");
        sb.append(this.c);
        sb.append(", description=");
        sb.append(this.d);
        sb.append(", appId=");
        sb.append(this.e);
        sb.append(", startParam=");
        sb.append(this.f);
        sb.append(", url=");
        sb.append(this.g);
        sb.append(", iconUrl=");
        return wn6.l(sb, this.h, ")");
    }
}

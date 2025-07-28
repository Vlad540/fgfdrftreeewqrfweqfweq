package defpackage;

/* renamed from: cb5  reason: default package */
public final class cb5 {
    public final long a;
    public final long b;
    public final gb5 c;
    public final String d;
    public final String e;
    public final long f;
    public final long g;
    public final String h;
    public final long i;
    public final String j;
    public final String k;
    public final boolean l;
    public final boolean m;

    public cb5(long j2, long j3, gb5 gb5, String str, String str2, long j4, long j5, String str3, long j6, String str4, String str5, boolean z, boolean z2) {
        this.a = j2;
        this.b = j3;
        this.c = gb5;
        this.d = str;
        this.e = str2;
        this.f = j4;
        this.g = j5;
        this.h = str3;
        this.i = j6;
        this.j = str4;
        this.k = str5;
        this.l = z;
        this.m = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cb5)) {
            return false;
        }
        cb5 cb5 = (cb5) obj;
        return this.a == cb5.a && this.b == cb5.b && this.c == cb5.c && hhd.f(this.d, cb5.d) && hhd.f(this.e, cb5.e) && this.f == cb5.f && this.g == cb5.g && hhd.f(this.h, cb5.h) && this.i == cb5.i && hhd.f(this.j, cb5.j) && hhd.f(this.k, cb5.k) && this.l == cb5.l && this.m == cb5.m;
    }

    public final int hashCode() {
        int hashCode = (this.c.hashCode() + sxe.m(Long.hashCode(this.a) * 31, 31, this.b)) * 31;
        int i2 = 0;
        String str = this.d;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.e;
        int m2 = sxe.m(me4.d(sxe.m(sxe.m((hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31, 31, this.f), 31, this.g), 31, this.h), 31, this.i);
        String str3 = this.j;
        int hashCode3 = (m2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.k;
        if (str4 != null) {
            i2 = str4.hashCode();
        }
        return Boolean.hashCode(this.m) + th2.f((hashCode3 + i2) * 31, 31, this.l);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(sb.getClass().getSimpleName());
        sb.append('(');
        sb.append("pushId=");
        sb.append(this.i);
        sb.append(",sender=");
        sb.append(this.f);
        sb.append(",chatServerId=");
        sb.append(this.a);
        sb.append(",messageId=");
        sb.append(this.b);
        sb.append(",type=");
        sb.append(this.c);
        sb.append(",time=");
        sb.append(this.g);
        sb.append(",hasText=");
        return hr1.j(sb, this.h.length() > 0, ")");
    }
}

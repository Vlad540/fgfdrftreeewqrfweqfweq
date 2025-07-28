package defpackage;

/* renamed from: sc3  reason: default package */
public final class sc3 {
    public final long a;
    public final long b;
    public final long c;
    public final long d;
    public final long e;
    public final String f;
    public final int g;
    public final int h;

    public sc3(long j, long j2, long j3, long j4, long j5, String str, int i, int i2) {
        this.a = j;
        this.b = j2;
        this.c = j3;
        this.d = j4;
        this.e = j5;
        this.f = str;
        this.g = i;
        this.h = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof sc3)) {
            return false;
        }
        sc3 sc3 = (sc3) obj;
        return this.a == sc3.a && this.b == sc3.b && this.c == sc3.c && this.d == sc3.d && this.e == sc3.e && hhd.f(this.f, sc3.f) && this.g == sc3.g && this.h == sc3.h;
    }

    public final int hashCode() {
        return Integer.hashCode(this.h) + c3d.d(this.g, me4.d(sxe.m(sxe.m(sxe.m(sxe.m(Long.hashCode(this.a) * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e), 31, this.f), 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ConnectionStat(n=");
        sb.append(this.h);
        sb.append("|");
        sb.append(this.f);
        sb.append(":");
        sb.append(this.g);
        sb.append("|total=");
        sb.append(this.b);
        sb.append("|dns=");
        sb.append(this.c);
        sb.append("|tcp=");
        sb.append(this.d);
        sb.append("|tls=");
        return wn6.k(sb, this.e, ")");
    }
}

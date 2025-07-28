package defpackage;

/* renamed from: d3d  reason: default package */
public final class d3d {
    public final long a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final int f;
    public final z9d g;
    public final boolean h;

    public d3d(long j, String str, String str2, String str3, String str4, int i, z9d z9d, boolean z) {
        this.a = j;
        this.b = str;
        this.c = str2;
        this.d = str3;
        this.e = str4;
        this.f = i;
        this.g = z9d;
        this.h = z;
    }

    public static d3d a(d3d d3d, int i, z9d z9d, boolean z, int i2) {
        long j = d3d.a;
        String str = d3d.b;
        String str2 = d3d.c;
        String str3 = d3d.d;
        String str4 = d3d.e;
        if ((i2 & 64) != 0) {
            z9d = d3d.g;
        }
        z9d z9d2 = z9d;
        if ((i2 & 128) != 0) {
            z = d3d.h;
        }
        d3d.getClass();
        return new d3d(j, str, str2, str3, str4, i, z9d2, z);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d3d)) {
            return false;
        }
        d3d d3d = (d3d) obj;
        return this.a == d3d.a && hhd.f(this.b, d3d.b) && hhd.f(this.c, d3d.c) && hhd.f(this.d, d3d.d) && hhd.f(this.e, d3d.e) && this.f == d3d.f && hhd.f(this.g, d3d.g) && this.h == d3d.h;
    }

    public final int hashCode() {
        int d2 = me4.d(Long.hashCode(this.a) * 31, 31, this.b);
        int i = 0;
        String str = this.c;
        int d3 = me4.d((d2 + (str == null ? 0 : str.hashCode())) * 31, 31, this.d);
        String str2 = this.e;
        int h2 = us8.h(this.f, (d3 + (str2 == null ? 0 : str2.hashCode())) * 31, 31);
        z9d z9d = this.g;
        if (z9d != null) {
            i = z9d.a.hashCode();
        }
        int i2 = (h2 + i) * 31;
        boolean z = this.h;
        if (z) {
            z = true;
        }
        return i2 + (z ? 1 : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SessionState(versionCode=");
        sb.append(this.a);
        sb.append(", versionName=");
        sb.append(this.b);
        sb.append(", environment=");
        sb.append(this.c);
        sb.append(", sessionUuid=");
        sb.append(this.d);
        sb.append(", processName=");
        sb.append(this.e);
        sb.append(", status=");
        int i = this.f;
        sb.append(i != 1 ? i != 2 ? i != 3 ? i != 4 ? "null" : "NATIVE" : "ANR" : "CRASH" : "BLANK");
        sb.append(", maxSeverity=");
        sb.append(this.g);
        sb.append(", isInBackground=");
        sb.append(this.h);
        sb.append(')');
        return sb.toString();
    }
}

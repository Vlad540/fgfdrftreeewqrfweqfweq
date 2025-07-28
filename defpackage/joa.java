package defpackage;

/* renamed from: joa  reason: default package */
public final class joa {
    public final long a;
    public final long b;
    public final int c;
    public final String d;
    public final long e;
    public final String f;
    public final String g;
    public final String h;
    public final String i;
    public final int j;

    public joa(long j2, long j3, int i2, String str, long j4, String str2, String str3, String str4, String str5, int i3) {
        this.a = j2;
        this.b = j3;
        this.c = i2;
        this.d = str;
        this.e = j4;
        this.f = str2;
        this.g = str3;
        this.h = str4;
        this.i = str5;
        this.j = i3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof joa)) {
            return false;
        }
        joa joa = (joa) obj;
        return this.a == joa.a && this.b == joa.b && this.c == joa.c && hhd.f(this.d, joa.d) && this.e == joa.e && hhd.f(this.f, joa.f) && hhd.f(this.g, joa.g) && hhd.f(this.h, joa.h) && hhd.f(this.i, joa.i) && this.j == joa.j;
    }

    public final int hashCode() {
        int m = sxe.m(me4.d(c3d.d(this.c, sxe.m(Long.hashCode(this.a) * 31, 31, this.b), 31), 31, this.d), 31, this.e);
        int i2 = 0;
        String str = this.f;
        int d2 = me4.d((m + (str == null ? 0 : str.hashCode())) * 31, 31, this.g);
        String str2 = this.h;
        int hashCode = (d2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.i;
        if (str3 != null) {
            i2 = str3.hashCode();
        }
        return hr1.t(this.j) + ((hashCode + i2) * 31);
    }

    public final String toString() {
        return "PhoneEntity(id=" + this.a + ", phonebookId=" + this.b + ", contactId=" + this.c + ", phone=" + this.d + ", serverPhone=" + this.e + ", email=" + this.f + ", firstName=" + this.g + ", lastName=" + this.h + ", avatarPath=" + this.i + ", type=" + us8.r(this.j) + ")";
    }
}

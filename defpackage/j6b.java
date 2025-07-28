package defpackage;

/* renamed from: j6b  reason: default package */
public final class j6b {
    public final long a;
    public final CharSequence b;
    public final mge c;
    public final String d;
    public final long e;
    public final CharSequence f;

    public j6b(long j, CharSequence charSequence, lge lge, String str, long j2, CharSequence charSequence2) {
        this.a = j;
        this.b = charSequence;
        this.c = lge;
        this.d = str;
        this.e = j2;
        this.f = charSequence2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j6b)) {
            return false;
        }
        j6b j6b = (j6b) obj;
        return this.a == j6b.a && hhd.f(this.b, j6b.b) && hhd.f(this.c, j6b.c) && hhd.f(this.d, j6b.d) && this.e == j6b.e && hhd.f(this.f, j6b.f);
    }

    public final int hashCode() {
        int e2 = c3d.e(me4.f(this.b, Long.hashCode(this.a) * 31, 31), 31, this.c);
        String str = this.d;
        return this.f.hashCode() + sxe.m(th2.f((e2 + (str == null ? 0 : str.hashCode())) * 31, 31, false), 31, this.e);
    }

    public final String toString() {
        return "ProfileContactCellItem(id=" + this.a + ", title=" + this.b + ", subtitle=" + this.c + ", avatarUrl=" + this.d + ", isOnline=false, avatarSourceId=" + this.e + ", abbreviation=" + this.f + ")";
    }
}

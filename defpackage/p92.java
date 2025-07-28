package defpackage;

/* renamed from: p92  reason: default package */
public final class p92 {
    public final String a;
    public final long b;
    public final String c;
    public final String d;
    public final boolean e;
    public final boolean f;
    public final boolean g;

    public p92(String str, long j, String str2, String str3, boolean z, boolean z2, boolean z3) {
        this.a = str;
        this.b = j;
        this.c = str2;
        this.d = str3;
        this.e = z;
        this.f = z2;
        this.g = z3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p92)) {
            return false;
        }
        p92 p92 = (p92) obj;
        return hhd.f(this.a, p92.a) && this.b == p92.b && hhd.f(this.c, p92.c) && hhd.f(this.d, p92.d) && this.e == p92.e && this.f == p92.f && this.g == p92.g;
    }

    public final int hashCode() {
        String str = this.a;
        return Boolean.hashCode(this.g) + th2.f(th2.f(me4.d(me4.d(sxe.m((str == null ? 0 : str.hashCode()) * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e), 31, this.f);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ChatItemModel(avatarUrl=");
        sb.append(this.a);
        sb.append(", avatarSourceId=");
        sb.append(this.b);
        sb.append(", chatName=");
        sb.append(this.c);
        sb.append(", chatLink=");
        sb.append(this.d);
        sb.append(", isLoading=");
        sb.append(this.e);
        sb.append(", isPrivate=");
        sb.append(this.f);
        sb.append(", hasEditLinkPermission=");
        return hr1.j(sb, this.g, ")");
    }
}

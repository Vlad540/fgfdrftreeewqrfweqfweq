package defpackage;

/* renamed from: g8b  reason: default package */
public final class g8b implements j8b {
    public final Long a;
    public final String b;
    public final String c;
    public final String d;

    public g8b(Long l, String str, String str2, String str3) {
        this.a = l;
        this.b = str;
        this.c = str2;
        this.d = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g8b)) {
            return false;
        }
        g8b g8b = (g8b) obj;
        return hhd.f(this.a, g8b.a) && hhd.f(this.b, g8b.b) && hhd.f(this.c, g8b.c) && hhd.f(this.d, g8b.d);
    }

    public final int hashCode() {
        int i = 0;
        Long l = this.a;
        int d2 = me4.d(me4.d((l == null ? 0 : l.hashCode()) * 31, 31, this.b), 31, this.c);
        String str = this.d;
        if (str != null) {
            i = str.hashCode();
        }
        return d2 + i;
    }

    public final String toString() {
        return "ContactUpdate(requestId=" + this.a + ", fullName=" + this.b + ", nickName=" + this.c + ", avatarUrl=" + this.d + ")";
    }
}

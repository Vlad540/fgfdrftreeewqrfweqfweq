package defpackage;

/* renamed from: cze  reason: default package */
public final class cze implements vl1 {
    public final long a;
    public final String b;
    public final CharSequence c;
    public final boolean d;
    public final String e;

    public cze(long j, String str, CharSequence charSequence, boolean z, String str2) {
        this.a = j;
        this.b = str;
        this.c = charSequence;
        this.d = z;
        this.e = str2;
    }

    public final boolean c() {
        return this.d;
    }

    public final long d() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cze)) {
            return false;
        }
        cze cze = (cze) obj;
        return this.a == cze.a && hhd.f(this.b, cze.b) && hhd.f(this.c, cze.c) && this.d == cze.d && hhd.f(this.e, cze.e);
    }

    public final String getName() {
        return this.b;
    }

    public final int hashCode() {
        int f = th2.f(me4.f(this.c, me4.d(Long.hashCode(this.a) * 31, 31, this.b), 31), 31, this.d);
        String str = this.e;
        return f + (str == null ? 0 : str.hashCode());
    }

    public final CharSequence j() {
        return this.c;
    }

    public final String q() {
        return this.e;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("UserInfo(serverId=");
        sb.append(this.a);
        sb.append(", name=");
        sb.append(this.b);
        sb.append(", abbreviation=");
        sb.append(this.c);
        sb.append(", isUnknown=");
        sb.append(this.d);
        sb.append(", avatar=");
        return wn6.l(sb, this.e, ")");
    }
}

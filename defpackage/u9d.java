package defpackage;

/* renamed from: u9d  reason: default package */
public final class u9d {
    public static final u9d h = new u9d(-1, (String) null, "", "", "", "", false);
    public final long a;
    public final String b;
    public final String c;
    public final CharSequence d;
    public final String e;
    public final String f;
    public final boolean g;

    public u9d(long j, String str, String str2, CharSequence charSequence, String str3, String str4, boolean z) {
        this.a = j;
        this.b = str;
        this.c = str2;
        this.d = charSequence;
        this.e = str3;
        this.f = str4;
        this.g = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof u9d)) {
            return false;
        }
        u9d u9d = (u9d) obj;
        return this.a == u9d.a && hhd.f(this.b, u9d.b) && hhd.f(this.c, u9d.c) && hhd.f(this.d, u9d.d) && hhd.f(this.e, u9d.e) && hhd.f(this.f, u9d.f) && this.g == u9d.g;
    }

    public final int hashCode() {
        int hashCode = Long.hashCode(this.a) * 31;
        String str = this.b;
        return Boolean.hashCode(this.g) + me4.d(me4.d(me4.f(this.d, me4.d((hashCode + (str == null ? 0 : str.hashCode())) * 31, 31, this.c), 31), 31, this.e), 31, this.f);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SettingsProfileDataModel(id=");
        sb.append(this.a);
        sb.append(", avatarUrl=");
        sb.append(this.b);
        sb.append(", fullName=");
        sb.append(this.c);
        sb.append(", abbreviation=");
        sb.append(this.d);
        sb.append(", phone=");
        sb.append(this.e);
        sb.append(", nickName=");
        sb.append(this.f);
        sb.append(", hasEsiaConnection=");
        return hr1.j(sb, this.g, ")");
    }
}

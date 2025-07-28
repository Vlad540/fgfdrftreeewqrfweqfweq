package defpackage;

import java.util.List;

/* renamed from: l5b  reason: default package */
public final class l5b {
    public final long a;
    public final boolean b;
    public final List c;
    public final String d;
    public final CharSequence e;
    public final CharSequence f;
    public final mge g;
    public final mge h;
    public final boolean i;
    public final boolean j;

    public l5b(long j2, boolean z, List list, String str, CharSequence charSequence, CharSequence charSequence2, mge mge, mge mge2, boolean z2, boolean z3) {
        this.a = j2;
        this.b = z;
        this.c = list;
        this.d = str;
        this.e = charSequence;
        this.f = charSequence2;
        this.g = mge;
        this.h = mge2;
        this.i = z2;
        this.j = z3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l5b)) {
            return false;
        }
        l5b l5b = (l5b) obj;
        return this.a == l5b.a && this.b == l5b.b && hhd.f(this.c, l5b.c) && hhd.f(this.d, l5b.d) && hhd.f(this.e, l5b.e) && hhd.f(this.f, l5b.f) && hhd.f(this.g, l5b.g) && hhd.f(this.h, l5b.h) && this.i == l5b.i && this.j == l5b.j;
    }

    public final int hashCode() {
        int f2 = th2.f(Long.hashCode(this.a) * 31, 31, this.b);
        int i2 = 0;
        List list = this.c;
        int hashCode = (f2 + (list == null ? 0 : list.hashCode())) * 31;
        String str = this.d;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        CharSequence charSequence = this.e;
        int hashCode3 = (hashCode2 + (charSequence == null ? 0 : charSequence.hashCode())) * 31;
        CharSequence charSequence2 = this.f;
        int hashCode4 = (hashCode3 + (charSequence2 == null ? 0 : charSequence2.hashCode())) * 31;
        mge mge = this.g;
        int hashCode5 = (hashCode4 + (mge == null ? 0 : mge.hashCode())) * 31;
        mge mge2 = this.h;
        if (mge2 != null) {
            i2 = mge2.hashCode();
        }
        return Boolean.hashCode(this.j) + th2.f((hashCode5 + i2) * 31, 31, this.i);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ProfileAppBarState(idForAvatar=");
        sb.append(this.a);
        sb.append(", editEnabled=");
        sb.append(this.b);
        sb.append(", avatarUrls=");
        sb.append(this.c);
        sb.append(", lowResAvatarUrl=");
        sb.append(this.d);
        sb.append(", title=");
        sb.append(this.e);
        sb.append(", abbreviation=");
        sb.append(this.f);
        sb.append(", subtitle=");
        sb.append(this.g);
        sb.append(", link=");
        sb.append(this.h);
        sb.append(", isBlocked=");
        sb.append(this.i);
        sb.append(", isVerified=");
        return hr1.j(sb, this.j, ")");
    }
}

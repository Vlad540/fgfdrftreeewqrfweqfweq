package defpackage;

/* renamed from: x7b  reason: default package */
public final class x7b {
    public final String a;
    public final long b;
    public final CharSequence c;
    public final CharSequence d;
    public final boolean e;
    public final boolean f;
    public final int g;

    public x7b(String str, long j, CharSequence charSequence, CharSequence charSequence2, boolean z, boolean z2, int i) {
        this.a = str;
        this.b = j;
        this.c = charSequence;
        this.d = charSequence2;
        this.e = z;
        this.f = z2;
        this.g = i;
    }

    public static x7b a(x7b x7b, String str, boolean z, int i) {
        if ((i & 1) != 0) {
            str = x7b.a;
        }
        String str2 = str;
        if ((i & 16) != 0) {
            z = x7b.e;
        }
        return new x7b(str2, x7b.b, x7b.c, x7b.d, z, x7b.f, x7b.g);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof x7b)) {
            return false;
        }
        x7b x7b = (x7b) obj;
        return hhd.f(this.a, x7b.a) && this.b == x7b.b && hhd.f(this.c, x7b.c) && hhd.f(this.d, x7b.d) && this.e == x7b.e && this.f == x7b.f && this.g == x7b.g;
    }

    public final int hashCode() {
        int i = 0;
        String str = this.a;
        int m = sxe.m((str == null ? 0 : str.hashCode()) * 31, 31, this.b);
        CharSequence charSequence = this.c;
        int hashCode = (m + (charSequence == null ? 0 : charSequence.hashCode())) * 31;
        CharSequence charSequence2 = this.d;
        if (charSequence2 != null) {
            i = charSequence2.hashCode();
        }
        return hr1.t(this.g) + th2.f(th2.f((hashCode + i) * 31, 31, this.e), 31, this.f);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ProfileEditAppBarState(avatarUrl=");
        sb.append(this.a);
        sb.append(", avatarSourceId=");
        sb.append(this.b);
        sb.append(", firstName=");
        sb.append(this.c);
        sb.append(", abbreviation=");
        sb.append(this.d);
        sb.append(", showAcceptChanges=");
        sb.append(this.e);
        sb.append(", showAddPhoto=");
        sb.append(this.f);
        sb.append(", confirmType=");
        int i = this.g;
        sb.append(i != 1 ? i != 2 ? "null" : "TOOLBAR_ACTION" : "BUTTON");
        sb.append(")");
        return sb.toString();
    }
}

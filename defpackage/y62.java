package defpackage;

import java.util.List;

/* renamed from: y62  reason: default package */
public final class y62 implements pg7 {
    public final long X;
    public final List Y;
    public final int Z = a7a.e;
    public final mge a;
    public final mge b;
    public final String c;
    public final CharSequence o;
    public final long w0 = ((long) Integer.hashCode(a7a.d));

    public y62(mge mge, hge hge, String str, CharSequence charSequence, long j, List list) {
        this.a = mge;
        this.b = hge;
        this.c = str;
        this.o = charSequence;
        this.X = j;
        this.Y = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof y62)) {
            return false;
        }
        y62 y62 = (y62) obj;
        return hhd.f(this.a, y62.a) && hhd.f(this.b, y62.b) && hhd.f(this.c, y62.c) && hhd.f(this.o, y62.o) && this.X == y62.X && hhd.f(this.Y, y62.Y);
    }

    public final long getItemId() {
        return this.w0;
    }

    public final int hashCode() {
        int e = c3d.e(this.a.hashCode() * 31, 31, this.b);
        int i = 0;
        String str = this.c;
        int hashCode = (e + (str == null ? 0 : str.hashCode())) * 31;
        CharSequence charSequence = this.o;
        if (charSequence != null) {
            i = charSequence.hashCode();
        }
        return this.Y.hashCode() + sxe.m((hashCode + i) * 31, 31, this.X);
    }

    public final int l() {
        return this.Z;
    }

    public final String toString() {
        return "ChatDescriptionViewListItem(title=" + this.a + ", subtitle=" + this.b + ", avatarUrl=" + this.c + ", avatarPlaceholder=" + this.o + ", avatarPlaceholderId=" + this.X + ", descriptionList=" + this.Y + ")";
    }
}

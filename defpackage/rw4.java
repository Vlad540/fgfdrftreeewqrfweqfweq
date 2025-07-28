package defpackage;

/* renamed from: rw4  reason: default package */
public final class rw4 implements uw4 {
    public final String a;
    public final CharSequence b;
    public final long c;
    public final mge d;
    public final mge e;

    public rw4(String str, CharSequence charSequence, long j, hge hge, hge hge2) {
        this.a = str;
        this.b = charSequence;
        this.c = j;
        this.d = hge;
        this.e = hge2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rw4)) {
            return false;
        }
        rw4 rw4 = (rw4) obj;
        return hhd.f(this.a, rw4.a) && hhd.f(this.b, rw4.b) && this.c == rw4.c && hhd.f(this.d, rw4.d) && hhd.f(this.e, rw4.e);
    }

    public final int hashCode() {
        int i = 0;
        String str = this.a;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        CharSequence charSequence = this.b;
        if (charSequence != null) {
            i = charSequence.hashCode();
        }
        return this.e.hashCode() + c3d.e(sxe.m((hashCode + i) * 31, 31, this.c), 31, this.d);
    }

    public final String toString() {
        return "EmptyBot(avatar=" + this.a + ", avatarPlaceholder=" + this.b + ", avatarPlaceholderId=" + this.c + ", title=" + this.d + ", subtitle=" + this.e + ")";
    }
}

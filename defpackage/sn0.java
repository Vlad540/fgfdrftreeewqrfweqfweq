package defpackage;

/* renamed from: sn0  reason: default package */
public final class sn0 implements pg7 {
    public final long a;
    public final String b;
    public final CharSequence c;
    public final CharSequence o;

    public sn0(long j, String str, String str2, CharSequence charSequence) {
        this.a = j;
        this.b = str;
        this.c = str2;
        this.o = charSequence;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof sn0)) {
            return false;
        }
        sn0 sn0 = (sn0) obj;
        return this.a == sn0.a && hhd.f(this.b, sn0.b) && hhd.f(this.c, sn0.c) && hhd.f(this.o, sn0.o);
    }

    public final long getItemId() {
        return this.a;
    }

    public final int hashCode() {
        int hashCode = Long.hashCode(this.a) * 31;
        String str = this.b;
        return this.o.hashCode() + me4.f(this.c, (hashCode + (str == null ? 0 : str.hashCode())) * 31, 31);
    }

    public final int l() {
        return 0;
    }

    public final String toString() {
        return "BlackListItem(itemId=" + this.a + ", avatar=" + this.b + ", name=" + this.c + ", abbreviation=" + this.o + ")";
    }
}

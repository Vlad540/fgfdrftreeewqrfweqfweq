package defpackage;

/* renamed from: kta  reason: default package */
public final class kta {
    public final long a;
    public final long b;
    public final String c;
    public final String d;
    public final CharSequence e;

    public kta(long j, long j2, CharSequence charSequence, String str, String str2) {
        this.a = j;
        this.b = j2;
        this.c = str;
        this.d = str2;
        this.e = charSequence;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kta)) {
            return false;
        }
        kta kta = (kta) obj;
        return this.a == kta.a && this.b == kta.b && hhd.f(this.c, kta.c) && hhd.f(this.d, kta.d) && hhd.f(this.e, kta.e);
    }

    public final int hashCode() {
        return this.e.hashCode() + me4.d(me4.d(sxe.m(Long.hashCode(this.a) * 31, 31, this.b), 31, this.c), 31, this.d);
    }

    public final String toString() {
        return "PickerChip(id=" + this.a + ", avatarSourceId=" + this.b + ", title=" + this.c + ", avatarUrl=" + this.d + ", abbreviation=" + this.e + ")";
    }
}

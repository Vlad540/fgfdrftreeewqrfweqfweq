package defpackage;

/* renamed from: li9  reason: default package */
public final class li9 {
    public final long a;
    public final String b;
    public final Boolean c;

    public li9(long j, String str, Boolean bool) {
        this.a = j;
        this.b = str;
        this.c = bool;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof li9)) {
            return false;
        }
        li9 li9 = (li9) obj;
        return this.a == li9.a && hhd.f(this.b, li9.b) && hhd.f(this.c, li9.c);
    }

    public final int hashCode() {
        int d = me4.d(Long.hashCode(this.a) * 31, 31, this.b);
        Boolean bool = this.c;
        return d + (bool == null ? 0 : bool.hashCode());
    }

    public final String toString() {
        return "NeuroAvatarInfo(id=" + this.a + ", url=" + this.b + ", default=" + this.c + ")";
    }
}

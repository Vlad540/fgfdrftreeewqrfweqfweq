package defpackage;

/* renamed from: er8  reason: default package */
public final class er8 {
    public static final er8 d = new er8(-1, (CharSequence) null, (String) null);
    public final long a;
    public final String b;
    public final CharSequence c;

    public er8(long j, CharSequence charSequence, String str) {
        this.a = j;
        this.b = str;
        this.c = charSequence;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof er8)) {
            return false;
        }
        er8 er8 = (er8) obj;
        return this.a == er8.a && hhd.f(this.b, er8.b) && hhd.f(this.c, er8.c);
    }

    public final int hashCode() {
        int hashCode = Long.hashCode(this.a) * 31;
        int i = 0;
        String str = this.b;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        CharSequence charSequence = this.c;
        if (charSequence != null) {
            i = charSequence.hashCode();
        }
        return hashCode2 + i;
    }

    public final String toString() {
        return "AvatarParams(id=" + this.a + ", url=" + this.b + ", placeholder=" + this.c + ")";
    }
}

package defpackage;

/* renamed from: ub0  reason: default package */
public final class ub0 {
    public final long a;
    public final CharSequence b;

    public ub0(CharSequence charSequence, long j) {
        this.a = j;
        this.b = charSequence;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ub0)) {
            return false;
        }
        ub0 ub0 = (ub0) obj;
        return this.a == ub0.a && hhd.f(this.b, ub0.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (Long.hashCode(this.a) * 31);
    }

    public final String toString() {
        return "AvatarAbbreviationModel(sourceId=" + this.a + ", abbreviation=" + this.b + ")";
    }
}

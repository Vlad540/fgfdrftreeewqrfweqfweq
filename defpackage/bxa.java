package defpackage;

/* renamed from: bxa  reason: default package */
public final class bxa implements fxa {
    public final CharSequence a;
    public final long b;

    public bxa(CharSequence charSequence, long j) {
        this.a = charSequence;
        this.b = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bxa)) {
            return false;
        }
        bxa bxa = (bxa) obj;
        return hhd.f(this.a, bxa.a) && this.b == bxa.b;
    }

    public final int hashCode() {
        return Long.hashCode(this.b) + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "Abbreviation(abbreviation=" + this.a + ", avatarSourceId=" + this.b + ")";
    }
}

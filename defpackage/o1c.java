package defpackage;

/* renamed from: o1c  reason: default package */
public final class o1c extends d8 {
    public final CharSequence f;

    public o1c(CharSequence charSequence) {
        super(16);
        this.f = charSequence;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof o1c) && hhd.f(this.f, ((o1c) obj).f);
    }

    public final int hashCode() {
        return this.f.hashCode();
    }

    public final String toString() {
        return "Abbreviation(abbreviation=" + this.f + ")";
    }
}

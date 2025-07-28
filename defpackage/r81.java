package defpackage;

/* renamed from: r81  reason: default package */
public final class r81 extends t81 {
    public final CharSequence b;

    public r81(CharSequence charSequence) {
        super(0);
        this.b = charSequence;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof r81) && hhd.f(this.b, ((r81) obj).b);
    }

    public final int hashCode() {
        return this.b.hashCode();
    }

    public final String toString() {
        return "ShareLink(link=" + this.b + ")";
    }
}

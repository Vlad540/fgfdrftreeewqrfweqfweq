package defpackage;

/* renamed from: p81  reason: default package */
public final class p81 extends t81 {
    public final CharSequence b;

    public p81(CharSequence charSequence) {
        super(0);
        this.b = charSequence;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof p81) && hhd.f(this.b, ((p81) obj).b);
    }

    public final int hashCode() {
        return this.b.hashCode();
    }

    public final String toString() {
        return "CopyLink(link=" + this.b + ")";
    }
}

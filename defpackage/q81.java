package defpackage;

/* renamed from: q81  reason: default package */
public final class q81 extends t81 {
    public final CharSequence b;

    public q81(CharSequence charSequence) {
        super(0);
        this.b = charSequence;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof q81) && hhd.f(this.b, ((q81) obj).b);
    }

    public final int hashCode() {
        return this.b.hashCode();
    }

    public final String toString() {
        return "SendToChatLink(link=" + this.b + ")";
    }
}

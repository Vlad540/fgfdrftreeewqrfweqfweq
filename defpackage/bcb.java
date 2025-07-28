package defpackage;

/* renamed from: bcb  reason: default package */
public final class bcb extends mcb {
    public final CharSequence a;

    public bcb(CharSequence charSequence) {
        this.a = charSequence;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof bcb) && hhd.f(this.a, ((bcb) obj).a);
    }

    public final long getItemId() {
        return (long) 8;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final int l() {
        return 8;
    }

    public final String toString() {
        return "ChatDescription(text=" + this.a + ")";
    }
}

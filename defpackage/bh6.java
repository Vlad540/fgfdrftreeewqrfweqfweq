package defpackage;

/* renamed from: bh6  reason: default package */
public final class bh6 extends dh6 {
    public final CharSequence a;

    public bh6(CharSequence charSequence) {
        this.a = charSequence;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof bh6) && hhd.f(this.a, ((bh6) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "Name(name=" + this.a + ")";
    }
}

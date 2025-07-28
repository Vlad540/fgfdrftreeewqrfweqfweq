package defpackage;

/* renamed from: zg6  reason: default package */
public final class zg6 extends dh6 {
    public final CharSequence a;

    public zg6(CharSequence charSequence) {
        this.a = charSequence;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof zg6) && hhd.f(this.a, ((zg6) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "Description(description=" + this.a + ")";
    }
}

package defpackage;

/* renamed from: mme  reason: default package */
public final class mme extends e07 {
    public final CharSequence g;

    public mme(CharSequence charSequence) {
        this.g = charSequence;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof mme) && hhd.f(this.g, ((mme) obj).g);
    }

    public final int hashCode() {
        CharSequence charSequence = this.g;
        if (charSequence == null) {
            return 0;
        }
        return charSequence.hashCode();
    }

    public final String toString() {
        return "Connected(text=" + this.g + ")";
    }

    public final CharSequence w() {
        return this.g;
    }
}

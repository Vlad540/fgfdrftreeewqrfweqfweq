package defpackage;

/* renamed from: nme  reason: default package */
public final class nme extends e07 {
    public final CharSequence g;

    public nme(String str) {
        this.g = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof nme) && hhd.f(this.g, ((nme) obj).g);
    }

    public final int hashCode() {
        CharSequence charSequence = this.g;
        if (charSequence == null) {
            return 0;
        }
        return charSequence.hashCode();
    }

    public final String toString() {
        return "LostConnection(text=" + this.g + ")";
    }

    public final CharSequence w() {
        return this.g;
    }
}

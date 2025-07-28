package defpackage;

import java.io.Serializable;

/* renamed from: ryb  reason: default package */
public final class ryb implements Comparable, CharSequence, Serializable {
    public final CharSequence a;

    public ryb(CharSequence charSequence) {
        this.a = charSequence;
    }

    public final char charAt(int i) {
        return this.a.charAt(i);
    }

    public final int compareTo(Object obj) {
        return this.a.toString().compareTo(((ryb) obj).a.toString());
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ryb)) {
            return false;
        }
        return hhd.f(this.a.toString(), ((ryb) obj).a.toString());
    }

    public final int hashCode() {
        return (this.a.hashCode() * 31) + ryb.class.hashCode();
    }

    public final int length() {
        return this.a.length();
    }

    public final CharSequence subSequence(int i, int i2) {
        return this.a.subSequence(i, i2);
    }

    public final String toString() {
        return this.a.toString();
    }
}

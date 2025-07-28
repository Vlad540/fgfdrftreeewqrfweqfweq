package defpackage;

/* renamed from: re5  reason: default package */
public final class re5 {
    public final l90 a;
    public final l90 b;

    public re5(l90 l90) {
        this.a = l90;
        this.b = l90;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof re5)) {
            return false;
        }
        return this.b.equals(((re5) obj).b);
    }

    public final int hashCode() {
        return this.b.hashCode();
    }

    public final String toString() {
        return this.b.toString().replaceFirst("FileOutputOptionsInternal", "FileOutputOptions");
    }
}

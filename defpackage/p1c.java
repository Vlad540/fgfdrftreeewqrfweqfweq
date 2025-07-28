package defpackage;

/* renamed from: p1c  reason: default package */
public final class p1c extends d8 {
    public final String f;

    public p1c(String str) {
        super(16);
        this.f = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof p1c) && hhd.f(this.f, ((p1c) obj).f);
    }

    public final int hashCode() {
        String str = this.f;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }

    public final String toString() {
        return wn6.l(new StringBuilder("Avatar(avatarUrl="), this.f, ")");
    }
}

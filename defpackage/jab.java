package defpackage;

/* renamed from: jab  reason: default package */
public final class jab {
    public final Long a;
    public final mge b;

    public jab(Long l, mge mge) {
        this.a = l;
        this.b = mge;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jab)) {
            return false;
        }
        jab jab = (jab) obj;
        return hhd.f(this.a, jab.a) && hhd.f(this.b, jab.b);
    }

    public final int hashCode() {
        Long l = this.a;
        return this.b.hashCode() + ((l == null ? 0 : l.hashCode()) * 31);
    }

    public final String toString() {
        return "UpdateError(requestId=" + this.a + ", errorText=" + this.b + ")";
    }
}

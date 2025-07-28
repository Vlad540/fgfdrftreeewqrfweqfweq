package defpackage;

/* renamed from: kab  reason: default package */
public final class kab implements nab {
    public final Long a;
    public final mge b;

    public kab(Long l, mge mge) {
        this.a = l;
        this.b = mge;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kab)) {
            return false;
        }
        kab kab = (kab) obj;
        return hhd.f(this.a, kab.a) && hhd.f(this.b, kab.b);
    }

    public final int hashCode() {
        Long l = this.a;
        return this.b.hashCode() + ((l == null ? 0 : l.hashCode()) * 31);
    }

    public final String toString() {
        return "UpdateError(requestId=" + this.a + ", errorText=" + this.b + ")";
    }
}

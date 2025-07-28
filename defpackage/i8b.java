package defpackage;

/* renamed from: i8b  reason: default package */
public final class i8b implements j8b {
    public final Long a;
    public final mge b;

    public i8b(Long l, mge mge) {
        this.a = l;
        this.b = mge;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i8b)) {
            return false;
        }
        i8b i8b = (i8b) obj;
        return hhd.f(this.a, i8b.a) && hhd.f(this.b, i8b.b);
    }

    public final int hashCode() {
        Long l = this.a;
        return this.b.hashCode() + ((l == null ? 0 : l.hashCode()) * 31);
    }

    public final String toString() {
        return "UpdateError(requestId=" + this.a + ", errorText=" + this.b + ")";
    }
}

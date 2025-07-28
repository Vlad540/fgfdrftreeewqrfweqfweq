package defpackage;

/* renamed from: u6b  reason: default package */
public final class u6b implements v6b {
    public final mge a;
    public final Integer b;

    public u6b(mge mge, Integer num) {
        this.a = mge;
        this.b = num;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof u6b)) {
            return false;
        }
        u6b u6b = (u6b) obj;
        return hhd.f(this.a, u6b.a) && hhd.f(this.b, u6b.b);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        Integer num = this.b;
        return hashCode + (num == null ? 0 : num.hashCode());
    }

    public final String toString() {
        return "ShowSnackbar(title=" + this.a + ", iconRes=" + this.b + ")";
    }
}

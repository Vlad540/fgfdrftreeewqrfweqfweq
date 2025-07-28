package defpackage;

/* renamed from: b02  reason: default package */
public final class b02 {
    public final mge a;
    public final Integer b;

    public b02(hge hge, Integer num) {
        this.a = hge;
        this.b = num;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b02)) {
            return false;
        }
        b02 b02 = (b02) obj;
        return hhd.f(this.a, b02.a) && hhd.f(this.b, b02.b);
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

package defpackage;

/* renamed from: fz0  reason: default package */
public final class fz0 {
    public final ge1 a;
    public final Long b;

    public fz0(ge1 ge1, Long l) {
        this.a = ge1;
        this.b = l;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fz0)) {
            return false;
        }
        fz0 fz0 = (fz0) obj;
        return hhd.f(this.a, fz0.a) && hhd.f(this.b, fz0.b);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        Long l = this.b;
        return hashCode + (l == null ? 0 : l.hashCode());
    }

    public final String toString() {
        return "CallAsrInfo(initiatorId=" + this.a + ", movieId=" + this.b + ")";
    }
}

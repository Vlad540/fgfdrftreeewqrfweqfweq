package defpackage;

/* renamed from: t8d  reason: default package */
public final class t8d extends t81 {
    public final mge b;
    public final Integer c;

    public t8d(mge mge, Integer num) {
        super(14);
        this.b = mge;
        this.c = num;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof t8d)) {
            return false;
        }
        t8d t8d = (t8d) obj;
        return hhd.f(this.b, t8d.b) && hhd.f(this.c, t8d.c);
    }

    public final int hashCode() {
        int hashCode = this.b.hashCode() * 31;
        Integer num = this.c;
        return hashCode + (num == null ? 0 : num.hashCode());
    }

    public final String toString() {
        return "ShowSnackbar(title=" + this.b + ", icon=" + this.c + ")";
    }
}

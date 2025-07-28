package defpackage;

/* renamed from: e9b  reason: default package */
public final class e9b extends t81 {
    public final mge b;
    public final Integer c;

    public e9b(mge mge, Integer num) {
        super(9);
        this.b = mge;
        this.c = num;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e9b)) {
            return false;
        }
        e9b e9b = (e9b) obj;
        return hhd.f(this.b, e9b.b) && hhd.f(this.c, e9b.c);
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

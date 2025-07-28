package defpackage;

/* renamed from: bfb  reason: default package */
public final class bfb extends cfb {
    public final Integer a;
    public final mge b;

    public bfb(mge mge, Integer num) {
        this.a = num;
        this.b = mge;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bfb)) {
            return false;
        }
        bfb bfb = (bfb) obj;
        return hhd.f(this.a, bfb.a) && hhd.f(this.b, bfb.b);
    }

    public final int hashCode() {
        Integer num = this.a;
        return this.b.hashCode() + ((num == null ? 0 : num.hashCode()) * 31);
    }

    public final String toString() {
        return "ShowSuccessSnackbar(iconRes=" + this.a + ", textSource=" + this.b + ")";
    }
}

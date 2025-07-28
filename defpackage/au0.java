package defpackage;

/* renamed from: au0  reason: default package */
public final class au0 {
    public final Integer a;
    public final int b;

    public au0(int i, Integer num) {
        this.a = num;
        this.b = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof au0)) {
            return false;
        }
        au0 au0 = (au0) obj;
        return hhd.f(this.a, au0.a) && this.b == au0.b;
    }

    public final int hashCode() {
        Integer num = this.a;
        return Integer.hashCode(this.b) + ((num == null ? 0 : num.hashCode()) * 31);
    }

    public final String toString() {
        return "BackgroundColors(color=" + this.a + ", rippleColor=" + this.b + ")";
    }
}

package defpackage;

/* renamed from: yq0  reason: default package */
public final class yq0 {
    public final zq0 a;
    public final ar0 b;
    public final br0 c;

    public yq0(zq0 zq0, ar0 ar0, br0 br0) {
        this.a = zq0;
        this.b = ar0;
        this.c = br0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof yq0)) {
            return false;
        }
        yq0 yq0 = (yq0) obj;
        return hhd.f(this.a, yq0.a) && hhd.f(this.b, yq0.b) && hhd.f(this.c, yq0.c);
    }

    public final int hashCode() {
        int hashCode = this.b.hashCode();
        return this.c.hashCode() + ((hashCode + (this.a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return "BubbleBackgroundFocusColors(regular=" + this.a + ", singleMedia=" + this.b + ", transparent=" + this.c + ")";
    }
}

package defpackage;

/* renamed from: f43  reason: default package */
public final class f43 {
    public final d43 a;
    public final e43 b;
    public final h43 c;
    public final j43 d;

    public f43(d43 d43, e43 e43, h43 h43, j43 j43) {
        this.a = d43;
        this.b = e43;
        this.c = h43;
        this.d = j43;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f43)) {
            return false;
        }
        f43 f43 = (f43) obj;
        return hhd.f(this.a, f43.a) && hhd.f(this.b, f43.b) && hhd.f(this.c, f43.c) && hhd.f(this.d, f43.d);
    }

    public final int hashCode() {
        int hashCode = this.b.hashCode();
        int hashCode2 = this.c.hashCode();
        return this.d.hashCode() + ((hashCode2 + ((hashCode + (this.a.hashCode() * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "CommonBackgroundSkeletonColors(bubbleGradientPrimary=" + this.a + ", bubbleGradientSecondary=" + this.b + ", stickerPrimary=" + this.c + ", stickerSecondary=" + this.d + ")";
    }
}

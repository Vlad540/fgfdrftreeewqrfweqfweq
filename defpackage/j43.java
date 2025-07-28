package defpackage;

import java.util.Arrays;

/* renamed from: j43  reason: default package */
public final class j43 {
    public final i43 a;
    public final int[] b;

    public j43(i43 i43, int[] iArr) {
        this.a = i43;
        this.b = iArr;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j43)) {
            return false;
        }
        j43 j43 = (j43) obj;
        return hhd.f(this.a, j43.a) && hhd.f(this.b, j43.b);
    }

    public final int hashCode() {
        return Arrays.hashCode(this.b) + (this.a.hashCode() * 31);
    }

    public final String toString() {
        String arrays = Arrays.toString(this.b);
        return "CommonBackgroundSkeletonStickerSecondaryColors(baseGradient=" + this.a + ", tongueGradient=" + arrays + ")";
    }
}

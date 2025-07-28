package defpackage;

import java.util.Arrays;

/* renamed from: h43  reason: default package */
public final class h43 {
    public final g43 a;
    public final int[] b;

    public h43(g43 g43, int[] iArr) {
        this.a = g43;
        this.b = iArr;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h43)) {
            return false;
        }
        h43 h43 = (h43) obj;
        return hhd.f(this.a, h43.a) && hhd.f(this.b, h43.b);
    }

    public final int hashCode() {
        return Arrays.hashCode(this.b) + (this.a.hashCode() * 31);
    }

    public final String toString() {
        String arrays = Arrays.toString(this.b);
        return "CommonBackgroundSkeletonStickerPrimaryColors(baseGradient=" + this.a + ", tongueGradient=" + arrays + ")";
    }
}

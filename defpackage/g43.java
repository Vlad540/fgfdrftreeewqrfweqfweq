package defpackage;

import java.util.Arrays;

/* renamed from: g43  reason: default package */
public final class g43 {
    public final int[] a;
    public final int b;

    public g43(int i, int[] iArr) {
        this.a = iArr;
        this.b = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g43)) {
            return false;
        }
        g43 g43 = (g43) obj;
        return hhd.f(this.a, g43.a) && this.b == g43.b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.b) + (Arrays.hashCode(this.a) * 31);
    }

    public final String toString() {
        return wn6.j(hr1.m("CommonBackgroundSkeletonStickerPrimaryBaseGradientColors(gradient=", Arrays.toString(this.a), ", staticBackground="), this.b, ")");
    }
}

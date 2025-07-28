package defpackage;

import java.util.Arrays;

/* renamed from: i43  reason: default package */
public final class i43 {
    public final int[] a;
    public final int b;

    public i43(int i, int[] iArr) {
        this.a = iArr;
        this.b = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i43)) {
            return false;
        }
        i43 i43 = (i43) obj;
        return hhd.f(this.a, i43.a) && this.b == i43.b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.b) + (Arrays.hashCode(this.a) * 31);
    }

    public final String toString() {
        return wn6.j(hr1.m("CommonBackgroundSkeletonStickerSecondaryBaseGradientColors(gradient=", Arrays.toString(this.a), ", staticBackground="), this.b, ")");
    }
}

package defpackage;

import java.util.Arrays;

/* renamed from: d43  reason: default package */
public final class d43 {
    public final int[] a;
    public final int b;

    public d43(int i, int[] iArr) {
        this.a = iArr;
        this.b = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d43)) {
            return false;
        }
        d43 d43 = (d43) obj;
        return hhd.f(this.a, d43.a) && this.b == d43.b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.b) + (Arrays.hashCode(this.a) * 31);
    }

    public final String toString() {
        return wn6.j(hr1.m("CommonBackgroundSkeletonBubbleGradientPrimaryColors(gradient=", Arrays.toString(this.a), ", staticBackground="), this.b, ")");
    }
}

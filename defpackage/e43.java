package defpackage;

import java.util.Arrays;

/* renamed from: e43  reason: default package */
public final class e43 {
    public final int[] a;
    public final int b;

    public e43(int i, int[] iArr) {
        this.a = iArr;
        this.b = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e43)) {
            return false;
        }
        e43 e43 = (e43) obj;
        return hhd.f(this.a, e43.a) && this.b == e43.b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.b) + (Arrays.hashCode(this.a) * 31);
    }

    public final String toString() {
        return wn6.j(hr1.m("CommonBackgroundSkeletonBubbleGradientSecondaryColors(gradient=", Arrays.toString(this.a), ", staticBackground="), this.b, ")");
    }
}

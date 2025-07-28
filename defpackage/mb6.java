package defpackage;

import java.util.Arrays;

/* renamed from: mb6  reason: default package */
public final class mb6 {
    public final int[] a;
    public final int[] b;

    public mb6(int[] iArr, int[] iArr2) {
        this.a = iArr;
        this.b = iArr2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mb6)) {
            return false;
        }
        mb6 mb6 = (mb6) obj;
        return hhd.f(this.a, mb6.a) && hhd.f(this.b, mb6.b);
    }

    public final int hashCode() {
        return Arrays.hashCode(this.b) + (Arrays.hashCode(this.a) * 31);
    }

    public final String toString() {
        return c3d.i("GradientsOverlayColors(surfaceGroundGradient=", Arrays.toString(this.a), ", surfacePrimaryGradient=", Arrays.toString(this.b), ")");
    }
}

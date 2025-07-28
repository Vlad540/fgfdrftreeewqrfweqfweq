package defpackage;

import java.util.Arrays;

/* renamed from: kb6  reason: default package */
public final class kb6 {
    public final int[] a;
    public final int[] b;

    public kb6(int[] iArr, int[] iArr2) {
        this.a = iArr;
        this.b = iArr2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kb6)) {
            return false;
        }
        kb6 kb6 = (kb6) obj;
        return hhd.f(this.a, kb6.a) && hhd.f(this.b, kb6.b);
    }

    public final int hashCode() {
        return Arrays.hashCode(this.b) + (Arrays.hashCode(this.a) * 31);
    }

    public final String toString() {
        return c3d.i("GradientsEmptyBlockIconWrapperColors(shapeGradient=", Arrays.toString(this.a), ", strokeGradient=", Arrays.toString(this.b), ")");
    }
}

package defpackage;

import java.util.Arrays;

/* renamed from: jb6  reason: default package */
public final class jb6 {
    public final int[] a;

    public jb6(int[] iArr) {
        this.a = iArr;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof jb6) && hhd.f(this.a, ((jb6) obj).a);
    }

    public final int hashCode() {
        return Arrays.hashCode(this.a);
    }

    public final String toString() {
        return wn6.i("GradientsComplexColors(overlayFloatingGradient=", Arrays.toString(this.a), ")");
    }
}

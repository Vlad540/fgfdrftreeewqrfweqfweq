package defpackage;

import java.util.Arrays;

/* renamed from: ohe  reason: default package */
public final class ohe {
    public final int[] a;
    public final float b;

    public ohe(int[] iArr, float f) {
        this.a = iArr;
        this.b = f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ohe)) {
            return false;
        }
        ohe ohe = (ohe) obj;
        return hhd.f(this.a, ohe.a) && Float.compare(this.b, ohe.b) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.b) + (Arrays.hashCode(this.a) * 31);
    }

    public final String toString() {
        String arrays = Arrays.toString(this.a);
        return "Gradient(colors=" + arrays + ", angle=" + this.b + ")";
    }
}

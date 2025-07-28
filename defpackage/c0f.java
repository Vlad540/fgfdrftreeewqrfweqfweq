package defpackage;

import java.util.Arrays;

/* renamed from: c0f  reason: default package */
public final class c0f {
    public final int[] a;
    public final float b;

    public c0f(int[] iArr, float f) {
        this.a = iArr;
        this.b = f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c0f)) {
            return false;
        }
        c0f c0f = (c0f) obj;
        return hhd.f(this.a, c0f.a) && Float.compare(this.b, c0f.b) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.b) + (Arrays.hashCode(this.a) * 31);
    }

    public final String toString() {
        String arrays = Arrays.toString(this.a);
        return "Gradient(colors=" + arrays + ", angle=" + this.b + ")";
    }
}

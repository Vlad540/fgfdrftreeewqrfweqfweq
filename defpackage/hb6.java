package defpackage;

import java.util.Arrays;

/* renamed from: hb6  reason: default package */
public final class hb6 {
    public final int[] a;
    public final int[] b;
    public final int[] c;

    public hb6(int[] iArr, int[] iArr2, int[] iArr3) {
        this.a = iArr;
        this.b = iArr2;
        this.c = iArr3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hb6)) {
            return false;
        }
        hb6 hb6 = (hb6) obj;
        return hhd.f(this.a, hb6.a) && hhd.f(this.b, hb6.b) && hhd.f(this.c, hb6.c);
    }

    public final int hashCode() {
        int hashCode = Arrays.hashCode(this.b);
        return Arrays.hashCode(this.c) + ((hashCode + (Arrays.hashCode(this.a) * 31)) * 31);
    }

    public final String toString() {
        String arrays = Arrays.toString(this.a);
        String arrays2 = Arrays.toString(this.b);
        return wn6.l(c3d.j("GradientsButtonTextPromoColors(defaultGradient=", arrays, ", disabledGradient=", arrays2, ", pressedGradient="), Arrays.toString(this.c), ")");
    }
}

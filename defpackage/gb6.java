package defpackage;

import java.util.Arrays;

/* renamed from: gb6  reason: default package */
public final class gb6 {
    public final int[] a;
    public final int[] b;
    public final int[] c;
    public final int[] d;
    public final int[] e;

    public gb6(int[] iArr, int[] iArr2, int[] iArr3, int[] iArr4, int[] iArr5) {
        this.a = iArr;
        this.b = iArr2;
        this.c = iArr3;
        this.d = iArr4;
        this.e = iArr5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gb6)) {
            return false;
        }
        gb6 gb6 = (gb6) obj;
        return hhd.f(this.a, gb6.a) && hhd.f(this.b, gb6.b) && hhd.f(this.c, gb6.c) && hhd.f(this.d, gb6.d) && hhd.f(this.e, gb6.e);
    }

    public final int hashCode() {
        int hashCode = Arrays.hashCode(this.b);
        int hashCode2 = Arrays.hashCode(this.c);
        int hashCode3 = Arrays.hashCode(this.d);
        return Arrays.hashCode(this.e) + ((hashCode3 + ((hashCode2 + ((hashCode + (Arrays.hashCode(this.a) * 31)) * 31)) * 31)) * 31);
    }

    public final String toString() {
        String arrays = Arrays.toString(this.a);
        String arrays2 = Arrays.toString(this.b);
        String arrays3 = Arrays.toString(this.c);
        String arrays4 = Arrays.toString(this.d);
        String arrays5 = Arrays.toString(this.e);
        StringBuilder j = c3d.j("GradientsBannerDkColors(backgroundFantasyGradient=", arrays, ", backgroundIconContainerGradient=", arrays2, ", backgroundVibrantGradient=");
        j.append(arrays3);
        j.append(", strokeIconContainerGradient=");
        j.append(arrays4);
        j.append(", backgroundPaleBlueGradient=");
        return wn6.l(j, arrays5, ")");
    }
}

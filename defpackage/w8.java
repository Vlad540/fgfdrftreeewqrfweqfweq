package defpackage;

import java.util.Arrays;

/* renamed from: w8  reason: default package */
public final class w8 {
    public static final w8 g = new w8(new u8[0], 0, -9223372036854775807L, 0);
    public static final u8 h;
    public static final String i = Integer.toString(1, 36);
    public static final String j = Integer.toString(2, 36);
    public static final String k = Integer.toString(3, 36);
    public static final String l = Integer.toString(4, 36);
    public final Object a = null;
    public final int b;
    public final long c;
    public final long d;
    public final int e;
    public final u8[] f;

    static {
        u8 u8Var = new u8(0, -1, -1, new int[0], new l68[0], new long[0], 0, false);
        int[] iArr = u8Var.f;
        int length = iArr.length;
        int max = Math.max(0, length);
        int[] copyOf = Arrays.copyOf(iArr, max);
        Arrays.fill(copyOf, length, max, 0);
        long[] jArr = u8Var.g;
        int length2 = jArr.length;
        int max2 = Math.max(0, length2);
        long[] copyOf2 = Arrays.copyOf(jArr, max2);
        Arrays.fill(copyOf2, length2, max2, -9223372036854775807L);
        long j2 = u8Var.h;
        boolean z = u8Var.i;
        h = new u8(u8Var.a, 0, u8Var.c, copyOf, (l68[]) Arrays.copyOf(u8Var.e, 0), copyOf2, j2, z);
        int i2 = oze.a;
    }

    public w8(u8[] u8VarArr, long j2, long j3, int i2) {
        this.c = j2;
        this.d = j3;
        this.b = u8VarArr.length + i2;
        this.f = u8VarArr;
        this.e = i2;
    }

    public final u8 a(int i2) {
        int i3 = this.e;
        return i2 < i3 ? h : this.f[i2 - i3];
    }

    public final boolean b(int i2) {
        if (i2 == this.b - 1) {
            u8 a2 = a(i2);
            return a2.i && a2.a == Long.MIN_VALUE && a2.b == -1;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || w8.class != obj.getClass()) {
            return false;
        }
        w8 w8Var = (w8) obj;
        return oze.a(this.a, w8Var.a) && this.b == w8Var.b && this.c == w8Var.c && this.d == w8Var.d && this.e == w8Var.e && Arrays.equals(this.f, w8Var.f);
    }

    public final int hashCode() {
        int i2 = this.b * 31;
        Object obj = this.a;
        return Arrays.hashCode(this.f) + ((((((((i2 + (obj == null ? 0 : obj.hashCode())) * 31) + ((int) this.c)) * 31) + ((int) this.d)) * 31) + this.e) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AdPlaybackState(adsId=");
        sb.append(this.a);
        sb.append(", adResumePositionUs=");
        sb.append(this.c);
        sb.append(", adGroups=[");
        int i2 = 0;
        while (true) {
            u8[] u8VarArr = this.f;
            if (i2 < u8VarArr.length) {
                sb.append("adGroup(timeUs=");
                sb.append(u8VarArr[i2].a);
                sb.append(", ads=[");
                for (int i3 = 0; i3 < u8VarArr[i2].f.length; i3++) {
                    sb.append("ad(state=");
                    int i4 = u8VarArr[i2].f[i3];
                    if (i4 == 0) {
                        sb.append('_');
                    } else if (i4 == 1) {
                        sb.append('R');
                    } else if (i4 == 2) {
                        sb.append('S');
                    } else if (i4 == 3) {
                        sb.append('P');
                    } else if (i4 != 4) {
                        sb.append('?');
                    } else {
                        sb.append('!');
                    }
                    sb.append(", durationUs=");
                    sb.append(u8VarArr[i2].g[i3]);
                    sb.append(')');
                    if (i3 < u8VarArr[i2].f.length - 1) {
                        sb.append(", ");
                    }
                }
                sb.append("])");
                if (i2 < u8VarArr.length - 1) {
                    sb.append(", ");
                }
                i2++;
            } else {
                sb.append("])");
                return sb.toString();
            }
        }
    }
}

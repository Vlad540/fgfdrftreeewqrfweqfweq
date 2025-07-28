package defpackage;

import android.net.Uri;
import java.util.Arrays;

/* renamed from: v8  reason: default package */
public final class v8 implements lt0 {
    public static final v8 Y = new v8(new t8[0], 0, -9223372036854775807L, 0);
    public static final t8 Z;
    public static final pv0 w0 = new pv0(15);
    public final t8[] X;
    public final int a;
    public final long b;
    public final long c;
    public final int o;

    static {
        int max = Math.max(0, 0);
        int[] copyOf = Arrays.copyOf(new int[0], max);
        Arrays.fill(copyOf, 0, max, 0);
        int max2 = Math.max(0, 0);
        long[] copyOf2 = Arrays.copyOf(new long[0], max2);
        Arrays.fill(copyOf2, 0, max2, -9223372036854775807L);
        Z = new t8(0, 0, copyOf, (Uri[]) Arrays.copyOf(new Uri[0], 0), copyOf2, 0, false);
    }

    public v8(t8[] t8VarArr, long j, long j2, int i) {
        this.b = j;
        this.c = j2;
        this.a = t8VarArr.length + i;
        this.X = t8VarArr;
        this.o = i;
    }

    public final t8 a(int i) {
        int i2 = this.o;
        return i < i2 ? Z : this.X[i - i2];
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || v8.class != obj.getClass()) {
            return false;
        }
        v8 v8Var = (v8) obj;
        return mze.a((Object) null, (Object) null) && this.a == v8Var.a && this.b == v8Var.b && this.c == v8Var.c && this.o == v8Var.o && Arrays.equals(this.X, v8Var.X);
    }

    public final int hashCode() {
        return (((((((this.a * 961) + ((int) this.b)) * 31) + ((int) this.c)) * 31) + this.o) * 31) + Arrays.hashCode(this.X);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AdPlaybackState(adsId=null, adResumePositionUs=");
        sb.append(this.b);
        sb.append(", adGroups=[");
        int i = 0;
        while (true) {
            t8[] t8VarArr = this.X;
            if (i < t8VarArr.length) {
                sb.append("adGroup(timeUs=");
                sb.append(t8VarArr[i].a);
                sb.append(", ads=[");
                for (int i2 = 0; i2 < t8VarArr[i].o.length; i2++) {
                    sb.append("ad(state=");
                    int i3 = t8VarArr[i].o[i2];
                    if (i3 == 0) {
                        sb.append('_');
                    } else if (i3 == 1) {
                        sb.append('R');
                    } else if (i3 == 2) {
                        sb.append('S');
                    } else if (i3 == 3) {
                        sb.append('P');
                    } else if (i3 != 4) {
                        sb.append('?');
                    } else {
                        sb.append('!');
                    }
                    sb.append(", durationUs=");
                    sb.append(t8VarArr[i].X[i2]);
                    sb.append(')');
                    if (i2 < t8VarArr[i].o.length - 1) {
                        sb.append(", ");
                    }
                }
                sb.append("])");
                if (i < t8VarArr.length - 1) {
                    sb.append(", ");
                }
                i++;
            } else {
                sb.append("])");
                return sb.toString();
            }
        }
    }
}

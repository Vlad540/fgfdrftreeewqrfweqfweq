package defpackage;

import android.net.Uri;
import java.util.Arrays;

/* renamed from: t8  reason: default package */
public final class t8 implements lt0 {
    public static final pv0 w0 = new pv0(16);
    public final long[] X;
    public final long Y;
    public final boolean Z;
    public final long a;
    public final int b;
    public final Uri[] c;
    public final int[] o;

    public t8(long j, int i, int[] iArr, Uri[] uriArr, long[] jArr, long j2, boolean z) {
        swb.e(iArr.length == uriArr.length);
        this.a = j;
        this.b = i;
        this.o = iArr;
        this.c = uriArr;
        this.X = jArr;
        this.Y = j2;
        this.Z = z;
    }

    public final int a(int i) {
        int i2;
        int i3 = i + 1;
        while (true) {
            int[] iArr = this.o;
            if (i3 >= iArr.length || this.Z || (i2 = iArr[i3]) == 0 || i2 == 1) {
                return i3;
            }
            i3++;
        }
        return i3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || t8.class != obj.getClass()) {
            return false;
        }
        t8 t8Var = (t8) obj;
        return this.a == t8Var.a && this.b == t8Var.b && Arrays.equals(this.c, t8Var.c) && Arrays.equals(this.o, t8Var.o) && Arrays.equals(this.X, t8Var.X) && this.Y == t8Var.Y && this.Z == t8Var.Z;
    }

    public final int hashCode() {
        long j = this.a;
        int hashCode = Arrays.hashCode(this.o);
        int hashCode2 = Arrays.hashCode(this.X);
        long j2 = this.Y;
        return ((((hashCode2 + ((hashCode + (((((this.b * 31) + ((int) (j ^ (j >>> 32)))) * 31) + Arrays.hashCode(this.c)) * 31)) * 31)) * 31) + ((int) (j2 ^ (j2 >>> 32)))) * 31) + (this.Z ? 1 : 0);
    }
}

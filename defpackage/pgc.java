package defpackage;

import java.util.Arrays;

/* renamed from: pgc  reason: default package */
public final class pgc {
    public int a = 2;
    public boolean b = false;
    public float[] c = null;
    public int d = 0;
    public float e = 0.0f;
    public int f = 0;
    public float g = 0.0f;
    public boolean h = false;

    public static pgc a(float f2, float f3, float f4, float f5) {
        pgc pgc = new pgc();
        pgc.c(f2, f3, f4, f5);
        return pgc;
    }

    public static pgc b(float[] fArr) {
        pgc pgc = new pgc();
        fArr.getClass();
        ez3.k("radii should have exactly 8 values", fArr.length == 8);
        if (pgc.c == null) {
            pgc.c = new float[8];
        }
        System.arraycopy(fArr, 0, pgc.c, 0, 8);
        return pgc;
    }

    public final void c(float f2, float f3, float f4, float f5) {
        if (this.c == null) {
            this.c = new float[8];
        }
        float[] fArr = this.c;
        fArr[1] = f2;
        fArr[0] = f2;
        fArr[3] = f3;
        fArr[2] = f3;
        fArr[5] = f4;
        fArr[4] = f4;
        fArr[7] = f5;
        fArr[6] = f5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || pgc.class != obj.getClass()) {
            return false;
        }
        pgc pgc = (pgc) obj;
        if (this.b == pgc.b && this.d == pgc.d && Float.compare(pgc.e, this.e) == 0 && this.f == pgc.f && Float.compare(pgc.g, this.g) == 0 && this.a == pgc.a && this.h == pgc.h) {
            return Arrays.equals(this.c, pgc.c);
        }
        return false;
    }

    public final int hashCode() {
        int i = this.a;
        int i2 = 0;
        int t = (((i != 0 ? hr1.t(i) : 0) * 31) + (this.b ? 1 : 0)) * 31;
        float[] fArr = this.c;
        int hashCode = (((t + (fArr != null ? Arrays.hashCode(fArr) : 0)) * 31) + this.d) * 31;
        float f2 = this.e;
        int floatToIntBits = (((hashCode + (f2 != 0.0f ? Float.floatToIntBits(f2) : 0)) * 31) + this.f) * 31;
        float f3 = this.g;
        if (f3 != 0.0f) {
            i2 = Float.floatToIntBits(f3);
        }
        return ((floatToIntBits + i2) * 961) + (this.h ? 1 : 0);
    }
}

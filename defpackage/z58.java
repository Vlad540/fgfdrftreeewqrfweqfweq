package defpackage;

import android.os.Bundle;

/* renamed from: z58  reason: default package */
public final class z58 {
    public static final z58 f = new x58().a();
    public static final String g = Integer.toString(0, 36);
    public static final String h = Integer.toString(1, 36);
    public static final String i = Integer.toString(2, 36);
    public static final String j = Integer.toString(3, 36);
    public static final String k = Integer.toString(4, 36);
    public final long a;
    public final long b;
    public final long c;
    public final float d;
    public final float e;

    static {
        int i2 = oze.a;
    }

    public z58(x58 x58) {
        long j2 = x58.a;
        long j3 = x58.b;
        long j4 = x58.c;
        float f2 = x58.d;
        float f3 = x58.e;
        this.a = j2;
        this.b = j3;
        this.c = j4;
        this.d = f2;
        this.e = f3;
    }

    public static z58 b(Bundle bundle) {
        x58 x58 = new x58();
        z58 z58 = f;
        x58.a = bundle.getLong(g, z58.a);
        x58.b = bundle.getLong(h, z58.b);
        x58.c = bundle.getLong(i, z58.c);
        x58.d = bundle.getFloat(j, z58.d);
        x58.e = bundle.getFloat(k, z58.e);
        return new z58(x58);
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [java.lang.Object, x58] */
    public final x58 a() {
        ? obj = new Object();
        obj.a = this.a;
        obj.b = this.b;
        obj.c = this.c;
        obj.d = this.d;
        obj.e = this.e;
        return obj;
    }

    public final Bundle c() {
        Bundle bundle = new Bundle();
        z58 z58 = f;
        long j2 = z58.a;
        long j3 = this.a;
        if (j3 != j2) {
            bundle.putLong(g, j3);
        }
        long j4 = z58.b;
        long j5 = this.b;
        if (j5 != j4) {
            bundle.putLong(h, j5);
        }
        long j6 = z58.c;
        long j7 = this.c;
        if (j7 != j6) {
            bundle.putLong(i, j7);
        }
        float f2 = z58.d;
        float f3 = this.d;
        if (f3 != f2) {
            bundle.putFloat(j, f3);
        }
        float f4 = z58.e;
        float f5 = this.e;
        if (f5 != f4) {
            bundle.putFloat(k, f5);
        }
        return bundle;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof z58)) {
            return false;
        }
        z58 z58 = (z58) obj;
        return this.a == z58.a && this.b == z58.b && this.c == z58.c && this.d == z58.d && this.e == z58.e;
    }

    public final int hashCode() {
        long j2 = this.a;
        long j3 = this.b;
        long j4 = this.c;
        int i2 = ((((((int) (j2 ^ (j2 >>> 32))) * 31) + ((int) (j3 ^ (j3 >>> 32)))) * 31) + ((int) ((j4 >>> 32) ^ j4))) * 31;
        float f2 = this.d;
        int i3 = 0;
        int floatToIntBits = (i2 + (f2 != 0.0f ? Float.floatToIntBits(f2) : 0)) * 31;
        float f3 = this.e;
        if (f3 != 0.0f) {
            i3 = Float.floatToIntBits(f3);
        }
        return floatToIntBits + i3;
    }
}

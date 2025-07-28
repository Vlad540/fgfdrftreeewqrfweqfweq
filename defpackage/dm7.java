package defpackage;

import java.io.Serializable;

/* renamed from: dm7  reason: default package */
public final class dm7 implements Serializable {
    public static final dm7 Z = new dm7(1.401298464324817E-45d, 1.401298464324817E-45d, 0.0d, 0.0f, 0.0f, 0.0f);
    public final float X;
    public final float Y;
    public final double a;
    public final double b;
    public final double c;
    public final float o;

    public dm7(double d, double d2, double d3, float f, float f2, float f3) {
        this.a = d;
        this.b = d2;
        this.c = d3;
        this.o = f;
        this.X = f2;
        this.Y = f3;
    }

    public final boolean a() {
        return (this.a == 1.401298464324817E-45d || this.b == 1.401298464324817E-45d) ? false : true;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || dm7.class != obj.getClass()) {
            return false;
        }
        dm7 dm7 = (dm7) obj;
        if (Double.compare(dm7.a, this.a) == 0 && Double.compare(dm7.b, this.b) == 0 && Double.compare(dm7.c, this.c) == 0 && Float.compare(dm7.o, this.o) == 0 && Float.compare(dm7.X, this.X) == 0) {
            return Float.compare(dm7.Y, this.Y) == 0;
        }
        return false;
    }

    public final int hashCode() {
        long doubleToLongBits = Double.doubleToLongBits(this.a);
        long doubleToLongBits2 = Double.doubleToLongBits(this.b);
        long doubleToLongBits3 = Double.doubleToLongBits(this.c);
        int i = ((((((int) (doubleToLongBits ^ (doubleToLongBits >>> 32))) * 31) + ((int) (doubleToLongBits2 ^ (doubleToLongBits2 >>> 32)))) * 31) + ((int) ((doubleToLongBits3 >>> 32) ^ doubleToLongBits3))) * 31;
        float f = this.o;
        int i2 = 0;
        int floatToIntBits = (i + (f != 0.0f ? Float.floatToIntBits(f) : 0)) * 31;
        float f2 = this.X;
        int floatToIntBits2 = (floatToIntBits + (f2 != 0.0f ? Float.floatToIntBits(f2) : 0)) * 31;
        float f3 = this.Y;
        if (f3 != 0.0f) {
            i2 = Float.floatToIntBits(f3);
        }
        return floatToIntBits2 + i2;
    }

    public final String toString() {
        return "LocationData{latitude=" + this.a + ", longitude=" + this.b + ", altitude=" + this.c + ", accuracy=" + this.o + ", bearing=" + this.X + ", speed=" + this.Y + "}";
    }

    public dm7(double d, double d2) {
        this.a = d;
        this.b = d2;
        this.c = 0.0d;
        this.o = 0.0f;
        this.X = 0.0f;
        this.Y = 0.0f;
    }
}

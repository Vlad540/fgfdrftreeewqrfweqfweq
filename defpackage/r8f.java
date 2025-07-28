package defpackage;

/* renamed from: r8f  reason: default package */
public final class r8f {
    public static final r8f e = new r8f(0, 0);
    public static final String f = Integer.toString(0, 36);
    public static final String g = Integer.toString(1, 36);
    public static final String h = Integer.toString(2, 36);
    public static final String i = Integer.toString(3, 36);
    public final int a;
    public final int b;
    public final int c;
    public final float d;

    static {
        int i2 = oze.a;
    }

    public r8f(int i2, int i3) {
        this(1.0f, i2, i3, 0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r8f)) {
            return false;
        }
        r8f r8f = (r8f) obj;
        return this.a == r8f.a && this.b == r8f.b && this.c == r8f.c && this.d == r8f.d;
    }

    public final int hashCode() {
        return Float.floatToRawIntBits(this.d) + ((((((217 + this.a) * 31) + this.b) * 31) + this.c) * 31);
    }

    public r8f(float f2, int i2, int i3, int i4) {
        this.a = i2;
        this.b = i3;
        this.c = i4;
        this.d = f2;
    }
}

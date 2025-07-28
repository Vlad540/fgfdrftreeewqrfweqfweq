package defpackage;

/* renamed from: qwa  reason: default package */
public final class qwa {
    public static final qwa e = new qwa(0.0f, 0.0f, 0.0f, 0.0f);
    public final float a;
    public final float b;
    public final float c;
    public final float d;

    public qwa(float f, float f2, float f3, float f4) {
        this.a = f;
        this.b = f2;
        this.c = f3;
        this.d = f4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qwa)) {
            return false;
        }
        qwa qwa = (qwa) obj;
        return Float.compare(this.a, qwa.a) == 0 && Float.compare(this.b, qwa.b) == 0 && Float.compare(this.c, qwa.c) == 0 && Float.compare(this.d, qwa.d) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.d) + th2.e(th2.e(Float.hashCode(this.a) * 31, this.b, 31), this.c, 31);
    }

    public final String toString() {
        return "PipBounds(maxLeftOffset=" + this.a + ", maxRightOffset=" + this.b + ", maxTopOffset=" + this.c + ", maxBottomOffset=" + this.d + ")";
    }
}

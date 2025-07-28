package defpackage;

/* renamed from: r90  reason: default package */
public final class r90 implements yvf {
    public final float a;
    public final float b;
    public final float c;
    public final float d;

    public r90(float f, float f2, float f3, float f4) {
        this.a = f;
        this.b = f2;
        this.c = f3;
        this.d = f4;
    }

    public static r90 e(yvf yvf) {
        return new r90(yvf.c(), yvf.a(), yvf.b(), yvf.d());
    }

    public final float a() {
        return this.b;
    }

    public final float b() {
        return this.c;
    }

    public final float c() {
        return this.a;
    }

    public final float d() {
        return this.d;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof r90)) {
            return false;
        }
        r90 r90 = (r90) obj;
        return Float.floatToIntBits(this.a) == Float.floatToIntBits(r90.a) && Float.floatToIntBits(this.b) == Float.floatToIntBits(r90.b) && Float.floatToIntBits(this.c) == Float.floatToIntBits(r90.c) && Float.floatToIntBits(this.d) == Float.floatToIntBits(r90.d);
    }

    public final int hashCode() {
        return Float.floatToIntBits(this.d) ^ ((((((Float.floatToIntBits(this.a) ^ 1000003) * 1000003) ^ Float.floatToIntBits(this.b)) * 1000003) ^ Float.floatToIntBits(this.c)) * 1000003);
    }

    public final String toString() {
        return "ImmutableZoomState{zoomRatio=" + this.a + ", maxZoomRatio=" + this.b + ", minZoomRatio=" + this.c + ", linearZoom=" + this.d + "}";
    }
}

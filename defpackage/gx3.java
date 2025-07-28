package defpackage;

/* renamed from: gx3  reason: default package */
public final class gx3 extends kw1 {
    public final float X;
    public final lhd o;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public gx3(lhd lhd, float f) {
        super(3, lhd, Float.valueOf(f));
        a24.p(lhd, "bitmapDescriptor must not be null");
        if (f > 0.0f) {
            this.o = lhd;
            this.X = f;
            return;
        }
        throw new IllegalArgumentException("refWidth must be positive");
    }

    public final String toString() {
        StringBuilder m = hr1.m("[CustomCap: bitmapDescriptor=", String.valueOf(this.o), " refWidth=");
        m.append(this.X);
        m.append("]");
        return m.toString();
    }
}

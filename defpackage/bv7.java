package defpackage;

/* renamed from: bv7  reason: default package */
public final class bv7 extends qr4 {
    public final float Y;

    public bv7(float f) {
        super(0);
        this.Y = f - 0.001f;
    }

    public final void q(float f, float f2, float f3, nad nad) {
        double d = (double) this.Y;
        float sqrt = (float) ((Math.sqrt(2.0d) * d) / 2.0d);
        float sqrt2 = (float) Math.sqrt(Math.pow(d, 2.0d) - Math.pow((double) sqrt, 2.0d));
        nad.d(f2 - sqrt, ((float) (-((Math.sqrt(2.0d) * d) - d))) + sqrt2, 270.0f, 0.0f);
        nad.c(f2, (float) (-((Math.sqrt(2.0d) * d) - d)));
        nad.c(f2 + sqrt, ((float) (-((Math.sqrt(2.0d) * d) - d))) + sqrt2);
    }
}

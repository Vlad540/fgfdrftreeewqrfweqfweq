package defpackage;

import android.graphics.Matrix;

/* renamed from: flc  reason: default package */
public final class flc implements uw7 {
    public final float a;
    public final Matrix b;
    public Matrix c;

    public flc(float f) {
        this.a = f;
        Matrix matrix = new Matrix();
        this.b = matrix;
        matrix.postScale(1.0f, 1.0f);
        matrix.postRotate(f);
    }

    public final Matrix a() {
        Matrix matrix = this.c;
        oyb.m(matrix, "configure must be called first");
        return matrix;
    }

    public final boolean c(int i, int i2) {
        gjd d = d(i, i2);
        Matrix matrix = this.c;
        oyb.l(matrix);
        return matrix.isIdentity() && i == d.a && i2 == d.b;
    }

    public final gjd d(int i, int i2) {
        oyb.c("inputWidth must be positive", i > 0);
        oyb.c("inputHeight must be positive", i2 > 0);
        Matrix matrix = this.b;
        this.c = new Matrix(matrix);
        if (matrix.isIdentity()) {
            return new gjd(i, i2);
        }
        float f = (float) i;
        float f2 = (float) i2;
        float f3 = f / f2;
        this.c.preScale(f3, 1.0f);
        this.c.postScale(1.0f / f3, 1.0f);
        float[][] fArr = {new float[]{-1.0f, -1.0f, 0.0f, 1.0f}, new float[]{-1.0f, 1.0f, 0.0f, 1.0f}, new float[]{1.0f, -1.0f, 0.0f, 1.0f}, new float[]{1.0f, 1.0f, 0.0f, 1.0f}};
        float f4 = Float.MIN_VALUE;
        float f5 = Float.MAX_VALUE;
        float f6 = Float.MAX_VALUE;
        float f7 = Float.MIN_VALUE;
        for (int i3 = 0; i3 < 4; i3++) {
            float[] fArr2 = fArr[i3];
            this.c.mapPoints(fArr2);
            f5 = Math.min(f5, fArr2[0]);
            f4 = Math.max(f4, fArr2[0]);
            f6 = Math.min(f6, fArr2[1]);
            f7 = Math.max(f7, fArr2[1]);
        }
        float f8 = (f4 - f5) / 2.0f;
        float f9 = (f7 - f6) / 2.0f;
        this.c.postScale(1.0f / f8, 1.0f / f9);
        return new gjd(Math.round(f * f8), Math.round(f2 * f9));
    }
}

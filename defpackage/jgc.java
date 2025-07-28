package defpackage;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import java.util.Arrays;

/* renamed from: jgc  reason: default package */
public final class jgc extends Drawable implements ggc {
    public final Path A0 = new Path();
    public final int B0 = 0;
    public final RectF C0 = new RectF();
    public int D0 = 255;
    public boolean X = false;
    public float Y = 0.0f;
    public float Z = 0.0f;
    public final float[] a = new float[8];
    public final float[] b = new float[8];
    public float[] c;
    public final Paint o = new Paint(1);
    public int w0 = 0;
    public boolean x0 = false;
    public boolean y0 = false;
    public final Path z0 = new Path();

    public jgc(int i) {
        if (this.B0 != i) {
            this.B0 = i;
            invalidateSelf();
        }
    }

    public final void a(int i, float f) {
        if (this.w0 != i) {
            this.w0 = i;
            invalidateSelf();
        }
        if (this.Y != f) {
            this.Y = f;
            d();
            invalidateSelf();
        }
    }

    public final void b(boolean z) {
        this.X = z;
        d();
        invalidateSelf();
    }

    public final void c() {
        Arrays.fill(this.a, 0.0f);
        d();
        invalidateSelf();
    }

    public final void d() {
        float[] fArr;
        float[] fArr2;
        Path path = this.z0;
        path.reset();
        Path path2 = this.A0;
        path2.reset();
        RectF rectF = this.C0;
        rectF.set(getBounds());
        float f = this.Y;
        rectF.inset(f / 2.0f, f / 2.0f);
        boolean z = this.X;
        int i = 0;
        float[] fArr3 = this.a;
        if (z) {
            path2.addCircle(rectF.centerX(), rectF.centerY(), Math.min(rectF.width(), rectF.height()) / 2.0f, Path.Direction.CW);
        } else {
            int i2 = 0;
            while (true) {
                fArr2 = this.b;
                if (i2 >= fArr2.length) {
                    break;
                }
                fArr2[i2] = (fArr3[i2] + this.Z) - (this.Y / 2.0f);
                i2++;
            }
            path2.addRoundRect(rectF, fArr2, Path.Direction.CW);
        }
        float f2 = this.Y;
        rectF.inset((-f2) / 2.0f, (-f2) / 2.0f);
        float f3 = this.Z + (this.x0 ? this.Y : 0.0f);
        rectF.inset(f3, f3);
        if (this.X) {
            path.addCircle(rectF.centerX(), rectF.centerY(), Math.min(rectF.width(), rectF.height()) / 2.0f, Path.Direction.CW);
        } else if (this.x0) {
            if (this.c == null) {
                this.c = new float[8];
            }
            while (true) {
                fArr = this.c;
                if (i >= fArr.length) {
                    break;
                }
                fArr[i] = fArr3[i] - this.Y;
                i++;
            }
            path.addRoundRect(rectF, fArr, Path.Direction.CW);
        } else {
            path.addRoundRect(rectF, fArr3, Path.Direction.CW);
        }
        float f4 = -f3;
        rectF.inset(f4, f4);
    }

    public final void draw(Canvas canvas) {
        Paint paint = this.o;
        paint.setColor(lp.A(this.B0, this.D0));
        paint.setStyle(Paint.Style.FILL);
        paint.setFilterBitmap(this.y0);
        canvas.drawPath(this.z0, paint);
        if (this.Y != 0.0f) {
            paint.setColor(lp.A(this.w0, this.D0));
            paint.setStyle(Paint.Style.STROKE);
            paint.setStrokeWidth(this.Y);
            canvas.drawPath(this.A0, paint);
        }
    }

    public final void e(boolean z) {
        if (this.y0 != z) {
            this.y0 = z;
            invalidateSelf();
        }
    }

    public final void g() {
    }

    public final int getAlpha() {
        return this.D0;
    }

    public final int getOpacity() {
        int A = lp.A(this.B0, this.D0) >>> 24;
        if (A != 0) {
            return A != 255 ? -3 : -1;
        }
        return -2;
    }

    public final void i(float f) {
        if (this.Z != f) {
            this.Z = f;
            d();
            invalidateSelf();
        }
    }

    public final void k() {
        if (this.x0) {
            this.x0 = false;
            d();
            invalidateSelf();
        }
    }

    public final void m(float[] fArr) {
        float[] fArr2 = this.a;
        if (fArr == null) {
            Arrays.fill(fArr2, 0.0f);
        } else {
            ez3.k("radii should have exactly 8 values", fArr.length == 8);
            System.arraycopy(fArr, 0, fArr2, 0, 8);
        }
        d();
        invalidateSelf();
    }

    public final void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        d();
    }

    public final void setAlpha(int i) {
        if (i != this.D0) {
            this.D0 = i;
            invalidateSelf();
        }
    }

    public final void setColorFilter(ColorFilter colorFilter) {
    }
}

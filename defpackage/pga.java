package defpackage;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;

/* renamed from: pga  reason: default package */
public final class pga extends ow5 {
    public final Matrix X = new Matrix();
    public final int Y;
    public final int Z;
    public final Matrix w0;
    public final RectF x0;

    public pga(BitmapDrawable bitmapDrawable, int i, int i2) {
        super(bitmapDrawable);
        this.Y = i - (i % 90);
        this.Z = (i2 < 0 || i2 > 8) ? 0 : i2;
        this.w0 = new Matrix();
        this.x0 = new RectF();
    }

    public final void d(Matrix matrix) {
        n(matrix);
        Matrix matrix2 = this.X;
        if (!matrix2.isIdentity()) {
            matrix.preConcat(matrix2);
        }
    }

    public final void draw(Canvas canvas) {
        int i;
        if (this.Y > 0 || !((i = this.Z) == 0 || i == 1)) {
            int save = canvas.save();
            canvas.concat(this.X);
            super.draw(canvas);
            canvas.restoreToCount(save);
            return;
        }
        super.draw(canvas);
    }

    public final int getIntrinsicHeight() {
        int i = this.Z;
        return (i == 5 || i == 7 || this.Y % 180 != 0) ? super.getIntrinsicWidth() : super.getIntrinsicHeight();
    }

    public final int getIntrinsicWidth() {
        int i = this.Z;
        return (i == 5 || i == 7 || this.Y % 180 != 0) ? super.getIntrinsicHeight() : super.getIntrinsicWidth();
    }

    public final void onBoundsChange(Rect rect) {
        Drawable drawable = this.a;
        if (drawable != null) {
            int i = this.Z;
            int i2 = this.Y;
            if (i2 > 0 || !(i == 0 || i == 1)) {
                Matrix matrix = this.X;
                if (i == 2) {
                    matrix.setScale(-1.0f, 1.0f);
                } else if (i == 7) {
                    matrix.setRotate(270.0f, (float) rect.centerX(), (float) rect.centerY());
                    matrix.postScale(-1.0f, 1.0f);
                } else if (i == 4) {
                    matrix.setScale(1.0f, -1.0f);
                } else if (i != 5) {
                    matrix.setRotate((float) i2, (float) rect.centerX(), (float) rect.centerY());
                } else {
                    matrix.setRotate(270.0f, (float) rect.centerX(), (float) rect.centerY());
                    matrix.postScale(1.0f, -1.0f);
                }
                Matrix matrix2 = this.w0;
                matrix2.reset();
                matrix.invert(matrix2);
                RectF rectF = this.x0;
                rectF.set(rect);
                matrix2.mapRect(rectF);
                drawable.setBounds((int) rectF.left, (int) rectF.top, (int) rectF.right, (int) rectF.bottom);
                return;
            }
            drawable.setBounds(rect);
        }
    }
}

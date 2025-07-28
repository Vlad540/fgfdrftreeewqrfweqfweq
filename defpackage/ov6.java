package defpackage;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.SweepGradient;
import android.graphics.drawable.Drawable;

/* renamed from: ov6  reason: default package */
public final class ov6 extends Drawable {
    public final Paint a;
    public int[] b = new int[0];
    public float c;
    public final float d = 5.0f;

    public ov6() {
        Paint paint = new Paint(1);
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth(dh4.c().getDisplayMetrics().density * 2.0f);
        this.a = paint;
    }

    public final void draw(Canvas canvas) {
        if (this.b.length >= 2) {
            Rect bounds = getBounds();
            int width = bounds.width();
            int height = bounds.height();
            if (width > height) {
                width = height;
            }
            Paint paint = this.a;
            float strokeWidth = (((float) width) - paint.getStrokeWidth()) / ((float) 2);
            this.c = (this.c + this.d) % ((float) 360);
            paint.setShader(new SweepGradient(bounds.exactCenterX(), bounds.exactCenterY(), this.b, (float[]) null));
            canvas.save();
            canvas.rotate(this.c, bounds.exactCenterX(), bounds.exactCenterY());
            canvas.drawCircle(bounds.exactCenterX(), bounds.exactCenterY(), strokeWidth, paint);
            canvas.restore();
            invalidateSelf();
        }
    }

    public final int getIntrinsicHeight() {
        return getBounds().height();
    }

    public final int getIntrinsicWidth() {
        return getBounds().width();
    }

    public final int getOpacity() {
        return -3;
    }

    public final void setAlpha(int i) {
        this.a.setAlpha(i);
    }

    public final void setColorFilter(ColorFilter colorFilter) {
        this.a.setColorFilter(colorFilter);
    }
}

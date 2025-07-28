package defpackage;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.os.SystemClock;

/* renamed from: gkd  reason: default package */
public final class gkd extends Drawable implements Animatable, mhe {
    public int X;
    public int Y;
    public final vp6 Z = new vp6(27, this);
    public final u16 a;
    public final Integer[] b = {3, 1, 2};
    public final Paint c = new Paint(1);
    public final RectF o = new RectF();
    public boolean w0;
    public float x0;

    public gkd(pda pda, hd1 hd1) {
        this.a = hd1;
        onThemeChanged(pda);
    }

    public final void draw(Canvas canvas) {
        Rect bounds = getBounds();
        float height = ((float) bounds.height()) / 2.0f;
        int i = this.X;
        Integer[] numArr = this.b;
        float f = (float) 2;
        float width = (((float) bounds.width()) / 2.0f) - ((float) ((((numArr.length - 1) * a24.X(dh4.c().getDisplayMetrics().density * f)) + (i * numArr.length)) / 2));
        int length = numArr.length;
        int i2 = 0;
        int i3 = 0;
        while (i2 < length) {
            int i4 = i3 + 1;
            int intValue = numArr[i2].intValue();
            RectF rectF = this.o;
            float X2 = ((float) ((a24.X(dh4.c().getDisplayMetrics().density * f) + this.X) * i3)) + width;
            rectF.left = X2;
            int i5 = this.Y;
            rectF.top = height - ((float) (i5 / 2));
            rectF.right = X2 + ((float) this.X);
            rectF.bottom = ((float) (i5 / 2)) + height;
            float height2 = rectF.height() * Math.max(0.3f, (((float) Math.sin((double) (this.x0 + ((float) ((numArr.length - intValue) + 1))))) + ((float) 1)) / f);
            canvas.drawRoundRect(rectF.left, height - height2, rectF.right, height + height2, dh4.c().getDisplayMetrics().density * 4.0f, dh4.c().getDisplayMetrics().density * 4.0f, this.c);
            i2++;
            i3 = i4;
        }
    }

    public final int getIntrinsicHeight() {
        return -1;
    }

    public final int getIntrinsicWidth() {
        return -1;
    }

    public final int getOpacity() {
        return -3;
    }

    public final boolean isRunning() {
        return this.w0;
    }

    public final boolean isStateful() {
        return true;
    }

    public final void onBoundsChange(Rect rect) {
        Rect bounds = getBounds();
        int width = bounds.width();
        int X2 = a24.X(((float) 2) * dh4.c().getDisplayMetrics().density);
        Integer[] numArr = this.b;
        this.X = (int) (((float) ((width - ((numArr.length - 1) * X2)) / numArr.length)) * 0.5f);
        this.Y = (int) (((float) bounds.height()) * 0.3f);
        invalidateSelf();
    }

    public final void onThemeChanged(pda pda) {
        this.c.setColor(((Number) this.a.invoke(qda.a)).intValue());
        invalidateSelf();
    }

    public final void setAlpha(int i) {
    }

    public final void setColorFilter(ColorFilter colorFilter) {
        this.c.setColorFilter(colorFilter);
        invalidateSelf();
    }

    public final boolean setVisible(boolean z, boolean z2) {
        if (z) {
            start();
        } else {
            stop();
        }
        return super.setVisible(z, z2);
    }

    public final void start() {
        if (!this.w0) {
            this.w0 = true;
            scheduleSelf(this.Z, SystemClock.uptimeMillis() + 3);
        }
    }

    public final void stop() {
        if (this.w0) {
            this.w0 = false;
            unscheduleSelf(this.Z);
        }
    }
}

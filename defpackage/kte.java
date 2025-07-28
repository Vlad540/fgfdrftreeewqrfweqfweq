package defpackage;

import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.os.SystemClock;

/* renamed from: kte  reason: default package */
public final class kte extends Drawable implements Animatable, mhe {
    public final lde A0 = new lde(6, this);
    public boolean B0;
    public float C0;
    public final Rect X = new Rect();
    public int Y;
    public int Z;
    public final u16 a;
    public final int b = 3;
    public final Paint c = new Paint(1);
    public int o = 255;
    public float w0;
    public float x0;
    public float y0;
    public float z0;

    public kte(pda pda, u16 u16) {
        this.a = u16;
        onThemeChanged(pda);
    }

    public final void draw(Canvas canvas) {
        Rect bounds = getBounds();
        int i = 0;
        while (true) {
            int i2 = this.b;
            if (i >= i2) {
                break;
            }
            int i3 = bounds.left;
            int i4 = this.Y;
            int i5 = (i4 * i) + i3;
            Rect rect = this.X;
            rect.left = i5;
            int i6 = bounds.top;
            rect.top = i6;
            rect.right = i5 + i4;
            rect.bottom = i6 + this.Z;
            float f = (float) 2;
            float sin = (((float) Math.sin((double) (this.C0 + ((float) ((i2 - i) + 1))))) + ((float) 1)) / f;
            float exactCenterX = rect.exactCenterX();
            float exactCenterY = rect.exactCenterY();
            float f2 = this.w0;
            float f3 = (((this.x0 - f2) * sin) + f2) / f;
            float f4 = this.y0;
            float f5 = ((this.z0 - f4) * sin) + f4;
            Paint paint = this.c;
            paint.setAlpha((int) (f5 * (((float) this.o) / 255.0f) * ((float) 255)));
            canvas.drawCircle(exactCenterX, exactCenterY, f3, paint);
            i++;
        }
        if (this.B0) {
            this.C0 += 0.1f;
        }
    }

    public final int getAlpha() {
        return this.o;
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
        return this.B0;
    }

    public final boolean isStateful() {
        return true;
    }

    public final void onBoundsChange(Rect rect) {
        Rect bounds = getBounds();
        this.Y = bounds.width() / this.b;
        int height = bounds.height();
        this.Z = height;
        float min = (float) Math.min(this.Y, height);
        this.w0 = 0.44f * min;
        this.x0 = min * 0.66f;
        this.y0 = 0.4f;
        this.z0 = 1.0f;
        invalidateSelf();
    }

    public final void onThemeChanged(pda pda) {
        int intValue = ((Number) this.a.invoke(pda)).intValue();
        int alpha = Color.alpha(intValue);
        Paint paint = this.c;
        if (intValue != paint.getColor() || this.o != alpha) {
            paint.setColor(intValue);
            setAlpha(alpha);
            invalidateSelf();
        }
    }

    public final void setAlpha(int i) {
        if (this.o != i) {
            this.o = i;
            invalidateSelf();
        }
    }

    public final void setColorFilter(ColorFilter colorFilter) {
        Paint paint = this.c;
        if (!hhd.f(colorFilter, paint.getColorFilter())) {
            paint.setColorFilter(colorFilter);
            invalidateSelf();
        }
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
        if (!this.B0) {
            this.B0 = true;
            scheduleSelf(this.A0, SystemClock.uptimeMillis() + 8);
        }
    }

    public final void stop() {
        if (this.B0) {
            this.B0 = false;
            unscheduleSelf(this.A0);
            this.C0 = 0.0f;
        }
    }
}

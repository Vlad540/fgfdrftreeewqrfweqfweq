package defpackage;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import kotlinx.coroutines.internal.LockFreeTaskQueueCore;

/* renamed from: r14  reason: default package */
public final class r14 extends Drawable implements zq6 {
    public final Rect A0 = new Rect();
    public final RectF B0 = new RectF();
    public int C0;
    public int D0;
    public int E0;
    public int F0;
    public int G0;
    public long H0;
    public ilc X;
    public HashMap Y = new HashMap();
    public int Z;
    public String a;
    public int b;
    public int c;
    public int o;
    public int w0;
    public final int x0 = 80;
    public final Paint y0 = new Paint(1);
    public final Matrix z0 = new Matrix();

    public r14() {
        b();
    }

    public final void a(Canvas canvas, String str, String str2, int i) {
        String g = hr1.g(str, ": ");
        Paint paint = this.y0;
        float measureText = paint.measureText(g);
        float measureText2 = paint.measureText(str2);
        paint.setColor(1711276032);
        int i2 = this.F0;
        int i3 = this.G0;
        canvas.drawRect((float) (i2 - 4), (float) (i3 + 8), ((float) i2) + measureText + measureText2 + 4.0f, (float) (i3 + this.E0 + 8), paint);
        paint.setColor(-1);
        canvas.drawText(g, (float) this.F0, (float) this.G0, paint);
        paint.setColor(i);
        canvas.drawText(str2, ((float) this.F0) + measureText, (float) this.G0, paint);
        this.G0 += this.E0;
    }

    public final void b() {
        this.b = -1;
        this.c = -1;
        this.o = -1;
        this.Y = new HashMap();
        this.Z = -1;
        this.w0 = -1;
        this.a = "none";
        invalidateSelf();
        this.H0 = -1;
        invalidateSelf();
    }

    public final void draw(Canvas canvas) {
        Canvas canvas2 = canvas;
        Rect bounds = getBounds();
        Paint paint = this.y0;
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth(2.0f);
        paint.setColor(-26624);
        Paint paint2 = paint;
        canvas.drawRect((float) bounds.left, (float) bounds.top, (float) bounds.right, (float) bounds.bottom, paint2);
        Paint.Style style = Paint.Style.FILL;
        paint.setStyle(style);
        paint.setColor(0);
        canvas.drawRect((float) bounds.left, (float) bounds.top, (float) bounds.right, (float) bounds.bottom, paint2);
        paint.setStyle(style);
        paint.setStrokeWidth(0.0f);
        paint.setColor(-1);
        this.F0 = this.C0;
        this.G0 = this.D0;
        a(canvas2, "ID", this.a, -1);
        int width = bounds.width();
        int height = bounds.height();
        Locale locale = Locale.US;
        a(canvas2, "D", width + "x" + height, -1);
        if (bounds.height() > 0) {
            a(canvas2, "DAR", String.valueOf(Float.valueOf(((float) bounds.width()) / ((float) bounds.height()))), -1);
        }
        int i = this.b;
        int i2 = this.c;
        ilc ilc = this.X;
        int width2 = getBounds().width();
        int height2 = getBounds().height();
        int i3 = -65536;
        if (width2 > 0 && height2 > 0 && i > 0 && i2 > 0) {
            if (ilc != null) {
                Rect rect = this.A0;
                rect.top = 0;
                rect.left = 0;
                rect.right = width2;
                rect.bottom = height2;
                Matrix matrix = this.z0;
                matrix.reset();
                ilc.a(matrix, this.A0, i, i2, 0.0f, 0.0f);
                RectF rectF = this.B0;
                rectF.top = 0.0f;
                rectF.left = 0.0f;
                rectF.right = (float) i;
                rectF.bottom = (float) i2;
                matrix.mapRect(rectF);
                width2 = Math.min(width2, (int) rectF.width());
                height2 = Math.min(height2, (int) rectF.height());
            }
            float f = (float) width2;
            float f2 = f * 0.1f;
            float f3 = f * 0.5f;
            float f4 = (float) height2;
            float f5 = 0.1f * f4;
            float f6 = f4 * 0.5f;
            int abs = Math.abs(i - width2);
            int abs2 = Math.abs(i2 - height2);
            float f7 = (float) abs;
            if (f7 < f2 && ((float) abs2) < f5) {
                i3 = -16711936;
            } else if (f7 < f3 && ((float) abs2) < f6) {
                i3 = -256;
            }
        }
        int i4 = this.b;
        int i5 = this.c;
        a(canvas2, "I", i4 + "x" + i5, i3);
        int i6 = this.c;
        if (i6 > 0) {
            a(canvas2, "IAR", String.valueOf(Float.valueOf(((float) this.b) / ((float) i6))), -1);
        }
        int i7 = this.o / LockFreeTaskQueueCore.MIN_ADD_SPIN_CAPACITY;
        a(canvas2, "I", i7 + " KiB", -1);
        int i8 = this.Z;
        if (i8 > 0) {
            a(canvas2, "anim", me4.g("f ", i8, this.w0, ", l "), -1);
        }
        ilc ilc2 = this.X;
        if (ilc2 != null) {
            a(canvas2, "scale", String.valueOf(ilc2), -1);
        }
        long j = this.H0;
        if (j >= 0) {
            a(canvas2, "t", j + " ms", -1);
        }
        for (Map.Entry entry : this.Y.entrySet()) {
            a(canvas2, (String) entry.getKey(), (String) entry.getValue(), -1);
        }
    }

    public final int getOpacity() {
        return -3;
    }

    public final void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        int min = Math.min(40, Math.max(10, Math.min(rect.width() / 8, rect.height() / 9)));
        this.y0.setTextSize((float) min);
        int i = min + 8;
        this.E0 = i;
        int i2 = this.x0;
        if (i2 == 80) {
            this.E0 = i * -1;
        }
        this.C0 = rect.left + 10;
        this.D0 = i2 == 80 ? rect.bottom - 10 : rect.top + 20;
    }

    public final void setAlpha(int i) {
    }

    public final void setColorFilter(ColorFilter colorFilter) {
    }
}

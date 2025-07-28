package defpackage;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.RoundRectShape;
import kotlin.NoWhenBranchMatchedException;

/* renamed from: eme  reason: default package */
public final class eme extends Drawable implements mhe {
    public final Path X;
    public final Paint Y;
    public final s16 a;
    public final int b;
    public final int c;
    public final ShapeDrawable o;

    public eme(int i, int i2, s16 s16) {
        this.a = s16;
        this.b = i;
        this.c = i2;
        float[] fArr = new float[8];
        for (int i3 = 0; i3 < 8; i3++) {
            fArr[i3] = dh4.c().getDisplayMetrics().density * 12.0f;
        }
        ShapeDrawable shapeDrawable = new ShapeDrawable(new RoundRectShape(fArr, (RectF) null, (float[]) null));
        shapeDrawable.getPaint().setColor(((Number) this.a.invoke()).intValue());
        this.o = shapeDrawable;
        this.X = new Path();
        Paint paint = new Paint();
        paint.setAntiAlias(true);
        paint.setColor(((Number) this.a.invoke()).intValue());
        this.Y = paint;
    }

    public final void draw(Canvas canvas) {
        this.o.draw(canvas);
        canvas.drawPath(this.X, this.Y);
    }

    public final int getOpacity() {
        return -1;
    }

    public final void onBoundsChange(Rect rect) {
        float X2;
        float X3;
        super.onBoundsChange(rect);
        Rect rect2 = new Rect(rect.left, rect.top, rect.right, rect.bottom);
        int i = this.b;
        int t = hr1.t(i);
        if (t == 0) {
            rect2.top = me4.c((float) 8, dh4.c().getDisplayMetrics().density, rect.top);
        } else if (t == 1) {
            rect2.bottom = me4.p((float) 8, dh4.c().getDisplayMetrics().density, rect.bottom);
        } else {
            throw new NoWhenBranchMatchedException();
        }
        this.o.setBounds(rect2);
        Path path = this.X;
        path.reset();
        int t2 = hr1.t(i);
        int i2 = this.c;
        if (t2 == 0) {
            int X4 = a24.X(((float) 16) * dh4.c().getDisplayMetrics().density);
            int X5 = a24.X(((float) 8) * dh4.c().getDisplayMetrics().density);
            int t3 = hr1.t(i2);
            if (t3 == 0) {
                X2 = (((float) X4) / 2.0f) + ((float) a24.X(((float) 10) * dh4.c().getDisplayMetrics().density));
            } else if (t3 == 1) {
                X2 = ((float) rect.width()) / 2.0f;
            } else if (t3 == 2) {
                X2 = (((float) rect.width()) - (((float) X4) / 2.0f)) - ((float) a24.X(((float) 10) * dh4.c().getDisplayMetrics().density));
            } else {
                throw new NoWhenBranchMatchedException();
            }
            float f = X2;
            float f2 = ((float) X4) / 2.0f;
            float f3 = ((float) rect.top) + ((float) X5);
            path.moveTo(f + f2, f3);
            float f4 = (float) rect.top;
            path.cubicTo(f, f4, f, f4, f - f2, f3);
        } else if (t2 == 1) {
            int X6 = a24.X(((float) 16) * dh4.c().getDisplayMetrics().density);
            int X7 = a24.X(((float) 8) * dh4.c().getDisplayMetrics().density);
            int t4 = hr1.t(i2);
            if (t4 == 0) {
                X3 = (((float) X6) / 2.0f) + ((float) a24.X(((float) 10) * dh4.c().getDisplayMetrics().density));
            } else if (t4 == 1) {
                X3 = ((float) rect.width()) / 2.0f;
            } else if (t4 == 2) {
                X3 = (((float) rect.width()) - (((float) X6) / 2.0f)) - ((float) a24.X(((float) 10) * dh4.c().getDisplayMetrics().density));
            } else {
                throw new NoWhenBranchMatchedException();
            }
            float f5 = X3;
            float f6 = ((float) X6) / 2.0f;
            float f7 = ((float) rect.bottom) - ((float) X7);
            path.moveTo(f5 - f6, f7);
            float f8 = (float) rect.bottom;
            path.cubicTo(f5, f8, f5, f8, f5 + f6, f7);
        } else {
            throw new NoWhenBranchMatchedException();
        }
    }

    public final void onThemeChanged(pda pda) {
        Paint paint = this.o.getPaint();
        s16 s16 = this.a;
        paint.setColor(((Number) s16.invoke()).intValue());
        this.Y.setColor(((Number) s16.invoke()).intValue());
        invalidateSelf();
    }

    public final void setAlpha(int i) {
    }

    public final void setColorFilter(ColorFilter colorFilter) {
    }
}

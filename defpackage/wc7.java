package defpackage;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.Rect;
import android.graphics.RectF;

/* renamed from: wc7  reason: default package */
public final class wc7 extends qn4 {
    public float b;
    public float c;
    public float d;
    public boolean e;
    public float f;

    public final void a(Canvas canvas, Rect rect, float f2, boolean z, boolean z2) {
        this.b = (float) rect.width();
        oi0 oi0 = this.a;
        float f3 = (float) ((gd7) oi0).a;
        canvas.translate((((float) rect.width()) / 2.0f) + ((float) rect.left), Math.max(0.0f, (((float) rect.height()) - f3) / 2.0f) + (((float) rect.height()) / 2.0f) + ((float) rect.top));
        if (((gd7) oi0).j) {
            canvas.scale(-1.0f, 1.0f);
        }
        float f4 = this.b / 2.0f;
        float f5 = f3 / 2.0f;
        canvas.clipRect(-f4, -f5, f4, f5);
        this.e = ((gd7) oi0).a / 2 == ((gd7) oi0).b;
        this.c = ((float) ((gd7) oi0).a) * f2;
        this.d = ((float) Math.min(((gd7) oi0).a / 2, ((gd7) oi0).b)) * f2;
        if (z || z2) {
            if ((z && ((gd7) oi0).e == 2) || (z2 && ((gd7) oi0).f == 1)) {
                canvas.scale(1.0f, -1.0f);
            }
            if (z || (z2 && ((gd7) oi0).f != 3)) {
                canvas.translate(0.0f, ((1.0f - f2) * ((float) ((gd7) oi0).a)) / 2.0f);
            }
        }
        if (!z2 || ((gd7) oi0).f != 3) {
            this.f = 1.0f;
        } else {
            this.f = f2;
        }
    }

    public final void b(Canvas canvas, Paint paint, int i, int i2) {
        int j = vx3.j(i, i2);
        gd7 gd7 = (gd7) this.a;
        if (gd7.k > 0 && j != 0) {
            paint.setStyle(Paint.Style.FILL);
            paint.setColor(j);
            PointF pointF = new PointF((this.b / 2.0f) - (this.c / 2.0f), 0.0f);
            int i3 = gd7.k;
            h(canvas, paint, pointF, (PointF) null, (float) i3, (float) i3);
        }
    }

    public final void c(Canvas canvas, Paint paint, pn4 pn4, int i) {
        int j = vx3.j(pn4.c, i);
        float f2 = pn4.a;
        float f3 = pn4.b;
        int i2 = pn4.d;
        g(canvas, paint, f2, f3, j, i2, i2);
    }

    public final void d(Canvas canvas, Paint paint, float f2, float f3, int i, int i2, int i3) {
        g(canvas, paint, f2, f3, vx3.j(i, i2), i3, i3);
    }

    public final int e() {
        return ((gd7) this.a).a;
    }

    public final int f() {
        return -1;
    }

    public final void g(Canvas canvas, Paint paint, float f2, float f3, int i, int i2, int i3) {
        Paint paint2 = paint;
        float i4 = xy6.i(f2, 0.0f, 1.0f);
        float i5 = xy6.i(f3, 0.0f, 1.0f);
        float y = n06.y(1.0f - this.f, 1.0f, i4);
        float y2 = n06.y(1.0f - this.f, 1.0f, i5);
        float i6 = 1.0f - xy6.i(y2, 0.99f, 1.0f);
        float f4 = this.b;
        int i7 = (int) ((y * f4) + ((float) ((int) ((xy6.i(y, 0.0f, 0.01f) * ((float) i2)) / 0.01f))));
        int i8 = (int) ((y2 * f4) - ((float) ((int) ((i6 * ((float) i3)) / 0.01f))));
        float f5 = (-f4) / 2.0f;
        if (i7 <= i8) {
            float f6 = this.d;
            float f7 = ((float) i7) + f6;
            float f8 = ((float) i8) - f6;
            float f9 = f6 * 2.0f;
            paint2.setColor(i);
            paint2.setAntiAlias(true);
            paint2.setStrokeWidth(this.c);
            if (f7 >= f8) {
                h(canvas, paint, new PointF(f7 + f5, 0.0f), new PointF(f8 + f5, 0.0f), f9, this.c);
                return;
            }
            paint2.setStyle(Paint.Style.STROKE);
            paint2.setStrokeCap(this.e ? Paint.Cap.ROUND : Paint.Cap.BUTT);
            float f10 = f7 + f5;
            float f11 = f8 + f5;
            canvas.drawLine(f10, 0.0f, f11, 0.0f, paint);
            if (!this.e && this.d > 0.0f) {
                paint2.setStyle(Paint.Style.FILL);
                if (f7 > 0.0f) {
                    h(canvas, paint, new PointF(f10, 0.0f), (PointF) null, f9, this.c);
                }
                if (f8 < this.b) {
                    h(canvas, paint, new PointF(f11, 0.0f), (PointF) null, f9, this.c);
                }
            }
        }
    }

    public final void h(Canvas canvas, Paint paint, PointF pointF, PointF pointF2, float f2, float f3) {
        float min = Math.min(f3, this.c);
        float f4 = f2 / 2.0f;
        float min2 = Math.min(f4, (this.d * min) / this.c);
        RectF rectF = new RectF((-f2) / 2.0f, (-min) / 2.0f, f4, min / 2.0f);
        paint.setStyle(Paint.Style.FILL);
        canvas.save();
        if (pointF2 != null) {
            canvas.translate(pointF2.x, pointF2.y);
            Path path = new Path();
            path.addRoundRect(rectF, min2, min2, Path.Direction.CCW);
            canvas.clipPath(path);
            canvas.translate(-pointF2.x, -pointF2.y);
        }
        canvas.translate(pointF.x, pointF.y);
        canvas.drawRoundRect(rectF, min2, min2, paint);
        canvas.restore();
    }
}

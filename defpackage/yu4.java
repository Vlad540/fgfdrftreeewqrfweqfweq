package defpackage;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.text.style.ReplacementSpan;
import java.util.Objects;

/* renamed from: yu4  reason: default package */
public final class yu4 extends ReplacementSpan implements yld {
    public final int X;
    public final Drawable Y;
    public int a;
    public int b;
    public Rect c;
    public final Paint.FontMetricsInt o = new Paint.FontMetricsInt();

    public yu4(Drawable drawable) {
        this.Y = drawable;
        this.X = 2;
        Rect bounds = drawable.getBounds();
        this.c = bounds;
        this.a = bounds.width();
        this.b = this.c.height();
    }

    public final int a(Paint paint, CharSequence charSequence, int i, int i2, Paint.FontMetricsInt fontMetricsInt) {
        Rect bounds = this.Y.getBounds();
        this.c = bounds;
        this.a = bounds.width();
        int height = this.c.height();
        this.b = height;
        if (fontMetricsInt == null) {
            return this.a;
        }
        Paint.FontMetricsInt fontMetricsInt2 = paint.getFontMetricsInt();
        int i3 = fontMetricsInt2.ascent;
        fontMetricsInt.ascent = i3;
        int i4 = fontMetricsInt2.descent;
        fontMetricsInt.descent = i4;
        fontMetricsInt.leading = fontMetricsInt2.leading;
        int i5 = this.X;
        if (i5 == 0) {
            int i6 = i4 - height;
            if (i3 > i6) {
                fontMetricsInt.ascent = i6;
            }
        } else if (i5 != 2) {
            int i7 = -height;
            if (i3 > i7) {
                fontMetricsInt.ascent = i7;
            }
        } else {
            int i8 = i4 - i3;
            if (i8 < height) {
                int i9 = i3 - ((height - i8) / 2);
                fontMetricsInt.ascent = i9;
                fontMetricsInt.descent = i9 + height;
            }
        }
        fontMetricsInt.top = Math.min(fontMetricsInt2.top, fontMetricsInt.ascent);
        fontMetricsInt.bottom = Math.max(fontMetricsInt2.bottom, fontMetricsInt.descent);
        return this.a;
    }

    public final Drawable b() {
        return this.Y;
    }

    public final void draw(Canvas canvas, CharSequence charSequence, int i, int i2, float f, int i3, int i4, int i5, Paint paint) {
        int i6;
        Paint.FontMetricsInt fontMetricsInt = this.o;
        paint.getFontMetricsInt(fontMetricsInt);
        int i7 = this.b;
        int i8 = this.X;
        if (i8 == 0) {
            i6 = fontMetricsInt.descent - i7;
        } else if (i8 != 2) {
            i6 = -i7;
        } else {
            int i9 = fontMetricsInt.descent;
            int i10 = fontMetricsInt.ascent;
            i6 = i10 + (((i9 - i10) - i7) / 2);
        }
        int i11 = i4 + i6;
        canvas.translate(f, (float) i11);
        this.Y.draw(canvas);
        canvas.translate(-f, (float) (-i11));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof yu4)) {
            return false;
        }
        yu4 yu4 = (yu4) obj;
        return this.X == yu4.X && Objects.equals(this.c, yu4.c) && Objects.equals(this.Y, yu4.Y);
    }

    public final int getSize(Paint paint, CharSequence charSequence, int i, int i2, Paint.FontMetricsInt fontMetricsInt) {
        int abs;
        Drawable drawable = this.Y;
        if (drawable instanceof hnd) {
            hnd hnd = (hnd) drawable;
            Paint.FontMetricsInt fontMetricsInt2 = paint.getFontMetricsInt();
            if (fontMetricsInt2 == null) {
                fontMetricsInt2 = fontMetricsInt;
            }
            Paint paint2 = hnd.d;
            hnd.getClass();
            if (fontMetricsInt2 != null && (abs = Math.abs(fontMetricsInt2.ascent) + Math.abs(fontMetricsInt2.descent)) > 0) {
                ind ind = hnd.a;
                if (ind.b != abs) {
                    ind.b = abs;
                    hnd.setBounds(0, 0, abs, abs);
                    hnd.a();
                    hnd.invalidateSelf();
                }
            }
        }
        return a(paint, charSequence, i, i2, fontMetricsInt);
    }

    public final int hashCode() {
        return Objects.hash(new Object[]{this.c, Integer.valueOf(this.X), this.Y});
    }
}

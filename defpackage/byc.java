package defpackage;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;

/* renamed from: byc  reason: default package */
public final class byc extends Drawable {
    public final int a;
    public final TextPaint b;
    public final Drawable c;
    public final String d;
    public StaticLayout e;
    public final int f;
    public final int g;

    public byc(Context context, int i) {
        this.a = i;
        TextPaint textPaint = new TextPaint();
        textPaint.setTextSize(context.getResources().getDimension(yhc.a));
        textPaint.setTypeface(Typeface.DEFAULT);
        textPaint.setTextAlign(Paint.Align.CENTER);
        textPaint.setAntiAlias(true);
        r7e r7e = wce.a0;
        textPaint.setColor(fja.E(context).t);
        this.b = textPaint;
        Drawable b2 = gq3.b(context, zhc.f0);
        b2.setTint(-1);
        this.c = b2;
        this.d = context.getString(cic.J2);
        this.f = (i / 2) + a24.X(((float) 8) * context.getResources().getDisplayMetrics().density);
        this.g = a24.X(((float) 32) * context.getResources().getDisplayMetrics().density);
    }

    public final void draw(Canvas canvas) {
        StaticLayout staticLayout = this.e;
        if (staticLayout != null) {
            Drawable drawable = this.c;
            if (!drawable.getBounds().isEmpty()) {
                drawable.draw(canvas);
            }
            canvas.save();
            canvas.translate(((float) getBounds().width()) / 2.0f, ((float) ((drawable.getIntrinsicHeight() + (getBounds().height() - staticLayout.getHeight())) + this.f)) / 2.0f);
            staticLayout.draw(canvas);
            canvas.restore();
        }
    }

    public final int getOpacity() {
        return -3;
    }

    public final void onBoundsChange(Rect rect) {
        if (!rect.isEmpty()) {
            if (this.e == null) {
                String str = this.d;
                int length = str.length();
                TextPaint textPaint = this.b;
                int width = rect.width() - this.g;
                if (width < 0) {
                    width = 0;
                }
                this.e = StaticLayout.Builder.obtain(str, 0, length, textPaint, width).setAlignment(Layout.Alignment.ALIGN_NORMAL).build();
            }
            StaticLayout staticLayout = this.e;
            if (staticLayout != null) {
                int width2 = rect.width();
                Drawable drawable = this.c;
                int i = this.a;
                int intrinsicWidth = ((width2 - drawable.getIntrinsicWidth()) / 2) - (i / 2);
                int i2 = this.f;
                int height = ((((rect.height() - drawable.getIntrinsicHeight()) - staticLayout.getHeight()) / 2) - i2) - (i / 2);
                int intrinsicWidth2 = (i / 2) + ((drawable.getIntrinsicWidth() + rect.width()) / 2);
                int intrinsicHeight = (i / 2) + ((((drawable.getIntrinsicHeight() + rect.height()) - staticLayout.getHeight()) / 2) - i2);
                if (intrinsicWidth < intrinsicWidth2 && height < intrinsicHeight) {
                    drawable.setBounds(intrinsicWidth, height, intrinsicWidth2, intrinsicHeight);
                    return;
                }
                return;
            }
            throw new IllegalStateException("Text layout has null value");
        }
    }

    public final void setAlpha(int i) {
        this.b.setAlpha(i);
        this.c.setAlpha(i);
    }

    public final void setColorFilter(ColorFilter colorFilter) {
        this.b.setColorFilter(colorFilter);
        this.c.setColorFilter(colorFilter);
    }
}

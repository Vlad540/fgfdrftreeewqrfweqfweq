package defpackage;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;

/* renamed from: ih8  reason: default package */
public final class ih8 extends View implements mhe {
    public final int a = a24.X(((float) 2) * dh4.c().getDisplayMetrics().density);
    public final int b = a24.X(((float) 6) * dh4.c().getDisplayMetrics().density);
    public final float c = (dh4.c().getDisplayMetrics().density * 16.0f);
    public final Drawable o;
    public final t97 w0;

    public ih8(Context context) {
        super(context);
        int X = a24.X(((float) 16) * dh4.c().getDisplayMetrics().density);
        Drawable b2 = gq3.b(getContext(), phc.R);
        b2.setBounds(0, 0, X, X);
        b2.setTint(getDrawableColor());
        this.o = b2;
        this.w0 = ez3.O(3, new ib7(23));
        setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
        setTranslationZ(Float.MAX_VALUE);
    }

    private final int getBackgroundColor() {
        km4.y0.r(this).a().o().a.getClass();
        return 1543503872;
    }

    private final Paint getBackgroundPaint() {
        return (Paint) this.w0.getValue();
    }

    private final int getDrawableColor() {
        km4.y0.r(this).a().o().c.getClass();
        return -1;
    }

    public final void onDraw(Canvas canvas) {
        getBackgroundPaint().setColor(getBackgroundColor());
        float f = this.c;
        canvas.drawRoundRect(0.0f, 0.0f, (float) getMeasuredWidth(), (float) getMeasuredHeight(), f, f, getBackgroundPaint());
        int save = canvas.save();
        canvas.translate((float) this.b, (float) this.a);
        try {
            this.o.draw(canvas);
        } finally {
            canvas.restoreToCount(save);
        }
    }

    public final void onMeasure(int i, int i2) {
        Drawable drawable = this.o;
        setMeasuredDimension((this.b * 2) + drawable.getBounds().width(), (this.a * 2) + drawable.getBounds().height());
    }

    public final void onThemeChanged(pda pda) {
        this.o.setTint(getDrawableColor());
    }
}

package defpackage;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.text.TextPaint;
import android.util.AttributeSet;
import android.view.View;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: v62  reason: default package */
public final class v62 extends View implements mhe {
    public final int a = a24.X(((float) 4) * dh4.c().getDisplayMetrics().density);
    public final int b;
    public final int c;
    public final TextPaint o;
    public final Drawable w0;
    public List x0;

    public v62(Context context) {
        super(context, (AttributeSet) null);
        float f = (float) 12;
        this.b = a24.X(dh4.c().getDisplayMetrics().density * f);
        this.c = a24.X(((float) 6) * dh4.c().getDisplayMetrics().density);
        TextPaint textPaint = new TextPaint(1);
        nte.r.a(textPaint, context.getResources().getDisplayMetrics(), yq4.b);
        this.o = textPaint;
        Drawable b2 = gq3.b(getContext(), phc.h);
        b2.setBounds(0, 0, a24.X(dh4.c().getDisplayMetrics().density * f), a24.X(f * dh4.c().getDisplayMetrics().density));
        this.w0 = b2;
        this.x0 = hw4.a;
        onThemeChanged(km4.y0.r(this));
    }

    public final void onDraw(Canvas canvas) {
        String str;
        super.onDraw(canvas);
        TextPaint textPaint = this.o;
        Paint.FontMetrics fontMetrics = textPaint.getFontMetrics();
        int i = this.a;
        int i2 = ((int) (fontMetrics.descent - fontMetrics.ascent)) + i;
        int paddingTop = getPaddingTop() + i;
        for (CharSequence charSequence : this.x0) {
            if (charSequence == null || (str = charSequence.toString()) == null) {
                str = "";
            }
            float f = fontMetrics.ascent;
            float f2 = ((float) paddingTop) - f;
            float f3 = ((f + fontMetrics.descent) / ((float) 2)) + f2;
            int i3 = this.b;
            int paddingLeft = getPaddingLeft();
            int paddingLeft2 = getPaddingLeft() + i3;
            Drawable drawable = this.w0;
            drawable.setBounds(paddingLeft, (int) (f3 - ((float) (i3 / 2))), paddingLeft2, (int) (f3 + ((float) (i3 / 2))));
            drawable.draw(canvas);
            canvas.drawText(str, (float) (getPaddingLeft() + i3 + this.c), f2, textPaint);
            paddingTop += i2;
        }
    }

    public final void onMeasure(int i, int i2) {
        Float f;
        String str;
        TextPaint textPaint = this.o;
        Paint.FontMetrics fontMetrics = textPaint.getFontMetrics();
        int paddingBottom = getPaddingBottom() + getPaddingTop() + ((int) (((float) this.x0.size()) * ((fontMetrics.descent - fontMetrics.ascent) + ((float) this.a))));
        List<CharSequence> list = this.x0;
        ArrayList arrayList = new ArrayList(q23.H(list, 10));
        for (CharSequence charSequence : list) {
            if (charSequence == null || (str = charSequence.toString()) == null) {
                str = "";
            }
            arrayList.add(Float.valueOf(textPaint.measureText(str)));
        }
        Iterator it = arrayList.iterator();
        if (!it.hasNext()) {
            f = null;
        } else {
            float floatValue = ((Number) it.next()).floatValue();
            while (it.hasNext()) {
                floatValue = Math.max(floatValue, ((Number) it.next()).floatValue());
            }
            f = Float.valueOf(floatValue);
        }
        setMeasuredDimension(View.resolveSize((int) (((float) (getPaddingLeft() + this.b + this.c)) + (f != null ? f.floatValue() : 0.0f) + ((float) getPaddingRight())), i), View.resolveSize(paddingBottom, i2));
    }

    public final void onThemeChanged(pda pda) {
        this.o.setColor(pda.getText().g);
        this.w0.setTint(pda.a().o().e.g);
        invalidate();
    }
}

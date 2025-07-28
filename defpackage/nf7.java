package defpackage;

import android.graphics.Typeface;
import android.text.TextPaint;
import android.text.style.URLSpan;
import android.view.View;
import android.widget.TextView;

/* renamed from: nf7  reason: default package */
public final class nf7 extends URLSpan {
    public final p7 X;
    public of7 a = null;
    public int b;
    public final boolean c;
    public final boolean o;

    public nf7(String str, int i, boolean z, boolean z2) {
        super(str);
        this.b = i;
        this.c = z;
        this.o = z2;
        this.X = new p7(0);
    }

    public final void onClick(View view) {
        long currentTimeMillis = System.currentTimeMillis();
        p7 p7Var = this.X;
        if (currentTimeMillis - p7Var.c > p7Var.b) {
            p7Var.c = currentTimeMillis;
            if (!(view instanceof TextView) || ((TextView) view).getLinksClickable()) {
                of7 of7 = this.a;
                if (of7 == null) {
                    of7 = view instanceof of7 ? (of7) view : null;
                }
                if (of7 != null) {
                    of7.c(getURL(), sf7.a, this);
                }
            }
        }
    }

    public final void updateDrawState(TextPaint textPaint) {
        int i = textPaint.bgColor;
        int i2 = this.b;
        if (i != i2) {
            textPaint.setColor(i2);
        }
        textPaint.setUnderlineText(this.c);
        if (this.o) {
            textPaint.setTypeface(Typeface.create(Typeface.DEFAULT, 1));
        }
    }
}

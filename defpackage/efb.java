package defpackage;

import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.view.View;

/* renamed from: efb  reason: default package */
public final class efb extends ClickableSpan {
    public final String a;
    public int b;
    public boolean c = true;
    public pf7 o;

    public efb(String str, int i) {
        this.a = str;
        this.b = i;
    }

    public final void onClick(View view) {
        pf7 pf7 = this.o;
        if (pf7 != null) {
            rf7 rf7 = pf7.a;
            rf7.getClass();
            long currentTimeMillis = System.currentTimeMillis();
            p7 p7Var = rf7.e;
            if (currentTimeMillis - p7Var.c > p7Var.b) {
                p7Var.c = currentTimeMillis;
                of7 of7 = rf7.a;
                if (of7 != null) {
                    of7.c(this.a, sf7.X, (ClickableSpan) null);
                }
            }
        }
    }

    public final void updateDrawState(TextPaint textPaint) {
        textPaint.setColor(this.b);
        textPaint.setUnderlineText(this.c);
    }
}

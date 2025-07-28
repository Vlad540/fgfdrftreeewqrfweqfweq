package defpackage;

import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.view.View;

/* renamed from: ip8  reason: default package */
public final class ip8 extends ClickableSpan {
    public final fp8 a;
    public int b;
    public qf7 c;

    public ip8(fp8 fp8, int i) {
        this.a = fp8;
        this.b = i;
    }

    public final void onClick(View view) {
        qf7 qf7 = this.c;
        if (qf7 != null) {
            rf7 rf7 = qf7.a;
            rf7.getClass();
            long currentTimeMillis = System.currentTimeMillis();
            p7 p7Var = rf7.e;
            if (currentTimeMillis - p7Var.c > p7Var.b) {
                p7Var.c = currentTimeMillis;
                of7 of7 = rf7.a;
                if (of7 == null) {
                    of7 = view instanceof of7 ? (of7) view : null;
                }
                if (of7 != null) {
                    of7.a(this.a);
                }
            }
        }
    }

    public final void updateDrawState(TextPaint textPaint) {
        textPaint.setColor(this.b);
        textPaint.setUnderlineText(true);
    }
}

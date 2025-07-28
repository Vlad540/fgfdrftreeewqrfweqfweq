package defpackage;

import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.view.View;

/* renamed from: lf7  reason: default package */
public final class lf7 extends ClickableSpan implements uu7 {
    public int a;
    public final String b;
    public kf7 c;
    public final int o = 6;

    public lf7(String str, int i) {
        this.a = i;
        this.b = h0e.B0(str).toString();
    }

    public final qt3 copy() {
        return new lf7(this.b, this.a);
    }

    public final int getType() {
        return this.o;
    }

    public final void onClick(View view) {
        kf7 kf7 = this.c;
        if (kf7 != null) {
            kf7.b(view, this.b);
        }
    }

    public final void updateDrawState(TextPaint textPaint) {
        textPaint.setColor(this.a);
        textPaint.linkColor = this.a;
        textPaint.setUnderlineText(true);
    }
}

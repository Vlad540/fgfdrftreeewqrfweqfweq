package defpackage;

import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.view.View;

/* renamed from: yo0  reason: default package */
public final class yo0 extends ClickableSpan {
    public final String a;
    public final int b;
    public mf7 c;

    public yo0(String str, int i) {
        this.a = str;
        this.b = i;
    }

    public final void onClick(View view) {
        mf7 mf7 = this.c;
        if (mf7 != null) {
            mf7.a.b(view, this.a, sf7.c, (ClickableSpan) mf7.b);
        }
    }

    public final void updateDrawState(TextPaint textPaint) {
        textPaint.setColor(this.b);
        textPaint.setUnderlineText(true);
    }
}

package defpackage;

import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.text.style.UpdateAppearance;
import android.view.View;

/* renamed from: s2e  reason: default package */
public final class s2e extends ClickableSpan implements UpdateAppearance, mhe {
    public static final /* synthetic */ int X = 0;
    public final x2e a;
    public final i26 b;
    public int c = -16745729;
    public int o;

    public s2e(s16 s16, x2e x2e, i26 i26) {
        this.a = x2e;
        this.b = i26;
        ((pda) s16.invoke()).e();
        ((pda) s16.invoke()).e();
        this.o = -16745729;
    }

    public final void onClick(View view) {
        this.b.invoke(view, this.a);
    }

    public final void onThemeChanged(pda pda) {
        pda.e();
        this.c = -16745729;
        this.o = -16745729;
    }

    public final void updateDrawState(TextPaint textPaint) {
        super.updateDrawState(textPaint);
        textPaint.setColor(this.c);
        textPaint.bgColor = j33.h(this.o, 80);
        textPaint.setUnderlineText(false);
    }
}

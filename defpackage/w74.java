package defpackage;

import android.text.TextPaint;

/* renamed from: w74  reason: default package */
public final class w74 implements mt4 {
    public static final ThreadLocal b = new ThreadLocal();
    public final TextPaint a;

    public w74() {
        TextPaint textPaint = new TextPaint();
        this.a = textPaint;
        textPaint.setTextSize(10.0f);
    }
}

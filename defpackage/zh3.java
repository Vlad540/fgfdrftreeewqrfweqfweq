package defpackage;

import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.view.View;
import one.me.messages.list.ui.MessagesListWidget;

/* renamed from: zh3  reason: default package */
public final class zh3 extends ClickableSpan {
    public final long a;
    public zx1 b;

    public zh3(long j) {
        this.a = j;
    }

    public final void onClick(View view) {
        lv1 lv1;
        zx1 zx1 = this.b;
        if (zx1 != null && (lv1 = ((ir3) zx1.b).M0) != null) {
            k77[] k77Arr = MessagesListWidget.b1;
            ((MessagesListWidget) lv1.b).t0().E(this.a);
        }
    }

    public final void updateDrawState(TextPaint textPaint) {
        textPaint.setUnderlineText(true);
    }
}

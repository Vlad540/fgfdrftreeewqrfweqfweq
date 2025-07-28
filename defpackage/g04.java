package defpackage;

import android.text.BoringLayout;
import android.text.Layout;
import android.text.TextPaint;

/* renamed from: g04  reason: default package */
public final class g04 extends u2 {
    public final /* synthetic */ int c;
    public final /* synthetic */ h04 o;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public g04(h04 h04, int i) {
        super(9, (Object) null);
        this.c = i;
        switch (i) {
            case 1:
                Boolean bool = Boolean.FALSE;
                this.o = h04;
                super(9, (Object) bool);
                return;
            default:
                this.o = h04;
                return;
        }
    }

    public final void L1(Object obj, Object obj2) {
        switch (this.c) {
            case 0:
                CharSequence charSequence = (CharSequence) obj2;
                if (!hhd.f((CharSequence) obj, charSequence) && charSequence != null && charSequence.length() != 0) {
                    h04 h04 = this.o;
                    BoringLayout.Metrics a = h04.getMetrics();
                    TextPaint textPaint = h04.I0;
                    a.width = a24.X(textPaint.measureText(charSequence, 0, charSequence.length()));
                    textPaint.setColor(h04.z0);
                    h04.D0 = BoringLayout.make(charSequence, textPaint, a.width, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, a, false);
                    h04.invalidate();
                    h04.requestLayout();
                    return;
                }
                return;
            default:
                if (!hhd.f(obj, obj2)) {
                    ((Boolean) obj2).getClass();
                    ((Boolean) obj).getClass();
                    h04 h042 = this.o;
                    h042.d(h042.B0);
                    h042.invalidate();
                    return;
                }
                return;
        }
    }
}

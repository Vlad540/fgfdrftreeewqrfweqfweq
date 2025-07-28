package defpackage;

import android.graphics.drawable.Drawable;
import android.text.BoringLayout;
import android.text.TextPaint;
import android.text.TextUtils;

/* renamed from: b2f  reason: default package */
public final class b2f extends u2 {
    public final /* synthetic */ int c;
    public final /* synthetic */ c2f o;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public b2f(c2f c2f, int i) {
        super(9, (Object) null);
        this.c = i;
        switch (i) {
            case 1:
                Boolean bool = Boolean.FALSE;
                this.o = c2f;
                super(9, (Object) bool);
                return;
            case 2:
                Boolean bool2 = Boolean.TRUE;
                this.o = c2f;
                super(9, (Object) bool2);
                return;
            default:
                this.o = c2f;
                return;
        }
    }

    public final void L1(Object obj, Object obj2) {
        Drawable drawable;
        switch (this.c) {
            case 0:
                CharSequence charSequence = (CharSequence) obj2;
                if (!hhd.f((CharSequence) obj, charSequence) && charSequence != null && charSequence.length() != 0) {
                    c2f c2f = this.o;
                    BoringLayout.Metrics b = c2f.getMetrics();
                    TextPaint textPaint = c2f.I0;
                    b.width = a24.X(textPaint.measureText(charSequence, 0, charSequence.length()));
                    textPaint.setColor(c2f.A0);
                    c2f.E0 = c2f.a.a(charSequence, textPaint, b.width, 1, false, TextUtils.TruncateAt.END);
                    c2f.invalidate();
                    c2f.requestLayout();
                    return;
                }
                return;
            case 1:
                if (!hhd.f(obj, obj2)) {
                    ((Boolean) obj2).getClass();
                    ((Boolean) obj).getClass();
                    this.o.invalidate();
                    return;
                }
                return;
            default:
                if (!hhd.f(obj, obj2)) {
                    boolean booleanValue = ((Boolean) obj2).booleanValue();
                    ((Boolean) obj).getClass();
                    c2f c2f2 = this.o;
                    if (booleanValue) {
                        drawable = gq3.b(c2f2.getContext(), phc.k2);
                        int i = c2f2.c;
                        drawable.setBounds(0, 0, i, i);
                        drawable.setTint(c2f2.getDrawableColor());
                    } else {
                        drawable = null;
                    }
                    c2f2.D0 = drawable;
                    c2f2.requestLayout();
                    c2f2.invalidate();
                    return;
                }
                return;
        }
    }
}

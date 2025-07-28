package defpackage;

import android.content.Context;
import android.text.Spannable;
import android.text.TextUtils;
import android.text.style.ClickableSpan;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import kotlin.coroutines.Continuation;

/* renamed from: fk2  reason: default package */
public final class fk2 extends LinearLayout implements of7, xz2 {
    public ek2 a;
    public final rf7 b;
    public final TextView c;

    public fk2(Context context) {
        super(context, (AttributeSet) null);
        yz2 yz2 = new yz2(context, this);
        rf7 rf7 = new rf7(this, new nl1(10, this), 4);
        this.b = rf7;
        TextView textView = new TextView(context);
        textView.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
        nte.k.b(textView, yq4.b);
        textView.setMovementMethod(yz2);
        textView.setTransformationMethod(rf7);
        textView.setEllipsize(TextUtils.TruncateAt.END);
        urd.B(new y9(3, (Continuation) null, 5), textView);
        textView.setGravity(16);
        this.c = textView;
        setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
        setOrientation(1);
        float f = (float) 12;
        setPaddingRelative(a24.X(dh4.c().getDisplayMetrics().density * f), a24.X(dh4.c().getDisplayMetrics().density * f), a24.X(dh4.c().getDisplayMetrics().density * f), a24.X(f * dh4.c().getDisplayMetrics().density));
        addView(textView);
    }

    public final void c(String str, sf7 sf7, ClickableSpan clickableSpan) {
        nfc nfc = this.a;
        if (nfc != null) {
            ((wwc) nfc.b).Z(str, sf7);
        }
    }

    public final boolean e(ClickableSpan clickableSpan, int i, int i2, String str, sf7 sf7, MotionEvent motionEvent) {
        nfc nfc = this.a;
        if (nfc == null) {
            return false;
        }
        ((wwc) nfc.b).a0(str, sf7, motionEvent);
        return true;
    }

    public final ek2 getListener() {
        return this.a;
    }

    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        CharSequence text = this.c.getText();
        Spannable spannable = text instanceof Spannable ? (Spannable) text : null;
        if (spannable != null) {
            this.b.c(spannable);
        }
    }

    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        CharSequence text = this.c.getText();
        Spannable spannable = text instanceof Spannable ? (Spannable) text : null;
        if (spannable != null) {
            this.b.getClass();
            rf7.a(spannable);
        }
    }

    /* JADX WARNING: type inference failed for: r5v1, types: [java.lang.CharSequence] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void setDescription(java.lang.CharSequence r5) {
        /*
            r4 = this;
            android.widget.TextView r0 = r4.c
            java.lang.CharSequence r1 = r0.getText()
            boolean r2 = r1 instanceof android.text.Spannable
            r3 = 0
            if (r2 == 0) goto L_0x000e
            android.text.Spannable r1 = (android.text.Spannable) r1
            goto L_0x000f
        L_0x000e:
            r1 = r3
        L_0x000f:
            rf7 r4 = r4.b
            if (r1 != 0) goto L_0x0014
            goto L_0x001a
        L_0x0014:
            r4.getClass()
            defpackage.rf7.a(r1)
        L_0x001a:
            r0.setText(r5)
            r0.setTransformationMethod(r4)
            java.lang.CharSequence r5 = r0.getText()
            boolean r0 = r5 instanceof android.text.Spannable
            if (r0 == 0) goto L_0x002b
            r3 = r5
            android.text.Spannable r3 = (android.text.Spannable) r3
        L_0x002b:
            if (r3 != 0) goto L_0x002e
            goto L_0x0031
        L_0x002e:
            r4.c(r3)
        L_0x0031:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.fk2.setDescription(java.lang.CharSequence):void");
    }

    public final void setListener(ek2 ek2) {
        this.a = ek2;
    }
}

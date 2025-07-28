package defpackage;

import android.content.Context;
import android.text.Spannable;
import android.text.SpannableString;
import android.text.TextUtils;
import android.text.style.ClickableSpan;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import kotlin.coroutines.Continuation;

/* renamed from: an3  reason: default package */
public final class an3 extends LinearLayout implements of7, xz2 {
    public zm3 a;
    public final yz2 b;
    public final rf7 c = new rf7(this, new nl1(22, this), 4);
    public final TextView o;
    public final i55 w0;

    public an3(Context context) {
        super(context, (AttributeSet) null);
        this.b = new yz2(context, this);
        TextView textView = new TextView(context);
        textView.setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
        nte.o.b(textView, yq4.b);
        textView.setEllipsize(TextUtils.TruncateAt.END);
        urd.B(new y9(3, (Continuation) null, 10), textView);
        textView.setGravity(8388627);
        textView.setSingleLine(true);
        this.o = textView;
        i55 i55 = new i55(context);
        i55.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
        setGravity(16);
        i55.setTypography(nte.E);
        i55.setCollapsedLines(5);
        i55.setExpandWithAnimation(true);
        i55.setOnTouchListener(new wd1(i55, 1, this));
        this.w0 = i55;
        setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
        setOrientation(1);
        float f = (float) 12;
        float f2 = (float) 8;
        setPaddingRelative(a24.X(dh4.c().getDisplayMetrics().density * f), a24.X(dh4.c().getDisplayMetrics().density * f2), a24.X(f * dh4.c().getDisplayMetrics().density), a24.X(f2 * dh4.c().getDisplayMetrics().density));
        addView(textView);
        addView(i55);
        ViewGroup.LayoutParams layoutParams = i55.getLayoutParams();
        if (layoutParams != null) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
            marginLayoutParams.topMargin = a24.X(((float) 2) * dh4.c().getDisplayMetrics().density);
            i55.setLayoutParams(marginLayoutParams);
            return;
        }
        throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
    }

    public final void c(String str, sf7 sf7, ClickableSpan clickableSpan) {
        u5g u5g = this.a;
        if (u5g != null) {
            ((wwc) u5g.b).Z(str, sf7);
        }
    }

    public final boolean e(ClickableSpan clickableSpan, int i, int i2, String str, sf7 sf7, MotionEvent motionEvent) {
        u5g u5g = this.a;
        if (u5g == null) {
            return false;
        }
        ((wwc) u5g.b).a0(str, sf7, motionEvent);
        return true;
    }

    public final zm3 getListener() {
        return this.a;
    }

    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        SpannableString text = this.w0.getText();
        if (!(text instanceof Spannable)) {
            text = null;
        }
        if (text != null) {
            this.c.c(text);
        }
    }

    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        SpannableString text = this.w0.getText();
        if (!(text instanceof Spannable)) {
            text = null;
        }
        if (text != null) {
            this.c.getClass();
            rf7.a(text);
        }
    }

    public final void setDescription(CharSequence charSequence) {
        i55 i55 = this.w0;
        SpannableString text = i55.getText();
        SpannableString spannableString = null;
        if (!(text instanceof Spannable)) {
            text = null;
        }
        rf7 rf7 = this.c;
        if (text != null) {
            rf7.getClass();
            rf7.a(text);
        }
        i55.setText(rf7.getTransformation(charSequence, i55));
        SpannableString text2 = i55.getText();
        if (text2 instanceof Spannable) {
            spannableString = text2;
        }
        if (spannableString != null) {
            rf7.c(spannableString);
        }
    }

    public final void setListener(zm3 zm3) {
        this.a = zm3;
    }

    public final void setTitle(CharSequence charSequence) {
        this.o.setText(charSequence);
    }
}

package defpackage;

import android.content.Context;
import android.text.SpannableString;
import android.text.method.LinkMovementMethod;
import android.text.style.URLSpan;
import android.util.AttributeSet;
import android.widget.LinearLayout;
import android.widget.TextView;
import one.me.sdk.uikit.common.button.OneMeButton;
import one.me.settings.privacy.ui.ChangeDisabledDialog;
import one.me.settings.privacy.ui.ForgotPinCodeDialog;
import ru.ok.tamtam.android.prefs.PmsKey;

/* renamed from: yy1  reason: default package */
public final class yy1 extends LinearLayout implements mhe {
    public final /* synthetic */ int a = 0;
    public final TextView b;
    public final TextView c;
    public final OneMeButton o;

    public yy1(ForgotPinCodeDialog forgotPinCodeDialog, Context context) {
        super(context);
        setOrientation(1);
        setGravity(17);
        TextView textView = new TextView(getContext());
        nte.d.b(textView, yq4.b);
        textView.setGravity(1);
        textView.setText(oub.oneme_settings_privacy_forgot_pin_code);
        textView.setTextAlignment(4);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
        layoutParams.topMargin = a24.X(((float) 10) * dh4.c().getDisplayMetrics().density);
        textView.setLayoutParams(layoutParams);
        addView(textView);
        this.b = textView;
        TextView textView2 = new TextView(getContext());
        nte.l.b(textView2, yq4.b);
        textView2.setText(oub.oneme_settings_privacy_forgot_pin_code_write_support);
        textView2.setGravity(1);
        textView2.setTextAlignment(4);
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-2, -2);
        layoutParams2.topMargin = a24.X(((float) 16) * dh4.c().getDisplayMetrics().density);
        textView2.setLayoutParams(layoutParams2);
        addView(textView2);
        this.c = textView2;
        OneMeButton oneMeButton = new OneMeButton(getContext(), (AttributeSet) null);
        oneMeButton.setSize(v0a.c);
        oneMeButton.setMode(u0a.a);
        oneMeButton.setAppearance(s0a.c);
        oneMeButton.setText(cic.s3);
        LinearLayout.LayoutParams layoutParams3 = new LinearLayout.LayoutParams(-1, -2);
        layoutParams3.topMargin = a24.X(((float) 32) * dh4.c().getDisplayMetrics().density);
        oneMeButton.setLayoutParams(layoutParams3);
        a24.a0(oneMeButton, new eu5(1, forgotPinCodeDialog));
        addView(oneMeButton);
        this.o = oneMeButton;
        onThemeChanged(km4.y0.r(this));
    }

    public final void onThemeChanged(pda pda) {
        switch (this.a) {
            case 0:
                this.b.setTextColor(pda.getText().e);
                this.c.setTextColor(pda.getText().f);
                this.o.e();
                return;
            default:
                this.b.setTextColor(pda.getText().e);
                this.c.setTextColor(pda.getText().f);
                this.o.e();
                return;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public yy1(ChangeDisabledDialog changeDisabledDialog, Context context) {
        super(context);
        s59 s59;
        int i = 0;
        setOrientation(1);
        setGravity(17);
        TextView textView = new TextView(getContext());
        nte.d.b(textView, yq4.b);
        textView.setGravity(1);
        textView.setText(oub.oneme_settings_privacy_change_disabled_title);
        textView.setTextAlignment(4);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
        layoutParams.topMargin = a24.X(((float) 10) * dh4.c().getDisplayMetrics().density);
        textView.setLayoutParams(layoutParams);
        addView(textView);
        this.b = textView;
        TextView textView2 = new TextView(getContext());
        nte.l.b(textView2, yq4.b);
        int i2 = ChangeDisabledDialog.C0;
        SpannableString valueOf = SpannableString.valueOf(changeDisabledDialog.getContext().getText(oub.oneme_settings_privacy_change_disabled_description));
        URLSpan[] uRLSpanArr = (URLSpan[]) valueOf.getSpans(0, valueOf.length(), URLSpan.class);
        vqc vqc = (vqc) ((xzc) y8d.a.getAccessor().d(xzc.class).getValue());
        vqc.getClass();
        String q = vqc.q(PmsKey.f112supportaccount, "max.ru/support");
        int length = uRLSpanArr.length;
        while (true) {
            s59 = km4.y0;
            if (i >= length) {
                break;
            }
            URLSpan uRLSpan = uRLSpanArr[i];
            int spanStart = valueOf.getSpanStart(uRLSpan);
            int spanEnd = valueOf.getSpanEnd(uRLSpan);
            if (spanStart >= 0 && spanStart < spanEnd) {
                valueOf.removeSpan(uRLSpan);
                s59.r(textView2);
                zx1 zx1 = new zx1(2, changeDisabledDialog);
                lf7 lf7 = new lf7(q, -16745729);
                lf7.c = zx1;
                pa2.L(valueOf, lf7, spanStart, spanEnd);
                break;
            }
            i++;
        }
        textView2.setText(valueOf);
        textView2.setGravity(1);
        textView2.setTextAlignment(4);
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-2, -2);
        layoutParams2.topMargin = a24.X(((float) 16) * dh4.c().getDisplayMetrics().density);
        textView2.setLayoutParams(layoutParams2);
        textView2.setMovementMethod(LinkMovementMethod.getInstance());
        addView(textView2);
        this.c = textView2;
        OneMeButton oneMeButton = new OneMeButton(getContext(), (AttributeSet) null);
        oneMeButton.setSize(v0a.c);
        oneMeButton.setMode(u0a.a);
        oneMeButton.setAppearance(s0a.c);
        oneMeButton.setText(cic.j0);
        LinearLayout.LayoutParams layoutParams3 = new LinearLayout.LayoutParams(-1, -2);
        layoutParams3.topMargin = a24.X(((float) 32) * dh4.c().getDisplayMetrics().density);
        oneMeButton.setLayoutParams(layoutParams3);
        a24.a0(oneMeButton, new d5(16, (Object) changeDisabledDialog));
        addView(oneMeButton);
        this.o = oneMeButton;
        onThemeChanged(s59.r(this));
    }
}

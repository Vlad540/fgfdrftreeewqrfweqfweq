package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.RippleDrawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.NoWhenBranchMatchedException;

/* renamed from: ua2  reason: default package */
public final class ua2 extends ConstraintLayout implements mhe {
    public final TextView K0;
    public final TextView L0;
    public final GradientDrawable M0;
    public final AppCompatImageView N0;
    public q40 O0;
    public g37 P0;
    public Long Q0;

    /* JADX WARNING: type inference failed for: r13v0, types: [androidx.constraintlayout.widget.ConstraintLayout, ua2, android.view.View, android.view.ViewGroup] */
    public ua2(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        TextView textView = new TextView(context);
        re3 re3 = new re3(-1, -2);
        float f = (float) 4;
        re3.bottomMargin = a24.X(dh4.c().getDisplayMetrics().density * f);
        textView.setLayoutParams(re3);
        nte.i.b(textView, yq4.b);
        textView.setSingleLine(true);
        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
        textView.setEllipsize(truncateAt);
        this.K0 = textView;
        TextView textView2 = new TextView(context);
        re3 re32 = new re3(-1, -2);
        re32.bottomMargin = a24.X(f * dh4.c().getDisplayMetrics().density);
        textView2.setLayoutParams(re32);
        nte.m.b(textView2, yq4.b);
        textView2.setMaxLines(2);
        textView2.setEllipsize(truncateAt);
        textView2.setVisibility(8);
        this.L0 = textView2;
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setShape(1);
        gradientDrawable.setCornerRadius(dh4.c().getDisplayMetrics().density * 48.0f);
        s59 s59 = km4.y0;
        s59.r(this);
        gradientDrawable.setColor(ColorStateList.valueOf(-16745729));
        this.M0 = gradientDrawable;
        AppCompatImageView appCompatImageView = new AppCompatImageView(context, (AttributeSet) null);
        appCompatImageView.setId(j8a.i0);
        float f2 = (float) 40;
        appCompatImageView.setLayoutParams(new re3(a24.X(dh4.c().getDisplayMetrics().density * f2), a24.X(f2 * dh4.c().getDisplayMetrics().density)));
        appCompatImageView.setBackground(gradientDrawable);
        s59.r(appCompatImageView);
        appCompatImageView.setImageTintList(ColorStateList.valueOf(-1));
        appCompatImageView.setScaleType(ImageView.ScaleType.CENTER);
        this.N0 = appCompatImageView;
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setId(j8a.h0);
        linearLayout.setLayoutParams(new re3(0, -2));
        linearLayout.setOrientation(1);
        linearLayout.addView(textView);
        linearLayout.addView(textView2);
        setLayoutParams(new re3(-1, -2));
        float f3 = (float) 12;
        int X = a24.X(dh4.c().getDisplayMetrics().density * f3);
        setPadding(X, X, X, X);
        int i = s59.r(this).c().a.f;
        setBackground(new RippleDrawable(ColorStateList.valueOf(i), (Drawable) null, new ColorDrawable(-1)));
        addView(appCompatImageView);
        addView(linearLayout);
        bf3 p = a06.p(this);
        int id = appCompatImageView.getId();
        p.d(id, 6, 0, 6);
        p.d(id, 3, 0, 3);
        p.d(id, 4, 0, 4);
        int id2 = linearLayout.getId();
        p.d(id2, 3, 0, 3);
        p.d(id2, 4, 0, 4);
        p.d(id2, 7, 0, 7);
        p.d(id2, 6, appCompatImageView.getId(), 7);
        new hw9(p, 6, id2, 4).e(a24.X(f3 * dh4.c().getDisplayMetrics().density));
        p.a(this);
        onThemeChanged(s59.r(this));
    }

    /* JADX WARNING: type inference failed for: r2v0, types: [ua2, android.view.View] */
    private final void setButtonState(o20 o20) {
        boolean f = hhd.f(o20, om3.a);
        AppCompatImageView appCompatImageView = this.N0;
        if (f) {
            appCompatImageView.setImageDrawable(gq3.b(getContext(), phc.c2));
        } else if (hhd.f(o20, zl3.a) || hhd.f(o20, m54.b) || hhd.f(o20, qr4.b)) {
            appCompatImageView.setImageDrawable(gq3.b(getContext(), phc.H1));
        } else {
            throw new NoWhenBranchMatchedException();
        }
    }

    /* JADX WARNING: type inference failed for: r2v0, types: [ua2, android.view.View, java.lang.Object] */
    private final void setState(zqd zqd) {
        q40 q40;
        this.O0 = new q40(this, 1, zqd);
        if (isAttachedToWindow() && (q40 = this.O0) != null) {
            q40.onViewAttachedToWindow(this);
        }
        addOnAttachStateChangeListener(this.O0);
    }

    private final void setSubtitle(CharSequence charSequence) {
        TextView textView = this.L0;
        int i = 0;
        if (!(true ^ (charSequence == null || charSequence.length() == 0))) {
            i = 8;
        }
        textView.setVisibility(i);
        textView.setText(charSequence);
    }

    private final void setTitle(CharSequence charSequence) {
        this.K0.setText(charSequence);
    }

    public static final void w(ua2 ua2, x40 x40) {
        ua2.getClass();
        o20 o20 = x40 != null ? x40.c : null;
        if (o20 == null || !hhd.f(x40.a, ua2.Q0)) {
            ua2.setButtonState(m54.b);
        } else {
            ua2.setButtonState(o20);
        }
    }

    public final void onThemeChanged(pda pda) {
        this.K0.setTextColor(pda.getText().e);
        this.L0.setTextColor(pda.getText().f);
        this.M0.setColor(ColorStateList.valueOf(-16745729));
        this.N0.setImageTintList(ColorStateList.valueOf(-1));
    }

    public final void setupAudio(jh8 jh8) {
        this.Q0 = Long.valueOf(jh8.b);
        setTitle(jh8.Y);
        setSubtitle(jh8.Z);
        setState(jh8.x0);
    }
}

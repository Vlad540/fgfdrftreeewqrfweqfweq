package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.util.AttributeSet;
import android.widget.LinearLayout;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;

/* renamed from: u07  reason: default package */
public final class u07 extends LinearLayout implements mhe {
    public final AppCompatImageView a;
    public final AppCompatTextView b;
    public final RippleDrawable c;

    public u07(Context context) {
        super(context, (AttributeSet) null);
        AppCompatImageView appCompatImageView = new AppCompatImageView(context, (AttributeSet) null);
        float f = (float) 24;
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(a24.X(dh4.c().getDisplayMetrics().density * f), a24.X(f * dh4.c().getDisplayMetrics().density));
        float f2 = (float) 18;
        layoutParams.setMarginEnd(a24.X(dh4.c().getDisplayMetrics().density * f2));
        appCompatImageView.setLayoutParams(layoutParams);
        addView(appCompatImageView);
        this.a = appCompatImageView;
        AppCompatTextView appCompatTextView = new AppCompatTextView(context, (AttributeSet) null);
        nge.d(nte.i, appCompatTextView);
        addView(appCompatTextView);
        this.b = appCompatTextView;
        ShapeDrawable shapeDrawable = new ShapeDrawable();
        s59 s59 = km4.y0;
        RippleDrawable rippleDrawable = new RippleDrawable(ColorStateList.valueOf(s59.r(this).b().f), (Drawable) null, shapeDrawable);
        this.c = rippleDrawable;
        setLayoutParams(new LinearLayout.LayoutParams(-1, a24.X(((float) 56) * dh4.c().getDisplayMetrics().density)));
        setGravity(16);
        float f3 = (float) 12;
        setPadding(a24.X(f2 * dh4.c().getDisplayMetrics().density), a24.X(dh4.c().getDisplayMetrics().density * f3), a24.X(dh4.c().getDisplayMetrics().density * f3), a24.X(f3 * dh4.c().getDisplayMetrics().density));
        setBackground(rippleDrawable);
        setClipChildren(false);
        setClipToOutline(false);
        onThemeChanged(s59.r(this));
    }

    public final Drawable getIcon() {
        return this.a.getDrawable();
    }

    public final CharSequence getText() {
        return this.b.getText();
    }

    public final void onThemeChanged(pda pda) {
        pda.getText();
        this.a.setImageTintList(ColorStateList.valueOf(-16745729));
        this.b.setTextColor(-16745729);
        this.c.setColor(ColorStateList.valueOf(pda.c().a.f));
    }

    public final void setIcon(Drawable drawable) {
        this.a.setImageDrawable(drawable);
    }

    public final void setText(CharSequence charSequence) {
        this.b.setText(charSequence);
    }
}

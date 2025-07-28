package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.Shape;
import android.util.AttributeSet;
import android.widget.LinearLayout;
import androidx.appcompat.widget.AppCompatTextView;

/* renamed from: s1a  reason: default package */
public final class s1a extends LinearLayout implements mhe, gdc {
    public final ShapeDrawable a = new ShapeDrawable();
    public final AppCompatTextView b;
    public final AppCompatTextView c;

    public s1a(Context context) {
        super(context, (AttributeSet) null);
        AppCompatTextView appCompatTextView = new AppCompatTextView(context, (AttributeSet) null);
        nte.i.b(appCompatTextView, yq4.b);
        addView(appCompatTextView);
        this.b = appCompatTextView;
        AppCompatTextView appCompatTextView2 = new AppCompatTextView(context, (AttributeSet) null);
        nte.m.b(appCompatTextView2, yq4.b);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
        layoutParams.setMargins(layoutParams.leftMargin, a24.X(((float) 2) * dh4.c().getDisplayMetrics().density), layoutParams.rightMargin, layoutParams.bottomMargin);
        appCompatTextView2.setLayoutParams(layoutParams);
        addView(appCompatTextView2, appCompatTextView2.getLayoutParams());
        this.c = appCompatTextView2;
        setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
        setMinimumHeight(a24.X(((float) 64) * dh4.c().getDisplayMetrics().density));
        setOrientation(1);
        setGravity(16);
        float f = (float) 12;
        setPadding(a24.X(dh4.c().getDisplayMetrics().density * f), getPaddingTop(), a24.X(f * dh4.c().getDisplayMetrics().density), getPaddingBottom());
        onThemeChanged(km4.y0.r(this));
    }

    public final CharSequence getTextSubtitle() {
        return this.c.getText();
    }

    public final CharSequence getTextTitle() {
        return this.b.getText();
    }

    public final void onThemeChanged(pda pda) {
        this.b.setTextColor(pda.getText().e);
        this.c.setTextColor(pda.getText().f);
        setBackground(new RippleDrawable(ColorStateList.valueOf(pda.c().a.f), (Drawable) null, this.a));
    }

    public void setRippleMask(Shape shape) {
        this.a.setShape(shape);
    }

    public final void setTextSubtitle(CharSequence charSequence) {
        this.c.setText(charSequence);
    }

    public final void setTextTitle(CharSequence charSequence) {
        this.b.setText(charSequence);
    }
}

package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;

/* renamed from: hx0  reason: default package */
public final class hx0 extends ConstraintLayout implements mhe {
    public final AppCompatImageView K0;
    public final AppCompatTextView L0;

    public hx0(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        setBackground(getBackgroundDrawable());
        AppCompatImageView appCompatImageView = new AppCompatImageView(context, (AttributeSet) null);
        appCompatImageView.setId(View.generateViewId());
        appCompatImageView.setImageTintList(getIconColor());
        int X = a24.X(((float) 2) * dh4.c().getDisplayMetrics().density);
        appCompatImageView.setPadding(X, X, X, X);
        this.K0 = appCompatImageView;
        AppCompatTextView appCompatTextView = new AppCompatTextView(context, (AttributeSet) null);
        appCompatTextView.setId(View.generateViewId());
        nge.d(nte.i, appCompatTextView);
        appCompatTextView.setMaxLines(1);
        appCompatTextView.setEllipsize(TextUtils.TruncateAt.END);
        appCompatTextView.setTextColor(getTextColor());
        this.L0 = appCompatTextView;
        float f = (float) 24;
        addView(appCompatImageView, a24.X(dh4.c().getDisplayMetrics().density * f), a24.X(f * dh4.c().getDisplayMetrics().density));
        addView(appCompatTextView, a24.X(((float) 0) * dh4.c().getDisplayMetrics().density), -2);
        bf3 p = a06.p(this);
        int id = appCompatImageView.getId();
        p.d(id, 3, appCompatTextView.getId(), 3);
        p.d(id, 6, 0, 6);
        p.d(id, 4, appCompatTextView.getId(), 4);
        int id2 = appCompatTextView.getId();
        p.d(id2, 3, 0, 3);
        p.d(id2, 6, appCompatImageView.getId(), 7);
        hr1.q((float) 16, dh4.c().getDisplayMetrics().density, new hw9(p, 6, id2, 4));
        p.d(id2, 7, 0, 7);
        p.d(id2, 4, 0, 4);
        p.g(id2).d.l0 = true;
        p.a(this);
    }

    private final RippleDrawable getBackgroundDrawable() {
        int i = km4.y0.r(this).c().a.f;
        return new RippleDrawable(ColorStateList.valueOf(i), (Drawable) null, new ColorDrawable(-1));
    }

    private final ColorStateList getIconColor() {
        km4.y0.r(this);
        return ColorStateList.valueOf(-16745729);
    }

    private final int getTextColor() {
        km4.y0.r(this);
        return -16745729;
    }

    public final void onThemeChanged(pda pda) {
        this.K0.setImageTintList(getIconColor());
        this.L0.setTextColor(getTextColor());
        setBackground(getBackgroundDrawable());
    }

    public final void setActionIcon(int i) {
        this.K0.setImageResource(i);
    }

    public final void setActionText(int i) {
        this.L0.setText(i);
    }
}

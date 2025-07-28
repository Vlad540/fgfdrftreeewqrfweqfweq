package defpackage;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.OvalShape;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import kotlin.NoWhenBranchMatchedException;
import one.me.sdk.richvector.EnhancedVectorDrawable;

/* renamed from: yye  reason: default package */
public final class yye extends FrameLayout implements mhe {
    public wye a;
    public final AppCompatImageView b;
    public final AppCompatTextView c;
    public final AppCompatImageView o;

    public yye(wye wye, Context context) {
        super(context);
        this.a = wye;
        AppCompatImageView appCompatImageView = new AppCompatImageView(context, (AttributeSet) null);
        appCompatImageView.setId(View.generateViewId());
        float f = (float) 36;
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(a24.X(dh4.c().getDisplayMetrics().density * f), a24.X(f * dh4.c().getDisplayMetrics().density));
        float f2 = (float) 12;
        layoutParams.setMarginStart(a24.X(dh4.c().getDisplayMetrics().density * f2));
        layoutParams.gravity = 8388627;
        appCompatImageView.setLayoutParams(layoutParams);
        int X = a24.X(((float) 6) * dh4.c().getDisplayMetrics().density);
        appCompatImageView.setPadding(X, X, X, X);
        this.b = appCompatImageView;
        AppCompatTextView appCompatTextView = new AppCompatTextView(context, (AttributeSet) null);
        appCompatTextView.setId(View.generateViewId());
        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(-1, -2);
        layoutParams2.setMarginEnd(a24.X(((float) 52) * dh4.c().getDisplayMetrics().density));
        layoutParams2.gravity = 16;
        appCompatTextView.setLayoutParams(layoutParams2);
        nge.d(nte.i, appCompatTextView);
        this.c = appCompatTextView;
        AppCompatImageView appCompatImageView2 = new AppCompatImageView(context, (AttributeSet) null);
        appCompatImageView2.setId(View.generateViewId());
        float f3 = (float) 28;
        FrameLayout.LayoutParams layoutParams3 = new FrameLayout.LayoutParams(a24.X(dh4.c().getDisplayMetrics().density * f3), a24.X(f3 * dh4.c().getDisplayMetrics().density));
        layoutParams3.setMarginEnd(a24.X(f2 * dh4.c().getDisplayMetrics().density));
        layoutParams3.gravity = 8388629;
        appCompatImageView2.setLayoutParams(layoutParams3);
        this.o = appCompatImageView2;
        setId(View.generateViewId());
        setLayoutParams(new FrameLayout.LayoutParams(-1, a24.X(((float) 48) * dh4.c().getDisplayMetrics().density)));
        addView(appCompatImageView);
        addView(appCompatTextView);
        addView(appCompatImageView2);
        onThemeChanged(km4.y0.r(this));
    }

    public final void onThemeChanged(pda pda) {
        setBackground(new RippleDrawable(ColorStateList.valueOf(km4.y0.r(this).c().a.f), new ColorDrawable(pda.b().f), new ColorDrawable(-65536)));
        int ordinal = this.a.ordinal();
        AppCompatImageView appCompatImageView = this.o;
        AppCompatTextView appCompatTextView = this.c;
        AppCompatImageView appCompatImageView2 = this.b;
        if (ordinal == 0 || ordinal == 1) {
            appCompatImageView2.setImageTintList(ColorStateList.valueOf(pda.getIcon().f));
            appCompatTextView.setTextColor(pda.getText().e);
            appCompatImageView.setImageTintList(ColorStateList.valueOf(pda.getIcon().f));
        } else if (ordinal == 2) {
            appCompatImageView2.setImageTintList(ColorStateList.valueOf(-16745729));
            appCompatTextView.setTextColor(-16745729);
            appCompatImageView.setImageTintList(ColorStateList.valueOf(-16745729));
        } else if (ordinal == 3) {
            appCompatImageView2.setImageTintList(ColorStateList.valueOf(pda.getIcon().f));
            appCompatTextView.setTextColor(pda.getText().e);
            EnhancedVectorDrawable drawable = appCompatImageView.getDrawable();
            EnhancedVectorDrawable enhancedVectorDrawable = drawable instanceof EnhancedVectorDrawable ? drawable : null;
            if (enhancedVectorDrawable != null) {
                xs7.P(enhancedVectorDrawable, "background", pda.b().a.f);
                xs7.P(enhancedVectorDrawable, "plus", pda.getIcon().b);
            }
        } else {
            throw new NoWhenBranchMatchedException();
        }
    }

    public final void setActionMenuIconClickListener(u16 u16) {
        a24.Z(this.o, 300, new p7d(u16, 12, this));
    }

    @SuppressLint({"ClickableViewAccessibility"})
    public final void setOnDragIconTouchListener(i26 i26) {
        this.b.setOnTouchListener(new jg1(5, i26));
    }

    public final void setTitle(CharSequence charSequence) {
        this.c.setText(charSequence);
    }

    public final void setType(wye wye) {
        int i;
        this.a = wye;
        AppCompatImageView appCompatImageView = this.b;
        wye wye2 = wye.o;
        int i2 = 0;
        appCompatImageView.setVisibility(wye != wye2 ? 0 : 8);
        int ordinal = wye.ordinal();
        if (ordinal == 0) {
            i = phc.m1;
        } else if (ordinal == 1) {
            i = zhc.a0;
        } else if (ordinal == 2) {
            i = zhc.g;
        } else if (ordinal == 3) {
            i = 0;
        } else {
            throw new NoWhenBranchMatchedException();
        }
        appCompatImageView.setImageResource(i);
        ((FrameLayout.LayoutParams) this.c.getLayoutParams()).setMarginStart(wye != wye2 ? a24.X(((float) 60) * dh4.c().getDisplayMetrics().density) : a24.X(((float) 12) * dh4.c().getDisplayMetrics().density));
        AppCompatImageView appCompatImageView2 = this.o;
        if (!(wye == wye.b || wye == wye2)) {
            i2 = 8;
        }
        appCompatImageView2.setVisibility(i2);
        int ordinal2 = wye.ordinal();
        s59 s59 = km4.y0;
        if (ordinal2 == 1) {
            int i3 = s59.r(appCompatImageView2).c().a.f;
            ShapeDrawable shapeDrawable = new ShapeDrawable(new OvalShape());
            shapeDrawable.getPaint().setColor(-1);
            appCompatImageView2.setBackground(new RippleDrawable(ColorStateList.valueOf(i3), (Drawable) null, shapeDrawable));
            appCompatImageView2.setImageResource(phc.a);
        } else if (ordinal2 == 3) {
            appCompatImageView2.setImageDrawable(new EnhancedVectorDrawable(appCompatImageView2.getContext(), snb.ic_add_button_28));
        }
        onThemeChanged(s59.r(this));
    }
}

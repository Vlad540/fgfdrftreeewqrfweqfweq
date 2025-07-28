package defpackage;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.LinearLayout;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import kotlin.NoWhenBranchMatchedException;

/* renamed from: mg8  reason: default package */
public final class mg8 extends LinearLayout implements mhe {
    public boolean a;
    public dh8 b;
    public final AppCompatImageView c;
    public final AppCompatTextView o;

    public mg8(Context context) {
        super(context, (AttributeSet) null, 0);
        AppCompatImageView appCompatImageView = new AppCompatImageView(context, (AttributeSet) null);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
        float f = (float) 4;
        int X = a24.X(dh4.c().getDisplayMetrics().density * f);
        appCompatImageView.setPadding(X, X, X, X);
        appCompatImageView.setLayoutParams(layoutParams);
        this.c = appCompatImageView;
        AppCompatTextView appCompatTextView = new AppCompatTextView(context, (AttributeSet) null);
        appCompatTextView.setLayoutParams(new LinearLayout.LayoutParams(-2, -2));
        appCompatTextView.setMaxWidth(a24.X(((float) 72) * dh4.c().getDisplayMetrics().density));
        nge.d(nte.r, appCompatTextView);
        this.o = appCompatTextView;
        setId(j2a.x);
        setOrientation(1);
        setGravity(1);
        setLayoutParams(new LinearLayout.LayoutParams(0, -2, 1.0f));
        float f2 = (float) 6;
        setPadding(a24.X(dh4.c().getDisplayMetrics().density * f2), a24.X(f * dh4.c().getDisplayMetrics().density), a24.X(f2 * dh4.c().getDisplayMetrics().density), getPaddingBottom());
        addView(appCompatImageView);
        addView(appCompatTextView);
        a();
    }

    public final void a() {
        boolean z = this.a;
        AppCompatImageView appCompatImageView = this.c;
        s59 s59 = km4.y0;
        AppCompatTextView appCompatTextView = this.o;
        if (z) {
            appCompatTextView.setTextColor(s59.r(this).getText().e);
            appCompatImageView.setColorFilter(s59.r(this).getIcon().f);
            return;
        }
        appCompatTextView.setTextColor(s59.r(this).getText().f);
        appCompatImageView.setColorFilter(s59.r(this).getIcon().i);
    }

    public final dh8 getState() {
        return this.b;
    }

    public final void onThemeChanged(pda pda) {
        a();
    }

    public final void setIsSelected(boolean z) {
        this.a = z;
        a();
    }

    public final void setState(dh8 dh8) {
        int i;
        int i2;
        this.b = dh8;
        AppCompatTextView appCompatTextView = this.o;
        ah8 ah8 = ah8.a;
        boolean f = hhd.f(dh8, ah8);
        zg8 zg8 = zg8.a;
        yg8 yg8 = yg8.a;
        bh8 bh8 = bh8.a;
        ch8 ch8 = ch8.a;
        if (f) {
            i = k2a.I;
        } else if (hhd.f(dh8, ch8)) {
            i = k2a.K;
        } else if (hhd.f(dh8, bh8)) {
            i = k2a.T;
        } else if (hhd.f(dh8, yg8)) {
            i = k2a.C;
        } else if (hhd.f(dh8, zg8)) {
            i = k2a.D;
        } else {
            throw new NoWhenBranchMatchedException();
        }
        appCompatTextView.setText(i);
        AppCompatImageView appCompatImageView = this.c;
        if (hhd.f(dh8, ah8)) {
            i2 = i2a.m;
        } else if (hhd.f(dh8, ch8)) {
            i2 = i2a.o;
        } else if (hhd.f(dh8, bh8)) {
            i2 = i2a.b;
        } else if (hhd.f(dh8, yg8)) {
            i2 = i2a.n;
        } else if (hhd.f(dh8, zg8)) {
            i2 = i2a.a;
        } else {
            throw new NoWhenBranchMatchedException();
        }
        appCompatImageView.setImageResource(i2);
    }
}

package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.OvalShape;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.ViewStub;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import me.leolin.shortcutbadger.BuildConfig;

/* renamed from: fh3  reason: default package */
public final class fh3 extends ConstraintLayout implements mhe {
    public final mz9 K0;
    public final AppCompatTextView L0;
    public final AppCompatTextView M0;
    public final t97 N0;
    public final t97 O0;
    public final t97 P0;
    public final ViewStub Q0;
    public final ViewStub R0;
    public final ViewStub S0;
    public mod T0;
    public boolean U0;
    public long V0 = Long.MAX_VALUE;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public fh3(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Context context2 = context;
        this.N0 = ez3.O(3, new dh3(context2, this, 0));
        this.O0 = ez3.O(3, new dh3(context2, this, 1));
        this.P0 = ez3.O(3, new dh3(context2, this, 2));
        setLayoutParams(new re3(-1, -2));
        float f = (float) 12;
        float f2 = (float) 10;
        setPadding(a24.X(dh4.c().getDisplayMetrics().density * f), a24.X(dh4.c().getDisplayMetrics().density * f2), a24.X(dh4.c().getDisplayMetrics().density * f), a24.X(f2 * dh4.c().getDisplayMetrics().density));
        setBackground(getBackgroundDrawable());
        setOnLongClickListener(new wk0(1, this));
        a24.Z(this, 300, new eh3(this, 0));
        mz9 mz9 = new mz9(context2);
        mz9.setId(qhc.r);
        mz9.setAvatarShape(dz9.a);
        this.K0 = mz9;
        AppCompatTextView appCompatTextView = new AppCompatTextView(context2, (AttributeSet) null);
        appCompatTextView.setId(qhc.w);
        nge.d(nte.i, appCompatTextView);
        appCompatTextView.setTextColor(getTitleText());
        appCompatTextView.setMaxLines(1);
        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
        appCompatTextView.setEllipsize(truncateAt);
        this.L0 = appCompatTextView;
        AppCompatTextView appCompatTextView2 = new AppCompatTextView(context2, (AttributeSet) null);
        appCompatTextView2.setId(qhc.s);
        nge.d(nte.l, appCompatTextView2);
        appCompatTextView2.setTextColor(getDescriptionColor());
        appCompatTextView2.setMaxLines(1);
        appCompatTextView2.setEllipsize(truncateAt);
        this.M0 = appCompatTextView2;
        ViewStub viewStub = new ViewStub(context2);
        viewStub.setId(qhc.u);
        this.Q0 = viewStub;
        ViewStub viewStub2 = new ViewStub(context2);
        viewStub2.setId(qhc.t);
        this.R0 = viewStub2;
        ViewStub viewStub3 = new ViewStub(context2);
        viewStub3.setId(qhc.v);
        this.S0 = viewStub3;
        float f3 = (float) 40;
        addView(mz9, a24.X(dh4.c().getDisplayMetrics().density * f3), a24.X(f3 * dh4.c().getDisplayMetrics().density));
        addView(appCompatTextView, 0, -2);
        addView(appCompatTextView2, 0, -2);
        addView(viewStub);
        addView(viewStub2);
        addView(viewStub3);
        bf3 p = a06.p(this);
        int id = mz9.getId();
        p.d(id, 3, 0, 3);
        p.d(id, 6, 0, 6);
        p.d(id, 4, 0, 4);
        int id2 = appCompatTextView.getId();
        p.d(id2, 3, mz9.getId(), 3);
        p.d(id2, 6, mz9.getId(), 7);
        new hw9(p, 6, id2, 4).e(a24.X(f * dh4.c().getDisplayMetrics().density));
        p.d(id2, 7, viewStub.getId(), 6);
        float f4 = (float) 8;
        new hw9(p, 7, id2, 4).e(a24.X(dh4.c().getDisplayMetrics().density * f4));
        p.d(id2, 4, appCompatTextView2.getId(), 3);
        p.g(id2).d.W = 2;
        p.g(id2).d.l0 = true;
        int id3 = appCompatTextView2.getId();
        p.d(id3, 3, appCompatTextView.getId(), 4);
        new hw9(p, 3, id3, 4).e(a24.X(((float) 4) * dh4.c().getDisplayMetrics().density));
        p.d(id3, 6, appCompatTextView.getId(), 6);
        p.d(id3, 7, appCompatTextView.getId(), 7);
        p.d(id3, 4, mz9.getId(), 4);
        p.g(id3).d.l0 = true;
        int id4 = viewStub.getId();
        p.d(id4, 3, 0, 3);
        p.d(id4, 7, viewStub2.getId(), 6);
        hr1.q(f4, dh4.c().getDisplayMetrics().density, new hw9(p, 7, id4, 4));
        p.d(id4, 4, 0, 4);
        int id5 = viewStub2.getId();
        p.d(id5, 3, 0, 3);
        p.d(id5, 7, viewStub3.getId(), 6);
        p.d(id5, 4, 0, 4);
        int id6 = viewStub3.getId();
        p.d(id6, 3, 0, 3);
        p.d(id6, 7, 0, 7);
        p.d(id6, 4, 0, 4);
        p.a(this);
    }

    private final AppCompatImageView getAudioCallButton() {
        return (AppCompatImageView) this.O0.getValue();
    }

    private final RippleDrawable getBackgroundDrawable() {
        int i = km4.y0.r(this).c().a.f;
        return new RippleDrawable(ColorStateList.valueOf(i), (Drawable) null, new ColorDrawable(-1));
    }

    private final int getDescriptionColor() {
        return km4.y0.r(this).getText().f;
    }

    private final RippleDrawable getRippleDrawableButton() {
        int i = km4.y0.r(this).c().a.f;
        ShapeDrawable shapeDrawable = new ShapeDrawable(new OvalShape());
        shapeDrawable.getPaint().setColor(-1);
        return new RippleDrawable(ColorStateList.valueOf(i), (Drawable) null, shapeDrawable);
    }

    private final AppCompatTextView getTimeTextView() {
        return (AppCompatTextView) this.N0.getValue();
    }

    private final int getTitleText() {
        boolean z = this.U0;
        cfe text = km4.y0.r(this).getText();
        return z ? text.b : text.e;
    }

    private final AppCompatImageView getVideoCallButton() {
        return (AppCompatImageView) this.P0.getValue();
    }

    public static AppCompatImageView w(Context context, fh3 fh3) {
        AppCompatImageView appCompatImageView = new AppCompatImageView(context, (AttributeSet) null);
        float f = (float) 40;
        appCompatImageView.setLayoutParams(new re3(a24.X(dh4.c().getDisplayMetrics().density * f), a24.X(f * dh4.c().getDisplayMetrics().density)));
        int X = a24.X(((float) 8) * dh4.c().getDisplayMetrics().density);
        appCompatImageView.setPadding(X, X, X, X);
        appCompatImageView.setImageResource(phc.c0);
        appCompatImageView.setBackground(fh3.getRippleDrawableButton());
        appCompatImageView.setContentDescription(context.getString(rhc.a));
        appCompatImageView.setVisibility(8);
        appCompatImageView.setImageTintList(ColorStateList.valueOf(km4.y0.r(appCompatImageView).getIcon().f));
        a24.Z(appCompatImageView, 300, new eh3(fh3, 1));
        return appCompatImageView;
    }

    public static AppCompatTextView x(Context context, fh3 fh3) {
        AppCompatTextView appCompatTextView = new AppCompatTextView(context, (AttributeSet) null);
        appCompatTextView.setLayoutParams(new re3(-2, -2));
        nge.d(nte.o, appCompatTextView);
        appCompatTextView.setTextColor(fh3.getDescriptionColor());
        return appCompatTextView;
    }

    public static AppCompatImageView y(Context context, fh3 fh3) {
        AppCompatImageView appCompatImageView = new AppCompatImageView(context, (AttributeSet) null);
        float f = (float) 40;
        appCompatImageView.setLayoutParams(new re3(a24.X(dh4.c().getDisplayMetrics().density * f), a24.X(f * dh4.c().getDisplayMetrics().density)));
        appCompatImageView.setImageResource(phc.m2);
        int X = a24.X(((float) 8) * dh4.c().getDisplayMetrics().density);
        appCompatImageView.setPadding(X, X, X, X);
        appCompatImageView.setBackground(fh3.getRippleDrawableButton());
        appCompatImageView.setContentDescription(context.getString(rhc.b));
        appCompatImageView.setVisibility(8);
        appCompatImageView.setImageTintList(ColorStateList.valueOf(km4.y0.r(appCompatImageView).getIcon().f));
        a24.Z(appCompatImageView, 300, new eh3(fh3, 2));
        return appCompatImageView;
    }

    public final void A(boolean z) {
        ViewStub viewStub = this.R0;
        if (ek8.K(viewStub) || z) {
            ek8.I(viewStub, getAudioCallButton(), (s16) null);
            getAudioCallButton().setVisibility(z ? 0 : 8);
        }
    }

    public final void B(boolean z) {
        ViewStub viewStub = this.S0;
        if (ek8.K(viewStub) || z) {
            ek8.I(viewStub, getVideoCallButton(), (s16) null);
            getVideoCallButton().setVisibility(z ? 0 : 8);
        }
    }

    public final void C(boolean z) {
        this.U0 = z;
        this.L0.setTextColor(getTitleText());
    }

    public final void F(long j, CharSequence charSequence, String str) {
        if (charSequence == null) {
            charSequence = BuildConfig.FLAVOR;
        }
        ub0 ub0 = new ub0(charSequence, j);
        mz9 mz9 = this.K0;
        mz9.g(ub0, true);
        mz9.setAvatarUrl(str != null ? str.toString() : null);
    }

    public final void onThemeChanged(pda pda) {
        this.L0.setTextColor(getTitleText());
        getTimeTextView().setTextColor(getDescriptionColor());
        this.M0.setTextColor(getDescriptionColor());
        getAudioCallButton().setBackground(getRippleDrawableButton());
        getVideoCallButton().setBackground(getRippleDrawableButton());
        setBackground(getBackgroundDrawable());
        getAudioCallButton().setImageTintList(ColorStateList.valueOf(pda.getIcon().f));
        getVideoCallButton().setImageTintList(ColorStateList.valueOf(pda.getIcon().f));
    }

    public final void setAvatarOverlay(oc0 oc0) {
        this.K0.setCustomOverlay(oc0);
    }

    public final void setAvatarPlaceholder(Drawable drawable) {
        mz9.h(this.K0, drawable, (gz9) null, 30);
    }

    public final void setDescription(CharSequence charSequence) {
        this.M0.setText(charSequence);
    }

    public final void setTime(CharSequence charSequence) {
        ViewStub viewStub = this.Q0;
        if (ek8.K(viewStub) || !h0e.c0(charSequence)) {
            ek8.I(viewStub, getTimeTextView(), (s16) null);
            getTimeTextView().setText(charSequence);
        }
    }

    public final void setTitle(CharSequence charSequence) {
        this.L0.setText(charSequence);
    }
}

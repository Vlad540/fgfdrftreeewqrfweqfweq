package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;

/* renamed from: z92  reason: default package */
public final class z92 extends ConstraintLayout implements mhe {
    public final t97 K0;
    public final t97 L0;
    public final mz9 M0;
    public final AppCompatTextView N0;
    public final AppCompatImageView O0;
    public final ImageView P0;

    /* JADX WARNING: type inference failed for: r8v10, types: [a9a, android.view.View] */
    public z92(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.K0 = ez3.O(3, new y92(context, this, 0));
        t97 O = ez3.O(3, new y92(context, this, 1));
        this.L0 = O;
        mz9 mz9 = new mz9(context);
        mz9.setId(j8a.F);
        float f = (float) 40;
        mz9.setLayoutParams(new ViewGroup.LayoutParams(a24.X(dh4.c().getDisplayMetrics().density * f), a24.X(f * dh4.c().getDisplayMetrics().density)));
        mz9.setAvatarShape(dz9.a);
        addView(mz9);
        this.M0 = mz9;
        AppCompatTextView appCompatTextView = new AppCompatTextView(context, (AttributeSet) null);
        appCompatTextView.setId(j8a.L);
        appCompatTextView.setLayoutParams(new ViewGroup.LayoutParams(0, -2));
        appCompatTextView.setTextAlignment(2);
        appCompatTextView.setMaxLines(1);
        appCompatTextView.setEllipsize(TextUtils.TruncateAt.END);
        nge nge = jp2.a;
        nte.m.b(appCompatTextView, yq4.b);
        addView(appCompatTextView);
        this.N0 = appCompatTextView;
        AppCompatImageView appCompatImageView = new AppCompatImageView(context, (AttributeSet) null);
        appCompatImageView.setId(j8a.H);
        float f2 = (float) 24;
        appCompatImageView.setLayoutParams(new ViewGroup.LayoutParams(a24.X(dh4.c().getDisplayMetrics().density * f2), a24.X(dh4.c().getDisplayMetrics().density * f2)));
        appCompatImageView.setImageDrawable(gq3.b(appCompatImageView.getContext(), phc.u));
        addView(appCompatImageView);
        this.O0 = appCompatImageView;
        ImageView imageView = new ImageView(context);
        imageView.setId(j8a.J);
        imageView.setLayoutParams(new ViewGroup.LayoutParams(a24.X(dh4.c().getDisplayMetrics().density * f2), a24.X(f2 * dh4.c().getDisplayMetrics().density)));
        imageView.setImageDrawable(gq3.b(imageView.getContext(), phc.t0));
        addView(imageView);
        this.P0 = imageView;
        setLayoutParams(new ViewGroup.LayoutParams(-1, a24.X(((float) 48) * dh4.c().getDisplayMetrics().density)));
        w();
        if (O.a()) {
            ? r8 = (a9a) O.getValue();
            int X = a24.X(((float) 20) * dh4.c().getDisplayMetrics().density);
            ViewGroup.LayoutParams layoutParams = r8.getLayoutParams();
            if (layoutParams != null) {
                layoutParams.width = X;
                layoutParams.height = X;
                r8.setLayoutParams(layoutParams);
            } else {
                throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
            }
        }
        requestLayout();
        onThemeChanged(km4.y0.r(this));
    }

    /* JADX WARNING: type inference failed for: r4v0, types: [z92, android.view.View] */
    public final void onThemeChanged(pda pda) {
        int i = pda.c().a.c;
        setBackground(new RippleDrawable(ColorStateList.valueOf(i), (Drawable) null, new ColorDrawable(-65536)));
        t97 t97 = this.K0;
        if (t97.a()) {
            ((AppCompatTextView) t97.getValue()).setTextColor(-16745729);
        }
        this.N0.setTextColor(pda.getText().f);
        this.O0.setImageTintList(ColorStateList.valueOf(pda.getIcon().f));
        this.P0.setImageTintList(ColorStateList.valueOf(pda.getIcon().f));
    }

    public final void setChatTitle(String str) {
        this.N0.setText(str);
        w();
    }

    /* JADX WARNING: type inference failed for: r2v4, types: [a9a, android.view.View] */
    public final void setLink(String str) {
        AppCompatTextView appCompatTextView = (AppCompatTextView) this.K0.getValue();
        appCompatTextView.setText(str);
        appCompatTextView.setVisibility(0);
        t97 t97 = this.L0;
        if (t97.a()) {
            ((a9a) t97.getValue()).setVisibility(8);
        }
        w();
    }

    /* JADX WARNING: type inference failed for: r5v3, types: [a9a, android.view.View] */
    /* JADX WARNING: type inference failed for: r5v8, types: [a9a, android.view.View] */
    public final void setLoading(boolean z) {
        t97 t97 = this.L0;
        t97 t972 = this.K0;
        if (z) {
            if (t972.a()) {
                ((AppCompatTextView) t972.getValue()).setVisibility(8);
            }
            ((a9a) t97.getValue()).setVisibility(0);
        } else {
            if (t972.a()) {
                ((AppCompatTextView) t972.getValue()).setVisibility(0);
            }
            ((a9a) t97.getValue()).setVisibility(8);
        }
        w();
    }

    public final void setOnMoreActionsClickListener(s16 s16) {
        a24.a0(this.P0, new q6(3, s16));
    }

    /* JADX WARNING: type inference failed for: r8v16, types: [a9a, android.view.View] */
    /* JADX WARNING: type inference failed for: r2v13, types: [a9a, android.view.View] */
    public final void w() {
        hw9 hw9;
        float f;
        bf3 p = a06.p(this);
        mz9 mz9 = this.M0;
        int id = mz9.getId();
        p.d(id, 6, 0, 6);
        float f2 = (float) 12;
        hr1.q(f2, dh4.c().getDisplayMetrics().density, new hw9(p, 6, id, 4));
        p.d(id, 3, 0, 3);
        p.d(id, 4, 0, 4);
        t97 t97 = this.K0;
        boolean a = t97.a();
        AppCompatImageView appCompatImageView = this.O0;
        if (a) {
            int id2 = ((AppCompatTextView) t97.getValue()).getId();
            p.d(id2, 6, mz9.getId(), 7);
            new hw9(p, 6, id2, 4).e(a24.X(dh4.c().getDisplayMetrics().density * f2));
            p.d(id2, 3, mz9.getId(), 3);
            p.d(id2, 7, appCompatImageView.getId(), 6);
            new hw9(p, 7, id2, 4).e(a24.X(dh4.c().getDisplayMetrics().density * f2));
            ((AppCompatTextView) t97.getValue()).getId();
        } else {
            t97 t972 = this.L0;
            int id3 = ((a9a) t972.getValue()).getId();
            p.d(id3, 6, mz9.getId(), 7);
            hr1.q(f2, dh4.c().getDisplayMetrics().density, new hw9(p, 6, id3, 4));
            p.d(id3, 3, 0, 3);
            new hw9(p, 3, id3, 4).e(a24.X(((float) 6) * dh4.c().getDisplayMetrics().density));
            ((a9a) t972.getValue()).getId();
        }
        int id4 = this.N0.getId();
        p.d(id4, 6, mz9.getId(), 7);
        new hw9(p, 6, id4, 4).e(a24.X(dh4.c().getDisplayMetrics().density * f2));
        p.d(id4, 4, mz9.getId(), 4);
        p.d(id4, 7, appCompatImageView.getId(), 6);
        new hw9(p, 7, id4, 4).e(a24.X(dh4.c().getDisplayMetrics().density * f2));
        int id5 = appCompatImageView.getId();
        ImageView imageView = this.P0;
        if (imageView.getVisibility() == 0) {
            p.d(id5, 7, imageView.getId(), 6);
            hw9 = new hw9(p, 7, id5, 4);
            f = dh4.c().getDisplayMetrics().density;
        } else {
            p.d(id5, 7, 0, 7);
            hw9 = new hw9(p, 7, id5, 4);
            f = dh4.c().getDisplayMetrics().density;
        }
        hr1.q(f2, f, hw9);
        p.d(id5, 3, 0, 3);
        p.d(id5, 4, 0, 4);
        if (imageView.getVisibility() == 0) {
            int id6 = imageView.getId();
            p.d(id6, 7, 0, 7);
            hr1.q(f2, dh4.c().getDisplayMetrics().density, new hw9(p, 7, id6, 4));
            p.d(id6, 3, 0, 3);
            p.d(id6, 4, 0, 4);
        }
        p.a(this);
    }
}

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
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.NoWhenBranchMatchedException;

/* renamed from: mc2  reason: default package */
public final class mc2 extends ConstraintLayout implements mhe {
    public boolean K0;
    public final TextView L0;
    public final TextView M0;
    public final Drawable N0;
    public final t97 O0;
    public final mz9 P0;
    public final LinearLayout Q0;
    public final ImageView R0;

    /* JADX WARNING: type inference failed for: r10v0, types: [android.view.View, mc2, android.view.ViewGroup] */
    public mc2(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        TextView textView = new TextView(context);
        re3 re3 = new re3(-1, -2);
        re3.bottomMargin = a24.X(((float) 4) * dh4.c().getDisplayMetrics().density);
        textView.setLayoutParams(re3);
        nte.i.b(textView, yq4.b);
        textView.setSingleLine(true);
        textView.setMaxLines(1);
        textView.setLetterSpacing(0.0f);
        textView.setEllipsize(TextUtils.TruncateAt.MIDDLE);
        this.L0 = textView;
        TextView textView2 = new TextView(context);
        textView2.setLayoutParams(new re3(-1, -2));
        nte.m.b(textView2, yq4.b);
        textView2.setMaxLines(1);
        this.M0 = textView2;
        int X = a24.X(((float) 48) * dh4.c().getDisplayMetrics().density);
        Drawable b = gq3.b(getContext(), phc.M);
        this.N0 = b;
        this.O0 = ez3.O(3, new b5(context, 27));
        mz9 mz9 = new mz9(context);
        mz9.setId(j8a.g0);
        re3 re32 = new re3(X, X);
        re32.setMarginStart(a24.X(((float) 12) * dh4.c().getDisplayMetrics().density));
        mz9.setLayoutParams(re32);
        mz9.setAvatarShape(fz9.a);
        mz9.h(mz9, b, (gz9) null, 30);
        this.P0 = mz9;
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setId(j8a.e0);
        linearLayout.setLayoutParams(new re3(0, -2));
        linearLayout.setOrientation(1);
        linearLayout.addView(textView);
        linearLayout.addView(textView2);
        this.Q0 = linearLayout;
        ImageView imageView = new ImageView(context);
        imageView.setId(j8a.f0);
        float f = (float) 24;
        imageView.setLayoutParams(new ViewGroup.LayoutParams(a24.X(dh4.c().getDisplayMetrics().density * f), a24.X(f * dh4.c().getDisplayMetrics().density)));
        imageView.setVisibility(4);
        this.R0 = imageView;
        setLayoutParams(new re3(-1, -2));
        s59 s59 = km4.y0;
        int i = s59.r(this).c().a.f;
        setBackground(new RippleDrawable(ColorStateList.valueOf(i), (Drawable) null, new ColorDrawable(-1)));
        setMinimumHeight(a24.X(((float) 72) * dh4.c().getDisplayMetrics().density));
        float f2 = (float) 15;
        setPaddingRelative(0, a24.X(dh4.c().getDisplayMetrics().density * f2), 0, a24.X(f2 * dh4.c().getDisplayMetrics().density));
        addView(mz9);
        addView(linearLayout);
        addView(imageView);
        w();
        onThemeChanged(s59.r(this));
    }

    public final void onThemeChanged(pda pda) {
        this.L0.setTextColor(pda.getText().e);
        this.M0.setTextColor(pda.getText().f);
        this.P0.onThemeChanged(pda);
        this.R0.setImageTintList(ColorStateList.valueOf(pda.getIcon().f));
        t97 t97 = this.O0;
        if (t97.a()) {
            ((zd5) t97.getValue()).onThemeChanged(pda);
        }
    }

    public final void setFileDescription(CharSequence charSequence) {
        this.M0.setText(charSequence);
    }

    /* JADX WARNING: type inference failed for: r6v0, types: [android.view.View, mc2] */
    public final void setFileDownloadStatus(nh8 nh8) {
        boolean z = nh8 instanceof kh8;
        ImageView imageView = this.R0;
        if (z) {
            if (!this.K0) {
                imageView.setImageDrawable((Drawable) null);
                imageView.setVisibility(4);
                imageView.setScaleType(ImageView.ScaleType.CENTER);
            }
        } else if (nh8 instanceof lh8) {
            if (!(imageView.getDrawable() instanceof d00)) {
                d00 d00 = new d00();
                int i = l9a.b;
                s59 s59 = km4.y0;
                yn6 icon = s59.r(imageView).getIcon();
                Drawable b = gq3.b(imageView.getContext(), i);
                js.D(b, icon.f);
                d00.a = b;
                d00.invalidateSelf();
                d00.c = a24.X(((float) 36) * dh4.c().getDisplayMetrics().density);
                d00.b = true;
                d00.invalidateSelf();
                d00.b(s59.r(imageView).getIcon().f);
                d00.e = true;
                d00.invalidateSelf();
                imageView.setImageDrawable(d00);
                imageView.setAdjustViewBounds(false);
            }
            imageView.getDrawable().setLevel((int) (((lh8) nh8).b * ((float) 100)));
            imageView.setScaleType(ImageView.ScaleType.FIT_XY);
            imageView.setVisibility(0);
        } else if (nh8 instanceof mh8) {
            imageView.setImageDrawable(gq3.b(getContext(), l9a.f));
            imageView.setVisibility(0);
            imageView.setScaleType(ImageView.ScaleType.CENTER);
        } else {
            throw new NoWhenBranchMatchedException();
        }
    }

    public final void setTitle(CharSequence charSequence) {
        this.L0.setText(charSequence);
    }

    public final void w() {
        bf3 p = a06.p(this);
        mz9 mz9 = this.P0;
        og0 og0 = new og0(mz9.getId(), 4, p);
        og0.D(0);
        og0.G(0);
        og0.e(0);
        og0 og02 = new og0(this.Q0.getId(), 4, p);
        og02.G(0);
        og02.e(0);
        float f = (float) 12;
        hr1.q(f, dh4.c().getDisplayMetrics().density, og02.C(mz9.getId()));
        ImageView imageView = this.R0;
        og02.q(imageView.getId()).e(a24.X(dh4.c().getDisplayMetrics().density * f));
        og0 og03 = new og0(imageView.getId(), 4, p);
        og03.G(0);
        og03.e(0);
        og03.p(0).e(a24.X(f * dh4.c().getDisplayMetrics().density));
        p.a(this);
    }
}
